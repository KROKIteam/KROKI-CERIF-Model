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
@Table(name = "C1_GEOGRAPHIC_BOUNDING_BOX__GEOGRAPHIC_BOUNDING_BOX")
public class CfGeoBBox_GeoBBox implements java.io.Serializable {

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
	@JoinColumn(name="cfgeobbox_geobbox_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfgeobbox_geobbox_classification;
	@ManyToOne
	@JoinColumn(name="cfgeobbox_geobbox_geographicBoundingBox1", referencedColumnName="ID",  nullable = true)
	private CfGeoBBox cfgeobbox_geobbox_geographicBoundingBox1;
	@ManyToOne
	@JoinColumn(name="cfgeobbox_geobbox_geographicBoundingBox2", referencedColumnName="ID",  nullable = true)
	private CfGeoBBox cfgeobbox_geobbox_geographicBoundingBox2;
	
	public CfGeoBBox_GeoBBox(){
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
	
	public CfClass getCfgeobbox_geobbox_classification() {
		return this.cfgeobbox_geobbox_classification;
	}
	
	public void setCfgeobbox_geobbox_classification(CfClass cfgeobbox_geobbox_classification) {
		this.cfgeobbox_geobbox_classification = cfgeobbox_geobbox_classification;
	}
	
	public CfGeoBBox getCfgeobbox_geobbox_geographicBoundingBox1() {
		return this.cfgeobbox_geobbox_geographicBoundingBox1;
	}
	
	public void setCfgeobbox_geobbox_geographicBoundingBox1(CfGeoBBox cfgeobbox_geobbox_geographicBoundingBox1) {
		this.cfgeobbox_geobbox_geographicBoundingBox1 = cfgeobbox_geobbox_geographicBoundingBox1;
	}
	
	public CfGeoBBox getCfgeobbox_geobbox_geographicBoundingBox2() {
		return this.cfgeobbox_geobbox_geographicBoundingBox2;
	}
	
	public void setCfgeobbox_geobbox_geographicBoundingBox2(CfGeoBBox cfgeobbox_geobbox_geographicBoundingBox2) {
		this.cfgeobbox_geobbox_geographicBoundingBox2 = cfgeobbox_geobbox_geographicBoundingBox2;
	}
	
}