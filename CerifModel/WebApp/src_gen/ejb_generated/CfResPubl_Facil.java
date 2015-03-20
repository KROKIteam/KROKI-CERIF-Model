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
@Table(name = "CM_RESULT_PUBLICATION_FACILITY")
public class CfResPubl_Facil implements java.io.Serializable {

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
	@JoinColumn(name="cfrespubl_facil_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfrespubl_facil_classification;
	@ManyToOne
	@JoinColumn(name="cfrespubl_facil_facility", referencedColumnName="ID",  nullable = true)
	private CfFacil cfrespubl_facil_facility;
	@ManyToOne
	@JoinColumn(name="cfrespubl_facil_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespubl_facil_resultPublication;
	
	public CfResPubl_Facil(){
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
	
	public CfClass getCfrespubl_facil_classification() {
		return this.cfrespubl_facil_classification;
	}
	
	public void setCfrespubl_facil_classification(CfClass cfrespubl_facil_classification) {
		this.cfrespubl_facil_classification = cfrespubl_facil_classification;
	}
	
	public CfFacil getCfrespubl_facil_facility() {
		return this.cfrespubl_facil_facility;
	}
	
	public void setCfrespubl_facil_facility(CfFacil cfrespubl_facil_facility) {
		this.cfrespubl_facil_facility = cfrespubl_facil_facility;
	}
	
	public CfResPubl getCfrespubl_facil_resultPublication() {
		return this.cfrespubl_facil_resultPublication;
	}
	
	public void setCfrespubl_facil_resultPublication(CfResPubl cfrespubl_facil_resultPublication) {
		this.cfrespubl_facil_resultPublication = cfrespubl_facil_resultPublication;
	}
	
}