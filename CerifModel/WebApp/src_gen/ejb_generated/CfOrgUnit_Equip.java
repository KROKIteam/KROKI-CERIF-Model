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
@Table(name = "CM_ORGANISATION_UNIT_EQUIPMENT")
public class CfOrgUnit_Equip implements java.io.Serializable {

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
	@JoinColumn(name="cforgunit_equip_equipment", referencedColumnName="ID",  nullable = true)
	private CfEquip cforgunit_equip_equipment;
	@ManyToOne
	@JoinColumn(name="cforgunit_equip_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cforgunit_equip_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_equip_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cforgunit_equip_currency;
	@ManyToOne
	@JoinColumn(name="cforgunit_equip_organisationUnit", referencedColumnName="ID",  nullable = true)
	private CfOrgUnit cforgunit_equip_organisationUnit;
	
	public CfOrgUnit_Equip(){
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
	
	public CfEquip getCforgunit_equip_equipment() {
		return this.cforgunit_equip_equipment;
	}
	
	public void setCforgunit_equip_equipment(CfEquip cforgunit_equip_equipment) {
		this.cforgunit_equip_equipment = cforgunit_equip_equipment;
	}
	
	public CfClass getCforgunit_equip_classification() {
		return this.cforgunit_equip_classification;
	}
	
	public void setCforgunit_equip_classification(CfClass cforgunit_equip_classification) {
		this.cforgunit_equip_classification = cforgunit_equip_classification;
	}
	
	public CfCurrency getCforgunit_equip_currency() {
		return this.cforgunit_equip_currency;
	}
	
	public void setCforgunit_equip_currency(CfCurrency cforgunit_equip_currency) {
		this.cforgunit_equip_currency = cforgunit_equip_currency;
	}
	
	public CfOrgUnit getCforgunit_equip_organisationUnit() {
		return this.cforgunit_equip_organisationUnit;
	}
	
	public void setCforgunit_equip_organisationUnit(CfOrgUnit cforgunit_equip_organisationUnit) {
		this.cforgunit_equip_organisationUnit = cforgunit_equip_organisationUnit;
	}
	
}