/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.util;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.AbstractSiteType;
import net.opengis.citygml.AddressPropertyType;
import net.opengis.citygml.AddressType;
import net.opengis.citygml.CityModelType;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.DocumentRoot;
import net.opengis.citygml.ExternalObjectReferenceType;
import net.opengis.citygml.ExternalReferenceType;
import net.opengis.citygml.GeneralizationRelationType;
import net.opengis.citygml.ImplicitGeometryType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.XalAddressPropertyType;
import net.opengis.gml.util.GmlValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.CitygmlPackage
 * @generated
 */
public class CitygmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CitygmlValidator INSTANCE = new CitygmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.citygml";

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
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlValidator gmlValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitygmlValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
		gmlValidator = GmlValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CitygmlPackage.eINSTANCE;
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
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE:
				return validateAbstractCityObjectType((AbstractCityObjectType)value, diagnostics, context);
			case CitygmlPackage.ABSTRACT_SITE_TYPE:
				return validateAbstractSiteType((AbstractSiteType)value, diagnostics, context);
			case CitygmlPackage.ADDRESS_PROPERTY_TYPE:
				return validateAddressPropertyType((AddressPropertyType)value, diagnostics, context);
			case CitygmlPackage.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case CitygmlPackage.CITY_MODEL_TYPE:
				return validateCityModelType((CityModelType)value, diagnostics, context);
			case CitygmlPackage.EXTERNAL_OBJECT_REFERENCE_TYPE:
				return validateExternalObjectReferenceType((ExternalObjectReferenceType)value, diagnostics, context);
			case CitygmlPackage.EXTERNAL_REFERENCE_TYPE:
				return validateExternalReferenceType((ExternalReferenceType)value, diagnostics, context);
			case CitygmlPackage.GENERALIZATION_RELATION_TYPE:
				return validateGeneralizationRelationType((GeneralizationRelationType)value, diagnostics, context);
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE:
				return validateImplicitGeometryType((ImplicitGeometryType)value, diagnostics, context);
			case CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE:
				return validateImplicitRepresentationPropertyType((ImplicitRepresentationPropertyType)value, diagnostics, context);
			case CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE:
				return validateXalAddressPropertyType((XalAddressPropertyType)value, diagnostics, context);
			case CitygmlPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case CitygmlPackage.DOUBLE_BETWEEN0AND1:
				return validateDoubleBetween0and1((Double)value, diagnostics, context);
			case CitygmlPackage.DOUBLE_BETWEEN0AND1_LIST:
				return validateDoubleBetween0and1List((List<?>)value, diagnostics, context);
			case CitygmlPackage.DOUBLE_BETWEEN0AND1_OBJECT:
				return validateDoubleBetween0and1Object((Double)value, diagnostics, context);
			case CitygmlPackage.INTEGER_BETWEEN0AND4:
				return validateIntegerBetween0and4((BigInteger)value, diagnostics, context);
			case CitygmlPackage.MIME_TYPE_TYPE:
				return validateMimeTypeType((String)value, diagnostics, context);
			case CitygmlPackage.TRANSFORMATION_MATRIX2X2_TYPE:
				return validateTransformationMatrix2x2Type((List<?>)value, diagnostics, context);
			case CitygmlPackage.TRANSFORMATION_MATRIX3X4_TYPE:
				return validateTransformationMatrix3x4Type((List<?>)value, diagnostics, context);
			case CitygmlPackage.TRANSFORMATION_MATRIX4X4_TYPE:
				return validateTransformationMatrix4x4Type((List<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCityObjectType(AbstractCityObjectType abstractCityObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCityObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSiteType(AbstractSiteType abstractSiteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSiteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressPropertyType(AddressPropertyType addressPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCityModelType(CityModelType cityModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cityModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalObjectReferenceType(ExternalObjectReferenceType externalObjectReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalObjectReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType(ExternalReferenceType externalReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationRelationType(GeneralizationRelationType generalizationRelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizationRelationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplicitGeometryType(ImplicitGeometryType implicitGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implicitGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplicitRepresentationPropertyType(ImplicitRepresentationPropertyType implicitRepresentationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implicitRepresentationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXalAddressPropertyType(XalAddressPropertyType xalAddressPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xalAddressPropertyType, diagnostics, context);
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
	public boolean validateDoubleBetween0and1(double doubleBetween0and1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleBetween0and1_Min(doubleBetween0and1, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoubleBetween0and1_Max(doubleBetween0and1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDoubleBetween0and1_Min
	 */
	public static final double DOUBLE_BETWEEN0AND1__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Double Between0and1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleBetween0and1_Min(double doubleBetween0and1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = doubleBetween0and1 >= DOUBLE_BETWEEN0AND1__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1, doubleBetween0and1, DOUBLE_BETWEEN0AND1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDoubleBetween0and1_Max
	 */
	public static final double DOUBLE_BETWEEN0AND1__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Double Between0and1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleBetween0and1_Max(double doubleBetween0and1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = doubleBetween0and1 <= DOUBLE_BETWEEN0AND1__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1, doubleBetween0and1, DOUBLE_BETWEEN0AND1__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleBetween0and1List(List<?> doubleBetween0and1List, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleBetween0and1List_ItemType(doubleBetween0and1List, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Double Between0and1 List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleBetween0and1List_ItemType(List<?> doubleBetween0and1List, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = doubleBetween0and1List.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1.isInstance(item)) {
				result &= validateDoubleBetween0and1((Double)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleBetween0and1Object(Double doubleBetween0and1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleBetween0and1_Min(doubleBetween0and1Object, diagnostics, context);
		if (result || diagnostics != null) result &= validateDoubleBetween0and1_Max(doubleBetween0and1Object, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerBetween0and4(BigInteger integerBetween0and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerBetween0and4_Min(integerBetween0and4, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntegerBetween0and4_Max(integerBetween0and4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIntegerBetween0and4_Min
	 */
	public static final BigInteger INTEGER_BETWEEN0AND4__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Integer Between0and4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerBetween0and4_Min(BigInteger integerBetween0and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = integerBetween0and4.compareTo(INTEGER_BETWEEN0AND4__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(CitygmlPackage.Literals.INTEGER_BETWEEN0AND4, integerBetween0and4, INTEGER_BETWEEN0AND4__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIntegerBetween0and4_Max
	 */
	public static final BigInteger INTEGER_BETWEEN0AND4__MAX__VALUE = new BigInteger("4");

	/**
	 * Validates the Max constraint of '<em>Integer Between0and4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerBetween0and4_Max(BigInteger integerBetween0and4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = integerBetween0and4.compareTo(INTEGER_BETWEEN0AND4__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(CitygmlPackage.Literals.INTEGER_BETWEEN0AND4, integerBetween0and4, INTEGER_BETWEEN0AND4__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeTypeType(String mimeTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix2x2Type(List<?> transformationMatrix2x2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gmlValidator.validateDoubleList_ItemType(transformationMatrix2x2Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformationMatrix2x2Type_MinLength(transformationMatrix2x2Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformationMatrix2x2Type_MaxLength(transformationMatrix2x2Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Transformation Matrix2x2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix2x2Type_MinLength(List<?> transformationMatrix2x2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = transformationMatrix2x2Type.size();
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(CitygmlPackage.Literals.TRANSFORMATION_MATRIX2X2_TYPE, transformationMatrix2x2Type, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Transformation Matrix2x2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix2x2Type_MaxLength(List<?> transformationMatrix2x2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = transformationMatrix2x2Type.size();
		boolean result = length <= 4;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(CitygmlPackage.Literals.TRANSFORMATION_MATRIX2X2_TYPE, transformationMatrix2x2Type, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix3x4Type(List<?> transformationMatrix3x4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gmlValidator.validateDoubleList_ItemType(transformationMatrix3x4Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformationMatrix3x4Type_MinLength(transformationMatrix3x4Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformationMatrix3x4Type_MaxLength(transformationMatrix3x4Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Transformation Matrix3x4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix3x4Type_MinLength(List<?> transformationMatrix3x4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = transformationMatrix3x4Type.size();
		boolean result = length >= 12;
		if (!result && diagnostics != null)
			reportMinLengthViolation(CitygmlPackage.Literals.TRANSFORMATION_MATRIX3X4_TYPE, transformationMatrix3x4Type, length, 12, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Transformation Matrix3x4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix3x4Type_MaxLength(List<?> transformationMatrix3x4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = transformationMatrix3x4Type.size();
		boolean result = length <= 12;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(CitygmlPackage.Literals.TRANSFORMATION_MATRIX3X4_TYPE, transformationMatrix3x4Type, length, 12, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix4x4Type(List<?> transformationMatrix4x4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gmlValidator.validateDoubleList_ItemType(transformationMatrix4x4Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformationMatrix4x4Type_MinLength(transformationMatrix4x4Type, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformationMatrix4x4Type_MaxLength(transformationMatrix4x4Type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Transformation Matrix4x4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix4x4Type_MinLength(List<?> transformationMatrix4x4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = transformationMatrix4x4Type.size();
		boolean result = length >= 16;
		if (!result && diagnostics != null)
			reportMinLengthViolation(CitygmlPackage.Literals.TRANSFORMATION_MATRIX4X4_TYPE, transformationMatrix4x4Type, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Transformation Matrix4x4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationMatrix4x4Type_MaxLength(List<?> transformationMatrix4x4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = transformationMatrix4x4Type.size();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(CitygmlPackage.Literals.TRANSFORMATION_MATRIX4X4_TYPE, transformationMatrix4x4Type, length, 16, diagnostics, context);
		return result;
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

} //CitygmlValidator
