/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.FloorSurfaceType;

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
 * An implementation of the model object '<em><b>Floor Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.FloorSurfaceTypeImpl#getGenericApplicationPropertyOfFloorSurfaceGroup <em>Generic Application Property Of Floor Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.FloorSurfaceTypeImpl#getGenericApplicationPropertyOfFloorSurface <em>Generic Application Property Of Floor Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloorSurfaceTypeImpl extends AbstractBoundarySurfaceTypeImpl implements FloorSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfFloorSurfaceGroup() <em>Generic Application Property Of Floor Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfFloorSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfFloorSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloorSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.FLOOR_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfFloorSurfaceGroup() {
		if (genericApplicationPropertyOfFloorSurfaceGroup == null) {
			genericApplicationPropertyOfFloorSurfaceGroup = new BasicFeatureMap(this, BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfFloorSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfFloorSurface() {
		return getGenericApplicationPropertyOfFloorSurfaceGroup().list(BuildingPackage.Literals.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfFloorSurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfFloorSurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfFloorSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfFloorSurfaceGroup()).getWrapper();
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE:
				return getGenericApplicationPropertyOfFloorSurface();
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
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfFloorSurfaceGroup()).set(newValue);
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
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP:
				getGenericApplicationPropertyOfFloorSurfaceGroup().clear();
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
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP:
				return genericApplicationPropertyOfFloorSurfaceGroup != null && !genericApplicationPropertyOfFloorSurfaceGroup.isEmpty();
			case BuildingPackage.FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE:
				return !getGenericApplicationPropertyOfFloorSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfFloorSurfaceGroup: ");
		result.append(genericApplicationPropertyOfFloorSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //FloorSurfaceTypeImpl
