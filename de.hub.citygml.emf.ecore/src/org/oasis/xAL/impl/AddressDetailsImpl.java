/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasis.xAL.AddressDetails;
import org.oasis.xAL.AddressLinesType;
import org.oasis.xAL.AddressType;
import org.oasis.xAL.AdministrativeAreaType;
import org.oasis.xAL.CountryType;
import org.oasis.xAL.LocalityType;
import org.oasis.xAL.PostalServiceElementsType;
import org.oasis.xAL.ThoroughfareType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getPostalServiceElements <em>Postal Service Elements</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getAddressLines <em>Address Lines</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getAddressDetailsKey <em>Address Details Key</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getCurrentStatus <em>Current Status</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getValidToDate <em>Valid To Date</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.AddressDetailsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressDetailsImpl extends EObjectImpl implements AddressDetails {
	/**
	 * The cached value of the '{@link #getPostalServiceElements() <em>Postal Service Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalServiceElements()
	 * @generated
	 * @ordered
	 */
	protected PostalServiceElementsType postalServiceElements;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType address;

	/**
	 * The cached value of the '{@link #getAddressLines() <em>Address Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLines()
	 * @generated
	 * @ordered
	 */
	protected AddressLinesType addressLines;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CountryType country;

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
	 * The default value of the '{@link #getAddressDetailsKey() <em>Address Details Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDetailsKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object ADDRESS_DETAILS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressDetailsKey() <em>Address Details Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDetailsKey()
	 * @generated
	 * @ordered
	 */
	protected Object addressDetailsKey = ADDRESS_DETAILS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Object ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected Object addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Object code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentStatus() <em>Current Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Object CURRENT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentStatus() <em>Current Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStatus()
	 * @generated
	 * @ordered
	 */
	protected Object currentStatus = CURRENT_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Object USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Object usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected Object validFromDate = VALID_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALID_TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected Object validToDate = VALID_TO_DATE_EDEFAULT;

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
	protected AddressDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getAddressDetails();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalServiceElementsType getPostalServiceElements() {
		return postalServiceElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalServiceElements(PostalServiceElementsType newPostalServiceElements, NotificationChain msgs) {
		PostalServiceElementsType oldPostalServiceElements = postalServiceElements;
		postalServiceElements = newPostalServiceElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS, oldPostalServiceElements, newPostalServiceElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalServiceElements(PostalServiceElementsType newPostalServiceElements) {
		if (newPostalServiceElements != postalServiceElements) {
			NotificationChain msgs = null;
			if (postalServiceElements != null)
				msgs = ((InternalEObject)postalServiceElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS, null, msgs);
			if (newPostalServiceElements != null)
				msgs = ((InternalEObject)newPostalServiceElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS, null, msgs);
			msgs = basicSetPostalServiceElements(newPostalServiceElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS, newPostalServiceElements, newPostalServiceElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		AddressType oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressType newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLinesType getAddressLines() {
		return addressLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressLines(AddressLinesType newAddressLines, NotificationChain msgs) {
		AddressLinesType oldAddressLines = addressLines;
		addressLines = newAddressLines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADDRESS_LINES, oldAddressLines, newAddressLines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressLines(AddressLinesType newAddressLines) {
		if (newAddressLines != addressLines) {
			NotificationChain msgs = null;
			if (addressLines != null)
				msgs = ((InternalEObject)addressLines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__ADDRESS_LINES, null, msgs);
			if (newAddressLines != null)
				msgs = ((InternalEObject)newAddressLines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__ADDRESS_LINES, null, msgs);
			msgs = basicSetAddressLines(newAddressLines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADDRESS_LINES, newAddressLines, newAddressLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryType getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CountryType newCountry, NotificationChain msgs) {
		CountryType oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__COUNTRY, oldCountry, newCountry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(CountryType newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__COUNTRY, newCountry, newCountry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA, oldAdministrativeArea, newAdministrativeArea);
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
				msgs = ((InternalEObject)administrativeArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA, null, msgs);
			if (newAdministrativeArea != null)
				msgs = ((InternalEObject)newAdministrativeArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA, null, msgs);
			msgs = basicSetAdministrativeArea(newAdministrativeArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA, newAdministrativeArea, newAdministrativeArea));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__LOCALITY, oldLocality, newLocality);
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
				msgs = ((InternalEObject)locality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__LOCALITY, null, msgs);
			if (newLocality != null)
				msgs = ((InternalEObject)newLocality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__LOCALITY, null, msgs);
			msgs = basicSetLocality(newLocality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__LOCALITY, newLocality, newLocality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__THOROUGHFARE, oldThoroughfare, newThoroughfare);
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
				msgs = ((InternalEObject)thoroughfare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__THOROUGHFARE, null, msgs);
			if (newThoroughfare != null)
				msgs = ((InternalEObject)newThoroughfare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.ADDRESS_DETAILS__THOROUGHFARE, null, msgs);
			msgs = basicSetThoroughfare(newThoroughfare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__THOROUGHFARE, newThoroughfare, newThoroughfare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.ADDRESS_DETAILS__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAddressDetailsKey() {
		return addressDetailsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressDetailsKey(Object newAddressDetailsKey) {
		Object oldAddressDetailsKey = addressDetailsKey;
		addressDetailsKey = newAddressDetailsKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADDRESS_DETAILS_KEY, oldAddressDetailsKey, addressDetailsKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressType(Object newAddressType) {
		Object oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Object newCode) {
		Object oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCurrentStatus() {
		return currentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStatus(Object newCurrentStatus) {
		Object oldCurrentStatus = currentStatus;
		currentStatus = newCurrentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__CURRENT_STATUS, oldCurrentStatus, currentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(Object newUsage) {
		Object oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFromDate(Object newValidFromDate) {
		Object oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValidToDate() {
		return validToDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidToDate(Object newValidToDate) {
		Object oldValidToDate = validToDate;
		validToDate = newValidToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.ADDRESS_DETAILS__VALID_TO_DATE, oldValidToDate, validToDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.ADDRESS_DETAILS__ANY_ATTRIBUTE);
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
			case XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS:
				return basicSetPostalServiceElements(null, msgs);
			case XALPackage.ADDRESS_DETAILS__ADDRESS:
				return basicSetAddress(null, msgs);
			case XALPackage.ADDRESS_DETAILS__ADDRESS_LINES:
				return basicSetAddressLines(null, msgs);
			case XALPackage.ADDRESS_DETAILS__COUNTRY:
				return basicSetCountry(null, msgs);
			case XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA:
				return basicSetAdministrativeArea(null, msgs);
			case XALPackage.ADDRESS_DETAILS__LOCALITY:
				return basicSetLocality(null, msgs);
			case XALPackage.ADDRESS_DETAILS__THOROUGHFARE:
				return basicSetThoroughfare(null, msgs);
			case XALPackage.ADDRESS_DETAILS__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.ADDRESS_DETAILS__ANY_ATTRIBUTE:
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
			case XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS:
				return getPostalServiceElements();
			case XALPackage.ADDRESS_DETAILS__ADDRESS:
				return getAddress();
			case XALPackage.ADDRESS_DETAILS__ADDRESS_LINES:
				return getAddressLines();
			case XALPackage.ADDRESS_DETAILS__COUNTRY:
				return getCountry();
			case XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA:
				return getAdministrativeArea();
			case XALPackage.ADDRESS_DETAILS__LOCALITY:
				return getLocality();
			case XALPackage.ADDRESS_DETAILS__THOROUGHFARE:
				return getThoroughfare();
			case XALPackage.ADDRESS_DETAILS__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.ADDRESS_DETAILS__ADDRESS_DETAILS_KEY:
				return getAddressDetailsKey();
			case XALPackage.ADDRESS_DETAILS__ADDRESS_TYPE:
				return getAddressType();
			case XALPackage.ADDRESS_DETAILS__CODE:
				return getCode();
			case XALPackage.ADDRESS_DETAILS__CURRENT_STATUS:
				return getCurrentStatus();
			case XALPackage.ADDRESS_DETAILS__USAGE:
				return getUsage();
			case XALPackage.ADDRESS_DETAILS__VALID_FROM_DATE:
				return getValidFromDate();
			case XALPackage.ADDRESS_DETAILS__VALID_TO_DATE:
				return getValidToDate();
			case XALPackage.ADDRESS_DETAILS__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS:
				setPostalServiceElements((PostalServiceElementsType)newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS:
				setAddress((AddressType)newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS_LINES:
				setAddressLines((AddressLinesType)newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__COUNTRY:
				setCountry((CountryType)newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA:
				setAdministrativeArea((AdministrativeAreaType)newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__LOCALITY:
				setLocality((LocalityType)newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS_DETAILS_KEY:
				setAddressDetailsKey(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS_TYPE:
				setAddressType(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__CODE:
				setCode(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__CURRENT_STATUS:
				setCurrentStatus(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__USAGE:
				setUsage(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__VALID_FROM_DATE:
				setValidFromDate(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__VALID_TO_DATE:
				setValidToDate(newValue);
				return;
			case XALPackage.ADDRESS_DETAILS__ANY_ATTRIBUTE:
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
			case XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS:
				setPostalServiceElements((PostalServiceElementsType)null);
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS:
				setAddress((AddressType)null);
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS_LINES:
				setAddressLines((AddressLinesType)null);
				return;
			case XALPackage.ADDRESS_DETAILS__COUNTRY:
				setCountry((CountryType)null);
				return;
			case XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA:
				setAdministrativeArea((AdministrativeAreaType)null);
				return;
			case XALPackage.ADDRESS_DETAILS__LOCALITY:
				setLocality((LocalityType)null);
				return;
			case XALPackage.ADDRESS_DETAILS__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)null);
				return;
			case XALPackage.ADDRESS_DETAILS__ANY:
				getAny().clear();
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS_DETAILS_KEY:
				setAddressDetailsKey(ADDRESS_DETAILS_KEY_EDEFAULT);
				return;
			case XALPackage.ADDRESS_DETAILS__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
				return;
			case XALPackage.ADDRESS_DETAILS__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XALPackage.ADDRESS_DETAILS__CURRENT_STATUS:
				setCurrentStatus(CURRENT_STATUS_EDEFAULT);
				return;
			case XALPackage.ADDRESS_DETAILS__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case XALPackage.ADDRESS_DETAILS__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case XALPackage.ADDRESS_DETAILS__VALID_TO_DATE:
				setValidToDate(VALID_TO_DATE_EDEFAULT);
				return;
			case XALPackage.ADDRESS_DETAILS__ANY_ATTRIBUTE:
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
			case XALPackage.ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS:
				return postalServiceElements != null;
			case XALPackage.ADDRESS_DETAILS__ADDRESS:
				return address != null;
			case XALPackage.ADDRESS_DETAILS__ADDRESS_LINES:
				return addressLines != null;
			case XALPackage.ADDRESS_DETAILS__COUNTRY:
				return country != null;
			case XALPackage.ADDRESS_DETAILS__ADMINISTRATIVE_AREA:
				return administrativeArea != null;
			case XALPackage.ADDRESS_DETAILS__LOCALITY:
				return locality != null;
			case XALPackage.ADDRESS_DETAILS__THOROUGHFARE:
				return thoroughfare != null;
			case XALPackage.ADDRESS_DETAILS__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.ADDRESS_DETAILS__ADDRESS_DETAILS_KEY:
				return ADDRESS_DETAILS_KEY_EDEFAULT == null ? addressDetailsKey != null : !ADDRESS_DETAILS_KEY_EDEFAULT.equals(addressDetailsKey);
			case XALPackage.ADDRESS_DETAILS__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
			case XALPackage.ADDRESS_DETAILS__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XALPackage.ADDRESS_DETAILS__CURRENT_STATUS:
				return CURRENT_STATUS_EDEFAULT == null ? currentStatus != null : !CURRENT_STATUS_EDEFAULT.equals(currentStatus);
			case XALPackage.ADDRESS_DETAILS__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case XALPackage.ADDRESS_DETAILS__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case XALPackage.ADDRESS_DETAILS__VALID_TO_DATE:
				return VALID_TO_DATE_EDEFAULT == null ? validToDate != null : !VALID_TO_DATE_EDEFAULT.equals(validToDate);
			case XALPackage.ADDRESS_DETAILS__ANY_ATTRIBUTE:
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
		result.append(", addressDetailsKey: ");
		result.append(addressDetailsKey);
		result.append(", addressType: ");
		result.append(addressType);
		result.append(", code: ");
		result.append(code);
		result.append(", currentStatus: ");
		result.append(currentStatus);
		result.append(", usage: ");
		result.append(usage);
		result.append(", validFromDate: ");
		result.append(validFromDate);
		result.append(", validToDate: ");
		result.append(validToDate);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AddressDetailsImpl
