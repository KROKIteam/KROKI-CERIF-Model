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
@Table(name = "C1_FORMALISED_DUBLIN_CORE_RIGHTS_MANAGEMENT_PRICING")
public class CfFDCRightsMMPricing implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false , length = 5, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_dc_language_tag;
	@Column(name = "cfFDCTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_formalised_dublin_core_translation;
	@Column(name = "cfFDCPriceConstraint", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_formalised_dc_price_constraint;
	@ManyToOne
	@JoinColumn(name="cffdcrightsmmpricing_dublinCore", referencedColumnName="ID",  nullable = true)
	protected CfDC cffdcrightsmmpricing_dublinCore;
	
	public CfFDCRightsMMPricing(){
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
	
	public java.lang.String getKa_formalised_dublin_core_translation() {
		return this.ka_formalised_dublin_core_translation;
	}
	
	public void setKa_formalised_dublin_core_translation(java.lang.String ka_formalised_dublin_core_translation) {
		this.ka_formalised_dublin_core_translation = ka_formalised_dublin_core_translation;
	}
	
	public java.lang.String getKa_formalised_dc_price_constraint() {
		return this.ka_formalised_dc_price_constraint;
	}
	
	public void setKa_formalised_dc_price_constraint(java.lang.String ka_formalised_dc_price_constraint) {
		this.ka_formalised_dc_price_constraint = ka_formalised_dc_price_constraint;
	}
	
	public CfDC getCffdcrightsmmpricing_dublinCore() {
		return this.cffdcrightsmmpricing_dublinCore;
	}
	
	public void setCffdcrightsmmpricing_dublinCore(CfDC cffdcrightsmmpricing_dublinCore) {
		this.cffdcrightsmmpricing_dublinCore = cffdcrightsmmpricing_dublinCore;
	}
	
}