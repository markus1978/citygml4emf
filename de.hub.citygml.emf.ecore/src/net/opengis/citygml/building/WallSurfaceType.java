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
 * A representation of the model object '<em><b>Wall Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.WallSurfaceType#getGenericApplicationPropertyOfWallSurfaceGroup <em>Generic Application Property Of Wall Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.WallSurfaceType#getGenericApplicationPropertyOfWallSurface <em>Generic Application Property Of Wall Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getWallSurfaceType()
 * @model extendedMetaData="name='WallSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface WallSurfaceType extends AbstractBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Wall Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Wall Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Wall Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getWallSurfaceType_GenericApplicationPropertyOfWallSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWallSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWallSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Wall Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Wall Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Wall Surface</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getWallSurfaceType_GenericApplicationPropertyOfWallSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWallSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWallSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWallSurface();

} // WallSurfaceType
