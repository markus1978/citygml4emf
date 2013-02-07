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
 * A representation of the model object '<em><b>Triangle Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type defines a container for an array of 
 *      triangle patches.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.TrianglePatchArrayPropertyType#getTriangle <em>Triangle</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getTrianglePatchArrayPropertyType()
 * @model extendedMetaData="name='TrianglePatchArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface TrianglePatchArrayPropertyType extends SurfacePatchArrayPropertyType {
	/**
	 * Returns the value of the '<em><b>Triangle</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TriangleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triangle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triangle</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getTrianglePatchArrayPropertyType_Triangle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Triangle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriangleType> getTriangle();

} // TrianglePatchArrayPropertyType
