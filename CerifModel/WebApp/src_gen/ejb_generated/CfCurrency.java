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
@Table(name = "CM_CURRENCY")
public class CfCurrency implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfCurrCode", unique = false, nullable = false )
	private java.lang.String a_currency_code;
	@Column(name = "cfNumCurrCode", unique = false, nullable = false )
	private java.lang.String a_numeric_currency_code;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcurrency_class_currency")
	private Set<CfCurrency_Class> cfcurrency_class_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcurrencyentname_currency")
	private Set<CfCurrencyEntName> cfcurrencyentname_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcurrencyname_currency")
	private Set<CfCurrencyName> cfcurrencyname_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_fund_currency")
	private Set<CfEquip_Fund> cfequip_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_fund_currency")
	private Set<CfEvent_Fund> cfevent_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_fund_currency")
	private Set<CfFacil_Fund> cffacil_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_currency")
	private Set<CfFund> cffund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_indic_currency")
	private Set<CfFund_Indic> cffund_indic_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_meas_currency")
	private Set<CfFund_Meas> cffund_meas_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_fund_currency")
	private Set<CfMedium_Fund> cfmedium_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_currency")
	private Set<CfOrgUnit> cforgunit_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_equip_currency")
	private Set<CfOrgUnit_Equip> cforgunit_equip_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_expskills_currency")
	private Set<CfOrgUnit_ExpSkills> cforgunit_expskills_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_facil_currency")
	private Set<CfOrgUnit_Facil> cforgunit_facil_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_fund_currency")
	private Set<CfOrgUnit_Fund> cforgunit_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_resprod_currency")
	private Set<CfOrgUnit_ResProd> cforgunit_resprod_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_srv_currency")
	private Set<CfOrgUnit_Srv> cforgunit_srv_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_equip_currency")
	private Set<CfPers_Equip> cfpers_equip_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_expskills_currency")
	private Set<CfPers_ExpSkills> cfpers_expskills_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_facil_currency")
	private Set<CfPers_Facil> cfpers_facil_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_fund_currency")
	private Set<CfPers_Fund> cfpers_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_resprod_currency")
	private Set<CfPers_ResProd> cfpers_resprod_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_srv_currency")
	private Set<CfPers_Srv> cfpers_srv_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_equip_currency")
	private Set<CfProj_Equip> cfproj_equip_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_facil_currency")
	private Set<CfProj_Facil> cfproj_facil_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_fund_currency")
	private Set<CfProj_Fund> cfproj_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_srv_currency")
	private Set<CfProj_Srv> cfproj_srv_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_fund_currency")
	private Set<CfResPat_Fund> cfrespat_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_fund_currency")
	private Set<CfResProd_Fund> cfresprod_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_fund_currency")
	private Set<CfResPubl_Fund> cfrespubl_fund_currencySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fund_currency")
	private Set<CfSrv_Fund> cfsrv_fund_currencySet;
	
	public CfCurrency(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_currency_code() {
		return this.a_currency_code;
	}
	
	public void setA_currency_code(java.lang.String a_currency_code) {
		this.a_currency_code = a_currency_code;
	}
	
	public java.lang.String getA_numeric_currency_code() {
		return this.a_numeric_currency_code;
	}
	
	public void setA_numeric_currency_code(java.lang.String a_numeric_currency_code) {
		this.a_numeric_currency_code = a_numeric_currency_code;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfCurrency_Class> getCfcurrency_class_currencySet() {
		return this.cfcurrency_class_currencySet;
	}
	
	public void setCfcurrency_class_currencySet(Set<CfCurrency_Class> cfcurrency_class_currencySet) {
		this.cfcurrency_class_currencySet = cfcurrency_class_currencySet;
	}
	
	public Set<CfCurrencyEntName> getCfcurrencyentname_currencySet() {
		return this.cfcurrencyentname_currencySet;
	}
	
	public void setCfcurrencyentname_currencySet(Set<CfCurrencyEntName> cfcurrencyentname_currencySet) {
		this.cfcurrencyentname_currencySet = cfcurrencyentname_currencySet;
	}
	
	public Set<CfCurrencyName> getCfcurrencyname_currencySet() {
		return this.cfcurrencyname_currencySet;
	}
	
	public void setCfcurrencyname_currencySet(Set<CfCurrencyName> cfcurrencyname_currencySet) {
		this.cfcurrencyname_currencySet = cfcurrencyname_currencySet;
	}
	
	public Set<CfEquip_Fund> getCfequip_fund_currencySet() {
		return this.cfequip_fund_currencySet;
	}
	
	public void setCfequip_fund_currencySet(Set<CfEquip_Fund> cfequip_fund_currencySet) {
		this.cfequip_fund_currencySet = cfequip_fund_currencySet;
	}
	
	public Set<CfEvent_Fund> getCfevent_fund_currencySet() {
		return this.cfevent_fund_currencySet;
	}
	
	public void setCfevent_fund_currencySet(Set<CfEvent_Fund> cfevent_fund_currencySet) {
		this.cfevent_fund_currencySet = cfevent_fund_currencySet;
	}
	
	public Set<CfFacil_Fund> getCffacil_fund_currencySet() {
		return this.cffacil_fund_currencySet;
	}
	
	public void setCffacil_fund_currencySet(Set<CfFacil_Fund> cffacil_fund_currencySet) {
		this.cffacil_fund_currencySet = cffacil_fund_currencySet;
	}
	
	public Set<CfFund> getCffund_currencySet() {
		return this.cffund_currencySet;
	}
	
	public void setCffund_currencySet(Set<CfFund> cffund_currencySet) {
		this.cffund_currencySet = cffund_currencySet;
	}
	
	public Set<CfFund_Indic> getCffund_indic_currencySet() {
		return this.cffund_indic_currencySet;
	}
	
	public void setCffund_indic_currencySet(Set<CfFund_Indic> cffund_indic_currencySet) {
		this.cffund_indic_currencySet = cffund_indic_currencySet;
	}
	
	public Set<CfFund_Meas> getCffund_meas_currencySet() {
		return this.cffund_meas_currencySet;
	}
	
	public void setCffund_meas_currencySet(Set<CfFund_Meas> cffund_meas_currencySet) {
		this.cffund_meas_currencySet = cffund_meas_currencySet;
	}
	
	public Set<CfMedium_Fund> getCfmedium_fund_currencySet() {
		return this.cfmedium_fund_currencySet;
	}
	
	public void setCfmedium_fund_currencySet(Set<CfMedium_Fund> cfmedium_fund_currencySet) {
		this.cfmedium_fund_currencySet = cfmedium_fund_currencySet;
	}
	
	public Set<CfOrgUnit> getCforgunit_currencySet() {
		return this.cforgunit_currencySet;
	}
	
	public void setCforgunit_currencySet(Set<CfOrgUnit> cforgunit_currencySet) {
		this.cforgunit_currencySet = cforgunit_currencySet;
	}
	
	public Set<CfOrgUnit_Equip> getCforgunit_equip_currencySet() {
		return this.cforgunit_equip_currencySet;
	}
	
	public void setCforgunit_equip_currencySet(Set<CfOrgUnit_Equip> cforgunit_equip_currencySet) {
		this.cforgunit_equip_currencySet = cforgunit_equip_currencySet;
	}
	
	public Set<CfOrgUnit_ExpSkills> getCforgunit_expskills_currencySet() {
		return this.cforgunit_expskills_currencySet;
	}
	
	public void setCforgunit_expskills_currencySet(Set<CfOrgUnit_ExpSkills> cforgunit_expskills_currencySet) {
		this.cforgunit_expskills_currencySet = cforgunit_expskills_currencySet;
	}
	
	public Set<CfOrgUnit_Facil> getCforgunit_facil_currencySet() {
		return this.cforgunit_facil_currencySet;
	}
	
	public void setCforgunit_facil_currencySet(Set<CfOrgUnit_Facil> cforgunit_facil_currencySet) {
		this.cforgunit_facil_currencySet = cforgunit_facil_currencySet;
	}
	
	public Set<CfOrgUnit_Fund> getCforgunit_fund_currencySet() {
		return this.cforgunit_fund_currencySet;
	}
	
	public void setCforgunit_fund_currencySet(Set<CfOrgUnit_Fund> cforgunit_fund_currencySet) {
		this.cforgunit_fund_currencySet = cforgunit_fund_currencySet;
	}
	
	public Set<CfOrgUnit_ResProd> getCforgunit_resprod_currencySet() {
		return this.cforgunit_resprod_currencySet;
	}
	
	public void setCforgunit_resprod_currencySet(Set<CfOrgUnit_ResProd> cforgunit_resprod_currencySet) {
		this.cforgunit_resprod_currencySet = cforgunit_resprod_currencySet;
	}
	
	public Set<CfOrgUnit_Srv> getCforgunit_srv_currencySet() {
		return this.cforgunit_srv_currencySet;
	}
	
	public void setCforgunit_srv_currencySet(Set<CfOrgUnit_Srv> cforgunit_srv_currencySet) {
		this.cforgunit_srv_currencySet = cforgunit_srv_currencySet;
	}
	
	public Set<CfPers_Equip> getCfpers_equip_currencySet() {
		return this.cfpers_equip_currencySet;
	}
	
	public void setCfpers_equip_currencySet(Set<CfPers_Equip> cfpers_equip_currencySet) {
		this.cfpers_equip_currencySet = cfpers_equip_currencySet;
	}
	
	public Set<CfPers_ExpSkills> getCfpers_expskills_currencySet() {
		return this.cfpers_expskills_currencySet;
	}
	
	public void setCfpers_expskills_currencySet(Set<CfPers_ExpSkills> cfpers_expskills_currencySet) {
		this.cfpers_expskills_currencySet = cfpers_expskills_currencySet;
	}
	
	public Set<CfPers_Facil> getCfpers_facil_currencySet() {
		return this.cfpers_facil_currencySet;
	}
	
	public void setCfpers_facil_currencySet(Set<CfPers_Facil> cfpers_facil_currencySet) {
		this.cfpers_facil_currencySet = cfpers_facil_currencySet;
	}
	
	public Set<CfPers_Fund> getCfpers_fund_currencySet() {
		return this.cfpers_fund_currencySet;
	}
	
	public void setCfpers_fund_currencySet(Set<CfPers_Fund> cfpers_fund_currencySet) {
		this.cfpers_fund_currencySet = cfpers_fund_currencySet;
	}
	
	public Set<CfPers_ResProd> getCfpers_resprod_currencySet() {
		return this.cfpers_resprod_currencySet;
	}
	
	public void setCfpers_resprod_currencySet(Set<CfPers_ResProd> cfpers_resprod_currencySet) {
		this.cfpers_resprod_currencySet = cfpers_resprod_currencySet;
	}
	
	public Set<CfPers_Srv> getCfpers_srv_currencySet() {
		return this.cfpers_srv_currencySet;
	}
	
	public void setCfpers_srv_currencySet(Set<CfPers_Srv> cfpers_srv_currencySet) {
		this.cfpers_srv_currencySet = cfpers_srv_currencySet;
	}
	
	public Set<CfProj_Equip> getCfproj_equip_currencySet() {
		return this.cfproj_equip_currencySet;
	}
	
	public void setCfproj_equip_currencySet(Set<CfProj_Equip> cfproj_equip_currencySet) {
		this.cfproj_equip_currencySet = cfproj_equip_currencySet;
	}
	
	public Set<CfProj_Facil> getCfproj_facil_currencySet() {
		return this.cfproj_facil_currencySet;
	}
	
	public void setCfproj_facil_currencySet(Set<CfProj_Facil> cfproj_facil_currencySet) {
		this.cfproj_facil_currencySet = cfproj_facil_currencySet;
	}
	
	public Set<CfProj_Fund> getCfproj_fund_currencySet() {
		return this.cfproj_fund_currencySet;
	}
	
	public void setCfproj_fund_currencySet(Set<CfProj_Fund> cfproj_fund_currencySet) {
		this.cfproj_fund_currencySet = cfproj_fund_currencySet;
	}
	
	public Set<CfProj_Srv> getCfproj_srv_currencySet() {
		return this.cfproj_srv_currencySet;
	}
	
	public void setCfproj_srv_currencySet(Set<CfProj_Srv> cfproj_srv_currencySet) {
		this.cfproj_srv_currencySet = cfproj_srv_currencySet;
	}
	
	public Set<CfResPat_Fund> getCfrespat_fund_currencySet() {
		return this.cfrespat_fund_currencySet;
	}
	
	public void setCfrespat_fund_currencySet(Set<CfResPat_Fund> cfrespat_fund_currencySet) {
		this.cfrespat_fund_currencySet = cfrespat_fund_currencySet;
	}
	
	public Set<CfResProd_Fund> getCfresprod_fund_currencySet() {
		return this.cfresprod_fund_currencySet;
	}
	
	public void setCfresprod_fund_currencySet(Set<CfResProd_Fund> cfresprod_fund_currencySet) {
		this.cfresprod_fund_currencySet = cfresprod_fund_currencySet;
	}
	
	public Set<CfResPubl_Fund> getCfrespubl_fund_currencySet() {
		return this.cfrespubl_fund_currencySet;
	}
	
	public void setCfrespubl_fund_currencySet(Set<CfResPubl_Fund> cfrespubl_fund_currencySet) {
		this.cfrespubl_fund_currencySet = cfrespubl_fund_currencySet;
	}
	
	public Set<CfSrv_Fund> getCfsrv_fund_currencySet() {
		return this.cfsrv_fund_currencySet;
	}
	
	public void setCfsrv_fund_currencySet(Set<CfSrv_Fund> cfsrv_fund_currencySet) {
		this.cfsrv_fund_currencySet = cfsrv_fund_currencySet;
	}
	
}