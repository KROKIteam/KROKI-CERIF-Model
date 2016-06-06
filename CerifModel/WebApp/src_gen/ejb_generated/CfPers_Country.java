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
@Table(name = "C1_PERSON_COUNTRY")
public class CfPers_Country implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_country_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfpers_country_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_country_country", referencedColumnName="ID",  nullable = true)
	protected CfCountry cfpers_country_country;
	@ManyToOne
	@JoinColumn(name="cfpers_country_person", referencedColumnName="ID",  nullable = true)
	protected CfPers cfpers_country_person;
	
	public CfPers_Country(){
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