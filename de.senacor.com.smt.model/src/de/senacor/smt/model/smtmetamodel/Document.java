/**
 */
package de.senacor.smt.model.smtmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Document#getEntites <em>Entites</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entites</b></em>' containment reference list.
	 * The list contents are of type {@link de.senacor.smt.model.smtmetamodel.Entity}.
	 * It is bidirectional and its opposite is '{@link de.senacor.smt.model.smtmetamodel.Entity#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entites</em>' containment reference list.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getDocument_Entites()
	 * @see de.senacor.smt.model.smtmetamodel.Entity#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	EList<Entity> getEntites();

} // Document
