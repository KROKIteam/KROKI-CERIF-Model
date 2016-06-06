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
@Table(name = "C1_FEDERATED_IDENTIFIER")
public class CfFedId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfFedIdId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_federated_identifier_identifier;
	@Column(name = "cfInstId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_instance_identifier;
	@Column(name = "cfFedId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_federate_identifier;
	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_end_date;
	@ManyToOne
	@JoinColumn(name="cffedid_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cffedid_classification;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffedid_class_federatedIdentifier")
	protected Set<CfFedId_Class> cffedid_class_federatedIdentifierSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfsrv_fedid_federatedIdentifier")
	protected Set<CfSrv_FedId> cfsrv_fedid_federatedIdentifierSet;
	
	public CfFedId(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_federated_identifier_identifier() {
		return this.ka_federated_identifier_identifier;
	}
	
	public void setKa_federated_identifier_identifier(java.lang.String ka_federated_identifier_identifier) {
		this.ka_federated_identifier_identifier = ka_federated_identifier_identifier;
	}
	
	public java.lang.String getKa_instance_identifier() {
		return this.ka_instance_identifier;
	}
	
	public void setKa_instance_identifier(java.lang.String ka_instance_identifier) {
		this.ka_instance_identifier = ka_instance_identifier;
	}
	
	public java.lang.String getKa_federate_identifier() {
		return this.ka_federate_identifier;
	}
	
	public void setKa_federate_identifier(java.lang.String ka_federate_identifier) {
		this.ka_federate_identifier = ka_federate_identifier;
	}
	
	public java.util.Date getKa_start_date() {
		return this.ka_start_date;
	}
	
	public void setKa_start_date(java.util.Date ka_start_date) {
		this.ka_start_date = ka_start_date;
	}
	
	public java.util.Date getKa_end_date() {
		return this.ka_end_date;
	}
	
	public void setKa_end_date(java.util.Date ka_end_date) {
		this.ka_end_date = ka_end_date;
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