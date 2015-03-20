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
@Table(name = "CM_PERSON_COUNTRY")
public class CfPers_Country implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_country_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_country_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_country_country", referencedColumnName="ID",  nullable = true)
	private CfCountry cfpers_country_country;
	@ManyToOne
	@JoinColumn(name="cfpers_country_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_country_person;
	
	public CfPers_Country(){
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
	
	public CfClass getCfpers_country_classification() {
		return this.cfpers_country_classification;
	}
	
	public void setCfpers_country_classification(CfClass cfpers_country_classification) {
		this.cfpers_country_classification = cfpers_country_classification;
	}
	
	public CfCountry getCfpers_country_country() {
		return this.cfpers_country_country;
	}
	
	public void setCfpers_country_country(CfCountry cfpers_country_country) {
		this.cfpers_country_country = cfpers_country_country;
	}
	
	public CfPers getCfpers_country_person() {
		return this.cfpers_country_person;
	}
	
	public void setCfpers_country_person(CfPers cfpers_country_person) {
		this.cfpers_country_person = cfpers_country_person;
	}
	
}