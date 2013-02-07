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
 * A representation of the model object '<em><b>Building Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.BuildingNameType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.BuildingNameType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.BuildingNameType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.BuildingNameType#getTypeOccurrence <em>Type Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.BuildingNameType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getBuildingNameType()
 * @model extendedMetaData="name='BuildingNameType' kind='mixed'"
 * @generated
 */
public interface BuildingNameType extends EObject {
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
	 * @see org.oasis.xAL.XALPackage#getBuildingNameType_Mixed()
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
	 * @see org.oasis.xAL.XALPackage#getBuildingNameType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.BuildingNameType#getCode <em>Code</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getBuildingNameType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.BuildingNameType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Type Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.TypeOccurrenceType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Occurrence of the building name before/after the type. eg. EGIS BUILDING where name appears before type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.TypeOccurrenceType2
	 * @see #isSetTypeOccurrence()
	 * @see #unsetTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType2)
	 * @see org.oasis.xAL.XALPackage#getBuildingNameType_TypeOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='TypeOccurrence'"
	 * @generated
	 */
	TypeOccurrenceType2 getTypeOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.BuildingNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.TypeOccurrenceType2
	 * @see #isSetTypeOccurrence()
	 * @see #unsetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @generated
	 */
	void setTypeOccurrence(TypeOccurrenceType2 value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.BuildingNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType2)
	 * @generated
	 */
	void unsetTypeOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.BuildingNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Occurrence</em>' attribute is set.
	 * @see #unsetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType2)
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
	 * @see org.oasis.xAL.XALPackage#getBuildingNameType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // BuildingNameType
