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
@Table(name = "C1_RESULT_PRODUCT_FUNDING")
public class CfResProd_Fund implements java.io.Serializable {

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
	@Column(name = "cfAmount", unique = false, nullable = false ,columnDefinition = "FLOAT")
	private java.math.BigDecimal a_amount;
	@ManyToOne
	@JoinColumn(name="cfresprod_fund_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfresprod_fund_classification;
	@ManyToOne
	@JoinColumn(name="cfresprod_fund_funding", referencedColumnName="ID",  nullable = true)
	private CfFund cfresprod_fund_funding;
	@ManyToOne
	@JoinColumn(name="cfresprod_fund_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfresprod_fund_currency;
	@ManyToOne
	@JoinColumn(name="cfresprod_fund_resultProduct", referencedColumnName="ID",  nullable = true)
	private CfResProd cfresprod_fund_resultProduct;
	
	public CfResProd_Fund(){
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
	
	public java.math.BigDecimal getA_amount() {
		return this.a_amount;
	}
	
	public void setA_amount(java.math.BigDecimal a_amount) {
		this.a_amount = a_amount;
	}
	
	public CfClass getCfresprod_fund_classification() {
		return this.cfresprod_fund_classification;
	}
	
	public void setCfresprod_fund_classification(CfClass cfresprod_fund_classification) {
		this.cfresprod_fund_classification = cfresprod_fund_classification;
	}
	
	public CfFund getCfresprod_fund_funding() {
		return this.cfresprod_fund_funding;
	}
	
	public void setCfresprod_fund_funding(CfFund cfresprod_fund_funding) {
		this.cfresprod_fund_funding = cfresprod_fund_funding;
	}
	
	public CfCurrency getCfresprod_fund_currency() {
		return this.cfresprod_fund_currency;
	}
	
	public void setCfresprod_fund_currency(CfCurrency cfresprod_fund_currency) {
		this.cfresprod_fund_currency = cfresprod_fund_currency;
	}
	
	public CfResProd getCfresprod_fund_resultProduct() {
		return this.cfresprod_fund_resultProduct;
	}
	
	public void setCfresprod_fund_resultProduct(CfResProd cfresprod_fund_resultProduct) {
		this.cfresprod_fund_resultProduct = cfresprod_fund_resultProduct;
	}
	
}