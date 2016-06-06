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
@Table(name = "C1_FACILITY_EQUIPMENT")
public class CfFacil_Equip implements java.io.Serializable {

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
	@JoinColumn(name="cffacil_equip_equipment", referencedColumnName="ID",  nullable = true)
	protected CfEquip cffacil_equip_equipment;
	@ManyToOne
	@JoinColumn(name="cffacil_equip_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cffacil_equip_classification;
	@ManyToOne
	@JoinColumn(name="cffacil_equip_facility", referencedColumnName="ID",  nullable = true)
	protected CfFacil cffacil_equip_facility;
	
	public CfFacil_Equip(){
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