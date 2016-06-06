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
@Table(name = "C1_GEOGRAPHIC_BOUNDING_BOX__GEOGRAPHIC_BOUNDING_BOX")
public class CfGeoBBox_GeoBBox implements java.io.Serializable {

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
	@JoinColumn(name="cfgeobbox_geobbox_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfgeobbox_geobbox_classification;
	@ManyToOne
	@JoinColumn(name="cfgeobbox_geobbox_geographicBoundingBox1", referencedColumnName="ID",  nullable = true)
	protected CfGeoBBox cfgeobbox_geobbox_geographicBoundingBox1;
	@ManyToOne
	@JoinColumn(name="cfgeobbox_geobbox_geographicBoundingBox2", referencedColumnName="ID",  nullable = true)
	protected CfGeoBBox cfgeobbox_geobbox_geographicBoundingBox2;
	
	public CfGeoBBox_GeoBBox(){
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