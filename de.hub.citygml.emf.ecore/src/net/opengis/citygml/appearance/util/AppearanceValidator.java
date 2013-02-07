/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.util;

import java.util.List;
import java.util.Map;

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
import net.opengis.citygml.appearance.TextureTypeType;
import net.opengis.citygml.appearance.WorldToTextureType;
import net.opengis.citygml.appearance.WrapModeType;
import net.opengis.citygml.appearance.X3DMaterialType;
import net.opengis.citygml.util.CitygmlValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.appearance.AppearancePackage
 * @generated
 */
public class AppearanceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AppearanceValidator INSTANCE = new AppearanceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.citygml.appearance";

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
	public AppearanceValidator() {
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
	  return AppearancePackage.eINSTANCE;
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
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE:
				return validateAbstractSurfaceDataType((AbstractSurfaceDataType)value, diagnostics, context);
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE:
				return validateAbstractTextureParameterizationType((AbstractTextureParameterizationType)value, diagnostics, context);
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE:
				return validateAbstractTextureType((AbstractTextureType)value, diagnostics, context);
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE:
				return validateAppearancePropertyType((AppearancePropertyType)value, diagnostics, context);
			case AppearancePackage.APPEARANCE_TYPE:
				return validateAppearanceType((AppearanceType)value, diagnostics, context);
			case AppearancePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE:
				return validateGeoreferencedTextureType((GeoreferencedTextureType)value, diagnostics, context);
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE:
				return validateParameterizedTextureType((ParameterizedTextureType)value, diagnostics, context);
			case AppearancePackage.SURFACE_DATA_PROPERTY_TYPE:
				return validateSurfaceDataPropertyType((SurfaceDataPropertyType)value, diagnostics, context);
			case AppearancePackage.TEX_COORD_GEN_TYPE:
				return validateTexCoordGenType((TexCoordGenType)value, diagnostics, context);
			case AppearancePackage.TEX_COORD_LIST_TYPE:
				return validateTexCoordListType((TexCoordListType)value, diagnostics, context);
			case AppearancePackage.TEXTURE_ASSOCIATION_TYPE:
				return validateTextureAssociationType((TextureAssociationType)value, diagnostics, context);
			case AppearancePackage.TEXTURE_COORDINATES_TYPE:
				return validateTextureCoordinatesType((TextureCoordinatesType)value, diagnostics, context);
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE:
				return validateWorldToTextureType((WorldToTextureType)value, diagnostics, context);
			case AppearancePackage.X3D_MATERIAL_TYPE:
				return validateX3DMaterialType((X3DMaterialType)value, diagnostics, context);
			case AppearancePackage.TEXTURE_TYPE_TYPE:
				return validateTextureTypeType((TextureTypeType)value, diagnostics, context);
			case AppearancePackage.WRAP_MODE_TYPE:
				return validateWrapModeType((WrapModeType)value, diagnostics, context);
			case AppearancePackage.COLOR:
				return validateColor((List)value, diagnostics, context);
			case AppearancePackage.COLOR_PLUS_OPACITY:
				return validateColorPlusOpacity((List<?>)value, diagnostics, context);
			case AppearancePackage.TEXTURE_TYPE_TYPE_OBJECT:
				return validateTextureTypeTypeObject((TextureTypeType)value, diagnostics, context);
			case AppearancePackage.WRAP_MODE_TYPE_OBJECT:
				return validateWrapModeTypeObject((WrapModeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSurfaceDataType(AbstractSurfaceDataType abstractSurfaceDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSurfaceDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTextureParameterizationType(AbstractTextureParameterizationType abstractTextureParameterizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTextureParameterizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTextureType(AbstractTextureType abstractTextureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTextureType, diagnostics, context);
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
	public boolean validateAppearanceType(AppearanceType appearanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appearanceType, diagnostics, context);
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
	public boolean validateGeoreferencedTextureType(GeoreferencedTextureType georeferencedTextureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(georeferencedTextureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterizedTextureType(ParameterizedTextureType parameterizedTextureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterizedTextureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceDataPropertyType(SurfaceDataPropertyType surfaceDataPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfaceDataPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexCoordGenType(TexCoordGenType texCoordGenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texCoordGenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexCoordListType(TexCoordListType texCoordListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texCoordListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureAssociationType(TextureAssociationType textureAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textureAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureCoordinatesType(TextureCoordinatesType textureCoordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textureCoordinatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorldToTextureType(WorldToTextureType worldToTextureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(worldToTextureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX3DMaterialType(X3DMaterialType x3DMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(x3DMaterialType, diagnostics, context);
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
	public boolean validateWrapModeType(WrapModeType wrapModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(List color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColor_MinLength(color, diagnostics, context);
		if (result || diagnostics != null) result &= validateColor_MaxLength(color, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_MinLength(List color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = color.size();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(AppearancePackage.Literals.COLOR, color, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_MaxLength(List color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = color.size();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(AppearancePackage.Literals.COLOR, color, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorPlusOpacity(List<?> colorPlusOpacity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = citygmlValidator.validateDoubleBetween0and1List_ItemType(colorPlusOpacity, diagnostics, context);
		if (result || diagnostics != null) result &= validateColorPlusOpacity_MinLength(colorPlusOpacity, diagnostics, context);
		if (result || diagnostics != null) result &= validateColorPlusOpacity_MaxLength(colorPlusOpacity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Color Plus Opacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorPlusOpacity_MinLength(List<?> colorPlusOpacity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = colorPlusOpacity.size();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(AppearancePackage.Literals.COLOR_PLUS_OPACITY, colorPlusOpacity, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Color Plus Opacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorPlusOpacity_MaxLength(List<?> colorPlusOpacity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = colorPlusOpacity.size();
		boolean result = length <= 4;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(AppearancePackage.Literals.COLOR_PLUS_OPACITY, colorPlusOpacity, length, 4, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrapModeTypeObject(WrapModeType wrapModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //AppearanceValidator
