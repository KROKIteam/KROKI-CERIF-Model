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
@Table(name = "CM_FUNDING__FUNDING")
public class CfFund_Fund implements java.io.Serializable {

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
	@JoinColumn(name="cffund_fund_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cffund_fund_classification;
	@ManyToOne
	@JoinColumn(name="cffund_fund_funding1", referencedColumnName="ID",  nullable = true)
	private CfFund cffund_fund_funding1;
	@ManyToOne
	@JoinColumn(name="cffund_fund_funding2", referencedColumnName="ID",  nullable = true)
	private CfFund cffund_fund_funding2;
	
	public CfFund_Fund(){
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
	
	public CfClass getCffund_fund_classification() {
		return this.cffund_fund_classification;
	}
	
	public void setCffund_fund_classification(CfClass cffund_fund_classification) {
		this.cffund_fund_classification = cffund_fund_classification;
	}
	
	public CfFund getCffund_fund_funding1() {
		return this.cffund_fund_funding1;
	}
	
	public void setCffund_fund_funding1(CfFund cffund_fund_funding1) {
		this.cffund_fund_funding1 = cffund_fund_funding1;
	}
	
	public CfFund getCffund_fund_funding2() {
		return this.cffund_fund_funding2;
	}
	
	public void setCffund_fund_funding2(CfFund cffund_fund_funding2) {
		this.cffund_fund_funding2 = cffund_fund_funding2;
	}
	
}