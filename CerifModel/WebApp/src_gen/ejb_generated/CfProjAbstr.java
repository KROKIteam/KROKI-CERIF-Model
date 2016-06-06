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
@Table(name = "C1_PROJECT_ABSTRACT")
public class CfProjAbstr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@ManyToOne
	@JoinColumn(name="cfprojabstr_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfprojabstr_language;
	@ManyToOne
	@JoinColumn(name="cfprojabstr_project", referencedColumnName="ID",  nullable = true)
	protected CfProj cfprojabstr_project;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	@Column(name = "cfAbstr", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_abstract;
	
	public CfProjAbstr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
	public java.lang.String getKa_abstract() {
		return this.ka_abstract;
	}
	
	public void setKa_abstract(java.lang.String ka_abstract) {
		this.ka_abstract = ka_abstract;
	}
	
}