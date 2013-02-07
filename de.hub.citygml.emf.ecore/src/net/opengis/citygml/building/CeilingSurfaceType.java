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
 * A representation of the model object '<em><b>Ceiling Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.CeilingSurfaceType#getGenericApplicationPropertyOfCeilingSurfaceGroup <em>Generic Application Property Of Ceiling Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.CeilingSurfaceType#getGenericApplicationPropertyOfCeilingSurface <em>Generic Application Property Of Ceiling Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getCeilingSurfaceType()
 * @model extendedMetaData="name='CeilingSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface CeilingSurfaceType extends AbstractBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Ceiling Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Ceiling Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Ceiling Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfCeilingSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfCeilingSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Ceiling Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Ceiling Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Ceiling Surface</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCeilingSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfCeilingSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfCeilingSurface();

} // CeilingSurfaceType
