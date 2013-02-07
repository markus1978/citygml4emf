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
 * A representation of the model object '<em><b>Administrative Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getAdministrativeAreaName <em>Administrative Area Name</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getSubAdministrativeArea <em>Sub Administrative Area</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getPostOffice <em>Post Office</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link org.oasis.xAL.AdministrativeAreaType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType()
 * @model extendedMetaData="name='AdministrativeArea_._type' kind='elementOnly'"
 * @generated
 */
public interface AdministrativeAreaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Administrative Area Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AdministrativeAreaNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the administrative area. eg. MI in USA, NSW in Australia
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrative Area Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_AdministrativeAreaName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdministrativeAreaName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdministrativeAreaNameType> getAdministrativeAreaName();

	/**
	 * Returns the value of the '<em><b>Sub Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Specification of a sub-administrative area. An example of a sub-administrative areas is a county. There are two places where the name of an administrative 
	 * area can be specified and in this case, one becomes sub-administrative area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Administrative Area</em>' containment reference.
	 * @see #setSubAdministrativeArea(SubAdministrativeAreaType)
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_SubAdministrativeArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubAdministrativeArea' namespace='##targetNamespace'"
	 * @generated
	 */
	SubAdministrativeAreaType getSubAdministrativeArea();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.AdministrativeAreaType#getSubAdministrativeArea <em>Sub Administrative Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Administrative Area</em>' containment reference.
	 * @see #getSubAdministrativeArea()
	 * @generated
	 */
	void setSubAdministrativeArea(SubAdministrativeAreaType value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Locality is one level lower than adminisstrative area. Eg.: cities, reservations and any other built-up areas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality</em>' containment reference.
	 * @see #setLocality(LocalityType)
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_Locality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Locality' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalityType getLocality();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.AdministrativeAreaType#getLocality <em>Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' containment reference.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(LocalityType value);

	/**
	 * Returns the value of the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a post office. Examples are a rural post office where post is delivered and a post office containing post office boxes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Office</em>' containment reference.
	 * @see #setPostOffice(PostOfficeType)
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_PostOffice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostOffice' namespace='##targetNamespace'"
	 * @generated
	 */
	PostOfficeType getPostOffice();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.AdministrativeAreaType#getPostOffice <em>Post Office</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Office</em>' containment reference.
	 * @see #getPostOffice()
	 * @generated
	 */
	void setPostOffice(PostOfficeType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.AdministrativeAreaType#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(PostalCodeType value);

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
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erode (Dist) where (Dist) is the Indicator
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.AdministrativeAreaType#getIndicator <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' attribute.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Province or State or County or Kanton, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.AdministrativeAreaType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Postal or Political - Sometimes locations must be distinguished between postal system, and physical locations as defined by a political system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see #setUsageType(Object)
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_UsageType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='UsageType'"
	 * @generated
	 */
	Object getUsageType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.AdministrativeAreaType#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(Object value);

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
	 * @see org.oasis.xAL.XALPackage#getAdministrativeAreaType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // AdministrativeAreaType
