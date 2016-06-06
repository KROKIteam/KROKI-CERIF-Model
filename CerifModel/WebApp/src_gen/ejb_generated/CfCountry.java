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
@Table(name = "C1_COUNTRY")
public class CfCountry implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfCountryCode", unique = false, nullable = false , length = 2, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_country_code;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcountry_class_country")
	protected Set<CfCountry_Class> cfcountry_class_countrySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcountryname_country")
	protected Set<CfCountryName> cfcountryname_countrySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfevent_country")
	protected Set<CfEvent> cfevent_countrySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_country_country")
	protected Set<CfPers_Country> cfpers_country_countrySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpaddr_country")
	protected Set<CfPAddr> cfpaddr_countrySet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespat_country")
	protected Set<CfResPat> cfrespat_countrySet;
	
	public CfCountry(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_country_code() {
		return this.ka_country_code;
	}
	
	public void setKa_country_code(java.lang.String ka_country_code) {
		this.ka_country_code = ka_country_code;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public Set<CfCountry_Class> getCfcountry_class_countrySet() {
		return this.cfcountry_class_countrySet;
	}
	
	public void setCfcountry_class_countrySet(Set<CfCountry_Class> cfcountry_class_countrySet) {
		this.cfcountry_class_countrySet = cfcountry_class_countrySet;
	}
	
	public Set<CfCountryName> getCfcountryname_countrySet() {
		return this.cfcountryname_countrySet;
	}
	
	public void setCfcountryname_countrySet(Set<CfCountryName> cfcountryname_countrySet) {
		this.cfcountryname_countrySet = cfcountryname_countrySet;
	}
	
	public Set<CfEvent> getCfevent_countrySet() {
		return this.cfevent_countrySet;
	}
	
	public void setCfevent_countrySet(Set<CfEvent> cfevent_countrySet) {
		this.cfevent_countrySet = cfevent_countrySet;
	}
	
	public Set<CfPers_Country> getCfpers_country_countrySet() {
		return this.cfpers_country_countrySet;
	}
	
	public void setCfpers_country_countrySet(Set<CfPers_Country> cfpers_country_countrySet) {
		this.cfpers_country_countrySet = cfpers_country_countrySet;
	}
	
	public Set<CfPAddr> getCfpaddr_countrySet() {
		return this.cfpaddr_countrySet;
	}
	
	public void setCfpaddr_countrySet(Set<CfPAddr> cfpaddr_countrySet) {
		this.cfpaddr_countrySet = cfpaddr_countrySet;
	}
	
	public Set<CfResPat> getCfrespat_countrySet() {
		return this.cfrespat_countrySet;
	}
	
	public void setCfrespat_countrySet(Set<CfResPat> cfrespat_countrySet) {
		this.cfrespat_countrySet = cfrespat_countrySet;
	}
	
}