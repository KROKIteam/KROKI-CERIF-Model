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
@Table(name = "C1_ORGANISATION_UNIT_INDICATOR")
public class CfOrgUnit_Indic implements java.io.Serializable {

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
	@ManyToOne
	@JoinColumn(name="cforgunit_indic_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cforgunit_indic_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_indic_indicator", referencedColumnName="ID",  nullable = true)
	protected CfIndic cforgunit_indic_indicator;
	@ManyToOne
	@JoinColumn(name="cforgunit_indic_organisationUnit", referencedColumnName="ID",  nullable = true)
	protected CfOrgUnit cforgunit_indic_organisationUnit;
	
	public CfOrgUnit_Indic(){
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
	
	public CfClass getCforgunit_indic_classification() {
		return this.cforgunit_indic_classification;
	}
	
	public void setCforgunit_indic_classification(CfClass cforgunit_indic_classification) {
		this.cforgunit_indic_classification = cforgunit_indic_classification;
	}
	
	public CfIndic getCforgunit_indic_indicator() {
		return this.cforgunit_indic_indicator;
	}
	
	public void setCforgunit_indic_indicator(CfIndic cforgunit_indic_indicator) {
		this.cforgunit_indic_indicator = cforgunit_indic_indicator;
	}
	
	public CfOrgUnit getCforgunit_indic_organisationUnit() {
		return this.cforgunit_indic_organisationUnit;
	}
	
	public void setCforgunit_indic_organisationUnit(CfOrgUnit cforgunit_indic_organisationUnit) {
		this.cforgunit_indic_organisationUnit = cforgunit_indic_organisationUnit;
	}
	
}