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
@Table(name = "C1_RESULT_PRODUCT_INDICATOR")
public class CfResProd_Indic implements java.io.Serializable {

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
	@JoinColumn(name="cfresprod_indic_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfresprod_indic_classification;
	@ManyToOne
	@JoinColumn(name="cfresprod_indic_indicator", referencedColumnName="ID",  nullable = true)
	private CfIndic cfresprod_indic_indicator;
	@ManyToOne
	@JoinColumn(name="cfresprod_indic_resultProduct", referencedColumnName="ID",  nullable = true)
	private CfResProd cfresprod_indic_resultProduct;
	
	public CfResProd_Indic(){
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
	
	public CfClass getCfresprod_indic_classification() {
		return this.cfresprod_indic_classification;
	}
	
	public void setCfresprod_indic_classification(CfClass cfresprod_indic_classification) {
		this.cfresprod_indic_classification = cfresprod_indic_classification;
	}
	
	public CfIndic getCfresprod_indic_indicator() {
		return this.cfresprod_indic_indicator;
	}
	
	public void setCfresprod_indic_indicator(CfIndic cfresprod_indic_indicator) {
		this.cfresprod_indic_indicator = cfresprod_indic_indicator;
	}
	
	public CfResProd getCfresprod_indic_resultProduct() {
		return this.cfresprod_indic_resultProduct;
	}
	
	public void setCfresprod_indic_resultProduct(CfResProd cfresprod_indic_resultProduct) {
		this.cfresprod_indic_resultProduct = cfresprod_indic_resultProduct;
	}
	
}