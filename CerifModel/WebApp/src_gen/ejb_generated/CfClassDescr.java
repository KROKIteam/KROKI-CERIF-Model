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
@Table(name = "CM_CLASSIFICATION_DESCRIPTION")
public class CfClassDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfDescr", unique = false, nullable = false )
	private java.lang.String a_description;
	@Column(name = "cfDescrSrc", unique = false, nullable = false )
	private java.lang.String a_description_source;
	@ManyToOne
	@JoinColumn(name="cfclassdescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfclassdescr_language;
	@ManyToOne
	@JoinColumn(name="cfclassdescr_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfclassdescr_classification;
	
	public CfClassDescr(){
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
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public java.lang.String getA_description_source() {
		return this.a_description_source;
	}
	
	public void setA_description_source(java.lang.String a_description_source) {
		this.a_description_source = a_description_source;
	}
	
	public CfLang getCfclassdescr_language() {
		return this.cfclassdescr_language;
	}
	
	public void setCfclassdescr_language(CfLang cfclassdescr_language) {
		this.cfclassdescr_language = cfclassdescr_language;
	}
	
	public CfClass getCfclassdescr_classification() {
		return this.cfclassdescr_classification;
	}
	
	public void setCfclassdescr_classification(CfClass cfclassdescr_classification) {
		this.cfclassdescr_classification = cfclassdescr_classification;
	}
	
}