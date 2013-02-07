/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation;

import net.opengis.gml.LengthType;
import net.opengis.gml.MultiSolidPropertyType;
import net.opengis.gml.MultiSurfacePropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant Cover Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing Plant Covers resp. Biotopes. As subclass of _CityObject, a VegetationObject inherits
 *                 all attributes and relations, in particular an id, names, external references, and generalization relations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getAverageHeight <em>Average Height</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSolid <em>Lod1 Multi Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSolid <em>Lod2 Multi Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSolid <em>Lod3 Multi Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getGenericApplicationPropertyOfPlantCoverGroup <em>Generic Application Property Of Plant Cover Group</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.PlantCoverType#getGenericApplicationPropertyOfPlantCover <em>Generic Application Property Of Plant Cover</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType()
 * @model extendedMetaData="name='PlantCoverType' kind='elementOnly'"
 * @generated
 */
public interface PlantCoverType extends AbstractVegetationObjectType {
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Class()
	 * @model dataType="net.opengis.citygml.vegetation.PlantCoverClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.vegetation.PlantCoverFunctionType"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFunction();

	/**
	 * Returns the value of the '<em><b>Average Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Height</em>' containment reference.
	 * @see #setAverageHeight(LengthType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_AverageHeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='averageHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getAverageHeight();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getAverageHeight <em>Average Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Height</em>' containment reference.
	 * @see #getAverageHeight()
	 * @generated
	 */
	void setAverageHeight(LengthType value);

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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Lod1MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod1MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Multi Surface</em>' containment reference.
	 * @see #getLod1MultiSurface()
	 * @generated
	 */
	void setLod1MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Multi Surface</em>' containment reference.
	 * @see #setLod2MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Lod2MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod2MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Multi Surface</em>' containment reference.
	 * @see #getLod2MultiSurface()
	 * @generated
	 */
	void setLod2MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Multi Surface</em>' containment reference.
	 * @see #setLod3MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Lod3MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod3MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Multi Surface</em>' containment reference.
	 * @see #getLod3MultiSurface()
	 * @generated
	 */
	void setLod3MultiSurface(MultiSurfacePropertyType value);

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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Lod4MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod4MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Multi Surface</em>' containment reference.
	 * @see #getLod4MultiSurface()
	 * @generated
	 */
	void setLod4MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod1 Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Multi Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Multi Solid</em>' containment reference.
	 * @see #setLod1MultiSolid(MultiSolidPropertyType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Lod1MultiSolid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1MultiSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSolidPropertyType getLod1MultiSolid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSolid <em>Lod1 Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Multi Solid</em>' containment reference.
	 * @see #getLod1MultiSolid()
	 * @generated
	 */
	void setLod1MultiSolid(MultiSolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Multi Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Multi Solid</em>' containment reference.
	 * @see #setLod2MultiSolid(MultiSolidPropertyType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Lod2MultiSolid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2MultiSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSolidPropertyType getLod2MultiSolid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSolid <em>Lod2 Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Multi Solid</em>' containment reference.
	 * @see #getLod2MultiSolid()
	 * @generated
	 */
	void setLod2MultiSolid(MultiSolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Multi Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Multi Solid</em>' containment reference.
	 * @see #setLod3MultiSolid(MultiSolidPropertyType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_Lod3MultiSolid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3MultiSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSolidPropertyType getLod3MultiSolid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSolid <em>Lod3 Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Multi Solid</em>' containment reference.
	 * @see #getLod3MultiSolid()
	 * @generated
	 */
	void setLod3MultiSolid(MultiSolidPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Plant Cover Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Plant Cover Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Plant Cover Group</em>' attribute list.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_GenericApplicationPropertyOfPlantCoverGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfPlantCover:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfPlantCoverGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Plant Cover</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Plant Cover</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Plant Cover</em>' containment reference list.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getPlantCoverType_GenericApplicationPropertyOfPlantCover()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfPlantCover' namespace='##targetNamespace' group='_GenericApplicationPropertyOfPlantCover:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfPlantCover();

} // PlantCoverType
