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
@Table(name = "C1_EQUIPMENT")
public class CfEquip implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfEquipId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_equipment_identifier;
	@Column(name = "cfAcro", unique = false, nullable = false , length = 16, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_acronym;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_class_equipment")
	protected Set<CfEquip_Class> cfequip_class_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequipdescr_equipment")
	protected Set<CfEquipDescr> cfequipdescr_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_equip_equipment")
	protected Set<CfEquip_Equip> cfequip_equip_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_equip_equipmenta")
	protected Set<CfEquip_Equip> cfequip_equip_equipmentaSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_event_equipment")
	protected Set<CfEquip_Event> cfequip_event_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_fund_equipment")
	protected Set<CfEquip_Fund> cfequip_fund_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_indic_equipment")
	protected Set<CfEquip_Indic> cfequip_indic_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequipkeyw_equipment")
	protected Set<CfEquipKeyw> cfequipkeyw_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_meas_equipment")
	protected Set<CfEquip_Meas> cfequip_meas_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_medium_equipment")
	protected Set<CfEquip_Medium> cfequip_medium_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequipname_equipment")
	protected Set<CfEquipName> cfequipname_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_paddr_equipment")
	protected Set<CfEquip_PAddr> cfequip_paddr_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_srv_equipment")
	protected Set<CfEquip_Srv> cfequip_srv_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_equip_equipment")
	protected Set<CfFacil_Equip> cffacil_equip_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_equip_equipment")
	protected Set<CfOrgUnit_Equip> cforgunit_equip_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_equip_equipment")
	protected Set<CfPers_Equip> cfpers_equip_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_equip_equipment")
	protected Set<CfProj_Equip> cfproj_equip_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_equip_equipment")
	protected Set<CfResPat_Equip> cfrespat_equip_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_equip_equipment")
	protected Set<CfResProd_Equip> cfresprod_equip_equipmentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_equip_equipment")
	protected Set<CfResPubl_Equip> cfrespubl_equip_equipmentSet;
	
	public CfEquip(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_equipment_identifier() {
		return this.ka_equipment_identifier;
	}
	
	public void setKa_equipment_identifier(java.lang.String ka_equipment_identifier) {
		this.ka_equipment_identifier = ka_equipment_identifier;
	}
	
	public java.lang.String getKa_acronym() {
		return this.ka_acronym;
	}
	
	public void setKa_acronym(java.lang.String ka_acronym) {
		this.ka_acronym = ka_acronym;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public Set<CfEquip_Class> getCfequip_class_equipmentSet() {
		return this.cfequip_class_equipmentSet;
	}
	
	public void setCfequip_class_equipmentSet(Set<CfEquip_Class> cfequip_class_equipmentSet) {
		this.cfequip_class_equipmentSet = cfequip_class_equipmentSet;
	}
	
	public Set<CfEquipDescr> getCfequipdescr_equipmentSet() {
		return this.cfequipdescr_equipmentSet;
	}
	
	public void setCfequipdescr_equipmentSet(Set<CfEquipDescr> cfequipdescr_equipmentSet) {
		this.cfequipdescr_equipmentSet = cfequipdescr_equipmentSet;
	}
	
	public Set<CfEquip_Equip> getCfequip_equip_equipmentSet() {
		return this.cfequip_equip_equipmentSet;
	}
	
	public void setCfequip_equip_equipmentSet(Set<CfEquip_Equip> cfequip_equip_equipmentSet) {
		this.cfequip_equip_equipmentSet = cfequip_equip_equipmentSet;
	}
	
	public Set<CfEquip_Equip> getCfequip_equip_equipmentaSet() {
		return this.cfequip_equip_equipmentaSet;
	}
	
	public void setCfequip_equip_equipmentaSet(Set<CfEquip_Equip> cfequip_equip_equipmentaSet) {
		this.cfequip_equip_equipmentaSet = cfequip_equip_equipmentaSet;
	}
	
	public Set<CfEquip_Event> getCfequip_event_equipmentSet() {
		return this.cfequip_event_equipmentSet;
	}
	
	public void setCfequip_event_equipmentSet(Set<CfEquip_Event> cfequip_event_equipmentSet) {
		this.cfequip_event_equipmentSet = cfequip_event_equipmentSet;
	}
	
	public Set<CfEquip_Fund> getCfequip_fund_equipmentSet() {
		return this.cfequip_fund_equipmentSet;
	}
	
	public void setCfequip_fund_equipmentSet(Set<CfEquip_Fund> cfequip_fund_equipmentSet) {
		this.cfequip_fund_equipmentSet = cfequip_fund_equipmentSet;
	}
	
	public Set<CfEquip_Indic> getCfequip_indic_equipmentSet() {
		return this.cfequip_indic_equipmentSet;
	}
	
	public void setCfequip_indic_equipmentSet(Set<CfEquip_Indic> cfequip_indic_equipmentSet) {
		this.cfequip_indic_equipmentSet = cfequip_indic_equipmentSet;
	}
	
	public Set<CfEquipKeyw> getCfequipkeyw_equipmentSet() {
		return this.cfequipkeyw_equipmentSet;
	}
	
	public void setCfequipkeyw_equipmentSet(Set<CfEquipKeyw> cfequipkeyw_equipmentSet) {
		this.cfequipkeyw_equipmentSet = cfequipkeyw_equipmentSet;
	}
	
	public Set<CfEquip_Meas> getCfequip_meas_equipmentSet() {
		return this.cfequip_meas_equipmentSet;
	}
	
	public void setCfequip_meas_equipmentSet(Set<CfEquip_Meas> cfequip_meas_equipmentSet) {
		this.cfequip_meas_equipmentSet = cfequip_meas_equipmentSet;
	}
	
	public Set<CfEquip_Medium> getCfequip_medium_equipmentSet() {
		return this.cfequip_medium_equipmentSet;
	}
	
	public void setCfequip_medium_equipmentSet(Set<CfEquip_Medium> cfequip_medium_equipmentSet) {
		this.cfequip_medium_equipmentSet = cfequip_medium_equipmentSet;
	}
	
	public Set<CfEquipName> getCfequipname_equipmentSet() {
		return this.cfequipname_equipmentSet;
	}
	
	public void setCfequipname_equipmentSet(Set<CfEquipName> cfequipname_equipmentSet) {
		this.cfequipname_equipmentSet = cfequipname_equipmentSet;
	}
	
	public Set<CfEquip_PAddr> getCfequip_paddr_equipmentSet() {
		return this.cfequip_paddr_equipmentSet;
	}
	
	public void setCfequip_paddr_equipmentSet(Set<CfEquip_PAddr> cfequip_paddr_equipmentSet) {
		this.cfequip_paddr_equipmentSet = cfequip_paddr_equipmentSet;
	}
	
	public Set<CfEquip_Srv> getCfequip_srv_equipmentSet() {
		return this.cfequip_srv_equipmentSet;
	}
	
	public void setCfequip_srv_equipmentSet(Set<CfEquip_Srv> cfequip_srv_equipmentSet) {
		this.cfequip_srv_equipmentSet = cfequip_srv_equipmentSet;
	}
	
	public Set<CfFacil_Equip> getCffacil_equip_equipmentSet() {
		return this.cffacil_equip_equipmentSet;
	}
	
	public void setCffacil_equip_equipmentSet(Set<CfFacil_Equip> cffacil_equip_equipmentSet) {
		this.cffacil_equip_equipmentSet = cffacil_equip_equipmentSet;
	}
	
	public Set<CfOrgUnit_Equip> getCforgunit_equip_equipmentSet() {
		return this.cforgunit_equip_equipmentSet;
	}
	
	public void setCforgunit_equip_equipmentSet(Set<CfOrgUnit_Equip> cforgunit_equip_equipmentSet) {
		this.cforgunit_equip_equipmentSet = cforgunit_equip_equipmentSet;
	}
	
	public Set<CfPers_Equip> getCfpers_equip_equipmentSet() {
		return this.cfpers_equip_equipmentSet;
	}
	
	public void setCfpers_equip_equipmentSet(Set<CfPers_Equip> cfpers_equip_equipmentSet) {
		this.cfpers_equip_equipmentSet = cfpers_equip_equipmentSet;
	}
	
	public Set<CfProj_Equip> getCfproj_equip_equipmentSet() {
		return this.cfproj_equip_equipmentSet;
	}
	
	public void setCfproj_equip_equipmentSet(Set<CfProj_Equip> cfproj_equip_equipmentSet) {
		this.cfproj_equip_equipmentSet = cfproj_equip_equipmentSet;
	}
	
	public Set<CfResPat_Equip> getCfrespat_equip_equipmentSet() {
		return this.cfrespat_equip_equipmentSet;
	}
	
	public void setCfrespat_equip_equipmentSet(Set<CfResPat_Equip> cfrespat_equip_equipmentSet) {
		this.cfrespat_equip_equipmentSet = cfrespat_equip_equipmentSet;
	}
	
	public Set<CfResProd_Equip> getCfresprod_equip_equipmentSet() {
		return this.cfresprod_equip_equipmentSet;
	}
	
	public void setCfresprod_equip_equipmentSet(Set<CfResProd_Equip> cfresprod_equip_equipmentSet) {
		this.cfresprod_equip_equipmentSet = cfresprod_equip_equipmentSet;
	}
	
	public Set<CfResPubl_Equip> getCfrespubl_equip_equipmentSet() {
		return this.cfrespubl_equip_equipmentSet;
	}
	
	public void setCfrespubl_equip_equipmentSet(Set<CfResPubl_Equip> cfrespubl_equip_equipmentSet) {
		this.cfrespubl_equip_equipmentSet = cfrespubl_equip_equipmentSet;
	}
	
}