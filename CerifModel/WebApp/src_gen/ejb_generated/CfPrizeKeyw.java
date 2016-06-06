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
@Table(name = "C1_PRIZE_AWARD_KEYWORDS")
public class CfPrizeKeyw implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfKeyw", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_keywords;
	@ManyToOne
	@JoinColumn(name="cfprizekeyw_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfprizekeyw_language;
	@ManyToOne
	@JoinColumn(name="cfprizekeyw_prizeAward", referencedColumnName="ID",  nullable = true)
	protected CfPrize cfprizekeyw_prizeAward;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfPrizeKeyw(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_keywords() {
		return this.ka_keywords;
	}
	
	public void setKa_keywords(java.lang.String ka_keywords) {
		this.ka_keywords = ka_keywords;
	}
	
	public CfLang getCfprizekeyw_language() {
		return this.cfprizekeyw_language;
	}
	
	public void setCfprizekeyw_language(CfLang cfprizekeyw_language) {
		this.cfprizekeyw_language = cfprizekeyw_language;
	}
	
	public CfPrize getCfprizekeyw_prizeAward() {
		return this.cfprizekeyw_prizeAward;
	}
	
	public void setCfprizekeyw_prizeAward(CfPrize cfprizekeyw_prizeAward) {
		this.cfprizekeyw_prizeAward = cfprizekeyw_prizeAward;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}