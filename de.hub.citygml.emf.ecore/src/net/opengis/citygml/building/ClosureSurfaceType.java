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
 * A representation of the model object '<em><b>Closure Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.ClosureSurfaceType#getGenericApplicationPropertyOfClosureSurfaceGroup <em>Generic Application Property Of Closure Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.ClosureSurfaceType#getGenericApplicationPropertyOfClosureSurface <em>Generic Application Property Of Closure Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getClosureSurfaceType()
 * @model extendedMetaData="name='ClosureSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface ClosureSurfaceType extends AbstractBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Closure Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Closure Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Closure Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getClosureSurfaceType_GenericApplicationPropertyOfClosureSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfClosureSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfClosureSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Closure Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Closure Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Closure Surface</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getClosureSurfaceType_GenericApplicationPropertyOfClosureSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfClosureSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfClosureSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfClosureSurface();

} // ClosureSurfaceType
