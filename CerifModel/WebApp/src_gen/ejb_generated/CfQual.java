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
@Table(name = "C1_QUALIFICATION")
public class CfQual implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfQualId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_qualification_identifier;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_qual_qualification")
	private Set<CfPers_Qual> cfpers_qual_qualificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqual_class_qualification")
	private Set<CfQual_Class> cfqual_class_qualificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqualdescr_qualification")
	private Set<CfQualDescr> cfqualdescr_qualificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqualkeyw_qualification")
	private Set<CfQualKeyw> cfqualkeyw_qualificationSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfqualtitle_qualification")
	private Set<CfQualTitle> cfqualtitle_qualificationSet;
	
	public CfQual(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_qualification_identifier() {
		return this.a_qualification_identifier;
	}
	
	public void setA_qualification_identifier(java.lang.String a_qualification_identifier) {
		this.a_qualification_identifier = a_qualification_identifier;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfPers_Qual> getCfpers_qual_qualificationSet() {
		return this.cfpers_qual_qualificationSet;
	}
	
	public void setCfpers_qual_qualificationSet(Set<CfPers_Qual> cfpers_qual_qualificationSet) {
		this.cfpers_qual_qualificationSet = cfpers_qual_qualificationSet;
	}
	
	public Set<CfQual_Class> getCfqual_class_qualificationSet() {
		return this.cfqual_class_qualificationSet;
	}
	
	public void setCfqual_class_qualificationSet(Set<CfQual_Class> cfqual_class_qualificationSet) {
		this.cfqual_class_qualificationSet = cfqual_class_qualificationSet;
	}
	
	public Set<CfQualDescr> getCfqualdescr_qualificationSet() {
		return this.cfqualdescr_qualificationSet;
	}
	
	public void setCfqualdescr_qualificationSet(Set<CfQualDescr> cfqualdescr_qualificationSet) {
		this.cfqualdescr_qualificationSet = cfqualdescr_qualificationSet;
	}
	
	public Set<CfQualKeyw> getCfqualkeyw_qualificationSet() {
		return this.cfqualkeyw_qualificationSet;
	}
	
	public void setCfqualkeyw_qualificationSet(Set<CfQualKeyw> cfqualkeyw_qualificationSet) {
		this.cfqualkeyw_qualificationSet = cfqualkeyw_qualificationSet;
	}
	
	public Set<CfQualTitle> getCfqualtitle_qualificationSet() {
		return this.cfqualtitle_qualificationSet;
	}
	
	public void setCfqualtitle_qualificationSet(Set<CfQualTitle> cfqualtitle_qualificationSet) {
		this.cfqualtitle_qualificationSet = cfqualtitle_qualificationSet;
	}
	
}