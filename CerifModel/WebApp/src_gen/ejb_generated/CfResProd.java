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
@Table(name = "CM_RESULT_PRODUCT")
public class CfResProd implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfResProdId", unique = false, nullable = false )
	private java.lang.String a_result_product_identifier;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_resprod_resultProduct")
	private Set<CfOrgUnit_ResProd> cforgunit_resprod_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_resprod_resultProduct")
	private Set<CfPers_ResProd> cfpers_resprod_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_resprod_resultProduct")
	private Set<CfProj_ResProd> cfproj_resprod_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_resprod_resultProduct1")
	private Set<CfResProd_ResProd> cfresprod_resprod_resultProduct1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_resprod_resultProduct2")
	private Set<CfResProd_ResProd> cfresprod_resprod_resultProduct2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_class_resultProduct")
	private Set<CfResProd_Class> cfresprod_class_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresproddescr_resultProduct")
	private Set<CfResProdDescr> cfresproddescr_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_equip_resultProduct")
	private Set<CfResProd_Equip> cfresprod_equip_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_facil_resultProduct")
	private Set<CfResProd_Facil> cfresprod_facil_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_fund_resultProduct")
	private Set<CfResProd_Fund> cfresprod_fund_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_indic_resultProduct")
	private Set<CfResProd_Indic> cfresprod_indic_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprodkeyw_resultProduct")
	private Set<CfResProdKeyw> cfresprodkeyw_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_meas_resultProduct")
	private Set<CfResProd_Meas> cfresprod_meas_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_medium_resultProduct")
	private Set<CfResProd_Medium> cfresprod_medium_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprodname_resultProduct")
	private Set<CfResProdName> cfresprodname_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_srv_resultProduct")
	private Set<CfResProd_Srv> cfresprod_srv_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprodversinfo_resultProduct")
	private Set<CfResProdVersInfo> cfresprodversinfo_resultProductSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_resprod_resultProduct")
	private Set<CfResPubl_ResProd> cfrespubl_resprod_resultProductSet;
	
	public CfResProd(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_result_product_identifier() {
		return this.a_result_product_identifier;
	}
	
	public void setA_result_product_identifier(java.lang.String a_result_product_identifier) {
		this.a_result_product_identifier = a_result_product_identifier;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfOrgUnit_ResProd> getCforgunit_resprod_resultProductSet() {
		return this.cforgunit_resprod_resultProductSet;
	}
	
	public void setCforgunit_resprod_resultProductSet(Set<CfOrgUnit_ResProd> cforgunit_resprod_resultProductSet) {
		this.cforgunit_resprod_resultProductSet = cforgunit_resprod_resultProductSet;
	}
	
	public Set<CfPers_ResProd> getCfpers_resprod_resultProductSet() {
		return this.cfpers_resprod_resultProductSet;
	}
	
	public void setCfpers_resprod_resultProductSet(Set<CfPers_ResProd> cfpers_resprod_resultProductSet) {
		this.cfpers_resprod_resultProductSet = cfpers_resprod_resultProductSet;
	}
	
	public Set<CfProj_ResProd> getCfproj_resprod_resultProductSet() {
		return this.cfproj_resprod_resultProductSet;
	}
	
	public void setCfproj_resprod_resultProductSet(Set<CfProj_ResProd> cfproj_resprod_resultProductSet) {
		this.cfproj_resprod_resultProductSet = cfproj_resprod_resultProductSet;
	}
	
	public Set<CfResProd_ResProd> getCfresprod_resprod_resultProduct1Set() {
		return this.cfresprod_resprod_resultProduct1Set;
	}
	
	public void setCfresprod_resprod_resultProduct1Set(Set<CfResProd_ResProd> cfresprod_resprod_resultProduct1Set) {
		this.cfresprod_resprod_resultProduct1Set = cfresprod_resprod_resultProduct1Set;
	}
	
	public Set<CfResProd_ResProd> getCfresprod_resprod_resultProduct2Set() {
		return this.cfresprod_resprod_resultProduct2Set;
	}
	
	public void setCfresprod_resprod_resultProduct2Set(Set<CfResProd_ResProd> cfresprod_resprod_resultProduct2Set) {
		this.cfresprod_resprod_resultProduct2Set = cfresprod_resprod_resultProduct2Set;
	}
	
	public Set<CfResProd_Class> getCfresprod_class_resultProductSet() {
		return this.cfresprod_class_resultProductSet;
	}
	
	public void setCfresprod_class_resultProductSet(Set<CfResProd_Class> cfresprod_class_resultProductSet) {
		this.cfresprod_class_resultProductSet = cfresprod_class_resultProductSet;
	}
	
	public Set<CfResProdDescr> getCfresproddescr_resultProductSet() {
		return this.cfresproddescr_resultProductSet;
	}
	
	public void setCfresproddescr_resultProductSet(Set<CfResProdDescr> cfresproddescr_resultProductSet) {
		this.cfresproddescr_resultProductSet = cfresproddescr_resultProductSet;
	}
	
	public Set<CfResProd_Equip> getCfresprod_equip_resultProductSet() {
		return this.cfresprod_equip_resultProductSet;
	}
	
	public void setCfresprod_equip_resultProductSet(Set<CfResProd_Equip> cfresprod_equip_resultProductSet) {
		this.cfresprod_equip_resultProductSet = cfresprod_equip_resultProductSet;
	}
	
	public Set<CfResProd_Facil> getCfresprod_facil_resultProductSet() {
		return this.cfresprod_facil_resultProductSet;
	}
	
	public void setCfresprod_facil_resultProductSet(Set<CfResProd_Facil> cfresprod_facil_resultProductSet) {
		this.cfresprod_facil_resultProductSet = cfresprod_facil_resultProductSet;
	}
	
	public Set<CfResProd_Fund> getCfresprod_fund_resultProductSet() {
		return this.cfresprod_fund_resultProductSet;
	}
	
	public void setCfresprod_fund_resultProductSet(Set<CfResProd_Fund> cfresprod_fund_resultProductSet) {
		this.cfresprod_fund_resultProductSet = cfresprod_fund_resultProductSet;
	}
	
	public Set<CfResProd_Indic> getCfresprod_indic_resultProductSet() {
		return this.cfresprod_indic_resultProductSet;
	}
	
	public void setCfresprod_indic_resultProductSet(Set<CfResProd_Indic> cfresprod_indic_resultProductSet) {
		this.cfresprod_indic_resultProductSet = cfresprod_indic_resultProductSet;
	}
	
	public Set<CfResProdKeyw> getCfresprodkeyw_resultProductSet() {
		return this.cfresprodkeyw_resultProductSet;
	}
	
	public void setCfresprodkeyw_resultProductSet(Set<CfResProdKeyw> cfresprodkeyw_resultProductSet) {
		this.cfresprodkeyw_resultProductSet = cfresprodkeyw_resultProductSet;
	}
	
	public Set<CfResProd_Meas> getCfresprod_meas_resultProductSet() {
		return this.cfresprod_meas_resultProductSet;
	}
	
	public void setCfresprod_meas_resultProductSet(Set<CfResProd_Meas> cfresprod_meas_resultProductSet) {
		this.cfresprod_meas_resultProductSet = cfresprod_meas_resultProductSet;
	}
	
	public Set<CfResProd_Medium> getCfresprod_medium_resultProductSet() {
		return this.cfresprod_medium_resultProductSet;
	}
	
	public void setCfresprod_medium_resultProductSet(Set<CfResProd_Medium> cfresprod_medium_resultProductSet) {
		this.cfresprod_medium_resultProductSet = cfresprod_medium_resultProductSet;
	}
	
	public Set<CfResProdName> getCfresprodname_resultProductSet() {
		return this.cfresprodname_resultProductSet;
	}
	
	public void setCfresprodname_resultProductSet(Set<CfResProdName> cfresprodname_resultProductSet) {
		this.cfresprodname_resultProductSet = cfresprodname_resultProductSet;
	}
	
	public Set<CfResProd_Srv> getCfresprod_srv_resultProductSet() {
		return this.cfresprod_srv_resultProductSet;
	}
	
	public void setCfresprod_srv_resultProductSet(Set<CfResProd_Srv> cfresprod_srv_resultProductSet) {
		this.cfresprod_srv_resultProductSet = cfresprod_srv_resultProductSet;
	}
	
	public Set<CfResProdVersInfo> getCfresprodversinfo_resultProductSet() {
		return this.cfresprodversinfo_resultProductSet;
	}
	
	public void setCfresprodversinfo_resultProductSet(Set<CfResProdVersInfo> cfresprodversinfo_resultProductSet) {
		this.cfresprodversinfo_resultProductSet = cfresprodversinfo_resultProductSet;
	}
	
	public Set<CfResPubl_ResProd> getCfrespubl_resprod_resultProductSet() {
		return this.cfrespubl_resprod_resultProductSet;
	}
	
	public void setCfrespubl_resprod_resultProductSet(Set<CfResPubl_ResProd> cfrespubl_resprod_resultProductSet) {
		this.cfrespubl_resprod_resultProductSet = cfrespubl_resprod_resultProductSet;
	}
	
}