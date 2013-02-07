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
import org.oasis.xAL.AdministrativeAreaNameType;
import org.oasis.xAL.AdministrativeAreaType;
import org.oasis.xAL.LocalityType;
import org.oasis.xAL.PostOfficeType;
import org.oasis.xAL.PostalCodeType;
import org.oasis.xAL.SubAdministrativeAreaType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrative Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getAdministrativeAreaName <em>Administrative Area Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getSubAdministrativeArea <em>Sub Administrative Area</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getPostOffice <em>Post Office</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdministrativeAreaTypeImpl extends EObjectImpl implements AdministrativeAreaType {
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
	 * The cached value of the '{@link #getAdministrativeAreaName() <em>Administrative Area Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeAreaName()
	 * @generated
	 * @ordered
	 */
	protected EList<AdministrativeAreaNameType> administrativeAreaName;

	/**
	 * The cached value of the '{@link #getSubAdministrativeArea() <em>Sub Administrative Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAdministrativeArea()
	 * @generated
	 * @ordered
	 */
	protected SubAdministrativeAreaType subAdministrativeArea;

	/**
	 * The cached value of the '{@link #getLocality() <em>Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocality()
	 * @generated
	 * @ordered
	 */
	protected LocalityType locality;

	/**
	 * The cached value of the '{@link #getPostOffice() <em>Post Office</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOffice()
	 * @generated
	 * @ordered
	 */
	protected PostOfficeType postOffice;

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
	 * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected static final Object USAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected Object usageType = USAGE_TYPE_EDEFAULT;

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
	protected AdministrativeAreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getAdministrativeAreaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdministrativeAreaNameType> getAdministrativeAreaName() {
		if (administrativeAreaName == null) {
			administrativeAreaName = new EObjectContainmentEList<AdministrativeAreaNameType>(AdministrativeAreaNameType.class, this, XALPackage.ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME);
		}
		return administrativeAreaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAdministrativeAreaType getSubAdministrativeArea() {
		return subAdministrativeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubAdministrativeArea(SubAdministrativeAreaType newSubAdministrativeArea, NotificationChain msgs) {
		SubAdministrativeAreaType oldSubAdministrativeArea = subAdministrativeArea;
		subAdministrativeArea = newSubAdministrativeArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA, oldSubAdministrativeArea, newSubAdministrativeArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubAdministrativeArea(SubAdministrativeAreaType newSubAdministrativeArea) {
		if (newSubAdministrativeArea != subAdministrativeArea) {
			NotificationChain msgs = null;
			if (subAdministrativeArea != null)
				msgs = ((InternalEObject)subAdministrativeArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA, null, msgs);
			if (newSubAdministrativeArea != null)
				msgs = ((InternalEObject)newSubAdministrativeArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA, null, msgs);
			msgs = basicSetSubAdministrativeArea(newSubAdministrativeArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA, newSubAdministrativeArea, newSubAdministrativeArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityType getLocality() {
		return locality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocality(LocalityType newLocality, NotificationChain msgs) {
		LocalityType oldLocality = locality;
		locality = newLocality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY, oldLocality, newLocality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocality(LocalityType newLocality) {
		if (newLocality != locality) {
			NotificationChain msgs = null;
			if (locality != null)
				msgs = ((InternalEObject)locality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY, null, msgs);
			if (newLocality != null)
				msgs = ((InternalEObject)newLocality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY, null, msgs);
			msgs = basicSetLocality(newLocality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY, newLocality, newLocality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostOfficeType getPostOffice() {
		return postOffice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostOffice(PostOfficeType newPostOffice, NotificationChain msgs) {
		PostOfficeType oldPostOffice = postOffice;
		postOffice = newPostOffice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE, oldPostOffice, newPostOffice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOffice(PostOfficeType newPostOffice) {
		if (newPostOffice != postOffice) {
			NotificationChain msgs = null;
			if (postOffice != null)
				msgs = ((InternalEObject)postOffice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE, null, msgs);
			if (newPostOffice != null)
				msgs = ((InternalEObject)newPostOffice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE, null, msgs);
			msgs = basicSetPostOffice(newPostOffice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE, newPostOffice, newPostOffice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
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
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__INDICATOR, oldIndicator, indicator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUsageType() {
		return usageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageType(Object newUsageType) {
		Object oldUsageType = usageType;
		usageType = newUsageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE, oldUsageType, usageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME:
				return ((InternalEList<?>)getAdministrativeAreaName()).basicRemove(otherEnd, msgs);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA:
				return basicSetSubAdministrativeArea(null, msgs);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY:
				return basicSetLocality(null, msgs);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE:
				return basicSetPostOffice(null, msgs);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME:
				return getAdministrativeAreaName();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA:
				return getSubAdministrativeArea();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY:
				return getLocality();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE:
				return getPostOffice();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE:
				return getPostalCode();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__INDICATOR:
				return getIndicator();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__TYPE:
				return getType();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE:
				return getUsageType();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME:
				getAdministrativeAreaName().clear();
				getAdministrativeAreaName().addAll((Collection<? extends AdministrativeAreaNameType>)newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA:
				setSubAdministrativeArea((SubAdministrativeAreaType)newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY:
				setLocality((LocalityType)newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE:
				setPostOffice((PostOfficeType)newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__INDICATOR:
				setIndicator(newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE:
				setUsageType(newValue);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME:
				getAdministrativeAreaName().clear();
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA:
				setSubAdministrativeArea((SubAdministrativeAreaType)null);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY:
				setLocality((LocalityType)null);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE:
				setPostOffice((PostOfficeType)null);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__INDICATOR:
				setIndicator(INDICATOR_EDEFAULT);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE:
				setUsageType(USAGE_TYPE_EDEFAULT);
				return;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME:
				return administrativeAreaName != null && !administrativeAreaName.isEmpty();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA:
				return subAdministrativeArea != null;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__LOCALITY:
				return locality != null;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POST_OFFICE:
				return postOffice != null;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE:
				return postalCode != null;
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__INDICATOR:
				return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE:
				return USAGE_TYPE_EDEFAULT == null ? usageType != null : !USAGE_TYPE_EDEFAULT.equals(usageType);
			case XALPackage.ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE:
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
		result.append(", usageType: ");
		result.append(usageType);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AdministrativeAreaTypeImpl
