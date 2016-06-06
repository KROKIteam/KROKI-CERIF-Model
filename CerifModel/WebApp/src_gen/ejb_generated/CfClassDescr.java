package ejb_generated;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.CascadeType;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;

   /** 
   Class generated using Kroki EJBGenerator 
   @Author KROKI Team 
   Creation date: 06.06.2016  13:28:38h
   **/

@Entity
@Table(name = "C1_CLASSIFICATION_DESCRIPTION")
public class CfClassDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfDescr", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_description;
	@Column(name = "cfDescrSrc", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_description_source;
	@ManyToOne
	@JoinColumn(name="cfclassdescr_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfclassdescr_language;
	@ManyToOne
	@JoinColumn(name="cfclassdescr_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfclassdescr_classification;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfClassDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_description() {
		return this.ka_description;
	}
	
	public void setKa_description(java.lang.String ka_description) {
		this.ka_description = ka_description;
	}
	
	public java.lang.String getKa_description_source() {
		return this.ka_description_source;
	}
	
	public void setKa_description_source(java.lang.String ka_description_source) {
		this.ka_description_source = ka_description_source;
	}
	
	public CfLang getCfclassdescr_language() {
		return this.cfclassdescr_language;
	}
	
	public void setCfclassdescr_language(CfLang cfclassdescr_language) {
		this.cfclassdescr_language = cfclassdescr_language;
	}
	
	public CfClass getCfclassdescr_classification() {
		return this.cfclassdescr_classification;
	}
	
	public void setCfclassdescr_classification(CfClass cfclassdescr_classification) {
		this.cfclassdescr_classification = cfclassdescr_classification;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}