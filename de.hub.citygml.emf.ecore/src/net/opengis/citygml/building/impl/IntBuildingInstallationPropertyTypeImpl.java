/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.IntBuildingInstallationPropertyType;
import net.opengis.citygml.building.IntBuildingInstallationType;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Building Installation Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.IntBuildingInstallationPropertyTypeImpl#getIntBuildingInstallation <em>Int Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntBuildingInstallationPropertyTypeImpl extends AssociationTypeImpl implements IntBuildingInstallationPropertyType {
	/**
	 * The cached value of the '{@link #getIntBuildingInstallation() <em>Int Building Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntBuildingInstallation()
	 * @generated
	 * @ordered
	 */
	protected IntBuildingInstallationType intBuildingInstallation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntBuildingInstallationPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.INT_BUILDING_INSTALLATION_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntBuildingInstallationType getIntBuildingInstallation() {
		return intBuildingInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntBuildingInstallation(IntBuildingInstallationType newIntBuildingInstallation, NotificationChain msgs) {
		IntBuildingInstallationType oldIntBuildingInstallation = intBuildingInstallation;
		intBuildingInstallation = newIntBuildingInstallation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION, oldIntBuildingInstallation, newIntBuildingInstallation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntBuildingInstallation(IntBuildingInstallationType newIntBuildingInstallation) {
		if (newIntBuildingInstallation != intBuildingInstallation) {
			NotificationChain msgs = null;
			if (intBuildingInstallation != null)
				msgs = ((InternalEObject)intBuildingInstallation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION, null, msgs);
			if (newIntBuildingInstallation != null)
				msgs = ((InternalEObject)newIntBuildingInstallation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION, null, msgs);
			msgs = basicSetIntBuildingInstallation(newIntBuildingInstallation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION, newIntBuildingInstallation, newIntBuildingInstallation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION:
				return basicSetIntBuildingInstallation(null, msgs);
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION:
				return getIntBuildingInstallation();
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION:
				setIntBuildingInstallation((IntBuildingInstallationType)newValue);
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION:
				setIntBuildingInstallation((IntBuildingInstallationType)null);
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION:
				return intBuildingInstallation != null;
		}
		return super.eIsSet(featureID);
	}

} //IntBuildingInstallationPropertyTypeImpl
