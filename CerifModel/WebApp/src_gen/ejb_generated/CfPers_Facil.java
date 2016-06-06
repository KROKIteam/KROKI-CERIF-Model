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
@Table(name = "C1_PERSON_FACILITY")
public class CfPers_Facil implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_end_date;
	@Column(name = "cfFraction", unique = false, nullable = false ,columnDefinition = "FLOAT")
	protected java.math.BigDecimal ka_fraction;
	@Column(name = "cfAvailability", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_availability;
	@Column(name = "cfConditions", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_conditions;
	@Column(name = "cfPrice", unique = false, nullable = false ,columnDefinition = "FLOAT")
	protected java.math.BigDecimal ka_price;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfpers_facil_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_facility", referencedColumnName="ID",  nullable = true)
	protected CfFacil cfpers_facil_facility;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_currency", referencedColumnName="ID",  nullable = true)
	protected CfCurrency cfpers_facil_currency;
	@ManyToOne
	@JoinColumn(name="cfpers_facil_person", referencedColumnName="ID",  nullable = true)
	protected CfPers cfpers_facil_person;
	
	public CfPers_Facil(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.util.Date getKa_start_date() {
		return this.ka_start_date;
	}
	
	public void setKa_start_date(java.util.Date ka_start_date) {
		this.ka_start_date = ka_start_date;
	}
	
	public java.util.Date getKa_end_date() {
		return this.ka_end_date;
	}
	
	public void setKa_end_date(java.util.Date ka_end_date) {
		this.ka_end_date = ka_end_date;
	}
	
	public java.math.BigDecimal getKa_fraction() {
		return this.ka_fraction;
	}
	
	public void setKa_fraction(java.math.BigDecimal ka_fraction) {
		this.ka_fraction = ka_fraction;
	}
	
	public java.lang.String getKa_availability() {
		return this.ka_availability;
	}
	
	public void setKa_availability(java.lang.String ka_availability) {
		this.ka_availability = ka_availability;
	}
	
	public java.lang.String getKa_conditions() {
		return this.ka_conditions;
	}
	
	public void setKa_conditions(java.lang.String ka_conditions) {
		this.ka_conditions = ka_conditions;
	}
	
	public java.math.BigDecimal getKa_price() {
		return this.ka_price;
	}
	
	public void setKa_price(java.math.BigDecimal ka_price) {
		this.ka_price = ka_price;
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