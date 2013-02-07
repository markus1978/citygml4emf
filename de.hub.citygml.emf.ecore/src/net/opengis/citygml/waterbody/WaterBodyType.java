/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody;

import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.SolidPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water Body Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing Water Bodies, e.g., lakes, rivers. As subclass of _CityObject, a WaterBody inherits
 *                 all attributes and relations, in particular an id, names, external references, and generalization relations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiCurve <em>Lod0 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiSurface <em>Lod0 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiCurve <em>Lod1 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1Solid <em>Lod1 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod2Solid <em>Lod2 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod3Solid <em>Lod3 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getLod4Solid <em>Lod4 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getBoundedBy1 <em>Bounded By1</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getGenericApplicationPropertyOfWaterBodyGroup <em>Generic Application Property Of Water Body Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.WaterBodyType#getGenericApplicationPropertyOfWaterBody <em>Generic Application Property Of Water Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType()
 * @model extendedMetaData="name='WaterBodyType' kind='elementOnly'"
 * @generated
 */
public interface WaterBodyType extends AbstractWaterObjectType {
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
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Class()
	 * @model dataType="net.opengis.citygml.waterbody.WaterBodyClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.waterbody.WaterBodyFunctionType"
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
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Usage()
	 * @model unique="false" dataType="net.opengis.citygml.waterbody.WaterBodyUsageType"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Lod0 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod0 Multi Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod0 Multi Curve</em>' containment reference.
	 * @see #setLod0MultiCurve(MultiCurvePropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod0MultiCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod0MultiCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod0MultiCurve();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiCurve <em>Lod0 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod0 Multi Curve</em>' containment reference.
	 * @see #getLod0MultiCurve()
	 * @generated
	 */
	void setLod0MultiCurve(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod0 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod0 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod0 Multi Surface</em>' containment reference.
	 * @see #setLod0MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod0MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod0MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod0MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiSurface <em>Lod0 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod0 Multi Surface</em>' containment reference.
	 * @see #getLod0MultiSurface()
	 * @generated
	 */
	void setLod0MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod1 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Multi Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Multi Curve</em>' containment reference.
	 * @see #setLod1MultiCurve(MultiCurvePropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod1MultiCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1MultiCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod1MultiCurve();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiCurve <em>Lod1 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Multi Curve</em>' containment reference.
	 * @see #getLod1MultiCurve()
	 * @generated
	 */
	void setLod1MultiCurve(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Multi Surface</em>' containment reference.
	 * @see #setLod1MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod1MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod1MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Multi Surface</em>' containment reference.
	 * @see #getLod1MultiSurface()
	 * @generated
	 */
	void setLod1MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod1 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Solid</em>' containment reference.
	 * @see #setLod1Solid(SolidPropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod1Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod1Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1Solid <em>Lod1 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Solid</em>' containment reference.
	 * @see #getLod1Solid()
	 * @generated
	 */
	void setLod1Solid(SolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Solid</em>' containment reference.
	 * @see #setLod2Solid(SolidPropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod2Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod2Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod2Solid <em>Lod2 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Solid</em>' containment reference.
	 * @see #getLod2Solid()
	 * @generated
	 */
	void setLod2Solid(SolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Solid</em>' containment reference.
	 * @see #setLod3Solid(SolidPropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod3Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod3Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod3Solid <em>Lod3 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Solid</em>' containment reference.
	 * @see #getLod3Solid()
	 * @generated
	 */
	void setLod3Solid(SolidPropertyType value);

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
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_Lod4Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod4Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod4Solid <em>Lod4 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Solid</em>' containment reference.
	 * @see #getLod4Solid()
	 * @generated
	 */
	void setLod4Solid(SolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Bounded By1</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.waterbody.BoundedByWaterSurfacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded By1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded By1</em>' containment reference list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_BoundedBy1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BoundedByWaterSurfacePropertyType> getBoundedBy1();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Body Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Body Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Body Group</em>' attribute list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_GenericApplicationPropertyOfWaterBodyGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWaterBody:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWaterBodyGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Body</em>' containment reference list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getWaterBodyType_GenericApplicationPropertyOfWaterBody()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterBody' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWaterBody:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWaterBody();

} // WaterBodyType
