/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.util;

import net.opengis.citygml.appearance.AbstractSurfaceDataType;
import net.opengis.citygml.appearance.AbstractTextureParameterizationType;
import net.opengis.citygml.appearance.AbstractTextureType;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.AppearancePropertyType;
import net.opengis.citygml.appearance.AppearanceType;
import net.opengis.citygml.appearance.DocumentRoot;
import net.opengis.citygml.appearance.GeoreferencedTextureType;
import net.opengis.citygml.appearance.ParameterizedTextureType;
import net.opengis.citygml.appearance.SurfaceDataPropertyType;
import net.opengis.citygml.appearance.TexCoordGenType;
import net.opengis.citygml.appearance.TexCoordListType;
import net.opengis.citygml.appearance.TextureAssociationType;
import net.opengis.citygml.appearance.TextureCoordinatesType;
import net.opengis.citygml.appearance.WorldToTextureType;
import net.opengis.citygml.appearance.X3DMaterialType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.FeaturePropertyType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.appearance.AppearancePackage
 * @generated
 */
public class AppearanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppearancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceSwitch() {
		if (modelPackage == null) {
			modelPackage = AppearancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE: {
				AbstractSurfaceDataType abstractSurfaceDataType = (AbstractSurfaceDataType)theEObject;
				T result = caseAbstractSurfaceDataType(abstractSurfaceDataType);
				if (result == null) result = caseAbstractFeatureType(abstractSurfaceDataType);
				if (result == null) result = caseAbstractGMLType(abstractSurfaceDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE: {
				AbstractTextureParameterizationType abstractTextureParameterizationType = (AbstractTextureParameterizationType)theEObject;
				T result = caseAbstractTextureParameterizationType(abstractTextureParameterizationType);
				if (result == null) result = caseAbstractGMLType(abstractTextureParameterizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE: {
				AbstractTextureType abstractTextureType = (AbstractTextureType)theEObject;
				T result = caseAbstractTextureType(abstractTextureType);
				if (result == null) result = caseAbstractSurfaceDataType(abstractTextureType);
				if (result == null) result = caseAbstractFeatureType(abstractTextureType);
				if (result == null) result = caseAbstractGMLType(abstractTextureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE: {
				AppearancePropertyType appearancePropertyType = (AppearancePropertyType)theEObject;
				T result = caseAppearancePropertyType(appearancePropertyType);
				if (result == null) result = caseFeaturePropertyType(appearancePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.APPEARANCE_TYPE: {
				AppearanceType appearanceType = (AppearanceType)theEObject;
				T result = caseAppearanceType(appearanceType);
				if (result == null) result = caseAbstractFeatureType(appearanceType);
				if (result == null) result = caseAbstractGMLType(appearanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE: {
				GeoreferencedTextureType georeferencedTextureType = (GeoreferencedTextureType)theEObject;
				T result = caseGeoreferencedTextureType(georeferencedTextureType);
				if (result == null) result = caseAbstractTextureType(georeferencedTextureType);
				if (result == null) result = caseAbstractSurfaceDataType(georeferencedTextureType);
				if (result == null) result = caseAbstractFeatureType(georeferencedTextureType);
				if (result == null) result = caseAbstractGMLType(georeferencedTextureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE: {
				ParameterizedTextureType parameterizedTextureType = (ParameterizedTextureType)theEObject;
				T result = caseParameterizedTextureType(parameterizedTextureType);
				if (result == null) result = caseAbstractTextureType(parameterizedTextureType);
				if (result == null) result = caseAbstractSurfaceDataType(parameterizedTextureType);
				if (result == null) result = caseAbstractFeatureType(parameterizedTextureType);
				if (result == null) result = caseAbstractGMLType(parameterizedTextureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.SURFACE_DATA_PROPERTY_TYPE: {
				SurfaceDataPropertyType surfaceDataPropertyType = (SurfaceDataPropertyType)theEObject;
				T result = caseSurfaceDataPropertyType(surfaceDataPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.TEX_COORD_GEN_TYPE: {
				TexCoordGenType texCoordGenType = (TexCoordGenType)theEObject;
				T result = caseTexCoordGenType(texCoordGenType);
				if (result == null) result = caseAbstractTextureParameterizationType(texCoordGenType);
				if (result == null) result = caseAbstractGMLType(texCoordGenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.TEX_COORD_LIST_TYPE: {
				TexCoordListType texCoordListType = (TexCoordListType)theEObject;
				T result = caseTexCoordListType(texCoordListType);
				if (result == null) result = caseAbstractTextureParameterizationType(texCoordListType);
				if (result == null) result = caseAbstractGMLType(texCoordListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.TEXTURE_ASSOCIATION_TYPE: {
				TextureAssociationType textureAssociationType = (TextureAssociationType)theEObject;
				T result = caseTextureAssociationType(textureAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.TEXTURE_COORDINATES_TYPE: {
				TextureCoordinatesType textureCoordinatesType = (TextureCoordinatesType)theEObject;
				T result = caseTextureCoordinatesType(textureCoordinatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE: {
				WorldToTextureType worldToTextureType = (WorldToTextureType)theEObject;
				T result = caseWorldToTextureType(worldToTextureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppearancePackage.X3D_MATERIAL_TYPE: {
				X3DMaterialType x3DMaterialType = (X3DMaterialType)theEObject;
				T result = caseX3DMaterialType(x3DMaterialType);
				if (result == null) result = caseAbstractSurfaceDataType(x3DMaterialType);
				if (result == null) result = caseAbstractFeatureType(x3DMaterialType);
				if (result == null) result = caseAbstractGMLType(x3DMaterialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceDataType(AbstractSurfaceDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Texture Parameterization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Texture Parameterization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTextureParameterizationType(AbstractTextureParameterizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Texture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTextureType(AbstractTextureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearancePropertyType(AppearancePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearanceType(AppearanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Georeferenced Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Georeferenced Texture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoreferencedTextureType(GeoreferencedTextureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Texture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedTextureType(ParameterizedTextureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Data Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Data Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfaceDataPropertyType(SurfaceDataPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tex Coord Gen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tex Coord Gen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexCoordGenType(TexCoordGenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tex Coord List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tex Coord List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexCoordListType(TexCoordListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texture Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texture Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextureAssociationType(TextureAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texture Coordinates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texture Coordinates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextureCoordinatesType(TextureCoordinatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>World To Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World To Texture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorldToTextureType(WorldToTextureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X3D Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X3D Material Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX3DMaterialType(X3DMaterialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGMLType(AbstractGMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureType(AbstractFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePropertyType(FeaturePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AppearanceSwitch
