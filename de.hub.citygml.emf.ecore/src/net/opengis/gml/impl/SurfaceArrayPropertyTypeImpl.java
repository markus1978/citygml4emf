/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractSurfaceType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.SurfaceArrayPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.SurfaceArrayPropertyTypeImpl#getSurfaceGroup <em>Surface Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.SurfaceArrayPropertyTypeImpl#getSurface <em>Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurfaceArrayPropertyTypeImpl extends EObjectImpl implements SurfaceArrayPropertyType {
	/**
	 * The cached value of the '{@link #getSurfaceGroup() <em>Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap surfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getSurfaceArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSurfaceGroup() {
		if (surfaceGroup == null) {
			surfaceGroup = new BasicFeatureMap(this, GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP);
		}
		return surfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSurfaceType> getSurface() {
		return getSurfaceGroup().list(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_Surface());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				return ((InternalEList<?>)getSurfaceGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE:
				return ((InternalEList<?>)getSurface()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				if (coreType) return getSurfaceGroup();
				return ((FeatureMap.Internal)getSurfaceGroup()).getWrapper();
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE:
				return getSurface();
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
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				((FeatureMap.Internal)getSurfaceGroup()).set(newValue);
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
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				getSurfaceGroup().clear();
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
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
				return surfaceGroup != null && !surfaceGroup.isEmpty();
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE:
				return !getSurface().isEmpty();
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
		result.append(" (surfaceGroup: ");
		result.append(surfaceGroup);
		result.append(')');
		return result.toString();
	}

} //SurfaceArrayPropertyTypeImpl
