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
   Creation date: 20.03.2015  10:51:19h
   **/

@Entity
@Table(name = "CM_ORGANISATION_UNIT_SERVICE")
public class CfOrgUnit_Srv implements java.io.Serializable {

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
	@Column(name = "cfAvailability", unique = false, nullable = false )
	private java.lang.String a_availability;
	@Column(name = "cfConditions", unique = false, nullable = false )
	private java.lang.String a_conditions;
	@Column(name = "cfPrice", unique = false, nullable = false )
	private java.math.BigDecimal a_price;
	@ManyToOne
	@JoinColumn(name="cforgunit_srv_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cforgunit_srv_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_srv_service", referencedColumnName="ID",  nullable = true)
	private CfSrv cforgunit_srv_service;
	@ManyToOne
	@JoinColumn(name="cforgunit_srv_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cforgunit_srv_currency;
	@ManyToOne
	@JoinColumn(name="cforgunit_srv_organisationUnit", referencedColumnName="ID",  nullable = true)
	private CfOrgUnit cforgunit_srv_organisationUnit;
	
	public CfOrgUnit_Srv(){
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
	
	public CfClass getCforgunit_srv_classification() {
		return this.cforgunit_srv_classification;
	}
	
	public void setCforgunit_srv_classification(CfClass cforgunit_srv_classification) {
		this.cforgunit_srv_classification = cforgunit_srv_classification;
	}
	
	public CfSrv getCforgunit_srv_service() {
		return this.cforgunit_srv_service;
	}
	
	public void setCforgunit_srv_service(CfSrv cforgunit_srv_service) {
		this.cforgunit_srv_service = cforgunit_srv_service;
	}
	
	public CfCurrency getCforgunit_srv_currency() {
		return this.cforgunit_srv_currency;
	}
	
	public void setCforgunit_srv_currency(CfCurrency cforgunit_srv_currency) {
		this.cforgunit_srv_currency = cforgunit_srv_currency;
	}
	
	public CfOrgUnit getCforgunit_srv_organisationUnit() {
		return this.cforgunit_srv_organisationUnit;
	}
	
	public void setCforgunit_srv_organisationUnit(CfOrgUnit cforgunit_srv_organisationUnit) {
		this.cforgunit_srv_organisationUnit = cforgunit_srv_organisationUnit;
	}
	
}