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
@Table(name = "C1_RESULT_PUBLICATION_ABSTRACT")
public class CfResPublAbstr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfAbstr", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_abstract;
	@ManyToOne
	@JoinColumn(name="cfrespublabstr_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfrespublabstr_language;
	@ManyToOne
	@JoinColumn(name="cfrespublabstr_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cfrespublabstr_resultPublication;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfResPublAbstr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_abstract() {
		return this.ka_abstract;
	}
	
	public void setKa_abstract(java.lang.String ka_abstract) {
		this.ka_abstract = ka_abstract;
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
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}