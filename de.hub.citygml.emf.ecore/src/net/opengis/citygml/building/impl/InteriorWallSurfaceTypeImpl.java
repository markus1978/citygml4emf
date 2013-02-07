/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.InteriorWallSurfaceType;

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
 * An implementation of the model object '<em><b>Interior Wall Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.InteriorWallSurfaceTypeImpl#getGenericApplicationPropertyOfInteriorWallSurfaceGroup <em>Generic Application Property Of Interior Wall Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.InteriorWallSurfaceTypeImpl#getGenericApplicationPropertyOfInteriorWallSurface <em>Generic Application Property Of Interior Wall Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteriorWallSurfaceTypeImpl extends AbstractBoundarySurfaceTypeImpl implements InteriorWallSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfInteriorWallSurfaceGroup() <em>Generic Application Property Of Interior Wall Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfInteriorWallSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfInteriorWallSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteriorWallSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.INTERIOR_WALL_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfInteriorWallSurfaceGroup() {
		if (genericApplicationPropertyOfInteriorWallSurfaceGroup == null) {
			genericApplicationPropertyOfInteriorWallSurfaceGroup = new BasicFeatureMap(this, BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfInteriorWallSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfInteriorWallSurface() {
		return getGenericApplicationPropertyOfInteriorWallSurfaceGroup().list(BuildingPackage.Literals.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfInteriorWallSurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfInteriorWallSurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfInteriorWallSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfInteriorWallSurfaceGroup()).getWrapper();
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE:
				return getGenericApplicationPropertyOfInteriorWallSurface();
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
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfInteriorWallSurfaceGroup()).set(newValue);
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
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP:
				getGenericApplicationPropertyOfInteriorWallSurfaceGroup().clear();
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
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP:
				return genericApplicationPropertyOfInteriorWallSurfaceGroup != null && !genericApplicationPropertyOfInteriorWallSurfaceGroup.isEmpty();
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE:
				return !getGenericApplicationPropertyOfInteriorWallSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfInteriorWallSurfaceGroup: ");
		result.append(genericApplicationPropertyOfInteriorWallSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //InteriorWallSurfaceTypeImpl
