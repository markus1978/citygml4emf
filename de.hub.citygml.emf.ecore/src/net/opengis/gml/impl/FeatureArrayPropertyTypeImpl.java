/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.FeatureArrayPropertyType;
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
 * An implementation of the model object '<em><b>Feature Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.FeatureArrayPropertyTypeImpl#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.FeatureArrayPropertyTypeImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureArrayPropertyTypeImpl extends EObjectImpl implements FeatureArrayPropertyType {
	/**
	 * The cached value of the '{@link #getFeatureGroup() <em>Feature Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap featureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getFeatureArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFeatureGroup() {
		if (featureGroup == null) {
			featureGroup = new BasicFeatureMap(this, GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP);
		}
		return featureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFeatureType> getFeature() {
		return getFeatureGroup().list(GmlPackage.eINSTANCE.getFeatureArrayPropertyType_Feature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				return ((InternalEList<?>)getFeatureGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				if (coreType) return getFeatureGroup();
				return ((FeatureMap.Internal)getFeatureGroup()).getWrapper();
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE:
				return getFeature();
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
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				((FeatureMap.Internal)getFeatureGroup()).set(newValue);
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
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				getFeatureGroup().clear();
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
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE_GROUP:
				return featureGroup != null && !featureGroup.isEmpty();
			case GmlPackage.FEATURE_ARRAY_PROPERTY_TYPE__FEATURE:
				return !getFeature().isEmpty();
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
		result.append(" (featureGroup: ");
		result.append(featureGroup);
		result.append(')');
		return result.toString();
	}

} //FeatureArrayPropertyTypeImpl
