/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage
 * @generated
 */
public interface TexturedsurfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TexturedsurfaceFactory eINSTANCE = net.opengis.citygml.texturedsurface.impl.TexturedsurfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Appearance Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appearance Property Type</em>'.
	 * @generated
	 */
	AppearancePropertyType createAppearancePropertyType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Type</em>'.
	 * @generated
	 */
	MaterialType createMaterialType();

	/**
	 * Returns a new object of class '<em>Simple Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Texture Type</em>'.
	 * @generated
	 */
	SimpleTextureType createSimpleTextureType();

	/**
	 * Returns a new object of class '<em>Textured Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textured Surface Type</em>'.
	 * @generated
	 */
	TexturedSurfaceType createTexturedSurfaceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TexturedsurfacePackage getTexturedsurfacePackage();

} //TexturedsurfaceFactory
