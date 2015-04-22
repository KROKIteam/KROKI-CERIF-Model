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
@Table(name = "C1_CLASSIFICATION_TERM")
public class CfClassTerm implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private java.lang.Long id;

	@Column(name = "cfTerm", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_term;
	@Column(name = "cfRoleExpr", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "VARCHAR")
	private java.lang.String a_role_expression;
	@Column(name = "cfRoleExprOpp", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "VARCHAR")
	private java.lang.String a_role_expression_opposite;
	@Column(name = "cfTermSrc", unique = false, nullable = false ,columnDefinition = "TEXT")
	private java.lang.String a_term_source;
	@ManyToOne
	@JoinColumn(name="cfclassterm_language", referencedColumnName="ID",  nullable = true)
	private CfLang cfclassterm_language;
	@ManyToOne
	@JoinColumn(name="cfclassterm_classification", referencedColumnName="ID",  nullable = true)
	private CfClass cfclassterm_classification;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	private java.lang.String a_translation_kind;
	
	public CfClassTerm(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getA_term() {
		return this.a_term;
	}
	
	public void setA_term(java.lang.String a_term) {
		this.a_term = a_term;
	}
	
	public java.lang.String getA_role_expression() {
		return this.a_role_expression;
	}
	
	public void setA_role_expression(java.lang.String a_role_expression) {
		this.a_role_expression = a_role_expression;
	}
	
	public java.lang.String getA_role_expression_opposite() {
		return this.a_role_expression_opposite;
	}
	
	public void setA_role_expression_opposite(java.lang.String a_role_expression_opposite) {
		this.a_role_expression_opposite = a_role_expression_opposite;
	}
	
	public java.lang.String getA_term_source() {
		return this.a_term_source;
	}
	
	public void setA_term_source(java.lang.String a_term_source) {
		this.a_term_source = a_term_source;
	}
	
	public CfLang getCfclassterm_language() {
		return this.cfclassterm_language;
	}
	
	public void setCfclassterm_language(CfLang cfclassterm_language) {
		this.cfclassterm_language = cfclassterm_language;
	}
	
	public CfClass getCfclassterm_classification() {
		return this.cfclassterm_classification;
	}
	
	public void setCfclassterm_classification(CfClass cfclassterm_classification) {
		this.cfclassterm_classification = cfclassterm_classification;
	}
	
	public java.lang.String getA_translation_kind() {
		return this.a_translation_kind;
	}
	
	public void setA_translation_kind(java.lang.String a_translation_kind) {
		this.a_translation_kind = a_translation_kind;
	}
	
}