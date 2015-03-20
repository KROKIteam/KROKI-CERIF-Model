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
@Table(name = "CM_EQUIPMENT_POST_ADDRESS")
public class CfEquip_PAddr implements java.io.Serializable {

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
	@JoinColumn(name="cfequip_paddr_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfequip_paddr_classification;
	@ManyToOne
	@JoinColumn(name="cfequip_paddr_postAddress", referencedColumnName="ID",  nullable = true)
	private CfPAddr cfequip_paddr_postAddress;
	@ManyToOne
	@JoinColumn(name="cfequip_paddr_equipment", referencedColumnName="ID",  nullable = true)
	private CfEquip cfequip_paddr_equipment;
	
	public CfEquip_PAddr(){
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
	
	public CfClass getCfequip_paddr_classification() {
		return this.cfequip_paddr_classification;
	}
	
	public void setCfequip_paddr_classification(CfClass cfequip_paddr_classification) {
		this.cfequip_paddr_classification = cfequip_paddr_classification;
	}
	
	public CfPAddr getCfequip_paddr_postAddress() {
		return this.cfequip_paddr_postAddress;
	}
	
	public void setCfequip_paddr_postAddress(CfPAddr cfequip_paddr_postAddress) {
		this.cfequip_paddr_postAddress = cfequip_paddr_postAddress;
	}
	
	public CfEquip getCfequip_paddr_equipment() {
		return this.cfequip_paddr_equipment;
	}
	
	public void setCfequip_paddr_equipment(CfEquip cfequip_paddr_equipment) {
		this.cfequip_paddr_equipment = cfequip_paddr_equipment;
	}
	
}