/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.List;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.TextureCoordinatesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Texture Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.TextureCoordinatesTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.TextureCoordinatesTypeImpl#getRing <em>Ring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextureCoordinatesTypeImpl extends EObjectImpl implements TextureCoordinatesType {
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
	 * The default value of the '{@link #getRing() <em>Ring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRing()
	 * @generated
	 * @ordered
	 */
	protected static final String RING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRing() <em>Ring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRing()
	 * @generated
	 * @ordered
	 */
	protected String ring = RING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureCoordinatesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.TEXTURE_COORDINATES_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.TEXTURE_COORDINATES_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRing() {
		return ring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRing(String newRing) {
		String oldRing = ring;
		ring = newRing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.TEXTURE_COORDINATES_TYPE__RING, oldRing, ring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__VALUE:
				return getValue();
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__RING:
				return getRing();
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
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__VALUE:
				setValue((List<Double>)newValue);
				return;
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__RING:
				setRing((String)newValue);
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
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__RING:
				setRing(RING_EDEFAULT);
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
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AppearancePackage.TEXTURE_COORDINATES_TYPE__RING:
				return RING_EDEFAULT == null ? ring != null : !RING_EDEFAULT.equals(ring);
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
		result.append(", ring: ");
		result.append(ring);
		result.append(')');
		return result.toString();
	}

} //TextureCoordinatesTypeImpl
