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
 * A representation of the model object '<em><b>Tex Coord Gen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Texture parameterization using a transformation matrix. The transformation matrix "worldToTexture"
 *                 can be used to derive texture coordinates from an object's location. This 3x4 matrix T computes the coordinates
 *                 (s,t) from a homogeneous world position p as (s,t) = (s'/q', t'/q') with (s', t', q') = T*p. Thus, perspective
 *                 projections can be specified. The SRS can be specified using standard attributes. If an object is given in a
 *                 different reference system, it is transformed to the SRS before applying the transformation. A transformation
 *                 matrix can be used for whole surfaces. It is not required to specify it per LinearRing. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.TexCoordGenType#getWorldToTexture <em>World To Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.TexCoordGenType#getGenericApplicationPropertyOfTexCoordGenGroup <em>Generic Application Property Of Tex Coord Gen Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.TexCoordGenType#getGenericApplicationPropertyOfTexCoordGen <em>Generic Application Property Of Tex Coord Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordGenType()
 * @model extendedMetaData="name='TexCoordGenType' kind='elementOnly'"
 * @generated
 */
public interface TexCoordGenType extends AbstractTextureParameterizationType {
	/**
	 * Returns the value of the '<em><b>World To Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World To Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World To Texture</em>' containment reference.
	 * @see #setWorldToTexture(WorldToTextureType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordGenType_WorldToTexture()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='worldToTexture' namespace='##targetNamespace'"
	 * @generated
	 */
	WorldToTextureType getWorldToTexture();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.TexCoordGenType#getWorldToTexture <em>World To Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World To Texture</em>' containment reference.
	 * @see #getWorldToTexture()
	 * @generated
	 */
	void setWorldToTexture(WorldToTextureType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tex Coord Gen Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tex Coord Gen Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tex Coord Gen Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordGenType_GenericApplicationPropertyOfTexCoordGenGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTexCoordGen:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTexCoordGenGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tex Coord Gen</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tex Coord Gen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tex Coord Gen</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordGenType_GenericApplicationPropertyOfTexCoordGen()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTexCoordGen' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTexCoordGen:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTexCoordGen();

} // TexCoordGenType
