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
@Table(name = "CM_GEOGRAPHIC_BOUNDING_BOX")
public class CfGeoBBox implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfGeoBBoxId", unique = false, nullable = false )
	private java.lang.String a_geographic_bounding_box_identifier;
	@Column(name = "cfWBLong", unique = false, nullable = false )
	private java.math.BigDecimal a_west_bound_longitude;
	@Column(name = "cfEBLong", unique = false, nullable = false )
	private java.math.BigDecimal a_east_bound_longitude;
	@Column(name = "cfSBLat", unique = false, nullable = false )
	private java.math.BigDecimal a_south_bound_latitude;
	@Column(name = "cfNBLat", unique = false, nullable = false )
	private java.math.BigDecimal a_north_bound_latitude;
	@Column(name = "cfMinElev", unique = false, nullable = false )
	private java.math.BigDecimal a_minimum_elevation;
	@Column(name = "cfMaxElev", unique = false, nullable = false )
	private java.math.BigDecimal a_maximum_elevation;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobbox_geobbox_geographicBoundingBox1")
	private Set<CfGeoBBox_GeoBBox> cfgeobbox_geobbox_geographicBoundingBox1Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobbox_geobbox_geographicBoundingBox2")
	private Set<CfGeoBBox_GeoBBox> cfgeobbox_geobbox_geographicBoundingBox2Set;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobbox_class_geographicBoundingBox")
	private Set<CfGeoBBox_Class> cfgeobbox_class_geographicBoundingBoxSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobboxdescr_geographicBoundingBox")
	private Set<CfGeoBBoxDescr> cfgeobboxdescr_geographicBoundingBoxSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobboxkeyw_geographicBoundingBox")
	private Set<CfGeoBBoxKeyw> cfgeobboxkeyw_geographicBoundingBoxSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfgeobboxname_geographicBoundingBox")
	private Set<CfGeoBBoxName> cfgeobboxname_geographicBoundingBoxSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpaddr_geobbox_geographicBoundingBox")
	private Set<CfPAddr_GeoBBox> cfpaddr_geobbox_geographicBoundingBoxSet;
	
	public CfGeoBBox(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_geographic_bounding_box_identifier() {
		return this.a_geographic_bounding_box_identifier;
	}
	
	public void setA_geographic_bounding_box_identifier(java.lang.String a_geographic_bounding_box_identifier) {
		this.a_geographic_bounding_box_identifier = a_geographic_bounding_box_identifier;
	}
	
	public java.math.BigDecimal getA_west_bound_longitude() {
		return this.a_west_bound_longitude;
	}
	
	public void setA_west_bound_longitude(java.math.BigDecimal a_west_bound_longitude) {
		this.a_west_bound_longitude = a_west_bound_longitude;
	}
	
	public java.math.BigDecimal getA_east_bound_longitude() {
		return this.a_east_bound_longitude;
	}
	
	public void setA_east_bound_longitude(java.math.BigDecimal a_east_bound_longitude) {
		this.a_east_bound_longitude = a_east_bound_longitude;
	}
	
	public java.math.BigDecimal getA_south_bound_latitude() {
		return this.a_south_bound_latitude;
	}
	
	public void setA_south_bound_latitude(java.math.BigDecimal a_south_bound_latitude) {
		this.a_south_bound_latitude = a_south_bound_latitude;
	}
	
	public java.math.BigDecimal getA_north_bound_latitude() {
		return this.a_north_bound_latitude;
	}
	
	public void setA_north_bound_latitude(java.math.BigDecimal a_north_bound_latitude) {
		this.a_north_bound_latitude = a_north_bound_latitude;
	}
	
	public java.math.BigDecimal getA_minimum_elevation() {
		return this.a_minimum_elevation;
	}
	
	public void setA_minimum_elevation(java.math.BigDecimal a_minimum_elevation) {
		this.a_minimum_elevation = a_minimum_elevation;
	}
	
	public java.math.BigDecimal getA_maximum_elevation() {
		return this.a_maximum_elevation;
	}
	
	public void setA_maximum_elevation(java.math.BigDecimal a_maximum_elevation) {
		this.a_maximum_elevation = a_maximum_elevation;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfGeoBBox_GeoBBox> getCfgeobbox_geobbox_geographicBoundingBox1Set() {
		return this.cfgeobbox_geobbox_geographicBoundingBox1Set;
	}
	
	public void setCfgeobbox_geobbox_geographicBoundingBox1Set(Set<CfGeoBBox_GeoBBox> cfgeobbox_geobbox_geographicBoundingBox1Set) {
		this.cfgeobbox_geobbox_geographicBoundingBox1Set = cfgeobbox_geobbox_geographicBoundingBox1Set;
	}
	
	public Set<CfGeoBBox_GeoBBox> getCfgeobbox_geobbox_geographicBoundingBox2Set() {
		return this.cfgeobbox_geobbox_geographicBoundingBox2Set;
	}
	
	public void setCfgeobbox_geobbox_geographicBoundingBox2Set(Set<CfGeoBBox_GeoBBox> cfgeobbox_geobbox_geographicBoundingBox2Set) {
		this.cfgeobbox_geobbox_geographicBoundingBox2Set = cfgeobbox_geobbox_geographicBoundingBox2Set;
	}
	
	public Set<CfGeoBBox_Class> getCfgeobbox_class_geographicBoundingBoxSet() {
		return this.cfgeobbox_class_geographicBoundingBoxSet;
	}
	
	public void setCfgeobbox_class_geographicBoundingBoxSet(Set<CfGeoBBox_Class> cfgeobbox_class_geographicBoundingBoxSet) {
		this.cfgeobbox_class_geographicBoundingBoxSet = cfgeobbox_class_geographicBoundingBoxSet;
	}
	
	public Set<CfGeoBBoxDescr> getCfgeobboxdescr_geographicBoundingBoxSet() {
		return this.cfgeobboxdescr_geographicBoundingBoxSet;
	}
	
	public void setCfgeobboxdescr_geographicBoundingBoxSet(Set<CfGeoBBoxDescr> cfgeobboxdescr_geographicBoundingBoxSet) {
		this.cfgeobboxdescr_geographicBoundingBoxSet = cfgeobboxdescr_geographicBoundingBoxSet;
	}
	
	public Set<CfGeoBBoxKeyw> getCfgeobboxkeyw_geographicBoundingBoxSet() {
		return this.cfgeobboxkeyw_geographicBoundingBoxSet;
	}
	
	public void setCfgeobboxkeyw_geographicBoundingBoxSet(Set<CfGeoBBoxKeyw> cfgeobboxkeyw_geographicBoundingBoxSet) {
		this.cfgeobboxkeyw_geographicBoundingBoxSet = cfgeobboxkeyw_geographicBoundingBoxSet;
	}
	
	public Set<CfGeoBBoxName> getCfgeobboxname_geographicBoundingBoxSet() {
		return this.cfgeobboxname_geographicBoundingBoxSet;
	}
	
	public void setCfgeobboxname_geographicBoundingBoxSet(Set<CfGeoBBoxName> cfgeobboxname_geographicBoundingBoxSet) {
		this.cfgeobboxname_geographicBoundingBoxSet = cfgeobboxname_geographicBoundingBoxSet;
	}
	
	public Set<CfPAddr_GeoBBox> getCfpaddr_geobbox_geographicBoundingBoxSet() {
		return this.cfpaddr_geobbox_geographicBoundingBoxSet;
	}
	
	public void setCfpaddr_geobbox_geographicBoundingBoxSet(Set<CfPAddr_GeoBBox> cfpaddr_geobbox_geographicBoundingBoxSet) {
		this.cfpaddr_geobbox_geographicBoundingBoxSet = cfpaddr_geobbox_geographicBoundingBoxSet;
	}
	
}