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
@Table(name = "C1_RESULT_PUBLICATION_MEDIUM")
public class CfResPubl_Medium implements java.io.Serializable {

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
	@JoinColumn(name="cfrespubl_medium_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfrespubl_medium_classification;
	@ManyToOne
	@JoinColumn(name="cfrespubl_medium_medium", referencedColumnName="ID",  nullable = true)
	private CfMedium cfrespubl_medium_medium;
	@ManyToOne
	@JoinColumn(name="cfrespubl_medium_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespubl_medium_resultPublication;
	
	public CfResPubl_Medium(){
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
	
	public CfClass getCfrespubl_medium_classification() {
		return this.cfrespubl_medium_classification;
	}
	
	public void setCfrespubl_medium_classification(CfClass cfrespubl_medium_classification) {
		this.cfrespubl_medium_classification = cfrespubl_medium_classification;
	}
	
	public CfMedium getCfrespubl_medium_medium() {
		return this.cfrespubl_medium_medium;
	}
	
	public void setCfrespubl_medium_medium(CfMedium cfrespubl_medium_medium) {
		this.cfrespubl_medium_medium = cfrespubl_medium_medium;
	}
	
	public CfResPubl getCfrespubl_medium_resultPublication() {
		return this.cfrespubl_medium_resultPublication;
	}
	
	public void setCfrespubl_medium_resultPublication(CfResPubl cfrespubl_medium_resultPublication) {
		this.cfrespubl_medium_resultPublication = cfrespubl_medium_resultPublication;
	}
	
}