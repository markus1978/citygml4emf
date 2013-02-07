/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import java.util.Collection;

import net.opengis.citygml.AddressPropertyType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.DoorType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.DoorTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DoorTypeImpl#getGenericApplicationPropertyOfDoorGroup <em>Generic Application Property Of Door Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DoorTypeImpl#getGenericApplicationPropertyOfDoor <em>Generic Application Property Of Door</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoorTypeImpl extends AbstractOpeningTypeImpl implements DoorType {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressPropertyType> address;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfDoorGroup() <em>Generic Application Property Of Door Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfDoorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfDoorGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.DOOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressPropertyType> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<AddressPropertyType>(AddressPropertyType.class, this, BuildingPackage.DOOR_TYPE__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfDoorGroup() {
		if (genericApplicationPropertyOfDoorGroup == null) {
			genericApplicationPropertyOfDoorGroup = new BasicFeatureMap(this, BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP);
		}
		return genericApplicationPropertyOfDoorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfDoor() {
		return getGenericApplicationPropertyOfDoorGroup().list(BuildingPackage.Literals.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.DOOR_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfDoorGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR:
				return ((InternalEList<?>)getGenericApplicationPropertyOfDoor()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.DOOR_TYPE__ADDRESS:
				return getAddress();
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP:
				if (coreType) return getGenericApplicationPropertyOfDoorGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfDoorGroup()).getWrapper();
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR:
				return getGenericApplicationPropertyOfDoor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuildingPackage.DOOR_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressPropertyType>)newValue);
				return;
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfDoorGroup()).set(newValue);
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
			case BuildingPackage.DOOR_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP:
				getGenericApplicationPropertyOfDoorGroup().clear();
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
			case BuildingPackage.DOOR_TYPE__ADDRESS:
				return address != null && !address.isEmpty();
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP:
				return genericApplicationPropertyOfDoorGroup != null && !genericApplicationPropertyOfDoorGroup.isEmpty();
			case BuildingPackage.DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR:
				return !getGenericApplicationPropertyOfDoor().isEmpty();
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
		result.append(" (genericApplicationPropertyOfDoorGroup: ");
		result.append(genericApplicationPropertyOfDoorGroup);
		result.append(')');
		return result.toString();
	}

} //DoorTypeImpl
