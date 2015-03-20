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
@Table(name = "CM_PERSON_QUALIFICATION")
public class CfPers_Qual implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_qual_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_qual_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_qual_qualification", referencedColumnName="ID",  nullable = true)
	private CfQual cfpers_qual_qualification;
	@ManyToOne
	@JoinColumn(name="cfpers_qual_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_qual_person;
	
	public CfPers_Qual(){
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
	
	public CfClass getCfpers_qual_classification() {
		return this.cfpers_qual_classification;
	}
	
	public void setCfpers_qual_classification(CfClass cfpers_qual_classification) {
		this.cfpers_qual_classification = cfpers_qual_classification;
	}
	
	public CfQual getCfpers_qual_qualification() {
		return this.cfpers_qual_qualification;
	}
	
	public void setCfpers_qual_qualification(CfQual cfpers_qual_qualification) {
		this.cfpers_qual_qualification = cfpers_qual_qualification;
	}
	
	public CfPers getCfpers_qual_person() {
		return this.cfpers_qual_person;
	}
	
	public void setCfpers_qual_person(CfPers cfpers_qual_person) {
		this.cfpers_qual_person = cfpers_qual_person;
	}
	
}