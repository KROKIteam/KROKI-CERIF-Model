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
@Table(name = "C1_DUBLIN_CORE_RESOURCE_TYPE")
public class CfDCResourceType implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false , length = 5, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_dc_language_tag;
	@Column(name = "cfDCTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_dc_translation;
	@Column(name = "cfDCType", unique = false, nullable = false , length = 30, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_dc_type;
	@Column(name = "cfDCValue", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_dc_value;
	@ManyToOne
	@JoinColumn(name="cfdcresourcetype_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cfdcresourcetype_dublinCore;
	
	public CfDCResourceType(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_dc_language_tag() {
		return this.a_dc_language_tag;
	}
	
	public void setA_dc_language_tag(java.lang.String a_dc_language_tag) {
		this.a_dc_language_tag = a_dc_language_tag;
	}
	
	public java.lang.String getA_dc_translation() {
		return this.a_dc_translation;
	}
	
	public void setA_dc_translation(java.lang.String a_dc_translation) {
		this.a_dc_translation = a_dc_translation;
	}
	
	public java.lang.String getA_dc_type() {
		return this.a_dc_type;
	}
	
	public void setA_dc_type(java.lang.String a_dc_type) {
		this.a_dc_type = a_dc_type;
	}
	
	public java.lang.String getA_dc_value() {
		return this.a_dc_value;
	}
	
	public void setA_dc_value(java.lang.String a_dc_value) {
		this.a_dc_value = a_dc_value;
	}
	
	public CfDC getCfdcresourcetype_dublinCore() {
		return this.cfdcresourcetype_dublinCore;
	}
	
	public void setCfdcresourcetype_dublinCore(CfDC cfdcresourcetype_dublinCore) {
		this.cfdcresourcetype_dublinCore = cfdcresourcetype_dublinCore;
	}
	
}