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
@Table(name = "C1_ORGANISATION_UNIT_RESULT_PUBLICATION")
public class CfOrgUnit_ResPubl implements java.io.Serializable {

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
	@JoinColumn(name="cforgunit_respubl_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cforgunit_respubl_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_respubl_resultPublication", referencedColumnName="ID",  nullable = true)
	protected CfResPubl cforgunit_respubl_resultPublication;
	@ManyToOne
	@JoinColumn(name="cforgunit_respubl_organisationUnit", referencedColumnName="ID",  nullable = true)
	protected CfOrgUnit cforgunit_respubl_organisationUnit;
	
	public CfOrgUnit_ResPubl(){
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
	
	public CfClass getCforgunit_respubl_classification() {
		return this.cforgunit_respubl_classification;
	}
	
	public void setCforgunit_respubl_classification(CfClass cforgunit_respubl_classification) {
		this.cforgunit_respubl_classification = cforgunit_respubl_classification;
	}
	
	public CfResPubl getCforgunit_respubl_resultPublication() {
		return this.cforgunit_respubl_resultPublication;
	}
	
	public void setCforgunit_respubl_resultPublication(CfResPubl cforgunit_respubl_resultPublication) {
		this.cforgunit_respubl_resultPublication = cforgunit_respubl_resultPublication;
	}
	
	public CfOrgUnit getCforgunit_respubl_organisationUnit() {
		return this.cforgunit_respubl_organisationUnit;
	}
	
	public void setCforgunit_respubl_organisationUnit(CfOrgUnit cforgunit_respubl_organisationUnit) {
		this.cforgunit_respubl_organisationUnit = cforgunit_respubl_organisationUnit;
	}
	
}