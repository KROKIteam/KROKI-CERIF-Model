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
@Table(name = "C1_QUALIFICATION_TITLE")
public class CfQualTitle implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfTitle", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_title;
	@ManyToOne
	@JoinColumn(name="cfqualtitle_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfqualtitle_language;
	@ManyToOne
	@JoinColumn(name="cfqualtitle_qualification", referencedColumnName="ID",  nullable = true)
	protected CfQual cfqualtitle_qualification;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfQualTitle(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_title() {
		return this.ka_title;
	}
	
	public void setKa_title(java.lang.String ka_title) {
		this.ka_title = ka_title;
	}
	
	public CfLang getCfqualtitle_language() {
		return this.cfqualtitle_language;
	}
	
	public void setCfqualtitle_language(CfLang cfqualtitle_language) {
		this.cfqualtitle_language = cfqualtitle_language;
	}
	
	public CfQual getCfqualtitle_qualification() {
		return this.cfqualtitle_qualification;
	}
	
	public void setCfqualtitle_qualification(CfQual cfqualtitle_qualification) {
		this.cfqualtitle_qualification = cfqualtitle_qualification;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}