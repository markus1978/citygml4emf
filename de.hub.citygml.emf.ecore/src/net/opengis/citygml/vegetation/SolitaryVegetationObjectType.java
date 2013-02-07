/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation;

import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.LengthType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solitary Vegetation Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing solitary vegetation objects, e.g., trees. Its geometry is either defined explicitly
 *                 by a GML 3 geometry with absolute coordinates, or in the case of multiple occurences of the same vegetation
 *                 object, implicitly by a reference to a shape definition and a transformation. The shape definition may be given in
 *                 an external file. As subclass of _CityObject, a SolitaryVegetationObject inherits all attributes and relations, in
 *                 particular an id, names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getSpecies <em>Species</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getHeight <em>Height</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getTrunkDiameter <em>Trunk Diameter</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getCrownDiameter <em>Crown Diameter</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1Geometry <em>Lod1 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getGenericApplicationPropertyOfSolitaryVegetationObjectGroup <em>Generic Application Property Of Solitary Vegetation Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getGenericApplicationPropertyOfSolitaryVegetationObject <em>Generic Application Property Of Solitary Vegetation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType()
 * @model extendedMetaData="name='SolitaryVegetationObjectType' kind='elementOnly'"
 * @generated
 */
public interface SolitaryVegetationObjectType extends AbstractVegetationObjectType {
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Class()
	 * @model dataType="net.opengis.citygml.vegetation.PlantClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.vegetation.PlantFunctionType"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFunction();

	/**
	 * Returns the value of the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' attribute.
	 * @see #setSpecies(String)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Species()
	 * @model dataType="net.opengis.citygml.vegetation.SpeciesType"
	 *        extendedMetaData="kind='element' name='species' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpecies();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getSpecies <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' attribute.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(LengthType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Height()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getHeight();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(LengthType value);

	/**
	 * Returns the value of the '<em><b>Trunk Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trunk Diameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trunk Diameter</em>' containment reference.
	 * @see #setTrunkDiameter(LengthType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_TrunkDiameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trunkDiameter' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getTrunkDiameter();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getTrunkDiameter <em>Trunk Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trunk Diameter</em>' containment reference.
	 * @see #getTrunkDiameter()
	 * @generated
	 */
	void setTrunkDiameter(LengthType value);

	/**
	 * Returns the value of the '<em><b>Crown Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crown Diameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crown Diameter</em>' containment reference.
	 * @see #setCrownDiameter(LengthType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_CrownDiameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crownDiameter' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getCrownDiameter();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getCrownDiameter <em>Crown Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crown Diameter</em>' containment reference.
	 * @see #getCrownDiameter()
	 * @generated
	 */
	void setCrownDiameter(LengthType value);

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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod1Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod1Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1Geometry <em>Lod1 Geometry</em>}' containment reference.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod2Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod2Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2Geometry <em>Lod2 Geometry</em>}' containment reference.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod3Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod3Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3Geometry <em>Lod3 Geometry</em>}' containment reference.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod4Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod4Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4Geometry <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #getLod4Geometry()
	 * @generated
	 */
	void setLod4Geometry(GeometryPropertyType value);

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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod1ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod1ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}' containment reference.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod2ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod2ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}' containment reference.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod3ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod3ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}' containment reference.
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_Lod4ImplicitRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4ImplicitRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitRepresentationPropertyType getLod4ImplicitRepresentation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Implicit Representation</em>' containment reference.
	 * @see #getLod4ImplicitRepresentation()
	 * @generated
	 */
	void setLod4ImplicitRepresentation(ImplicitRepresentationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Solitary Vegetation Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Solitary Vegetation Object Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Solitary Vegetation Object Group</em>' attribute list.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfSolitaryVegetationObject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfSolitaryVegetationObjectGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Solitary Vegetation Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Solitary Vegetation Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Solitary Vegetation Object</em>' containment reference list.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSolitaryVegetationObject' namespace='##targetNamespace' group='_GenericApplicationPropertyOfSolitaryVegetationObject:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfSolitaryVegetationObject();

} // SolitaryVegetationObjectType
