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
@Table(name = "C1_EXPERTISE_AND_SKILLS_DESCRIPTION")
public class CfExpSkillsDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDescr", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="cfexpskillsdescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfexpskillsdescr_language;
	@ManyToOne
	@JoinColumn(name="cfexpskillsdescr_expertiseAndSkills", referencedColumnName="ID",  nullable = true)
	private CfExpSkills cfexpskillsdescr_expertiseAndSkills;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	@ManyToOne
	@JoinColumn(name="cfexpskillsdescr_expertiseAndSkillsIntegrated", referencedColumnName="ID",  nullable = true)
	private Expertiseandskillsintegrated cfexpskillsdescr_expertiseAndSkillsIntegrated;
	
	public CfExpSkillsDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public CfLang getCfexpskillsdescr_language() {
		return this.cfexpskillsdescr_language;
	}
	
	public void setCfexpskillsdescr_language(CfLang cfexpskillsdescr_language) {
		this.cfexpskillsdescr_language = cfexpskillsdescr_language;
	}
	
	public CfExpSkills getCfexpskillsdescr_expertiseAndSkills() {
		return this.cfexpskillsdescr_expertiseAndSkills;
	}
	
	public void setCfexpskillsdescr_expertiseAndSkills(CfExpSkills cfexpskillsdescr_expertiseAndSkills) {
		this.cfexpskillsdescr_expertiseAndSkills = cfexpskillsdescr_expertiseAndSkills;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
	public Expertiseandskillsintegrated getCfexpskillsdescr_expertiseAndSkillsIntegrated() {
		return this.cfexpskillsdescr_expertiseAndSkillsIntegrated;
	}
	
	public void setCfexpskillsdescr_expertiseAndSkillsIntegrated(Expertiseandskillsintegrated cfexpskillsdescr_expertiseAndSkillsIntegrated) {
		this.cfexpskillsdescr_expertiseAndSkillsIntegrated = cfexpskillsdescr_expertiseAndSkillsIntegrated;
	}
	
}