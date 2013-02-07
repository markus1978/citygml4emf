/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.gml.AssociationType;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Surface Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an _AbstractBuilding to its bounding thematic surfaces (walls, roofs, ..).
 *                 The BoundarySurfacePropertyType element must either carry a reference to a _BoundarySurface object or contain a
 *                 _BoundarySurface object inline, but neither both nor none. There is no differentiation between interior surfaces
 *                 bounding rooms and outer ones bounding buildings (one reason is, that ClosureSurfaces belong to both types). It
 *                 has to be made sure by additional integrity constraints that, e.g. an _AbstractBuilding is not related to
 *                 CeilingSurfaces or a room not to RoofSurfaces. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.BoundarySurfacePropertyType#getBoundarySurfaceGroup <em>Boundary Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BoundarySurfacePropertyType#getBoundarySurface <em>Boundary Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getBoundarySurfacePropertyType()
 * @model extendedMetaData="name='BoundarySurfacePropertyType' kind='elementOnly'"
 * @generated
 */
public interface BoundarySurfacePropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Boundary Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBoundarySurfacePropertyType_BoundarySurfaceGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='_BoundarySurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBoundarySurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getBoundarySurfacePropertyType_BoundarySurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_BoundarySurface' namespace='##targetNamespace' group='_BoundarySurface:group'"
	 * @generated
	 */
	AbstractBoundarySurfaceType getBoundarySurface();

} // BoundarySurfacePropertyType
