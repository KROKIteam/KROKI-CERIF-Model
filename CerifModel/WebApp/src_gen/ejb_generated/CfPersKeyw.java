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
@Table(name = "C1_PERSON_KEYWORDS")
public class CfPersKeyw implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfKeyw", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_keywords;
	@ManyToOne
	@JoinColumn(name="cfperskeyw_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfperskeyw_language;
	@ManyToOne
	@JoinColumn(name="cfperskeyw_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfperskeyw_person;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	
	public CfPersKeyw(){
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
	
	public CfLang getCfperskeyw_language() {
		return this.cfperskeyw_language;
	}
	
	public void setCfperskeyw_language(CfLang cfperskeyw_language) {
		this.cfperskeyw_language = cfperskeyw_language;
	}
	
	public CfPers getCfperskeyw_person() {
		return this.cfperskeyw_person;
	}
	
	public void setCfperskeyw_person(CfPers cfperskeyw_person) {
		this.cfperskeyw_person = cfperskeyw_person;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
}