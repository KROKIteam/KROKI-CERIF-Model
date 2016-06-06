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
@Table(name = "C1_RESULT_PATENT_ABSTRACT")
public class CfResPatAbstr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	@Column(name = "cfAbstr", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_abstract;
	@ManyToOne
	@JoinColumn(name="cfrespatabstr_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfrespatabstr_language;
	@ManyToOne
	@JoinColumn(name="cfrespatabstr_resultPatent", referencedColumnName="ID",  nullable = true)
	protected CfResPat cfrespatabstr_resultPatent;
	
	public CfResPatAbstr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
	public java.lang.String getKa_abstract() {
		return this.ka_abstract;
	}
	
	public void setKa_abstract(java.lang.String ka_abstract) {
		this.ka_abstract = ka_abstract;
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