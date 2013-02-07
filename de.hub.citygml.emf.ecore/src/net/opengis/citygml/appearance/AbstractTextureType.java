/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for textures. "imageURI" can contain any valid URI from references to a local file to
 *                 preformatted web service requests. The linking to geometry and texture parameterization is provided by derived
 *                 classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureType#getImageURI <em>Image URI</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureType#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureType#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureType#getWrapMode <em>Wrap Mode</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureType#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureType#getGenericApplicationPropertyOfTextureGroup <em>Generic Application Property Of Texture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureType#getGenericApplicationPropertyOfTexture <em>Generic Application Property Of Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType()
 * @model extendedMetaData="name='AbstractTextureType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTextureType extends AbstractSurfaceDataType {
	/**
	 * Returns the value of the '<em><b>Image URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image URI</em>' attribute.
	 * @see #setImageURI(String)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType_ImageURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='imageURI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImageURI();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getImageURI <em>Image URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image URI</em>' attribute.
	 * @see #getImageURI()
	 * @generated
	 */
	void setImageURI(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType_MimeType()
	 * @model dataType="net.opengis.citygml.MimeTypeType"
	 *        extendedMetaData="kind='element' name='mimeType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Texture Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.citygml.appearance.TextureTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Type</em>' attribute.
	 * @see net.opengis.citygml.appearance.TextureTypeType
	 * @see #isSetTextureType()
	 * @see #unsetTextureType()
	 * @see #setTextureType(TextureTypeType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType_TextureType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='textureType' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureTypeType getTextureType();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Type</em>' attribute.
	 * @see net.opengis.citygml.appearance.TextureTypeType
	 * @see #isSetTextureType()
	 * @see #unsetTextureType()
	 * @see #getTextureType()
	 * @generated
	 */
	void setTextureType(TextureTypeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureType()
	 * @see #getTextureType()
	 * @see #setTextureType(TextureTypeType)
	 * @generated
	 */
	void unsetTextureType();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getTextureType <em>Texture Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Wrap Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.citygml.appearance.WrapModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap Mode</em>' attribute.
	 * @see net.opengis.citygml.appearance.WrapModeType
	 * @see #isSetWrapMode()
	 * @see #unsetWrapMode()
	 * @see #setWrapMode(WrapModeType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType_WrapMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='wrapMode' namespace='##targetNamespace'"
	 * @generated
	 */
	WrapModeType getWrapMode();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getWrapMode <em>Wrap Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap Mode</em>' attribute.
	 * @see net.opengis.citygml.appearance.WrapModeType
	 * @see #isSetWrapMode()
	 * @see #unsetWrapMode()
	 * @see #getWrapMode()
	 * @generated
	 */
	void setWrapMode(WrapModeType value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getWrapMode <em>Wrap Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapMode()
	 * @see #getWrapMode()
	 * @see #setWrapMode(WrapModeType)
	 * @generated
	 */
	void unsetWrapMode();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getWrapMode <em>Wrap Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap Mode</em>' attribute is set.
	 * @see #unsetWrapMode()
	 * @see #getWrapMode()
	 * @see #setWrapMode(WrapModeType)
	 * @generated
	 */
	boolean isSetWrapMode();

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(List)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType_BorderColor()
	 * @model dataType="net.opengis.citygml.appearance.ColorPlusOpacity" many="false"
	 *        extendedMetaData="kind='element' name='borderColor' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getBorderColor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AbstractTextureType#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Texture Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Texture Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Texture Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType_GenericApplicationPropertyOfTextureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTexture:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTextureGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Texture</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Texture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Texture</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureType_GenericApplicationPropertyOfTexture()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTexture' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTexture:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTexture();

} // AbstractTextureType
