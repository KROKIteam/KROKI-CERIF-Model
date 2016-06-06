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
@Table(name = "C1_RESULT_PUBLICATION_CITATION")
public class CfResPubl_Cite implements java.io.Serializable {

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
	@Column(name = "cfYear", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.Integer ka_year;
	@Column(name = "cfCount", unique = false, nullable = false ,columnDefinition = "FLOAT")
	protected java.math.BigDecimal ka_count;
	@ManyToOne
	@JoinColumn(name="cfrespubl_cite_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfrespubl_cite_classification;
	@ManyToOne
	@JoinColumn(name="cfrespubl_cite_citation", referencedColumnName="ID",  nullable = true)
	protected CfCite cfrespubl_cite_citation;
	@ManyToOne
	@JoinColumn(name="cfrespubl_cite_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cfrespubl_cite_resultPublication;
	
	public CfResPubl_Cite(){
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
	
	public java.lang.Integer getKa_year() {
		return this.ka_year;
	}
	
	public void setKa_year(java.lang.Integer ka_year) {
		this.ka_year = ka_year;
	}
	
	public java.math.BigDecimal getKa_count() {
		return this.ka_count;
	}
	
	public void setKa_count(java.math.BigDecimal ka_count) {
		this.ka_count = ka_count;
	}
	
	public CfClass getCfrespubl_cite_classification() {
		return this.cfrespubl_cite_classification;
	}
	
	public void setCfrespubl_cite_classification(CfClass cfrespubl_cite_classification) {
		this.cfrespubl_cite_classification = cfrespubl_cite_classification;
	}
	
	public CfCite getCfrespubl_cite_citation() {
		return this.cfrespubl_cite_citation;
	}
	
	public void setCfrespubl_cite_citation(CfCite cfrespubl_cite_citation) {
		this.cfrespubl_cite_citation = cfrespubl_cite_citation;
	}
	
	public CfResPubl getCfrespubl_cite_resultPublication() {
		return this.cfrespubl_cite_resultPublication;
	}
	
	public void setCfrespubl_cite_resultPublication(CfResPubl cfrespubl_cite_resultPublication) {
		this.cfrespubl_cite_resultPublication = cfrespubl_cite_resultPublication;
	}
	
}