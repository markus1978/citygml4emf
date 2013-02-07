/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specialization for standard 2D textures. "target" provides the linking to surface geometry. Only
 *                 gml:MultiSurface and decendants of gml:AbstractSurfaceType are valid targets. As property of the link, a texture
 *                 parameterization either as set of texture coordinates or transformation matrix is given. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.ParameterizedTextureType#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.ParameterizedTextureType#getGenericApplicationPropertyOfParameterizedTextureGroup <em>Generic Application Property Of Parameterized Texture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.ParameterizedTextureType#getGenericApplicationPropertyOfParameterizedTexture <em>Generic Application Property Of Parameterized Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getParameterizedTextureType()
 * @model extendedMetaData="name='ParameterizedTextureType' kind='elementOnly'"
 * @generated
 */
public interface ParameterizedTextureType extends AbstractTextureType {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.appearance.TextureAssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getParameterizedTextureType_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextureAssociationType> getTarget();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Parameterized Texture Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Parameterized Texture Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Parameterized Texture Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTextureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfParameterizedTexture:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfParameterizedTextureGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Parameterized Texture</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Parameterized Texture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Parameterized Texture</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTexture()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfParameterizedTexture' namespace='##targetNamespace' group='_GenericApplicationPropertyOfParameterizedTexture:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfParameterizedTexture();

} // ParameterizedTextureType
