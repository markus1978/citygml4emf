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
 * A representation of the model object '<em><b>Premise Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.PremiseType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseName <em>Premise Name</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseLocation <em>Premise Location</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseNumber <em>Premise Number</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseNumberRange <em>Premise Number Range</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getSubPremise <em>Sub Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getFirm <em>Firm</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getMailStop <em>Mail Stop</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremise <em>Premise</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseDependency <em>Premise Dependency</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseDependencyType <em>Premise Dependency Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getPremiseThoroughfareConnector <em>Premise Thoroughfare Connector</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getPremiseType()
 * @model extendedMetaData="name='Premise_._type' kind='elementOnly'"
 * @generated
 */
public interface PremiseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPremiseType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Premise Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.PremiseNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the name of the premise (house, building, park, farm, etc). A premise name is specified when the premise cannot be addressed using a street name plus premise (house) number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PremiseNameType> getPremiseName();

	/**
	 * Returns the value of the '<em><b>Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LOBBY, BASEMENT, GROUND FLOOR, etc...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Location</em>' containment reference.
	 * @see #setPremiseLocation(PremiseLocationType)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseLocationType getPremiseLocation();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getPremiseLocation <em>Premise Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Location</em>' containment reference.
	 * @see #getPremiseLocation()
	 * @generated
	 */
	void setPremiseLocation(PremiseLocationType value);

	/**
	 * Returns the value of the '<em><b>Premise Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.PremiseNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the identifier of the premise (house, building, etc). Premises in a street are often uniquely identified by means of consecutive identifiers. The identifier can be a number, a letter or any combination of the two.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PremiseNumberType> getPremiseNumber();

	/**
	 * Returns the value of the '<em><b>Premise Number Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification for defining the premise number range. Some premises have number as Building C1-C7
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Range</em>' containment reference.
	 * @see #setPremiseNumberRange(PremiseNumberRangeType)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseNumberRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseNumberRange' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseNumberRangeType getPremiseNumberRange();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getPremiseNumberRange <em>Premise Number Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Number Range</em>' containment reference.
	 * @see #getPremiseNumberRange()
	 * @generated
	 */
	void setPremiseNumberRange(PremiseNumberRangeType value);

	/**
	 * Returns the value of the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.PremiseNumberPrefixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A in A12
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Prefix</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseNumberPrefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PremiseNumberPrefixType> getPremiseNumberPrefix();

	/**
	 * Returns the value of the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.PremiseNumberSuffixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A in 12A
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Suffix</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseNumberSuffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PremiseNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PremiseNumberSuffixType> getPremiseNumberSuffix();

	/**
	 * Returns the value of the '<em><b>Building Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.BuildingNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the name of a building.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Building Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPremiseType_BuildingName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BuildingName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BuildingNameType> getBuildingName();

	/**
	 * Returns the value of the '<em><b>Sub Premise</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.SubPremiseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a single sub-premise. Examples of sub-premises are apartments and suites. Each sub-premise should be uniquely identifiable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Premise</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPremiseType_SubPremise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPremise' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubPremiseType> getSubPremise();

	/**
	 * Returns the value of the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a firm, company, organization, etc. It can be specified as part of an address that contains a street or a postbox. It is therefore different from a large mail user address, which contains no street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Firm</em>' containment reference.
	 * @see #setFirm(FirmType)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_Firm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Firm' namespace='##targetNamespace'"
	 * @generated
	 */
	FirmType getFirm();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getFirm <em>Firm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firm</em>' containment reference.
	 * @see #getFirm()
	 * @generated
	 */
	void setFirm(FirmType value);

	/**
	 * Returns the value of the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MailStop is where the the mail is delivered to within a premise/subpremise/firm or a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail Stop</em>' containment reference.
	 * @see #setMailStop(MailStopType)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_MailStop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MailStop' namespace='##targetNamespace'"
	 * @generated
	 */
	MailStopType getMailStop();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getMailStop <em>Mail Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Stop</em>' containment reference.
	 * @see #getMailStop()
	 * @generated
	 */
	void setMailStop(MailStopType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(PostalCodeType value);

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
	 * @see org.oasis.xAL.XALPackage#getPremiseType_Premise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Premise' namespace='##targetNamespace'"
	 * @generated
	 */
	PremiseType getPremise();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getPremise <em>Premise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise</em>' containment reference.
	 * @see #getPremise()
	 * @generated
	 */
	void setPremise(PremiseType value);

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
	 * @see org.oasis.xAL.XALPackage#getPremiseType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':13' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Premise Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * STREET, PREMISE, SUBPREMISE, PARK, FARM, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Dependency</em>' attribute.
	 * @see #setPremiseDependency(Object)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseDependency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='PremiseDependency'"
	 * @generated
	 */
	Object getPremiseDependency();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getPremiseDependency <em>Premise Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Dependency</em>' attribute.
	 * @see #getPremiseDependency()
	 * @generated
	 */
	void setPremiseDependency(Object value);

	/**
	 * Returns the value of the '<em><b>Premise Dependency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NEAR, ADJACENT TO, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Dependency Type</em>' attribute.
	 * @see #setPremiseDependencyType(Object)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseDependencyType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='PremiseDependencyType'"
	 * @generated
	 */
	Object getPremiseDependencyType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getPremiseDependencyType <em>Premise Dependency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Dependency Type</em>' attribute.
	 * @see #getPremiseDependencyType()
	 * @generated
	 */
	void setPremiseDependencyType(Object value);

	/**
	 * Returns the value of the '<em><b>Premise Thoroughfare Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DES, DE, LA, LA, DU in RUE DU BOIS. These terms connect a premise/thoroughfare type and premise/thoroughfare name. Terms may appear with names AVE DU BOIS
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Thoroughfare Connector</em>' attribute.
	 * @see #setPremiseThoroughfareConnector(Object)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_PremiseThoroughfareConnector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='PremiseThoroughfareConnector'"
	 * @generated
	 */
	Object getPremiseThoroughfareConnector();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getPremiseThoroughfareConnector <em>Premise Thoroughfare Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Thoroughfare Connector</em>' attribute.
	 * @see #getPremiseThoroughfareConnector()
	 * @generated
	 */
	void setPremiseThoroughfareConnector(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * COMPLEXE in COMPLEX DES JARDINS, A building, station, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasis.xAL.XALPackage#getPremiseType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getPremiseType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':18' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PremiseType
