/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.CeilingSurfaceType;

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
 * An implementation of the model object '<em><b>Ceiling Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.CeilingSurfaceTypeImpl#getGenericApplicationPropertyOfCeilingSurfaceGroup <em>Generic Application Property Of Ceiling Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.CeilingSurfaceTypeImpl#getGenericApplicationPropertyOfCeilingSurface <em>Generic Application Property Of Ceiling Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CeilingSurfaceTypeImpl extends AbstractBoundarySurfaceTypeImpl implements CeilingSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfCeilingSurfaceGroup() <em>Generic Application Property Of Ceiling Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfCeilingSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfCeilingSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeilingSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.CEILING_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfCeilingSurfaceGroup() {
		if (genericApplicationPropertyOfCeilingSurfaceGroup == null) {
			genericApplicationPropertyOfCeilingSurfaceGroup = new BasicFeatureMap(this, BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfCeilingSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfCeilingSurface() {
		return getGenericApplicationPropertyOfCeilingSurfaceGroup().list(BuildingPackage.Literals.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCeilingSurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCeilingSurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfCeilingSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfCeilingSurfaceGroup()).getWrapper();
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE:
				return getGenericApplicationPropertyOfCeilingSurface();
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
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfCeilingSurfaceGroup()).set(newValue);
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
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP:
				getGenericApplicationPropertyOfCeilingSurfaceGroup().clear();
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
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP:
				return genericApplicationPropertyOfCeilingSurfaceGroup != null && !genericApplicationPropertyOfCeilingSurfaceGroup.isEmpty();
			case BuildingPackage.CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE:
				return !getGenericApplicationPropertyOfCeilingSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfCeilingSurfaceGroup: ");
		result.append(genericApplicationPropertyOfCeilingSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //CeilingSurfaceTypeImpl
