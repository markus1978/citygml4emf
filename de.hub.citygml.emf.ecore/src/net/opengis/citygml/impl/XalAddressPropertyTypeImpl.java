/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.XalAddressPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasis.xAL.AddressDetails;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xal Address Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.XalAddressPropertyTypeImpl#getAddressDetails <em>Address Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XalAddressPropertyTypeImpl extends EObjectImpl implements XalAddressPropertyType {
	/**
	 * The cached value of the '{@link #getAddressDetails() <em>Address Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDetails()
	 * @generated
	 * @ordered
	 */
	protected AddressDetails addressDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XalAddressPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.XAL_ADDRESS_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressDetails(AddressDetails newAddressDetails, NotificationChain msgs) {
		AddressDetails oldAddressDetails = addressDetails;
		addressDetails = newAddressDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS, oldAddressDetails, newAddressDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressDetails(AddressDetails newAddressDetails) {
		if (newAddressDetails != addressDetails) {
			NotificationChain msgs = null;
			if (addressDetails != null)
				msgs = ((InternalEObject)addressDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS, null, msgs);
			if (newAddressDetails != null)
				msgs = ((InternalEObject)newAddressDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS, null, msgs);
			msgs = basicSetAddressDetails(newAddressDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS, newAddressDetails, newAddressDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS:
				return basicSetAddressDetails(null, msgs);
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
			case CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS:
				return getAddressDetails();
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
			case CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS:
				setAddressDetails((AddressDetails)newValue);
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
			case CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS:
				setAddressDetails((AddressDetails)null);
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
			case CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS:
				return addressDetails != null;
		}
		return super.eIsSet(featureID);
	}

} //XalAddressPropertyTypeImpl
