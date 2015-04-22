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
@Table(name = "C1_RESULT_PATENT_ABSTRACT")
public class CfResPatAbstr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	@Column(name = "cfAbstr", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_abstract;
	@ManyToOne
	@JoinColumn(name="cfrespatabstr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfrespatabstr_language;
	@ManyToOne
	@JoinColumn(name="cfrespatabstr_resultPatent", referencedColumnName="ID",  nullable = true)
	private CfResPat cfrespatabstr_resultPatent;
	
	public CfResPatAbstr(){
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
	
	public CfLang getCfrespatabstr_language() {
		return this.cfrespatabstr_language;
	}
	
	public void setCfrespatabstr_language(CfLang cfrespatabstr_language) {
		this.cfrespatabstr_language = cfrespatabstr_language;
	}
	
	public CfResPat getCfrespatabstr_resultPatent() {
		return this.cfrespatabstr_resultPatent;
	}
	
	public void setCfrespatabstr_resultPatent(CfResPat cfrespatabstr_resultPatent) {
		this.cfrespatabstr_resultPatent = cfrespatabstr_resultPatent;
	}
	
}