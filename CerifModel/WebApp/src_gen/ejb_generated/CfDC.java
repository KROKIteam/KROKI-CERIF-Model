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
@Table(name = "C1_DUBLIN_CORE")
public class CfDC implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfDCId", unique = false, nullable = false , length = 32, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_dc_identifier;
	@Column(name = "cfDCScheme", unique = false, nullable = false , length = 32, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_dc_scheme;
	@Column(name = "cfDCSchemeURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_dc_scheme_uri;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcaudience_dublinCore")
	protected Set<CfDCAudience> cfdcaudience_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdccontributor_dublinCore")
	protected Set<CfDCContributor> cfdccontributor_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdccoverage_dublinCore")
	protected Set<CfDCCoverage> cfdccoverage_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdccoveragespatial_dublinCore")
	protected Set<CfDCCoverageSpatial> cfdccoveragespatial_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdccoveragetemporal_dublinCore")
	protected Set<CfDCCoverageTemporal> cfdccoveragetemporal_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdccreator_dublinCore")
	protected Set<CfDCCreator> cfdccreator_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcdate_dublinCore")
	protected Set<CfDCDate> cfdcdate_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcdescription_dublinCore")
	protected Set<CfDCDescription> cfdcdescription_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcformat_dublinCore")
	protected Set<CfDCFormat> cfdcformat_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdclanguage_dublinCore")
	protected Set<CfDCLanguage> cfdclanguage_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcprovenance_dublinCore")
	protected Set<CfDCProvenance> cfdcprovenance_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcpublisher_dublinCore")
	protected Set<CfDCPublisher> cfdcpublisher_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcrelation_dublinCore")
	protected Set<CfDCRelation> cfdcrelation_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcrelation_dublinCorea")
	protected Set<CfDCRelation> cfdcrelation_dublinCoreaSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcresourceidentifier_dublinCore")
	protected Set<CfDCResourceIdentifier> cfdcresourceidentifier_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcresourcetype_dublinCore")
	protected Set<CfDCResourceType> cfdcresourcetype_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcrightsholder_dublinCore")
	protected Set<CfDCRightsHolder> cfdcrightsholder_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcrightsmm_dublinCore")
	protected Set<CfDCRightsMM> cfdcrightsmm_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcrightsmmaccessrights_dublinCore")
	protected Set<CfDCRightsMMAccessRights> cfdcrightsmmaccessrights_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcrightsmmlicense_dublinCore")
	protected Set<CfDCRightsMMLicense> cfdcrightsmmlicense_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcsource_dublinCore")
	protected Set<CfDCSource> cfdcsource_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdcsubject_dublinCore")
	protected Set<CfDCSubject> cfdcsubject_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfdctitle_dublinCore")
	protected Set<CfDCTitle> cfdctitle_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffdcrightsmmpricing_dublinCore")
	protected Set<CfFDCRightsMMPricing> cffdcrightsmmpricing_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffdcrightsmmprivacy_dublinCore")
	protected Set<CfFDCRightsMMPrivacy> cffdcrightsmmprivacy_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffdcrightsmmrights_dublinCore")
	protected Set<CfFDCRightsMMRights> cffdcrightsmmrights_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffdcrightsmmsecurity_dublinCore")
	protected Set<CfFDCRightsMMSecurity> cffdcrightsmmsecurity_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_dc_dublinCore")
	protected Set<CfOrgUnit_DC> cforgunit_dc_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_dc_dublinCore")
	protected Set<CfPers_DC> cfpers_dc_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_dc_dublinCore")
	protected Set<CfProj_DC> cfproj_dc_dublinCoreSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_dc_dublinCore")
	protected Set<CfResPubl_DC> cfrespubl_dc_dublinCoreSet;
	
	public CfDC(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_dc_identifier() {
		return this.ka_dc_identifier;
	}
	
	public void setKa_dc_identifier(java.lang.String ka_dc_identifier) {
		this.ka_dc_identifier = ka_dc_identifier;
	}
	
	public java.lang.String getKa_dc_scheme() {
		return this.ka_dc_scheme;
	}
	
	public void setKa_dc_scheme(java.lang.String ka_dc_scheme) {
		this.ka_dc_scheme = ka_dc_scheme;
	}
	
	public java.lang.String getKa_dc_scheme_uri() {
		return this.ka_dc_scheme_uri;
	}
	
	public void setKa_dc_scheme_uri(java.lang.String ka_dc_scheme_uri) {
		this.ka_dc_scheme_uri = ka_dc_scheme_uri;
	}
	
	public Set<CfDCAudience> getCfdcaudience_dublinCoreSet() {
		return this.cfdcaudience_dublinCoreSet;
	}
	
	public void setCfdcaudience_dublinCoreSet(Set<CfDCAudience> cfdcaudience_dublinCoreSet) {
		this.cfdcaudience_dublinCoreSet = cfdcaudience_dublinCoreSet;
	}
	
	public Set<CfDCContributor> getCfdccontributor_dublinCoreSet() {
		return this.cfdccontributor_dublinCoreSet;
	}
	
	public void setCfdccontributor_dublinCoreSet(Set<CfDCContributor> cfdccontributor_dublinCoreSet) {
		this.cfdccontributor_dublinCoreSet = cfdccontributor_dublinCoreSet;
	}
	
	public Set<CfDCCoverage> getCfdccoverage_dublinCoreSet() {
		return this.cfdccoverage_dublinCoreSet;
	}
	
	public void setCfdccoverage_dublinCoreSet(Set<CfDCCoverage> cfdccoverage_dublinCoreSet) {
		this.cfdccoverage_dublinCoreSet = cfdccoverage_dublinCoreSet;
	}
	
	public Set<CfDCCoverageSpatial> getCfdccoveragespatial_dublinCoreSet() {
		return this.cfdccoveragespatial_dublinCoreSet;
	}
	
	public void setCfdccoveragespatial_dublinCoreSet(Set<CfDCCoverageSpatial> cfdccoveragespatial_dublinCoreSet) {
		this.cfdccoveragespatial_dublinCoreSet = cfdccoveragespatial_dublinCoreSet;
	}
	
	public Set<CfDCCoverageTemporal> getCfdccoveragetemporal_dublinCoreSet() {
		return this.cfdccoveragetemporal_dublinCoreSet;
	}
	
	public void setCfdccoveragetemporal_dublinCoreSet(Set<CfDCCoverageTemporal> cfdccoveragetemporal_dublinCoreSet) {
		this.cfdccoveragetemporal_dublinCoreSet = cfdccoveragetemporal_dublinCoreSet;
	}
	
	public Set<CfDCCreator> getCfdccreator_dublinCoreSet() {
		return this.cfdccreator_dublinCoreSet;
	}
	
	public void setCfdccreator_dublinCoreSet(Set<CfDCCreator> cfdccreator_dublinCoreSet) {
		this.cfdccreator_dublinCoreSet = cfdccreator_dublinCoreSet;
	}
	
	public Set<CfDCDate> getCfdcdate_dublinCoreSet() {
		return this.cfdcdate_dublinCoreSet;
	}
	
	public void setCfdcdate_dublinCoreSet(Set<CfDCDate> cfdcdate_dublinCoreSet) {
		this.cfdcdate_dublinCoreSet = cfdcdate_dublinCoreSet;
	}
	
	public Set<CfDCDescription> getCfdcdescription_dublinCoreSet() {
		return this.cfdcdescription_dublinCoreSet;
	}
	
	public void setCfdcdescription_dublinCoreSet(Set<CfDCDescription> cfdcdescription_dublinCoreSet) {
		this.cfdcdescription_dublinCoreSet = cfdcdescription_dublinCoreSet;
	}
	
	public Set<CfDCFormat> getCfdcformat_dublinCoreSet() {
		return this.cfdcformat_dublinCoreSet;
	}
	
	public void setCfdcformat_dublinCoreSet(Set<CfDCFormat> cfdcformat_dublinCoreSet) {
		this.cfdcformat_dublinCoreSet = cfdcformat_dublinCoreSet;
	}
	
	public Set<CfDCLanguage> getCfdclanguage_dublinCoreSet() {
		return this.cfdclanguage_dublinCoreSet;
	}
	
	public void setCfdclanguage_dublinCoreSet(Set<CfDCLanguage> cfdclanguage_dublinCoreSet) {
		this.cfdclanguage_dublinCoreSet = cfdclanguage_dublinCoreSet;
	}
	
	public Set<CfDCProvenance> getCfdcprovenance_dublinCoreSet() {
		return this.cfdcprovenance_dublinCoreSet;
	}
	
	public void setCfdcprovenance_dublinCoreSet(Set<CfDCProvenance> cfdcprovenance_dublinCoreSet) {
		this.cfdcprovenance_dublinCoreSet = cfdcprovenance_dublinCoreSet;
	}
	
	public Set<CfDCPublisher> getCfdcpublisher_dublinCoreSet() {
		return this.cfdcpublisher_dublinCoreSet;
	}
	
	public void setCfdcpublisher_dublinCoreSet(Set<CfDCPublisher> cfdcpublisher_dublinCoreSet) {
		this.cfdcpublisher_dublinCoreSet = cfdcpublisher_dublinCoreSet;
	}
	
	public Set<CfDCRelation> getCfdcrelation_dublinCoreSet() {
		return this.cfdcrelation_dublinCoreSet;
	}
	
	public void setCfdcrelation_dublinCoreSet(Set<CfDCRelation> cfdcrelation_dublinCoreSet) {
		this.cfdcrelation_dublinCoreSet = cfdcrelation_dublinCoreSet;
	}
	
	public Set<CfDCRelation> getCfdcrelation_dublinCoreaSet() {
		return this.cfdcrelation_dublinCoreaSet;
	}
	
	public void setCfdcrelation_dublinCoreaSet(Set<CfDCRelation> cfdcrelation_dublinCoreaSet) {
		this.cfdcrelation_dublinCoreaSet = cfdcrelation_dublinCoreaSet;
	}
	
	public Set<CfDCResourceIdentifier> getCfdcresourceidentifier_dublinCoreSet() {
		return this.cfdcresourceidentifier_dublinCoreSet;
	}
	
	public void setCfdcresourceidentifier_dublinCoreSet(Set<CfDCResourceIdentifier> cfdcresourceidentifier_dublinCoreSet) {
		this.cfdcresourceidentifier_dublinCoreSet = cfdcresourceidentifier_dublinCoreSet;
	}
	
	public Set<CfDCResourceType> getCfdcresourcetype_dublinCoreSet() {
		return this.cfdcresourcetype_dublinCoreSet;
	}
	
	public void setCfdcresourcetype_dublinCoreSet(Set<CfDCResourceType> cfdcresourcetype_dublinCoreSet) {
		this.cfdcresourcetype_dublinCoreSet = cfdcresourcetype_dublinCoreSet;
	}
	
	public Set<CfDCRightsHolder> getCfdcrightsholder_dublinCoreSet() {
		return this.cfdcrightsholder_dublinCoreSet;
	}
	
	public void setCfdcrightsholder_dublinCoreSet(Set<CfDCRightsHolder> cfdcrightsholder_dublinCoreSet) {
		this.cfdcrightsholder_dublinCoreSet = cfdcrightsholder_dublinCoreSet;
	}
	
	public Set<CfDCRightsMM> getCfdcrightsmm_dublinCoreSet() {
		return this.cfdcrightsmm_dublinCoreSet;
	}
	
	public void setCfdcrightsmm_dublinCoreSet(Set<CfDCRightsMM> cfdcrightsmm_dublinCoreSet) {
		this.cfdcrightsmm_dublinCoreSet = cfdcrightsmm_dublinCoreSet;
	}
	
	public Set<CfDCRightsMMAccessRights> getCfdcrightsmmaccessrights_dublinCoreSet() {
		return this.cfdcrightsmmaccessrights_dublinCoreSet;
	}
	
	public void setCfdcrightsmmaccessrights_dublinCoreSet(Set<CfDCRightsMMAccessRights> cfdcrightsmmaccessrights_dublinCoreSet) {
		this.cfdcrightsmmaccessrights_dublinCoreSet = cfdcrightsmmaccessrights_dublinCoreSet;
	}
	
	public Set<CfDCRightsMMLicense> getCfdcrightsmmlicense_dublinCoreSet() {
		return this.cfdcrightsmmlicense_dublinCoreSet;
	}
	
	public void setCfdcrightsmmlicense_dublinCoreSet(Set<CfDCRightsMMLicense> cfdcrightsmmlicense_dublinCoreSet) {
		this.cfdcrightsmmlicense_dublinCoreSet = cfdcrightsmmlicense_dublinCoreSet;
	}
	
	public Set<CfDCSource> getCfdcsource_dublinCoreSet() {
		return this.cfdcsource_dublinCoreSet;
	}
	
	public void setCfdcsource_dublinCoreSet(Set<CfDCSource> cfdcsource_dublinCoreSet) {
		this.cfdcsource_dublinCoreSet = cfdcsource_dublinCoreSet;
	}
	
	public Set<CfDCSubject> getCfdcsubject_dublinCoreSet() {
		return this.cfdcsubject_dublinCoreSet;
	}
	
	public void setCfdcsubject_dublinCoreSet(Set<CfDCSubject> cfdcsubject_dublinCoreSet) {
		this.cfdcsubject_dublinCoreSet = cfdcsubject_dublinCoreSet;
	}
	
	public Set<CfDCTitle> getCfdctitle_dublinCoreSet() {
		return this.cfdctitle_dublinCoreSet;
	}
	
	public void setCfdctitle_dublinCoreSet(Set<CfDCTitle> cfdctitle_dublinCoreSet) {
		this.cfdctitle_dublinCoreSet = cfdctitle_dublinCoreSet;
	}
	
	public Set<CfFDCRightsMMPricing> getCffdcrightsmmpricing_dublinCoreSet() {
		return this.cffdcrightsmmpricing_dublinCoreSet;
	}
	
	public void setCffdcrightsmmpricing_dublinCoreSet(Set<CfFDCRightsMMPricing> cffdcrightsmmpricing_dublinCoreSet) {
		this.cffdcrightsmmpricing_dublinCoreSet = cffdcrightsmmpricing_dublinCoreSet;
	}
	
	public Set<CfFDCRightsMMPrivacy> getCffdcrightsmmprivacy_dublinCoreSet() {
		return this.cffdcrightsmmprivacy_dublinCoreSet;
	}
	
	public void setCffdcrightsmmprivacy_dublinCoreSet(Set<CfFDCRightsMMPrivacy> cffdcrightsmmprivacy_dublinCoreSet) {
		this.cffdcrightsmmprivacy_dublinCoreSet = cffdcrightsmmprivacy_dublinCoreSet;
	}
	
	public Set<CfFDCRightsMMRights> getCffdcrightsmmrights_dublinCoreSet() {
		return this.cffdcrightsmmrights_dublinCoreSet;
	}
	
	public void setCffdcrightsmmrights_dublinCoreSet(Set<CfFDCRightsMMRights> cffdcrightsmmrights_dublinCoreSet) {
		this.cffdcrightsmmrights_dublinCoreSet = cffdcrightsmmrights_dublinCoreSet;
	}
	
	public Set<CfFDCRightsMMSecurity> getCffdcrightsmmsecurity_dublinCoreSet() {
		return this.cffdcrightsmmsecurity_dublinCoreSet;
	}
	
	public void setCffdcrightsmmsecurity_dublinCoreSet(Set<CfFDCRightsMMSecurity> cffdcrightsmmsecurity_dublinCoreSet) {
		this.cffdcrightsmmsecurity_dublinCoreSet = cffdcrightsmmsecurity_dublinCoreSet;
	}
	
	public Set<CfOrgUnit_DC> getCforgunit_dc_dublinCoreSet() {
		return this.cforgunit_dc_dublinCoreSet;
	}
	
	public void setCforgunit_dc_dublinCoreSet(Set<CfOrgUnit_DC> cforgunit_dc_dublinCoreSet) {
		this.cforgunit_dc_dublinCoreSet = cforgunit_dc_dublinCoreSet;
	}
	
	public Set<CfPers_DC> getCfpers_dc_dublinCoreSet() {
		return this.cfpers_dc_dublinCoreSet;
	}
	
	public void setCfpers_dc_dublinCoreSet(Set<CfPers_DC> cfpers_dc_dublinCoreSet) {
		this.cfpers_dc_dublinCoreSet = cfpers_dc_dublinCoreSet;
	}
	
	public Set<CfProj_DC> getCfproj_dc_dublinCoreSet() {
		return this.cfproj_dc_dublinCoreSet;
	}
	
	public void setCfproj_dc_dublinCoreSet(Set<CfProj_DC> cfproj_dc_dublinCoreSet) {
		this.cfproj_dc_dublinCoreSet = cfproj_dc_dublinCoreSet;
	}
	
	public Set<CfResPubl_DC> getCfrespubl_dc_dublinCoreSet() {
		return this.cfrespubl_dc_dublinCoreSet;
	}
	
	public void setCfrespubl_dc_dublinCoreSet(Set<CfResPubl_DC> cfrespubl_dc_dublinCoreSet) {
		this.cfrespubl_dc_dublinCoreSet = cfrespubl_dc_dublinCoreSet;
	}
	
}