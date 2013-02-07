/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityfurniture;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.MultiCurvePropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City Furniture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing city furnitures, like traffic lights, benches, ... As subclass of _CityObject, a
 *                 CityFurniture inherits all attributes and relations, in particular an id, names, external references, and
 *                 generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod1Geometry <em>Lod1 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getGenericApplicationPropertyOfCityFurnitureGroup <em>Generic Application Property Of City Furniture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getGenericApplicationPropertyOfCityFurniture <em>Generic Application Property Of City Furniture</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType()
 * @model extendedMetaData="name='CityFurnitureType' kind='elementOnly'"
 * @generated
 */
public interface CityFurnitureType extends AbstractCityObjectType {
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
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Class()
	 * @model dataType="net.opengis.citygml.cityfurniture.CityFurnitureClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.cityfurniture.CityFurnitureFunctionType"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFunction();

	/**
	 * Returns the value of the '<em><b>Lod1 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Geometry</em>' containment reference.
	 * @see #setLod1Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod1Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod1Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod1Geometry <em>Lod1 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Geometry</em>' containment reference.
	 * @see #getLod1Geometry()
	 * @generated
	 */
	void setLod1Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Geometry</em>' containment reference.
	 * @see #setLod2Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod2Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod2Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod2Geometry <em>Lod2 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Geometry</em>' containment reference.
	 * @see #getLod2Geometry()
	 * @generated
	 */
	void setLod2Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Geometry</em>' containment reference.
	 * @see #setLod3Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod3Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod3Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod3Geometry <em>Lod3 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Geometry</em>' containment reference.
	 * @see #getLod3Geometry()
	 * @generated
	 */
	void setLod3Geometry(GeometryPropertyType value);

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
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod4Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod4Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod4Geometry <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #getLod4Geometry()
	 * @generated
	 */
	void setLod4Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod1 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Terrain Intersection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Terrain Intersection</em>' containment reference.
	 * @see #setLod1TerrainIntersection(MultiCurvePropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod1TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod1TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Terrain Intersection</em>' containment reference.
	 * @see #getLod1TerrainIntersection()
	 * @generated
	 */
	void setLod1TerrainIntersection(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Terrain Intersection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Terrain Intersection</em>' containment reference.
	 * @see #setLod2TerrainIntersection(MultiCurvePropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod2TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod2TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Terrain Intersection</em>' containment reference.
	 * @see #getLod2TerrainIntersection()
	 * @generated
	 */
	void setLod2TerrainIntersection(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Terrain Intersection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Terrain Intersection</em>' containment reference.
	 * @see #setLod3TerrainIntersection(MultiCurvePropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod3TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod3TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Terrain Intersection</em>' containment reference.
	 * @see #getLod3TerrainIntersection()
	 * @generated
	 */
	void setLod3TerrainIntersection(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod4 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Terrain Intersection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Terrain Intersection</em>' containment reference.
	 * @see #setLod4TerrainIntersection(MultiCurvePropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod4TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod4TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Terrain Intersection</em>' containment reference.
	 * @see #getLod4TerrainIntersection()
	 * @generated
	 */
	void setLod4TerrainIntersection(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod1 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Implicit Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Implicit Representation</em>' containment reference.
	 * @see #setLod1ImplicitRepresentation(ImplicitRepresentationPropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod1ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod1ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Implicit Representation</em>' containment reference.
	 * @see #getLod1ImplicitRepresentation()
	 * @generated
	 */
	void setLod1ImplicitRepresentation(ImplicitRepresentationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Implicit Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Implicit Representation</em>' containment reference.
	 * @see #setLod2ImplicitRepresentation(ImplicitRepresentationPropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod2ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod2ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Implicit Representation</em>' containment reference.
	 * @see #getLod2ImplicitRepresentation()
	 * @generated
	 */
	void setLod2ImplicitRepresentation(ImplicitRepresentationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Implicit Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Implicit Representation</em>' containment reference.
	 * @see #setLod3ImplicitRepresentation(ImplicitRepresentationPropertyType)
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod3ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod3ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Implicit Representation</em>' containment reference.
	 * @see #getLod3ImplicitRepresentation()
	 * @generated
	 */
	void setLod3ImplicitRepresentation(ImplicitRepresentationPropertyType value);

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
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_Lod4ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod4ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityfurniture.CityFurnitureType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Implicit Representation</em>' containment reference.
	 * @see #getLod4ImplicitRepresentation()
	 * @generated
	 */
	void setLod4ImplicitRepresentation(ImplicitRepresentationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Furniture Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Furniture Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Furniture Group</em>' attribute list.
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_GenericApplicationPropertyOfCityFurnitureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfCityFurniture:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfCityFurnitureGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Furniture</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Furniture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Furniture</em>' containment reference list.
	 * @see net.opengis.citygml.cityfurniture.CityfurniturePackage#getCityFurnitureType_GenericApplicationPropertyOfCityFurniture()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCityFurniture' namespace='##targetNamespace' group='_GenericApplicationPropertyOfCityFurniture:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfCityFurniture();

} // CityFurnitureType
