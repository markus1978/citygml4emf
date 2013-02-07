/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.gml.GeometryPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Furniture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type for building furnitures. As subclass of _CityObject, a BuildingFurniture inherits all
 *                 attributes and relations, in particular an id, names, external references, and generalization relations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.BuildingFurnitureType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingFurnitureType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingFurnitureType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingFurnitureType#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingFurnitureType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingFurnitureType#getGenericApplicationPropertyOfBuildingFurnitureGroup <em>Generic Application Property Of Building Furniture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingFurnitureType#getGenericApplicationPropertyOfBuildingFurniture <em>Generic Application Property Of Building Furniture</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType()
 * @model extendedMetaData="name='BuildingFurnitureType' kind='elementOnly'"
 * @generated
 */
public interface BuildingFurnitureType extends AbstractCityObjectType {
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
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType_Class()
	 * @model dataType="net.opengis.citygml.building.BuildingFurnitureClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingFurnitureType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.building.BuildingFurnitureFunctionType"
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
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType_Usage()
	 * @model unique="false" dataType="net.opengis.citygml.building.BuildingFurnitureUsageType"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Lod4 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #setLod4Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType_Lod4Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod4Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingFurnitureType#getLod4Geometry <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #getLod4Geometry()
	 * @generated
	 */
	void setLod4Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod4 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Implicit Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Implicit Representation</em>' containment reference.
	 * @see #setLod4ImplicitRepresentation(ImplicitRepresentationPropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType_Lod4ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod4ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingFurnitureType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Implicit Representation</em>' containment reference.
	 * @see #getLod4ImplicitRepresentation()
	 * @generated
	 */
	void setLod4ImplicitRepresentation(ImplicitRepresentationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Furniture Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Furniture Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Furniture Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurnitureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfBuildingFurniture:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfBuildingFurnitureGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Furniture</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Furniture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Furniture</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurniture()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuildingFurniture' namespace='##targetNamespace' group='_GenericApplicationPropertyOfBuildingFurniture:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfBuildingFurniture();

} // BuildingFurnitureType
