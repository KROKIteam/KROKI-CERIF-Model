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
@Table(name = "C1_ORGANISATION_UNIT_ELECTRONIC_ADDRESS")
public class CfOrgUnit_EAddr implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfStartDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_start_date;
	@Column(name = "cfEndDate", unique = false, nullable = false ,columnDefinition = "DATETIME")
	protected java.util.Date ka_end_date;
	@Column(name = "cfFraction", unique = false, nullable = false ,columnDefinition = "FLOAT")
	protected java.math.BigDecimal ka_fraction;
	@ManyToOne
	@JoinColumn(name="cforgunit_eaddr_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cforgunit_eaddr_classification;
	@ManyToOne
	@JoinColumn(name="cforgunit_eaddr_electronicAddress", referencedColumnName="ID",  nullable = true)
	protected CfEAddr cforgunit_eaddr_electronicAddress;
	@ManyToOne
	@JoinColumn(name="cforgunit_eaddr_organisationUnit", referencedColumnName="ID",  nullable = true)
	protected CfOrgUnit cforgunit_eaddr_organisationUnit;
	
	public CfOrgUnit_EAddr(){
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
	
	public java.math.BigDecimal getKa_fraction() {
		return this.ka_fraction;
	}
	
	public void setKa_fraction(java.math.BigDecimal ka_fraction) {
		this.ka_fraction = ka_fraction;
	}
	
	public CfClass getCforgunit_eaddr_classification() {
		return this.cforgunit_eaddr_classification;
	}
	
	public void setCforgunit_eaddr_classification(CfClass cforgunit_eaddr_classification) {
		this.cforgunit_eaddr_classification = cforgunit_eaddr_classification;
	}
	
	public CfEAddr getCforgunit_eaddr_electronicAddress() {
		return this.cforgunit_eaddr_electronicAddress;
	}
	
	public void setCforgunit_eaddr_electronicAddress(CfEAddr cforgunit_eaddr_electronicAddress) {
		this.cforgunit_eaddr_electronicAddress = cforgunit_eaddr_electronicAddress;
	}
	
	public CfOrgUnit getCforgunit_eaddr_organisationUnit() {
		return this.cforgunit_eaddr_organisationUnit;
	}
	
	public void setCforgunit_eaddr_organisationUnit(CfOrgUnit cforgunit_eaddr_organisationUnit) {
		this.cforgunit_eaddr_organisationUnit = cforgunit_eaddr_organisationUnit;
	}
	
}