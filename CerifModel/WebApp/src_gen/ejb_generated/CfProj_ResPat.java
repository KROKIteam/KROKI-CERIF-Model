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
@Table(name = "CM_PROJECT_RESULT_PATENT")
public class CfProj_ResPat implements java.io.Serializable {

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
	@ManyToOne
	@JoinColumn(name="cfproj_respat_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfproj_respat_classification;
	@ManyToOne
	@JoinColumn(name="cfproj_respat_resultPatent", referencedColumnName="ID",  nullable = true)
	private CfResPat cfproj_respat_resultPatent;
	@ManyToOne
	@JoinColumn(name="cfproj_respat_project", referencedColumnName="ID",  nullable = true)
	private CfProj cfproj_respat_project;
	
	public CfProj_ResPat(){
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
	
	public CfClass getCfproj_respat_classification() {
		return this.cfproj_respat_classification;
	}
	
	public void setCfproj_respat_classification(CfClass cfproj_respat_classification) {
		this.cfproj_respat_classification = cfproj_respat_classification;
	}
	
	public CfResPat getCfproj_respat_resultPatent() {
		return this.cfproj_respat_resultPatent;
	}
	
	public void setCfproj_respat_resultPatent(CfResPat cfproj_respat_resultPatent) {
		this.cfproj_respat_resultPatent = cfproj_respat_resultPatent;
	}
	
	public CfProj getCfproj_respat_project() {
		return this.cfproj_respat_project;
	}
	
	public void setCfproj_respat_project(CfProj cfproj_respat_project) {
		this.cfproj_respat_project = cfproj_respat_project;
	}
	
}