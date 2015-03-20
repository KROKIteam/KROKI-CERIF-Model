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
@Table(name = "CM_CLASSIFICATION_EXAMPLE")
public class CfClassEx implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfEx", unique = false, nullable = false )
	private java.lang.String a_example;
	@Column(name = "cfExSrc", unique = false, nullable = false )
	private java.lang.String a_example_source;
	@ManyToOne
	@JoinColumn(name="cfclassex_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfclassex_language;
	@ManyToOne
	@JoinColumn(name="cfclassex_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfclassex_classification;
	
	public CfClassEx(){
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
	
	public java.lang.String getA_example() {
		return this.a_example;
	}
	
	public void setA_example(java.lang.String a_example) {
		this.a_example = a_example;
	}
	
	public java.lang.String getA_example_source() {
		return this.a_example_source;
	}
	
	public void setA_example_source(java.lang.String a_example_source) {
		this.a_example_source = a_example_source;
	}
	
	public CfLang getCfclassex_language() {
		return this.cfclassex_language;
	}
	
	public void setCfclassex_language(CfLang cfclassex_language) {
		this.cfclassex_language = cfclassex_language;
	}
	
	public CfClass getCfclassex_classification() {
		return this.cfclassex_classification;
	}
	
	public void setCfclassex_classification(CfClass cfclassex_classification) {
		this.cfclassex_classification = cfclassex_classification;
	}
	
}