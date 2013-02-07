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
 * A representation of the model object '<em><b>Thoroughfare Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumber <em>Thoroughfare Number</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumberRange <em>Thoroughfare Number Range</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfare <em>Dependent Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getDependentLocality <em>Dependent Locality</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getFirm <em>Firm</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfares <em>Dependent Thoroughfares</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresConnector <em>Dependent Thoroughfares Connector</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresIndicator <em>Dependent Thoroughfares Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getThoroughfareType()
 * @model extendedMetaData="name='Thoroughfare_._type' kind='elementOnly'"
 * @generated
 */
public interface ThoroughfareType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eg.: 23 Archer street or 25/15 Zero Avenue, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfareNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumber' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ThoroughfareNumberType> getThoroughfareNumber();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNumberRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container to represent a range of numbers (from x thru y)for a thoroughfare. eg. 1-2 Albert Av
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number Range</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfareNumberRange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberRange' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ThoroughfareNumberRangeType> getThoroughfareNumberRange();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNumberPrefixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix before the number. A in A12 Archer Street
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number Prefix</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfareNumberPrefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThoroughfareNumberPrefixType> getThoroughfareNumberPrefix();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNumberSuffixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Suffix after the number. A in 12A Archer Street
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number Suffix</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfareNumberSuffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThoroughfareNumberSuffixType> getThoroughfareNumberSuffix();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * North Baker Street, where North is the pre-direction. The direction appears before the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Pre Direction</em>' containment reference.
	 * @see #setThoroughfarePreDirection(ThoroughfarePreDirectionType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfarePreDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfarePreDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfarePreDirectionType getThoroughfarePreDirection();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Pre Direction</em>' containment reference.
	 * @see #getThoroughfarePreDirection()
	 * @generated
	 */
	void setThoroughfarePreDirection(ThoroughfarePreDirectionType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appears before the thoroughfare name. Ed. Spanish: Avenida Aurora, where Avenida is the leading type / French: Rue Moliere, where Rue is the leading type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Leading Type</em>' containment reference.
	 * @see #setThoroughfareLeadingType(ThoroughfareLeadingTypeType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfareLeadingType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareLeadingType' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareLeadingTypeType getThoroughfareLeadingType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Leading Type</em>' containment reference.
	 * @see #getThoroughfareLeadingType()
	 * @generated
	 */
	void setThoroughfareLeadingType(ThoroughfareLeadingTypeType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the name of a Thoroughfare (also dependant street name): street name, canal name, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfareName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThoroughfareNameType> getThoroughfareName();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appears after the thoroughfare name. Ed. British: Baker Lane, where Lane is the trailing type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Trailing Type</em>' containment reference.
	 * @see #setThoroughfareTrailingType(ThoroughfareTrailingTypeType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfareTrailingType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareTrailingType' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareTrailingTypeType getThoroughfareTrailingType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Trailing Type</em>' containment reference.
	 * @see #getThoroughfareTrailingType()
	 * @generated
	 */
	void setThoroughfareTrailingType(ThoroughfareTrailingTypeType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 221-bis Baker Street North, where North is the post-direction. The post-direction appears after the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Post Direction</em>' containment reference.
	 * @see #setThoroughfarePostDirection(ThoroughfarePostDirectionType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_ThoroughfarePostDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfarePostDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfarePostDirectionType getThoroughfarePostDirection();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Post Direction</em>' containment reference.
	 * @see #getThoroughfarePostDirection()
	 * @generated
	 */
	void setThoroughfarePostDirection(ThoroughfarePostDirectionType value);

	/**
	 * Returns the value of the '<em><b>Dependent Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DependentThroughfare is related to a street; occurs in GB, IE, ES, PT
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Thoroughfare</em>' containment reference.
	 * @see #setDependentThoroughfare(DependentThoroughfareType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_DependentThoroughfare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DependentThoroughfare' namespace='##targetNamespace'"
	 * @generated
	 */
	DependentThoroughfareType getDependentThoroughfare();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfare <em>Dependent Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Thoroughfare</em>' containment reference.
	 * @see #getDependentThoroughfare()
	 * @generated
	 */
	void setDependentThoroughfare(DependentThoroughfareType value);

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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_DependentLocality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DependentLocality' namespace='##targetNamespace'"
	 * @generated
	 */
	DependentLocalityType getDependentLocality();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentLocality <em>Dependent Locality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Locality</em>' containment reference.
	 * @see #getDependentLocality()
	 * @generated
	 */
	void setDependentLocality(DependentLocalityType value);

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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_Premise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Premise' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseType getPremise();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getPremise <em>Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise</em>' containment reference.
	 * @see #getPremise()
	 * @generated
	 */
	void setPremise(PremiseType value);

	/**
	 * Returns the value of the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a firm, company, organization, etc. It can be specified as part of an address that contains a street or a postbox. It is therefore different from 
	 * a large mail user address, which contains no street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Firm</em>' containment reference.
	 * @see #setFirm(FirmType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_Firm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Firm' namespace='##targetNamespace'"
	 * @generated
	 */
	FirmType getFirm();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getFirm <em>Firm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firm</em>' containment reference.
	 * @see #getFirm()
	 * @generated
	 */
	void setFirm(FirmType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getPostalCode <em>Postal Code</em>}' containment reference.
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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':16' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Dependent Thoroughfares</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.DependentThoroughfaresType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does this thoroughfare have a a dependent thoroughfare? Corner of street X, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Thoroughfares</em>' attribute.
	 * @see org.oasis.xAL.DependentThoroughfaresType
	 * @see #isSetDependentThoroughfares()
	 * @see #unsetDependentThoroughfares()
	 * @see #setDependentThoroughfares(DependentThoroughfaresType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_DependentThoroughfares()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DependentThoroughfares'"
	 * @generated
	 */
	DependentThoroughfaresType getDependentThoroughfares();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfares <em>Dependent Thoroughfares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Thoroughfares</em>' attribute.
	 * @see org.oasis.xAL.DependentThoroughfaresType
	 * @see #isSetDependentThoroughfares()
	 * @see #unsetDependentThoroughfares()
	 * @see #getDependentThoroughfares()
	 * @generated
	 */
	void setDependentThoroughfares(DependentThoroughfaresType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfares <em>Dependent Thoroughfares</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDependentThoroughfares()
	 * @see #getDependentThoroughfares()
	 * @see #setDependentThoroughfares(DependentThoroughfaresType)
	 * @generated
	 */
	void unsetDependentThoroughfares();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfares <em>Dependent Thoroughfares</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dependent Thoroughfares</em>' attribute is set.
	 * @see #unsetDependentThoroughfares()
	 * @see #getDependentThoroughfares()
	 * @see #setDependentThoroughfares(DependentThoroughfaresType)
	 * @generated
	 */
	boolean isSetDependentThoroughfares();

	/**
	 * Returns the value of the '<em><b>Dependent Thoroughfares Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corner of Street1 AND Street 2 where AND is the Connector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Thoroughfares Connector</em>' attribute.
	 * @see #setDependentThoroughfaresConnector(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_DependentThoroughfaresConnector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='DependentThoroughfaresConnector'"
	 * @generated
	 */
	Object getDependentThoroughfaresConnector();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresConnector <em>Dependent Thoroughfares Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Thoroughfares Connector</em>' attribute.
	 * @see #getDependentThoroughfaresConnector()
	 * @generated
	 */
	void setDependentThoroughfaresConnector(Object value);

	/**
	 * Returns the value of the '<em><b>Dependent Thoroughfares Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Corner of, Intersection of
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Thoroughfares Indicator</em>' attribute.
	 * @see #setDependentThoroughfaresIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_DependentThoroughfaresIndicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='DependentThoroughfaresIndicator'"
	 * @generated
	 */
	Object getDependentThoroughfaresIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresIndicator <em>Dependent Thoroughfares Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Thoroughfares Indicator</em>' attribute.
	 * @see #getDependentThoroughfaresIndicator()
	 * @generated
	 */
	void setDependentThoroughfaresIndicator(Object value);

	/**
	 * Returns the value of the '<em><b>Dependent Thoroughfares Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * STS in GEORGE and ADELAIDE STS, RDS IN A and B RDS, etc. Use only when both the street types are the same
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependent Thoroughfares Type</em>' attribute.
	 * @see #setDependentThoroughfaresType(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_DependentThoroughfaresType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='DependentThoroughfaresType'"
	 * @generated
	 */
	Object getDependentThoroughfaresType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Thoroughfares Type</em>' attribute.
	 * @see #getDependentThoroughfaresType()
	 * @generated
	 */
	void setDependentThoroughfaresType(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':22' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ThoroughfareType
