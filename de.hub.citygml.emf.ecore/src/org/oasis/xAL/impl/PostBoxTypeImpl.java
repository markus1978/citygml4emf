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
import org.oasis.xAL.FirmType;
import org.oasis.xAL.PostBoxNumberExtensionType;
import org.oasis.xAL.PostBoxNumberPrefixType;
import org.oasis.xAL.PostBoxNumberSuffixType;
import org.oasis.xAL.PostBoxNumberType;
import org.oasis.xAL.PostBoxType;
import org.oasis.xAL.PostalCodeType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getPostBoxNumber <em>Post Box Number</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getPostBoxNumberPrefix <em>Post Box Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getPostBoxNumberSuffix <em>Post Box Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getPostBoxNumberExtension <em>Post Box Number Extension</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getFirm <em>Firm</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostBoxTypeImpl extends EObjectImpl implements PostBoxType {
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
	 * The cached value of the '{@link #getPostBoxNumber() <em>Post Box Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBoxNumber()
	 * @generated
	 * @ordered
	 */
	protected PostBoxNumberType postBoxNumber;

	/**
	 * The cached value of the '{@link #getPostBoxNumberPrefix() <em>Post Box Number Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBoxNumberPrefix()
	 * @generated
	 * @ordered
	 */
	protected PostBoxNumberPrefixType postBoxNumberPrefix;

	/**
	 * The cached value of the '{@link #getPostBoxNumberSuffix() <em>Post Box Number Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBoxNumberSuffix()
	 * @generated
	 * @ordered
	 */
	protected PostBoxNumberSuffixType postBoxNumberSuffix;

	/**
	 * The cached value of the '{@link #getPostBoxNumberExtension() <em>Post Box Number Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBoxNumberExtension()
	 * @generated
	 * @ordered
	 */
	protected PostBoxNumberExtensionType postBoxNumberExtension;

	/**
	 * The cached value of the '{@link #getFirm() <em>Firm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirm()
	 * @generated
	 * @ordered
	 */
	protected FirmType firm;

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
	protected PostBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPostBoxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.POST_BOX_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberType getPostBoxNumber() {
		return postBoxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostBoxNumber(PostBoxNumberType newPostBoxNumber, NotificationChain msgs) {
		PostBoxNumberType oldPostBoxNumber = postBoxNumber;
		postBoxNumber = newPostBoxNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER, oldPostBoxNumber, newPostBoxNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBoxNumber(PostBoxNumberType newPostBoxNumber) {
		if (newPostBoxNumber != postBoxNumber) {
			NotificationChain msgs = null;
			if (postBoxNumber != null)
				msgs = ((InternalEObject)postBoxNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER, null, msgs);
			if (newPostBoxNumber != null)
				msgs = ((InternalEObject)newPostBoxNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER, null, msgs);
			msgs = basicSetPostBoxNumber(newPostBoxNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER, newPostBoxNumber, newPostBoxNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberPrefixType getPostBoxNumberPrefix() {
		return postBoxNumberPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostBoxNumberPrefix(PostBoxNumberPrefixType newPostBoxNumberPrefix, NotificationChain msgs) {
		PostBoxNumberPrefixType oldPostBoxNumberPrefix = postBoxNumberPrefix;
		postBoxNumberPrefix = newPostBoxNumberPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX, oldPostBoxNumberPrefix, newPostBoxNumberPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBoxNumberPrefix(PostBoxNumberPrefixType newPostBoxNumberPrefix) {
		if (newPostBoxNumberPrefix != postBoxNumberPrefix) {
			NotificationChain msgs = null;
			if (postBoxNumberPrefix != null)
				msgs = ((InternalEObject)postBoxNumberPrefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX, null, msgs);
			if (newPostBoxNumberPrefix != null)
				msgs = ((InternalEObject)newPostBoxNumberPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX, null, msgs);
			msgs = basicSetPostBoxNumberPrefix(newPostBoxNumberPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX, newPostBoxNumberPrefix, newPostBoxNumberPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberSuffixType getPostBoxNumberSuffix() {
		return postBoxNumberSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostBoxNumberSuffix(PostBoxNumberSuffixType newPostBoxNumberSuffix, NotificationChain msgs) {
		PostBoxNumberSuffixType oldPostBoxNumberSuffix = postBoxNumberSuffix;
		postBoxNumberSuffix = newPostBoxNumberSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX, oldPostBoxNumberSuffix, newPostBoxNumberSuffix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBoxNumberSuffix(PostBoxNumberSuffixType newPostBoxNumberSuffix) {
		if (newPostBoxNumberSuffix != postBoxNumberSuffix) {
			NotificationChain msgs = null;
			if (postBoxNumberSuffix != null)
				msgs = ((InternalEObject)postBoxNumberSuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX, null, msgs);
			if (newPostBoxNumberSuffix != null)
				msgs = ((InternalEObject)newPostBoxNumberSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX, null, msgs);
			msgs = basicSetPostBoxNumberSuffix(newPostBoxNumberSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX, newPostBoxNumberSuffix, newPostBoxNumberSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberExtensionType getPostBoxNumberExtension() {
		return postBoxNumberExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostBoxNumberExtension(PostBoxNumberExtensionType newPostBoxNumberExtension, NotificationChain msgs) {
		PostBoxNumberExtensionType oldPostBoxNumberExtension = postBoxNumberExtension;
		postBoxNumberExtension = newPostBoxNumberExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION, oldPostBoxNumberExtension, newPostBoxNumberExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBoxNumberExtension(PostBoxNumberExtensionType newPostBoxNumberExtension) {
		if (newPostBoxNumberExtension != postBoxNumberExtension) {
			NotificationChain msgs = null;
			if (postBoxNumberExtension != null)
				msgs = ((InternalEObject)postBoxNumberExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION, null, msgs);
			if (newPostBoxNumberExtension != null)
				msgs = ((InternalEObject)newPostBoxNumberExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION, null, msgs);
			msgs = basicSetPostBoxNumberExtension(newPostBoxNumberExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION, newPostBoxNumberExtension, newPostBoxNumberExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmType getFirm() {
		return firm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirm(FirmType newFirm, NotificationChain msgs) {
		FirmType oldFirm = firm;
		firm = newFirm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__FIRM, oldFirm, newFirm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirm(FirmType newFirm) {
		if (newFirm != firm) {
			NotificationChain msgs = null;
			if (firm != null)
				msgs = ((InternalEObject)firm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__FIRM, null, msgs);
			if (newFirm != null)
				msgs = ((InternalEObject)newFirm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__FIRM, null, msgs);
			msgs = basicSetFirm(newFirm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__FIRM, newFirm, newFirm));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
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
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_BOX_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.POST_BOX_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__INDICATOR, oldIndicator, indicator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.POST_BOX_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.POST_BOX_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER:
				return basicSetPostBoxNumber(null, msgs);
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX:
				return basicSetPostBoxNumberPrefix(null, msgs);
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX:
				return basicSetPostBoxNumberSuffix(null, msgs);
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION:
				return basicSetPostBoxNumberExtension(null, msgs);
			case XALPackage.POST_BOX_TYPE__FIRM:
				return basicSetFirm(null, msgs);
			case XALPackage.POST_BOX_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case XALPackage.POST_BOX_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_BOX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER:
				return getPostBoxNumber();
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX:
				return getPostBoxNumberPrefix();
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX:
				return getPostBoxNumberSuffix();
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION:
				return getPostBoxNumberExtension();
			case XALPackage.POST_BOX_TYPE__FIRM:
				return getFirm();
			case XALPackage.POST_BOX_TYPE__POSTAL_CODE:
				return getPostalCode();
			case XALPackage.POST_BOX_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.POST_BOX_TYPE__INDICATOR:
				return getIndicator();
			case XALPackage.POST_BOX_TYPE__TYPE:
				return getType();
			case XALPackage.POST_BOX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER:
				setPostBoxNumber((PostBoxNumberType)newValue);
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX:
				setPostBoxNumberPrefix((PostBoxNumberPrefixType)newValue);
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX:
				setPostBoxNumberSuffix((PostBoxNumberSuffixType)newValue);
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION:
				setPostBoxNumberExtension((PostBoxNumberExtensionType)newValue);
				return;
			case XALPackage.POST_BOX_TYPE__FIRM:
				setFirm((FirmType)newValue);
				return;
			case XALPackage.POST_BOX_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case XALPackage.POST_BOX_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.POST_BOX_TYPE__INDICATOR:
				setIndicator(newValue);
				return;
			case XALPackage.POST_BOX_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.POST_BOX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER:
				setPostBoxNumber((PostBoxNumberType)null);
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX:
				setPostBoxNumberPrefix((PostBoxNumberPrefixType)null);
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX:
				setPostBoxNumberSuffix((PostBoxNumberSuffixType)null);
				return;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION:
				setPostBoxNumberExtension((PostBoxNumberExtensionType)null);
				return;
			case XALPackage.POST_BOX_TYPE__FIRM:
				setFirm((FirmType)null);
				return;
			case XALPackage.POST_BOX_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case XALPackage.POST_BOX_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.POST_BOX_TYPE__INDICATOR:
				setIndicator(INDICATOR_EDEFAULT);
				return;
			case XALPackage.POST_BOX_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.POST_BOX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER:
				return postBoxNumber != null;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX:
				return postBoxNumberPrefix != null;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX:
				return postBoxNumberSuffix != null;
			case XALPackage.POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION:
				return postBoxNumberExtension != null;
			case XALPackage.POST_BOX_TYPE__FIRM:
				return firm != null;
			case XALPackage.POST_BOX_TYPE__POSTAL_CODE:
				return postalCode != null;
			case XALPackage.POST_BOX_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.POST_BOX_TYPE__INDICATOR:
				return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
			case XALPackage.POST_BOX_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.POST_BOX_TYPE__ANY_ATTRIBUTE:
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

} //PostBoxTypeImpl
