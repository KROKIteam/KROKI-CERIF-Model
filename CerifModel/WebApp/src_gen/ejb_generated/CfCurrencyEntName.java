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
@Table(name = "C1_CURRENCY_ENTITY_NAME")
public class CfCurrencyEntName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfEntName", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_entity_name;
	@ManyToOne
	@JoinColumn(name="cfcurrencyentname_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfcurrencyentname_language;
	@ManyToOne
	@JoinColumn(name="cfcurrencyentname_currency", referencedColumnName="ID",  nullable = true)
	protected CfCurrency cfcurrencyentname_currency;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfCurrencyEntName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_entity_name() {
		return this.ka_entity_name;
	}
	
	public void setKa_entity_name(java.lang.String ka_entity_name) {
		this.ka_entity_name = ka_entity_name;
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
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}