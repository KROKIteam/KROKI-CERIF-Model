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
@Table(name = "CM_PERSON")
public class CfPers implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfPersId", unique = false, nullable = false )
	private java.lang.String a_person_identifier;
	@Column(name = "cfBirthdate", unique = false, nullable = false )
	private java.util.Date a_birthdate;
	@Column(name = "cfGender", unique = false, nullable = false )
	private java.lang.String a_gender;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_class_person")
	private Set<CfPers_Class> cfpers_class_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_country_person")
	private Set<CfPers_Country> cfpers_country_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_cv_person")
	private Set<CfPers_CV> cfpers_cv_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_dc_person")
	private Set<CfPers_DC> cfpers_dc_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_eaddr_person")
	private Set<CfPers_EAddr> cfpers_eaddr_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_equip_person")
	private Set<CfPers_Equip> cfpers_equip_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_event_person")
	private Set<CfPers_Event> cfpers_event_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_expskills_person")
	private Set<CfPers_ExpSkills> cfpers_expskills_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_facil_person")
	private Set<CfPers_Facil> cfpers_facil_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_fund_person")
	private Set<CfPers_Fund> cfpers_fund_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_indic_person")
	private Set<CfPers_Indic> cfpers_indic_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfperskeyw_person")
	private Set<CfPersKeyw> cfperskeyw_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_lang_person")
	private Set<CfPers_Lang> cfpers_lang_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_meas_person")
	private Set<CfPers_Meas> cfpers_meas_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_medium_person")
	private Set<CfPers_Medium> cfpers_medium_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpersname_pers_person")
	private Set<CfPersName_Pers> cfpersname_pers_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_orgunit_person")
	private Set<CfPers_OrgUnit> cfpers_orgunit_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_pers_person")
	private Set<CfPers_Pers> cfpers_pers_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_pers_persona")
	private Set<CfPers_Pers> cfpers_pers_personaSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_paddr_person")
	private Set<CfPers_PAddr> cfpers_paddr_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_prize_person")
	private Set<CfPers_Prize> cfpers_prize_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_qual_person")
	private Set<CfPers_Qual> cfpers_qual_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpersresint_person")
	private Set<CfPersResInt> cfpersresint_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_respat_person")
	private Set<CfPers_ResPat> cfpers_respat_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_resprod_person")
	private Set<CfPers_ResProd> cfpers_resprod_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_respubl_person")
	private Set<CfPers_ResPubl> cfpers_respubl_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_srv_person")
	private Set<CfPers_Srv> cfpers_srv_personSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_pers_person")
	private Set<CfProj_Pers> cfproj_pers_personSet;
	
	public CfPers(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_person_identifier() {
		return this.a_person_identifier;
	}
	
	public void setA_person_identifier(java.lang.String a_person_identifier) {
		this.a_person_identifier = a_person_identifier;
	}
	
	public java.util.Date getA_birthdate() {
		return this.a_birthdate;
	}
	
	public void setA_birthdate(java.util.Date a_birthdate) {
		this.a_birthdate = a_birthdate;
	}
	
	public java.lang.String getA_gender() {
		return this.a_gender;
	}
	
	public void setA_gender(java.lang.String a_gender) {
		this.a_gender = a_gender;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfPers_Class> getCfpers_class_personSet() {
		return this.cfpers_class_personSet;
	}
	
	public void setCfpers_class_personSet(Set<CfPers_Class> cfpers_class_personSet) {
		this.cfpers_class_personSet = cfpers_class_personSet;
	}
	
	public Set<CfPers_Country> getCfpers_country_personSet() {
		return this.cfpers_country_personSet;
	}
	
	public void setCfpers_country_personSet(Set<CfPers_Country> cfpers_country_personSet) {
		this.cfpers_country_personSet = cfpers_country_personSet;
	}
	
	public Set<CfPers_CV> getCfpers_cv_personSet() {
		return this.cfpers_cv_personSet;
	}
	
	public void setCfpers_cv_personSet(Set<CfPers_CV> cfpers_cv_personSet) {
		this.cfpers_cv_personSet = cfpers_cv_personSet;
	}
	
	public Set<CfPers_DC> getCfpers_dc_personSet() {
		return this.cfpers_dc_personSet;
	}
	
	public void setCfpers_dc_personSet(Set<CfPers_DC> cfpers_dc_personSet) {
		this.cfpers_dc_personSet = cfpers_dc_personSet;
	}
	
	public Set<CfPers_EAddr> getCfpers_eaddr_personSet() {
		return this.cfpers_eaddr_personSet;
	}
	
	public void setCfpers_eaddr_personSet(Set<CfPers_EAddr> cfpers_eaddr_personSet) {
		this.cfpers_eaddr_personSet = cfpers_eaddr_personSet;
	}
	
	public Set<CfPers_Equip> getCfpers_equip_personSet() {
		return this.cfpers_equip_personSet;
	}
	
	public void setCfpers_equip_personSet(Set<CfPers_Equip> cfpers_equip_personSet) {
		this.cfpers_equip_personSet = cfpers_equip_personSet;
	}
	
	public Set<CfPers_Event> getCfpers_event_personSet() {
		return this.cfpers_event_personSet;
	}
	
	public void setCfpers_event_personSet(Set<CfPers_Event> cfpers_event_personSet) {
		this.cfpers_event_personSet = cfpers_event_personSet;
	}
	
	public Set<CfPers_ExpSkills> getCfpers_expskills_personSet() {
		return this.cfpers_expskills_personSet;
	}
	
	public void setCfpers_expskills_personSet(Set<CfPers_ExpSkills> cfpers_expskills_personSet) {
		this.cfpers_expskills_personSet = cfpers_expskills_personSet;
	}
	
	public Set<CfPers_Facil> getCfpers_facil_personSet() {
		return this.cfpers_facil_personSet;
	}
	
	public void setCfpers_facil_personSet(Set<CfPers_Facil> cfpers_facil_personSet) {
		this.cfpers_facil_personSet = cfpers_facil_personSet;
	}
	
	public Set<CfPers_Fund> getCfpers_fund_personSet() {
		return this.cfpers_fund_personSet;
	}
	
	public void setCfpers_fund_personSet(Set<CfPers_Fund> cfpers_fund_personSet) {
		this.cfpers_fund_personSet = cfpers_fund_personSet;
	}
	
	public Set<CfPers_Indic> getCfpers_indic_personSet() {
		return this.cfpers_indic_personSet;
	}
	
	public void setCfpers_indic_personSet(Set<CfPers_Indic> cfpers_indic_personSet) {
		this.cfpers_indic_personSet = cfpers_indic_personSet;
	}
	
	public Set<CfPersKeyw> getCfperskeyw_personSet() {
		return this.cfperskeyw_personSet;
	}
	
	public void setCfperskeyw_personSet(Set<CfPersKeyw> cfperskeyw_personSet) {
		this.cfperskeyw_personSet = cfperskeyw_personSet;
	}
	
	public Set<CfPers_Lang> getCfpers_lang_personSet() {
		return this.cfpers_lang_personSet;
	}
	
	public void setCfpers_lang_personSet(Set<CfPers_Lang> cfpers_lang_personSet) {
		this.cfpers_lang_personSet = cfpers_lang_personSet;
	}
	
	public Set<CfPers_Meas> getCfpers_meas_personSet() {
		return this.cfpers_meas_personSet;
	}
	
	public void setCfpers_meas_personSet(Set<CfPers_Meas> cfpers_meas_personSet) {
		this.cfpers_meas_personSet = cfpers_meas_personSet;
	}
	
	public Set<CfPers_Medium> getCfpers_medium_personSet() {
		return this.cfpers_medium_personSet;
	}
	
	public void setCfpers_medium_personSet(Set<CfPers_Medium> cfpers_medium_personSet) {
		this.cfpers_medium_personSet = cfpers_medium_personSet;
	}
	
	public Set<CfPersName_Pers> getCfpersname_pers_personSet() {
		return this.cfpersname_pers_personSet;
	}
	
	public void setCfpersname_pers_personSet(Set<CfPersName_Pers> cfpersname_pers_personSet) {
		this.cfpersname_pers_personSet = cfpersname_pers_personSet;
	}
	
	public Set<CfPers_OrgUnit> getCfpers_orgunit_personSet() {
		return this.cfpers_orgunit_personSet;
	}
	
	public void setCfpers_orgunit_personSet(Set<CfPers_OrgUnit> cfpers_orgunit_personSet) {
		this.cfpers_orgunit_personSet = cfpers_orgunit_personSet;
	}
	
	public Set<CfPers_Pers> getCfpers_pers_personSet() {
		return this.cfpers_pers_personSet;
	}
	
	public void setCfpers_pers_personSet(Set<CfPers_Pers> cfpers_pers_personSet) {
		this.cfpers_pers_personSet = cfpers_pers_personSet;
	}
	
	public Set<CfPers_Pers> getCfpers_pers_personaSet() {
		return this.cfpers_pers_personaSet;
	}
	
	public void setCfpers_pers_personaSet(Set<CfPers_Pers> cfpers_pers_personaSet) {
		this.cfpers_pers_personaSet = cfpers_pers_personaSet;
	}
	
	public Set<CfPers_PAddr> getCfpers_paddr_personSet() {
		return this.cfpers_paddr_personSet;
	}
	
	public void setCfpers_paddr_personSet(Set<CfPers_PAddr> cfpers_paddr_personSet) {
		this.cfpers_paddr_personSet = cfpers_paddr_personSet;
	}
	
	public Set<CfPers_Prize> getCfpers_prize_personSet() {
		return this.cfpers_prize_personSet;
	}
	
	public void setCfpers_prize_personSet(Set<CfPers_Prize> cfpers_prize_personSet) {
		this.cfpers_prize_personSet = cfpers_prize_personSet;
	}
	
	public Set<CfPers_Qual> getCfpers_qual_personSet() {
		return this.cfpers_qual_personSet;
	}
	
	public void setCfpers_qual_personSet(Set<CfPers_Qual> cfpers_qual_personSet) {
		this.cfpers_qual_personSet = cfpers_qual_personSet;
	}
	
	public Set<CfPersResInt> getCfpersresint_personSet() {
		return this.cfpersresint_personSet;
	}
	
	public void setCfpersresint_personSet(Set<CfPersResInt> cfpersresint_personSet) {
		this.cfpersresint_personSet = cfpersresint_personSet;
	}
	
	public Set<CfPers_ResPat> getCfpers_respat_personSet() {
		return this.cfpers_respat_personSet;
	}
	
	public void setCfpers_respat_personSet(Set<CfPers_ResPat> cfpers_respat_personSet) {
		this.cfpers_respat_personSet = cfpers_respat_personSet;
	}
	
	public Set<CfPers_ResProd> getCfpers_resprod_personSet() {
		return this.cfpers_resprod_personSet;
	}
	
	public void setCfpers_resprod_personSet(Set<CfPers_ResProd> cfpers_resprod_personSet) {
		this.cfpers_resprod_personSet = cfpers_resprod_personSet;
	}
	
	public Set<CfPers_ResPubl> getCfpers_respubl_personSet() {
		return this.cfpers_respubl_personSet;
	}
	
	public void setCfpers_respubl_personSet(Set<CfPers_ResPubl> cfpers_respubl_personSet) {
		this.cfpers_respubl_personSet = cfpers_respubl_personSet;
	}
	
	public Set<CfPers_Srv> getCfpers_srv_personSet() {
		return this.cfpers_srv_personSet;
	}
	
	public void setCfpers_srv_personSet(Set<CfPers_Srv> cfpers_srv_personSet) {
		this.cfpers_srv_personSet = cfpers_srv_personSet;
	}
	
	public Set<CfProj_Pers> getCfproj_pers_personSet() {
		return this.cfproj_pers_personSet;
	}
	
	public void setCfproj_pers_personSet(Set<CfProj_Pers> cfproj_pers_personSet) {
		this.cfproj_pers_personSet = cfproj_pers_personSet;
	}
	
}