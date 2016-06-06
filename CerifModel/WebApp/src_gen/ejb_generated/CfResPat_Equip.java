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
@Table(name = "C1_RESULT_PATENT_EQUIPMENT")
public class CfResPat_Equip implements java.io.Serializable {

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
	@JoinColumn(name="cfrespat_equip_equipment", referencedColumnName="ID",  nullable = true)
	protected CfEquip cfrespat_equip_equipment;
	@ManyToOne
	@JoinColumn(name="cfrespat_equip_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfrespat_equip_classification;
	@ManyToOne
	@JoinColumn(name="cfrespat_equip_resultPatent", referencedColumnName="ID",  nullable = true)
	protected CfResPat cfrespat_equip_resultPatent;
	
	public CfResPat_Equip(){
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
	
	public CfEquip getCfrespat_equip_equipment() {
		return this.cfrespat_equip_equipment;
	}
	
	public void setCfrespat_equip_equipment(CfEquip cfrespat_equip_equipment) {
		this.cfrespat_equip_equipment = cfrespat_equip_equipment;
	}
	
	public CfClass getCfrespat_equip_classification() {
		return this.cfrespat_equip_classification;
	}
	
	public void setCfrespat_equip_classification(CfClass cfrespat_equip_classification) {
		this.cfrespat_equip_classification = cfrespat_equip_classification;
	}
	
	public CfResPat getCfrespat_equip_resultPatent() {
		return this.cfrespat_equip_resultPatent;
	}
	
	public void setCfrespat_equip_resultPatent(CfResPat cfrespat_equip_resultPatent) {
		this.cfrespat_equip_resultPatent = cfrespat_equip_resultPatent;
	}
	
}