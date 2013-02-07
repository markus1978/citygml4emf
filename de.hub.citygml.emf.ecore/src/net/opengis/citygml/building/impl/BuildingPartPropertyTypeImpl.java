/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.BuildingPartPropertyType;
import net.opengis.citygml.building.BuildingPartType;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingPartPropertyTypeImpl#getBuildingPart <em>Building Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingPartPropertyTypeImpl extends AssociationTypeImpl implements BuildingPartPropertyType {
	/**
	 * The cached value of the '{@link #getBuildingPart() <em>Building Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingPart()
	 * @generated
	 * @ordered
	 */
	protected BuildingPartType buildingPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingPartPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.BUILDING_PART_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingPartType getBuildingPart() {
		return buildingPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildingPart(BuildingPartType newBuildingPart, NotificationChain msgs) {
		BuildingPartType oldBuildingPart = buildingPart;
		buildingPart = newBuildingPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART, oldBuildingPart, newBuildingPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingPart(BuildingPartType newBuildingPart) {
		if (newBuildingPart != buildingPart) {
			NotificationChain msgs = null;
			if (buildingPart != null)
				msgs = ((InternalEObject)buildingPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART, null, msgs);
			if (newBuildingPart != null)
				msgs = ((InternalEObject)newBuildingPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART, null, msgs);
			msgs = basicSetBuildingPart(newBuildingPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART, newBuildingPart, newBuildingPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART:
				return basicSetBuildingPart(null, msgs);
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
			case BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART:
				return getBuildingPart();
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
			case BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART:
				setBuildingPart((BuildingPartType)newValue);
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
			case BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART:
				setBuildingPart((BuildingPartType)null);
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
			case BuildingPackage.BUILDING_PART_PROPERTY_TYPE__BUILDING_PART:
				return buildingPart != null;
		}
		return super.eIsSet(featureID);
	}

} //BuildingPartPropertyTypeImpl
