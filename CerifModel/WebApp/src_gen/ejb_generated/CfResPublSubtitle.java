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
@Table(name = "CM_RESULT_PUBLICATION_SUBTITLE")
public class CfResPublSubtitle implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfSubtitle", unique = false, nullable = false )
	private java.lang.String a_subtitle;
	@ManyToOne
	@JoinColumn(name="cfrespublsubtitle_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfrespublsubtitle_language;
	@ManyToOne
	@JoinColumn(name="cfrespublsubtitle_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespublsubtitle_resultPublication;
	
	public CfResPublSubtitle(){
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
	
	public java.lang.String getA_subtitle() {
		return this.a_subtitle;
	}
	
	public void setA_subtitle(java.lang.String a_subtitle) {
		this.a_subtitle = a_subtitle;
	}
	
	public CfLang getCfrespublsubtitle_language() {
		return this.cfrespublsubtitle_language;
	}
	
	public void setCfrespublsubtitle_language(CfLang cfrespublsubtitle_language) {
		this.cfrespublsubtitle_language = cfrespublsubtitle_language;
	}
	
	public CfResPubl getCfrespublsubtitle_resultPublication() {
		return this.cfrespublsubtitle_resultPublication;
	}
	
	public void setCfrespublsubtitle_resultPublication(CfResPubl cfrespublsubtitle_resultPublication) {
		this.cfrespublsubtitle_resultPublication = cfrespublsubtitle_resultPublication;
	}
	
}