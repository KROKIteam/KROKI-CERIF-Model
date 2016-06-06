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
@Table(name = "C1_METRICS")
public class CfMetrics implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfMetricsId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_metrics_identifier;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetrics_class_metrics")
	protected Set<CfMetrics_Class> cfmetrics_class_metricsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetricsdescr_metrics")
	protected Set<CfMetricsDescr> cfmetricsdescr_metricsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetricskeyw_metrics")
	protected Set<CfMetricsKeyw> cfmetricskeyw_metricsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfmetricsname_metrics")
	protected Set<CfMetricsName> cfmetricsname_metricsSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfrespubl_metrics_metrics")
	protected Set<CfResPubl_Metrics> cfrespubl_metrics_metricsSet;
	
	public CfMetrics(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_metrics_identifier() {
		return this.ka_metrics_identifier;
	}
	
	public void setKa_metrics_identifier(java.lang.String ka_metrics_identifier) {
		this.ka_metrics_identifier = ka_metrics_identifier;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public Set<CfMetrics_Class> getCfmetrics_class_metricsSet() {
		return this.cfmetrics_class_metricsSet;
	}
	
	public void setCfmetrics_class_metricsSet(Set<CfMetrics_Class> cfmetrics_class_metricsSet) {
		this.cfmetrics_class_metricsSet = cfmetrics_class_metricsSet;
	}
	
	public Set<CfMetricsDescr> getCfmetricsdescr_metricsSet() {
		return this.cfmetricsdescr_metricsSet;
	}
	
	public void setCfmetricsdescr_metricsSet(Set<CfMetricsDescr> cfmetricsdescr_metricsSet) {
		this.cfmetricsdescr_metricsSet = cfmetricsdescr_metricsSet;
	}
	
	public Set<CfMetricsKeyw> getCfmetricskeyw_metricsSet() {
		return this.cfmetricskeyw_metricsSet;
	}
	
	public void setCfmetricskeyw_metricsSet(Set<CfMetricsKeyw> cfmetricskeyw_metricsSet) {
		this.cfmetricskeyw_metricsSet = cfmetricskeyw_metricsSet;
	}
	
	public Set<CfMetricsName> getCfmetricsname_metricsSet() {
		return this.cfmetricsname_metricsSet;
	}
	
	public void setCfmetricsname_metricsSet(Set<CfMetricsName> cfmetricsname_metricsSet) {
		this.cfmetricsname_metricsSet = cfmetricsname_metricsSet;
	}
	
	public Set<CfResPubl_Metrics> getCfrespubl_metrics_metricsSet() {
		return this.cfrespubl_metrics_metricsSet;
	}
	
	public void setCfrespubl_metrics_metricsSet(Set<CfResPubl_Metrics> cfrespubl_metrics_metricsSet) {
		this.cfrespubl_metrics_metricsSet = cfrespubl_metrics_metricsSet;
	}
	
}