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
@Table(name = "C1_RESULT_PATENT_VERSION_INFO")
public class CfResPatVersInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	@Column(name = "cfVersInfo", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_version_info;
	@ManyToOne
	@JoinColumn(name="cfrespatversinfo_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfrespatversinfo_language;
	@ManyToOne
	@JoinColumn(name="cfrespatversinfo_resultPatent", referencedColumnName="ID",  nullable = true)
	private CfResPat cfrespatversinfo_resultPatent;
	
	public CfResPatVersInfo(){
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
	
	public java.lang.String getA_version_info() {
		return this.a_version_info;
	}
	
	public void setA_version_info(java.lang.String a_version_info) {
		this.a_version_info = a_version_info;
	}
	
	public CfLang getCfrespatversinfo_language() {
		return this.cfrespatversinfo_language;
	}
	
	public void setCfrespatversinfo_language(CfLang cfrespatversinfo_language) {
		this.cfrespatversinfo_language = cfrespatversinfo_language;
	}
	
	public CfResPat getCfrespatversinfo_resultPatent() {
		return this.cfrespatversinfo_resultPatent;
	}
	
	public void setCfrespatversinfo_resultPatent(CfResPat cfrespatversinfo_resultPatent) {
		this.cfrespatversinfo_resultPatent = cfrespatversinfo_resultPatent;
	}
	
}