/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getAppearance1 <em>Appearance1</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getMaterial <em>Material</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getSimpleTexture <em>Simple Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.DocumentRoot#getTexturedSurface <em>Textured Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_Appearance()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Appearance' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_GML'"
	 * @generated
	 */
	AbstractAppearanceType getAppearance();

	/**
	 * Returns the value of the '<em><b>Appearance1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance1</em>' containment reference.
	 * @see #setAppearance1(AppearancePropertyType)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_Appearance1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='appearance' namespace='##targetNamespace'"
	 * @generated
	 */
	AppearancePropertyType getAppearance1();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getAppearance1 <em>Appearance1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance1</em>' containment reference.
	 * @see #getAppearance1()
	 * @generated
	 */
	void setAppearance1(AppearancePropertyType value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialType)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_Material()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Material' namespace='##targetNamespace' affiliation='_Appearance'"
	 * @generated
	 */
	MaterialType getMaterial();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialType value);

	/**
	 * Returns the value of the '<em><b>Simple Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Texture</em>' containment reference.
	 * @see #setSimpleTexture(SimpleTextureType)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_SimpleTexture()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleTexture' namespace='##targetNamespace' affiliation='_Appearance'"
	 * @generated
	 */
	SimpleTextureType getSimpleTexture();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getSimpleTexture <em>Simple Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Texture</em>' containment reference.
	 * @see #getSimpleTexture()
	 * @generated
	 */
	void setSimpleTexture(SimpleTextureType value);

	/**
	 * Returns the value of the '<em><b>Textured Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textured Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textured Surface</em>' containment reference.
	 * @see #setTexturedSurface(TexturedSurfaceType)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getDocumentRoot_TexturedSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TexturedSurface' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#OrientableSurface'"
	 * @generated
	 */
	TexturedSurfaceType getTexturedSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getTexturedSurface <em>Textured Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textured Surface</em>' containment reference.
	 * @see #getTexturedSurface()
	 * @generated
	 */
	void setTexturedSurface(TexturedSurfaceType value);

} // DocumentRoot
