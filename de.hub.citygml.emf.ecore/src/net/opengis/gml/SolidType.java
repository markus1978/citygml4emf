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
 * A representation of the model object '<em><b>Solid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A solid is the basis for 3-dimensional geometry. The extent of a solid is defined by the boundary surfaces (shells). A shell is represented by a composite surface, where every  shell is used to represent a single connected component of the boundary of a solid. It consists of a composite surface (a list of orientable surfaces) connected in a topological cycle (an object whose boundary is empty). Unlike a Ring, a Shell's elements have no natural sort order. Like Rings, Shells are simple.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.SolidType#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.SolidType#getInterior <em>Interior</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getSolidType()
 * @model extendedMetaData="name='SolidType' kind='elementOnly'"
 * @generated
 */
public interface SolidType extends AbstractSolidType {
	/**
	 * Returns the value of the '<em><b>Exterior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boundaries of solids are similar to surface boundaries. In normal 3-dimensional Euclidean space, one (composite) surface is distinguished as the exterior. In the more general case, this is not always possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exterior</em>' containment reference.
	 * @see #setExterior(SurfacePropertyType)
	 * @see net.opengis.gml.GmlPackage#getSolidType_Exterior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exterior' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getExterior();

	/**
	 * Sets the value of the '{@link net.opengis.gml.SolidType#getExterior <em>Exterior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior</em>' containment reference.
	 * @see #getExterior()
	 * @generated
	 */
	void setExterior(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Interior</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.SurfacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boundaries of solids are similar to surface boundaries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interior</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getSolidType_Interior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interior' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SurfacePropertyType> getInterior();

} // SolidType
