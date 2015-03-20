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
@Table(name = "CM_PERSON_DUBLIN_CORE")
public class CfPers_DC implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_dc_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_dc_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_dc_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cfpers_dc_dublinCore;
	@ManyToOne
	@JoinColumn(name="cfpers_dc_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_dc_person;
	
	public CfPers_DC(){
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
	
	public CfClass getCfpers_dc_classification() {
		return this.cfpers_dc_classification;
	}
	
	public void setCfpers_dc_classification(CfClass cfpers_dc_classification) {
		this.cfpers_dc_classification = cfpers_dc_classification;
	}
	
	public CfDC getCfpers_dc_dublinCore() {
		return this.cfpers_dc_dublinCore;
	}
	
	public void setCfpers_dc_dublinCore(CfDC cfpers_dc_dublinCore) {
		this.cfpers_dc_dublinCore = cfpers_dc_dublinCore;
	}
	
	public CfPers getCfpers_dc_person() {
		return this.cfpers_dc_person;
	}
	
	public void setCfpers_dc_person(CfPers cfpers_dc_person) {
		this.cfpers_dc_person = cfpers_dc_person;
	}
	
}