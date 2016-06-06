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
@Table(name = "C1_POST_ADDRESS")
public class CfPAddr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfPAddrId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_post_address_identifier;
	@Column(name = "cfAddrline1", unique = false, nullable = false , length = 80, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_address_line1;
	@Column(name = "cfAddrline2", unique = false, nullable = false , length = 80, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_address_line2;
	@Column(name = "cfAddrline3", unique = false, nullable = false , length = 80, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_address_line3;
	@Column(name = "cfAddrline4", unique = false, nullable = false , length = 80, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_address_line4;
	@Column(name = "cfAddrline5", unique = false, nullable = false , length = 80, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_address_line5;
	@Column(name = "cfPostCode", unique = false, nullable = false , length = 16, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_post_code;
	@Column(name = "cfCityTown", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_city_town;
	@Column(name = "cfStateOfCountry", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_state_of_country;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cfpaddr_country", referencedColumnName="ID",  nullable = true)
	protected CfCountry cfpaddr_country;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeaddr_postAddress")
	protected Set<CfEAddr> cfeaddr_postAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfequip_paddr_postAddress")
	protected Set<CfEquip_PAddr> cfequip_paddr_postAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffacil_paddr_postAddress")
	protected Set<CfFacil_PAddr> cffacil_paddr_postAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_paddr_postAddress")
	protected Set<CfOrgUnit_PAddr> cforgunit_paddr_postAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_paddr_postAddress")
	protected Set<CfPers_PAddr> cfpers_paddr_postAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpaddr_class_postAddress")
	protected Set<CfPAddr_Class> cfpaddr_class_postAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpaddr_geobbox_postAddress")
	protected Set<CfPAddr_GeoBBox> cfpaddr_geobbox_postAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_paddr_postAddress")
	protected Set<CfSrv_PAddr> cfsrv_paddr_postAddressSet;
	
	public CfPAddr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_post_address_identifier() {
		return this.ka_post_address_identifier;
	}
	
	public void setKa_post_address_identifier(java.lang.String ka_post_address_identifier) {
		this.ka_post_address_identifier = ka_post_address_identifier;
	}
	
	public java.lang.String getKa_address_line1() {
		return this.ka_address_line1;
	}
	
	public void setKa_address_line1(java.lang.String ka_address_line1) {
		this.ka_address_line1 = ka_address_line1;
	}
	
	public java.lang.String getKa_address_line2() {
		return this.ka_address_line2;
	}
	
	public void setKa_address_line2(java.lang.String ka_address_line2) {
		this.ka_address_line2 = ka_address_line2;
	}
	
	public java.lang.String getKa_address_line3() {
		return this.ka_address_line3;
	}
	
	public void setKa_address_line3(java.lang.String ka_address_line3) {
		this.ka_address_line3 = ka_address_line3;
	}
	
	public java.lang.String getKa_address_line4() {
		return this.ka_address_line4;
	}
	
	public void setKa_address_line4(java.lang.String ka_address_line4) {
		this.ka_address_line4 = ka_address_line4;
	}
	
	public java.lang.String getKa_address_line5() {
		return this.ka_address_line5;
	}
	
	public void setKa_address_line5(java.lang.String ka_address_line5) {
		this.ka_address_line5 = ka_address_line5;
	}
	
	public java.lang.String getKa_post_code() {
		return this.ka_post_code;
	}
	
	public void setKa_post_code(java.lang.String ka_post_code) {
		this.ka_post_code = ka_post_code;
	}
	
	public java.lang.String getKa_city_town() {
		return this.ka_city_town;
	}
	
	public void setKa_city_town(java.lang.String ka_city_town) {
		this.ka_city_town = ka_city_town;
	}
	
	public java.lang.String getKa_state_of_country() {
		return this.ka_state_of_country;
	}
	
	public void setKa_state_of_country(java.lang.String ka_state_of_country) {
		this.ka_state_of_country = ka_state_of_country;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public CfCountry getCfpaddr_country() {
		return this.cfpaddr_country;
	}
	
	public void setCfpaddr_country(CfCountry cfpaddr_country) {
		this.cfpaddr_country = cfpaddr_country;
	}
	
	public Set<CfEAddr> getCfeaddr_postAddressSet() {
		return this.cfeaddr_postAddressSet;
	}
	
	public void setCfeaddr_postAddressSet(Set<CfEAddr> cfeaddr_postAddressSet) {
		this.cfeaddr_postAddressSet = cfeaddr_postAddressSet;
	}
	
	public Set<CfEquip_PAddr> getCfequip_paddr_postAddressSet() {
		return this.cfequip_paddr_postAddressSet;
	}
	
	public void setCfequip_paddr_postAddressSet(Set<CfEquip_PAddr> cfequip_paddr_postAddressSet) {
		this.cfequip_paddr_postAddressSet = cfequip_paddr_postAddressSet;
	}
	
	public Set<CfFacil_PAddr> getCffacil_paddr_postAddressSet() {
		return this.cffacil_paddr_postAddressSet;
	}
	
	public void setCffacil_paddr_postAddressSet(Set<CfFacil_PAddr> cffacil_paddr_postAddressSet) {
		this.cffacil_paddr_postAddressSet = cffacil_paddr_postAddressSet;
	}
	
	public Set<CfOrgUnit_PAddr> getCforgunit_paddr_postAddressSet() {
		return this.cforgunit_paddr_postAddressSet;
	}
	
	public void setCforgunit_paddr_postAddressSet(Set<CfOrgUnit_PAddr> cforgunit_paddr_postAddressSet) {
		this.cforgunit_paddr_postAddressSet = cforgunit_paddr_postAddressSet;
	}
	
	public Set<CfPers_PAddr> getCfpers_paddr_postAddressSet() {
		return this.cfpers_paddr_postAddressSet;
	}
	
	public void setCfpers_paddr_postAddressSet(Set<CfPers_PAddr> cfpers_paddr_postAddressSet) {
		this.cfpers_paddr_postAddressSet = cfpers_paddr_postAddressSet;
	}
	
	public Set<CfPAddr_Class> getCfpaddr_class_postAddressSet() {
		return this.cfpaddr_class_postAddressSet;
	}
	
	public void setCfpaddr_class_postAddressSet(Set<CfPAddr_Class> cfpaddr_class_postAddressSet) {
		this.cfpaddr_class_postAddressSet = cfpaddr_class_postAddressSet;
	}
	
	public Set<CfPAddr_GeoBBox> getCfpaddr_geobbox_postAddressSet() {
		return this.cfpaddr_geobbox_postAddressSet;
	}
	
	public void setCfpaddr_geobbox_postAddressSet(Set<CfPAddr_GeoBBox> cfpaddr_geobbox_postAddressSet) {
		this.cfpaddr_geobbox_postAddressSet = cfpaddr_geobbox_postAddressSet;
	}
	
	public Set<CfSrv_PAddr> getCfsrv_paddr_postAddressSet() {
		return this.cfsrv_paddr_postAddressSet;
	}
	
	public void setCfsrv_paddr_postAddressSet(Set<CfSrv_PAddr> cfsrv_paddr_postAddressSet) {
		this.cfsrv_paddr_postAddressSet = cfsrv_paddr_postAddressSet;
	}
	
}