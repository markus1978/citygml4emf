/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.gml.AssociationType;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opening Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an _BondarySurface to its openings (doors, windows). The OpeningPropertyType
 *                 element must either carry a reference to an _Opening object or contain an _Opening object inline, but neither both
 *                 nor none. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.OpeningPropertyType#getOpeningGroup <em>Opening Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.OpeningPropertyType#getOpening <em>Opening</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getOpeningPropertyType()
 * @model extendedMetaData="name='OpeningPropertyType' kind='elementOnly'"
 * @generated
 */
public interface OpeningPropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Opening Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getOpeningPropertyType_OpeningGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='_Opening:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOpeningGroup();

	/**
	 * Returns the value of the '<em><b>Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getOpeningPropertyType_Opening()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Opening' namespace='##targetNamespace' group='_Opening:group'"
	 * @generated
	 */
	AbstractOpeningType getOpening();

} // OpeningPropertyType
