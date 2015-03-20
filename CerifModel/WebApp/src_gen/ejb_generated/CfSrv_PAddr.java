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
@Table(name = "CM_SERVICE_POST_ADDRESS")
public class CfSrv_PAddr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false )
	private java.util.Date a_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false )
	private java.util.Date a_end_date;
	@Column(name = "cfFraction", unique = false, nullable = false )
	private java.math.BigDecimal a_fraction;
	@ManyToOne
	@JoinColumn(name="cfsrv_paddr_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfsrv_paddr_classification;
	@ManyToOne
	@JoinColumn(name="cfsrv_paddr_postAddress", referencedColumnName="ID",  nullable = true)
	private CfPAddr cfsrv_paddr_postAddress;
	@ManyToOne
	@JoinColumn(name="cfsrv_paddr_service", referencedColumnName="ID",  nullable = true)
	private CfSrv cfsrv_paddr_service;
	
	public CfSrv_PAddr(){
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
	
	public CfClass getCfsrv_paddr_classification() {
		return this.cfsrv_paddr_classification;
	}
	
	public void setCfsrv_paddr_classification(CfClass cfsrv_paddr_classification) {
		this.cfsrv_paddr_classification = cfsrv_paddr_classification;
	}
	
	public CfPAddr getCfsrv_paddr_postAddress() {
		return this.cfsrv_paddr_postAddress;
	}
	
	public void setCfsrv_paddr_postAddress(CfPAddr cfsrv_paddr_postAddress) {
		this.cfsrv_paddr_postAddress = cfsrv_paddr_postAddress;
	}
	
	public CfSrv getCfsrv_paddr_service() {
		return this.cfsrv_paddr_service;
	}
	
	public void setCfsrv_paddr_service(CfSrv cfsrv_paddr_service) {
		this.cfsrv_paddr_service = cfsrv_paddr_service;
	}
	
}