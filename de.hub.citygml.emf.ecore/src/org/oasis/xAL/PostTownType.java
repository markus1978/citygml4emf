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
 * A representation of the model object '<em><b>Post Town Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.PostTownType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.PostTownType#getPostTownName <em>Post Town Name</em>}</li>
 *   <li>{@link org.oasis.xAL.PostTownType#getPostTownSuffix <em>Post Town Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.PostTownType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PostTownType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getPostTownType()
 * @model extendedMetaData="name='PostTown_._type' kind='elementOnly'"
 * @generated
 */
public interface PostTownType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPostTownType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Post Town Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.PostTownNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the post town
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Town Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getPostTownType_PostTownName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostTownName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PostTownNameType> getPostTownName();

	/**
	 * Returns the value of the '<em><b>Post Town Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GENERAL PO in MIAMI GENERAL PO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Town Suffix</em>' containment reference.
	 * @see #setPostTownSuffix(PostTownSuffixType)
	 * @see org.oasis.xAL.XALPackage#getPostTownType_PostTownSuffix()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostTownSuffix' namespace='##targetNamespace'"
	 * @generated
	 */
	PostTownSuffixType getPostTownSuffix();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostTownType#getPostTownSuffix <em>Post Town Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Town Suffix</em>' containment reference.
	 * @see #getPostTownSuffix()
	 * @generated
	 */
	void setPostTownSuffix(PostTownSuffixType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * eg. village, town, suburb, etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasis.xAL.XALPackage#getPostTownType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostTownType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getPostTownType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PostTownType
