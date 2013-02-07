/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import net.opengis.citygml.waterbody.WaterClosureSurfaceType;
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
 * An implementation of the model object '<em><b>Water Closure Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterClosureSurfaceTypeImpl#getGenericApplicationPropertyOfWaterClosureSurfaceGroup <em>Generic Application Property Of Water Closure Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterClosureSurfaceTypeImpl#getGenericApplicationPropertyOfWaterClosureSurface <em>Generic Application Property Of Water Closure Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaterClosureSurfaceTypeImpl extends AbstractWaterBoundarySurfaceTypeImpl implements WaterClosureSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWaterClosureSurfaceGroup() <em>Generic Application Property Of Water Closure Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWaterClosureSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWaterClosureSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterClosureSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WaterbodyPackage.Literals.WATER_CLOSURE_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWaterClosureSurfaceGroup() {
		if (genericApplicationPropertyOfWaterClosureSurfaceGroup == null) {
			genericApplicationPropertyOfWaterClosureSurfaceGroup = new BasicFeatureMap(this, WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfWaterClosureSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWaterClosureSurface() {
		return getGenericApplicationPropertyOfWaterClosureSurfaceGroup().list(WaterbodyPackage.Literals.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterClosureSurfaceGroup()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterClosureSurface()).basicRemove(otherEnd, msgs);
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
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWaterClosureSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWaterClosureSurfaceGroup()).getWrapper();
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE:
				return getGenericApplicationPropertyOfWaterClosureSurface();
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
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWaterClosureSurfaceGroup()).set(newValue);
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
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP:
				getGenericApplicationPropertyOfWaterClosureSurfaceGroup().clear();
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
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP:
				return genericApplicationPropertyOfWaterClosureSurfaceGroup != null && !genericApplicationPropertyOfWaterClosureSurfaceGroup.isEmpty();
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE:
				return !getGenericApplicationPropertyOfWaterClosureSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfWaterClosureSurfaceGroup: ");
		result.append(genericApplicationPropertyOfWaterClosureSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //WaterClosureSurfaceTypeImpl
