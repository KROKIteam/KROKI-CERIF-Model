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
@Table(name = "C1_PROJECT_RESULT_PUBLICATION")
public class CfProj_ResPubl implements java.io.Serializable {

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
	@Column(name = "cfCopyright", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_copyright;
	@ManyToOne
	@JoinColumn(name="cfproj_respubl_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfproj_respubl_classification;
	@ManyToOne
	@JoinColumn(name="cfproj_respubl_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cfproj_respubl_resultPublication;
	@ManyToOne
	@JoinColumn(name="cfproj_respubl_project", referencedColumnName="ID",  nullable = true)
	protected CfProj cfproj_respubl_project;
	
	public CfProj_ResPubl(){
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
	
	public java.lang.String getKa_copyright() {
		return this.ka_copyright;
	}
	
	public void setKa_copyright(java.lang.String ka_copyright) {
		this.ka_copyright = ka_copyright;
	}
	
	public CfClass getCfproj_respubl_classification() {
		return this.cfproj_respubl_classification;
	}
	
	public void setCfproj_respubl_classification(CfClass cfproj_respubl_classification) {
		this.cfproj_respubl_classification = cfproj_respubl_classification;
	}
	
	public CfResPubl getCfproj_respubl_resultPublication() {
		return this.cfproj_respubl_resultPublication;
	}
	
	public void setCfproj_respubl_resultPublication(CfResPubl cfproj_respubl_resultPublication) {
		this.cfproj_respubl_resultPublication = cfproj_respubl_resultPublication;
	}
	
	public CfProj getCfproj_respubl_project() {
		return this.cfproj_respubl_project;
	}
	
	public void setCfproj_respubl_project(CfProj cfproj_respubl_project) {
		this.cfproj_respubl_project = cfproj_respubl_project;
	}
	
}