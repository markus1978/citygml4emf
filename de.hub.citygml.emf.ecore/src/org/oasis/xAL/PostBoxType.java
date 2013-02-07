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
 * A representation of the model object '<em><b>Post Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.PostBoxType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getPostBoxNumber <em>Post Box Number</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getPostBoxNumberPrefix <em>Post Box Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getPostBoxNumberSuffix <em>Post Box Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getPostBoxNumberExtension <em>Post Box Number Extension</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getFirm <em>Firm</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getPostBoxType()
 * @model extendedMetaData="name='PostBox_._type' kind='elementOnly'"
 * @generated
 */
public interface PostBoxType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Post Box Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the number of a postbox
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box Number</em>' containment reference.
	 * @see #setPostBoxNumber(PostBoxNumberType)
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_PostBoxNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PostBoxNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxNumberType getPostBoxNumber();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getPostBoxNumber <em>Post Box Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box Number</em>' containment reference.
	 * @see #getPostBoxNumber()
	 * @generated
	 */
	void setPostBoxNumber(PostBoxNumberType value);

	/**
	 * Returns the value of the '<em><b>Post Box Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the prefix of the post box number. eg. A in POBox:A-123
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box Number Prefix</em>' containment reference.
	 * @see #setPostBoxNumberPrefix(PostBoxNumberPrefixType)
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_PostBoxNumberPrefix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostBoxNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxNumberPrefixType getPostBoxNumberPrefix();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getPostBoxNumberPrefix <em>Post Box Number Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box Number Prefix</em>' containment reference.
	 * @see #getPostBoxNumberPrefix()
	 * @generated
	 */
	void setPostBoxNumberPrefix(PostBoxNumberPrefixType value);

	/**
	 * Returns the value of the '<em><b>Post Box Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the suffix of the post box number. eg. A in POBox:123A
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box Number Suffix</em>' containment reference.
	 * @see #setPostBoxNumberSuffix(PostBoxNumberSuffixType)
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_PostBoxNumberSuffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostBoxNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxNumberSuffixType getPostBoxNumberSuffix();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getPostBoxNumberSuffix <em>Post Box Number Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box Number Suffix</em>' containment reference.
	 * @see #getPostBoxNumberSuffix()
	 * @generated
	 */
	void setPostBoxNumberSuffix(PostBoxNumberSuffixType value);

	/**
	 * Returns the value of the '<em><b>Post Box Number Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some countries like USA have POBox as 12345-123
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box Number Extension</em>' containment reference.
	 * @see #setPostBoxNumberExtension(PostBoxNumberExtensionType)
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_PostBoxNumberExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostBoxNumberExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxNumberExtensionType getPostBoxNumberExtension();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getPostBoxNumberExtension <em>Post Box Number Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box Number Extension</em>' containment reference.
	 * @see #getPostBoxNumberExtension()
	 * @generated
	 */
	void setPostBoxNumberExtension(PostBoxNumberExtensionType value);

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
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_Firm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Firm' namespace='##targetNamespace'"
	 * @generated
	 */
	FirmType getFirm();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getFirm <em>Firm</em>}' containment reference.
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
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getPostalCode <em>Postal Code</em>}' containment reference.
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
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LOCKED BAG NO:1234 where the Indicator is NO: and Type is LOCKED BAG
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getIndicator <em>Indicator</em>}' attribute.
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
	 * Possible values are, not limited to: POBox and Freepost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getPostBoxType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PostBoxType
