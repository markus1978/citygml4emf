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
 * A representation of the model object '<em><b>Roof Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.RoofSurfaceType#getGenericApplicationPropertyOfRoofSurfaceGroup <em>Generic Application Property Of Roof Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoofSurfaceType#getGenericApplicationPropertyOfRoofSurface <em>Generic Application Property Of Roof Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getRoofSurfaceType()
 * @model extendedMetaData="name='RoofSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface RoofSurfaceType extends AbstractBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Roof Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Roof Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Roof Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoofSurfaceType_GenericApplicationPropertyOfRoofSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfRoofSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfRoofSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Roof Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Roof Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Roof Surface</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoofSurfaceType_GenericApplicationPropertyOfRoofSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRoofSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfRoofSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfRoofSurface();

} // RoofSurfaceType
