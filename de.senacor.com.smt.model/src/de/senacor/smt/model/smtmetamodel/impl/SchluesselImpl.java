/**
 */
package de.senacor.smt.model.smtmetamodel.impl;

import de.senacor.smt.model.smtmetamodel.Schluessel;
import de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schluessel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.SchluesselImpl#isSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.SchluesselImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchluesselImpl extends MinimalEObjectImpl.Container implements Schluessel {
	/**
	 * The default value of the '{@link #isSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEQUENCE_NUMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchluesselImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmtmetamodelPackage.Literals.SCHLUESSEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.SCHLUESSEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmtmetamodelPackage.SCHLUESSEL__SEQUENCE_NUMBER:
				return isSequenceNumber();
			case SmtmetamodelPackage.SCHLUESSEL__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmtmetamodelPackage.SCHLUESSEL__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmtmetamodelPackage.SCHLUESSEL__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmtmetamodelPackage.SCHLUESSEL__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case SmtmetamodelPackage.SCHLUESSEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchluesselImpl
