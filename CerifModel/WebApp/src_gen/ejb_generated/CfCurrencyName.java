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
@Table(name = "C1_CURRENCY_NAME")
public class CfCurrencyName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfName", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_name;
	@ManyToOne
	@JoinColumn(name="cfcurrencyname_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfcurrencyname_language;
	@ManyToOne
	@JoinColumn(name="cfcurrencyname_currency", referencedColumnName="ID",  nullable = true)
	private CfCurrency cfcurrencyname_currency;
	@Column(name = "CD_TRANSLATION_KIND", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	
	public CfCurrencyName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_name() {
		return this.a_name;
	}
	
	public void setA_name(java.lang.String a_name) {
		this.a_name = a_name;
	}
	
	public CfLang getCfcurrencyname_language() {
		return this.cfcurrencyname_language;
	}
	
	public void setCfcurrencyname_language(CfLang cfcurrencyname_language) {
		this.cfcurrencyname_language = cfcurrencyname_language;
	}
	
	public CfCurrency getCfcurrencyname_currency() {
		return this.cfcurrencyname_currency;
	}
	
	public void setCfcurrencyname_currency(CfCurrency cfcurrencyname_currency) {
		this.cfcurrencyname_currency = cfcurrencyname_currency;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
}