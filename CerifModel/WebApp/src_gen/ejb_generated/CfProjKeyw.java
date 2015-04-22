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
@Table(name = "C1_PROJECT_KEYWORDS")
public class CfProjKeyw implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfKeyw", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_keywords;
	@ManyToOne
	@JoinColumn(name="cfprojkeyw_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfprojkeyw_language;
	@ManyToOne
	@JoinColumn(name="cfprojkeyw_project", referencedColumnName="ID",  nullable = true)
	private CfProj cfprojkeyw_project;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	
	public CfProjKeyw(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_keywords() {
		return this.a_keywords;
	}
	
	public void setA_keywords(java.lang.String a_keywords) {
		this.a_keywords = a_keywords;
	}
	
	public CfLang getCfprojkeyw_language() {
		return this.cfprojkeyw_language;
	}
	
	public void setCfprojkeyw_language(CfLang cfprojkeyw_language) {
		this.cfprojkeyw_language = cfprojkeyw_language;
	}
	
	public CfProj getCfprojkeyw_project() {
		return this.cfprojkeyw_project;
	}
	
	public void setCfprojkeyw_project(CfProj cfprojkeyw_project) {
		this.cfprojkeyw_project = cfprojkeyw_project;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
}