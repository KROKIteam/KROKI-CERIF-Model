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
@Table(name = "C1_CITATION")
public class CfCite implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfCiteId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_citation_identifier;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcite_class_citation")
	protected Set<CfCite_Class> cfcite_class_citationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcitedescr_citation")
	protected Set<CfCiteDescr> cfcitedescr_citationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcite_medium_citation")
	protected Set<CfCite_Medium> cfcite_medium_citationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcitetitle_citation")
	protected Set<CfCiteTitle> cfcitetitle_citationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_cite_citation")
	protected Set<CfResPubl_Cite> cfrespubl_cite_citationSet;
	
	public CfCite(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_citation_identifier() {
		return this.ka_citation_identifier;
	}
	
	public void setKa_citation_identifier(java.lang.String ka_citation_identifier) {
		this.ka_citation_identifier = ka_citation_identifier;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public Set<CfCite_Class> getCfcite_class_citationSet() {
		return this.cfcite_class_citationSet;
	}
	
	public void setCfcite_class_citationSet(Set<CfCite_Class> cfcite_class_citationSet) {
		this.cfcite_class_citationSet = cfcite_class_citationSet;
	}
	
	public Set<CfCiteDescr> getCfcitedescr_citationSet() {
		return this.cfcitedescr_citationSet;
	}
	
	public void setCfcitedescr_citationSet(Set<CfCiteDescr> cfcitedescr_citationSet) {
		this.cfcitedescr_citationSet = cfcitedescr_citationSet;
	}
	
	public Set<CfCite_Medium> getCfcite_medium_citationSet() {
		return this.cfcite_medium_citationSet;
	}
	
	public void setCfcite_medium_citationSet(Set<CfCite_Medium> cfcite_medium_citationSet) {
		this.cfcite_medium_citationSet = cfcite_medium_citationSet;
	}
	
	public Set<CfCiteTitle> getCfcitetitle_citationSet() {
		return this.cfcitetitle_citationSet;
	}
	
	public void setCfcitetitle_citationSet(Set<CfCiteTitle> cfcitetitle_citationSet) {
		this.cfcitetitle_citationSet = cfcitetitle_citationSet;
	}
	
	public Set<CfResPubl_Cite> getCfrespubl_cite_citationSet() {
		return this.cfrespubl_cite_citationSet;
	}
	
	public void setCfrespubl_cite_citationSet(Set<CfResPubl_Cite> cfrespubl_cite_citationSet) {
		this.cfrespubl_cite_citationSet = cfrespubl_cite_citationSet;
	}
	
}