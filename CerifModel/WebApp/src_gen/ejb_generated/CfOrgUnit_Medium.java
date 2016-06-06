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
@Table(name = "C1_ORGANISATION_UNIT_MEDIUM")
public class CfOrgUnit_Medium implements java.io.Serializable {

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
	@JoinColumn(name="cforgunit_medium_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cforgunit_medium_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_medium_medium", referencedColumnName="ID",  nullable = true)
	protected CfMedium cforgunit_medium_medium;
	@ManyToOne
	@JoinColumn(name="cforgunit_medium_organisationUnit", referencedColumnName="ID",  nullable = true)
	protected CfOrgUnit cforgunit_medium_organisationUnit;
	
	public CfOrgUnit_Medium(){
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
	
	public CfClass getCforgunit_medium_classification() {
		return this.cforgunit_medium_classification;
	}
	
	public void setCforgunit_medium_classification(CfClass cforgunit_medium_classification) {
		this.cforgunit_medium_classification = cforgunit_medium_classification;
	}
	
	public CfMedium getCforgunit_medium_medium() {
		return this.cforgunit_medium_medium;
	}
	
	public void setCforgunit_medium_medium(CfMedium cforgunit_medium_medium) {
		this.cforgunit_medium_medium = cforgunit_medium_medium;
	}
	
	public CfOrgUnit getCforgunit_medium_organisationUnit() {
		return this.cforgunit_medium_organisationUnit;
	}
	
	public void setCforgunit_medium_organisationUnit(CfOrgUnit cforgunit_medium_organisationUnit) {
		this.cforgunit_medium_organisationUnit = cforgunit_medium_organisationUnit;
	}
	
}