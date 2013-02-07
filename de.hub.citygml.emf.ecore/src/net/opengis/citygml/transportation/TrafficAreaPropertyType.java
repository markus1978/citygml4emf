/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

import net.opengis.gml.AssociationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traffic Area Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of TransportationComplex to its parts, which are traffic areas. The
 *                 TrafficAreaPropertyType element must either carry a reference to a TrafficArea object or contain a TrafficArea
 *                 object inline, but neither both nor none. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.TrafficAreaPropertyType#getTrafficArea <em>Traffic Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getTrafficAreaPropertyType()
 * @model extendedMetaData="name='TrafficAreaPropertyType' kind='elementOnly'"
 * @generated
 */
public interface TrafficAreaPropertyType extends AssociationType {
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
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTrafficAreaPropertyType_TrafficArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TrafficArea' namespace='##targetNamespace'"
	 * @generated
	 */
	TrafficAreaType getTrafficArea();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.TrafficAreaPropertyType#getTrafficArea <em>Traffic Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Area</em>' containment reference.
	 * @see #getTrafficArea()
	 * @generated
	 */
	void setTrafficArea(TrafficAreaType value);

} // TrafficAreaPropertyType
