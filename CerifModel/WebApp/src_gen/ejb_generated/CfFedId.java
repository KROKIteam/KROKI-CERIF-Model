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
@Table(name = "CM_FEDERATED_IDENTIFIER")
public class CfFedId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfFedIdId", unique = false, nullable = false )
	private java.lang.String a_federated_identifier_identifier;
	@Column(name = "cfInstId", unique = false, nullable = false )
	private java.lang.String a_instance_identifier;
	@Column(name = "cfFedId", unique = false, nullable = false )
	private java.lang.String a_federate_identifier;
	@Column(name = "cfStartDate", unique = false, nullable = false )
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false )
	private java.util.Date a_end_date;
	@ManyToOne
	@JoinColumn(name="cffedid_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cffedid_classification;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffedid_class_federatedIdentifier")
	private Set<CfFedId_Class> cffedid_class_federatedIdentifierSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fedid_federatedIdentifier")
	private Set<CfSrv_FedId> cfsrv_fedid_federatedIdentifierSet;
	
	public CfFedId(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_federated_identifier_identifier() {
		return this.a_federated_identifier_identifier;
	}
	
	public void setA_federated_identifier_identifier(java.lang.String a_federated_identifier_identifier) {
		this.a_federated_identifier_identifier = a_federated_identifier_identifier;
	}
	
	public java.lang.String getA_instance_identifier() {
		return this.a_instance_identifier;
	}
	
	public void setA_instance_identifier(java.lang.String a_instance_identifier) {
		this.a_instance_identifier = a_instance_identifier;
	}
	
	public java.lang.String getA_federate_identifier() {
		return this.a_federate_identifier;
	}
	
	public void setA_federate_identifier(java.lang.String a_federate_identifier) {
		this.a_federate_identifier = a_federate_identifier;
	}
	
	public java.util.Date getA_start_date() {
		return this.a_start_date;
	}
	
	public void setA_start_date(java.util.Date a_start_date) {
		this.a_start_date = a_start_date;
	}
	
	public java.util.Date getA_end_date() {
		return this.a_end_date;
	}
	
	public void setA_end_date(java.util.Date a_end_date) {
		this.a_end_date = a_end_date;
	}
	
	public CfClass getCffedid_classification() {
		return this.cffedid_classification;
	}
	
	public void setCffedid_classification(CfClass cffedid_classification) {
		this.cffedid_classification = cffedid_classification;
	}
	
	public Set<CfFedId_Class> getCffedid_class_federatedIdentifierSet() {
		return this.cffedid_class_federatedIdentifierSet;
	}
	
	public void setCffedid_class_federatedIdentifierSet(Set<CfFedId_Class> cffedid_class_federatedIdentifierSet) {
		this.cffedid_class_federatedIdentifierSet = cffedid_class_federatedIdentifierSet;
	}
	
	public Set<CfSrv_FedId> getCfsrv_fedid_federatedIdentifierSet() {
		return this.cfsrv_fedid_federatedIdentifierSet;
	}
	
	public void setCfsrv_fedid_federatedIdentifierSet(Set<CfSrv_FedId> cfsrv_fedid_federatedIdentifierSet) {
		this.cfsrv_fedid_federatedIdentifierSet = cfsrv_fedid_federatedIdentifierSet;
	}
	
}