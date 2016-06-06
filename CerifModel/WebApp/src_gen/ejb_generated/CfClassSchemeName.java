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
@Table(name = "C1_CLASSIFICATION_SCHEME_NAME")
public class CfClassSchemeName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfName", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_name;
	@Column(name = "cfNameSrc", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_name_source;
	@ManyToOne
	@JoinColumn(name="cfclassschemename_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfclassschemename_language;
	@ManyToOne
	@JoinColumn(name="cfclassschemename_classificationScheme", referencedColumnName="ID",  nullable = true)
	protected CfClassScheme cfclassschemename_classificationScheme;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfClassSchemeName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_name() {
		return this.ka_name;
	}
	
	public void setKa_name(java.lang.String ka_name) {
		this.ka_name = ka_name;
	}
	
	public java.lang.String getKa_name_source() {
		return this.ka_name_source;
	}
	
	public void setKa_name_source(java.lang.String ka_name_source) {
		this.ka_name_source = ka_name_source;
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
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}