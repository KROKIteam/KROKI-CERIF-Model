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
@Table(name = "CM_CLASSIFICATION_SCHEME")
public class CfClassScheme implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfClassSchemeId", unique = false, nullable = false )
	private java.lang.String a_classification_scheme_identifier;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclass_classificationScheme")
	private Set<CfClass> cfclass_classificationSchemeSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassscheme_classscheme_classificationScheme1")
	private Set<CfClassScheme_ClassScheme> cfclassscheme_classscheme_classificationScheme1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassscheme_classscheme_classificationScheme2")
	private Set<CfClassScheme_ClassScheme> cfclassscheme_classscheme_classificationScheme2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassschemedescr_classificationScheme")
	private Set<CfClassSchemeDescr> cfclassschemedescr_classificationSchemeSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfclassschemename_classificationScheme")
	private Set<CfClassSchemeName> cfclassschemename_classificationSchemeSet;
	
	public CfClassScheme(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_classification_scheme_identifier() {
		return this.a_classification_scheme_identifier;
	}
	
	public void setA_classification_scheme_identifier(java.lang.String a_classification_scheme_identifier) {
		this.a_classification_scheme_identifier = a_classification_scheme_identifier;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfClass> getCfclass_classificationSchemeSet() {
		return this.cfclass_classificationSchemeSet;
	}
	
	public void setCfclass_classificationSchemeSet(Set<CfClass> cfclass_classificationSchemeSet) {
		this.cfclass_classificationSchemeSet = cfclass_classificationSchemeSet;
	}
	
	public Set<CfClassScheme_ClassScheme> getCfclassscheme_classscheme_classificationScheme1Set() {
		return this.cfclassscheme_classscheme_classificationScheme1Set;
	}
	
	public void setCfclassscheme_classscheme_classificationScheme1Set(Set<CfClassScheme_ClassScheme> cfclassscheme_classscheme_classificationScheme1Set) {
		this.cfclassscheme_classscheme_classificationScheme1Set = cfclassscheme_classscheme_classificationScheme1Set;
	}
	
	public Set<CfClassScheme_ClassScheme> getCfclassscheme_classscheme_classificationScheme2Set() {
		return this.cfclassscheme_classscheme_classificationScheme2Set;
	}
	
	public void setCfclassscheme_classscheme_classificationScheme2Set(Set<CfClassScheme_ClassScheme> cfclassscheme_classscheme_classificationScheme2Set) {
		this.cfclassscheme_classscheme_classificationScheme2Set = cfclassscheme_classscheme_classificationScheme2Set;
	}
	
	public Set<CfClassSchemeDescr> getCfclassschemedescr_classificationSchemeSet() {
		return this.cfclassschemedescr_classificationSchemeSet;
	}
	
	public void setCfclassschemedescr_classificationSchemeSet(Set<CfClassSchemeDescr> cfclassschemedescr_classificationSchemeSet) {
		this.cfclassschemedescr_classificationSchemeSet = cfclassschemedescr_classificationSchemeSet;
	}
	
	public Set<CfClassSchemeName> getCfclassschemename_classificationSchemeSet() {
		return this.cfclassschemename_classificationSchemeSet;
	}
	
	public void setCfclassschemename_classificationSchemeSet(Set<CfClassSchemeName> cfclassschemename_classificationSchemeSet) {
		this.cfclassschemename_classificationSchemeSet = cfclassschemename_classificationSchemeSet;
	}
	
}