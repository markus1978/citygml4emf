/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.WallSurfaceType;

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
 * An implementation of the model object '<em><b>Wall Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.WallSurfaceTypeImpl#getGenericApplicationPropertyOfWallSurfaceGroup <em>Generic Application Property Of Wall Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.WallSurfaceTypeImpl#getGenericApplicationPropertyOfWallSurface <em>Generic Application Property Of Wall Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WallSurfaceTypeImpl extends AbstractBoundarySurfaceTypeImpl implements WallSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWallSurfaceGroup() <em>Generic Application Property Of Wall Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWallSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWallSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.WALL_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWallSurfaceGroup() {
		if (genericApplicationPropertyOfWallSurfaceGroup == null) {
			genericApplicationPropertyOfWallSurfaceGroup = new BasicFeatureMap(this, BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfWallSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWallSurface() {
		return getGenericApplicationPropertyOfWallSurfaceGroup().list(BuildingPackage.Literals.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWallSurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWallSurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWallSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWallSurfaceGroup()).getWrapper();
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE:
				return getGenericApplicationPropertyOfWallSurface();
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
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWallSurfaceGroup()).set(newValue);
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
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP:
				getGenericApplicationPropertyOfWallSurfaceGroup().clear();
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
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP:
				return genericApplicationPropertyOfWallSurfaceGroup != null && !genericApplicationPropertyOfWallSurfaceGroup.isEmpty();
			case BuildingPackage.WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE:
				return !getGenericApplicationPropertyOfWallSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfWallSurfaceGroup: ");
		result.append(genericApplicationPropertyOfWallSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //WallSurfaceTypeImpl
