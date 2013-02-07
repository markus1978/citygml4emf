/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.citygml.transportation.AbstractTransportationObjectType;
import net.opengis.citygml.transportation.TransportationPackage;

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
 * An implementation of the model object '<em><b>Abstract Transportation Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.AbstractTransportationObjectTypeImpl#getGenericApplicationPropertyOfTransportationObjectGroup <em>Generic Application Property Of Transportation Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.AbstractTransportationObjectTypeImpl#getGenericApplicationPropertyOfTransportationObject <em>Generic Application Property Of Transportation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTransportationObjectTypeImpl extends AbstractCityObjectTypeImpl implements AbstractTransportationObjectType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTransportationObjectGroup() <em>Generic Application Property Of Transportation Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTransportationObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTransportationObjectGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTransportationObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.ABSTRACT_TRANSPORTATION_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTransportationObjectGroup() {
		if (genericApplicationPropertyOfTransportationObjectGroup == null) {
			genericApplicationPropertyOfTransportationObjectGroup = new BasicFeatureMap(this, TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP);
		}
		return genericApplicationPropertyOfTransportationObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTransportationObject() {
		return getGenericApplicationPropertyOfTransportationObjectGroup().list(TransportationPackage.Literals.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTransportationObjectGroup()).basicRemove(otherEnd, msgs);
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTransportationObject()).basicRemove(otherEnd, msgs);
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
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTransportationObjectGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTransportationObjectGroup()).getWrapper();
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT:
				return getGenericApplicationPropertyOfTransportationObject();
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
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTransportationObjectGroup()).set(newValue);
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
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP:
				getGenericApplicationPropertyOfTransportationObjectGroup().clear();
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
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP:
				return genericApplicationPropertyOfTransportationObjectGroup != null && !genericApplicationPropertyOfTransportationObjectGroup.isEmpty();
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT:
				return !getGenericApplicationPropertyOfTransportationObject().isEmpty();
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
		result.append(" (genericApplicationPropertyOfTransportationObjectGroup: ");
		result.append(genericApplicationPropertyOfTransportationObjectGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractTransportationObjectTypeImpl
