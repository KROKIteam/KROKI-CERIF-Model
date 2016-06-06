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
@Table(name = "C1_PERSON_NAME")
public class CfPersName implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfPersNameId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_person_name_identifier;
	@Column(name = "cfFamilyNames", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_family_names;
	@Column(name = "cfFirstNames", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_first_names;
	@Column(name = "cfOtherNames", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_other_names;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpersname_pers_personName")
	protected Set<CfPersName_Pers> cfpersname_pers_personNameSet;
	
	public CfPersName(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_person_name_identifier() {
		return this.ka_person_name_identifier;
	}
	
	public void setKa_person_name_identifier(java.lang.String ka_person_name_identifier) {
		this.ka_person_name_identifier = ka_person_name_identifier;
	}
	
	public java.lang.String getKa_family_names() {
		return this.ka_family_names;
	}
	
	public void setKa_family_names(java.lang.String ka_family_names) {
		this.ka_family_names = ka_family_names;
	}
	
	public java.lang.String getKa_first_names() {
		return this.ka_first_names;
	}
	
	public void setKa_first_names(java.lang.String ka_first_names) {
		this.ka_first_names = ka_first_names;
	}
	
	public java.lang.String getKa_other_names() {
		return this.ka_other_names;
	}
	
	public void setKa_other_names(java.lang.String ka_other_names) {
		this.ka_other_names = ka_other_names;
	}
	
	public Set<CfPersName_Pers> getCfpersname_pers_personNameSet() {
		return this.cfpersname_pers_personNameSet;
	}
	
	public void setCfpersname_pers_personNameSet(Set<CfPersName_Pers> cfpersname_pers_personNameSet) {
		this.cfpersname_pers_personNameSet = cfpersname_pers_personNameSet;
	}
	
}