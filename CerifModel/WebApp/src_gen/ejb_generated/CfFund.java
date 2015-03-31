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
@Table(name = "CM_FUNDING")
public class CfFund implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfFundId", unique = false, nullable = false )
	private java.lang.String a_funding_identifier;
	@Column(name = "cfStartDate", unique = false, nullable = false )
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false )
	private java.util.Date a_end_date;
	@Column(name = "cfAcro", unique = false, nullable = false )
	private java.lang.String a_acronym;
	@Column(name = "cfAmount", unique = false, nullable = false )
	private java.math.BigDecimal a_amount;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cffund_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cffund_currency;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_fund_funding")
	private Set<CfEquip_Fund> cfequip_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_fund_funding")
	private Set<CfEvent_Fund> cfevent_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_fund_funding")
	private Set<CfFacil_Fund> cffacil_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_fund_funding1")
	private Set<CfFund_Fund> cffund_fund_funding1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_fund_funding2")
	private Set<CfFund_Fund> cffund_fund_funding2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_class_funding")
	private Set<CfFund_Class> cffund_class_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffunddescr_funding")
	private Set<CfFundDescr> cffunddescr_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_indic_funding")
	private Set<CfFund_Indic> cffund_indic_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffundkeyw_funding")
	private Set<CfFundKeyw> cffundkeyw_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_meas_funding")
	private Set<CfFund_Meas> cffund_meas_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffundname_funding")
	private Set<CfFundName> cffundname_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_fund_funding")
	private Set<CfMedium_Fund> cfmedium_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_fund_funding")
	private Set<CfOrgUnit_Fund> cforgunit_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_fund_funding")
	private Set<CfPers_Fund> cfpers_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_fund_funding")
	private Set<CfProj_Fund> cfproj_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_fund_funding")
	private Set<CfResPat_Fund> cfrespat_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_fund_funding")
	private Set<CfResProd_Fund> cfresprod_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_fund_funding")
	private Set<CfResPubl_Fund> cfrespubl_fund_fundingSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fund_funding")
	private Set<CfSrv_Fund> cfsrv_fund_fundingSet;
	
	public CfFund(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_funding_identifier() {
		return this.a_funding_identifier;
	}
	
	public void setA_funding_identifier(java.lang.String a_funding_identifier) {
		this.a_funding_identifier = a_funding_identifier;
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
	
	public java.lang.String getA_acronym() {
		return this.a_acronym;
	}
	
	public void setA_acronym(java.lang.String a_acronym) {
		this.a_acronym = a_acronym;
	}
	
	public java.math.BigDecimal getA_amount() {
		return this.a_amount;
	}
	
	public void setA_amount(java.math.BigDecimal a_amount) {
		this.a_amount = a_amount;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public CfCurrency getCffund_currency() {
		return this.cffund_currency;
	}
	
	public void setCffund_currency(CfCurrency cffund_currency) {
		this.cffund_currency = cffund_currency;
	}
	
	public Set<CfEquip_Fund> getCfequip_fund_fundingSet() {
		return this.cfequip_fund_fundingSet;
	}
	
	public void setCfequip_fund_fundingSet(Set<CfEquip_Fund> cfequip_fund_fundingSet) {
		this.cfequip_fund_fundingSet = cfequip_fund_fundingSet;
	}
	
	public Set<CfEvent_Fund> getCfevent_fund_fundingSet() {
		return this.cfevent_fund_fundingSet;
	}
	
	public void setCfevent_fund_fundingSet(Set<CfEvent_Fund> cfevent_fund_fundingSet) {
		this.cfevent_fund_fundingSet = cfevent_fund_fundingSet;
	}
	
	public Set<CfFacil_Fund> getCffacil_fund_fundingSet() {
		return this.cffacil_fund_fundingSet;
	}
	
	public void setCffacil_fund_fundingSet(Set<CfFacil_Fund> cffacil_fund_fundingSet) {
		this.cffacil_fund_fundingSet = cffacil_fund_fundingSet;
	}
	
	public Set<CfFund_Fund> getCffund_fund_funding1Set() {
		return this.cffund_fund_funding1Set;
	}
	
	public void setCffund_fund_funding1Set(Set<CfFund_Fund> cffund_fund_funding1Set) {
		this.cffund_fund_funding1Set = cffund_fund_funding1Set;
	}
	
	public Set<CfFund_Fund> getCffund_fund_funding2Set() {
		return this.cffund_fund_funding2Set;
	}
	
	public void setCffund_fund_funding2Set(Set<CfFund_Fund> cffund_fund_funding2Set) {
		this.cffund_fund_funding2Set = cffund_fund_funding2Set;
	}
	
	public Set<CfFund_Class> getCffund_class_fundingSet() {
		return this.cffund_class_fundingSet;
	}
	
	public void setCffund_class_fundingSet(Set<CfFund_Class> cffund_class_fundingSet) {
		this.cffund_class_fundingSet = cffund_class_fundingSet;
	}
	
	public Set<CfFundDescr> getCffunddescr_fundingSet() {
		return this.cffunddescr_fundingSet;
	}
	
	public void setCffunddescr_fundingSet(Set<CfFundDescr> cffunddescr_fundingSet) {
		this.cffunddescr_fundingSet = cffunddescr_fundingSet;
	}
	
	public Set<CfFund_Indic> getCffund_indic_fundingSet() {
		return this.cffund_indic_fundingSet;
	}
	
	public void setCffund_indic_fundingSet(Set<CfFund_Indic> cffund_indic_fundingSet) {
		this.cffund_indic_fundingSet = cffund_indic_fundingSet;
	}
	
	public Set<CfFundKeyw> getCffundkeyw_fundingSet() {
		return this.cffundkeyw_fundingSet;
	}
	
	public void setCffundkeyw_fundingSet(Set<CfFundKeyw> cffundkeyw_fundingSet) {
		this.cffundkeyw_fundingSet = cffundkeyw_fundingSet;
	}
	
	public Set<CfFund_Meas> getCffund_meas_fundingSet() {
		return this.cffund_meas_fundingSet;
	}
	
	public void setCffund_meas_fundingSet(Set<CfFund_Meas> cffund_meas_fundingSet) {
		this.cffund_meas_fundingSet = cffund_meas_fundingSet;
	}
	
	public Set<CfFundName> getCffundname_fundingSet() {
		return this.cffundname_fundingSet;
	}
	
	public void setCffundname_fundingSet(Set<CfFundName> cffundname_fundingSet) {
		this.cffundname_fundingSet = cffundname_fundingSet;
	}
	
	public Set<CfMedium_Fund> getCfmedium_fund_fundingSet() {
		return this.cfmedium_fund_fundingSet;
	}
	
	public void setCfmedium_fund_fundingSet(Set<CfMedium_Fund> cfmedium_fund_fundingSet) {
		this.cfmedium_fund_fundingSet = cfmedium_fund_fundingSet;
	}
	
	public Set<CfOrgUnit_Fund> getCforgunit_fund_fundingSet() {
		return this.cforgunit_fund_fundingSet;
	}
	
	public void setCforgunit_fund_fundingSet(Set<CfOrgUnit_Fund> cforgunit_fund_fundingSet) {
		this.cforgunit_fund_fundingSet = cforgunit_fund_fundingSet;
	}
	
	public Set<CfPers_Fund> getCfpers_fund_fundingSet() {
		return this.cfpers_fund_fundingSet;
	}
	
	public void setCfpers_fund_fundingSet(Set<CfPers_Fund> cfpers_fund_fundingSet) {
		this.cfpers_fund_fundingSet = cfpers_fund_fundingSet;
	}
	
	public Set<CfProj_Fund> getCfproj_fund_fundingSet() {
		return this.cfproj_fund_fundingSet;
	}
	
	public void setCfproj_fund_fundingSet(Set<CfProj_Fund> cfproj_fund_fundingSet) {
		this.cfproj_fund_fundingSet = cfproj_fund_fundingSet;
	}
	
	public Set<CfResPat_Fund> getCfrespat_fund_fundingSet() {
		return this.cfrespat_fund_fundingSet;
	}
	
	public void setCfrespat_fund_fundingSet(Set<CfResPat_Fund> cfrespat_fund_fundingSet) {
		this.cfrespat_fund_fundingSet = cfrespat_fund_fundingSet;
	}
	
	public Set<CfResProd_Fund> getCfresprod_fund_fundingSet() {
		return this.cfresprod_fund_fundingSet;
	}
	
	public void setCfresprod_fund_fundingSet(Set<CfResProd_Fund> cfresprod_fund_fundingSet) {
		this.cfresprod_fund_fundingSet = cfresprod_fund_fundingSet;
	}
	
	public Set<CfResPubl_Fund> getCfrespubl_fund_fundingSet() {
		return this.cfrespubl_fund_fundingSet;
	}
	
	public void setCfrespubl_fund_fundingSet(Set<CfResPubl_Fund> cfrespubl_fund_fundingSet) {
		this.cfrespubl_fund_fundingSet = cfrespubl_fund_fundingSet;
	}
	
	public Set<CfSrv_Fund> getCfsrv_fund_fundingSet() {
		return this.cfsrv_fund_fundingSet;
	}
	
	public void setCfsrv_fund_fundingSet(Set<CfSrv_Fund> cfsrv_fund_fundingSet) {
		this.cfsrv_fund_fundingSet = cfsrv_fund_fundingSet;
	}
	
}