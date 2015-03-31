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
@Table(name = "CM_PROJECT_ABSTRACT")
public class CfProjAbstr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfAbstr", unique = false, nullable = false )
	private java.lang.String a_abstract;
	@ManyToOne
	@JoinColumn(name="cfprojabstr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfprojabstr_language;
	@ManyToOne
	@JoinColumn(name="cfprojabstr_project", referencedColumnName="ID",  nullable = true)
	private CfProj cfprojabstr_project;
	
	public CfProjAbstr(){
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
	
	public java.lang.String getA_abstract() {
		return this.a_abstract;
	}
	
	public void setA_abstract(java.lang.String a_abstract) {
		this.a_abstract = a_abstract;
	}
	
	public CfLang getCfprojabstr_language() {
		return this.cfprojabstr_language;
	}
	
	public void setCfprojabstr_language(CfLang cfprojabstr_language) {
		this.cfprojabstr_language = cfprojabstr_language;
	}
	
	public CfProj getCfprojabstr_project() {
		return this.cfprojabstr_project;
	}
	
	public void setCfprojabstr_project(CfProj cfprojabstr_project) {
		this.cfprojabstr_project = cfprojabstr_project;
	}
	
}