/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import java.math.BigInteger;

import net.opengis.citygml.AbstractCityObjectType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the features of the Digital Terrain Model. As subclass of _CityObject, a
 *                 ReliefFeature inherits all attributes and relations, in particular an id, names, external references, and
 *                 generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.ReliefFeatureType#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.ReliefFeatureType#getReliefComponent <em>Relief Component</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.ReliefFeatureType#getGenericApplicationPropertyOfReliefFeatureGroup <em>Generic Application Property Of Relief Feature Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.ReliefFeatureType#getGenericApplicationPropertyOfReliefFeature <em>Generic Application Property Of Relief Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getReliefFeatureType()
 * @model extendedMetaData="name='ReliefFeatureType' kind='elementOnly'"
 * @generated
 */
public interface ReliefFeatureType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod</em>' attribute.
	 * @see #setLod(BigInteger)
	 * @see net.opengis.citygml.relief.ReliefPackage#getReliefFeatureType_Lod()
	 * @model dataType="net.opengis.citygml.IntegerBetween0and4" required="true"
	 *        extendedMetaData="kind='element' name='lod' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLod();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.ReliefFeatureType#getLod <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' attribute.
	 * @see #getLod()
	 * @generated
	 */
	void setLod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Relief Component</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.relief.ReliefComponentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relief Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relief Component</em>' containment reference list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getReliefFeatureType_ReliefComponent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reliefComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReliefComponentPropertyType> getReliefComponent();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Relief Feature Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Relief Feature Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Relief Feature Group</em>' attribute list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getReliefFeatureType_GenericApplicationPropertyOfReliefFeatureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfReliefFeature:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfReliefFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Relief Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Relief Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Relief Feature</em>' containment reference list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getReliefFeatureType_GenericApplicationPropertyOfReliefFeature()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfReliefFeature' namespace='##targetNamespace' group='_GenericApplicationPropertyOfReliefFeature:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfReliefFeature();

} // ReliefFeatureType
