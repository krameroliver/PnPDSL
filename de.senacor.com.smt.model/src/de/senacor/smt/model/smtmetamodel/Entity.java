/**
 */
package de.senacor.smt.model.smtmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Entity#getDocument <em>Document</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Entity#getFields <em>Fields</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Entity#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Entity#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.senacor.smt.model.smtmetamodel.Document#getEntites <em>Entites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(Document)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getEntity_Document()
	 * @see de.senacor.smt.model.smtmetamodel.Document#getEntites
	 * @model opposite="entites" transient="false"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Entity#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.senacor.smt.model.smtmetamodel.Field}.
	 * It is bidirectional and its opposite is '{@link de.senacor.smt.model.smtmetamodel.Field#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getEntity_Fields()
	 * @see de.senacor.smt.model.smtmetamodel.Field#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link de.senacor.smt.model.smtmetamodel.Relationship}.
	 * It is bidirectional and its opposite is '{@link de.senacor.smt.model.smtmetamodel.Relationship#getFromEntity <em>From Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getEntity_Relationships()
	 * @see de.senacor.smt.model.smtmetamodel.Relationship#getFromEntity
	 * @model opposite="fromEntity" containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link de.senacor.smt.model.smtmetamodel.Includes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getEntity_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Includes> getIncludes();



} // Entity
