/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingInstallationPropertyType;
import net.opengis.citygml.building.BuildingInstallationType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Installation Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationPropertyTypeImpl#getBuildingInstallation <em>Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingInstallationPropertyTypeImpl extends AssociationTypeImpl implements BuildingInstallationPropertyType {
	/**
	 * The cached value of the '{@link #getBuildingInstallation() <em>Building Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingInstallation()
	 * @generated
	 * @ordered
	 */
	protected BuildingInstallationType buildingInstallation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingInstallationPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.BUILDING_INSTALLATION_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingInstallationType getBuildingInstallation() {
		return buildingInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildingInstallation(BuildingInstallationType newBuildingInstallation, NotificationChain msgs) {
		BuildingInstallationType oldBuildingInstallation = buildingInstallation;
		buildingInstallation = newBuildingInstallation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION, oldBuildingInstallation, newBuildingInstallation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingInstallation(BuildingInstallationType newBuildingInstallation) {
		if (newBuildingInstallation != buildingInstallation) {
			NotificationChain msgs = null;
			if (buildingInstallation != null)
				msgs = ((InternalEObject)buildingInstallation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION, null, msgs);
			if (newBuildingInstallation != null)
				msgs = ((InternalEObject)newBuildingInstallation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION, null, msgs);
			msgs = basicSetBuildingInstallation(newBuildingInstallation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION, newBuildingInstallation, newBuildingInstallation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION:
				return basicSetBuildingInstallation(null, msgs);
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
			case BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION:
				return getBuildingInstallation();
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
			case BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION:
				setBuildingInstallation((BuildingInstallationType)newValue);
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
			case BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION:
				setBuildingInstallation((BuildingInstallationType)null);
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
			case BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION:
				return buildingInstallation != null;
		}
		return super.eIsSet(featureID);
	}

} //BuildingInstallationPropertyTypeImpl
