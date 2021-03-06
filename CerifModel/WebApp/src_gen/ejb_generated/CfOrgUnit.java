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
@Table(name = "C1_ORGANISATION_UNIT")
public class CfOrgUnit implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfOrgUnitId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_orgisation_unit_identifier;
	@Column(name = "cfAcro", unique = false, nullable = false , length = 16, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_acronym;
	@Column(name = "cfHeadcount", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.Integer ka_headcount;
	@Column(name = "cfTurn", unique = false, nullable = false ,columnDefinition = "FLOAT")
	protected java.math.BigDecimal ka_turnover;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cforgunit_currency", referencedColumnName="ID",  nullable = true)
	protected CfCurrency cforgunit_currency;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_orgunit_organisationUnit1")
	protected Set<CfOrgUnit_OrgUnit> cforgunit_orgunit_organisationUnit1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_orgunit_organisationUnit2")
	protected Set<CfOrgUnit_OrgUnit> cforgunit_orgunit_organisationUnit2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_class_organisationUnit")
	protected Set<CfOrgUnit_Class> cforgunit_class_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_dc_organisationUnit")
	protected Set<CfOrgUnit_DC> cforgunit_dc_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_eaddr_organisationUnit")
	protected Set<CfOrgUnit_EAddr> cforgunit_eaddr_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_equip_organisationUnit")
	protected Set<CfOrgUnit_Equip> cforgunit_equip_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_event_organisationUnit")
	protected Set<CfOrgUnit_Event> cforgunit_event_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_expskills_organisationUnit")
	protected Set<CfOrgUnit_ExpSkills> cforgunit_expskills_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_facil_organisationUnit")
	protected Set<CfOrgUnit_Facil> cforgunit_facil_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_fund_organisationUnit")
	protected Set<CfOrgUnit_Fund> cforgunit_fund_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_indic_organisationUnit")
	protected Set<CfOrgUnit_Indic> cforgunit_indic_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunitkeyw_organisationUnit")
	protected Set<CfOrgUnitKeyw> cforgunitkeyw_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_meas_organisationUnit")
	protected Set<CfOrgUnit_Meas> cforgunit_meas_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_medium_organisationUnit")
	protected Set<CfOrgUnit_Medium> cforgunit_medium_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunitname_organisationUnit")
	protected Set<CfOrgUnitName> cforgunitname_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_paddr_organisationUnit")
	protected Set<CfOrgUnit_PAddr> cforgunit_paddr_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_prize_organisationUnit")
	protected Set<CfOrgUnit_Prize> cforgunit_prize_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunitresact_organisationUnit")
	protected Set<CfOrgUnitResAct> cforgunitresact_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_respat_organisationUnit")
	protected Set<CfOrgUnit_ResPat> cforgunit_respat_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_resprod_organisationUnit")
	protected Set<CfOrgUnit_ResProd> cforgunit_resprod_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_respubl_organisationUnit")
	protected Set<CfOrgUnit_ResPubl> cforgunit_respubl_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_srv_organisationUnit")
	protected Set<CfOrgUnit_Srv> cforgunit_srv_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_orgunit_organisationUnit")
	protected Set<CfPers_OrgUnit> cfpers_orgunit_organisationUnitSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_orgunit_organisationUnit")
	protected Set<CfProj_OrgUnit> cfproj_orgunit_organisationUnitSet;
	
	public CfOrgUnit(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_orgisation_unit_identifier() {
		return this.ka_orgisation_unit_identifier;
	}
	
	public void setKa_orgisation_unit_identifier(java.lang.String ka_orgisation_unit_identifier) {
		this.ka_orgisation_unit_identifier = ka_orgisation_unit_identifier;
	}
	
	public java.lang.String getKa_acronym() {
		return this.ka_acronym;
	}
	
	public void setKa_acronym(java.lang.String ka_acronym) {
		this.ka_acronym = ka_acronym;
	}
	
	public java.lang.Integer getKa_headcount() {
		return this.ka_headcount;
	}
	
	public void setKa_headcount(java.lang.Integer ka_headcount) {
		this.ka_headcount = ka_headcount;
	}
	
	public java.math.BigDecimal getKa_turnover() {
		return this.ka_turnover;
	}
	
	public void setKa_turnover(java.math.BigDecimal ka_turnover) {
		this.ka_turnover = ka_turnover;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public CfCurrency getCforgunit_currency() {
		return this.cforgunit_currency;
	}
	
	public void setCforgunit_currency(CfCurrency cforgunit_currency) {
		this.cforgunit_currency = cforgunit_currency;
	}
	
	public Set<CfOrgUnit_OrgUnit> getCforgunit_orgunit_organisationUnit1Set() {
		return this.cforgunit_orgunit_organisationUnit1Set;
	}
	
	public void setCforgunit_orgunit_organisationUnit1Set(Set<CfOrgUnit_OrgUnit> cforgunit_orgunit_organisationUnit1Set) {
		this.cforgunit_orgunit_organisationUnit1Set = cforgunit_orgunit_organisationUnit1Set;
	}
	
	public Set<CfOrgUnit_OrgUnit> getCforgunit_orgunit_organisationUnit2Set() {
		return this.cforgunit_orgunit_organisationUnit2Set;
	}
	
	public void setCforgunit_orgunit_organisationUnit2Set(Set<CfOrgUnit_OrgUnit> cforgunit_orgunit_organisationUnit2Set) {
		this.cforgunit_orgunit_organisationUnit2Set = cforgunit_orgunit_organisationUnit2Set;
	}
	
	public Set<CfOrgUnit_Class> getCforgunit_class_organisationUnitSet() {
		return this.cforgunit_class_organisationUnitSet;
	}
	
	public void setCforgunit_class_organisationUnitSet(Set<CfOrgUnit_Class> cforgunit_class_organisationUnitSet) {
		this.cforgunit_class_organisationUnitSet = cforgunit_class_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_DC> getCforgunit_dc_organisationUnitSet() {
		return this.cforgunit_dc_organisationUnitSet;
	}
	
	public void setCforgunit_dc_organisationUnitSet(Set<CfOrgUnit_DC> cforgunit_dc_organisationUnitSet) {
		this.cforgunit_dc_organisationUnitSet = cforgunit_dc_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_EAddr> getCforgunit_eaddr_organisationUnitSet() {
		return this.cforgunit_eaddr_organisationUnitSet;
	}
	
	public void setCforgunit_eaddr_organisationUnitSet(Set<CfOrgUnit_EAddr> cforgunit_eaddr_organisationUnitSet) {
		this.cforgunit_eaddr_organisationUnitSet = cforgunit_eaddr_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Equip> getCforgunit_equip_organisationUnitSet() {
		return this.cforgunit_equip_organisationUnitSet;
	}
	
	public void setCforgunit_equip_organisationUnitSet(Set<CfOrgUnit_Equip> cforgunit_equip_organisationUnitSet) {
		this.cforgunit_equip_organisationUnitSet = cforgunit_equip_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Event> getCforgunit_event_organisationUnitSet() {
		return this.cforgunit_event_organisationUnitSet;
	}
	
	public void setCforgunit_event_organisationUnitSet(Set<CfOrgUnit_Event> cforgunit_event_organisationUnitSet) {
		this.cforgunit_event_organisationUnitSet = cforgunit_event_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_ExpSkills> getCforgunit_expskills_organisationUnitSet() {
		return this.cforgunit_expskills_organisationUnitSet;
	}
	
	public void setCforgunit_expskills_organisationUnitSet(Set<CfOrgUnit_ExpSkills> cforgunit_expskills_organisationUnitSet) {
		this.cforgunit_expskills_organisationUnitSet = cforgunit_expskills_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Facil> getCforgunit_facil_organisationUnitSet() {
		return this.cforgunit_facil_organisationUnitSet;
	}
	
	public void setCforgunit_facil_organisationUnitSet(Set<CfOrgUnit_Facil> cforgunit_facil_organisationUnitSet) {
		this.cforgunit_facil_organisationUnitSet = cforgunit_facil_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Fund> getCforgunit_fund_organisationUnitSet() {
		return this.cforgunit_fund_organisationUnitSet;
	}
	
	public void setCforgunit_fund_organisationUnitSet(Set<CfOrgUnit_Fund> cforgunit_fund_organisationUnitSet) {
		this.cforgunit_fund_organisationUnitSet = cforgunit_fund_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Indic> getCforgunit_indic_organisationUnitSet() {
		return this.cforgunit_indic_organisationUnitSet;
	}
	
	public void setCforgunit_indic_organisationUnitSet(Set<CfOrgUnit_Indic> cforgunit_indic_organisationUnitSet) {
		this.cforgunit_indic_organisationUnitSet = cforgunit_indic_organisationUnitSet;
	}
	
	public Set<CfOrgUnitKeyw> getCforgunitkeyw_organisationUnitSet() {
		return this.cforgunitkeyw_organisationUnitSet;
	}
	
	public void setCforgunitkeyw_organisationUnitSet(Set<CfOrgUnitKeyw> cforgunitkeyw_organisationUnitSet) {
		this.cforgunitkeyw_organisationUnitSet = cforgunitkeyw_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Meas> getCforgunit_meas_organisationUnitSet() {
		return this.cforgunit_meas_organisationUnitSet;
	}
	
	public void setCforgunit_meas_organisationUnitSet(Set<CfOrgUnit_Meas> cforgunit_meas_organisationUnitSet) {
		this.cforgunit_meas_organisationUnitSet = cforgunit_meas_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Medium> getCforgunit_medium_organisationUnitSet() {
		return this.cforgunit_medium_organisationUnitSet;
	}
	
	public void setCforgunit_medium_organisationUnitSet(Set<CfOrgUnit_Medium> cforgunit_medium_organisationUnitSet) {
		this.cforgunit_medium_organisationUnitSet = cforgunit_medium_organisationUnitSet;
	}
	
	public Set<CfOrgUnitName> getCforgunitname_organisationUnitSet() {
		return this.cforgunitname_organisationUnitSet;
	}
	
	public void setCforgunitname_organisationUnitSet(Set<CfOrgUnitName> cforgunitname_organisationUnitSet) {
		this.cforgunitname_organisationUnitSet = cforgunitname_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_PAddr> getCforgunit_paddr_organisationUnitSet() {
		return this.cforgunit_paddr_organisationUnitSet;
	}
	
	public void setCforgunit_paddr_organisationUnitSet(Set<CfOrgUnit_PAddr> cforgunit_paddr_organisationUnitSet) {
		this.cforgunit_paddr_organisationUnitSet = cforgunit_paddr_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Prize> getCforgunit_prize_organisationUnitSet() {
		return this.cforgunit_prize_organisationUnitSet;
	}
	
	public void setCforgunit_prize_organisationUnitSet(Set<CfOrgUnit_Prize> cforgunit_prize_organisationUnitSet) {
		this.cforgunit_prize_organisationUnitSet = cforgunit_prize_organisationUnitSet;
	}
	
	public Set<CfOrgUnitResAct> getCforgunitresact_organisationUnitSet() {
		return this.cforgunitresact_organisationUnitSet;
	}
	
	public void setCforgunitresact_organisationUnitSet(Set<CfOrgUnitResAct> cforgunitresact_organisationUnitSet) {
		this.cforgunitresact_organisationUnitSet = cforgunitresact_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_ResPat> getCforgunit_respat_organisationUnitSet() {
		return this.cforgunit_respat_organisationUnitSet;
	}
	
	public void setCforgunit_respat_organisationUnitSet(Set<CfOrgUnit_ResPat> cforgunit_respat_organisationUnitSet) {
		this.cforgunit_respat_organisationUnitSet = cforgunit_respat_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_ResProd> getCforgunit_resprod_organisationUnitSet() {
		return this.cforgunit_resprod_organisationUnitSet;
	}
	
	public void setCforgunit_resprod_organisationUnitSet(Set<CfOrgUnit_ResProd> cforgunit_resprod_organisationUnitSet) {
		this.cforgunit_resprod_organisationUnitSet = cforgunit_resprod_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_ResPubl> getCforgunit_respubl_organisationUnitSet() {
		return this.cforgunit_respubl_organisationUnitSet;
	}
	
	public void setCforgunit_respubl_organisationUnitSet(Set<CfOrgUnit_ResPubl> cforgunit_respubl_organisationUnitSet) {
		this.cforgunit_respubl_organisationUnitSet = cforgunit_respubl_organisationUnitSet;
	}
	
	public Set<CfOrgUnit_Srv> getCforgunit_srv_organisationUnitSet() {
		return this.cforgunit_srv_organisationUnitSet;
	}
	
	public void setCforgunit_srv_organisationUnitSet(Set<CfOrgUnit_Srv> cforgunit_srv_organisationUnitSet) {
		this.cforgunit_srv_organisationUnitSet = cforgunit_srv_organisationUnitSet;
	}
	
	public Set<CfPers_OrgUnit> getCfpers_orgunit_organisationUnitSet() {
		return this.cfpers_orgunit_organisationUnitSet;
	}
	
	public void setCfpers_orgunit_organisationUnitSet(Set<CfPers_OrgUnit> cfpers_orgunit_organisationUnitSet) {
		this.cfpers_orgunit_organisationUnitSet = cfpers_orgunit_organisationUnitSet;
	}
	
	public Set<CfProj_OrgUnit> getCfproj_orgunit_organisationUnitSet() {
		return this.cfproj_orgunit_organisationUnitSet;
	}
	
	public void setCfproj_orgunit_organisationUnitSet(Set<CfProj_OrgUnit> cfproj_orgunit_organisationUnitSet) {
		this.cfproj_orgunit_organisationUnitSet = cfproj_orgunit_organisationUnitSet;
	}
	
}