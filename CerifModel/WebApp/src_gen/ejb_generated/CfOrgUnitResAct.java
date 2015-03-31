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
@Table(name = "CM_ORGANISATION_UNIT_RESEARCH_ACTIVITY")
public class CfOrgUnitResAct implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfResAct", unique = false, nullable = false )
	private java.lang.String a_research_activity;
	@ManyToOne
	@JoinColumn(name="cforgunitresact_language", referencedColumnName="ID",  nullable = true)
	private CfLang cforgunitresact_language;
	@ManyToOne
	@JoinColumn(name="cforgunitresact_organisationUnit", referencedColumnName="ID",  nullable = true)
	private CfOrgUnit cforgunitresact_organisationUnit;
	
	public CfOrgUnitResAct(){
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
	
	public java.lang.String getA_research_activity() {
		return this.a_research_activity;
	}
	
	public void setA_research_activity(java.lang.String a_research_activity) {
		this.a_research_activity = a_research_activity;
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