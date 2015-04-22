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
@Table(name = "C1_PERSON_LANGUAGE")
public class CfPers_Lang implements java.io.Serializable {

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
	@Column(name = "cfSkillReading", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_skill_reading;
	@Column(name = "cfSkillSpeaking", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_skill_speaking;
	@Column(name = "cfSkillWriting", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_skill_writing;
	@ManyToOne
	@JoinColumn(name="cfpers_lang_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfpers_lang_language;
	@ManyToOne
	@JoinColumn(name="cfpers_lang_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfpers_lang_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_lang_person", referencedColumnName="ID",  nullable = true)
	private CfPers cfpers_lang_person;
	
	public CfPers_Lang(){
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
	
	public java.lang.String getA_skill_reading() {
		return this.a_skill_reading;
	}
	
	public void setA_skill_reading(java.lang.String a_skill_reading) {
		this.a_skill_reading = a_skill_reading;
	}
	
	public java.lang.String getA_skill_speaking() {
		return this.a_skill_speaking;
	}
	
	public void setA_skill_speaking(java.lang.String a_skill_speaking) {
		this.a_skill_speaking = a_skill_speaking;
	}
	
	public java.lang.String getA_skill_writing() {
		return this.a_skill_writing;
	}
	
	public void setA_skill_writing(java.lang.String a_skill_writing) {
		this.a_skill_writing = a_skill_writing;
	}
	
	public CfLang getCfpers_lang_language() {
		return this.cfpers_lang_language;
	}
	
	public void setCfpers_lang_language(CfLang cfpers_lang_language) {
		this.cfpers_lang_language = cfpers_lang_language;
	}
	
	public CfClass getCfpers_lang_classification() {
		return this.cfpers_lang_classification;
	}
	
	public void setCfpers_lang_classification(CfClass cfpers_lang_classification) {
		this.cfpers_lang_classification = cfpers_lang_classification;
	}
	
	public CfPers getCfpers_lang_person() {
		return this.cfpers_lang_person;
	}
	
	public void setCfpers_lang_person(CfPers cfpers_lang_person) {
		this.cfpers_lang_person = cfpers_lang_person;
	}
	
}