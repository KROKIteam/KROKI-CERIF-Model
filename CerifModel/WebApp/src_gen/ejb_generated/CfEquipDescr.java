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
   Creation date: 20.03.2015  10:51:19h
   **/

@Entity
@Table(name = "CM_EQUIPMENT_DESCRIPTION")
public class CfEquipDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false )
	private java.lang.String a_translation_kind;
	@Column(name = "cfDescr", unique = false, nullable = false )
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="cfequipdescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfequipdescr_language;
	@ManyToOne
	@JoinColumn(name="cfequipdescr_equipment", referencedColumnName="ID",  nullable = true)
	private CfEquip cfequipdescr_equipment;
	
	public CfEquipDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
	public java.lang.String getA_description() {
		return this.a_description;
	}
	
	public void setA_description(java.lang.String a_description) {
		this.a_description = a_description;
	}
	
	public CfLang getCfequipdescr_language() {
		return this.cfequipdescr_language;
	}
	
	public void setCfequipdescr_language(CfLang cfequipdescr_language) {
		this.cfequipdescr_language = cfequipdescr_language;
	}
	
	public CfEquip getCfequipdescr_equipment() {
		return this.cfequipdescr_equipment;
	}
	
	public void setCfequipdescr_equipment(CfEquip cfequipdescr_equipment) {
		this.cfequipdescr_equipment = cfequipdescr_equipment;
	}
	
}