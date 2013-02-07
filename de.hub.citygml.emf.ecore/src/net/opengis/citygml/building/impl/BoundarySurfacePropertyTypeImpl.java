/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.AbstractBoundarySurfaceType;
import net.opengis.citygml.building.BoundarySurfacePropertyType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Surface Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.BoundarySurfacePropertyTypeImpl#getBoundarySurfaceGroup <em>Boundary Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BoundarySurfacePropertyTypeImpl#getBoundarySurface <em>Boundary Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundarySurfacePropertyTypeImpl extends AssociationTypeImpl implements BoundarySurfacePropertyType {
	/**
	 * The cached value of the '{@link #getBoundarySurfaceGroup() <em>Boundary Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundarySurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap boundarySurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundarySurfacePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.BOUNDARY_SURFACE_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getBoundarySurfaceGroup() {
		if (boundarySurfaceGroup == null) {
			boundarySurfaceGroup = new BasicFeatureMap(this, BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP);
		}
		return boundarySurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBoundarySurfaceType getBoundarySurface() {
		return (AbstractBoundarySurfaceType)getBoundarySurfaceGroup().get(BuildingPackage.Literals.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundarySurface(AbstractBoundarySurfaceType newBoundarySurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getBoundarySurfaceGroup()).basicAdd(BuildingPackage.Literals.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE, newBoundarySurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP:
				return ((InternalEList<?>)getBoundarySurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE:
				return basicSetBoundarySurface(null, msgs);
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
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP:
				if (coreType) return getBoundarySurfaceGroup();
				return ((FeatureMap.Internal)getBoundarySurfaceGroup()).getWrapper();
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE:
				return getBoundarySurface();
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
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP:
				((FeatureMap.Internal)getBoundarySurfaceGroup()).set(newValue);
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
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP:
				getBoundarySurfaceGroup().clear();
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
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP:
				return boundarySurfaceGroup != null && !boundarySurfaceGroup.isEmpty();
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE:
				return getBoundarySurface() != null;
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
		result.append(" (boundarySurfaceGroup: ");
		result.append(boundarySurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //BoundarySurfacePropertyTypeImpl
