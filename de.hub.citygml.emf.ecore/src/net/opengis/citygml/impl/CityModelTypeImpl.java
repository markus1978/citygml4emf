/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import net.opengis.citygml.CityModelType;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.gml.impl.AbstractFeatureCollectionTypeImpl;

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
 * An implementation of the model object '<em><b>City Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.CityModelTypeImpl#getGenericApplicationPropertyOfCityModelGroup <em>Generic Application Property Of City Model Group</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.CityModelTypeImpl#getGenericApplicationPropertyOfCityModel <em>Generic Application Property Of City Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityModelTypeImpl extends AbstractFeatureCollectionTypeImpl implements CityModelType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfCityModelGroup() <em>Generic Application Property Of City Model Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfCityModelGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfCityModelGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.CITY_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfCityModelGroup() {
		if (genericApplicationPropertyOfCityModelGroup == null) {
			genericApplicationPropertyOfCityModelGroup = new BasicFeatureMap(this, CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP);
		}
		return genericApplicationPropertyOfCityModelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfCityModel() {
		return getGenericApplicationPropertyOfCityModelGroup().list(CitygmlPackage.Literals.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityModelGroup()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityModel()).basicRemove(otherEnd, msgs);
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
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP:
				if (coreType) return getGenericApplicationPropertyOfCityModelGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfCityModelGroup()).getWrapper();
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL:
				return getGenericApplicationPropertyOfCityModel();
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
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfCityModelGroup()).set(newValue);
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
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP:
				getGenericApplicationPropertyOfCityModelGroup().clear();
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
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP:
				return genericApplicationPropertyOfCityModelGroup != null && !genericApplicationPropertyOfCityModelGroup.isEmpty();
			case CitygmlPackage.CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL:
				return !getGenericApplicationPropertyOfCityModel().isEmpty();
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
		result.append(" (genericApplicationPropertyOfCityModelGroup: ");
		result.append(genericApplicationPropertyOfCityModelGroup);
		result.append(')');
		return result.toString();
	}

} //CityModelTypeImpl
