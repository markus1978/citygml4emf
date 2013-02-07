/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.util;

import net.opengis.citygml.texturedsurface.AbstractAppearanceType;
import net.opengis.citygml.texturedsurface.AppearancePropertyType;
import net.opengis.citygml.texturedsurface.DocumentRoot;
import net.opengis.citygml.texturedsurface.MaterialType;
import net.opengis.citygml.texturedsurface.SimpleTextureType;
import net.opengis.citygml.texturedsurface.TexturedSurfaceType;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AbstractGeometricPrimitiveType;
import net.opengis.gml.AbstractGeometryType;
import net.opengis.gml.AbstractSurfaceType;
import net.opengis.gml.OrientableSurfaceType;

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
 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage
 * @generated
 */
public class TexturedsurfaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TexturedsurfacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturedsurfaceSwitch() {
		if (modelPackage == null) {
			modelPackage = TexturedsurfacePackage.eINSTANCE;
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
			case TexturedsurfacePackage.ABSTRACT_APPEARANCE_TYPE: {
				AbstractAppearanceType abstractAppearanceType = (AbstractAppearanceType)theEObject;
				T result = caseAbstractAppearanceType(abstractAppearanceType);
				if (result == null) result = caseAbstractGMLType(abstractAppearanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TexturedsurfacePackage.APPEARANCE_PROPERTY_TYPE: {
				AppearancePropertyType appearancePropertyType = (AppearancePropertyType)theEObject;
				T result = caseAppearancePropertyType(appearancePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TexturedsurfacePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TexturedsurfacePackage.MATERIAL_TYPE: {
				MaterialType materialType = (MaterialType)theEObject;
				T result = caseMaterialType(materialType);
				if (result == null) result = caseAbstractAppearanceType(materialType);
				if (result == null) result = caseAbstractGMLType(materialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE: {
				SimpleTextureType simpleTextureType = (SimpleTextureType)theEObject;
				T result = caseSimpleTextureType(simpleTextureType);
				if (result == null) result = caseAbstractAppearanceType(simpleTextureType);
				if (result == null) result = caseAbstractGMLType(simpleTextureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE: {
				TexturedSurfaceType texturedSurfaceType = (TexturedSurfaceType)theEObject;
				T result = caseTexturedSurfaceType(texturedSurfaceType);
				if (result == null) result = caseOrientableSurfaceType(texturedSurfaceType);
				if (result == null) result = caseAbstractSurfaceType(texturedSurfaceType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(texturedSurfaceType);
				if (result == null) result = caseAbstractGeometryType(texturedSurfaceType);
				if (result == null) result = caseAbstractGMLType(texturedSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Appearance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Appearance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAppearanceType(AbstractAppearanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appearance Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appearance Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppearancePropertyType(AppearancePropertyType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialType(MaterialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Texture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Texture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTextureType(SimpleTextureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textured Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textured Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexturedSurfaceType(TexturedSurfaceType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometryType(AbstractGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometric Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometric Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceType(AbstractSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientable Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientable Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientableSurfaceType(OrientableSurfaceType object) {
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

} //TexturedsurfaceSwitch
