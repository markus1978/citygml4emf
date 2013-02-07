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
import org.oasis.xAL.AdministrativeAreaType;
import org.oasis.xAL.CountryNameCodeType;
import org.oasis.xAL.CountryNameType;
import org.oasis.xAL.CountryType;
import org.oasis.xAL.LocalityType;
import org.oasis.xAL.ThoroughfareType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getCountryNameCode <em>Country Name Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.CountryTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CountryTypeImpl extends EObjectImpl implements CountryType {
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
	 * The cached value of the '{@link #getCountryNameCode() <em>Country Name Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryNameCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CountryNameCodeType> countryNameCode;

	/**
	 * The cached value of the '{@link #getCountryName() <em>Country Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryName()
	 * @generated
	 * @ordered
	 */
	protected EList<CountryNameType> countryName;

	/**
	 * The cached value of the '{@link #getAdministrativeArea() <em>Administrative Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrativeArea()
	 * @generated
	 * @ordered
	 */
	protected AdministrativeAreaType administrativeArea;

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
	 * The cached value of the '{@link #getThoroughfare() <em>Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfare()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareType thoroughfare;

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
	protected CountryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getCountryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.COUNTRY_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CountryNameCodeType> getCountryNameCode() {
		if (countryNameCode == null) {
			countryNameCode = new EObjectContainmentEList<CountryNameCodeType>(CountryNameCodeType.class, this, XALPackage.COUNTRY_TYPE__COUNTRY_NAME_CODE);
		}
		return countryNameCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CountryNameType> getCountryName() {
		if (countryName == null) {
			countryName = new EObjectContainmentEList<CountryNameType>(CountryNameType.class, this, XALPackage.COUNTRY_TYPE__COUNTRY_NAME);
		}
		return countryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeAreaType getAdministrativeArea() {
		return administrativeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrativeArea(AdministrativeAreaType newAdministrativeArea, NotificationChain msgs) {
		AdministrativeAreaType oldAdministrativeArea = administrativeArea;
		administrativeArea = newAdministrativeArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA, oldAdministrativeArea, newAdministrativeArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrativeArea(AdministrativeAreaType newAdministrativeArea) {
		if (newAdministrativeArea != administrativeArea) {
			NotificationChain msgs = null;
			if (administrativeArea != null)
				msgs = ((InternalEObject)administrativeArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA, null, msgs);
			if (newAdministrativeArea != null)
				msgs = ((InternalEObject)newAdministrativeArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA, null, msgs);
			msgs = basicSetAdministrativeArea(newAdministrativeArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA, newAdministrativeArea, newAdministrativeArea));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.COUNTRY_TYPE__LOCALITY, oldLocality, newLocality);
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
				msgs = ((InternalEObject)locality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.COUNTRY_TYPE__LOCALITY, null, msgs);
			if (newLocality != null)
				msgs = ((InternalEObject)newLocality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.COUNTRY_TYPE__LOCALITY, null, msgs);
			msgs = basicSetLocality(newLocality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.COUNTRY_TYPE__LOCALITY, newLocality, newLocality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareType getThoroughfare() {
		return thoroughfare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfare(ThoroughfareType newThoroughfare, NotificationChain msgs) {
		ThoroughfareType oldThoroughfare = thoroughfare;
		thoroughfare = newThoroughfare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.COUNTRY_TYPE__THOROUGHFARE, oldThoroughfare, newThoroughfare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfare(ThoroughfareType newThoroughfare) {
		if (newThoroughfare != thoroughfare) {
			NotificationChain msgs = null;
			if (thoroughfare != null)
				msgs = ((InternalEObject)thoroughfare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.COUNTRY_TYPE__THOROUGHFARE, null, msgs);
			if (newThoroughfare != null)
				msgs = ((InternalEObject)newThoroughfare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.COUNTRY_TYPE__THOROUGHFARE, null, msgs);
			msgs = basicSetThoroughfare(newThoroughfare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.COUNTRY_TYPE__THOROUGHFARE, newThoroughfare, newThoroughfare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.COUNTRY_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.COUNTRY_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.COUNTRY_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME_CODE:
				return ((InternalEList<?>)getCountryNameCode()).basicRemove(otherEnd, msgs);
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME:
				return ((InternalEList<?>)getCountryName()).basicRemove(otherEnd, msgs);
			case XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA:
				return basicSetAdministrativeArea(null, msgs);
			case XALPackage.COUNTRY_TYPE__LOCALITY:
				return basicSetLocality(null, msgs);
			case XALPackage.COUNTRY_TYPE__THOROUGHFARE:
				return basicSetThoroughfare(null, msgs);
			case XALPackage.COUNTRY_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.COUNTRY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.COUNTRY_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME_CODE:
				return getCountryNameCode();
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME:
				return getCountryName();
			case XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA:
				return getAdministrativeArea();
			case XALPackage.COUNTRY_TYPE__LOCALITY:
				return getLocality();
			case XALPackage.COUNTRY_TYPE__THOROUGHFARE:
				return getThoroughfare();
			case XALPackage.COUNTRY_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.COUNTRY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.COUNTRY_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME_CODE:
				getCountryNameCode().clear();
				getCountryNameCode().addAll((Collection<? extends CountryNameCodeType>)newValue);
				return;
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME:
				getCountryName().clear();
				getCountryName().addAll((Collection<? extends CountryNameType>)newValue);
				return;
			case XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA:
				setAdministrativeArea((AdministrativeAreaType)newValue);
				return;
			case XALPackage.COUNTRY_TYPE__LOCALITY:
				setLocality((LocalityType)newValue);
				return;
			case XALPackage.COUNTRY_TYPE__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)newValue);
				return;
			case XALPackage.COUNTRY_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.COUNTRY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.COUNTRY_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME_CODE:
				getCountryNameCode().clear();
				return;
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME:
				getCountryName().clear();
				return;
			case XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA:
				setAdministrativeArea((AdministrativeAreaType)null);
				return;
			case XALPackage.COUNTRY_TYPE__LOCALITY:
				setLocality((LocalityType)null);
				return;
			case XALPackage.COUNTRY_TYPE__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)null);
				return;
			case XALPackage.COUNTRY_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.COUNTRY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.COUNTRY_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME_CODE:
				return countryNameCode != null && !countryNameCode.isEmpty();
			case XALPackage.COUNTRY_TYPE__COUNTRY_NAME:
				return countryName != null && !countryName.isEmpty();
			case XALPackage.COUNTRY_TYPE__ADMINISTRATIVE_AREA:
				return administrativeArea != null;
			case XALPackage.COUNTRY_TYPE__LOCALITY:
				return locality != null;
			case XALPackage.COUNTRY_TYPE__THOROUGHFARE:
				return thoroughfare != null;
			case XALPackage.COUNTRY_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.COUNTRY_TYPE__ANY_ATTRIBUTE:
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
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CountryTypeImpl
