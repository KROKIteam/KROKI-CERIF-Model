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
@Table(name = "C1_GEOGRAPHIC_BOUNDING_BOX_NAME")
public class CfGeoBBoxName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfName", unique = false, nullable = false , length = 255, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_name;
	@ManyToOne
	@JoinColumn(name="cfgeobboxname_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfgeobboxname_language;
	@ManyToOne
	@JoinColumn(name="cfgeobboxname_geographicBoundingBox", referencedColumnName="ID",  nullable = true)
	protected CfGeoBBox cfgeobboxname_geographicBoundingBox;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfGeoBBoxName(){
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
	
	public CfLang getCfgeobboxname_language() {
		return this.cfgeobboxname_language;
	}
	
	public void setCfgeobboxname_language(CfLang cfgeobboxname_language) {
		this.cfgeobboxname_language = cfgeobboxname_language;
	}
	
	public CfGeoBBox getCfgeobboxname_geographicBoundingBox() {
		return this.cfgeobboxname_geographicBoundingBox;
	}
	
	public void setCfgeobboxname_geographicBoundingBox(CfGeoBBox cfgeobboxname_geographicBoundingBox) {
		this.cfgeobboxname_geographicBoundingBox = cfgeobboxname_geographicBoundingBox;
	}
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}