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
@Table(name = "C1_FACILITY")
public class CfFacil implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfFacilId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_facility_identifier;
	@Column(name = "cfAcro", unique = false, nullable = false , length = 16, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_acronym;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_class_facility")
	private Set<CfFacil_Class> cffacil_class_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacildescr_facility")
	private Set<CfFacilDescr> cffacildescr_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_equip_facility")
	private Set<CfFacil_Equip> cffacil_equip_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_event_facility")
	private Set<CfFacil_Event> cffacil_event_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_facil_facility")
	private Set<CfFacil_Facil> cffacil_facil_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_facil_facilitya")
	private Set<CfFacil_Facil> cffacil_facil_facilityaSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_fund_facility")
	private Set<CfFacil_Fund> cffacil_fund_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_indic_facility")
	private Set<CfFacil_Indic> cffacil_indic_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacilkeyw_facility")
	private Set<CfFacilKeyw> cffacilkeyw_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_meas_facility")
	private Set<CfFacil_Meas> cffacil_meas_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_medium_facility")
	private Set<CfFacil_Medium> cffacil_medium_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacilname_facility")
	private Set<CfFacilName> cffacilname_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_paddr_facility")
	private Set<CfFacil_PAddr> cffacil_paddr_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_srv_facility")
	private Set<CfFacil_Srv> cffacil_srv_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_facil_facility")
	private Set<CfOrgUnit_Facil> cforgunit_facil_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_facil_facility")
	private Set<CfPers_Facil> cfpers_facil_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_facil_facility")
	private Set<CfProj_Facil> cfproj_facil_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_facil_facility")
	private Set<CfResPat_Facil> cfrespat_facil_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_facil_facility")
	private Set<CfResProd_Facil> cfresprod_facil_facilitySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_facil_facility")
	private Set<CfResPubl_Facil> cfrespubl_facil_facilitySet;
	
	public CfFacil(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_facility_identifier() {
		return this.a_facility_identifier;
	}
	
	public void setA_facility_identifier(java.lang.String a_facility_identifier) {
		this.a_facility_identifier = a_facility_identifier;
	}
	
	public java.lang.String getA_acronym() {
		return this.a_acronym;
	}
	
	public void setA_acronym(java.lang.String a_acronym) {
		this.a_acronym = a_acronym;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfFacil_Class> getCffacil_class_facilitySet() {
		return this.cffacil_class_facilitySet;
	}
	
	public void setCffacil_class_facilitySet(Set<CfFacil_Class> cffacil_class_facilitySet) {
		this.cffacil_class_facilitySet = cffacil_class_facilitySet;
	}
	
	public Set<CfFacilDescr> getCffacildescr_facilitySet() {
		return this.cffacildescr_facilitySet;
	}
	
	public void setCffacildescr_facilitySet(Set<CfFacilDescr> cffacildescr_facilitySet) {
		this.cffacildescr_facilitySet = cffacildescr_facilitySet;
	}
	
	public Set<CfFacil_Equip> getCffacil_equip_facilitySet() {
		return this.cffacil_equip_facilitySet;
	}
	
	public void setCffacil_equip_facilitySet(Set<CfFacil_Equip> cffacil_equip_facilitySet) {
		this.cffacil_equip_facilitySet = cffacil_equip_facilitySet;
	}
	
	public Set<CfFacil_Event> getCffacil_event_facilitySet() {
		return this.cffacil_event_facilitySet;
	}
	
	public void setCffacil_event_facilitySet(Set<CfFacil_Event> cffacil_event_facilitySet) {
		this.cffacil_event_facilitySet = cffacil_event_facilitySet;
	}
	
	public Set<CfFacil_Facil> getCffacil_facil_facilitySet() {
		return this.cffacil_facil_facilitySet;
	}
	
	public void setCffacil_facil_facilitySet(Set<CfFacil_Facil> cffacil_facil_facilitySet) {
		this.cffacil_facil_facilitySet = cffacil_facil_facilitySet;
	}
	
	public Set<CfFacil_Facil> getCffacil_facil_facilityaSet() {
		return this.cffacil_facil_facilityaSet;
	}
	
	public void setCffacil_facil_facilityaSet(Set<CfFacil_Facil> cffacil_facil_facilityaSet) {
		this.cffacil_facil_facilityaSet = cffacil_facil_facilityaSet;
	}
	
	public Set<CfFacil_Fund> getCffacil_fund_facilitySet() {
		return this.cffacil_fund_facilitySet;
	}
	
	public void setCffacil_fund_facilitySet(Set<CfFacil_Fund> cffacil_fund_facilitySet) {
		this.cffacil_fund_facilitySet = cffacil_fund_facilitySet;
	}
	
	public Set<CfFacil_Indic> getCffacil_indic_facilitySet() {
		return this.cffacil_indic_facilitySet;
	}
	
	public void setCffacil_indic_facilitySet(Set<CfFacil_Indic> cffacil_indic_facilitySet) {
		this.cffacil_indic_facilitySet = cffacil_indic_facilitySet;
	}
	
	public Set<CfFacilKeyw> getCffacilkeyw_facilitySet() {
		return this.cffacilkeyw_facilitySet;
	}
	
	public void setCffacilkeyw_facilitySet(Set<CfFacilKeyw> cffacilkeyw_facilitySet) {
		this.cffacilkeyw_facilitySet = cffacilkeyw_facilitySet;
	}
	
	public Set<CfFacil_Meas> getCffacil_meas_facilitySet() {
		return this.cffacil_meas_facilitySet;
	}
	
	public void setCffacil_meas_facilitySet(Set<CfFacil_Meas> cffacil_meas_facilitySet) {
		this.cffacil_meas_facilitySet = cffacil_meas_facilitySet;
	}
	
	public Set<CfFacil_Medium> getCffacil_medium_facilitySet() {
		return this.cffacil_medium_facilitySet;
	}
	
	public void setCffacil_medium_facilitySet(Set<CfFacil_Medium> cffacil_medium_facilitySet) {
		this.cffacil_medium_facilitySet = cffacil_medium_facilitySet;
	}
	
	public Set<CfFacilName> getCffacilname_facilitySet() {
		return this.cffacilname_facilitySet;
	}
	
	public void setCffacilname_facilitySet(Set<CfFacilName> cffacilname_facilitySet) {
		this.cffacilname_facilitySet = cffacilname_facilitySet;
	}
	
	public Set<CfFacil_PAddr> getCffacil_paddr_facilitySet() {
		return this.cffacil_paddr_facilitySet;
	}
	
	public void setCffacil_paddr_facilitySet(Set<CfFacil_PAddr> cffacil_paddr_facilitySet) {
		this.cffacil_paddr_facilitySet = cffacil_paddr_facilitySet;
	}
	
	public Set<CfFacil_Srv> getCffacil_srv_facilitySet() {
		return this.cffacil_srv_facilitySet;
	}
	
	public void setCffacil_srv_facilitySet(Set<CfFacil_Srv> cffacil_srv_facilitySet) {
		this.cffacil_srv_facilitySet = cffacil_srv_facilitySet;
	}
	
	public Set<CfOrgUnit_Facil> getCforgunit_facil_facilitySet() {
		return this.cforgunit_facil_facilitySet;
	}
	
	public void setCforgunit_facil_facilitySet(Set<CfOrgUnit_Facil> cforgunit_facil_facilitySet) {
		this.cforgunit_facil_facilitySet = cforgunit_facil_facilitySet;
	}
	
	public Set<CfPers_Facil> getCfpers_facil_facilitySet() {
		return this.cfpers_facil_facilitySet;
	}
	
	public void setCfpers_facil_facilitySet(Set<CfPers_Facil> cfpers_facil_facilitySet) {
		this.cfpers_facil_facilitySet = cfpers_facil_facilitySet;
	}
	
	public Set<CfProj_Facil> getCfproj_facil_facilitySet() {
		return this.cfproj_facil_facilitySet;
	}
	
	public void setCfproj_facil_facilitySet(Set<CfProj_Facil> cfproj_facil_facilitySet) {
		this.cfproj_facil_facilitySet = cfproj_facil_facilitySet;
	}
	
	public Set<CfResPat_Facil> getCfrespat_facil_facilitySet() {
		return this.cfrespat_facil_facilitySet;
	}
	
	public void setCfrespat_facil_facilitySet(Set<CfResPat_Facil> cfrespat_facil_facilitySet) {
		this.cfrespat_facil_facilitySet = cfrespat_facil_facilitySet;
	}
	
	public Set<CfResProd_Facil> getCfresprod_facil_facilitySet() {
		return this.cfresprod_facil_facilitySet;
	}
	
	public void setCfresprod_facil_facilitySet(Set<CfResProd_Facil> cfresprod_facil_facilitySet) {
		this.cfresprod_facil_facilitySet = cfresprod_facil_facilitySet;
	}
	
	public Set<CfResPubl_Facil> getCfrespubl_facil_facilitySet() {
		return this.cfrespubl_facil_facilitySet;
	}
	
	public void setCfrespubl_facil_facilitySet(Set<CfResPubl_Facil> cfrespubl_facil_facilitySet) {
		this.cfrespubl_facil_facilitySet = cfrespubl_facil_facilitySet;
	}
	
}