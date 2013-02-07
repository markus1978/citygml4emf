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
 * A representation of the model object '<em><b>Sub Premise Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.SubPremiseNameType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNameType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNameType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNameType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getSubPremiseNameType()
 * @model extendedMetaData="name='SubPremiseName_._type' kind='mixed'"
 * @generated
 */
public interface SubPremiseNameType extends EObject {
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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNameType_Mixed()
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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNameType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNameType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNameType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNameType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Type Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.TypeOccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EGIS Building where EGIS occurs before Building
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.TypeOccurrenceType
	 * @see #isSetTypeOccurrence()
	 * @see #unsetTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType)
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNameType_TypeOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='TypeOccurrence'"
	 * @generated
	 */
	TypeOccurrenceType getTypeOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.TypeOccurrenceType
	 * @see #isSetTypeOccurrence()
	 * @see #unsetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @generated
	 */
	void setTypeOccurrence(TypeOccurrenceType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.SubPremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType)
	 * @generated
	 */
	void unsetTypeOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.SubPremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Occurrence</em>' attribute is set.
	 * @see #unsetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType)
	 * @generated
	 */
	boolean isSetTypeOccurrence();

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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNameType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // SubPremiseNameType
