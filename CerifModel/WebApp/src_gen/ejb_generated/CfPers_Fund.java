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
@Table(name = "C1_PERSON_FUNDING")
public class CfPers_Fund implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_fund_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_fund_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_fund_funding", referencedColumnName="ID",  nullable = true)
	private CfFund cfpers_fund_funding;
	@ManyToOne
	@JoinColumn(name="cfpers_fund_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfpers_fund_currency;
	@ManyToOne
	@JoinColumn(name="cfpers_fund_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_fund_person;
	
	public CfPers_Fund(){
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
	
	public CfClass getCfpers_fund_classification() {
		return this.cfpers_fund_classification;
	}
	
	public void setCfpers_fund_classification(CfClass cfpers_fund_classification) {
		this.cfpers_fund_classification = cfpers_fund_classification;
	}
	
	public CfFund getCfpers_fund_funding() {
		return this.cfpers_fund_funding;
	}
	
	public void setCfpers_fund_funding(CfFund cfpers_fund_funding) {
		this.cfpers_fund_funding = cfpers_fund_funding;
	}
	
	public CfCurrency getCfpers_fund_currency() {
		return this.cfpers_fund_currency;
	}
	
	public void setCfpers_fund_currency(CfCurrency cfpers_fund_currency) {
		this.cfpers_fund_currency = cfpers_fund_currency;
	}
	
	public CfPers getCfpers_fund_person() {
		return this.cfpers_fund_person;
	}
	
	public void setCfpers_fund_person(CfPers cfpers_fund_person) {
		this.cfpers_fund_person = cfpers_fund_person;
	}
	
}