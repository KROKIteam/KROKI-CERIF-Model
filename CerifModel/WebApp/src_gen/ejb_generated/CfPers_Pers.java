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
@Table(name = "C1_PERSON_PERSON")
public class CfPers_Pers implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_pers_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfpers_pers_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_pers_person", referencedColumnName="ID",  nullable = true)
	protected CfPers cfpers_pers_person;
	@ManyToOne
	@JoinColumn(name="cfpers_pers_persona", referencedColumnName="ID",  nullable = true)
	protected CfPers cfpers_pers_persona;
	
	public CfPers_Pers(){
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
	
	public CfClass getCfpers_pers_classification() {
		return this.cfpers_pers_classification;
	}
	
	public void setCfpers_pers_classification(CfClass cfpers_pers_classification) {
		this.cfpers_pers_classification = cfpers_pers_classification;
	}
	
	public CfPers getCfpers_pers_person() {
		return this.cfpers_pers_person;
	}
	
	public void setCfpers_pers_person(CfPers cfpers_pers_person) {
		this.cfpers_pers_person = cfpers_pers_person;
	}
	
	public CfPers getCfpers_pers_persona() {
		return this.cfpers_pers_persona;
	}
	
	public void setCfpers_pers_persona(CfPers cfpers_pers_persona) {
		this.cfpers_pers_persona = cfpers_pers_persona;
	}
	
}