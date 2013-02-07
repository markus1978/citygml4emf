/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.FloorSurfaceType#getGenericApplicationPropertyOfFloorSurfaceGroup <em>Generic Application Property Of Floor Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.FloorSurfaceType#getGenericApplicationPropertyOfFloorSurface <em>Generic Application Property Of Floor Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getFloorSurfaceType()
 * @model extendedMetaData="name='FloorSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface FloorSurfaceType extends AbstractBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Floor Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Floor Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Floor Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getFloorSurfaceType_GenericApplicationPropertyOfFloorSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfFloorSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfFloorSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Floor Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Floor Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Floor Surface</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getFloorSurfaceType_GenericApplicationPropertyOfFloorSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfFloorSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfFloorSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfFloorSurface();

} // FloorSurfaceType
