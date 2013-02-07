/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LineString is a special curve that consists of a single segment with linear interpolation. It is defined by two or more coordinate 
 * 			tuples, with linear interpolation between them. It is backwards compatible with the LineString of GML 2, GM_LineString of ISO 19107 is 
 * 			implemented by LineStringSegment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.LineStringType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.LineStringType#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.LineStringType#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.LineStringType#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.LineStringType#getCoord <em>Coord</em>}</li>
 *   <li>{@link net.opengis.gml.LineStringType#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.LineStringType#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getLineStringType()
 * @model extendedMetaData="name='LineStringType' kind='elementOnly'"
 * @generated
 */
public interface LineStringType extends AbstractCurveType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml.GmlPackage#getLineStringType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:10'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.DirectPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getLineStringType_Pos()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pos' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<DirectPositionType> getPos();

	/**
	 * Returns the value of the '<em><b>Point Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a point via the XLink-attributes or contains the point element. pointProperty 
	 * 			is the predefined property which can be used by GML Application Schemas whenever a GML Feature has a property with a value that 
	 * 			is substitutable for Point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Property</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getLineStringType_PointProperty()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointProperty' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<PointPropertyType> getPointProperty();

	/**
	 * Returns the value of the '<em><b>Point Rep</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.PointPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated with GML version 3.1.0. Use "pointProperty" instead. Included for backwards compatibility 
	 * 									with GML 3.0.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Rep</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getLineStringType_PointRep()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pointRep' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<PointPropertyType> getPointRep();

	/**
	 * Returns the value of the '<em><b>Coord</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.CoordType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated with GML version 3.0. Use "pos" instead. The "coord" element is included for backwards 
	 * 									compatibility with GML 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coord</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getLineStringType_Coord()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coord' namespace='##targetNamespace' group='#group:10'"
	 * @generated
	 */
	EList<CoordType> getCoord();

	/**
	 * Returns the value of the '<em><b>Pos List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos List</em>' containment reference.
	 * @see #setPosList(DirectPositionListType)
	 * @see net.opengis.gml.GmlPackage#getLineStringType_PosList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='posList' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectPositionListType getPosList();

	/**
	 * Sets the value of the '{@link net.opengis.gml.LineStringType#getPosList <em>Pos List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos List</em>' containment reference.
	 * @see #getPosList()
	 * @generated
	 */
	void setPosList(DirectPositionListType value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated with GML version 3.1.0. Use "posList" instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(CoordinatesType)
	 * @see net.opengis.gml.GmlPackage#getLineStringType_Coordinates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.gml.LineStringType#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(CoordinatesType value);

} // LineStringType