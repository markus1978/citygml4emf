/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.util;

import java.util.List;
import java.util.Map;

import net.opengis.citygml.texturedsurface.AbstractAppearanceType;
import net.opengis.citygml.texturedsurface.AppearancePropertyType;
import net.opengis.citygml.texturedsurface.DocumentRoot;
import net.opengis.citygml.texturedsurface.MaterialType;
import net.opengis.citygml.texturedsurface.SimpleTextureType;
import net.opengis.citygml.texturedsurface.TextureTypeType;
import net.opengis.citygml.texturedsurface.TexturedSurfaceType;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;
import net.opengis.citygml.util.CitygmlValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage
 * @generated
 */
public class TexturedsurfaceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TexturedsurfaceValidator INSTANCE = new TexturedsurfaceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.citygml.texturedsurface";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitygmlValidator citygmlValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturedsurfaceValidator() {
		super();
		citygmlValidator = CitygmlValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TexturedsurfacePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TexturedsurfacePackage.ABSTRACT_APPEARANCE_TYPE:
				return validateAbstractAppearanceType((AbstractAppearanceType)value, diagnostics, context);
			case TexturedsurfacePackage.APPEARANCE_PROPERTY_TYPE:
				return validateAppearancePropertyType((AppearancePropertyType)value, diagnostics, context);
			case TexturedsurfacePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TexturedsurfacePackage.MATERIAL_TYPE:
				return validateMaterialType((MaterialType)value, diagnostics, context);
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE:
				return validateSimpleTextureType((SimpleTextureType)value, diagnostics, context);
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE:
				return validateTexturedSurfaceType((TexturedSurfaceType)value, diagnostics, context);
			case TexturedsurfacePackage.TEXTURE_TYPE_TYPE:
				return validateTextureTypeType((TextureTypeType)value, diagnostics, context);
			case TexturedsurfacePackage.COLOR:
				return validateColor((List<?>)value, diagnostics, context);
			case TexturedsurfacePackage.TEXTURE_TYPE_TYPE_OBJECT:
				return validateTextureTypeTypeObject((TextureTypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractAppearanceType(AbstractAppearanceType abstractAppearanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractAppearanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppearancePropertyType(AppearancePropertyType appearancePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appearancePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialType(MaterialType materialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleTextureType(SimpleTextureType simpleTextureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleTextureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexturedSurfaceType(TexturedSurfaceType texturedSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texturedSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureTypeType(TextureTypeType textureTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(List<?> color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = citygmlValidator.validateDoubleBetween0and1List_ItemType(color, diagnostics, context);
		if (result || diagnostics != null) result &= validateColor_MinLength(color, diagnostics, context);
		if (result || diagnostics != null) result &= validateColor_MaxLength(color, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_MinLength(List<?> color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = color.size();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(TexturedsurfacePackage.Literals.COLOR, color, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_MaxLength(List<?> color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = color.size();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TexturedsurfacePackage.Literals.COLOR, color, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureTypeTypeObject(TextureTypeType textureTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TexturedsurfaceValidator
