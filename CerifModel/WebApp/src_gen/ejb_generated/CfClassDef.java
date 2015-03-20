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
@Table(name = "CM_CLASSIFICATION_DEFINITION")
public class CfClassDef implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfDef", unique = false, nullable = false )
	private java.lang.String a_definition;
	@Column(name = "cfDefSrc", unique = false, nullable = false )
	private java.lang.String a_definition_source;
	@ManyToOne
	@JoinColumn(name="cfclassdef_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfclassdef_language;
	@ManyToOne
	@JoinColumn(name="cfclassdef_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfclassdef_classification;
	
	public CfClassDef(){
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
	
	public java.lang.String getA_definition() {
		return this.a_definition;
	}
	
	public void setA_definition(java.lang.String a_definition) {
		this.a_definition = a_definition;
	}
	
	public java.lang.String getA_definition_source() {
		return this.a_definition_source;
	}
	
	public void setA_definition_source(java.lang.String a_definition_source) {
		this.a_definition_source = a_definition_source;
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
	
}