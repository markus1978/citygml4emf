/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import net.opengis.gml.AssociationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an _CityObject to its addresses. The AddressPropertyType element must either
 *                 carry a reference to an Address object or contain an Address object inline, but neither both nor none.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.AddressPropertyType#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getAddressPropertyType()
 * @model extendedMetaData="name='AddressPropertyType' kind='elementOnly'"
 * @generated
 */
public interface AddressPropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see net.opengis.citygml.CitygmlPackage#getAddressPropertyType_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.AddressPropertyType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

} // AddressPropertyType
