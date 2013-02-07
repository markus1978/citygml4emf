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
 * A representation of the model object '<em><b>X3D Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class for defining constant surface properties. It is based on X3D's material definition. In
 *                 addition, "isSmooth" provides a hint for value interpolation. The link to surface geometry is established via the
 *                 "target"-property. Only gml:MultiSurface or decendants of gml:AbstractSurfaceType are valid targets.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getAmbientIntensity <em>Ambient Intensity</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getDiffuseColor <em>Diffuse Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getEmissiveColor <em>Emissive Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getSpecularColor <em>Specular Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getShininess <em>Shininess</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#isIsSmooth <em>Is Smooth</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getGenericApplicationPropertyOfX3DMaterialGroup <em>Generic Application Property Of X3D Material Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.X3DMaterialType#getGenericApplicationPropertyOfX3DMaterial <em>Generic Application Property Of X3D Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType()
 * @model extendedMetaData="name='X3DMaterialType' kind='elementOnly'"
 * @generated
 */
public interface X3DMaterialType extends AbstractSurfaceDataType {
	/**
	 * Returns the value of the '<em><b>Ambient Intensity</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_AmbientIntensity()
	 * @model default="0.2" unsettable="true" dataType="net.opengis.citygml.DoubleBetween0and1"
	 *        extendedMetaData="kind='element' name='ambientIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAmbientIntensity();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getAmbientIntensity <em>Ambient Intensity</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getAmbientIntensity <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmbientIntensity()
	 * @see #getAmbientIntensity()
	 * @see #setAmbientIntensity(double)
	 * @generated
	 */
	void unsetAmbientIntensity();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getAmbientIntensity <em>Ambient Intensity</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Diffuse Color</b></em>' attribute.
	 * The default value is <code>"0.8 0.8 0.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Color</em>' attribute.
	 * @see #isSetDiffuseColor()
	 * @see #unsetDiffuseColor()
	 * @see #setDiffuseColor(List)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_DiffuseColor()
	 * @model default="0.8 0.8 0.8" unsettable="true" dataType="net.opengis.citygml.appearance.Color" many="false"
	 *        extendedMetaData="kind='element' name='diffuseColor' namespace='##targetNamespace'"
	 * @generated
	 */
	List getDiffuseColor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getDiffuseColor <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Color</em>' attribute.
	 * @see #isSetDiffuseColor()
	 * @see #unsetDiffuseColor()
	 * @see #getDiffuseColor()
	 * @generated
	 */
	void setDiffuseColor(List value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getDiffuseColor <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiffuseColor()
	 * @see #getDiffuseColor()
	 * @see #setDiffuseColor(List)
	 * @generated
	 */
	void unsetDiffuseColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getDiffuseColor <em>Diffuse Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diffuse Color</em>' attribute is set.
	 * @see #unsetDiffuseColor()
	 * @see #getDiffuseColor()
	 * @see #setDiffuseColor(List)
	 * @generated
	 */
	boolean isSetDiffuseColor();

	/**
	 * Returns the value of the '<em><b>Emissive Color</b></em>' attribute.
	 * The default value is <code>"0.0 0.0 0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emissive Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emissive Color</em>' attribute.
	 * @see #isSetEmissiveColor()
	 * @see #unsetEmissiveColor()
	 * @see #setEmissiveColor(List)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_EmissiveColor()
	 * @model default="0.0 0.0 0.0" unsettable="true" dataType="net.opengis.citygml.appearance.Color" many="false"
	 *        extendedMetaData="kind='element' name='emissiveColor' namespace='##targetNamespace'"
	 * @generated
	 */
	List getEmissiveColor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getEmissiveColor <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emissive Color</em>' attribute.
	 * @see #isSetEmissiveColor()
	 * @see #unsetEmissiveColor()
	 * @see #getEmissiveColor()
	 * @generated
	 */
	void setEmissiveColor(List value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getEmissiveColor <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmissiveColor()
	 * @see #getEmissiveColor()
	 * @see #setEmissiveColor(List)
	 * @generated
	 */
	void unsetEmissiveColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getEmissiveColor <em>Emissive Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Emissive Color</em>' attribute is set.
	 * @see #unsetEmissiveColor()
	 * @see #getEmissiveColor()
	 * @see #setEmissiveColor(List)
	 * @generated
	 */
	boolean isSetEmissiveColor();

	/**
	 * Returns the value of the '<em><b>Specular Color</b></em>' attribute.
	 * The default value is <code>"1.0 1.0 1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Color</em>' attribute.
	 * @see #isSetSpecularColor()
	 * @see #unsetSpecularColor()
	 * @see #setSpecularColor(List)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_SpecularColor()
	 * @model default="1.0 1.0 1.0" unsettable="true" dataType="net.opengis.citygml.appearance.Color" many="false"
	 *        extendedMetaData="kind='element' name='specularColor' namespace='##targetNamespace'"
	 * @generated
	 */
	List getSpecularColor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getSpecularColor <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Color</em>' attribute.
	 * @see #isSetSpecularColor()
	 * @see #unsetSpecularColor()
	 * @see #getSpecularColor()
	 * @generated
	 */
	void setSpecularColor(List value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getSpecularColor <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecularColor()
	 * @see #getSpecularColor()
	 * @see #setSpecularColor(List)
	 * @generated
	 */
	void unsetSpecularColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getSpecularColor <em>Specular Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specular Color</em>' attribute is set.
	 * @see #unsetSpecularColor()
	 * @see #getSpecularColor()
	 * @see #setSpecularColor(List)
	 * @generated
	 */
	boolean isSetSpecularColor();

	/**
	 * Returns the value of the '<em><b>Shininess</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_Shininess()
	 * @model default="0.2" unsettable="true" dataType="net.opengis.citygml.DoubleBetween0and1"
	 *        extendedMetaData="kind='element' name='shininess' namespace='##targetNamespace'"
	 * @generated
	 */
	double getShininess();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getShininess <em>Shininess</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getShininess <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShininess()
	 * @see #getShininess()
	 * @see #setShininess(double)
	 * @generated
	 */
	void unsetShininess();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getShininess <em>Shininess</em>}' attribute is set.
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
	 * The default value is <code>"0.0"</code>.
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
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_Transparency()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.citygml.DoubleBetween0and1"
	 *        extendedMetaData="kind='element' name='transparency' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTransparency();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getTransparency <em>Transparency</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransparency()
	 * @see #getTransparency()
	 * @see #setTransparency(double)
	 * @generated
	 */
	void unsetTransparency();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#getTransparency <em>Transparency</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Smooth</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Smooth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Smooth</em>' attribute.
	 * @see #isSetIsSmooth()
	 * @see #unsetIsSmooth()
	 * @see #setIsSmooth(boolean)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_IsSmooth()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='isSmooth' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsSmooth();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#isIsSmooth <em>Is Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Smooth</em>' attribute.
	 * @see #isSetIsSmooth()
	 * @see #unsetIsSmooth()
	 * @see #isIsSmooth()
	 * @generated
	 */
	void setIsSmooth(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#isIsSmooth <em>Is Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSmooth()
	 * @see #isIsSmooth()
	 * @see #setIsSmooth(boolean)
	 * @generated
	 */
	void unsetIsSmooth();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.X3DMaterialType#isIsSmooth <em>Is Smooth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Smooth</em>' attribute is set.
	 * @see #unsetIsSmooth()
	 * @see #isIsSmooth()
	 * @see #setIsSmooth(boolean)
	 * @generated
	 */
	boolean isSetIsSmooth();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_Target()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTarget();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of X3D Material Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of X3D Material Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of X3D Material Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_GenericApplicationPropertyOfX3DMaterialGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfX3DMaterial:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfX3DMaterialGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of X3D Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of X3D Material</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of X3D Material</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getX3DMaterialType_GenericApplicationPropertyOfX3DMaterial()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfX3DMaterial' namespace='##targetNamespace' group='_GenericApplicationPropertyOfX3DMaterial:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfX3DMaterial();

} // X3DMaterialType
