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
@Table(name = "C1_CLASSIFICATION_TERM")
public class CfClassTerm implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	protected java.lang.Long id;

	@Column(name = "cfTerm", unique = false, nullable = false , length = 64, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_term;
	@Column(name = "cfRoleExpr", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "VARCHAR")
	protected java.lang.String ka_role_expression;
	@Column(name = "cfRoleExprOpp", unique = false, nullable = false , length = 128, precision = 0,columnDefinition = "VARCHAR")
	protected java.lang.String ka_role_expression_opposite;
	@Column(name = "cfTermSrc", unique = false, nullable = false ,columnDefinition = "TEXT")
	protected java.lang.String ka_term_source;
	@ManyToOne
	@JoinColumn(name="cfclassterm_language", referencedColumnName="ID",  nullable = true)
	protected CfLang cfclassterm_language;
	@ManyToOne
	@JoinColumn(name="cfclassterm_classification", referencedColumnName="ID",  nullable = true)
	protected CfClass cfclassterm_classification;
	@Column(name = "cfTrans", unique = false, nullable = false , length = 1, precision = 0,columnDefinition = "CHAR")
	protected java.lang.String ka_translation_kind;
	
	public CfClassTerm(){
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public java.lang.String getKa_term() {
		return this.ka_term;
	}
	
	public void setKa_term(java.lang.String ka_term) {
		this.ka_term = ka_term;
	}
	
	public java.lang.String getKa_role_expression() {
		return this.ka_role_expression;
	}
	
	public void setKa_role_expression(java.lang.String ka_role_expression) {
		this.ka_role_expression = ka_role_expression;
	}
	
	public java.lang.String getKa_role_expression_opposite() {
		return this.ka_role_expression_opposite;
	}
	
	public void setKa_role_expression_opposite(java.lang.String ka_role_expression_opposite) {
		this.ka_role_expression_opposite = ka_role_expression_opposite;
	}
	
	public java.lang.String getKa_term_source() {
		return this.ka_term_source;
	}
	
	public void setKa_term_source(java.lang.String ka_term_source) {
		this.ka_term_source = ka_term_source;
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
	
	public java.lang.String getKa_translation_kind() {
		return this.ka_translation_kind;
	}
	
	public void setKa_translation_kind(java.lang.String ka_translation_kind) {
		this.ka_translation_kind = ka_translation_kind;
	}
	
}