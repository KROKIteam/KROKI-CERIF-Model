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
@Table(name = "C1_RESULT_PUBLICATION_VERSION_INFO")
public class CfResPublVersInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfVersInfo", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_version_info;
	@ManyToOne
	@JoinColumn(name="cfrespublversinfo_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfrespublversinfo_language;
	@ManyToOne
	@JoinColumn(name="cfrespublversinfo_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cfrespublversinfo_resultPublication;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfResPublVersInfo(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_version_info() {
		return this.ka_version_info;
	}
	
	public void setKa_version_info(java.lang.String ka_version_info) {
		this.ka_version_info = ka_version_info;
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
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}