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
@Table(name = "CM_RESULT_PUBLICATION_BIBLIOGRAPHIC_NOTE")
public class CfResPublBiblNote implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfLangCode", unique = false, nullable = false )
	private java.lang.String a_language_code;
	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfBiblNote", unique = false, nullable = false )
	private java.lang.String a_bibliographic_note;
	@ManyToOne
	@JoinColumn(name="cfrespublbiblnote_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespublbiblnote_resultPublication;
	
	public CfResPublBiblNote(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_language_code() {
		return this.a_language_code;
	}
	
	public void setA_language_code(java.lang.String a_language_code) {
		this.a_language_code = a_language_code;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
	public java.lang.String getA_bibliographic_note() {
		return this.a_bibliographic_note;
	}
	
	public void setA_bibliographic_note(java.lang.String a_bibliographic_note) {
		this.a_bibliographic_note = a_bibliographic_note;
	}
	
	public CfResPubl getCfrespublbiblnote_resultPublication() {
		return this.cfrespublbiblnote_resultPublication;
	}
	
	public void setCfrespublbiblnote_resultPublication(CfResPubl cfrespublbiblnote_resultPublication) {
		this.cfrespublbiblnote_resultPublication = cfrespublbiblnote_resultPublication;
	}
	
}