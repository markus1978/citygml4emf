/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfAuxiliaryTrafficArea <em>Generic Application Property Of Auxiliary Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfRailway <em>Generic Application Property Of Railway</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfRoad <em>Generic Application Property Of Road</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfSquare <em>Generic Application Property Of Square</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTrack <em>Generic Application Property Of Track</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTrafficArea <em>Generic Application Property Of Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTransportationComplex <em>Generic Application Property Of Transportation Complex</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTransportationObject <em>Generic Application Property Of Transportation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getTransportationObject <em>Transportation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getAuxiliaryTrafficArea <em>Auxiliary Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getRailway <em>Railway</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getTransportationComplex <em>Transportation Complex</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getRoad <em>Road</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getSquare <em>Square</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getTrack <em>Track</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.DocumentRoot#getTrafficArea <em>Traffic Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Auxiliary Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Auxiliary Traffic Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Auxiliary Traffic Area</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfAuxiliaryTrafficArea()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAuxiliaryTrafficArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfAuxiliaryTrafficArea();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Railway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Railway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Railway</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfRailway()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRailway' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfRailway();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Road</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Road</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Road</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfRoad()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRoad' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfRoad();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Square</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Square</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Square</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfSquare()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSquare' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfSquare();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Track</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Track</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfTrack()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTrack' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTrack();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Traffic Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Traffic Area</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfTrafficArea()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTrafficArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTrafficArea();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Transportation Complex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Transportation Complex</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfTransportationComplex()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTransportationComplex' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTransportationComplex();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Transportation Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Transportation Object</em>' containment reference.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_GenericApplicationPropertyOfTransportationObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTransportationObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTransportationObject();

	/**
	 * Returns the value of the '<em><b>Transportation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportation Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportation Object</em>' containment reference.
	 * @see #setTransportationObject(AbstractTransportationObjectType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_TransportationObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_TransportationObject' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	AbstractTransportationObjectType getTransportationObject();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getTransportationObject <em>Transportation Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportation Object</em>' containment reference.
	 * @see #getTransportationObject()
	 * @generated
	 */
	void setTransportationObject(AbstractTransportationObjectType value);

	/**
	 * Returns the value of the '<em><b>Auxiliary Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Traffic Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Traffic Area</em>' containment reference.
	 * @see #setAuxiliaryTrafficArea(AuxiliaryTrafficAreaType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_AuxiliaryTrafficArea()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuxiliaryTrafficArea' namespace='##targetNamespace' affiliation='_TransportationObject'"
	 * @generated
	 */
	AuxiliaryTrafficAreaType getAuxiliaryTrafficArea();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getAuxiliaryTrafficArea <em>Auxiliary Traffic Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary Traffic Area</em>' containment reference.
	 * @see #getAuxiliaryTrafficArea()
	 * @generated
	 */
	void setAuxiliaryTrafficArea(AuxiliaryTrafficAreaType value);

	/**
	 * Returns the value of the '<em><b>Railway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Railway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Railway</em>' containment reference.
	 * @see #setRailway(RailwayType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_Railway()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Railway' namespace='##targetNamespace' affiliation='TransportationComplex'"
	 * @generated
	 */
	RailwayType getRailway();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getRailway <em>Railway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Railway</em>' containment reference.
	 * @see #getRailway()
	 * @generated
	 */
	void setRailway(RailwayType value);

	/**
	 * Returns the value of the '<em><b>Transportation Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportation Complex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportation Complex</em>' containment reference.
	 * @see #setTransportationComplex(TransportationComplexType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_TransportationComplex()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransportationComplex' namespace='##targetNamespace' affiliation='_TransportationObject'"
	 * @generated
	 */
	TransportationComplexType getTransportationComplex();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getTransportationComplex <em>Transportation Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportation Complex</em>' containment reference.
	 * @see #getTransportationComplex()
	 * @generated
	 */
	void setTransportationComplex(TransportationComplexType value);

	/**
	 * Returns the value of the '<em><b>Road</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Road</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road</em>' containment reference.
	 * @see #setRoad(RoadType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_Road()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Road' namespace='##targetNamespace' affiliation='TransportationComplex'"
	 * @generated
	 */
	RoadType getRoad();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getRoad <em>Road</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road</em>' containment reference.
	 * @see #getRoad()
	 * @generated
	 */
	void setRoad(RoadType value);

	/**
	 * Returns the value of the '<em><b>Square</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Square</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' containment reference.
	 * @see #setSquare(SquareType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_Square()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Square' namespace='##targetNamespace' affiliation='TransportationComplex'"
	 * @generated
	 */
	SquareType getSquare();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getSquare <em>Square</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Square</em>' containment reference.
	 * @see #getSquare()
	 * @generated
	 */
	void setSquare(SquareType value);

	/**
	 * Returns the value of the '<em><b>Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' containment reference.
	 * @see #setTrack(TrackType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_Track()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Track' namespace='##targetNamespace' affiliation='TransportationComplex'"
	 * @generated
	 */
	TrackType getTrack();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getTrack <em>Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track</em>' containment reference.
	 * @see #getTrack()
	 * @generated
	 */
	void setTrack(TrackType value);

	/**
	 * Returns the value of the '<em><b>Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traffic Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Area</em>' containment reference.
	 * @see #setTrafficArea(TrafficAreaType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getDocumentRoot_TrafficArea()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrafficArea' namespace='##targetNamespace' affiliation='_TransportationObject'"
	 * @generated
	 */
	TrafficAreaType getTrafficArea();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.DocumentRoot#getTrafficArea <em>Traffic Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Area</em>' containment reference.
	 * @see #getTrafficArea()
	 * @generated
	 */
	void setTrafficArea(TrafficAreaType value);

} // DocumentRoot
