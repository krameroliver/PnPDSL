/**
 */
package de.senacor.smt.model.smtmetamodel.impl;

import de.senacor.smt.model.smtmetamodel.DataType;
import de.senacor.smt.model.smtmetamodel.Entity;
import de.senacor.smt.model.smtmetamodel.Field;
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
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.FieldImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.FieldImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.FieldImpl#getPreciscion <em>Preciscion</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.FieldImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link de.senacor.smt.model.smtmetamodel.impl.FieldImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType TYPE_EDEFAULT = DataType.NOT_SET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreciscion() <em>Preciscion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreciscion()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISCION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPreciscion() <em>Preciscion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreciscion()
	 * @generated
	 * @ordered
	 */
	protected int preciscion = PRECISCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected int scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmtmetamodelPackage.Literals.FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (eContainerFeatureID() != SmtmetamodelPackage.FIELD__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, SmtmetamodelPackage.FIELD__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != SmtmetamodelPackage.FIELD__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, SmtmetamodelPackage.ENTITY__FIELDS, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.FIELD__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.FIELD__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPreciscion() {
		return preciscion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreciscion(int newPreciscion) {
		int oldPreciscion = preciscion;
		preciscion = newPreciscion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.FIELD__PRECISCION, oldPreciscion, preciscion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(int newScale) {
		int oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.FIELD__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmtmetamodelPackage.FIELD__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmtmetamodelPackage.FIELD__ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntity((Entity)otherEnd, msgs);
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
			case SmtmetamodelPackage.FIELD__ENTITY:
				return basicSetEntity(null, msgs);
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
			case SmtmetamodelPackage.FIELD__ENTITY:
				return eInternalContainer().eInverseRemove(this, SmtmetamodelPackage.ENTITY__FIELDS, Entity.class, msgs);
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
			case SmtmetamodelPackage.FIELD__NAME:
				return getName();
			case SmtmetamodelPackage.FIELD__ENTITY:
				return getEntity();
			case SmtmetamodelPackage.FIELD__TYPE:
				return getType();
			case SmtmetamodelPackage.FIELD__LENGTH:
				return getLength();
			case SmtmetamodelPackage.FIELD__PRECISCION:
				return getPreciscion();
			case SmtmetamodelPackage.FIELD__SCALE:
				return getScale();
			case SmtmetamodelPackage.FIELD__KEY:
				return getKey();
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
			case SmtmetamodelPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case SmtmetamodelPackage.FIELD__ENTITY:
				setEntity((Entity)newValue);
				return;
			case SmtmetamodelPackage.FIELD__TYPE:
				setType((DataType)newValue);
				return;
			case SmtmetamodelPackage.FIELD__LENGTH:
				setLength((Integer)newValue);
				return;
			case SmtmetamodelPackage.FIELD__PRECISCION:
				setPreciscion((Integer)newValue);
				return;
			case SmtmetamodelPackage.FIELD__SCALE:
				setScale((Integer)newValue);
				return;
			case SmtmetamodelPackage.FIELD__KEY:
				setKey((String)newValue);
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
			case SmtmetamodelPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmtmetamodelPackage.FIELD__ENTITY:
				setEntity((Entity)null);
				return;
			case SmtmetamodelPackage.FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SmtmetamodelPackage.FIELD__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case SmtmetamodelPackage.FIELD__PRECISCION:
				setPreciscion(PRECISCION_EDEFAULT);
				return;
			case SmtmetamodelPackage.FIELD__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case SmtmetamodelPackage.FIELD__KEY:
				setKey(KEY_EDEFAULT);
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
			case SmtmetamodelPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmtmetamodelPackage.FIELD__ENTITY:
				return getEntity() != null;
			case SmtmetamodelPackage.FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case SmtmetamodelPackage.FIELD__LENGTH:
				return length != LENGTH_EDEFAULT;
			case SmtmetamodelPackage.FIELD__PRECISCION:
				return preciscion != PRECISCION_EDEFAULT;
			case SmtmetamodelPackage.FIELD__SCALE:
				return scale != SCALE_EDEFAULT;
			case SmtmetamodelPackage.FIELD__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
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
		result.append(", type: ");
		result.append(type);
		result.append(", length: ");
		result.append(length);
		result.append(", preciscion: ");
		result.append(preciscion);
		result.append(", scale: ");
		result.append(scale);
		result.append(", Key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
