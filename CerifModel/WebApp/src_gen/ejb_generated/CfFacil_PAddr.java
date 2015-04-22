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
@Table(name = "C1_FACILITY_POST_ADDRESS")
public class CfFacil_PAddr implements java.io.Serializable {

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
	@JoinColumn(name="cffacil_paddr_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cffacil_paddr_classification;
	@ManyToOne
	@JoinColumn(name="cffacil_paddr_postAddress", referencedColumnName="ID",  nullable = true)
	private CfPAddr cffacil_paddr_postAddress;
	@ManyToOne
	@JoinColumn(name="cffacil_paddr_facility", referencedColumnName="ID",  nullable = true)
	private CfFacil cffacil_paddr_facility;
	
	public CfFacil_PAddr(){
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
	
	public CfClass getCffacil_paddr_classification() {
		return this.cffacil_paddr_classification;
	}
	
	public void setCffacil_paddr_classification(CfClass cffacil_paddr_classification) {
		this.cffacil_paddr_classification = cffacil_paddr_classification;
	}
	
	public CfPAddr getCffacil_paddr_postAddress() {
		return this.cffacil_paddr_postAddress;
	}
	
	public void setCffacil_paddr_postAddress(CfPAddr cffacil_paddr_postAddress) {
		this.cffacil_paddr_postAddress = cffacil_paddr_postAddress;
	}
	
	public CfFacil getCffacil_paddr_facility() {
		return this.cffacil_paddr_facility;
	}
	
	public void setCffacil_paddr_facility(CfFacil cffacil_paddr_facility) {
		this.cffacil_paddr_facility = cffacil_paddr_facility;
	}
	
}