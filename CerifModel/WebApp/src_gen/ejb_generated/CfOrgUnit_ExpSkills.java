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
@Table(name = "C1_ORGANISATION_UNIT_EXPERTISE_AND_SKILLS")
public class CfOrgUnit_ExpSkills implements java.io.Serializable {

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
	@JoinColumn(name="cforgunit_expskills_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cforgunit_expskills_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_expskills_expertiseAndSkills", referencedColumnName="ID",  nullable = true)
	protected CfExpSkills cforgunit_expskills_expertiseAndSkills;
	@ManyToOne
	@JoinColumn(name="cforgunit_expskills_currency", referencedColumnName="ID",  nullable = true)
	protected CfCurrency cforgunit_expskills_currency;
	@ManyToOne
	@JoinColumn(name="cforgunit_expskills_organisationUnit", referencedColumnName="ID",  nullable = true)
	protected CfOrgUnit cforgunit_expskills_organisationUnit;
	
	public CfOrgUnit_ExpSkills(){
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
	
	public CfClass getCforgunit_expskills_classification() {
		return this.cforgunit_expskills_classification;
	}
	
	public void setCforgunit_expskills_classification(CfClass cforgunit_expskills_classification) {
		this.cforgunit_expskills_classification = cforgunit_expskills_classification;
	}
	
	public CfExpSkills getCforgunit_expskills_expertiseAndSkills() {
		return this.cforgunit_expskills_expertiseAndSkills;
	}
	
	public void setCforgunit_expskills_expertiseAndSkills(CfExpSkills cforgunit_expskills_expertiseAndSkills) {
		this.cforgunit_expskills_expertiseAndSkills = cforgunit_expskills_expertiseAndSkills;
	}
	
	public CfCurrency getCforgunit_expskills_currency() {
		return this.cforgunit_expskills_currency;
	}
	
	public void setCforgunit_expskills_currency(CfCurrency cforgunit_expskills_currency) {
		this.cforgunit_expskills_currency = cforgunit_expskills_currency;
	}
	
	public CfOrgUnit getCforgunit_expskills_organisationUnit() {
		return this.cforgunit_expskills_organisationUnit;
	}
	
	public void setCforgunit_expskills_organisationUnit(CfOrgUnit cforgunit_expskills_organisationUnit) {
		this.cforgunit_expskills_organisationUnit = cforgunit_expskills_organisationUnit;
	}
	
}