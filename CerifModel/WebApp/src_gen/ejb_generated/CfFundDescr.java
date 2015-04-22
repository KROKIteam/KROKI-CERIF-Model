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
@Table(name = "C1_FUNDING_DESCRIPTION")
public class CfFundDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDescr", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="cffunddescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cffunddescr_language;
	@ManyToOne
	@JoinColumn(name="cffunddescr_funding", referencedColumnName="ID",  nullable = true)
	private CfFund cffunddescr_funding;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	@ManyToOne
	@JoinColumn(name="cffunddescr_fundingIntegrated", referencedColumnName="ID",  nullable = true)
	private Fundingintegrated cffunddescr_fundingIntegrated;
	
	public CfFundDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public CfLang getCffunddescr_language() {
		return this.cffunddescr_language;
	}
	
	public void setCffunddescr_language(CfLang cffunddescr_language) {
		this.cffunddescr_language = cffunddescr_language;
	}
	
	public CfFund getCffunddescr_funding() {
		return this.cffunddescr_funding;
	}
	
	public void setCffunddescr_funding(CfFund cffunddescr_funding) {
		this.cffunddescr_funding = cffunddescr_funding;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
	public Fundingintegrated getCffunddescr_fundingIntegrated() {
		return this.cffunddescr_fundingIntegrated;
	}
	
	public void setCffunddescr_fundingIntegrated(Fundingintegrated cffunddescr_fundingIntegrated) {
		this.cffunddescr_fundingIntegrated = cffunddescr_fundingIntegrated;
	}
	
}