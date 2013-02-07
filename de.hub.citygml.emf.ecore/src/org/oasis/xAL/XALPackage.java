/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * xAL: eXtensible Address Language 
 * This is an XML document type definition (DTD) for
 * defining addresses.
 * Original Date of Creation: 1 March 2001
 * Copyright(c) 2000, OASIS. All Rights Reserved [http://www.oasis-open.org]
 * Contact: Customer Information Quality Technical Committee, OASIS
 * http://www.oasis-open.org/committees/ciq
 * VERSION: 2.0 [MAJOR RELEASE] Date of Creation: 01 May 2002
 * Last Update: 24 July 2002
 * Previous Version: 1.3
 * Common Attributes:Type - If not documented then it means, possible values of Type not limited to: Official, Unique, Abbreviation, OldName, Synonym
 * Code:Address element codes are used by groups like postal groups like ECCMA, ADIS, UN/PROLIST for postal services
 * <!-- end-model-doc -->
 * @see org.oasis.xAL.XALFactory
 * @model kind="package"
 * @generated
 */
public interface XALPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xAL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xAL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XALPackage eINSTANCE = org.oasis.xAL.impl.XALPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressDetailsImpl <em>Address Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressDetailsImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressDetails()
	 * @generated
	 */
	int ADDRESS_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Postal Service Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__POSTAL_SERVICE_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Address Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_LINES = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADMINISTRATIVE_AREA = 4;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__LOCALITY = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ANY = 7;

	/**
	 * The feature id for the '<em><b>Address Details Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_DETAILS_KEY = 8;

	/**
	 * The feature id for the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ADDRESS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__CODE = 10;

	/**
	 * The feature id for the '<em><b>Current Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__CURRENT_STATUS = 11;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__USAGE = 12;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__VALID_FROM_DATE = 13;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__VALID_TO_DATE = 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS__ANY_ATTRIBUTE = 15;

	/**
	 * The number of structural features of the '<em>Address Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_DETAILS_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressIdentifierTypeImpl <em>Address Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressIdentifierTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressIdentifierType()
	 * @generated
	 */
	int ADDRESS_IDENTIFIER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Identifier Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__IDENTIFIER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Address Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_IDENTIFIER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressLatitudeDirectionTypeImpl <em>Address Latitude Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressLatitudeDirectionTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressLatitudeDirectionType()
	 * @generated
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Latitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressLatitudeTypeImpl <em>Address Latitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressLatitudeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressLatitudeType()
	 * @generated
	 */
	int ADDRESS_LATITUDE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Latitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LATITUDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressLinesTypeImpl <em>Address Lines Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressLinesTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressLinesType()
	 * @generated
	 */
	int ADDRESS_LINES_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Address Lines Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressLineTypeImpl <em>Address Line Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressLineTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressLineType()
	 * @generated
	 */
	int ADDRESS_LINE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Line Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LINE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressLongitudeDirectionTypeImpl <em>Address Longitude Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressLongitudeDirectionTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressLongitudeDirectionType()
	 * @generated
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Longitude Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressLongitudeTypeImpl <em>Address Longitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressLongitudeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressLongitudeType()
	 * @generated
	 */
	int ADDRESS_LONGITUDE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Longitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LONGITUDE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AddressTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AdministrativeAreaNameTypeImpl <em>Administrative Area Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AdministrativeAreaNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAdministrativeAreaNameType()
	 * @generated
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.AdministrativeAreaTypeImpl <em>Administrative Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.AdministrativeAreaTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getAdministrativeAreaType()
	 * @generated
	 */
	int ADMINISTRATIVE_AREA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Administrative Area Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ADMINISTRATIVE_AREA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA = 2;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__LOCALITY = 3;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__POST_OFFICE = 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_AREA_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.BarcodeTypeImpl <em>Barcode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.BarcodeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getBarcodeType()
	 * @generated
	 */
	int BARCODE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Barcode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.BuildingNameTypeImpl <em>Building Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.BuildingNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getBuildingNameType()
	 * @generated
	 */
	int BUILDING_NAME_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Building Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.CountryNameCodeTypeImpl <em>Country Name Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.CountryNameCodeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getCountryNameCodeType()
	 * @generated
	 */
	int COUNTRY_NAME_CODE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__SCHEME = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Country Name Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.CountryNameTypeImpl <em>Country Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.CountryNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getCountryNameType()
	 * @generated
	 */
	int COUNTRY_NAME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Country Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.CountryTypeImpl <em>Country Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.CountryTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getCountryType()
	 * @generated
	 */
	int COUNTRY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Country Name Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__COUNTRY_NAME_CODE = 1;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__COUNTRY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ADMINISTRATIVE_AREA = 3;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__LOCALITY = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__THOROUGHFARE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Country Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.DepartmentNameTypeImpl <em>Department Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.DepartmentNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDepartmentNameType()
	 * @generated
	 */
	int DEPARTMENT_NAME_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Department Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.DepartmentTypeImpl <em>Department Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.DepartmentTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDepartmentType()
	 * @generated
	 */
	int DEPARTMENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Department Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__DEPARTMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__MAIL_STOP = 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__POSTAL_CODE = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Department Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.DependentLocalityNameTypeImpl <em>Dependent Locality Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.DependentLocalityNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDependentLocalityNameType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Dependent Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.DependentLocalityNumberTypeImpl <em>Dependent Locality Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.DependentLocalityNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDependentLocalityNumberType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Number Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Dependent Locality Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.DependentLocalityTypeImpl <em>Dependent Locality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.DependentLocalityTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDependentLocalityType()
	 * @generated
	 */
	int DEPENDENT_LOCALITY_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Dependent Locality Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Dependent Locality Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POST_BOX = 3;

	/**
	 * The feature id for the '<em><b>Large Mail User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER = 4;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POST_OFFICE = 5;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE = 6;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__THOROUGHFARE = 7;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__PREMISE = 8;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY = 9;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__POSTAL_CODE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__INDICATOR = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__TYPE = 14;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__USAGE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE = 16;

	/**
	 * The number of structural features of the '<em>Dependent Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_LOCALITY_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl <em>Dependent Thoroughfare Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.DependentThoroughfareTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDependentThoroughfareType()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE = 8;

	/**
	 * The number of structural features of the '<em>Dependent Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_THOROUGHFARE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.EndorsementLineCodeTypeImpl <em>Endorsement Line Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.EndorsementLineCodeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getEndorsementLineCodeType()
	 * @generated
	 */
	int ENDORSEMENT_LINE_CODE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Endorsement Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDORSEMENT_LINE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.FirmNameTypeImpl <em>Firm Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.FirmNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getFirmNameType()
	 * @generated
	 */
	int FIRM_NAME_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Firm Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.FirmTypeImpl <em>Firm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.FirmTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getFirmType()
	 * @generated
	 */
	int FIRM_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Firm Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__FIRM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__MAIL_STOP = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Firm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRM_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.KeyLineCodeTypeImpl <em>Key Line Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.KeyLineCodeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getKeyLineCodeType()
	 * @generated
	 */
	int KEY_LINE_CODE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Key Line Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LINE_CODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.LargeMailUserIdentifierTypeImpl <em>Large Mail User Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.LargeMailUserIdentifierTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getLargeMailUserIdentifierType()
	 * @generated
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Large Mail User Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_IDENTIFIER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.LargeMailUserNameTypeImpl <em>Large Mail User Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.LargeMailUserNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getLargeMailUserNameType()
	 * @generated
	 */
	int LARGE_MAIL_USER_NAME_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Large Mail User Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.LargeMailUserTypeImpl <em>Large Mail User Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.LargeMailUserTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getLargeMailUserType()
	 * @generated
	 */
	int LARGE_MAIL_USER_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Large Mail User Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Large Mail User Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__LARGE_MAIL_USER_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__BUILDING_NAME = 3;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__POST_BOX = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__POSTAL_CODE = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ANY = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Large Mail User Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_MAIL_USER_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.LocalityNameTypeImpl <em>Locality Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.LocalityNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getLocalityNameType()
	 * @generated
	 */
	int LOCALITY_NAME_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Locality Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.LocalityTypeImpl <em>Locality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.LocalityTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getLocalityType()
	 * @generated
	 */
	int LOCALITY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Locality Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__LOCALITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POST_BOX = 2;

	/**
	 * The feature id for the '<em><b>Large Mail User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__LARGE_MAIL_USER = 3;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POST_OFFICE = 4;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POSTAL_ROUTE = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__THOROUGHFARE = 6;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__PREMISE = 7;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__DEPENDENT_LOCALITY = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ANY = 10;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__INDICATOR = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__USAGE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE__ANY_ATTRIBUTE = 14;

	/**
	 * The number of structural features of the '<em>Locality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALITY_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.MailStopNameTypeImpl <em>Mail Stop Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.MailStopNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getMailStopNameType()
	 * @generated
	 */
	int MAIL_STOP_NAME_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mail Stop Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.MailStopNumberTypeImpl <em>Mail Stop Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.MailStopNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getMailStopNumberType()
	 * @generated
	 */
	int MAIL_STOP_NUMBER_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name Number Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__NAME_NUMBER_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Mail Stop Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.MailStopTypeImpl <em>Mail Stop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.MailStopTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getMailStopType()
	 * @generated
	 */
	int MAIL_STOP_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Mail Stop Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__MAIL_STOP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mail Stop Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__MAIL_STOP_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Mail Stop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_STOP_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostalCodeNumberExtensionTypeImpl <em>Postal Code Number Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostalCodeNumberExtensionTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostalCodeNumberExtensionType()
	 * @generated
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Extension Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Postal Code Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_EXTENSION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostalCodeNumberTypeImpl <em>Postal Code Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostalCodeNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostalCodeNumberType()
	 * @generated
	 */
	int POSTAL_CODE_NUMBER_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Postal Code Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_NUMBER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostalCodeTypeImpl <em>Postal Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostalCodeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostalCodeType()
	 * @generated
	 */
	int POSTAL_CODE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Postal Code Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POSTAL_CODE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Postal Code Number Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POSTAL_CODE_NUMBER_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Post Town</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__POST_TOWN = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Postal Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_CODE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostalRouteNameTypeImpl <em>Postal Route Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostalRouteNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostalRouteNameType()
	 * @generated
	 */
	int POSTAL_ROUTE_NAME_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Postal Route Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostalRouteNumberTypeImpl <em>Postal Route Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostalRouteNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostalRouteNumberType()
	 * @generated
	 */
	int POSTAL_ROUTE_NUMBER_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Postal Route Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostalRouteTypeImpl <em>Postal Route Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostalRouteTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostalRouteType()
	 * @generated
	 */
	int POSTAL_ROUTE_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Postal Route Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Postal Route Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POSTAL_ROUTE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__POST_BOX = 3;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ANY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Postal Route Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ROUTE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostalServiceElementsTypeImpl <em>Postal Service Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostalServiceElementsTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostalServiceElementsType()
	 * @generated
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Address Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Endorsement Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ENDORSEMENT_LINE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Key Line Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__KEY_LINE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Barcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__BARCODE = 3;

	/**
	 * The feature id for the '<em><b>Sorting Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__SORTING_CODE = 4;

	/**
	 * The feature id for the '<em><b>Address Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE = 5;

	/**
	 * The feature id for the '<em><b>Address Latitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LATITUDE_DIRECTION = 6;

	/**
	 * The feature id for the '<em><b>Address Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE = 7;

	/**
	 * The feature id for the '<em><b>Address Longitude Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ADDRESS_LONGITUDE_DIRECTION = 8;

	/**
	 * The feature id for the '<em><b>Supplementary Postal Service Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__SUPPLEMENTARY_POSTAL_SERVICE_DATA = 9;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ANY = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__TYPE = 11;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE__ANY_ATTRIBUTE = 12;

	/**
	 * The number of structural features of the '<em>Postal Service Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_SERVICE_ELEMENTS_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostBoxNumberExtensionTypeImpl <em>Post Box Number Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostBoxNumberExtensionTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostBoxNumberExtensionType()
	 * @generated
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Number Extension Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__NUMBER_EXTENSION_SEPARATOR = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Box Number Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_EXTENSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostBoxNumberPrefixTypeImpl <em>Post Box Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostBoxNumberPrefixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostBoxNumberPrefixType()
	 * @generated
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Box Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostBoxNumberSuffixTypeImpl <em>Post Box Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostBoxNumberSuffixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostBoxNumberSuffixType()
	 * @generated
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Box Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostBoxNumberTypeImpl <em>Post Box Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostBoxNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostBoxNumberType()
	 * @generated
	 */
	int POST_BOX_NUMBER_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Box Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostBoxTypeImpl <em>Post Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostBoxTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostBoxType()
	 * @generated
	 */
	int POST_BOX_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Box Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Post Box Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Post Box Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_SUFFIX = 3;

	/**
	 * The feature id for the '<em><b>Post Box Number Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POST_BOX_NUMBER_EXTENSION = 4;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__FIRM = 5;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__POSTAL_CODE = 6;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ANY = 7;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__INDICATOR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Post Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_BOX_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostOfficeNameTypeImpl <em>Post Office Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostOfficeNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostOfficeNameType()
	 * @generated
	 */
	int POST_OFFICE_NAME_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Office Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostOfficeNumberTypeImpl <em>Post Office Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostOfficeNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostOfficeNumberType()
	 * @generated
	 */
	int POST_OFFICE_NUMBER_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Post Office Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_NUMBER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostOfficeTypeImpl <em>Post Office Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostOfficeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostOfficeType()
	 * @generated
	 */
	int POST_OFFICE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Office Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_OFFICE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Office Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_OFFICE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Postal Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POSTAL_ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POST_BOX = 4;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__POSTAL_CODE = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ANY = 6;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Post Office Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OFFICE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostTownNameTypeImpl <em>Post Town Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostTownNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostTownNameType()
	 * @generated
	 */
	int POST_TOWN_NAME_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Post Town Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostTownSuffixTypeImpl <em>Post Town Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostTownSuffixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostTownSuffixType()
	 * @generated
	 */
	int POST_TOWN_SUFFIX_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Post Town Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_SUFFIX_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PostTownTypeImpl <em>Post Town Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PostTownTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPostTownType()
	 * @generated
	 */
	int POST_TOWN_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Post Town Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__POST_TOWN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Post Town Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__POST_TOWN_SUFFIX = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Post Town Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TOWN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseLocationTypeImpl <em>Premise Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseLocationTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseLocationType()
	 * @generated
	 */
	int PREMISE_LOCATION_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_LOCATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseNameTypeImpl <em>Premise Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseNameType()
	 * @generated
	 */
	int PREMISE_NAME_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseNumberPrefixTypeImpl <em>Premise Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseNumberPrefixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseNumberPrefixType()
	 * @generated
	 */
	int PREMISE_NUMBER_PREFIX_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseNumberRangeFromTypeImpl <em>Premise Number Range From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseNumberRangeFromTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseNumberRangeFromType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX = 3;

	/**
	 * The number of structural features of the '<em>Premise Number Range From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_FROM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseNumberRangeToTypeImpl <em>Premise Number Range To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseNumberRangeToTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseNumberRangeToType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER_PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE__PREMISE_NUMBER_SUFFIX = 3;

	/**
	 * The number of structural features of the '<em>Premise Number Range To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseNumberRangeTypeImpl <em>Premise Number Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseNumberRangeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseNumberRangeType()
	 * @generated
	 */
	int PREMISE_NUMBER_RANGE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Premise Number Range From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM = 0;

	/**
	 * The feature id for the '<em><b>Premise Number Range To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Range Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE = 4;

	/**
	 * The feature id for the '<em><b>Range Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__SEPARATOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Premise Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_RANGE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseNumberSuffixTypeImpl <em>Premise Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseNumberSuffixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseNumberSuffixType()
	 * @generated
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseNumberTypeImpl <em>Premise Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseNumberType()
	 * @generated
	 */
	int PREMISE_NUMBER_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__NUMBER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.PremiseTypeImpl <em>Premise Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.PremiseTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getPremiseType()
	 * @generated
	 */
	int PREMISE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Premise Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Premise Number Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_RANGE = 4;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_PREFIX = 5;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_NUMBER_SUFFIX = 6;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__BUILDING_NAME = 7;

	/**
	 * The feature id for the '<em><b>Sub Premise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__SUB_PREMISE = 8;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__FIRM = 9;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__MAIL_STOP = 10;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__POSTAL_CODE = 11;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ANY = 13;

	/**
	 * The feature id for the '<em><b>Premise Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_DEPENDENCY = 14;

	/**
	 * The feature id for the '<em><b>Premise Dependency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_DEPENDENCY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Premise Thoroughfare Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__PREMISE_THOROUGHFARE_CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__TYPE = 17;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE__ANY_ATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_TYPE_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SortingCodeTypeImpl <em>Sorting Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SortingCodeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSortingCodeType()
	 * @generated
	 */
	int SORTING_CODE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Sorting Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTING_CODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubAdministrativeAreaNameTypeImpl <em>Sub Administrative Area Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubAdministrativeAreaNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubAdministrativeAreaNameType()
	 * @generated
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Sub Administrative Area Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubAdministrativeAreaTypeImpl <em>Sub Administrative Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubAdministrativeAreaTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubAdministrativeAreaType()
	 * @generated
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Sub Administrative Area Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__SUB_ADMINISTRATIVE_AREA_NAME = 1;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__LOCALITY = 2;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__POST_OFFICE = 3;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__POSTAL_CODE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ANY = 5;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__INDICATOR = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__USAGE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE__ANY_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Sub Administrative Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ADMINISTRATIVE_AREA_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubPremiseLocationTypeImpl <em>Sub Premise Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubPremiseLocationTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubPremiseLocationType()
	 * @generated
	 */
	int SUB_PREMISE_LOCATION_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Sub Premise Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_LOCATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubPremiseNameTypeImpl <em>Sub Premise Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubPremiseNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubPremiseNameType()
	 * @generated
	 */
	int SUB_PREMISE_NAME_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__TYPE_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NAME_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubPremiseNumberPrefixTypeImpl <em>Sub Premise Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubPremiseNumberPrefixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubPremiseNumberPrefixType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubPremiseNumberSuffixTypeImpl <em>Sub Premise Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubPremiseNumberSuffixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubPremiseNumberSuffixType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubPremiseNumberTypeImpl <em>Sub Premise Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubPremiseNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubPremiseNumberType()
	 * @generated
	 */
	int SUB_PREMISE_NUMBER_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__NUMBER_TYPE_OCCURRENCE = 4;

	/**
	 * The feature id for the '<em><b>Premise Number Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__PREMISE_NUMBER_SEPARATOR = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Sub Premise Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SubPremiseTypeImpl <em>Sub Premise Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SubPremiseTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSubPremiseType()
	 * @generated
	 */
	int SUB_PREMISE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Sub Premise Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Premise Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Sub Premise Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Sub Premise Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Sub Premise Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE_NUMBER_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Building Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__BUILDING_NAME = 6;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__FIRM = 7;

	/**
	 * The feature id for the '<em><b>Mail Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__MAIL_STOP = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Sub Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__SUB_PREMISE = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ANY = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__TYPE = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>Sub Premise Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PREMISE_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.SupplementaryPostalServiceDataTypeImpl <em>Supplementary Postal Service Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.SupplementaryPostalServiceDataTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Supplementary Postal Service Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLEMENTARY_POSTAL_SERVICE_DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareLeadingTypeTypeImpl <em>Thoroughfare Leading Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareLeadingTypeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareLeadingTypeType()
	 * @generated
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Leading Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_LEADING_TYPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareNameTypeImpl <em>Thoroughfare Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareNameTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareNameType()
	 * @generated
	 */
	int THOROUGHFARE_NAME_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NAME_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareNumberFromTypeImpl <em>Thoroughfare Number From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareNumberFromTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareNumberFromType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__ADDRESS_LINE = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_FROM_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareNumberPrefixTypeImpl <em>Thoroughfare Number Prefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareNumberPrefixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareNumberPrefixType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Prefix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Prefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_PREFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl <em>Thoroughfare Number Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareNumberRangeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareNumberRangeType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_FROM = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__THOROUGHFARE_NUMBER_TO = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__CODE = 3;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR = 4;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__INDICATOR_OCCURRENCE = 5;

	/**
	 * The feature id for the '<em><b>Number Range Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURRENCE = 6;

	/**
	 * The feature id for the '<em><b>Range Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__RANGE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__SEPARATOR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE__ANY_ATTRIBUTE = 10;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_RANGE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareNumberSuffixTypeImpl <em>Thoroughfare Number Suffix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareNumberSuffixTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareNumberSuffixType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Number Suffix Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Suffix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_SUFFIX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl <em>Thoroughfare Number To Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareNumberToType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__CODE = 5;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number To Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TO_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareNumberTypeImpl <em>Thoroughfare Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareNumberTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareNumberType()
	 * @generated
	 */
	int THOROUGHFARE_NUMBER_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__INDICATOR_OCCURRENCE = 3;

	/**
	 * The feature id for the '<em><b>Number Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__NUMBER_OCCURRENCE = 4;

	/**
	 * The feature id for the '<em><b>Number Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__NUMBER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE__ANY_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Thoroughfare Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_NUMBER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfarePostDirectionTypeImpl <em>Thoroughfare Post Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfarePostDirectionTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfarePostDirectionType()
	 * @generated
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Post Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_POST_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfarePreDirectionTypeImpl <em>Thoroughfare Pre Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfarePreDirectionTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfarePreDirectionType()
	 * @generated
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Pre Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_PRE_DIRECTION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareTrailingTypeTypeImpl <em>Thoroughfare Trailing Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareTrailingTypeTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareTrailingTypeType()
	 * @generated
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Thoroughfare Trailing Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TRAILING_TYPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.ThoroughfareTypeImpl <em>Thoroughfare Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.ThoroughfareTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getThoroughfareType()
	 * @generated
	 */
	int THOROUGHFARE_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ADDRESS_LINE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_PREFIX = 4;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NUMBER_SUFFIX = 5;

	/**
	 * The feature id for the '<em><b>Thoroughfare Pre Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION = 6;

	/**
	 * The feature id for the '<em><b>Thoroughfare Leading Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Thoroughfare Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_NAME = 8;

	/**
	 * The feature id for the '<em><b>Thoroughfare Trailing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Thoroughfare Post Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION = 10;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARE = 11;

	/**
	 * The feature id for the '<em><b>Dependent Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_LOCALITY = 12;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__PREMISE = 13;

	/**
	 * The feature id for the '<em><b>Firm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__FIRM = 14;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__POSTAL_CODE = 15;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ANY = 16;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES = 17;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_CONNECTOR = 18;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_INDICATOR = 19;

	/**
	 * The feature id for the '<em><b>Dependent Thoroughfares Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__DEPENDENT_THOROUGHFARES_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__TYPE = 21;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE__ANY_ATTRIBUTE = 22;

	/**
	 * The number of structural features of the '<em>Thoroughfare Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THOROUGHFARE_TYPE_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.DocumentRootImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 83;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_DETAILS = 3;

	/**
	 * The feature id for the '<em><b>Address Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_LINE = 4;

	/**
	 * The feature id for the '<em><b>Administrative Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADMINISTRATIVE_AREA = 5;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COUNTRY_NAME = 6;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPARTMENT = 7;

	/**
	 * The feature id for the '<em><b>Locality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCALITY = 8;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POSTAL_CODE = 9;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_BOX = 10;

	/**
	 * The feature id for the '<em><b>Post Office</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POST_OFFICE = 11;

	/**
	 * The feature id for the '<em><b>Premise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE = 12;

	/**
	 * The feature id for the '<em><b>Premise Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Premise Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX = 14;

	/**
	 * The feature id for the '<em><b>Premise Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX = 15;

	/**
	 * The feature id for the '<em><b>Thoroughfare</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE = 16;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER = 17;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX = 18;

	/**
	 * The feature id for the '<em><b>Thoroughfare Number Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX = 19;

	/**
	 * The feature id for the '<em><b>XAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XAL = 20;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.impl.XALTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.impl.XALTypeImpl
	 * @see org.oasis.xAL.impl.XALPackageImpl#getXALType()
	 * @generated
	 */
	int XAL_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ADDRESS_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.DependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.DependentThoroughfaresType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDependentThoroughfaresType()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARES_TYPE = 85;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.IndicatorOccurenceType <em>Indicator Occurence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurenceType()
	 * @generated
	 */
	int INDICATOR_OCCURENCE_TYPE = 86;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.IndicatorOccurrenceType <em>Indicator Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE = 87;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.IndicatorOccurrenceType1 <em>Indicator Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType1()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE1 = 88;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.IndicatorOccurrenceType2 <em>Indicator Occurrence Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType2
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType2()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE2 = 89;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.IndicatorOccurrenceType3 <em>Indicator Occurrence Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType3
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType3()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE3 = 90;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.IndicatorOccurrenceType4 <em>Indicator Occurrence Type4</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType4
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceType4()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE4 = 91;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NameNumberOccurrenceType <em>Name Number Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NameNumberOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNameNumberOccurrenceType()
	 * @generated
	 */
	int NAME_NUMBER_OCCURRENCE_TYPE = 92;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NumberOccurrenceType <em>Number Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberOccurrenceType()
	 * @generated
	 */
	int NUMBER_OCCURRENCE_TYPE = 93;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NumberRangeOccurenceType <em>Number Range Occurence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberRangeOccurenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberRangeOccurenceType()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURENCE_TYPE = 94;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NumberRangeOccurrenceType <em>Number Range Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberRangeOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberRangeOccurrenceType()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURRENCE_TYPE = 95;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NumberTypeOccurrenceType <em>Number Type Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceType()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE = 96;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeOccurrenceType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceType1()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE1 = 97;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NumberTypeType <em>Number Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeType()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE = 98;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.NumberTypeType1 <em>Number Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeType1()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE1 = 99;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.RangeTypeType <em>Range Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.RangeTypeType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getRangeTypeType()
	 * @generated
	 */
	int RANGE_TYPE_TYPE = 100;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.TypeOccurrenceType <em>Type Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.TypeOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getTypeOccurrenceType()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE = 101;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.TypeOccurrenceType1 <em>Type Occurrence Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.TypeOccurrenceType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getTypeOccurrenceType1()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE1 = 102;

	/**
	 * The meta object id for the '{@link org.oasis.xAL.TypeOccurrenceType2 <em>Type Occurrence Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.TypeOccurrenceType2
	 * @see org.oasis.xAL.impl.XALPackageImpl#getTypeOccurrenceType2()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE2 = 103;

	/**
	 * The meta object id for the '<em>Dependent Thoroughfares Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.DependentThoroughfaresType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getDependentThoroughfaresTypeObject()
	 * @generated
	 */
	int DEPENDENT_THOROUGHFARES_TYPE_OBJECT = 104;

	/**
	 * The meta object id for the '<em>Indicator Occurence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurenceTypeObject()
	 * @generated
	 */
	int INDICATOR_OCCURENCE_TYPE_OBJECT = 105;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType2
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject1()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT1 = 107;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject2()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT2 = 108;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType3
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject3()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT3 = 109;

	/**
	 * The meta object id for the '<em>Indicator Occurrence Type Object4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.IndicatorOccurrenceType4
	 * @see org.oasis.xAL.impl.XALPackageImpl#getIndicatorOccurrenceTypeObject4()
	 * @generated
	 */
	int INDICATOR_OCCURRENCE_TYPE_OBJECT4 = 110;

	/**
	 * The meta object id for the '<em>Name Number Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NameNumberOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNameNumberOccurrenceTypeObject()
	 * @generated
	 */
	int NAME_NUMBER_OCCURRENCE_TYPE_OBJECT = 111;

	/**
	 * The meta object id for the '<em>Number Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_OCCURRENCE_TYPE_OBJECT = 112;

	/**
	 * The meta object id for the '<em>Number Range Occurence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberRangeOccurenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberRangeOccurenceTypeObject()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURENCE_TYPE_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Number Range Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberRangeOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberRangeOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_RANGE_OCCURRENCE_TYPE_OBJECT = 114;

	/**
	 * The meta object id for the '<em>Number Type Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceTypeObject()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT = 115;

	/**
	 * The meta object id for the '<em>Number Type Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeOccurrenceType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeOccurrenceTypeObject1()
	 * @generated
	 */
	int NUMBER_TYPE_OCCURRENCE_TYPE_OBJECT1 = 116;

	/**
	 * The meta object id for the '<em>Number Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeTypeObject()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE_OBJECT = 117;

	/**
	 * The meta object id for the '<em>Number Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.NumberTypeType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getNumberTypeTypeObject1()
	 * @generated
	 */
	int NUMBER_TYPE_TYPE_OBJECT1 = 118;

	/**
	 * The meta object id for the '<em>Range Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.RangeTypeType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getRangeTypeTypeObject()
	 * @generated
	 */
	int RANGE_TYPE_TYPE_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.TypeOccurrenceType
	 * @see org.oasis.xAL.impl.XALPackageImpl#getTypeOccurrenceTypeObject()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.TypeOccurrenceType1
	 * @see org.oasis.xAL.impl.XALPackageImpl#getTypeOccurrenceTypeObject1()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT1 = 121;

	/**
	 * The meta object id for the '<em>Type Occurrence Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasis.xAL.TypeOccurrenceType2
	 * @see org.oasis.xAL.impl.XALPackageImpl#getTypeOccurrenceTypeObject2()
	 * @generated
	 */
	int TYPE_OCCURRENCE_TYPE_OBJECT2 = 122;


	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Details</em>'.
	 * @see org.oasis.xAL.AddressDetails
	 * @generated
	 */
	EClass getAddressDetails();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AddressDetails#getPostalServiceElements <em>Postal Service Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Service Elements</em>'.
	 * @see org.oasis.xAL.AddressDetails#getPostalServiceElements()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_PostalServiceElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AddressDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.oasis.xAL.AddressDetails#getAddress()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AddressDetails#getAddressLines <em>Address Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Lines</em>'.
	 * @see org.oasis.xAL.AddressDetails#getAddressLines()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_AddressLines();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AddressDetails#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country</em>'.
	 * @see org.oasis.xAL.AddressDetails#getCountry()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Country();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AddressDetails#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see org.oasis.xAL.AddressDetails#getAdministrativeArea()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AddressDetails#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see org.oasis.xAL.AddressDetails#getLocality()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AddressDetails#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see org.oasis.xAL.AddressDetails#getThoroughfare()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EReference getAddressDetails_Thoroughfare();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressDetails#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.AddressDetails#getAny()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressDetails#getAddressDetailsKey <em>Address Details Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Details Key</em>'.
	 * @see org.oasis.xAL.AddressDetails#getAddressDetailsKey()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AddressDetailsKey();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressDetails#getAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Type</em>'.
	 * @see org.oasis.xAL.AddressDetails#getAddressType()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressDetails#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressDetails#getCode()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressDetails#getCurrentStatus <em>Current Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Status</em>'.
	 * @see org.oasis.xAL.AddressDetails#getCurrentStatus()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_CurrentStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressDetails#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see org.oasis.xAL.AddressDetails#getUsage()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_Usage();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressDetails#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see org.oasis.xAL.AddressDetails#getValidFromDate()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_ValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressDetails#getValidToDate <em>Valid To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To Date</em>'.
	 * @see org.oasis.xAL.AddressDetails#getValidToDate()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_ValidToDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressDetails#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressDetails#getAnyAttribute()
	 * @see #getAddressDetails()
	 * @generated
	 */
	EAttribute getAddressDetails_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressIdentifierType <em>Address Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Identifier Type</em>'.
	 * @see org.oasis.xAL.AddressIdentifierType
	 * @generated
	 */
	EClass getAddressIdentifierType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressIdentifierType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AddressIdentifierType#getMixed()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressIdentifierType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressIdentifierType#getCode()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressIdentifierType#getIdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Type</em>'.
	 * @see org.oasis.xAL.AddressIdentifierType#getIdentifierType()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_IdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressIdentifierType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AddressIdentifierType#getType()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressIdentifierType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressIdentifierType#getAnyAttribute()
	 * @see #getAddressIdentifierType()
	 * @generated
	 */
	EAttribute getAddressIdentifierType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressLatitudeDirectionType <em>Address Latitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Latitude Direction Type</em>'.
	 * @see org.oasis.xAL.AddressLatitudeDirectionType
	 * @generated
	 */
	EClass getAddressLatitudeDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLatitudeDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AddressLatitudeDirectionType#getMixed()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLatitudeDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressLatitudeDirectionType#getCode()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLatitudeDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AddressLatitudeDirectionType#getType()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLatitudeDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressLatitudeDirectionType#getAnyAttribute()
	 * @see #getAddressLatitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLatitudeDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressLatitudeType <em>Address Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Latitude Type</em>'.
	 * @see org.oasis.xAL.AddressLatitudeType
	 * @generated
	 */
	EClass getAddressLatitudeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLatitudeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AddressLatitudeType#getMixed()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLatitudeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressLatitudeType#getCode()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLatitudeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AddressLatitudeType#getType()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLatitudeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressLatitudeType#getAnyAttribute()
	 * @see #getAddressLatitudeType()
	 * @generated
	 */
	EAttribute getAddressLatitudeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressLinesType <em>Address Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Lines Type</em>'.
	 * @see org.oasis.xAL.AddressLinesType
	 * @generated
	 */
	EClass getAddressLinesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.AddressLinesType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.AddressLinesType#getAddressLine()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EReference getAddressLinesType_AddressLine();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLinesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.AddressLinesType#getAny()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EAttribute getAddressLinesType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLinesType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressLinesType#getAnyAttribute()
	 * @see #getAddressLinesType()
	 * @generated
	 */
	EAttribute getAddressLinesType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressLineType <em>Address Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Line Type</em>'.
	 * @see org.oasis.xAL.AddressLineType
	 * @generated
	 */
	EClass getAddressLineType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLineType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AddressLineType#getMixed()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLineType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressLineType#getCode()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLineType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AddressLineType#getType()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLineType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressLineType#getAnyAttribute()
	 * @see #getAddressLineType()
	 * @generated
	 */
	EAttribute getAddressLineType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressLongitudeDirectionType <em>Address Longitude Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Longitude Direction Type</em>'.
	 * @see org.oasis.xAL.AddressLongitudeDirectionType
	 * @generated
	 */
	EClass getAddressLongitudeDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLongitudeDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AddressLongitudeDirectionType#getMixed()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLongitudeDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressLongitudeDirectionType#getCode()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLongitudeDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AddressLongitudeDirectionType#getType()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLongitudeDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressLongitudeDirectionType#getAnyAttribute()
	 * @see #getAddressLongitudeDirectionType()
	 * @generated
	 */
	EAttribute getAddressLongitudeDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressLongitudeType <em>Address Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Longitude Type</em>'.
	 * @see org.oasis.xAL.AddressLongitudeType
	 * @generated
	 */
	EClass getAddressLongitudeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLongitudeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AddressLongitudeType#getMixed()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLongitudeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressLongitudeType#getCode()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressLongitudeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AddressLongitudeType#getType()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressLongitudeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressLongitudeType#getAnyAttribute()
	 * @see #getAddressLongitudeType()
	 * @generated
	 */
	EAttribute getAddressLongitudeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see org.oasis.xAL.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AddressType#getMixed()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AddressType#getCode()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AddressType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AddressType#getType()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AddressType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AddressType#getAnyAttribute()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AdministrativeAreaNameType <em>Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Area Name Type</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaNameType
	 * @generated
	 */
	EClass getAdministrativeAreaNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AdministrativeAreaNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaNameType#getMixed()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AdministrativeAreaNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaNameType#getCode()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AdministrativeAreaNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaNameType#getType()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AdministrativeAreaNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaNameType#getAnyAttribute()
	 * @see #getAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.AdministrativeAreaType <em>Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Area Type</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType
	 * @generated
	 */
	EClass getAdministrativeAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.AdministrativeAreaType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getAddressLine()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.AdministrativeAreaType#getAdministrativeAreaName <em>Administrative Area Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Administrative Area Name</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getAdministrativeAreaName()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_AdministrativeAreaName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AdministrativeAreaType#getSubAdministrativeArea <em>Sub Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Administrative Area</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getSubAdministrativeArea()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_SubAdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AdministrativeAreaType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getLocality()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AdministrativeAreaType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getPostOffice()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.AdministrativeAreaType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getPostalCode()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EReference getAdministrativeAreaType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AdministrativeAreaType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getAny()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AdministrativeAreaType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getIndicator()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AdministrativeAreaType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getType()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.AdministrativeAreaType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getUsageType()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.AdministrativeAreaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.AdministrativeAreaType#getAnyAttribute()
	 * @see #getAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getAdministrativeAreaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.BarcodeType <em>Barcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barcode Type</em>'.
	 * @see org.oasis.xAL.BarcodeType
	 * @generated
	 */
	EClass getBarcodeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.BarcodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.BarcodeType#getMixed()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.BarcodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.BarcodeType#getCode()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.BarcodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.BarcodeType#getType()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.BarcodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.BarcodeType#getAnyAttribute()
	 * @see #getBarcodeType()
	 * @generated
	 */
	EAttribute getBarcodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.BuildingNameType <em>Building Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Name Type</em>'.
	 * @see org.oasis.xAL.BuildingNameType
	 * @generated
	 */
	EClass getBuildingNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.BuildingNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.BuildingNameType#getMixed()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.BuildingNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.BuildingNameType#getCode()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.BuildingNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.BuildingNameType#getType()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.BuildingNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see org.oasis.xAL.BuildingNameType#getTypeOccurrence()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.BuildingNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.BuildingNameType#getAnyAttribute()
	 * @see #getBuildingNameType()
	 * @generated
	 */
	EAttribute getBuildingNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.CountryNameCodeType <em>Country Name Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Name Code Type</em>'.
	 * @see org.oasis.xAL.CountryNameCodeType
	 * @generated
	 */
	EClass getCountryNameCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.CountryNameCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.CountryNameCodeType#getMixed()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.CountryNameCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.CountryNameCodeType#getCode()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.CountryNameCodeType#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see org.oasis.xAL.CountryNameCodeType#getScheme()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_Scheme();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.CountryNameCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.CountryNameCodeType#getAnyAttribute()
	 * @see #getCountryNameCodeType()
	 * @generated
	 */
	EAttribute getCountryNameCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.CountryNameType <em>Country Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Name Type</em>'.
	 * @see org.oasis.xAL.CountryNameType
	 * @generated
	 */
	EClass getCountryNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.CountryNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.CountryNameType#getMixed()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.CountryNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.CountryNameType#getCode()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.CountryNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.CountryNameType#getType()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.CountryNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.CountryNameType#getAnyAttribute()
	 * @see #getCountryNameType()
	 * @generated
	 */
	EAttribute getCountryNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.CountryType <em>Country Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Type</em>'.
	 * @see org.oasis.xAL.CountryType
	 * @generated
	 */
	EClass getCountryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.CountryType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.CountryType#getAddressLine()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.CountryType#getCountryNameCode <em>Country Name Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country Name Code</em>'.
	 * @see org.oasis.xAL.CountryType#getCountryNameCode()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_CountryNameCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.CountryType#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Country Name</em>'.
	 * @see org.oasis.xAL.CountryType#getCountryName()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_CountryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.CountryType#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see org.oasis.xAL.CountryType#getAdministrativeArea()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.CountryType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see org.oasis.xAL.CountryType#getLocality()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.CountryType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see org.oasis.xAL.CountryType#getThoroughfare()
	 * @see #getCountryType()
	 * @generated
	 */
	EReference getCountryType_Thoroughfare();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.CountryType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.CountryType#getAny()
	 * @see #getCountryType()
	 * @generated
	 */
	EAttribute getCountryType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.CountryType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.CountryType#getAnyAttribute()
	 * @see #getCountryType()
	 * @generated
	 */
	EAttribute getCountryType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.DepartmentNameType <em>Department Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department Name Type</em>'.
	 * @see org.oasis.xAL.DepartmentNameType
	 * @generated
	 */
	EClass getDepartmentNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DepartmentNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.DepartmentNameType#getMixed()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DepartmentNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.DepartmentNameType#getCode()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DepartmentNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.DepartmentNameType#getType()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DepartmentNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.DepartmentNameType#getAnyAttribute()
	 * @see #getDepartmentNameType()
	 * @generated
	 */
	EAttribute getDepartmentNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.DepartmentType <em>Department Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department Type</em>'.
	 * @see org.oasis.xAL.DepartmentType
	 * @generated
	 */
	EClass getDepartmentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.DepartmentType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.DepartmentType#getAddressLine()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.DepartmentType#getDepartmentName <em>Department Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department Name</em>'.
	 * @see org.oasis.xAL.DepartmentType#getDepartmentName()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_DepartmentName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DepartmentType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see org.oasis.xAL.DepartmentType#getMailStop()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DepartmentType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.DepartmentType#getPostalCode()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EReference getDepartmentType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DepartmentType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.DepartmentType#getAny()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DepartmentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.DepartmentType#getType()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DepartmentType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.DepartmentType#getAnyAttribute()
	 * @see #getDepartmentType()
	 * @generated
	 */
	EAttribute getDepartmentType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.DependentLocalityNameType <em>Dependent Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Name Type</em>'.
	 * @see org.oasis.xAL.DependentLocalityNameType
	 * @generated
	 */
	EClass getDependentLocalityNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentLocalityNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.DependentLocalityNameType#getMixed()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.DependentLocalityNameType#getCode()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.DependentLocalityNameType#getType()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentLocalityNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.DependentLocalityNameType#getAnyAttribute()
	 * @see #getDependentLocalityNameType()
	 * @generated
	 */
	EAttribute getDependentLocalityNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.DependentLocalityNumberType <em>Dependent Locality Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Number Type</em>'.
	 * @see org.oasis.xAL.DependentLocalityNumberType
	 * @generated
	 */
	EClass getDependentLocalityNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentLocalityNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.DependentLocalityNumberType#getMixed()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.DependentLocalityNumberType#getCode()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityNumberType#getNameNumberOccurrence <em>Name Number Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Number Occurrence</em>'.
	 * @see org.oasis.xAL.DependentLocalityNumberType#getNameNumberOccurrence()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_NameNumberOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentLocalityNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.DependentLocalityNumberType#getAnyAttribute()
	 * @see #getDependentLocalityNumberType()
	 * @generated
	 */
	EAttribute getDependentLocalityNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.DependentLocalityType <em>Dependent Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Locality Type</em>'.
	 * @see org.oasis.xAL.DependentLocalityType
	 * @generated
	 */
	EClass getDependentLocalityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.DependentLocalityType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getAddressLine()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.DependentLocalityType#getDependentLocalityName <em>Dependent Locality Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent Locality Name</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getDependentLocalityName()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocalityName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getDependentLocalityNumber <em>Dependent Locality Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality Number</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getDependentLocalityNumber()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocalityNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getPostBox()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getLargeMailUser <em>Large Mail User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getLargeMailUser()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_LargeMailUser();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getPostOffice()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getPostalRoute()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getThoroughfare()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getPremise()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getDependentLocality()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentLocalityType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getPostalCode()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EReference getDependentLocalityType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentLocalityType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getAny()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityType#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getConnector()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Connector();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getIndicator()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getType()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentLocalityType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getUsageType()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentLocalityType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.DependentLocalityType#getAnyAttribute()
	 * @see #getDependentLocalityType()
	 * @generated
	 */
	EAttribute getDependentLocalityType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.DependentThoroughfareType <em>Dependent Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent Thoroughfare Type</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType
	 * @generated
	 */
	EClass getDependentThoroughfareType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.DependentThoroughfareType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getAddressLine()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Pre Direction</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getThoroughfarePreDirection()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfarePreDirection();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Leading Type</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getThoroughfareLeadingType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareLeadingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Name</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getThoroughfareName()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Trailing Type</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getThoroughfareTrailingType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfareTrailingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DependentThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Post Direction</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getThoroughfarePostDirection()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EReference getDependentThoroughfareType_ThoroughfarePostDirection();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentThoroughfareType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getAny()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.DependentThoroughfareType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getType()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DependentThoroughfareType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.DependentThoroughfareType#getAnyAttribute()
	 * @see #getDependentThoroughfareType()
	 * @generated
	 */
	EAttribute getDependentThoroughfareType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.EndorsementLineCodeType <em>Endorsement Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Endorsement Line Code Type</em>'.
	 * @see org.oasis.xAL.EndorsementLineCodeType
	 * @generated
	 */
	EClass getEndorsementLineCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.EndorsementLineCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.EndorsementLineCodeType#getMixed()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.EndorsementLineCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.EndorsementLineCodeType#getCode()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.EndorsementLineCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.EndorsementLineCodeType#getType()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.EndorsementLineCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.EndorsementLineCodeType#getAnyAttribute()
	 * @see #getEndorsementLineCodeType()
	 * @generated
	 */
	EAttribute getEndorsementLineCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.FirmNameType <em>Firm Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firm Name Type</em>'.
	 * @see org.oasis.xAL.FirmNameType
	 * @generated
	 */
	EClass getFirmNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.FirmNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.FirmNameType#getMixed()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.FirmNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.FirmNameType#getCode()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.FirmNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.FirmNameType#getType()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.FirmNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.FirmNameType#getAnyAttribute()
	 * @see #getFirmNameType()
	 * @generated
	 */
	EAttribute getFirmNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.FirmType <em>Firm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firm Type</em>'.
	 * @see org.oasis.xAL.FirmType
	 * @generated
	 */
	EClass getFirmType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.FirmType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.FirmType#getAddressLine()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.FirmType#getFirmName <em>Firm Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firm Name</em>'.
	 * @see org.oasis.xAL.FirmType#getFirmName()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_FirmName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.FirmType#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see org.oasis.xAL.FirmType#getDepartment()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_Department();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.FirmType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see org.oasis.xAL.FirmType#getMailStop()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.FirmType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.FirmType#getPostalCode()
	 * @see #getFirmType()
	 * @generated
	 */
	EReference getFirmType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.FirmType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.FirmType#getAny()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.FirmType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.FirmType#getType()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.FirmType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.FirmType#getAnyAttribute()
	 * @see #getFirmType()
	 * @generated
	 */
	EAttribute getFirmType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.KeyLineCodeType <em>Key Line Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Line Code Type</em>'.
	 * @see org.oasis.xAL.KeyLineCodeType
	 * @generated
	 */
	EClass getKeyLineCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.KeyLineCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.KeyLineCodeType#getMixed()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.KeyLineCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.KeyLineCodeType#getCode()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.KeyLineCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.KeyLineCodeType#getType()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.KeyLineCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.KeyLineCodeType#getAnyAttribute()
	 * @see #getKeyLineCodeType()
	 * @generated
	 */
	EAttribute getKeyLineCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.LargeMailUserIdentifierType <em>Large Mail User Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Identifier Type</em>'.
	 * @see org.oasis.xAL.LargeMailUserIdentifierType
	 * @generated
	 */
	EClass getLargeMailUserIdentifierType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LargeMailUserIdentifierType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.LargeMailUserIdentifierType#getMixed()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LargeMailUserIdentifierType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.LargeMailUserIdentifierType#getCode()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LargeMailUserIdentifierType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.LargeMailUserIdentifierType#getIndicator()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LargeMailUserIdentifierType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.LargeMailUserIdentifierType#getType()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LargeMailUserIdentifierType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.LargeMailUserIdentifierType#getAnyAttribute()
	 * @see #getLargeMailUserIdentifierType()
	 * @generated
	 */
	EAttribute getLargeMailUserIdentifierType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.LargeMailUserNameType <em>Large Mail User Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Name Type</em>'.
	 * @see org.oasis.xAL.LargeMailUserNameType
	 * @generated
	 */
	EClass getLargeMailUserNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LargeMailUserNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.LargeMailUserNameType#getMixed()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LargeMailUserNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.LargeMailUserNameType#getCode()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LargeMailUserNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.LargeMailUserNameType#getType()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LargeMailUserNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.LargeMailUserNameType#getAnyAttribute()
	 * @see #getLargeMailUserNameType()
	 * @generated
	 */
	EAttribute getLargeMailUserNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.LargeMailUserType <em>Large Mail User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large Mail User Type</em>'.
	 * @see org.oasis.xAL.LargeMailUserType
	 * @generated
	 */
	EClass getLargeMailUserType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.LargeMailUserType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getAddressLine()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.LargeMailUserType#getLargeMailUserName <em>Large Mail User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Large Mail User Name</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getLargeMailUserName()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_LargeMailUserName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LargeMailUserType#getLargeMailUserIdentifier <em>Large Mail User Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User Identifier</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getLargeMailUserIdentifier()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_LargeMailUserIdentifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.LargeMailUserType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getBuildingName()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_BuildingName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LargeMailUserType#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Department</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getDepartment()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_Department();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LargeMailUserType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getPostBox()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LargeMailUserType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getThoroughfare()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LargeMailUserType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getPostalCode()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EReference getLargeMailUserType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LargeMailUserType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getAny()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LargeMailUserType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getType()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LargeMailUserType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.LargeMailUserType#getAnyAttribute()
	 * @see #getLargeMailUserType()
	 * @generated
	 */
	EAttribute getLargeMailUserType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.LocalityNameType <em>Locality Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locality Name Type</em>'.
	 * @see org.oasis.xAL.LocalityNameType
	 * @generated
	 */
	EClass getLocalityNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LocalityNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.LocalityNameType#getMixed()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LocalityNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.LocalityNameType#getCode()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LocalityNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.LocalityNameType#getType()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LocalityNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.LocalityNameType#getAnyAttribute()
	 * @see #getLocalityNameType()
	 * @generated
	 */
	EAttribute getLocalityNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.LocalityType <em>Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locality Type</em>'.
	 * @see org.oasis.xAL.LocalityType
	 * @generated
	 */
	EClass getLocalityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.LocalityType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.LocalityType#getAddressLine()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.LocalityType#getLocalityName <em>Locality Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locality Name</em>'.
	 * @see org.oasis.xAL.LocalityType#getLocalityName()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_LocalityName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see org.oasis.xAL.LocalityType#getPostBox()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getLargeMailUser <em>Large Mail User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Large Mail User</em>'.
	 * @see org.oasis.xAL.LocalityType#getLargeMailUser()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_LargeMailUser();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see org.oasis.xAL.LocalityType#getPostOffice()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see org.oasis.xAL.LocalityType#getPostalRoute()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see org.oasis.xAL.LocalityType#getThoroughfare()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see org.oasis.xAL.LocalityType#getPremise()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see org.oasis.xAL.LocalityType#getDependentLocality()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.LocalityType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.LocalityType#getPostalCode()
	 * @see #getLocalityType()
	 * @generated
	 */
	EReference getLocalityType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LocalityType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.LocalityType#getAny()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LocalityType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.LocalityType#getIndicator()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LocalityType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.LocalityType#getType()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.LocalityType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see org.oasis.xAL.LocalityType#getUsageType()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.LocalityType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.LocalityType#getAnyAttribute()
	 * @see #getLocalityType()
	 * @generated
	 */
	EAttribute getLocalityType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.MailStopNameType <em>Mail Stop Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Name Type</em>'.
	 * @see org.oasis.xAL.MailStopNameType
	 * @generated
	 */
	EClass getMailStopNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.MailStopNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.MailStopNameType#getMixed()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.MailStopNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.MailStopNameType#getCode()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.MailStopNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.MailStopNameType#getType()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.MailStopNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.MailStopNameType#getAnyAttribute()
	 * @see #getMailStopNameType()
	 * @generated
	 */
	EAttribute getMailStopNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.MailStopNumberType <em>Mail Stop Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Number Type</em>'.
	 * @see org.oasis.xAL.MailStopNumberType
	 * @generated
	 */
	EClass getMailStopNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.MailStopNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.MailStopNumberType#getMixed()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.MailStopNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.MailStopNumberType#getCode()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.MailStopNumberType#getNameNumberSeparator <em>Name Number Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Number Separator</em>'.
	 * @see org.oasis.xAL.MailStopNumberType#getNameNumberSeparator()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_NameNumberSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.MailStopNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.MailStopNumberType#getAnyAttribute()
	 * @see #getMailStopNumberType()
	 * @generated
	 */
	EAttribute getMailStopNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.MailStopType <em>Mail Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Stop Type</em>'.
	 * @see org.oasis.xAL.MailStopType
	 * @generated
	 */
	EClass getMailStopType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.MailStopType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.MailStopType#getAddressLine()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.MailStopType#getMailStopName <em>Mail Stop Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop Name</em>'.
	 * @see org.oasis.xAL.MailStopType#getMailStopName()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_MailStopName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.MailStopType#getMailStopNumber <em>Mail Stop Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop Number</em>'.
	 * @see org.oasis.xAL.MailStopType#getMailStopNumber()
	 * @see #getMailStopType()
	 * @generated
	 */
	EReference getMailStopType_MailStopNumber();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.MailStopType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.MailStopType#getAny()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.MailStopType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.MailStopType#getType()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.MailStopType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.MailStopType#getAnyAttribute()
	 * @see #getMailStopType()
	 * @generated
	 */
	EAttribute getMailStopType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostalCodeNumberExtensionType <em>Postal Code Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Number Extension Type</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberExtensionType
	 * @generated
	 */
	EClass getPostalCodeNumberExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalCodeNumberExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberExtensionType#getMixed()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalCodeNumberExtensionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberExtensionType#getCode()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalCodeNumberExtensionType#getNumberExtensionSeparator <em>Number Extension Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Extension Separator</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberExtensionType#getNumberExtensionSeparator()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_NumberExtensionSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalCodeNumberExtensionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberExtensionType#getType()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalCodeNumberExtensionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberExtensionType#getAnyAttribute()
	 * @see #getPostalCodeNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberExtensionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostalCodeNumberType <em>Postal Code Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Number Type</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberType
	 * @generated
	 */
	EClass getPostalCodeNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalCodeNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberType#getMixed()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalCodeNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberType#getCode()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalCodeNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberType#getType()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalCodeNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostalCodeNumberType#getAnyAttribute()
	 * @see #getPostalCodeNumberType()
	 * @generated
	 */
	EAttribute getPostalCodeNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostalCodeType <em>Postal Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Code Type</em>'.
	 * @see org.oasis.xAL.PostalCodeType
	 * @generated
	 */
	EClass getPostalCodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostalCodeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PostalCodeType#getAddressLine()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostalCodeType#getPostalCodeNumber <em>Postal Code Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Code Number</em>'.
	 * @see org.oasis.xAL.PostalCodeType#getPostalCodeNumber()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostalCodeNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostalCodeType#getPostalCodeNumberExtension <em>Postal Code Number Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Code Number Extension</em>'.
	 * @see org.oasis.xAL.PostalCodeType#getPostalCodeNumberExtension()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostalCodeNumberExtension();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalCodeType#getPostTown <em>Post Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Town</em>'.
	 * @see org.oasis.xAL.PostalCodeType#getPostTown()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EReference getPostalCodeType_PostTown();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalCodeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.PostalCodeType#getAny()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostalCodeType#getType()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostalCodeType#getAnyAttribute()
	 * @see #getPostalCodeType()
	 * @generated
	 */
	EAttribute getPostalCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostalRouteNameType <em>Postal Route Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Name Type</em>'.
	 * @see org.oasis.xAL.PostalRouteNameType
	 * @generated
	 */
	EClass getPostalRouteNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalRouteNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostalRouteNameType#getMixed()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalRouteNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostalRouteNameType#getCode()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalRouteNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostalRouteNameType#getType()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalRouteNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostalRouteNameType#getAnyAttribute()
	 * @see #getPostalRouteNameType()
	 * @generated
	 */
	EAttribute getPostalRouteNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostalRouteNumberType <em>Postal Route Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Number Type</em>'.
	 * @see org.oasis.xAL.PostalRouteNumberType
	 * @generated
	 */
	EClass getPostalRouteNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalRouteNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostalRouteNumberType#getMixed()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalRouteNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostalRouteNumberType#getCode()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalRouteNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostalRouteNumberType#getAnyAttribute()
	 * @see #getPostalRouteNumberType()
	 * @generated
	 */
	EAttribute getPostalRouteNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostalRouteType <em>Postal Route Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Route Type</em>'.
	 * @see org.oasis.xAL.PostalRouteType
	 * @generated
	 */
	EClass getPostalRouteType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostalRouteType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PostalRouteType#getAddressLine()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostalRouteType#getPostalRouteName <em>Postal Route Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postal Route Name</em>'.
	 * @see org.oasis.xAL.PostalRouteType#getPostalRouteName()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostalRouteName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalRouteType#getPostalRouteNumber <em>Postal Route Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route Number</em>'.
	 * @see org.oasis.xAL.PostalRouteType#getPostalRouteNumber()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostalRouteNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalRouteType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see org.oasis.xAL.PostalRouteType#getPostBox()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EReference getPostalRouteType_PostBox();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalRouteType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.PostalRouteType#getAny()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalRouteType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostalRouteType#getType()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalRouteType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostalRouteType#getAnyAttribute()
	 * @see #getPostalRouteType()
	 * @generated
	 */
	EAttribute getPostalRouteType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostalServiceElementsType <em>Postal Service Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Service Elements Type</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType
	 * @generated
	 */
	EClass getPostalServiceElementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostalServiceElementsType#getAddressIdentifier <em>Address Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Identifier</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getAddressIdentifier()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getEndorsementLineCode <em>Endorsement Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Endorsement Line Code</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getEndorsementLineCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_EndorsementLineCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getKeyLineCode <em>Key Line Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Line Code</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getKeyLineCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_KeyLineCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getBarcode <em>Barcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Barcode</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getBarcode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_Barcode();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getSortingCode <em>Sorting Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorting Code</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getSortingCode()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_SortingCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLatitude <em>Address Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Latitude</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getAddressLatitude()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLatitude();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLatitudeDirection <em>Address Latitude Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Latitude Direction</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getAddressLatitudeDirection()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLatitudeDirection();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLongitude <em>Address Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Longitude</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getAddressLongitude()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLongitude();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostalServiceElementsType#getAddressLongitudeDirection <em>Address Longitude Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Longitude Direction</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getAddressLongitudeDirection()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_AddressLongitudeDirection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostalServiceElementsType#getSupplementaryPostalServiceData <em>Supplementary Postal Service Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplementary Postal Service Data</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getSupplementaryPostalServiceData()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EReference getPostalServiceElementsType_SupplementaryPostalServiceData();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalServiceElementsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getAny()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostalServiceElementsType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getType()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostalServiceElementsType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostalServiceElementsType#getAnyAttribute()
	 * @see #getPostalServiceElementsType()
	 * @generated
	 */
	EAttribute getPostalServiceElementsType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostBoxNumberExtensionType <em>Post Box Number Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Extension Type</em>'.
	 * @see org.oasis.xAL.PostBoxNumberExtensionType
	 * @generated
	 */
	EClass getPostBoxNumberExtensionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberExtensionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostBoxNumberExtensionType#getMixed()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxNumberExtensionType#getNumberExtensionSeparator <em>Number Extension Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Extension Separator</em>'.
	 * @see org.oasis.xAL.PostBoxNumberExtensionType#getNumberExtensionSeparator()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_NumberExtensionSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberExtensionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostBoxNumberExtensionType#getAnyAttribute()
	 * @see #getPostBoxNumberExtensionType()
	 * @generated
	 */
	EAttribute getPostBoxNumberExtensionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostBoxNumberPrefixType <em>Post Box Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Prefix Type</em>'.
	 * @see org.oasis.xAL.PostBoxNumberPrefixType
	 * @generated
	 */
	EClass getPostBoxNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostBoxNumberPrefixType#getMixed()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostBoxNumberPrefixType#getCode()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see org.oasis.xAL.PostBoxNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostBoxNumberPrefixType#getAnyAttribute()
	 * @see #getPostBoxNumberPrefixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostBoxNumberSuffixType <em>Post Box Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Suffix Type</em>'.
	 * @see org.oasis.xAL.PostBoxNumberSuffixType
	 * @generated
	 */
	EClass getPostBoxNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostBoxNumberSuffixType#getMixed()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostBoxNumberSuffixType#getCode()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see org.oasis.xAL.PostBoxNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostBoxNumberSuffixType#getAnyAttribute()
	 * @see #getPostBoxNumberSuffixType()
	 * @generated
	 */
	EAttribute getPostBoxNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostBoxNumberType <em>Post Box Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Number Type</em>'.
	 * @see org.oasis.xAL.PostBoxNumberType
	 * @generated
	 */
	EClass getPostBoxNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostBoxNumberType#getMixed()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostBoxNumberType#getCode()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostBoxNumberType#getAnyAttribute()
	 * @see #getPostBoxNumberType()
	 * @generated
	 */
	EAttribute getPostBoxNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostBoxType <em>Post Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Box Type</em>'.
	 * @see org.oasis.xAL.PostBoxType
	 * @generated
	 */
	EClass getPostBoxType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostBoxType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PostBoxType#getAddressLine()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostBoxType#getPostBoxNumber <em>Post Box Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number</em>'.
	 * @see org.oasis.xAL.PostBoxType#getPostBoxNumber()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostBoxType#getPostBoxNumberPrefix <em>Post Box Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Prefix</em>'.
	 * @see org.oasis.xAL.PostBoxType#getPostBoxNumberPrefix()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostBoxType#getPostBoxNumberSuffix <em>Post Box Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Suffix</em>'.
	 * @see org.oasis.xAL.PostBoxType#getPostBoxNumberSuffix()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostBoxType#getPostBoxNumberExtension <em>Post Box Number Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box Number Extension</em>'.
	 * @see org.oasis.xAL.PostBoxType#getPostBoxNumberExtension()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostBoxNumberExtension();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostBoxType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see org.oasis.xAL.PostBoxType#getFirm()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostBoxType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.PostBoxType#getPostalCode()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EReference getPostBoxType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.PostBoxType#getAny()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.PostBoxType#getIndicator()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostBoxType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostBoxType#getType()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostBoxType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostBoxType#getAnyAttribute()
	 * @see #getPostBoxType()
	 * @generated
	 */
	EAttribute getPostBoxType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostOfficeNameType <em>Post Office Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Name Type</em>'.
	 * @see org.oasis.xAL.PostOfficeNameType
	 * @generated
	 */
	EClass getPostOfficeNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostOfficeNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostOfficeNameType#getMixed()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostOfficeNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostOfficeNameType#getCode()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostOfficeNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostOfficeNameType#getType()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostOfficeNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostOfficeNameType#getAnyAttribute()
	 * @see #getPostOfficeNameType()
	 * @generated
	 */
	EAttribute getPostOfficeNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostOfficeNumberType <em>Post Office Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Number Type</em>'.
	 * @see org.oasis.xAL.PostOfficeNumberType
	 * @generated
	 */
	EClass getPostOfficeNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostOfficeNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostOfficeNumberType#getMixed()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostOfficeNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostOfficeNumberType#getCode()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostOfficeNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.PostOfficeNumberType#getIndicator()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostOfficeNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see org.oasis.xAL.PostOfficeNumberType#getIndicatorOccurrence()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostOfficeNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostOfficeNumberType#getAnyAttribute()
	 * @see #getPostOfficeNumberType()
	 * @generated
	 */
	EAttribute getPostOfficeNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostOfficeType <em>Post Office Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Office Type</em>'.
	 * @see org.oasis.xAL.PostOfficeType
	 * @generated
	 */
	EClass getPostOfficeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostOfficeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getAddressLine()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostOfficeType#getPostOfficeName <em>Post Office Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Office Name</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getPostOfficeName()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostOfficeName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostOfficeType#getPostOfficeNumber <em>Post Office Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office Number</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getPostOfficeNumber()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostOfficeNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostOfficeType#getPostalRoute <em>Postal Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Route</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getPostalRoute()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostalRoute();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostOfficeType#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getPostBox()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostOfficeType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getPostalCode()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EReference getPostOfficeType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostOfficeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getAny()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostOfficeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getIndicator()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostOfficeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getType()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostOfficeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostOfficeType#getAnyAttribute()
	 * @see #getPostOfficeType()
	 * @generated
	 */
	EAttribute getPostOfficeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostTownNameType <em>Post Town Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Name Type</em>'.
	 * @see org.oasis.xAL.PostTownNameType
	 * @generated
	 */
	EClass getPostTownNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostTownNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostTownNameType#getMixed()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostTownNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostTownNameType#getCode()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostTownNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostTownNameType#getType()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostTownNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostTownNameType#getAnyAttribute()
	 * @see #getPostTownNameType()
	 * @generated
	 */
	EAttribute getPostTownNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostTownSuffixType <em>Post Town Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Suffix Type</em>'.
	 * @see org.oasis.xAL.PostTownSuffixType
	 * @generated
	 */
	EClass getPostTownSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostTownSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PostTownSuffixType#getMixed()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostTownSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PostTownSuffixType#getCode()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostTownSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostTownSuffixType#getAnyAttribute()
	 * @see #getPostTownSuffixType()
	 * @generated
	 */
	EAttribute getPostTownSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PostTownType <em>Post Town Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Town Type</em>'.
	 * @see org.oasis.xAL.PostTownType
	 * @generated
	 */
	EClass getPostTownType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostTownType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PostTownType#getAddressLine()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PostTownType#getPostTownName <em>Post Town Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Town Name</em>'.
	 * @see org.oasis.xAL.PostTownType#getPostTownName()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_PostTownName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PostTownType#getPostTownSuffix <em>Post Town Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Town Suffix</em>'.
	 * @see org.oasis.xAL.PostTownType#getPostTownSuffix()
	 * @see #getPostTownType()
	 * @generated
	 */
	EReference getPostTownType_PostTownSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PostTownType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PostTownType#getType()
	 * @see #getPostTownType()
	 * @generated
	 */
	EAttribute getPostTownType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PostTownType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PostTownType#getAnyAttribute()
	 * @see #getPostTownType()
	 * @generated
	 */
	EAttribute getPostTownType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseLocationType <em>Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Location Type</em>'.
	 * @see org.oasis.xAL.PremiseLocationType
	 * @generated
	 */
	EClass getPremiseLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PremiseLocationType#getMixed()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseLocationType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PremiseLocationType#getCode()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseLocationType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PremiseLocationType#getAnyAttribute()
	 * @see #getPremiseLocationType()
	 * @generated
	 */
	EAttribute getPremiseLocationType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseNameType <em>Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Name Type</em>'.
	 * @see org.oasis.xAL.PremiseNameType
	 * @generated
	 */
	EClass getPremiseNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PremiseNameType#getMixed()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PremiseNameType#getCode()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PremiseNameType#getType()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see org.oasis.xAL.PremiseNameType#getTypeOccurrence()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PremiseNameType#getAnyAttribute()
	 * @see #getPremiseNameType()
	 * @generated
	 */
	EAttribute getPremiseNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseNumberPrefixType <em>Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Prefix Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberPrefixType
	 * @generated
	 */
	EClass getPremiseNumberPrefixType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberPrefixType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.oasis.xAL.PremiseNumberPrefixType#getValue()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PremiseNumberPrefixType#getCode()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see org.oasis.xAL.PremiseNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberPrefixType#getType()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PremiseNumberPrefixType#getAnyAttribute()
	 * @see #getPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getPremiseNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseNumberRangeFromType <em>Premise Number Range From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range From Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeFromType
	 * @generated
	 */
	EClass getPremiseNumberRangeFromType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeFromType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeFromType#getAddressLine()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeFromType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeFromType#getPremiseNumberPrefix()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeFromType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeFromType#getPremiseNumber()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeFromType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeFromType#getPremiseNumberSuffix()
	 * @see #getPremiseNumberRangeFromType()
	 * @generated
	 */
	EReference getPremiseNumberRangeFromType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseNumberRangeToType <em>Premise Number Range To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range To Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeToType
	 * @generated
	 */
	EClass getPremiseNumberRangeToType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeToType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeToType#getAddressLine()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeToType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeToType#getPremiseNumberPrefix()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeToType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeToType#getPremiseNumber()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseNumberRangeToType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeToType#getPremiseNumberSuffix()
	 * @see #getPremiseNumberRangeToType()
	 * @generated
	 */
	EReference getPremiseNumberRangeToType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseNumberRangeType <em>Premise Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Range Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType
	 * @generated
	 */
	EClass getPremiseNumberRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseNumberRangeType#getPremiseNumberRangeFrom <em>Premise Number Range From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range From</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getPremiseNumberRangeFrom()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EReference getPremiseNumberRangeType_PremiseNumberRangeFrom();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseNumberRangeType#getPremiseNumberRangeTo <em>Premise Number Range To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range To</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getPremiseNumberRangeTo()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EReference getPremiseNumberRangeType_PremiseNumberRangeTo();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberRangeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getIndicator()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberRangeType#getIndicatorOccurence <em>Indicator Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurence</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getIndicatorOccurence()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_IndicatorOccurence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberRangeType#getNumberRangeOccurence <em>Number Range Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Range Occurence</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getNumberRangeOccurence()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_NumberRangeOccurence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberRangeType#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getRangeType()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_RangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberRangeType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getSeparator()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberRangeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberRangeType#getType()
	 * @see #getPremiseNumberRangeType()
	 * @generated
	 */
	EAttribute getPremiseNumberRangeType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseNumberSuffixType <em>Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Suffix Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberSuffixType
	 * @generated
	 */
	EClass getPremiseNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PremiseNumberSuffixType#getMixed()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PremiseNumberSuffixType#getCode()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see org.oasis.xAL.PremiseNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberSuffixType#getType()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PremiseNumberSuffixType#getAnyAttribute()
	 * @see #getPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getPremiseNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseNumberType <em>Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Number Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberType
	 * @generated
	 */
	EClass getPremiseNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getMixed()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getCode()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getIndicator()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getIndicatorOccurrence()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getNumberType()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_NumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type Occurrence</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getNumberTypeOccurrence()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_NumberTypeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getType()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PremiseNumberType#getAnyAttribute()
	 * @see #getPremiseNumberType()
	 * @generated
	 */
	EAttribute getPremiseNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.PremiseType <em>Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise Type</em>'.
	 * @see org.oasis.xAL.PremiseType
	 * @generated
	 */
	EClass getPremiseType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.PremiseType#getAddressLine()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseType#getPremiseName <em>Premise Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Name</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseName()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseType#getPremiseLocation <em>Premise Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Location</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseLocation()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseType#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseNumber()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseType#getPremiseNumberRange <em>Premise Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Range</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseNumberRange()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseType#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Prefix</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseNumberPrefix()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseType#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premise Number Suffix</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseNumberSuffix()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see org.oasis.xAL.PremiseType#getBuildingName()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_BuildingName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.PremiseType#getSubPremise <em>Sub Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise</em>'.
	 * @see org.oasis.xAL.PremiseType#getSubPremise()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_SubPremise();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see org.oasis.xAL.PremiseType#getFirm()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see org.oasis.xAL.PremiseType#getMailStop()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.PremiseType#getPostalCode()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.PremiseType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremise()
	 * @see #getPremiseType()
	 * @generated
	 */
	EReference getPremiseType_Premise();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.PremiseType#getAny()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseType#getPremiseDependency <em>Premise Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Dependency</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseDependency()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseType#getPremiseDependencyType <em>Premise Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Dependency Type</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseDependencyType()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseDependencyType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseType#getPremiseThoroughfareConnector <em>Premise Thoroughfare Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Thoroughfare Connector</em>'.
	 * @see org.oasis.xAL.PremiseType#getPremiseThoroughfareConnector()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_PremiseThoroughfareConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.PremiseType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.PremiseType#getType()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.PremiseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.PremiseType#getAnyAttribute()
	 * @see #getPremiseType()
	 * @generated
	 */
	EAttribute getPremiseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SortingCodeType <em>Sorting Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorting Code Type</em>'.
	 * @see org.oasis.xAL.SortingCodeType
	 * @generated
	 */
	EClass getSortingCodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SortingCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SortingCodeType#getCode()
	 * @see #getSortingCodeType()
	 * @generated
	 */
	EAttribute getSortingCodeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SortingCodeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SortingCodeType#getType()
	 * @see #getSortingCodeType()
	 * @generated
	 */
	EAttribute getSortingCodeType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubAdministrativeAreaNameType <em>Sub Administrative Area Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Administrative Area Name Type</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaNameType
	 * @generated
	 */
	EClass getSubAdministrativeAreaNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubAdministrativeAreaNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaNameType#getMixed()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubAdministrativeAreaNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaNameType#getCode()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubAdministrativeAreaNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaNameType#getType()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubAdministrativeAreaNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaNameType#getAnyAttribute()
	 * @see #getSubAdministrativeAreaNameType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubAdministrativeAreaType <em>Sub Administrative Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Administrative Area Type</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType
	 * @generated
	 */
	EClass getSubAdministrativeAreaType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubAdministrativeAreaType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getAddressLine()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubAdministrativeAreaType#getSubAdministrativeAreaName <em>Sub Administrative Area Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Administrative Area Name</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getSubAdministrativeAreaName()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_SubAdministrativeAreaName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubAdministrativeAreaType#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getLocality()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubAdministrativeAreaType#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getPostOffice()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubAdministrativeAreaType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getPostalCode()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EReference getSubAdministrativeAreaType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubAdministrativeAreaType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getAny()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubAdministrativeAreaType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getIndicator()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubAdministrativeAreaType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getType()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubAdministrativeAreaType#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getUsageType()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_UsageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubAdministrativeAreaType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SubAdministrativeAreaType#getAnyAttribute()
	 * @see #getSubAdministrativeAreaType()
	 * @generated
	 */
	EAttribute getSubAdministrativeAreaType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubPremiseLocationType <em>Sub Premise Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Location Type</em>'.
	 * @see org.oasis.xAL.SubPremiseLocationType
	 * @generated
	 */
	EClass getSubPremiseLocationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseLocationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.SubPremiseLocationType#getMixed()
	 * @see #getSubPremiseLocationType()
	 * @generated
	 */
	EAttribute getSubPremiseLocationType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseLocationType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SubPremiseLocationType#getCode()
	 * @see #getSubPremiseLocationType()
	 * @generated
	 */
	EAttribute getSubPremiseLocationType_Code();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubPremiseNameType <em>Sub Premise Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Name Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNameType
	 * @generated
	 */
	EClass getSubPremiseNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.SubPremiseNameType#getMixed()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SubPremiseNameType#getCode()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNameType#getType()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Occurrence</em>'.
	 * @see org.oasis.xAL.SubPremiseNameType#getTypeOccurrence()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_TypeOccurrence();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SubPremiseNameType#getAnyAttribute()
	 * @see #getSubPremiseNameType()
	 * @generated
	 */
	EAttribute getSubPremiseNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubPremiseNumberPrefixType <em>Sub Premise Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Prefix Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberPrefixType
	 * @generated
	 */
	EClass getSubPremiseNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberPrefixType#getMixed()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberPrefixType#getCode()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberPrefixType#getType()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberPrefixType#getAnyAttribute()
	 * @see #getSubPremiseNumberPrefixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubPremiseNumberSuffixType <em>Sub Premise Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Suffix Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberSuffixType
	 * @generated
	 */
	EClass getSubPremiseNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberSuffixType#getMixed()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberSuffixType#getCode()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberSuffixType#getType()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberSuffixType#getAnyAttribute()
	 * @see #getSubPremiseNumberSuffixType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubPremiseNumberType <em>Sub Premise Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Number Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType
	 * @generated
	 */
	EClass getSubPremiseNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getMixed()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getCode()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getIndicator()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getIndicatorOccurrence()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type Occurrence</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getNumberTypeOccurrence()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_NumberTypeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberType#getPremiseNumberSeparator <em>Premise Number Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premise Number Separator</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getPremiseNumberSeparator()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_PremiseNumberSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getType()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SubPremiseNumberType#getAnyAttribute()
	 * @see #getSubPremiseNumberType()
	 * @generated
	 */
	EAttribute getSubPremiseNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SubPremiseType <em>Sub Premise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Premise Type</em>'.
	 * @see org.oasis.xAL.SubPremiseType
	 * @generated
	 */
	EClass getSubPremiseType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubPremiseType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getAddressLine()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubPremiseType#getSubPremiseName <em>Sub Premise Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Name</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getSubPremiseName()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubPremiseType#getSubPremiseLocation <em>Sub Premise Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Premise Location</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getSubPremiseLocation()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubPremiseType#getSubPremiseNumber <em>Sub Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getSubPremiseNumber()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubPremiseType#getSubPremiseNumberPrefix <em>Sub Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number Prefix</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getSubPremiseNumberPrefix()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubPremiseType#getSubPremiseNumberSuffix <em>Sub Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Premise Number Suffix</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getSubPremiseNumberSuffix()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.SubPremiseType#getBuildingName <em>Building Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Building Name</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getBuildingName()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_BuildingName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubPremiseType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getFirm()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubPremiseType#getMailStop <em>Mail Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mail Stop</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getMailStop()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_MailStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubPremiseType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getPostalCode()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.SubPremiseType#getSubPremise <em>Sub Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Premise</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getSubPremise()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EReference getSubPremiseType_SubPremise();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getAny()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SubPremiseType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getType()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SubPremiseType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SubPremiseType#getAnyAttribute()
	 * @see #getSubPremiseType()
	 * @generated
	 */
	EAttribute getSubPremiseType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.SupplementaryPostalServiceDataType <em>Supplementary Postal Service Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplementary Postal Service Data Type</em>'.
	 * @see org.oasis.xAL.SupplementaryPostalServiceDataType
	 * @generated
	 */
	EClass getSupplementaryPostalServiceDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SupplementaryPostalServiceDataType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.SupplementaryPostalServiceDataType#getMixed()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SupplementaryPostalServiceDataType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.SupplementaryPostalServiceDataType#getCode()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.SupplementaryPostalServiceDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.SupplementaryPostalServiceDataType#getType()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.SupplementaryPostalServiceDataType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.SupplementaryPostalServiceDataType#getAnyAttribute()
	 * @see #getSupplementaryPostalServiceDataType()
	 * @generated
	 */
	EAttribute getSupplementaryPostalServiceDataType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareLeadingTypeType <em>Thoroughfare Leading Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Leading Type Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareLeadingTypeType
	 * @generated
	 */
	EClass getThoroughfareLeadingTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareLeadingTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareLeadingTypeType#getMixed()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareLeadingTypeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareLeadingTypeType#getCode()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareLeadingTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareLeadingTypeType#getType()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareLeadingTypeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareLeadingTypeType#getAnyAttribute()
	 * @see #getThoroughfareLeadingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareLeadingTypeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareNameType <em>Thoroughfare Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Name Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNameType
	 * @generated
	 */
	EClass getThoroughfareNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareNameType#getMixed()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNameType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareNameType#getCode()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNameType#getType()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNameType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareNameType#getAnyAttribute()
	 * @see #getThoroughfareNameType()
	 * @generated
	 */
	EAttribute getThoroughfareNameType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareNumberFromType <em>Thoroughfare Number From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number From Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType
	 * @generated
	 */
	EClass getThoroughfareNumberFromType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberFromType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType#getMixed()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberFromType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType#getAddressLine()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumber()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EReference getThoroughfareNumberFromType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberFromType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType#getCode()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberFromType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberFromType#getAnyAttribute()
	 * @see #getThoroughfareNumberFromType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberFromType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareNumberPrefixType <em>Thoroughfare Number Prefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Prefix Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberPrefixType
	 * @generated
	 */
	EClass getThoroughfareNumberPrefixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberPrefixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberPrefixType#getMixed()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberPrefixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberPrefixType#getCode()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberPrefixType#getNumberPrefixSeparator <em>Number Prefix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Prefix Separator</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberPrefixType#getNumberPrefixSeparator()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_NumberPrefixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberPrefixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberPrefixType#getType()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberPrefixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberPrefixType#getAnyAttribute()
	 * @see #getThoroughfareNumberPrefixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberPrefixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareNumberRangeType <em>Thoroughfare Number Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Range Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType
	 * @generated
	 */
	EClass getThoroughfareNumberRangeType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getAddressLine()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberFrom <em>Thoroughfare Number From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number From</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberFrom()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_ThoroughfareNumberFrom();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberTo <em>Thoroughfare Number To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number To</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getThoroughfareNumberTo()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EReference getThoroughfareNumberRangeType_ThoroughfareNumberTo();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getCode()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getIndicator()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getIndicatorOccurrence()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence <em>Number Range Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Range Occurrence</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getNumberRangeOccurrence()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_NumberRangeOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getRangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getRangeType()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_RangeType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getSeparator()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Separator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getType()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberRangeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberRangeType#getAnyAttribute()
	 * @see #getThoroughfareNumberRangeType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberRangeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareNumberSuffixType <em>Thoroughfare Number Suffix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Suffix Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberSuffixType
	 * @generated
	 */
	EClass getThoroughfareNumberSuffixType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberSuffixType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberSuffixType#getMixed()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberSuffixType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberSuffixType#getCode()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberSuffixType#getNumberSuffixSeparator <em>Number Suffix Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Suffix Separator</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberSuffixType#getNumberSuffixSeparator()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_NumberSuffixSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberSuffixType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberSuffixType#getType()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberSuffixType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberSuffixType#getAnyAttribute()
	 * @see #getThoroughfareNumberSuffixType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberSuffixType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareNumberToType <em>Thoroughfare Number To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number To Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType
	 * @generated
	 */
	EClass getThoroughfareNumberToType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberToType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType#getMixed()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberToType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType#getAddressLine()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_AddressLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberToType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberToType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType#getThoroughfareNumber()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareNumberToType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EReference getThoroughfareNumberToType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberToType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType#getCode()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberToType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberToType#getAnyAttribute()
	 * @see #getThoroughfareNumberToType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberToType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareNumberType <em>Thoroughfare Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Number Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType
	 * @generated
	 */
	EClass getThoroughfareNumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getMixed()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getCode()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getIndicator()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator Occurrence</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getIndicatorOccurrence()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_IndicatorOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberOccurrence <em>Number Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Occurrence</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getNumberOccurrence()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_NumberOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberType#getNumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getNumberType()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_NumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareNumberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getType()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareNumberType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareNumberType#getAnyAttribute()
	 * @see #getThoroughfareNumberType()
	 * @generated
	 */
	EAttribute getThoroughfareNumberType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfarePostDirectionType <em>Thoroughfare Post Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Post Direction Type</em>'.
	 * @see org.oasis.xAL.ThoroughfarePostDirectionType
	 * @generated
	 */
	EClass getThoroughfarePostDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfarePostDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfarePostDirectionType#getMixed()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfarePostDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfarePostDirectionType#getCode()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfarePostDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfarePostDirectionType#getType()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfarePostDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfarePostDirectionType#getAnyAttribute()
	 * @see #getThoroughfarePostDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePostDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfarePreDirectionType <em>Thoroughfare Pre Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Pre Direction Type</em>'.
	 * @see org.oasis.xAL.ThoroughfarePreDirectionType
	 * @generated
	 */
	EClass getThoroughfarePreDirectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfarePreDirectionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfarePreDirectionType#getMixed()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfarePreDirectionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfarePreDirectionType#getCode()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfarePreDirectionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfarePreDirectionType#getType()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfarePreDirectionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfarePreDirectionType#getAnyAttribute()
	 * @see #getThoroughfarePreDirectionType()
	 * @generated
	 */
	EAttribute getThoroughfarePreDirectionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareTrailingTypeType <em>Thoroughfare Trailing Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Trailing Type Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareTrailingTypeType
	 * @generated
	 */
	EClass getThoroughfareTrailingTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareTrailingTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.ThoroughfareTrailingTypeType#getMixed()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareTrailingTypeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareTrailingTypeType#getCode()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareTrailingTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareTrailingTypeType#getType()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareTrailingTypeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareTrailingTypeType#getAnyAttribute()
	 * @see #getThoroughfareTrailingTypeType()
	 * @generated
	 */
	EAttribute getThoroughfareTrailingTypeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.ThoroughfareType <em>Thoroughfare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thoroughfare Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareType
	 * @generated
	 */
	EClass getThoroughfareType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareType#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Line</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getAddressLine()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_AddressLine();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getGroup()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfareNumber()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumberRange <em>Thoroughfare Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Range</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfareNumberRange()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberRange();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Prefix</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfareNumberPrefix()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Number Suffix</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfareNumberSuffix()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Pre Direction</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfarePreDirection()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfarePreDirection();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Leading Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfareLeadingType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareLeadingType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareName <em>Thoroughfare Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thoroughfare Name</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfareName()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Trailing Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfareTrailingType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfareTrailingType();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Post Direction</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getThoroughfarePostDirection()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_ThoroughfarePostDirection();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfare <em>Dependent Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Thoroughfare</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getDependentThoroughfare()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_DependentThoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getDependentLocality <em>Dependent Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent Locality</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getDependentLocality()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_DependentLocality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getPremise()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getFirm <em>Firm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firm</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getFirm()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_Firm();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.ThoroughfareType#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getPostalCode()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EReference getThoroughfareType_PostalCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getAny()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfares <em>Dependent Thoroughfares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getDependentThoroughfares()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfares();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresConnector <em>Dependent Thoroughfares Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Connector</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresConnector()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresIndicator <em>Dependent Thoroughfares Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Indicator</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresIndicator()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresIndicator();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Thoroughfares Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getDependentThoroughfaresType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_DependentThoroughfaresType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.ThoroughfareType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getType()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.ThoroughfareType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.ThoroughfareType#getAnyAttribute()
	 * @see #getThoroughfareType()
	 * @generated
	 */
	EAttribute getThoroughfareType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasis.xAL.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasis.xAL.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasis.xAL.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Details</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getAddressDetails()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressDetails();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getAddressLine <em>Address Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Line</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getAddressLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressLine();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getAdministrativeArea <em>Administrative Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrative Area</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getAdministrativeArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdministrativeArea();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Country Name</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getCountryName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CountryName();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Department</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getDepartment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Department();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getLocality <em>Locality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locality</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getLocality()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Locality();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postal Code</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getPostalCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostalCode();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Box</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getPostBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostBox();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getPostOffice <em>Post Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Office</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getPostOffice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PostOffice();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getPremise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getPremise()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Premise();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getPremiseNumber <em>Premise Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getPremiseNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getPremiseNumberPrefix <em>Premise Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Prefix</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getPremiseNumberPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getPremiseNumberSuffix <em>Premise Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Premise Number Suffix</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getPremiseNumberSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PremiseNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getThoroughfare <em>Thoroughfare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getThoroughfare()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Thoroughfare();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumber <em>Thoroughfare Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getThoroughfareNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number Prefix</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getThoroughfareNumberPrefix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumberPrefix();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thoroughfare Number Suffix</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getThoroughfareNumberSuffix()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ThoroughfareNumberSuffix();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasis.xAL.DocumentRoot#getXAL <em>XAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XAL</em>'.
	 * @see org.oasis.xAL.DocumentRoot#getXAL()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XAL();

	/**
	 * Returns the meta object for class '{@link org.oasis.xAL.XALType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.oasis.xAL.XALType
	 * @generated
	 */
	EClass getXALType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.oasis.xAL.XALType#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Details</em>'.
	 * @see org.oasis.xAL.XALType#getAddressDetails()
	 * @see #getXALType()
	 * @generated
	 */
	EReference getXALType_AddressDetails();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.XALType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.oasis.xAL.XALType#getAny()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.oasis.xAL.XALType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.oasis.xAL.XALType#getVersion()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_Version();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasis.xAL.XALType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.oasis.xAL.XALType#getAnyAttribute()
	 * @see #getXALType()
	 * @generated
	 */
	EAttribute getXALType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.DependentThoroughfaresType <em>Dependent Thoroughfares Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependent Thoroughfares Type</em>'.
	 * @see org.oasis.xAL.DependentThoroughfaresType
	 * @generated
	 */
	EEnum getDependentThoroughfaresType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.IndicatorOccurenceType <em>Indicator Occurence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurence Type</em>'.
	 * @see org.oasis.xAL.IndicatorOccurenceType
	 * @generated
	 */
	EEnum getIndicatorOccurenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.IndicatorOccurrenceType <em>Indicator Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.IndicatorOccurrenceType1 <em>Indicator Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type1</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType1
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.IndicatorOccurrenceType2 <em>Indicator Occurrence Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type2</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType2
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType2();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.IndicatorOccurrenceType3 <em>Indicator Occurrence Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type3</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType3
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType3();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.IndicatorOccurrenceType4 <em>Indicator Occurrence Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Indicator Occurrence Type4</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType4
	 * @generated
	 */
	EEnum getIndicatorOccurrenceType4();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NameNumberOccurrenceType <em>Name Number Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Number Occurrence Type</em>'.
	 * @see org.oasis.xAL.NameNumberOccurrenceType
	 * @generated
	 */
	EEnum getNameNumberOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NumberOccurrenceType <em>Number Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Occurrence Type</em>'.
	 * @see org.oasis.xAL.NumberOccurrenceType
	 * @generated
	 */
	EEnum getNumberOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NumberRangeOccurenceType <em>Number Range Occurence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Range Occurence Type</em>'.
	 * @see org.oasis.xAL.NumberRangeOccurenceType
	 * @generated
	 */
	EEnum getNumberRangeOccurenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NumberRangeOccurrenceType <em>Number Range Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Range Occurrence Type</em>'.
	 * @see org.oasis.xAL.NumberRangeOccurrenceType
	 * @generated
	 */
	EEnum getNumberRangeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NumberTypeOccurrenceType <em>Number Type Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Occurrence Type</em>'.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType
	 * @generated
	 */
	EEnum getNumberTypeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Occurrence Type1</em>'.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType1
	 * @generated
	 */
	EEnum getNumberTypeOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NumberTypeType <em>Number Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Type</em>'.
	 * @see org.oasis.xAL.NumberTypeType
	 * @generated
	 */
	EEnum getNumberTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.NumberTypeType1 <em>Number Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Type1</em>'.
	 * @see org.oasis.xAL.NumberTypeType1
	 * @generated
	 */
	EEnum getNumberTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.RangeTypeType <em>Range Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Type Type</em>'.
	 * @see org.oasis.xAL.RangeTypeType
	 * @generated
	 */
	EEnum getRangeTypeType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.TypeOccurrenceType <em>Type Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type</em>'.
	 * @see org.oasis.xAL.TypeOccurrenceType
	 * @generated
	 */
	EEnum getTypeOccurrenceType();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.TypeOccurrenceType1 <em>Type Occurrence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type1</em>'.
	 * @see org.oasis.xAL.TypeOccurrenceType1
	 * @generated
	 */
	EEnum getTypeOccurrenceType1();

	/**
	 * Returns the meta object for enum '{@link org.oasis.xAL.TypeOccurrenceType2 <em>Type Occurrence Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Occurrence Type2</em>'.
	 * @see org.oasis.xAL.TypeOccurrenceType2
	 * @generated
	 */
	EEnum getTypeOccurrenceType2();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.DependentThoroughfaresType <em>Dependent Thoroughfares Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dependent Thoroughfares Type Object</em>'.
	 * @see org.oasis.xAL.DependentThoroughfaresType
	 * @model instanceClass="org.oasis.xAL.DependentThoroughfaresType"
	 *        extendedMetaData="name='DependentThoroughfares_._type:Object' baseType='DependentThoroughfares_._type'"
	 * @generated
	 */
	EDataType getDependentThoroughfaresTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.IndicatorOccurenceType <em>Indicator Occurence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurence Type Object</em>'.
	 * @see org.oasis.xAL.IndicatorOccurenceType
	 * @model instanceClass="org.oasis.xAL.IndicatorOccurenceType"
	 *        extendedMetaData="name='IndicatorOccurence_._type:Object' baseType='IndicatorOccurence_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.IndicatorOccurrenceType1 <em>Indicator Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType1
	 * @model instanceClass="org.oasis.xAL.IndicatorOccurrenceType1"
	 *        extendedMetaData="name='IndicatorOccurrence_._1_._type:Object' baseType='IndicatorOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.IndicatorOccurrenceType2 <em>Indicator Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object1</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType2
	 * @model instanceClass="org.oasis.xAL.IndicatorOccurrenceType2"
	 *        extendedMetaData="name='IndicatorOccurrence_._2_._type:Object' baseType='IndicatorOccurrence_._2_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.IndicatorOccurrenceType <em>Indicator Occurrence Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object2</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType
	 * @model instanceClass="org.oasis.xAL.IndicatorOccurrenceType"
	 *        extendedMetaData="name='IndicatorOccurrence_._type:Object' baseType='IndicatorOccurrence_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.IndicatorOccurrenceType3 <em>Indicator Occurrence Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object3</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType3
	 * @model instanceClass="org.oasis.xAL.IndicatorOccurrenceType3"
	 *        extendedMetaData="name='IndicatorOccurrence_._3_._type:Object' baseType='IndicatorOccurrence_._3_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject3();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.IndicatorOccurrenceType4 <em>Indicator Occurrence Type Object4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Indicator Occurrence Type Object4</em>'.
	 * @see org.oasis.xAL.IndicatorOccurrenceType4
	 * @model instanceClass="org.oasis.xAL.IndicatorOccurrenceType4"
	 *        extendedMetaData="name='IndicatorOccurrence_._4_._type:Object' baseType='IndicatorOccurrence_._4_._type'"
	 * @generated
	 */
	EDataType getIndicatorOccurrenceTypeObject4();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NameNumberOccurrenceType <em>Name Number Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Number Occurrence Type Object</em>'.
	 * @see org.oasis.xAL.NameNumberOccurrenceType
	 * @model instanceClass="org.oasis.xAL.NameNumberOccurrenceType"
	 *        extendedMetaData="name='NameNumberOccurrence_._type:Object' baseType='NameNumberOccurrence_._type'"
	 * @generated
	 */
	EDataType getNameNumberOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NumberOccurrenceType <em>Number Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Occurrence Type Object</em>'.
	 * @see org.oasis.xAL.NumberOccurrenceType
	 * @model instanceClass="org.oasis.xAL.NumberOccurrenceType"
	 *        extendedMetaData="name='NumberOccurrence_._type:Object' baseType='NumberOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NumberRangeOccurenceType <em>Number Range Occurence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Range Occurence Type Object</em>'.
	 * @see org.oasis.xAL.NumberRangeOccurenceType
	 * @model instanceClass="org.oasis.xAL.NumberRangeOccurenceType"
	 *        extendedMetaData="name='NumberRangeOccurence_._type:Object' baseType='NumberRangeOccurence_._type'"
	 * @generated
	 */
	EDataType getNumberRangeOccurenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NumberRangeOccurrenceType <em>Number Range Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Range Occurrence Type Object</em>'.
	 * @see org.oasis.xAL.NumberRangeOccurrenceType
	 * @model instanceClass="org.oasis.xAL.NumberRangeOccurrenceType"
	 *        extendedMetaData="name='NumberRangeOccurrence_._type:Object' baseType='NumberRangeOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberRangeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NumberTypeOccurrenceType <em>Number Type Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Occurrence Type Object</em>'.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType
	 * @model instanceClass="org.oasis.xAL.NumberTypeOccurrenceType"
	 *        extendedMetaData="name='NumberTypeOccurrence_._type:Object' baseType='NumberTypeOccurrence_._type'"
	 * @generated
	 */
	EDataType getNumberTypeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NumberTypeOccurrenceType1 <em>Number Type Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Occurrence Type Object1</em>'.
	 * @see org.oasis.xAL.NumberTypeOccurrenceType1
	 * @model instanceClass="org.oasis.xAL.NumberTypeOccurrenceType1"
	 *        extendedMetaData="name='NumberTypeOccurrence_._1_._type:Object' baseType='NumberTypeOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getNumberTypeOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NumberTypeType <em>Number Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Type Object</em>'.
	 * @see org.oasis.xAL.NumberTypeType
	 * @model instanceClass="org.oasis.xAL.NumberTypeType"
	 *        extendedMetaData="name='NumberType_._type:Object' baseType='NumberType_._type'"
	 * @generated
	 */
	EDataType getNumberTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.NumberTypeType1 <em>Number Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number Type Type Object1</em>'.
	 * @see org.oasis.xAL.NumberTypeType1
	 * @model instanceClass="org.oasis.xAL.NumberTypeType1"
	 *        extendedMetaData="name='NumberType_._1_._type:Object' baseType='NumberType_._1_._type'"
	 * @generated
	 */
	EDataType getNumberTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.RangeTypeType <em>Range Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Range Type Type Object</em>'.
	 * @see org.oasis.xAL.RangeTypeType
	 * @model instanceClass="org.oasis.xAL.RangeTypeType"
	 *        extendedMetaData="name='RangeType_._type:Object' baseType='RangeType_._type'"
	 * @generated
	 */
	EDataType getRangeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.TypeOccurrenceType <em>Type Occurrence Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object</em>'.
	 * @see org.oasis.xAL.TypeOccurrenceType
	 * @model instanceClass="org.oasis.xAL.TypeOccurrenceType"
	 *        extendedMetaData="name='TypeOccurrence_._type:Object' baseType='TypeOccurrence_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.TypeOccurrenceType1 <em>Type Occurrence Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object1</em>'.
	 * @see org.oasis.xAL.TypeOccurrenceType1
	 * @model instanceClass="org.oasis.xAL.TypeOccurrenceType1"
	 *        extendedMetaData="name='TypeOccurrence_._1_._type:Object' baseType='TypeOccurrence_._1_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.oasis.xAL.TypeOccurrenceType2 <em>Type Occurrence Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Occurrence Type Object2</em>'.
	 * @see org.oasis.xAL.TypeOccurrenceType2
	 * @model instanceClass="org.oasis.xAL.TypeOccurrenceType2"
	 *        extendedMetaData="name='TypeOccurrence_._2_._type:Object' baseType='TypeOccurrence_._2_._type'"
	 * @generated
	 */
	EDataType getTypeOccurrenceTypeObject2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XALFactory getXALFactory();

} //XALPackage
