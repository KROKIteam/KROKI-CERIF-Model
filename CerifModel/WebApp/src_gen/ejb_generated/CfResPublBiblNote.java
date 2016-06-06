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
@Table(name = "C1_RESULT_PUBLICATION_BIBLIOGRAPHIC_NOTE")
public class CfResPublBiblNote implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfLangCode", unique = false, nullable = false , length = 5, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_language_code;
	@Column(name = "cfBiblNote", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_bibliographic_note;
	@ManyToOne
	@JoinColumn(name="cfrespublbiblnote_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cfrespublbiblnote_resultPublication;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfResPublBiblNote(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_language_code() {
		return this.ka_language_code;
	}
	
	public void setKa_language_code(java.lang.String ka_language_code) {
		this.ka_language_code = ka_language_code;
	}
	
	public java.lang.String getKa_bibliographic_note() {
		return this.ka_bibliographic_note;
	}
	
	public void setKa_bibliographic_note(java.lang.String ka_bibliographic_note) {
		this.ka_bibliographic_note = ka_bibliographic_note;
	}
	
	public CfResPubl getCfrespublbiblnote_resultPublication() {
		return this.cfrespublbiblnote_resultPublication;
	}
	
	public void setCfrespublbiblnote_resultPublication(CfResPubl cfrespublbiblnote_resultPublication) {
		this.cfrespublbiblnote_resultPublication = cfrespublbiblnote_resultPublication;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}