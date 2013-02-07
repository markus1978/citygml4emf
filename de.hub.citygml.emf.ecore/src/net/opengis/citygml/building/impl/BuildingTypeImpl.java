/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.BuildingType;

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
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingTypeImpl#getGenericApplicationPropertyOfBuildingGroup <em>Generic Application Property Of Building Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingTypeImpl#getGenericApplicationPropertyOfBuilding <em>Generic Application Property Of Building</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingTypeImpl extends AbstractBuildingTypeImpl implements BuildingType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfBuildingGroup() <em>Generic Application Property Of Building Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfBuildingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfBuildingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.BUILDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfBuildingGroup() {
		if (genericApplicationPropertyOfBuildingGroup == null) {
			genericApplicationPropertyOfBuildingGroup = new BasicFeatureMap(this, BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP);
		}
		return genericApplicationPropertyOfBuildingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfBuilding() {
		return getGenericApplicationPropertyOfBuildingGroup().list(BuildingPackage.Literals.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuildingGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuilding()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP:
				if (coreType) return getGenericApplicationPropertyOfBuildingGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingGroup()).getWrapper();
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING:
				return getGenericApplicationPropertyOfBuilding();
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
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingGroup()).set(newValue);
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
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP:
				getGenericApplicationPropertyOfBuildingGroup().clear();
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
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP:
				return genericApplicationPropertyOfBuildingGroup != null && !genericApplicationPropertyOfBuildingGroup.isEmpty();
			case BuildingPackage.BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING:
				return !getGenericApplicationPropertyOfBuilding().isEmpty();
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
		result.append(" (genericApplicationPropertyOfBuildingGroup: ");
		result.append(genericApplicationPropertyOfBuildingGroup);
		result.append(')');
		return result.toString();
	}

} //BuildingTypeImpl
