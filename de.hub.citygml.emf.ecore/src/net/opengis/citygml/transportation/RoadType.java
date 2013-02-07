/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the class for roads. As subclass of _CityObject, a Road inherits all attributes and
 *                 relations, in particular an id, names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.RoadType#getGenericApplicationPropertyOfRoadGroup <em>Generic Application Property Of Road Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.RoadType#getGenericApplicationPropertyOfRoad <em>Generic Application Property Of Road</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getRoadType()
 * @model extendedMetaData="name='RoadType' kind='elementOnly'"
 * @generated
 */
public interface RoadType extends TransportationComplexType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Road Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Road Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Road Group</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getRoadType_GenericApplicationPropertyOfRoadGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfRoad:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfRoadGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Road</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Road</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Road</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getRoadType_GenericApplicationPropertyOfRoad()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRoad' namespace='##targetNamespace' group='_GenericApplicationPropertyOfRoad:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfRoad();

} // RoadType
