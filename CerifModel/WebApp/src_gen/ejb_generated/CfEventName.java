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
@Table(name = "C1_EVENT_NAME")
public class CfEventName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfName", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_name;
	@ManyToOne
	@JoinColumn(name="cfeventname_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfeventname_language;
	@ManyToOne
	@JoinColumn(name="cfeventname_event", referencedColumnName="ID",  nullable = true)
	protected CfEvent cfeventname_event;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfEventName(){
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
	
	public CfLang getCfeventname_language() {
		return this.cfeventname_language;
	}
	
	public void setCfeventname_language(CfLang cfeventname_language) {
		this.cfeventname_language = cfeventname_language;
	}
	
	public CfEvent getCfeventname_event() {
		return this.cfeventname_event;
	}
	
	public void setCfeventname_event(CfEvent cfeventname_event) {
		this.cfeventname_event = cfeventname_event;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}