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
 * A representation of the model object '<em><b>Water Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the surface of a water body, which separates the water from the air. As subclass of
 *                 _CityObject, a WaterSurface inherits all attributes and relations, in particular an id, names, external
 *                 references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.WaterSurfaceType#getWaterLevel <em>Water Level</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterSurfaceType#getGenericApplicationPropertyOfWaterSurfaceGroup <em>Generic Application Property Of Water Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterSurfaceType#getGenericApplicationPropertyOfWaterSurface <em>Generic Application Property Of Water Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterSurfaceType()
 * @model extendedMetaData="name='WaterSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface WaterSurfaceType extends AbstractWaterBoundarySurfaceType {
	/**
	 * Returns the value of the '<em><b>Water Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Level</em>' attribute.
	 * @see #setWaterLevel(String)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterSurfaceType_WaterLevel()
	 * @model dataType="net.opengis.citygml.waterbody.WaterLevelType"
	 *        extendedMetaData="kind='element' name='waterLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWaterLevel();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterSurfaceType#getWaterLevel <em>Water Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Level</em>' attribute.
	 * @see #getWaterLevel()
	 * @generated
	 */
	void setWaterLevel(String value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterSurfaceType_GenericApplicationPropertyOfWaterSurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWaterSurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWaterSurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Surface</em>' containment reference list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterSurfaceType_GenericApplicationPropertyOfWaterSurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterSurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWaterSurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWaterSurface();

} // WaterSurfaceType
