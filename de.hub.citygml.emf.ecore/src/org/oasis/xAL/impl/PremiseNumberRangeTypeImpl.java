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
import org.oasis.xAL.IndicatorOccurenceType;
import org.oasis.xAL.NumberRangeOccurenceType;
import org.oasis.xAL.PremiseNumberRangeFromType;
import org.oasis.xAL.PremiseNumberRangeToType;
import org.oasis.xAL.PremiseNumberRangeType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Premise Number Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getPremiseNumberRangeFrom <em>Premise Number Range From</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getPremiseNumberRangeTo <em>Premise Number Range To</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getIndicatorOccurence <em>Indicator Occurence</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getNumberRangeOccurence <em>Number Range Occurence</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PremiseNumberRangeTypeImpl extends EObjectImpl implements PremiseNumberRangeType {
	/**
	 * The cached value of the '{@link #getPremiseNumberRangeFrom() <em>Premise Number Range From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumberRangeFrom()
	 * @generated
	 * @ordered
	 */
	protected PremiseNumberRangeFromType premiseNumberRangeFrom;

	/**
	 * The cached value of the '{@link #getPremiseNumberRangeTo() <em>Premise Number Range To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumberRangeTo()
	 * @generated
	 * @ordered
	 */
	protected PremiseNumberRangeToType premiseNumberRangeTo;

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
	 * The default value of the '{@link #getIndicatorOccurence() <em>Indicator Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatorOccurence()
	 * @generated
	 * @ordered
	 */
	protected static final IndicatorOccurenceType INDICATOR_OCCURENCE_EDEFAULT = IndicatorOccurenceType.BEFORE;

	/**
	 * The cached value of the '{@link #getIndicatorOccurence() <em>Indicator Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatorOccurence()
	 * @generated
	 * @ordered
	 */
	protected IndicatorOccurenceType indicatorOccurence = INDICATOR_OCCURENCE_EDEFAULT;

	/**
	 * This is true if the Indicator Occurence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicatorOccurenceESet;

	/**
	 * The default value of the '{@link #getNumberRangeOccurence() <em>Number Range Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRangeOccurence()
	 * @generated
	 * @ordered
	 */
	protected static final NumberRangeOccurenceType NUMBER_RANGE_OCCURENCE_EDEFAULT = NumberRangeOccurenceType.BEFORE_NAME;

	/**
	 * The cached value of the '{@link #getNumberRangeOccurence() <em>Number Range Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberRangeOccurence()
	 * @generated
	 * @ordered
	 */
	protected NumberRangeOccurenceType numberRangeOccurence = NUMBER_RANGE_OCCURENCE_EDEFAULT;

	/**
	 * This is true if the Number Range Occurence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberRangeOccurenceESet;

	/**
	 * The default value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected static final Object RANGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected Object rangeType = RANGE_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PremiseNumberRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPremiseNumberRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberRangeFromType getPremiseNumberRangeFrom() {
		return premiseNumberRangeFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseNumberRangeFrom(PremiseNumberRangeFromType newPremiseNumberRangeFrom, NotificationChain msgs) {
		PremiseNumberRangeFromType oldPremiseNumberRangeFrom = premiseNumberRangeFrom;
		premiseNumberRangeFrom = newPremiseNumberRangeFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM, oldPremiseNumberRangeFrom, newPremiseNumberRangeFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseNumberRangeFrom(PremiseNumberRangeFromType newPremiseNumberRangeFrom) {
		if (newPremiseNumberRangeFrom != premiseNumberRangeFrom) {
			NotificationChain msgs = null;
			if (premiseNumberRangeFrom != null)
				msgs = ((InternalEObject)premiseNumberRangeFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM, null, msgs);
			if (newPremiseNumberRangeFrom != null)
				msgs = ((InternalEObject)newPremiseNumberRangeFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM, null, msgs);
			msgs = basicSetPremiseNumberRangeFrom(newPremiseNumberRangeFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM, newPremiseNumberRangeFrom, newPremiseNumberRangeFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberRangeToType getPremiseNumberRangeTo() {
		return premiseNumberRangeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseNumberRangeTo(PremiseNumberRangeToType newPremiseNumberRangeTo, NotificationChain msgs) {
		PremiseNumberRangeToType oldPremiseNumberRangeTo = premiseNumberRangeTo;
		premiseNumberRangeTo = newPremiseNumberRangeTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO, oldPremiseNumberRangeTo, newPremiseNumberRangeTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiseNumberRangeTo(PremiseNumberRangeToType newPremiseNumberRangeTo) {
		if (newPremiseNumberRangeTo != premiseNumberRangeTo) {
			NotificationChain msgs = null;
			if (premiseNumberRangeTo != null)
				msgs = ((InternalEObject)premiseNumberRangeTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO, null, msgs);
			if (newPremiseNumberRangeTo != null)
				msgs = ((InternalEObject)newPremiseNumberRangeTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO, null, msgs);
			msgs = basicSetPremiseNumberRangeTo(newPremiseNumberRangeTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO, newPremiseNumberRangeTo, newPremiseNumberRangeTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR, oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurenceType getIndicatorOccurence() {
		return indicatorOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatorOccurence(IndicatorOccurenceType newIndicatorOccurence) {
		IndicatorOccurenceType oldIndicatorOccurence = indicatorOccurence;
		indicatorOccurence = newIndicatorOccurence == null ? INDICATOR_OCCURENCE_EDEFAULT : newIndicatorOccurence;
		boolean oldIndicatorOccurenceESet = indicatorOccurenceESet;
		indicatorOccurenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE, oldIndicatorOccurence, indicatorOccurence, !oldIndicatorOccurenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicatorOccurence() {
		IndicatorOccurenceType oldIndicatorOccurence = indicatorOccurence;
		boolean oldIndicatorOccurenceESet = indicatorOccurenceESet;
		indicatorOccurence = INDICATOR_OCCURENCE_EDEFAULT;
		indicatorOccurenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE, oldIndicatorOccurence, INDICATOR_OCCURENCE_EDEFAULT, oldIndicatorOccurenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndicatorOccurence() {
		return indicatorOccurenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRangeOccurenceType getNumberRangeOccurence() {
		return numberRangeOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberRangeOccurence(NumberRangeOccurenceType newNumberRangeOccurence) {
		NumberRangeOccurenceType oldNumberRangeOccurence = numberRangeOccurence;
		numberRangeOccurence = newNumberRangeOccurence == null ? NUMBER_RANGE_OCCURENCE_EDEFAULT : newNumberRangeOccurence;
		boolean oldNumberRangeOccurenceESet = numberRangeOccurenceESet;
		numberRangeOccurenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE, oldNumberRangeOccurence, numberRangeOccurence, !oldNumberRangeOccurenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberRangeOccurence() {
		NumberRangeOccurenceType oldNumberRangeOccurence = numberRangeOccurence;
		boolean oldNumberRangeOccurenceESet = numberRangeOccurenceESet;
		numberRangeOccurence = NUMBER_RANGE_OCCURENCE_EDEFAULT;
		numberRangeOccurenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE, oldNumberRangeOccurence, NUMBER_RANGE_OCCURENCE_EDEFAULT, oldNumberRangeOccurenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberRangeOccurence() {
		return numberRangeOccurenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRangeType() {
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeType(Object newRangeType) {
		Object oldRangeType = rangeType;
		rangeType = newRangeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE, oldRangeType, rangeType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__SEPARATOR, oldSeparator, separator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_RANGE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM:
				return basicSetPremiseNumberRangeFrom(null, msgs);
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO:
				return basicSetPremiseNumberRangeTo(null, msgs);
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
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM:
				return getPremiseNumberRangeFrom();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO:
				return getPremiseNumberRangeTo();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR:
				return getIndicator();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE:
				return getIndicatorOccurence();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE:
				return getNumberRangeOccurence();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				return getRangeType();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__SEPARATOR:
				return getSeparator();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__TYPE:
				return getType();
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
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM:
				setPremiseNumberRangeFrom((PremiseNumberRangeFromType)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO:
				setPremiseNumberRangeTo((PremiseNumberRangeToType)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR:
				setIndicator(newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE:
				setIndicatorOccurence((IndicatorOccurenceType)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE:
				setNumberRangeOccurence((NumberRangeOccurenceType)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				setRangeType(newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__SEPARATOR:
				setSeparator(newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__TYPE:
				setType(newValue);
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
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM:
				setPremiseNumberRangeFrom((PremiseNumberRangeFromType)null);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO:
				setPremiseNumberRangeTo((PremiseNumberRangeToType)null);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR:
				setIndicator(INDICATOR_EDEFAULT);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE:
				unsetIndicatorOccurence();
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE:
				unsetNumberRangeOccurence();
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				setRangeType(RANGE_TYPE_EDEFAULT);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__SEPARATOR:
				setSeparator(SEPARATOR_EDEFAULT);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM:
				return premiseNumberRangeFrom != null;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO:
				return premiseNumberRangeTo != null;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR:
				return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE:
				return isSetIndicatorOccurence();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE:
				return isSetNumberRangeOccurence();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE:
				return RANGE_TYPE_EDEFAULT == null ? rangeType != null : !RANGE_TYPE_EDEFAULT.equals(rangeType);
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__SEPARATOR:
				return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (indicator: ");
		result.append(indicator);
		result.append(", indicatorOccurence: ");
		if (indicatorOccurenceESet) result.append(indicatorOccurence); else result.append("<unset>");
		result.append(", numberRangeOccurence: ");
		if (numberRangeOccurenceESet) result.append(numberRangeOccurence); else result.append("<unset>");
		result.append(", rangeType: ");
		result.append(rangeType);
		result.append(", separator: ");
		result.append(separator);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PremiseNumberRangeTypeImpl
