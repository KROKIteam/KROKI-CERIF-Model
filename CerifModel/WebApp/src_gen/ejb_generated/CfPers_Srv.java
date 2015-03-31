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
   Creation date: 31.03.2015  10:28:05h
   **/

@Entity
@Table(name = "CM_PERSON_SERVICE")
public class CfPers_Srv implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false )
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false )
	private java.util.Date a_end_date;
	@Column(name = "cfFraction", unique = false, nullable = false )
	private java.math.BigDecimal a_fraction;
	@Column(name = "cfConditions", unique = false, nullable = false )
	private java.lang.String a_conditions;
	@Column(name = "cfAvailability", unique = false, nullable = false )
	private java.lang.String a_availability;
	@Column(name = "cfPrice", unique = false, nullable = false )
	private java.math.BigDecimal a_price;
	@ManyToOne
	@JoinColumn(name="cfpers_srv_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_srv_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_srv_service", referencedColumnName="ID",  nullable = true)
	private CfSrv cfpers_srv_service;
	@ManyToOne
	@JoinColumn(name="cfpers_srv_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfpers_srv_currency;
	@ManyToOne
	@JoinColumn(name="cfpers_srv_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_srv_person;
	
	public CfPers_Srv(){
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
	
	public CfClass getCfpers_srv_classification() {
		return this.cfpers_srv_classification;
	}
	
	public void setCfpers_srv_classification(CfClass cfpers_srv_classification) {
		this.cfpers_srv_classification = cfpers_srv_classification;
	}
	
	public CfSrv getCfpers_srv_service() {
		return this.cfpers_srv_service;
	}
	
	public void setCfpers_srv_service(CfSrv cfpers_srv_service) {
		this.cfpers_srv_service = cfpers_srv_service;
	}
	
	public CfCurrency getCfpers_srv_currency() {
		return this.cfpers_srv_currency;
	}
	
	public void setCfpers_srv_currency(CfCurrency cfpers_srv_currency) {
		this.cfpers_srv_currency = cfpers_srv_currency;
	}
	
	public CfPers getCfpers_srv_person() {
		return this.cfpers_srv_person;
	}
	
	public void setCfpers_srv_person(CfPers cfpers_srv_person) {
		this.cfpers_srv_person = cfpers_srv_person;
	}
	
}