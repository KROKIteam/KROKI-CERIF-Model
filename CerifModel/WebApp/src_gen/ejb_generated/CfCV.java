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
@Table(name = "C1_CURRICULUM_VITAE")
public class CfCV implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfCVId", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_curriculum_vitae_identifier;
	@Column(name = "cfCVDoc", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_curriculum_vitae_doc;
	@Column(name = "cfURI", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "fcv_class_curriculumVitae")
	protected Set<FCV_Class> fcv_class_curriculumVitaeSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_cv_curriculumVitae")
	protected Set<CfPers_CV> cfpers_cv_curriculumVitaeSet;
	
	public CfCV(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_curriculum_vitae_identifier() {
		return this.ka_curriculum_vitae_identifier;
	}
	
	public void setKa_curriculum_vitae_identifier(java.lang.String ka_curriculum_vitae_identifier) {
		this.ka_curriculum_vitae_identifier = ka_curriculum_vitae_identifier;
	}
	
	public java.lang.String getKa_curriculum_vitae_doc() {
		return this.ka_curriculum_vitae_doc;
	}
	
	public void setKa_curriculum_vitae_doc(java.lang.String ka_curriculum_vitae_doc) {
		this.ka_curriculum_vitae_doc = ka_curriculum_vitae_doc;
	}
	
	public java.lang.String getKa_uniform_resource_identifier() {
		return this.ka_uniform_resource_identifier;
	}
	
	public void setKa_uniform_resource_identifier(java.lang.String ka_uniform_resource_identifier) {
		this.ka_uniform_resource_identifier = ka_uniform_resource_identifier;
	}
	
	public Set<FCV_Class> getFcv_class_curriculumVitaeSet() {
		return this.fcv_class_curriculumVitaeSet;
	}
	
	public void setFcv_class_curriculumVitaeSet(Set<FCV_Class> fcv_class_curriculumVitaeSet) {
		this.fcv_class_curriculumVitaeSet = fcv_class_curriculumVitaeSet;
	}
	
	public Set<CfPers_CV> getCfpers_cv_curriculumVitaeSet() {
		return this.cfpers_cv_curriculumVitaeSet;
	}
	
	public void setCfpers_cv_curriculumVitaeSet(Set<CfPers_CV> cfpers_cv_curriculumVitaeSet) {
		this.cfpers_cv_curriculumVitaeSet = cfpers_cv_curriculumVitaeSet;
	}
	
}