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
@Table(name = "CM_PRIZE_AWARD")
public class CfPrize implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfPrizeId", unique = false, nullable = false )
	private java.lang.String a_prize_award_identifier;
	@Column(name = "cfURI", unique = false, nullable = false )
	private java.lang.String a_uniform_resource_identifier;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cforgunit_prize_prizeAward")
	private Set<CfOrgUnit_Prize> cforgunit_prize_prizeAwardSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfpers_prize_prizeAward")
	private Set<CfPers_Prize> cfpers_prize_prizeAwardSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprize_class_prizeAward")
	private Set<CfPrize_Class> cfprize_class_prizeAwardSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprizedescr_prizeAward")
	private Set<CfPrizeDescr> cfprizedescr_prizeAwardSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprizekeyw_prizeAward")
	private Set<CfPrizeKeyw> cfprizekeyw_prizeAwardSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfprizename_prizeAward")
	private Set<CfPrizeName> cfprizename_prizeAwardSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cfproj_prize_prizeAward")
	private Set<CfProj_Prize> cfproj_prize_prizeAwardSet;
	
	public CfPrize(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_prize_award_identifier() {
		return this.a_prize_award_identifier;
	}
	
	public void setA_prize_award_identifier(java.lang.String a_prize_award_identifier) {
		this.a_prize_award_identifier = a_prize_award_identifier;
	}
	
	public java.lang.String getA_uniform_resource_identifier() {
		return this.a_uniform_resource_identifier;
	}
	
	public void setA_uniform_resource_identifier(java.lang.String a_uniform_resource_identifier) {
		this.a_uniform_resource_identifier = a_uniform_resource_identifier;
	}
	
	public Set<CfOrgUnit_Prize> getCforgunit_prize_prizeAwardSet() {
		return this.cforgunit_prize_prizeAwardSet;
	}
	
	public void setCforgunit_prize_prizeAwardSet(Set<CfOrgUnit_Prize> cforgunit_prize_prizeAwardSet) {
		this.cforgunit_prize_prizeAwardSet = cforgunit_prize_prizeAwardSet;
	}
	
	public Set<CfPers_Prize> getCfpers_prize_prizeAwardSet() {
		return this.cfpers_prize_prizeAwardSet;
	}
	
	public void setCfpers_prize_prizeAwardSet(Set<CfPers_Prize> cfpers_prize_prizeAwardSet) {
		this.cfpers_prize_prizeAwardSet = cfpers_prize_prizeAwardSet;
	}
	
	public Set<CfPrize_Class> getCfprize_class_prizeAwardSet() {
		return this.cfprize_class_prizeAwardSet;
	}
	
	public void setCfprize_class_prizeAwardSet(Set<CfPrize_Class> cfprize_class_prizeAwardSet) {
		this.cfprize_class_prizeAwardSet = cfprize_class_prizeAwardSet;
	}
	
	public Set<CfPrizeDescr> getCfprizedescr_prizeAwardSet() {
		return this.cfprizedescr_prizeAwardSet;
	}
	
	public void setCfprizedescr_prizeAwardSet(Set<CfPrizeDescr> cfprizedescr_prizeAwardSet) {
		this.cfprizedescr_prizeAwardSet = cfprizedescr_prizeAwardSet;
	}
	
	public Set<CfPrizeKeyw> getCfprizekeyw_prizeAwardSet() {
		return this.cfprizekeyw_prizeAwardSet;
	}
	
	public void setCfprizekeyw_prizeAwardSet(Set<CfPrizeKeyw> cfprizekeyw_prizeAwardSet) {
		this.cfprizekeyw_prizeAwardSet = cfprizekeyw_prizeAwardSet;
	}
	
	public Set<CfPrizeName> getCfprizename_prizeAwardSet() {
		return this.cfprizename_prizeAwardSet;
	}
	
	public void setCfprizename_prizeAwardSet(Set<CfPrizeName> cfprizename_prizeAwardSet) {
		this.cfprizename_prizeAwardSet = cfprizename_prizeAwardSet;
	}
	
	public Set<CfProj_Prize> getCfproj_prize_prizeAwardSet() {
		return this.cfproj_prize_prizeAwardSet;
	}
	
	public void setCfproj_prize_prizeAwardSet(Set<CfProj_Prize> cfproj_prize_prizeAwardSet) {
		this.cfproj_prize_prizeAwardSet = cfproj_prize_prizeAwardSet;
	}
	
}