/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Observation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.DirectedObservationType#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getDirectedObservationType()
 * @model extendedMetaData="name='DirectedObservationType' kind='elementOnly'"
 * @generated
 */
public interface DirectedObservationType extends ObservationType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(DirectionPropertyType)
	 * @see net.opengis.gml.GmlPackage#getDirectedObservationType_Direction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionPropertyType getDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectedObservationType#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionPropertyType value);

} // DirectedObservationType
