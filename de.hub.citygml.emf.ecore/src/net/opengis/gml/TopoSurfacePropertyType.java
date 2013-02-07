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
 * A representation of the model object '<em><b>Topo Surface Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.TopoSurfacePropertyType#getTopoSurface <em>Topo Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getTopoSurfacePropertyType()
 * @model extendedMetaData="name='TopoSurfacePropertyType' kind='elementOnly'"
 * @generated
 */
public interface TopoSurfacePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topo Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topo Surface</em>' containment reference.
	 * @see #setTopoSurface(TopoSurfaceType)
	 * @see net.opengis.gml.GmlPackage#getTopoSurfacePropertyType_TopoSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoSurfaceType getTopoSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopoSurfacePropertyType#getTopoSurface <em>Topo Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Surface</em>' containment reference.
	 * @see #getTopoSurface()
	 * @generated
	 */
	void setTopoSurface(TopoSurfaceType value);

} // TopoSurfacePropertyType
