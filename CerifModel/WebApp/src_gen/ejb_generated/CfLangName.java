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
@Table(name = "C1_LANGUAGE_NAME")
public class CfLangName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfName", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_name;
	@ManyToOne
	@JoinColumn(name="cflangname_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cflangname_language;
	@ManyToOne
	@JoinColumn(name="cflangname_languagea", referencedColumnName="ID",  nullable = true)
	protected CfLang cflangname_languagea;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfLangName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_name() {
		return this.ka_name;
	}
	
	public void setKa_name(java.lang.String ka_name) {
		this.ka_name = ka_name;
	}
	
	public CfLang getCflangname_language() {
		return this.cflangname_language;
	}
	
	public void setCflangname_language(CfLang cflangname_language) {
		this.cflangname_language = cflangname_language;
	}
	
	public CfLang getCflangname_languagea() {
		return this.cflangname_languagea;
	}
	
	public void setCflangname_languagea(CfLang cflangname_languagea) {
		this.cflangname_languagea = cflangname_languagea;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}