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
   Creation date: 31.03.2015  10:28:05h
   **/

@Entity
@Table(name = "CM_FACILITY_EQUIPMENT")
public class CfFacil_Equip implements java.io.Serializable {

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
	@JoinColumn(name="cffacil_equip_equipment", referencedColumnName="ID",  nullable = true)
	private CfEquip cffacil_equip_equipment;
	@ManyToOne
	@JoinColumn(name="cffacil_equip_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cffacil_equip_classification;
	@ManyToOne
	@JoinColumn(name="cffacil_equip_facility", referencedColumnName="ID",  nullable = true)
	private CfFacil cffacil_equip_facility;
	
	public CfFacil_Equip(){
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
	
	public CfEquip getCffacil_equip_equipment() {
		return this.cffacil_equip_equipment;
	}
	
	public void setCffacil_equip_equipment(CfEquip cffacil_equip_equipment) {
		this.cffacil_equip_equipment = cffacil_equip_equipment;
	}
	
	public CfClass getCffacil_equip_classification() {
		return this.cffacil_equip_classification;
	}
	
	public void setCffacil_equip_classification(CfClass cffacil_equip_classification) {
		this.cffacil_equip_classification = cffacil_equip_classification;
	}
	
	public CfFacil getCffacil_equip_facility() {
		return this.cffacil_equip_facility;
	}
	
	public void setCffacil_equip_facility(CfFacil cffacil_equip_facility) {
		this.cffacil_equip_facility = cffacil_equip_facility;
	}
	
}