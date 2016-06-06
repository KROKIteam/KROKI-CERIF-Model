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
@Table(name = "C1_MEDIUM__MEDIUM")
public class CfMedium_Medium implements java.io.Serializable {

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
	@JoinColumn(name="cfmedium_medium_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfmedium_medium_classification;
	@ManyToOne
	@JoinColumn(name="cfmedium_medium_medium1", referencedColumnName="ID",  nullable = true)
	protected CfMedium cfmedium_medium_medium1;
	@ManyToOne
	@JoinColumn(name="cfmedium_medium_medium2", referencedColumnName="ID",  nullable = true)
	protected CfMedium cfmedium_medium_medium2;
	
	public CfMedium_Medium(){
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
	
	public CfClass getCfmedium_medium_classification() {
		return this.cfmedium_medium_classification;
	}
	
	public void setCfmedium_medium_classification(CfClass cfmedium_medium_classification) {
		this.cfmedium_medium_classification = cfmedium_medium_classification;
	}
	
	public CfMedium getCfmedium_medium_medium1() {
		return this.cfmedium_medium_medium1;
	}
	
	public void setCfmedium_medium_medium1(CfMedium cfmedium_medium_medium1) {
		this.cfmedium_medium_medium1 = cfmedium_medium_medium1;
	}
	
	public CfMedium getCfmedium_medium_medium2() {
		return this.cfmedium_medium_medium2;
	}
	
	public void setCfmedium_medium_medium2(CfMedium cfmedium_medium_medium2) {
		this.cfmedium_medium_medium2 = cfmedium_medium_medium2;
	}
	
}