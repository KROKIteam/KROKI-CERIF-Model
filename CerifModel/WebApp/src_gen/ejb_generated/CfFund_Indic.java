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
@Table(name = "CM_FUNDING_INDICATOR")
public class CfFund_Indic implements java.io.Serializable {

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
	@Column(name = "cfAmount", unique = false, nullable = false )
	private java.math.BigDecimal a_amount;
	@ManyToOne
	@JoinColumn(name="cffund_indic_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cffund_indic_classification;
	@ManyToOne
	@JoinColumn(name="cffund_indic_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cffund_indic_currency;
	@ManyToOne
	@JoinColumn(name="cffund_indic_indicator", referencedColumnName="ID",  nullable = true)
	private CfIndic cffund_indic_indicator;
	@ManyToOne
	@JoinColumn(name="cffund_indic_funding", referencedColumnName="ID",  nullable = true)
	private CfFund cffund_indic_funding;
	
	public CfFund_Indic(){
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