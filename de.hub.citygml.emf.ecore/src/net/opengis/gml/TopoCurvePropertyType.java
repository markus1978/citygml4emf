/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Curve Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.TopoCurvePropertyType#getTopoCurve <em>Topo Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getTopoCurvePropertyType()
 * @model extendedMetaData="name='TopoCurvePropertyType' kind='elementOnly'"
 * @generated
 */
public interface TopoCurvePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topo Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topo Curve</em>' containment reference.
	 * @see #setTopoCurve(TopoCurveType)
	 * @see net.opengis.gml.GmlPackage#getTopoCurvePropertyType_TopoCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoCurveType getTopoCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopoCurvePropertyType#getTopoCurve <em>Topo Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Curve</em>' containment reference.
	 * @see #getTopoCurve()
	 * @generated
	 */
	void setTopoCurve(TopoCurveType value);

} // TopoCurvePropertyType
