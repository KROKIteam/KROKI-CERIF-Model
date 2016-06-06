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
@Table(name = "C1_RESULT_PUBLICATION_EQUIPMENT")
public class CfResPubl_Equip implements java.io.Serializable {

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
	@JoinColumn(name="cfrespubl_equip_equipment", referencedColumnName="ID",  nullable = true)
	protected CfEquip cfrespubl_equip_equipment;
	@ManyToOne
	@JoinColumn(name="cfrespubl_equip_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfrespubl_equip_classification;
	@ManyToOne
	@JoinColumn(name="cfrespubl_equip_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cfrespubl_equip_resultPublication;
	
	public CfResPubl_Equip(){
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
	
	public CfEquip getCfrespubl_equip_equipment() {
		return this.cfrespubl_equip_equipment;
	}
	
	public void setCfrespubl_equip_equipment(CfEquip cfrespubl_equip_equipment) {
		this.cfrespubl_equip_equipment = cfrespubl_equip_equipment;
	}
	
	public CfClass getCfrespubl_equip_classification() {
		return this.cfrespubl_equip_classification;
	}
	
	public void setCfrespubl_equip_classification(CfClass cfrespubl_equip_classification) {
		this.cfrespubl_equip_classification = cfrespubl_equip_classification;
	}
	
	public CfResPubl getCfrespubl_equip_resultPublication() {
		return this.cfrespubl_equip_resultPublication;
	}
	
	public void setCfrespubl_equip_resultPublication(CfResPubl cfrespubl_equip_resultPublication) {
		this.cfrespubl_equip_resultPublication = cfrespubl_equip_resultPublication;
	}
	
}