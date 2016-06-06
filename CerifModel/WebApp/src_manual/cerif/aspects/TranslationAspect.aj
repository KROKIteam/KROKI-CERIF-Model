package cerif.aspects;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import adapt.model.ejb.AbstractAttribute;
import adapt.model.ejb.ColumnAttribute;
import adapt.model.ejb.EntityBean;
import adapt.model.ejb.JoinColumnAttribute;
import adapt.resources.ModifyResource;
import adapt.util.ejb.PersisenceHelper;
import adapt.util.html.TableModel;

public aspect TranslationAspect {

//----------------------------------------------------------------------------------------------------------------------------------------------------------- || POINTCUTS ||
	
	public pointcut joinColumnPointcut() : 
		execution (private static JoinColumnAttribute getJoinColumnAttributeInfo(..));

	// LinkedHashMap<String, String> adapt.resources.ModifyResource.prepareEditMap(EntityBean, Object)
	public pointcut editMapPointCut(ModifyResource resource, EntityBean bean, Object obj) :
		call (private LinkedHashMap<String, String> adapt.resources.ModifyResource.prepareEditMap(EntityBean, Object)) && 
		this(resource) &&
		args(bean, obj);

	public pointcut injectColumnToJSON(JoinColumnAttribute jcAttribute, String id) :
		call (protected ArrayList<String> adapt.resources.BaseResource.getLookupValuesJSON(JoinColumnAttribute, String)) &&
		args(jcAttribute, id);
	
	public pointcut injectColumnToTable(List<Object> resultSet, TableModel tableModel) :
		execution(public ArrayList<LinkedHashMap<String, String>> getModel(List<Object>)) &&
		args(resultSet) &&
		this(tableModel);
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------- || ADVICES ||

	after(List<Object> resultSet, TableModel tableModel) returning(ArrayList<LinkedHashMap<String, String>> tableMap) : injectColumnToTable(resultSet, tableModel) {
		EntityBean bean = tableModel.getBean();
		for (AbstractAttribute attribute : bean.getAttributes()) {
			if(attribute instanceof JoinColumnAttribute) {
				JoinColumnAttribute joinColumn = (JoinColumnAttribute) attribute;
				for (LinkedHashMap<String, String> row : tableMap) {
					String zoomValues = row.get(joinColumn.getFieldName());
					System.out.println("ZOOM VALUES: " + zoomValues);
					if(zoomValues != "") {
						// For now assume that the id is always displayed in zoom column
						String id = zoomValues.split(",")[0];
						ColumnAttribute additionalColumn = findNameOrTitleColumn(joinColumn);
						String additionalValue = getNameOrTitleColumnValue(joinColumn, id, additionalColumn);
						System.out.println("DODAJEM U ZOOM VALS: " + additionalValue);
						zoomValues = zoomValues + ", " + additionalValue;
						row.put(joinColumn.getFieldName(), zoomValues);
					}
				}
			}
		}
	}
	
	// Intercept join column reading method and inject column references
	after() returning(JoinColumnAttribute jcAttribute) : joinColumnPointcut() {
		ColumnAttribute toInject = findNameOrTitleColumn(jcAttribute);
		if(toInject != null) {
			jcAttribute.add(toInject);
		}
	}

	after(ModifyResource resource, EntityBean bean, Object obj) : editMapPointCut(resource, bean, obj) {
		// First obtain the dataModel
		Map<String, Object> dataModel = resource.getDataModel();
		// Then get the zoomEditMapFrom it
		LinkedHashMap<String, LinkedHashMap<String, String>> zoomEditMap = (LinkedHashMap<String, LinkedHashMap<String, String>>) dataModel.get("zoomEditMap");
		if(zoomEditMap != null) {
			for (AbstractAttribute attr : bean.getAttributes()) {
				if(attr instanceof JoinColumnAttribute) {
					JoinColumnAttribute jcAttr = (JoinColumnAttribute) attr;
					LinkedHashMap<String, String> lookupMap = zoomEditMap.get(jcAttr.getFieldName());
					String id = null;
					for (ColumnAttribute column : jcAttr.getColumns()) {
						Object value = lookupMap.get(column.getFieldName());
						if(column.getFieldName().equalsIgnoreCase("id")) {
							id = (String) value;
						}
						if(value == null) {
							if(id != null) {
								String newVal = getNameOrTitleColumnValue(jcAttr, id, column);
								lookupMap.put(column.getFieldName(), newVal);
							}
						}
					}
				}
			}
		}
	}
	
	// Inject the name or title column into JSON response that sets the zoom fields values when the forms are zoomed out
	after(JoinColumnAttribute jcAttribute, String id) returning(ArrayList<String> values) : injectColumnToJSON(jcAttribute, id) {
		ColumnAttribute toInject = findNameOrTitleColumn(jcAttribute);
		if(toInject != null) {
			values.add("\"name\": \"" + jcAttribute.getFieldName() + "-" + toInject.getFieldName() + "\", "
					 + "\"value\": \"" + getNameOrTitleColumnValue(jcAttribute, id, toInject) + "\"");
		}
	}

	//--------------------------------------------------------------------------------------------------------------------------------------------------------- || UTILS ||
	
	private ColumnAttribute findNameOrTitleColumn(JoinColumnAttribute jcAttribute) {
		try {
			// Try and fetch Name entity based on the current Join column name
			Class nameEJBClass = Class.forName(jcAttribute.getLookupClass().getName() + "Name");
			ColumnAttribute nameColumn = new ColumnAttribute();
			nameColumn.setName(jcAttribute.getLookupClass().getSimpleName() + "Name");
			nameColumn.setHidden(false);
			nameColumn.setFieldName("cerif-" + jcAttribute.getLookupClass().getSimpleName().toLowerCase() + "-name");
			nameColumn.setDataType("java.lang.String");
			nameColumn.setLabel(jcAttribute.getLabel() + " Name");
			return nameColumn;
		} catch (ClassNotFoundException e) {
			try {
				// If the Name entity does not exist, try and fetch Title entity if it is available
				Class titleEJBClass = Class.forName(jcAttribute.getLookupClass().getName() + "Title");
				System.out.println("\t CLASS: " + jcAttribute.getLookupClass().getName() + "Name");
				ColumnAttribute titleColumn = new ColumnAttribute();
				titleColumn.setHidden(false);
				titleColumn.setName(jcAttribute.getLookupClass().getSimpleName() + "Title");
				titleColumn.setFieldName("cerif-" + jcAttribute.getLookupClass().getSimpleName().toLowerCase() + "-title");
				titleColumn.setDataType("java.lang.String");
				titleColumn.setLabel(jcAttribute.getLabel() + " Title");
				return titleColumn;
			} catch (ClassNotFoundException e1) {
				System.out.println("CATCH class not found :(");
				e1.printStackTrace();
				return null;
			}
		}
	}

	private String getNameOrTitleColumnValue(JoinColumnAttribute jcAttribute, String id, ColumnAttribute injectedColumn) {
		String toSelect = "ka_name";
		if(injectedColumn.getName().endsWith("Title")) {
			toSelect = "ka_title";
		}
		String injectedColumnName = injectedColumn.getName().toLowerCase() + "_" + jcAttribute.getLabel().replaceAll(" ", "").toLowerCase();
		String query = 	"SELECT x." + toSelect + " FROM " + injectedColumn.getName() + 
				" x WHERE x." + injectedColumnName + ".id = " + Long.parseLong(id) + 
				" AND x.ka_translation_kind = 'o'";
		System.out.println("QUERY: " + query);

		try {
			EntityManager em = PersisenceHelper.createEntityManager();

			em.getTransaction().begin();
			Query q = em.createQuery(query);
			Object result = q.getSingleResult();

			if(result != null) {
				return result.toString();
			}

			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "None";
	}
}
