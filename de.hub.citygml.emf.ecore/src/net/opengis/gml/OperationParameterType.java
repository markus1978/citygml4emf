/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The definition of a parameter used by an operation method. Most parameter values are numeric, but other types of parameter values are possible. This complexType is expected to be used or extended for all operation methods, without defining operation-method-specialized element names.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.OperationParameterType#getParameterID <em>Parameter ID</em>}</li>
 *   <li>{@link net.opengis.gml.OperationParameterType#getRemarks <em>Remarks</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getOperationParameterType()
 * @model extendedMetaData="name='OperationParameterType' kind='elementOnly'"
 * @generated
 */
public interface OperationParameterType extends OperationParameterBaseType {
	/**
	 * Returns the value of the '<em><b>Parameter ID</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of alternative identifications of this operation parameter. The first parameterID, if any, is normally the primary identification code, and any others are aliases. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter ID</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getOperationParameterType_ParameterID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameterID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentifierType> getParameterID();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments on or information about this operation parameter, including source information. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference.
	 * @see #setRemarks(StringOrRefType)
	 * @see net.opengis.gml.GmlPackage#getOperationParameterType_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getRemarks();

	/**
	 * Sets the value of the '{@link net.opengis.gml.OperationParameterType#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(StringOrRefType value);

} // OperationParameterType
