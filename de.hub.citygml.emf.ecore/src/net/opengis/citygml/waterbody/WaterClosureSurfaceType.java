/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water Closure Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the closure surface between water bodys. As subclass of _CityObject, a
 *                 WaterClosureSurface inherits all attributes and relations, in particular an id, names, external references, and
 *                 generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.WaterClosureSurfaceType#getGenericApplicationPropertyOfWaterClosureSurfaceGroup <em>Generic Application Property Of Water Closure Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterClosureSurfaceType#getGenericApplicationPropertyOfWaterClosureSurface <em>Generic Application Property Of Water Closure Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterClosureSurfaceType()
 * @model extendedMetaData="name='WaterClosureSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface WaterClosureSurfaceType extends AbstractWaterBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Closure Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Closure Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Closure Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterClosureSurfaceType_GenericApplicationPropertyOfWaterClosureSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWaterClosureSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWaterClosureSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Closure Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Closure Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Closure Surface</em>' containment reference list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterClosureSurfaceType_GenericApplicationPropertyOfWaterClosureSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterClosureSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWaterClosureSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWaterClosureSurface();

} // WaterClosureSurfaceType
