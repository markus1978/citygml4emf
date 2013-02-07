/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World To Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.WorldToTextureType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.WorldToTextureType#getAxisLabels <em>Axis Labels</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.WorldToTextureType#getSrsDimension <em>Srs Dimension</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.WorldToTextureType#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.WorldToTextureType#getUomLabels <em>Uom Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getWorldToTextureType()
 * @model extendedMetaData="name='worldToTexture_._type' kind='simple'"
 * @generated
 */
public interface WorldToTextureType extends EObject {
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getWorldToTextureType_Value()
	 * @model dataType="net.opengis.citygml.TransformationMatrix3x4Type" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.WorldToTextureType#getValue <em>Value</em>}' attribute.
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getWorldToTextureType_AxisLabels()
	 * @model dataType="net.opengis.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='axisLabels'"
	 * @generated
	 */
	List<String> getAxisLabels();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.WorldToTextureType#getAxisLabels <em>Axis Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Labels</em>' attribute.
	 * @see #getAxisLabels()
	 * @generated
	 */
	void setAxisLabels(List<String> value);

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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getWorldToTextureType_SrsDimension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='srsDimension'"
	 * @generated
	 */
	BigInteger getSrsDimension();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.WorldToTextureType#getSrsDimension <em>Srs Dimension</em>}' attribute.
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getWorldToTextureType_SrsName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='srsName'"
	 * @generated
	 */
	String getSrsName();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.WorldToTextureType#getSrsName <em>Srs Name</em>}' attribute.
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getWorldToTextureType_UomLabels()
	 * @model dataType="net.opengis.gml.NCNameList" many="false"
	 *        extendedMetaData="kind='attribute' name='uomLabels'"
	 * @generated
	 */
	List<String> getUomLabels();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.WorldToTextureType#getUomLabels <em>Uom Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Labels</em>' attribute.
	 * @see #getUomLabels()
	 * @generated
	 */
	void setUomLabels(List<String> value);

} // WorldToTextureType
