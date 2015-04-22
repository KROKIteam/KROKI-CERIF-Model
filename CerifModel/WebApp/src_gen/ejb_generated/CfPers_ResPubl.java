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
@Table(name = "C1_PERSON_RESULT_PUBLICATION")
public class CfPers_ResPubl implements java.io.Serializable {

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
	@Column(name = "cfCopyright", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_copyright;
	@ManyToOne
	@JoinColumn(name="cfpers_respubl_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_respubl_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_respubl_resultPublication", referencedColumnName="ID",  nullable = true)
	private CfResPubl cfpers_respubl_resultPublication;
	@ManyToOne
	@JoinColumn(name="cfpers_respubl_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_respubl_person;
	
	public CfPers_ResPubl(){
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
	
	public java.lang.String getA_copyright() {
		return this.a_copyright;
	}
	
	public void setA_copyright(java.lang.String a_copyright) {
		this.a_copyright = a_copyright;
	}
	
	public CfClass getCfpers_respubl_classification() {
		return this.cfpers_respubl_classification;
	}
	
	public void setCfpers_respubl_classification(CfClass cfpers_respubl_classification) {
		this.cfpers_respubl_classification = cfpers_respubl_classification;
	}
	
	public CfResPubl getCfpers_respubl_resultPublication() {
		return this.cfpers_respubl_resultPublication;
	}
	
	public void setCfpers_respubl_resultPublication(CfResPubl cfpers_respubl_resultPublication) {
		this.cfpers_respubl_resultPublication = cfpers_respubl_resultPublication;
	}
	
	public CfPers getCfpers_respubl_person() {
		return this.cfpers_respubl_person;
	}
	
	public void setCfpers_respubl_person(CfPers cfpers_respubl_person) {
		this.cfpers_respubl_person = cfpers_respubl_person;
	}
	
}