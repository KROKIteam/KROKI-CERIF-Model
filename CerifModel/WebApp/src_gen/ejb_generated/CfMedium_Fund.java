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
@Table(name = "C1_MEDIUM_FUNDING")
public class CfMedium_Fund implements java.io.Serializable {

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
	@Column(name = "cfAmount", unique = false, nullable = false ,columnDefinition = "FLOAT")
	protected java.math.BigDecimal ka_amount;
	@ManyToOne
	@JoinColumn(name="cfmedium_fund_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfmedium_fund_classification;
	@ManyToOne
	@JoinColumn(name="cfmedium_fund_funding", referencedColumnName="ID",  nullable = true)
	protected CfFund cfmedium_fund_funding;
	@ManyToOne
	@JoinColumn(name="cfmedium_fund_currency", referencedColumnName="ID",  nullable = true)
	protected CfCurrency cfmedium_fund_currency;
	@ManyToOne
	@JoinColumn(name="cfmedium_fund_medium", referencedColumnName="ID",  nullable = true)
	protected CfMedium cfmedium_fund_medium;
	
	public CfMedium_Fund(){
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
	
	public java.math.BigDecimal getKa_amount() {
		return this.ka_amount;
	}
	
	public void setKa_amount(java.math.BigDecimal ka_amount) {
		this.ka_amount = ka_amount;
	}
	
	public CfClass getCfmedium_fund_classification() {
		return this.cfmedium_fund_classification;
	}
	
	public void setCfmedium_fund_classification(CfClass cfmedium_fund_classification) {
		this.cfmedium_fund_classification = cfmedium_fund_classification;
	}
	
	public CfFund getCfmedium_fund_funding() {
		return this.cfmedium_fund_funding;
	}
	
	public void setCfmedium_fund_funding(CfFund cfmedium_fund_funding) {
		this.cfmedium_fund_funding = cfmedium_fund_funding;
	}
	
	public CfCurrency getCfmedium_fund_currency() {
		return this.cfmedium_fund_currency;
	}
	
	public void setCfmedium_fund_currency(CfCurrency cfmedium_fund_currency) {
		this.cfmedium_fund_currency = cfmedium_fund_currency;
	}
	
	public CfMedium getCfmedium_fund_medium() {
		return this.cfmedium_fund_medium;
	}
	
	public void setCfmedium_fund_medium(CfMedium cfmedium_fund_medium) {
		this.cfmedium_fund_medium = cfmedium_fund_medium;
	}
	
}