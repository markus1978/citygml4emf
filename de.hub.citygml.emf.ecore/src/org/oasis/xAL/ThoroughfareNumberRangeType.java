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
 * A representation of the model object '<em><b>Thoroughfare Number Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberFrom <em>Thoroughfare Number From</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberTo <em>Thoroughfare Number To</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence <em>Indicator Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence <em>Number Range Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.ThoroughfareNumberRangeType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType()
 * @model extendedMetaData="name='ThoroughfareNumberRange_._type' kind='elementOnly'"
 * @generated
 */
public interface ThoroughfareNumberRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starting number in the range
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number From</em>' containment reference.
	 * @see #setThoroughfareNumberFrom(ThoroughfareNumberFromType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_ThoroughfareNumberFrom()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareNumberFromType getThoroughfareNumberFrom();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberFrom <em>Thoroughfare Number From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Number From</em>' containment reference.
	 * @see #getThoroughfareNumberFrom()
	 * @generated
	 */
	void setThoroughfareNumberFrom(ThoroughfareNumberFromType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Number To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ending number in the range
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Number To</em>' containment reference.
	 * @see #setThoroughfareNumberTo(ThoroughfareNumberToType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_ThoroughfareNumberTo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareNumberTo' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareNumberToType getThoroughfareNumberTo();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberTo <em>Thoroughfare Number To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Number To</em>' containment reference.
	 * @see #getThoroughfareNumberTo()
	 * @generated
	 */
	void setThoroughfareNumberTo(ThoroughfareNumberToType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used by postal services to encode the name of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getCode <em>Code</em>}' attribute.
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
	 * "No." No.12-13
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicator <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' attribute.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.IndicatorOccurrenceType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No.12-14 where "No." is before actual street number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType1
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType1)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_IndicatorOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='IndicatorOccurrence'"
	 * @generated
	 */
	IndicatorOccurrenceType1 getIndicatorOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType1
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @generated
	 */
	void setIndicatorOccurrence(IndicatorOccurrenceType1 value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType1)
	 * @generated
	 */
	void unsetIndicatorOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicator Occurrence</em>' attribute is set.
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType1)
	 * @generated
	 */
	boolean isSetIndicatorOccurrence();

	/**
	 * Returns the value of the '<em><b>Number Range Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.NumberRangeOccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 23-25 Archer St, where number appears before name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Range Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberRangeOccurrenceType
	 * @see #isSetNumberRangeOccurrence()
	 * @see #unsetNumberRangeOccurrence()
	 * @see #setNumberRangeOccurrence(NumberRangeOccurrenceType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_NumberRangeOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberRangeOccurrence'"
	 * @generated
	 */
	NumberRangeOccurrenceType getNumberRangeOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence <em>Number Range Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Range Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberRangeOccurrenceType
	 * @see #isSetNumberRangeOccurrence()
	 * @see #unsetNumberRangeOccurrence()
	 * @see #getNumberRangeOccurrence()
	 * @generated
	 */
	void setNumberRangeOccurrence(NumberRangeOccurrenceType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence <em>Number Range Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberRangeOccurrence()
	 * @see #getNumberRangeOccurrence()
	 * @see #setNumberRangeOccurrence(NumberRangeOccurrenceType)
	 * @generated
	 */
	void unsetNumberRangeOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence <em>Number Range Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Range Occurrence</em>' attribute is set.
	 * @see #unsetNumberRangeOccurrence()
	 * @see #getNumberRangeOccurrence()
	 * @see #setNumberRangeOccurrence(NumberRangeOccurrenceType)
	 * @generated
	 */
	boolean isSetNumberRangeOccurrence();

	/**
	 * Returns the value of the '<em><b>Range Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.RangeTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thoroughfare number ranges are odd or even
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Type</em>' attribute.
	 * @see org.oasis.xAL.RangeTypeType
	 * @see #isSetRangeType()
	 * @see #unsetRangeType()
	 * @see #setRangeType(RangeTypeType)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_RangeType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='RangeType'"
	 * @generated
	 */
	RangeTypeType getRangeType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getRangeType <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Type</em>' attribute.
	 * @see org.oasis.xAL.RangeTypeType
	 * @see #isSetRangeType()
	 * @see #unsetRangeType()
	 * @see #getRangeType()
	 * @generated
	 */
	void setRangeType(RangeTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getRangeType <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRangeType()
	 * @see #getRangeType()
	 * @see #setRangeType(RangeTypeType)
	 * @generated
	 */
	void unsetRangeType();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getRangeType <em>Range Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range Type</em>' attribute is set.
	 * @see #unsetRangeType()
	 * @see #getRangeType()
	 * @see #setRangeType(RangeTypeType)
	 * @generated
	 */
	boolean isSetRangeType();

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "-" in 12-14  or "Thru" in 12 Thru 14 etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(Object)
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_Separator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Separator'"
	 * @generated
	 */
	Object getSeparator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(Object value);

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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getThoroughfareNumberRangeType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ThoroughfareNumberRangeType
