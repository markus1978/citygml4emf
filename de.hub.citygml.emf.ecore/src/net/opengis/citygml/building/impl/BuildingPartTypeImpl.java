/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.BuildingPartType;

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
 * An implementation of the model object '<em><b>Part Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingPartTypeImpl#getGenericApplicationPropertyOfBuildingPartGroup <em>Generic Application Property Of Building Part Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingPartTypeImpl#getGenericApplicationPropertyOfBuildingPart <em>Generic Application Property Of Building Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingPartTypeImpl extends AbstractBuildingTypeImpl implements BuildingPartType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfBuildingPartGroup() <em>Generic Application Property Of Building Part Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfBuildingPartGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfBuildingPartGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingPartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.BUILDING_PART_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfBuildingPartGroup() {
		if (genericApplicationPropertyOfBuildingPartGroup == null) {
			genericApplicationPropertyOfBuildingPartGroup = new BasicFeatureMap(this, BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP);
		}
		return genericApplicationPropertyOfBuildingPartGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfBuildingPart() {
		return getGenericApplicationPropertyOfBuildingPartGroup().list(BuildingPackage.Literals.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuildingPartGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuildingPart()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP:
				if (coreType) return getGenericApplicationPropertyOfBuildingPartGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingPartGroup()).getWrapper();
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART:
				return getGenericApplicationPropertyOfBuildingPart();
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
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingPartGroup()).set(newValue);
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
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP:
				getGenericApplicationPropertyOfBuildingPartGroup().clear();
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
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP:
				return genericApplicationPropertyOfBuildingPartGroup != null && !genericApplicationPropertyOfBuildingPartGroup.isEmpty();
			case BuildingPackage.BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART:
				return !getGenericApplicationPropertyOfBuildingPart().isEmpty();
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
		result.append(" (genericApplicationPropertyOfBuildingPartGroup: ");
		result.append(genericApplicationPropertyOfBuildingPartGroup);
		result.append(')');
		return result.toString();
	}

} //BuildingPartTypeImpl
