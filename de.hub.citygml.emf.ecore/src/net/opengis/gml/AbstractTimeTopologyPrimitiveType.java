/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time Topology Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The element "complex" carries a reference to the complex containing this primitive.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractTimeTopologyPrimitiveType#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getAbstractTimeTopologyPrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTimeTopologyPrimitiveType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTimeTopologyPrimitiveType extends AbstractTimePrimitiveType {
	/**
	 * Returns the value of the '<em><b>Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex</em>' containment reference.
	 * @see #setComplex(ReferenceType)
	 * @see net.opengis.gml.GmlPackage#getAbstractTimeTopologyPrimitiveType_Complex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complex' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractTimeTopologyPrimitiveType#getComplex <em>Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex</em>' containment reference.
	 * @see #getComplex()
	 * @generated
	 */
	void setComplex(ReferenceType value);

} // AbstractTimeTopologyPrimitiveType
