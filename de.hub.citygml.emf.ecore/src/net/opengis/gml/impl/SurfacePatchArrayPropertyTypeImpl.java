/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractSurfacePatchType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.SurfacePatchArrayPropertyType;

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
 * An implementation of the model object '<em><b>Surface Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.SurfacePatchArrayPropertyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.SurfacePatchArrayPropertyTypeImpl#getSurfacePatchGroup <em>Surface Patch Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.SurfacePatchArrayPropertyTypeImpl#getSurfacePatch <em>Surface Patch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurfacePatchArrayPropertyTypeImpl extends EObjectImpl implements SurfacePatchArrayPropertyType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfacePatchArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getSurfacePatchArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSurfacePatchGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GmlPackage.eINSTANCE.getSurfacePatchArrayPropertyType_SurfacePatchGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSurfacePatchType> getSurfacePatch() {
		return getSurfacePatchGroup().list(GmlPackage.eINSTANCE.getSurfacePatchArrayPropertyType_SurfacePatch());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH_GROUP:
				return ((InternalEList<?>)getSurfacePatchGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH:
				return ((InternalEList<?>)getSurfacePatch()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH_GROUP:
				if (coreType) return getSurfacePatchGroup();
				return ((FeatureMap.Internal)getSurfacePatchGroup()).getWrapper();
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH:
				return getSurfacePatch();
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
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH_GROUP:
				((FeatureMap.Internal)getSurfacePatchGroup()).set(newValue);
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
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH_GROUP:
				getSurfacePatchGroup().clear();
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
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH_GROUP:
				return !getSurfacePatchGroup().isEmpty();
			case GmlPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE__SURFACE_PATCH:
				return !getSurfacePatch().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //SurfacePatchArrayPropertyTypeImpl
