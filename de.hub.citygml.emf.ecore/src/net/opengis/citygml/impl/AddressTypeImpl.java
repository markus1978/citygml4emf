/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import net.opengis.citygml.AddressType;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.XalAddressPropertyType;
import net.opengis.gml.MultiPointPropertyType;
import net.opengis.gml.impl.AbstractFeatureTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.AddressTypeImpl#getXalAddress <em>Xal Address</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AddressTypeImpl#getMultiPoint <em>Multi Point</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AddressTypeImpl#getGenericApplicationPropertyOfAddressGroup <em>Generic Application Property Of Address Group</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AddressTypeImpl#getGenericApplicationPropertyOfAddress <em>Generic Application Property Of Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressTypeImpl extends AbstractFeatureTypeImpl implements AddressType {
	/**
	 * The cached value of the '{@link #getXalAddress() <em>Xal Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXalAddress()
	 * @generated
	 * @ordered
	 */
	protected XalAddressPropertyType xalAddress;

	/**
	 * The cached value of the '{@link #getMultiPoint() <em>Multi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiPoint()
	 * @generated
	 * @ordered
	 */
	protected MultiPointPropertyType multiPoint;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfAddressGroup() <em>Generic Application Property Of Address Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfAddressGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfAddressGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.ADDRESS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XalAddressPropertyType getXalAddress() {
		return xalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXalAddress(XalAddressPropertyType newXalAddress, NotificationChain msgs) {
		XalAddressPropertyType oldXalAddress = xalAddress;
		xalAddress = newXalAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS, oldXalAddress, newXalAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXalAddress(XalAddressPropertyType newXalAddress) {
		if (newXalAddress != xalAddress) {
			NotificationChain msgs = null;
			if (xalAddress != null)
				msgs = ((InternalEObject)xalAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS, null, msgs);
			if (newXalAddress != null)
				msgs = ((InternalEObject)newXalAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS, null, msgs);
			msgs = basicSetXalAddress(newXalAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS, newXalAddress, newXalAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointPropertyType getMultiPoint() {
		return multiPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPoint(MultiPointPropertyType newMultiPoint, NotificationChain msgs) {
		MultiPointPropertyType oldMultiPoint = multiPoint;
		multiPoint = newMultiPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitygmlPackage.ADDRESS_TYPE__MULTI_POINT, oldMultiPoint, newMultiPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPoint(MultiPointPropertyType newMultiPoint) {
		if (newMultiPoint != multiPoint) {
			NotificationChain msgs = null;
			if (multiPoint != null)
				msgs = ((InternalEObject)multiPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.ADDRESS_TYPE__MULTI_POINT, null, msgs);
			if (newMultiPoint != null)
				msgs = ((InternalEObject)newMultiPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.ADDRESS_TYPE__MULTI_POINT, null, msgs);
			msgs = basicSetMultiPoint(newMultiPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.ADDRESS_TYPE__MULTI_POINT, newMultiPoint, newMultiPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfAddressGroup() {
		if (genericApplicationPropertyOfAddressGroup == null) {
			genericApplicationPropertyOfAddressGroup = new BasicFeatureMap(this, CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP);
		}
		return genericApplicationPropertyOfAddressGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfAddress() {
		return getGenericApplicationPropertyOfAddressGroup().list(CitygmlPackage.Literals.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS:
				return basicSetXalAddress(null, msgs);
			case CitygmlPackage.ADDRESS_TYPE__MULTI_POINT:
				return basicSetMultiPoint(null, msgs);
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfAddressGroup()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS:
				return ((InternalEList<?>)getGenericApplicationPropertyOfAddress()).basicRemove(otherEnd, msgs);
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
			case CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS:
				return getXalAddress();
			case CitygmlPackage.ADDRESS_TYPE__MULTI_POINT:
				return getMultiPoint();
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP:
				if (coreType) return getGenericApplicationPropertyOfAddressGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfAddressGroup()).getWrapper();
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS:
				return getGenericApplicationPropertyOfAddress();
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
			case CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS:
				setXalAddress((XalAddressPropertyType)newValue);
				return;
			case CitygmlPackage.ADDRESS_TYPE__MULTI_POINT:
				setMultiPoint((MultiPointPropertyType)newValue);
				return;
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfAddressGroup()).set(newValue);
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
			case CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS:
				setXalAddress((XalAddressPropertyType)null);
				return;
			case CitygmlPackage.ADDRESS_TYPE__MULTI_POINT:
				setMultiPoint((MultiPointPropertyType)null);
				return;
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP:
				getGenericApplicationPropertyOfAddressGroup().clear();
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
			case CitygmlPackage.ADDRESS_TYPE__XAL_ADDRESS:
				return xalAddress != null;
			case CitygmlPackage.ADDRESS_TYPE__MULTI_POINT:
				return multiPoint != null;
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP:
				return genericApplicationPropertyOfAddressGroup != null && !genericApplicationPropertyOfAddressGroup.isEmpty();
			case CitygmlPackage.ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS:
				return !getGenericApplicationPropertyOfAddress().isEmpty();
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
		result.append(" (genericApplicationPropertyOfAddressGroup: ");
		result.append(genericApplicationPropertyOfAddressGroup);
		result.append(')');
		return result.toString();
	}

} //AddressTypeImpl
