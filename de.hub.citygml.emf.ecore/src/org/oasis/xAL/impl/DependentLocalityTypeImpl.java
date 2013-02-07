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
import org.oasis.xAL.DependentLocalityNameType;
import org.oasis.xAL.DependentLocalityNumberType;
import org.oasis.xAL.DependentLocalityType;
import org.oasis.xAL.LargeMailUserType;
import org.oasis.xAL.PostBoxType;
import org.oasis.xAL.PostOfficeType;
import org.oasis.xAL.PostalCodeType;
import org.oasis.xAL.PostalRouteType;
import org.oasis.xAL.PremiseType;
import org.oasis.xAL.ThoroughfareType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependent Locality Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getDependentLocalityName <em>Dependent Locality Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getDependentLocalityNumber <em>Dependent Locality Number</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getLargeMailUser <em>Large Mail User</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getPostOffice <em>Post Office</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getPostalRoute <em>Postal Route</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getDependentLocality <em>Dependent Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentLocalityTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependentLocalityTypeImpl extends EObjectImpl implements DependentLocalityType {
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
	 * The cached value of the '{@link #getDependentLocalityName() <em>Dependent Locality Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentLocalityName()
	 * @generated
	 * @ordered
	 */
	protected EList<DependentLocalityNameType> dependentLocalityName;

	/**
	 * The cached value of the '{@link #getDependentLocalityNumber() <em>Dependent Locality Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentLocalityNumber()
	 * @generated
	 * @ordered
	 */
	protected DependentLocalityNumberType dependentLocalityNumber;

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
	 * The cached value of the '{@link #getLargeMailUser() <em>Large Mail User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeMailUser()
	 * @generated
	 * @ordered
	 */
	protected LargeMailUserType largeMailUser;

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
	 * The cached value of the '{@link #getPostalRoute() <em>Postal Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalRoute()
	 * @generated
	 * @ordered
	 */
	protected PostalRouteType postalRoute;

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
	 * The cached value of the '{@link #getPremise() <em>Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremise()
	 * @generated
	 * @ordered
	 */
	protected PremiseType premise;

	/**
	 * The cached value of the '{@link #getDependentLocality() <em>Dependent Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentLocality()
	 * @generated
	 * @ordered
	 */
	protected DependentLocalityType dependentLocality;

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
	 * The default value of the '{@link #getConnector() <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONNECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Object connector = CONNECTOR_EDEFAULT;

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
	protected DependentLocalityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getDependentLocalityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DependentLocalityNameType> getDependentLocalityName() {
		if (dependentLocalityName == null) {
			dependentLocalityName = new EObjectContainmentEList<DependentLocalityNameType>(DependentLocalityNameType.class, this, XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME);
		}
		return dependentLocalityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentLocalityNumberType getDependentLocalityNumber() {
		return dependentLocalityNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependentLocalityNumber(DependentLocalityNumberType newDependentLocalityNumber, NotificationChain msgs) {
		DependentLocalityNumberType oldDependentLocalityNumber = dependentLocalityNumber;
		dependentLocalityNumber = newDependentLocalityNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER, oldDependentLocalityNumber, newDependentLocalityNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentLocalityNumber(DependentLocalityNumberType newDependentLocalityNumber) {
		if (newDependentLocalityNumber != dependentLocalityNumber) {
			NotificationChain msgs = null;
			if (dependentLocalityNumber != null)
				msgs = ((InternalEObject)dependentLocalityNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER, null, msgs);
			if (newDependentLocalityNumber != null)
				msgs = ((InternalEObject)newDependentLocalityNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER, null, msgs);
			msgs = basicSetDependentLocalityNumber(newDependentLocalityNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER, newDependentLocalityNumber, newDependentLocalityNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX, oldPostBox, newPostBox);
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
				msgs = ((InternalEObject)postBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX, null, msgs);
			if (newPostBox != null)
				msgs = ((InternalEObject)newPostBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX, null, msgs);
			msgs = basicSetPostBox(newPostBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX, newPostBox, newPostBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeMailUserType getLargeMailUser() {
		return largeMailUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeMailUser(LargeMailUserType newLargeMailUser, NotificationChain msgs) {
		LargeMailUserType oldLargeMailUser = largeMailUser;
		largeMailUser = newLargeMailUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER, oldLargeMailUser, newLargeMailUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeMailUser(LargeMailUserType newLargeMailUser) {
		if (newLargeMailUser != largeMailUser) {
			NotificationChain msgs = null;
			if (largeMailUser != null)
				msgs = ((InternalEObject)largeMailUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER, null, msgs);
			if (newLargeMailUser != null)
				msgs = ((InternalEObject)newLargeMailUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER, null, msgs);
			msgs = basicSetLargeMailUser(newLargeMailUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER, newLargeMailUser, newLargeMailUser));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE, oldPostOffice, newPostOffice);
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
				msgs = ((InternalEObject)postOffice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE, null, msgs);
			if (newPostOffice != null)
				msgs = ((InternalEObject)newPostOffice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE, null, msgs);
			msgs = basicSetPostOffice(newPostOffice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE, newPostOffice, newPostOffice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE, oldPostalRoute, newPostalRoute);
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
				msgs = ((InternalEObject)postalRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE, null, msgs);
			if (newPostalRoute != null)
				msgs = ((InternalEObject)newPostalRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE, null, msgs);
			msgs = basicSetPostalRoute(newPostalRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE, newPostalRoute, newPostalRoute));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE, oldThoroughfare, newThoroughfare);
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
				msgs = ((InternalEObject)thoroughfare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE, null, msgs);
			if (newThoroughfare != null)
				msgs = ((InternalEObject)newThoroughfare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE, null, msgs);
			msgs = basicSetThoroughfare(newThoroughfare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE, newThoroughfare, newThoroughfare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseType getPremise() {
		return premise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremise(PremiseType newPremise, NotificationChain msgs) {
		PremiseType oldPremise = premise;
		premise = newPremise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE, oldPremise, newPremise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremise(PremiseType newPremise) {
		if (newPremise != premise) {
			NotificationChain msgs = null;
			if (premise != null)
				msgs = ((InternalEObject)premise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE, null, msgs);
			if (newPremise != null)
				msgs = ((InternalEObject)newPremise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE, null, msgs);
			msgs = basicSetPremise(newPremise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE, newPremise, newPremise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentLocalityType getDependentLocality() {
		return dependentLocality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependentLocality(DependentLocalityType newDependentLocality, NotificationChain msgs) {
		DependentLocalityType oldDependentLocality = dependentLocality;
		dependentLocality = newDependentLocality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY, oldDependentLocality, newDependentLocality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentLocality(DependentLocalityType newDependentLocality) {
		if (newDependentLocality != dependentLocality) {
			NotificationChain msgs = null;
			if (dependentLocality != null)
				msgs = ((InternalEObject)dependentLocality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY, null, msgs);
			if (newDependentLocality != null)
				msgs = ((InternalEObject)newDependentLocality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY, null, msgs);
			msgs = basicSetDependentLocality(newDependentLocality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY, newDependentLocality, newDependentLocality));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
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
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.DEPENDENT_LOCALITY_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Object newConnector) {
		Object oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__CONNECTOR, oldConnector, connector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__INDICATOR, oldIndicator, indicator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_TYPE__USAGE_TYPE, oldUsageType, usageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME:
				return ((InternalEList<?>)getDependentLocalityName()).basicRemove(otherEnd, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER:
				return basicSetDependentLocalityNumber(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX:
				return basicSetPostBox(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER:
				return basicSetLargeMailUser(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE:
				return basicSetPostOffice(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE:
				return basicSetPostalRoute(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE:
				return basicSetThoroughfare(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE:
				return basicSetPremise(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY:
				return basicSetDependentLocality(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME:
				return getDependentLocalityName();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER:
				return getDependentLocalityNumber();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX:
				return getPostBox();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER:
				return getLargeMailUser();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE:
				return getPostOffice();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE:
				return getPostalRoute();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE:
				return getThoroughfare();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE:
				return getPremise();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY:
				return getDependentLocality();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE:
				return getPostalCode();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__CONNECTOR:
				return getConnector();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__INDICATOR:
				return getIndicator();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__TYPE:
				return getType();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__USAGE_TYPE:
				return getUsageType();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME:
				getDependentLocalityName().clear();
				getDependentLocalityName().addAll((Collection<? extends DependentLocalityNameType>)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER:
				setDependentLocalityNumber((DependentLocalityNumberType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX:
				setPostBox((PostBoxType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER:
				setLargeMailUser((LargeMailUserType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE:
				setPostOffice((PostOfficeType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE:
				setPostalRoute((PostalRouteType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE:
				setPremise((PremiseType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY:
				setDependentLocality((DependentLocalityType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__CONNECTOR:
				setConnector(newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__INDICATOR:
				setIndicator(newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__USAGE_TYPE:
				setUsageType(newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME:
				getDependentLocalityName().clear();
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER:
				setDependentLocalityNumber((DependentLocalityNumberType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX:
				setPostBox((PostBoxType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER:
				setLargeMailUser((LargeMailUserType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE:
				setPostOffice((PostOfficeType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE:
				setPostalRoute((PostalRouteType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE:
				setPremise((PremiseType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY:
				setDependentLocality((DependentLocalityType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__CONNECTOR:
				setConnector(CONNECTOR_EDEFAULT);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__INDICATOR:
				setIndicator(INDICATOR_EDEFAULT);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__USAGE_TYPE:
				setUsageType(USAGE_TYPE_EDEFAULT);
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME:
				return dependentLocalityName != null && !dependentLocalityName.isEmpty();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER:
				return dependentLocalityNumber != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX:
				return postBox != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER:
				return largeMailUser != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE:
				return postOffice != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE:
				return postalRoute != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE:
				return thoroughfare != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE:
				return premise != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY:
				return dependentLocality != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE:
				return postalCode != null;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.DEPENDENT_LOCALITY_TYPE__CONNECTOR:
				return CONNECTOR_EDEFAULT == null ? connector != null : !CONNECTOR_EDEFAULT.equals(connector);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__INDICATOR:
				return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__USAGE_TYPE:
				return USAGE_TYPE_EDEFAULT == null ? usageType != null : !USAGE_TYPE_EDEFAULT.equals(usageType);
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE:
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
		result.append(", connector: ");
		result.append(connector);
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

} //DependentLocalityTypeImpl
