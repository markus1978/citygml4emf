/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.gml.SurfacePropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Water Boundary Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A WaterBoundarySurface is a thematic object which classifies surfaces bounding a water body.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod2Surface <em>Lod2 Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod3Surface <em>Lod3 Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod4Surface <em>Lod4 Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getGenericApplicationPropertyOfWaterBoundarySurfaceGroup <em>Generic Application Property Of Water Boundary Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getGenericApplicationPropertyOfWaterBoundarySurface <em>Generic Application Property Of Water Boundary Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterBoundarySurfaceType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractWaterBoundarySurfaceType' kind='elementOnly'"
 * @generated
 */
public interface AbstractWaterBoundarySurfaceType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Lod2 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Surface</em>' containment reference.
	 * @see #setLod2Surface(SurfacePropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterBoundarySurfaceType_Lod2Surface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2Surface' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getLod2Surface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod2Surface <em>Lod2 Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Surface</em>' containment reference.
	 * @see #getLod2Surface()
	 * @generated
	 */
	void setLod2Surface(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Surface</em>' containment reference.
	 * @see #setLod3Surface(SurfacePropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterBoundarySurfaceType_Lod3Surface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3Surface' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getLod3Surface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod3Surface <em>Lod3 Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Surface</em>' containment reference.
	 * @see #getLod3Surface()
	 * @generated
	 */
	void setLod3Surface(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod4 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Surface</em>' containment reference.
	 * @see #setLod4Surface(SurfacePropertyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterBoundarySurfaceType_Lod4Surface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Surface' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getLod4Surface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod4Surface <em>Lod4 Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Surface</em>' containment reference.
	 * @see #getLod4Surface()
	 * @generated
	 */
	void setLod4Surface(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Boundary Surface Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Boundary Surface Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Boundary Surface Group</em>' attribute list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterBoundarySurfaceType_GenericApplicationPropertyOfWaterBoundarySurfaceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWaterBoundarySurface:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWaterBoundarySurfaceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Boundary Surface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Boundary Surface</em>' containment reference list.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getAbstractWaterBoundarySurfaceType_GenericApplicationPropertyOfWaterBoundarySurface()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterBoundarySurface' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWaterBoundarySurface:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWaterBoundarySurface();

} // AbstractWaterBoundarySurfaceType
