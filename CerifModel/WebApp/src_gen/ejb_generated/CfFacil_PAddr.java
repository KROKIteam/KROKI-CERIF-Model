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
@Table(name = "C1_FACILITY_POST_ADDRESS")
public class CfFacil_PAddr implements java.io.Serializable {

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
	@JoinColumn(name="cffacil_paddr_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cffacil_paddr_classification;
	@ManyToOne
	@JoinColumn(name="cffacil_paddr_postAddress", referencedColumnName="ID",  nullable = true)
	protected CfPAddr cffacil_paddr_postAddress;
	@ManyToOne
	@JoinColumn(name="cffacil_paddr_facility", referencedColumnName="ID",  nullable = true)
	protected CfFacil cffacil_paddr_facility;
	
	public CfFacil_PAddr(){
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