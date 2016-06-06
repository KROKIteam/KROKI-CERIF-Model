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
@Table(name = "C1_PROJECT_MEDIUM")
public class CfProj_Medium implements java.io.Serializable {

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
	@JoinColumn(name="cfproj_medium_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfproj_medium_classification;
	@ManyToOne
	@JoinColumn(name="cfproj_medium_medium", referencedColumnName="ID",  nullable = true)
	protected CfMedium cfproj_medium_medium;
	@ManyToOne
	@JoinColumn(name="cfproj_medium_project", referencedColumnName="ID",  nullable = true)
	protected CfProj cfproj_medium_project;
	
	public CfProj_Medium(){
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
	
	public CfClass getCfproj_medium_classification() {
		return this.cfproj_medium_classification;
	}
	
	public void setCfproj_medium_classification(CfClass cfproj_medium_classification) {
		this.cfproj_medium_classification = cfproj_medium_classification;
	}
	
	public CfMedium getCfproj_medium_medium() {
		return this.cfproj_medium_medium;
	}
	
	public void setCfproj_medium_medium(CfMedium cfproj_medium_medium) {
		this.cfproj_medium_medium = cfproj_medium_medium;
	}
	
	public CfProj getCfproj_medium_project() {
		return this.cfproj_medium_project;
	}
	
	public void setCfproj_medium_project(CfProj cfproj_medium_project) {
		this.cfproj_medium_project = cfproj_medium_project;
	}
	
}