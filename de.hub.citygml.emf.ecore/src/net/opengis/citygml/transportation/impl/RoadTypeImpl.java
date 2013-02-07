/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import net.opengis.citygml.transportation.RoadType;
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
 * An implementation of the model object '<em><b>Road Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.RoadTypeImpl#getGenericApplicationPropertyOfRoadGroup <em>Generic Application Property Of Road Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.RoadTypeImpl#getGenericApplicationPropertyOfRoad <em>Generic Application Property Of Road</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoadTypeImpl extends TransportationComplexTypeImpl implements RoadType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfRoadGroup() <em>Generic Application Property Of Road Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfRoadGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfRoadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.ROAD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfRoadGroup() {
		if (genericApplicationPropertyOfRoadGroup == null) {
			genericApplicationPropertyOfRoadGroup = new BasicFeatureMap(this, TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP);
		}
		return genericApplicationPropertyOfRoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfRoad() {
		return getGenericApplicationPropertyOfRoadGroup().list(TransportationPackage.Literals.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRoadGroup()).basicRemove(otherEnd, msgs);
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRoad()).basicRemove(otherEnd, msgs);
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
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP:
				if (coreType) return getGenericApplicationPropertyOfRoadGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfRoadGroup()).getWrapper();
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD:
				return getGenericApplicationPropertyOfRoad();
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
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfRoadGroup()).set(newValue);
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
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP:
				getGenericApplicationPropertyOfRoadGroup().clear();
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
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP:
				return genericApplicationPropertyOfRoadGroup != null && !genericApplicationPropertyOfRoadGroup.isEmpty();
			case TransportationPackage.ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD:
				return !getGenericApplicationPropertyOfRoad().isEmpty();
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
		result.append(" (genericApplicationPropertyOfRoadGroup: ");
		result.append(genericApplicationPropertyOfRoadGroup);
		result.append(')');
		return result.toString();
	}

} //RoadTypeImpl
