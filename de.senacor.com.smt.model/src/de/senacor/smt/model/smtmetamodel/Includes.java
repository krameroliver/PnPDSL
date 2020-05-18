/**
 */
package de.senacor.smt.model.smtmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Includes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Includes#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getIncludes()
 * @model
 * @generated
 */
public interface Includes extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link de.senacor.smt.model.smtmetamodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getIncludes_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Field> getField();
} // Includes
