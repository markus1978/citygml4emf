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
 * A representation of the model object '<em><b>Large Mail User Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getLargeMailUserName <em>Large Mail User Name</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getLargeMailUserIdentifier <em>Large Mail User Identifier</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.LargeMailUserType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasis.xAL.XALPackage#getLargeMailUserType()
 * @model extendedMetaData="name='LargeMailUserType' kind='elementOnly'"
 * @generated
 */
public interface LargeMailUserType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.AddressLineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free format address representation. An address can have more than one line. The order of the AddressLine elements must be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Line</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_AddressLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressLineType> getAddressLine();

	/**
	 * Returns the value of the '<em><b>Large Mail User Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.LargeMailUserNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the large mail user. eg. Smith Ford International airport
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Large Mail User Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_LargeMailUserName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeMailUserName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LargeMailUserNameType> getLargeMailUserName();

	/**
	 * Returns the value of the '<em><b>Large Mail User Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of the identification number of a large mail user. An example are the Cedex codes in France.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Large Mail User Identifier</em>' containment reference.
	 * @see #setLargeMailUserIdentifier(LargeMailUserIdentifierType)
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_LargeMailUserIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeMailUserIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	LargeMailUserIdentifierType getLargeMailUserIdentifier();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.LargeMailUserType#getLargeMailUserIdentifier <em>Large Mail User Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Mail User Identifier</em>' containment reference.
	 * @see #getLargeMailUserIdentifier()
	 * @generated
	 */
	void setLargeMailUserIdentifier(LargeMailUserIdentifierType value);

	/**
	 * Returns the value of the '<em><b>Building Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasis.xAL.BuildingNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the building
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Building Name</em>' containment reference list.
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_BuildingName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BuildingName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BuildingNameType> getBuildingName();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subdivision in the firm: School of Physics at Victoria University (School of Physics is the department)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Department</em>' containment reference.
	 * @see #setDepartment(DepartmentType)
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_Department()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Department' namespace='##targetNamespace'"
	 * @generated
	 */
	DepartmentType getDepartment();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.LargeMailUserType#getDepartment <em>Department</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' containment reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(DepartmentType value);

	/**
	 * Returns the value of the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a postbox like mail delivery point. Only a single postbox number can be specified. Examples of postboxes are POBox, free mail numbers, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Box</em>' containment reference.
	 * @see #setPostBox(PostBoxType)
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_PostBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostBox' namespace='##targetNamespace'"
	 * @generated
	 */
	PostBoxType getPostBox();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.LargeMailUserType#getPostBox <em>Post Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Box</em>' containment reference.
	 * @see #getPostBox()
	 * @generated
	 */
	void setPostBox(PostBoxType value);

	/**
	 * Returns the value of the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specification of a thoroughfare. A thoroughfare could be a rd, street, canal, river, etc.  Note dependentlocality in a street. For example, in some countries, a large street will 
	 * have many subdivisions with numbers. Normally the subdivision name is the same as the road name, but with a number to identifiy it. Eg. SOI SUKUMVIT 3, SUKUMVIT RD, BANGKOK
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thoroughfare</em>' containment reference.
	 * @see #setThoroughfare(ThoroughfareType)
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_Thoroughfare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Thoroughfare' namespace='##targetNamespace'"
	 * @generated
	 */
	ThoroughfareType getThoroughfare();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.LargeMailUserType#getThoroughfare <em>Thoroughfare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare</em>' containment reference.
	 * @see #getThoroughfare()
	 * @generated
	 */
	void setThoroughfare(ThoroughfareType value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PostalCode is the container element for either simple or complex (extended) postal codes. Type: Area Code, Postcode, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' containment reference.
	 * @see #setPostalCode(PostalCodeType)
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_PostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	PostalCodeType getPostalCode();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.LargeMailUserType#getPostalCode <em>Postal Code</em>}' containment reference.
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
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='strict'"
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
	 * @see #setType(String)
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.oasis.xAL.LargeMailUserType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see org.oasis.xAL.XALPackage#getLargeMailUserType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':10' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // LargeMailUserType
