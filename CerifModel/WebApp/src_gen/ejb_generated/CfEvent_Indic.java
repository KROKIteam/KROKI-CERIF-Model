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
@Table(name = "C1_EVENT_INDICATOR")
public class CfEvent_Indic implements java.io.Serializable {

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
	@ManyToOne
	@JoinColumn(name="cfevent_indic_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfevent_indic_classification;
	@ManyToOne
	@JoinColumn(name="cfevent_indic_indicator", referencedColumnName="ID",  nullable = true)
	protected CfIndic cfevent_indic_indicator;
	@ManyToOne
	@JoinColumn(name="cfevent_indic_event", referencedColumnName="ID",  nullable = true)
	protected CfEvent cfevent_indic_event;
	
	public CfEvent_Indic(){
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
	
	public CfClass getCfevent_indic_classification() {
		return this.cfevent_indic_classification;
	}
	
	public void setCfevent_indic_classification(CfClass cfevent_indic_classification) {
		this.cfevent_indic_classification = cfevent_indic_classification;
	}
	
	public CfIndic getCfevent_indic_indicator() {
		return this.cfevent_indic_indicator;
	}
	
	public void setCfevent_indic_indicator(CfIndic cfevent_indic_indicator) {
		this.cfevent_indic_indicator = cfevent_indic_indicator;
	}
	
	public CfEvent getCfevent_indic_event() {
		return this.cfevent_indic_event;
	}
	
	public void setCfevent_indic_event(CfEvent cfevent_indic_event) {
		this.cfevent_indic_event = cfevent_indic_event;
	}
	
}