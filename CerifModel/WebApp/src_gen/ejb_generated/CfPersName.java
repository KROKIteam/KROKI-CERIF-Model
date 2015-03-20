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
@Table(name = "CM_PERSON_NAME")
public class CfPersName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfPersNameId", unique = false, nullable = false )
	private java.lang.String a_person_name_identifier;
	@Column(name = "cfFamilyNames", unique = false, nullable = false )
	private java.lang.String a_family_names;
	@Column(name = "cfFirstNames", unique = false, nullable = false )
	private java.lang.String a_first_names;
	@Column(name = "cfOtherNames", unique = false, nullable = false )
	private java.lang.String a_other_names;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpersname_pers_personName")
	private Set<CfPersName_Pers> cfpersname_pers_personNameSet;
	
	public CfPersName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_person_name_identifier() {
		return this.a_person_name_identifier;
	}
	
	public void setA_person_name_identifier(java.lang.String a_person_name_identifier) {
		this.a_person_name_identifier = a_person_name_identifier;
	}
	
	public java.lang.String getA_family_names() {
		return this.a_family_names;
	}
	
	public void setA_family_names(java.lang.String a_family_names) {
		this.a_family_names = a_family_names;
	}
	
	public java.lang.String getA_first_names() {
		return this.a_first_names;
	}
	
	public void setA_first_names(java.lang.String a_first_names) {
		this.a_first_names = a_first_names;
	}
	
	public java.lang.String getA_other_names() {
		return this.a_other_names;
	}
	
	public void setA_other_names(java.lang.String a_other_names) {
		this.a_other_names = a_other_names;
	}
	
	public Set<CfPersName_Pers> getCfpersname_pers_personNameSet() {
		return this.cfpersname_pers_personNameSet;
	}
	
	public void setCfpersname_pers_personNameSet(Set<CfPersName_Pers> cfpersname_pers_personNameSet) {
		this.cfpersname_pers_personNameSet = cfpersname_pers_personNameSet;
	}
	
}