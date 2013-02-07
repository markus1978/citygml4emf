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
 * A representation of the model object '<em><b>Dependent Thoroughfare Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.DependentThoroughfareType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType()
 * @model extendedMetaData="name='DependentThoroughfare_._type' kind='elementOnly'"
 * @generated
 */
public interface DependentThoroughfareType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * North Baker Street, where North is the pre-direction. The direction appears before the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Pre Direction</em>' containment reference.
	 * @see #setThoroughfarePreDirection(ThoroughfarePreDirectionType)
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_ThoroughfarePreDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfarePreDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfarePreDirectionType getThoroughfarePreDirection();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Pre Direction</em>' containment reference.
	 * @see #getThoroughfarePreDirection()
	 * @generated
	 */
	void setThoroughfarePreDirection(ThoroughfarePreDirectionType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appears before the thoroughfare name. Ed. Spanish: Avenida Aurora, where Avenida is the leading type / French: Rue Moliere, where Rue is the leading type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Leading Type</em>' containment reference.
	 * @see #setThoroughfareLeadingType(ThoroughfareLeadingTypeType)
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_ThoroughfareLeadingType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareLeadingType' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareLeadingTypeType getThoroughfareLeadingType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Leading Type</em>' containment reference.
	 * @see #getThoroughfareLeadingType()
	 * @generated
	 */
	void setThoroughfareLeadingType(ThoroughfareLeadingTypeType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.ThoroughfareNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the name of a Thoroughfare (also dependant street name): street name, canal name, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_ThoroughfareName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ThoroughfareNameType> getThoroughfareName();

	/**
	 * Returns the value of the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appears after the thoroughfare name. Ed. British: Baker Lane, where Lane is the trailing type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Trailing Type</em>' containment reference.
	 * @see #setThoroughfareTrailingType(ThoroughfareTrailingTypeType)
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_ThoroughfareTrailingType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfareTrailingType' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareTrailingTypeType getThoroughfareTrailingType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Trailing Type</em>' containment reference.
	 * @see #getThoroughfareTrailingType()
	 * @generated
	 */
	void setThoroughfareTrailingType(ThoroughfareTrailingTypeType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 221-bis Baker Street North, where North is the post-direction. The post-direction appears after the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare Post Direction</em>' containment reference.
	 * @see #setThoroughfarePostDirection(ThoroughfarePostDirectionType)
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_ThoroughfarePostDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ThoroughfarePostDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfarePostDirectionType getThoroughfarePostDirection();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare Post Direction</em>' containment reference.
	 * @see #getThoroughfarePostDirection()
	 * @generated
	 */
	void setThoroughfarePostDirection(ThoroughfarePostDirectionType value);

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
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='strict'"
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
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.DependentThoroughfareType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getDependentThoroughfareType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':8' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DependentThoroughfareType
