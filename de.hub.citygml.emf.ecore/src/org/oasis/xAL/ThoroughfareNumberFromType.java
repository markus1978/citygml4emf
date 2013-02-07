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
 * A representation of the model object '<em><b>Thoroughfare Number From Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberFromType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberFromType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumber <em>Thoroughfare Number</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberFromType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberFromType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType()
 * @model extendedMetaData="name='ThoroughfareNumberFrom_._type' kind='mixed'"
 * @generated
 */
public interface ThoroughfareNumberFromType extends EObject {
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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType_AddressLine()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNumberPrefixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prefix before the number. A in A12 Archer Street
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number Prefix</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType_ThoroughfareNumberPrefix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberPrefix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThoroughfareNumberPrefixType> getThoroughfareNumberPrefix();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNumberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eg.: 23 Archer street or 25/15 Zero Avenue, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType_ThoroughfareNumber()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThoroughfareNumberType> getThoroughfareNumber();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNumberSuffixType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Suffix after the number. A in 12A Archer Street
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number Suffix</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType_ThoroughfareNumberSuffix()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThoroughfareNumberSuffixType> getThoroughfareNumberSuffix();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used by postal services to encode the name of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberFromType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberFromType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ThoroughfareNumberFromType
