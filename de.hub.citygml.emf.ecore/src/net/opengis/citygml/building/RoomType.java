/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.SolidPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Room is a thematic object for modelling the closed parts inside a building. It has to be closed,
 *                 if necessary by using closure surfaces. The geometry may be either a solid, or a MultiSurface if the boundary is
 *                 not topologically clean. The room connectivity may be derived by detecting shared thematic openings or closure
 *                 surfaces: two rooms are connected if both use the same opening object or the same closure surface. The thematic
 *                 surfaces bounding a room are referenced by the boundedBy property. As subclass of _CityObject, a Room inherits all
 *                 attributes and relations, in particular an id, names, external references, and generalization relations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.RoomType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getLod4Solid <em>Lod4 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getBoundedBy1 <em>Bounded By1</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getInteriorFurniture <em>Interior Furniture</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getRoomInstallation <em>Room Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getGenericApplicationPropertyOfRoomGroup <em>Generic Application Property Of Room Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.RoomType#getGenericApplicationPropertyOfRoom <em>Generic Application Property Of Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getRoomType()
 * @model extendedMetaData="name='RoomType' kind='elementOnly'"
 * @generated
 */
public interface RoomType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_Class()
	 * @model dataType="net.opengis.citygml.building.RoomClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.RoomType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.building.RoomFunctionType"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFunction();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_Usage()
	 * @model unique="false" dataType="net.opengis.citygml.building.RoomUsageType"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Lod4 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Solid</em>' containment reference.
	 * @see #setLod4Solid(SolidPropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_Lod4Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod4Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.RoomType#getLod4Solid <em>Lod4 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Solid</em>' containment reference.
	 * @see #getLod4Solid()
	 * @generated
	 */
	void setLod4Solid(SolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Multi Surface</em>' containment reference.
	 * @see #setLod4MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_Lod4MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod4MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.RoomType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Multi Surface</em>' containment reference.
	 * @see #getLod4MultiSurface()
	 * @generated
	 */
	void setLod4MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Bounded By1</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.building.BoundarySurfacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded By1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded By1</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_BoundedBy1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BoundarySurfacePropertyType> getBoundedBy1();

	/**
	 * Returns the value of the '<em><b>Interior Furniture</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.building.InteriorFurniturePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior Furniture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior Furniture</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_InteriorFurniture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interiorFurniture' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InteriorFurniturePropertyType> getInteriorFurniture();

	/**
	 * Returns the value of the '<em><b>Room Installation</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.building.IntBuildingInstallationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Installation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Installation</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_RoomInstallation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='roomInstallation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntBuildingInstallationPropertyType> getRoomInstallation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Room Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Room Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Room Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_GenericApplicationPropertyOfRoomGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfRoom:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfRoomGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Room</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Room</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Room</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getRoomType_GenericApplicationPropertyOfRoom()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRoom' namespace='##targetNamespace' group='_GenericApplicationPropertyOfRoom:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfRoom();

} // RoomType
