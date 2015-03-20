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
@Table(name = "CM_PROJECT")
public class CfProj implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfProjId", unique = false, nullable = false )
	private java.lang.String a_project_identifier;
	@Column(name = "cfStartDate", unique = false, nullable = false )
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false )
	private java.util.Date a_end_date;
	@Column(name = "cfAcro", unique = false, nullable = false )
	private java.lang.String a_acronym;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_proj_project1")
	private Set<CfProj_Proj> cfproj_proj_project1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_proj_project2")
	private Set<CfProj_Proj> cfproj_proj_project2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprojabstr_project")
	private Set<CfProjAbstr> cfprojabstr_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_class_project")
	private Set<CfProj_Class> cfproj_class_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_dc_project")
	private Set<CfProj_DC> cfproj_dc_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_equip_project")
	private Set<CfProj_Equip> cfproj_equip_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_event_project")
	private Set<CfProj_Event> cfproj_event_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_facil_project")
	private Set<CfProj_Facil> cfproj_facil_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_fund_project")
	private Set<CfProj_Fund> cfproj_fund_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_indic_project")
	private Set<CfProj_Indic> cfproj_indic_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprojkeyw_project")
	private Set<CfProjKeyw> cfprojkeyw_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_meas_project")
	private Set<CfProj_Meas> cfproj_meas_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_medium_project")
	private Set<CfProj_Medium> cfproj_medium_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_orgunit_project")
	private Set<CfProj_OrgUnit> cfproj_orgunit_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_pers_project")
	private Set<CfProj_Pers> cfproj_pers_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_prize_project")
	private Set<CfProj_Prize> cfproj_prize_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_respat_project")
	private Set<CfProj_ResPat> cfproj_respat_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_resprod_project")
	private Set<CfProj_ResProd> cfproj_resprod_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_respubl_project")
	private Set<CfProj_ResPubl> cfproj_respubl_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_srv_project")
	private Set<CfProj_Srv> cfproj_srv_projectSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprojtitle_project")
	private Set<CfProjTitle> cfprojtitle_projectSet;
	
	public CfProj(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_project_identifier() {
		return this.a_project_identifier;
	}
	
	public void setA_project_identifier(java.lang.String a_project_identifier) {
		this.a_project_identifier = a_project_identifier;
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
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfProj_Proj> getCfproj_proj_project1Set() {
		return this.cfproj_proj_project1Set;
	}
	
	public void setCfproj_proj_project1Set(Set<CfProj_Proj> cfproj_proj_project1Set) {
		this.cfproj_proj_project1Set = cfproj_proj_project1Set;
	}
	
	public Set<CfProj_Proj> getCfproj_proj_project2Set() {
		return this.cfproj_proj_project2Set;
	}
	
	public void setCfproj_proj_project2Set(Set<CfProj_Proj> cfproj_proj_project2Set) {
		this.cfproj_proj_project2Set = cfproj_proj_project2Set;
	}
	
	public Set<CfProjAbstr> getCfprojabstr_projectSet() {
		return this.cfprojabstr_projectSet;
	}
	
	public void setCfprojabstr_projectSet(Set<CfProjAbstr> cfprojabstr_projectSet) {
		this.cfprojabstr_projectSet = cfprojabstr_projectSet;
	}
	
	public Set<CfProj_Class> getCfproj_class_projectSet() {
		return this.cfproj_class_projectSet;
	}
	
	public void setCfproj_class_projectSet(Set<CfProj_Class> cfproj_class_projectSet) {
		this.cfproj_class_projectSet = cfproj_class_projectSet;
	}
	
	public Set<CfProj_DC> getCfproj_dc_projectSet() {
		return this.cfproj_dc_projectSet;
	}
	
	public void setCfproj_dc_projectSet(Set<CfProj_DC> cfproj_dc_projectSet) {
		this.cfproj_dc_projectSet = cfproj_dc_projectSet;
	}
	
	public Set<CfProj_Equip> getCfproj_equip_projectSet() {
		return this.cfproj_equip_projectSet;
	}
	
	public void setCfproj_equip_projectSet(Set<CfProj_Equip> cfproj_equip_projectSet) {
		this.cfproj_equip_projectSet = cfproj_equip_projectSet;
	}
	
	public Set<CfProj_Event> getCfproj_event_projectSet() {
		return this.cfproj_event_projectSet;
	}
	
	public void setCfproj_event_projectSet(Set<CfProj_Event> cfproj_event_projectSet) {
		this.cfproj_event_projectSet = cfproj_event_projectSet;
	}
	
	public Set<CfProj_Facil> getCfproj_facil_projectSet() {
		return this.cfproj_facil_projectSet;
	}
	
	public void setCfproj_facil_projectSet(Set<CfProj_Facil> cfproj_facil_projectSet) {
		this.cfproj_facil_projectSet = cfproj_facil_projectSet;
	}
	
	public Set<CfProj_Fund> getCfproj_fund_projectSet() {
		return this.cfproj_fund_projectSet;
	}
	
	public void setCfproj_fund_projectSet(Set<CfProj_Fund> cfproj_fund_projectSet) {
		this.cfproj_fund_projectSet = cfproj_fund_projectSet;
	}
	
	public Set<CfProj_Indic> getCfproj_indic_projectSet() {
		return this.cfproj_indic_projectSet;
	}
	
	public void setCfproj_indic_projectSet(Set<CfProj_Indic> cfproj_indic_projectSet) {
		this.cfproj_indic_projectSet = cfproj_indic_projectSet;
	}
	
	public Set<CfProjKeyw> getCfprojkeyw_projectSet() {
		return this.cfprojkeyw_projectSet;
	}
	
	public void setCfprojkeyw_projectSet(Set<CfProjKeyw> cfprojkeyw_projectSet) {
		this.cfprojkeyw_projectSet = cfprojkeyw_projectSet;
	}
	
	public Set<CfProj_Meas> getCfproj_meas_projectSet() {
		return this.cfproj_meas_projectSet;
	}
	
	public void setCfproj_meas_projectSet(Set<CfProj_Meas> cfproj_meas_projectSet) {
		this.cfproj_meas_projectSet = cfproj_meas_projectSet;
	}
	
	public Set<CfProj_Medium> getCfproj_medium_projectSet() {
		return this.cfproj_medium_projectSet;
	}
	
	public void setCfproj_medium_projectSet(Set<CfProj_Medium> cfproj_medium_projectSet) {
		this.cfproj_medium_projectSet = cfproj_medium_projectSet;
	}
	
	public Set<CfProj_OrgUnit> getCfproj_orgunit_projectSet() {
		return this.cfproj_orgunit_projectSet;
	}
	
	public void setCfproj_orgunit_projectSet(Set<CfProj_OrgUnit> cfproj_orgunit_projectSet) {
		this.cfproj_orgunit_projectSet = cfproj_orgunit_projectSet;
	}
	
	public Set<CfProj_Pers> getCfproj_pers_projectSet() {
		return this.cfproj_pers_projectSet;
	}
	
	public void setCfproj_pers_projectSet(Set<CfProj_Pers> cfproj_pers_projectSet) {
		this.cfproj_pers_projectSet = cfproj_pers_projectSet;
	}
	
	public Set<CfProj_Prize> getCfproj_prize_projectSet() {
		return this.cfproj_prize_projectSet;
	}
	
	public void setCfproj_prize_projectSet(Set<CfProj_Prize> cfproj_prize_projectSet) {
		this.cfproj_prize_projectSet = cfproj_prize_projectSet;
	}
	
	public Set<CfProj_ResPat> getCfproj_respat_projectSet() {
		return this.cfproj_respat_projectSet;
	}
	
	public void setCfproj_respat_projectSet(Set<CfProj_ResPat> cfproj_respat_projectSet) {
		this.cfproj_respat_projectSet = cfproj_respat_projectSet;
	}
	
	public Set<CfProj_ResProd> getCfproj_resprod_projectSet() {
		return this.cfproj_resprod_projectSet;
	}
	
	public void setCfproj_resprod_projectSet(Set<CfProj_ResProd> cfproj_resprod_projectSet) {
		this.cfproj_resprod_projectSet = cfproj_resprod_projectSet;
	}
	
	public Set<CfProj_ResPubl> getCfproj_respubl_projectSet() {
		return this.cfproj_respubl_projectSet;
	}
	
	public void setCfproj_respubl_projectSet(Set<CfProj_ResPubl> cfproj_respubl_projectSet) {
		this.cfproj_respubl_projectSet = cfproj_respubl_projectSet;
	}
	
	public Set<CfProj_Srv> getCfproj_srv_projectSet() {
		return this.cfproj_srv_projectSet;
	}
	
	public void setCfproj_srv_projectSet(Set<CfProj_Srv> cfproj_srv_projectSet) {
		this.cfproj_srv_projectSet = cfproj_srv_projectSet;
	}
	
	public Set<CfProjTitle> getCfprojtitle_projectSet() {
		return this.cfprojtitle_projectSet;
	}
	
	public void setCfprojtitle_projectSet(Set<CfProjTitle> cfprojtitle_projectSet) {
		this.cfprojtitle_projectSet = cfprojtitle_projectSet;
	}
	
}