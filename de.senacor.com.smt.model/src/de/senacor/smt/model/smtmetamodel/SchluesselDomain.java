/**
 */
package de.senacor.smt.model.smtmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schluessel Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.SchluesselDomain#getName <em>Name</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.SchluesselDomain#getSchluesselfeld <em>Schluesselfeld</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.SchluesselDomain#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluesselDomain()
 * @model
 * @generated
 */
public interface SchluesselDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluesselDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.SchluesselDomain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schluesselfeld</b></em>' containment reference list.
	 * The list contents are of type {@link de.senacor.smt.model.smtmetamodel.SchluesselFeld}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schluesselfeld</em>' containment reference list.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluesselDomain_Schluesselfeld()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchluesselFeld> getSchluesselfeld();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getSchluesselDomain_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.SchluesselDomain#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // SchluesselDomain
