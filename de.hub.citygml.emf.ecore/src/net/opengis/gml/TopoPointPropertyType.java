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
 * A representation of the model object '<em><b>Topo Point Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.TopoPointPropertyType#getTopoPoint <em>Topo Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getTopoPointPropertyType()
 * @model extendedMetaData="name='TopoPointPropertyType' kind='elementOnly'"
 * @generated
 */
public interface TopoPointPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topo Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topo Point</em>' containment reference.
	 * @see #setTopoPoint(TopoPointType)
	 * @see net.opengis.gml.GmlPackage#getTopoPointPropertyType_TopoPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPointType getTopoPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopoPointPropertyType#getTopoPoint <em>Topo Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Point</em>' containment reference.
	 * @see #getTopoPoint()
	 * @generated
	 */
	void setTopoPoint(TopoPointType value);

} // TopoPointPropertyType
