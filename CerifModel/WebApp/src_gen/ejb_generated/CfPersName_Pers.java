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
@Table(name = "C1_PERSON_NAME__PERSON")
public class CfPersName_Pers implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_end_date;
	@ManyToOne
	@JoinColumn(name="cfpersname_pers_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfpersname_pers_classification;
	@ManyToOne
	@JoinColumn(name="cfpersname_pers_person", referencedColumnName="ID",  nullable = true)
	protected CfPers cfpersname_pers_person;
	@ManyToOne
	@JoinColumn(name="cfpersname_pers_personName", referencedColumnName="ID",  nullable = true)
	protected CfPersName cfpersname_pers_personName;
	
	public CfPersName_Pers(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.util.Date getKa_start_date() {
		return this.ka_start_date;
	}
	
	public void setKa_start_date(java.util.Date ka_start_date) {
		this.ka_start_date = ka_start_date;
	}
	
	public java.util.Date getKa_end_date() {
		return this.ka_end_date;
	}
	
	public void setKa_end_date(java.util.Date ka_end_date) {
		this.ka_end_date = ka_end_date;
	}
	
	public CfClass getCfpersname_pers_classification() {
		return this.cfpersname_pers_classification;
	}
	
	public void setCfpersname_pers_classification(CfClass cfpersname_pers_classification) {
		this.cfpersname_pers_classification = cfpersname_pers_classification;
	}
	
	public CfPers getCfpersname_pers_person() {
		return this.cfpersname_pers_person;
	}
	
	public void setCfpersname_pers_person(CfPers cfpersname_pers_person) {
		this.cfpersname_pers_person = cfpersname_pers_person;
	}
	
	public CfPersName getCfpersname_pers_personName() {
		return this.cfpersname_pers_personName;
	}
	
	public void setCfpersname_pers_personName(CfPersName cfpersname_pers_personName) {
		this.cfpersname_pers_personName = cfpersname_pers_personName;
	}
	
}