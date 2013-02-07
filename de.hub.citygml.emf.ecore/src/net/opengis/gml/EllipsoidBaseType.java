/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipsoid Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for ellipsoid objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.EllipsoidBaseType#getEllipsoidName <em>Ellipsoid Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getEllipsoidBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='EllipsoidBaseType' kind='elementOnly'"
 * @generated
 */
public interface EllipsoidBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Ellipsoid Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this ellipsoid is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid Name</em>' containment reference.
	 * @see #setEllipsoidName(CodeType)
	 * @see net.opengis.gml.GmlPackage#getEllipsoidBaseType_EllipsoidName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ellipsoidName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getEllipsoidName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.EllipsoidBaseType#getEllipsoidName <em>Ellipsoid Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid Name</em>' containment reference.
	 * @see #getEllipsoidName()
	 * @generated
	 */
	void setEllipsoidName(CodeType value);

} // EllipsoidBaseType
