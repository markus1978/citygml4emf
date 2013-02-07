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
 * A representation of the model object '<em><b>Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated since CityGML version 0.4.0. Use the concepts of the CityGML Appearance module instead.
 *                 Adopted from X3D standard (http://www.web3d.org/x3d/) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.MaterialType#getShininess <em>Shininess</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.MaterialType#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.MaterialType#getAmbientIntensity <em>Ambient Intensity</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.MaterialType#getSpecularColor <em>Specular Color</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.MaterialType#getDiffuseColor <em>Diffuse Color</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.MaterialType#getEmissiveColor <em>Emissive Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getMaterialType()
 * @model extendedMetaData="name='MaterialType' kind='elementOnly'"
 * @generated
 */
public interface MaterialType extends AbstractAppearanceType {
	/**
	 * Returns the value of the '<em><b>Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shininess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shininess</em>' attribute.
	 * @see #isSetShininess()
	 * @see #unsetShininess()
	 * @see #setShininess(double)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getMaterialType_Shininess()
	 * @model unsettable="true" dataType="net.opengis.citygml.DoubleBetween0and1"
	 *        extendedMetaData="kind='element' name='shininess' namespace='##targetNamespace'"
	 * @generated
	 */
	double getShininess();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getShininess <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shininess</em>' attribute.
	 * @see #isSetShininess()
	 * @see #unsetShininess()
	 * @see #getShininess()
	 * @generated
	 */
	void setShininess(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getShininess <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShininess()
	 * @see #getShininess()
	 * @see #setShininess(double)
	 * @generated
	 */
	void unsetShininess();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getShininess <em>Shininess</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shininess</em>' attribute is set.
	 * @see #unsetShininess()
	 * @see #getShininess()
	 * @see #setShininess(double)
	 * @generated
	 */
	boolean isSetShininess();

	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #isSetTransparency()
	 * @see #unsetTransparency()
	 * @see #setTransparency(double)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getMaterialType_Transparency()
	 * @model unsettable="true" dataType="net.opengis.citygml.DoubleBetween0and1"
	 *        extendedMetaData="kind='element' name='transparency' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTransparency();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #isSetTransparency()
	 * @see #unsetTransparency()
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransparency()
	 * @see #getTransparency()
	 * @see #setTransparency(double)
	 * @generated
	 */
	void unsetTransparency();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getTransparency <em>Transparency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transparency</em>' attribute is set.
	 * @see #unsetTransparency()
	 * @see #getTransparency()
	 * @see #setTransparency(double)
	 * @generated
	 */
	boolean isSetTransparency();

	/**
	 * Returns the value of the '<em><b>Ambient Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient Intensity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Intensity</em>' attribute.
	 * @see #isSetAmbientIntensity()
	 * @see #unsetAmbientIntensity()
	 * @see #setAmbientIntensity(double)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getMaterialType_AmbientIntensity()
	 * @model unsettable="true" dataType="net.opengis.citygml.DoubleBetween0and1"
	 *        extendedMetaData="kind='element' name='ambientIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAmbientIntensity();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getAmbientIntensity <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Intensity</em>' attribute.
	 * @see #isSetAmbientIntensity()
	 * @see #unsetAmbientIntensity()
	 * @see #getAmbientIntensity()
	 * @generated
	 */
	void setAmbientIntensity(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getAmbientIntensity <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmbientIntensity()
	 * @see #getAmbientIntensity()
	 * @see #setAmbientIntensity(double)
	 * @generated
	 */
	void unsetAmbientIntensity();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getAmbientIntensity <em>Ambient Intensity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ambient Intensity</em>' attribute is set.
	 * @see #unsetAmbientIntensity()
	 * @see #getAmbientIntensity()
	 * @see #setAmbientIntensity(double)
	 * @generated
	 */
	boolean isSetAmbientIntensity();

	/**
	 * Returns the value of the '<em><b>Specular Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Color</em>' attribute.
	 * @see #setSpecularColor(List)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getMaterialType_SpecularColor()
	 * @model dataType="net.opengis.citygml.texturedsurface.Color" many="false"
	 *        extendedMetaData="kind='element' name='specularColor' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getSpecularColor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getSpecularColor <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Color</em>' attribute.
	 * @see #getSpecularColor()
	 * @generated
	 */
	void setSpecularColor(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Diffuse Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Color</em>' attribute.
	 * @see #setDiffuseColor(List)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getMaterialType_DiffuseColor()
	 * @model dataType="net.opengis.citygml.texturedsurface.Color" many="false"
	 *        extendedMetaData="kind='element' name='diffuseColor' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getDiffuseColor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getDiffuseColor <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Color</em>' attribute.
	 * @see #getDiffuseColor()
	 * @generated
	 */
	void setDiffuseColor(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Emissive Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emissive Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emissive Color</em>' attribute.
	 * @see #setEmissiveColor(List)
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#getMaterialType_EmissiveColor()
	 * @model dataType="net.opengis.citygml.texturedsurface.Color" many="false"
	 *        extendedMetaData="kind='element' name='emissiveColor' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getEmissiveColor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.texturedsurface.MaterialType#getEmissiveColor <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emissive Color</em>' attribute.
	 * @see #getEmissiveColor()
	 * @generated
	 */
	void setEmissiveColor(List<Double> value);

} // MaterialType
