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
@Table(name = "CM_COUNTRY_NAME")
public class CfCountryName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfName", unique = false, nullable = false )
	private java.lang.String a_name;
	@ManyToOne
	@JoinColumn(name="cfcountryname_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfcountryname_language;
	@ManyToOne
	@JoinColumn(name="cfcountryname_country", referencedColumnName="ID",  nullable = true)
	private CfCountry cfcountryname_country;
	
	public CfCountryName(){
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
	
	public java.lang.String getA_name() {
		return this.a_name;
	}
	
	public void setA_name(java.lang.String a_name) {
		this.a_name = a_name;
	}
	
	public CfLang getCfcountryname_language() {
		return this.cfcountryname_language;
	}
	
	public void setCfcountryname_language(CfLang cfcountryname_language) {
		this.cfcountryname_language = cfcountryname_language;
	}
	
	public CfCountry getCfcountryname_country() {
		return this.cfcountryname_country;
	}
	
	public void setCfcountryname_country(CfCountry cfcountryname_country) {
		this.cfcountryname_country = cfcountryname_country;
	}
	
}