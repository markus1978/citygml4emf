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
 * A representation of the model object '<em><b>Interior Furniture Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of a Room to its interior furnitures (movable). The
 *                 InteriorFurniturePropertyType element must either carry a reference to a BuildingFurniture object or contain a
 *                 BuildingFurniture object inline, but neither both nor none. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.InteriorFurniturePropertyType#getBuildingFurniture <em>Building Furniture</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getInteriorFurniturePropertyType()
 * @model extendedMetaData="name='InteriorFurniturePropertyType' kind='elementOnly'"
 * @generated
 */
public interface InteriorFurniturePropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Building Furniture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Furniture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Furniture</em>' containment reference.
	 * @see #setBuildingFurniture(BuildingFurnitureType)
	 * @see net.opengis.citygml.building.BuildingPackage#getInteriorFurniturePropertyType_BuildingFurniture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BuildingFurniture' namespace='##targetNamespace'"
	 * @generated
	 */
	BuildingFurnitureType getBuildingFurniture();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.InteriorFurniturePropertyType#getBuildingFurniture <em>Building Furniture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Furniture</em>' containment reference.
	 * @see #getBuildingFurniture()
	 * @generated
	 */
	void setBuildingFurniture(BuildingFurnitureType value);

} // InteriorFurniturePropertyType
