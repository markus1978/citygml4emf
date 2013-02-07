/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingFurnitureType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.InteriorFurniturePropertyType;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interior Furniture Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.InteriorFurniturePropertyTypeImpl#getBuildingFurniture <em>Building Furniture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteriorFurniturePropertyTypeImpl extends AssociationTypeImpl implements InteriorFurniturePropertyType {
	/**
	 * The cached value of the '{@link #getBuildingFurniture() <em>Building Furniture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingFurniture()
	 * @generated
	 * @ordered
	 */
	protected BuildingFurnitureType buildingFurniture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteriorFurniturePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.INTERIOR_FURNITURE_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingFurnitureType getBuildingFurniture() {
		return buildingFurniture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildingFurniture(BuildingFurnitureType newBuildingFurniture, NotificationChain msgs) {
		BuildingFurnitureType oldBuildingFurniture = buildingFurniture;
		buildingFurniture = newBuildingFurniture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE, oldBuildingFurniture, newBuildingFurniture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingFurniture(BuildingFurnitureType newBuildingFurniture) {
		if (newBuildingFurniture != buildingFurniture) {
			NotificationChain msgs = null;
			if (buildingFurniture != null)
				msgs = ((InternalEObject)buildingFurniture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE, null, msgs);
			if (newBuildingFurniture != null)
				msgs = ((InternalEObject)newBuildingFurniture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE, null, msgs);
			msgs = basicSetBuildingFurniture(newBuildingFurniture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE, newBuildingFurniture, newBuildingFurniture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE:
				return basicSetBuildingFurniture(null, msgs);
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
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE:
				return getBuildingFurniture();
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
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE:
				setBuildingFurniture((BuildingFurnitureType)newValue);
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
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE:
				setBuildingFurniture((BuildingFurnitureType)null);
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
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE:
				return buildingFurniture != null;
		}
		return super.eIsSet(featureID);
	}

} //InteriorFurniturePropertyTypeImpl
