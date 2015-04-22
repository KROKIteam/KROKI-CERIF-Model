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
@Table(name = "C1_EVENT_MEASUREMENT")
public class CfEvent_Meas implements java.io.Serializable {

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
	@ManyToOne
	@JoinColumn(name="cfevent_meas_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfevent_meas_classification;
	@ManyToOne
	@JoinColumn(name="cfevent_meas_measurement", referencedColumnName="ID",  nullable = true)
	private CfMeas cfevent_meas_measurement;
	@ManyToOne
	@JoinColumn(name="cfevent_meas_event", referencedColumnName="ID",  nullable = true)
	private CfEvent cfevent_meas_event;
	
	public CfEvent_Meas(){
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
	
	public CfClass getCfevent_meas_classification() {
		return this.cfevent_meas_classification;
	}
	
	public void setCfevent_meas_classification(CfClass cfevent_meas_classification) {
		this.cfevent_meas_classification = cfevent_meas_classification;
	}
	
	public CfMeas getCfevent_meas_measurement() {
		return this.cfevent_meas_measurement;
	}
	
	public void setCfevent_meas_measurement(CfMeas cfevent_meas_measurement) {
		this.cfevent_meas_measurement = cfevent_meas_measurement;
	}
	
	public CfEvent getCfevent_meas_event() {
		return this.cfevent_meas_event;
	}
	
	public void setCfevent_meas_event(CfEvent cfevent_meas_event) {
		this.cfevent_meas_event = cfevent_meas_event;
	}
	
}