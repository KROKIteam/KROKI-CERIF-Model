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
   Creation date: 31.03.2015  10:28:05h
   **/

@Entity
@Table(name = "CM_PROJECT_FUNDING")
public class CfProj_Fund implements java.io.Serializable {

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
	@JoinColumn(name="cfproj_fund_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfproj_fund_classification;
	@ManyToOne
	@JoinColumn(name="cfproj_fund_funding", referencedColumnName="ID",  nullable = true)
	private CfFund cfproj_fund_funding;
	@ManyToOne
	@JoinColumn(name="cfproj_fund_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfproj_fund_currency;
	@ManyToOne
	@JoinColumn(name="cfproj_fund_project", referencedColumnName="ID",  nullable = true)
	private CfProj cfproj_fund_project;
	
	public CfProj_Fund(){
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
	
	public CfClass getCfproj_fund_classification() {
		return this.cfproj_fund_classification;
	}
	
	public void setCfproj_fund_classification(CfClass cfproj_fund_classification) {
		this.cfproj_fund_classification = cfproj_fund_classification;
	}
	
	public CfFund getCfproj_fund_funding() {
		return this.cfproj_fund_funding;
	}
	
	public void setCfproj_fund_funding(CfFund cfproj_fund_funding) {
		this.cfproj_fund_funding = cfproj_fund_funding;
	}
	
	public CfCurrency getCfproj_fund_currency() {
		return this.cfproj_fund_currency;
	}
	
	public void setCfproj_fund_currency(CfCurrency cfproj_fund_currency) {
		this.cfproj_fund_currency = cfproj_fund_currency;
	}
	
	public CfProj getCfproj_fund_project() {
		return this.cfproj_fund_project;
	}
	
	public void setCfproj_fund_project(CfProj cfproj_fund_project) {
		this.cfproj_fund_project = cfproj_fund_project;
	}
	
}