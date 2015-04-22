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
@Table(name = "C1_MEDIUM")
public class CfMedium implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfMediumId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_medium_identifier;
	@Column(name = "cfMediumCreationDate", unique = false, nullable = false , length = 30, precision = 0,columnDefinition = "VARCHAR")
	private java.lang.String a_medium_creation_date;
	@Column(name = "cfSize", unique = false, nullable = false ,columnDefinition = "FLOAT")
	private java.math.BigDecimal a_size;
	@Column(name = "cfMimeType", unique = false, nullable = false , length = 30, precision = 0,columnDefinition = "VARCHAR")
	private java.lang.String a_mime_type;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcite_medium_medium")
	private Set<CfCite_Medium> cfcite_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_medium_medium")
	private Set<CfEquip_Medium> cfequip_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_medium_medium")
	private Set<CfEvent_Medium> cfevent_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_medium_medium")
	private Set<CfFacil_Medium> cffacil_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_meas_medium")
	private Set<CfMedium_Meas> cfmedium_meas_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_medium_medium1")
	private Set<CfMedium_Medium> cfmedium_medium_medium1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_medium_medium2")
	private Set<CfMedium_Medium> cfmedium_medium_medium2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_class_medium")
	private Set<CfMedium_Class> cfmedium_class_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmediumdescr_medium")
	private Set<CfMediumDescr> cfmediumdescr_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_fund_medium")
	private Set<CfMedium_Fund> cfmedium_fund_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_indic_medium")
	private Set<CfMedium_Indic> cfmedium_indic_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmediumkeyw_medium")
	private Set<CfMediumKeyw> cfmediumkeyw_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmediumtitle_medium")
	private Set<CfMediumTitle> cfmediumtitle_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_medium_medium")
	private Set<CfOrgUnit_Medium> cforgunit_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_medium_medium")
	private Set<CfPers_Medium> cfpers_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_medium_medium")
	private Set<CfProj_Medium> cfproj_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_medium_medium")
	private Set<CfResPat_Medium> cfrespat_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_medium_medium")
	private Set<CfResProd_Medium> cfresprod_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_medium_medium")
	private Set<CfResPubl_Medium> cfrespubl_medium_mediumSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_medium_medium")
	private Set<CfSrv_Medium> cfsrv_medium_mediumSet;
	
	public CfMedium(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_medium_identifier() {
		return this.a_medium_identifier;
	}
	
	public void setA_medium_identifier(java.lang.String a_medium_identifier) {
		this.a_medium_identifier = a_medium_identifier;
	}
	
	public java.lang.String getA_medium_creation_date() {
		return this.a_medium_creation_date;
	}
	
	public void setA_medium_creation_date(java.lang.String a_medium_creation_date) {
		this.a_medium_creation_date = a_medium_creation_date;
	}
	
	public java.math.BigDecimal getA_size() {
		return this.a_size;
	}
	
	public void setA_size(java.math.BigDecimal a_size) {
		this.a_size = a_size;
	}
	
	public java.lang.String getA_mime_type() {
		return this.a_mime_type;
	}
	
	public void setA_mime_type(java.lang.String a_mime_type) {
		this.a_mime_type = a_mime_type;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfCite_Medium> getCfcite_medium_mediumSet() {
		return this.cfcite_medium_mediumSet;
	}
	
	public void setCfcite_medium_mediumSet(Set<CfCite_Medium> cfcite_medium_mediumSet) {
		this.cfcite_medium_mediumSet = cfcite_medium_mediumSet;
	}
	
	public Set<CfEquip_Medium> getCfequip_medium_mediumSet() {
		return this.cfequip_medium_mediumSet;
	}
	
	public void setCfequip_medium_mediumSet(Set<CfEquip_Medium> cfequip_medium_mediumSet) {
		this.cfequip_medium_mediumSet = cfequip_medium_mediumSet;
	}
	
	public Set<CfEvent_Medium> getCfevent_medium_mediumSet() {
		return this.cfevent_medium_mediumSet;
	}
	
	public void setCfevent_medium_mediumSet(Set<CfEvent_Medium> cfevent_medium_mediumSet) {
		this.cfevent_medium_mediumSet = cfevent_medium_mediumSet;
	}
	
	public Set<CfFacil_Medium> getCffacil_medium_mediumSet() {
		return this.cffacil_medium_mediumSet;
	}
	
	public void setCffacil_medium_mediumSet(Set<CfFacil_Medium> cffacil_medium_mediumSet) {
		this.cffacil_medium_mediumSet = cffacil_medium_mediumSet;
	}
	
	public Set<CfMedium_Meas> getCfmedium_meas_mediumSet() {
		return this.cfmedium_meas_mediumSet;
	}
	
	public void setCfmedium_meas_mediumSet(Set<CfMedium_Meas> cfmedium_meas_mediumSet) {
		this.cfmedium_meas_mediumSet = cfmedium_meas_mediumSet;
	}
	
	public Set<CfMedium_Medium> getCfmedium_medium_medium1Set() {
		return this.cfmedium_medium_medium1Set;
	}
	
	public void setCfmedium_medium_medium1Set(Set<CfMedium_Medium> cfmedium_medium_medium1Set) {
		this.cfmedium_medium_medium1Set = cfmedium_medium_medium1Set;
	}
	
	public Set<CfMedium_Medium> getCfmedium_medium_medium2Set() {
		return this.cfmedium_medium_medium2Set;
	}
	
	public void setCfmedium_medium_medium2Set(Set<CfMedium_Medium> cfmedium_medium_medium2Set) {
		this.cfmedium_medium_medium2Set = cfmedium_medium_medium2Set;
	}
	
	public Set<CfMedium_Class> getCfmedium_class_mediumSet() {
		return this.cfmedium_class_mediumSet;
	}
	
	public void setCfmedium_class_mediumSet(Set<CfMedium_Class> cfmedium_class_mediumSet) {
		this.cfmedium_class_mediumSet = cfmedium_class_mediumSet;
	}
	
	public Set<CfMediumDescr> getCfmediumdescr_mediumSet() {
		return this.cfmediumdescr_mediumSet;
	}
	
	public void setCfmediumdescr_mediumSet(Set<CfMediumDescr> cfmediumdescr_mediumSet) {
		this.cfmediumdescr_mediumSet = cfmediumdescr_mediumSet;
	}
	
	public Set<CfMedium_Fund> getCfmedium_fund_mediumSet() {
		return this.cfmedium_fund_mediumSet;
	}
	
	public void setCfmedium_fund_mediumSet(Set<CfMedium_Fund> cfmedium_fund_mediumSet) {
		this.cfmedium_fund_mediumSet = cfmedium_fund_mediumSet;
	}
	
	public Set<CfMedium_Indic> getCfmedium_indic_mediumSet() {
		return this.cfmedium_indic_mediumSet;
	}
	
	public void setCfmedium_indic_mediumSet(Set<CfMedium_Indic> cfmedium_indic_mediumSet) {
		this.cfmedium_indic_mediumSet = cfmedium_indic_mediumSet;
	}
	
	public Set<CfMediumKeyw> getCfmediumkeyw_mediumSet() {
		return this.cfmediumkeyw_mediumSet;
	}
	
	public void setCfmediumkeyw_mediumSet(Set<CfMediumKeyw> cfmediumkeyw_mediumSet) {
		this.cfmediumkeyw_mediumSet = cfmediumkeyw_mediumSet;
	}
	
	public Set<CfMediumTitle> getCfmediumtitle_mediumSet() {
		return this.cfmediumtitle_mediumSet;
	}
	
	public void setCfmediumtitle_mediumSet(Set<CfMediumTitle> cfmediumtitle_mediumSet) {
		this.cfmediumtitle_mediumSet = cfmediumtitle_mediumSet;
	}
	
	public Set<CfOrgUnit_Medium> getCforgunit_medium_mediumSet() {
		return this.cforgunit_medium_mediumSet;
	}
	
	public void setCforgunit_medium_mediumSet(Set<CfOrgUnit_Medium> cforgunit_medium_mediumSet) {
		this.cforgunit_medium_mediumSet = cforgunit_medium_mediumSet;
	}
	
	public Set<CfPers_Medium> getCfpers_medium_mediumSet() {
		return this.cfpers_medium_mediumSet;
	}
	
	public void setCfpers_medium_mediumSet(Set<CfPers_Medium> cfpers_medium_mediumSet) {
		this.cfpers_medium_mediumSet = cfpers_medium_mediumSet;
	}
	
	public Set<CfProj_Medium> getCfproj_medium_mediumSet() {
		return this.cfproj_medium_mediumSet;
	}
	
	public void setCfproj_medium_mediumSet(Set<CfProj_Medium> cfproj_medium_mediumSet) {
		this.cfproj_medium_mediumSet = cfproj_medium_mediumSet;
	}
	
	public Set<CfResPat_Medium> getCfrespat_medium_mediumSet() {
		return this.cfrespat_medium_mediumSet;
	}
	
	public void setCfrespat_medium_mediumSet(Set<CfResPat_Medium> cfrespat_medium_mediumSet) {
		this.cfrespat_medium_mediumSet = cfrespat_medium_mediumSet;
	}
	
	public Set<CfResProd_Medium> getCfresprod_medium_mediumSet() {
		return this.cfresprod_medium_mediumSet;
	}
	
	public void setCfresprod_medium_mediumSet(Set<CfResProd_Medium> cfresprod_medium_mediumSet) {
		this.cfresprod_medium_mediumSet = cfresprod_medium_mediumSet;
	}
	
	public Set<CfResPubl_Medium> getCfrespubl_medium_mediumSet() {
		return this.cfrespubl_medium_mediumSet;
	}
	
	public void setCfrespubl_medium_mediumSet(Set<CfResPubl_Medium> cfrespubl_medium_mediumSet) {
		this.cfrespubl_medium_mediumSet = cfrespubl_medium_mediumSet;
	}
	
	public Set<CfSrv_Medium> getCfsrv_medium_mediumSet() {
		return this.cfsrv_medium_mediumSet;
	}
	
	public void setCfsrv_medium_mediumSet(Set<CfSrv_Medium> cfsrv_medium_mediumSet) {
		this.cfsrv_medium_mediumSet = cfsrv_medium_mediumSet;
	}
	
}