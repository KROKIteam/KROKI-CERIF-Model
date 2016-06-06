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
@Table(name = "C1_INDICATOR_MEASUREMENT")
public class CfIndic_Meas implements java.io.Serializable {

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
	@JoinColumn(name="cfindic_meas_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfindic_meas_classification;
	@ManyToOne
	@JoinColumn(name="cfindic_meas_measurement", referencedColumnName="ID",  nullable = true)
	protected CfMeas cfindic_meas_measurement;
	@ManyToOne
	@JoinColumn(name="cfindic_meas_indicator", referencedColumnName="ID",  nullable = true)
	protected CfIndic cfindic_meas_indicator;
	
	public CfIndic_Meas(){
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
	
	public CfClass getCfindic_meas_classification() {
		return this.cfindic_meas_classification;
	}
	
	public void setCfindic_meas_classification(CfClass cfindic_meas_classification) {
		this.cfindic_meas_classification = cfindic_meas_classification;
	}
	
	public CfMeas getCfindic_meas_measurement() {
		return this.cfindic_meas_measurement;
	}
	
	public void setCfindic_meas_measurement(CfMeas cfindic_meas_measurement) {
		this.cfindic_meas_measurement = cfindic_meas_measurement;
	}
	
	public CfIndic getCfindic_meas_indicator() {
		return this.cfindic_meas_indicator;
	}
	
	public void setCfindic_meas_indicator(CfIndic cfindic_meas_indicator) {
		this.cfindic_meas_indicator = cfindic_meas_indicator;
	}
	
}