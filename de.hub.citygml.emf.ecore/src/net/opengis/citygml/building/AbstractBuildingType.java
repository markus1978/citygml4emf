/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.citygml.AbstractSiteType;
import net.opengis.citygml.AddressPropertyType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureOrNullListType;
import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.SolidPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Building Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the thematic and geometric attributes and the associations of buildings. It is an
 *                 abstract type, only its subclasses Building and BuildingPart can be instantiated. An _AbstractBuilding may consist
 *                 of BuildingParts, which are again _AbstractBuildings by inheritance. Thus an aggregation hierarchy between
 *                 _AbstractBuildings of arbitrary depth may be specified. In such an hierarchy, top elements are Buildings, while
 *                 all other elements are BuildingParts. Each element of such a hierarchy may have all attributes and geometries of
 *                 _AbstractBuildings. It must, however, be assured than no inconsistencies occur (for example, if the geometry of a
 *                 Building does not correspond to the geometries of its parts, or if the roof type of a Building is saddle roof,
 *                 while its parts have an hip roof). As subclass of _CityObject, an _AbstractBuilding inherits all attributes and
 *                 relations, in particular an id, names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getYearOfConstruction <em>Year Of Construction</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getYearOfDemolition <em>Year Of Demolition</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getRoofType <em>Roof Type</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getMeasuredHeight <em>Measured Height</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getStoreysAboveGround <em>Storeys Above Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getStoreysBelowGround <em>Storeys Below Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsAboveGround <em>Storey Heights Above Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsBelowGround <em>Storey Heights Below Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod1Solid <em>Lod1 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod2Solid <em>Lod2 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod2MultiCurve <em>Lod2 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getOuterBuildingInstallation <em>Outer Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getInteriorBuildingInstallation <em>Interior Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getBoundedBy1 <em>Bounded By1</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod3Solid <em>Lod3 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod3MultiCurve <em>Lod3 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod4Solid <em>Lod4 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod4MultiCurve <em>Lod4 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getInteriorRoom <em>Interior Room</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getConsistsOfBuildingPart <em>Consists Of Building Part</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getGenericApplicationPropertyOfAbstractBuildingGroup <em>Generic Application Property Of Abstract Building Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.AbstractBuildingType#getGenericApplicationPropertyOfAbstractBuilding <em>Generic Application Property Of Abstract Building</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractBuildingType' kind='elementOnly'"
 * @generated
 */
