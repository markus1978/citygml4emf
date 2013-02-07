/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import net.opengis.citygml.waterbody.WaterSurfaceType;
import net.opengis.citygml.waterbody.WaterbodyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Water Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterSurfaceTypeImpl#getWaterLevel <em>Water Level</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterSurfaceTypeImpl#getGenericApplicationPropertyOfWaterSurfaceGroup <em>Generic Application Property Of Water Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterSurfaceTypeImpl#getGenericApplicationPropertyOfWaterSurface <em>Generic Application Property Of Water Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaterSurfaceTypeImpl extends AbstractWaterBoundarySurfaceTypeImpl implements WaterSurfaceType {
	/**
	 * The default value of the '{@link #getWaterLevel() <em>Water Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String WATER_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaterLevel() <em>Water Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterLevel()
	 * @generated
	 * @ordered
	 */
	protected String waterLevel = WATER_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWaterSurfaceGroup() <em>Generic Application Property Of Water Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWaterSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWaterSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WaterbodyPackage.Literals.WATER_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWaterLevel() {
		return waterLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterLevel(String newWaterLevel) {
		String oldWaterLevel = waterLevel;
		waterLevel = newWaterLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_SURFACE_TYPE__WATER_LEVEL, oldWaterLevel, waterLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWaterSurfaceGroup() {
		if (genericApplicationPropertyOfWaterSurfaceGroup == null) {
			genericApplicationPropertyOfWaterSurfaceGroup = new BasicFeatureMap(this, WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfWaterSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWaterSurface() {
		return getGenericApplicationPropertyOfWaterSurfaceGroup().list(WaterbodyPackage.Literals.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterSurfaceGroup()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterSurface()).basicRemove(otherEnd, msgs);
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
			case WaterbodyPackage.WATER_SURFACE_TYPE__WATER_LEVEL:
				return getWaterLevel();
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWaterSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWaterSurfaceGroup()).getWrapper();
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE:
				return getGenericApplicationPropertyOfWaterSurface();
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
			case WaterbodyPackage.WATER_SURFACE_TYPE__WATER_LEVEL:
				setWaterLevel((String)newValue);
				return;
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWaterSurfaceGroup()).set(newValue);
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
			case WaterbodyPackage.WATER_SURFACE_TYPE__WATER_LEVEL:
				setWaterLevel(WATER_LEVEL_EDEFAULT);
				return;
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP:
				getGenericApplicationPropertyOfWaterSurfaceGroup().clear();
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
			case WaterbodyPackage.WATER_SURFACE_TYPE__WATER_LEVEL:
				return WATER_LEVEL_EDEFAULT == null ? waterLevel != null : !WATER_LEVEL_EDEFAULT.equals(waterLevel);
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP:
				return genericApplicationPropertyOfWaterSurfaceGroup != null && !genericApplicationPropertyOfWaterSurfaceGroup.isEmpty();
			case WaterbodyPackage.WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE:
				return !getGenericApplicationPropertyOfWaterSurface().isEmpty();
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
		result.append(" (waterLevel: ");
		result.append(waterLevel);
		result.append(", genericApplicationPropertyOfWaterSurfaceGroup: ");
		result.append(genericApplicationPropertyOfWaterSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //WaterSurfaceTypeImpl
