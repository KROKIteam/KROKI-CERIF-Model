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
@Table(name = "CM_FORMALISED_DUBLIN_CORE_RIGHTS_MANAGEMENT_RIGHTS")
public class CfFDCRightsMMRights implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDCLangTag", unique = false, nullable = false )
	private java.lang.String a_dc_language_tag;
	@Column(name = "cfDCTrans", unique = false, nullable = false )
	private java.lang.String a_dc_translation;
	@Column(name = "cfFDCRightsConstraint", unique = false, nullable = false )
	private java.lang.String a_formalised_dc_rights_constraint;
	@ManyToOne
	@JoinColumn(name="cffdcrightsmmrights_dublinCore", referencedColumnName="ID",  nullable = true)
	private CfDC cffdcrightsmmrights_dublinCore;
	
	public CfFDCRightsMMRights(){
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
	
	public java.lang.String getA_formalised_dc_rights_constraint() {
		return this.a_formalised_dc_rights_constraint;
	}
	
	public void setA_formalised_dc_rights_constraint(java.lang.String a_formalised_dc_rights_constraint) {
		this.a_formalised_dc_rights_constraint = a_formalised_dc_rights_constraint;
	}
	
	public CfDC getCffdcrightsmmrights_dublinCore() {
		return this.cffdcrightsmmrights_dublinCore;
	}
	
	public void setCffdcrightsmmrights_dublinCore(CfDC cffdcrightsmmrights_dublinCore) {
		this.cffdcrightsmmrights_dublinCore = cffdcrightsmmrights_dublinCore;
	}
	
}