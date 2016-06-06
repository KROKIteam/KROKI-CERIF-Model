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
@Table(name = "C1_DUBLIN_CORE_COVERAGE_SPATIAL")
public class CfDCCoverageSpatial implements java.io.Serializable {

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
	@Column(name = "cfFDCXCoordinate", unique = false, nullable = false , length = 12, precision = 6,columnDefinition = "DECIMAL")
	protected java.math.BigDecimal ka_formalised_dc_x_coordinate;
	@Column(name = "cfFDCYCoordinate", unique = false, nullable = false , length = 12, precision = 6,columnDefinition = "DECIMAL")
	protected java.math.BigDecimal ka_formalised_dc_y_coordinate;
	@Column(name = "cfFDCZCoordinate", unique = false, nullable = false , length = 12, precision = 6,columnDefinition = "DECIMAL")
	protected java.math.BigDecimal ka_formalised_dc_z_coordinate;
	@Column(name = "cfFDCPrecision", unique = false, nullable = false , length = 12, precision = 6,columnDefinition = "DECIMAL")
	protected java.math.BigDecimal ka_formalised_dc_precision;
	@ManyToOne
	@JoinColumn(name="cfdccoveragespatial_dublinCore", referencedColumnName="ID",  nullable = true)
	protected CfDC cfdccoveragespatial_dublinCore;
	
	public CfDCCoverageSpatial(){
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
	
	public java.math.BigDecimal getKa_formalised_dc_x_coordinate() {
		return this.ka_formalised_dc_x_coordinate;
	}
	
	public void setKa_formalised_dc_x_coordinate(java.math.BigDecimal ka_formalised_dc_x_coordinate) {
		this.ka_formalised_dc_x_coordinate = ka_formalised_dc_x_coordinate;
	}
	
	public java.math.BigDecimal getKa_formalised_dc_y_coordinate() {
		return this.ka_formalised_dc_y_coordinate;
	}
	
	public void setKa_formalised_dc_y_coordinate(java.math.BigDecimal ka_formalised_dc_y_coordinate) {
		this.ka_formalised_dc_y_coordinate = ka_formalised_dc_y_coordinate;
	}
	
	public java.math.BigDecimal getKa_formalised_dc_z_coordinate() {
		return this.ka_formalised_dc_z_coordinate;
	}
	
	public void setKa_formalised_dc_z_coordinate(java.math.BigDecimal ka_formalised_dc_z_coordinate) {
		this.ka_formalised_dc_z_coordinate = ka_formalised_dc_z_coordinate;
	}
	
	public java.math.BigDecimal getKa_formalised_dc_precision() {
		return this.ka_formalised_dc_precision;
	}
	
	public void setKa_formalised_dc_precision(java.math.BigDecimal ka_formalised_dc_precision) {
		this.ka_formalised_dc_precision = ka_formalised_dc_precision;
	}
	
	public CfDC getCfdccoveragespatial_dublinCore() {
		return this.cfdccoveragespatial_dublinCore;
	}
	
	public void setCfdccoveragespatial_dublinCore(CfDC cfdccoveragespatial_dublinCore) {
		this.cfdccoveragespatial_dublinCore = cfdccoveragespatial_dublinCore;
	}
	
}