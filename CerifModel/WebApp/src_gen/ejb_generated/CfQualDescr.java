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
@Table(name = "CM_QUALIFICATION_DESCRIPTION")
public class CfQualDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfDescr", unique = false, nullable = false )
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="cfqualdescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfqualdescr_language;
	@ManyToOne
	@JoinColumn(name="cfqualdescr_qualification", referencedColumnName="ID",  nullable = true)
	private CfQual cfqualdescr_qualification;
	
	public CfQualDescr(){
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
	
	public CfLang getCfqualdescr_language() {
		return this.cfqualdescr_language;
	}
	
	public void setCfqualdescr_language(CfLang cfqualdescr_language) {
		this.cfqualdescr_language = cfqualdescr_language;
	}
	
	public CfQual getCfqualdescr_qualification() {
		return this.cfqualdescr_qualification;
	}
	
	public void setCfqualdescr_qualification(CfQual cfqualdescr_qualification) {
		this.cfqualdescr_qualification = cfqualdescr_qualification;
	}
	
}