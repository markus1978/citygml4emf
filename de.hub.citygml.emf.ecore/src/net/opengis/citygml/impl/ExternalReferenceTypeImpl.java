/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.ExternalObjectReferenceType;
import net.opengis.citygml.ExternalReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.ExternalReferenceTypeImpl#getInformationSystem <em>Information System</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.ExternalReferenceTypeImpl#getExternalObject <em>External Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalReferenceTypeImpl extends EObjectImpl implements ExternalReferenceType {
	/**
	 * The default value of the '{@link #getInformationSystem() <em>Information System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformationSystem() <em>Information System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSystem()
	 * @generated
	 * @ordered
	 */
	protected String informationSystem = INFORMATION_SYSTEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalObject() <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalObject()
	 * @generated
	 * @ordered
	 */
	protected ExternalObjectReferenceType externalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.EXTERNAL_REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformationSystem() {
		return informationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationSystem(String newInformationSystem) {
		String oldInformationSystem = informationSystem;
		informationSystem = newInformationSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM, oldInformationSystem, informationSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObjectReferenceType getExternalObject() {
		return externalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalObject(ExternalObjectReferenceType newExternalObject, NotificationChain msgs) {
		ExternalObjectReferenceType oldExternalObject = externalObject;
		externalObject = newExternalObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT, oldExternalObject, newExternalObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalObject(ExternalObjectReferenceType newExternalObject) {
		if (newExternalObject != externalObject) {
			NotificationChain msgs = null;
			if (externalObject != null)
				msgs = ((InternalEObject)externalObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT, null, msgs);
			if (newExternalObject != null)
				msgs = ((InternalEObject)newExternalObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT, null, msgs);
			msgs = basicSetExternalObject(newExternalObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT, newExternalObject, newExternalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT:
				return basicSetExternalObject(null, msgs);
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
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM:
				return getInformationSystem();
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT:
				return getExternalObject();
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
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM:
				setInformationSystem((String)newValue);
				return;
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT:
				setExternalObject((ExternalObjectReferenceType)newValue);
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
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM:
				setInformationSystem(INFORMATION_SYSTEM_EDEFAULT);
				return;
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT:
				setExternalObject((ExternalObjectReferenceType)null);
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
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM:
				return INFORMATION_SYSTEM_EDEFAULT == null ? informationSystem != null : !INFORMATION_SYSTEM_EDEFAULT.equals(informationSystem);
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT:
				return externalObject != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (informationSystem: ");
		result.append(informationSystem);
		result.append(')');
		return result.toString();
	}

} //ExternalReferenceTypeImpl
