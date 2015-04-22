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
@Table(name = "C1_PERSON_FACILITY")
public class CfPers_Facil implements java.io.Serializable {

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
	@Column(name = "cfAvailability", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_availability;
	@Column(name = "cfConditions", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_conditions;
	@Column(name = "cfPrice", unique = false, nullable = false ,columnDefinition = "FLOAT")
	private java.math.BigDecimal a_price;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_facil_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_facility", referencedColumnName="ID",  nullable = true)
	private CfFacil cfpers_facil_facility;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfpers_facil_currency;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_facil_person;
	
	public CfPers_Facil(){
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
	
	public java.lang.String getA_availability() {
		return this.a_availability;
	}
	
	public void setA_availability(java.lang.String a_availability) {
		this.a_availability = a_availability;
	}
	
	public java.lang.String getA_conditions() {
		return this.a_conditions;
	}
	
	public void setA_conditions(java.lang.String a_conditions) {
		this.a_conditions = a_conditions;
	}
	
	public java.math.BigDecimal getA_price() {
		return this.a_price;
	}
	
	public void setA_price(java.math.BigDecimal a_price) {
		this.a_price = a_price;
	}
	
	public CfClass getCfpers_facil_classification() {
		return this.cfpers_facil_classification;
	}
	
	public void setCfpers_facil_classification(CfClass cfpers_facil_classification) {
		this.cfpers_facil_classification = cfpers_facil_classification;
	}
	
	public CfFacil getCfpers_facil_facility() {
		return this.cfpers_facil_facility;
	}
	
	public void setCfpers_facil_facility(CfFacil cfpers_facil_facility) {
		this.cfpers_facil_facility = cfpers_facil_facility;
	}
	
	public CfCurrency getCfpers_facil_currency() {
		return this.cfpers_facil_currency;
	}
	
	public void setCfpers_facil_currency(CfCurrency cfpers_facil_currency) {
		this.cfpers_facil_currency = cfpers_facil_currency;
	}
	
	public CfPers getCfpers_facil_person() {
		return this.cfpers_facil_person;
	}
	
	public void setCfpers_facil_person(CfPers cfpers_facil_person) {
		this.cfpers_facil_person = cfpers_facil_person;
	}
	
}