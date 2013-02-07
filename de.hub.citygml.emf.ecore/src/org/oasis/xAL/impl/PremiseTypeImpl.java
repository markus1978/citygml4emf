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
import org.oasis.xAL.FirmType;
import org.oasis.xAL.MailStopType;
import org.oasis.xAL.PostalCodeType;
import org.oasis.xAL.PremiseLocationType;
import org.oasis.xAL.PremiseNameType;
import org.oasis.xAL.PremiseNumberPrefixType;
import org.oasis.xAL.PremiseNumberRangeType;
import org.oasis.xAL.PremiseNumberSuffixType;
import org.oasis.xAL.PremiseNumberType;
import org.oasis.xAL.PremiseType;
import org.oasis.xAL.SubPremiseType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Premise Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseName <em>Premise Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseLocation <em>Premise Location</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseNumber <em>Premise Number</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseNumberRange <em>Premise Number Range</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseNumberPrefix <em>Premise Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseNumberSuffix <em>Premise Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getSubPremise <em>Sub Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getFirm <em>Firm</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getMailStop <em>Mail Stop</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseDependency <em>Premise Dependency</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseDependencyType <em>Premise Dependency Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getPremiseThoroughfareConnector <em>Premise Thoroughfare Connector</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PremiseTypeImpl extends EObjectImpl implements PremiseType {
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
	 * The cached value of the '{@link #getPremiseName() <em>Premise Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseName()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiseNameType> premiseName;

	/**
	 * The cached value of the '{@link #getPremiseLocation() <em>Premise Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseLocation()
	 * @generated
	 * @ordered
	 */
	protected PremiseLocationType premiseLocation;

	/**
	 * The cached value of the '{@link #getPremiseNumber() <em>Premise Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiseNumberType> premiseNumber;

	/**
	 * The cached value of the '{@link #getPremiseNumberRange() <em>Premise Number Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumberRange()
	 * @generated
	 * @ordered
	 */
	protected PremiseNumberRangeType premiseNumberRange;

	/**
	 * The cached value of the '{@link #getPremiseNumberPrefix() <em>Premise Number Prefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumberPrefix()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiseNumberPrefixType> premiseNumberPrefix;

	/**
	 * The cached value of the '{@link #getPremiseNumberSuffix() <em>Premise Number Suffix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumberSuffix()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiseNumberSuffixType> premiseNumberSuffix;

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
	 * The cached value of the '{@link #getSubPremise() <em>Sub Premise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPremise()
	 * @generated
	 * @ordered
	 */
	protected EList<SubPremiseType> subPremise;

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
	 * The cached value of the '{@link #getMailStop() <em>Mail Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailStop()
	 * @generated
	 * @ordered
	 */
	protected MailStopType mailStop;

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
	 * The cached value of the '{@link #getPremise() <em>Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremise()
	 * @generated
	 * @ordered
	 */
	protected PremiseType premise;

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
	 * The default value of the '{@link #getPremiseDependency() <em>Premise Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseDependency()
	 * @generated
	 * @ordered
	 */
	protected static final Object PREMISE_DEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPremiseDependency() <em>Premise Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseDependency()
	 * @generated
	 * @ordered
	 */
	protected Object premiseDependency = PREMISE_DEPENDENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPremiseDependencyType() <em>Premise Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseDependencyType()
	 * @generated
	 * @ordered
	 */
	protected static final Object PREMISE_DEPENDENCY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPremiseDependencyType() <em>Premise Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseDependencyType()
	 * @generated
	 * @ordered
	 */
	protected Object premiseDependencyType = PREMISE_DEPENDENCY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPremiseThoroughfareConnector() <em>Premise Thoroughfare Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseThoroughfareConnector()
	 * @generated
	 * @ordered
	 */
	protected static final Object PREMISE_THOROUGHFARE_CONNECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPremiseThoroughfareConnector() <em>Premise Thoroughfare Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseThoroughfareConnector()
	 * @generated
	 * @ordered
	 */
	protected Object premiseThoroughfareConnector = PREMISE_THOROUGHFARE_CONNECTOR_EDEFAULT;

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
	protected PremiseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPremiseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.PREMISE_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiseNameType> getPremiseName() {
		if (premiseName == null) {
			premiseName = new EObjectContainmentEList<PremiseNameType>(PremiseNameType.class, this, XALPackage.PREMISE_TYPE__PREMISE_NAME);
		}
		return premiseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseLocationType getPremiseLocation() {
		return premiseLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseLocation(PremiseLocationType newPremiseLocation, NotificationChain msgs) {
		PremiseLocationType oldPremiseLocation = premiseLocation;
		premiseLocation = newPremiseLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE_LOCATION, oldPremiseLocation, newPremiseLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseLocation(PremiseLocationType newPremiseLocation) {
		if (newPremiseLocation != premiseLocation) {
			NotificationChain msgs = null;
			if (premiseLocation != null)
				msgs = ((InternalEObject)premiseLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__PREMISE_LOCATION, null, msgs);
			if (newPremiseLocation != null)
				msgs = ((InternalEObject)newPremiseLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__PREMISE_LOCATION, null, msgs);
			msgs = basicSetPremiseLocation(newPremiseLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE_LOCATION, newPremiseLocation, newPremiseLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiseNumberType> getPremiseNumber() {
		if (premiseNumber == null) {
			premiseNumber = new EObjectContainmentEList<PremiseNumberType>(PremiseNumberType.class, this, XALPackage.PREMISE_TYPE__PREMISE_NUMBER);
		}
		return premiseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberRangeType getPremiseNumberRange() {
		return premiseNumberRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseNumberRange(PremiseNumberRangeType newPremiseNumberRange, NotificationChain msgs) {
		PremiseNumberRangeType oldPremiseNumberRange = premiseNumberRange;
		premiseNumberRange = newPremiseNumberRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE, oldPremiseNumberRange, newPremiseNumberRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseNumberRange(PremiseNumberRangeType newPremiseNumberRange) {
		if (newPremiseNumberRange != premiseNumberRange) {
			NotificationChain msgs = null;
			if (premiseNumberRange != null)
				msgs = ((InternalEObject)premiseNumberRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE, null, msgs);
			if (newPremiseNumberRange != null)
				msgs = ((InternalEObject)newPremiseNumberRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE, null, msgs);
			msgs = basicSetPremiseNumberRange(newPremiseNumberRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE, newPremiseNumberRange, newPremiseNumberRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiseNumberPrefixType> getPremiseNumberPrefix() {
		if (premiseNumberPrefix == null) {
			premiseNumberPrefix = new EObjectContainmentEList<PremiseNumberPrefixType>(PremiseNumberPrefixType.class, this, XALPackage.PREMISE_TYPE__PREMISE_NUMBER_PREFIX);
		}
		return premiseNumberPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiseNumberSuffixType> getPremiseNumberSuffix() {
		if (premiseNumberSuffix == null) {
			premiseNumberSuffix = new EObjectContainmentEList<PremiseNumberSuffixType>(PremiseNumberSuffixType.class, this, XALPackage.PREMISE_TYPE__PREMISE_NUMBER_SUFFIX);
		}
		return premiseNumberSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildingNameType> getBuildingName() {
		if (buildingName == null) {
			buildingName = new EObjectContainmentEList<BuildingNameType>(BuildingNameType.class, this, XALPackage.PREMISE_TYPE__BUILDING_NAME);
		}
		return buildingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubPremiseType> getSubPremise() {
		if (subPremise == null) {
			subPremise = new EObjectContainmentEList<SubPremiseType>(SubPremiseType.class, this, XALPackage.PREMISE_TYPE__SUB_PREMISE);
		}
		return subPremise;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__FIRM, oldFirm, newFirm);
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
				msgs = ((InternalEObject)firm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__FIRM, null, msgs);
			if (newFirm != null)
				msgs = ((InternalEObject)newFirm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__FIRM, null, msgs);
			msgs = basicSetFirm(newFirm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__FIRM, newFirm, newFirm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailStopType getMailStop() {
		return mailStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMailStop(MailStopType newMailStop, NotificationChain msgs) {
		MailStopType oldMailStop = mailStop;
		mailStop = newMailStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__MAIL_STOP, oldMailStop, newMailStop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailStop(MailStopType newMailStop) {
		if (newMailStop != mailStop) {
			NotificationChain msgs = null;
			if (mailStop != null)
				msgs = ((InternalEObject)mailStop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__MAIL_STOP, null, msgs);
			if (newMailStop != null)
				msgs = ((InternalEObject)newMailStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__MAIL_STOP, null, msgs);
			msgs = basicSetMailStop(newMailStop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__MAIL_STOP, newMailStop, newMailStop));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__POSTAL_CODE, oldPostalCode, newPostalCode);
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
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__POSTAL_CODE, newPostalCode, newPostalCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE, oldPremise, newPremise);
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
				msgs = ((InternalEObject)premise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__PREMISE, null, msgs);
			if (newPremise != null)
				msgs = ((InternalEObject)newPremise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_TYPE__PREMISE, null, msgs);
			msgs = basicSetPremise(newPremise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE, newPremise, newPremise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.PREMISE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPremiseDependency() {
		return premiseDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseDependency(Object newPremiseDependency) {
		Object oldPremiseDependency = premiseDependency;
		premiseDependency = newPremiseDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY, oldPremiseDependency, premiseDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPremiseDependencyType() {
		return premiseDependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseDependencyType(Object newPremiseDependencyType) {
		Object oldPremiseDependencyType = premiseDependencyType;
		premiseDependencyType = newPremiseDependencyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE, oldPremiseDependencyType, premiseDependencyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPremiseThoroughfareConnector() {
		return premiseThoroughfareConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseThoroughfareConnector(Object newPremiseThoroughfareConnector) {
		Object oldPremiseThoroughfareConnector = premiseThoroughfareConnector;
		premiseThoroughfareConnector = newPremiseThoroughfareConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR, oldPremiseThoroughfareConnector, premiseThoroughfareConnector));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.PREMISE_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.PREMISE_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__PREMISE_NAME:
				return ((InternalEList<?>)getPremiseName()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__PREMISE_LOCATION:
				return basicSetPremiseLocation(null, msgs);
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER:
				return ((InternalEList<?>)getPremiseNumber()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE:
				return basicSetPremiseNumberRange(null, msgs);
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_PREFIX:
				return ((InternalEList<?>)getPremiseNumberPrefix()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_SUFFIX:
				return ((InternalEList<?>)getPremiseNumberSuffix()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__BUILDING_NAME:
				return ((InternalEList<?>)getBuildingName()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__SUB_PREMISE:
				return ((InternalEList<?>)getSubPremise()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__FIRM:
				return basicSetFirm(null, msgs);
			case XALPackage.PREMISE_TYPE__MAIL_STOP:
				return basicSetMailStop(null, msgs);
			case XALPackage.PREMISE_TYPE__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case XALPackage.PREMISE_TYPE__PREMISE:
				return basicSetPremise(null, msgs);
			case XALPackage.PREMISE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.PREMISE_TYPE__PREMISE_NAME:
				return getPremiseName();
			case XALPackage.PREMISE_TYPE__PREMISE_LOCATION:
				return getPremiseLocation();
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER:
				return getPremiseNumber();
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE:
				return getPremiseNumberRange();
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_PREFIX:
				return getPremiseNumberPrefix();
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_SUFFIX:
				return getPremiseNumberSuffix();
			case XALPackage.PREMISE_TYPE__BUILDING_NAME:
				return getBuildingName();
			case XALPackage.PREMISE_TYPE__SUB_PREMISE:
				return getSubPremise();
			case XALPackage.PREMISE_TYPE__FIRM:
				return getFirm();
			case XALPackage.PREMISE_TYPE__MAIL_STOP:
				return getMailStop();
			case XALPackage.PREMISE_TYPE__POSTAL_CODE:
				return getPostalCode();
			case XALPackage.PREMISE_TYPE__PREMISE:
				return getPremise();
			case XALPackage.PREMISE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY:
				return getPremiseDependency();
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE:
				return getPremiseDependencyType();
			case XALPackage.PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR:
				return getPremiseThoroughfareConnector();
			case XALPackage.PREMISE_TYPE__TYPE:
				return getType();
			case XALPackage.PREMISE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NAME:
				getPremiseName().clear();
				getPremiseName().addAll((Collection<? extends PremiseNameType>)newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_LOCATION:
				setPremiseLocation((PremiseLocationType)newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER:
				getPremiseNumber().clear();
				getPremiseNumber().addAll((Collection<? extends PremiseNumberType>)newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE:
				setPremiseNumberRange((PremiseNumberRangeType)newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_PREFIX:
				getPremiseNumberPrefix().clear();
				getPremiseNumberPrefix().addAll((Collection<? extends PremiseNumberPrefixType>)newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_SUFFIX:
				getPremiseNumberSuffix().clear();
				getPremiseNumberSuffix().addAll((Collection<? extends PremiseNumberSuffixType>)newValue);
				return;
			case XALPackage.PREMISE_TYPE__BUILDING_NAME:
				getBuildingName().clear();
				getBuildingName().addAll((Collection<? extends BuildingNameType>)newValue);
				return;
			case XALPackage.PREMISE_TYPE__SUB_PREMISE:
				getSubPremise().clear();
				getSubPremise().addAll((Collection<? extends SubPremiseType>)newValue);
				return;
			case XALPackage.PREMISE_TYPE__FIRM:
				setFirm((FirmType)newValue);
				return;
			case XALPackage.PREMISE_TYPE__MAIL_STOP:
				setMailStop((MailStopType)newValue);
				return;
			case XALPackage.PREMISE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE:
				setPremise((PremiseType)newValue);
				return;
			case XALPackage.PREMISE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY:
				setPremiseDependency(newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE:
				setPremiseDependencyType(newValue);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR:
				setPremiseThoroughfareConnector(newValue);
				return;
			case XALPackage.PREMISE_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.PREMISE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NAME:
				getPremiseName().clear();
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_LOCATION:
				setPremiseLocation((PremiseLocationType)null);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER:
				getPremiseNumber().clear();
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE:
				setPremiseNumberRange((PremiseNumberRangeType)null);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_PREFIX:
				getPremiseNumberPrefix().clear();
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_SUFFIX:
				getPremiseNumberSuffix().clear();
				return;
			case XALPackage.PREMISE_TYPE__BUILDING_NAME:
				getBuildingName().clear();
				return;
			case XALPackage.PREMISE_TYPE__SUB_PREMISE:
				getSubPremise().clear();
				return;
			case XALPackage.PREMISE_TYPE__FIRM:
				setFirm((FirmType)null);
				return;
			case XALPackage.PREMISE_TYPE__MAIL_STOP:
				setMailStop((MailStopType)null);
				return;
			case XALPackage.PREMISE_TYPE__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE:
				setPremise((PremiseType)null);
				return;
			case XALPackage.PREMISE_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY:
				setPremiseDependency(PREMISE_DEPENDENCY_EDEFAULT);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE:
				setPremiseDependencyType(PREMISE_DEPENDENCY_TYPE_EDEFAULT);
				return;
			case XALPackage.PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR:
				setPremiseThoroughfareConnector(PREMISE_THOROUGHFARE_CONNECTOR_EDEFAULT);
				return;
			case XALPackage.PREMISE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.PREMISE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.PREMISE_TYPE__PREMISE_NAME:
				return premiseName != null && !premiseName.isEmpty();
			case XALPackage.PREMISE_TYPE__PREMISE_LOCATION:
				return premiseLocation != null;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER:
				return premiseNumber != null && !premiseNumber.isEmpty();
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_RANGE:
				return premiseNumberRange != null;
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_PREFIX:
				return premiseNumberPrefix != null && !premiseNumberPrefix.isEmpty();
			case XALPackage.PREMISE_TYPE__PREMISE_NUMBER_SUFFIX:
				return premiseNumberSuffix != null && !premiseNumberSuffix.isEmpty();
			case XALPackage.PREMISE_TYPE__BUILDING_NAME:
				return buildingName != null && !buildingName.isEmpty();
			case XALPackage.PREMISE_TYPE__SUB_PREMISE:
				return subPremise != null && !subPremise.isEmpty();
			case XALPackage.PREMISE_TYPE__FIRM:
				return firm != null;
			case XALPackage.PREMISE_TYPE__MAIL_STOP:
				return mailStop != null;
			case XALPackage.PREMISE_TYPE__POSTAL_CODE:
				return postalCode != null;
			case XALPackage.PREMISE_TYPE__PREMISE:
				return premise != null;
			case XALPackage.PREMISE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY:
				return PREMISE_DEPENDENCY_EDEFAULT == null ? premiseDependency != null : !PREMISE_DEPENDENCY_EDEFAULT.equals(premiseDependency);
			case XALPackage.PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE:
				return PREMISE_DEPENDENCY_TYPE_EDEFAULT == null ? premiseDependencyType != null : !PREMISE_DEPENDENCY_TYPE_EDEFAULT.equals(premiseDependencyType);
			case XALPackage.PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR:
				return PREMISE_THOROUGHFARE_CONNECTOR_EDEFAULT == null ? premiseThoroughfareConnector != null : !PREMISE_THOROUGHFARE_CONNECTOR_EDEFAULT.equals(premiseThoroughfareConnector);
			case XALPackage.PREMISE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.PREMISE_TYPE__ANY_ATTRIBUTE:
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
		result.append(", premiseDependency: ");
		result.append(premiseDependency);
		result.append(", premiseDependencyType: ");
		result.append(premiseDependencyType);
		result.append(", premiseThoroughfareConnector: ");
		result.append(premiseThoroughfareConnector);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PremiseTypeImpl
