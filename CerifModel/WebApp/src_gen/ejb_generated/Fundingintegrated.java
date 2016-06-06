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
@Table(name = "C1_FUNDING_INTEGRATED")
public class Fundingintegrated implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffund_fundingIntegrated")
	protected Set<CfFund> cffund_fundingIntegratedSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffunddescr_fundingIntegrated")
	protected Set<CfFundDescr> cffunddescr_fundingIntegratedSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffundkeyw_fundingIntegrated")
	protected Set<CfFundKeyw> cffundkeyw_fundingIntegratedSet;
	@OneToMany(cascade = { ALL }, fetch = FetchType.LAZY, mappedBy = "cffundname_fundingIntegrated")
	protected Set<CfFundName> cffundname_fundingIntegratedSet;
	
	public Fundingintegrated(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Set<CfFund> getCffund_fundingIntegratedSet() {
		return this.cffund_fundingIntegratedSet;
	}
	
	public void setCffund_fundingIntegratedSet(Set<CfFund> cffund_fundingIntegratedSet) {
		this.cffund_fundingIntegratedSet = cffund_fundingIntegratedSet;
	}
	
	public Set<CfFundDescr> getCffunddescr_fundingIntegratedSet() {
		return this.cffunddescr_fundingIntegratedSet;
	}
	
	public void setCffunddescr_fundingIntegratedSet(Set<CfFundDescr> cffunddescr_fundingIntegratedSet) {
		this.cffunddescr_fundingIntegratedSet = cffunddescr_fundingIntegratedSet;
	}
	
	public Set<CfFundKeyw> getCffundkeyw_fundingIntegratedSet() {
		return this.cffundkeyw_fundingIntegratedSet;
	}
	
	public void setCffundkeyw_fundingIntegratedSet(Set<CfFundKeyw> cffundkeyw_fundingIntegratedSet) {
		this.cffundkeyw_fundingIntegratedSet = cffundkeyw_fundingIntegratedSet;
	}
	
	public Set<CfFundName> getCffundname_fundingIntegratedSet() {
		return this.cffundname_fundingIntegratedSet;
	}
	
	public void setCffundname_fundingIntegratedSet(Set<CfFundName> cffundname_fundingIntegratedSet) {
		this.cffundname_fundingIntegratedSet = cffundname_fundingIntegratedSet;
	}
	
}