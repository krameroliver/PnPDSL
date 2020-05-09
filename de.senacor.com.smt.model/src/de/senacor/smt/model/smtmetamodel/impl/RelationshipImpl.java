/**
 */
package de.senacor.smt.model.smtmetamodel.impl;

import de.senacor.smt.model.smtmetamodel.Entity;
import de.senacor.smt.model.smtmetamodel.Relationship;
import de.senacor.smt.model.smtmetamodel.SmtmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.RelationshipImpl#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.RelationshipImpl#getToEntity <em>To Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
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
	 * The cached value of the '{@link #getToEntity() <em>To Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity toEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmtmetamodelPackage.Literals.RELATIONSHIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getFromEntity() {
		if (eContainerFeatureID() != SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromEntity(Entity newFromEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFromEntity, SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromEntity(Entity newFromEntity) {
		if (newFromEntity != eInternalContainer() || (eContainerFeatureID() != SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY && newFromEntity != null)) {
			if (EcoreUtil.isAncestor(this, newFromEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFromEntity != null)
				msgs = ((InternalEObject)newFromEntity).eInverseAdd(this, SmtmetamodelPackage.ENTITY__RELATIONSHIPS, Entity.class, msgs);
			msgs = basicSetFromEntity(newFromEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY, newFromEntity, newFromEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getToEntity() {
		if (toEntity != null && toEntity.eIsProxy()) {
			InternalEObject oldToEntity = (InternalEObject)toEntity;
			toEntity = (Entity)eResolveProxy(oldToEntity);
			if (toEntity != oldToEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmtmetamodelPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
			}
		}
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetToEntity() {
		return toEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToEntity(Entity newToEntity) {
		Entity oldToEntity = toEntity;
		toEntity = newToEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.RELATIONSHIP__TO_ENTITY, oldToEntity, toEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFromEntity((Entity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY:
				return basicSetFromEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY:
				return eInternalContainer().eInverseRemove(this, SmtmetamodelPackage.ENTITY__RELATIONSHIPS, Entity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmtmetamodelPackage.RELATIONSHIP__NAME:
				return getName();
			case SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY:
				return getFromEntity();
			case SmtmetamodelPackage.RELATIONSHIP__TO_ENTITY:
				if (resolve) return getToEntity();
				return basicGetToEntity();
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
			case SmtmetamodelPackage.RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY:
				setFromEntity((Entity)newValue);
				return;
			case SmtmetamodelPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)newValue);
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
			case SmtmetamodelPackage.RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY:
				setFromEntity((Entity)null);
				return;
			case SmtmetamodelPackage.RELATIONSHIP__TO_ENTITY:
				setToEntity((Entity)null);
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
			case SmtmetamodelPackage.RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmtmetamodelPackage.RELATIONSHIP__FROM_ENTITY:
				return getFromEntity() != null;
			case SmtmetamodelPackage.RELATIONSHIP__TO_ENTITY:
				return toEntity != null;
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

} //RelationshipImpl
