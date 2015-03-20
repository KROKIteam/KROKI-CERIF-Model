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
@Table(name = "CM_POST_ADDRESS_GEOGRAPHIC_BOUNDING_BOX")
public class CfPAddr_GeoBBox implements java.io.Serializable {

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
	@JoinColumn(name="cfpaddr_geobbox_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpaddr_geobbox_classification;
	@ManyToOne
	@JoinColumn(name="cfpaddr_geobbox_geographicBoundingBox", referencedColumnName="ID",  nullable = true)
	private CfGeoBBox cfpaddr_geobbox_geographicBoundingBox;
	@ManyToOne
	@JoinColumn(name="cfpaddr_geobbox_postAddress", referencedColumnName="ID",  nullable = true)
	private CfPAddr cfpaddr_geobbox_postAddress;
	
	public CfPAddr_GeoBBox(){
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
	
	public CfClass getCfpaddr_geobbox_classification() {
		return this.cfpaddr_geobbox_classification;
	}
	
	public void setCfpaddr_geobbox_classification(CfClass cfpaddr_geobbox_classification) {
		this.cfpaddr_geobbox_classification = cfpaddr_geobbox_classification;
	}
	
	public CfGeoBBox getCfpaddr_geobbox_geographicBoundingBox() {
		return this.cfpaddr_geobbox_geographicBoundingBox;
	}
	
	public void setCfpaddr_geobbox_geographicBoundingBox(CfGeoBBox cfpaddr_geobbox_geographicBoundingBox) {
		this.cfpaddr_geobbox_geographicBoundingBox = cfpaddr_geobbox_geographicBoundingBox;
	}
	
	public CfPAddr getCfpaddr_geobbox_postAddress() {
		return this.cfpaddr_geobbox_postAddress;
	}
	
	public void setCfpaddr_geobbox_postAddress(CfPAddr cfpaddr_geobbox_postAddress) {
		this.cfpaddr_geobbox_postAddress = cfpaddr_geobbox_postAddress;
	}
	
}