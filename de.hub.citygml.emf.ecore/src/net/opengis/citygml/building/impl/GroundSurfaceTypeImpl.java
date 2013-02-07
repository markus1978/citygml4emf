/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.GroundSurfaceType;

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
 * An implementation of the model object '<em><b>Ground Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.GroundSurfaceTypeImpl#getGenericApplicationPropertyOfGroundSurfaceGroup <em>Generic Application Property Of Ground Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.GroundSurfaceTypeImpl#getGenericApplicationPropertyOfGroundSurface <em>Generic Application Property Of Ground Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroundSurfaceTypeImpl extends AbstractBoundarySurfaceTypeImpl implements GroundSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfGroundSurfaceGroup() <em>Generic Application Property Of Ground Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfGroundSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfGroundSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.GROUND_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfGroundSurfaceGroup() {
		if (genericApplicationPropertyOfGroundSurfaceGroup == null) {
			genericApplicationPropertyOfGroundSurfaceGroup = new BasicFeatureMap(this, BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfGroundSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfGroundSurface() {
		return getGenericApplicationPropertyOfGroundSurfaceGroup().list(BuildingPackage.Literals.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfGroundSurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfGroundSurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfGroundSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfGroundSurfaceGroup()).getWrapper();
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE:
				return getGenericApplicationPropertyOfGroundSurface();
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
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfGroundSurfaceGroup()).set(newValue);
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
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP:
				getGenericApplicationPropertyOfGroundSurfaceGroup().clear();
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
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP:
				return genericApplicationPropertyOfGroundSurfaceGroup != null && !genericApplicationPropertyOfGroundSurfaceGroup.isEmpty();
			case BuildingPackage.GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE:
				return !getGenericApplicationPropertyOfGroundSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfGroundSurfaceGroup: ");
		result.append(genericApplicationPropertyOfGroundSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //GroundSurfaceTypeImpl
