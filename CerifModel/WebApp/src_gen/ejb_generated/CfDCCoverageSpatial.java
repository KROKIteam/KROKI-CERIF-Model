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
@Table(name = "CM_DUBLIN_CORE_COVERAGE_SPATIAL")
public class CfDCCoverageSpatial implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false )
	private java.lang.String a_dc_language_tag;
	@Column(name = "cfDCTrans", unique = false, nullable = false )
	private java.lang.String a_dc_translation;
	@Column(name = "cfDCValue", unique = false, nullable = false )
	private java.lang.String a_dc_value;
	@Column(name = "cfFDCXCoordinate", unique = false, nullable = false )
	private java.math.BigDecimal a_formalised_dc_x_coordinate;
	@Column(name = "cfFDCYCoordinate", unique = false, nullable = false )
	private java.math.BigDecimal a_formalised_dc_y_coordinate;
	@Column(name = "cfFDCZCoordinate", unique = false, nullable = false )
	private java.math.BigDecimal a_formalised_dc_z_coordinate;
	@Column(name = "cfFDCPrecision", unique = false, nullable = false )
	private java.math.BigDecimal a_formalised_dc_precision;
	@ManyToOne
	@JoinColumn(name="cfdccoveragespatial_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cfdccoveragespatial_dublinCore;
	
	public CfDCCoverageSpatial(){
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
	
	public java.lang.String getA_dc_value() {
		return this.a_dc_value;
	}
	
	public void setA_dc_value(java.lang.String a_dc_value) {
		this.a_dc_value = a_dc_value;
	}
	
	public java.math.BigDecimal getA_formalised_dc_x_coordinate() {
		return this.a_formalised_dc_x_coordinate;
	}
	
	public void setA_formalised_dc_x_coordinate(java.math.BigDecimal a_formalised_dc_x_coordinate) {
		this.a_formalised_dc_x_coordinate = a_formalised_dc_x_coordinate;
	}
	
	public java.math.BigDecimal getA_formalised_dc_y_coordinate() {
		return this.a_formalised_dc_y_coordinate;
	}
	
	public void setA_formalised_dc_y_coordinate(java.math.BigDecimal a_formalised_dc_y_coordinate) {
		this.a_formalised_dc_y_coordinate = a_formalised_dc_y_coordinate;
	}
	
	public java.math.BigDecimal getA_formalised_dc_z_coordinate() {
		return this.a_formalised_dc_z_coordinate;
	}
	
	public void setA_formalised_dc_z_coordinate(java.math.BigDecimal a_formalised_dc_z_coordinate) {
		this.a_formalised_dc_z_coordinate = a_formalised_dc_z_coordinate;
	}
	
	public java.math.BigDecimal getA_formalised_dc_precision() {
		return this.a_formalised_dc_precision;
	}
	
	public void setA_formalised_dc_precision(java.math.BigDecimal a_formalised_dc_precision) {
		this.a_formalised_dc_precision = a_formalised_dc_precision;
	}
	
	public CfDC getCfdccoveragespatial_dublinCore() {
		return this.cfdccoveragespatial_dublinCore;
	}
	
	public void setCfdccoveragespatial_dublinCore(CfDC cfdccoveragespatial_dublinCore) {
		this.cfdccoveragespatial_dublinCore = cfdccoveragespatial_dublinCore;
	}
	
}