public interface AbstractBuildingType extends AbstractSiteType {
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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Class()
	 * @model dataType="net.opengis.citygml.building.BuildingClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.building.BuildingFunctionType"
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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Usage()
	 * @model unique="false" dataType="net.opengis.citygml.building.BuildingUsageType"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Year Of Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Of Construction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Of Construction</em>' attribute.
	 * @see #setYearOfConstruction(XMLGregorianCalendar)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_YearOfConstruction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
	 *        extendedMetaData="kind='element' name='yearOfConstruction' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getYearOfConstruction();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getYearOfConstruction <em>Year Of Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Of Construction</em>' attribute.
	 * @see #getYearOfConstruction()
	 * @generated
	 */
	void setYearOfConstruction(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Year Of Demolition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Of Demolition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Of Demolition</em>' attribute.
	 * @see #setYearOfDemolition(XMLGregorianCalendar)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_YearOfDemolition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
	 *        extendedMetaData="kind='element' name='yearOfDemolition' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getYearOfDemolition();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getYearOfDemolition <em>Year Of Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Of Demolition</em>' attribute.
	 * @see #getYearOfDemolition()
	 * @generated
	 */
	void setYearOfDemolition(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Roof Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roof Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roof Type</em>' attribute.
	 * @see #setRoofType(String)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_RoofType()
	 * @model dataType="net.opengis.citygml.building.RoofTypeType"
	 *        extendedMetaData="kind='element' name='roofType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRoofType();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getRoofType <em>Roof Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roof Type</em>' attribute.
	 * @see #getRoofType()
	 * @generated
	 */
	void setRoofType(String value);

	/**
	 * Returns the value of the '<em><b>Measured Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Height</em>' containment reference.
	 * @see #setMeasuredHeight(LengthType)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_MeasuredHeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measuredHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getMeasuredHeight();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getMeasuredHeight <em>Measured Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measured Height</em>' containment reference.
	 * @see #getMeasuredHeight()
	 * @generated
	 */
	void setMeasuredHeight(LengthType value);

	/**
	 * Returns the value of the '<em><b>Storeys Above Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storeys Above Ground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storeys Above Ground</em>' attribute.
	 * @see #setStoreysAboveGround(BigInteger)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_StoreysAboveGround()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='storeysAboveGround' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStoreysAboveGround();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreysAboveGround <em>Storeys Above Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storeys Above Ground</em>' attribute.
	 * @see #getStoreysAboveGround()
	 * @generated
	 */
	void setStoreysAboveGround(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Storeys Below Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storeys Below Ground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storeys Below Ground</em>' attribute.
	 * @see #setStoreysBelowGround(BigInteger)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_StoreysBelowGround()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='storeysBelowGround' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStoreysBelowGround();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreysBelowGround <em>Storeys Below Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storeys Below Ground</em>' attribute.
	 * @see #getStoreysBelowGround()
	 * @generated
	 */
	void setStoreysBelowGround(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Storey Heights Above Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storey Heights Above Ground</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storey Heights Above Ground</em>' containment reference.
	 * @see #setStoreyHeightsAboveGround(MeasureOrNullListType)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_StoreyHeightsAboveGround()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='storeyHeightsAboveGround' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureOrNullListType getStoreyHeightsAboveGround();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsAboveGround <em>Storey Heights Above Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storey Heights Above Ground</em>' containment reference.
	 * @see #getStoreyHeightsAboveGround()
	 * @generated
	 */
	void setStoreyHeightsAboveGround(MeasureOrNullListType value);

	/**
	 * Returns the value of the '<em><b>Storey Heights Below Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storey Heights Below Ground</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storey Heights Below Ground</em>' containment reference.
	 * @see #setStoreyHeightsBelowGround(MeasureOrNullListType)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_StoreyHeightsBelowGround()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='storeyHeightsBelowGround' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureOrNullListType getStoreyHeightsBelowGround();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsBelowGround <em>Storey Heights Below Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storey Heights Below Ground</em>' containment reference.
	 * @see #getStoreyHeightsBelowGround()
	 * @generated
	 */
	void setStoreyHeightsBelowGround(MeasureOrNullListType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod1Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod1Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod1Solid <em>Lod1 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Solid</em>' containment reference.
	 * @see #getLod1Solid()
	 * @generated
	 */
	void setLod1Solid(SolidPropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod1MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod1MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Multi Surface</em>' containment reference.
	 * @see #getLod1MultiSurface()
	 * @generated
	 */
	void setLod1MultiSurface(MultiSurfacePropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod1TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod1TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Terrain Intersection</em>' containment reference.
	 * @see #getLod1TerrainIntersection()
	 * @generated
	 */
	void setLod1TerrainIntersection(MultiCurvePropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod2Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod2Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2Solid <em>Lod2 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Solid</em>' containment reference.
	 * @see #getLod2Solid()
	 * @generated
	 */
	void setLod2Solid(SolidPropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod2MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod2MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Multi Surface</em>' containment reference.
	 * @see #getLod2MultiSurface()
	 * @generated
	 */
	void setLod2MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Multi Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Multi Curve</em>' containment reference.
	 * @see #setLod2MultiCurve(MultiCurvePropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod2MultiCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2MultiCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod2MultiCurve();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2MultiCurve <em>Lod2 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Multi Curve</em>' containment reference.
	 * @see #getLod2MultiCurve()
	 * @generated
	 */
	void setLod2MultiCurve(MultiCurvePropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod2TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod2TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Terrain Intersection</em>' containment reference.
	 * @see #getLod2TerrainIntersection()
	 * @generated
	 */
	void setLod2TerrainIntersection(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Outer Building Installation</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.building.BuildingInstallationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Building Installation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Building Installation</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_OuterBuildingInstallation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outerBuildingInstallation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BuildingInstallationPropertyType> getOuterBuildingInstallation();

	/**
	 * Returns the value of the '<em><b>Interior Building Installation</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.building.IntBuildingInstallationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior Building Installation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior Building Installation</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_InteriorBuildingInstallation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interiorBuildingInstallation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntBuildingInstallationPropertyType> getInteriorBuildingInstallation();

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_BoundedBy1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BoundarySurfacePropertyType> getBoundedBy1();

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod3Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod3Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3Solid <em>Lod3 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Solid</em>' containment reference.
	 * @see #getLod3Solid()
	 * @generated
	 */
	void setLod3Solid(SolidPropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod3MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod3MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Multi Surface</em>' containment reference.
	 * @see #getLod3MultiSurface()
	 * @generated
	 */
	void setLod3MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Multi Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Multi Curve</em>' containment reference.
	 * @see #setLod3MultiCurve(MultiCurvePropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod3MultiCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3MultiCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod3MultiCurve();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3MultiCurve <em>Lod3 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Multi Curve</em>' containment reference.
	 * @see #getLod3MultiCurve()
	 * @generated
	 */
	void setLod3MultiCurve(MultiCurvePropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod3TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod3TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Terrain Intersection</em>' containment reference.
	 * @see #getLod3TerrainIntersection()
	 * @generated
	 */
	void setLod3TerrainIntersection(MultiCurvePropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod4Solid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Solid' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidPropertyType getLod4Solid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4Solid <em>Lod4 Solid</em>}' containment reference.
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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod4MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod4MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Multi Surface</em>' containment reference.
	 * @see #getLod4MultiSurface()
	 * @generated
	 */
	void setLod4MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod4 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Multi Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Multi Curve</em>' containment reference.
	 * @see #setLod4MultiCurve(MultiCurvePropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod4MultiCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4MultiCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod4MultiCurve();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4MultiCurve <em>Lod4 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Multi Curve</em>' containment reference.
	 * @see #getLod4MultiCurve()
	 * @generated
	 */
	void setLod4MultiCurve(MultiCurvePropertyType value);

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
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Lod4TerrainIntersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4TerrainIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getLod4TerrainIntersection();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Terrain Intersection</em>' containment reference.
	 * @see #getLod4TerrainIntersection()
	 * @generated
	 */
	void setLod4TerrainIntersection(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Interior Room</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.building.InteriorRoomPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior Room</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior Room</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_InteriorRoom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interiorRoom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InteriorRoomPropertyType> getInteriorRoom();

	/**
	 * Returns the value of the '<em><b>Consists Of Building Part</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.building.BuildingPartPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of Building Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of Building Part</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_ConsistsOfBuildingPart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consistsOfBuildingPart' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BuildingPartPropertyType> getConsistsOfBuildingPart();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.AddressPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressPropertyType> getAddress();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Abstract Building Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Abstract Building Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Abstract Building Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuildingGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfAbstractBuilding:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfAbstractBuildingGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Abstract Building</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Abstract Building</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuilding()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAbstractBuilding' namespace='##targetNamespace' group='_GenericApplicationPropertyOfAbstractBuilding:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfAbstractBuilding();

} // AbstractBuildingType
