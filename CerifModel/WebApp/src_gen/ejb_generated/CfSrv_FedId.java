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
@Table(name = "C1_SERVICE_FEDERATED_IDENTIFIER")
public class CfSrv_FedId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	private java.util.Date a_end_date;
	@Column(name = "cfFraction", unique = false, nullable = false ,columnDefinition = "FLOAT")
	private java.math.BigDecimal a_fraction;
	@ManyToOne
	@JoinColumn(name="cfsrv_fedid_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfsrv_fedid_classification;
	@ManyToOne
	@JoinColumn(name="cfsrv_fedid_federatedIdentifier", referencedColumnName="ID",  nullable = true)
	private CfFedId cfsrv_fedid_federatedIdentifier;
	@ManyToOne
	@JoinColumn(name="cfsrv_fedid_service", referencedColumnName="ID",  nullable = true)
	private CfSrv cfsrv_fedid_service;
	
	public CfSrv_FedId(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public java.math.BigDecimal getA_fraction() {
		return this.a_fraction;
	}
	
	public void setA_fraction(java.math.BigDecimal a_fraction) {
		this.a_fraction = a_fraction;
	}
	
	public CfClass getCfsrv_fedid_classification() {
		return this.cfsrv_fedid_classification;
	}
	
	public void setCfsrv_fedid_classification(CfClass cfsrv_fedid_classification) {
		this.cfsrv_fedid_classification = cfsrv_fedid_classification;
	}
	
	public CfFedId getCfsrv_fedid_federatedIdentifier() {
		return this.cfsrv_fedid_federatedIdentifier;
	}
	
	public void setCfsrv_fedid_federatedIdentifier(CfFedId cfsrv_fedid_federatedIdentifier) {
		this.cfsrv_fedid_federatedIdentifier = cfsrv_fedid_federatedIdentifier;
	}
	
	public CfSrv getCfsrv_fedid_service() {
		return this.cfsrv_fedid_service;
	}
	
	public void setCfsrv_fedid_service(CfSrv cfsrv_fedid_service) {
		this.cfsrv_fedid_service = cfsrv_fedid_service;
	}
	
}