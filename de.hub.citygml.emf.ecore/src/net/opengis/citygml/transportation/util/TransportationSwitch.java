/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.util;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.transportation.AbstractTransportationObjectType;
import net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType;
import net.opengis.citygml.transportation.AuxiliaryTrafficAreaType;
import net.opengis.citygml.transportation.DocumentRoot;
import net.opengis.citygml.transportation.RailwayType;
import net.opengis.citygml.transportation.RoadType;
import net.opengis.citygml.transportation.SquareType;
import net.opengis.citygml.transportation.TrackType;
import net.opengis.citygml.transportation.TrafficAreaPropertyType;
import net.opengis.citygml.transportation.TrafficAreaType;
import net.opengis.citygml.transportation.TransportationComplexType;
import net.opengis.citygml.transportation.TransportationPackage;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AssociationType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.transportation.TransportationPackage
 * @generated
 */
public class TransportationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransportationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationSwitch() {
		if (modelPackage == null) {
			modelPackage = TransportationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TransportationPackage.ABSTRACT_TRANSPORTATION_OBJECT_TYPE: {
				AbstractTransportationObjectType abstractTransportationObjectType = (AbstractTransportationObjectType)theEObject;
				T result = caseAbstractTransportationObjectType(abstractTransportationObjectType);
				if (result == null) result = caseAbstractCityObjectType(abstractTransportationObjectType);
				if (result == null) result = caseAbstractFeatureType(abstractTransportationObjectType);
				if (result == null) result = caseAbstractGMLType(abstractTransportationObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE: {
				AuxiliaryTrafficAreaPropertyType auxiliaryTrafficAreaPropertyType = (AuxiliaryTrafficAreaPropertyType)theEObject;
				T result = caseAuxiliaryTrafficAreaPropertyType(auxiliaryTrafficAreaPropertyType);
				if (result == null) result = caseAssociationType(auxiliaryTrafficAreaPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.AUXILIARY_TRAFFIC_AREA_TYPE: {
				AuxiliaryTrafficAreaType auxiliaryTrafficAreaType = (AuxiliaryTrafficAreaType)theEObject;
				T result = caseAuxiliaryTrafficAreaType(auxiliaryTrafficAreaType);
				if (result == null) result = caseAbstractTransportationObjectType(auxiliaryTrafficAreaType);
				if (result == null) result = caseAbstractCityObjectType(auxiliaryTrafficAreaType);
				if (result == null) result = caseAbstractFeatureType(auxiliaryTrafficAreaType);
				if (result == null) result = caseAbstractGMLType(auxiliaryTrafficAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.RAILWAY_TYPE: {
				RailwayType railwayType = (RailwayType)theEObject;
				T result = caseRailwayType(railwayType);
				if (result == null) result = caseTransportationComplexType(railwayType);
				if (result == null) result = caseAbstractTransportationObjectType(railwayType);
				if (result == null) result = caseAbstractCityObjectType(railwayType);
				if (result == null) result = caseAbstractFeatureType(railwayType);
				if (result == null) result = caseAbstractGMLType(railwayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.ROAD_TYPE: {
				RoadType roadType = (RoadType)theEObject;
				T result = caseRoadType(roadType);
				if (result == null) result = caseTransportationComplexType(roadType);
				if (result == null) result = caseAbstractTransportationObjectType(roadType);
				if (result == null) result = caseAbstractCityObjectType(roadType);
				if (result == null) result = caseAbstractFeatureType(roadType);
				if (result == null) result = caseAbstractGMLType(roadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.SQUARE_TYPE: {
				SquareType squareType = (SquareType)theEObject;
				T result = caseSquareType(squareType);
				if (result == null) result = caseTransportationComplexType(squareType);
				if (result == null) result = caseAbstractTransportationObjectType(squareType);
				if (result == null) result = caseAbstractCityObjectType(squareType);
				if (result == null) result = caseAbstractFeatureType(squareType);
				if (result == null) result = caseAbstractGMLType(squareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.TRACK_TYPE: {
				TrackType trackType = (TrackType)theEObject;
				T result = caseTrackType(trackType);
				if (result == null) result = caseTransportationComplexType(trackType);
				if (result == null) result = caseAbstractTransportationObjectType(trackType);
				if (result == null) result = caseAbstractCityObjectType(trackType);
				if (result == null) result = caseAbstractFeatureType(trackType);
				if (result == null) result = caseAbstractGMLType(trackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE: {
				TrafficAreaPropertyType trafficAreaPropertyType = (TrafficAreaPropertyType)theEObject;
				T result = caseTrafficAreaPropertyType(trafficAreaPropertyType);
				if (result == null) result = caseAssociationType(trafficAreaPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.TRAFFIC_AREA_TYPE: {
				TrafficAreaType trafficAreaType = (TrafficAreaType)theEObject;
				T result = caseTrafficAreaType(trafficAreaType);
				if (result == null) result = caseAbstractTransportationObjectType(trafficAreaType);
				if (result == null) result = caseAbstractCityObjectType(trafficAreaType);
				if (result == null) result = caseAbstractFeatureType(trafficAreaType);
				if (result == null) result = caseAbstractGMLType(trafficAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE: {
				TransportationComplexType transportationComplexType = (TransportationComplexType)theEObject;
				T result = caseTransportationComplexType(transportationComplexType);
				if (result == null) result = caseAbstractTransportationObjectType(transportationComplexType);
				if (result == null) result = caseAbstractCityObjectType(transportationComplexType);
				if (result == null) result = caseAbstractFeatureType(transportationComplexType);
				if (result == null) result = caseAbstractGMLType(transportationComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transportation Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transportation Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransportationObjectType(AbstractTransportationObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Traffic Area Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Traffic Area Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryTrafficAreaPropertyType(AuxiliaryTrafficAreaPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Traffic Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Traffic Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryTrafficAreaType(AuxiliaryTrafficAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Railway Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Railway Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRailwayType(RailwayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Road Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Road Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoadType(RoadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Square Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Square Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSquareType(SquareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrackType(TrackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traffic Area Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traffic Area Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrafficAreaPropertyType(TrafficAreaPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traffic Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traffic Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrafficAreaType(TrafficAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationComplexType(TransportationComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGMLType(AbstractGMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureType(AbstractFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract City Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract City Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCityObjectType(AbstractCityObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationType(AssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TransportationSwitch
