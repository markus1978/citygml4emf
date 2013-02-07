/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Coordinate Operation Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for coordinate operation objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractCoordinateOperationBaseType#getCoordinateOperationName <em>Coordinate Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getAbstractCoordinateOperationBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCoordinateOperationBaseType' kind='elementOnly'"
 * @generated
 */
public interface AbstractCoordinateOperationBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Coordinate Operation Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this coordinate operation is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate Operation Name</em>' containment reference.
	 * @see #setCoordinateOperationName(CodeType)
	 * @see net.opengis.gml.GmlPackage#getAbstractCoordinateOperationBaseType_CoordinateOperationName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coordinateOperationName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCoordinateOperationName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractCoordinateOperationBaseType#getCoordinateOperationName <em>Coordinate Operation Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Operation Name</em>' containment reference.
	 * @see #getCoordinateOperationName()
	 * @generated
	 */
	void setCoordinateOperationName(CodeType value);

} // AbstractCoordinateOperationBaseType
