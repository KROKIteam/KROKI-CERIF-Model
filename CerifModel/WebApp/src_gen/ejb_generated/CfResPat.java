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
@Table(name = "C1_RESULT_PATENT")
public class CfResPat implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfResPatId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_result_patent_identifier;
	@Column(name = "cfRegistrDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_registration_date;
	@Column(name = "cfApprovDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_approval_date;
	@Column(name = "cfPatentNum", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_patent_number;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cfrespat_country", referencedColumnName="ID",  nullable = true)
	protected CfCountry cfrespat_country;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_respat_resultPatent")
	protected Set<CfOrgUnit_ResPat> cforgunit_respat_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_respat_resultPatent")
	protected Set<CfPers_ResPat> cfpers_respat_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_respat_resultPatent")
	protected Set<CfProj_ResPat> cfproj_respat_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_respat_resultPatent1")
	protected Set<CfResPat_ResPat> cfrespat_respat_resultPatent1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_respat_resultPatent2")
	protected Set<CfResPat_ResPat> cfrespat_respat_resultPatent2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespatabstr_resultPatent")
	protected Set<CfResPatAbstr> cfrespatabstr_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_class_resultPatent")
	protected Set<CfResPat_Class> cfrespat_class_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_equip_resultPatent")
	protected Set<CfResPat_Equip> cfrespat_equip_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_facil_resultPatent")
	protected Set<CfResPat_Facil> cfrespat_facil_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_fund_resultPatent")
	protected Set<CfResPat_Fund> cfrespat_fund_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_indic_resultPatent")
	protected Set<CfResPat_Indic> cfrespat_indic_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespatkeyw_resultPatent")
	protected Set<CfResPatKeyw> cfrespatkeyw_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_meas_resultPatent")
	protected Set<CfResPat_Meas> cfrespat_meas_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_medium_resultPatent")
	protected Set<CfResPat_Medium> cfrespat_medium_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_srv_resultPatent")
	protected Set<CfResPat_Srv> cfrespat_srv_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespattitle_resultPatent")
	protected Set<CfResPatTitle> cfrespattitle_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespatversinfo_resultPatent")
	protected Set<CfResPatVersInfo> cfrespatversinfo_resultPatentSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respat_resultPatent")
	protected Set<CfResPubl_ResPat> cfrespubl_respat_resultPatentSet;
	
	public CfResPat(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_result_patent_identifier() {
		return this.ka_result_patent_identifier;
	}
	
	public void setKa_result_patent_identifier(java.lang.String ka_result_patent_identifier) {
		this.ka_result_patent_identifier = ka_result_patent_identifier;
	}
	
	public java.util.Date getKa_registration_date() {
		return this.ka_registration_date;
	}
	
	public void setKa_registration_date(java.util.Date ka_registration_date) {
		this.ka_registration_date = ka_registration_date;
	}
	
	public java.util.Date getKa_approval_date() {
		return this.ka_approval_date;
	}
	
	public void setKa_approval_date(java.util.Date ka_approval_date) {
		this.ka_approval_date = ka_approval_date;
	}
	
	public java.lang.String getKa_patent_number() {
		return this.ka_patent_number;
	}
	
	public void setKa_patent_number(java.lang.String ka_patent_number) {
		this.ka_patent_number = ka_patent_number;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public CfCountry getCfrespat_country() {
		return this.cfrespat_country;
	}
	
	public void setCfrespat_country(CfCountry cfrespat_country) {
		this.cfrespat_country = cfrespat_country;
	}
	
	public Set<CfOrgUnit_ResPat> getCforgunit_respat_resultPatentSet() {
		return this.cforgunit_respat_resultPatentSet;
	}
	
	public void setCforgunit_respat_resultPatentSet(Set<CfOrgUnit_ResPat> cforgunit_respat_resultPatentSet) {
		this.cforgunit_respat_resultPatentSet = cforgunit_respat_resultPatentSet;
	}
	
	public Set<CfPers_ResPat> getCfpers_respat_resultPatentSet() {
		return this.cfpers_respat_resultPatentSet;
	}
	
	public void setCfpers_respat_resultPatentSet(Set<CfPers_ResPat> cfpers_respat_resultPatentSet) {
		this.cfpers_respat_resultPatentSet = cfpers_respat_resultPatentSet;
	}
	
	public Set<CfProj_ResPat> getCfproj_respat_resultPatentSet() {
		return this.cfproj_respat_resultPatentSet;
	}
	
	public void setCfproj_respat_resultPatentSet(Set<CfProj_ResPat> cfproj_respat_resultPatentSet) {
		this.cfproj_respat_resultPatentSet = cfproj_respat_resultPatentSet;
	}
	
	public Set<CfResPat_ResPat> getCfrespat_respat_resultPatent1Set() {
		return this.cfrespat_respat_resultPatent1Set;
	}
	
	public void setCfrespat_respat_resultPatent1Set(Set<CfResPat_ResPat> cfrespat_respat_resultPatent1Set) {
		this.cfrespat_respat_resultPatent1Set = cfrespat_respat_resultPatent1Set;
	}
	
	public Set<CfResPat_ResPat> getCfrespat_respat_resultPatent2Set() {
		return this.cfrespat_respat_resultPatent2Set;
	}
	
	public void setCfrespat_respat_resultPatent2Set(Set<CfResPat_ResPat> cfrespat_respat_resultPatent2Set) {
		this.cfrespat_respat_resultPatent2Set = cfrespat_respat_resultPatent2Set;
	}
	
	public Set<CfResPatAbstr> getCfrespatabstr_resultPatentSet() {
		return this.cfrespatabstr_resultPatentSet;
	}
	
	public void setCfrespatabstr_resultPatentSet(Set<CfResPatAbstr> cfrespatabstr_resultPatentSet) {
		this.cfrespatabstr_resultPatentSet = cfrespatabstr_resultPatentSet;
	}
	
	public Set<CfResPat_Class> getCfrespat_class_resultPatentSet() {
		return this.cfrespat_class_resultPatentSet;
	}
	
	public void setCfrespat_class_resultPatentSet(Set<CfResPat_Class> cfrespat_class_resultPatentSet) {
		this.cfrespat_class_resultPatentSet = cfrespat_class_resultPatentSet;
	}
	
	public Set<CfResPat_Equip> getCfrespat_equip_resultPatentSet() {
		return this.cfrespat_equip_resultPatentSet;
	}
	
	public void setCfrespat_equip_resultPatentSet(Set<CfResPat_Equip> cfrespat_equip_resultPatentSet) {
		this.cfrespat_equip_resultPatentSet = cfrespat_equip_resultPatentSet;
	}
	
	public Set<CfResPat_Facil> getCfrespat_facil_resultPatentSet() {
		return this.cfrespat_facil_resultPatentSet;
	}
	
	public void setCfrespat_facil_resultPatentSet(Set<CfResPat_Facil> cfrespat_facil_resultPatentSet) {
		this.cfrespat_facil_resultPatentSet = cfrespat_facil_resultPatentSet;
	}
	
	public Set<CfResPat_Fund> getCfrespat_fund_resultPatentSet() {
		return this.cfrespat_fund_resultPatentSet;
	}
	
	public void setCfrespat_fund_resultPatentSet(Set<CfResPat_Fund> cfrespat_fund_resultPatentSet) {
		this.cfrespat_fund_resultPatentSet = cfrespat_fund_resultPatentSet;
	}
	
	public Set<CfResPat_Indic> getCfrespat_indic_resultPatentSet() {
		return this.cfrespat_indic_resultPatentSet;
	}
	
	public void setCfrespat_indic_resultPatentSet(Set<CfResPat_Indic> cfrespat_indic_resultPatentSet) {
		this.cfrespat_indic_resultPatentSet = cfrespat_indic_resultPatentSet;
	}
	
	public Set<CfResPatKeyw> getCfrespatkeyw_resultPatentSet() {
		return this.cfrespatkeyw_resultPatentSet;
	}
	
	public void setCfrespatkeyw_resultPatentSet(Set<CfResPatKeyw> cfrespatkeyw_resultPatentSet) {
		this.cfrespatkeyw_resultPatentSet = cfrespatkeyw_resultPatentSet;
	}
	
	public Set<CfResPat_Meas> getCfrespat_meas_resultPatentSet() {
		return this.cfrespat_meas_resultPatentSet;
	}
	
	public void setCfrespat_meas_resultPatentSet(Set<CfResPat_Meas> cfrespat_meas_resultPatentSet) {
		this.cfrespat_meas_resultPatentSet = cfrespat_meas_resultPatentSet;
	}
	
	public Set<CfResPat_Medium> getCfrespat_medium_resultPatentSet() {
		return this.cfrespat_medium_resultPatentSet;
	}
	
	public void setCfrespat_medium_resultPatentSet(Set<CfResPat_Medium> cfrespat_medium_resultPatentSet) {
		this.cfrespat_medium_resultPatentSet = cfrespat_medium_resultPatentSet;
	}
	
	public Set<CfResPat_Srv> getCfrespat_srv_resultPatentSet() {
		return this.cfrespat_srv_resultPatentSet;
	}
	
	public void setCfrespat_srv_resultPatentSet(Set<CfResPat_Srv> cfrespat_srv_resultPatentSet) {
		this.cfrespat_srv_resultPatentSet = cfrespat_srv_resultPatentSet;
	}
	
	public Set<CfResPatTitle> getCfrespattitle_resultPatentSet() {
		return this.cfrespattitle_resultPatentSet;
	}
	
	public void setCfrespattitle_resultPatentSet(Set<CfResPatTitle> cfrespattitle_resultPatentSet) {
		this.cfrespattitle_resultPatentSet = cfrespattitle_resultPatentSet;
	}
	
	public Set<CfResPatVersInfo> getCfrespatversinfo_resultPatentSet() {
		return this.cfrespatversinfo_resultPatentSet;
	}
	
	public void setCfrespatversinfo_resultPatentSet(Set<CfResPatVersInfo> cfrespatversinfo_resultPatentSet) {
		this.cfrespatversinfo_resultPatentSet = cfrespatversinfo_resultPatentSet;
	}
	
	public Set<CfResPubl_ResPat> getCfrespubl_respat_resultPatentSet() {
		return this.cfrespubl_respat_resultPatentSet;
	}
	
	public void setCfrespubl_respat_resultPatentSet(Set<CfResPubl_ResPat> cfrespubl_respat_resultPatentSet) {
		this.cfrespubl_respat_resultPatentSet = cfrespubl_respat_resultPatentSet;
	}
	
}