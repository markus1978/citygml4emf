/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import org.eclipse.emf.ecore.EObject;
import org.oasis.xAL.AddressDetails;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xal Address Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an Address feature to the xAL address element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.XalAddressPropertyType#getAddressDetails <em>Address Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getXalAddressPropertyType()
 * @model extendedMetaData="name='xalAddressPropertyType' kind='elementOnly'"
 * @generated
 */
public interface XalAddressPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This container defines the details of the address. Can define multiple addresses including tracking address history
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Details</em>' containment reference.
	 * @see #setAddressDetails(AddressDetails)
	 * @see net.opengis.citygml.CitygmlPackage#getXalAddressPropertyType_AddressDetails()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AddressDetails' namespace='urn:oasis:names:tc:ciq:xsdschema:xAL:2.0'"
	 * @generated
	 */
	AddressDetails getAddressDetails();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.XalAddressPropertyType#getAddressDetails <em>Address Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Details</em>' containment reference.
	 * @see #getAddressDetails()
	 * @generated
	 */
	void setAddressDetails(AddressDetails value);

} // XalAddressPropertyType
