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
@Table(name = "CM_PERSON_RESEARCH_INTEREST")
public class CfPersResInt implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfResInt", unique = false, nullable = false )
	private java.lang.String a_research_interest;
	@ManyToOne
	@JoinColumn(name="cfpersresint_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfpersresint_language;
	@ManyToOne
	@JoinColumn(name="cfpersresint_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpersresint_person;
	
	public CfPersResInt(){
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
	
	public java.lang.String getA_research_interest() {
		return this.a_research_interest;
	}
	
	public void setA_research_interest(java.lang.String a_research_interest) {
		this.a_research_interest = a_research_interest;
	}
	
	public CfLang getCfpersresint_language() {
		return this.cfpersresint_language;
	}
	
	public void setCfpersresint_language(CfLang cfpersresint_language) {
		this.cfpersresint_language = cfpersresint_language;
	}
	
	public CfPers getCfpersresint_person() {
		return this.cfpersresint_person;
	}
	
	public void setCfpersresint_person(CfPers cfpersresint_person) {
		this.cfpersresint_person = cfpersresint_person;
	}
	
}