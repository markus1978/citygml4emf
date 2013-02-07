/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.SurfacePatchArrayPropertyType;
import net.opengis.gml.SurfaceType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.SurfaceTypeImpl#getPatchesGroup <em>Patches Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.SurfaceTypeImpl#getPatches <em>Patches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurfaceTypeImpl extends AbstractSurfaceTypeImpl implements SurfaceType {
	/**
	 * The cached value of the '{@link #getPatchesGroup() <em>Patches Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatchesGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap patchesGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getSurfaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPatchesGroup() {
		if (patchesGroup == null) {
			patchesGroup = new BasicFeatureMap(this, GmlPackage.SURFACE_TYPE__PATCHES_GROUP);
		}
		return patchesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePatchArrayPropertyType getPatches() {
		return (SurfacePatchArrayPropertyType)getPatchesGroup().get(GmlPackage.eINSTANCE.getSurfaceType_Patches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatches(SurfacePatchArrayPropertyType newPatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getPatchesGroup()).basicAdd(GmlPackage.eINSTANCE.getSurfaceType_Patches(), newPatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatches(SurfacePatchArrayPropertyType newPatches) {
		((FeatureMap.Internal)getPatchesGroup()).set(GmlPackage.eINSTANCE.getSurfaceType_Patches(), newPatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.SURFACE_TYPE__PATCHES_GROUP:
				return ((InternalEList<?>)getPatchesGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.SURFACE_TYPE__PATCHES:
				return basicSetPatches(null, msgs);
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
			case GmlPackage.SURFACE_TYPE__PATCHES_GROUP:
				if (coreType) return getPatchesGroup();
				return ((FeatureMap.Internal)getPatchesGroup()).getWrapper();
			case GmlPackage.SURFACE_TYPE__PATCHES:
				return getPatches();
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
			case GmlPackage.SURFACE_TYPE__PATCHES_GROUP:
				((FeatureMap.Internal)getPatchesGroup()).set(newValue);
				return;
			case GmlPackage.SURFACE_TYPE__PATCHES:
				setPatches((SurfacePatchArrayPropertyType)newValue);
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
			case GmlPackage.SURFACE_TYPE__PATCHES_GROUP:
				getPatchesGroup().clear();
				return;
			case GmlPackage.SURFACE_TYPE__PATCHES:
				setPatches((SurfacePatchArrayPropertyType)null);
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
			case GmlPackage.SURFACE_TYPE__PATCHES_GROUP:
				return patchesGroup != null && !patchesGroup.isEmpty();
			case GmlPackage.SURFACE_TYPE__PATCHES:
				return getPatches() != null;
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
		result.append(" (patchesGroup: ");
		result.append(patchesGroup);
		result.append(')');
		return result.toString();
	}

} //SurfaceTypeImpl
