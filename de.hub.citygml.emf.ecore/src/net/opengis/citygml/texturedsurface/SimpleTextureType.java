/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated since CityGML version 0.4.0. Use the concepts of the CityGML Appearance module instead.
 *                 Adopted from X3D standard (http://www.web3d.org/x3d/). ToDo: repeat 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureMap <em>Texture Map</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.SimpleTextureType#isRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getSimpleTextureType()
 * @model extendedMetaData="name='SimpleTextureType' kind='elementOnly'"
 * @generated
 */
public interface SimpleTextureType extends AbstractAppearanceType {
	/**
	 * Returns the value of the '<em><b>Texture Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Map</em>' attribute.
	 * @see #setTextureMap(String)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getSimpleTextureType_TextureMap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='textureMap' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextureMap();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureMap <em>Texture Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Map</em>' attribute.
	 * @see #getTextureMap()
	 * @generated
	 */
	void setTextureMap(String value);

	/**
	 * Returns the value of the '<em><b>Texture Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Coordinates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Coordinates</em>' attribute.
	 * @see #setTextureCoordinates(List)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getSimpleTextureType_TextureCoordinates()
	 * @model dataType="net.opengis.gml.DoubleList" required="true" many="false"
	 *        extendedMetaData="kind='element' name='textureCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getTextureCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureCoordinates <em>Texture Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Coordinates</em>' attribute.
	 * @see #getTextureCoordinates()
	 * @generated
	 */
	void setTextureCoordinates(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Texture Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.citygml.texturedsurface.TextureTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Type</em>' attribute.
	 * @see net.opengis.citygml.texturedsurface.TextureTypeType
	 * @see #isSetTextureType()
	 * @see #unsetTextureType()
	 * @see #setTextureType(TextureTypeType)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getSimpleTextureType_TextureType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='textureType' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureTypeType getTextureType();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Type</em>' attribute.
	 * @see net.opengis.citygml.texturedsurface.TextureTypeType
	 * @see #isSetTextureType()
	 * @see #unsetTextureType()
	 * @see #getTextureType()
	 * @generated
	 */
	void setTextureType(TextureTypeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureType()
	 * @see #getTextureType()
	 * @see #setTextureType(TextureTypeType)
	 * @generated
	 */
	void unsetTextureType();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureType <em>Texture Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Type</em>' attribute is set.
	 * @see #unsetTextureType()
	 * @see #getTextureType()
	 * @see #setTextureType(TextureTypeType)
	 * @generated
	 */
	boolean isSetTextureType();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #isSetRepeat()
	 * @see #unsetRepeat()
	 * @see #setRepeat(boolean)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getSimpleTextureType_Repeat()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRepeat();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#isRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #isSetRepeat()
	 * @see #unsetRepeat()
	 * @see #isRepeat()
	 * @generated
	 */
	void setRepeat(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#isRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepeat()
	 * @see #isRepeat()
	 * @see #setRepeat(boolean)
	 * @generated
	 */
	void unsetRepeat();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#isRepeat <em>Repeat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repeat</em>' attribute is set.
	 * @see #unsetRepeat()
	 * @see #isRepeat()
	 * @see #setRepeat(boolean)
	 * @generated
	 */
	boolean isSetRepeat();

} // SimpleTextureType
