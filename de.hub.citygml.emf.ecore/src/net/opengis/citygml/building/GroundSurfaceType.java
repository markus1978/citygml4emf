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
 * A representation of the model object '<em><b>Ground Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.GroundSurfaceType#getGenericApplicationPropertyOfGroundSurfaceGroup <em>Generic Application Property Of Ground Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.GroundSurfaceType#getGenericApplicationPropertyOfGroundSurface <em>Generic Application Property Of Ground Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getGroundSurfaceType()
 * @model extendedMetaData="name='GroundSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface GroundSurfaceType extends AbstractBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Ground Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Ground Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Ground Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getGroundSurfaceType_GenericApplicationPropertyOfGroundSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfGroundSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfGroundSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Ground Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Ground Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Ground Surface</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getGroundSurfaceType_GenericApplicationPropertyOfGroundSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfGroundSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfGroundSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfGroundSurface();

} // GroundSurfaceType
