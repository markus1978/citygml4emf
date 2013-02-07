/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.TextureCoordinatesType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.TextureCoordinatesType#getRing <em>Ring</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getTextureCoordinatesType()
 * @model extendedMetaData="name='textureCoordinates_._type' kind='simple'"
 * @generated
 */
public interface TextureCoordinatesType extends EObject {
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTextureCoordinatesType_Value()
	 * @model dataType="net.opengis.gml.DoubleList" many="false"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	List<Double> getValue();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.TextureCoordinatesType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Ring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring</em>' attribute.
	 * @see #setRing(String)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTextureCoordinatesType_Ring()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='ring'"
	 * @generated
	 */
	String getRing();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.TextureCoordinatesType#getRing <em>Ring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring</em>' attribute.
	 * @see #getRing()
	 * @generated
	 */
	void setRing(String value);

} // TextureCoordinatesType
