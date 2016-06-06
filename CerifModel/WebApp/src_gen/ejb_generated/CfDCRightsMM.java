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
@Table(name = "C1_DUBLIN_CORE_RIGHTS_MANAGEMENT")
public class CfDCRightsMM implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false , length = 5, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_dc_language_tag;
	@Column(name = "cfDCTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_dc_translation;
	@Column(name = "cfDCValue", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_dc_value;
	@Column(name = "cfDCType", unique = false, nullable = false , length = 30, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_dc_type;
	@ManyToOne
	@JoinColumn(name="cfdcrightsmm_dublinCore", referencedColumnName="ID",  nullable = true)
	protected CfDC cfdcrightsmm_dublinCore;
	
	public CfDCRightsMM(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_dc_language_tag() {
		return this.ka_dc_language_tag;
	}
	
	public void setKa_dc_language_tag(java.lang.String ka_dc_language_tag) {
		this.ka_dc_language_tag = ka_dc_language_tag;
	}
	
	public java.lang.String getKa_dc_translation() {
		return this.ka_dc_translation;
	}
	
	public void setKa_dc_translation(java.lang.String ka_dc_translation) {
		this.ka_dc_translation = ka_dc_translation;
	}
	
	public java.lang.String getKa_dc_value() {
		return this.ka_dc_value;
	}
	
	public void setKa_dc_value(java.lang.String ka_dc_value) {
		this.ka_dc_value = ka_dc_value;
	}
	
	public java.lang.String getKa_dc_type() {
		return this.ka_dc_type;
	}
	
	public void setKa_dc_type(java.lang.String ka_dc_type) {
		this.ka_dc_type = ka_dc_type;
	}
	
	public CfDC getCfdcrightsmm_dublinCore() {
		return this.cfdcrightsmm_dublinCore;
	}
	
	public void setCfdcrightsmm_dublinCore(CfDC cfdcrightsmm_dublinCore) {
		this.cfdcrightsmm_dublinCore = cfdcrightsmm_dublinCore;
	}
	
}