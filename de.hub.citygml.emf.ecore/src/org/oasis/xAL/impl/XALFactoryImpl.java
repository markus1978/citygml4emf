/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.oasis.xAL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XALFactoryImpl extends EFactoryImpl implements XALFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XALFactory init() {
		try {
			XALFactory theXALFactory = (XALFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:ciq:xsdschema:xAL:2.0"); 
			if (theXALFactory != null) {
				return theXALFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XALFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XALFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XALPackage.ADDRESS_DETAILS: return createAddressDetails();
			case XALPackage.ADDRESS_IDENTIFIER_TYPE: return createAddressIdentifierType();
			case XALPackage.ADDRESS_LATITUDE_DIRECTION_TYPE: return createAddressLatitudeDirectionType();
			case XALPackage.ADDRESS_LATITUDE_TYPE: return createAddressLatitudeType();
			case XALPackage.ADDRESS_LINES_TYPE: return createAddressLinesType();
			case XALPackage.ADDRESS_LINE_TYPE: return createAddressLineType();
			case XALPackage.ADDRESS_LONGITUDE_DIRECTION_TYPE: return createAddressLongitudeDirectionType();
			case XALPackage.ADDRESS_LONGITUDE_TYPE: return createAddressLongitudeType();
			case XALPackage.ADDRESS_TYPE: return createAddressType();
			case XALPackage.ADMINISTRATIVE_AREA_NAME_TYPE: return createAdministrativeAreaNameType();
			case XALPackage.ADMINISTRATIVE_AREA_TYPE: return createAdministrativeAreaType();
			case XALPackage.BARCODE_TYPE: return createBarcodeType();
			case XALPackage.BUILDING_NAME_TYPE: return createBuildingNameType();
			case XALPackage.COUNTRY_NAME_CODE_TYPE: return createCountryNameCodeType();
			case XALPackage.COUNTRY_NAME_TYPE: return createCountryNameType();
			case XALPackage.COUNTRY_TYPE: return createCountryType();
			case XALPackage.DEPARTMENT_NAME_TYPE: return createDepartmentNameType();
			case XALPackage.DEPARTMENT_TYPE: return createDepartmentType();
			case XALPackage.DEPENDENT_LOCALITY_NAME_TYPE: return createDependentLocalityNameType();
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE: return createDependentLocalityNumberType();
			case XALPackage.DEPENDENT_LOCALITY_TYPE: return createDependentLocalityType();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE: return createDependentThoroughfareType();
			case XALPackage.ENDORSEMENT_LINE_CODE_TYPE: return createEndorsementLineCodeType();
			case XALPackage.FIRM_NAME_TYPE: return createFirmNameType();
			case XALPackage.FIRM_TYPE: return createFirmType();
			case XALPackage.KEY_LINE_CODE_TYPE: return createKeyLineCodeType();
			case XALPackage.LARGE_MAIL_USER_IDENTIFIER_TYPE: return createLargeMailUserIdentifierType();
			case XALPackage.LARGE_MAIL_USER_NAME_TYPE: return createLargeMailUserNameType();
			case XALPackage.LARGE_MAIL_USER_TYPE: return createLargeMailUserType();
			case XALPackage.LOCALITY_NAME_TYPE: return createLocalityNameType();
			case XALPackage.LOCALITY_TYPE: return createLocalityType();
			case XALPackage.MAIL_STOP_NAME_TYPE: return createMailStopNameType();
			case XALPackage.MAIL_STOP_NUMBER_TYPE: return createMailStopNumberType();
			case XALPackage.MAIL_STOP_TYPE: return createMailStopType();
			case XALPackage.POSTAL_CODE_NUMBER_EXTENSION_TYPE: return createPostalCodeNumberExtensionType();
			case XALPackage.POSTAL_CODE_NUMBER_TYPE: return createPostalCodeNumberType();
			case XALPackage.POSTAL_CODE_TYPE: return createPostalCodeType();
			case XALPackage.POSTAL_ROUTE_NAME_TYPE: return createPostalRouteNameType();
			case XALPackage.POSTAL_ROUTE_NUMBER_TYPE: return createPostalRouteNumberType();
			case XALPackage.POSTAL_ROUTE_TYPE: return createPostalRouteType();
			case XALPackage.POSTAL_SERVICE_ELEMENTS_TYPE: return createPostalServiceElementsType();
			case XALPackage.POST_BOX_NUMBER_EXTENSION_TYPE: return createPostBoxNumberExtensionType();
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE: return createPostBoxNumberPrefixType();
			case XALPackage.POST_BOX_NUMBER_SUFFIX_TYPE: return createPostBoxNumberSuffixType();
			case XALPackage.POST_BOX_NUMBER_TYPE: return createPostBoxNumberType();
			case XALPackage.POST_BOX_TYPE: return createPostBoxType();
			case XALPackage.POST_OFFICE_NAME_TYPE: return createPostOfficeNameType();
			case XALPackage.POST_OFFICE_NUMBER_TYPE: return createPostOfficeNumberType();
			case XALPackage.POST_OFFICE_TYPE: return createPostOfficeType();
			case XALPackage.POST_TOWN_NAME_TYPE: return createPostTownNameType();
			case XALPackage.POST_TOWN_SUFFIX_TYPE: return createPostTownSuffixType();
			case XALPackage.POST_TOWN_TYPE: return createPostTownType();
			case XALPackage.PREMISE_LOCATION_TYPE: return createPremiseLocationType();
			case XALPackage.PREMISE_NAME_TYPE: return createPremiseNameType();
			case XALPackage.PREMISE_NUMBER_PREFIX_TYPE: return createPremiseNumberPrefixType();
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE: return createPremiseNumberRangeFromType();
			case XALPackage.PREMISE_NUMBER_RANGE_TO_TYPE: return createPremiseNumberRangeToType();
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE: return createPremiseNumberRangeType();
			case XALPackage.PREMISE_NUMBER_SUFFIX_TYPE: return createPremiseNumberSuffixType();
			case XALPackage.PREMISE_NUMBER_TYPE: return createPremiseNumberType();
			case XALPackage.PREMISE_TYPE: return createPremiseType();
			case XALPackage.SORTING_CODE_TYPE: return createSortingCodeType();
			case XALPackage.SUB_ADMINISTRATIVE_AREA_NAME_TYPE: return createSubAdministrativeAreaNameType();
			case XALPackage.SUB_ADMINISTRATIVE_AREA_TYPE: return createSubAdministrativeAreaType();
			case XALPackage.SUB_PREMISE_LOCATION_TYPE: return createSubPremiseLocationType();
			case XALPackage.SUB_PREMISE_NAME_TYPE: return createSubPremiseNameType();
			case XALPackage.SUB_PREMISE_NUMBER_PREFIX_TYPE: return createSubPremiseNumberPrefixType();
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE: return createSubPremiseNumberSuffixType();
			case XALPackage.SUB_PREMISE_NUMBER_TYPE: return createSubPremiseNumberType();
			case XALPackage.SUB_PREMISE_TYPE: return createSubPremiseType();
			case XALPackage.SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE: return createSupplementaryPostalServiceDataType();
			case XALPackage.THOROUGHFARE_LEADING_TYPE_TYPE: return createThoroughfareLeadingTypeType();
			case XALPackage.THOROUGHFARE_NAME_TYPE: return createThoroughfareNameType();
			case XALPackage.THOROUGHFARE_NUMBER_FROM_TYPE: return createThoroughfareNumberFromType();
			case XALPackage.THOROUGHFARE_NUMBER_PREFIX_TYPE: return createThoroughfareNumberPrefixType();
			case XALPackage.THOROUGHFARE_NUMBER_RANGE_TYPE: return createThoroughfareNumberRangeType();
			case XALPackage.THOROUGHFARE_NUMBER_SUFFIX_TYPE: return createThoroughfareNumberSuffixType();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE: return createThoroughfareNumberToType();
			case XALPackage.THOROUGHFARE_NUMBER_TYPE: return createThoroughfareNumberType();
			case XALPackage.THOROUGHFARE_POST_DIRECTION_TYPE: return createThoroughfarePostDirectionType();
			case XALPackage.THOROUGHFARE_PRE_DIRECTION_TYPE: return createThoroughfarePreDirectionType();
			case XALPackage.THOROUGHFARE_TRAILING_TYPE_TYPE: return createThoroughfareTrailingTypeType();
			case XALPackage.THOROUGHFARE_TYPE: return createThoroughfareType();
			case XALPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XALPackage.XAL_TYPE: return createXALType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XALPackage.DEPENDENT_THOROUGHFARES_TYPE:
				return createDependentThoroughfaresTypeFromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURENCE_TYPE:
				return createIndicatorOccurenceTypeFromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE:
				return createIndicatorOccurrenceTypeFromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE1:
				return createIndicatorOccurrenceType1FromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE2:
				return createIndicatorOccurrenceType2FromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE3:
				return createIndicatorOccurrenceType3FromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE4:
				return createIndicatorOccurrenceType4FromString(eDataType, initialValue);
			case XALPackage.NAME_NUMBER_OCCURRENCE_TYPE:
				return createNameNumberOccurrenceTypeFromString(eDataType, initialValue);
			case XALPackage.NUMBER_OCCURRENCE_TYPE:
				return createNumberOccurrenceTypeFromString(eDataType, initialValue);
			case XALPackage.NUMBER_RANGE_OCCURENCE_TYPE:
				return createNumberRangeOccurenceTypeFromString(eDataType, initialValue);
			case XALPackage.NUMBER_RANGE_OCCURRENCE_TYPE:
				return createNumberRangeOccurrenceTypeFromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE:
				return createNumberTypeOccurrenceTypeFromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE1:
				return createNumberTypeOccurrenceType1FromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_TYPE:
				return createNumberTypeTypeFromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_TYPE1:
				return createNumberTypeType1FromString(eDataType, initialValue);
			case XALPackage.RANGE_TYPE_TYPE:
				return createRangeTypeTypeFromString(eDataType, initialValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE:
				return createTypeOccurrenceTypeFromString(eDataType, initialValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE1:
				return createTypeOccurrenceType1FromString(eDataType, initialValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE2:
				return createTypeOccurrenceType2FromString(eDataType, initialValue);
			case XALPackage.DEPENDENT_THOROUGHFARES_TYPE_OBJECT:
				return createDependentThoroughfaresTypeObjectFromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURENCE_TYPE_OBJECT:
				return createIndicatorOccurenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT:
				return createIndicatorOccurrenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT1:
				return createIndicatorOccurrenceTypeObject1FromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT2:
				return createIndicatorOccurrenceTypeObject2FromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT3:
				return createIndicatorOccurrenceTypeObject3FromString(eDataType, initialValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT4:
				return createIndicatorOccurrenceTypeObject4FromString(eDataType, initialValue);
			case XALPackage.NAME_NUMBER_OCCURRENCE_TYPE_OBJECT:
				return createNameNumberOccurrenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.NUMBER_OCCURRENCE_TYPE_OBJECT:
				return createNumberOccurrenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.NUMBER_RANGE_OCCURENCE_TYPE_OBJECT:
				return createNumberRangeOccurenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.NUMBER_RANGE_OCCURRENCE_TYPE_OBJECT:
				return createNumberRangeOccurrenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT:
				return createNumberTypeOccurrenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT1:
				return createNumberTypeOccurrenceTypeObject1FromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_TYPE_OBJECT:
				return createNumberTypeTypeObjectFromString(eDataType, initialValue);
			case XALPackage.NUMBER_TYPE_TYPE_OBJECT1:
				return createNumberTypeTypeObject1FromString(eDataType, initialValue);
			case XALPackage.RANGE_TYPE_TYPE_OBJECT:
				return createRangeTypeTypeObjectFromString(eDataType, initialValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE_OBJECT:
				return createTypeOccurrenceTypeObjectFromString(eDataType, initialValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE_OBJECT1:
				return createTypeOccurrenceTypeObject1FromString(eDataType, initialValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE_OBJECT2:
				return createTypeOccurrenceTypeObject2FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XALPackage.DEPENDENT_THOROUGHFARES_TYPE:
				return convertDependentThoroughfaresTypeToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURENCE_TYPE:
				return convertIndicatorOccurenceTypeToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE:
				return convertIndicatorOccurrenceTypeToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE1:
				return convertIndicatorOccurrenceType1ToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE2:
				return convertIndicatorOccurrenceType2ToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE3:
				return convertIndicatorOccurrenceType3ToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE4:
				return convertIndicatorOccurrenceType4ToString(eDataType, instanceValue);
			case XALPackage.NAME_NUMBER_OCCURRENCE_TYPE:
				return convertNameNumberOccurrenceTypeToString(eDataType, instanceValue);
			case XALPackage.NUMBER_OCCURRENCE_TYPE:
				return convertNumberOccurrenceTypeToString(eDataType, instanceValue);
			case XALPackage.NUMBER_RANGE_OCCURENCE_TYPE:
				return convertNumberRangeOccurenceTypeToString(eDataType, instanceValue);
			case XALPackage.NUMBER_RANGE_OCCURRENCE_TYPE:
				return convertNumberRangeOccurrenceTypeToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE:
				return convertNumberTypeOccurrenceTypeToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE1:
				return convertNumberTypeOccurrenceType1ToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_TYPE:
				return convertNumberTypeTypeToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_TYPE1:
				return convertNumberTypeType1ToString(eDataType, instanceValue);
			case XALPackage.RANGE_TYPE_TYPE:
				return convertRangeTypeTypeToString(eDataType, instanceValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE:
				return convertTypeOccurrenceTypeToString(eDataType, instanceValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE1:
				return convertTypeOccurrenceType1ToString(eDataType, instanceValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE2:
				return convertTypeOccurrenceType2ToString(eDataType, instanceValue);
			case XALPackage.DEPENDENT_THOROUGHFARES_TYPE_OBJECT:
				return convertDependentThoroughfaresTypeObjectToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURENCE_TYPE_OBJECT:
				return convertIndicatorOccurenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT:
				return convertIndicatorOccurrenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT1:
				return convertIndicatorOccurrenceTypeObject1ToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT2:
				return convertIndicatorOccurrenceTypeObject2ToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT3:
				return convertIndicatorOccurrenceTypeObject3ToString(eDataType, instanceValue);
			case XALPackage.INDICATOR_OCCURRENCE_TYPE_OBJECT4:
				return convertIndicatorOccurrenceTypeObject4ToString(eDataType, instanceValue);
			case XALPackage.NAME_NUMBER_OCCURRENCE_TYPE_OBJECT:
				return convertNameNumberOccurrenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.NUMBER_OCCURRENCE_TYPE_OBJECT:
				return convertNumberOccurrenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.NUMBER_RANGE_OCCURENCE_TYPE_OBJECT:
				return convertNumberRangeOccurenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.NUMBER_RANGE_OCCURRENCE_TYPE_OBJECT:
				return convertNumberRangeOccurrenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT:
				return convertNumberTypeOccurrenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT1:
				return convertNumberTypeOccurrenceTypeObject1ToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_TYPE_OBJECT:
				return convertNumberTypeTypeObjectToString(eDataType, instanceValue);
			case XALPackage.NUMBER_TYPE_TYPE_OBJECT1:
				return convertNumberTypeTypeObject1ToString(eDataType, instanceValue);
			case XALPackage.RANGE_TYPE_TYPE_OBJECT:
				return convertRangeTypeTypeObjectToString(eDataType, instanceValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE_OBJECT:
				return convertTypeOccurrenceTypeObjectToString(eDataType, instanceValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE_OBJECT1:
				return convertTypeOccurrenceTypeObject1ToString(eDataType, instanceValue);
			case XALPackage.TYPE_OCCURRENCE_TYPE_OBJECT2:
				return convertTypeOccurrenceTypeObject2ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressDetails createAddressDetails() {
		AddressDetailsImpl addressDetails = new AddressDetailsImpl();
		return addressDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressIdentifierType createAddressIdentifierType() {
		AddressIdentifierTypeImpl addressIdentifierType = new AddressIdentifierTypeImpl();
		return addressIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLatitudeDirectionType createAddressLatitudeDirectionType() {
		AddressLatitudeDirectionTypeImpl addressLatitudeDirectionType = new AddressLatitudeDirectionTypeImpl();
		return addressLatitudeDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLatitudeType createAddressLatitudeType() {
		AddressLatitudeTypeImpl addressLatitudeType = new AddressLatitudeTypeImpl();
		return addressLatitudeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLinesType createAddressLinesType() {
		AddressLinesTypeImpl addressLinesType = new AddressLinesTypeImpl();
		return addressLinesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLineType createAddressLineType() {
		AddressLineTypeImpl addressLineType = new AddressLineTypeImpl();
		return addressLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLongitudeDirectionType createAddressLongitudeDirectionType() {
		AddressLongitudeDirectionTypeImpl addressLongitudeDirectionType = new AddressLongitudeDirectionTypeImpl();
		return addressLongitudeDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLongitudeType createAddressLongitudeType() {
		AddressLongitudeTypeImpl addressLongitudeType = new AddressLongitudeTypeImpl();
		return addressLongitudeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeAreaNameType createAdministrativeAreaNameType() {
		AdministrativeAreaNameTypeImpl administrativeAreaNameType = new AdministrativeAreaNameTypeImpl();
		return administrativeAreaNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeAreaType createAdministrativeAreaType() {
		AdministrativeAreaTypeImpl administrativeAreaType = new AdministrativeAreaTypeImpl();
		return administrativeAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarcodeType createBarcodeType() {
		BarcodeTypeImpl barcodeType = new BarcodeTypeImpl();
		return barcodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingNameType createBuildingNameType() {
		BuildingNameTypeImpl buildingNameType = new BuildingNameTypeImpl();
		return buildingNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryNameCodeType createCountryNameCodeType() {
		CountryNameCodeTypeImpl countryNameCodeType = new CountryNameCodeTypeImpl();
		return countryNameCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryNameType createCountryNameType() {
		CountryNameTypeImpl countryNameType = new CountryNameTypeImpl();
		return countryNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountryType createCountryType() {
		CountryTypeImpl countryType = new CountryTypeImpl();
		return countryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepartmentNameType createDepartmentNameType() {
		DepartmentNameTypeImpl departmentNameType = new DepartmentNameTypeImpl();
		return departmentNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepartmentType createDepartmentType() {
		DepartmentTypeImpl departmentType = new DepartmentTypeImpl();
		return departmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentLocalityNameType createDependentLocalityNameType() {
		DependentLocalityNameTypeImpl dependentLocalityNameType = new DependentLocalityNameTypeImpl();
		return dependentLocalityNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentLocalityNumberType createDependentLocalityNumberType() {
		DependentLocalityNumberTypeImpl dependentLocalityNumberType = new DependentLocalityNumberTypeImpl();
		return dependentLocalityNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentLocalityType createDependentLocalityType() {
		DependentLocalityTypeImpl dependentLocalityType = new DependentLocalityTypeImpl();
		return dependentLocalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentThoroughfareType createDependentThoroughfareType() {
		DependentThoroughfareTypeImpl dependentThoroughfareType = new DependentThoroughfareTypeImpl();
		return dependentThoroughfareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndorsementLineCodeType createEndorsementLineCodeType() {
		EndorsementLineCodeTypeImpl endorsementLineCodeType = new EndorsementLineCodeTypeImpl();
		return endorsementLineCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmNameType createFirmNameType() {
		FirmNameTypeImpl firmNameType = new FirmNameTypeImpl();
		return firmNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmType createFirmType() {
		FirmTypeImpl firmType = new FirmTypeImpl();
		return firmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyLineCodeType createKeyLineCodeType() {
		KeyLineCodeTypeImpl keyLineCodeType = new KeyLineCodeTypeImpl();
		return keyLineCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeMailUserIdentifierType createLargeMailUserIdentifierType() {
		LargeMailUserIdentifierTypeImpl largeMailUserIdentifierType = new LargeMailUserIdentifierTypeImpl();
		return largeMailUserIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeMailUserNameType createLargeMailUserNameType() {
		LargeMailUserNameTypeImpl largeMailUserNameType = new LargeMailUserNameTypeImpl();
		return largeMailUserNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeMailUserType createLargeMailUserType() {
		LargeMailUserTypeImpl largeMailUserType = new LargeMailUserTypeImpl();
		return largeMailUserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityNameType createLocalityNameType() {
		LocalityNameTypeImpl localityNameType = new LocalityNameTypeImpl();
		return localityNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityType createLocalityType() {
		LocalityTypeImpl localityType = new LocalityTypeImpl();
		return localityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailStopNameType createMailStopNameType() {
		MailStopNameTypeImpl mailStopNameType = new MailStopNameTypeImpl();
		return mailStopNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailStopNumberType createMailStopNumberType() {
		MailStopNumberTypeImpl mailStopNumberType = new MailStopNumberTypeImpl();
		return mailStopNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailStopType createMailStopType() {
		MailStopTypeImpl mailStopType = new MailStopTypeImpl();
		return mailStopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalCodeNumberExtensionType createPostalCodeNumberExtensionType() {
		PostalCodeNumberExtensionTypeImpl postalCodeNumberExtensionType = new PostalCodeNumberExtensionTypeImpl();
		return postalCodeNumberExtensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalCodeNumberType createPostalCodeNumberType() {
		PostalCodeNumberTypeImpl postalCodeNumberType = new PostalCodeNumberTypeImpl();
		return postalCodeNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalCodeType createPostalCodeType() {
		PostalCodeTypeImpl postalCodeType = new PostalCodeTypeImpl();
		return postalCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalRouteNameType createPostalRouteNameType() {
		PostalRouteNameTypeImpl postalRouteNameType = new PostalRouteNameTypeImpl();
		return postalRouteNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalRouteNumberType createPostalRouteNumberType() {
		PostalRouteNumberTypeImpl postalRouteNumberType = new PostalRouteNumberTypeImpl();
		return postalRouteNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalRouteType createPostalRouteType() {
		PostalRouteTypeImpl postalRouteType = new PostalRouteTypeImpl();
		return postalRouteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalServiceElementsType createPostalServiceElementsType() {
		PostalServiceElementsTypeImpl postalServiceElementsType = new PostalServiceElementsTypeImpl();
		return postalServiceElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberExtensionType createPostBoxNumberExtensionType() {
		PostBoxNumberExtensionTypeImpl postBoxNumberExtensionType = new PostBoxNumberExtensionTypeImpl();
		return postBoxNumberExtensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberPrefixType createPostBoxNumberPrefixType() {
		PostBoxNumberPrefixTypeImpl postBoxNumberPrefixType = new PostBoxNumberPrefixTypeImpl();
		return postBoxNumberPrefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberSuffixType createPostBoxNumberSuffixType() {
		PostBoxNumberSuffixTypeImpl postBoxNumberSuffixType = new PostBoxNumberSuffixTypeImpl();
		return postBoxNumberSuffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxNumberType createPostBoxNumberType() {
		PostBoxNumberTypeImpl postBoxNumberType = new PostBoxNumberTypeImpl();
		return postBoxNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostBoxType createPostBoxType() {
		PostBoxTypeImpl postBoxType = new PostBoxTypeImpl();
		return postBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostOfficeNameType createPostOfficeNameType() {
		PostOfficeNameTypeImpl postOfficeNameType = new PostOfficeNameTypeImpl();
		return postOfficeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostOfficeNumberType createPostOfficeNumberType() {
		PostOfficeNumberTypeImpl postOfficeNumberType = new PostOfficeNumberTypeImpl();
		return postOfficeNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostOfficeType createPostOfficeType() {
		PostOfficeTypeImpl postOfficeType = new PostOfficeTypeImpl();
		return postOfficeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTownNameType createPostTownNameType() {
		PostTownNameTypeImpl postTownNameType = new PostTownNameTypeImpl();
		return postTownNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTownSuffixType createPostTownSuffixType() {
		PostTownSuffixTypeImpl postTownSuffixType = new PostTownSuffixTypeImpl();
		return postTownSuffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTownType createPostTownType() {
		PostTownTypeImpl postTownType = new PostTownTypeImpl();
		return postTownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseLocationType createPremiseLocationType() {
		PremiseLocationTypeImpl premiseLocationType = new PremiseLocationTypeImpl();
		return premiseLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNameType createPremiseNameType() {
		PremiseNameTypeImpl premiseNameType = new PremiseNameTypeImpl();
		return premiseNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberPrefixType createPremiseNumberPrefixType() {
		PremiseNumberPrefixTypeImpl premiseNumberPrefixType = new PremiseNumberPrefixTypeImpl();
		return premiseNumberPrefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberRangeFromType createPremiseNumberRangeFromType() {
		PremiseNumberRangeFromTypeImpl premiseNumberRangeFromType = new PremiseNumberRangeFromTypeImpl();
		return premiseNumberRangeFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberRangeToType createPremiseNumberRangeToType() {
		PremiseNumberRangeToTypeImpl premiseNumberRangeToType = new PremiseNumberRangeToTypeImpl();
		return premiseNumberRangeToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberRangeType createPremiseNumberRangeType() {
		PremiseNumberRangeTypeImpl premiseNumberRangeType = new PremiseNumberRangeTypeImpl();
		return premiseNumberRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberSuffixType createPremiseNumberSuffixType() {
		PremiseNumberSuffixTypeImpl premiseNumberSuffixType = new PremiseNumberSuffixTypeImpl();
		return premiseNumberSuffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseNumberType createPremiseNumberType() {
		PremiseNumberTypeImpl premiseNumberType = new PremiseNumberTypeImpl();
		return premiseNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiseType createPremiseType() {
		PremiseTypeImpl premiseType = new PremiseTypeImpl();
		return premiseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingCodeType createSortingCodeType() {
		SortingCodeTypeImpl sortingCodeType = new SortingCodeTypeImpl();
		return sortingCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAdministrativeAreaNameType createSubAdministrativeAreaNameType() {
		SubAdministrativeAreaNameTypeImpl subAdministrativeAreaNameType = new SubAdministrativeAreaNameTypeImpl();
		return subAdministrativeAreaNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubAdministrativeAreaType createSubAdministrativeAreaType() {
		SubAdministrativeAreaTypeImpl subAdministrativeAreaType = new SubAdministrativeAreaTypeImpl();
		return subAdministrativeAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseLocationType createSubPremiseLocationType() {
		SubPremiseLocationTypeImpl subPremiseLocationType = new SubPremiseLocationTypeImpl();
		return subPremiseLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseNameType createSubPremiseNameType() {
		SubPremiseNameTypeImpl subPremiseNameType = new SubPremiseNameTypeImpl();
		return subPremiseNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseNumberPrefixType createSubPremiseNumberPrefixType() {
		SubPremiseNumberPrefixTypeImpl subPremiseNumberPrefixType = new SubPremiseNumberPrefixTypeImpl();
		return subPremiseNumberPrefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseNumberSuffixType createSubPremiseNumberSuffixType() {
		SubPremiseNumberSuffixTypeImpl subPremiseNumberSuffixType = new SubPremiseNumberSuffixTypeImpl();
		return subPremiseNumberSuffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseNumberType createSubPremiseNumberType() {
		SubPremiseNumberTypeImpl subPremiseNumberType = new SubPremiseNumberTypeImpl();
		return subPremiseNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPremiseType createSubPremiseType() {
		SubPremiseTypeImpl subPremiseType = new SubPremiseTypeImpl();
		return subPremiseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplementaryPostalServiceDataType createSupplementaryPostalServiceDataType() {
		SupplementaryPostalServiceDataTypeImpl supplementaryPostalServiceDataType = new SupplementaryPostalServiceDataTypeImpl();
		return supplementaryPostalServiceDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareLeadingTypeType createThoroughfareLeadingTypeType() {
		ThoroughfareLeadingTypeTypeImpl thoroughfareLeadingTypeType = new ThoroughfareLeadingTypeTypeImpl();
		return thoroughfareLeadingTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNameType createThoroughfareNameType() {
		ThoroughfareNameTypeImpl thoroughfareNameType = new ThoroughfareNameTypeImpl();
		return thoroughfareNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberFromType createThoroughfareNumberFromType() {
		ThoroughfareNumberFromTypeImpl thoroughfareNumberFromType = new ThoroughfareNumberFromTypeImpl();
		return thoroughfareNumberFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberPrefixType createThoroughfareNumberPrefixType() {
		ThoroughfareNumberPrefixTypeImpl thoroughfareNumberPrefixType = new ThoroughfareNumberPrefixTypeImpl();
		return thoroughfareNumberPrefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberRangeType createThoroughfareNumberRangeType() {
		ThoroughfareNumberRangeTypeImpl thoroughfareNumberRangeType = new ThoroughfareNumberRangeTypeImpl();
		return thoroughfareNumberRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberSuffixType createThoroughfareNumberSuffixType() {
		ThoroughfareNumberSuffixTypeImpl thoroughfareNumberSuffixType = new ThoroughfareNumberSuffixTypeImpl();
		return thoroughfareNumberSuffixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberToType createThoroughfareNumberToType() {
		ThoroughfareNumberToTypeImpl thoroughfareNumberToType = new ThoroughfareNumberToTypeImpl();
		return thoroughfareNumberToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareNumberType createThoroughfareNumberType() {
		ThoroughfareNumberTypeImpl thoroughfareNumberType = new ThoroughfareNumberTypeImpl();
		return thoroughfareNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfarePostDirectionType createThoroughfarePostDirectionType() {
		ThoroughfarePostDirectionTypeImpl thoroughfarePostDirectionType = new ThoroughfarePostDirectionTypeImpl();
		return thoroughfarePostDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfarePreDirectionType createThoroughfarePreDirectionType() {
		ThoroughfarePreDirectionTypeImpl thoroughfarePreDirectionType = new ThoroughfarePreDirectionTypeImpl();
		return thoroughfarePreDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareTrailingTypeType createThoroughfareTrailingTypeType() {
		ThoroughfareTrailingTypeTypeImpl thoroughfareTrailingTypeType = new ThoroughfareTrailingTypeTypeImpl();
		return thoroughfareTrailingTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareType createThoroughfareType() {
		ThoroughfareTypeImpl thoroughfareType = new ThoroughfareTypeImpl();
		return thoroughfareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XALType createXALType() {
		XALTypeImpl xalType = new XALTypeImpl();
		return xalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentThoroughfaresType createDependentThoroughfaresTypeFromString(EDataType eDataType, String initialValue) {
		DependentThoroughfaresType result = DependentThoroughfaresType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependentThoroughfaresTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurenceType createIndicatorOccurenceTypeFromString(EDataType eDataType, String initialValue) {
		IndicatorOccurenceType result = IndicatorOccurenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType createIndicatorOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		IndicatorOccurrenceType result = IndicatorOccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType1 createIndicatorOccurrenceType1FromString(EDataType eDataType, String initialValue) {
		IndicatorOccurrenceType1 result = IndicatorOccurrenceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType2 createIndicatorOccurrenceType2FromString(EDataType eDataType, String initialValue) {
		IndicatorOccurrenceType2 result = IndicatorOccurrenceType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType3 createIndicatorOccurrenceType3FromString(EDataType eDataType, String initialValue) {
		IndicatorOccurrenceType3 result = IndicatorOccurrenceType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType4 createIndicatorOccurrenceType4FromString(EDataType eDataType, String initialValue) {
		IndicatorOccurrenceType4 result = IndicatorOccurrenceType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameNumberOccurrenceType createNameNumberOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		NameNumberOccurrenceType result = NameNumberOccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameNumberOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOccurrenceType createNumberOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		NumberOccurrenceType result = NumberOccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRangeOccurenceType createNumberRangeOccurenceTypeFromString(EDataType eDataType, String initialValue) {
		NumberRangeOccurenceType result = NumberRangeOccurenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberRangeOccurenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRangeOccurrenceType createNumberRangeOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		NumberRangeOccurrenceType result = NumberRangeOccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberRangeOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeOccurrenceType createNumberTypeOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		NumberTypeOccurrenceType result = NumberTypeOccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeOccurrenceType1 createNumberTypeOccurrenceType1FromString(EDataType eDataType, String initialValue) {
		NumberTypeOccurrenceType1 result = NumberTypeOccurrenceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeOccurrenceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeType createNumberTypeTypeFromString(EDataType eDataType, String initialValue) {
		NumberTypeType result = NumberTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeType1 createNumberTypeType1FromString(EDataType eDataType, String initialValue) {
		NumberTypeType1 result = NumberTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType createRangeTypeTypeFromString(EDataType eDataType, String initialValue) {
		RangeTypeType result = RangeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOccurrenceType createTypeOccurrenceTypeFromString(EDataType eDataType, String initialValue) {
		TypeOccurrenceType result = TypeOccurrenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOccurrenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOccurrenceType1 createTypeOccurrenceType1FromString(EDataType eDataType, String initialValue) {
		TypeOccurrenceType1 result = TypeOccurrenceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOccurrenceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOccurrenceType2 createTypeOccurrenceType2FromString(EDataType eDataType, String initialValue) {
		TypeOccurrenceType2 result = TypeOccurrenceType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOccurrenceType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentThoroughfaresType createDependentThoroughfaresTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDependentThoroughfaresTypeFromString(XALPackage.eINSTANCE.getDependentThoroughfaresType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependentThoroughfaresTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDependentThoroughfaresTypeToString(XALPackage.eINSTANCE.getDependentThoroughfaresType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurenceType createIndicatorOccurenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIndicatorOccurenceTypeFromString(XALPackage.eINSTANCE.getIndicatorOccurenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndicatorOccurenceTypeToString(XALPackage.eINSTANCE.getIndicatorOccurenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType1 createIndicatorOccurrenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIndicatorOccurrenceType1FromString(XALPackage.eINSTANCE.getIndicatorOccurrenceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIndicatorOccurrenceType1ToString(XALPackage.eINSTANCE.getIndicatorOccurrenceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType2 createIndicatorOccurrenceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createIndicatorOccurrenceType2FromString(XALPackage.eINSTANCE.getIndicatorOccurrenceType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertIndicatorOccurrenceType2ToString(XALPackage.eINSTANCE.getIndicatorOccurrenceType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType createIndicatorOccurrenceTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createIndicatorOccurrenceTypeFromString(XALPackage.eINSTANCE.getIndicatorOccurrenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertIndicatorOccurrenceTypeToString(XALPackage.eINSTANCE.getIndicatorOccurrenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType3 createIndicatorOccurrenceTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createIndicatorOccurrenceType3FromString(XALPackage.eINSTANCE.getIndicatorOccurrenceType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertIndicatorOccurrenceType3ToString(XALPackage.eINSTANCE.getIndicatorOccurrenceType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicatorOccurrenceType4 createIndicatorOccurrenceTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createIndicatorOccurrenceType4FromString(XALPackage.eINSTANCE.getIndicatorOccurrenceType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicatorOccurrenceTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertIndicatorOccurrenceType4ToString(XALPackage.eINSTANCE.getIndicatorOccurrenceType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameNumberOccurrenceType createNameNumberOccurrenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNameNumberOccurrenceTypeFromString(XALPackage.eINSTANCE.getNameNumberOccurrenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameNumberOccurrenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNameNumberOccurrenceTypeToString(XALPackage.eINSTANCE.getNameNumberOccurrenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOccurrenceType createNumberOccurrenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumberOccurrenceTypeFromString(XALPackage.eINSTANCE.getNumberOccurrenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberOccurrenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumberOccurrenceTypeToString(XALPackage.eINSTANCE.getNumberOccurrenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRangeOccurenceType createNumberRangeOccurenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumberRangeOccurenceTypeFromString(XALPackage.eINSTANCE.getNumberRangeOccurenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberRangeOccurenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumberRangeOccurenceTypeToString(XALPackage.eINSTANCE.getNumberRangeOccurenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberRangeOccurrenceType createNumberRangeOccurrenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumberRangeOccurrenceTypeFromString(XALPackage.eINSTANCE.getNumberRangeOccurrenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberRangeOccurrenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumberRangeOccurrenceTypeToString(XALPackage.eINSTANCE.getNumberRangeOccurrenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeOccurrenceType createNumberTypeOccurrenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumberTypeOccurrenceTypeFromString(XALPackage.eINSTANCE.getNumberTypeOccurrenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeOccurrenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumberTypeOccurrenceTypeToString(XALPackage.eINSTANCE.getNumberTypeOccurrenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeOccurrenceType1 createNumberTypeOccurrenceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createNumberTypeOccurrenceType1FromString(XALPackage.eINSTANCE.getNumberTypeOccurrenceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeOccurrenceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertNumberTypeOccurrenceType1ToString(XALPackage.eINSTANCE.getNumberTypeOccurrenceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeType createNumberTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNumberTypeTypeFromString(XALPackage.eINSTANCE.getNumberTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNumberTypeTypeToString(XALPackage.eINSTANCE.getNumberTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeType1 createNumberTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createNumberTypeType1FromString(XALPackage.eINSTANCE.getNumberTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertNumberTypeType1ToString(XALPackage.eINSTANCE.getNumberTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType createRangeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeTypeTypeFromString(XALPackage.eINSTANCE.getRangeTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeTypeTypeToString(XALPackage.eINSTANCE.getRangeTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOccurrenceType createTypeOccurrenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeOccurrenceTypeFromString(XALPackage.eINSTANCE.getTypeOccurrenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOccurrenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeOccurrenceTypeToString(XALPackage.eINSTANCE.getTypeOccurrenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOccurrenceType1 createTypeOccurrenceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeOccurrenceType1FromString(XALPackage.eINSTANCE.getTypeOccurrenceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOccurrenceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeOccurrenceType1ToString(XALPackage.eINSTANCE.getTypeOccurrenceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOccurrenceType2 createTypeOccurrenceTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createTypeOccurrenceType2FromString(XALPackage.eINSTANCE.getTypeOccurrenceType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOccurrenceTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeOccurrenceType2ToString(XALPackage.eINSTANCE.getTypeOccurrenceType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XALPackage getXALPackage() {
		return (XALPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XALPackage getPackage() {
		return XALPackage.eINSTANCE;
	}

} //XALFactoryImpl
