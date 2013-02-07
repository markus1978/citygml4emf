/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL;

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
 *   <li>{@link org.oasis.xAL.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getAddressDetails <em>Address Details</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getPostOffice <em>Post Office</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getPremiseNumber <em>Premise Number</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getPremiseNumberPrefix <em>Premise Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getPremiseNumberSuffix <em>Premise Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumber <em>Thoroughfare Number</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.DocumentRoot#getXAL <em>XAL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getDocumentRoot()
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
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_Mixed()
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
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This container defines the details of the address. Can define multiple addresses including tracking address history
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Details</em>' containment reference.
	 * @see #setAddressDetails(AddressDetails)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_AddressDetails()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressDetails' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressDetails getAddressDetails();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getAddressDetails <em>Address Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Details</em>' containment reference.
	 * @see #getAddressDetails()
	 * @generated
	 */
	void setAddressDetails(AddressDetails value);

	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference.
	 * @see #setAddressLine(AddressLineType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_AddressLine()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressLineType getAddressLine();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getAddressLine <em>Address Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Line</em>' containment reference.
	 * @see #getAddressLine()
	 * @generated
	 */
	void setAddressLine(AddressLineType value);

	/**
	 * Returns the value of the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Examples of administrative areas are provinces counties, special regions (such as "Rijnmond"), etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrative Area</em>' containment reference.
	 * @see #setAdministrativeArea(AdministrativeAreaType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_AdministrativeArea()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdministrativeArea' namespace='##targetNamespace'"
	 * @generated
	 */
	AdministrativeAreaType getAdministrativeArea();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getAdministrativeArea <em>Administrative Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Area</em>' containment reference.
	 * @see #getAdministrativeArea()
	 * @generated
	 */
	void setAdministrativeArea(AdministrativeAreaType value);

	/**
	 * Returns the value of the '<em><b>Country Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the name of a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Name</em>' containment reference.
	 * @see #setCountryName(CountryNameType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_CountryName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CountryName' namespace='##targetNamespace'"
	 * @generated
	 */
	CountryNameType getCountryName();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getCountryName <em>Country Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Name</em>' containment reference.
	 * @see #getCountryName()
	 * @generated
	 */
	void setCountryName(CountryNameType value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subdivision in the firm: School of Physics at Victoria University (School of Physics is the department)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Department</em>' containment reference.
	 * @see #setDepartment(DepartmentType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_Department()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Department' namespace='##targetNamespace'"
	 * @generated
	 */
	DepartmentType getDepartment();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getDepartment <em>Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' containment reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(DepartmentType value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Locality is one level lower than adminisstrative area. Eg.: cities, reservations and any other built-up areas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality</em>' containment reference.
	 * @see #setLocality(LocalityType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_Locality()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Locality' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalityType getLocality();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getLocality <em>Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' containment reference.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(LocalityType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_PostalCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(PostalCodeType value);

	/**
	 * Returns the value of the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a postbox like mail delivery point. Only a single postbox number can be specified. Examples of postboxes are POBox, free mail numbers, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box</em>' containment reference.
	 * @see #setPostBox(PostBoxType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_PostBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostBox' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxType getPostBox();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getPostBox <em>Post Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box</em>' containment reference.
	 * @see #getPostBox()
	 * @generated
	 */
	void setPostBox(PostBoxType value);

	/**
	 * Returns the value of the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a post office. Examples are a rural post office where post is delivered and a post office containing post office boxes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Office</em>' containment reference.
	 * @see #setPostOffice(PostOfficeType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_PostOffice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostOffice' namespace='##targetNamespace'"
	 * @generated
	 */
	PostOfficeType getPostOffice();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getPostOffice <em>Post Office</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Office</em>' containment reference.
	 * @see #getPostOffice()
	 * @generated
	 */
	void setPostOffice(PostOfficeType value);

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
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_Premise()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Premise' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseType getPremise();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getPremise <em>Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise</em>' containment reference.
	 * @see #getPremise()
	 * @generated
	 */
	void setPremise(PremiseType value);

	/**
	 * Returns the value of the '<em><b>Premise Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the identifier of the premise (house, building, etc). Premises in a street are often uniquely identified by means of consecutive identifiers. The identifier can be a number, a letter or any combination of the two.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number</em>' containment reference.
	 * @see #setPremiseNumber(PremiseNumberType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_PremiseNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PremiseNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseNumberType getPremiseNumber();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getPremiseNumber <em>Premise Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Number</em>' containment reference.
	 * @see #getPremiseNumber()
	 * @generated
	 */
	void setPremiseNumber(PremiseNumberType value);

	/**
	 * Returns the value of the '<em><b>Premise Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A in A12
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Prefix</em>' containment reference.
	 * @see #setPremiseNumberPrefix(PremiseNumberPrefixType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_PremiseNumberPrefix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PremiseNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseNumberPrefixType getPremiseNumberPrefix();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getPremiseNumberPrefix <em>Premise Number Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Number Prefix</em>' containment reference.
	 * @see #getPremiseNumberPrefix()
	 * @generated
	 */
	void setPremiseNumberPrefix(PremiseNumberPrefixType value);

	/**
	 * Returns the value of the '<em><b>Premise Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A in 12A
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Suffix</em>' containment reference.
	 * @see #setPremiseNumberSuffix(PremiseNumberSuffixType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_PremiseNumberSuffix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PremiseNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseNumberSuffixType getPremiseNumberSuffix();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getPremiseNumberSuffix <em>Premise Number Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Number Suffix</em>' containment reference.
	 * @see #getPremiseNumberSuffix()
	 * @generated
	 */
	void setPremiseNumberSuffix(PremiseNumberSuffixType value);

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
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_Thoroughfare()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Thoroughfare' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareType getThoroughfare();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getThoroughfare <em>Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare</em>' containment reference.
	 * @see #getThoroughfare()
	 * @generated
	 */
	void setThoroughfare(ThoroughfareType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eg.: 23 Archer street or 25/15 Zero Avenue, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number</em>' containment reference.
	 * @see #setThoroughfareNumber(ThoroughfareNumberType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_ThoroughfareNumber()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareNumberType getThoroughfareNumber();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumber <em>Thoroughfare Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Number</em>' containment reference.
	 * @see #getThoroughfareNumber()
	 * @generated
	 */
	void setThoroughfareNumber(ThoroughfareNumberType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix before the number. A in A12 Archer Street
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number Prefix</em>' containment reference.
	 * @see #setThoroughfareNumberPrefix(ThoroughfareNumberPrefixType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_ThoroughfareNumberPrefix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareNumberPrefixType getThoroughfareNumberPrefix();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Number Prefix</em>' containment reference.
	 * @see #getThoroughfareNumberPrefix()
	 * @generated
	 */
	void setThoroughfareNumberPrefix(ThoroughfareNumberPrefixType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Suffix after the number. A in 12A Archer Street
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number Suffix</em>' containment reference.
	 * @see #setThoroughfareNumberSuffix(ThoroughfareNumberSuffixType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_ThoroughfareNumberSuffix()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareNumberSuffixType getThoroughfareNumberSuffix();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Number Suffix</em>' containment reference.
	 * @see #getThoroughfareNumberSuffix()
	 * @generated
	 */
	void setThoroughfareNumberSuffix(ThoroughfareNumberSuffixType value);

	/**
	 * Returns the value of the '<em><b>XAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root element for a list of addresses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XAL</em>' containment reference.
	 * @see #setXAL(XALType)
	 * @see org.oasis.xAL.XALPackage#getDocumentRoot_XAL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xAL' namespace='##targetNamespace'"
	 * @generated
	 */
	XALType getXAL();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DocumentRoot#getXAL <em>XAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAL</em>' containment reference.
	 * @see #getXAL()
	 * @generated
	 */
	void setXAL(XALType value);

} // DocumentRoot
