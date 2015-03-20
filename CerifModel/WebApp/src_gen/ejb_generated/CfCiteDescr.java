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
@Table(name = "CM_CITATION_DESCRIPTION")
public class CfCiteDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfDescr", unique = false, nullable = false )
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="cfcitedescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfcitedescr_language;
	@ManyToOne
	@JoinColumn(name="cfcitedescr_citation", referencedColumnName="ID",  nullable = true)
	private CfCite cfcitedescr_citation;
	
	public CfCiteDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public CfLang getCfcitedescr_language() {
		return this.cfcitedescr_language;
	}
	
	public void setCfcitedescr_language(CfLang cfcitedescr_language) {
		this.cfcitedescr_language = cfcitedescr_language;
	}
	
	public CfCite getCfcitedescr_citation() {
		return this.cfcitedescr_citation;
	}
	
	public void setCfcitedescr_citation(CfCite cfcitedescr_citation) {
		this.cfcitedescr_citation = cfcitedescr_citation;
	}
	
}