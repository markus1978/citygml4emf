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
 * A representation of the model object '<em><b>Interior Room Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an _AbstractBuilding to its rooms. The InteriorRoomPropertyType element must
 *                 either carry a reference to a Room object or contain a Room object inline, but neither both nor none.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.InteriorRoomPropertyType#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getInteriorRoomPropertyType()
 * @model extendedMetaData="name='InteriorRoomPropertyType' kind='elementOnly'"
 * @generated
 */
public interface InteriorRoomPropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference.
	 * @see #setRoom(RoomType)
	 * @see net.opengis.citygml.building.BuildingPackage#getInteriorRoomPropertyType_Room()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Room' namespace='##targetNamespace'"
	 * @generated
	 */
	RoomType getRoom();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.InteriorRoomPropertyType#getRoom <em>Room</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' containment reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(RoomType value);

} // InteriorRoomPropertyType
