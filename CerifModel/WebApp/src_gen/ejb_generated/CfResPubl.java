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
@Table(name = "CM_RESULT_PUBLICATION")
public class CfResPubl implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfResPublId", unique = false, nullable = false )
	private java.lang.String a_result_publication_identifier;
	@Column(name = "cfResPublDate", unique = false, nullable = false )
	private java.util.Date a_result_publication_date;
	@Column(name = "cfNum", unique = false, nullable = false )
	private java.lang.String a_number;
	@Column(name = "cfVol", unique = false, nullable = false )
	private java.lang.String a_volume;
	@Column(name = "cfEdition", unique = false, nullable = false )
	private java.lang.String a_edition;
	@Column(name = "cfSeries", unique = false, nullable = false )
	private java.lang.String a_series;
	@Column(name = "cfIssue", unique = false, nullable = false )
	private java.lang.String a_issue;
	@Column(name = "cfStartPage", unique = false, nullable = false )
	private java.lang.String a_start_page;
	@Column(name = "cfEndPage", unique = false, nullable = false )
	private java.lang.String a_end_page;
	@Column(name = "cfTotalPages", unique = false, nullable = false )
	private java.lang.String a_total_pages;
	@Column(name = "cfISBN", unique = false, nullable = false )
	private java.lang.String a_isbn;
	@Column(name = "cfISSN", unique = false, nullable = false )
	private java.lang.String a_issn;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_respubl_resultPublication")
	private Set<CfOrgUnit_ResPubl> cforgunit_respubl_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_respubl_resultPublication")
	private Set<CfPers_ResPubl> cfpers_respubl_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_respubl_resultPublication")
	private Set<CfProj_ResPubl> cfproj_respubl_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respat_resultPublication")
	private Set<CfResPubl_ResPat> cfrespubl_respat_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_resprod_resultPublication")
	private Set<CfResPubl_ResProd> cfrespubl_resprod_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respubl_resultPublication1")
	private Set<CfResPubl_ResPubl> cfrespubl_respubl_resultPublication1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respubl_resultPublication2")
	private Set<CfResPubl_ResPubl> cfrespubl_respubl_resultPublication2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublabstr_resultPublication")
	private Set<CfResPublAbstr> cfrespublabstr_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublbiblnote_resultPublication")
	private Set<CfResPublBiblNote> cfrespublbiblnote_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_cite_resultPublication")
	private Set<CfResPubl_Cite> cfrespubl_cite_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_class_resultPublication")
	private Set<CfResPubl_Class> cfrespubl_class_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_dc_resultPublication")
	private Set<CfResPubl_DC> cfrespubl_dc_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_equip_resultPublication")
	private Set<CfResPubl_Equip> cfrespubl_equip_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_event_resultPublication")
	private Set<CfResPubl_Event> cfrespubl_event_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_facil_resultPublication")
	private Set<CfResPubl_Facil> cfrespubl_facil_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_fund_resultPublication")
	private Set<CfResPubl_Fund> cfrespubl_fund_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_indic_resultPublication")
	private Set<CfResPubl_Indic> cfrespubl_indic_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublkeyw_resultPublication")
	private Set<CfResPublKeyw> cfrespublkeyw_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_meas_resultPublication")
	private Set<CfResPubl_Meas> cfrespubl_meas_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_medium_resultPublication")
	private Set<CfResPubl_Medium> cfrespubl_medium_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_metrics_resultPublication")
	private Set<CfResPubl_Metrics> cfrespubl_metrics_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublnameabbrev_resultPublication")
	private Set<CfResPublNameAbbrev> cfrespublnameabbrev_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_srv_resultPublication")
	private Set<CfResPubl_Srv> cfrespubl_srv_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublsubtitle_resultPublication")
	private Set<CfResPublSubtitle> cfrespublsubtitle_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubltitle_resultPublication")
	private Set<CfResPublTitle> cfrespubltitle_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublversinfo_resultPublication")
	private Set<CfResPublVersInfo> cfrespublversinfo_resultPublicationSet;
	
	public CfResPubl(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_result_publication_identifier() {
		return this.a_result_publication_identifier;
	}
	
	public void setA_result_publication_identifier(java.lang.String a_result_publication_identifier) {
		this.a_result_publication_identifier = a_result_publication_identifier;
	}
	
	public java.util.Date getA_result_publication_date() {
		return this.a_result_publication_date;
	}
	
	public void setA_result_publication_date(java.util.Date a_result_publication_date) {
		this.a_result_publication_date = a_result_publication_date;
	}
	
	public java.lang.String getA_number() {
		return this.a_number;
	}
	
	public void setA_number(java.lang.String a_number) {
		this.a_number = a_number;
	}
	
	public java.lang.String getA_volume() {
		return this.a_volume;
	}
	
	public void setA_volume(java.lang.String a_volume) {
		this.a_volume = a_volume;
	}
	
	public java.lang.String getA_edition() {
		return this.a_edition;
	}
	
	public void setA_edition(java.lang.String a_edition) {
		this.a_edition = a_edition;
	}
	
	public java.lang.String getA_series() {
		return this.a_series;
	}
	
	public void setA_series(java.lang.String a_series) {
		this.a_series = a_series;
	}
	
	public java.lang.String getA_issue() {
		return this.a_issue;
	}
	
	public void setA_issue(java.lang.String a_issue) {
		this.a_issue = a_issue;
	}
	
	public java.lang.String getA_start_page() {
		return this.a_start_page;
	}
	
	public void setA_start_page(java.lang.String a_start_page) {
		this.a_start_page = a_start_page;
	}
	
	public java.lang.String getA_end_page() {
		return this.a_end_page;
	}
	
	public void setA_end_page(java.lang.String a_end_page) {
		this.a_end_page = a_end_page;
	}
	
	public java.lang.String getA_total_pages() {
		return this.a_total_pages;
	}
	
	public void setA_total_pages(java.lang.String a_total_pages) {
		this.a_total_pages = a_total_pages;
	}
	
	public java.lang.String getA_isbn() {
		return this.a_isbn;
	}
	
	public void setA_isbn(java.lang.String a_isbn) {
		this.a_isbn = a_isbn;
	}
	
	public java.lang.String getA_issn() {
		return this.a_issn;
	}
	
	public void setA_issn(java.lang.String a_issn) {
		this.a_issn = a_issn;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfOrgUnit_ResPubl> getCforgunit_respubl_resultPublicationSet() {
		return this.cforgunit_respubl_resultPublicationSet;
	}
	
	public void setCforgunit_respubl_resultPublicationSet(Set<CfOrgUnit_ResPubl> cforgunit_respubl_resultPublicationSet) {
		this.cforgunit_respubl_resultPublicationSet = cforgunit_respubl_resultPublicationSet;
	}
	
	public Set<CfPers_ResPubl> getCfpers_respubl_resultPublicationSet() {
		return this.cfpers_respubl_resultPublicationSet;
	}
	
	public void setCfpers_respubl_resultPublicationSet(Set<CfPers_ResPubl> cfpers_respubl_resultPublicationSet) {
		this.cfpers_respubl_resultPublicationSet = cfpers_respubl_resultPublicationSet;
	}
	
	public Set<CfProj_ResPubl> getCfproj_respubl_resultPublicationSet() {
		return this.cfproj_respubl_resultPublicationSet;
	}
	
	public void setCfproj_respubl_resultPublicationSet(Set<CfProj_ResPubl> cfproj_respubl_resultPublicationSet) {
		this.cfproj_respubl_resultPublicationSet = cfproj_respubl_resultPublicationSet;
	}
	
	public Set<CfResPubl_ResPat> getCfrespubl_respat_resultPublicationSet() {
		return this.cfrespubl_respat_resultPublicationSet;
	}
	
	public void setCfrespubl_respat_resultPublicationSet(Set<CfResPubl_ResPat> cfrespubl_respat_resultPublicationSet) {
		this.cfrespubl_respat_resultPublicationSet = cfrespubl_respat_resultPublicationSet;
	}
	
	public Set<CfResPubl_ResProd> getCfrespubl_resprod_resultPublicationSet() {
		return this.cfrespubl_resprod_resultPublicationSet;
	}
	
	public void setCfrespubl_resprod_resultPublicationSet(Set<CfResPubl_ResProd> cfrespubl_resprod_resultPublicationSet) {
		this.cfrespubl_resprod_resultPublicationSet = cfrespubl_resprod_resultPublicationSet;
	}
	
	public Set<CfResPubl_ResPubl> getCfrespubl_respubl_resultPublication1Set() {
		return this.cfrespubl_respubl_resultPublication1Set;
	}
	
	public void setCfrespubl_respubl_resultPublication1Set(Set<CfResPubl_ResPubl> cfrespubl_respubl_resultPublication1Set) {
		this.cfrespubl_respubl_resultPublication1Set = cfrespubl_respubl_resultPublication1Set;
	}
	
	public Set<CfResPubl_ResPubl> getCfrespubl_respubl_resultPublication2Set() {
		return this.cfrespubl_respubl_resultPublication2Set;
	}
	
	public void setCfrespubl_respubl_resultPublication2Set(Set<CfResPubl_ResPubl> cfrespubl_respubl_resultPublication2Set) {
		this.cfrespubl_respubl_resultPublication2Set = cfrespubl_respubl_resultPublication2Set;
	}
	
	public Set<CfResPublAbstr> getCfrespublabstr_resultPublicationSet() {
		return this.cfrespublabstr_resultPublicationSet;
	}
	
	public void setCfrespublabstr_resultPublicationSet(Set<CfResPublAbstr> cfrespublabstr_resultPublicationSet) {
		this.cfrespublabstr_resultPublicationSet = cfrespublabstr_resultPublicationSet;
	}
	
	public Set<CfResPublBiblNote> getCfrespublbiblnote_resultPublicationSet() {
		return this.cfrespublbiblnote_resultPublicationSet;
	}
	
	public void setCfrespublbiblnote_resultPublicationSet(Set<CfResPublBiblNote> cfrespublbiblnote_resultPublicationSet) {
		this.cfrespublbiblnote_resultPublicationSet = cfrespublbiblnote_resultPublicationSet;
	}
	
	public Set<CfResPubl_Cite> getCfrespubl_cite_resultPublicationSet() {
		return this.cfrespubl_cite_resultPublicationSet;
	}
	
	public void setCfrespubl_cite_resultPublicationSet(Set<CfResPubl_Cite> cfrespubl_cite_resultPublicationSet) {
		this.cfrespubl_cite_resultPublicationSet = cfrespubl_cite_resultPublicationSet;
	}
	
	public Set<CfResPubl_Class> getCfrespubl_class_resultPublicationSet() {
		return this.cfrespubl_class_resultPublicationSet;
	}
	
	public void setCfrespubl_class_resultPublicationSet(Set<CfResPubl_Class> cfrespubl_class_resultPublicationSet) {
		this.cfrespubl_class_resultPublicationSet = cfrespubl_class_resultPublicationSet;
	}
	
	public Set<CfResPubl_DC> getCfrespubl_dc_resultPublicationSet() {
		return this.cfrespubl_dc_resultPublicationSet;
	}
	
	public void setCfrespubl_dc_resultPublicationSet(Set<CfResPubl_DC> cfrespubl_dc_resultPublicationSet) {
		this.cfrespubl_dc_resultPublicationSet = cfrespubl_dc_resultPublicationSet;
	}
	
	public Set<CfResPubl_Equip> getCfrespubl_equip_resultPublicationSet() {
		return this.cfrespubl_equip_resultPublicationSet;
	}
	
	public void setCfrespubl_equip_resultPublicationSet(Set<CfResPubl_Equip> cfrespubl_equip_resultPublicationSet) {
		this.cfrespubl_equip_resultPublicationSet = cfrespubl_equip_resultPublicationSet;
	}
	
	public Set<CfResPubl_Event> getCfrespubl_event_resultPublicationSet() {
		return this.cfrespubl_event_resultPublicationSet;
	}
	
	public void setCfrespubl_event_resultPublicationSet(Set<CfResPubl_Event> cfrespubl_event_resultPublicationSet) {
		this.cfrespubl_event_resultPublicationSet = cfrespubl_event_resultPublicationSet;
	}
	
	public Set<CfResPubl_Facil> getCfrespubl_facil_resultPublicationSet() {
		return this.cfrespubl_facil_resultPublicationSet;
	}
	
	public void setCfrespubl_facil_resultPublicationSet(Set<CfResPubl_Facil> cfrespubl_facil_resultPublicationSet) {
		this.cfrespubl_facil_resultPublicationSet = cfrespubl_facil_resultPublicationSet;
	}
	
	public Set<CfResPubl_Fund> getCfrespubl_fund_resultPublicationSet() {
		return this.cfrespubl_fund_resultPublicationSet;
	}
	
	public void setCfrespubl_fund_resultPublicationSet(Set<CfResPubl_Fund> cfrespubl_fund_resultPublicationSet) {
		this.cfrespubl_fund_resultPublicationSet = cfrespubl_fund_resultPublicationSet;
	}
	
	public Set<CfResPubl_Indic> getCfrespubl_indic_resultPublicationSet() {
		return this.cfrespubl_indic_resultPublicationSet;
	}
	
	public void setCfrespubl_indic_resultPublicationSet(Set<CfResPubl_Indic> cfrespubl_indic_resultPublicationSet) {
		this.cfrespubl_indic_resultPublicationSet = cfrespubl_indic_resultPublicationSet;
	}
	
	public Set<CfResPublKeyw> getCfrespublkeyw_resultPublicationSet() {
		return this.cfrespublkeyw_resultPublicationSet;
	}
	
	public void setCfrespublkeyw_resultPublicationSet(Set<CfResPublKeyw> cfrespublkeyw_resultPublicationSet) {
		this.cfrespublkeyw_resultPublicationSet = cfrespublkeyw_resultPublicationSet;
	}
	
	public Set<CfResPubl_Meas> getCfrespubl_meas_resultPublicationSet() {
		return this.cfrespubl_meas_resultPublicationSet;
	}
	
	public void setCfrespubl_meas_resultPublicationSet(Set<CfResPubl_Meas> cfrespubl_meas_resultPublicationSet) {
		this.cfrespubl_meas_resultPublicationSet = cfrespubl_meas_resultPublicationSet;
	}
	
	public Set<CfResPubl_Medium> getCfrespubl_medium_resultPublicationSet() {
		return this.cfrespubl_medium_resultPublicationSet;
	}
	
	public void setCfrespubl_medium_resultPublicationSet(Set<CfResPubl_Medium> cfrespubl_medium_resultPublicationSet) {
		this.cfrespubl_medium_resultPublicationSet = cfrespubl_medium_resultPublicationSet;
	}
	
	public Set<CfResPubl_Metrics> getCfrespubl_metrics_resultPublicationSet() {
		return this.cfrespubl_metrics_resultPublicationSet;
	}
	
	public void setCfrespubl_metrics_resultPublicationSet(Set<CfResPubl_Metrics> cfrespubl_metrics_resultPublicationSet) {
		this.cfrespubl_metrics_resultPublicationSet = cfrespubl_metrics_resultPublicationSet;
	}
	
	public Set<CfResPublNameAbbrev> getCfrespublnameabbrev_resultPublicationSet() {
		return this.cfrespublnameabbrev_resultPublicationSet;
	}
	
	public void setCfrespublnameabbrev_resultPublicationSet(Set<CfResPublNameAbbrev> cfrespublnameabbrev_resultPublicationSet) {
		this.cfrespublnameabbrev_resultPublicationSet = cfrespublnameabbrev_resultPublicationSet;
	}
	
	public Set<CfResPubl_Srv> getCfrespubl_srv_resultPublicationSet() {
		return this.cfrespubl_srv_resultPublicationSet;
	}
	
	public void setCfrespubl_srv_resultPublicationSet(Set<CfResPubl_Srv> cfrespubl_srv_resultPublicationSet) {
		this.cfrespubl_srv_resultPublicationSet = cfrespubl_srv_resultPublicationSet;
	}
	
	public Set<CfResPublSubtitle> getCfrespublsubtitle_resultPublicationSet() {
		return this.cfrespublsubtitle_resultPublicationSet;
	}
	
	public void setCfrespublsubtitle_resultPublicationSet(Set<CfResPublSubtitle> cfrespublsubtitle_resultPublicationSet) {
		this.cfrespublsubtitle_resultPublicationSet = cfrespublsubtitle_resultPublicationSet;
	}
	
	public Set<CfResPublTitle> getCfrespubltitle_resultPublicationSet() {
		return this.cfrespubltitle_resultPublicationSet;
	}
	
	public void setCfrespubltitle_resultPublicationSet(Set<CfResPublTitle> cfrespubltitle_resultPublicationSet) {
		this.cfrespubltitle_resultPublicationSet = cfrespubltitle_resultPublicationSet;
	}
	
	public Set<CfResPublVersInfo> getCfrespublversinfo_resultPublicationSet() {
		return this.cfrespublversinfo_resultPublicationSet;
	}
	
	public void setCfrespublversinfo_resultPublicationSet(Set<CfResPublVersInfo> cfrespublversinfo_resultPublicationSet) {
		this.cfrespublversinfo_resultPublicationSet = cfrespublversinfo_resultPublicationSet;
	}
	
}