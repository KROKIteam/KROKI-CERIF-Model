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
@Table(name = "C1_PROJECT_RESULT_PRODUCT")
public class CfProj_ResProd implements java.io.Serializable {

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
	@JoinColumn(name="cfproj_resprod_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfproj_resprod_classification;
	@ManyToOne
	@JoinColumn(name="cfproj_resprod_resultProduct", referencedColumnName="ID",  nullable = true)
	private CfResProd cfproj_resprod_resultProduct;
	@ManyToOne
	@JoinColumn(name="cfproj_resprod_project", referencedColumnName="ID",  nullable = true)
	private CfProj cfproj_resprod_project;
	
	public CfProj_ResProd(){
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
	
	public CfClass getCfproj_resprod_classification() {
		return this.cfproj_resprod_classification;
	}
	
	public void setCfproj_resprod_classification(CfClass cfproj_resprod_classification) {
		this.cfproj_resprod_classification = cfproj_resprod_classification;
	}
	
	public CfResProd getCfproj_resprod_resultProduct() {
		return this.cfproj_resprod_resultProduct;
	}
	
	public void setCfproj_resprod_resultProduct(CfResProd cfproj_resprod_resultProduct) {
		this.cfproj_resprod_resultProduct = cfproj_resprod_resultProduct;
	}
	
	public CfProj getCfproj_resprod_project() {
		return this.cfproj_resprod_project;
	}
	
	public void setCfproj_resprod_project(CfProj cfproj_resprod_project) {
		this.cfproj_resprod_project = cfproj_resprod_project;
	}
	
}