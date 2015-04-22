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
@Table(name = "C1_CLASSIFICATION_SCHEME_NAME")
public class CfClassSchemeName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfName", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_name;
	@Column(name = "cfNameSrc", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_name_source;
	@ManyToOne
	@JoinColumn(name="cfclassschemename_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfclassschemename_language;
	@ManyToOne
	@JoinColumn(name="cfclassschemename_classificationScheme", referencedColumnName="ID",  nullable = true)
	private CfClassScheme cfclassschemename_classificationScheme;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	
	public CfClassSchemeName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_name() {
		return this.a_name;
	}
	
	public void setA_name(java.lang.String a_name) {
		this.a_name = a_name;
	}
	
	public java.lang.String getA_name_source() {
		return this.a_name_source;
	}
	
	public void setA_name_source(java.lang.String a_name_source) {
		this.a_name_source = a_name_source;
	}
	
	public CfLang getCfclassschemename_language() {
		return this.cfclassschemename_language;
	}
	
	public void setCfclassschemename_language(CfLang cfclassschemename_language) {
		this.cfclassschemename_language = cfclassschemename_language;
	}
	
	public CfClassScheme getCfclassschemename_classificationScheme() {
		return this.cfclassschemename_classificationScheme;
	}
	
	public void setCfclassschemename_classificationScheme(CfClassScheme cfclassschemename_classificationScheme) {
		this.cfclassschemename_classificationScheme = cfclassschemename_classificationScheme;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
}