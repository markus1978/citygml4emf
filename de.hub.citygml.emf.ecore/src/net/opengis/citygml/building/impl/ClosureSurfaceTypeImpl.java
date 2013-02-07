/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.ClosureSurfaceType;

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
 * An implementation of the model object '<em><b>Closure Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.ClosureSurfaceTypeImpl#getGenericApplicationPropertyOfClosureSurfaceGroup <em>Generic Application Property Of Closure Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.ClosureSurfaceTypeImpl#getGenericApplicationPropertyOfClosureSurface <em>Generic Application Property Of Closure Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosureSurfaceTypeImpl extends AbstractBoundarySurfaceTypeImpl implements ClosureSurfaceType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfClosureSurfaceGroup() <em>Generic Application Property Of Closure Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfClosureSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfClosureSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosureSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.CLOSURE_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfClosureSurfaceGroup() {
		if (genericApplicationPropertyOfClosureSurfaceGroup == null) {
			genericApplicationPropertyOfClosureSurfaceGroup = new BasicFeatureMap(this, BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfClosureSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfClosureSurface() {
		return getGenericApplicationPropertyOfClosureSurfaceGroup().list(BuildingPackage.Literals.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfClosureSurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfClosureSurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfClosureSurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfClosureSurfaceGroup()).getWrapper();
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE:
				return getGenericApplicationPropertyOfClosureSurface();
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
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfClosureSurfaceGroup()).set(newValue);
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
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP:
				getGenericApplicationPropertyOfClosureSurfaceGroup().clear();
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
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP:
				return genericApplicationPropertyOfClosureSurfaceGroup != null && !genericApplicationPropertyOfClosureSurfaceGroup.isEmpty();
			case BuildingPackage.CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE:
				return !getGenericApplicationPropertyOfClosureSurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfClosureSurfaceGroup: ");
		result.append(genericApplicationPropertyOfClosureSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //ClosureSurfaceTypeImpl
