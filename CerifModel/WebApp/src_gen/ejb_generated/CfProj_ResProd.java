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
@Table(name = "C1_PROJECT_RESULT_PRODUCT")
public class CfProj_ResProd implements java.io.Serializable {

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
	@JoinColumn(name="cfproj_resprod_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfproj_resprod_classification;
	@ManyToOne
	@JoinColumn(name="cfproj_resprod_resultProduct", referencedColumnName="ID",  nullable = true)
	protected CfResProd cfproj_resprod_resultProduct;
	@ManyToOne
	@JoinColumn(name="cfproj_resprod_project", referencedColumnName="ID",  nullable = true)
	protected CfProj cfproj_resprod_project;
	
	public CfProj_ResProd(){
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