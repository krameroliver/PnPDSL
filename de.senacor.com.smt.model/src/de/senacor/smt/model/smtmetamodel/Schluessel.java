/**
 */
package de.senacor.smt.model.smtmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schluessel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Schluessel#isSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Schluessel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluessel()
 * @model
 * @generated
 */
public interface Schluessel extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluessel_SequenceNumber()
	 * @model changeable="false"
	 * @generated
	 */
	boolean isSequenceNumber();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluessel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Schluessel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Schluessel
