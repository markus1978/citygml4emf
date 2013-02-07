/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractGeometryType;
import net.opengis.gml.GeometryArrayPropertyType;
import net.opengis.gml.GmlPackage;

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
 * An implementation of the model object '<em><b>Geometry Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.GeometryArrayPropertyTypeImpl#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometryArrayPropertyTypeImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryArrayPropertyTypeImpl extends EObjectImpl implements GeometryArrayPropertyType {
	/**
	 * The cached value of the '{@link #getGeometryGroup() <em>Geometry Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap geometryGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getGeometryArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGeometryGroup() {
		if (geometryGroup == null) {
			geometryGroup = new BasicFeatureMap(this, GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY_GROUP);
		}
		return geometryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractGeometryType> getGeometry() {
		return getGeometryGroup().list(GmlPackage.eINSTANCE.getGeometryArrayPropertyType_Geometry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY_GROUP:
				return ((InternalEList<?>)getGeometryGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY:
				return ((InternalEList<?>)getGeometry()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY_GROUP:
				if (coreType) return getGeometryGroup();
				return ((FeatureMap.Internal)getGeometryGroup()).getWrapper();
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY:
				return getGeometry();
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
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY_GROUP:
				((FeatureMap.Internal)getGeometryGroup()).set(newValue);
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
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY_GROUP:
				getGeometryGroup().clear();
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
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY_GROUP:
				return geometryGroup != null && !geometryGroup.isEmpty();
			case GmlPackage.GEOMETRY_ARRAY_PROPERTY_TYPE__GEOMETRY:
				return !getGeometry().isEmpty();
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
		result.append(" (geometryGroup: ");
		result.append(geometryGroup);
		result.append(')');
		return result.toString();
	}

} //GeometryArrayPropertyTypeImpl