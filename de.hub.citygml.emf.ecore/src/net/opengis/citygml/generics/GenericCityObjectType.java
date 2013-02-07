/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.MultiCurvePropertyType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic City Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic (user defined) city objects may be used to model features which are not covered explicitly
 *                 by the CityGML schema. Generic objects must be used with care; they shall only be used if there is no appropiate
 *                 thematic class available in the overall CityGML schema. Oherwise, problems concerning semantic interoperability
 *                 may arise. As subclass of _CityObject, a generic city object inherits all attributes and relations, in particular
 *                 an id, names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0Geometry <em>Lod0 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1Geometry <em>Lod1 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0TerrainIntersection <em>Lod0 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0ImplicitRepresentation <em>Lod0 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType()
 * @model extendedMetaData="name='GenericCityObjectType' kind='elementOnly'"
 * @generated
 */
public interface GenericCityObjectType extends AbstractCityObjectType {
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Function()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Usage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Lod0 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod0 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod0 Geometry</em>' containment reference.
	 * @see #setLod0Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod0Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod0Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod0Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0Geometry <em>Lod0 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod0 Geometry</em>' containment reference.
	 * @see #getLod0Geometry()
	 * @generated
	 */
	void setLod0Geometry(GeometryPropertyType value);

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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod1Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod1Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1Geometry <em>Lod1 Geometry</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod2Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod2Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2Geometry <em>Lod2 Geometry</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod3Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod3Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3Geometry <em>Lod3 Geometry</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod4Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod4Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4Geometry <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #getLod4Geometry()
	 * @generated
	 */
	void setLod4Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod0 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod0 Terrain Intersection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod0 Terrain Intersection</em>' containment reference.
	 * @see #setLod0TerrainIntersection(MultiCurvePropertyType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod0TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod0TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod0TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0TerrainIntersection <em>Lod0 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod0 Terrain Intersection</em>' containment reference.
	 * @see #getLod0TerrainIntersection()
	 * @generated
	 */
	void setLod0TerrainIntersection(MultiCurvePropertyType value);

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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod1TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod1TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod2TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod2TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod3TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod3TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod4TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod4TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Terrain Intersection</em>' containment reference.
	 * @see #getLod4TerrainIntersection()
	 * @generated
	 */
	void setLod4TerrainIntersection(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod0 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod0 Implicit Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod0 Implicit Representation</em>' containment reference.
	 * @see #setLod0ImplicitRepresentation(ImplicitRepresentationPropertyType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod0ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod0ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod0ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0ImplicitRepresentation <em>Lod0 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod0 Implicit Representation</em>' containment reference.
	 * @see #getLod0ImplicitRepresentation()
	 * @generated
	 */
	void setLod0ImplicitRepresentation(ImplicitRepresentationPropertyType value);

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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod1ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod1ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod2ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod2ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod3ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod3ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}' containment reference.
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
	 * @see net.opengis.citygml.generics.GenericsPackage#getGenericCityObjectType_Lod4ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod4ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Implicit Representation</em>' containment reference.
	 * @see #getLod4ImplicitRepresentation()
	 * @generated
	 */
	void setLod4ImplicitRepresentation(ImplicitRepresentationPropertyType value);

} // GenericCityObjectType
