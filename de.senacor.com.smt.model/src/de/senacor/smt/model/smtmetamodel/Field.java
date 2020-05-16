/**
 */
package de.senacor.smt.model.smtmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Field#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Field#getType <em>Type</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Field#getLength <em>Length</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Field#getPreciscion <em>Preciscion</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Field#getScale <em>Scale</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.Field#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.senacor.smt.model.smtmetamodel.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getField_Entity()
	 * @see de.senacor.smt.model.smtmetamodel.Entity#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Field#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.senacor.smt.model.smtmetamodel.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.senacor.smt.model.smtmetamodel.DataType
	 * @see #setType(DataType)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getField_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.senacor.smt.model.smtmetamodel.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getField_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Field#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Preciscion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preciscion</em>' attribute.
	 * @see #setPreciscion(int)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getField_Preciscion()
	 * @model
	 * @generated
	 */
	int getPreciscion();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Field#getPreciscion <em>Preciscion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preciscion</em>' attribute.
	 * @see #getPreciscion()
	 * @generated
	 */
	void setPreciscion(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getField_Scale()
	 * @model
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Field#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage#getField_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.senacor.smt.model.smtmetamodel.Field#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // Field
