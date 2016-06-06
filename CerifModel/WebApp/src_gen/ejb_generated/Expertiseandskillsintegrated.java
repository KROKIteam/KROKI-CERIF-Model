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
@Table(name = "C1_EXPERTISE_AND_SKILLS_INTEGRATED")
public class Expertiseandskillsintegrated implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskills_expertiseAndSkillsIntegrated")
	protected Set<CfExpSkills> cfexpskills_expertiseAndSkillsIntegratedSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillsdescr_expertiseAndSkillsIntegrated")
	protected Set<CfExpSkillsDescr> cfexpskillsdescr_expertiseAndSkillsIntegratedSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillskeyw_expertiseAndSkillsIntegrated")
	protected Set<CfExpSkillsKeyw> cfexpskillskeyw_expertiseAndSkillsIntegratedSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfexpskillsname_expertiseAndSkillsIntegrated")
	protected Set<CfExpSkillsName> cfexpskillsname_expertiseAndSkillsIntegratedSet;
	
	public Expertiseandskillsintegrated(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Set<CfExpSkills> getCfexpskills_expertiseAndSkillsIntegratedSet() {
		return this.cfexpskills_expertiseAndSkillsIntegratedSet;
	}
	
	public void setCfexpskills_expertiseAndSkillsIntegratedSet(Set<CfExpSkills> cfexpskills_expertiseAndSkillsIntegratedSet) {
		this.cfexpskills_expertiseAndSkillsIntegratedSet = cfexpskills_expertiseAndSkillsIntegratedSet;
	}
	
	public Set<CfExpSkillsDescr> getCfexpskillsdescr_expertiseAndSkillsIntegratedSet() {
		return this.cfexpskillsdescr_expertiseAndSkillsIntegratedSet;
	}
	
	public void setCfexpskillsdescr_expertiseAndSkillsIntegratedSet(Set<CfExpSkillsDescr> cfexpskillsdescr_expertiseAndSkillsIntegratedSet) {
		this.cfexpskillsdescr_expertiseAndSkillsIntegratedSet = cfexpskillsdescr_expertiseAndSkillsIntegratedSet;
	}
	
	public Set<CfExpSkillsKeyw> getCfexpskillskeyw_expertiseAndSkillsIntegratedSet() {
		return this.cfexpskillskeyw_expertiseAndSkillsIntegratedSet;
	}
	
	public void setCfexpskillskeyw_expertiseAndSkillsIntegratedSet(Set<CfExpSkillsKeyw> cfexpskillskeyw_expertiseAndSkillsIntegratedSet) {
		this.cfexpskillskeyw_expertiseAndSkillsIntegratedSet = cfexpskillskeyw_expertiseAndSkillsIntegratedSet;
	}
	
	public Set<CfExpSkillsName> getCfexpskillsname_expertiseAndSkillsIntegratedSet() {
		return this.cfexpskillsname_expertiseAndSkillsIntegratedSet;
	}
	
	public void setCfexpskillsname_expertiseAndSkillsIntegratedSet(Set<CfExpSkillsName> cfexpskillsname_expertiseAndSkillsIntegratedSet) {
		this.cfexpskillsname_expertiseAndSkillsIntegratedSet = cfexpskillsname_expertiseAndSkillsIntegratedSet;
	}
	
}