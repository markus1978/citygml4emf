/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Encapsulates a ring to represent properties in features or geometry collections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.RingPropertyType#getRing <em>Ring</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getRingPropertyType()
 * @model extendedMetaData="name='RingPropertyType' kind='elementOnly'"
 * @generated
 */
public interface RingPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring</em>' containment reference.
	 * @see #setRing(RingType)
	 * @see net.opengis.gml.GmlPackage#getRingPropertyType_Ring()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ring' namespace='##targetNamespace'"
	 * @generated
	 */
	RingType getRing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.RingPropertyType#getRing <em>Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring</em>' containment reference.
	 * @see #getRing()
	 * @generated
	 */
	void setRing(RingType value);

} // RingPropertyType
