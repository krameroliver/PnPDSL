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
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Includes#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getIncludes()
 * @model
 * @generated
 */
public interface Includes extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.senacor.smt.model.smtmetamodel.Field}.
	 * It is bidirectional and its opposite is '{@link de.senacor.smt.model.smtmetamodel.Field#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getIncludes_Fields()
	 * @see de.senacor.smt.model.smtmetamodel.Field#getIncludes
	 * @model opposite="includes" containment="true" required="true"
	 * @generated
	 */
	EList<Field> getFields();
} // Includes
