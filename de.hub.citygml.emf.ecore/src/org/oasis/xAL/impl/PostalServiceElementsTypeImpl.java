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
import org.oasis.xAL.AddressIdentifierType;
import org.oasis.xAL.AddressLatitudeDirectionType;
import org.oasis.xAL.AddressLatitudeType;
import org.oasis.xAL.AddressLongitudeDirectionType;
import org.oasis.xAL.AddressLongitudeType;
import org.oasis.xAL.BarcodeType;
import org.oasis.xAL.EndorsementLineCodeType;
import org.oasis.xAL.KeyLineCodeType;
import org.oasis.xAL.PostalServiceElementsType;
import org.oasis.xAL.SortingCodeType;
import org.oasis.xAL.SupplementaryPostalServiceDataType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Service Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getAddressIdentifier <em>Address Identifier</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getEndorsementLineCode <em>Endorsement Line Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getKeyLineCode <em>Key Line Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getSortingCode <em>Sorting Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getAddressLatitude <em>Address Latitude</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getAddressLatitudeDirection <em>Address Latitude Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getAddressLongitude <em>Address Longitude</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getAddressLongitudeDirection <em>Address Longitude Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getSupplementaryPostalServiceData <em>Supplementary Postal Service Data</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostalServiceElementsTypeImpl extends EObjectImpl implements PostalServiceElementsType {
	/**
	 * The cached value of the '{@link #getAddressIdentifier() <em>Address Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressIdentifierType> addressIdentifier;

	/**
	 * The cached value of the '{@link #getEndorsementLineCode() <em>Endorsement Line Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndorsementLineCode()
	 * @generated
	 * @ordered
	 */
	protected EndorsementLineCodeType endorsementLineCode;

	/**
	 * The cached value of the '{@link #getKeyLineCode() <em>Key Line Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLineCode()
	 * @generated
	 * @ordered
	 */
	protected KeyLineCodeType keyLineCode;

	/**
	 * The cached value of the '{@link #getBarcode() <em>Barcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcode()
	 * @generated
	 * @ordered
	 */
	protected BarcodeType barcode;

	/**
	 * The cached value of the '{@link #getSortingCode() <em>Sorting Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortingCode()
	 * @generated
	 * @ordered
	 */
	protected SortingCodeType sortingCode;

	/**
	 * The cached value of the '{@link #getAddressLatitude() <em>Address Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLatitude()
	 * @generated
	 * @ordered
	 */
	protected AddressLatitudeType addressLatitude;

	/**
	 * The cached value of the '{@link #getAddressLatitudeDirection() <em>Address Latitude Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLatitudeDirection()
	 * @generated
	 * @ordered
	 */
	protected AddressLatitudeDirectionType addressLatitudeDirection;

	/**
	 * The cached value of the '{@link #getAddressLongitude() <em>Address Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLongitude()
	 * @generated
	 * @ordered
	 */
	protected AddressLongitudeType addressLongitude;

	/**
	 * The cached value of the '{@link #getAddressLongitudeDirection() <em>Address Longitude Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLongitudeDirection()
	 * @generated
	 * @ordered
	 */
	protected AddressLongitudeDirectionType addressLongitudeDirection;

	/**
	 * The cached value of the '{@link #getSupplementaryPostalServiceData() <em>Supplementary Postal Service Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementaryPostalServiceData()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplementaryPostalServiceDataType> supplementaryPostalServiceData;

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
	protected PostalServiceElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPostalServiceElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressIdentifierType> getAddressIdentifier() {
		if (addressIdentifier == null) {
			addressIdentifier = new EObjectContainmentEList<AddressIdentifierType>(AddressIdentifierType.class, this, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER);
		}
		return addressIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndorsementLineCodeType getEndorsementLineCode() {
		return endorsementLineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndorsementLineCode(EndorsementLineCodeType newEndorsementLineCode, NotificationChain msgs) {
		EndorsementLineCodeType oldEndorsementLineCode = endorsementLineCode;
		endorsementLineCode = newEndorsementLineCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE, oldEndorsementLineCode, newEndorsementLineCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndorsementLineCode(EndorsementLineCodeType newEndorsementLineCode) {
		if (newEndorsementLineCode != endorsementLineCode) {
			NotificationChain msgs = null;
			if (endorsementLineCode != null)
				msgs = ((InternalEObject)endorsementLineCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE, null, msgs);
			if (newEndorsementLineCode != null)
				msgs = ((InternalEObject)newEndorsementLineCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE, null, msgs);
			msgs = basicSetEndorsementLineCode(newEndorsementLineCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE, newEndorsementLineCode, newEndorsementLineCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyLineCodeType getKeyLineCode() {
		return keyLineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyLineCode(KeyLineCodeType newKeyLineCode, NotificationChain msgs) {
		KeyLineCodeType oldKeyLineCode = keyLineCode;
		keyLineCode = newKeyLineCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE, oldKeyLineCode, newKeyLineCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyLineCode(KeyLineCodeType newKeyLineCode) {
		if (newKeyLineCode != keyLineCode) {
			NotificationChain msgs = null;
			if (keyLineCode != null)
				msgs = ((InternalEObject)keyLineCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE, null, msgs);
			if (newKeyLineCode != null)
				msgs = ((InternalEObject)newKeyLineCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE, null, msgs);
			msgs = basicSetKeyLineCode(newKeyLineCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE, newKeyLineCode, newKeyLineCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarcodeType getBarcode() {
		return barcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBarcode(BarcodeType newBarcode, NotificationChain msgs) {
		BarcodeType oldBarcode = barcode;
		barcode = newBarcode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE, oldBarcode, newBarcode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarcode(BarcodeType newBarcode) {
		if (newBarcode != barcode) {
			NotificationChain msgs = null;
			if (barcode != null)
				msgs = ((InternalEObject)barcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE, null, msgs);
			if (newBarcode != null)
				msgs = ((InternalEObject)newBarcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE, null, msgs);
			msgs = basicSetBarcode(newBarcode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE, newBarcode, newBarcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingCodeType getSortingCode() {
		return sortingCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortingCode(SortingCodeType newSortingCode, NotificationChain msgs) {
		SortingCodeType oldSortingCode = sortingCode;
		sortingCode = newSortingCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE, oldSortingCode, newSortingCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingCode(SortingCodeType newSortingCode) {
		if (newSortingCode != sortingCode) {
			NotificationChain msgs = null;
			if (sortingCode != null)
				msgs = ((InternalEObject)sortingCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE, null, msgs);
			if (newSortingCode != null)
				msgs = ((InternalEObject)newSortingCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE, null, msgs);
			msgs = basicSetSortingCode(newSortingCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE, newSortingCode, newSortingCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLatitudeType getAddressLatitude() {
		return addressLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressLatitude(AddressLatitudeType newAddressLatitude, NotificationChain msgs) {
		AddressLatitudeType oldAddressLatitude = addressLatitude;
		addressLatitude = newAddressLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE, oldAddressLatitude, newAddressLatitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressLatitude(AddressLatitudeType newAddressLatitude) {
		if (newAddressLatitude != addressLatitude) {
			NotificationChain msgs = null;
			if (addressLatitude != null)
				msgs = ((InternalEObject)addressLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE, null, msgs);
			if (newAddressLatitude != null)
				msgs = ((InternalEObject)newAddressLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE, null, msgs);
			msgs = basicSetAddressLatitude(newAddressLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE, newAddressLatitude, newAddressLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLatitudeDirectionType getAddressLatitudeDirection() {
		return addressLatitudeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressLatitudeDirection(AddressLatitudeDirectionType newAddressLatitudeDirection, NotificationChain msgs) {
		AddressLatitudeDirectionType oldAddressLatitudeDirection = addressLatitudeDirection;
		addressLatitudeDirection = newAddressLatitudeDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION, oldAddressLatitudeDirection, newAddressLatitudeDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressLatitudeDirection(AddressLatitudeDirectionType newAddressLatitudeDirection) {
		if (newAddressLatitudeDirection != addressLatitudeDirection) {
			NotificationChain msgs = null;
			if (addressLatitudeDirection != null)
				msgs = ((InternalEObject)addressLatitudeDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION, null, msgs);
			if (newAddressLatitudeDirection != null)
				msgs = ((InternalEObject)newAddressLatitudeDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION, null, msgs);
			msgs = basicSetAddressLatitudeDirection(newAddressLatitudeDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION, newAddressLatitudeDirection, newAddressLatitudeDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLongitudeType getAddressLongitude() {
		return addressLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressLongitude(AddressLongitudeType newAddressLongitude, NotificationChain msgs) {
		AddressLongitudeType oldAddressLongitude = addressLongitude;
		addressLongitude = newAddressLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE, oldAddressLongitude, newAddressLongitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressLongitude(AddressLongitudeType newAddressLongitude) {
		if (newAddressLongitude != addressLongitude) {
			NotificationChain msgs = null;
			if (addressLongitude != null)
				msgs = ((InternalEObject)addressLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE, null, msgs);
			if (newAddressLongitude != null)
				msgs = ((InternalEObject)newAddressLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE, null, msgs);
			msgs = basicSetAddressLongitude(newAddressLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE, newAddressLongitude, newAddressLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLongitudeDirectionType getAddressLongitudeDirection() {
		return addressLongitudeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressLongitudeDirection(AddressLongitudeDirectionType newAddressLongitudeDirection, NotificationChain msgs) {
		AddressLongitudeDirectionType oldAddressLongitudeDirection = addressLongitudeDirection;
		addressLongitudeDirection = newAddressLongitudeDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION, oldAddressLongitudeDirection, newAddressLongitudeDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressLongitudeDirection(AddressLongitudeDirectionType newAddressLongitudeDirection) {
		if (newAddressLongitudeDirection != addressLongitudeDirection) {
			NotificationChain msgs = null;
			if (addressLongitudeDirection != null)
				msgs = ((InternalEObject)addressLongitudeDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION, null, msgs);
			if (newAddressLongitudeDirection != null)
				msgs = ((InternalEObject)newAddressLongitudeDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION, null, msgs);
			msgs = basicSetAddressLongitudeDirection(newAddressLongitudeDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION, newAddressLongitudeDirection, newAddressLongitudeDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplementaryPostalServiceDataType> getSupplementaryPostalServiceData() {
		if (supplementaryPostalServiceData == null) {
			supplementaryPostalServiceData = new EObjectContainmentEList<SupplementaryPostalServiceDataType>(SupplementaryPostalServiceDataType.class, this, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA);
		}
		return supplementaryPostalServiceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY);
		}
		return any;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER:
				return ((InternalEList<?>)getAddressIdentifier()).basicRemove(otherEnd, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE:
				return basicSetEndorsementLineCode(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE:
				return basicSetKeyLineCode(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE:
				return basicSetBarcode(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE:
				return basicSetSortingCode(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE:
				return basicSetAddressLatitude(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION:
				return basicSetAddressLatitudeDirection(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE:
				return basicSetAddressLongitude(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION:
				return basicSetAddressLongitudeDirection(null, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA:
				return ((InternalEList<?>)getSupplementaryPostalServiceData()).basicRemove(otherEnd, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER:
				return getAddressIdentifier();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE:
				return getEndorsementLineCode();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE:
				return getKeyLineCode();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE:
				return getBarcode();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE:
				return getSortingCode();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE:
				return getAddressLatitude();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION:
				return getAddressLatitudeDirection();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE:
				return getAddressLongitude();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION:
				return getAddressLongitudeDirection();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA:
				return getSupplementaryPostalServiceData();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__TYPE:
				return getType();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER:
				getAddressIdentifier().clear();
				getAddressIdentifier().addAll((Collection<? extends AddressIdentifierType>)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE:
				setEndorsementLineCode((EndorsementLineCodeType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE:
				setKeyLineCode((KeyLineCodeType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE:
				setBarcode((BarcodeType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE:
				setSortingCode((SortingCodeType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE:
				setAddressLatitude((AddressLatitudeType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION:
				setAddressLatitudeDirection((AddressLatitudeDirectionType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE:
				setAddressLongitude((AddressLongitudeType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION:
				setAddressLongitudeDirection((AddressLongitudeDirectionType)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA:
				getSupplementaryPostalServiceData().clear();
				getSupplementaryPostalServiceData().addAll((Collection<? extends SupplementaryPostalServiceDataType>)newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER:
				getAddressIdentifier().clear();
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE:
				setEndorsementLineCode((EndorsementLineCodeType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE:
				setKeyLineCode((KeyLineCodeType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE:
				setBarcode((BarcodeType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE:
				setSortingCode((SortingCodeType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE:
				setAddressLatitude((AddressLatitudeType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION:
				setAddressLatitudeDirection((AddressLatitudeDirectionType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE:
				setAddressLongitude((AddressLongitudeType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION:
				setAddressLongitudeDirection((AddressLongitudeDirectionType)null);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA:
				getSupplementaryPostalServiceData().clear();
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER:
				return addressIdentifier != null && !addressIdentifier.isEmpty();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE:
				return endorsementLineCode != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE:
				return keyLineCode != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE:
				return barcode != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE:
				return sortingCode != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE:
				return addressLatitude != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION:
				return addressLatitudeDirection != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE:
				return addressLongitude != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION:
				return addressLongitudeDirection != null;
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA:
				return supplementaryPostalServiceData != null && !supplementaryPostalServiceData.isEmpty();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE:
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
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PostalServiceElementsTypeImpl
