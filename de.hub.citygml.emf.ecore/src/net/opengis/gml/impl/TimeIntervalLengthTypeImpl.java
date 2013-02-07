/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.TimeIntervalLengthType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval Length Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TimeIntervalLengthTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TimeIntervalLengthTypeImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TimeIntervalLengthTypeImpl#getRadix <em>Radix</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TimeIntervalLengthTypeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeIntervalLengthTypeImpl extends EObjectImpl implements TimeIntervalLengthType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected BigInteger factor = FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadix() <em>Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadix()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RADIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadix() <em>Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadix()
	 * @generated
	 * @ordered
	 */
	protected BigInteger radix = RADIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Object UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Object unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeIntervalLengthTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getTimeIntervalLengthType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigDecimal newValue) {
		BigDecimal oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TIME_INTERVAL_LENGTH_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(BigInteger newFactor) {
		BigInteger oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TIME_INTERVAL_LENGTH_TYPE__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRadix() {
		return radix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadix(BigInteger newRadix) {
		BigInteger oldRadix = radix;
		radix = newRadix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TIME_INTERVAL_LENGTH_TYPE__RADIX, oldRadix, radix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Object newUnit) {
		Object oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TIME_INTERVAL_LENGTH_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__VALUE:
				return getValue();
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__FACTOR:
				return getFactor();
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__RADIX:
				return getRadix();
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__UNIT:
				return getUnit();
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
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__FACTOR:
				setFactor((BigInteger)newValue);
				return;
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__RADIX:
				setRadix((BigInteger)newValue);
				return;
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__UNIT:
				setUnit(newValue);
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
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__FACTOR:
				setFactor(FACTOR_EDEFAULT);
				return;
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__RADIX:
				setRadix(RADIX_EDEFAULT);
				return;
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__FACTOR:
				return FACTOR_EDEFAULT == null ? factor != null : !FACTOR_EDEFAULT.equals(factor);
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__RADIX:
				return RADIX_EDEFAULT == null ? radix != null : !RADIX_EDEFAULT.equals(radix);
			case GmlPackage.TIME_INTERVAL_LENGTH_TYPE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", factor: ");
		result.append(factor);
		result.append(", radix: ");
		result.append(radix);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //TimeIntervalLengthTypeImpl
