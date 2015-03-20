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
@Table(name = "CM_ELECTRONIC_ADDRESS")
public class CfEAddr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfEAddrId", unique = false, nullable = false )
	private java.lang.String a_electronic_address_identifier;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@ManyToOne
	@JoinColumn(name="cfeaddr_postAddress", referencedColumnName="ID",  nullable = true)
	private CfPAddr cfeaddr_postAddress;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfeaddr_class_electronicAddress")
	private Set<CfEAddr_Class> cfeaddr_class_electronicAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_eaddr_electronicAddress")
	private Set<CfOrgUnit_EAddr> cforgunit_eaddr_electronicAddressSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_eaddr_electronicAddress")
	private Set<CfPers_EAddr> cfpers_eaddr_electronicAddressSet;
	
	public CfEAddr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_electronic_address_identifier() {
		return this.a_electronic_address_identifier;
	}
	
	public void setA_electronic_address_identifier(java.lang.String a_electronic_address_identifier) {
		this.a_electronic_address_identifier = a_electronic_address_identifier;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public CfPAddr getCfeaddr_postAddress() {
		return this.cfeaddr_postAddress;
	}
	
	public void setCfeaddr_postAddress(CfPAddr cfeaddr_postAddress) {
		this.cfeaddr_postAddress = cfeaddr_postAddress;
	}
	
	public Set<CfEAddr_Class> getCfeaddr_class_electronicAddressSet() {
		return this.cfeaddr_class_electronicAddressSet;
	}
	
	public void setCfeaddr_class_electronicAddressSet(Set<CfEAddr_Class> cfeaddr_class_electronicAddressSet) {
		this.cfeaddr_class_electronicAddressSet = cfeaddr_class_electronicAddressSet;
	}
	
	public Set<CfOrgUnit_EAddr> getCforgunit_eaddr_electronicAddressSet() {
		return this.cforgunit_eaddr_electronicAddressSet;
	}
	
	public void setCforgunit_eaddr_electronicAddressSet(Set<CfOrgUnit_EAddr> cforgunit_eaddr_electronicAddressSet) {
		this.cforgunit_eaddr_electronicAddressSet = cforgunit_eaddr_electronicAddressSet;
	}
	
	public Set<CfPers_EAddr> getCfpers_eaddr_electronicAddressSet() {
		return this.cfpers_eaddr_electronicAddressSet;
	}
	
	public void setCfpers_eaddr_electronicAddressSet(Set<CfPers_EAddr> cfpers_eaddr_electronicAddressSet) {
		this.cfpers_eaddr_electronicAddressSet = cfpers_eaddr_electronicAddressSet;
	}
	
}