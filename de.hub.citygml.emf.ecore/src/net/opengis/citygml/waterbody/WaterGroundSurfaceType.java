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
 * A representation of the model object '<em><b>Water Ground Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the ground surface of a water body, i.e. the boundary to the digital terrain model.
 *                 As subclass of _CityObject, a WaterGroundSurface inherits all attributes and relations, in particular an id,
 *                 names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.WaterGroundSurfaceType#getGenericApplicationPropertyOfWaterGroundSurfaceGroup <em>Generic Application Property Of Water Ground Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterGroundSurfaceType#getGenericApplicationPropertyOfWaterGroundSurface <em>Generic Application Property Of Water Ground Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterGroundSurfaceType()
 * @model extendedMetaData="name='WaterGroundSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface WaterGroundSurfaceType extends AbstractWaterBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Ground Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Ground Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Ground Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterGroundSurfaceType_GenericApplicationPropertyOfWaterGroundSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWaterGroundSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWaterGroundSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Ground Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Ground Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Ground Surface</em>' containment reference list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterGroundSurfaceType_GenericApplicationPropertyOfWaterGroundSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterGroundSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWaterGroundSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWaterGroundSurface();

} // WaterGroundSurfaceType
