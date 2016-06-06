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
@Table(name = "C1_FUNDING_NAME")
public class CfFundName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfName", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_name;
	@ManyToOne
	@JoinColumn(name="cffundname_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cffundname_language;
	@ManyToOne
	@JoinColumn(name="cffundname_funding", referencedColumnName="ID",  nullable = true)
	protected CfFund cffundname_funding;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	@ManyToOne
	@JoinColumn(name="cffundname_fundingIntegrated", referencedColumnName="ID",  nullable = true)
	protected Fundingintegrated cffundname_fundingIntegrated;
	
	public CfFundName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_name() {
		return this.ka_name;
	}
	
	public void setKa_name(java.lang.String ka_name) {
		this.ka_name = ka_name;
	}
	
	public CfLang getCffundname_language() {
		return this.cffundname_language;
	}
	
	public void setCffundname_language(CfLang cffundname_language) {
		this.cffundname_language = cffundname_language;
	}
	
	public CfFund getCffundname_funding() {
		return this.cffundname_funding;
	}
	
	public void setCffundname_funding(CfFund cffundname_funding) {
		this.cffundname_funding = cffundname_funding;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
	public Fundingintegrated getCffundname_fundingIntegrated() {
		return this.cffundname_fundingIntegrated;
	}
	
	public void setCffundname_fundingIntegrated(Fundingintegrated cffundname_fundingIntegrated) {
		this.cffundname_fundingIntegrated = cffundname_fundingIntegrated;
	}
	
}