/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody;

import net.opengis.citygml.AbstractCityObjectType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Water Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the abstract superclass for water objects. As subclass of _CityObject, a
 *                 _WaterObject inherits all attributes and relations, in particular an id, names, external references, and
 *                 generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.AbstractWaterObjectType#getGenericApplicationPropertyOfWaterObjectGroup <em>Generic Application Property Of Water Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.AbstractWaterObjectType#getGenericApplicationPropertyOfWaterObject <em>Generic Application Property Of Water Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterObjectType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractWaterObjectType' kind='elementOnly'"
 * @generated
 */
public interface AbstractWaterObjectType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Object Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Object Group</em>' attribute list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterObjectType_GenericApplicationPropertyOfWaterObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWaterObject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWaterObjectGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Object</em>' containment reference list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterObjectType_GenericApplicationPropertyOfWaterObject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterObject' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWaterObject:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWaterObject();

} // AbstractWaterObjectType
