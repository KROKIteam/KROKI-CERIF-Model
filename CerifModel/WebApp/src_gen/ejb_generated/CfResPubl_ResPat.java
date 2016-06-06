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
@Table(name = "C1_RESULT_PUBLICATION__RESULT_PATENT")
public class CfResPubl_ResPat implements java.io.Serializable {

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
	@JoinColumn(name="cfrespubl_respat_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfrespubl_respat_classification;
	@ManyToOne
	@JoinColumn(name="cfrespubl_respat_resultPatent", referencedColumnName="ID",  nullable = true)
	protected CfResPat cfrespubl_respat_resultPatent;
	@ManyToOne
	@JoinColumn(name="cfrespubl_respat_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cfrespubl_respat_resultPublication;
	
	public CfResPubl_ResPat(){
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