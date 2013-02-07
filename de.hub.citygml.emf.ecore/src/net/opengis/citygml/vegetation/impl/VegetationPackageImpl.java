/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation.impl;

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
import net.opengis.citygml.vegetation.AbstractVegetationObjectType;
import net.opengis.citygml.vegetation.DocumentRoot;
import net.opengis.citygml.vegetation.PlantCoverType;
import net.opengis.citygml.vegetation.SolitaryVegetationObjectType;
import net.opengis.citygml.vegetation.VegetationFactory;
import net.opengis.citygml.vegetation.VegetationPackage;
import net.opengis.citygml.waterbody.WaterbodyPackage;
import net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.impl.GmlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
public class VegetationPackageImpl extends EPackageImpl implements VegetationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractVegetationObjectTypeEClass = null;

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
	private EClass plantCoverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solitaryVegetationObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType plantClassTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType plantCoverClassTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType plantCoverFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType plantFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType speciesTypeEDataType = null;

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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VegetationPackageImpl() {
		super(eNS_URI, VegetationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VegetationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VegetationPackage init() {
		if (isInited) return (VegetationPackage)EPackage.Registry.INSTANCE.getEPackage(VegetationPackage.eNS_URI);

		// Obtain or create and register package
		VegetationPackageImpl theVegetationPackage = (VegetationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VegetationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VegetationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) : BuildingPackage.eINSTANCE);
		CitygmlPackageImpl theCitygmlPackage = (CitygmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) instanceof CitygmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) : CitygmlPackage.eINSTANCE);
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
		WaterbodyPackageImpl theWaterbodyPackage = (WaterbodyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WaterbodyPackage.eNS_URI) instanceof WaterbodyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WaterbodyPackage.eNS_URI) : WaterbodyPackage.eINSTANCE);
		GenericsPackageImpl theGenericsPackage = (GenericsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) instanceof GenericsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericsPackage.eNS_URI) : GenericsPackage.eINSTANCE);
		Smil20PackageImpl theSmil20Package = (Smil20PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Smil20Package.eNS_URI) instanceof Smil20PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Smil20Package.eNS_URI) : Smil20Package.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);

		// Load packages
		theGmlPackage.loadPackage();
		theXALPackage.loadPackage();

		// Create package meta-data objects
		theVegetationPackage.createPackageContents();
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
		theWaterbodyPackage.createPackageContents();
		theGenericsPackage.createPackageContents();
		theSmil20Package.createPackageContents();
		theLanguagePackage.createPackageContents();
		theNamespacePackage.createPackageContents();

		// Initialize created meta-data
		theVegetationPackage.initializePackageContents();
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
		theWaterbodyPackage.initializePackageContents();
		theGenericsPackage.initializePackageContents();
		theSmil20Package.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();

		// Fix loaded packages
		theGmlPackage.fixPackageContents();
		theXALPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theVegetationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VegetationPackage.eNS_URI, theVegetationPackage);
		return theVegetationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractVegetationObjectType() {
		return abstractVegetationObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObjectGroup() {
		return (EAttribute)abstractVegetationObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObject() {
		return (EReference)abstractVegetationObjectTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_GenericApplicationPropertyOfPlantCover() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfSolitaryVegetationObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfVegetationObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VegetationObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PlantCover() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SolitaryVegetationObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantCoverType() {
		return plantCoverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantCoverType_Class() {
		return (EAttribute)plantCoverTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantCoverType_Function() {
		return (EAttribute)plantCoverTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_AverageHeight() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_Lod1MultiSurface() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_Lod2MultiSurface() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_Lod3MultiSurface() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_Lod4MultiSurface() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_Lod1MultiSolid() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_Lod2MultiSolid() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_Lod3MultiSolid() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantCoverType_GenericApplicationPropertyOfPlantCoverGroup() {
		return (EAttribute)plantCoverTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantCoverType_GenericApplicationPropertyOfPlantCover() {
		return (EReference)plantCoverTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolitaryVegetationObjectType() {
		return solitaryVegetationObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolitaryVegetationObjectType_Class() {
		return (EAttribute)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolitaryVegetationObjectType_Function() {
		return (EAttribute)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolitaryVegetationObjectType_Species() {
		return (EAttribute)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Height() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_TrunkDiameter() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_CrownDiameter() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod1Geometry() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod2Geometry() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod3Geometry() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod4Geometry() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod1ImplicitRepresentation() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod2ImplicitRepresentation() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod3ImplicitRepresentation() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_Lod4ImplicitRepresentation() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObjectGroup() {
		return (EAttribute)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObject() {
		return (EReference)solitaryVegetationObjectTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlantClassType() {
		return plantClassTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlantCoverClassType() {
		return plantCoverClassTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlantCoverFunctionType() {
		return plantCoverFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlantFunctionType() {
		return plantFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpeciesType() {
		return speciesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VegetationFactory getVegetationFactory() {
		return (VegetationFactory)getEFactoryInstance();
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
		abstractVegetationObjectTypeEClass = createEClass(ABSTRACT_VEGETATION_OBJECT_TYPE);
		createEAttribute(abstractVegetationObjectTypeEClass, ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP);
		createEReference(abstractVegetationObjectTypeEClass, ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VEGETATION_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLANT_COVER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT);

		plantCoverTypeEClass = createEClass(PLANT_COVER_TYPE);
		createEAttribute(plantCoverTypeEClass, PLANT_COVER_TYPE__CLASS);
		createEAttribute(plantCoverTypeEClass, PLANT_COVER_TYPE__FUNCTION);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__AVERAGE_HEIGHT);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__LOD1_MULTI_SURFACE);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__LOD2_MULTI_SURFACE);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__LOD3_MULTI_SURFACE);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__LOD4_MULTI_SURFACE);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__LOD1_MULTI_SOLID);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__LOD2_MULTI_SOLID);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__LOD3_MULTI_SOLID);
		createEAttribute(plantCoverTypeEClass, PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP);
		createEReference(plantCoverTypeEClass, PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER);

		solitaryVegetationObjectTypeEClass = createEClass(SOLITARY_VEGETATION_OBJECT_TYPE);
		createEAttribute(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__CLASS);
		createEAttribute(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION);
		createEAttribute(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION);
		createEAttribute(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP);
		createEReference(solitaryVegetationObjectTypeEClass, SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT);

		// Create data types
		plantClassTypeEDataType = createEDataType(PLANT_CLASS_TYPE);
		plantCoverClassTypeEDataType = createEDataType(PLANT_COVER_CLASS_TYPE);
		plantCoverFunctionTypeEDataType = createEDataType(PLANT_COVER_FUNCTION_TYPE);
		plantFunctionTypeEDataType = createEDataType(PLANT_FUNCTION_TYPE);
		speciesTypeEDataType = createEDataType(SPECIES_TYPE);
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
		CitygmlPackage theCitygmlPackage = (CitygmlPackage)EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI);
		GmlPackage theGmlPackage = (GmlPackage)EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractVegetationObjectTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		plantCoverTypeEClass.getESuperTypes().add(this.getAbstractVegetationObjectType());
		solitaryVegetationObjectTypeEClass.getESuperTypes().add(this.getAbstractVegetationObjectType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractVegetationObjectTypeEClass, AbstractVegetationObjectType.class, "AbstractVegetationObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObjectGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfVegetationObjectGroup", null, 0, -1, AbstractVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfVegetationObject", null, 0, -1, AbstractVegetationObjectType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfPlantCover(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfPlantCover", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfSolitaryVegetationObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSolitaryVegetationObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfVegetationObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfVegetationObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_VegetationObject(), this.getAbstractVegetationObjectType(), null, "vegetationObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PlantCover(), this.getPlantCoverType(), null, "plantCover", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SolitaryVegetationObject(), this.getSolitaryVegetationObjectType(), null, "solitaryVegetationObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(plantCoverTypeEClass, PlantCoverType.class, "PlantCoverType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlantCoverType_Class(), this.getPlantCoverClassType(), "class", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantCoverType_Function(), this.getPlantCoverFunctionType(), "function", null, 0, -1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_AverageHeight(), theGmlPackage.getLengthType(), null, "averageHeight", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_Lod1MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod1MultiSurface", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_Lod2MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod2MultiSurface", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_Lod3MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod3MultiSurface", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_Lod1MultiSolid(), theGmlPackage.getMultiSolidPropertyType(), null, "lod1MultiSolid", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_Lod2MultiSolid(), theGmlPackage.getMultiSolidPropertyType(), null, "lod2MultiSolid", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_Lod3MultiSolid(), theGmlPackage.getMultiSolidPropertyType(), null, "lod3MultiSolid", null, 0, 1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantCoverType_GenericApplicationPropertyOfPlantCoverGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfPlantCoverGroup", null, 0, -1, PlantCoverType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantCoverType_GenericApplicationPropertyOfPlantCover(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfPlantCover", null, 0, -1, PlantCoverType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(solitaryVegetationObjectTypeEClass, SolitaryVegetationObjectType.class, "SolitaryVegetationObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolitaryVegetationObjectType_Class(), this.getPlantClassType(), "class", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolitaryVegetationObjectType_Function(), this.getPlantFunctionType(), "function", null, 0, -1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolitaryVegetationObjectType_Species(), this.getSpeciesType(), "species", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Height(), theGmlPackage.getLengthType(), null, "height", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_TrunkDiameter(), theGmlPackage.getLengthType(), null, "trunkDiameter", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_CrownDiameter(), theGmlPackage.getLengthType(), null, "crownDiameter", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod1Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod1Geometry", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod2Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod2Geometry", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod3Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod3Geometry", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod4Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod4Geometry", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod1ImplicitRepresentation(), theCitygmlPackage.getImplicitRepresentationPropertyType(), null, "lod1ImplicitRepresentation", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod2ImplicitRepresentation(), theCitygmlPackage.getImplicitRepresentationPropertyType(), null, "lod2ImplicitRepresentation", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod3ImplicitRepresentation(), theCitygmlPackage.getImplicitRepresentationPropertyType(), null, "lod3ImplicitRepresentation", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_Lod4ImplicitRepresentation(), theCitygmlPackage.getImplicitRepresentationPropertyType(), null, "lod4ImplicitRepresentation", null, 0, 1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObjectGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfSolitaryVegetationObjectGroup", null, 0, -1, SolitaryVegetationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSolitaryVegetationObject", null, 0, -1, SolitaryVegetationObjectType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(plantClassTypeEDataType, String.class, "PlantClassType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(plantCoverClassTypeEDataType, String.class, "PlantCoverClassType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(plantCoverFunctionTypeEDataType, String.class, "PlantCoverFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(plantFunctionTypeEDataType, String.class, "PlantFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(speciesTypeEDataType, String.class, "SpeciesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (abstractVegetationObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractVegetationObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObjectGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfVegetationObject:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfVegetationObject",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfVegetationObject:group"
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
		  (getDocumentRoot_GenericApplicationPropertyOfPlantCover(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfPlantCover",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfSolitaryVegetationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSolitaryVegetationObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfVegetationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfVegetationObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_VegetationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_VegetationObject",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_PlantCover(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PlantCover",
			 "namespace", "##targetNamespace",
			 "affiliation", "_VegetationObject"
		   });		
		addAnnotation
		  (getDocumentRoot_SolitaryVegetationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SolitaryVegetationObject",
			 "namespace", "##targetNamespace",
			 "affiliation", "_VegetationObject"
		   });			
		addAnnotation
		  (plantClassTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "PlantClassType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (plantCoverClassTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "PlantCoverClassType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (plantCoverFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "PlantCoverFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (plantCoverTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PlantCoverType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPlantCoverType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_AverageHeight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "averageHeight",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Lod1MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Lod2MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Lod3MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Lod1MultiSolid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1MultiSolid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Lod2MultiSolid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiSolid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_Lod3MultiSolid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSolid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_GenericApplicationPropertyOfPlantCoverGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfPlantCover:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlantCoverType_GenericApplicationPropertyOfPlantCover(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfPlantCover",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfPlantCover:group"
		   });			
		addAnnotation
		  (plantFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "PlantFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (solitaryVegetationObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SolitaryVegetationObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Species(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "species",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Height(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_TrunkDiameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trunkDiameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_CrownDiameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "crownDiameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod1Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod2Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod3Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod4Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod1ImplicitRepresentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1ImplicitRepresentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod2ImplicitRepresentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2ImplicitRepresentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod3ImplicitRepresentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3ImplicitRepresentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_Lod4ImplicitRepresentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4ImplicitRepresentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObjectGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfSolitaryVegetationObject:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSolitaryVegetationObject",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfSolitaryVegetationObject:group"
		   });			
		addAnnotation
		  (speciesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "SpeciesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
	}

} //VegetationPackageImpl
