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
@Table(name = "C1_CLASSIFICATION_DEFINITION")
public class CfClassDef implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfDef", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_definition;
	@Column(name = "cfDefSrc", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_definition_source;
	@ManyToOne
	@JoinColumn(name="cfclassdef_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfclassdef_language;
	@ManyToOne
	@JoinColumn(name="cfclassdef_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfclassdef_classification;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfClassDef(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_definition() {
		return this.ka_definition;
	}
	
	public void setKa_definition(java.lang.String ka_definition) {
		this.ka_definition = ka_definition;
	}
	
	public java.lang.String getKa_definition_source() {
		return this.ka_definition_source;
	}
	
	public void setKa_definition_source(java.lang.String ka_definition_source) {
		this.ka_definition_source = ka_definition_source;
	}
	
	public CfLang getCfclassdef_language() {
		return this.cfclassdef_language;
	}
	
	public void setCfclassdef_language(CfLang cfclassdef_language) {
		this.cfclassdef_language = cfclassdef_language;
	}
	
	public CfClass getCfclassdef_classification() {
		return this.cfclassdef_classification;
	}
	
	public void setCfclassdef_classification(CfClass cfclassdef_classification) {
		this.cfclassdef_classification = cfclassdef_classification;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}