/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Service Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getAddressIdentifier <em>Address Identifier</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getEndorsementLineCode <em>Endorsement Line Code</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getKeyLineCode <em>Key Line Code</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getBarcode <em>Barcode</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getSortingCode <em>Sorting Code</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getAddressLatitude <em>Address Latitude</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getAddressLatitudeDirection <em>Address Latitude Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getAddressLongitude <em>Address Longitude</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getAddressLongitudeDirection <em>Address Longitude Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getSupplementaryPostalServiceData <em>Supplementary Postal Service Data</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalServiceElementsType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType()
 * @model extendedMetaData="name='PostalServiceElements_._type' kind='elementOnly'"
 * @generated
 */
public interface PostalServiceElementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressIdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier of an address assigned by postal authorities. Example: DPID in Australia
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Identifier</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_AddressIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressIdentifierType> getAddressIdentifier();

	/**
	 * Returns the value of the '<em><b>Endorsement Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Directly affects postal service distribution
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endorsement Line Code</em>' containment reference.
	 * @see #setEndorsementLineCode(EndorsementLineCodeType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_EndorsementLineCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndorsementLineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EndorsementLineCodeType getEndorsementLineCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getEndorsementLineCode <em>Endorsement Line Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endorsement Line Code</em>' containment reference.
	 * @see #getEndorsementLineCode()
	 * @generated
	 */
	void setEndorsementLineCode(EndorsementLineCodeType value);

	/**
	 * Returns the value of the '<em><b>Key Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required for some postal services
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Line Code</em>' containment reference.
	 * @see #setKeyLineCode(KeyLineCodeType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_KeyLineCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyLineCode' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyLineCodeType getKeyLineCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getKeyLineCode <em>Key Line Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Line Code</em>' containment reference.
	 * @see #getKeyLineCode()
	 * @generated
	 */
	void setKeyLineCode(KeyLineCodeType value);

	/**
	 * Returns the value of the '<em><b>Barcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required for some postal services
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Barcode</em>' containment reference.
	 * @see #setBarcode(BarcodeType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_Barcode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Barcode' namespace='##targetNamespace'"
	 * @generated
	 */
	BarcodeType getBarcode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getBarcode <em>Barcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barcode</em>' containment reference.
	 * @see #getBarcode()
	 * @generated
	 */
	void setBarcode(BarcodeType value);

	/**
	 * Returns the value of the '<em><b>Sorting Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for sorting addresses. Values may for example be CEDEX 16 (France)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorting Code</em>' containment reference.
	 * @see #setSortingCode(SortingCodeType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_SortingCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SortingCode' namespace='##targetNamespace'"
	 * @generated
	 */
	SortingCodeType getSortingCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getSortingCode <em>Sorting Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Code</em>' containment reference.
	 * @see #getSortingCode()
	 * @generated
	 */
	void setSortingCode(SortingCodeType value);

	/**
	 * Returns the value of the '<em><b>Address Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latitude of delivery address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Latitude</em>' containment reference.
	 * @see #setAddressLatitude(AddressLatitudeType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_AddressLatitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressLatitudeType getAddressLatitude();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLatitude <em>Address Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Latitude</em>' containment reference.
	 * @see #getAddressLatitude()
	 * @generated
	 */
	void setAddressLatitude(AddressLatitudeType value);

	/**
	 * Returns the value of the '<em><b>Address Latitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latitude direction of delivery address;N = North and S = South
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Latitude Direction</em>' containment reference.
	 * @see #setAddressLatitudeDirection(AddressLatitudeDirectionType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_AddressLatitudeDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLatitudeDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressLatitudeDirectionType getAddressLatitudeDirection();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLatitudeDirection <em>Address Latitude Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Latitude Direction</em>' containment reference.
	 * @see #getAddressLatitudeDirection()
	 * @generated
	 */
	void setAddressLatitudeDirection(AddressLatitudeDirectionType value);

	/**
	 * Returns the value of the '<em><b>Address Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Longtitude of delivery address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Longitude</em>' containment reference.
	 * @see #setAddressLongitude(AddressLongitudeType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_AddressLongitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressLongitudeType getAddressLongitude();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLongitude <em>Address Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Longitude</em>' containment reference.
	 * @see #getAddressLongitude()
	 * @generated
	 */
	void setAddressLongitude(AddressLongitudeType value);

	/**
	 * Returns the value of the '<em><b>Address Longitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Longtitude direction of delivery address;N=North and S=South
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Longitude Direction</em>' containment reference.
	 * @see #setAddressLongitudeDirection(AddressLongitudeDirectionType)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_AddressLongitudeDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLongitudeDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressLongitudeDirectionType getAddressLongitudeDirection();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLongitudeDirection <em>Address Longitude Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Longitude Direction</em>' containment reference.
	 * @see #getAddressLongitudeDirection()
	 * @generated
	 */
	void setAddressLongitudeDirection(AddressLongitudeDirectionType value);

	/**
	 * Returns the value of the '<em><b>Supplementary Postal Service Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.SupplementaryPostalServiceDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * any postal service elements not covered by the container can be represented using this element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplementary Postal Service Data</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_SupplementaryPostalServiceData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupplementaryPostalServiceData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupplementaryPostalServiceDataType> getSupplementaryPostalServiceData();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * USPS, ECMA, UN/PROLIST, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalServiceElementsType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.oasis.xAL.XALPackage#getPostalServiceElementsType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':12' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PostalServiceElementsType
