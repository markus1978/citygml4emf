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
 * A representation of the model object '<em><b>Country Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.CountryType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.CountryType#getCountryNameCode <em>Country Name Code</em>}</li>
 *   <li>{@link org.oasis.xAL.CountryType#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link org.oasis.xAL.CountryType#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link org.oasis.xAL.CountryType#getLocality <em>Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.CountryType#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.CountryType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.CountryType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getCountryType()
 * @model extendedMetaData="name='Country_._type' kind='elementOnly'"
 * @generated
 */
public interface CountryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getCountryType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Country Name Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.CountryNameCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A country code according to the specified scheme
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Name Code</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getCountryType_CountryNameCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CountryNameCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CountryNameCodeType> getCountryNameCode();

	/**
	 * Returns the value of the '<em><b>Country Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.CountryNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the name of a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getCountryType_CountryName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CountryName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CountryNameType> getCountryName();

	/**
	 * Returns the value of the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Examples of administrative areas are provinces counties, special regions (such as "Rijnmond"), etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Administrative Area</em>' containment reference.
	 * @see #setAdministrativeArea(AdministrativeAreaType)
	 * @see org.oasis.xAL.XALPackage#getCountryType_AdministrativeArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdministrativeArea' namespace='##targetNamespace'"
	 * @generated
	 */
	AdministrativeAreaType getAdministrativeArea();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.CountryType#getAdministrativeArea <em>Administrative Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrative Area</em>' containment reference.
	 * @see #getAdministrativeArea()
	 * @generated
	 */
	void setAdministrativeArea(AdministrativeAreaType value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Locality is one level lower than adminisstrative area. Eg.: cities, reservations and any other built-up areas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality</em>' containment reference.
	 * @see #setLocality(LocalityType)
	 * @see org.oasis.xAL.XALPackage#getCountryType_Locality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Locality' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalityType getLocality();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.CountryType#getLocality <em>Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' containment reference.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(LocalityType value);

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
	 * @see org.oasis.xAL.XALPackage#getCountryType_Thoroughfare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Thoroughfare' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareType getThoroughfare();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.CountryType#getThoroughfare <em>Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare</em>' containment reference.
	 * @see #getThoroughfare()
	 * @generated
	 */
	void setThoroughfare(ThoroughfareType value);

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
	 * @see org.oasis.xAL.XALPackage#getCountryType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see org.oasis.xAL.XALPackage#getCountryType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // CountryType
