/**
 */
package de.senacor.smt.model.smtmetamodel.impl;

import de.senacor.smt.model.smtmetamodel.Entity;
import de.senacor.smt.model.smtmetamodel.SchluesselDomain;
import de.senacor.smt.model.smtmetamodel.SchluesselFeld;
import de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schluessel Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.SchluesselDomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.SchluesselDomainImpl#getSchluesselfeld <em>Schluesselfeld</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.SchluesselDomainImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchluesselDomainImpl extends MinimalEObjectImpl.Container implements SchluesselDomain {
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
	 * The cached value of the '{@link #getSchluesselfeld() <em>Schluesselfeld</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchluesselfeld()
	 * @generated
	 * @ordered
	 */
	protected EList<SchluesselFeld> schluesselfeld;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchluesselDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmtmetamodelPackage.Literals.SCHLUESSEL_DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.SCHLUESSEL_DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchluesselFeld> getSchluesselfeld() {
		if (schluesselfeld == null) {
			schluesselfeld = new EObjectContainmentEList<SchluesselFeld>(SchluesselFeld.class, this, SmtmetamodelPackage.SCHLUESSEL_DOMAIN__SCHLUESSELFELD);
		}
		return schluesselfeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmtmetamodelPackage.SCHLUESSEL_DOMAIN__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.SCHLUESSEL_DOMAIN__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__SCHLUESSELFELD:
				return ((InternalEList<?>)getSchluesselfeld()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__NAME:
				return getName();
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__SCHLUESSELFELD:
				return getSchluesselfeld();
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__NAME:
				setName((String)newValue);
				return;
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__SCHLUESSELFELD:
				getSchluesselfeld().clear();
				getSchluesselfeld().addAll((Collection<? extends SchluesselFeld>)newValue);
				return;
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__ENTITY:
				setEntity((Entity)newValue);
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
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__SCHLUESSELFELD:
				getSchluesselfeld().clear();
				return;
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__ENTITY:
				setEntity((Entity)null);
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
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__SCHLUESSELFELD:
				return schluesselfeld != null && !schluesselfeld.isEmpty();
			case SmtmetamodelPackage.SCHLUESSEL_DOMAIN__ENTITY:
				return entity != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchluesselDomainImpl
