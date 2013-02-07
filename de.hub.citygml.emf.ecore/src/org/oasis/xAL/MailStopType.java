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
 * A representation of the model object '<em><b>Mail Stop Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.MailStopType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.MailStopType#getMailStopName <em>Mail Stop Name</em>}</li>
 *   <li>{@link org.oasis.xAL.MailStopType#getMailStopNumber <em>Mail Stop Number</em>}</li>
 *   <li>{@link org.oasis.xAL.MailStopType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.MailStopType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.MailStopType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getMailStopType()
 * @model extendedMetaData="name='MailStopType' kind='elementOnly'"
 * @generated
 */
public interface MailStopType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getMailStopType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Mail Stop Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the the Mail Stop. eg. MSP, MS, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail Stop Name</em>' containment reference.
	 * @see #setMailStopName(MailStopNameType)
	 * @see org.oasis.xAL.XALPackage#getMailStopType_MailStopName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MailStopName' namespace='##targetNamespace'"
	 * @generated
	 */
	MailStopNameType getMailStopName();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.MailStopType#getMailStopName <em>Mail Stop Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Stop Name</em>' containment reference.
	 * @see #getMailStopName()
	 * @generated
	 */
	void setMailStopName(MailStopNameType value);

	/**
	 * Returns the value of the '<em><b>Mail Stop Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of the Mail stop. eg. 123 in MS 123
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail Stop Number</em>' containment reference.
	 * @see #setMailStopNumber(MailStopNumberType)
	 * @see org.oasis.xAL.XALPackage#getMailStopType_MailStopNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MailStopNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	MailStopNumberType getMailStopNumber();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.MailStopType#getMailStopNumber <em>Mail Stop Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Stop Number</em>' containment reference.
	 * @see #getMailStopNumber()
	 * @generated
	 */
	void setMailStopNumber(MailStopNumberType value);

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
	 * @see org.oasis.xAL.XALPackage#getMailStopType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see org.oasis.xAL.XALPackage#getMailStopType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.MailStopType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getMailStopType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':5' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // MailStopType
