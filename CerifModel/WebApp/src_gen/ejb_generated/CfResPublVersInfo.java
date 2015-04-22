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
@Table(name = "C1_RESULT_PUBLICATION_VERSION_INFO")
public class CfResPublVersInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfVersInfo", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_version_info;
	@ManyToOne
	@JoinColumn(name="cfrespublversinfo_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfrespublversinfo_language;
	@ManyToOne
	@JoinColumn(name="cfrespublversinfo_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespublversinfo_resultPublication;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	
	public CfResPublVersInfo(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_version_info() {
		return this.a_version_info;
	}
	
	public void setA_version_info(java.lang.String a_version_info) {
		this.a_version_info = a_version_info;
	}
	
	public CfLang getCfrespublversinfo_language() {
		return this.cfrespublversinfo_language;
	}
	
	public void setCfrespublversinfo_language(CfLang cfrespublversinfo_language) {
		this.cfrespublversinfo_language = cfrespublversinfo_language;
	}
	
	public CfResPubl getCfrespublversinfo_resultPublication() {
		return this.cfrespublversinfo_resultPublication;
	}
	
	public void setCfrespublversinfo_resultPublication(CfResPubl cfrespublversinfo_resultPublication) {
		this.cfrespublversinfo_resultPublication = cfrespublversinfo_resultPublication;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
}