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
@Table(name = "C1_GEOGRAPHIC_BOUNDING_BOX_DESCRIPTION")
public class CfGeoBBoxDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfDescr", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_description;
	@ManyToOne
	@JoinColumn(name="cfgeobboxdescr_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfgeobboxdescr_language;
	@ManyToOne
	@JoinColumn(name="cfgeobboxdescr_geographicBoundingBox", referencedColumnName="ID",  nullable = true)
	protected CfGeoBBox cfgeobboxdescr_geographicBoundingBox;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfGeoBBoxDescr(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_description() {
		return this.ka_description;
	}
	
	public void setKa_description(java.lang.String ka_description) {
		this.ka_description = ka_description;
	}
	
	public CfLang getCfgeobboxdescr_language() {
		return this.cfgeobboxdescr_language;
	}
	
	public void setCfgeobboxdescr_language(CfLang cfgeobboxdescr_language) {
		this.cfgeobboxdescr_language = cfgeobboxdescr_language;
	}
	
	public CfGeoBBox getCfgeobboxdescr_geographicBoundingBox() {
		return this.cfgeobboxdescr_geographicBoundingBox;
	}
	
	public void setCfgeobboxdescr_geographicBoundingBox(CfGeoBBox cfgeobboxdescr_geographicBoundingBox) {
		this.cfgeobboxdescr_geographicBoundingBox = cfgeobboxdescr_geographicBoundingBox;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}