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
@Table(name = "CM_RESULT_PUBLICATION_TITLE")
public class CfResPublTitle implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfTitle", unique = false, nullable = false )
	private java.lang.String a_title;
	@ManyToOne
	@JoinColumn(name="cfrespubltitle_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfrespubltitle_language;
	@ManyToOne
	@JoinColumn(name="cfrespubltitle_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespubltitle_resultPublication;
	
	public CfResPublTitle(){
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
	
	public java.lang.String getA_title() {
		return this.a_title;
	}
	
	public void setA_title(java.lang.String a_title) {
		this.a_title = a_title;
	}
	
	public CfLang getCfrespubltitle_language() {
		return this.cfrespubltitle_language;
	}
	
	public void setCfrespubltitle_language(CfLang cfrespubltitle_language) {
		this.cfrespubltitle_language = cfrespubltitle_language;
	}
	
	public CfResPubl getCfrespubltitle_resultPublication() {
		return this.cfrespubltitle_resultPublication;
	}
	
	public void setCfrespubltitle_resultPublication(CfResPubl cfrespubltitle_resultPublication) {
		this.cfrespubltitle_resultPublication = cfrespubltitle_resultPublication;
	}
	
}