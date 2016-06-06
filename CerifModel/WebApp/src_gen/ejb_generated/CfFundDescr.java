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
@Table(name = "C1_FUNDING_DESCRIPTION")
public class CfFundDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfDescr", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_description;
	@ManyToOne
	@JoinColumn(name="cffunddescr_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cffunddescr_language;
	@ManyToOne
	@JoinColumn(name="cffunddescr_funding", referencedColumnName="ID",  nullable = true)
	protected CfFund cffunddescr_funding;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	@ManyToOne
	@JoinColumn(name="cffunddescr_fundingIntegrated", referencedColumnName="ID",  nullable = true)
	protected Fundingintegrated cffunddescr_fundingIntegrated;
	
	public CfFundDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_description() {
		return this.ka_description;
	}
	
	public void setKa_description(java.lang.String ka_description) {
		this.ka_description = ka_description;
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
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
	public Fundingintegrated getCffunddescr_fundingIntegrated() {
		return this.cffunddescr_fundingIntegrated;
	}
	
	public void setCffunddescr_fundingIntegrated(Fundingintegrated cffunddescr_fundingIntegrated) {
		this.cffunddescr_fundingIntegrated = cffunddescr_fundingIntegrated;
	}
	
}