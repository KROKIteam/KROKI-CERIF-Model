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
@Table(name = "CM_EVENT_EVENT")
public class CfEvent_Event implements java.io.Serializable {

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
	@JoinColumn(name="cfevent_event_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfevent_event_classification;
	@ManyToOne
	@JoinColumn(name="cfevent_event_event", referencedColumnName="ID",  nullable = true)
	private CfEvent cfevent_event_event;
	@ManyToOne
	@JoinColumn(name="cfevent_event_eventa", referencedColumnName="ID",  nullable = true)
	private CfEvent cfevent_event_eventa;
	
	public CfEvent_Event(){
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
	
	public CfClass getCfevent_event_classification() {
		return this.cfevent_event_classification;
	}
	
	public void setCfevent_event_classification(CfClass cfevent_event_classification) {
		this.cfevent_event_classification = cfevent_event_classification;
	}
	
	public CfEvent getCfevent_event_event() {
		return this.cfevent_event_event;
	}
	
	public void setCfevent_event_event(CfEvent cfevent_event_event) {
		this.cfevent_event_event = cfevent_event_event;
	}
	
	public CfEvent getCfevent_event_eventa() {
		return this.cfevent_event_eventa;
	}
	
	public void setCfevent_event_eventa(CfEvent cfevent_event_eventa) {
		this.cfevent_event_eventa = cfevent_event_eventa;
	}
	
}