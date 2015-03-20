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
@Table(name = "CM_INDICATOR")
public class CfIndic implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfIndicId", unique = false, nullable = false )
	private java.lang.String a_indicator_identifier;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_indic_indicator")
	private Set<CfEquip_Indic> cfequip_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_indic_indicator")
	private Set<CfEvent_Indic> cfevent_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_indic_indicator")
	private Set<CfFacil_Indic> cffacil_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_indic_indicator")
	private Set<CfFund_Indic> cffund_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_indic_indicator1")
	private Set<CfIndic_Indic> cfindic_indic_indicator1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_indic_indicator2")
	private Set<CfIndic_Indic> cfindic_indic_indicator2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_class_indicator")
	private Set<CfIndic_Class> cfindic_class_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindicdescr_indicator")
	private Set<CfIndicDescr> cfindicdescr_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindickeyw_indicator")
	private Set<CfIndicKeyw> cfindickeyw_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_meas_indicator")
	private Set<CfIndic_Meas> cfindic_meas_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindicname_indicator")
	private Set<CfIndicName> cfindicname_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_indic_indicator")
	private Set<CfMedium_Indic> cfmedium_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_indic_indicator")
	private Set<CfOrgUnit_Indic> cforgunit_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_indic_indicator")
	private Set<CfPers_Indic> cfpers_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_indic_indicator")
	private Set<CfProj_Indic> cfproj_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_indic_indicator")
	private Set<CfResPat_Indic> cfrespat_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_indic_indicator")
	private Set<CfResProd_Indic> cfresprod_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_indic_indicator")
	private Set<CfResPubl_Indic> cfrespubl_indic_indicatorSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_indic_indicator")
	private Set<CfSrv_Indic> cfsrv_indic_indicatorSet;
	
	public CfIndic(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_indicator_identifier() {
		return this.a_indicator_identifier;
	}
	
	public void setA_indicator_identifier(java.lang.String a_indicator_identifier) {
		this.a_indicator_identifier = a_indicator_identifier;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfEquip_Indic> getCfequip_indic_indicatorSet() {
		return this.cfequip_indic_indicatorSet;
	}
	
	public void setCfequip_indic_indicatorSet(Set<CfEquip_Indic> cfequip_indic_indicatorSet) {
		this.cfequip_indic_indicatorSet = cfequip_indic_indicatorSet;
	}
	
	public Set<CfEvent_Indic> getCfevent_indic_indicatorSet() {
		return this.cfevent_indic_indicatorSet;
	}
	
	public void setCfevent_indic_indicatorSet(Set<CfEvent_Indic> cfevent_indic_indicatorSet) {
		this.cfevent_indic_indicatorSet = cfevent_indic_indicatorSet;
	}
	
	public Set<CfFacil_Indic> getCffacil_indic_indicatorSet() {
		return this.cffacil_indic_indicatorSet;
	}
	
	public void setCffacil_indic_indicatorSet(Set<CfFacil_Indic> cffacil_indic_indicatorSet) {
		this.cffacil_indic_indicatorSet = cffacil_indic_indicatorSet;
	}
	
	public Set<CfFund_Indic> getCffund_indic_indicatorSet() {
		return this.cffund_indic_indicatorSet;
	}
	
	public void setCffund_indic_indicatorSet(Set<CfFund_Indic> cffund_indic_indicatorSet) {
		this.cffund_indic_indicatorSet = cffund_indic_indicatorSet;
	}
	
	public Set<CfIndic_Indic> getCfindic_indic_indicator1Set() {
		return this.cfindic_indic_indicator1Set;
	}
	
	public void setCfindic_indic_indicator1Set(Set<CfIndic_Indic> cfindic_indic_indicator1Set) {
		this.cfindic_indic_indicator1Set = cfindic_indic_indicator1Set;
	}
	
	public Set<CfIndic_Indic> getCfindic_indic_indicator2Set() {
		return this.cfindic_indic_indicator2Set;
	}
	
	public void setCfindic_indic_indicator2Set(Set<CfIndic_Indic> cfindic_indic_indicator2Set) {
		this.cfindic_indic_indicator2Set = cfindic_indic_indicator2Set;
	}
	
	public Set<CfIndic_Class> getCfindic_class_indicatorSet() {
		return this.cfindic_class_indicatorSet;
	}
	
	public void setCfindic_class_indicatorSet(Set<CfIndic_Class> cfindic_class_indicatorSet) {
		this.cfindic_class_indicatorSet = cfindic_class_indicatorSet;
	}
	
	public Set<CfIndicDescr> getCfindicdescr_indicatorSet() {
		return this.cfindicdescr_indicatorSet;
	}
	
	public void setCfindicdescr_indicatorSet(Set<CfIndicDescr> cfindicdescr_indicatorSet) {
		this.cfindicdescr_indicatorSet = cfindicdescr_indicatorSet;
	}
	
	public Set<CfIndicKeyw> getCfindickeyw_indicatorSet() {
		return this.cfindickeyw_indicatorSet;
	}
	
	public void setCfindickeyw_indicatorSet(Set<CfIndicKeyw> cfindickeyw_indicatorSet) {
		this.cfindickeyw_indicatorSet = cfindickeyw_indicatorSet;
	}
	
	public Set<CfIndic_Meas> getCfindic_meas_indicatorSet() {
		return this.cfindic_meas_indicatorSet;
	}
	
	public void setCfindic_meas_indicatorSet(Set<CfIndic_Meas> cfindic_meas_indicatorSet) {
		this.cfindic_meas_indicatorSet = cfindic_meas_indicatorSet;
	}
	
	public Set<CfIndicName> getCfindicname_indicatorSet() {
		return this.cfindicname_indicatorSet;
	}
	
	public void setCfindicname_indicatorSet(Set<CfIndicName> cfindicname_indicatorSet) {
		this.cfindicname_indicatorSet = cfindicname_indicatorSet;
	}
	
	public Set<CfMedium_Indic> getCfmedium_indic_indicatorSet() {
		return this.cfmedium_indic_indicatorSet;
	}
	
	public void setCfmedium_indic_indicatorSet(Set<CfMedium_Indic> cfmedium_indic_indicatorSet) {
		this.cfmedium_indic_indicatorSet = cfmedium_indic_indicatorSet;
	}
	
	public Set<CfOrgUnit_Indic> getCforgunit_indic_indicatorSet() {
		return this.cforgunit_indic_indicatorSet;
	}
	
	public void setCforgunit_indic_indicatorSet(Set<CfOrgUnit_Indic> cforgunit_indic_indicatorSet) {
		this.cforgunit_indic_indicatorSet = cforgunit_indic_indicatorSet;
	}
	
	public Set<CfPers_Indic> getCfpers_indic_indicatorSet() {
		return this.cfpers_indic_indicatorSet;
	}
	
	public void setCfpers_indic_indicatorSet(Set<CfPers_Indic> cfpers_indic_indicatorSet) {
		this.cfpers_indic_indicatorSet = cfpers_indic_indicatorSet;
	}
	
	public Set<CfProj_Indic> getCfproj_indic_indicatorSet() {
		return this.cfproj_indic_indicatorSet;
	}
	
	public void setCfproj_indic_indicatorSet(Set<CfProj_Indic> cfproj_indic_indicatorSet) {
		this.cfproj_indic_indicatorSet = cfproj_indic_indicatorSet;
	}
	
	public Set<CfResPat_Indic> getCfrespat_indic_indicatorSet() {
		return this.cfrespat_indic_indicatorSet;
	}
	
	public void setCfrespat_indic_indicatorSet(Set<CfResPat_Indic> cfrespat_indic_indicatorSet) {
		this.cfrespat_indic_indicatorSet = cfrespat_indic_indicatorSet;
	}
	
	public Set<CfResProd_Indic> getCfresprod_indic_indicatorSet() {
		return this.cfresprod_indic_indicatorSet;
	}
	
	public void setCfresprod_indic_indicatorSet(Set<CfResProd_Indic> cfresprod_indic_indicatorSet) {
		this.cfresprod_indic_indicatorSet = cfresprod_indic_indicatorSet;
	}
	
	public Set<CfResPubl_Indic> getCfrespubl_indic_indicatorSet() {
		return this.cfrespubl_indic_indicatorSet;
	}
	
	public void setCfrespubl_indic_indicatorSet(Set<CfResPubl_Indic> cfrespubl_indic_indicatorSet) {
		this.cfrespubl_indic_indicatorSet = cfrespubl_indic_indicatorSet;
	}
	
	public Set<CfSrv_Indic> getCfsrv_indic_indicatorSet() {
		return this.cfsrv_indic_indicatorSet;
	}
	
	public void setCfsrv_indic_indicatorSet(Set<CfSrv_Indic> cfsrv_indic_indicatorSet) {
		this.cfsrv_indic_indicatorSet = cfsrv_indic_indicatorSet;
	}
	
}