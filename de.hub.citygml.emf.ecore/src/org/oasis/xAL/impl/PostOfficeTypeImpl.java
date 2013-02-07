/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasis.xAL.AddressLineType;
import org.oasis.xAL.PostBoxType;
import org.oasis.xAL.PostOfficeNameType;
import org.oasis.xAL.PostOfficeNumberType;
import org.oasis.xAL.PostOfficeType;
import org.oasis.xAL.PostalCodeType;
import org.oasis.xAL.PostalRouteType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Office Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getPostOfficeName <em>Post Office Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getPostOfficeNumber <em>Post Office Number</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getPostalRoute <em>Postal Route</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostOfficeTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostOfficeTypeImpl extends EObjectImpl implements PostOfficeType {
	/**
	 * The cached value of the '{@link #getAddressLine() <em>Address Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLine()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressLineType> addressLine;

	/**
	 * The cached value of the '{@link #getPostOfficeName() <em>Post Office Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOfficeName()
	 * @generated
	 * @ordered
	 */
	protected EList<PostOfficeNameType> postOfficeName;

	/**
	 * The cached value of the '{@link #getPostOfficeNumber() <em>Post Office Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOfficeNumber()
	 * @generated
	 * @ordered
	 */
	protected PostOfficeNumberType postOfficeNumber;

	/**
	 * The cached value of the '{@link #getPostalRoute() <em>Postal Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalRoute()
	 * @generated
	 * @ordered
	 */
	protected PostalRouteType postalRoute;

	/**
	 * The cached value of the '{@link #getPostBox() <em>Post Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBox()
	 * @generated
	 * @ordered
	 */
	protected PostBoxType postBox;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected PostalCodeType postalCode;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getIndicator() <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final Object INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected Object indicator = INDICATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostOfficeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPostOfficeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.POST_OFFICE_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostOfficeNameType> getPostOfficeName() {
		if (postOfficeName == null) {
			postOfficeName = new EObjectContainmentEList<PostOfficeNameType>(PostOfficeNameType.class, this, XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NAME);
		}
		return postOfficeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostOfficeNumberType getPostOfficeNumber() {
		return postOfficeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostOfficeNumber(PostOfficeNumberType newPostOfficeNumber, NotificationChain msgs) {
		PostOfficeNumberType oldPostOfficeNumber = postOfficeNumber;
		postOfficeNumber = newPostOfficeNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER, oldPostOfficeNumber, newPostOfficeNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOfficeNumber(PostOfficeNumberType newPostOfficeNumber) {
		if (newPostOfficeNumber != postOfficeNumber) {
			NotificationChain msgs = null;
			if (postOfficeNumber != null)
				msgs = ((InternalEObject)postOfficeNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER, null, msgs);
			if (newPostOfficeNumber != null)
				msgs = ((InternalEObject)newPostOfficeNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER, null, msgs);
			msgs = basicSetPostOfficeNumber(newPostOfficeNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER, newPostOfficeNumber, newPostOfficeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalRouteType getPostalRoute() {
		return postalRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalRoute(PostalRouteType newPostalRoute, NotificationChain msgs) {
		PostalRouteType oldPostalRoute = postalRoute;
		postalRoute = newPostalRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE, oldPostalRoute, newPostalRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalRoute(PostalRouteType newPostalRoute) {
		if (newPostalRoute != postalRoute) {
			NotificationChain msgs = null;
			if (postalRoute != null)
				msgs = ((InternalEObject)postalRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE, null, msgs);
			if (newPostalRoute != null)
				msgs = ((InternalEObject)newPostalRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE, null, msgs);
			msgs = basicSetPostalRoute(newPostalRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE, newPostalRoute, newPostalRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxType getPostBox() {
		return postBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostBox(PostBoxType newPostBox, NotificationChain msgs) {
		PostBoxType oldPostBox = postBox;
		postBox = newPostBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POST_BOX, oldPostBox, newPostBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBox(PostBoxType newPostBox) {
		if (newPostBox != postBox) {
			NotificationChain msgs = null;
			if (postBox != null)
				msgs = ((InternalEObject)postBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POST_BOX, null, msgs);
			if (newPostBox != null)
				msgs = ((InternalEObject)newPostBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POST_BOX, null, msgs);
			msgs = basicSetPostBox(newPostBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POST_BOX, newPostBox, newPostBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalCodeType getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalCode(PostalCodeType newPostalCode, NotificationChain msgs) {
		PostalCodeType oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(PostalCodeType newPostalCode) {
		if (newPostalCode != postalCode) {
			NotificationChain msgs = null;
			if (postalCode != null)
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_OFFICE_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.POST_OFFICE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIndicator() {
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicator(Object newIndicator) {
		Object oldIndicator = indicator;
		indicator = newIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__INDICATOR, oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_OFFICE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.POST_OFFICE_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XALPackage.POST_OFFICE_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NAME:
				return ((InternalEList<?>)getPostOfficeName()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER:
				return basicSetPostOfficeNumber(null, msgs);
			case XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE:
				return basicSetPostalRoute(null, msgs);
			case XALPackage.POST_OFFICE_TYPE__POST_BOX:
				return basicSetPostBox(null, msgs);
			case XALPackage.POST_OFFICE_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case XALPackage.POST_OFFICE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_OFFICE_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case XALPackage.POST_OFFICE_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NAME:
				return getPostOfficeName();
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER:
				return getPostOfficeNumber();
			case XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE:
				return getPostalRoute();
			case XALPackage.POST_OFFICE_TYPE__POST_BOX:
				return getPostBox();
			case XALPackage.POST_OFFICE_TYPE__POSTAL_CODE:
				return getPostalCode();
			case XALPackage.POST_OFFICE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.POST_OFFICE_TYPE__INDICATOR:
				return getIndicator();
			case XALPackage.POST_OFFICE_TYPE__TYPE:
				return getType();
			case XALPackage.POST_OFFICE_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case XALPackage.POST_OFFICE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NAME:
				getPostOfficeName().clear();
				getPostOfficeName().addAll((Collection<? extends PostOfficeNameType>)newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER:
				setPostOfficeNumber((PostOfficeNumberType)newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE:
				setPostalRoute((PostalRouteType)newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__POST_BOX:
				setPostBox((PostBoxType)newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__INDICATOR:
				setIndicator(newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.POST_OFFICE_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case XALPackage.POST_OFFICE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NAME:
				getPostOfficeName().clear();
				return;
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER:
				setPostOfficeNumber((PostOfficeNumberType)null);
				return;
			case XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE:
				setPostalRoute((PostalRouteType)null);
				return;
			case XALPackage.POST_OFFICE_TYPE__POST_BOX:
				setPostBox((PostBoxType)null);
				return;
			case XALPackage.POST_OFFICE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case XALPackage.POST_OFFICE_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.POST_OFFICE_TYPE__INDICATOR:
				setIndicator(INDICATOR_EDEFAULT);
				return;
			case XALPackage.POST_OFFICE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.POST_OFFICE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case XALPackage.POST_OFFICE_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NAME:
				return postOfficeName != null && !postOfficeName.isEmpty();
			case XALPackage.POST_OFFICE_TYPE__POST_OFFICE_NUMBER:
				return postOfficeNumber != null;
			case XALPackage.POST_OFFICE_TYPE__POSTAL_ROUTE:
				return postalRoute != null;
			case XALPackage.POST_OFFICE_TYPE__POST_BOX:
				return postBox != null;
			case XALPackage.POST_OFFICE_TYPE__POSTAL_CODE:
				return postalCode != null;
			case XALPackage.POST_OFFICE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.POST_OFFICE_TYPE__INDICATOR:
				return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
			case XALPackage.POST_OFFICE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.POST_OFFICE_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (any: ");
		result.append(any);
		result.append(", indicator: ");
		result.append(indicator);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PostOfficeTypeImpl
