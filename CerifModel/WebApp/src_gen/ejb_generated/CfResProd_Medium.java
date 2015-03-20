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
   Creation date: 20.03.2015  10:51:19h
   **/

@Entity
@Table(name = "CM_RESULT_PRODUCT_MEDIUM")
public class CfResProd_Medium implements java.io.Serializable {

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
	@JoinColumn(name="cfresprod_medium_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfresprod_medium_classification;
	@ManyToOne
	@JoinColumn(name="cfresprod_medium_medium", referencedColumnName="ID",  nullable = true)
	private CfMedium cfresprod_medium_medium;
	@ManyToOne
	@JoinColumn(name="cfresprod_medium_resultProduct", referencedColumnName="ID",  nullable = true)
	private CfResProd cfresprod_medium_resultProduct;
	
	public CfResProd_Medium(){
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
	
	public CfClass getCfresprod_medium_classification() {
		return this.cfresprod_medium_classification;
	}
	
	public void setCfresprod_medium_classification(CfClass cfresprod_medium_classification) {
		this.cfresprod_medium_classification = cfresprod_medium_classification;
	}
	
	public CfMedium getCfresprod_medium_medium() {
		return this.cfresprod_medium_medium;
	}
	
	public void setCfresprod_medium_medium(CfMedium cfresprod_medium_medium) {
		this.cfresprod_medium_medium = cfresprod_medium_medium;
	}
	
	public CfResProd getCfresprod_medium_resultProduct() {
		return this.cfresprod_medium_resultProduct;
	}
	
	public void setCfresprod_medium_resultProduct(CfResProd cfresprod_medium_resultProduct) {
		this.cfresprod_medium_resultProduct = cfresprod_medium_resultProduct;
	}
	
}