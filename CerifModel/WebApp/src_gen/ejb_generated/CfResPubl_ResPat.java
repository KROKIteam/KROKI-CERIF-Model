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
@Table(name = "C1_RESULT_PUBLICATION__RESULT_PATENT")
public class CfResPubl_ResPat implements java.io.Serializable {

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
	@JoinColumn(name="cfrespubl_respat_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfrespubl_respat_classification;
	@ManyToOne
	@JoinColumn(name="cfrespubl_respat_resultPatent", referencedColumnName="ID",  nullable = true)
	private CfResPat cfrespubl_respat_resultPatent;
	@ManyToOne
	@JoinColumn(name="cfrespubl_respat_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespubl_respat_resultPublication;
	
	public CfResPubl_ResPat(){
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
	
	public CfClass getCfrespubl_respat_classification() {
		return this.cfrespubl_respat_classification;
	}
	
	public void setCfrespubl_respat_classification(CfClass cfrespubl_respat_classification) {
		this.cfrespubl_respat_classification = cfrespubl_respat_classification;
	}
	
	public CfResPat getCfrespubl_respat_resultPatent() {
		return this.cfrespubl_respat_resultPatent;
	}
	
	public void setCfrespubl_respat_resultPatent(CfResPat cfrespubl_respat_resultPatent) {
		this.cfrespubl_respat_resultPatent = cfrespubl_respat_resultPatent;
	}
	
	public CfResPubl getCfrespubl_respat_resultPublication() {
		return this.cfrespubl_respat_resultPublication;
	}
	
	public void setCfrespubl_respat_resultPublication(CfResPubl cfrespubl_respat_resultPublication) {
		this.cfrespubl_respat_resultPublication = cfrespubl_respat_resultPublication;
	}
	
}