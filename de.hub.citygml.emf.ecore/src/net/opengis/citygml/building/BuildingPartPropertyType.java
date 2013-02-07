/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.gml.AssociationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an _AbstractBuilding to its building parts. The BuildingPartPropertyType
 *                 element must either carry a reference to a BuildingPart object or contain a BuildingPart object inline, but
 *                 neither both nor none.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.BuildingPartPropertyType#getBuildingPart <em>Building Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getBuildingPartPropertyType()
 * @model extendedMetaData="name='BuildingPartPropertyType' kind='elementOnly'"
 * @generated
 */
public interface BuildingPartPropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Building Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Part</em>' containment reference.
	 * @see #setBuildingPart(BuildingPartType)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingPartPropertyType_BuildingPart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BuildingPart' namespace='##targetNamespace'"
	 * @generated
	 */
	BuildingPartType getBuildingPart();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingPartPropertyType#getBuildingPart <em>Building Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Part</em>' containment reference.
	 * @see #getBuildingPart()
	 * @generated
	 */
	void setBuildingPart(BuildingPartType value);

} // BuildingPartPropertyType
