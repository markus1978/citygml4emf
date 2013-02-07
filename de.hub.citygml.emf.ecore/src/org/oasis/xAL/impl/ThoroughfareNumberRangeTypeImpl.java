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
import org.oasis.xAL.IndicatorOccurrenceType1;
import org.oasis.xAL.NumberRangeOccurrenceType;
import org.oasis.xAL.RangeTypeType;
import org.oasis.xAL.ThoroughfareNumberFromType;
import org.oasis.xAL.ThoroughfareNumberRangeType;
import org.oasis.xAL.ThoroughfareNumberToType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thoroughfare Number Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getThoroughfareNumberFrom <em>Thoroughfare Number From</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getThoroughfareNumberTo <em>Thoroughfare Number To</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getIndicatorOccurrence <em>Indicator Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getNumberRangeOccurrence <em>Number Range Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThoroughfareNumberRangeTypeImpl extends EObjectImpl implements ThoroughfareNumberRangeType {
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
	 * The cached value of the '{@link #getThoroughfareNumberFrom() <em>Thoroughfare Number From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareNumberFrom()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareNumberFromType thoroughfareNumberFrom;

	/**
	 * The cached value of the '{@link #getThoroughfareNumberTo() <em>Thoroughfare Number To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareNumberTo()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareNumberToType thoroughfareNumberTo;

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
	 * The default value of the '{@link #getIndicatorOccurrence() <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatorOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final IndicatorOccurrenceType1 INDICATOR_OCCURRENCE_EDEFAULT = IndicatorOccurrenceType1.BEFORE;

	/**
	 * The cached value of the '{@link #getIndicatorOccurrence() <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatorOccurrence()
	 * @generated
	 * @ordered
	 */
	protected IndicatorOccurrenceType1 indicatorOccurrence = INDICATOR_OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Indicator Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicatorOccurrenceESet;

	/**
	 * The default value of the '{@link #getNumberRangeOccurrence() <em>Number Range Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRangeOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final NumberRangeOccurrenceType NUMBER_RANGE_OCCURRENCE_EDEFAULT = NumberRangeOccurrenceType.BEFORE_NAME;

	/**
	 * The cached value of the '{@link #getNumberRangeOccurrence() <em>Number Range Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRangeOccurrence()
	 * @generated
	 * @ordered
	 */
	protected NumberRangeOccurrenceType numberRangeOccurrence = NUMBER_RANGE_OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Number Range Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberRangeOccurrenceESet;

	/**
	 * The default value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected static final RangeTypeType RANGE_TYPE_EDEFAULT = RangeTypeType.ODD;

	/**
	 * The cached value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected RangeTypeType rangeType = RANGE_TYPE_EDEFAULT;

	/**
	 * This is true if the Range Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rangeTypeESet;

	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final Object SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected Object separator = SEPARATOR_EDEFAULT;

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
	protected ThoroughfareNumberRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getThoroughfareNumberRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberFromType getThoroughfareNumberFrom() {
		return thoroughfareNumberFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareNumberFrom(ThoroughfareNumberFromType newThoroughfareNumberFrom, NotificationChain msgs) {
		ThoroughfareNumberFromType oldThoroughfareNumberFrom = thoroughfareNumberFrom;
		thoroughfareNumberFrom = newThoroughfareNumberFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM, oldThoroughfareNumberFrom, newThoroughfareNumberFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfareNumberFrom(ThoroughfareNumberFromType newThoroughfareNumberFrom) {
		if (newThoroughfareNumberFrom != thoroughfareNumberFrom) {
			NotificationChain msgs = null;
			if (thoroughfareNumberFrom != null)
				msgs = ((InternalEObject)thoroughfareNumberFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM, null, msgs);
			if (newThoroughfareNumberFrom != null)
				msgs = ((InternalEObject)newThoroughfareNumberFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM, null, msgs);
			msgs = basicSetThoroughfareNumberFrom(newThoroughfareNumberFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM, newThoroughfareNumberFrom, newThoroughfareNumberFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberToType getThoroughfareNumberTo() {
		return thoroughfareNumberTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareNumberTo(ThoroughfareNumberToType newThoroughfareNumberTo, NotificationChain msgs) {
		ThoroughfareNumberToType oldThoroughfareNumberTo = thoroughfareNumberTo;
		thoroughfareNumberTo = newThoroughfareNumberTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO, oldThoroughfareNumberTo, newThoroughfareNumberTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfareNumberTo(ThoroughfareNumberToType newThoroughfareNumberTo) {
		if (newThoroughfareNumberTo != thoroughfareNumberTo) {
			NotificationChain msgs = null;
			if (thoroughfareNumberTo != null)
				msgs = ((InternalEObject)thoroughfareNumberTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO, null, msgs);
			if (newThoroughfareNumberTo != null)
				msgs = ((InternalEObject)newThoroughfareNumberTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO, null, msgs);
			msgs = basicSetThoroughfareNumberTo(newThoroughfareNumberTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO, newThoroughfareNumberTo, newThoroughfareNumberTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR, oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType1 getIndicatorOccurrence() {
		return indicatorOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatorOccurrence(IndicatorOccurrenceType1 newIndicatorOccurrence) {
		IndicatorOccurrenceType1 oldIndicatorOccurrence = indicatorOccurrence;
		indicatorOccurrence = newIndicatorOccurrence == null ? INDICATOR_OCCURRENCE_EDEFAULT : newIndicatorOccurrence;
		boolean oldIndicatorOccurrenceESet = indicatorOccurrenceESet;
		indicatorOccurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE, oldIndicatorOccurrence, indicatorOccurrence, !oldIndicatorOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicatorOccurrence() {
		IndicatorOccurrenceType1 oldIndicatorOccurrence = indicatorOccurrence;
		boolean oldIndicatorOccurrenceESet = indicatorOccurrenceESet;
		indicatorOccurrence = INDICATOR_OCCURRENCE_EDEFAULT;
		indicatorOccurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE, oldIndicatorOccurrence, INDICATOR_OCCURRENCE_EDEFAULT, oldIndicatorOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndicatorOccurrence() {
		return indicatorOccurrenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRangeOccurrenceType getNumberRangeOccurrence() {
		return numberRangeOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberRangeOccurrence(NumberRangeOccurrenceType newNumberRangeOccurrence) {
		NumberRangeOccurrenceType oldNumberRangeOccurrence = numberRangeOccurrence;
		numberRangeOccurrence = newNumberRangeOccurrence == null ? NUMBER_RANGE_OCCURRENCE_EDEFAULT : newNumberRangeOccurrence;
		boolean oldNumberRangeOccurrenceESet = numberRangeOccurrenceESet;
		numberRangeOccurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE, oldNumberRangeOccurrence, numberRangeOccurrence, !oldNumberRangeOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberRangeOccurrence() {
		NumberRangeOccurrenceType oldNumberRangeOccurrence = numberRangeOccurrence;
		boolean oldNumberRangeOccurrenceESet = numberRangeOccurrenceESet;
		numberRangeOccurrence = NUMBER_RANGE_OCCURRENCE_EDEFAULT;
		numberRangeOccurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE, oldNumberRangeOccurrence, NUMBER_RANGE_OCCURRENCE_EDEFAULT, oldNumberRangeOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberRangeOccurrence() {
		return numberRangeOccurrenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType getRangeType() {
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeType(RangeTypeType newRangeType) {
		RangeTypeType oldRangeType = rangeType;
		rangeType = newRangeType == null ? RANGE_TYPE_EDEFAULT : newRangeType;
		boolean oldRangeTypeESet = rangeTypeESet;
		rangeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE, oldRangeType, rangeType, !oldRangeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRangeType() {
		RangeTypeType oldRangeType = rangeType;
		boolean oldRangeTypeESet = rangeTypeESet;
		rangeType = RANGE_TYPE_EDEFAULT;
		rangeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE, oldRangeType, RANGE_TYPE_EDEFAULT, oldRangeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRangeType() {
		return rangeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(Object newSeparator) {
		Object oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR, oldSeparator, separator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM:
				return basicSetThoroughfareNumberFrom(null, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO:
				return basicSetThoroughfareNumberTo(null, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM:
				return getThoroughfareNumberFrom();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO:
				return getThoroughfareNumberTo();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__CODE:
				return getCode();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR:
				return getIndicator();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE:
				return getIndicatorOccurrence();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE:
				return getNumberRangeOccurrence();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				return getRangeType();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR:
				return getSeparator();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE:
				return getType();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM:
				setThoroughfareNumberFrom((ThoroughfareNumberFromType)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO:
				setThoroughfareNumberTo((ThoroughfareNumberToType)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__CODE:
				setCode(newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR:
				setIndicator(newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE:
				setIndicatorOccurrence((IndicatorOccurrenceType1)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE:
				setNumberRangeOccurrence((NumberRangeOccurrenceType)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				setRangeType((RangeTypeType)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR:
				setSeparator(newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM:
				setThoroughfareNumberFrom((ThoroughfareNumberFromType)null);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO:
				setThoroughfareNumberTo((ThoroughfareNumberToType)null);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR:
				setIndicator(INDICATOR_EDEFAULT);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE:
				unsetIndicatorOccurrence();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE:
				unsetNumberRangeOccurrence();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				unsetRangeType();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR:
				setSeparator(SEPARATOR_EDEFAULT);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM:
				return thoroughfareNumberFrom != null;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO:
				return thoroughfareNumberTo != null;
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR:
				return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE:
				return isSetIndicatorOccurrence();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE:
				return isSetNumberRangeOccurrence();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				return isSetRangeType();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR:
				return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (code: ");
		result.append(code);
		result.append(", indicator: ");
		result.append(indicator);
		result.append(", indicatorOccurrence: ");
		if (indicatorOccurrenceESet) result.append(indicatorOccurrence); else result.append("<unset>");
		result.append(", numberRangeOccurrence: ");
		if (numberRangeOccurrenceESet) result.append(numberRangeOccurrence); else result.append("<unset>");
		result.append(", rangeType: ");
		if (rangeTypeESet) result.append(rangeType); else result.append("<unset>");
		result.append(", separator: ");
		result.append(separator);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ThoroughfareNumberRangeTypeImpl
