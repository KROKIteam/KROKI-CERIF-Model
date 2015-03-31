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
@Table(name = "CM_CLASSIFICATION")
public class CfClass implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfClassId", unique = false, nullable = false )
	private java.lang.String a_classification_identifier;
	@Column(name = "cfStartDate", unique = false, nullable = false )
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false )
	private java.util.Date a_end_date;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cfclass_classificationScheme", referencedColumnName="ID",  nullable = true)
	private CfClassScheme cfclass_classificationScheme;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcite_class_classification")
	private Set<CfCite_Class> cfcite_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcite_medium_classification")
	private Set<CfCite_Medium> cfcite_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclass_class_classification")
	private Set<CfClass_Class> cfclass_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclass_class_classification1")
	private Set<CfClass_Class> cfclass_class_classification1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclass_class_classification2")
	private Set<CfClass_Class> cfclass_class_classification2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassdef_classification")
	private Set<CfClassDef> cfclassdef_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassdescr_classification")
	private Set<CfClassDescr> cfclassdescr_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassex_classification")
	private Set<CfClassEx> cfclassex_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassscheme_classscheme_classification")
	private Set<CfClassScheme_ClassScheme> cfclassscheme_classscheme_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassterm_classification")
	private Set<CfClassTerm> cfclassterm_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcountry_class_classification")
	private Set<CfCountry_Class> cfcountry_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcurrency_class_classification")
	private Set<CfCurrency_Class> cfcurrency_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcv_class_classification")
	private Set<CfCV_Class> cfcv_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeaddr_class_classification")
	private Set<CfEAddr_Class> cfeaddr_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_class_classification")
	private Set<CfEquip_Class> cfequip_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_equip_classification")
	private Set<CfEquip_Equip> cfequip_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_event_classification")
	private Set<CfEquip_Event> cfequip_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_fund_classification")
	private Set<CfEquip_Fund> cfequip_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_indic_classification")
	private Set<CfEquip_Indic> cfequip_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_meas_classification")
	private Set<CfEquip_Meas> cfequip_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_medium_classification")
	private Set<CfEquip_Medium> cfequip_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_paddr_classification")
	private Set<CfEquip_PAddr> cfequip_paddr_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_srv_classification")
	private Set<CfEquip_Srv> cfequip_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_class_classification")
	private Set<CfEvent_Class> cfevent_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_event_classification")
	private Set<CfEvent_Event> cfevent_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_fund_classification")
	private Set<CfEvent_Fund> cfevent_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_indic_classification")
	private Set<CfEvent_Indic> cfevent_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_meas_classification")
	private Set<CfEvent_Meas> cfevent_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_medium_classification")
	private Set<CfEvent_Medium> cfevent_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskills_class_classification")
	private Set<CfExpSkills_Class> cfexpskills_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_class_classification")
	private Set<CfFacil_Class> cffacil_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_equip_classification")
	private Set<CfFacil_Equip> cffacil_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_event_classification")
	private Set<CfFacil_Event> cffacil_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_facil_classification")
	private Set<CfFacil_Facil> cffacil_facil_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_fund_classification")
	private Set<CfFacil_Fund> cffacil_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_indic_classification")
	private Set<CfFacil_Indic> cffacil_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_meas_classification")
	private Set<CfFacil_Meas> cffacil_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_medium_classification")
	private Set<CfFacil_Medium> cffacil_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_paddr_classification")
	private Set<CfFacil_PAddr> cffacil_paddr_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_srv_classification")
	private Set<CfFacil_Srv> cffacil_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffedid_classification")
	private Set<CfFedId> cffedid_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffedid_class_classification")
	private Set<CfFedId_Class> cffedid_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_fund_classification")
	private Set<CfFund_Fund> cffund_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_class_classification")
	private Set<CfFund_Class> cffund_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_indic_classification")
	private Set<CfFund_Indic> cffund_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_meas_classification")
	private Set<CfFund_Meas> cffund_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobbox_geobbox_classification")
	private Set<CfGeoBBox_GeoBBox> cfgeobbox_geobbox_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobbox_class_classification")
	private Set<CfGeoBBox_Class> cfgeobbox_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_indic_classification")
	private Set<CfIndic_Indic> cfindic_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_class_classification")
	private Set<CfIndic_Class> cfindic_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_meas_classification")
	private Set<CfIndic_Meas> cfindic_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cflang_class_classification")
	private Set<CfLang_Class> cflang_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeas_meas_classification")
	private Set<CfMeas_Meas> cfmeas_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeas_class_classification")
	private Set<CfMeas_Class> cfmeas_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_meas_classification")
	private Set<CfMedium_Meas> cfmedium_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_medium_classification")
	private Set<CfMedium_Medium> cfmedium_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_class_classification")
	private Set<CfMedium_Class> cfmedium_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_fund_classification")
	private Set<CfMedium_Fund> cfmedium_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_indic_classification")
	private Set<CfMedium_Indic> cfmedium_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetrics_class_classification")
	private Set<CfMetrics_Class> cfmetrics_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_orgunit_classification")
	private Set<CfOrgUnit_OrgUnit> cforgunit_orgunit_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_class_classification")
	private Set<CfOrgUnit_Class> cforgunit_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_dc_classification")
	private Set<CfOrgUnit_DC> cforgunit_dc_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_eaddr_classification")
	private Set<CfOrgUnit_EAddr> cforgunit_eaddr_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_equip_classification")
	private Set<CfOrgUnit_Equip> cforgunit_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_event_classification")
	private Set<CfOrgUnit_Event> cforgunit_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_expskills_classification")
	private Set<CfOrgUnit_ExpSkills> cforgunit_expskills_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_facil_classification")
	private Set<CfOrgUnit_Facil> cforgunit_facil_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_fund_classification")
	private Set<CfOrgUnit_Fund> cforgunit_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_indic_classification")
	private Set<CfOrgUnit_Indic> cforgunit_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_meas_classification")
	private Set<CfOrgUnit_Meas> cforgunit_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_medium_classification")
	private Set<CfOrgUnit_Medium> cforgunit_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_paddr_classification")
	private Set<CfOrgUnit_PAddr> cforgunit_paddr_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_prize_classification")
	private Set<CfOrgUnit_Prize> cforgunit_prize_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_respat_classification")
	private Set<CfOrgUnit_ResPat> cforgunit_respat_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_resprod_classification")
	private Set<CfOrgUnit_ResProd> cforgunit_resprod_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_respubl_classification")
	private Set<CfOrgUnit_ResPubl> cforgunit_respubl_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_srv_classification")
	private Set<CfOrgUnit_Srv> cforgunit_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpaddr_class_classification")
	private Set<CfPAddr_Class> cfpaddr_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpaddr_geobbox_classification")
	private Set<CfPAddr_GeoBBox> cfpaddr_geobbox_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_class_classification")
	private Set<CfPers_Class> cfpers_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_country_classification")
	private Set<CfPers_Country> cfpers_country_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_cv_classification")
	private Set<CfPers_CV> cfpers_cv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_dc_classification")
	private Set<CfPers_DC> cfpers_dc_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_eaddr_classification")
	private Set<CfPers_EAddr> cfpers_eaddr_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_equip_classification")
	private Set<CfPers_Equip> cfpers_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_event_classification")
	private Set<CfPers_Event> cfpers_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_expskills_classification")
	private Set<CfPers_ExpSkills> cfpers_expskills_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_facil_classification")
	private Set<CfPers_Facil> cfpers_facil_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_fund_classification")
	private Set<CfPers_Fund> cfpers_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_indic_classification")
	private Set<CfPers_Indic> cfpers_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_lang_classification")
	private Set<CfPers_Lang> cfpers_lang_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_meas_classification")
	private Set<CfPers_Meas> cfpers_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_medium_classification")
	private Set<CfPers_Medium> cfpers_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpersname_pers_classification")
	private Set<CfPersName_Pers> cfpersname_pers_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_orgunit_classification")
	private Set<CfPers_OrgUnit> cfpers_orgunit_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_pers_classification")
	private Set<CfPers_Pers> cfpers_pers_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_paddr_classification")
	private Set<CfPers_PAddr> cfpers_paddr_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_prize_classification")
	private Set<CfPers_Prize> cfpers_prize_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_qual_classification")
	private Set<CfPers_Qual> cfpers_qual_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_respat_classification")
	private Set<CfPers_ResPat> cfpers_respat_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_resprod_classification")
	private Set<CfPers_ResProd> cfpers_resprod_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_respubl_classification")
	private Set<CfPers_ResPubl> cfpers_respubl_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_srv_classification")
	private Set<CfPers_Srv> cfpers_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprize_class_classification")
	private Set<CfPrize_Class> cfprize_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_proj_classification")
	private Set<CfProj_Proj> cfproj_proj_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_class_classification")
	private Set<CfProj_Class> cfproj_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_dc_classification")
	private Set<CfProj_DC> cfproj_dc_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_equip_classification")
	private Set<CfProj_Equip> cfproj_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_event_classification")
	private Set<CfProj_Event> cfproj_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_facil_classification")
	private Set<CfProj_Facil> cfproj_facil_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_fund_classification")
	private Set<CfProj_Fund> cfproj_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_indic_classification")
	private Set<CfProj_Indic> cfproj_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_meas_classification")
	private Set<CfProj_Meas> cfproj_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_medium_classification")
	private Set<CfProj_Medium> cfproj_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_orgunit_classification")
	private Set<CfProj_OrgUnit> cfproj_orgunit_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_pers_classification")
	private Set<CfProj_Pers> cfproj_pers_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_prize_classification")
	private Set<CfProj_Prize> cfproj_prize_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_respat_classification")
	private Set<CfProj_ResPat> cfproj_respat_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_resprod_classification")
	private Set<CfProj_ResProd> cfproj_resprod_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_respubl_classification")
	private Set<CfProj_ResPubl> cfproj_respubl_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_srv_classification")
	private Set<CfProj_Srv> cfproj_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqual_class_classification")
	private Set<CfQual_Class> cfqual_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_respat_classification")
	private Set<CfResPat_ResPat> cfrespat_respat_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_class_classification")
	private Set<CfResPat_Class> cfrespat_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_equip_classification")
	private Set<CfResPat_Equip> cfrespat_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_facil_classification")
	private Set<CfResPat_Facil> cfrespat_facil_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_fund_classification")
	private Set<CfResPat_Fund> cfrespat_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_indic_classification")
	private Set<CfResPat_Indic> cfrespat_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_meas_classification")
	private Set<CfResPat_Meas> cfrespat_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_medium_classification")
	private Set<CfResPat_Medium> cfrespat_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_srv_classification")
	private Set<CfResPat_Srv> cfrespat_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_resprod_classification")
	private Set<CfResProd_ResProd> cfresprod_resprod_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_class_classification")
	private Set<CfResProd_Class> cfresprod_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_equip_classification")
	private Set<CfResProd_Equip> cfresprod_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_facil_classification")
	private Set<CfResProd_Facil> cfresprod_facil_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_fund_classification")
	private Set<CfResProd_Fund> cfresprod_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_indic_classification")
	private Set<CfResProd_Indic> cfresprod_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_meas_classification")
	private Set<CfResProd_Meas> cfresprod_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_medium_classification")
	private Set<CfResProd_Medium> cfresprod_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_srv_classification")
	private Set<CfResProd_Srv> cfresprod_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respat_classification")
	private Set<CfResPubl_ResPat> cfrespubl_respat_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_resprod_classification")
	private Set<CfResPubl_ResProd> cfrespubl_resprod_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respubl_classification")
	private Set<CfResPubl_ResPubl> cfrespubl_respubl_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_cite_classification")
	private Set<CfResPubl_Cite> cfrespubl_cite_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_class_classification")
	private Set<CfResPubl_Class> cfrespubl_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_dc_classification")
	private Set<CfResPubl_DC> cfrespubl_dc_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_equip_classification")
	private Set<CfResPubl_Equip> cfrespubl_equip_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_event_classification")
	private Set<CfResPubl_Event> cfrespubl_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_facil_classification")
	private Set<CfResPubl_Facil> cfrespubl_facil_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_fund_classification")
	private Set<CfResPubl_Fund> cfrespubl_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_indic_classification")
	private Set<CfResPubl_Indic> cfrespubl_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_meas_classification")
	private Set<CfResPubl_Meas> cfrespubl_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_medium_classification")
	private Set<CfResPubl_Medium> cfrespubl_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_metrics_classification")
	private Set<CfResPubl_Metrics> cfrespubl_metrics_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_srv_classification")
	private Set<CfResPubl_Srv> cfrespubl_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_srv_classification")
	private Set<CfSrv_Srv> cfsrv_srv_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_class_classification")
	private Set<CfSrv_Class> cfsrv_class_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_event_classification")
	private Set<CfSrv_Event> cfsrv_event_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fedid_classification")
	private Set<CfSrv_FedId> cfsrv_fedid_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fund_classification")
	private Set<CfSrv_Fund> cfsrv_fund_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_indic_classification")
	private Set<CfSrv_Indic> cfsrv_indic_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_meas_classification")
	private Set<CfSrv_Meas> cfsrv_meas_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_medium_classification")
	private Set<CfSrv_Medium> cfsrv_medium_classificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_paddr_classification")
	private Set<CfSrv_PAddr> cfsrv_paddr_classificationSet;
	
	public CfClass(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_classification_identifier() {
		return this.a_classification_identifier;
	}
	
	public void setA_classification_identifier(java.lang.String a_classification_identifier) {
		this.a_classification_identifier = a_classification_identifier;
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
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public CfClassScheme getCfclass_classificationScheme() {
		return this.cfclass_classificationScheme;
	}
	
	public void setCfclass_classificationScheme(CfClassScheme cfclass_classificationScheme) {
		this.cfclass_classificationScheme = cfclass_classificationScheme;
	}
	
	public Set<CfCite_Class> getCfcite_class_classificationSet() {
		return this.cfcite_class_classificationSet;
	}
	
	public void setCfcite_class_classificationSet(Set<CfCite_Class> cfcite_class_classificationSet) {
		this.cfcite_class_classificationSet = cfcite_class_classificationSet;
	}
	
	public Set<CfCite_Medium> getCfcite_medium_classificationSet() {
		return this.cfcite_medium_classificationSet;
	}
	
	public void setCfcite_medium_classificationSet(Set<CfCite_Medium> cfcite_medium_classificationSet) {
		this.cfcite_medium_classificationSet = cfcite_medium_classificationSet;
	}
	
	public Set<CfClass_Class> getCfclass_class_classificationSet() {
		return this.cfclass_class_classificationSet;
	}
	
	public void setCfclass_class_classificationSet(Set<CfClass_Class> cfclass_class_classificationSet) {
		this.cfclass_class_classificationSet = cfclass_class_classificationSet;
	}
	
	public Set<CfClass_Class> getCfclass_class_classification1Set() {
		return this.cfclass_class_classification1Set;
	}
	
	public void setCfclass_class_classification1Set(Set<CfClass_Class> cfclass_class_classification1Set) {
		this.cfclass_class_classification1Set = cfclass_class_classification1Set;
	}
	
	public Set<CfClass_Class> getCfclass_class_classification2Set() {
		return this.cfclass_class_classification2Set;
	}
	
	public void setCfclass_class_classification2Set(Set<CfClass_Class> cfclass_class_classification2Set) {
		this.cfclass_class_classification2Set = cfclass_class_classification2Set;
	}
	
	public Set<CfClassDef> getCfclassdef_classificationSet() {
		return this.cfclassdef_classificationSet;
	}
	
	public void setCfclassdef_classificationSet(Set<CfClassDef> cfclassdef_classificationSet) {
		this.cfclassdef_classificationSet = cfclassdef_classificationSet;
	}
	
	public Set<CfClassDescr> getCfclassdescr_classificationSet() {
		return this.cfclassdescr_classificationSet;
	}
	
	public void setCfclassdescr_classificationSet(Set<CfClassDescr> cfclassdescr_classificationSet) {
		this.cfclassdescr_classificationSet = cfclassdescr_classificationSet;
	}
	
	public Set<CfClassEx> getCfclassex_classificationSet() {
		return this.cfclassex_classificationSet;
	}
	
	public void setCfclassex_classificationSet(Set<CfClassEx> cfclassex_classificationSet) {
		this.cfclassex_classificationSet = cfclassex_classificationSet;
	}
	
	public Set<CfClassScheme_ClassScheme> getCfclassscheme_classscheme_classificationSet() {
		return this.cfclassscheme_classscheme_classificationSet;
	}
	
	public void setCfclassscheme_classscheme_classificationSet(Set<CfClassScheme_ClassScheme> cfclassscheme_classscheme_classificationSet) {
		this.cfclassscheme_classscheme_classificationSet = cfclassscheme_classscheme_classificationSet;
	}
	
	public Set<CfClassTerm> getCfclassterm_classificationSet() {
		return this.cfclassterm_classificationSet;
	}
	
	public void setCfclassterm_classificationSet(Set<CfClassTerm> cfclassterm_classificationSet) {
		this.cfclassterm_classificationSet = cfclassterm_classificationSet;
	}
	
	public Set<CfCountry_Class> getCfcountry_class_classificationSet() {
		return this.cfcountry_class_classificationSet;
	}
	
	public void setCfcountry_class_classificationSet(Set<CfCountry_Class> cfcountry_class_classificationSet) {
		this.cfcountry_class_classificationSet = cfcountry_class_classificationSet;
	}
	
	public Set<CfCurrency_Class> getCfcurrency_class_classificationSet() {
		return this.cfcurrency_class_classificationSet;
	}
	
	public void setCfcurrency_class_classificationSet(Set<CfCurrency_Class> cfcurrency_class_classificationSet) {
		this.cfcurrency_class_classificationSet = cfcurrency_class_classificationSet;
	}
	
	public Set<CfCV_Class> getCfcv_class_classificationSet() {
		return this.cfcv_class_classificationSet;
	}
	
	public void setCfcv_class_classificationSet(Set<CfCV_Class> cfcv_class_classificationSet) {
		this.cfcv_class_classificationSet = cfcv_class_classificationSet;
	}
	
	public Set<CfEAddr_Class> getCfeaddr_class_classificationSet() {
		return this.cfeaddr_class_classificationSet;
	}
	
	public void setCfeaddr_class_classificationSet(Set<CfEAddr_Class> cfeaddr_class_classificationSet) {
		this.cfeaddr_class_classificationSet = cfeaddr_class_classificationSet;
	}
	
	public Set<CfEquip_Class> getCfequip_class_classificationSet() {
		return this.cfequip_class_classificationSet;
	}
	
	public void setCfequip_class_classificationSet(Set<CfEquip_Class> cfequip_class_classificationSet) {
		this.cfequip_class_classificationSet = cfequip_class_classificationSet;
	}
	
	public Set<CfEquip_Equip> getCfequip_equip_classificationSet() {
		return this.cfequip_equip_classificationSet;
	}
	
	public void setCfequip_equip_classificationSet(Set<CfEquip_Equip> cfequip_equip_classificationSet) {
		this.cfequip_equip_classificationSet = cfequip_equip_classificationSet;
	}
	
	public Set<CfEquip_Event> getCfequip_event_classificationSet() {
		return this.cfequip_event_classificationSet;
	}
	
	public void setCfequip_event_classificationSet(Set<CfEquip_Event> cfequip_event_classificationSet) {
		this.cfequip_event_classificationSet = cfequip_event_classificationSet;
	}
	
	public Set<CfEquip_Fund> getCfequip_fund_classificationSet() {
		return this.cfequip_fund_classificationSet;
	}
	
	public void setCfequip_fund_classificationSet(Set<CfEquip_Fund> cfequip_fund_classificationSet) {
		this.cfequip_fund_classificationSet = cfequip_fund_classificationSet;
	}
	
	public Set<CfEquip_Indic> getCfequip_indic_classificationSet() {
		return this.cfequip_indic_classificationSet;
	}
	
	public void setCfequip_indic_classificationSet(Set<CfEquip_Indic> cfequip_indic_classificationSet) {
		this.cfequip_indic_classificationSet = cfequip_indic_classificationSet;
	}
	
	public Set<CfEquip_Meas> getCfequip_meas_classificationSet() {
		return this.cfequip_meas_classificationSet;
	}
	
	public void setCfequip_meas_classificationSet(Set<CfEquip_Meas> cfequip_meas_classificationSet) {
		this.cfequip_meas_classificationSet = cfequip_meas_classificationSet;
	}
	
	public Set<CfEquip_Medium> getCfequip_medium_classificationSet() {
		return this.cfequip_medium_classificationSet;
	}
	
	public void setCfequip_medium_classificationSet(Set<CfEquip_Medium> cfequip_medium_classificationSet) {
		this.cfequip_medium_classificationSet = cfequip_medium_classificationSet;
	}
	
	public Set<CfEquip_PAddr> getCfequip_paddr_classificationSet() {
		return this.cfequip_paddr_classificationSet;
	}
	
	public void setCfequip_paddr_classificationSet(Set<CfEquip_PAddr> cfequip_paddr_classificationSet) {
		this.cfequip_paddr_classificationSet = cfequip_paddr_classificationSet;
	}
	
	public Set<CfEquip_Srv> getCfequip_srv_classificationSet() {
		return this.cfequip_srv_classificationSet;
	}
	
	public void setCfequip_srv_classificationSet(Set<CfEquip_Srv> cfequip_srv_classificationSet) {
		this.cfequip_srv_classificationSet = cfequip_srv_classificationSet;
	}
	
	public Set<CfEvent_Class> getCfevent_class_classificationSet() {
		return this.cfevent_class_classificationSet;
	}
	
	public void setCfevent_class_classificationSet(Set<CfEvent_Class> cfevent_class_classificationSet) {
		this.cfevent_class_classificationSet = cfevent_class_classificationSet;
	}
	
	public Set<CfEvent_Event> getCfevent_event_classificationSet() {
		return this.cfevent_event_classificationSet;
	}
	
	public void setCfevent_event_classificationSet(Set<CfEvent_Event> cfevent_event_classificationSet) {
		this.cfevent_event_classificationSet = cfevent_event_classificationSet;
	}
	
	public Set<CfEvent_Fund> getCfevent_fund_classificationSet() {
		return this.cfevent_fund_classificationSet;
	}
	
	public void setCfevent_fund_classificationSet(Set<CfEvent_Fund> cfevent_fund_classificationSet) {
		this.cfevent_fund_classificationSet = cfevent_fund_classificationSet;
	}
	
	public Set<CfEvent_Indic> getCfevent_indic_classificationSet() {
		return this.cfevent_indic_classificationSet;
	}
	
	public void setCfevent_indic_classificationSet(Set<CfEvent_Indic> cfevent_indic_classificationSet) {
		this.cfevent_indic_classificationSet = cfevent_indic_classificationSet;
	}
	
	public Set<CfEvent_Meas> getCfevent_meas_classificationSet() {
		return this.cfevent_meas_classificationSet;
	}
	
	public void setCfevent_meas_classificationSet(Set<CfEvent_Meas> cfevent_meas_classificationSet) {
		this.cfevent_meas_classificationSet = cfevent_meas_classificationSet;
	}
	
	public Set<CfEvent_Medium> getCfevent_medium_classificationSet() {
		return this.cfevent_medium_classificationSet;
	}
	
	public void setCfevent_medium_classificationSet(Set<CfEvent_Medium> cfevent_medium_classificationSet) {
		this.cfevent_medium_classificationSet = cfevent_medium_classificationSet;
	}
	
	public Set<CfExpSkills_Class> getCfexpskills_class_classificationSet() {
		return this.cfexpskills_class_classificationSet;
	}
	
	public void setCfexpskills_class_classificationSet(Set<CfExpSkills_Class> cfexpskills_class_classificationSet) {
		this.cfexpskills_class_classificationSet = cfexpskills_class_classificationSet;
	}
	
	public Set<CfFacil_Class> getCffacil_class_classificationSet() {
		return this.cffacil_class_classificationSet;
	}
	
	public void setCffacil_class_classificationSet(Set<CfFacil_Class> cffacil_class_classificationSet) {
		this.cffacil_class_classificationSet = cffacil_class_classificationSet;
	}
	
	public Set<CfFacil_Equip> getCffacil_equip_classificationSet() {
		return this.cffacil_equip_classificationSet;
	}
	
	public void setCffacil_equip_classificationSet(Set<CfFacil_Equip> cffacil_equip_classificationSet) {
		this.cffacil_equip_classificationSet = cffacil_equip_classificationSet;
	}
	
	public Set<CfFacil_Event> getCffacil_event_classificationSet() {
		return this.cffacil_event_classificationSet;
	}
	
	public void setCffacil_event_classificationSet(Set<CfFacil_Event> cffacil_event_classificationSet) {
		this.cffacil_event_classificationSet = cffacil_event_classificationSet;
	}
	
	public Set<CfFacil_Facil> getCffacil_facil_classificationSet() {
		return this.cffacil_facil_classificationSet;
	}
	
	public void setCffacil_facil_classificationSet(Set<CfFacil_Facil> cffacil_facil_classificationSet) {
		this.cffacil_facil_classificationSet = cffacil_facil_classificationSet;
	}
	
	public Set<CfFacil_Fund> getCffacil_fund_classificationSet() {
		return this.cffacil_fund_classificationSet;
	}
	
	public void setCffacil_fund_classificationSet(Set<CfFacil_Fund> cffacil_fund_classificationSet) {
		this.cffacil_fund_classificationSet = cffacil_fund_classificationSet;
	}
	
	public Set<CfFacil_Indic> getCffacil_indic_classificationSet() {
		return this.cffacil_indic_classificationSet;
	}
	
	public void setCffacil_indic_classificationSet(Set<CfFacil_Indic> cffacil_indic_classificationSet) {
		this.cffacil_indic_classificationSet = cffacil_indic_classificationSet;
	}
	
	public Set<CfFacil_Meas> getCffacil_meas_classificationSet() {
		return this.cffacil_meas_classificationSet;
	}
	
	public void setCffacil_meas_classificationSet(Set<CfFacil_Meas> cffacil_meas_classificationSet) {
		this.cffacil_meas_classificationSet = cffacil_meas_classificationSet;
	}
	
	public Set<CfFacil_Medium> getCffacil_medium_classificationSet() {
		return this.cffacil_medium_classificationSet;
	}
	
	public void setCffacil_medium_classificationSet(Set<CfFacil_Medium> cffacil_medium_classificationSet) {
		this.cffacil_medium_classificationSet = cffacil_medium_classificationSet;
	}
	
	public Set<CfFacil_PAddr> getCffacil_paddr_classificationSet() {
		return this.cffacil_paddr_classificationSet;
	}
	
	public void setCffacil_paddr_classificationSet(Set<CfFacil_PAddr> cffacil_paddr_classificationSet) {
		this.cffacil_paddr_classificationSet = cffacil_paddr_classificationSet;
	}
	
	public Set<CfFacil_Srv> getCffacil_srv_classificationSet() {
		return this.cffacil_srv_classificationSet;
	}
	
	public void setCffacil_srv_classificationSet(Set<CfFacil_Srv> cffacil_srv_classificationSet) {
		this.cffacil_srv_classificationSet = cffacil_srv_classificationSet;
	}
	
	public Set<CfFedId> getCffedid_classificationSet() {
		return this.cffedid_classificationSet;
	}
	
	public void setCffedid_classificationSet(Set<CfFedId> cffedid_classificationSet) {
		this.cffedid_classificationSet = cffedid_classificationSet;
	}
	
	public Set<CfFedId_Class> getCffedid_class_classificationSet() {
		return this.cffedid_class_classificationSet;
	}
	
	public void setCffedid_class_classificationSet(Set<CfFedId_Class> cffedid_class_classificationSet) {
		this.cffedid_class_classificationSet = cffedid_class_classificationSet;
	}
	
	public Set<CfFund_Fund> getCffund_fund_classificationSet() {
		return this.cffund_fund_classificationSet;
	}
	
	public void setCffund_fund_classificationSet(Set<CfFund_Fund> cffund_fund_classificationSet) {
		this.cffund_fund_classificationSet = cffund_fund_classificationSet;
	}
	
	public Set<CfFund_Class> getCffund_class_classificationSet() {
		return this.cffund_class_classificationSet;
	}
	
	public void setCffund_class_classificationSet(Set<CfFund_Class> cffund_class_classificationSet) {
		this.cffund_class_classificationSet = cffund_class_classificationSet;
	}
	
	public Set<CfFund_Indic> getCffund_indic_classificationSet() {
		return this.cffund_indic_classificationSet;
	}
	
	public void setCffund_indic_classificationSet(Set<CfFund_Indic> cffund_indic_classificationSet) {
		this.cffund_indic_classificationSet = cffund_indic_classificationSet;
	}
	
	public Set<CfFund_Meas> getCffund_meas_classificationSet() {
		return this.cffund_meas_classificationSet;
	}
	
	public void setCffund_meas_classificationSet(Set<CfFund_Meas> cffund_meas_classificationSet) {
		this.cffund_meas_classificationSet = cffund_meas_classificationSet;
	}
	
	public Set<CfGeoBBox_GeoBBox> getCfgeobbox_geobbox_classificationSet() {
		return this.cfgeobbox_geobbox_classificationSet;
	}
	
	public void setCfgeobbox_geobbox_classificationSet(Set<CfGeoBBox_GeoBBox> cfgeobbox_geobbox_classificationSet) {
		this.cfgeobbox_geobbox_classificationSet = cfgeobbox_geobbox_classificationSet;
	}
	
	public Set<CfGeoBBox_Class> getCfgeobbox_class_classificationSet() {
		return this.cfgeobbox_class_classificationSet;
	}
	
	public void setCfgeobbox_class_classificationSet(Set<CfGeoBBox_Class> cfgeobbox_class_classificationSet) {
		this.cfgeobbox_class_classificationSet = cfgeobbox_class_classificationSet;
	}
	
	public Set<CfIndic_Indic> getCfindic_indic_classificationSet() {
		return this.cfindic_indic_classificationSet;
	}
	
	public void setCfindic_indic_classificationSet(Set<CfIndic_Indic> cfindic_indic_classificationSet) {
		this.cfindic_indic_classificationSet = cfindic_indic_classificationSet;
	}
	
	public Set<CfIndic_Class> getCfindic_class_classificationSet() {
		return this.cfindic_class_classificationSet;
	}
	
	public void setCfindic_class_classificationSet(Set<CfIndic_Class> cfindic_class_classificationSet) {
		this.cfindic_class_classificationSet = cfindic_class_classificationSet;
	}
	
	public Set<CfIndic_Meas> getCfindic_meas_classificationSet() {
		return this.cfindic_meas_classificationSet;
	}
	
	public void setCfindic_meas_classificationSet(Set<CfIndic_Meas> cfindic_meas_classificationSet) {
		this.cfindic_meas_classificationSet = cfindic_meas_classificationSet;
	}
	
	public Set<CfLang_Class> getCflang_class_classificationSet() {
		return this.cflang_class_classificationSet;
	}
	
	public void setCflang_class_classificationSet(Set<CfLang_Class> cflang_class_classificationSet) {
		this.cflang_class_classificationSet = cflang_class_classificationSet;
	}
	
	public Set<CfMeas_Meas> getCfmeas_meas_classificationSet() {
		return this.cfmeas_meas_classificationSet;
	}
	
	public void setCfmeas_meas_classificationSet(Set<CfMeas_Meas> cfmeas_meas_classificationSet) {
		this.cfmeas_meas_classificationSet = cfmeas_meas_classificationSet;
	}
	
	public Set<CfMeas_Class> getCfmeas_class_classificationSet() {
		return this.cfmeas_class_classificationSet;
	}
	
	public void setCfmeas_class_classificationSet(Set<CfMeas_Class> cfmeas_class_classificationSet) {
		this.cfmeas_class_classificationSet = cfmeas_class_classificationSet;
	}
	
	public Set<CfMedium_Meas> getCfmedium_meas_classificationSet() {
		return this.cfmedium_meas_classificationSet;
	}
	
	public void setCfmedium_meas_classificationSet(Set<CfMedium_Meas> cfmedium_meas_classificationSet) {
		this.cfmedium_meas_classificationSet = cfmedium_meas_classificationSet;
	}
	
	public Set<CfMedium_Medium> getCfmedium_medium_classificationSet() {
		return this.cfmedium_medium_classificationSet;
	}
	
	public void setCfmedium_medium_classificationSet(Set<CfMedium_Medium> cfmedium_medium_classificationSet) {
		this.cfmedium_medium_classificationSet = cfmedium_medium_classificationSet;
	}
	
	public Set<CfMedium_Class> getCfmedium_class_classificationSet() {
		return this.cfmedium_class_classificationSet;
	}
	
	public void setCfmedium_class_classificationSet(Set<CfMedium_Class> cfmedium_class_classificationSet) {
		this.cfmedium_class_classificationSet = cfmedium_class_classificationSet;
	}
	
	public Set<CfMedium_Fund> getCfmedium_fund_classificationSet() {
		return this.cfmedium_fund_classificationSet;
	}
	
	public void setCfmedium_fund_classificationSet(Set<CfMedium_Fund> cfmedium_fund_classificationSet) {
		this.cfmedium_fund_classificationSet = cfmedium_fund_classificationSet;
	}
	
	public Set<CfMedium_Indic> getCfmedium_indic_classificationSet() {
		return this.cfmedium_indic_classificationSet;
	}
	
	public void setCfmedium_indic_classificationSet(Set<CfMedium_Indic> cfmedium_indic_classificationSet) {
		this.cfmedium_indic_classificationSet = cfmedium_indic_classificationSet;
	}
	
	public Set<CfMetrics_Class> getCfmetrics_class_classificationSet() {
		return this.cfmetrics_class_classificationSet;
	}
	
	public void setCfmetrics_class_classificationSet(Set<CfMetrics_Class> cfmetrics_class_classificationSet) {
		this.cfmetrics_class_classificationSet = cfmetrics_class_classificationSet;
	}
	
	public Set<CfOrgUnit_OrgUnit> getCforgunit_orgunit_classificationSet() {
		return this.cforgunit_orgunit_classificationSet;
	}
	
	public void setCforgunit_orgunit_classificationSet(Set<CfOrgUnit_OrgUnit> cforgunit_orgunit_classificationSet) {
		this.cforgunit_orgunit_classificationSet = cforgunit_orgunit_classificationSet;
	}
	
	public Set<CfOrgUnit_Class> getCforgunit_class_classificationSet() {
		return this.cforgunit_class_classificationSet;
	}
	
	public void setCforgunit_class_classificationSet(Set<CfOrgUnit_Class> cforgunit_class_classificationSet) {
		this.cforgunit_class_classificationSet = cforgunit_class_classificationSet;
	}
	
	public Set<CfOrgUnit_DC> getCforgunit_dc_classificationSet() {
		return this.cforgunit_dc_classificationSet;
	}
	
	public void setCforgunit_dc_classificationSet(Set<CfOrgUnit_DC> cforgunit_dc_classificationSet) {
		this.cforgunit_dc_classificationSet = cforgunit_dc_classificationSet;
	}
	
	public Set<CfOrgUnit_EAddr> getCforgunit_eaddr_classificationSet() {
		return this.cforgunit_eaddr_classificationSet;
	}
	
	public void setCforgunit_eaddr_classificationSet(Set<CfOrgUnit_EAddr> cforgunit_eaddr_classificationSet) {
		this.cforgunit_eaddr_classificationSet = cforgunit_eaddr_classificationSet;
	}
	
	public Set<CfOrgUnit_Equip> getCforgunit_equip_classificationSet() {
		return this.cforgunit_equip_classificationSet;
	}
	
	public void setCforgunit_equip_classificationSet(Set<CfOrgUnit_Equip> cforgunit_equip_classificationSet) {
		this.cforgunit_equip_classificationSet = cforgunit_equip_classificationSet;
	}
	
	public Set<CfOrgUnit_Event> getCforgunit_event_classificationSet() {
		return this.cforgunit_event_classificationSet;
	}
	
	public void setCforgunit_event_classificationSet(Set<CfOrgUnit_Event> cforgunit_event_classificationSet) {
		this.cforgunit_event_classificationSet = cforgunit_event_classificationSet;
	}
	
	public Set<CfOrgUnit_ExpSkills> getCforgunit_expskills_classificationSet() {
		return this.cforgunit_expskills_classificationSet;
	}
	
	public void setCforgunit_expskills_classificationSet(Set<CfOrgUnit_ExpSkills> cforgunit_expskills_classificationSet) {
		this.cforgunit_expskills_classificationSet = cforgunit_expskills_classificationSet;
	}
	
	public Set<CfOrgUnit_Facil> getCforgunit_facil_classificationSet() {
		return this.cforgunit_facil_classificationSet;
	}
	
	public void setCforgunit_facil_classificationSet(Set<CfOrgUnit_Facil> cforgunit_facil_classificationSet) {
		this.cforgunit_facil_classificationSet = cforgunit_facil_classificationSet;
	}
	
	public Set<CfOrgUnit_Fund> getCforgunit_fund_classificationSet() {
		return this.cforgunit_fund_classificationSet;
	}
	
	public void setCforgunit_fund_classificationSet(Set<CfOrgUnit_Fund> cforgunit_fund_classificationSet) {
		this.cforgunit_fund_classificationSet = cforgunit_fund_classificationSet;
	}
	
	public Set<CfOrgUnit_Indic> getCforgunit_indic_classificationSet() {
		return this.cforgunit_indic_classificationSet;
	}
	
	public void setCforgunit_indic_classificationSet(Set<CfOrgUnit_Indic> cforgunit_indic_classificationSet) {
		this.cforgunit_indic_classificationSet = cforgunit_indic_classificationSet;
	}
	
	public Set<CfOrgUnit_Meas> getCforgunit_meas_classificationSet() {
		return this.cforgunit_meas_classificationSet;
	}
	
	public void setCforgunit_meas_classificationSet(Set<CfOrgUnit_Meas> cforgunit_meas_classificationSet) {
		this.cforgunit_meas_classificationSet = cforgunit_meas_classificationSet;
	}
	
	public Set<CfOrgUnit_Medium> getCforgunit_medium_classificationSet() {
		return this.cforgunit_medium_classificationSet;
	}
	
	public void setCforgunit_medium_classificationSet(Set<CfOrgUnit_Medium> cforgunit_medium_classificationSet) {
		this.cforgunit_medium_classificationSet = cforgunit_medium_classificationSet;
	}
	
	public Set<CfOrgUnit_PAddr> getCforgunit_paddr_classificationSet() {
		return this.cforgunit_paddr_classificationSet;
	}
	
	public void setCforgunit_paddr_classificationSet(Set<CfOrgUnit_PAddr> cforgunit_paddr_classificationSet) {
		this.cforgunit_paddr_classificationSet = cforgunit_paddr_classificationSet;
	}
	
	public Set<CfOrgUnit_Prize> getCforgunit_prize_classificationSet() {
		return this.cforgunit_prize_classificationSet;
	}
	
	public void setCforgunit_prize_classificationSet(Set<CfOrgUnit_Prize> cforgunit_prize_classificationSet) {
		this.cforgunit_prize_classificationSet = cforgunit_prize_classificationSet;
	}
	
	public Set<CfOrgUnit_ResPat> getCforgunit_respat_classificationSet() {
		return this.cforgunit_respat_classificationSet;
	}
	
	public void setCforgunit_respat_classificationSet(Set<CfOrgUnit_ResPat> cforgunit_respat_classificationSet) {
		this.cforgunit_respat_classificationSet = cforgunit_respat_classificationSet;
	}
	
	public Set<CfOrgUnit_ResProd> getCforgunit_resprod_classificationSet() {
		return this.cforgunit_resprod_classificationSet;
	}
	
	public void setCforgunit_resprod_classificationSet(Set<CfOrgUnit_ResProd> cforgunit_resprod_classificationSet) {
		this.cforgunit_resprod_classificationSet = cforgunit_resprod_classificationSet;
	}
	
	public Set<CfOrgUnit_ResPubl> getCforgunit_respubl_classificationSet() {
		return this.cforgunit_respubl_classificationSet;
	}
	
	public void setCforgunit_respubl_classificationSet(Set<CfOrgUnit_ResPubl> cforgunit_respubl_classificationSet) {
		this.cforgunit_respubl_classificationSet = cforgunit_respubl_classificationSet;
	}
	
	public Set<CfOrgUnit_Srv> getCforgunit_srv_classificationSet() {
		return this.cforgunit_srv_classificationSet;
	}
	
	public void setCforgunit_srv_classificationSet(Set<CfOrgUnit_Srv> cforgunit_srv_classificationSet) {
		this.cforgunit_srv_classificationSet = cforgunit_srv_classificationSet;
	}
	
	public Set<CfPAddr_Class> getCfpaddr_class_classificationSet() {
		return this.cfpaddr_class_classificationSet;
	}
	
	public void setCfpaddr_class_classificationSet(Set<CfPAddr_Class> cfpaddr_class_classificationSet) {
		this.cfpaddr_class_classificationSet = cfpaddr_class_classificationSet;
	}
	
	public Set<CfPAddr_GeoBBox> getCfpaddr_geobbox_classificationSet() {
		return this.cfpaddr_geobbox_classificationSet;
	}
	
	public void setCfpaddr_geobbox_classificationSet(Set<CfPAddr_GeoBBox> cfpaddr_geobbox_classificationSet) {
		this.cfpaddr_geobbox_classificationSet = cfpaddr_geobbox_classificationSet;
	}
	
	public Set<CfPers_Class> getCfpers_class_classificationSet() {
		return this.cfpers_class_classificationSet;
	}
	
	public void setCfpers_class_classificationSet(Set<CfPers_Class> cfpers_class_classificationSet) {
		this.cfpers_class_classificationSet = cfpers_class_classificationSet;
	}
	
	public Set<CfPers_Country> getCfpers_country_classificationSet() {
		return this.cfpers_country_classificationSet;
	}
	
	public void setCfpers_country_classificationSet(Set<CfPers_Country> cfpers_country_classificationSet) {
		this.cfpers_country_classificationSet = cfpers_country_classificationSet;
	}
	
	public Set<CfPers_CV> getCfpers_cv_classificationSet() {
		return this.cfpers_cv_classificationSet;
	}
	
	public void setCfpers_cv_classificationSet(Set<CfPers_CV> cfpers_cv_classificationSet) {
		this.cfpers_cv_classificationSet = cfpers_cv_classificationSet;
	}
	
	public Set<CfPers_DC> getCfpers_dc_classificationSet() {
		return this.cfpers_dc_classificationSet;
	}
	
	public void setCfpers_dc_classificationSet(Set<CfPers_DC> cfpers_dc_classificationSet) {
		this.cfpers_dc_classificationSet = cfpers_dc_classificationSet;
	}
	
	public Set<CfPers_EAddr> getCfpers_eaddr_classificationSet() {
		return this.cfpers_eaddr_classificationSet;
	}
	
	public void setCfpers_eaddr_classificationSet(Set<CfPers_EAddr> cfpers_eaddr_classificationSet) {
		this.cfpers_eaddr_classificationSet = cfpers_eaddr_classificationSet;
	}
	
	public Set<CfPers_Equip> getCfpers_equip_classificationSet() {
		return this.cfpers_equip_classificationSet;
	}
	
	public void setCfpers_equip_classificationSet(Set<CfPers_Equip> cfpers_equip_classificationSet) {
		this.cfpers_equip_classificationSet = cfpers_equip_classificationSet;
	}
	
	public Set<CfPers_Event> getCfpers_event_classificationSet() {
		return this.cfpers_event_classificationSet;
	}
	
	public void setCfpers_event_classificationSet(Set<CfPers_Event> cfpers_event_classificationSet) {
		this.cfpers_event_classificationSet = cfpers_event_classificationSet;
	}
	
	public Set<CfPers_ExpSkills> getCfpers_expskills_classificationSet() {
		return this.cfpers_expskills_classificationSet;
	}
	
	public void setCfpers_expskills_classificationSet(Set<CfPers_ExpSkills> cfpers_expskills_classificationSet) {
		this.cfpers_expskills_classificationSet = cfpers_expskills_classificationSet;
	}
	
	public Set<CfPers_Facil> getCfpers_facil_classificationSet() {
		return this.cfpers_facil_classificationSet;
	}
	
	public void setCfpers_facil_classificationSet(Set<CfPers_Facil> cfpers_facil_classificationSet) {
		this.cfpers_facil_classificationSet = cfpers_facil_classificationSet;
	}
	
	public Set<CfPers_Fund> getCfpers_fund_classificationSet() {
		return this.cfpers_fund_classificationSet;
	}
	
	public void setCfpers_fund_classificationSet(Set<CfPers_Fund> cfpers_fund_classificationSet) {
		this.cfpers_fund_classificationSet = cfpers_fund_classificationSet;
	}
	
	public Set<CfPers_Indic> getCfpers_indic_classificationSet() {
		return this.cfpers_indic_classificationSet;
	}
	
	public void setCfpers_indic_classificationSet(Set<CfPers_Indic> cfpers_indic_classificationSet) {
		this.cfpers_indic_classificationSet = cfpers_indic_classificationSet;
	}
	
	public Set<CfPers_Lang> getCfpers_lang_classificationSet() {
		return this.cfpers_lang_classificationSet;
	}
	
	public void setCfpers_lang_classificationSet(Set<CfPers_Lang> cfpers_lang_classificationSet) {
		this.cfpers_lang_classificationSet = cfpers_lang_classificationSet;
	}
	
	public Set<CfPers_Meas> getCfpers_meas_classificationSet() {
		return this.cfpers_meas_classificationSet;
	}
	
	public void setCfpers_meas_classificationSet(Set<CfPers_Meas> cfpers_meas_classificationSet) {
		this.cfpers_meas_classificationSet = cfpers_meas_classificationSet;
	}
	
	public Set<CfPers_Medium> getCfpers_medium_classificationSet() {
		return this.cfpers_medium_classificationSet;
	}
	
	public void setCfpers_medium_classificationSet(Set<CfPers_Medium> cfpers_medium_classificationSet) {
		this.cfpers_medium_classificationSet = cfpers_medium_classificationSet;
	}
	
	public Set<CfPersName_Pers> getCfpersname_pers_classificationSet() {
		return this.cfpersname_pers_classificationSet;
	}
	
	public void setCfpersname_pers_classificationSet(Set<CfPersName_Pers> cfpersname_pers_classificationSet) {
		this.cfpersname_pers_classificationSet = cfpersname_pers_classificationSet;
	}
	
	public Set<CfPers_OrgUnit> getCfpers_orgunit_classificationSet() {
		return this.cfpers_orgunit_classificationSet;
	}
	
	public void setCfpers_orgunit_classificationSet(Set<CfPers_OrgUnit> cfpers_orgunit_classificationSet) {
		this.cfpers_orgunit_classificationSet = cfpers_orgunit_classificationSet;
	}
	
	public Set<CfPers_Pers> getCfpers_pers_classificationSet() {
		return this.cfpers_pers_classificationSet;
	}
	
	public void setCfpers_pers_classificationSet(Set<CfPers_Pers> cfpers_pers_classificationSet) {
		this.cfpers_pers_classificationSet = cfpers_pers_classificationSet;
	}
	
	public Set<CfPers_PAddr> getCfpers_paddr_classificationSet() {
		return this.cfpers_paddr_classificationSet;
	}
	
	public void setCfpers_paddr_classificationSet(Set<CfPers_PAddr> cfpers_paddr_classificationSet) {
		this.cfpers_paddr_classificationSet = cfpers_paddr_classificationSet;
	}
	
	public Set<CfPers_Prize> getCfpers_prize_classificationSet() {
		return this.cfpers_prize_classificationSet;
	}
	
	public void setCfpers_prize_classificationSet(Set<CfPers_Prize> cfpers_prize_classificationSet) {
		this.cfpers_prize_classificationSet = cfpers_prize_classificationSet;
	}
	
	public Set<CfPers_Qual> getCfpers_qual_classificationSet() {
		return this.cfpers_qual_classificationSet;
	}
	
	public void setCfpers_qual_classificationSet(Set<CfPers_Qual> cfpers_qual_classificationSet) {
		this.cfpers_qual_classificationSet = cfpers_qual_classificationSet;
	}
	
	public Set<CfPers_ResPat> getCfpers_respat_classificationSet() {
		return this.cfpers_respat_classificationSet;
	}
	
	public void setCfpers_respat_classificationSet(Set<CfPers_ResPat> cfpers_respat_classificationSet) {
		this.cfpers_respat_classificationSet = cfpers_respat_classificationSet;
	}
	
	public Set<CfPers_ResProd> getCfpers_resprod_classificationSet() {
		return this.cfpers_resprod_classificationSet;
	}
	
	public void setCfpers_resprod_classificationSet(Set<CfPers_ResProd> cfpers_resprod_classificationSet) {
		this.cfpers_resprod_classificationSet = cfpers_resprod_classificationSet;
	}
	
	public Set<CfPers_ResPubl> getCfpers_respubl_classificationSet() {
		return this.cfpers_respubl_classificationSet;
	}
	
	public void setCfpers_respubl_classificationSet(Set<CfPers_ResPubl> cfpers_respubl_classificationSet) {
		this.cfpers_respubl_classificationSet = cfpers_respubl_classificationSet;
	}
	
	public Set<CfPers_Srv> getCfpers_srv_classificationSet() {
		return this.cfpers_srv_classificationSet;
	}
	
	public void setCfpers_srv_classificationSet(Set<CfPers_Srv> cfpers_srv_classificationSet) {
		this.cfpers_srv_classificationSet = cfpers_srv_classificationSet;
	}
	
	public Set<CfPrize_Class> getCfprize_class_classificationSet() {
		return this.cfprize_class_classificationSet;
	}
	
	public void setCfprize_class_classificationSet(Set<CfPrize_Class> cfprize_class_classificationSet) {
		this.cfprize_class_classificationSet = cfprize_class_classificationSet;
	}
	
	public Set<CfProj_Proj> getCfproj_proj_classificationSet() {
		return this.cfproj_proj_classificationSet;
	}
	
	public void setCfproj_proj_classificationSet(Set<CfProj_Proj> cfproj_proj_classificationSet) {
		this.cfproj_proj_classificationSet = cfproj_proj_classificationSet;
	}
	
	public Set<CfProj_Class> getCfproj_class_classificationSet() {
		return this.cfproj_class_classificationSet;
	}
	
	public void setCfproj_class_classificationSet(Set<CfProj_Class> cfproj_class_classificationSet) {
		this.cfproj_class_classificationSet = cfproj_class_classificationSet;
	}
	
	public Set<CfProj_DC> getCfproj_dc_classificationSet() {
		return this.cfproj_dc_classificationSet;
	}
	
	public void setCfproj_dc_classificationSet(Set<CfProj_DC> cfproj_dc_classificationSet) {
		this.cfproj_dc_classificationSet = cfproj_dc_classificationSet;
	}
	
	public Set<CfProj_Equip> getCfproj_equip_classificationSet() {
		return this.cfproj_equip_classificationSet;
	}
	
	public void setCfproj_equip_classificationSet(Set<CfProj_Equip> cfproj_equip_classificationSet) {
		this.cfproj_equip_classificationSet = cfproj_equip_classificationSet;
	}
	
	public Set<CfProj_Event> getCfproj_event_classificationSet() {
		return this.cfproj_event_classificationSet;
	}
	
	public void setCfproj_event_classificationSet(Set<CfProj_Event> cfproj_event_classificationSet) {
		this.cfproj_event_classificationSet = cfproj_event_classificationSet;
	}
	
	public Set<CfProj_Facil> getCfproj_facil_classificationSet() {
		return this.cfproj_facil_classificationSet;
	}
	
	public void setCfproj_facil_classificationSet(Set<CfProj_Facil> cfproj_facil_classificationSet) {
		this.cfproj_facil_classificationSet = cfproj_facil_classificationSet;
	}
	
	public Set<CfProj_Fund> getCfproj_fund_classificationSet() {
		return this.cfproj_fund_classificationSet;
	}
	
	public void setCfproj_fund_classificationSet(Set<CfProj_Fund> cfproj_fund_classificationSet) {
		this.cfproj_fund_classificationSet = cfproj_fund_classificationSet;
	}
	
	public Set<CfProj_Indic> getCfproj_indic_classificationSet() {
		return this.cfproj_indic_classificationSet;
	}
	
	public void setCfproj_indic_classificationSet(Set<CfProj_Indic> cfproj_indic_classificationSet) {
		this.cfproj_indic_classificationSet = cfproj_indic_classificationSet;
	}
	
	public Set<CfProj_Meas> getCfproj_meas_classificationSet() {
		return this.cfproj_meas_classificationSet;
	}
	
	public void setCfproj_meas_classificationSet(Set<CfProj_Meas> cfproj_meas_classificationSet) {
		this.cfproj_meas_classificationSet = cfproj_meas_classificationSet;
	}
	
	public Set<CfProj_Medium> getCfproj_medium_classificationSet() {
		return this.cfproj_medium_classificationSet;
	}
	
	public void setCfproj_medium_classificationSet(Set<CfProj_Medium> cfproj_medium_classificationSet) {
		this.cfproj_medium_classificationSet = cfproj_medium_classificationSet;
	}
	
	public Set<CfProj_OrgUnit> getCfproj_orgunit_classificationSet() {
		return this.cfproj_orgunit_classificationSet;
	}
	
	public void setCfproj_orgunit_classificationSet(Set<CfProj_OrgUnit> cfproj_orgunit_classificationSet) {
		this.cfproj_orgunit_classificationSet = cfproj_orgunit_classificationSet;
	}
	
	public Set<CfProj_Pers> getCfproj_pers_classificationSet() {
		return this.cfproj_pers_classificationSet;
	}
	
	public void setCfproj_pers_classificationSet(Set<CfProj_Pers> cfproj_pers_classificationSet) {
		this.cfproj_pers_classificationSet = cfproj_pers_classificationSet;
	}
	
	public Set<CfProj_Prize> getCfproj_prize_classificationSet() {
		return this.cfproj_prize_classificationSet;
	}
	
	public void setCfproj_prize_classificationSet(Set<CfProj_Prize> cfproj_prize_classificationSet) {
		this.cfproj_prize_classificationSet = cfproj_prize_classificationSet;
	}
	
	public Set<CfProj_ResPat> getCfproj_respat_classificationSet() {
		return this.cfproj_respat_classificationSet;
	}
	
	public void setCfproj_respat_classificationSet(Set<CfProj_ResPat> cfproj_respat_classificationSet) {
		this.cfproj_respat_classificationSet = cfproj_respat_classificationSet;
	}
	
	public Set<CfProj_ResProd> getCfproj_resprod_classificationSet() {
		return this.cfproj_resprod_classificationSet;
	}
	
	public void setCfproj_resprod_classificationSet(Set<CfProj_ResProd> cfproj_resprod_classificationSet) {
		this.cfproj_resprod_classificationSet = cfproj_resprod_classificationSet;
	}
	
	public Set<CfProj_ResPubl> getCfproj_respubl_classificationSet() {
		return this.cfproj_respubl_classificationSet;
	}
	
	public void setCfproj_respubl_classificationSet(Set<CfProj_ResPubl> cfproj_respubl_classificationSet) {
		this.cfproj_respubl_classificationSet = cfproj_respubl_classificationSet;
	}
	
	public Set<CfProj_Srv> getCfproj_srv_classificationSet() {
		return this.cfproj_srv_classificationSet;
	}
	
	public void setCfproj_srv_classificationSet(Set<CfProj_Srv> cfproj_srv_classificationSet) {
		this.cfproj_srv_classificationSet = cfproj_srv_classificationSet;
	}
	
	public Set<CfQual_Class> getCfqual_class_classificationSet() {
		return this.cfqual_class_classificationSet;
	}
	
	public void setCfqual_class_classificationSet(Set<CfQual_Class> cfqual_class_classificationSet) {
		this.cfqual_class_classificationSet = cfqual_class_classificationSet;
	}
	
	public Set<CfResPat_ResPat> getCfrespat_respat_classificationSet() {
		return this.cfrespat_respat_classificationSet;
	}
	
	public void setCfrespat_respat_classificationSet(Set<CfResPat_ResPat> cfrespat_respat_classificationSet) {
		this.cfrespat_respat_classificationSet = cfrespat_respat_classificationSet;
	}
	
	public Set<CfResPat_Class> getCfrespat_class_classificationSet() {
		return this.cfrespat_class_classificationSet;
	}
	
	public void setCfrespat_class_classificationSet(Set<CfResPat_Class> cfrespat_class_classificationSet) {
		this.cfrespat_class_classificationSet = cfrespat_class_classificationSet;
	}
	
	public Set<CfResPat_Equip> getCfrespat_equip_classificationSet() {
		return this.cfrespat_equip_classificationSet;
	}
	
	public void setCfrespat_equip_classificationSet(Set<CfResPat_Equip> cfrespat_equip_classificationSet) {
		this.cfrespat_equip_classificationSet = cfrespat_equip_classificationSet;
	}
	
	public Set<CfResPat_Facil> getCfrespat_facil_classificationSet() {
		return this.cfrespat_facil_classificationSet;
	}
	
	public void setCfrespat_facil_classificationSet(Set<CfResPat_Facil> cfrespat_facil_classificationSet) {
		this.cfrespat_facil_classificationSet = cfrespat_facil_classificationSet;
	}
	
	public Set<CfResPat_Fund> getCfrespat_fund_classificationSet() {
		return this.cfrespat_fund_classificationSet;
	}
	
	public void setCfrespat_fund_classificationSet(Set<CfResPat_Fund> cfrespat_fund_classificationSet) {
		this.cfrespat_fund_classificationSet = cfrespat_fund_classificationSet;
	}
	
	public Set<CfResPat_Indic> getCfrespat_indic_classificationSet() {
		return this.cfrespat_indic_classificationSet;
	}
	
	public void setCfrespat_indic_classificationSet(Set<CfResPat_Indic> cfrespat_indic_classificationSet) {
		this.cfrespat_indic_classificationSet = cfrespat_indic_classificationSet;
	}
	
	public Set<CfResPat_Meas> getCfrespat_meas_classificationSet() {
		return this.cfrespat_meas_classificationSet;
	}
	
	public void setCfrespat_meas_classificationSet(Set<CfResPat_Meas> cfrespat_meas_classificationSet) {
		this.cfrespat_meas_classificationSet = cfrespat_meas_classificationSet;
	}
	
	public Set<CfResPat_Medium> getCfrespat_medium_classificationSet() {
		return this.cfrespat_medium_classificationSet;
	}
	
	public void setCfrespat_medium_classificationSet(Set<CfResPat_Medium> cfrespat_medium_classificationSet) {
		this.cfrespat_medium_classificationSet = cfrespat_medium_classificationSet;
	}
	
	public Set<CfResPat_Srv> getCfrespat_srv_classificationSet() {
		return this.cfrespat_srv_classificationSet;
	}
	
	public void setCfrespat_srv_classificationSet(Set<CfResPat_Srv> cfrespat_srv_classificationSet) {
		this.cfrespat_srv_classificationSet = cfrespat_srv_classificationSet;
	}
	
	public Set<CfResProd_ResProd> getCfresprod_resprod_classificationSet() {
		return this.cfresprod_resprod_classificationSet;
	}
	
	public void setCfresprod_resprod_classificationSet(Set<CfResProd_ResProd> cfresprod_resprod_classificationSet) {
		this.cfresprod_resprod_classificationSet = cfresprod_resprod_classificationSet;
	}
	
	public Set<CfResProd_Class> getCfresprod_class_classificationSet() {
		return this.cfresprod_class_classificationSet;
	}
	
	public void setCfresprod_class_classificationSet(Set<CfResProd_Class> cfresprod_class_classificationSet) {
		this.cfresprod_class_classificationSet = cfresprod_class_classificationSet;
	}
	
	public Set<CfResProd_Equip> getCfresprod_equip_classificationSet() {
		return this.cfresprod_equip_classificationSet;
	}
	
	public void setCfresprod_equip_classificationSet(Set<CfResProd_Equip> cfresprod_equip_classificationSet) {
		this.cfresprod_equip_classificationSet = cfresprod_equip_classificationSet;
	}
	
	public Set<CfResProd_Facil> getCfresprod_facil_classificationSet() {
		return this.cfresprod_facil_classificationSet;
	}
	
	public void setCfresprod_facil_classificationSet(Set<CfResProd_Facil> cfresprod_facil_classificationSet) {
		this.cfresprod_facil_classificationSet = cfresprod_facil_classificationSet;
	}
	
	public Set<CfResProd_Fund> getCfresprod_fund_classificationSet() {
		return this.cfresprod_fund_classificationSet;
	}
	
	public void setCfresprod_fund_classificationSet(Set<CfResProd_Fund> cfresprod_fund_classificationSet) {
		this.cfresprod_fund_classificationSet = cfresprod_fund_classificationSet;
	}
	
	public Set<CfResProd_Indic> getCfresprod_indic_classificationSet() {
		return this.cfresprod_indic_classificationSet;
	}
	
	public void setCfresprod_indic_classificationSet(Set<CfResProd_Indic> cfresprod_indic_classificationSet) {
		this.cfresprod_indic_classificationSet = cfresprod_indic_classificationSet;
	}
	
	public Set<CfResProd_Meas> getCfresprod_meas_classificationSet() {
		return this.cfresprod_meas_classificationSet;
	}
	
	public void setCfresprod_meas_classificationSet(Set<CfResProd_Meas> cfresprod_meas_classificationSet) {
		this.cfresprod_meas_classificationSet = cfresprod_meas_classificationSet;
	}
	
	public Set<CfResProd_Medium> getCfresprod_medium_classificationSet() {
		return this.cfresprod_medium_classificationSet;
	}
	
	public void setCfresprod_medium_classificationSet(Set<CfResProd_Medium> cfresprod_medium_classificationSet) {
		this.cfresprod_medium_classificationSet = cfresprod_medium_classificationSet;
	}
	
	public Set<CfResProd_Srv> getCfresprod_srv_classificationSet() {
		return this.cfresprod_srv_classificationSet;
	}
	
	public void setCfresprod_srv_classificationSet(Set<CfResProd_Srv> cfresprod_srv_classificationSet) {
		this.cfresprod_srv_classificationSet = cfresprod_srv_classificationSet;
	}
	
	public Set<CfResPubl_ResPat> getCfrespubl_respat_classificationSet() {
		return this.cfrespubl_respat_classificationSet;
	}
	
	public void setCfrespubl_respat_classificationSet(Set<CfResPubl_ResPat> cfrespubl_respat_classificationSet) {
		this.cfrespubl_respat_classificationSet = cfrespubl_respat_classificationSet;
	}
	
	public Set<CfResPubl_ResProd> getCfrespubl_resprod_classificationSet() {
		return this.cfrespubl_resprod_classificationSet;
	}
	
	public void setCfrespubl_resprod_classificationSet(Set<CfResPubl_ResProd> cfrespubl_resprod_classificationSet) {
		this.cfrespubl_resprod_classificationSet = cfrespubl_resprod_classificationSet;
	}
	
	public Set<CfResPubl_ResPubl> getCfrespubl_respubl_classificationSet() {
		return this.cfrespubl_respubl_classificationSet;
	}
	
	public void setCfrespubl_respubl_classificationSet(Set<CfResPubl_ResPubl> cfrespubl_respubl_classificationSet) {
		this.cfrespubl_respubl_classificationSet = cfrespubl_respubl_classificationSet;
	}
	
	public Set<CfResPubl_Cite> getCfrespubl_cite_classificationSet() {
		return this.cfrespubl_cite_classificationSet;
	}
	
	public void setCfrespubl_cite_classificationSet(Set<CfResPubl_Cite> cfrespubl_cite_classificationSet) {
		this.cfrespubl_cite_classificationSet = cfrespubl_cite_classificationSet;
	}
	
	public Set<CfResPubl_Class> getCfrespubl_class_classificationSet() {
		return this.cfrespubl_class_classificationSet;
	}
	
	public void setCfrespubl_class_classificationSet(Set<CfResPubl_Class> cfrespubl_class_classificationSet) {
		this.cfrespubl_class_classificationSet = cfrespubl_class_classificationSet;
	}
	
	public Set<CfResPubl_DC> getCfrespubl_dc_classificationSet() {
		return this.cfrespubl_dc_classificationSet;
	}
	
	public void setCfrespubl_dc_classificationSet(Set<CfResPubl_DC> cfrespubl_dc_classificationSet) {
		this.cfrespubl_dc_classificationSet = cfrespubl_dc_classificationSet;
	}
	
	public Set<CfResPubl_Equip> getCfrespubl_equip_classificationSet() {
		return this.cfrespubl_equip_classificationSet;
	}
	
	public void setCfrespubl_equip_classificationSet(Set<CfResPubl_Equip> cfrespubl_equip_classificationSet) {
		this.cfrespubl_equip_classificationSet = cfrespubl_equip_classificationSet;
	}
	
	public Set<CfResPubl_Event> getCfrespubl_event_classificationSet() {
		return this.cfrespubl_event_classificationSet;
	}
	
	public void setCfrespubl_event_classificationSet(Set<CfResPubl_Event> cfrespubl_event_classificationSet) {
		this.cfrespubl_event_classificationSet = cfrespubl_event_classificationSet;
	}
	
	public Set<CfResPubl_Facil> getCfrespubl_facil_classificationSet() {
		return this.cfrespubl_facil_classificationSet;
	}
	
	public void setCfrespubl_facil_classificationSet(Set<CfResPubl_Facil> cfrespubl_facil_classificationSet) {
		this.cfrespubl_facil_classificationSet = cfrespubl_facil_classificationSet;
	}
	
	public Set<CfResPubl_Fund> getCfrespubl_fund_classificationSet() {
		return this.cfrespubl_fund_classificationSet;
	}
	
	public void setCfrespubl_fund_classificationSet(Set<CfResPubl_Fund> cfrespubl_fund_classificationSet) {
		this.cfrespubl_fund_classificationSet = cfrespubl_fund_classificationSet;
	}
	
	public Set<CfResPubl_Indic> getCfrespubl_indic_classificationSet() {
		return this.cfrespubl_indic_classificationSet;
	}
	
	public void setCfrespubl_indic_classificationSet(Set<CfResPubl_Indic> cfrespubl_indic_classificationSet) {
		this.cfrespubl_indic_classificationSet = cfrespubl_indic_classificationSet;
	}
	
	public Set<CfResPubl_Meas> getCfrespubl_meas_classificationSet() {
		return this.cfrespubl_meas_classificationSet;
	}
	
	public void setCfrespubl_meas_classificationSet(Set<CfResPubl_Meas> cfrespubl_meas_classificationSet) {
		this.cfrespubl_meas_classificationSet = cfrespubl_meas_classificationSet;
	}
	
	public Set<CfResPubl_Medium> getCfrespubl_medium_classificationSet() {
		return this.cfrespubl_medium_classificationSet;
	}
	
	public void setCfrespubl_medium_classificationSet(Set<CfResPubl_Medium> cfrespubl_medium_classificationSet) {
		this.cfrespubl_medium_classificationSet = cfrespubl_medium_classificationSet;
	}
	
	public Set<CfResPubl_Metrics> getCfrespubl_metrics_classificationSet() {
		return this.cfrespubl_metrics_classificationSet;
	}
	
	public void setCfrespubl_metrics_classificationSet(Set<CfResPubl_Metrics> cfrespubl_metrics_classificationSet) {
		this.cfrespubl_metrics_classificationSet = cfrespubl_metrics_classificationSet;
	}
	
	public Set<CfResPubl_Srv> getCfrespubl_srv_classificationSet() {
		return this.cfrespubl_srv_classificationSet;
	}
	
	public void setCfrespubl_srv_classificationSet(Set<CfResPubl_Srv> cfrespubl_srv_classificationSet) {
		this.cfrespubl_srv_classificationSet = cfrespubl_srv_classificationSet;
	}
	
	public Set<CfSrv_Srv> getCfsrv_srv_classificationSet() {
		return this.cfsrv_srv_classificationSet;
	}
	
	public void setCfsrv_srv_classificationSet(Set<CfSrv_Srv> cfsrv_srv_classificationSet) {
		this.cfsrv_srv_classificationSet = cfsrv_srv_classificationSet;
	}
	
	public Set<CfSrv_Class> getCfsrv_class_classificationSet() {
		return this.cfsrv_class_classificationSet;
	}
	
	public void setCfsrv_class_classificationSet(Set<CfSrv_Class> cfsrv_class_classificationSet) {
		this.cfsrv_class_classificationSet = cfsrv_class_classificationSet;
	}
	
	public Set<CfSrv_Event> getCfsrv_event_classificationSet() {
		return this.cfsrv_event_classificationSet;
	}
	
	public void setCfsrv_event_classificationSet(Set<CfSrv_Event> cfsrv_event_classificationSet) {
		this.cfsrv_event_classificationSet = cfsrv_event_classificationSet;
	}
	
	public Set<CfSrv_FedId> getCfsrv_fedid_classificationSet() {
		return this.cfsrv_fedid_classificationSet;
	}
	
	public void setCfsrv_fedid_classificationSet(Set<CfSrv_FedId> cfsrv_fedid_classificationSet) {
		this.cfsrv_fedid_classificationSet = cfsrv_fedid_classificationSet;
	}
	
	public Set<CfSrv_Fund> getCfsrv_fund_classificationSet() {
		return this.cfsrv_fund_classificationSet;
	}
	
	public void setCfsrv_fund_classificationSet(Set<CfSrv_Fund> cfsrv_fund_classificationSet) {
		this.cfsrv_fund_classificationSet = cfsrv_fund_classificationSet;
	}
	
	public Set<CfSrv_Indic> getCfsrv_indic_classificationSet() {
		return this.cfsrv_indic_classificationSet;
	}
	
	public void setCfsrv_indic_classificationSet(Set<CfSrv_Indic> cfsrv_indic_classificationSet) {
		this.cfsrv_indic_classificationSet = cfsrv_indic_classificationSet;
	}
	
	public Set<CfSrv_Meas> getCfsrv_meas_classificationSet() {
		return this.cfsrv_meas_classificationSet;
	}
	
	public void setCfsrv_meas_classificationSet(Set<CfSrv_Meas> cfsrv_meas_classificationSet) {
		this.cfsrv_meas_classificationSet = cfsrv_meas_classificationSet;
	}
	
	public Set<CfSrv_Medium> getCfsrv_medium_classificationSet() {
		return this.cfsrv_medium_classificationSet;
	}
	
	public void setCfsrv_medium_classificationSet(Set<CfSrv_Medium> cfsrv_medium_classificationSet) {
		this.cfsrv_medium_classificationSet = cfsrv_medium_classificationSet;
	}
	
	public Set<CfSrv_PAddr> getCfsrv_paddr_classificationSet() {
		return this.cfsrv_paddr_classificationSet;
	}
	
	public void setCfsrv_paddr_classificationSet(Set<CfSrv_PAddr> cfsrv_paddr_classificationSet) {
		this.cfsrv_paddr_classificationSet = cfsrv_paddr_classificationSet;
	}
	
}