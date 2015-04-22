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
@Table(name = "C1_EVENT_DESCRIPTION")
public class CfEventDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfDescr", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="cfeventdescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfeventdescr_language;
	@ManyToOne
	@JoinColumn(name="cfeventdescr_event", referencedColumnName="ID",  nullable = true)
	private CfEvent cfeventdescr_event;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	
	public CfEventDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public CfLang getCfeventdescr_language() {
		return this.cfeventdescr_language;
	}
	
	public void setCfeventdescr_language(CfLang cfeventdescr_language) {
		this.cfeventdescr_language = cfeventdescr_language;
	}
	
	public CfEvent getCfeventdescr_event() {
		return this.cfeventdescr_event;
	}
	
	public void setCfeventdescr_event(CfEvent cfeventdescr_event) {
		this.cfeventdescr_event = cfeventdescr_event;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
}