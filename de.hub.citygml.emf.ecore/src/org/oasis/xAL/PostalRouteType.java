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
 * A representation of the model object '<em><b>Postal Route Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.PostalRouteType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalRouteType#getPostalRouteName <em>Postal Route Name</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalRouteType#getPostalRouteNumber <em>Postal Route Number</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalRouteType#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalRouteType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalRouteType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PostalRouteType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getPostalRouteType()
 * @model extendedMetaData="name='PostalRouteType' kind='elementOnly'"
 * @generated
 */
public interface PostalRouteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPostalRouteType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Postal Route Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.PostalRouteNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Name of the Postal Route
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Route Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPostalRouteType_PostalRouteName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalRouteName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PostalRouteNameType> getPostalRouteName();

	/**
	 * Returns the value of the '<em><b>Postal Route Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of the Postal Route
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Route Number</em>' containment reference.
	 * @see #setPostalRouteNumber(PostalRouteNumberType)
	 * @see org.oasis.xAL.XALPackage#getPostalRouteType_PostalRouteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalRouteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalRouteNumberType getPostalRouteNumber();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalRouteType#getPostalRouteNumber <em>Postal Route Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Route Number</em>' containment reference.
	 * @see #getPostalRouteNumber()
	 * @generated
	 */
	void setPostalRouteNumber(PostalRouteNumberType value);

	/**
	 * Returns the value of the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a postbox like mail delivery point. Only a single postbox number can be specified. Examples of postboxes are POBox, free mail numbers, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box</em>' containment reference.
	 * @see #setPostBox(PostBoxType)
	 * @see org.oasis.xAL.XALPackage#getPostalRouteType_PostBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostBox' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxType getPostBox();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalRouteType#getPostBox <em>Post Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box</em>' containment reference.
	 * @see #getPostBox()
	 * @generated
	 */
	void setPostBox(PostBoxType value);

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
	 * @see org.oasis.xAL.XALPackage#getPostalRouteType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='strict'"
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
	 * @see org.oasis.xAL.XALPackage#getPostalRouteType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostalRouteType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getPostalRouteType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PostalRouteType
