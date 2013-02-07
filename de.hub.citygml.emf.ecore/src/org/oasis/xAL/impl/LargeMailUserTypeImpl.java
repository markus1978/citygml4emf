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
import org.oasis.xAL.BuildingNameType;
import org.oasis.xAL.DepartmentType;
import org.oasis.xAL.LargeMailUserIdentifierType;
import org.oasis.xAL.LargeMailUserNameType;
import org.oasis.xAL.LargeMailUserType;
import org.oasis.xAL.PostBoxType;
import org.oasis.xAL.PostalCodeType;
import org.oasis.xAL.ThoroughfareType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Large Mail User Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getLargeMailUserName <em>Large Mail User Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getLargeMailUserIdentifier <em>Large Mail User Identifier</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.LargeMailUserTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LargeMailUserTypeImpl extends EObjectImpl implements LargeMailUserType {
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
	 * The cached value of the '{@link #getLargeMailUserName() <em>Large Mail User Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeMailUserName()
	 * @generated
	 * @ordered
	 */
	protected EList<LargeMailUserNameType> largeMailUserName;

	/**
	 * The cached value of the '{@link #getLargeMailUserIdentifier() <em>Large Mail User Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeMailUserIdentifier()
	 * @generated
	 * @ordered
	 */
	protected LargeMailUserIdentifierType largeMailUserIdentifier;

	/**
	 * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingName()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildingNameType> buildingName;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected DepartmentType department;

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
	 * The cached value of the '{@link #getThoroughfare() <em>Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfare()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareType thoroughfare;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	protected LargeMailUserTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getLargeMailUserType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.LARGE_MAIL_USER_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LargeMailUserNameType> getLargeMailUserName() {
		if (largeMailUserName == null) {
			largeMailUserName = new EObjectContainmentEList<LargeMailUserNameType>(LargeMailUserNameType.class, this, XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME);
		}
		return largeMailUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeMailUserIdentifierType getLargeMailUserIdentifier() {
		return largeMailUserIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeMailUserIdentifier(LargeMailUserIdentifierType newLargeMailUserIdentifier, NotificationChain msgs) {
		LargeMailUserIdentifierType oldLargeMailUserIdentifier = largeMailUserIdentifier;
		largeMailUserIdentifier = newLargeMailUserIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER, oldLargeMailUserIdentifier, newLargeMailUserIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeMailUserIdentifier(LargeMailUserIdentifierType newLargeMailUserIdentifier) {
		if (newLargeMailUserIdentifier != largeMailUserIdentifier) {
			NotificationChain msgs = null;
			if (largeMailUserIdentifier != null)
				msgs = ((InternalEObject)largeMailUserIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER, null, msgs);
			if (newLargeMailUserIdentifier != null)
				msgs = ((InternalEObject)newLargeMailUserIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER, null, msgs);
			msgs = basicSetLargeMailUserIdentifier(newLargeMailUserIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER, newLargeMailUserIdentifier, newLargeMailUserIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildingNameType> getBuildingName() {
		if (buildingName == null) {
			buildingName = new EObjectContainmentEList<BuildingNameType>(BuildingNameType.class, this, XALPackage.LARGE_MAIL_USER_TYPE__BUILDING_NAME);
		}
		return buildingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepartmentType getDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(DepartmentType newDepartment, NotificationChain msgs) {
		DepartmentType oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT, oldDepartment, newDepartment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(DepartmentType newDepartment) {
		if (newDepartment != department) {
			NotificationChain msgs = null;
			if (department != null)
				msgs = ((InternalEObject)department).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT, null, msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT, null, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT, newDepartment, newDepartment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX, oldPostBox, newPostBox);
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
				msgs = ((InternalEObject)postBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX, null, msgs);
			if (newPostBox != null)
				msgs = ((InternalEObject)newPostBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX, null, msgs);
			msgs = basicSetPostBox(newPostBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX, newPostBox, newPostBox));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE, oldThoroughfare, newThoroughfare);
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
				msgs = ((InternalEObject)thoroughfare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE, null, msgs);
			if (newThoroughfare != null)
				msgs = ((InternalEObject)newThoroughfare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE, null, msgs);
			msgs = basicSetThoroughfare(newThoroughfare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE, newThoroughfare, newThoroughfare));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
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
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.LARGE_MAIL_USER_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.LARGE_MAIL_USER_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.LARGE_MAIL_USER_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME:
				return ((InternalEList<?>)getLargeMailUserName()).basicRemove(otherEnd, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER:
				return basicSetLargeMailUserIdentifier(null, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__BUILDING_NAME:
				return ((InternalEList<?>)getBuildingName()).basicRemove(otherEnd, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT:
				return basicSetDepartment(null, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX:
				return basicSetPostBox(null, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE:
				return basicSetThoroughfare(null, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.LARGE_MAIL_USER_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME:
				return getLargeMailUserName();
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER:
				return getLargeMailUserIdentifier();
			case XALPackage.LARGE_MAIL_USER_TYPE__BUILDING_NAME:
				return getBuildingName();
			case XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT:
				return getDepartment();
			case XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX:
				return getPostBox();
			case XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE:
				return getThoroughfare();
			case XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE:
				return getPostalCode();
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.LARGE_MAIL_USER_TYPE__TYPE:
				return getType();
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.LARGE_MAIL_USER_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME:
				getLargeMailUserName().clear();
				getLargeMailUserName().addAll((Collection<? extends LargeMailUserNameType>)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER:
				setLargeMailUserIdentifier((LargeMailUserIdentifierType)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__BUILDING_NAME:
				getBuildingName().clear();
				getBuildingName().addAll((Collection<? extends BuildingNameType>)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT:
				setDepartment((DepartmentType)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX:
				setPostBox((PostBoxType)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__TYPE:
				setType((String)newValue);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.LARGE_MAIL_USER_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME:
				getLargeMailUserName().clear();
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER:
				setLargeMailUserIdentifier((LargeMailUserIdentifierType)null);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__BUILDING_NAME:
				getBuildingName().clear();
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT:
				setDepartment((DepartmentType)null);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX:
				setPostBox((PostBoxType)null);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)null);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.LARGE_MAIL_USER_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME:
				return largeMailUserName != null && !largeMailUserName.isEmpty();
			case XALPackage.LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER:
				return largeMailUserIdentifier != null;
			case XALPackage.LARGE_MAIL_USER_TYPE__BUILDING_NAME:
				return buildingName != null && !buildingName.isEmpty();
			case XALPackage.LARGE_MAIL_USER_TYPE__DEPARTMENT:
				return department != null;
			case XALPackage.LARGE_MAIL_USER_TYPE__POST_BOX:
				return postBox != null;
			case XALPackage.LARGE_MAIL_USER_TYPE__THOROUGHFARE:
				return thoroughfare != null;
			case XALPackage.LARGE_MAIL_USER_TYPE__POSTAL_CODE:
				return postalCode != null;
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.LARGE_MAIL_USER_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE:
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

} //LargeMailUserTypeImpl
