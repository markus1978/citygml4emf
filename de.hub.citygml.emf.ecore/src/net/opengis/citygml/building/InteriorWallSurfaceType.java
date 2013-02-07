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
 * A representation of the model object '<em><b>Interior Wall Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.InteriorWallSurfaceType#getGenericApplicationPropertyOfInteriorWallSurfaceGroup <em>Generic Application Property Of Interior Wall Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.InteriorWallSurfaceType#getGenericApplicationPropertyOfInteriorWallSurface <em>Generic Application Property Of Interior Wall Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getInteriorWallSurfaceType()
 * @model extendedMetaData="name='InteriorWallSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface InteriorWallSurfaceType extends AbstractBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Interior Wall Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Interior Wall Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Interior Wall Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfInteriorWallSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfInteriorWallSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Interior Wall Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Interior Wall Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Interior Wall Surface</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfInteriorWallSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfInteriorWallSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfInteriorWallSurface();

} // InteriorWallSurfaceType
