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
@Table(name = "C1_PROJECT_ORGANISATION_UNIT")
public class CfProj_OrgUnit implements java.io.Serializable {

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
	@JoinColumn(name="cfproj_orgunit_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfproj_orgunit_classification;
	@ManyToOne
	@JoinColumn(name="cfproj_orgunit_organisationUnit", referencedColumnName="ID",  nullable = true)
	protected CfOrgUnit cfproj_orgunit_organisationUnit;
	@ManyToOne
	@JoinColumn(name="cfproj_orgunit_project", referencedColumnName="ID",  nullable = true)
	protected CfProj cfproj_orgunit_project;
	
	public CfProj_OrgUnit(){
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
	
	public CfClass getCfproj_orgunit_classification() {
		return this.cfproj_orgunit_classification;
	}
	
	public void setCfproj_orgunit_classification(CfClass cfproj_orgunit_classification) {
		this.cfproj_orgunit_classification = cfproj_orgunit_classification;
	}
	
	public CfOrgUnit getCfproj_orgunit_organisationUnit() {
		return this.cfproj_orgunit_organisationUnit;
	}
	
	public void setCfproj_orgunit_organisationUnit(CfOrgUnit cfproj_orgunit_organisationUnit) {
		this.cfproj_orgunit_organisationUnit = cfproj_orgunit_organisationUnit;
	}
	
	public CfProj getCfproj_orgunit_project() {
		return this.cfproj_orgunit_project;
	}
	
	public void setCfproj_orgunit_project(CfProj cfproj_orgunit_project) {
		this.cfproj_orgunit_project = cfproj_orgunit_project;
	}
	
}