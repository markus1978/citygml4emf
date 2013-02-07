/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import net.opengis.citygml.transportation.TrackType;
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
 * An implementation of the model object '<em><b>Track Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrackTypeImpl#getGenericApplicationPropertyOfTrackGroup <em>Generic Application Property Of Track Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrackTypeImpl#getGenericApplicationPropertyOfTrack <em>Generic Application Property Of Track</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrackTypeImpl extends TransportationComplexTypeImpl implements TrackType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTrackGroup() <em>Generic Application Property Of Track Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTrackGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTrackGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.TRACK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTrackGroup() {
		if (genericApplicationPropertyOfTrackGroup == null) {
			genericApplicationPropertyOfTrackGroup = new BasicFeatureMap(this, TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP);
		}
		return genericApplicationPropertyOfTrackGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTrack() {
		return getGenericApplicationPropertyOfTrackGroup().list(TransportationPackage.Literals.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTrackGroup()).basicRemove(otherEnd, msgs);
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTrack()).basicRemove(otherEnd, msgs);
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
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTrackGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTrackGroup()).getWrapper();
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK:
				return getGenericApplicationPropertyOfTrack();
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
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTrackGroup()).set(newValue);
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
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP:
				getGenericApplicationPropertyOfTrackGroup().clear();
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
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP:
				return genericApplicationPropertyOfTrackGroup != null && !genericApplicationPropertyOfTrackGroup.isEmpty();
			case TransportationPackage.TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK:
				return !getGenericApplicationPropertyOfTrack().isEmpty();
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
		result.append(" (genericApplicationPropertyOfTrackGroup: ");
		result.append(genericApplicationPropertyOfTrackGroup);
		result.append(')');
		return result.toString();
	}

} //TrackTypeImpl
