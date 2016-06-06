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
@Table(name = "C1_PERSON_LANGUAGE")
public class CfPers_Lang implements java.io.Serializable {

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
	@Column(name = "cfSkillReading", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_skill_reading;
	@Column(name = "cfSkillSpeaking", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_skill_speaking;
	@Column(name = "cfSkillWriting", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_skill_writing;
	@ManyToOne
	@JoinColumn(name="cfpers_lang_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfpers_lang_language;
	@ManyToOne
	@JoinColumn(name="cfpers_lang_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfpers_lang_classification;
	@ManyToOne
	@JoinColumn(name="cfpers_lang_person", referencedColumnName="ID",  nullable = true)
	protected CfPers cfpers_lang_person;
	
	public CfPers_Lang(){
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
	
	public java.lang.String getKa_skill_reading() {
		return this.ka_skill_reading;
	}
	
	public void setKa_skill_reading(java.lang.String ka_skill_reading) {
		this.ka_skill_reading = ka_skill_reading;
	}
	
	public java.lang.String getKa_skill_speaking() {
		return this.ka_skill_speaking;
	}
	
	public void setKa_skill_speaking(java.lang.String ka_skill_speaking) {
		this.ka_skill_speaking = ka_skill_speaking;
	}
	
	public java.lang.String getKa_skill_writing() {
		return this.ka_skill_writing;
	}
	
	public void setKa_skill_writing(java.lang.String ka_skill_writing) {
		this.ka_skill_writing = ka_skill_writing;
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