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
 * A representation of the model object '<em><b>Firm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.FirmType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.FirmType#getFirmName <em>Firm Name</em>}</li>
 *   <li>{@link org.oasis.xAL.FirmType#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.oasis.xAL.FirmType#getMailStop <em>Mail Stop</em>}</li>
 *   <li>{@link org.oasis.xAL.FirmType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.FirmType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.FirmType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.FirmType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getFirmType()
 * @model extendedMetaData="name='FirmType' kind='elementOnly'"
 * @generated
 */
public interface FirmType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getFirmType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Firm Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.FirmNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the firm
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Firm Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getFirmType_FirmName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FirmName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FirmNameType> getFirmName();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.DepartmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subdivision in the firm: School of Physics at Victoria University (School of Physics is the department)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Department</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getFirmType_Department()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Department' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DepartmentType> getDepartment();

	/**
	 * Returns the value of the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MailStop is where the the mail is delivered to within a premise/subpremise/firm or a facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail Stop</em>' containment reference.
	 * @see #setMailStop(MailStopType)
	 * @see org.oasis.xAL.XALPackage#getFirmType_MailStop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MailStop' namespace='##targetNamespace'"
	 * @generated
	 */
	MailStopType getMailStop();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.FirmType#getMailStop <em>Mail Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Stop</em>' containment reference.
	 * @see #getMailStop()
	 * @generated
	 */
	void setMailStop(MailStopType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see org.oasis.xAL.XALPackage#getFirmType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.FirmType#getPostalCode <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' containment reference.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(PostalCodeType value);

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
	 * @see org.oasis.xAL.XALPackage#getFirmType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='strict'"
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
	 * @see org.oasis.xAL.XALPackage#getFirmType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.FirmType#getType <em>Type</em>}' attribute.
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
	 * @see org.oasis.xAL.XALPackage#getFirmType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // FirmType
