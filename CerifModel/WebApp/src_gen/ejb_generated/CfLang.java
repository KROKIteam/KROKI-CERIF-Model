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
@Table(name = "C1_LANGUAGE")
public class CfLang implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfLangCode", unique = false, nullable = false , length = 5, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_language_code;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcitedescr_language")
	private Set<CfCiteDescr> cfcitedescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcitetitle_language")
	private Set<CfCiteTitle> cfcitetitle_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassdef_language")
	private Set<CfClassDef> cfclassdef_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassdescr_language")
	private Set<CfClassDescr> cfclassdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassterm_language")
	private Set<CfClassTerm> cfclassterm_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassschemedescr_language")
	private Set<CfClassSchemeDescr> cfclassschemedescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassschemename_language")
	private Set<CfClassSchemeName> cfclassschemename_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcountryname_language")
	private Set<CfCountryName> cfcountryname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcurrencyentname_language")
	private Set<CfCurrencyEntName> cfcurrencyentname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcurrencyname_language")
	private Set<CfCurrencyName> cfcurrencyname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequipdescr_language")
	private Set<CfEquipDescr> cfequipdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequipkeyw_language")
	private Set<CfEquipKeyw> cfequipkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequipname_language")
	private Set<CfEquipName> cfequipname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeventdescr_language")
	private Set<CfEventDescr> cfeventdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeventkeyw_language")
	private Set<CfEventKeyw> cfeventkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeventname_language")
	private Set<CfEventName> cfeventname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillsdescr_language")
	private Set<CfExpSkillsDescr> cfexpskillsdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillskeyw_language")
	private Set<CfExpSkillsKeyw> cfexpskillskeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillsname_language")
	private Set<CfExpSkillsName> cfexpskillsname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacildescr_language")
	private Set<CfFacilDescr> cffacildescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacilkeyw_language")
	private Set<CfFacilKeyw> cffacilkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacilname_language")
	private Set<CfFacilName> cffacilname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffunddescr_language")
	private Set<CfFundDescr> cffunddescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffundkeyw_language")
	private Set<CfFundKeyw> cffundkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffundname_language")
	private Set<CfFundName> cffundname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobboxdescr_language")
	private Set<CfGeoBBoxDescr> cfgeobboxdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobboxkeyw_language")
	private Set<CfGeoBBoxKeyw> cfgeobboxkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobboxname_language")
	private Set<CfGeoBBoxName> cfgeobboxname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindicdescr_language")
	private Set<CfIndicDescr> cfindicdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindickeyw_language")
	private Set<CfIndicKeyw> cfindickeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindicname_language")
	private Set<CfIndicName> cfindicname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cflang_class_language")
	private Set<CfLang_Class> cflang_class_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cflangname_language")
	private Set<CfLangName> cflangname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cflangname_languagea")
	private Set<CfLangName> cflangname_languageaSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeasdescr_language")
	private Set<CfMeasDescr> cfmeasdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeaskeyw_language")
	private Set<CfMeasKeyw> cfmeaskeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeasname_language")
	private Set<CfMeasName> cfmeasname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmediumdescr_language")
	private Set<CfMediumDescr> cfmediumdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmediumkeyw_language")
	private Set<CfMediumKeyw> cfmediumkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmediumtitle_language")
	private Set<CfMediumTitle> cfmediumtitle_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetricsdescr_language")
	private Set<CfMetricsDescr> cfmetricsdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetricskeyw_language")
	private Set<CfMetricsKeyw> cfmetricskeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetricsname_language")
	private Set<CfMetricsName> cfmetricsname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunitkeyw_language")
	private Set<CfOrgUnitKeyw> cforgunitkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunitname_language")
	private Set<CfOrgUnitName> cforgunitname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunitresact_language")
	private Set<CfOrgUnitResAct> cforgunitresact_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfperskeyw_language")
	private Set<CfPersKeyw> cfperskeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_lang_language")
	private Set<CfPers_Lang> cfpers_lang_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpersresint_language")
	private Set<CfPersResInt> cfpersresint_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprizedescr_language")
	private Set<CfPrizeDescr> cfprizedescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprizekeyw_language")
	private Set<CfPrizeKeyw> cfprizekeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprizename_language")
	private Set<CfPrizeName> cfprizename_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprojabstr_language")
	private Set<CfProjAbstr> cfprojabstr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprojkeyw_language")
	private Set<CfProjKeyw> cfprojkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprojtitle_language")
	private Set<CfProjTitle> cfprojtitle_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqualdescr_language")
	private Set<CfQualDescr> cfqualdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqualkeyw_language")
	private Set<CfQualKeyw> cfqualkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqualtitle_language")
	private Set<CfQualTitle> cfqualtitle_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespatabstr_language")
	private Set<CfResPatAbstr> cfrespatabstr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespatkeyw_language")
	private Set<CfResPatKeyw> cfrespatkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespattitle_language")
	private Set<CfResPatTitle> cfrespattitle_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespatversinfo_language")
	private Set<CfResPatVersInfo> cfrespatversinfo_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresproddescr_language")
	private Set<CfResProdDescr> cfresproddescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprodkeyw_language")
	private Set<CfResProdKeyw> cfresprodkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprodname_language")
	private Set<CfResProdName> cfresprodname_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprodversinfo_language")
	private Set<CfResProdVersInfo> cfresprodversinfo_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublabstr_language")
	private Set<CfResPublAbstr> cfrespublabstr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublkeyw_language")
	private Set<CfResPublKeyw> cfrespublkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublsubtitle_language")
	private Set<CfResPublSubtitle> cfrespublsubtitle_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubltitle_language")
	private Set<CfResPublTitle> cfrespubltitle_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublversinfo_language")
	private Set<CfResPublVersInfo> cfrespublversinfo_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrvdescr_language")
	private Set<CfSrvDescr> cfsrvdescr_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrvkeyw_language")
	private Set<CfSrvKeyw> cfsrvkeyw_languageSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrvname_language")
	private Set<CfSrvName> cfsrvname_languageSet;
	
	public CfLang(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_language_code() {
		return this.a_language_code;
	}
	
	public void setA_language_code(java.lang.String a_language_code) {
		this.a_language_code = a_language_code;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfCiteDescr> getCfcitedescr_languageSet() {
		return this.cfcitedescr_languageSet;
	}
	
	public void setCfcitedescr_languageSet(Set<CfCiteDescr> cfcitedescr_languageSet) {
		this.cfcitedescr_languageSet = cfcitedescr_languageSet;
	}
	
	public Set<CfCiteTitle> getCfcitetitle_languageSet() {
		return this.cfcitetitle_languageSet;
	}
	
	public void setCfcitetitle_languageSet(Set<CfCiteTitle> cfcitetitle_languageSet) {
		this.cfcitetitle_languageSet = cfcitetitle_languageSet;
	}
	
	public Set<CfClassDef> getCfclassdef_languageSet() {
		return this.cfclassdef_languageSet;
	}
	
	public void setCfclassdef_languageSet(Set<CfClassDef> cfclassdef_languageSet) {
		this.cfclassdef_languageSet = cfclassdef_languageSet;
	}
	
	public Set<CfClassDescr> getCfclassdescr_languageSet() {
		return this.cfclassdescr_languageSet;
	}
	
	public void setCfclassdescr_languageSet(Set<CfClassDescr> cfclassdescr_languageSet) {
		this.cfclassdescr_languageSet = cfclassdescr_languageSet;
	}
	
	public Set<CfClassTerm> getCfclassterm_languageSet() {
		return this.cfclassterm_languageSet;
	}
	
	public void setCfclassterm_languageSet(Set<CfClassTerm> cfclassterm_languageSet) {
		this.cfclassterm_languageSet = cfclassterm_languageSet;
	}
	
	public Set<CfClassSchemeDescr> getCfclassschemedescr_languageSet() {
		return this.cfclassschemedescr_languageSet;
	}
	
	public void setCfclassschemedescr_languageSet(Set<CfClassSchemeDescr> cfclassschemedescr_languageSet) {
		this.cfclassschemedescr_languageSet = cfclassschemedescr_languageSet;
	}
	
	public Set<CfClassSchemeName> getCfclassschemename_languageSet() {
		return this.cfclassschemename_languageSet;
	}
	
	public void setCfclassschemename_languageSet(Set<CfClassSchemeName> cfclassschemename_languageSet) {
		this.cfclassschemename_languageSet = cfclassschemename_languageSet;
	}
	
	public Set<CfCountryName> getCfcountryname_languageSet() {
		return this.cfcountryname_languageSet;
	}
	
	public void setCfcountryname_languageSet(Set<CfCountryName> cfcountryname_languageSet) {
		this.cfcountryname_languageSet = cfcountryname_languageSet;
	}
	
	public Set<CfCurrencyEntName> getCfcurrencyentname_languageSet() {
		return this.cfcurrencyentname_languageSet;
	}
	
	public void setCfcurrencyentname_languageSet(Set<CfCurrencyEntName> cfcurrencyentname_languageSet) {
		this.cfcurrencyentname_languageSet = cfcurrencyentname_languageSet;
	}
	
	public Set<CfCurrencyName> getCfcurrencyname_languageSet() {
		return this.cfcurrencyname_languageSet;
	}
	
	public void setCfcurrencyname_languageSet(Set<CfCurrencyName> cfcurrencyname_languageSet) {
		this.cfcurrencyname_languageSet = cfcurrencyname_languageSet;
	}
	
	public Set<CfEquipDescr> getCfequipdescr_languageSet() {
		return this.cfequipdescr_languageSet;
	}
	
	public void setCfequipdescr_languageSet(Set<CfEquipDescr> cfequipdescr_languageSet) {
		this.cfequipdescr_languageSet = cfequipdescr_languageSet;
	}
	
	public Set<CfEquipKeyw> getCfequipkeyw_languageSet() {
		return this.cfequipkeyw_languageSet;
	}
	
	public void setCfequipkeyw_languageSet(Set<CfEquipKeyw> cfequipkeyw_languageSet) {
		this.cfequipkeyw_languageSet = cfequipkeyw_languageSet;
	}
	
	public Set<CfEquipName> getCfequipname_languageSet() {
		return this.cfequipname_languageSet;
	}
	
	public void setCfequipname_languageSet(Set<CfEquipName> cfequipname_languageSet) {
		this.cfequipname_languageSet = cfequipname_languageSet;
	}
	
	public Set<CfEventDescr> getCfeventdescr_languageSet() {
		return this.cfeventdescr_languageSet;
	}
	
	public void setCfeventdescr_languageSet(Set<CfEventDescr> cfeventdescr_languageSet) {
		this.cfeventdescr_languageSet = cfeventdescr_languageSet;
	}
	
	public Set<CfEventKeyw> getCfeventkeyw_languageSet() {
		return this.cfeventkeyw_languageSet;
	}
	
	public void setCfeventkeyw_languageSet(Set<CfEventKeyw> cfeventkeyw_languageSet) {
		this.cfeventkeyw_languageSet = cfeventkeyw_languageSet;
	}
	
	public Set<CfEventName> getCfeventname_languageSet() {
		return this.cfeventname_languageSet;
	}
	
	public void setCfeventname_languageSet(Set<CfEventName> cfeventname_languageSet) {
		this.cfeventname_languageSet = cfeventname_languageSet;
	}
	
	public Set<CfExpSkillsDescr> getCfexpskillsdescr_languageSet() {
		return this.cfexpskillsdescr_languageSet;
	}
	
	public void setCfexpskillsdescr_languageSet(Set<CfExpSkillsDescr> cfexpskillsdescr_languageSet) {
		this.cfexpskillsdescr_languageSet = cfexpskillsdescr_languageSet;
	}
	
	public Set<CfExpSkillsKeyw> getCfexpskillskeyw_languageSet() {
		return this.cfexpskillskeyw_languageSet;
	}
	
	public void setCfexpskillskeyw_languageSet(Set<CfExpSkillsKeyw> cfexpskillskeyw_languageSet) {
		this.cfexpskillskeyw_languageSet = cfexpskillskeyw_languageSet;
	}
	
	public Set<CfExpSkillsName> getCfexpskillsname_languageSet() {
		return this.cfexpskillsname_languageSet;
	}
	
	public void setCfexpskillsname_languageSet(Set<CfExpSkillsName> cfexpskillsname_languageSet) {
		this.cfexpskillsname_languageSet = cfexpskillsname_languageSet;
	}
	
	public Set<CfFacilDescr> getCffacildescr_languageSet() {
		return this.cffacildescr_languageSet;
	}
	
	public void setCffacildescr_languageSet(Set<CfFacilDescr> cffacildescr_languageSet) {
		this.cffacildescr_languageSet = cffacildescr_languageSet;
	}
	
	public Set<CfFacilKeyw> getCffacilkeyw_languageSet() {
		return this.cffacilkeyw_languageSet;
	}
	
	public void setCffacilkeyw_languageSet(Set<CfFacilKeyw> cffacilkeyw_languageSet) {
		this.cffacilkeyw_languageSet = cffacilkeyw_languageSet;
	}
	
	public Set<CfFacilName> getCffacilname_languageSet() {
		return this.cffacilname_languageSet;
	}
	
	public void setCffacilname_languageSet(Set<CfFacilName> cffacilname_languageSet) {
		this.cffacilname_languageSet = cffacilname_languageSet;
	}
	
	public Set<CfFundDescr> getCffunddescr_languageSet() {
		return this.cffunddescr_languageSet;
	}
	
	public void setCffunddescr_languageSet(Set<CfFundDescr> cffunddescr_languageSet) {
		this.cffunddescr_languageSet = cffunddescr_languageSet;
	}
	
	public Set<CfFundKeyw> getCffundkeyw_languageSet() {
		return this.cffundkeyw_languageSet;
	}
	
	public void setCffundkeyw_languageSet(Set<CfFundKeyw> cffundkeyw_languageSet) {
		this.cffundkeyw_languageSet = cffundkeyw_languageSet;
	}
	
	public Set<CfFundName> getCffundname_languageSet() {
		return this.cffundname_languageSet;
	}
	
	public void setCffundname_languageSet(Set<CfFundName> cffundname_languageSet) {
		this.cffundname_languageSet = cffundname_languageSet;
	}
	
	public Set<CfGeoBBoxDescr> getCfgeobboxdescr_languageSet() {
		return this.cfgeobboxdescr_languageSet;
	}
	
	public void setCfgeobboxdescr_languageSet(Set<CfGeoBBoxDescr> cfgeobboxdescr_languageSet) {
		this.cfgeobboxdescr_languageSet = cfgeobboxdescr_languageSet;
	}
	
	public Set<CfGeoBBoxKeyw> getCfgeobboxkeyw_languageSet() {
		return this.cfgeobboxkeyw_languageSet;
	}
	
	public void setCfgeobboxkeyw_languageSet(Set<CfGeoBBoxKeyw> cfgeobboxkeyw_languageSet) {
		this.cfgeobboxkeyw_languageSet = cfgeobboxkeyw_languageSet;
	}
	
	public Set<CfGeoBBoxName> getCfgeobboxname_languageSet() {
		return this.cfgeobboxname_languageSet;
	}
	
	public void setCfgeobboxname_languageSet(Set<CfGeoBBoxName> cfgeobboxname_languageSet) {
		this.cfgeobboxname_languageSet = cfgeobboxname_languageSet;
	}
	
	public Set<CfIndicDescr> getCfindicdescr_languageSet() {
		return this.cfindicdescr_languageSet;
	}
	
	public void setCfindicdescr_languageSet(Set<CfIndicDescr> cfindicdescr_languageSet) {
		this.cfindicdescr_languageSet = cfindicdescr_languageSet;
	}
	
	public Set<CfIndicKeyw> getCfindickeyw_languageSet() {
		return this.cfindickeyw_languageSet;
	}
	
	public void setCfindickeyw_languageSet(Set<CfIndicKeyw> cfindickeyw_languageSet) {
		this.cfindickeyw_languageSet = cfindickeyw_languageSet;
	}
	
	public Set<CfIndicName> getCfindicname_languageSet() {
		return this.cfindicname_languageSet;
	}
	
	public void setCfindicname_languageSet(Set<CfIndicName> cfindicname_languageSet) {
		this.cfindicname_languageSet = cfindicname_languageSet;
	}
	
	public Set<CfLang_Class> getCflang_class_languageSet() {
		return this.cflang_class_languageSet;
	}
	
	public void setCflang_class_languageSet(Set<CfLang_Class> cflang_class_languageSet) {
		this.cflang_class_languageSet = cflang_class_languageSet;
	}
	
	public Set<CfLangName> getCflangname_languageSet() {
		return this.cflangname_languageSet;
	}
	
	public void setCflangname_languageSet(Set<CfLangName> cflangname_languageSet) {
		this.cflangname_languageSet = cflangname_languageSet;
	}
	
	public Set<CfLangName> getCflangname_languageaSet() {
		return this.cflangname_languageaSet;
	}
	
	public void setCflangname_languageaSet(Set<CfLangName> cflangname_languageaSet) {
		this.cflangname_languageaSet = cflangname_languageaSet;
	}
	
	public Set<CfMeasDescr> getCfmeasdescr_languageSet() {
		return this.cfmeasdescr_languageSet;
	}
	
	public void setCfmeasdescr_languageSet(Set<CfMeasDescr> cfmeasdescr_languageSet) {
		this.cfmeasdescr_languageSet = cfmeasdescr_languageSet;
	}
	
	public Set<CfMeasKeyw> getCfmeaskeyw_languageSet() {
		return this.cfmeaskeyw_languageSet;
	}
	
	public void setCfmeaskeyw_languageSet(Set<CfMeasKeyw> cfmeaskeyw_languageSet) {
		this.cfmeaskeyw_languageSet = cfmeaskeyw_languageSet;
	}
	
	public Set<CfMeasName> getCfmeasname_languageSet() {
		return this.cfmeasname_languageSet;
	}
	
	public void setCfmeasname_languageSet(Set<CfMeasName> cfmeasname_languageSet) {
		this.cfmeasname_languageSet = cfmeasname_languageSet;
	}
	
	public Set<CfMediumDescr> getCfmediumdescr_languageSet() {
		return this.cfmediumdescr_languageSet;
	}
	
	public void setCfmediumdescr_languageSet(Set<CfMediumDescr> cfmediumdescr_languageSet) {
		this.cfmediumdescr_languageSet = cfmediumdescr_languageSet;
	}
	
	public Set<CfMediumKeyw> getCfmediumkeyw_languageSet() {
		return this.cfmediumkeyw_languageSet;
	}
	
	public void setCfmediumkeyw_languageSet(Set<CfMediumKeyw> cfmediumkeyw_languageSet) {
		this.cfmediumkeyw_languageSet = cfmediumkeyw_languageSet;
	}
	
	public Set<CfMediumTitle> getCfmediumtitle_languageSet() {
		return this.cfmediumtitle_languageSet;
	}
	
	public void setCfmediumtitle_languageSet(Set<CfMediumTitle> cfmediumtitle_languageSet) {
		this.cfmediumtitle_languageSet = cfmediumtitle_languageSet;
	}
	
	public Set<CfMetricsDescr> getCfmetricsdescr_languageSet() {
		return this.cfmetricsdescr_languageSet;
	}
	
	public void setCfmetricsdescr_languageSet(Set<CfMetricsDescr> cfmetricsdescr_languageSet) {
		this.cfmetricsdescr_languageSet = cfmetricsdescr_languageSet;
	}
	
	public Set<CfMetricsKeyw> getCfmetricskeyw_languageSet() {
		return this.cfmetricskeyw_languageSet;
	}
	
	public void setCfmetricskeyw_languageSet(Set<CfMetricsKeyw> cfmetricskeyw_languageSet) {
		this.cfmetricskeyw_languageSet = cfmetricskeyw_languageSet;
	}
	
	public Set<CfMetricsName> getCfmetricsname_languageSet() {
		return this.cfmetricsname_languageSet;
	}
	
	public void setCfmetricsname_languageSet(Set<CfMetricsName> cfmetricsname_languageSet) {
		this.cfmetricsname_languageSet = cfmetricsname_languageSet;
	}
	
	public Set<CfOrgUnitKeyw> getCforgunitkeyw_languageSet() {
		return this.cforgunitkeyw_languageSet;
	}
	
	public void setCforgunitkeyw_languageSet(Set<CfOrgUnitKeyw> cforgunitkeyw_languageSet) {
		this.cforgunitkeyw_languageSet = cforgunitkeyw_languageSet;
	}
	
	public Set<CfOrgUnitName> getCforgunitname_languageSet() {
		return this.cforgunitname_languageSet;
	}
	
	public void setCforgunitname_languageSet(Set<CfOrgUnitName> cforgunitname_languageSet) {
		this.cforgunitname_languageSet = cforgunitname_languageSet;
	}
	
	public Set<CfOrgUnitResAct> getCforgunitresact_languageSet() {
		return this.cforgunitresact_languageSet;
	}
	
	public void setCforgunitresact_languageSet(Set<CfOrgUnitResAct> cforgunitresact_languageSet) {
		this.cforgunitresact_languageSet = cforgunitresact_languageSet;
	}
	
	public Set<CfPersKeyw> getCfperskeyw_languageSet() {
		return this.cfperskeyw_languageSet;
	}
	
	public void setCfperskeyw_languageSet(Set<CfPersKeyw> cfperskeyw_languageSet) {
		this.cfperskeyw_languageSet = cfperskeyw_languageSet;
	}
	
	public Set<CfPers_Lang> getCfpers_lang_languageSet() {
		return this.cfpers_lang_languageSet;
	}
	
	public void setCfpers_lang_languageSet(Set<CfPers_Lang> cfpers_lang_languageSet) {
		this.cfpers_lang_languageSet = cfpers_lang_languageSet;
	}
	
	public Set<CfPersResInt> getCfpersresint_languageSet() {
		return this.cfpersresint_languageSet;
	}
	
	public void setCfpersresint_languageSet(Set<CfPersResInt> cfpersresint_languageSet) {
		this.cfpersresint_languageSet = cfpersresint_languageSet;
	}
	
	public Set<CfPrizeDescr> getCfprizedescr_languageSet() {
		return this.cfprizedescr_languageSet;
	}
	
	public void setCfprizedescr_languageSet(Set<CfPrizeDescr> cfprizedescr_languageSet) {
		this.cfprizedescr_languageSet = cfprizedescr_languageSet;
	}
	
	public Set<CfPrizeKeyw> getCfprizekeyw_languageSet() {
		return this.cfprizekeyw_languageSet;
	}
	
	public void setCfprizekeyw_languageSet(Set<CfPrizeKeyw> cfprizekeyw_languageSet) {
		this.cfprizekeyw_languageSet = cfprizekeyw_languageSet;
	}
	
	public Set<CfPrizeName> getCfprizename_languageSet() {
		return this.cfprizename_languageSet;
	}
	
	public void setCfprizename_languageSet(Set<CfPrizeName> cfprizename_languageSet) {
		this.cfprizename_languageSet = cfprizename_languageSet;
	}
	
	public Set<CfProjAbstr> getCfprojabstr_languageSet() {
		return this.cfprojabstr_languageSet;
	}
	
	public void setCfprojabstr_languageSet(Set<CfProjAbstr> cfprojabstr_languageSet) {
		this.cfprojabstr_languageSet = cfprojabstr_languageSet;
	}
	
	public Set<CfProjKeyw> getCfprojkeyw_languageSet() {
		return this.cfprojkeyw_languageSet;
	}
	
	public void setCfprojkeyw_languageSet(Set<CfProjKeyw> cfprojkeyw_languageSet) {
		this.cfprojkeyw_languageSet = cfprojkeyw_languageSet;
	}
	
	public Set<CfProjTitle> getCfprojtitle_languageSet() {
		return this.cfprojtitle_languageSet;
	}
	
	public void setCfprojtitle_languageSet(Set<CfProjTitle> cfprojtitle_languageSet) {
		this.cfprojtitle_languageSet = cfprojtitle_languageSet;
	}
	
	public Set<CfQualDescr> getCfqualdescr_languageSet() {
		return this.cfqualdescr_languageSet;
	}
	
	public void setCfqualdescr_languageSet(Set<CfQualDescr> cfqualdescr_languageSet) {
		this.cfqualdescr_languageSet = cfqualdescr_languageSet;
	}
	
	public Set<CfQualKeyw> getCfqualkeyw_languageSet() {
		return this.cfqualkeyw_languageSet;
	}
	
	public void setCfqualkeyw_languageSet(Set<CfQualKeyw> cfqualkeyw_languageSet) {
		this.cfqualkeyw_languageSet = cfqualkeyw_languageSet;
	}
	
	public Set<CfQualTitle> getCfqualtitle_languageSet() {
		return this.cfqualtitle_languageSet;
	}
	
	public void setCfqualtitle_languageSet(Set<CfQualTitle> cfqualtitle_languageSet) {
		this.cfqualtitle_languageSet = cfqualtitle_languageSet;
	}
	
	public Set<CfResPatAbstr> getCfrespatabstr_languageSet() {
		return this.cfrespatabstr_languageSet;
	}
	
	public void setCfrespatabstr_languageSet(Set<CfResPatAbstr> cfrespatabstr_languageSet) {
		this.cfrespatabstr_languageSet = cfrespatabstr_languageSet;
	}
	
	public Set<CfResPatKeyw> getCfrespatkeyw_languageSet() {
		return this.cfrespatkeyw_languageSet;
	}
	
	public void setCfrespatkeyw_languageSet(Set<CfResPatKeyw> cfrespatkeyw_languageSet) {
		this.cfrespatkeyw_languageSet = cfrespatkeyw_languageSet;
	}
	
	public Set<CfResPatTitle> getCfrespattitle_languageSet() {
		return this.cfrespattitle_languageSet;
	}
	
	public void setCfrespattitle_languageSet(Set<CfResPatTitle> cfrespattitle_languageSet) {
		this.cfrespattitle_languageSet = cfrespattitle_languageSet;
	}
	
	public Set<CfResPatVersInfo> getCfrespatversinfo_languageSet() {
		return this.cfrespatversinfo_languageSet;
	}
	
	public void setCfrespatversinfo_languageSet(Set<CfResPatVersInfo> cfrespatversinfo_languageSet) {
		this.cfrespatversinfo_languageSet = cfrespatversinfo_languageSet;
	}
	
	public Set<CfResProdDescr> getCfresproddescr_languageSet() {
		return this.cfresproddescr_languageSet;
	}
	
	public void setCfresproddescr_languageSet(Set<CfResProdDescr> cfresproddescr_languageSet) {
		this.cfresproddescr_languageSet = cfresproddescr_languageSet;
	}
	
	public Set<CfResProdKeyw> getCfresprodkeyw_languageSet() {
		return this.cfresprodkeyw_languageSet;
	}
	
	public void setCfresprodkeyw_languageSet(Set<CfResProdKeyw> cfresprodkeyw_languageSet) {
		this.cfresprodkeyw_languageSet = cfresprodkeyw_languageSet;
	}
	
	public Set<CfResProdName> getCfresprodname_languageSet() {
		return this.cfresprodname_languageSet;
	}
	
	public void setCfresprodname_languageSet(Set<CfResProdName> cfresprodname_languageSet) {
		this.cfresprodname_languageSet = cfresprodname_languageSet;
	}
	
	public Set<CfResProdVersInfo> getCfresprodversinfo_languageSet() {
		return this.cfresprodversinfo_languageSet;
	}
	
	public void setCfresprodversinfo_languageSet(Set<CfResProdVersInfo> cfresprodversinfo_languageSet) {
		this.cfresprodversinfo_languageSet = cfresprodversinfo_languageSet;
	}
	
	public Set<CfResPublAbstr> getCfrespublabstr_languageSet() {
		return this.cfrespublabstr_languageSet;
	}
	
	public void setCfrespublabstr_languageSet(Set<CfResPublAbstr> cfrespublabstr_languageSet) {
		this.cfrespublabstr_languageSet = cfrespublabstr_languageSet;
	}
	
	public Set<CfResPublKeyw> getCfrespublkeyw_languageSet() {
		return this.cfrespublkeyw_languageSet;
	}
	
	public void setCfrespublkeyw_languageSet(Set<CfResPublKeyw> cfrespublkeyw_languageSet) {
		this.cfrespublkeyw_languageSet = cfrespublkeyw_languageSet;
	}
	
	public Set<CfResPublSubtitle> getCfrespublsubtitle_languageSet() {
		return this.cfrespublsubtitle_languageSet;
	}
	
	public void setCfrespublsubtitle_languageSet(Set<CfResPublSubtitle> cfrespublsubtitle_languageSet) {
		this.cfrespublsubtitle_languageSet = cfrespublsubtitle_languageSet;
	}
	
	public Set<CfResPublTitle> getCfrespubltitle_languageSet() {
		return this.cfrespubltitle_languageSet;
	}
	
	public void setCfrespubltitle_languageSet(Set<CfResPublTitle> cfrespubltitle_languageSet) {
		this.cfrespubltitle_languageSet = cfrespubltitle_languageSet;
	}
	
	public Set<CfResPublVersInfo> getCfrespublversinfo_languageSet() {
		return this.cfrespublversinfo_languageSet;
	}
	
	public void setCfrespublversinfo_languageSet(Set<CfResPublVersInfo> cfrespublversinfo_languageSet) {
		this.cfrespublversinfo_languageSet = cfrespublversinfo_languageSet;
	}
	
	public Set<CfSrvDescr> getCfsrvdescr_languageSet() {
		return this.cfsrvdescr_languageSet;
	}
	
	public void setCfsrvdescr_languageSet(Set<CfSrvDescr> cfsrvdescr_languageSet) {
		this.cfsrvdescr_languageSet = cfsrvdescr_languageSet;
	}
	
	public Set<CfSrvKeyw> getCfsrvkeyw_languageSet() {
		return this.cfsrvkeyw_languageSet;
	}
	
	public void setCfsrvkeyw_languageSet(Set<CfSrvKeyw> cfsrvkeyw_languageSet) {
		this.cfsrvkeyw_languageSet = cfsrvkeyw_languageSet;
	}
	
	public Set<CfSrvName> getCfsrvname_languageSet() {
		return this.cfsrvname_languageSet;
	}
	
	public void setCfsrvname_languageSet(Set<CfSrvName> cfsrvname_languageSet) {
		this.cfsrvname_languageSet = cfsrvname_languageSet;
	}
	
}