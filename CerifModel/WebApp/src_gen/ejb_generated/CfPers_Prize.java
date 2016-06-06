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
@Table(name = "C1_PERSON_PRIZE_AWARD")
public class CfPers_Prize implements java.io.Serializable {

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
	@JoinColumn(name="cfpers_prize_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfpers_prize_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_prize_prizeAward", referencedColumnName="ID",  nullable = true)
	protected CfPrize cfpers_prize_prizeAward;
	@ManyToOne
	@JoinColumn(name="cfpers_prize_person", referencedColumnName="ID",  nullable = true)
	protected CfPers cfpers_prize_person;
	
	public CfPers_Prize(){
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
	
	public CfClass getCfpers_prize_classification() {
		return this.cfpers_prize_classification;
	}
	
	public void setCfpers_prize_classification(CfClass cfpers_prize_classification) {
		this.cfpers_prize_classification = cfpers_prize_classification;
	}
	
	public CfPrize getCfpers_prize_prizeAward() {
		return this.cfpers_prize_prizeAward;
	}
	
	public void setCfpers_prize_prizeAward(CfPrize cfpers_prize_prizeAward) {
		this.cfpers_prize_prizeAward = cfpers_prize_prizeAward;
	}
	
	public CfPers getCfpers_prize_person() {
		return this.cfpers_prize_person;
	}
	
	public void setCfpers_prize_person(CfPers cfpers_prize_person) {
		this.cfpers_prize_person = cfpers_prize_person;
	}
	
}