/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Method Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for operation method objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.OperationMethodBaseType#getMethodName <em>Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getOperationMethodBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='OperationMethodBaseType' kind='elementOnly'"
 * @generated
 */
public interface OperationMethodBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this operation method is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Name</em>' containment reference.
	 * @see #setMethodName(CodeType)
	 * @see net.opengis.gml.GmlPackage#getOperationMethodBaseType_MethodName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='methodName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getMethodName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.OperationMethodBaseType#getMethodName <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' containment reference.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(CodeType value);

} // OperationMethodBaseType
