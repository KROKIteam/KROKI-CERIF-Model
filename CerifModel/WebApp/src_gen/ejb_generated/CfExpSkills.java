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
@Table(name = "C1_EXPERTISE_AND_SKILLS")
public class CfExpSkills implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfExpSkillsId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_expertise_and_skills;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cfexpskills_expertiseAndSkillsIntegrated", referencedColumnName="ID",  nullable = true)
	protected Expertiseandskillsintegrated cfexpskills_expertiseAndSkillsIntegrated;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskills_class_expertiseAndSkills")
	protected Set<CfExpSkills_Class> cfexpskills_class_expertiseAndSkillsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillsdescr_expertiseAndSkills")
	protected Set<CfExpSkillsDescr> cfexpskillsdescr_expertiseAndSkillsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillskeyw_expertiseAndSkills")
	protected Set<CfExpSkillsKeyw> cfexpskillskeyw_expertiseAndSkillsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillsname_expertiseAndSkills")
	protected Set<CfExpSkillsName> cfexpskillsname_expertiseAndSkillsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_expskills_expertiseAndSkills")
	protected Set<CfOrgUnit_ExpSkills> cforgunit_expskills_expertiseAndSkillsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_expskills_expertiseAndSkills")
	protected Set<CfPers_ExpSkills> cfpers_expskills_expertiseAndSkillsSet;
	
	public CfExpSkills(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_expertise_and_skills() {
		return this.ka_expertise_and_skills;
	}
	
	public void setKa_expertise_and_skills(java.lang.String ka_expertise_and_skills) {
		this.ka_expertise_and_skills = ka_expertise_and_skills;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public Expertiseandskillsintegrated getCfexpskills_expertiseAndSkillsIntegrated() {
		return this.cfexpskills_expertiseAndSkillsIntegrated;
	}
	
	public void setCfexpskills_expertiseAndSkillsIntegrated(Expertiseandskillsintegrated cfexpskills_expertiseAndSkillsIntegrated) {
		this.cfexpskills_expertiseAndSkillsIntegrated = cfexpskills_expertiseAndSkillsIntegrated;
	}
	
	public Set<CfExpSkills_Class> getCfexpskills_class_expertiseAndSkillsSet() {
		return this.cfexpskills_class_expertiseAndSkillsSet;
	}
	
	public void setCfexpskills_class_expertiseAndSkillsSet(Set<CfExpSkills_Class> cfexpskills_class_expertiseAndSkillsSet) {
		this.cfexpskills_class_expertiseAndSkillsSet = cfexpskills_class_expertiseAndSkillsSet;
	}
	
	public Set<CfExpSkillsDescr> getCfexpskillsdescr_expertiseAndSkillsSet() {
		return this.cfexpskillsdescr_expertiseAndSkillsSet;
	}
	
	public void setCfexpskillsdescr_expertiseAndSkillsSet(Set<CfExpSkillsDescr> cfexpskillsdescr_expertiseAndSkillsSet) {
		this.cfexpskillsdescr_expertiseAndSkillsSet = cfexpskillsdescr_expertiseAndSkillsSet;
	}
	
	public Set<CfExpSkillsKeyw> getCfexpskillskeyw_expertiseAndSkillsSet() {
		return this.cfexpskillskeyw_expertiseAndSkillsSet;
	}
	
	public void setCfexpskillskeyw_expertiseAndSkillsSet(Set<CfExpSkillsKeyw> cfexpskillskeyw_expertiseAndSkillsSet) {
		this.cfexpskillskeyw_expertiseAndSkillsSet = cfexpskillskeyw_expertiseAndSkillsSet;
	}
	
	public Set<CfExpSkillsName> getCfexpskillsname_expertiseAndSkillsSet() {
		return this.cfexpskillsname_expertiseAndSkillsSet;
	}
	
	public void setCfexpskillsname_expertiseAndSkillsSet(Set<CfExpSkillsName> cfexpskillsname_expertiseAndSkillsSet) {
		this.cfexpskillsname_expertiseAndSkillsSet = cfexpskillsname_expertiseAndSkillsSet;
	}
	
	public Set<CfOrgUnit_ExpSkills> getCforgunit_expskills_expertiseAndSkillsSet() {
		return this.cforgunit_expskills_expertiseAndSkillsSet;
	}
	
	public void setCforgunit_expskills_expertiseAndSkillsSet(Set<CfOrgUnit_ExpSkills> cforgunit_expskills_expertiseAndSkillsSet) {
		this.cforgunit_expskills_expertiseAndSkillsSet = cforgunit_expskills_expertiseAndSkillsSet;
	}
	
	public Set<CfPers_ExpSkills> getCfpers_expskills_expertiseAndSkillsSet() {
		return this.cfpers_expskills_expertiseAndSkillsSet;
	}
	
	public void setCfpers_expskills_expertiseAndSkillsSet(Set<CfPers_ExpSkills> cfpers_expskills_expertiseAndSkillsSet) {
		this.cfpers_expskills_expertiseAndSkillsSet = cfpers_expskills_expertiseAndSkillsSet;
	}
	
}