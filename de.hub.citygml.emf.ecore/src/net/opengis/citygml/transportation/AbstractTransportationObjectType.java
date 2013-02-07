/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

import net.opengis.citygml.AbstractCityObjectType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Transportation Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the abstract superclass for transportation objects. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.AbstractTransportationObjectType#getGenericApplicationPropertyOfTransportationObjectGroup <em>Generic Application Property Of Transportation Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.AbstractTransportationObjectType#getGenericApplicationPropertyOfTransportationObject <em>Generic Application Property Of Transportation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getAbstractTransportationObjectType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTransportationObjectType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTransportationObjectType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Transportation Object Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Transportation Object Group</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTransportationObject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTransportationObjectGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Transportation Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Transportation Object</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTransportationObject' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTransportationObject:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTransportationObject();

} // AbstractTransportationObjectType
