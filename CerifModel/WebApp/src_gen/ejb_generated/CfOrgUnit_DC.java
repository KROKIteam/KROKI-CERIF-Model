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
@Table(name = "C1_ORGANISATION_UNIT_DC")
public class CfOrgUnit_DC implements java.io.Serializable {

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
	@ManyToOne
	@JoinColumn(name="cforgunit_dc_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cforgunit_dc_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_dc_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cforgunit_dc_dublinCore;
	@ManyToOne
	@JoinColumn(name="cforgunit_dc_organisationUnit", referencedColumnName="ID",  nullable = true)
	private CfOrgUnit cforgunit_dc_organisationUnit;
	
	public CfOrgUnit_DC(){
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
	
	public CfClass getCforgunit_dc_classification() {
		return this.cforgunit_dc_classification;
	}
	
	public void setCforgunit_dc_classification(CfClass cforgunit_dc_classification) {
		this.cforgunit_dc_classification = cforgunit_dc_classification;
	}
	
	public CfDC getCforgunit_dc_dublinCore() {
		return this.cforgunit_dc_dublinCore;
	}
	
	public void setCforgunit_dc_dublinCore(CfDC cforgunit_dc_dublinCore) {
		this.cforgunit_dc_dublinCore = cforgunit_dc_dublinCore;
	}
	
	public CfOrgUnit getCforgunit_dc_organisationUnit() {
		return this.cforgunit_dc_organisationUnit;
	}
	
	public void setCforgunit_dc_organisationUnit(CfOrgUnit cforgunit_dc_organisationUnit) {
		this.cforgunit_dc_organisationUnit = cforgunit_dc_organisationUnit;
	}
	
}