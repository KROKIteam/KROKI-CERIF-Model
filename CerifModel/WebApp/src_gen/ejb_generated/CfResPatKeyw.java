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
@Table(name = "CM_RESULT_PATENT_KEYWORDS")
public class CfResPatKeyw implements java.io.Serializable {

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
	@JoinColumn(name="cfrespatkeyw_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfrespatkeyw_language;
	@ManyToOne
	@JoinColumn(name="cfrespatkeyw_resultPatent", referencedColumnName="ID",  nullable = true)
	private CfResPat cfrespatkeyw_resultPatent;
	
	public CfResPatKeyw(){
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
	
	public CfLang getCfrespatkeyw_language() {
		return this.cfrespatkeyw_language;
	}
	
	public void setCfrespatkeyw_language(CfLang cfrespatkeyw_language) {
		this.cfrespatkeyw_language = cfrespatkeyw_language;
	}
	
	public CfResPat getCfrespatkeyw_resultPatent() {
		return this.cfrespatkeyw_resultPatent;
	}
	
	public void setCfrespatkeyw_resultPatent(CfResPat cfrespatkeyw_resultPatent) {
		this.cfrespatkeyw_resultPatent = cfrespatkeyw_resultPatent;
	}
	
}