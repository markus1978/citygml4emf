/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.math.BigInteger;
import java.util.List;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.WorldToTextureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World To Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl#getAxisLabels <em>Axis Labels</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl#getSrsDimension <em>Srs Dimension</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl#getUomLabels <em>Uom Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorldToTextureTypeImpl extends EObjectImpl implements WorldToTextureType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected List<Double> value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxisLabels() <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLabels()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> AXIS_LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxisLabels() <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLabels()
	 * @generated
	 * @ordered
	 */
	protected List<String> axisLabels = AXIS_LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrsDimension() <em>Srs Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SRS_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrsDimension() <em>Srs Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsDimension()
	 * @generated
	 * @ordered
	 */
	protected BigInteger srsDimension = SRS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrsName() <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsName()
	 * @generated
	 * @ordered
	 */
	protected static final String SRS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrsName() <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrsName()
	 * @generated
	 * @ordered
	 */
	protected String srsName = SRS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUomLabels() <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomLabels()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> UOM_LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUomLabels() <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomLabels()
	 * @generated
	 * @ordered
	 */
	protected List<String> uomLabels = UOM_LABELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldToTextureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.WORLD_TO_TEXTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(List<Double> newValue) {
		List<Double> oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.WORLD_TO_TEXTURE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAxisLabels() {
		return axisLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisLabels(List<String> newAxisLabels) {
		List<String> oldAxisLabels = axisLabels;
		axisLabels = newAxisLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.WORLD_TO_TEXTURE_TYPE__AXIS_LABELS, oldAxisLabels, axisLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSrsDimension() {
		return srsDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrsDimension(BigInteger newSrsDimension) {
		BigInteger oldSrsDimension = srsDimension;
		srsDimension = newSrsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION, oldSrsDimension, srsDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrsName() {
		return srsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrsName(String newSrsName) {
		String oldSrsName = srsName;
		srsName = newSrsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_NAME, oldSrsName, srsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getUomLabels() {
		return uomLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUomLabels(List<String> newUomLabels) {
		List<String> oldUomLabels = uomLabels;
		uomLabels = newUomLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.WORLD_TO_TEXTURE_TYPE__UOM_LABELS, oldUomLabels, uomLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__VALUE:
				return getValue();
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__AXIS_LABELS:
				return getAxisLabels();
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION:
				return getSrsDimension();
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_NAME:
				return getSrsName();
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__UOM_LABELS:
				return getUomLabels();
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
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__VALUE:
				setValue((List<Double>)newValue);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__AXIS_LABELS:
				setAxisLabels((List<String>)newValue);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION:
				setSrsDimension((BigInteger)newValue);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_NAME:
				setSrsName((String)newValue);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__UOM_LABELS:
				setUomLabels((List<String>)newValue);
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
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__AXIS_LABELS:
				setAxisLabels(AXIS_LABELS_EDEFAULT);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION:
				setSrsDimension(SRS_DIMENSION_EDEFAULT);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_NAME:
				setSrsName(SRS_NAME_EDEFAULT);
				return;
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__UOM_LABELS:
				setUomLabels(UOM_LABELS_EDEFAULT);
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
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__AXIS_LABELS:
				return AXIS_LABELS_EDEFAULT == null ? axisLabels != null : !AXIS_LABELS_EDEFAULT.equals(axisLabels);
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION:
				return SRS_DIMENSION_EDEFAULT == null ? srsDimension != null : !SRS_DIMENSION_EDEFAULT.equals(srsDimension);
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__SRS_NAME:
				return SRS_NAME_EDEFAULT == null ? srsName != null : !SRS_NAME_EDEFAULT.equals(srsName);
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE__UOM_LABELS:
				return UOM_LABELS_EDEFAULT == null ? uomLabels != null : !UOM_LABELS_EDEFAULT.equals(uomLabels);
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
		result.append(", axisLabels: ");
		result.append(axisLabels);
		result.append(", srsDimension: ");
		result.append(srsDimension);
		result.append(", srsName: ");
		result.append(srsName);
		result.append(", uomLabels: ");
		result.append(uomLabels);
		result.append(')');
		return result.toString();
	}

} //WorldToTextureTypeImpl
