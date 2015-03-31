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
@Table(name = "CM_DUBLIN_CORE_DATE")
public class CfDCDate implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false )
	private java.lang.String a_dc_language_tag;
	@Column(name = "cfDCTrans", unique = false, nullable = false )
	private java.lang.String a_dc_translation;
	@Column(name = "cfDCType", unique = false, nullable = false )
	private java.lang.String a_dc_type;
	@Column(name = "cfDCValue", unique = false, nullable = false )
	private java.lang.String a_dc_value;
	@Column(name = "cfDCDateBegin", unique = false, nullable = false )
	private java.util.Date a_dc_date_begin;
	@Column(name = "cfDCDateEnd", unique = false, nullable = false )
	private java.util.Date a_dc_date_end;
	@ManyToOne
	@JoinColumn(name="cfdcdate_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cfdcdate_dublinCore;
	
	public CfDCDate(){
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
	
	public java.util.Date getA_dc_date_begin() {
		return this.a_dc_date_begin;
	}
	
	public void setA_dc_date_begin(java.util.Date a_dc_date_begin) {
		this.a_dc_date_begin = a_dc_date_begin;
	}
	
	public java.util.Date getA_dc_date_end() {
		return this.a_dc_date_end;
	}
	
	public void setA_dc_date_end(java.util.Date a_dc_date_end) {
		this.a_dc_date_end = a_dc_date_end;
	}
	
	public CfDC getCfdcdate_dublinCore() {
		return this.cfdcdate_dublinCore;
	}
	
	public void setCfdcdate_dublinCore(CfDC cfdcdate_dublinCore) {
		this.cfdcdate_dublinCore = cfdcdate_dublinCore;
	}
	
}