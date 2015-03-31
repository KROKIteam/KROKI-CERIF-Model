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
@Table(name = "CM_MEDIUM_KEYWORDS")
public class CfMediumKeyw implements java.io.Serializable {

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
	@JoinColumn(name="cfmediumkeyw_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfmediumkeyw_language;
	@ManyToOne
	@JoinColumn(name="cfmediumkeyw_medium", referencedColumnName="ID",  nullable = true)
	private CfMedium cfmediumkeyw_medium;
	
	public CfMediumKeyw(){
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
	
	public CfLang getCfmediumkeyw_language() {
		return this.cfmediumkeyw_language;
	}
	
	public void setCfmediumkeyw_language(CfLang cfmediumkeyw_language) {
		this.cfmediumkeyw_language = cfmediumkeyw_language;
	}
	
	public CfMedium getCfmediumkeyw_medium() {
		return this.cfmediumkeyw_medium;
	}
	
	public void setCfmediumkeyw_medium(CfMedium cfmediumkeyw_medium) {
		this.cfmediumkeyw_medium = cfmediumkeyw_medium;
	}
	
}