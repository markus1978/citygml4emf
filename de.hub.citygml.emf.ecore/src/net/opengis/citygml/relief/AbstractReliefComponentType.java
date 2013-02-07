/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import java.math.BigInteger;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.gml.PolygonPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Relief Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the components of a relief feature - either a TIN, a Grid, mass points or break
 *                 lines. As subclass of _CityObject, a ReliefComponent inherits all attributes and relations, in particular an id,
 *                 names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.AbstractReliefComponentType#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.AbstractReliefComponentType#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.AbstractReliefComponentType#getGenericApplicationPropertyOfReliefComponentGroup <em>Generic Application Property Of Relief Component Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.AbstractReliefComponentType#getGenericApplicationPropertyOfReliefComponent <em>Generic Application Property Of Relief Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getAbstractReliefComponentType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractReliefComponentType' kind='elementOnly'"
 * @generated
 */
public interface AbstractReliefComponentType extends AbstractCityObjectType {
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
	 * @see net.opengis.citygml.relief.ReliefPackage#getAbstractReliefComponentType_Lod()
	 * @model dataType="net.opengis.citygml.IntegerBetween0and4" required="true"
	 *        extendedMetaData="kind='element' name='lod' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLod();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.AbstractReliefComponentType#getLod <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' attribute.
	 * @see #getLod()
	 * @generated
	 */
	void setLod(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(PolygonPropertyType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getAbstractReliefComponentType_Extent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	PolygonPropertyType getExtent();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.AbstractReliefComponentType#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(PolygonPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Relief Component Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Relief Component Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Relief Component Group</em>' attribute list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getAbstractReliefComponentType_GenericApplicationPropertyOfReliefComponentGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfReliefComponent:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfReliefComponentGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Relief Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Relief Component</em>' containment reference list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getAbstractReliefComponentType_GenericApplicationPropertyOfReliefComponent()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfReliefComponent' namespace='##targetNamespace' group='_GenericApplicationPropertyOfReliefComponent:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfReliefComponent();

} // AbstractReliefComponentType
