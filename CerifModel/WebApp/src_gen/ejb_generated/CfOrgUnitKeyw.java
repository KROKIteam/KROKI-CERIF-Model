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
@Table(name = "CM_ORGANISATION_UNIT_KEYWORDS")
public class CfOrgUnitKeyw implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfKeyw", unique = false, nullable = false )
	private java.lang.String a_keywords;
	@ManyToOne
	@JoinColumn(name="cforgunitkeyw_language", referencedColumnName="ID",  nullable = true)
	private CfLang cforgunitkeyw_language;
	@ManyToOne
	@JoinColumn(name="cforgunitkeyw_organisationUnit", referencedColumnName="ID",  nullable = true)
	private CfOrgUnit cforgunitkeyw_organisationUnit;
	
	public CfOrgUnitKeyw(){
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
	
	public java.lang.String getA_keywords() {
		return this.a_keywords;
	}
	
	public void setA_keywords(java.lang.String a_keywords) {
		this.a_keywords = a_keywords;
	}
	
	public CfLang getCforgunitkeyw_language() {
		return this.cforgunitkeyw_language;
	}
	
	public void setCforgunitkeyw_language(CfLang cforgunitkeyw_language) {
		this.cforgunitkeyw_language = cforgunitkeyw_language;
	}
	
	public CfOrgUnit getCforgunitkeyw_organisationUnit() {
		return this.cforgunitkeyw_organisationUnit;
	}
	
	public void setCforgunitkeyw_organisationUnit(CfOrgUnit cforgunitkeyw_organisationUnit) {
		this.cforgunitkeyw_organisationUnit = cforgunitkeyw_organisationUnit;
	}
	
}