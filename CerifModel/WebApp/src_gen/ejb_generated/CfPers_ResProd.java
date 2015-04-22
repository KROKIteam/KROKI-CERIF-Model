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
   Creation date: 22.04.2015  15:41:53h
   **/

@Entity
@Table(name = "C1_PERSON_RESULT_PRODUCT")
public class CfPers_ResProd implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	private java.util.Date a_end_date;
	@Column(name = "cfFraction", unique = false, nullable = false ,columnDefinition = "FLOAT")
	private java.math.BigDecimal a_fraction;
	@Column(name = "cfConditions", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_conditions;
	@Column(name = "cfAvailability", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_availability;
	@Column(name = "cfPrice", unique = false, nullable = false ,columnDefinition = "FLOAT")
	private java.math.BigDecimal a_price;
	@Column(name = "cfIPR", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_intellectual_property_rights;
	@ManyToOne
	@JoinColumn(name="cfpers_resprod_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_resprod_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_resprod_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfpers_resprod_currency;
	@ManyToOne
	@JoinColumn(name="cfpers_resprod_resultProduct", referencedColumnName="ID",  nullable = true)
	private CfResProd cfpers_resprod_resultProduct;
	@ManyToOne
	@JoinColumn(name="cfpers_resprod_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_resprod_person;
	
	public CfPers_ResProd(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.util.Date getA_start_date() {
		return this.a_start_date;
	}
	
	public void setA_start_date(java.util.Date a_start_date) {
		this.a_start_date = a_start_date;
	}
	
	public java.util.Date getA_end_date() {
		return this.a_end_date;
	}
	
	public void setA_end_date(java.util.Date a_end_date) {
		this.a_end_date = a_end_date;
	}
	
	public java.math.BigDecimal getA_fraction() {
		return this.a_fraction;
	}
	
	public void setA_fraction(java.math.BigDecimal a_fraction) {
		this.a_fraction = a_fraction;
	}
	
	public java.lang.String getA_conditions() {
		return this.a_conditions;
	}
	
	public void setA_conditions(java.lang.String a_conditions) {
		this.a_conditions = a_conditions;
	}
	
	public java.lang.String getA_availability() {
		return this.a_availability;
	}
	
	public void setA_availability(java.lang.String a_availability) {
		this.a_availability = a_availability;
	}
	
	public java.math.BigDecimal getA_price() {
		return this.a_price;
	}
	
	public void setA_price(java.math.BigDecimal a_price) {
		this.a_price = a_price;
	}
	
	public java.lang.String getA_intellectual_property_rights() {
		return this.a_intellectual_property_rights;
	}
	
	public void setA_intellectual_property_rights(java.lang.String a_intellectual_property_rights) {
		this.a_intellectual_property_rights = a_intellectual_property_rights;
	}
	
	public CfClass getCfpers_resprod_classification() {
		return this.cfpers_resprod_classification;
	}
	
	public void setCfpers_resprod_classification(CfClass cfpers_resprod_classification) {
		this.cfpers_resprod_classification = cfpers_resprod_classification;
	}
	
	public CfCurrency getCfpers_resprod_currency() {
		return this.cfpers_resprod_currency;
	}
	
	public void setCfpers_resprod_currency(CfCurrency cfpers_resprod_currency) {
		this.cfpers_resprod_currency = cfpers_resprod_currency;
	}
	
	public CfResProd getCfpers_resprod_resultProduct() {
		return this.cfpers_resprod_resultProduct;
	}
	
	public void setCfpers_resprod_resultProduct(CfResProd cfpers_resprod_resultProduct) {
		this.cfpers_resprod_resultProduct = cfpers_resprod_resultProduct;
	}
	
	public CfPers getCfpers_resprod_person() {
		return this.cfpers_resprod_person;
	}
	
	public void setCfpers_resprod_person(CfPers cfpers_resprod_person) {
		this.cfpers_resprod_person = cfpers_resprod_person;
	}
	
}