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
@Table(name = "C1_SERVICE")
public class CfSrv implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfSrvId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_service_identifier;
	@Column(name = "cfAcro", unique = false, nullable = false , length = 16, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_acronym;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_srv_service")
	private Set<CfEquip_Srv> cfequip_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_srv_service")
	private Set<CfFacil_Srv> cffacil_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_srv_service")
	private Set<CfOrgUnit_Srv> cforgunit_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_srv_service")
	private Set<CfPers_Srv> cfpers_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_srv_service")
	private Set<CfProj_Srv> cfproj_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_srv_service")
	private Set<CfResPat_Srv> cfrespat_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_srv_service")
	private Set<CfResProd_Srv> cfresprod_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_srv_service")
	private Set<CfResPubl_Srv> cfrespubl_srv_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_srv_service1")
	private Set<CfSrv_Srv> cfsrv_srv_service1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_srv_service2")
	private Set<CfSrv_Srv> cfsrv_srv_service2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_class_service")
	private Set<CfSrv_Class> cfsrv_class_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrvdescr_service")
	private Set<CfSrvDescr> cfsrvdescr_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_event_service")
	private Set<CfSrv_Event> cfsrv_event_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fedid_service")
	private Set<CfSrv_FedId> cfsrv_fedid_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fund_service")
	private Set<CfSrv_Fund> cfsrv_fund_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_indic_service")
	private Set<CfSrv_Indic> cfsrv_indic_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrvkeyw_service")
	private Set<CfSrvKeyw> cfsrvkeyw_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_meas_service")
	private Set<CfSrv_Meas> cfsrv_meas_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_medium_service")
	private Set<CfSrv_Medium> cfsrv_medium_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrvname_service")
	private Set<CfSrvName> cfsrvname_serviceSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_paddr_service")
	private Set<CfSrv_PAddr> cfsrv_paddr_serviceSet;
	
	public CfSrv(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_service_identifier() {
		return this.a_service_identifier;
	}
	
	public void setA_service_identifier(java.lang.String a_service_identifier) {
		this.a_service_identifier = a_service_identifier;
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
	
	public Set<CfEquip_Srv> getCfequip_srv_serviceSet() {
		return this.cfequip_srv_serviceSet;
	}
	
	public void setCfequip_srv_serviceSet(Set<CfEquip_Srv> cfequip_srv_serviceSet) {
		this.cfequip_srv_serviceSet = cfequip_srv_serviceSet;
	}
	
	public Set<CfFacil_Srv> getCffacil_srv_serviceSet() {
		return this.cffacil_srv_serviceSet;
	}
	
	public void setCffacil_srv_serviceSet(Set<CfFacil_Srv> cffacil_srv_serviceSet) {
		this.cffacil_srv_serviceSet = cffacil_srv_serviceSet;
	}
	
	public Set<CfOrgUnit_Srv> getCforgunit_srv_serviceSet() {
		return this.cforgunit_srv_serviceSet;
	}
	
	public void setCforgunit_srv_serviceSet(Set<CfOrgUnit_Srv> cforgunit_srv_serviceSet) {
		this.cforgunit_srv_serviceSet = cforgunit_srv_serviceSet;
	}
	
	public Set<CfPers_Srv> getCfpers_srv_serviceSet() {
		return this.cfpers_srv_serviceSet;
	}
	
	public void setCfpers_srv_serviceSet(Set<CfPers_Srv> cfpers_srv_serviceSet) {
		this.cfpers_srv_serviceSet = cfpers_srv_serviceSet;
	}
	
	public Set<CfProj_Srv> getCfproj_srv_serviceSet() {
		return this.cfproj_srv_serviceSet;
	}
	
	public void setCfproj_srv_serviceSet(Set<CfProj_Srv> cfproj_srv_serviceSet) {
		this.cfproj_srv_serviceSet = cfproj_srv_serviceSet;
	}
	
	public Set<CfResPat_Srv> getCfrespat_srv_serviceSet() {
		return this.cfrespat_srv_serviceSet;
	}
	
	public void setCfrespat_srv_serviceSet(Set<CfResPat_Srv> cfrespat_srv_serviceSet) {
		this.cfrespat_srv_serviceSet = cfrespat_srv_serviceSet;
	}
	
	public Set<CfResProd_Srv> getCfresprod_srv_serviceSet() {
		return this.cfresprod_srv_serviceSet;
	}
	
	public void setCfresprod_srv_serviceSet(Set<CfResProd_Srv> cfresprod_srv_serviceSet) {
		this.cfresprod_srv_serviceSet = cfresprod_srv_serviceSet;
	}
	
	public Set<CfResPubl_Srv> getCfrespubl_srv_serviceSet() {
		return this.cfrespubl_srv_serviceSet;
	}
	
	public void setCfrespubl_srv_serviceSet(Set<CfResPubl_Srv> cfrespubl_srv_serviceSet) {
		this.cfrespubl_srv_serviceSet = cfrespubl_srv_serviceSet;
	}
	
	public Set<CfSrv_Srv> getCfsrv_srv_service1Set() {
		return this.cfsrv_srv_service1Set;
	}
	
	public void setCfsrv_srv_service1Set(Set<CfSrv_Srv> cfsrv_srv_service1Set) {
		this.cfsrv_srv_service1Set = cfsrv_srv_service1Set;
	}
	
	public Set<CfSrv_Srv> getCfsrv_srv_service2Set() {
		return this.cfsrv_srv_service2Set;
	}
	
	public void setCfsrv_srv_service2Set(Set<CfSrv_Srv> cfsrv_srv_service2Set) {
		this.cfsrv_srv_service2Set = cfsrv_srv_service2Set;
	}
	
	public Set<CfSrv_Class> getCfsrv_class_serviceSet() {
		return this.cfsrv_class_serviceSet;
	}
	
	public void setCfsrv_class_serviceSet(Set<CfSrv_Class> cfsrv_class_serviceSet) {
		this.cfsrv_class_serviceSet = cfsrv_class_serviceSet;
	}
	
	public Set<CfSrvDescr> getCfsrvdescr_serviceSet() {
		return this.cfsrvdescr_serviceSet;
	}
	
	public void setCfsrvdescr_serviceSet(Set<CfSrvDescr> cfsrvdescr_serviceSet) {
		this.cfsrvdescr_serviceSet = cfsrvdescr_serviceSet;
	}
	
	public Set<CfSrv_Event> getCfsrv_event_serviceSet() {
		return this.cfsrv_event_serviceSet;
	}
	
	public void setCfsrv_event_serviceSet(Set<CfSrv_Event> cfsrv_event_serviceSet) {
		this.cfsrv_event_serviceSet = cfsrv_event_serviceSet;
	}
	
	public Set<CfSrv_FedId> getCfsrv_fedid_serviceSet() {
		return this.cfsrv_fedid_serviceSet;
	}
	
	public void setCfsrv_fedid_serviceSet(Set<CfSrv_FedId> cfsrv_fedid_serviceSet) {
		this.cfsrv_fedid_serviceSet = cfsrv_fedid_serviceSet;
	}
	
	public Set<CfSrv_Fund> getCfsrv_fund_serviceSet() {
		return this.cfsrv_fund_serviceSet;
	}
	
	public void setCfsrv_fund_serviceSet(Set<CfSrv_Fund> cfsrv_fund_serviceSet) {
		this.cfsrv_fund_serviceSet = cfsrv_fund_serviceSet;
	}
	
	public Set<CfSrv_Indic> getCfsrv_indic_serviceSet() {
		return this.cfsrv_indic_serviceSet;
	}
	
	public void setCfsrv_indic_serviceSet(Set<CfSrv_Indic> cfsrv_indic_serviceSet) {
		this.cfsrv_indic_serviceSet = cfsrv_indic_serviceSet;
	}
	
	public Set<CfSrvKeyw> getCfsrvkeyw_serviceSet() {
		return this.cfsrvkeyw_serviceSet;
	}
	
	public void setCfsrvkeyw_serviceSet(Set<CfSrvKeyw> cfsrvkeyw_serviceSet) {
		this.cfsrvkeyw_serviceSet = cfsrvkeyw_serviceSet;
	}
	
	public Set<CfSrv_Meas> getCfsrv_meas_serviceSet() {
		return this.cfsrv_meas_serviceSet;
	}
	
	public void setCfsrv_meas_serviceSet(Set<CfSrv_Meas> cfsrv_meas_serviceSet) {
		this.cfsrv_meas_serviceSet = cfsrv_meas_serviceSet;
	}
	
	public Set<CfSrv_Medium> getCfsrv_medium_serviceSet() {
		return this.cfsrv_medium_serviceSet;
	}
	
	public void setCfsrv_medium_serviceSet(Set<CfSrv_Medium> cfsrv_medium_serviceSet) {
		this.cfsrv_medium_serviceSet = cfsrv_medium_serviceSet;
	}
	
	public Set<CfSrvName> getCfsrvname_serviceSet() {
		return this.cfsrvname_serviceSet;
	}
	
	public void setCfsrvname_serviceSet(Set<CfSrvName> cfsrvname_serviceSet) {
		this.cfsrvname_serviceSet = cfsrvname_serviceSet;
	}
	
	public Set<CfSrv_PAddr> getCfsrv_paddr_serviceSet() {
		return this.cfsrv_paddr_serviceSet;
	}
	
	public void setCfsrv_paddr_serviceSet(Set<CfSrv_PAddr> cfsrv_paddr_serviceSet) {
		this.cfsrv_paddr_serviceSet = cfsrv_paddr_serviceSet;
	}
	
}