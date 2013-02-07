/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import net.opengis.citygml.transportation.TrafficAreaPropertyType;
import net.opengis.citygml.transportation.TrafficAreaType;
import net.opengis.citygml.transportation.TransportationPackage;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Area Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaPropertyTypeImpl#getTrafficArea <em>Traffic Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrafficAreaPropertyTypeImpl extends AssociationTypeImpl implements TrafficAreaPropertyType {
	/**
	 * The cached value of the '{@link #getTrafficArea() <em>Traffic Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficArea()
	 * @generated
	 * @ordered
	 */
	protected TrafficAreaType trafficArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficAreaPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.TRAFFIC_AREA_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficAreaType getTrafficArea() {
		return trafficArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrafficArea(TrafficAreaType newTrafficArea, NotificationChain msgs) {
		TrafficAreaType oldTrafficArea = trafficArea;
		trafficArea = newTrafficArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA, oldTrafficArea, newTrafficArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrafficArea(TrafficAreaType newTrafficArea) {
		if (newTrafficArea != trafficArea) {
			NotificationChain msgs = null;
			if (trafficArea != null)
				msgs = ((InternalEObject)trafficArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA, null, msgs);
			if (newTrafficArea != null)
				msgs = ((InternalEObject)newTrafficArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA, null, msgs);
			msgs = basicSetTrafficArea(newTrafficArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA, newTrafficArea, newTrafficArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA:
				return basicSetTrafficArea(null, msgs);
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
			case TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA:
				return getTrafficArea();
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
			case TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA:
				setTrafficArea((TrafficAreaType)newValue);
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
			case TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA:
				setTrafficArea((TrafficAreaType)null);
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
			case TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA:
				return trafficArea != null;
		}
		return super.eIsSet(featureID);
	}

} //TrafficAreaPropertyTypeImpl
