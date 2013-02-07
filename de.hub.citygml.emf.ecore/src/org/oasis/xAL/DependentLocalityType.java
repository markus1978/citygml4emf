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
 * A representation of the model object '<em><b>Dependent Locality Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getDependentLocalityName <em>Dependent Locality Name</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getDependentLocalityNumber <em>Dependent Locality Number</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getLargeMailUser <em>Large Mail User</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getPostOffice <em>Post Office</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getPostalRoute <em>Postal Route</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getDependentLocality <em>Dependent Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getUsageType <em>Usage Type</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentLocalityType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getDependentLocalityType()
 * @model extendedMetaData="name='DependentLocalityType' kind='elementOnly'"
 * @generated
 */
public interface DependentLocalityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Dependent Locality Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.DependentLocalityNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the dependent locality
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Locality Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_DependentLocalityName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DependentLocalityName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DependentLocalityNameType> getDependentLocalityName();

	/**
	 * Returns the value of the '<em><b>Dependent Locality Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of the dependent locality. Some areas are numbered. Eg. SECTOR 5 in a Suburb as in India or SOI SUKUMVIT 10 as in Thailand
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Locality Number</em>' containment reference.
	 * @see #setDependentLocalityNumber(DependentLocalityNumberType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_DependentLocalityNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DependentLocalityNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DependentLocalityNumberType getDependentLocalityNumber();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getDependentLocalityNumber <em>Dependent Locality Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Locality Number</em>' containment reference.
	 * @see #getDependentLocalityNumber()
	 * @generated
	 */
	void setDependentLocalityNumber(DependentLocalityNumberType value);

	/**
	 * Returns the value of the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a postbox like mail delivery point. Only a single postbox number can be specified. Examples of postboxes are POBox, free mail numbers, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box</em>' containment reference.
	 * @see #setPostBox(PostBoxType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_PostBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostBox' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxType getPostBox();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getPostBox <em>Post Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box</em>' containment reference.
	 * @see #getPostBox()
	 * @generated
	 */
	void setPostBox(PostBoxType value);

	/**
	 * Returns the value of the '<em><b>Large Mail User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a large mail user address. Examples of large mail users are postal companies, companies in France with a cedex number, hospitals and airports with their own post code. Large mail user addresses do not have a street name with premise name or premise number in countries like Netherlands. But they have a POBox and street also in countries like France
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Large Mail User</em>' containment reference.
	 * @see #setLargeMailUser(LargeMailUserType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_LargeMailUser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeMailUser' namespace='##targetNamespace'"
	 * @generated
	 */
	LargeMailUserType getLargeMailUser();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getLargeMailUser <em>Large Mail User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Mail User</em>' containment reference.
	 * @see #getLargeMailUser()
	 * @generated
	 */
	void setLargeMailUser(LargeMailUserType value);

	/**
	 * Returns the value of the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a post office. Examples are a rural post office where post is delivered and a post office containing post office boxes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Office</em>' containment reference.
	 * @see #setPostOffice(PostOfficeType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_PostOffice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostOffice' namespace='##targetNamespace'"
	 * @generated
	 */
	PostOfficeType getPostOffice();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getPostOffice <em>Post Office</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Office</em>' containment reference.
	 * @see #getPostOffice()
	 * @generated
	 */
	void setPostOffice(PostOfficeType value);

	/**
	 * Returns the value of the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  A Postal van is specific for a route as in Is`rael, Rural route
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Route</em>' containment reference.
	 * @see #setPostalRoute(PostalRouteType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_PostalRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalRoute' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalRouteType getPostalRoute();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getPostalRoute <em>Postal Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Route</em>' containment reference.
	 * @see #getPostalRoute()
	 * @generated
	 */
	void setPostalRoute(PostalRouteType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a thoroughfare. A thoroughfare could be a rd, street, canal, river, etc.  Note dependentlocality in a street. For example, in some countries, a large street will 
	 * have many subdivisions with numbers. Normally the subdivision name is the same as the road name, but with a number to identifiy it. Eg. SOI SUKUMVIT 3, SUKUMVIT RD, BANGKOK
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare</em>' containment reference.
	 * @see #setThoroughfare(ThoroughfareType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_Thoroughfare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Thoroughfare' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareType getThoroughfare();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getThoroughfare <em>Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare</em>' containment reference.
	 * @see #getThoroughfare()
	 * @generated
	 */
	void setThoroughfare(ThoroughfareType value);

	/**
	 * Returns the value of the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a single premise, for example a house or a building. The premise as a whole has a unique premise (house) number or a premise name.  There could be more than 
	 * one premise in a street referenced in an address. For example a building address near a major shopping centre or raiwlay station
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise</em>' containment reference.
	 * @see #setPremise(PremiseType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_Premise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Premise' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseType getPremise();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getPremise <em>Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise</em>' containment reference.
	 * @see #getPremise()
	 * @generated
	 */
	void setPremise(PremiseType value);

	/**
	 * Returns the value of the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dependent localities are Districts within cities/towns, locality divisions, postal 
	 * divisions of cities, suburbs, etc. DependentLocality is a recursive element, but no nesting deeper than two exists (Locality-DependentLocality-DependentLocality).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Locality</em>' containment reference.
	 * @see #setDependentLocality(DependentLocalityType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_DependentLocality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DependentLocality' namespace='##targetNamespace'"
	 * @generated
	 */
	DependentLocalityType getDependentLocality();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getDependentLocality <em>Dependent Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Locality</em>' containment reference.
	 * @see #getDependentLocality()
	 * @generated
	 */
	void setDependentLocality(DependentLocalityType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getPostalCode <em>Postal Code</em>}' containment reference.
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
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "VIA" as in Hill Top VIA Parish where Parish is a locality and Hill Top is a dependent locality
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector</em>' attribute.
	 * @see #setConnector(Object)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_Connector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Connector'"
	 * @generated
	 */
	Object getConnector();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getConnector <em>Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' attribute.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eg. Erode (Dist) where (Dist) is the Indicator
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getIndicator <em>Indicator</em>}' attribute.
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
	 * City or IndustrialEstate, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_UsageType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='UsageType'"
	 * @generated
	 */
	Object getUsageType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentLocalityType#getUsageType <em>Usage Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getDependentLocalityType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':16' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DependentLocalityType
