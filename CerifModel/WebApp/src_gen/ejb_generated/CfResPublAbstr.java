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
@Table(name = "CM_RESULT_PUBLICATION_ABSTRACT")
public class CfResPublAbstr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfAbstr", unique = false, nullable = false )
	private java.lang.String a_abstract;
	@ManyToOne
	@JoinColumn(name="cfrespublabstr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfrespublabstr_language;
	@ManyToOne
	@JoinColumn(name="cfrespublabstr_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespublabstr_resultPublication;
	
	public CfResPublAbstr(){
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
	
	public java.lang.String getA_abstract() {
		return this.a_abstract;
	}
	
	public void setA_abstract(java.lang.String a_abstract) {
		this.a_abstract = a_abstract;
	}
	
	public CfLang getCfrespublabstr_language() {
		return this.cfrespublabstr_language;
	}
	
	public void setCfrespublabstr_language(CfLang cfrespublabstr_language) {
		this.cfrespublabstr_language = cfrespublabstr_language;
	}
	
	public CfResPubl getCfrespublabstr_resultPublication() {
		return this.cfrespublabstr_resultPublication;
	}
	
	public void setCfrespublabstr_resultPublication(CfResPubl cfrespublabstr_resultPublication) {
		this.cfrespublabstr_resultPublication = cfrespublabstr_resultPublication;
	}
	
}