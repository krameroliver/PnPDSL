/**
 */
package de.senacor.smt.model.smtmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schluessel Feld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.SchluesselFeld#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluesselFeld()
 * @model
 * @generated
 */
public interface SchluesselFeld extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluesselFeld_Field()
	 * @model
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.SchluesselFeld#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

} // SchluesselFeld
