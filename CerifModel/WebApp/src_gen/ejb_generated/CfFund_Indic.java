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
@Table(name = "C1_FUNDING_INDICATOR")
public class CfFund_Indic implements java.io.Serializable {

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
	@JoinColumn(name="cffund_indic_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cffund_indic_classification;
	@ManyToOne
	@JoinColumn(name="cffund_indic_currency", referencedColumnName="ID",  nullable = true)
	protected CfCurrency cffund_indic_currency;
	@ManyToOne
	@JoinColumn(name="cffund_indic_indicator", referencedColumnName="ID",  nullable = true)
	protected CfIndic cffund_indic_indicator;
	@ManyToOne
	@JoinColumn(name="cffund_indic_funding", referencedColumnName="ID",  nullable = true)
	protected CfFund cffund_indic_funding;
	
	public CfFund_Indic(){
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
	
	public CfClass getCffund_indic_classification() {
		return this.cffund_indic_classification;
	}
	
	public void setCffund_indic_classification(CfClass cffund_indic_classification) {
		this.cffund_indic_classification = cffund_indic_classification;
	}
	
	public CfCurrency getCffund_indic_currency() {
		return this.cffund_indic_currency;
	}
	
	public void setCffund_indic_currency(CfCurrency cffund_indic_currency) {
		this.cffund_indic_currency = cffund_indic_currency;
	}
	
	public CfIndic getCffund_indic_indicator() {
		return this.cffund_indic_indicator;
	}
	
	public void setCffund_indic_indicator(CfIndic cffund_indic_indicator) {
		this.cffund_indic_indicator = cffund_indic_indicator;
	}
	
	public CfFund getCffund_indic_funding() {
		return this.cffund_indic_funding;
	}
	
	public void setCffund_indic_funding(CfFund cffund_indic_funding) {
		this.cffund_indic_funding = cffund_indic_funding;
	}
	
}