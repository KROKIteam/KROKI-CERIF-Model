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
@Table(name = "CM_MEASUREMENT")
public class CfMeas implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfMeasId", unique = false, nullable = false )
	private java.lang.String a_measurement_identifier;
	@Column(name = "cfCountInt", unique = false, nullable = false )
	private java.lang.String a_count_integer;
	@Column(name = "cfValFloatP", unique = false, nullable = false )
	private java.math.BigDecimal a_value_floating_point;
	@Column(name = "cfValJudgeNum", unique = false, nullable = false )
	private java.math.BigDecimal a_value_judgemental_numeric;
	@Column(name = "cfCountIntChange", unique = false, nullable = false )
	private java.lang.String a_count_integer_change;
	@Column(name = "cfCountFloatPChange", unique = false, nullable = false )
	private java.math.BigDecimal a_count_floating_point_change;
	@Column(name = "cfValJudgeNumChange", unique = false, nullable = false )
	private java.math.BigDecimal a_value_judgemental_numeric_change;
	@Column(name = "cfValJudgeText", unique = false, nullable = false )
	private java.lang.String a_value_judgemental_text;
	@Column(name = "cfValJudgeTextChange", unique = false, nullable = false )
	private java.lang.String a_value_judgemental_text_change;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_meas_measurement")
	private Set<CfEquip_Meas> cfequip_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_meas_measurement")
	private Set<CfEvent_Meas> cfevent_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_meas_measurement")
	private Set<CfFacil_Meas> cffacil_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_meas_measurement")
	private Set<CfFund_Meas> cffund_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfindic_meas_measurement")
	private Set<CfIndic_Meas> cfindic_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeas_meas_measurement1")
	private Set<CfMeas_Meas> cfmeas_meas_measurement1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeas_meas_measurement2")
	private Set<CfMeas_Meas> cfmeas_meas_measurement2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeas_class_measurement")
	private Set<CfMeas_Class> cfmeas_class_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeasdescr_measurement")
	private Set<CfMeasDescr> cfmeasdescr_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeaskeyw_measurement")
	private Set<CfMeasKeyw> cfmeaskeyw_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmeasname_measurement")
	private Set<CfMeasName> cfmeasname_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmedium_meas_measurement")
	private Set<CfMedium_Meas> cfmedium_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_meas_measurement")
	private Set<CfOrgUnit_Meas> cforgunit_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_meas_measurement")
	private Set<CfPers_Meas> cfpers_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_meas_measurement")
	private Set<CfProj_Meas> cfproj_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_meas_measurement")
	private Set<CfResPat_Meas> cfrespat_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfresprod_meas_measurement")
	private Set<CfResProd_Meas> cfresprod_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_meas_measurement")
	private Set<CfResPubl_Meas> cfrespubl_meas_measurementSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_meas_measurement")
	private Set<CfSrv_Meas> cfsrv_meas_measurementSet;
	
	public CfMeas(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_measurement_identifier() {
		return this.a_measurement_identifier;
	}
	
	public void setA_measurement_identifier(java.lang.String a_measurement_identifier) {
		this.a_measurement_identifier = a_measurement_identifier;
	}
	
	public java.lang.String getA_count_integer() {
		return this.a_count_integer;
	}
	
	public void setA_count_integer(java.lang.String a_count_integer) {
		this.a_count_integer = a_count_integer;
	}
	
	public java.math.BigDecimal getA_value_floating_point() {
		return this.a_value_floating_point;
	}
	
	public void setA_value_floating_point(java.math.BigDecimal a_value_floating_point) {
		this.a_value_floating_point = a_value_floating_point;
	}
	
	public java.math.BigDecimal getA_value_judgemental_numeric() {
		return this.a_value_judgemental_numeric;
	}
	
	public void setA_value_judgemental_numeric(java.math.BigDecimal a_value_judgemental_numeric) {
		this.a_value_judgemental_numeric = a_value_judgemental_numeric;
	}
	
	public java.lang.String getA_count_integer_change() {
		return this.a_count_integer_change;
	}
	
	public void setA_count_integer_change(java.lang.String a_count_integer_change) {
		this.a_count_integer_change = a_count_integer_change;
	}
	
	public java.math.BigDecimal getA_count_floating_point_change() {
		return this.a_count_floating_point_change;
	}
	
	public void setA_count_floating_point_change(java.math.BigDecimal a_count_floating_point_change) {
		this.a_count_floating_point_change = a_count_floating_point_change;
	}
	
	public java.math.BigDecimal getA_value_judgemental_numeric_change() {
		return this.a_value_judgemental_numeric_change;
	}
	
	public void setA_value_judgemental_numeric_change(java.math.BigDecimal a_value_judgemental_numeric_change) {
		this.a_value_judgemental_numeric_change = a_value_judgemental_numeric_change;
	}
	
	public java.lang.String getA_value_judgemental_text() {
		return this.a_value_judgemental_text;
	}
	
	public void setA_value_judgemental_text(java.lang.String a_value_judgemental_text) {
		this.a_value_judgemental_text = a_value_judgemental_text;
	}
	
	public java.lang.String getA_value_judgemental_text_change() {
		return this.a_value_judgemental_text_change;
	}
	
	public void setA_value_judgemental_text_change(java.lang.String a_value_judgemental_text_change) {
		this.a_value_judgemental_text_change = a_value_judgemental_text_change;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfEquip_Meas> getCfequip_meas_measurementSet() {
		return this.cfequip_meas_measurementSet;
	}
	
	public void setCfequip_meas_measurementSet(Set<CfEquip_Meas> cfequip_meas_measurementSet) {
		this.cfequip_meas_measurementSet = cfequip_meas_measurementSet;
	}
	
	public Set<CfEvent_Meas> getCfevent_meas_measurementSet() {
		return this.cfevent_meas_measurementSet;
	}
	
	public void setCfevent_meas_measurementSet(Set<CfEvent_Meas> cfevent_meas_measurementSet) {
		this.cfevent_meas_measurementSet = cfevent_meas_measurementSet;
	}
	
	public Set<CfFacil_Meas> getCffacil_meas_measurementSet() {
		return this.cffacil_meas_measurementSet;
	}
	
	public void setCffacil_meas_measurementSet(Set<CfFacil_Meas> cffacil_meas_measurementSet) {
		this.cffacil_meas_measurementSet = cffacil_meas_measurementSet;
	}
	
	public Set<CfFund_Meas> getCffund_meas_measurementSet() {
		return this.cffund_meas_measurementSet;
	}
	
	public void setCffund_meas_measurementSet(Set<CfFund_Meas> cffund_meas_measurementSet) {
		this.cffund_meas_measurementSet = cffund_meas_measurementSet;
	}
	
	public Set<CfIndic_Meas> getCfindic_meas_measurementSet() {
		return this.cfindic_meas_measurementSet;
	}
	
	public void setCfindic_meas_measurementSet(Set<CfIndic_Meas> cfindic_meas_measurementSet) {
		this.cfindic_meas_measurementSet = cfindic_meas_measurementSet;
	}
	
	public Set<CfMeas_Meas> getCfmeas_meas_measurement1Set() {
		return this.cfmeas_meas_measurement1Set;
	}
	
	public void setCfmeas_meas_measurement1Set(Set<CfMeas_Meas> cfmeas_meas_measurement1Set) {
		this.cfmeas_meas_measurement1Set = cfmeas_meas_measurement1Set;
	}
	
	public Set<CfMeas_Meas> getCfmeas_meas_measurement2Set() {
		return this.cfmeas_meas_measurement2Set;
	}
	
	public void setCfmeas_meas_measurement2Set(Set<CfMeas_Meas> cfmeas_meas_measurement2Set) {
		this.cfmeas_meas_measurement2Set = cfmeas_meas_measurement2Set;
	}
	
	public Set<CfMeas_Class> getCfmeas_class_measurementSet() {
		return this.cfmeas_class_measurementSet;
	}
	
	public void setCfmeas_class_measurementSet(Set<CfMeas_Class> cfmeas_class_measurementSet) {
		this.cfmeas_class_measurementSet = cfmeas_class_measurementSet;
	}
	
	public Set<CfMeasDescr> getCfmeasdescr_measurementSet() {
		return this.cfmeasdescr_measurementSet;
	}
	
	public void setCfmeasdescr_measurementSet(Set<CfMeasDescr> cfmeasdescr_measurementSet) {
		this.cfmeasdescr_measurementSet = cfmeasdescr_measurementSet;
	}
	
	public Set<CfMeasKeyw> getCfmeaskeyw_measurementSet() {
		return this.cfmeaskeyw_measurementSet;
	}
	
	public void setCfmeaskeyw_measurementSet(Set<CfMeasKeyw> cfmeaskeyw_measurementSet) {
		this.cfmeaskeyw_measurementSet = cfmeaskeyw_measurementSet;
	}
	
	public Set<CfMeasName> getCfmeasname_measurementSet() {
		return this.cfmeasname_measurementSet;
	}
	
	public void setCfmeasname_measurementSet(Set<CfMeasName> cfmeasname_measurementSet) {
		this.cfmeasname_measurementSet = cfmeasname_measurementSet;
	}
	
	public Set<CfMedium_Meas> getCfmedium_meas_measurementSet() {
		return this.cfmedium_meas_measurementSet;
	}
	
	public void setCfmedium_meas_measurementSet(Set<CfMedium_Meas> cfmedium_meas_measurementSet) {
		this.cfmedium_meas_measurementSet = cfmedium_meas_measurementSet;
	}
	
	public Set<CfOrgUnit_Meas> getCforgunit_meas_measurementSet() {
		return this.cforgunit_meas_measurementSet;
	}
	
	public void setCforgunit_meas_measurementSet(Set<CfOrgUnit_Meas> cforgunit_meas_measurementSet) {
		this.cforgunit_meas_measurementSet = cforgunit_meas_measurementSet;
	}
	
	public Set<CfPers_Meas> getCfpers_meas_measurementSet() {
		return this.cfpers_meas_measurementSet;
	}
	
	public void setCfpers_meas_measurementSet(Set<CfPers_Meas> cfpers_meas_measurementSet) {
		this.cfpers_meas_measurementSet = cfpers_meas_measurementSet;
	}
	
	public Set<CfProj_Meas> getCfproj_meas_measurementSet() {
		return this.cfproj_meas_measurementSet;
	}
	
	public void setCfproj_meas_measurementSet(Set<CfProj_Meas> cfproj_meas_measurementSet) {
		this.cfproj_meas_measurementSet = cfproj_meas_measurementSet;
	}
	
	public Set<CfResPat_Meas> getCfrespat_meas_measurementSet() {
		return this.cfrespat_meas_measurementSet;
	}
	
	public void setCfrespat_meas_measurementSet(Set<CfResPat_Meas> cfrespat_meas_measurementSet) {
		this.cfrespat_meas_measurementSet = cfrespat_meas_measurementSet;
	}
	
	public Set<CfResProd_Meas> getCfresprod_meas_measurementSet() {
		return this.cfresprod_meas_measurementSet;
	}
	
	public void setCfresprod_meas_measurementSet(Set<CfResProd_Meas> cfresprod_meas_measurementSet) {
		this.cfresprod_meas_measurementSet = cfresprod_meas_measurementSet;
	}
	
	public Set<CfResPubl_Meas> getCfrespubl_meas_measurementSet() {
		return this.cfrespubl_meas_measurementSet;
	}
	
	public void setCfrespubl_meas_measurementSet(Set<CfResPubl_Meas> cfrespubl_meas_measurementSet) {
		this.cfrespubl_meas_measurementSet = cfrespubl_meas_measurementSet;
	}
	
	public Set<CfSrv_Meas> getCfsrv_meas_measurementSet() {
		return this.cfsrv_meas_measurementSet;
	}
	
	public void setCfsrv_meas_measurementSet(Set<CfSrv_Meas> cfsrv_meas_measurementSet) {
		this.cfsrv_meas_measurementSet = cfsrv_meas_measurementSet;
	}
	
}