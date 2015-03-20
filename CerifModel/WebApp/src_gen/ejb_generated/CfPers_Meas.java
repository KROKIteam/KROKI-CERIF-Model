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
@Table(name = "CM_PERSON_MEASUREMENT")
public class CfPers_Meas implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_meas_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_meas_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_meas_measurement", referencedColumnName="ID",  nullable = true)
	private CfMeas cfpers_meas_measurement;
	@ManyToOne
	@JoinColumn(name="cfpers_meas_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_meas_person;
	
	public CfPers_Meas(){
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
	
	public CfClass getCfpers_meas_classification() {
		return this.cfpers_meas_classification;
	}
	
	public void setCfpers_meas_classification(CfClass cfpers_meas_classification) {
		this.cfpers_meas_classification = cfpers_meas_classification;
	}
	
	public CfMeas getCfpers_meas_measurement() {
		return this.cfpers_meas_measurement;
	}
	
	public void setCfpers_meas_measurement(CfMeas cfpers_meas_measurement) {
		this.cfpers_meas_measurement = cfpers_meas_measurement;
	}
	
	public CfPers getCfpers_meas_person() {
		return this.cfpers_meas_person;
	}
	
	public void setCfpers_meas_person(CfPers cfpers_meas_person) {
		this.cfpers_meas_person = cfpers_meas_person;
	}
	
}