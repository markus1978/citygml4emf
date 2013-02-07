/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import net.opengis.citygml.transportation.RailwayType;
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
 * An implementation of the model object '<em><b>Railway Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.RailwayTypeImpl#getGenericApplicationPropertyOfRailwayGroup <em>Generic Application Property Of Railway Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.RailwayTypeImpl#getGenericApplicationPropertyOfRailway <em>Generic Application Property Of Railway</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailwayTypeImpl extends TransportationComplexTypeImpl implements RailwayType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfRailwayGroup() <em>Generic Application Property Of Railway Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfRailwayGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfRailwayGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.RAILWAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfRailwayGroup() {
		if (genericApplicationPropertyOfRailwayGroup == null) {
			genericApplicationPropertyOfRailwayGroup = new BasicFeatureMap(this, TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP);
		}
		return genericApplicationPropertyOfRailwayGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfRailway() {
		return getGenericApplicationPropertyOfRailwayGroup().list(TransportationPackage.Literals.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRailwayGroup()).basicRemove(otherEnd, msgs);
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRailway()).basicRemove(otherEnd, msgs);
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
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP:
				if (coreType) return getGenericApplicationPropertyOfRailwayGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfRailwayGroup()).getWrapper();
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY:
				return getGenericApplicationPropertyOfRailway();
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
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfRailwayGroup()).set(newValue);
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
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP:
				getGenericApplicationPropertyOfRailwayGroup().clear();
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
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP:
				return genericApplicationPropertyOfRailwayGroup != null && !genericApplicationPropertyOfRailwayGroup.isEmpty();
			case TransportationPackage.RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY:
				return !getGenericApplicationPropertyOfRailway().isEmpty();
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
		result.append(" (genericApplicationPropertyOfRailwayGroup: ");
		result.append(genericApplicationPropertyOfRailwayGroup);
		result.append(')');
		return result.toString();
	}

} //RailwayTypeImpl
