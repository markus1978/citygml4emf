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
 * A representation of the model object '<em><b>Thoroughfare Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getNumberOccurrence <em>Number Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getNumberType <em>Number Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType()
 * @model extendedMetaData="name='ThoroughfareNumber_._type' kind='mixed'"
 * @generated
 */
public interface ThoroughfareNumberType extends EObject {
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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_Mixed()
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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getCode <em>Code</em>}' attribute.
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
	 * No. in Street No.12 or "#" in Street # 12, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getIndicator <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' attribute.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.IndicatorOccurrenceType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No.12 where "No." is before actual street number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType4
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType4)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_IndicatorOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='IndicatorOccurrence'"
	 * @generated
	 */
	IndicatorOccurrenceType4 getIndicatorOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType4
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @generated
	 */
	void setIndicatorOccurrence(IndicatorOccurrenceType4 value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType4)
	 * @generated
	 */
	void unsetIndicatorOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicator Occurrence</em>' attribute is set.
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType4)
	 * @generated
	 */
	boolean isSetIndicatorOccurrence();

	/**
	 * Returns the value of the '<em><b>Number Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.NumberOccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 23 Archer St, Archer Street 23, St Archer 23
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberOccurrenceType
	 * @see #isSetNumberOccurrence()
	 * @see #unsetNumberOccurrence()
	 * @see #setNumberOccurrence(NumberOccurrenceType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_NumberOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberOccurrence'"
	 * @generated
	 */
	NumberOccurrenceType getNumberOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberOccurrence <em>Number Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberOccurrenceType
	 * @see #isSetNumberOccurrence()
	 * @see #unsetNumberOccurrence()
	 * @see #getNumberOccurrence()
	 * @generated
	 */
	void setNumberOccurrence(NumberOccurrenceType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberOccurrence <em>Number Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOccurrence()
	 * @see #getNumberOccurrence()
	 * @see #setNumberOccurrence(NumberOccurrenceType)
	 * @generated
	 */
	void unsetNumberOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberOccurrence <em>Number Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Occurrence</em>' attribute is set.
	 * @see #unsetNumberOccurrence()
	 * @see #getNumberOccurrence()
	 * @see #setNumberOccurrence(NumberOccurrenceType)
	 * @generated
	 */
	boolean isSetNumberOccurrence();

	/**
	 * Returns the value of the '<em><b>Number Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.NumberTypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 12 Archer Street is "Single" and 12-14 Archer Street is "Range"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeType1
	 * @see #isSetNumberType()
	 * @see #unsetNumberType()
	 * @see #setNumberType(NumberTypeType1)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_NumberType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberType'"
	 * @generated
	 */
	NumberTypeType1 getNumberType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberType <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Type</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeType1
	 * @see #isSetNumberType()
	 * @see #unsetNumberType()
	 * @see #getNumberType()
	 * @generated
	 */
	void setNumberType(NumberTypeType1 value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberType <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberType()
	 * @see #getNumberType()
	 * @see #setNumberType(NumberTypeType1)
	 * @generated
	 */
	void unsetNumberType();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberType <em>Number Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Type</em>' attribute is set.
	 * @see #unsetNumberType()
	 * @see #getNumberType()
	 * @see #setNumberType(NumberTypeType1)
	 * @generated
	 */
	boolean isSetNumberType();

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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ThoroughfareNumberType
