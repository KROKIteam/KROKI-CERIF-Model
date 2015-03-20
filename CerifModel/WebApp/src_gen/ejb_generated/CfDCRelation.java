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
@Table(name = "CM_DUBLIN_CORE_RELATION")
public class CfDCRelation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false )
	private java.lang.String a_dc_language_tag;
	@Column(name = "cfDCTrans", unique = false, nullable = false )
	private java.lang.String a_dc_translation;
	@Column(name = "cfDCStartDate", unique = false, nullable = false )
	private java.util.Date a_dc_start_date;
	@Column(name = "cfDCEndDate", unique = false, nullable = false )
	private java.util.Date a_dc_end_date;
	@Column(name = "cfDCType", unique = false, nullable = false )
	private java.lang.String a_dc_type;
	@Column(name = "cfDCValue", unique = false, nullable = false )
	private java.lang.String a_dc_value;
	@ManyToOne
	@JoinColumn(name="cfdcrelation_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cfdcrelation_dublinCore;
	@ManyToOne
	@JoinColumn(name="cfdcrelation_dublinCorea", referencedColumnName="ID",  nullable = true)
	private CfDC cfdcrelation_dublinCorea;
	
	public CfDCRelation(){
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
	
	public java.util.Date getA_dc_start_date() {
		return this.a_dc_start_date;
	}
	
	public void setA_dc_start_date(java.util.Date a_dc_start_date) {
		this.a_dc_start_date = a_dc_start_date;
	}
	
	public java.util.Date getA_dc_end_date() {
		return this.a_dc_end_date;
	}
	
	public void setA_dc_end_date(java.util.Date a_dc_end_date) {
		this.a_dc_end_date = a_dc_end_date;
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
	
	public CfDC getCfdcrelation_dublinCore() {
		return this.cfdcrelation_dublinCore;
	}
	
	public void setCfdcrelation_dublinCore(CfDC cfdcrelation_dublinCore) {
		this.cfdcrelation_dublinCore = cfdcrelation_dublinCore;
	}
	
	public CfDC getCfdcrelation_dublinCorea() {
		return this.cfdcrelation_dublinCorea;
	}
	
	public void setCfdcrelation_dublinCorea(CfDC cfdcrelation_dublinCorea) {
		this.cfdcrelation_dublinCorea = cfdcrelation_dublinCorea;
	}
	
}