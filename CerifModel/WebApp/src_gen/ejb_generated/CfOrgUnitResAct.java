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
@Table(name = "C1_ORGANISATION_UNIT_RESEARCH_ACTIVITY")
public class CfOrgUnitResAct implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	@Column(name = "cfResAct", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_research_activity;
	@ManyToOne
	@JoinColumn(name="cforgunitresact_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cforgunitresact_language;
	@ManyToOne
	@JoinColumn(name="cforgunitresact_organisationUnit", referencedColumnName="ID",  nullable = true)
	protected CfOrgUnit cforgunitresact_organisationUnit;
	
	public CfOrgUnitResAct(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
	public java.lang.String getKa_research_activity() {
		return this.ka_research_activity;
	}
	
	public void setKa_research_activity(java.lang.String ka_research_activity) {
		this.ka_research_activity = ka_research_activity;
	}
	
	public CfLang getCforgunitresact_language() {
		return this.cforgunitresact_language;
	}
	
	public void setCforgunitresact_language(CfLang cforgunitresact_language) {
		this.cforgunitresact_language = cforgunitresact_language;
	}
	
	public CfOrgUnit getCforgunitresact_organisationUnit() {
		return this.cforgunitresact_organisationUnit;
	}
	
	public void setCforgunitresact_organisationUnit(CfOrgUnit cforgunitresact_organisationUnit) {
		this.cforgunitresact_organisationUnit = cforgunitresact_organisationUnit;
	}
	
}