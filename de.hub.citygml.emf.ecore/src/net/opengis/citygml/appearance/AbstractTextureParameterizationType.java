/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import net.opengis.gml.AbstractGMLType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Texture Parameterization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for augmenting a link "texture->surface" with texture parameterization. Subclasses of
 *                 this class define concrete parameterizations. Currently, texture coordinates and texture coordinate generation
 *                 using a transformation matrix are available. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureParameterizationType#getGenericApplicationPropertyOfTextureParameterizationGroup <em>Generic Application Property Of Texture Parameterization Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractTextureParameterizationType#getGenericApplicationPropertyOfTextureParameterization <em>Generic Application Property Of Texture Parameterization</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureParameterizationType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTextureParameterizationType' kind='elementOnly'"
 * @generated
 */
public interface AbstractTextureParameterizationType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Texture Parameterization Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Texture Parameterization Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Texture Parameterization Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterizationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTextureParameterization:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTextureParameterizationGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Texture Parameterization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Texture Parameterization</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterization()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTextureParameterization' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTextureParameterization:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTextureParameterization();

} // AbstractTextureParameterizationType
