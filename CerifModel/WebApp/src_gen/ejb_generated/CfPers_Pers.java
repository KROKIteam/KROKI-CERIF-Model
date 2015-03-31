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
@Table(name = "CM_PERSON_PERSON")
public class CfPers_Pers implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_pers_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_pers_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_pers_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_pers_person;
	@ManyToOne
	@JoinColumn(name="cfpers_pers_persona", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_pers_persona;
	
	public CfPers_Pers(){
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
	
	public CfClass getCfpers_pers_classification() {
		return this.cfpers_pers_classification;
	}
	
	public void setCfpers_pers_classification(CfClass cfpers_pers_classification) {
		this.cfpers_pers_classification = cfpers_pers_classification;
	}
	
	public CfPers getCfpers_pers_person() {
		return this.cfpers_pers_person;
	}
	
	public void setCfpers_pers_person(CfPers cfpers_pers_person) {
		this.cfpers_pers_person = cfpers_pers_person;
	}
	
	public CfPers getCfpers_pers_persona() {
		return this.cfpers_pers_persona;
	}
	
	public void setCfpers_pers_persona(CfPers cfpers_pers_persona) {
		this.cfpers_pers_persona = cfpers_pers_persona;
	}
	
}