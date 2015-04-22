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
@Table(name = "C1_CLASSIFICATION__CLASSIFICATION")
public class CfClass_Class implements java.io.Serializable {

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
	@JoinColumn(name="cfclass_class_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfclass_class_classification;
	@ManyToOne
	@JoinColumn(name="cfclass_class_classification1", referencedColumnName="ID",  nullable = true)
	private CfClass cfclass_class_classification1;
	@ManyToOne
	@JoinColumn(name="cfclass_class_classification2", referencedColumnName="ID",  nullable = true)
	private CfClass cfclass_class_classification2;
	
	public CfClass_Class(){
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
	
	public CfClass getCfclass_class_classification() {
		return this.cfclass_class_classification;
	}
	
	public void setCfclass_class_classification(CfClass cfclass_class_classification) {
		this.cfclass_class_classification = cfclass_class_classification;
	}
	
	public CfClass getCfclass_class_classification1() {
		return this.cfclass_class_classification1;
	}
	
	public void setCfclass_class_classification1(CfClass cfclass_class_classification1) {
		this.cfclass_class_classification1 = cfclass_class_classification1;
	}
	
	public CfClass getCfclass_class_classification2() {
		return this.cfclass_class_classification2;
	}
	
	public void setCfclass_class_classification2(CfClass cfclass_class_classification2) {
		this.cfclass_class_classification2 = cfclass_class_classification2;
	}
	
}