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
@Table(name = "C1_PERSON_EXPERTISE_AND_SKILLS")
public class CfPers_ExpSkills implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_expskills_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_expskills_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_expskills_expertiseAndSkills", referencedColumnName="ID",  nullable = true)
	private CfExpSkills cfpers_expskills_expertiseAndSkills;
	@ManyToOne
	@JoinColumn(name="cfpers_expskills_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfpers_expskills_currency;
	@ManyToOne
	@JoinColumn(name="cfpers_expskills_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_expskills_person;
	
	public CfPers_ExpSkills(){
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
	
	public CfClass getCfpers_expskills_classification() {
		return this.cfpers_expskills_classification;
	}
	
	public void setCfpers_expskills_classification(CfClass cfpers_expskills_classification) {
		this.cfpers_expskills_classification = cfpers_expskills_classification;
	}
	
	public CfExpSkills getCfpers_expskills_expertiseAndSkills() {
		return this.cfpers_expskills_expertiseAndSkills;
	}
	
	public void setCfpers_expskills_expertiseAndSkills(CfExpSkills cfpers_expskills_expertiseAndSkills) {
		this.cfpers_expskills_expertiseAndSkills = cfpers_expskills_expertiseAndSkills;
	}
	
	public CfCurrency getCfpers_expskills_currency() {
		return this.cfpers_expskills_currency;
	}
	
	public void setCfpers_expskills_currency(CfCurrency cfpers_expskills_currency) {
		this.cfpers_expskills_currency = cfpers_expskills_currency;
	}
	
	public CfPers getCfpers_expskills_person() {
		return this.cfpers_expskills_person;
	}
	
	public void setCfpers_expskills_person(CfPers cfpers_expskills_person) {
		this.cfpers_expskills_person = cfpers_expskills_person;
	}
	
}