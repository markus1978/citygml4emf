/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import java.math.BigInteger;
import java.util.List;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.AbstractSiteType;
import net.opengis.citygml.AddressPropertyType;
import net.opengis.citygml.AddressType;
import net.opengis.citygml.CityModelType;
import net.opengis.citygml.CitygmlFactory;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.DocumentRoot;
import net.opengis.citygml.ExternalObjectReferenceType;
import net.opengis.citygml.ExternalReferenceType;
import net.opengis.citygml.GeneralizationRelationType;
import net.opengis.citygml.ImplicitGeometryType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.XalAddressPropertyType;
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
import net.opengis.citygml.landuse.LandusePackage;
import net.opengis.citygml.landuse.impl.LandusePackageImpl;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.citygml.relief.impl.ReliefPackageImpl;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;
import net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl;
import net.opengis.citygml.transportation.TransportationPackage;
import net.opengis.citygml.transportation.impl.TransportationPackageImpl;
import net.opengis.citygml.util.CitygmlValidator;
import net.opengis.citygml.vegetation.VegetationPackage;
import net.opengis.citygml.vegetation.impl.VegetationPackageImpl;
import net.opengis.citygml.waterbody.WaterbodyPackage;
import net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.impl.GmlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasis.xAL.XALPackage;
import org.oasis.xAL.impl.XALPackageImpl;
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
public class CitygmlPackageImpl extends EPackageImpl implements CitygmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCityObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSiteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressPropertyTypeEClass = null;

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
	private EClass cityModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalObjectReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitRepresentationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xalAddressPropertyTypeEClass = null;

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
	private EDataType doubleBetween0and1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleBetween0and1ListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleBetween0and1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerBetween0and4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mimeTypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transformationMatrix2x2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transformationMatrix3x4TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transformationMatrix4x4TypeEDataType = null;

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
	 * @see net.opengis.citygml.CitygmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CitygmlPackageImpl() {
		super(eNS_URI, CitygmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CitygmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CitygmlPackage init() {
		if (isInited) return (CitygmlPackage)EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI);

		// Obtain or create and register package
		CitygmlPackageImpl theCitygmlPackage = (CitygmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CitygmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CitygmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) : BuildingPackage.eINSTANCE);
		GmlPackageImpl theGmlPackage = (GmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) instanceof GmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) : GmlPackage.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) : XALPackage.eINSTANCE);
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
		theGmlPackage.loadPackage();
		theXALPackage.loadPackage();

		// Create package meta-data objects
		theCitygmlPackage.createPackageContents();
		theBuildingPackage.createPackageContents();
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
		theCitygmlPackage.initializePackageContents();
		theBuildingPackage.initializePackageContents();
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
		theGmlPackage.fixPackageContents();
		theXALPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCitygmlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CitygmlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCitygmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CitygmlPackage.eNS_URI, theCitygmlPackage);
		return theCitygmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCityObjectType() {
		return abstractCityObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCityObjectType_CreationDate() {
		return (EAttribute)abstractCityObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCityObjectType_TerminationDate() {
		return (EAttribute)abstractCityObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCityObjectType_ExternalReference() {
		return (EReference)abstractCityObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCityObjectType_GeneralizesTo() {
		return (EReference)abstractCityObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCityObjectType_GenericApplicationPropertyOfCityObjectGroup() {
		return (EAttribute)abstractCityObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCityObjectType_GenericApplicationPropertyOfCityObject() {
		return (EReference)abstractCityObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSiteType() {
		return abstractSiteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSiteType_GenericApplicationPropertyOfSiteGroup() {
		return (EAttribute)abstractSiteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSiteType_GenericApplicationPropertyOfSite() {
		return (EReference)abstractSiteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressPropertyType() {
		return addressPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressPropertyType_Address() {
		return (EReference)addressPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_XalAddress() {
		return (EReference)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_MultiPoint() {
		return (EReference)addressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_GenericApplicationPropertyOfAddressGroup() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_GenericApplicationPropertyOfAddress() {
		return (EReference)addressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCityModelType() {
		return cityModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCityModelType_GenericApplicationPropertyOfCityModelGroup() {
		return (EAttribute)cityModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCityModelType_GenericApplicationPropertyOfCityModel() {
		return (EReference)cityModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalObjectReferenceType() {
		return externalObjectReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalObjectReferenceType_Name() {
		return (EAttribute)externalObjectReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalObjectReferenceType_Uri() {
		return (EAttribute)externalObjectReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReferenceType() {
		return externalReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalReferenceType_InformationSystem() {
		return (EAttribute)externalReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalReferenceType_ExternalObject() {
		return (EReference)externalReferenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationRelationType() {
		return generalizationRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_CityObjectGroup() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationRelationType_CityObject() {
		return (EReference)generalizationRelationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_Actuate() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_Arcrole() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_Href() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_RemoteSchema() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_Role() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_Show() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_Title() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationType_Type() {
		return (EAttribute)generalizationRelationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitGeometryType() {
		return implicitGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitGeometryType_MimeType() {
		return (EAttribute)implicitGeometryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitGeometryType_TransformationMatrix() {
		return (EAttribute)implicitGeometryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplicitGeometryType_LibraryObject() {
		return (EAttribute)implicitGeometryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitGeometryType_RelativeGMLGeometry() {
		return (EReference)implicitGeometryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitGeometryType_ReferencePoint() {
		return (EReference)implicitGeometryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitRepresentationPropertyType() {
		return implicitRepresentationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicitRepresentationPropertyType_ImplicitGeometry() {
		return (EReference)implicitRepresentationPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXalAddressPropertyType() {
		return xalAddressPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXalAddressPropertyType_AddressDetails() {
		return (EReference)xalAddressPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Site() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CityObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfAddress() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfCityModel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfCityObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfSite() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CityModel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CityObjectMember() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImplicitGeometry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleBetween0and1() {
		return doubleBetween0and1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleBetween0and1List() {
		return doubleBetween0and1ListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleBetween0and1Object() {
		return doubleBetween0and1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerBetween0and4() {
		return integerBetween0and4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMimeTypeType() {
		return mimeTypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransformationMatrix2x2Type() {
		return transformationMatrix2x2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransformationMatrix3x4Type() {
		return transformationMatrix3x4TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransformationMatrix4x4Type() {
		return transformationMatrix4x4TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitygmlFactory getCitygmlFactory() {
		return (CitygmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractCityObjectTypeEClass = createEClass(ABSTRACT_CITY_OBJECT_TYPE);
		createEAttribute(abstractCityObjectTypeEClass, ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE);
		createEAttribute(abstractCityObjectTypeEClass, ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE);
		createEReference(abstractCityObjectTypeEClass, ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE);
		createEReference(abstractCityObjectTypeEClass, ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO);
		createEAttribute(abstractCityObjectTypeEClass, ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP);
		createEReference(abstractCityObjectTypeEClass, ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT);

		abstractSiteTypeEClass = createEClass(ABSTRACT_SITE_TYPE);
		createEAttribute(abstractSiteTypeEClass, ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP);
		createEReference(abstractSiteTypeEClass, ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE);

		addressPropertyTypeEClass = createEClass(ADDRESS_PROPERTY_TYPE);
		createEReference(addressPropertyTypeEClass, ADDRESS_PROPERTY_TYPE__ADDRESS);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEReference(addressTypeEClass, ADDRESS_TYPE__XAL_ADDRESS);
		createEReference(addressTypeEClass, ADDRESS_TYPE__MULTI_POINT);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP);
		createEReference(addressTypeEClass, ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS);

		cityModelTypeEClass = createEClass(CITY_MODEL_TYPE);
		createEAttribute(cityModelTypeEClass, CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP);
		createEReference(cityModelTypeEClass, CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL);

		externalObjectReferenceTypeEClass = createEClass(EXTERNAL_OBJECT_REFERENCE_TYPE);
		createEAttribute(externalObjectReferenceTypeEClass, EXTERNAL_OBJECT_REFERENCE_TYPE__NAME);
		createEAttribute(externalObjectReferenceTypeEClass, EXTERNAL_OBJECT_REFERENCE_TYPE__URI);

		externalReferenceTypeEClass = createEClass(EXTERNAL_REFERENCE_TYPE);
		createEAttribute(externalReferenceTypeEClass, EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM);
		createEReference(externalReferenceTypeEClass, EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT);

		generalizationRelationTypeEClass = createEClass(GENERALIZATION_RELATION_TYPE);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__CITY_OBJECT_GROUP);
		createEReference(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__CITY_OBJECT);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__ACTUATE);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__ARCROLE);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__HREF);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__REMOTE_SCHEMA);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__ROLE);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__SHOW);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__TITLE);
		createEAttribute(generalizationRelationTypeEClass, GENERALIZATION_RELATION_TYPE__TYPE);

		implicitGeometryTypeEClass = createEClass(IMPLICIT_GEOMETRY_TYPE);
		createEAttribute(implicitGeometryTypeEClass, IMPLICIT_GEOMETRY_TYPE__MIME_TYPE);
		createEAttribute(implicitGeometryTypeEClass, IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX);
		createEAttribute(implicitGeometryTypeEClass, IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT);
		createEReference(implicitGeometryTypeEClass, IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY);
		createEReference(implicitGeometryTypeEClass, IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT);

		implicitRepresentationPropertyTypeEClass = createEClass(IMPLICIT_REPRESENTATION_PROPERTY_TYPE);
		createEReference(implicitRepresentationPropertyTypeEClass, IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY);

		xalAddressPropertyTypeEClass = createEClass(XAL_ADDRESS_PROPERTY_TYPE);
		createEReference(xalAddressPropertyTypeEClass, XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SITE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CITY_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CITY_MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CITY_OBJECT_MEMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPLICIT_GEOMETRY);

		// Create data types
		doubleBetween0and1EDataType = createEDataType(DOUBLE_BETWEEN0AND1);
		doubleBetween0and1ListEDataType = createEDataType(DOUBLE_BETWEEN0AND1_LIST);
		doubleBetween0and1ObjectEDataType = createEDataType(DOUBLE_BETWEEN0AND1_OBJECT);
		integerBetween0and4EDataType = createEDataType(INTEGER_BETWEEN0AND4);
		mimeTypeTypeEDataType = createEDataType(MIME_TYPE_TYPE);
		transformationMatrix2x2TypeEDataType = createEDataType(TRANSFORMATION_MATRIX2X2_TYPE);
		transformationMatrix3x4TypeEDataType = createEDataType(TRANSFORMATION_MATRIX3X4_TYPE);
		transformationMatrix4x4TypeEDataType = createEDataType(TRANSFORMATION_MATRIX4X4_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GmlPackage theGmlPackage = (GmlPackage)EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);
		XALPackage theXALPackage = (XALPackage)EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractCityObjectTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractFeatureType());
		abstractSiteTypeEClass.getESuperTypes().add(this.getAbstractCityObjectType());
		addressPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		addressTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractFeatureType());
		cityModelTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractFeatureCollectionType());
		implicitGeometryTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractGMLType());
		implicitRepresentationPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractCityObjectTypeEClass, AbstractCityObjectType.class, "AbstractCityObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractCityObjectType_CreationDate(), theXMLTypePackage.getDate(), "creationDate", null, 0, 1, AbstractCityObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCityObjectType_TerminationDate(), theXMLTypePackage.getDate(), "terminationDate", null, 0, 1, AbstractCityObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCityObjectType_ExternalReference(), this.getExternalReferenceType(), null, "externalReference", null, 0, -1, AbstractCityObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCityObjectType_GeneralizesTo(), this.getGeneralizationRelationType(), null, "generalizesTo", null, 0, -1, AbstractCityObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCityObjectType_GenericApplicationPropertyOfCityObjectGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfCityObjectGroup", null, 0, -1, AbstractCityObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCityObjectType_GenericApplicationPropertyOfCityObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfCityObject", null, 0, -1, AbstractCityObjectType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractSiteTypeEClass, AbstractSiteType.class, "AbstractSiteType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSiteType_GenericApplicationPropertyOfSiteGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfSiteGroup", null, 0, -1, AbstractSiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSiteType_GenericApplicationPropertyOfSite(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSite", null, 0, -1, AbstractSiteType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(addressPropertyTypeEClass, AddressPropertyType.class, "AddressPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressPropertyType_Address(), this.getAddressType(), null, "address", null, 0, 1, AddressPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressType_XalAddress(), this.getXalAddressPropertyType(), null, "xalAddress", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressType_MultiPoint(), theGmlPackage.getMultiPointPropertyType(), null, "multiPoint", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_GenericApplicationPropertyOfAddressGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfAddressGroup", null, 0, -1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressType_GenericApplicationPropertyOfAddress(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAddress", null, 0, -1, AddressType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cityModelTypeEClass, CityModelType.class, "CityModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCityModelType_GenericApplicationPropertyOfCityModelGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfCityModelGroup", null, 0, -1, CityModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCityModelType_GenericApplicationPropertyOfCityModel(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfCityModel", null, 0, -1, CityModelType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(externalObjectReferenceTypeEClass, ExternalObjectReferenceType.class, "ExternalObjectReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalObjectReferenceType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ExternalObjectReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalObjectReferenceType_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 0, 1, ExternalObjectReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalReferenceTypeEClass, ExternalReferenceType.class, "ExternalReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalReferenceType_InformationSystem(), theXMLTypePackage.getAnyURI(), "informationSystem", null, 0, 1, ExternalReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalReferenceType_ExternalObject(), this.getExternalObjectReferenceType(), null, "externalObject", null, 1, 1, ExternalReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationRelationTypeEClass, GeneralizationRelationType.class, "GeneralizationRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationRelationType_CityObjectGroup(), ecorePackage.getEFeatureMapEntry(), "cityObjectGroup", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationRelationType_CityObject(), this.getAbstractCityObjectType(), null, "cityObject", null, 0, 1, GeneralizationRelationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_Arcrole(), theXMLTypePackage.getAnyURI(), "arcrole", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_RemoteSchema(), theXMLTypePackage.getAnyURI(), "remoteSchema", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_Role(), theXMLTypePackage.getAnyURI(), "role", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, GeneralizationRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitGeometryTypeEClass, ImplicitGeometryType.class, "ImplicitGeometryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplicitGeometryType_MimeType(), this.getMimeTypeType(), "mimeType", null, 0, 1, ImplicitGeometryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplicitGeometryType_TransformationMatrix(), this.getTransformationMatrix4x4Type(), "transformationMatrix", null, 0, 1, ImplicitGeometryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplicitGeometryType_LibraryObject(), theXMLTypePackage.getAnyURI(), "libraryObject", null, 0, 1, ImplicitGeometryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicitGeometryType_RelativeGMLGeometry(), theGmlPackage.getGeometryPropertyType(), null, "relativeGMLGeometry", null, 0, 1, ImplicitGeometryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicitGeometryType_ReferencePoint(), theGmlPackage.getPointPropertyType(), null, "referencePoint", null, 1, 1, ImplicitGeometryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitRepresentationPropertyTypeEClass, ImplicitRepresentationPropertyType.class, "ImplicitRepresentationPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicitRepresentationPropertyType_ImplicitGeometry(), this.getImplicitGeometryType(), null, "implicitGeometry", null, 0, 1, ImplicitRepresentationPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xalAddressPropertyTypeEClass, XalAddressPropertyType.class, "XalAddressPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXalAddressPropertyType_AddressDetails(), theXALPackage.getAddressDetails(), null, "addressDetails", null, 1, 1, XalAddressPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Site(), this.getAbstractSiteType(), null, "site", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CityObject(), this.getAbstractCityObjectType(), null, "cityObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfAddress(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAddress", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfCityModel(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfCityModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfCityObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfCityObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfSite(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSite", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getAddressType(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CityModel(), this.getCityModelType(), null, "cityModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CityObjectMember(), theGmlPackage.getFeaturePropertyType(), null, "cityObjectMember", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ImplicitGeometry(), this.getImplicitGeometryType(), null, "implicitGeometry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(doubleBetween0and1EDataType, double.class, "DoubleBetween0and1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleBetween0and1ListEDataType, List.class, "DoubleBetween0and1List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleBetween0and1ObjectEDataType, Double.class, "DoubleBetween0and1Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerBetween0and4EDataType, BigInteger.class, "IntegerBetween0and4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mimeTypeTypeEDataType, String.class, "MimeTypeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transformationMatrix2x2TypeEDataType, List.class, "TransformationMatrix2x2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transformationMatrix3x4TypeEDataType, List.class, "TransformationMatrix3x4Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transformationMatrix4x4TypeEDataType, List.class, "TransformationMatrix4x4Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:opengis:specification:gml:schema-xsd:gml:3.1.1
		createUrnopengisspecificationgmlschemaxsdgml3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1
		createUrnopengisspecificationgmlschemaxsddynamicFeature3Annotations();
		// urn:opengis:specification:gml:schema-xsd:feature:v3.1.1
		createUrnopengisspecificationgmlschemaxsdfeaturev3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryBasic2d3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryBasic0d1dv3Annotations();
		// urn:opengis:specification:gml:schema-measures:3.1.1
		createUrnopengisspecificationgmlschemameasures3Annotations();
		// urn:opengis:specification:gml:schema-units:3.1.1
		createUrnopengisspecificationgmlschemaunits3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1
		createUrnopengisspecificationgmlschemaxsddictionary3Annotations();
		// urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1
		createUrnopengisspecificationgmlschemaxsdgmlBase3Annotations();
		// urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1
		createUrnopengisspecificationgmlschemaxsdbasicTypes3Annotations();
		// urn:opengis:specification:gml:schema-xlinks:v3.0c2
		createUrnopengisspecificationgmlschemaxlinksv3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporal:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporal3Annotations();
		// urn:opengis:specification:gml:schema-xsd:direction:3.1.1
		createUrnopengisspecificationgmlschemaxsddirection3Annotations();
		// urn:opengis:specification:gml:schema-xsd:topology:3.1.1
		createUrnopengisspecificationgmlschemaxsdtopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryComplexesv3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryAggregates3Annotations();
		// urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1
		createUrnopengisspecificationgmlschemaxsdgeometryPrimitives3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coverage:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoverage3Annotations();
		// urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1
		createUrnopengisspecificationgmlschemaxsdvalueObjects3Annotations();
		// urn:opengis:specification:gml:schema-xsd:grids:3.1.1
		createUrnopengisspecificationgmlschemaxsdgrids3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdreferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:datums:3.1.1
		createUrnopengisspecificationgmlschemaxsddatums3Annotations();
		// urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1
		createUrnopengisspecificationgmlschemaxsdcoordinateOperations3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1
		createUrnopengisspecificationgmlschemaxsddataQuality3Annotations();
		// urn:opengis:specification:gml:schema-xsd:observation:3.1.1
		createUrnopengisspecificationgmlschemaxsdobservation3Annotations();
		// urn:opengis:specification:gml:schema-defaultStyle:v3.1.0
		createUrnopengisspecificationgmlschemadefaultStylev3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporalReferenceSystems3Annotations();
		// urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1
		createUrnopengisspecificationgmlschemaxsdtemporalTopology3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:gml:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgml3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:gml:3.1.1";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "gml.xsd"
		   });																																																																																																																							
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddynamicFeature3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1";				
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																																						
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:feature:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdfeaturev3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:feature:v3.1.1";					
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																																					
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryBasic2d3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1";						
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "geometryBasic2d.xsd"
		   });																																																																																																																				
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryBasic0d1dv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1";							
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "geometryBasic0d1d.xsd\n\n\t\t\t<sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n\t\t\t<sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n\t\t\t\t<sch:rule abstract=\"true\" id=\"CRSLabels\">\n\t\t\t\t\t<sch:report test=\"not(@srsDimension) or @srsName\">The presence of a dimension attribute implies the presence of the srsName attribute.</sch:report>\n\t\t\t\t\t<sch:report test=\"not(@axisLabels) or @srsName\">The presence of an axisLabels attribute implies the presence of the srsName attribute.</sch:report>\n\t\t\t\t\t<sch:report test=\"not(@uomLabels) or @srsName\">The presence of an uomLabels attribute implies the presence of the srsName attribute.</sch:report>\n\t\t\t\t\t<sch:report test=\"(not(@uomLabels) and not(@axisLabels)) or (@uomLabels and @axisLabels)\">The presence of an uomLabels attribute implies the presence of the axisLabels attribute and vice versa.</sch:report>\n\t\t\t\t</sch:rule>\n\t\t\t</sch:pattern>\n\t\t\t<sch:pattern name=\"Check Dimension\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n\t\t\t\t<sch:rule abstract=\"true\" id=\"Count\">\n\t\t\t\t\t<sch:report test=\"not(@count) or @srsDimension\">The presence of a count attribute implies the presence of the dimension attribute.</sch:report>\n\t\t\t\t</sch:rule>\n\t\t\t</sch:pattern>\n\t\t"
		   });																																																																																																																			
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-measures:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemameasures3Annotations() {
		String source = "urn:opengis:specification:gml:schema-measures:3.1.1";								
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																																		
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-units:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaunits3Annotations() {
		String source = "urn:opengis:specification:gml:schema-units:3.1.1";									
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																																	
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddictionary3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1";										
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																																
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgmlBase3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1";											
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t<sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n\t\t\t<sch:ns prefix=\"gml\" uri=\"http://www.opengis.net/gml\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n\t\t\t<sch:ns prefix=\"xlink\" uri=\"http://www.w3.org/1999/xlink\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n\t\t\t<sch:pattern name=\"Check either href or content not both\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n\t\t\t\t<sch:rule abstract=\"true\" id=\"hrefOrContent\">\n\t\t\t\t\t<sch:report test=\"@xlink:href and (*|text())\">Property element may not carry both a reference to an object and contain an object.</sch:report>\n\t\t\t\t\t<sch:assert test=\"@xlink:href | (*|text())\">Property element must either carry a reference to an object or contain an object.</sch:assert>\n\t\t\t\t</sch:rule>\n\t\t\t</sch:pattern>\n\t\t"
		   });																																																																																																															
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdbasicTypes3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1";												
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "basicTypes.xsd"
		   });																																																																																																														
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xlinks:v3.0c2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxlinksv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xlinks:v3.0c2";													
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "xlinks.xsd v3.0b2 2001-07"
		   });																																																																																																													
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporal:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporal3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporal:3.1.1";														
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																												
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:direction:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddirection3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:direction:3.1.1";															
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "direction.xsd"
		   });																																																																																																											
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:topology:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtopology3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:topology:3.1.1";																
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "topology.xsd"
		   });																																																																																																										
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryComplexesv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1";																	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "geometryComplexes.xsd"
		   });																																																																																																									
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryAggregates3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1";																		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "geometryAggregates.xsd"
		   });																																																																																																								
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgeometryPrimitives3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1";																			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "geometryPrimitives.xsd"
		   });																																																																																																							
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coverage:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoverage3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coverage:3.1.1";																				
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "coverage.xsd"
		   });																																																																																																						
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdvalueObjects3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1";																					
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "valueObjects.xsd"
		   });																																																																																																					
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:grids:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdgrids3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:grids:3.1.1";																						
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "grids.xsd"
		   });																																																																																																				
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1";																							
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																			
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1";																								
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																		
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdreferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1";																									
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																	
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:datums:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddatums3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:datums:3.1.1";																										
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																																
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdcoordinateOperations3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1";																											
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																															
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddataQuality3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1";																												
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																														
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:observation:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdobservation3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:observation:3.1.1";																													
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "observation.xsd"
		   });																																																																																													
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-defaultStyle:v3.1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemadefaultStylev3Annotations() {
		String source = "urn:opengis:specification:gml:schema-defaultStyle:v3.1.0";																														
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "defaultStyle.xsd"
		   });																																																																																												
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporalReferenceSystems3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1";																															
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																											
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsdtemporalTopology3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1";																																
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });																																																																																										
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";																																		
		addAnnotation
		  (abstractCityObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractCityObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractCityObjectType_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractCityObjectType_TerminationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "terminationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractCityObjectType_ExternalReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractCityObjectType_GeneralizesTo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "generalizesTo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractCityObjectType_GenericApplicationPropertyOfCityObjectGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfCityObject:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractCityObjectType_GenericApplicationPropertyOfCityObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfCityObject",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfCityObject:group"
		   });			
		addAnnotation
		  (abstractSiteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractSiteType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractSiteType_GenericApplicationPropertyOfSiteGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfSite:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractSiteType_GenericApplicationPropertyOfSite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSite",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfSite:group"
		   });			
		addAnnotation
		  (addressPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AddressPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressPropertyType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (addressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AddressType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressType_XalAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "xalAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_MultiPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "multiPoint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_GenericApplicationPropertyOfAddressGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfAddress:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_GenericApplicationPropertyOfAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAddress",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfAddress:group"
		   });			
		addAnnotation
		  (cityModelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CityModelType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCityModelType_GenericApplicationPropertyOfCityModelGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfCityModel:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCityModelType_GenericApplicationPropertyOfCityModel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfCityModel",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfCityModel:group"
		   });			
		addAnnotation
		  (doubleBetween0and1EDataType, 
		   source, 
		   new String[] {
			 "name", "doubleBetween0and1",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "0",
			 "maxInclusive", "1"
		   });			
		addAnnotation
		  (doubleBetween0and1ListEDataType, 
		   source, 
		   new String[] {
			 "name", "doubleBetween0and1List",
			 "itemType", "doubleBetween0and1"
		   });		
		addAnnotation
		  (doubleBetween0and1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "doubleBetween0and1:Object",
			 "baseType", "doubleBetween0and1"
		   });		
		addAnnotation
		  (externalObjectReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalObjectReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalObjectReferenceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExternalObjectReferenceType_Uri(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "uri",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (externalReferenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalReferenceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalReferenceType_InformationSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "informationSystem",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExternalReferenceType_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalObject",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (generalizationRelationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GeneralizationRelationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGeneralizationRelationType_CityObjectGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_CityObject:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeneralizationRelationType_CityObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_CityObject",
			 "namespace", "##targetNamespace",
			 "group", "_CityObject:group"
		   });			
		addAnnotation
		  (getGeneralizationRelationType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getGeneralizationRelationType_Arcrole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arcrole",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getGeneralizationRelationType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getGeneralizationRelationType_RemoteSchema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSchema",
			 "namespace", "http://www.opengis.net/gml"
		   });		
		addAnnotation
		  (getGeneralizationRelationType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getGeneralizationRelationType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getGeneralizationRelationType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getGeneralizationRelationType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (implicitGeometryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ImplicitGeometryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getImplicitGeometryType_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mimeType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImplicitGeometryType_TransformationMatrix(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transformationMatrix",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImplicitGeometryType_LibraryObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "libraryObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImplicitGeometryType_RelativeGMLGeometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relativeGMLGeometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImplicitGeometryType_ReferencePoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencePoint",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (implicitRepresentationPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ImplicitRepresentationPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getImplicitRepresentationPropertyType_ImplicitGeometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ImplicitGeometry",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (integerBetween0and4EDataType, 
		   source, 
		   new String[] {
			 "name", "integerBetween0and4",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "0",
			 "maxInclusive", "4"
		   });			
		addAnnotation
		  (mimeTypeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "MimeTypeType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (transformationMatrix2x2TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TransformationMatrix2x2Type",
			 "baseType", "http://www.opengis.net/gml#doubleList",
			 "length", "4"
		   });			
		addAnnotation
		  (transformationMatrix3x4TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TransformationMatrix3x4Type",
			 "baseType", "http://www.opengis.net/gml#doubleList",
			 "length", "12"
		   });			
		addAnnotation
		  (transformationMatrix4x4TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TransformationMatrix4x4Type",
			 "baseType", "http://www.opengis.net/gml#doubleList",
			 "length", "16"
		   });			
		addAnnotation
		  (xalAddressPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "xalAddressPropertyType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getXalAddressPropertyType_AddressDetails(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AddressDetails",
			 "namespace", "urn:oasis:names:tc:ciq:xsdschema:xAL:2.0"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Site(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_Site",
			 "namespace", "##targetNamespace",
			 "affiliation", "_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_CityObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_CityObject",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#_Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfCityModel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfCityModel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfCityObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfCityObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfSite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSite",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Address",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#_Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_CityModel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CityModel",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#_FeatureCollection"
		   });		
		addAnnotation
		  (getDocumentRoot_CityObjectMember(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cityObjectMember",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#featureMember"
		   });		
		addAnnotation
		  (getDocumentRoot_ImplicitGeometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ImplicitGeometry",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#_GML"
		   });
	}

} //CitygmlPackageImpl
