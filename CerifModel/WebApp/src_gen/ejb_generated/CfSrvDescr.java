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
@Table(name = "C1_SERVICE_DESCRIPTION")
public class CfSrvDescr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	@Column(name = "cfDescr", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_description;
	@ManyToOne
	@JoinColumn(name="cfsrvdescr_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfsrvdescr_language;
	@ManyToOne
	@JoinColumn(name="cfsrvdescr_service", referencedColumnName="ID",  nullable = true)
	private CfSrv cfsrvdescr_service;
	
	public CfSrvDescr(){
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
	
	public CfLang getCfsrvdescr_language() {
		return this.cfsrvdescr_language;
	}
	
	public void setCfsrvdescr_language(CfLang cfsrvdescr_language) {
		this.cfsrvdescr_language = cfsrvdescr_language;
	}
	
	public CfSrv getCfsrvdescr_service() {
		return this.cfsrvdescr_service;
	}
	
	public void setCfsrvdescr_service(CfSrv cfsrvdescr_service) {
		this.cfsrvdescr_service = cfsrvdescr_service;
	}
	
}