/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Box Number Suffix Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.PostBoxNumberSuffixType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxNumberSuffixType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}</li>
 *   <li>{@link org.oasis.xAL.PostBoxNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getPostBoxNumberSuffixType()
 * @model extendedMetaData="name='PostBoxNumberSuffix_._type' kind='mixed'"
 * @generated
 */
public interface PostBoxNumberSuffixType extends EObject {
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
	 * @see org.oasis.xAL.XALPackage#getPostBoxNumberSuffixType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used by postal services to encode the name of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see org.oasis.xAL.XALPackage#getPostBoxNumberSuffixType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxNumberSuffixType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 12-A where 12 is number and A is suffix and "-" is the separator
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Suffix Separator</em>' attribute.
	 * @see #setNumberSuffixSeparator(Object)
	 * @see org.oasis.xAL.XALPackage#getPostBoxNumberSuffixType_NumberSuffixSeparator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='NumberSuffixSeparator'"
	 * @generated
	 */
	Object getNumberSuffixSeparator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PostBoxNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Suffix Separator</em>' attribute.
	 * @see #getNumberSuffixSeparator()
	 * @generated
	 */
	void setNumberSuffixSeparator(Object value);

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
	 * @see org.oasis.xAL.XALPackage#getPostBoxNumberSuffixType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PostBoxNumberSuffixType
