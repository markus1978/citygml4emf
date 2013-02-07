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
 * A representation of the model object '<em><b>Premise Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.PremiseNumberType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getPremiseNumberType()
 * @model extendedMetaData="name='PremiseNumber_._type' kind='mixed'"
 * @generated
 */
public interface PremiseNumberType extends EObject {
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
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_Mixed()
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
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseNumberType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No. in House No.12, # in #12, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseNumberType#getIndicator <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' attribute.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.IndicatorOccurrenceType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No. occurs before 12 No.12
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType3
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType3)
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_IndicatorOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='IndicatorOccurrence'"
	 * @generated
	 */
	IndicatorOccurrenceType3 getIndicatorOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType3
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @generated
	 */
	void setIndicatorOccurrence(IndicatorOccurrenceType3 value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType3)
	 * @generated
	 */
	void unsetIndicatorOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicator Occurrence</em>' attribute is set.
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType3)
	 * @generated
	 */
	boolean isSetIndicatorOccurrence();

	/**
	 * Returns the value of the '<em><b>Number Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.NumberTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Building 12-14 is "Range" and Building 12 is "Single"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeType
	 * @see #isSetNumberType()
	 * @see #unsetNumberType()
	 * @see #setNumberType(NumberTypeType)
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_NumberType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberType'"
	 * @generated
	 */
	NumberTypeType getNumberType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Type</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeType
	 * @see #isSetNumberType()
	 * @see #unsetNumberType()
	 * @see #getNumberType()
	 * @generated
	 */
	void setNumberType(NumberTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberType()
	 * @see #getNumberType()
	 * @see #setNumberType(NumberTypeType)
	 * @generated
	 */
	void unsetNumberType();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Type</em>' attribute is set.
	 * @see #unsetNumberType()
	 * @see #getNumberType()
	 * @see #setNumberType(NumberTypeType)
	 * @generated
	 */
	boolean isSetNumberType();

	/**
	 * Returns the value of the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.NumberTypeOccurrenceType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 12 in BUILDING 12 occurs "after" premise type BUILDING
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType1
	 * @see #isSetNumberTypeOccurrence()
	 * @see #unsetNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType1)
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_NumberTypeOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberTypeOccurrence'"
	 * @generated
	 */
	NumberTypeOccurrenceType1 getNumberTypeOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType1
	 * @see #isSetNumberTypeOccurrence()
	 * @see #unsetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @generated
	 */
	void setNumberTypeOccurrence(NumberTypeOccurrenceType1 value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType1)
	 * @generated
	 */
	void unsetNumberTypeOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Type Occurrence</em>' attribute is set.
	 * @see #unsetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType1)
	 * @generated
	 */
	boolean isSetNumberTypeOccurrence();

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
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.PremiseNumberType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getPremiseNumberType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PremiseNumberType
