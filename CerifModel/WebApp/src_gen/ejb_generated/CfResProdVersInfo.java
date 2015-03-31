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
   Creation date: 31.03.2015  10:28:05h
   **/

@Entity
@Table(name = "CM_RESULT_PRODUCT_VERSION_INFO")
public class CfResProdVersInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfVersInfo", unique = false, nullable = false )
	private java.lang.String a_version_info;
	@ManyToOne
	@JoinColumn(name="cfresprodversinfo_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfresprodversinfo_language;
	@ManyToOne
	@JoinColumn(name="cfresprodversinfo_resultProduct", referencedColumnName="ID",  nullable = true)
	private CfResProd cfresprodversinfo_resultProduct;
	
	public CfResProdVersInfo(){
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
	
	public CfLang getCfresprodversinfo_language() {
		return this.cfresprodversinfo_language;
	}
	
	public void setCfresprodversinfo_language(CfLang cfresprodversinfo_language) {
		this.cfresprodversinfo_language = cfresprodversinfo_language;
	}
	
	public CfResProd getCfresprodversinfo_resultProduct() {
		return this.cfresprodversinfo_resultProduct;
	}
	
	public void setCfresprodversinfo_resultProduct(CfResProd cfresprodversinfo_resultProduct) {
		this.cfresprodversinfo_resultProduct = cfresprodversinfo_resultProduct;
	}
	
}