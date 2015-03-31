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
@Table(name = "CM_EVENT_FUNDING")
public class CfEvent_Fund implements java.io.Serializable {

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
	@JoinColumn(name="cfevent_fund_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfevent_fund_currency;
	@ManyToOne
	@JoinColumn(name="cfevent_fund_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfevent_fund_classification;
	@ManyToOne
	@JoinColumn(name="cfevent_fund_funding", referencedColumnName="ID",  nullable = true)
	private CfFund cfevent_fund_funding;
	@ManyToOne
	@JoinColumn(name="cfevent_fund_event", referencedColumnName="ID",  nullable = true)
	private CfEvent cfevent_fund_event;
	
	public CfEvent_Fund(){
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
	
	public CfCurrency getCfevent_fund_currency() {
		return this.cfevent_fund_currency;
	}
	
	public void setCfevent_fund_currency(CfCurrency cfevent_fund_currency) {
		this.cfevent_fund_currency = cfevent_fund_currency;
	}
	
	public CfClass getCfevent_fund_classification() {
		return this.cfevent_fund_classification;
	}
	
	public void setCfevent_fund_classification(CfClass cfevent_fund_classification) {
		this.cfevent_fund_classification = cfevent_fund_classification;
	}
	
	public CfFund getCfevent_fund_funding() {
		return this.cfevent_fund_funding;
	}
	
	public void setCfevent_fund_funding(CfFund cfevent_fund_funding) {
		this.cfevent_fund_funding = cfevent_fund_funding;
	}
	
	public CfEvent getCfevent_fund_event() {
		return this.cfevent_fund_event;
	}
	
	public void setCfevent_fund_event(CfEvent cfevent_fund_event) {
		this.cfevent_fund_event = cfevent_fund_event;
	}
	
}