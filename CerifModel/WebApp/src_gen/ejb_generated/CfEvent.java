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
@Table(name = "C1_EVENT")
public class CfEvent implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfEventId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_event_identifier;
	@Column(name = "cfCityTown", unique = false, nullable = false , length = 30, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_city_town;
	@Column(name = "cfFeeOrFree", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_fee_or_free;
	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_end_date;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cfevent_country", referencedColumnName="ID",  nullable = true)
	protected CfCountry cfevent_country;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_event_event")
	protected Set<CfEquip_Event> cfequip_event_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_class_event")
	protected Set<CfEvent_Class> cfevent_class_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeventdescr_event")
	protected Set<CfEventDescr> cfeventdescr_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_event_event")
	protected Set<CfEvent_Event> cfevent_event_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_event_eventa")
	protected Set<CfEvent_Event> cfevent_event_eventaSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_fund_event")
	protected Set<CfEvent_Fund> cfevent_fund_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_indic_event")
	protected Set<CfEvent_Indic> cfevent_indic_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeventkeyw_event")
	protected Set<CfEventKeyw> cfeventkeyw_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_meas_event")
	protected Set<CfEvent_Meas> cfevent_meas_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_medium_event")
	protected Set<CfEvent_Medium> cfevent_medium_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeventname_event")
	protected Set<CfEventName> cfeventname_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_event_event")
	protected Set<CfFacil_Event> cffacil_event_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_event_event")
	protected Set<CfOrgUnit_Event> cforgunit_event_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_event_event")
	protected Set<CfPers_Event> cfpers_event_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_event_event")
	protected Set<CfProj_Event> cfproj_event_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_event_event")
	protected Set<CfResPubl_Event> cfrespubl_event_eventSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_event_event")
	protected Set<CfSrv_Event> cfsrv_event_eventSet;
	
	public CfEvent(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_event_identifier() {
		return this.ka_event_identifier;
	}
	
	public void setKa_event_identifier(java.lang.String ka_event_identifier) {
		this.ka_event_identifier = ka_event_identifier;
	}
	
	public java.lang.String getKa_city_town() {
		return this.ka_city_town;
	}
	
	public void setKa_city_town(java.lang.String ka_city_town) {
		this.ka_city_town = ka_city_town;
	}
	
	public java.lang.String getKa_fee_or_free() {
		return this.ka_fee_or_free;
	}
	
	public void setKa_fee_or_free(java.lang.String ka_fee_or_free) {
		this.ka_fee_or_free = ka_fee_or_free;
	}
	
	public java.util.Date getKa_start_date() {
		return this.ka_start_date;
	}
	
	public void setKa_start_date(java.util.Date ka_start_date) {
		this.ka_start_date = ka_start_date;
	}
	
	public java.util.Date getKa_end_date() {
		return this.ka_end_date;
	}
	
	public void setKa_end_date(java.util.Date ka_end_date) {
		this.ka_end_date = ka_end_date;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public CfCountry getCfevent_country() {
		return this.cfevent_country;
	}
	
	public void setCfevent_country(CfCountry cfevent_country) {
		this.cfevent_country = cfevent_country;
	}
	
	public Set<CfEquip_Event> getCfequip_event_eventSet() {
		return this.cfequip_event_eventSet;
	}
	
	public void setCfequip_event_eventSet(Set<CfEquip_Event> cfequip_event_eventSet) {
		this.cfequip_event_eventSet = cfequip_event_eventSet;
	}
	
	public Set<CfEvent_Class> getCfevent_class_eventSet() {
		return this.cfevent_class_eventSet;
	}
	
	public void setCfevent_class_eventSet(Set<CfEvent_Class> cfevent_class_eventSet) {
		this.cfevent_class_eventSet = cfevent_class_eventSet;
	}
	
	public Set<CfEventDescr> getCfeventdescr_eventSet() {
		return this.cfeventdescr_eventSet;
	}
	
	public void setCfeventdescr_eventSet(Set<CfEventDescr> cfeventdescr_eventSet) {
		this.cfeventdescr_eventSet = cfeventdescr_eventSet;
	}
	
	public Set<CfEvent_Event> getCfevent_event_eventSet() {
		return this.cfevent_event_eventSet;
	}
	
	public void setCfevent_event_eventSet(Set<CfEvent_Event> cfevent_event_eventSet) {
		this.cfevent_event_eventSet = cfevent_event_eventSet;
	}
	
	public Set<CfEvent_Event> getCfevent_event_eventaSet() {
		return this.cfevent_event_eventaSet;
	}
	
	public void setCfevent_event_eventaSet(Set<CfEvent_Event> cfevent_event_eventaSet) {
		this.cfevent_event_eventaSet = cfevent_event_eventaSet;
	}
	
	public Set<CfEvent_Fund> getCfevent_fund_eventSet() {
		return this.cfevent_fund_eventSet;
	}
	
	public void setCfevent_fund_eventSet(Set<CfEvent_Fund> cfevent_fund_eventSet) {
		this.cfevent_fund_eventSet = cfevent_fund_eventSet;
	}
	
	public Set<CfEvent_Indic> getCfevent_indic_eventSet() {
		return this.cfevent_indic_eventSet;
	}
	
	public void setCfevent_indic_eventSet(Set<CfEvent_Indic> cfevent_indic_eventSet) {
		this.cfevent_indic_eventSet = cfevent_indic_eventSet;
	}
	
	public Set<CfEventKeyw> getCfeventkeyw_eventSet() {
		return this.cfeventkeyw_eventSet;
	}
	
	public void setCfeventkeyw_eventSet(Set<CfEventKeyw> cfeventkeyw_eventSet) {
		this.cfeventkeyw_eventSet = cfeventkeyw_eventSet;
	}
	
	public Set<CfEvent_Meas> getCfevent_meas_eventSet() {
		return this.cfevent_meas_eventSet;
	}
	
	public void setCfevent_meas_eventSet(Set<CfEvent_Meas> cfevent_meas_eventSet) {
		this.cfevent_meas_eventSet = cfevent_meas_eventSet;
	}
	
	public Set<CfEvent_Medium> getCfevent_medium_eventSet() {
		return this.cfevent_medium_eventSet;
	}
	
	public void setCfevent_medium_eventSet(Set<CfEvent_Medium> cfevent_medium_eventSet) {
		this.cfevent_medium_eventSet = cfevent_medium_eventSet;
	}
	
	public Set<CfEventName> getCfeventname_eventSet() {
		return this.cfeventname_eventSet;
	}
	
	public void setCfeventname_eventSet(Set<CfEventName> cfeventname_eventSet) {
		this.cfeventname_eventSet = cfeventname_eventSet;
	}
	
	public Set<CfFacil_Event> getCffacil_event_eventSet() {
		return this.cffacil_event_eventSet;
	}
	
	public void setCffacil_event_eventSet(Set<CfFacil_Event> cffacil_event_eventSet) {
		this.cffacil_event_eventSet = cffacil_event_eventSet;
	}
	
	public Set<CfOrgUnit_Event> getCforgunit_event_eventSet() {
		return this.cforgunit_event_eventSet;
	}
	
	public void setCforgunit_event_eventSet(Set<CfOrgUnit_Event> cforgunit_event_eventSet) {
		this.cforgunit_event_eventSet = cforgunit_event_eventSet;
	}
	
	public Set<CfPers_Event> getCfpers_event_eventSet() {
		return this.cfpers_event_eventSet;
	}
	
	public void setCfpers_event_eventSet(Set<CfPers_Event> cfpers_event_eventSet) {
		this.cfpers_event_eventSet = cfpers_event_eventSet;
	}
	
	public Set<CfProj_Event> getCfproj_event_eventSet() {
		return this.cfproj_event_eventSet;
	}
	
	public void setCfproj_event_eventSet(Set<CfProj_Event> cfproj_event_eventSet) {
		this.cfproj_event_eventSet = cfproj_event_eventSet;
	}
	
	public Set<CfResPubl_Event> getCfrespubl_event_eventSet() {
		return this.cfrespubl_event_eventSet;
	}
	
	public void setCfrespubl_event_eventSet(Set<CfResPubl_Event> cfrespubl_event_eventSet) {
		this.cfrespubl_event_eventSet = cfrespubl_event_eventSet;
	}
	
	public Set<CfSrv_Event> getCfsrv_event_eventSet() {
		return this.cfsrv_event_eventSet;
	}
	
	public void setCfsrv_event_eventSet(Set<CfSrv_Event> cfsrv_event_eventSet) {
		this.cfsrv_event_eventSet = cfsrv_event_eventSet;
	}
	
}