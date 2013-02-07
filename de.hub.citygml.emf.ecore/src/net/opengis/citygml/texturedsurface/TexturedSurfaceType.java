/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface;

import net.opengis.gml.OrientableSurfaceType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textured Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated since CityGML version 0.4.0. Use the concepts of the CityGML Appearance module instead.
 *                 The concept of positioning textures on surfaces complies with the standard X3D. Because there has been no
 *                 appropriate texturing concept in GML3, CityGML adds the class TexturedSurface to the geometry model of GML 3. A
 *                 texture is specified as a raster image referenced by an URI, and can be an arbitrary resource, even in the
 *                 internet. Textures are positioned by employing the concept of texture coordinates, i.e. each texture coordinate
 *                 matches with exactly one 3D coordinate of the TexturedSurface. The use of texture coordinates allows an exact
 *                 positioning and trimming of the texture on the surface geometry. Each surface may be assigned one or more
 *                 appearances, each refering to one side of the surface. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.TexturedSurfaceType#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getTexturedSurfaceType()
 * @model extendedMetaData="name='TexturedSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface TexturedSurfaceType extends OrientableSurfaceType {
	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.texturedsurface.AppearancePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference list.
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getTexturedSurfaceType_Appearance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='appearance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AppearancePropertyType> getAppearance();

} // TexturedSurfaceType
