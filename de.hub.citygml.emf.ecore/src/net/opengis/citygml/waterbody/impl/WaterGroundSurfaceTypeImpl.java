/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import net.opengis.citygml.waterbody.WaterGroundSurfaceType;
import net.opengis.citygml.waterbody.WaterbodyPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Water Ground Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterGroundSurfaceTypeImpl#getGenericApplicationPropertyOfWaterGroundSurfaceGroup <em>Generic Application Property Of Water Ground Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterGroundSurfaceTypeImpl#getGenericApplicationPropertyOfWaterGroundSurface <em>Generic Application Property Of Water Ground Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaterGroundSurfaceTypeImpl extends AbstractWaterBoundarySurfaceTypeImpl implements WaterGroundSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWaterGroundSurfaceGroup() <em>Generic Application Property Of Water Ground Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWaterGroundSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWaterGroundSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterGroundSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WaterbodyPackage.Literals.WATER_GROUND_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWaterGroundSurfaceGroup() {
		if (genericApplicationPropertyOfWaterGroundSurfaceGroup == null) {
			genericApplicationPropertyOfWaterGroundSurfaceGroup = new BasicFeatureMap(this, WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfWaterGroundSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWaterGroundSurface() {
		return getGenericApplicationPropertyOfWaterGroundSurfaceGroup().list(WaterbodyPackage.Literals.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterGroundSurfaceGroup()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterGroundSurface()).basicRemove(otherEnd, msgs);
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
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWaterGroundSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWaterGroundSurfaceGroup()).getWrapper();
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE:
				return getGenericApplicationPropertyOfWaterGroundSurface();
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
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWaterGroundSurfaceGroup()).set(newValue);
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
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP:
				getGenericApplicationPropertyOfWaterGroundSurfaceGroup().clear();
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
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP:
				return genericApplicationPropertyOfWaterGroundSurfaceGroup != null && !genericApplicationPropertyOfWaterGroundSurfaceGroup.isEmpty();
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE:
				return !getGenericApplicationPropertyOfWaterGroundSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfWaterGroundSurfaceGroup: ");
		result.append(genericApplicationPropertyOfWaterGroundSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //WaterGroundSurfaceTypeImpl
