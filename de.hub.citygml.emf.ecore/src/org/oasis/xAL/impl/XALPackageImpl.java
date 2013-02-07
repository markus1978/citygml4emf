/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.impl;

import java.io.IOException;
import java.net.URL;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.impl.AppearancePackageImpl;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.impl.BuildingPackageImpl;
import net.opengis.citygml.cityfurniture.CityfurniturePackage;
import net.opengis.citygml.cityfurniture.impl.CityfurniturePackageImpl;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage;
import net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl;
import net.opengis.citygml.generics.GenericsPackage;
import net.opengis.citygml.generics.impl.GenericsPackageImpl;
import net.opengis.citygml.impl.CitygmlPackageImpl;
import net.opengis.citygml.landuse.LandusePackage;
import net.opengis.citygml.landuse.impl.LandusePackageImpl;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.citygml.relief.impl.ReliefPackageImpl;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;
import net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl;
import net.opengis.citygml.transportation.TransportationPackage;
import net.opengis.citygml.transportation.impl.TransportationPackageImpl;
import net.opengis.citygml.vegetation.VegetationPackage;
import net.opengis.citygml.vegetation.impl.VegetationPackageImpl;
import net.opengis.citygml.waterbody.WaterbodyPackage;
import net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.impl.GmlPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasis.xAL.XALFactory;
import org.oasis.xAL.XALPackage;
import org.w3._1999.xlink.XlinkPackage;
import org.w3._1999.xlink.impl.XlinkPackageImpl;
import org.w3._2001.smil20.Smil20Package;
import org.w3._2001.smil20.impl.Smil20PackageImpl;
import org.w3._2001.smil20.language.LanguagePackage;
import org.w3._2001.smil20.language.impl.LanguagePackageImpl;
import org.w3.xml._1998.namespace.NamespacePackage;
import org.w3.xml._1998.namespace.impl.NamespacePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XALPackageImpl extends EPackageImpl implements XALPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "xAL.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLatitudeDirectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLatitudeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLinesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLongitudeDirectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressLongitudeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeAreaNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeAreaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barcodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryNameCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentLocalityNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentLocalityNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentLocalityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentThoroughfareTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endorsementLineCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyLineCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeMailUserIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeMailUserNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeMailUserTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localityNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mailStopNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mailStopNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mailStopTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalCodeNumberExtensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalCodeNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalRouteNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalRouteNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalRouteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalServiceElementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postBoxNumberExtensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postBoxNumberPrefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postBoxNumberSuffixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postBoxNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postOfficeNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postOfficeNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postOfficeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postTownNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postTownSuffixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postTownTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseNumberPrefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseNumberRangeFromTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseNumberRangeToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseNumberRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseNumberSuffixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortingCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subAdministrativeAreaNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subAdministrativeAreaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPremiseLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPremiseNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPremiseNumberPrefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPremiseNumberSuffixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPremiseNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPremiseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplementaryPostalServiceDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareLeadingTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareNumberFromTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareNumberPrefixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareNumberRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareNumberSuffixTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareNumberToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfarePostDirectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfarePreDirectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareTrailingTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thoroughfareTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependentThoroughfaresTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicatorOccurenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicatorOccurrenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicatorOccurrenceType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicatorOccurrenceType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicatorOccurrenceType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicatorOccurrenceType4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameNumberOccurrenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberOccurrenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberRangeOccurenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberRangeOccurrenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberTypeOccurrenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberTypeOccurrenceType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberTypeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rangeTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOccurrenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOccurrenceType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOccurrenceType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dependentThoroughfaresTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indicatorOccurenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indicatorOccurrenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indicatorOccurrenceTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indicatorOccurrenceTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indicatorOccurrenceTypeObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType indicatorOccurrenceTypeObject4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameNumberOccurrenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberOccurrenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberRangeOccurenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberRangeOccurrenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberTypeOccurrenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberTypeOccurrenceTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberTypeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rangeTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeOccurrenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeOccurrenceTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeOccurrenceTypeObject2EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.oasis.xAL.XALPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XALPackageImpl() {
		super(eNS_URI, XALFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link XALPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static XALPackage init() {
		if (isInited) return (XALPackage)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI);

		// Obtain or create and register package
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XALPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) : BuildingPackage.eINSTANCE);
		CitygmlPackageImpl theCitygmlPackage = (CitygmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) instanceof CitygmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) : CitygmlPackage.eINSTANCE);
		GmlPackageImpl theGmlPackage = (GmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) instanceof GmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) : GmlPackage.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		TexturedsurfacePackageImpl theTexturedsurfacePackage = (TexturedsurfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TexturedsurfacePackage.eNS_URI) instanceof TexturedsurfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TexturedsurfacePackage.eNS_URI) : TexturedsurfacePackage.eINSTANCE);
		AppearancePackageImpl theAppearancePackage = (AppearancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AppearancePackage.eNS_URI) instanceof AppearancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AppearancePackage.eNS_URI) : AppearancePackage.eINSTANCE);
		TransportationPackageImpl theTransportationPackage = (TransportationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransportationPackage.eNS_URI) instanceof TransportationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransportationPackage.eNS_URI) : TransportationPackage.eINSTANCE);
		ReliefPackageImpl theReliefPackage = (ReliefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReliefPackage.eNS_URI) instanceof ReliefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReliefPackage.eNS_URI) : ReliefPackage.eINSTANCE);
		CityfurniturePackageImpl theCityfurniturePackage = (CityfurniturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CityfurniturePackage.eNS_URI) instanceof CityfurniturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CityfurniturePackage.eNS_URI) : CityfurniturePackage.eINSTANCE);
		CityobjectgroupPackageImpl theCityobjectgroupPackage = (CityobjectgroupPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CityobjectgroupPackage.eNS_URI) instanceof CityobjectgroupPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CityobjectgroupPackage.eNS_URI) : CityobjectgroupPackage.eINSTANCE);
		LandusePackageImpl theLandusePackage = (LandusePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LandusePackage.eNS_URI) instanceof LandusePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LandusePackage.eNS_URI) : LandusePackage.eINSTANCE);
		VegetationPackageImpl theVegetationPackage = (VegetationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VegetationPackage.eNS_URI) instanceof VegetationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VegetationPackage.eNS_URI) : VegetationPackage.eINSTANCE);
		WaterbodyPackageImpl theWaterbodyPackage = (WaterbodyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WaterbodyPackage.eNS_URI) instanceof WaterbodyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WaterbodyPackage.eNS_URI) : WaterbodyPackage.eINSTANCE);
		GenericsPackageImpl theGenericsPackage = (GenericsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) instanceof GenericsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) : GenericsPackage.eINSTANCE);
		Smil20PackageImpl theSmil20Package = (Smil20PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Smil20Package.eNS_URI) instanceof Smil20PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Smil20Package.eNS_URI) : Smil20Package.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);

		// Load packages
		theXALPackage.loadPackage();
		theGmlPackage.loadPackage();

		// Create package meta-data objects
		theBuildingPackage.createPackageContents();
		theCitygmlPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
		theTexturedsurfacePackage.createPackageContents();
		theAppearancePackage.createPackageContents();
		theTransportationPackage.createPackageContents();
		theReliefPackage.createPackageContents();
		theCityfurniturePackage.createPackageContents();
		theCityobjectgroupPackage.createPackageContents();
		theLandusePackage.createPackageContents();
		theVegetationPackage.createPackageContents();
		theWaterbodyPackage.createPackageContents();
		theGenericsPackage.createPackageContents();
		theSmil20Package.createPackageContents();
		theLanguagePackage.createPackageContents();
		theNamespacePackage.createPackageContents();

		// Initialize created meta-data
		theBuildingPackage.initializePackageContents();
		theCitygmlPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theTexturedsurfacePackage.initializePackageContents();
		theAppearancePackage.initializePackageContents();
		theTransportationPackage.initializePackageContents();
		theReliefPackage.initializePackageContents();
		theCityfurniturePackage.initializePackageContents();
		theCityobjectgroupPackage.initializePackageContents();
		theLandusePackage.initializePackageContents();
		theVegetationPackage.initializePackageContents();
		theWaterbodyPackage.initializePackageContents();
		theGenericsPackage.initializePackageContents();
		theSmil20Package.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();

		// Fix loaded packages
		theXALPackage.fixPackageContents();
		theGmlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theXALPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XALPackage.eNS_URI, theXALPackage);
		return theXALPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressDetails() {
		if (addressDetailsEClass == null) {
			addressDetailsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(0);
		}
		return addressDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressDetails_PostalServiceElements() {
        return (EReference)getAddressDetails().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressDetails_Address() {
        return (EReference)getAddressDetails().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressDetails_AddressLines() {
        return (EReference)getAddressDetails().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressDetails_Country() {
        return (EReference)getAddressDetails().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressDetails_AdministrativeArea() {
        return (EReference)getAddressDetails().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressDetails_Locality() {
        return (EReference)getAddressDetails().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressDetails_Thoroughfare() {
        return (EReference)getAddressDetails().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_Any() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_AddressDetailsKey() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_AddressType() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_Code() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_CurrentStatus() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_Usage() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_ValidFromDate() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_ValidToDate() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressDetails_AnyAttribute() {
        return (EAttribute)getAddressDetails().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressIdentifierType() {
		if (addressIdentifierTypeEClass == null) {
			addressIdentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(1);
		}
		return addressIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressIdentifierType_Mixed() {
        return (EAttribute)getAddressIdentifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressIdentifierType_Code() {
        return (EAttribute)getAddressIdentifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressIdentifierType_IdentifierType() {
        return (EAttribute)getAddressIdentifierType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressIdentifierType_Type() {
        return (EAttribute)getAddressIdentifierType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressIdentifierType_AnyAttribute() {
        return (EAttribute)getAddressIdentifierType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressLatitudeDirectionType() {
		if (addressLatitudeDirectionTypeEClass == null) {
			addressLatitudeDirectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(2);
		}
		return addressLatitudeDirectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeDirectionType_Mixed() {
        return (EAttribute)getAddressLatitudeDirectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeDirectionType_Code() {
        return (EAttribute)getAddressLatitudeDirectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeDirectionType_Type() {
        return (EAttribute)getAddressLatitudeDirectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeDirectionType_AnyAttribute() {
        return (EAttribute)getAddressLatitudeDirectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressLatitudeType() {
		if (addressLatitudeTypeEClass == null) {
			addressLatitudeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(3);
		}
		return addressLatitudeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeType_Mixed() {
        return (EAttribute)getAddressLatitudeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeType_Code() {
        return (EAttribute)getAddressLatitudeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeType_Type() {
        return (EAttribute)getAddressLatitudeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLatitudeType_AnyAttribute() {
        return (EAttribute)getAddressLatitudeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressLinesType() {
		if (addressLinesTypeEClass == null) {
			addressLinesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(4);
		}
		return addressLinesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressLinesType_AddressLine() {
        return (EReference)getAddressLinesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLinesType_Any() {
        return (EAttribute)getAddressLinesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLinesType_AnyAttribute() {
        return (EAttribute)getAddressLinesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressLineType() {
		if (addressLineTypeEClass == null) {
			addressLineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(5);
		}
		return addressLineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLineType_Mixed() {
        return (EAttribute)getAddressLineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLineType_Code() {
        return (EAttribute)getAddressLineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLineType_Type() {
        return (EAttribute)getAddressLineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLineType_AnyAttribute() {
        return (EAttribute)getAddressLineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressLongitudeDirectionType() {
		if (addressLongitudeDirectionTypeEClass == null) {
			addressLongitudeDirectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(6);
		}
		return addressLongitudeDirectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeDirectionType_Mixed() {
        return (EAttribute)getAddressLongitudeDirectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeDirectionType_Code() {
        return (EAttribute)getAddressLongitudeDirectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeDirectionType_Type() {
        return (EAttribute)getAddressLongitudeDirectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeDirectionType_AnyAttribute() {
        return (EAttribute)getAddressLongitudeDirectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressLongitudeType() {
		if (addressLongitudeTypeEClass == null) {
			addressLongitudeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(7);
		}
		return addressLongitudeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeType_Mixed() {
        return (EAttribute)getAddressLongitudeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeType_Code() {
        return (EAttribute)getAddressLongitudeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeType_Type() {
        return (EAttribute)getAddressLongitudeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressLongitudeType_AnyAttribute() {
        return (EAttribute)getAddressLongitudeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		if (addressTypeEClass == null) {
			addressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(8);
		}
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Mixed() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Code() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Type() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_AnyAttribute() {
        return (EAttribute)getAddressType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativeAreaNameType() {
		if (administrativeAreaNameTypeEClass == null) {
			administrativeAreaNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(9);
		}
		return administrativeAreaNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaNameType_Mixed() {
        return (EAttribute)getAdministrativeAreaNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaNameType_Code() {
        return (EAttribute)getAdministrativeAreaNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaNameType_Type() {
        return (EAttribute)getAdministrativeAreaNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaNameType_AnyAttribute() {
        return (EAttribute)getAdministrativeAreaNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativeAreaType() {
		if (administrativeAreaTypeEClass == null) {
			administrativeAreaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(10);
		}
		return administrativeAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativeAreaType_AddressLine() {
        return (EReference)getAdministrativeAreaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativeAreaType_AdministrativeAreaName() {
        return (EReference)getAdministrativeAreaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativeAreaType_SubAdministrativeArea() {
        return (EReference)getAdministrativeAreaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativeAreaType_Locality() {
        return (EReference)getAdministrativeAreaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativeAreaType_PostOffice() {
        return (EReference)getAdministrativeAreaType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdministrativeAreaType_PostalCode() {
        return (EReference)getAdministrativeAreaType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaType_Any() {
        return (EAttribute)getAdministrativeAreaType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaType_Indicator() {
        return (EAttribute)getAdministrativeAreaType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaType_Type() {
        return (EAttribute)getAdministrativeAreaType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaType_UsageType() {
        return (EAttribute)getAdministrativeAreaType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeAreaType_AnyAttribute() {
        return (EAttribute)getAdministrativeAreaType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarcodeType() {
		if (barcodeTypeEClass == null) {
			barcodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(11);
		}
		return barcodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarcodeType_Mixed() {
        return (EAttribute)getBarcodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarcodeType_Code() {
        return (EAttribute)getBarcodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarcodeType_Type() {
        return (EAttribute)getBarcodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBarcodeType_AnyAttribute() {
        return (EAttribute)getBarcodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingNameType() {
		if (buildingNameTypeEClass == null) {
			buildingNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(12);
		}
		return buildingNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingNameType_Mixed() {
        return (EAttribute)getBuildingNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingNameType_Code() {
        return (EAttribute)getBuildingNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingNameType_Type() {
        return (EAttribute)getBuildingNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingNameType_TypeOccurrence() {
        return (EAttribute)getBuildingNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingNameType_AnyAttribute() {
        return (EAttribute)getBuildingNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountryNameCodeType() {
		if (countryNameCodeTypeEClass == null) {
			countryNameCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(13);
		}
		return countryNameCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameCodeType_Mixed() {
        return (EAttribute)getCountryNameCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameCodeType_Code() {
        return (EAttribute)getCountryNameCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameCodeType_Scheme() {
        return (EAttribute)getCountryNameCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameCodeType_AnyAttribute() {
        return (EAttribute)getCountryNameCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountryNameType() {
		if (countryNameTypeEClass == null) {
			countryNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(14);
		}
		return countryNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameType_Mixed() {
        return (EAttribute)getCountryNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameType_Code() {
        return (EAttribute)getCountryNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameType_Type() {
        return (EAttribute)getCountryNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryNameType_AnyAttribute() {
        return (EAttribute)getCountryNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountryType() {
		if (countryTypeEClass == null) {
			countryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(15);
		}
		return countryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryType_AddressLine() {
        return (EReference)getCountryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryType_CountryNameCode() {
        return (EReference)getCountryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryType_CountryName() {
        return (EReference)getCountryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryType_AdministrativeArea() {
        return (EReference)getCountryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryType_Locality() {
        return (EReference)getCountryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCountryType_Thoroughfare() {
        return (EReference)getCountryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryType_Any() {
        return (EAttribute)getCountryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryType_AnyAttribute() {
        return (EAttribute)getCountryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartmentNameType() {
		if (departmentNameTypeEClass == null) {
			departmentNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(16);
		}
		return departmentNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartmentNameType_Mixed() {
        return (EAttribute)getDepartmentNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartmentNameType_Code() {
        return (EAttribute)getDepartmentNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartmentNameType_Type() {
        return (EAttribute)getDepartmentNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartmentNameType_AnyAttribute() {
        return (EAttribute)getDepartmentNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartmentType() {
		if (departmentTypeEClass == null) {
			departmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(17);
		}
		return departmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartmentType_AddressLine() {
        return (EReference)getDepartmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartmentType_DepartmentName() {
        return (EReference)getDepartmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartmentType_MailStop() {
        return (EReference)getDepartmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartmentType_PostalCode() {
        return (EReference)getDepartmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartmentType_Any() {
        return (EAttribute)getDepartmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartmentType_Type() {
        return (EAttribute)getDepartmentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartmentType_AnyAttribute() {
        return (EAttribute)getDepartmentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentLocalityNameType() {
		if (dependentLocalityNameTypeEClass == null) {
			dependentLocalityNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(18);
		}
		return dependentLocalityNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNameType_Mixed() {
        return (EAttribute)getDependentLocalityNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNameType_Code() {
        return (EAttribute)getDependentLocalityNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNameType_Type() {
        return (EAttribute)getDependentLocalityNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNameType_AnyAttribute() {
        return (EAttribute)getDependentLocalityNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentLocalityNumberType() {
		if (dependentLocalityNumberTypeEClass == null) {
			dependentLocalityNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(19);
		}
		return dependentLocalityNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNumberType_Mixed() {
        return (EAttribute)getDependentLocalityNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNumberType_Code() {
        return (EAttribute)getDependentLocalityNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNumberType_NameNumberOccurrence() {
        return (EAttribute)getDependentLocalityNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityNumberType_AnyAttribute() {
        return (EAttribute)getDependentLocalityNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentLocalityType() {
		if (dependentLocalityTypeEClass == null) {
			dependentLocalityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(20);
		}
		return dependentLocalityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_AddressLine() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_DependentLocalityName() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_DependentLocalityNumber() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_PostBox() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_LargeMailUser() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_PostOffice() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_PostalRoute() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_Thoroughfare() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_Premise() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_DependentLocality() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentLocalityType_PostalCode() {
        return (EReference)getDependentLocalityType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityType_Any() {
        return (EAttribute)getDependentLocalityType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityType_Connector() {
        return (EAttribute)getDependentLocalityType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityType_Indicator() {
        return (EAttribute)getDependentLocalityType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityType_Type() {
        return (EAttribute)getDependentLocalityType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityType_UsageType() {
        return (EAttribute)getDependentLocalityType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentLocalityType_AnyAttribute() {
        return (EAttribute)getDependentLocalityType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependentThoroughfareType() {
		if (dependentThoroughfareTypeEClass == null) {
			dependentThoroughfareTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(23);
		}
		return dependentThoroughfareTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentThoroughfareType_AddressLine() {
        return (EReference)getDependentThoroughfareType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentThoroughfareType_ThoroughfarePreDirection() {
        return (EReference)getDependentThoroughfareType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentThoroughfareType_ThoroughfareLeadingType() {
        return (EReference)getDependentThoroughfareType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentThoroughfareType_ThoroughfareName() {
        return (EReference)getDependentThoroughfareType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentThoroughfareType_ThoroughfareTrailingType() {
        return (EReference)getDependentThoroughfareType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependentThoroughfareType_ThoroughfarePostDirection() {
        return (EReference)getDependentThoroughfareType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentThoroughfareType_Any() {
        return (EAttribute)getDependentThoroughfareType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentThoroughfareType_Type() {
        return (EAttribute)getDependentThoroughfareType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependentThoroughfareType_AnyAttribute() {
        return (EAttribute)getDependentThoroughfareType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndorsementLineCodeType() {
		if (endorsementLineCodeTypeEClass == null) {
			endorsementLineCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(24);
		}
		return endorsementLineCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndorsementLineCodeType_Mixed() {
        return (EAttribute)getEndorsementLineCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndorsementLineCodeType_Code() {
        return (EAttribute)getEndorsementLineCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndorsementLineCodeType_Type() {
        return (EAttribute)getEndorsementLineCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndorsementLineCodeType_AnyAttribute() {
        return (EAttribute)getEndorsementLineCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmNameType() {
		if (firmNameTypeEClass == null) {
			firmNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(25);
		}
		return firmNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmNameType_Mixed() {
        return (EAttribute)getFirmNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmNameType_Code() {
        return (EAttribute)getFirmNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmNameType_Type() {
        return (EAttribute)getFirmNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmNameType_AnyAttribute() {
        return (EAttribute)getFirmNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmType() {
		if (firmTypeEClass == null) {
			firmTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(26);
		}
		return firmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirmType_AddressLine() {
        return (EReference)getFirmType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirmType_FirmName() {
        return (EReference)getFirmType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirmType_Department() {
        return (EReference)getFirmType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirmType_MailStop() {
        return (EReference)getFirmType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirmType_PostalCode() {
        return (EReference)getFirmType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmType_Any() {
        return (EAttribute)getFirmType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmType_Type() {
        return (EAttribute)getFirmType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmType_AnyAttribute() {
        return (EAttribute)getFirmType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyLineCodeType() {
		if (keyLineCodeTypeEClass == null) {
			keyLineCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(39);
		}
		return keyLineCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyLineCodeType_Mixed() {
        return (EAttribute)getKeyLineCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyLineCodeType_Code() {
        return (EAttribute)getKeyLineCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyLineCodeType_Type() {
        return (EAttribute)getKeyLineCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyLineCodeType_AnyAttribute() {
        return (EAttribute)getKeyLineCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeMailUserIdentifierType() {
		if (largeMailUserIdentifierTypeEClass == null) {
			largeMailUserIdentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(40);
		}
		return largeMailUserIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserIdentifierType_Mixed() {
        return (EAttribute)getLargeMailUserIdentifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserIdentifierType_Code() {
        return (EAttribute)getLargeMailUserIdentifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserIdentifierType_Indicator() {
        return (EAttribute)getLargeMailUserIdentifierType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserIdentifierType_Type() {
        return (EAttribute)getLargeMailUserIdentifierType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserIdentifierType_AnyAttribute() {
        return (EAttribute)getLargeMailUserIdentifierType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeMailUserNameType() {
		if (largeMailUserNameTypeEClass == null) {
			largeMailUserNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(41);
		}
		return largeMailUserNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserNameType_Mixed() {
        return (EAttribute)getLargeMailUserNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserNameType_Code() {
        return (EAttribute)getLargeMailUserNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserNameType_Type() {
        return (EAttribute)getLargeMailUserNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserNameType_AnyAttribute() {
        return (EAttribute)getLargeMailUserNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeMailUserType() {
		if (largeMailUserTypeEClass == null) {
			largeMailUserTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(42);
		}
		return largeMailUserTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_AddressLine() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_LargeMailUserName() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_LargeMailUserIdentifier() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_BuildingName() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_Department() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_PostBox() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_Thoroughfare() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLargeMailUserType_PostalCode() {
        return (EReference)getLargeMailUserType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserType_Any() {
        return (EAttribute)getLargeMailUserType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserType_Type() {
        return (EAttribute)getLargeMailUserType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLargeMailUserType_AnyAttribute() {
        return (EAttribute)getLargeMailUserType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalityNameType() {
		if (localityNameTypeEClass == null) {
			localityNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(43);
		}
		return localityNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityNameType_Mixed() {
        return (EAttribute)getLocalityNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityNameType_Code() {
        return (EAttribute)getLocalityNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityNameType_Type() {
        return (EAttribute)getLocalityNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityNameType_AnyAttribute() {
        return (EAttribute)getLocalityNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalityType() {
		if (localityTypeEClass == null) {
			localityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(44);
		}
		return localityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_AddressLine() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_LocalityName() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_PostBox() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_LargeMailUser() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_PostOffice() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_PostalRoute() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_Thoroughfare() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_Premise() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_DependentLocality() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalityType_PostalCode() {
        return (EReference)getLocalityType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityType_Any() {
        return (EAttribute)getLocalityType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityType_Indicator() {
        return (EAttribute)getLocalityType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityType_Type() {
        return (EAttribute)getLocalityType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityType_UsageType() {
        return (EAttribute)getLocalityType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalityType_AnyAttribute() {
        return (EAttribute)getLocalityType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMailStopNameType() {
		if (mailStopNameTypeEClass == null) {
			mailStopNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(45);
		}
		return mailStopNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNameType_Mixed() {
        return (EAttribute)getMailStopNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNameType_Code() {
        return (EAttribute)getMailStopNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNameType_Type() {
        return (EAttribute)getMailStopNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNameType_AnyAttribute() {
        return (EAttribute)getMailStopNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMailStopNumberType() {
		if (mailStopNumberTypeEClass == null) {
			mailStopNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(46);
		}
		return mailStopNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNumberType_Mixed() {
        return (EAttribute)getMailStopNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNumberType_Code() {
        return (EAttribute)getMailStopNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNumberType_NameNumberSeparator() {
        return (EAttribute)getMailStopNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopNumberType_AnyAttribute() {
        return (EAttribute)getMailStopNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMailStopType() {
		if (mailStopTypeEClass == null) {
			mailStopTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(47);
		}
		return mailStopTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMailStopType_AddressLine() {
        return (EReference)getMailStopType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMailStopType_MailStopName() {
        return (EReference)getMailStopType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMailStopType_MailStopNumber() {
        return (EReference)getMailStopType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopType_Any() {
        return (EAttribute)getMailStopType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopType_Type() {
        return (EAttribute)getMailStopType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailStopType_AnyAttribute() {
        return (EAttribute)getMailStopType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalCodeNumberExtensionType() {
		if (postalCodeNumberExtensionTypeEClass == null) {
			postalCodeNumberExtensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(64);
		}
		return postalCodeNumberExtensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberExtensionType_Mixed() {
        return (EAttribute)getPostalCodeNumberExtensionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberExtensionType_Code() {
        return (EAttribute)getPostalCodeNumberExtensionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberExtensionType_NumberExtensionSeparator() {
        return (EAttribute)getPostalCodeNumberExtensionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberExtensionType_Type() {
        return (EAttribute)getPostalCodeNumberExtensionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberExtensionType_AnyAttribute() {
        return (EAttribute)getPostalCodeNumberExtensionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalCodeNumberType() {
		if (postalCodeNumberTypeEClass == null) {
			postalCodeNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(65);
		}
		return postalCodeNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberType_Mixed() {
        return (EAttribute)getPostalCodeNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberType_Code() {
        return (EAttribute)getPostalCodeNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberType_Type() {
        return (EAttribute)getPostalCodeNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeNumberType_AnyAttribute() {
        return (EAttribute)getPostalCodeNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalCodeType() {
		if (postalCodeTypeEClass == null) {
			postalCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(66);
		}
		return postalCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalCodeType_AddressLine() {
        return (EReference)getPostalCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalCodeType_PostalCodeNumber() {
        return (EReference)getPostalCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalCodeType_PostalCodeNumberExtension() {
        return (EReference)getPostalCodeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalCodeType_PostTown() {
        return (EReference)getPostalCodeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeType_Any() {
        return (EAttribute)getPostalCodeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeType_Type() {
        return (EAttribute)getPostalCodeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalCodeType_AnyAttribute() {
        return (EAttribute)getPostalCodeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalRouteNameType() {
		if (postalRouteNameTypeEClass == null) {
			postalRouteNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(67);
		}
		return postalRouteNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteNameType_Mixed() {
        return (EAttribute)getPostalRouteNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteNameType_Code() {
        return (EAttribute)getPostalRouteNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteNameType_Type() {
        return (EAttribute)getPostalRouteNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteNameType_AnyAttribute() {
        return (EAttribute)getPostalRouteNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalRouteNumberType() {
		if (postalRouteNumberTypeEClass == null) {
			postalRouteNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(68);
		}
		return postalRouteNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteNumberType_Mixed() {
        return (EAttribute)getPostalRouteNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteNumberType_Code() {
        return (EAttribute)getPostalRouteNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteNumberType_AnyAttribute() {
        return (EAttribute)getPostalRouteNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalRouteType() {
		if (postalRouteTypeEClass == null) {
			postalRouteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(69);
		}
		return postalRouteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalRouteType_AddressLine() {
        return (EReference)getPostalRouteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalRouteType_PostalRouteName() {
        return (EReference)getPostalRouteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalRouteType_PostalRouteNumber() {
        return (EReference)getPostalRouteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalRouteType_PostBox() {
        return (EReference)getPostalRouteType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteType_Any() {
        return (EAttribute)getPostalRouteType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteType_Type() {
        return (EAttribute)getPostalRouteType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalRouteType_AnyAttribute() {
        return (EAttribute)getPostalRouteType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalServiceElementsType() {
		if (postalServiceElementsTypeEClass == null) {
			postalServiceElementsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(70);
		}
		return postalServiceElementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_AddressIdentifier() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_EndorsementLineCode() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_KeyLineCode() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_Barcode() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_SortingCode() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_AddressLatitude() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_AddressLatitudeDirection() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_AddressLongitude() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_AddressLongitudeDirection() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostalServiceElementsType_SupplementaryPostalServiceData() {
        return (EReference)getPostalServiceElementsType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalServiceElementsType_Any() {
        return (EAttribute)getPostalServiceElementsType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalServiceElementsType_Type() {
        return (EAttribute)getPostalServiceElementsType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalServiceElementsType_AnyAttribute() {
        return (EAttribute)getPostalServiceElementsType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostBoxNumberExtensionType() {
		if (postBoxNumberExtensionTypeEClass == null) {
			postBoxNumberExtensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(71);
		}
		return postBoxNumberExtensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberExtensionType_Mixed() {
        return (EAttribute)getPostBoxNumberExtensionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberExtensionType_NumberExtensionSeparator() {
        return (EAttribute)getPostBoxNumberExtensionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberExtensionType_AnyAttribute() {
        return (EAttribute)getPostBoxNumberExtensionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostBoxNumberPrefixType() {
		if (postBoxNumberPrefixTypeEClass == null) {
			postBoxNumberPrefixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(72);
		}
		return postBoxNumberPrefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberPrefixType_Mixed() {
        return (EAttribute)getPostBoxNumberPrefixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberPrefixType_Code() {
        return (EAttribute)getPostBoxNumberPrefixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberPrefixType_NumberPrefixSeparator() {
        return (EAttribute)getPostBoxNumberPrefixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberPrefixType_AnyAttribute() {
        return (EAttribute)getPostBoxNumberPrefixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostBoxNumberSuffixType() {
		if (postBoxNumberSuffixTypeEClass == null) {
			postBoxNumberSuffixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(73);
		}
		return postBoxNumberSuffixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberSuffixType_Mixed() {
        return (EAttribute)getPostBoxNumberSuffixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberSuffixType_Code() {
        return (EAttribute)getPostBoxNumberSuffixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberSuffixType_NumberSuffixSeparator() {
        return (EAttribute)getPostBoxNumberSuffixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberSuffixType_AnyAttribute() {
        return (EAttribute)getPostBoxNumberSuffixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostBoxNumberType() {
		if (postBoxNumberTypeEClass == null) {
			postBoxNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(74);
		}
		return postBoxNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberType_Mixed() {
        return (EAttribute)getPostBoxNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberType_Code() {
        return (EAttribute)getPostBoxNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxNumberType_AnyAttribute() {
        return (EAttribute)getPostBoxNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostBoxType() {
		if (postBoxTypeEClass == null) {
			postBoxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(75);
		}
		return postBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostBoxType_AddressLine() {
        return (EReference)getPostBoxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostBoxType_PostBoxNumber() {
        return (EReference)getPostBoxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostBoxType_PostBoxNumberPrefix() {
        return (EReference)getPostBoxType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostBoxType_PostBoxNumberSuffix() {
        return (EReference)getPostBoxType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostBoxType_PostBoxNumberExtension() {
        return (EReference)getPostBoxType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostBoxType_Firm() {
        return (EReference)getPostBoxType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostBoxType_PostalCode() {
        return (EReference)getPostBoxType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxType_Any() {
        return (EAttribute)getPostBoxType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxType_Indicator() {
        return (EAttribute)getPostBoxType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxType_Type() {
        return (EAttribute)getPostBoxType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostBoxType_AnyAttribute() {
        return (EAttribute)getPostBoxType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostOfficeNameType() {
		if (postOfficeNameTypeEClass == null) {
			postOfficeNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(76);
		}
		return postOfficeNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNameType_Mixed() {
        return (EAttribute)getPostOfficeNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNameType_Code() {
        return (EAttribute)getPostOfficeNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNameType_Type() {
        return (EAttribute)getPostOfficeNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNameType_AnyAttribute() {
        return (EAttribute)getPostOfficeNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostOfficeNumberType() {
		if (postOfficeNumberTypeEClass == null) {
			postOfficeNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(77);
		}
		return postOfficeNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNumberType_Mixed() {
        return (EAttribute)getPostOfficeNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNumberType_Code() {
        return (EAttribute)getPostOfficeNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNumberType_Indicator() {
        return (EAttribute)getPostOfficeNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNumberType_IndicatorOccurrence() {
        return (EAttribute)getPostOfficeNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeNumberType_AnyAttribute() {
        return (EAttribute)getPostOfficeNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostOfficeType() {
		if (postOfficeTypeEClass == null) {
			postOfficeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(78);
		}
		return postOfficeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostOfficeType_AddressLine() {
        return (EReference)getPostOfficeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostOfficeType_PostOfficeName() {
        return (EReference)getPostOfficeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostOfficeType_PostOfficeNumber() {
        return (EReference)getPostOfficeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostOfficeType_PostalRoute() {
        return (EReference)getPostOfficeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostOfficeType_PostBox() {
        return (EReference)getPostOfficeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostOfficeType_PostalCode() {
        return (EReference)getPostOfficeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeType_Any() {
        return (EAttribute)getPostOfficeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeType_Indicator() {
        return (EAttribute)getPostOfficeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeType_Type() {
        return (EAttribute)getPostOfficeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostOfficeType_AnyAttribute() {
        return (EAttribute)getPostOfficeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostTownNameType() {
		if (postTownNameTypeEClass == null) {
			postTownNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(79);
		}
		return postTownNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownNameType_Mixed() {
        return (EAttribute)getPostTownNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownNameType_Code() {
        return (EAttribute)getPostTownNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownNameType_Type() {
        return (EAttribute)getPostTownNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownNameType_AnyAttribute() {
        return (EAttribute)getPostTownNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostTownSuffixType() {
		if (postTownSuffixTypeEClass == null) {
			postTownSuffixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(80);
		}
		return postTownSuffixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownSuffixType_Mixed() {
        return (EAttribute)getPostTownSuffixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownSuffixType_Code() {
        return (EAttribute)getPostTownSuffixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownSuffixType_AnyAttribute() {
        return (EAttribute)getPostTownSuffixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostTownType() {
		if (postTownTypeEClass == null) {
			postTownTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(81);
		}
		return postTownTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostTownType_AddressLine() {
        return (EReference)getPostTownType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostTownType_PostTownName() {
        return (EReference)getPostTownType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostTownType_PostTownSuffix() {
        return (EReference)getPostTownType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownType_Type() {
        return (EAttribute)getPostTownType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostTownType_AnyAttribute() {
        return (EAttribute)getPostTownType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseLocationType() {
		if (premiseLocationTypeEClass == null) {
			premiseLocationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(82);
		}
		return premiseLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseLocationType_Mixed() {
        return (EAttribute)getPremiseLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseLocationType_Code() {
        return (EAttribute)getPremiseLocationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseLocationType_AnyAttribute() {
        return (EAttribute)getPremiseLocationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseNameType() {
		if (premiseNameTypeEClass == null) {
			premiseNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(83);
		}
		return premiseNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNameType_Mixed() {
        return (EAttribute)getPremiseNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNameType_Code() {
        return (EAttribute)getPremiseNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNameType_Type() {
        return (EAttribute)getPremiseNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNameType_TypeOccurrence() {
        return (EAttribute)getPremiseNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNameType_AnyAttribute() {
        return (EAttribute)getPremiseNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseNumberPrefixType() {
		if (premiseNumberPrefixTypeEClass == null) {
			premiseNumberPrefixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(84);
		}
		return premiseNumberPrefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberPrefixType_Value() {
        return (EAttribute)getPremiseNumberPrefixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberPrefixType_Code() {
        return (EAttribute)getPremiseNumberPrefixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberPrefixType_NumberPrefixSeparator() {
        return (EAttribute)getPremiseNumberPrefixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberPrefixType_Type() {
        return (EAttribute)getPremiseNumberPrefixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberPrefixType_AnyAttribute() {
        return (EAttribute)getPremiseNumberPrefixType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseNumberRangeFromType() {
		if (premiseNumberRangeFromTypeEClass == null) {
			premiseNumberRangeFromTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(85);
		}
		return premiseNumberRangeFromTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeFromType_AddressLine() {
        return (EReference)getPremiseNumberRangeFromType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeFromType_PremiseNumberPrefix() {
        return (EReference)getPremiseNumberRangeFromType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeFromType_PremiseNumber() {
        return (EReference)getPremiseNumberRangeFromType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeFromType_PremiseNumberSuffix() {
        return (EReference)getPremiseNumberRangeFromType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseNumberRangeToType() {
		if (premiseNumberRangeToTypeEClass == null) {
			premiseNumberRangeToTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(86);
		}
		return premiseNumberRangeToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeToType_AddressLine() {
        return (EReference)getPremiseNumberRangeToType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeToType_PremiseNumberPrefix() {
        return (EReference)getPremiseNumberRangeToType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeToType_PremiseNumber() {
        return (EReference)getPremiseNumberRangeToType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeToType_PremiseNumberSuffix() {
        return (EReference)getPremiseNumberRangeToType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseNumberRangeType() {
		if (premiseNumberRangeTypeEClass == null) {
			premiseNumberRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(87);
		}
		return premiseNumberRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeType_PremiseNumberRangeFrom() {
        return (EReference)getPremiseNumberRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseNumberRangeType_PremiseNumberRangeTo() {
        return (EReference)getPremiseNumberRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberRangeType_Indicator() {
        return (EAttribute)getPremiseNumberRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberRangeType_IndicatorOccurence() {
        return (EAttribute)getPremiseNumberRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberRangeType_NumberRangeOccurence() {
        return (EAttribute)getPremiseNumberRangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberRangeType_RangeType() {
        return (EAttribute)getPremiseNumberRangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberRangeType_Separator() {
        return (EAttribute)getPremiseNumberRangeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberRangeType_Type() {
        return (EAttribute)getPremiseNumberRangeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseNumberSuffixType() {
		if (premiseNumberSuffixTypeEClass == null) {
			premiseNumberSuffixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(88);
		}
		return premiseNumberSuffixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberSuffixType_Mixed() {
        return (EAttribute)getPremiseNumberSuffixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberSuffixType_Code() {
        return (EAttribute)getPremiseNumberSuffixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberSuffixType_NumberSuffixSeparator() {
        return (EAttribute)getPremiseNumberSuffixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberSuffixType_Type() {
        return (EAttribute)getPremiseNumberSuffixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberSuffixType_AnyAttribute() {
        return (EAttribute)getPremiseNumberSuffixType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseNumberType() {
		if (premiseNumberTypeEClass == null) {
			premiseNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(89);
		}
		return premiseNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_Mixed() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_Code() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_Indicator() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_IndicatorOccurrence() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_NumberType() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_NumberTypeOccurrence() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_Type() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseNumberType_AnyAttribute() {
        return (EAttribute)getPremiseNumberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiseType() {
		if (premiseTypeEClass == null) {
			premiseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(90);
		}
		return premiseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_AddressLine() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_PremiseName() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_PremiseLocation() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_PremiseNumber() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_PremiseNumberRange() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_PremiseNumberPrefix() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_PremiseNumberSuffix() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_BuildingName() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_SubPremise() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_Firm() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_MailStop() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_PostalCode() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPremiseType_Premise() {
        return (EReference)getPremiseType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseType_Any() {
        return (EAttribute)getPremiseType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseType_PremiseDependency() {
        return (EAttribute)getPremiseType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseType_PremiseDependencyType() {
        return (EAttribute)getPremiseType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseType_PremiseThoroughfareConnector() {
        return (EAttribute)getPremiseType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseType_Type() {
        return (EAttribute)getPremiseType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPremiseType_AnyAttribute() {
        return (EAttribute)getPremiseType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortingCodeType() {
		if (sortingCodeTypeEClass == null) {
			sortingCodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(93);
		}
		return sortingCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingCodeType_Code() {
        return (EAttribute)getSortingCodeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortingCodeType_Type() {
        return (EAttribute)getSortingCodeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubAdministrativeAreaNameType() {
		if (subAdministrativeAreaNameTypeEClass == null) {
			subAdministrativeAreaNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(94);
		}
		return subAdministrativeAreaNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaNameType_Mixed() {
        return (EAttribute)getSubAdministrativeAreaNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaNameType_Code() {
        return (EAttribute)getSubAdministrativeAreaNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaNameType_Type() {
        return (EAttribute)getSubAdministrativeAreaNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaNameType_AnyAttribute() {
        return (EAttribute)getSubAdministrativeAreaNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubAdministrativeAreaType() {
		if (subAdministrativeAreaTypeEClass == null) {
			subAdministrativeAreaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(95);
		}
		return subAdministrativeAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAdministrativeAreaType_AddressLine() {
        return (EReference)getSubAdministrativeAreaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAdministrativeAreaType_SubAdministrativeAreaName() {
        return (EReference)getSubAdministrativeAreaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAdministrativeAreaType_Locality() {
        return (EReference)getSubAdministrativeAreaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAdministrativeAreaType_PostOffice() {
        return (EReference)getSubAdministrativeAreaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAdministrativeAreaType_PostalCode() {
        return (EReference)getSubAdministrativeAreaType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaType_Any() {
        return (EAttribute)getSubAdministrativeAreaType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaType_Indicator() {
        return (EAttribute)getSubAdministrativeAreaType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaType_Type() {
        return (EAttribute)getSubAdministrativeAreaType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaType_UsageType() {
        return (EAttribute)getSubAdministrativeAreaType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubAdministrativeAreaType_AnyAttribute() {
        return (EAttribute)getSubAdministrativeAreaType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPremiseLocationType() {
		if (subPremiseLocationTypeEClass == null) {
			subPremiseLocationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(96);
		}
		return subPremiseLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseLocationType_Mixed() {
        return (EAttribute)getSubPremiseLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseLocationType_Code() {
        return (EAttribute)getSubPremiseLocationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPremiseNameType() {
		if (subPremiseNameTypeEClass == null) {
			subPremiseNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(97);
		}
		return subPremiseNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNameType_Mixed() {
        return (EAttribute)getSubPremiseNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNameType_Code() {
        return (EAttribute)getSubPremiseNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNameType_Type() {
        return (EAttribute)getSubPremiseNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNameType_TypeOccurrence() {
        return (EAttribute)getSubPremiseNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNameType_AnyAttribute() {
        return (EAttribute)getSubPremiseNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPremiseNumberPrefixType() {
		if (subPremiseNumberPrefixTypeEClass == null) {
			subPremiseNumberPrefixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(98);
		}
		return subPremiseNumberPrefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberPrefixType_Mixed() {
        return (EAttribute)getSubPremiseNumberPrefixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberPrefixType_Code() {
        return (EAttribute)getSubPremiseNumberPrefixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberPrefixType_NumberPrefixSeparator() {
        return (EAttribute)getSubPremiseNumberPrefixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberPrefixType_Type() {
        return (EAttribute)getSubPremiseNumberPrefixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberPrefixType_AnyAttribute() {
        return (EAttribute)getSubPremiseNumberPrefixType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPremiseNumberSuffixType() {
		if (subPremiseNumberSuffixTypeEClass == null) {
			subPremiseNumberSuffixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(99);
		}
		return subPremiseNumberSuffixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberSuffixType_Mixed() {
        return (EAttribute)getSubPremiseNumberSuffixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberSuffixType_Code() {
        return (EAttribute)getSubPremiseNumberSuffixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberSuffixType_NumberSuffixSeparator() {
        return (EAttribute)getSubPremiseNumberSuffixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberSuffixType_Type() {
        return (EAttribute)getSubPremiseNumberSuffixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberSuffixType_AnyAttribute() {
        return (EAttribute)getSubPremiseNumberSuffixType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPremiseNumberType() {
		if (subPremiseNumberTypeEClass == null) {
			subPremiseNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(100);
		}
		return subPremiseNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_Mixed() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_Code() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_Indicator() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_IndicatorOccurrence() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_NumberTypeOccurrence() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_PremiseNumberSeparator() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_Type() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseNumberType_AnyAttribute() {
        return (EAttribute)getSubPremiseNumberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPremiseType() {
		if (subPremiseTypeEClass == null) {
			subPremiseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(101);
		}
		return subPremiseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_AddressLine() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_SubPremiseName() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_SubPremiseLocation() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_SubPremiseNumber() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_SubPremiseNumberPrefix() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_SubPremiseNumberSuffix() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_BuildingName() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_Firm() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_MailStop() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_PostalCode() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPremiseType_SubPremise() {
        return (EReference)getSubPremiseType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseType_Any() {
        return (EAttribute)getSubPremiseType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseType_Type() {
        return (EAttribute)getSubPremiseType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubPremiseType_AnyAttribute() {
        return (EAttribute)getSubPremiseType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplementaryPostalServiceDataType() {
		if (supplementaryPostalServiceDataTypeEClass == null) {
			supplementaryPostalServiceDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(102);
		}
		return supplementaryPostalServiceDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplementaryPostalServiceDataType_Mixed() {
        return (EAttribute)getSupplementaryPostalServiceDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplementaryPostalServiceDataType_Code() {
        return (EAttribute)getSupplementaryPostalServiceDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplementaryPostalServiceDataType_Type() {
        return (EAttribute)getSupplementaryPostalServiceDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplementaryPostalServiceDataType_AnyAttribute() {
        return (EAttribute)getSupplementaryPostalServiceDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareLeadingTypeType() {
		if (thoroughfareLeadingTypeTypeEClass == null) {
			thoroughfareLeadingTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(103);
		}
		return thoroughfareLeadingTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareLeadingTypeType_Mixed() {
        return (EAttribute)getThoroughfareLeadingTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareLeadingTypeType_Code() {
        return (EAttribute)getThoroughfareLeadingTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareLeadingTypeType_Type() {
        return (EAttribute)getThoroughfareLeadingTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareLeadingTypeType_AnyAttribute() {
        return (EAttribute)getThoroughfareLeadingTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareNameType() {
		if (thoroughfareNameTypeEClass == null) {
			thoroughfareNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(104);
		}
		return thoroughfareNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNameType_Mixed() {
        return (EAttribute)getThoroughfareNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNameType_Code() {
        return (EAttribute)getThoroughfareNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNameType_Type() {
        return (EAttribute)getThoroughfareNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNameType_AnyAttribute() {
        return (EAttribute)getThoroughfareNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareNumberFromType() {
		if (thoroughfareNumberFromTypeEClass == null) {
			thoroughfareNumberFromTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(105);
		}
		return thoroughfareNumberFromTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberFromType_Mixed() {
        return (EAttribute)getThoroughfareNumberFromType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberFromType_AddressLine() {
        return (EReference)getThoroughfareNumberFromType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberFromType_ThoroughfareNumberPrefix() {
        return (EReference)getThoroughfareNumberFromType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberFromType_ThoroughfareNumber() {
        return (EReference)getThoroughfareNumberFromType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberFromType_ThoroughfareNumberSuffix() {
        return (EReference)getThoroughfareNumberFromType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberFromType_Code() {
        return (EAttribute)getThoroughfareNumberFromType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberFromType_AnyAttribute() {
        return (EAttribute)getThoroughfareNumberFromType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareNumberPrefixType() {
		if (thoroughfareNumberPrefixTypeEClass == null) {
			thoroughfareNumberPrefixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(106);
		}
		return thoroughfareNumberPrefixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberPrefixType_Mixed() {
        return (EAttribute)getThoroughfareNumberPrefixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberPrefixType_Code() {
        return (EAttribute)getThoroughfareNumberPrefixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberPrefixType_NumberPrefixSeparator() {
        return (EAttribute)getThoroughfareNumberPrefixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberPrefixType_Type() {
        return (EAttribute)getThoroughfareNumberPrefixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberPrefixType_AnyAttribute() {
        return (EAttribute)getThoroughfareNumberPrefixType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareNumberRangeType() {
		if (thoroughfareNumberRangeTypeEClass == null) {
			thoroughfareNumberRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(107);
		}
		return thoroughfareNumberRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberRangeType_AddressLine() {
        return (EReference)getThoroughfareNumberRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberRangeType_ThoroughfareNumberFrom() {
        return (EReference)getThoroughfareNumberRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberRangeType_ThoroughfareNumberTo() {
        return (EReference)getThoroughfareNumberRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_Code() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_Indicator() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_IndicatorOccurrence() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_NumberRangeOccurrence() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_RangeType() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_Separator() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_Type() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberRangeType_AnyAttribute() {
        return (EAttribute)getThoroughfareNumberRangeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareNumberSuffixType() {
		if (thoroughfareNumberSuffixTypeEClass == null) {
			thoroughfareNumberSuffixTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(108);
		}
		return thoroughfareNumberSuffixTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberSuffixType_Mixed() {
        return (EAttribute)getThoroughfareNumberSuffixType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberSuffixType_Code() {
        return (EAttribute)getThoroughfareNumberSuffixType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberSuffixType_NumberSuffixSeparator() {
        return (EAttribute)getThoroughfareNumberSuffixType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberSuffixType_Type() {
        return (EAttribute)getThoroughfareNumberSuffixType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberSuffixType_AnyAttribute() {
        return (EAttribute)getThoroughfareNumberSuffixType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareNumberToType() {
		if (thoroughfareNumberToTypeEClass == null) {
			thoroughfareNumberToTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(109);
		}
		return thoroughfareNumberToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberToType_Mixed() {
        return (EAttribute)getThoroughfareNumberToType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberToType_AddressLine() {
        return (EReference)getThoroughfareNumberToType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberToType_ThoroughfareNumberPrefix() {
        return (EReference)getThoroughfareNumberToType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberToType_ThoroughfareNumber() {
        return (EReference)getThoroughfareNumberToType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareNumberToType_ThoroughfareNumberSuffix() {
        return (EReference)getThoroughfareNumberToType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberToType_Code() {
        return (EAttribute)getThoroughfareNumberToType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberToType_AnyAttribute() {
        return (EAttribute)getThoroughfareNumberToType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareNumberType() {
		if (thoroughfareNumberTypeEClass == null) {
			thoroughfareNumberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(110);
		}
		return thoroughfareNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_Mixed() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_Code() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_Indicator() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_IndicatorOccurrence() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_NumberOccurrence() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_NumberType() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_Type() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareNumberType_AnyAttribute() {
        return (EAttribute)getThoroughfareNumberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfarePostDirectionType() {
		if (thoroughfarePostDirectionTypeEClass == null) {
			thoroughfarePostDirectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(111);
		}
		return thoroughfarePostDirectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePostDirectionType_Mixed() {
        return (EAttribute)getThoroughfarePostDirectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePostDirectionType_Code() {
        return (EAttribute)getThoroughfarePostDirectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePostDirectionType_Type() {
        return (EAttribute)getThoroughfarePostDirectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePostDirectionType_AnyAttribute() {
        return (EAttribute)getThoroughfarePostDirectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfarePreDirectionType() {
		if (thoroughfarePreDirectionTypeEClass == null) {
			thoroughfarePreDirectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(112);
		}
		return thoroughfarePreDirectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePreDirectionType_Mixed() {
        return (EAttribute)getThoroughfarePreDirectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePreDirectionType_Code() {
        return (EAttribute)getThoroughfarePreDirectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePreDirectionType_Type() {
        return (EAttribute)getThoroughfarePreDirectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfarePreDirectionType_AnyAttribute() {
        return (EAttribute)getThoroughfarePreDirectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareTrailingTypeType() {
		if (thoroughfareTrailingTypeTypeEClass == null) {
			thoroughfareTrailingTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(113);
		}
		return thoroughfareTrailingTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareTrailingTypeType_Mixed() {
        return (EAttribute)getThoroughfareTrailingTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareTrailingTypeType_Code() {
        return (EAttribute)getThoroughfareTrailingTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareTrailingTypeType_Type() {
        return (EAttribute)getThoroughfareTrailingTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareTrailingTypeType_AnyAttribute() {
        return (EAttribute)getThoroughfareTrailingTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThoroughfareType() {
		if (thoroughfareTypeEClass == null) {
			thoroughfareTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(114);
		}
		return thoroughfareTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_AddressLine() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_Group() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfareNumber() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfareNumberRange() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfareNumberPrefix() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfareNumberSuffix() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfarePreDirection() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfareLeadingType() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfareName() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfareTrailingType() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_ThoroughfarePostDirection() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_DependentThoroughfare() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_DependentLocality() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_Premise() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_Firm() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThoroughfareType_PostalCode() {
        return (EReference)getThoroughfareType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_Any() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_DependentThoroughfares() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_DependentThoroughfaresConnector() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_DependentThoroughfaresIndicator() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_DependentThoroughfaresType() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_Type() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThoroughfareType_AnyAttribute() {
        return (EAttribute)getThoroughfareType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(121);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressDetails() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressLine() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdministrativeArea() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CountryName() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Department() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Locality() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PostalCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PostBox() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PostOffice() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Premise() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PremiseNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PremiseNumberPrefix() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PremiseNumberSuffix() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Thoroughfare() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThoroughfareNumber() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThoroughfareNumberPrefix() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ThoroughfareNumberSuffix() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XAL() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXALType() {
		if (xalTypeEClass == null) {
			xalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(122);
		}
		return xalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXALType_AddressDetails() {
        return (EReference)getXALType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXALType_Any() {
        return (EAttribute)getXALType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXALType_Version() {
        return (EAttribute)getXALType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXALType_AnyAttribute() {
        return (EAttribute)getXALType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDependentThoroughfaresType() {
		if (dependentThoroughfaresTypeEEnum == null) {
			dependentThoroughfaresTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(21);
		}
		return dependentThoroughfaresTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicatorOccurenceType() {
		if (indicatorOccurenceTypeEEnum == null) {
			indicatorOccurenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(27);
		}
		return indicatorOccurenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicatorOccurrenceType() {
		if (indicatorOccurrenceTypeEEnum == null) {
			indicatorOccurrenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(29);
		}
		return indicatorOccurrenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicatorOccurrenceType1() {
		if (indicatorOccurrenceType1EEnum == null) {
			indicatorOccurrenceType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(30);
		}
		return indicatorOccurrenceType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicatorOccurrenceType2() {
		if (indicatorOccurrenceType2EEnum == null) {
			indicatorOccurrenceType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(31);
		}
		return indicatorOccurrenceType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicatorOccurrenceType3() {
		if (indicatorOccurrenceType3EEnum == null) {
			indicatorOccurrenceType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(32);
		}
		return indicatorOccurrenceType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicatorOccurrenceType4() {
		if (indicatorOccurrenceType4EEnum == null) {
			indicatorOccurrenceType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(33);
		}
		return indicatorOccurrenceType4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNameNumberOccurrenceType() {
		if (nameNumberOccurrenceTypeEEnum == null) {
			nameNumberOccurrenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(48);
		}
		return nameNumberOccurrenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberOccurrenceType() {
		if (numberOccurrenceTypeEEnum == null) {
			numberOccurrenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(50);
		}
		return numberOccurrenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberRangeOccurenceType() {
		if (numberRangeOccurenceTypeEEnum == null) {
			numberRangeOccurenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(52);
		}
		return numberRangeOccurenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberRangeOccurrenceType() {
		if (numberRangeOccurrenceTypeEEnum == null) {
			numberRangeOccurrenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(54);
		}
		return numberRangeOccurrenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberTypeOccurrenceType() {
		if (numberTypeOccurrenceTypeEEnum == null) {
			numberTypeOccurrenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(56);
		}
		return numberTypeOccurrenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberTypeOccurrenceType1() {
		if (numberTypeOccurrenceType1EEnum == null) {
			numberTypeOccurrenceType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(57);
		}
		return numberTypeOccurrenceType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberTypeType() {
		if (numberTypeTypeEEnum == null) {
			numberTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(60);
		}
		return numberTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberTypeType1() {
		if (numberTypeType1EEnum == null) {
			numberTypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(61);
		}
		return numberTypeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRangeTypeType() {
		if (rangeTypeTypeEEnum == null) {
			rangeTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(91);
		}
		return rangeTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOccurrenceType() {
		if (typeOccurrenceTypeEEnum == null) {
			typeOccurrenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(115);
		}
		return typeOccurrenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOccurrenceType1() {
		if (typeOccurrenceType1EEnum == null) {
			typeOccurrenceType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(116);
		}
		return typeOccurrenceType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOccurrenceType2() {
		if (typeOccurrenceType2EEnum == null) {
			typeOccurrenceType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(117);
		}
		return typeOccurrenceType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDependentThoroughfaresTypeObject() {
		if (dependentThoroughfaresTypeObjectEDataType == null) {
			dependentThoroughfaresTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(22);
		}
		return dependentThoroughfaresTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndicatorOccurenceTypeObject() {
		if (indicatorOccurenceTypeObjectEDataType == null) {
			indicatorOccurenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(28);
		}
		return indicatorOccurenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndicatorOccurrenceTypeObject() {
		if (indicatorOccurrenceTypeObjectEDataType == null) {
			indicatorOccurrenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(34);
		}
		return indicatorOccurrenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndicatorOccurrenceTypeObject1() {
		if (indicatorOccurrenceTypeObject1EDataType == null) {
			indicatorOccurrenceTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(35);
		}
		return indicatorOccurrenceTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndicatorOccurrenceTypeObject2() {
		if (indicatorOccurrenceTypeObject2EDataType == null) {
			indicatorOccurrenceTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(36);
		}
		return indicatorOccurrenceTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndicatorOccurrenceTypeObject3() {
		if (indicatorOccurrenceTypeObject3EDataType == null) {
			indicatorOccurrenceTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(37);
		}
		return indicatorOccurrenceTypeObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIndicatorOccurrenceTypeObject4() {
		if (indicatorOccurrenceTypeObject4EDataType == null) {
			indicatorOccurrenceTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(38);
		}
		return indicatorOccurrenceTypeObject4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameNumberOccurrenceTypeObject() {
		if (nameNumberOccurrenceTypeObjectEDataType == null) {
			nameNumberOccurrenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(49);
		}
		return nameNumberOccurrenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberOccurrenceTypeObject() {
		if (numberOccurrenceTypeObjectEDataType == null) {
			numberOccurrenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(51);
		}
		return numberOccurrenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberRangeOccurenceTypeObject() {
		if (numberRangeOccurenceTypeObjectEDataType == null) {
			numberRangeOccurenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(53);
		}
		return numberRangeOccurenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberRangeOccurrenceTypeObject() {
		if (numberRangeOccurrenceTypeObjectEDataType == null) {
			numberRangeOccurrenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(55);
		}
		return numberRangeOccurrenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberTypeOccurrenceTypeObject() {
		if (numberTypeOccurrenceTypeObjectEDataType == null) {
			numberTypeOccurrenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(58);
		}
		return numberTypeOccurrenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberTypeOccurrenceTypeObject1() {
		if (numberTypeOccurrenceTypeObject1EDataType == null) {
			numberTypeOccurrenceTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(59);
		}
		return numberTypeOccurrenceTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberTypeTypeObject() {
		if (numberTypeTypeObjectEDataType == null) {
			numberTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(62);
		}
		return numberTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumberTypeTypeObject1() {
		if (numberTypeTypeObject1EDataType == null) {
			numberTypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(63);
		}
		return numberTypeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRangeTypeTypeObject() {
		if (rangeTypeTypeObjectEDataType == null) {
			rangeTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(92);
		}
		return rangeTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeOccurrenceTypeObject() {
		if (typeOccurrenceTypeObjectEDataType == null) {
			typeOccurrenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(118);
		}
		return typeOccurrenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeOccurrenceTypeObject1() {
		if (typeOccurrenceTypeObject1EDataType == null) {
			typeOccurrenceTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(119);
		}
		return typeOccurrenceTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeOccurrenceTypeObject2() {
		if (typeOccurrenceTypeObject2EDataType == null) {
			typeOccurrenceTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI).getEClassifiers().get(120);
		}
		return typeOccurrenceTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XALFactory getXALFactory() {
		return (XALFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.oasis.xAL." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //XALPackageImpl
