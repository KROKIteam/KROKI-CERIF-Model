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
   Creation date: 31.03.2015  10:28:05h
   **/

@Entity
@Table(name = "CM_CURRICULUM_VITAE")
public class CfCV implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfCVId", unique = false, nullable = false )
	private java.lang.String a_curriculum_vitae_identifier;
	@Column(name = "cfCVDoc", unique = false, nullable = false )
	private java.lang.String a_curriculum_vitae_doc;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfcv_class_curriculumVitae")
	private Set<CfCV_Class> cfcv_class_curriculumVitaeSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_cv_curriculumVitae")
	private Set<CfPers_CV> cfpers_cv_curriculumVitaeSet;
	
	public CfCV(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_curriculum_vitae_identifier() {
		return this.a_curriculum_vitae_identifier;
	}
	
	public void setA_curriculum_vitae_identifier(java.lang.String a_curriculum_vitae_identifier) {
		this.a_curriculum_vitae_identifier = a_curriculum_vitae_identifier;
	}
	
	public java.lang.String getA_curriculum_vitae_doc() {
		return this.a_curriculum_vitae_doc;
	}
	
	public void setA_curriculum_vitae_doc(java.lang.String a_curriculum_vitae_doc) {
		this.a_curriculum_vitae_doc = a_curriculum_vitae_doc;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfCV_Class> getCfcv_class_curriculumVitaeSet() {
		return this.cfcv_class_curriculumVitaeSet;
	}
	
	public void setCfcv_class_curriculumVitaeSet(Set<CfCV_Class> cfcv_class_curriculumVitaeSet) {
		this.cfcv_class_curriculumVitaeSet = cfcv_class_curriculumVitaeSet;
	}
	
	public Set<CfPers_CV> getCfpers_cv_curriculumVitaeSet() {
		return this.cfpers_cv_curriculumVitaeSet;
	}
	
	public void setCfpers_cv_curriculumVitaeSet(Set<CfPers_CV> cfpers_cv_curriculumVitaeSet) {
		this.cfpers_cv_curriculumVitaeSet = cfpers_cv_curriculumVitaeSet;
	}
	
}