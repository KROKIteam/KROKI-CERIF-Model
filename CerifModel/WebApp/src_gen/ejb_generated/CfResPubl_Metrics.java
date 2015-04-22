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
@Table(name = "C1_RESULT_PUBLICATION_METRICS")
public class CfResPubl_Metrics implements java.io.Serializable {

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
	@Column(name = "cfYear", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_year;
	@Column(name = "cfCount", unique = false, nullable = false ,columnDefinition = "FLOAT")
	private java.math.BigDecimal a_count;
	@ManyToOne
	@JoinColumn(name="cfrespubl_metrics_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfrespubl_metrics_classification;
	@ManyToOne
	@JoinColumn(name="cfrespubl_metrics_metrics", referencedColumnName="ID",  nullable = true)
	private CfMetrics cfrespubl_metrics_metrics;
	@ManyToOne
	@JoinColumn(name="cfrespubl_metrics_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfrespubl_metrics_resultPublication;
	
	public CfResPubl_Metrics(){
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
	
	public java.lang.String getA_year() {
		return this.a_year;
	}
	
	public void setA_year(java.lang.String a_year) {
		this.a_year = a_year;
	}
	
	public java.math.BigDecimal getA_count() {
		return this.a_count;
	}
	
	public void setA_count(java.math.BigDecimal a_count) {
		this.a_count = a_count;
	}
	
	public CfClass getCfrespubl_metrics_classification() {
		return this.cfrespubl_metrics_classification;
	}
	
	public void setCfrespubl_metrics_classification(CfClass cfrespubl_metrics_classification) {
		this.cfrespubl_metrics_classification = cfrespubl_metrics_classification;
	}
	
	public CfMetrics getCfrespubl_metrics_metrics() {
		return this.cfrespubl_metrics_metrics;
	}
	
	public void setCfrespubl_metrics_metrics(CfMetrics cfrespubl_metrics_metrics) {
		this.cfrespubl_metrics_metrics = cfrespubl_metrics_metrics;
	}
	
	public CfResPubl getCfrespubl_metrics_resultPublication() {
		return this.cfrespubl_metrics_resultPublication;
	}
	
	public void setCfrespubl_metrics_resultPublication(CfResPubl cfrespubl_metrics_resultPublication) {
		this.cfrespubl_metrics_resultPublication = cfrespubl_metrics_resultPublication;
	}
	
}