/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation;

import net.opengis.citygml.AbstractCityObjectType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Vegetation Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the abstract superclass for vegetation objects. A subclass is either a
 *                 SolitaryVegetationObject or a PlantCover. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.vegetation.AbstractVegetationObjectType#getGenericApplicationPropertyOfVegetationObjectGroup <em>Generic Application Property Of Vegetation Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.AbstractVegetationObjectType#getGenericApplicationPropertyOfVegetationObject <em>Generic Application Property Of Vegetation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.vegetation.VegetationPackage#getAbstractVegetationObjectType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractVegetationObjectType' kind='elementOnly'"
 * @generated
 */
public interface AbstractVegetationObjectType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Vegetation Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Vegetation Object Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Vegetation Object Group</em>' attribute list.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfVegetationObject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfVegetationObjectGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Vegetation Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Vegetation Object</em>' containment reference list.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfVegetationObject' namespace='##targetNamespace' group='_GenericApplicationPropertyOfVegetationObject:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfVegetationObject();

} // AbstractVegetationObjectType
