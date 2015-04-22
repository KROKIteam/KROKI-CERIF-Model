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
@Table(name = "C1_CLASSIFICATION_SCHEME__CLASSIFICATION_SCHEME")
public class CfClassScheme_ClassScheme implements java.io.Serializable {

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
	@JoinColumn(name="cfclassscheme_classscheme_classificationScheme1", referencedColumnName="ID",  nullable = true)
	private CfClassScheme cfclassscheme_classscheme_classificationScheme1;
	@ManyToOne
	@JoinColumn(name="cfclassscheme_classscheme_classificationScheme2", referencedColumnName="ID",  nullable = true)
	private CfClassScheme cfclassscheme_classscheme_classificationScheme2;
	@ManyToOne
	@JoinColumn(name="cfclassscheme_classscheme_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfclassscheme_classscheme_classification;
	
	public CfClassScheme_ClassScheme(){
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
	
	public CfClassScheme getCfclassscheme_classscheme_classificationScheme1() {
		return this.cfclassscheme_classscheme_classificationScheme1;
	}
	
	public void setCfclassscheme_classscheme_classificationScheme1(CfClassScheme cfclassscheme_classscheme_classificationScheme1) {
		this.cfclassscheme_classscheme_classificationScheme1 = cfclassscheme_classscheme_classificationScheme1;
	}
	
	public CfClassScheme getCfclassscheme_classscheme_classificationScheme2() {
		return this.cfclassscheme_classscheme_classificationScheme2;
	}
	
	public void setCfclassscheme_classscheme_classificationScheme2(CfClassScheme cfclassscheme_classscheme_classificationScheme2) {
		this.cfclassscheme_classscheme_classificationScheme2 = cfclassscheme_classscheme_classificationScheme2;
	}
	
	public CfClass getCfclassscheme_classscheme_classification() {
		return this.cfclassscheme_classscheme_classification;
	}
	
	public void setCfclassscheme_classscheme_classification(CfClass cfclassscheme_classscheme_classification) {
		this.cfclassscheme_classscheme_classification = cfclassscheme_classscheme_classification;
	}
	
}