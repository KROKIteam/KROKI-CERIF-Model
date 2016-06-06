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
@Table(name = "C1_RESULT_PUBLICATION")
public class CfResPubl implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfResPublId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_result_publication_identifier;
	@Column(name = "cfResPublDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_result_publication_date;
	@Column(name = "cfNum", unique = false, nullable = false , length = 32, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_number;
	@Column(name = "cfVol", unique = false, nullable = false , length = 3, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_volume;
	@Column(name = "cfEdition", unique = false, nullable = false , length = 8, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_edition;
	@Column(name = "cfSeries", unique = false, nullable = false , length = 8, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_series;
	@Column(name = "cfIssue", unique = false, nullable = false , length = 8, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_issue;
	@Column(name = "cfStartPage", unique = false, nullable = false , length = 8, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_start_page;
	@Column(name = "cfEndPage", unique = false, nullable = false , length = 8, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_end_page;
	@Column(name = "cfTotalPages", unique = false, nullable = false , length = 8, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_total_pages;
	@Column(name = "cfISBN", unique = false, nullable = false , length = 20, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_isbn;
	@Column(name = "cfISSN", unique = false, nullable = false , length = 16, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_issn;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_respubl_resultPublication")
	protected Set<CfOrgUnit_ResPubl> cforgunit_respubl_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_respubl_resultPublication")
	protected Set<CfPers_ResPubl> cfpers_respubl_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_respubl_resultPublication")
	protected Set<CfProj_ResPubl> cfproj_respubl_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respat_resultPublication")
	protected Set<CfResPubl_ResPat> cfrespubl_respat_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_resprod_resultPublication")
	protected Set<CfResPubl_ResProd> cfrespubl_resprod_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respubl_resultPublication1")
	protected Set<CfResPubl_ResPubl> cfrespubl_respubl_resultPublication1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_respubl_resultPublication2")
	protected Set<CfResPubl_ResPubl> cfrespubl_respubl_resultPublication2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublabstr_resultPublication")
	protected Set<CfResPublAbstr> cfrespublabstr_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublbiblnote_resultPublication")
	protected Set<CfResPublBiblNote> cfrespublbiblnote_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_cite_resultPublication")
	protected Set<CfResPubl_Cite> cfrespubl_cite_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_class_resultPublication")
	protected Set<CfResPubl_Class> cfrespubl_class_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_dc_resultPublication")
	protected Set<CfResPubl_DC> cfrespubl_dc_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_equip_resultPublication")
	protected Set<CfResPubl_Equip> cfrespubl_equip_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_event_resultPublication")
	protected Set<CfResPubl_Event> cfrespubl_event_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_facil_resultPublication")
	protected Set<CfResPubl_Facil> cfrespubl_facil_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_fund_resultPublication")
	protected Set<CfResPubl_Fund> cfrespubl_fund_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_indic_resultPublication")
	protected Set<CfResPubl_Indic> cfrespubl_indic_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublkeyw_resultPublication")
	protected Set<CfResPublKeyw> cfrespublkeyw_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_meas_resultPublication")
	protected Set<CfResPubl_Meas> cfrespubl_meas_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_medium_resultPublication")
	protected Set<CfResPubl_Medium> cfrespubl_medium_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_metrics_resultPublication")
	protected Set<CfResPubl_Metrics> cfrespubl_metrics_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublnameabbrev_resultPublication")
	protected Set<CfResPublNameAbbrev> cfrespublnameabbrev_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_srv_resultPublication")
	protected Set<CfResPubl_Srv> cfrespubl_srv_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublsubtitle_resultPublication")
	protected Set<CfResPublSubtitle> cfrespublsubtitle_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubltitle_resultPublication")
	protected Set<CfResPublTitle> cfrespubltitle_resultPublicationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespublversinfo_resultPublication")
	protected Set<CfResPublVersInfo> cfrespublversinfo_resultPublicationSet;
	
	public CfResPubl(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_result_publication_identifier() {
		return this.ka_result_publication_identifier;
	}
	
	public void setKa_result_publication_identifier(java.lang.String ka_result_publication_identifier) {
		this.ka_result_publication_identifier = ka_result_publication_identifier;
	}
	
	public java.util.Date getKa_result_publication_date() {
		return this.ka_result_publication_date;
	}
	
	public void setKa_result_publication_date(java.util.Date ka_result_publication_date) {
		this.ka_result_publication_date = ka_result_publication_date;
	}
	
	public java.lang.String getKa_number() {
		return this.ka_number;
	}
	
	public void setKa_number(java.lang.String ka_number) {
		this.ka_number = ka_number;
	}
	
	public java.lang.String getKa_volume() {
		return this.ka_volume;
	}
	
	public void setKa_volume(java.lang.String ka_volume) {
		this.ka_volume = ka_volume;
	}
	
	public java.lang.String getKa_edition() {
		return this.ka_edition;
	}
	
	public void setKa_edition(java.lang.String ka_edition) {
		this.ka_edition = ka_edition;
	}
	
	public java.lang.String getKa_series() {
		return this.ka_series;
	}
	
	public void setKa_series(java.lang.String ka_series) {
		this.ka_series = ka_series;
	}
	
	public java.lang.String getKa_issue() {
		return this.ka_issue;
	}
	
	public void setKa_issue(java.lang.String ka_issue) {
		this.ka_issue = ka_issue;
	}
	
	public java.lang.String getKa_start_page() {
		return this.ka_start_page;
	}
	
	public void setKa_start_page(java.lang.String ka_start_page) {
		this.ka_start_page = ka_start_page;
	}
	
	public java.lang.String getKa_end_page() {
		return this.ka_end_page;
	}
	
	public void setKa_end_page(java.lang.String ka_end_page) {
		this.ka_end_page = ka_end_page;
	}
	
	public java.lang.String getKa_total_pages() {
		return this.ka_total_pages;
	}
	
	public void setKa_total_pages(java.lang.String ka_total_pages) {
		this.ka_total_pages = ka_total_pages;
	}
	
	public java.lang.String getKa_isbn() {
		return this.ka_isbn;
	}
	
	public void setKa_isbn(java.lang.String ka_isbn) {
		this.ka_isbn = ka_isbn;
	}
	
	public java.lang.String getKa_issn() {
		return this.ka_issn;
	}
	
	public void setKa_issn(java.lang.String ka_issn) {
		this.ka_issn = ka_issn;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
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