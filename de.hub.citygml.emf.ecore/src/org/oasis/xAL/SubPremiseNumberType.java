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
 * A representation of the model object '<em><b>Sub Premise Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getPremiseNumberSeparator <em>Premise Number Separator</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.SubPremiseNumberType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType()
 * @model extendedMetaData="name='SubPremiseNumber_._type' kind='mixed'"
 * @generated
 */
public interface SubPremiseNumberType extends EObject {
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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_Mixed()
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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getCode <em>Code</em>}' attribute.
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
	 * "TH" in 12TH which is a floor number, "NO." in NO.1, "#" in APT #12, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getIndicator <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' attribute.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.IndicatorOccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "No." occurs before 1 in No.1, or TH occurs after 12 in 12TH
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType)
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_IndicatorOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='IndicatorOccurrence'"
	 * @generated
	 */
	IndicatorOccurrenceType getIndicatorOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see org.oasis.xAL.IndicatorOccurrenceType
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @generated
	 */
	void setIndicatorOccurrence(IndicatorOccurrenceType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType)
	 * @generated
	 */
	void unsetIndicatorOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicator Occurrence</em>' attribute is set.
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType)
	 * @generated
	 */
	boolean isSetIndicatorOccurrence();

	/**
	 * Returns the value of the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasis.xAL.NumberTypeOccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 12TH occurs "before" FLOOR (a type of subpremise) in 12TH FLOOR
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType
	 * @see #isSetNumberTypeOccurrence()
	 * @see #unsetNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType)
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_NumberTypeOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberTypeOccurrence'"
	 * @generated
	 */
	NumberTypeOccurrenceType getNumberTypeOccurrence();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Type Occurrence</em>' attribute.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType
	 * @see #isSetNumberTypeOccurrence()
	 * @see #unsetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @generated
	 */
	void setNumberTypeOccurrence(NumberTypeOccurrenceType value);

	/**
	 * Unsets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType)
	 * @generated
	 */
	void unsetNumberTypeOccurrence();

	/**
	 * Returns whether the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Type Occurrence</em>' attribute is set.
	 * @see #unsetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType)
	 * @generated
	 */
	boolean isSetNumberTypeOccurrence();

	/**
	 * Returns the value of the '<em><b>Premise Number Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "/" in 12/14 Archer Street where 12 is sub-premise number and 14 is premise number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Premise Number Separator</em>' attribute.
	 * @see #setPremiseNumberSeparator(Object)
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_PremiseNumberSeparator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='PremiseNumberSeparator'"
	 * @generated
	 */
	Object getPremiseNumberSeparator();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getPremiseNumberSeparator <em>Premise Number Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premise Number Separator</em>' attribute.
	 * @see #getPremiseNumberSeparator()
	 * @generated
	 */
	void setPremiseNumberSeparator(Object value);

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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.SubPremiseNumberType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getSubPremiseNumberType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // SubPremiseNumberType
