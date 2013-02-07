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
 * A representation of the model object '<em><b>Track Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the class for tracks. A track is a small path mainly used by pedestrians. As
 *                 subclass of _CityObject, a Track inherits all attributes and relations, in particular an id, names, external
 *                 references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.TrackType#getGenericApplicationPropertyOfTrackGroup <em>Generic Application Property Of Track Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TrackType#getGenericApplicationPropertyOfTrack <em>Generic Application Property Of Track</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getTrackType()
 * @model extendedMetaData="name='TrackType' kind='elementOnly'"
 * @generated
 */
public interface TrackType extends TransportationComplexType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Track Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Track Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Track Group</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTrackType_GenericApplicationPropertyOfTrackGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTrack:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTrackGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Track</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Track</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Track</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTrackType_GenericApplicationPropertyOfTrack()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTrack' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTrack:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTrack();

} // TrackType
