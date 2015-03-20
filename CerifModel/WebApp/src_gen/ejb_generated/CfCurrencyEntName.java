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
@Table(name = "CM_CURRENCY_ENTITY_NAME")
public class CfCurrencyEntName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfEntName", unique = false, nullable = false )
	private java.lang.String a_entity_name;
	@ManyToOne
	@JoinColumn(name="cfcurrencyentname_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfcurrencyentname_language;
	@ManyToOne
	@JoinColumn(name="cfcurrencyentname_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfcurrencyentname_currency;
	
	public CfCurrencyEntName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
	public java.lang.String getA_entity_name() {
		return this.a_entity_name;
	}
	
	public void setA_entity_name(java.lang.String a_entity_name) {
		this.a_entity_name = a_entity_name;
	}
	
	public CfLang getCfcurrencyentname_language() {
		return this.cfcurrencyentname_language;
	}
	
	public void setCfcurrencyentname_language(CfLang cfcurrencyentname_language) {
		this.cfcurrencyentname_language = cfcurrencyentname_language;
	}
	
	public CfCurrency getCfcurrencyentname_currency() {
		return this.cfcurrencyentname_currency;
	}
	
	public void setCfcurrencyentname_currency(CfCurrency cfcurrencyentname_currency) {
		this.cfcurrencyentname_currency = cfcurrencyentname_currency;
	}
	
}