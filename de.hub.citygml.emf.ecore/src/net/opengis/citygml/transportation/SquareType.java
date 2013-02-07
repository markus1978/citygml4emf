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
 * A representation of the model object '<em><b>Square Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the class for squares. A square is an open area commonly found in cities (like a
 *                 plaza). As subclass of _CityObject, a Square inherits all attributes and relations, in particular an id, names,
 *                 external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.SquareType#getGenericApplicationPropertyOfSquareGroup <em>Generic Application Property Of Square Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.SquareType#getGenericApplicationPropertyOfSquare <em>Generic Application Property Of Square</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getSquareType()
 * @model extendedMetaData="name='SquareType' kind='elementOnly'"
 * @generated
 */
public interface SquareType extends TransportationComplexType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Square Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Square Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Square Group</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getSquareType_GenericApplicationPropertyOfSquareGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfSquare:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfSquareGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Square</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Square</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Square</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getSquareType_GenericApplicationPropertyOfSquare()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSquare' namespace='##targetNamespace' group='_GenericApplicationPropertyOfSquare:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfSquare();

} // SquareType
