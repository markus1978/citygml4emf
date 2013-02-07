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
 * A representation of the model object '<em><b>Railway Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the class for railways. As subclass of _CityObject, a Railway inherits all
 *                 attributes and relations, in particular an id, names, external references, and generalization relations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.RailwayType#getGenericApplicationPropertyOfRailwayGroup <em>Generic Application Property Of Railway Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.RailwayType#getGenericApplicationPropertyOfRailway <em>Generic Application Property Of Railway</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getRailwayType()
 * @model extendedMetaData="name='RailwayType' kind='elementOnly'"
 * @generated
 */
public interface RailwayType extends TransportationComplexType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Railway Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Railway Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Railway Group</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getRailwayType_GenericApplicationPropertyOfRailwayGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfRailway:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfRailwayGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Railway</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Railway</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Railway</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getRailwayType_GenericApplicationPropertyOfRailway()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRailway' namespace='##targetNamespace' group='_GenericApplicationPropertyOfRailway:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfRailway();

} // RailwayType
