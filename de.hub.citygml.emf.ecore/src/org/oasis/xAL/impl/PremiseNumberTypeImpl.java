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
import org.oasis.xAL.IndicatorOccurrenceType3;
import org.oasis.xAL.NumberTypeOccurrenceType1;
import org.oasis.xAL.NumberTypeType;
import org.oasis.xAL.PremiseNumberType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Premise Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getIndicatorOccurrence <em>Indicator Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getNumberType <em>Number Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getNumberTypeOccurrence <em>Number Type Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PremiseNumberTypeImpl extends EObjectImpl implements PremiseNumberType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

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
	protected static final IndicatorOccurrenceType3 INDICATOR_OCCURRENCE_EDEFAULT = IndicatorOccurrenceType3.BEFORE;

	/**
	 * The cached value of the '{@link #getIndicatorOccurrence() <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatorOccurrence()
	 * @generated
	 * @ordered
	 */
	protected IndicatorOccurrenceType3 indicatorOccurrence = INDICATOR_OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Indicator Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indicatorOccurrenceESet;

	/**
	 * The default value of the '{@link #getNumberType() <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberType()
	 * @generated
	 * @ordered
	 */
	protected static final NumberTypeType NUMBER_TYPE_EDEFAULT = NumberTypeType.SINGLE;

	/**
	 * The cached value of the '{@link #getNumberType() <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberType()
	 * @generated
	 * @ordered
	 */
	protected NumberTypeType numberType = NUMBER_TYPE_EDEFAULT;

	/**
	 * This is true if the Number Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberTypeESet;

	/**
	 * The default value of the '{@link #getNumberTypeOccurrence() <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberTypeOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final NumberTypeOccurrenceType1 NUMBER_TYPE_OCCURRENCE_EDEFAULT = NumberTypeOccurrenceType1.BEFORE;

	/**
	 * The cached value of the '{@link #getNumberTypeOccurrence() <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberTypeOccurrence()
	 * @generated
	 * @ordered
	 */
	protected NumberTypeOccurrenceType1 numberTypeOccurrence = NUMBER_TYPE_OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Number Type Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberTypeOccurrenceESet;

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
	protected PremiseNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPremiseNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XALPackage.PREMISE_NUMBER_TYPE__MIXED);
		}
		return mixed;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_TYPE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_TYPE__INDICATOR, oldIndicator, indicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType3 getIndicatorOccurrence() {
		return indicatorOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatorOccurrence(IndicatorOccurrenceType3 newIndicatorOccurrence) {
		IndicatorOccurrenceType3 oldIndicatorOccurrence = indicatorOccurrence;
		indicatorOccurrence = newIndicatorOccurrence == null ? INDICATOR_OCCURRENCE_EDEFAULT : newIndicatorOccurrence;
		boolean oldIndicatorOccurrenceESet = indicatorOccurrenceESet;
		indicatorOccurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE, oldIndicatorOccurrence, indicatorOccurrence, !oldIndicatorOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicatorOccurrence() {
		IndicatorOccurrenceType3 oldIndicatorOccurrence = indicatorOccurrence;
		boolean oldIndicatorOccurrenceESet = indicatorOccurrenceESet;
		indicatorOccurrence = INDICATOR_OCCURRENCE_EDEFAULT;
		indicatorOccurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE, oldIndicatorOccurrence, INDICATOR_OCCURRENCE_EDEFAULT, oldIndicatorOccurrenceESet));
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
	public NumberTypeType getNumberType() {
		return numberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberType(NumberTypeType newNumberType) {
		NumberTypeType oldNumberType = numberType;
		numberType = newNumberType == null ? NUMBER_TYPE_EDEFAULT : newNumberType;
		boolean oldNumberTypeESet = numberTypeESet;
		numberTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE, oldNumberType, numberType, !oldNumberTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberType() {
		NumberTypeType oldNumberType = numberType;
		boolean oldNumberTypeESet = numberTypeESet;
		numberType = NUMBER_TYPE_EDEFAULT;
		numberTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE, oldNumberType, NUMBER_TYPE_EDEFAULT, oldNumberTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberType() {
		return numberTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeOccurrenceType1 getNumberTypeOccurrence() {
		return numberTypeOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberTypeOccurrence(NumberTypeOccurrenceType1 newNumberTypeOccurrence) {
		NumberTypeOccurrenceType1 oldNumberTypeOccurrence = numberTypeOccurrence;
		numberTypeOccurrence = newNumberTypeOccurrence == null ? NUMBER_TYPE_OCCURRENCE_EDEFAULT : newNumberTypeOccurrence;
		boolean oldNumberTypeOccurrenceESet = numberTypeOccurrenceESet;
		numberTypeOccurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE, oldNumberTypeOccurrence, numberTypeOccurrence, !oldNumberTypeOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberTypeOccurrence() {
		NumberTypeOccurrenceType1 oldNumberTypeOccurrence = numberTypeOccurrence;
		boolean oldNumberTypeOccurrenceESet = numberTypeOccurrenceESet;
		numberTypeOccurrence = NUMBER_TYPE_OCCURRENCE_EDEFAULT;
		numberTypeOccurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE, oldNumberTypeOccurrence, NUMBER_TYPE_OCCURRENCE_EDEFAULT, oldNumberTypeOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberTypeOccurrence() {
		return numberTypeOccurrenceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.PREMISE_NUMBER_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.PREMISE_NUMBER_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_NUMBER_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XALPackage.PREMISE_NUMBER_TYPE__CODE:
				return getCode();
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR:
				return getIndicator();
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE:
				return getIndicatorOccurrence();
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE:
				return getNumberType();
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE:
				return getNumberTypeOccurrence();
			case XALPackage.PREMISE_NUMBER_TYPE__TYPE:
				return getType();
			case XALPackage.PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_NUMBER_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__CODE:
				setCode(newValue);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR:
				setIndicator(newValue);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE:
				setIndicatorOccurrence((IndicatorOccurrenceType3)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE:
				setNumberType((NumberTypeType)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE:
				setNumberTypeOccurrence((NumberTypeOccurrenceType1)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_NUMBER_TYPE__MIXED:
				getMixed().clear();
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR:
				setIndicator(INDICATOR_EDEFAULT);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE:
				unsetIndicatorOccurrence();
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE:
				unsetNumberType();
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE:
				unsetNumberTypeOccurrence();
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.PREMISE_NUMBER_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XALPackage.PREMISE_NUMBER_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR:
				return INDICATOR_EDEFAULT == null ? indicator != null : !INDICATOR_EDEFAULT.equals(indicator);
			case XALPackage.PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE:
				return isSetIndicatorOccurrence();
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE:
				return isSetNumberType();
			case XALPackage.PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE:
				return isSetNumberTypeOccurrence();
			case XALPackage.PREMISE_NUMBER_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", code: ");
		result.append(code);
		result.append(", indicator: ");
		result.append(indicator);
		result.append(", indicatorOccurrence: ");
		if (indicatorOccurrenceESet) result.append(indicatorOccurrence); else result.append("<unset>");
		result.append(", numberType: ");
		if (numberTypeESet) result.append(numberType); else result.append("<unset>");
		result.append(", numberTypeOccurrence: ");
		if (numberTypeOccurrenceESet) result.append(numberTypeOccurrence); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PremiseNumberTypeImpl
