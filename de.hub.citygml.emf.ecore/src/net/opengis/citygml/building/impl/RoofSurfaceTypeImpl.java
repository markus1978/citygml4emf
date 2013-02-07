/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.RoofSurfaceType;

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
 * An implementation of the model object '<em><b>Roof Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.RoofSurfaceTypeImpl#getGenericApplicationPropertyOfRoofSurfaceGroup <em>Generic Application Property Of Roof Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoofSurfaceTypeImpl#getGenericApplicationPropertyOfRoofSurface <em>Generic Application Property Of Roof Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoofSurfaceTypeImpl extends AbstractBoundarySurfaceTypeImpl implements RoofSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfRoofSurfaceGroup() <em>Generic Application Property Of Roof Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfRoofSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfRoofSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoofSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.ROOF_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfRoofSurfaceGroup() {
		if (genericApplicationPropertyOfRoofSurfaceGroup == null) {
			genericApplicationPropertyOfRoofSurfaceGroup = new BasicFeatureMap(this, BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfRoofSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfRoofSurface() {
		return getGenericApplicationPropertyOfRoofSurfaceGroup().list(BuildingPackage.Literals.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRoofSurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRoofSurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfRoofSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfRoofSurfaceGroup()).getWrapper();
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE:
				return getGenericApplicationPropertyOfRoofSurface();
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
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfRoofSurfaceGroup()).set(newValue);
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
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP:
				getGenericApplicationPropertyOfRoofSurfaceGroup().clear();
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
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP:
				return genericApplicationPropertyOfRoofSurfaceGroup != null && !genericApplicationPropertyOfRoofSurfaceGroup.isEmpty();
			case BuildingPackage.ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE:
				return !getGenericApplicationPropertyOfRoofSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfRoofSurfaceGroup: ");
		result.append(genericApplicationPropertyOfRoofSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //RoofSurfaceTypeImpl
