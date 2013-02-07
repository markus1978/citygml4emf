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
 * A representation of the model object '<em><b>Tex Coord List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Texture parameterization using texture coordinates: Each gml:LinearRing that is part of the surface
 *                 requires a separate "textureCoordinates"-entry with 2 doubles per ring vertex. The "ring"- attribute provides the
 *                 gml:id of the target LinearRing. It is prohibited to link texture coordinates to any other object type than
 *                 LinearRing. Thus, surfaces not consisting of LinearRings cannot be textured this way. Use transformation matrices
 *                 (see below) or georeferenced textures instead. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.TexCoordListType#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.TexCoordListType#getGenericApplicationPropertyOfTexCoordListGroup <em>Generic Application Property Of Tex Coord List Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.TexCoordListType#getGenericApplicationPropertyOfTexCoordList <em>Generic Application Property Of Tex Coord List</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordListType()
 * @model extendedMetaData="name='TexCoordListType' kind='elementOnly'"
 * @generated
 */
public interface TexCoordListType extends AbstractTextureParameterizationType {
	/**
	 * Returns the value of the '<em><b>Texture Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.appearance.TextureCoordinatesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Coordinates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Coordinates</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordListType_TextureCoordinates()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='textureCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextureCoordinatesType> getTextureCoordinates();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tex Coord List Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tex Coord List Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tex Coord List Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordListType_GenericApplicationPropertyOfTexCoordListGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTexCoordList:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTexCoordListGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tex Coord List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tex Coord List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tex Coord List</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getTexCoordListType_GenericApplicationPropertyOfTexCoordList()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTexCoordList' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTexCoordList:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTexCoordList();

} // TexCoordListType
