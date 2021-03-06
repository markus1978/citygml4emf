/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Position List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DirectPositionList instances hold the coordinates for a sequence of direct positions within the same coordinate 
 * 			reference system (CRS).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.DirectPositionListType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.DirectPositionListType#getAxisLabels <em>Axis Labels</em>}</li>
 *   <li>{@link net.opengis.gml.DirectPositionListType#getCount <em>Count</em>}</li>
 *   <li>{@link net.opengis.gml.DirectPositionListType#getSrsDimension <em>Srs Dimension</em>}</li>
 *   <li>{@link net.opengis.gml.DirectPositionListType#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.gml.DirectPositionListType#getUomLabels <em>Uom Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getDirectPositionListType()
 * @model extendedMetaData="name='DirectPositionListType' kind='simple'"
 * @generated
 */
public interface DirectPositionListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(List)
	 * @see net.opengis.gml.GmlPackage#getDirectPositionListType_Value()
	 * @model dataType="net.opengis.gml.DoubleList" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectPositionListType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Axis Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of labels for all the axes of this CRS. The gml:axisAbbrev value should be used for these axis 
	 * 				labels, after spaces and forbiddden characters are removed. When the srsName attribute is included, this attribute is optional. 
	 * 				When the srsName attribute is omitted, this attribute shall also be omitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axis Labels</em>' attribute.
	 * @see #setAxisLabels(List)
	 * @see net.opengis.gml.GmlPackage#getDirectPositionListType_AxisLabels()
	 * @model dataType="net.opengis.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='axisLabels'"
	 * @generated
	 */
	List<String> getAxisLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectPositionListType#getAxisLabels <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Labels</em>' attribute.
	 * @see #getAxisLabels()
	 * @generated
	 */
	void setAxisLabels(List<String> value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "count" allows to specify the number of direct positions in the list. If the attribute count is present then 
	 * 						the attribute srsDimension shall be present, too.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(BigInteger)
	 * @see net.opengis.gml.GmlPackage#getDirectPositionListType_Count()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectPositionListType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Srs Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "srsDimension" is the length of coordinate sequence (the number of entries in the list). This dimension is 
	 * 				specified by the coordinate reference system. When the srsName attribute is omitted, this attribute shall be omitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs Dimension</em>' attribute.
	 * @see #setSrsDimension(BigInteger)
	 * @see net.opengis.gml.GmlPackage#getDirectPositionListType_SrsDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='srsDimension'"
	 * @generated
	 */
	BigInteger getSrsDimension();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectPositionListType#getSrsDimension <em>Srs Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Dimension</em>' attribute.
	 * @see #getSrsDimension()
	 * @generated
	 */
	void setSrsDimension(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In general this reference points to a CRS instance of gml:CoordinateReferenceSystemType 
	 * 				(see coordinateReferenceSystems.xsd). For well known references it is not required that the CRS description exists at the 
	 * 				location the URI points to. If no srsName attribute is given, the CRS must be specified as part of the larger context this 
	 * 				geometry element is part of, e.g. a geometric element like point, curve, etc. It is expected that this attribute will be specified 
	 * 				at the direct position level only in rare cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs Name</em>' attribute.
	 * @see #setSrsName(String)
	 * @see net.opengis.gml.GmlPackage#getDirectPositionListType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectPositionListType#getSrsName <em>Srs Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Srs Name</em>' attribute.
	 * @see #getSrsName()
	 * @generated
	 */
	void setSrsName(String value);

	/**
	 * Returns the value of the '<em><b>Uom Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of unit of measure (uom) labels for all the axes of this CRS. The value of the string in the 
	 * 				gml:catalogSymbol should be used for this uom labels, after spaces and forbiddden characters are removed. When the 
	 * 				axisLabels attribute is included, this attribute shall also be included. When the axisLabels attribute is omitted, this attribute 
	 * 				shall also be omitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uom Labels</em>' attribute.
	 * @see #setUomLabels(List)
	 * @see net.opengis.gml.GmlPackage#getDirectPositionListType_UomLabels()
	 * @model dataType="net.opengis.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='uomLabels'"
	 * @generated
	 */
	List<String> getUomLabels();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectPositionListType#getUomLabels <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Labels</em>' attribute.
	 * @see #getUomLabels()
	 * @generated
	 */
	void setUomLabels(List<String> value);

} // DirectPositionListType
