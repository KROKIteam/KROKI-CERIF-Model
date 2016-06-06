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
@Table(name = "C1_EQUIPMENT_SERVICE")
public class CfEquip_Srv implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_end_date;
	@Column(name = "cfFraction", unique = false, nullable = false ,columnDefinition = "FLOAT")
	protected java.math.BigDecimal ka_fraction;
	@ManyToOne
	@JoinColumn(name="cfequip_srv_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfequip_srv_classification;
	@ManyToOne
	@JoinColumn(name="cfequip_srv_service", referencedColumnName="ID",  nullable = true)
	protected CfSrv cfequip_srv_service;
	@ManyToOne
	@JoinColumn(name="cfequip_srv_equipment", referencedColumnName="ID",  nullable = true)
	protected CfEquip cfequip_srv_equipment;
	
	public CfEquip_Srv(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public java.math.BigDecimal getKa_fraction() {
		return this.ka_fraction;
	}
	
	public void setKa_fraction(java.math.BigDecimal ka_fraction) {
		this.ka_fraction = ka_fraction;
	}
	
	public CfClass getCfequip_srv_classification() {
		return this.cfequip_srv_classification;
	}
	
	public void setCfequip_srv_classification(CfClass cfequip_srv_classification) {
		this.cfequip_srv_classification = cfequip_srv_classification;
	}
	
	public CfSrv getCfequip_srv_service() {
		return this.cfequip_srv_service;
	}
	
	public void setCfequip_srv_service(CfSrv cfequip_srv_service) {
		this.cfequip_srv_service = cfequip_srv_service;
	}
	
	public CfEquip getCfequip_srv_equipment() {
		return this.cfequip_srv_equipment;
	}
	
	public void setCfequip_srv_equipment(CfEquip cfequip_srv_equipment) {
		this.cfequip_srv_equipment = cfequip_srv_equipment;
	}
	
}