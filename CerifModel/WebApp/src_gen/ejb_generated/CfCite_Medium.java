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
@Table(name = "C1_CITATION_MEDIUM")
public class CfCite_Medium implements java.io.Serializable {

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
	@JoinColumn(name="cfcite_medium_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfcite_medium_classification;
	@ManyToOne
	@JoinColumn(name="cfcite_medium_medium", referencedColumnName="ID",  nullable = true)
	private CfMedium cfcite_medium_medium;
	@ManyToOne
	@JoinColumn(name="cfcite_medium_citation", referencedColumnName="ID",  nullable = true)
	private CfCite cfcite_medium_citation;
	
	public CfCite_Medium(){
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
	
	public CfClass getCfcite_medium_classification() {
		return this.cfcite_medium_classification;
	}
	
	public void setCfcite_medium_classification(CfClass cfcite_medium_classification) {
		this.cfcite_medium_classification = cfcite_medium_classification;
	}
	
	public CfMedium getCfcite_medium_medium() {
		return this.cfcite_medium_medium;
	}
	
	public void setCfcite_medium_medium(CfMedium cfcite_medium_medium) {
		this.cfcite_medium_medium = cfcite_medium_medium;
	}
	
	public CfCite getCfcite_medium_citation() {
		return this.cfcite_medium_citation;
	}
	
	public void setCfcite_medium_citation(CfCite cfcite_medium_citation) {
		this.cfcite_medium_citation = cfcite_medium_citation;
	}
	
}