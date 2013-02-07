/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.appearance.AppearancePackage
 * @generated
 */
public interface AppearanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppearanceFactory eINSTANCE = net.opengis.citygml.appearance.impl.AppearanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Surface Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Surface Data Type</em>'.
	 * @generated
	 */
	AbstractSurfaceDataType createAbstractSurfaceDataType();

	/**
	 * Returns a new object of class '<em>Abstract Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Texture Type</em>'.
	 * @generated
	 */
	AbstractTextureType createAbstractTextureType();

	/**
	 * Returns a new object of class '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Type</em>'.
	 * @generated
	 */
	AppearancePropertyType createAppearancePropertyType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	AppearanceType createAppearanceType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Georeferenced Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Georeferenced Texture Type</em>'.
	 * @generated
	 */
	GeoreferencedTextureType createGeoreferencedTextureType();

	/**
	 * Returns a new object of class '<em>Parameterized Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterized Texture Type</em>'.
	 * @generated
	 */
	ParameterizedTextureType createParameterizedTextureType();

	/**
	 * Returns a new object of class '<em>Surface Data Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surface Data Property Type</em>'.
	 * @generated
	 */
	SurfaceDataPropertyType createSurfaceDataPropertyType();

	/**
	 * Returns a new object of class '<em>Tex Coord Gen Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tex Coord Gen Type</em>'.
	 * @generated
	 */
	TexCoordGenType createTexCoordGenType();

	/**
	 * Returns a new object of class '<em>Tex Coord List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tex Coord List Type</em>'.
	 * @generated
	 */
	TexCoordListType createTexCoordListType();

	/**
	 * Returns a new object of class '<em>Texture Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Texture Association Type</em>'.
	 * @generated
	 */
	TextureAssociationType createTextureAssociationType();

	/**
	 * Returns a new object of class '<em>Texture Coordinates Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Texture Coordinates Type</em>'.
	 * @generated
	 */
	TextureCoordinatesType createTextureCoordinatesType();

	/**
	 * Returns a new object of class '<em>World To Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World To Texture Type</em>'.
	 * @generated
	 */
	WorldToTextureType createWorldToTextureType();

	/**
	 * Returns a new object of class '<em>X3D Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X3D Material Type</em>'.
	 * @generated
	 */
	X3DMaterialType createX3DMaterialType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppearancePackage getAppearancePackage();

} //AppearanceFactory
