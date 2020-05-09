/**
 */
package de.senacor.smt.model.smtmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Relationship#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Relationship#getToEntity <em>To Entity</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends NamedElement {
	/**
	 * Returns the value of the '<em><b>From Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.senacor.smt.model.smtmetamodel.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Entity</em>' container reference.
	 * @see #setFromEntity(Entity)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getRelationship_FromEntity()
	 * @see de.senacor.smt.model.smtmetamodel.Entity#getRelationships
	 * @model opposite="relationships" transient="false"
	 * @generated
	 */
	Entity getFromEntity();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Relationship#getFromEntity <em>From Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Entity</em>' container reference.
	 * @see #getFromEntity()
	 * @generated
	 */
	void setFromEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>To Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Entity</em>' reference.
	 * @see #setToEntity(Entity)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getRelationship_ToEntity()
	 * @model
	 * @generated
	 */
	Entity getToEntity();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Relationship#getToEntity <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Entity</em>' reference.
	 * @see #getToEntity()
	 * @generated
	 */
	void setToEntity(Entity value);

} // Relationship
