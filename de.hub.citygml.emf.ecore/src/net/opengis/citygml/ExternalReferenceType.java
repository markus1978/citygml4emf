/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the reference to an corresponding object in an other information system, for example
 *                 in the german cadastre ALKIS, the german topographic information system or ATKIS, or the OS MasterMap. The
 *                 reference consists of the name of the external information system, represented by an URI, and the reference of the
 *                 external object, given either by a string or by an URI. If the informationSystem element is missing in the
 *                 ExternalReference, the ExternalObjectReference must be an URI, which contains an indication of the
 *                 informationSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.ExternalReferenceType#getInformationSystem <em>Information System</em>}</li>
 *   <li>{@link net.opengis.citygml.ExternalReferenceType#getExternalObject <em>External Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getExternalReferenceType()
 * @model extendedMetaData="name='ExternalReferenceType' kind='elementOnly'"
 * @generated
 */
public interface ExternalReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Information System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information System</em>' attribute.
	 * @see #setInformationSystem(String)
	 * @see net.opengis.citygml.CitygmlPackage#getExternalReferenceType_InformationSystem()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='informationSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInformationSystem();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ExternalReferenceType#getInformationSystem <em>Information System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information System</em>' attribute.
	 * @see #getInformationSystem()
	 * @generated
	 */
	void setInformationSystem(String value);

	/**
	 * Returns the value of the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Object</em>' containment reference.
	 * @see #setExternalObject(ExternalObjectReferenceType)
	 * @see net.opengis.citygml.CitygmlPackage#getExternalReferenceType_ExternalObject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='externalObject' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalObjectReferenceType getExternalObject();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ExternalReferenceType#getExternalObject <em>External Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Object</em>' containment reference.
	 * @see #getExternalObject()
	 * @generated
	 */
	void setExternalObject(ExternalObjectReferenceType value);

} // ExternalReferenceType
