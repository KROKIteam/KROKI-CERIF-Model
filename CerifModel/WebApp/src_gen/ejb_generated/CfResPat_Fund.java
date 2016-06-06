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
@Table(name = "C1_RESULT_PATENT_FUNDING")
public class CfResPat_Fund implements java.io.Serializable {

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
	@JoinColumn(name="cfrespat_fund_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfrespat_fund_classification;
	@ManyToOne
	@JoinColumn(name="cfrespat_fund_funding", referencedColumnName="ID",  nullable = true)
	protected CfFund cfrespat_fund_funding;
	@ManyToOne
	@JoinColumn(name="cfrespat_fund_currency", referencedColumnName="ID",  nullable = true)
	protected CfCurrency cfrespat_fund_currency;
	@ManyToOne
	@JoinColumn(name="cfrespat_fund_resultPatent", referencedColumnName="ID",  nullable = true)
	protected CfResPat cfrespat_fund_resultPatent;
	
	public CfResPat_Fund(){
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
	
	public CfClass getCfrespat_fund_classification() {
		return this.cfrespat_fund_classification;
	}
	
	public void setCfrespat_fund_classification(CfClass cfrespat_fund_classification) {
		this.cfrespat_fund_classification = cfrespat_fund_classification;
	}
	
	public CfFund getCfrespat_fund_funding() {
		return this.cfrespat_fund_funding;
	}
	
	public void setCfrespat_fund_funding(CfFund cfrespat_fund_funding) {
		this.cfrespat_fund_funding = cfrespat_fund_funding;
	}
	
	public CfCurrency getCfrespat_fund_currency() {
		return this.cfrespat_fund_currency;
	}
	
	public void setCfrespat_fund_currency(CfCurrency cfrespat_fund_currency) {
		this.cfrespat_fund_currency = cfrespat_fund_currency;
	}
	
	public CfResPat getCfrespat_fund_resultPatent() {
		return this.cfrespat_fund_resultPatent;
	}
	
	public void setCfrespat_fund_resultPatent(CfResPat cfrespat_fund_resultPatent) {
		this.cfrespat_fund_resultPatent = cfrespat_fund_resultPatent;
	}
	
}