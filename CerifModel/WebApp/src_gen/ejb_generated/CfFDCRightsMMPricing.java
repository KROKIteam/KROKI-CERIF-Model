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
@Table(name = "CM_FORMALISED_DUBLIN_CORE_RIGHTS_MANAGEMENT_PRICING")
public class CfFDCRightsMMPricing implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false )
	private java.lang.String a_dc_language_tag;
	@Column(name = "cfFDCTrans", unique = false, nullable = false )
	private java.lang.String a_formalised_dublin_core_translation;
	@Column(name = "cfFDCPriceConstraint", unique = false, nullable = false )
	private java.lang.String a_formalised_dc_price_constraint;
	@ManyToOne
	@JoinColumn(name="cffdcrightsmmpricing_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cffdcrightsmmpricing_dublinCore;
	
	public CfFDCRightsMMPricing(){
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
	
	public java.lang.String getA_formalised_dublin_core_translation() {
		return this.a_formalised_dublin_core_translation;
	}
	
	public void setA_formalised_dublin_core_translation(java.lang.String a_formalised_dublin_core_translation) {
		this.a_formalised_dublin_core_translation = a_formalised_dublin_core_translation;
	}
	
	public java.lang.String getA_formalised_dc_price_constraint() {
		return this.a_formalised_dc_price_constraint;
	}
	
	public void setA_formalised_dc_price_constraint(java.lang.String a_formalised_dc_price_constraint) {
		this.a_formalised_dc_price_constraint = a_formalised_dc_price_constraint;
	}
	
	public CfDC getCffdcrightsmmpricing_dublinCore() {
		return this.cffdcrightsmmpricing_dublinCore;
	}
	
	public void setCffdcrightsmmpricing_dublinCore(CfDC cffdcrightsmmpricing_dublinCore) {
		this.cffdcrightsmmpricing_dublinCore = cffdcrightsmmpricing_dublinCore;
	}
	
}