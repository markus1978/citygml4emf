/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.impl.AppearancePackageImpl;
import net.opengis.citygml.building.AbstractBoundarySurfaceType;
import net.opengis.citygml.building.AbstractBuildingType;
import net.opengis.citygml.building.AbstractOpeningType;
import net.opengis.citygml.building.BoundarySurfacePropertyType;
import net.opengis.citygml.building.BuildingFactory;
import net.opengis.citygml.building.BuildingFurnitureType;
import net.opengis.citygml.building.BuildingInstallationPropertyType;
import net.opengis.citygml.building.BuildingInstallationType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.BuildingPartPropertyType;
import net.opengis.citygml.building.BuildingPartType;
import net.opengis.citygml.building.BuildingType;
import net.opengis.citygml.building.CeilingSurfaceType;
import net.opengis.citygml.building.ClosureSurfaceType;
import net.opengis.citygml.building.DocumentRoot;
import net.opengis.citygml.building.DoorType;
import net.opengis.citygml.building.FloorSurfaceType;
import net.opengis.citygml.building.GroundSurfaceType;
import net.opengis.citygml.building.IntBuildingInstallationPropertyType;
import net.opengis.citygml.building.IntBuildingInstallationType;
import net.opengis.citygml.building.InteriorFurniturePropertyType;
import net.opengis.citygml.building.InteriorRoomPropertyType;
import net.opengis.citygml.building.InteriorWallSurfaceType;
import net.opengis.citygml.building.OpeningPropertyType;
import net.opengis.citygml.building.RoofSurfaceType;
import net.opengis.citygml.building.RoomType;
import net.opengis.citygml.building.WallSurfaceType;
import net.opengis.citygml.building.WindowType;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
public class BuildingPackageImpl extends EPackageImpl implements BuildingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractBoundarySurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractBuildingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOpeningTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundarySurfacePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingFurnitureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingInstallationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingInstallationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingPartPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingPartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceilingSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closureSurfaceTypeEClass = null;

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
	private EClass doorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intBuildingInstallationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intBuildingInstallationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interiorFurniturePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interiorRoomPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interiorWallSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openingPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roofSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingClassTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingFurnitureClassTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingFurnitureFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingFurnitureUsageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingInstallationClassTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingInstallationFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingInstallationUsageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType buildingUsageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intBuildingInstallationClassTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intBuildingInstallationFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intBuildingInstallationUsageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roofTypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roomClassTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roomFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roomUsageTypeEDataType = null;

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
	 * @see net.opengis.citygml.building.BuildingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuildingPackageImpl() {
		super(eNS_URI, BuildingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BuildingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuildingPackage init() {
		if (isInited) return (BuildingPackage)EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI);

		// Obtain or create and register package
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuildingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
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
		theGmlPackage.fixPackageContents();
		theXALPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuildingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuildingPackage.eNS_URI, theBuildingPackage);
		return theBuildingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBoundarySurfaceType() {
		return abstractBoundarySurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBoundarySurfaceType_Lod2MultiSurface() {
		return (EReference)abstractBoundarySurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBoundarySurfaceType_Lod3MultiSurface() {
		return (EReference)abstractBoundarySurfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBoundarySurfaceType_Lod4MultiSurface() {
		return (EReference)abstractBoundarySurfaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBoundarySurfaceType_Opening() {
		return (EReference)abstractBoundarySurfaceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurfaceGroup() {
		return (EAttribute)abstractBoundarySurfaceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurface() {
		return (EReference)abstractBoundarySurfaceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBuildingType() {
		return abstractBuildingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_Class() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_Function() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_Usage() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_YearOfConstruction() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_YearOfDemolition() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_RoofType() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_MeasuredHeight() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_StoreysAboveGround() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_StoreysBelowGround() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_StoreyHeightsAboveGround() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_StoreyHeightsBelowGround() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod1Solid() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod1MultiSurface() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod1TerrainIntersection() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod2Solid() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod2MultiSurface() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod2MultiCurve() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod2TerrainIntersection() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_OuterBuildingInstallation() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_InteriorBuildingInstallation() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_BoundedBy1() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod3Solid() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod3MultiSurface() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod3MultiCurve() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod3TerrainIntersection() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod4Solid() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod4MultiSurface() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod4MultiCurve() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Lod4TerrainIntersection() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_InteriorRoom() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_ConsistsOfBuildingPart() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_Address() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuildingGroup() {
		return (EAttribute)abstractBuildingTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuilding() {
		return (EReference)abstractBuildingTypeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOpeningType() {
		return abstractOpeningTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOpeningType_Lod3MultiSurface() {
		return (EReference)abstractOpeningTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOpeningType_Lod4MultiSurface() {
		return (EReference)abstractOpeningTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractOpeningType_GenericApplicationPropertyOfOpeningGroup() {
		return (EAttribute)abstractOpeningTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractOpeningType_GenericApplicationPropertyOfOpening() {
		return (EReference)abstractOpeningTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundarySurfacePropertyType() {
		return boundarySurfacePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundarySurfacePropertyType_BoundarySurfaceGroup() {
		return (EAttribute)boundarySurfacePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundarySurfacePropertyType_BoundarySurface() {
		return (EReference)boundarySurfacePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingFurnitureType() {
		return buildingFurnitureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingFurnitureType_Class() {
		return (EAttribute)buildingFurnitureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingFurnitureType_Function() {
		return (EAttribute)buildingFurnitureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingFurnitureType_Usage() {
		return (EAttribute)buildingFurnitureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingFurnitureType_Lod4Geometry() {
		return (EReference)buildingFurnitureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingFurnitureType_Lod4ImplicitRepresentation() {
		return (EReference)buildingFurnitureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurnitureGroup() {
		return (EAttribute)buildingFurnitureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurniture() {
		return (EReference)buildingFurnitureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingInstallationPropertyType() {
		return buildingInstallationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingInstallationPropertyType_BuildingInstallation() {
		return (EReference)buildingInstallationPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingInstallationType() {
		return buildingInstallationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingInstallationType_Class() {
		return (EAttribute)buildingInstallationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingInstallationType_Function() {
		return (EAttribute)buildingInstallationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingInstallationType_Usage() {
		return (EAttribute)buildingInstallationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingInstallationType_Lod2Geometry() {
		return (EReference)buildingInstallationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingInstallationType_Lod3Geometry() {
		return (EReference)buildingInstallationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingInstallationType_Lod4Geometry() {
		return (EReference)buildingInstallationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallationGroup() {
		return (EAttribute)buildingInstallationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallation() {
		return (EReference)buildingInstallationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingPartPropertyType() {
		return buildingPartPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingPartPropertyType_BuildingPart() {
		return (EReference)buildingPartPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingPartType() {
		return buildingPartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingPartType_GenericApplicationPropertyOfBuildingPartGroup() {
		return (EAttribute)buildingPartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingPartType_GenericApplicationPropertyOfBuildingPart() {
		return (EReference)buildingPartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildingType() {
		return buildingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuildingType_GenericApplicationPropertyOfBuildingGroup() {
		return (EAttribute)buildingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildingType_GenericApplicationPropertyOfBuilding() {
		return (EReference)buildingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeilingSurfaceType() {
		return ceilingSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurfaceGroup() {
		return (EAttribute)ceilingSurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurface() {
		return (EReference)ceilingSurfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosureSurfaceType() {
		return closureSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClosureSurfaceType_GenericApplicationPropertyOfClosureSurfaceGroup() {
		return (EAttribute)closureSurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClosureSurfaceType_GenericApplicationPropertyOfClosureSurface() {
		return (EReference)closureSurfaceTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AbstractBuilding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BoundarySurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfAbstractBuilding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfBoundarySurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfBuilding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfBuildingFurniture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfBuildingInstallation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfBuildingPart() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfCeilingSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfClosureSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfDoor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfFloorSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfGroundSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfIntBuildingInstallation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfInteriorWallSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfOpening() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfRoofSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfRoom() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfWallSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfWindow() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Opening() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Building() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BuildingFurniture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BuildingInstallation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BuildingPart() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CeilingSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClosureSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Door() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FloorSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GroundSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntBuildingInstallation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InteriorWallSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RoofSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Room() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WallSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Window() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoorType() {
		return doorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoorType_Address() {
		return (EReference)doorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoorType_GenericApplicationPropertyOfDoorGroup() {
		return (EAttribute)doorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoorType_GenericApplicationPropertyOfDoor() {
		return (EReference)doorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorSurfaceType() {
		return floorSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloorSurfaceType_GenericApplicationPropertyOfFloorSurfaceGroup() {
		return (EAttribute)floorSurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloorSurfaceType_GenericApplicationPropertyOfFloorSurface() {
		return (EReference)floorSurfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundSurfaceType() {
		return groundSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroundSurfaceType_GenericApplicationPropertyOfGroundSurfaceGroup() {
		return (EAttribute)groundSurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundSurfaceType_GenericApplicationPropertyOfGroundSurface() {
		return (EReference)groundSurfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntBuildingInstallationPropertyType() {
		return intBuildingInstallationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntBuildingInstallationPropertyType_IntBuildingInstallation() {
		return (EReference)intBuildingInstallationPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntBuildingInstallationType() {
		return intBuildingInstallationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntBuildingInstallationType_Class() {
		return (EAttribute)intBuildingInstallationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntBuildingInstallationType_Function() {
		return (EAttribute)intBuildingInstallationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntBuildingInstallationType_Usage() {
		return (EAttribute)intBuildingInstallationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntBuildingInstallationType_Lod4Geometry() {
		return (EReference)intBuildingInstallationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallationGroup() {
		return (EAttribute)intBuildingInstallationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallation() {
		return (EReference)intBuildingInstallationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteriorFurniturePropertyType() {
		return interiorFurniturePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteriorFurniturePropertyType_BuildingFurniture() {
		return (EReference)interiorFurniturePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteriorRoomPropertyType() {
		return interiorRoomPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteriorRoomPropertyType_Room() {
		return (EReference)interiorRoomPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteriorWallSurfaceType() {
		return interiorWallSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurfaceGroup() {
		return (EAttribute)interiorWallSurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurface() {
		return (EReference)interiorWallSurfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpeningPropertyType() {
		return openingPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpeningPropertyType_OpeningGroup() {
		return (EAttribute)openingPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpeningPropertyType_Opening() {
		return (EReference)openingPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoofSurfaceType() {
		return roofSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoofSurfaceType_GenericApplicationPropertyOfRoofSurfaceGroup() {
		return (EAttribute)roofSurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoofSurfaceType_GenericApplicationPropertyOfRoofSurface() {
		return (EReference)roofSurfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Class() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Function() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Usage() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_Lod4Solid() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_Lod4MultiSurface() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_BoundedBy1() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_InteriorFurniture() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_RoomInstallation() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_GenericApplicationPropertyOfRoomGroup() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomType_GenericApplicationPropertyOfRoom() {
		return (EReference)roomTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallSurfaceType() {
		return wallSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallSurfaceType_GenericApplicationPropertyOfWallSurfaceGroup() {
		return (EAttribute)wallSurfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWallSurfaceType_GenericApplicationPropertyOfWallSurface() {
		return (EReference)wallSurfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindowType() {
		return windowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowType_GenericApplicationPropertyOfWindowGroup() {
		return (EAttribute)windowTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindowType_GenericApplicationPropertyOfWindow() {
		return (EReference)windowTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingClassType() {
		return buildingClassTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingFunctionType() {
		return buildingFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingFurnitureClassType() {
		return buildingFurnitureClassTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingFurnitureFunctionType() {
		return buildingFurnitureFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingFurnitureUsageType() {
		return buildingFurnitureUsageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingInstallationClassType() {
		return buildingInstallationClassTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingInstallationFunctionType() {
		return buildingInstallationFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingInstallationUsageType() {
		return buildingInstallationUsageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBuildingUsageType() {
		return buildingUsageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntBuildingInstallationClassType() {
		return intBuildingInstallationClassTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntBuildingInstallationFunctionType() {
		return intBuildingInstallationFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntBuildingInstallationUsageType() {
		return intBuildingInstallationUsageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoofTypeType() {
		return roofTypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoomClassType() {
		return roomClassTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoomFunctionType() {
		return roomFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoomUsageType() {
		return roomUsageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingFactory getBuildingFactory() {
		return (BuildingFactory)getEFactoryInstance();
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
		abstractBoundarySurfaceTypeEClass = createEClass(ABSTRACT_BOUNDARY_SURFACE_TYPE);
		createEReference(abstractBoundarySurfaceTypeEClass, ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE);
		createEReference(abstractBoundarySurfaceTypeEClass, ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE);
		createEReference(abstractBoundarySurfaceTypeEClass, ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE);
		createEReference(abstractBoundarySurfaceTypeEClass, ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING);
		createEAttribute(abstractBoundarySurfaceTypeEClass, ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP);
		createEReference(abstractBoundarySurfaceTypeEClass, ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE);

		abstractBuildingTypeEClass = createEClass(ABSTRACT_BUILDING_TYPE);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__CLASS);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__FUNCTION);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__USAGE);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__ROOF_TYPE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD1_SOLID);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD2_SOLID);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__BOUNDED_BY1);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD3_SOLID);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD4_SOLID);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__ADDRESS);
		createEAttribute(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP);
		createEReference(abstractBuildingTypeEClass, ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING);

		abstractOpeningTypeEClass = createEClass(ABSTRACT_OPENING_TYPE);
		createEReference(abstractOpeningTypeEClass, ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE);
		createEReference(abstractOpeningTypeEClass, ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE);
		createEAttribute(abstractOpeningTypeEClass, ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP);
		createEReference(abstractOpeningTypeEClass, ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING);

		boundarySurfacePropertyTypeEClass = createEClass(BOUNDARY_SURFACE_PROPERTY_TYPE);
		createEAttribute(boundarySurfacePropertyTypeEClass, BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP);
		createEReference(boundarySurfacePropertyTypeEClass, BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE);

		buildingFurnitureTypeEClass = createEClass(BUILDING_FURNITURE_TYPE);
		createEAttribute(buildingFurnitureTypeEClass, BUILDING_FURNITURE_TYPE__CLASS);
		createEAttribute(buildingFurnitureTypeEClass, BUILDING_FURNITURE_TYPE__FUNCTION);
		createEAttribute(buildingFurnitureTypeEClass, BUILDING_FURNITURE_TYPE__USAGE);
		createEReference(buildingFurnitureTypeEClass, BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY);
		createEReference(buildingFurnitureTypeEClass, BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION);
		createEAttribute(buildingFurnitureTypeEClass, BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP);
		createEReference(buildingFurnitureTypeEClass, BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE);

		buildingInstallationPropertyTypeEClass = createEClass(BUILDING_INSTALLATION_PROPERTY_TYPE);
		createEReference(buildingInstallationPropertyTypeEClass, BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION);

		buildingInstallationTypeEClass = createEClass(BUILDING_INSTALLATION_TYPE);
		createEAttribute(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__CLASS);
		createEAttribute(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__FUNCTION);
		createEAttribute(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__USAGE);
		createEReference(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY);
		createEReference(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY);
		createEReference(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY);
		createEAttribute(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP);
		createEReference(buildingInstallationTypeEClass, BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION);

		buildingPartPropertyTypeEClass = createEClass(BUILDING_PART_PROPERTY_TYPE);
		createEReference(buildingPartPropertyTypeEClass, BUILDING_PART_PROPERTY_TYPE__BUILDING_PART);

		buildingPartTypeEClass = createEClass(BUILDING_PART_TYPE);
		createEAttribute(buildingPartTypeEClass, BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP);
		createEReference(buildingPartTypeEClass, BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART);

		buildingTypeEClass = createEClass(BUILDING_TYPE);
		createEAttribute(buildingTypeEClass, BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP);
		createEReference(buildingTypeEClass, BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING);

		ceilingSurfaceTypeEClass = createEClass(CEILING_SURFACE_TYPE);
		createEAttribute(ceilingSurfaceTypeEClass, CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP);
		createEReference(ceilingSurfaceTypeEClass, CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE);

		closureSurfaceTypeEClass = createEClass(CLOSURE_SURFACE_TYPE);
		createEAttribute(closureSurfaceTypeEClass, CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP);
		createEReference(closureSurfaceTypeEClass, CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT_BUILDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOUNDARY_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OPENING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUILDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUILDING_FURNITURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUILDING_INSTALLATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUILDING_PART);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CEILING_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLOSURE_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOOR_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GROUND_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INT_BUILDING_INSTALLATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERIOR_WALL_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOF_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WALL_SURFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WINDOW);

		doorTypeEClass = createEClass(DOOR_TYPE);
		createEReference(doorTypeEClass, DOOR_TYPE__ADDRESS);
		createEAttribute(doorTypeEClass, DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP);
		createEReference(doorTypeEClass, DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR);

		floorSurfaceTypeEClass = createEClass(FLOOR_SURFACE_TYPE);
		createEAttribute(floorSurfaceTypeEClass, FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP);
		createEReference(floorSurfaceTypeEClass, FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE);

		groundSurfaceTypeEClass = createEClass(GROUND_SURFACE_TYPE);
		createEAttribute(groundSurfaceTypeEClass, GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP);
		createEReference(groundSurfaceTypeEClass, GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE);

		intBuildingInstallationPropertyTypeEClass = createEClass(INT_BUILDING_INSTALLATION_PROPERTY_TYPE);
		createEReference(intBuildingInstallationPropertyTypeEClass, INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION);

		intBuildingInstallationTypeEClass = createEClass(INT_BUILDING_INSTALLATION_TYPE);
		createEAttribute(intBuildingInstallationTypeEClass, INT_BUILDING_INSTALLATION_TYPE__CLASS);
		createEAttribute(intBuildingInstallationTypeEClass, INT_BUILDING_INSTALLATION_TYPE__FUNCTION);
		createEAttribute(intBuildingInstallationTypeEClass, INT_BUILDING_INSTALLATION_TYPE__USAGE);
		createEReference(intBuildingInstallationTypeEClass, INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY);
		createEAttribute(intBuildingInstallationTypeEClass, INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP);
		createEReference(intBuildingInstallationTypeEClass, INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION);

		interiorFurniturePropertyTypeEClass = createEClass(INTERIOR_FURNITURE_PROPERTY_TYPE);
		createEReference(interiorFurniturePropertyTypeEClass, INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE);

		interiorRoomPropertyTypeEClass = createEClass(INTERIOR_ROOM_PROPERTY_TYPE);
		createEReference(interiorRoomPropertyTypeEClass, INTERIOR_ROOM_PROPERTY_TYPE__ROOM);

		interiorWallSurfaceTypeEClass = createEClass(INTERIOR_WALL_SURFACE_TYPE);
		createEAttribute(interiorWallSurfaceTypeEClass, INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP);
		createEReference(interiorWallSurfaceTypeEClass, INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE);

		openingPropertyTypeEClass = createEClass(OPENING_PROPERTY_TYPE);
		createEAttribute(openingPropertyTypeEClass, OPENING_PROPERTY_TYPE__OPENING_GROUP);
		createEReference(openingPropertyTypeEClass, OPENING_PROPERTY_TYPE__OPENING);

		roofSurfaceTypeEClass = createEClass(ROOF_SURFACE_TYPE);
		createEAttribute(roofSurfaceTypeEClass, ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP);
		createEReference(roofSurfaceTypeEClass, ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__CLASS);
		createEAttribute(roomTypeEClass, ROOM_TYPE__FUNCTION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__USAGE);
		createEReference(roomTypeEClass, ROOM_TYPE__LOD4_SOLID);
		createEReference(roomTypeEClass, ROOM_TYPE__LOD4_MULTI_SURFACE);
		createEReference(roomTypeEClass, ROOM_TYPE__BOUNDED_BY1);
		createEReference(roomTypeEClass, ROOM_TYPE__INTERIOR_FURNITURE);
		createEReference(roomTypeEClass, ROOM_TYPE__ROOM_INSTALLATION);
		createEAttribute(roomTypeEClass, ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP);
		createEReference(roomTypeEClass, ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM);

		wallSurfaceTypeEClass = createEClass(WALL_SURFACE_TYPE);
		createEAttribute(wallSurfaceTypeEClass, WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP);
		createEReference(wallSurfaceTypeEClass, WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE);

		windowTypeEClass = createEClass(WINDOW_TYPE);
		createEAttribute(windowTypeEClass, WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP);
		createEReference(windowTypeEClass, WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW);

		// Create data types
		buildingClassTypeEDataType = createEDataType(BUILDING_CLASS_TYPE);
		buildingFunctionTypeEDataType = createEDataType(BUILDING_FUNCTION_TYPE);
		buildingFurnitureClassTypeEDataType = createEDataType(BUILDING_FURNITURE_CLASS_TYPE);
		buildingFurnitureFunctionTypeEDataType = createEDataType(BUILDING_FURNITURE_FUNCTION_TYPE);
		buildingFurnitureUsageTypeEDataType = createEDataType(BUILDING_FURNITURE_USAGE_TYPE);
		buildingInstallationClassTypeEDataType = createEDataType(BUILDING_INSTALLATION_CLASS_TYPE);
		buildingInstallationFunctionTypeEDataType = createEDataType(BUILDING_INSTALLATION_FUNCTION_TYPE);
		buildingInstallationUsageTypeEDataType = createEDataType(BUILDING_INSTALLATION_USAGE_TYPE);
		buildingUsageTypeEDataType = createEDataType(BUILDING_USAGE_TYPE);
		intBuildingInstallationClassTypeEDataType = createEDataType(INT_BUILDING_INSTALLATION_CLASS_TYPE);
		intBuildingInstallationFunctionTypeEDataType = createEDataType(INT_BUILDING_INSTALLATION_FUNCTION_TYPE);
		intBuildingInstallationUsageTypeEDataType = createEDataType(INT_BUILDING_INSTALLATION_USAGE_TYPE);
		roofTypeTypeEDataType = createEDataType(ROOF_TYPE_TYPE);
		roomClassTypeEDataType = createEDataType(ROOM_CLASS_TYPE);
		roomFunctionTypeEDataType = createEDataType(ROOM_FUNCTION_TYPE);
		roomUsageTypeEDataType = createEDataType(ROOM_USAGE_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractBoundarySurfaceTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		abstractBuildingTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractSiteType());
		abstractOpeningTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		boundarySurfacePropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		buildingFurnitureTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		buildingInstallationPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		buildingInstallationTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		buildingPartPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		buildingPartTypeEClass.getESuperTypes().add(this.getAbstractBuildingType());
		buildingTypeEClass.getESuperTypes().add(this.getAbstractBuildingType());
		ceilingSurfaceTypeEClass.getESuperTypes().add(this.getAbstractBoundarySurfaceType());
		closureSurfaceTypeEClass.getESuperTypes().add(this.getAbstractBoundarySurfaceType());
		doorTypeEClass.getESuperTypes().add(this.getAbstractOpeningType());
		floorSurfaceTypeEClass.getESuperTypes().add(this.getAbstractBoundarySurfaceType());
		groundSurfaceTypeEClass.getESuperTypes().add(this.getAbstractBoundarySurfaceType());
		intBuildingInstallationPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		intBuildingInstallationTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		interiorFurniturePropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		interiorRoomPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		interiorWallSurfaceTypeEClass.getESuperTypes().add(this.getAbstractBoundarySurfaceType());
		openingPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		roofSurfaceTypeEClass.getESuperTypes().add(this.getAbstractBoundarySurfaceType());
		roomTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		wallSurfaceTypeEClass.getESuperTypes().add(this.getAbstractBoundarySurfaceType());
		windowTypeEClass.getESuperTypes().add(this.getAbstractOpeningType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractBoundarySurfaceTypeEClass, AbstractBoundarySurfaceType.class, "AbstractBoundarySurfaceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractBoundarySurfaceType_Lod2MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod2MultiSurface", null, 0, 1, AbstractBoundarySurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBoundarySurfaceType_Lod3MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod3MultiSurface", null, 0, 1, AbstractBoundarySurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBoundarySurfaceType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, AbstractBoundarySurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBoundarySurfaceType_Opening(), this.getOpeningPropertyType(), null, "opening", null, 0, -1, AbstractBoundarySurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfBoundarySurfaceGroup", null, 0, -1, AbstractBoundarySurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBoundarySurface", null, 0, -1, AbstractBoundarySurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractBuildingTypeEClass, AbstractBuildingType.class, "AbstractBuildingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractBuildingType_Class(), this.getBuildingClassType(), "class", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_Function(), this.getBuildingFunctionType(), "function", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_Usage(), this.getBuildingUsageType(), "usage", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_YearOfConstruction(), theXMLTypePackage.getGYear(), "yearOfConstruction", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_YearOfDemolition(), theXMLTypePackage.getGYear(), "yearOfDemolition", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_RoofType(), this.getRoofTypeType(), "roofType", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_MeasuredHeight(), theGmlPackage.getLengthType(), null, "measuredHeight", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_StoreysAboveGround(), theXMLTypePackage.getNonNegativeInteger(), "storeysAboveGround", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_StoreysBelowGround(), theXMLTypePackage.getNonNegativeInteger(), "storeysBelowGround", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_StoreyHeightsAboveGround(), theGmlPackage.getMeasureOrNullListType(), null, "storeyHeightsAboveGround", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_StoreyHeightsBelowGround(), theGmlPackage.getMeasureOrNullListType(), null, "storeyHeightsBelowGround", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod1Solid(), theGmlPackage.getSolidPropertyType(), null, "lod1Solid", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod1MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod1MultiSurface", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod1TerrainIntersection(), theGmlPackage.getMultiCurvePropertyType(), null, "lod1TerrainIntersection", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod2Solid(), theGmlPackage.getSolidPropertyType(), null, "lod2Solid", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod2MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod2MultiSurface", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod2MultiCurve(), theGmlPackage.getMultiCurvePropertyType(), null, "lod2MultiCurve", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod2TerrainIntersection(), theGmlPackage.getMultiCurvePropertyType(), null, "lod2TerrainIntersection", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_OuterBuildingInstallation(), this.getBuildingInstallationPropertyType(), null, "outerBuildingInstallation", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_InteriorBuildingInstallation(), this.getIntBuildingInstallationPropertyType(), null, "interiorBuildingInstallation", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_BoundedBy1(), this.getBoundarySurfacePropertyType(), null, "boundedBy1", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod3Solid(), theGmlPackage.getSolidPropertyType(), null, "lod3Solid", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod3MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod3MultiSurface", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod3MultiCurve(), theGmlPackage.getMultiCurvePropertyType(), null, "lod3MultiCurve", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod3TerrainIntersection(), theGmlPackage.getMultiCurvePropertyType(), null, "lod3TerrainIntersection", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod4Solid(), theGmlPackage.getSolidPropertyType(), null, "lod4Solid", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod4MultiCurve(), theGmlPackage.getMultiCurvePropertyType(), null, "lod4MultiCurve", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Lod4TerrainIntersection(), theGmlPackage.getMultiCurvePropertyType(), null, "lod4TerrainIntersection", null, 0, 1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_InteriorRoom(), this.getInteriorRoomPropertyType(), null, "interiorRoom", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_ConsistsOfBuildingPart(), this.getBuildingPartPropertyType(), null, "consistsOfBuildingPart", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_Address(), theCitygmlPackage.getAddressPropertyType(), null, "address", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuildingGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfAbstractBuildingGroup", null, 0, -1, AbstractBuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuilding(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAbstractBuilding", null, 0, -1, AbstractBuildingType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractOpeningTypeEClass, AbstractOpeningType.class, "AbstractOpeningType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractOpeningType_Lod3MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod3MultiSurface", null, 0, 1, AbstractOpeningType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractOpeningType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, AbstractOpeningType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractOpeningType_GenericApplicationPropertyOfOpeningGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfOpeningGroup", null, 0, -1, AbstractOpeningType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractOpeningType_GenericApplicationPropertyOfOpening(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfOpening", null, 0, -1, AbstractOpeningType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(boundarySurfacePropertyTypeEClass, BoundarySurfacePropertyType.class, "BoundarySurfacePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundarySurfacePropertyType_BoundarySurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "boundarySurfaceGroup", null, 0, 1, BoundarySurfacePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundarySurfacePropertyType_BoundarySurface(), this.getAbstractBoundarySurfaceType(), null, "boundarySurface", null, 0, 1, BoundarySurfacePropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(buildingFurnitureTypeEClass, BuildingFurnitureType.class, "BuildingFurnitureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildingFurnitureType_Class(), this.getBuildingFurnitureClassType(), "class", null, 0, 1, BuildingFurnitureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildingFurnitureType_Function(), this.getBuildingFurnitureFunctionType(), "function", null, 0, -1, BuildingFurnitureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildingFurnitureType_Usage(), this.getBuildingFurnitureUsageType(), "usage", null, 0, -1, BuildingFurnitureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingFurnitureType_Lod4Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod4Geometry", null, 0, 1, BuildingFurnitureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingFurnitureType_Lod4ImplicitRepresentation(), theCitygmlPackage.getImplicitRepresentationPropertyType(), null, "lod4ImplicitRepresentation", null, 0, 1, BuildingFurnitureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurnitureGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfBuildingFurnitureGroup", null, 0, -1, BuildingFurnitureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurniture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuildingFurniture", null, 0, -1, BuildingFurnitureType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(buildingInstallationPropertyTypeEClass, BuildingInstallationPropertyType.class, "BuildingInstallationPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildingInstallationPropertyType_BuildingInstallation(), this.getBuildingInstallationType(), null, "buildingInstallation", null, 0, 1, BuildingInstallationPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildingInstallationTypeEClass, BuildingInstallationType.class, "BuildingInstallationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildingInstallationType_Class(), this.getBuildingInstallationClassType(), "class", null, 0, 1, BuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildingInstallationType_Function(), this.getBuildingInstallationFunctionType(), "function", null, 0, -1, BuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildingInstallationType_Usage(), this.getBuildingInstallationUsageType(), "usage", null, 0, -1, BuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingInstallationType_Lod2Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod2Geometry", null, 0, 1, BuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingInstallationType_Lod3Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod3Geometry", null, 0, 1, BuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingInstallationType_Lod4Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod4Geometry", null, 0, 1, BuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallationGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfBuildingInstallationGroup", null, 0, -1, BuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallation(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuildingInstallation", null, 0, -1, BuildingInstallationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(buildingPartPropertyTypeEClass, BuildingPartPropertyType.class, "BuildingPartPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildingPartPropertyType_BuildingPart(), this.getBuildingPartType(), null, "buildingPart", null, 0, 1, BuildingPartPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildingPartTypeEClass, BuildingPartType.class, "BuildingPartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildingPartType_GenericApplicationPropertyOfBuildingPartGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfBuildingPartGroup", null, 0, -1, BuildingPartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingPartType_GenericApplicationPropertyOfBuildingPart(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuildingPart", null, 0, -1, BuildingPartType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(buildingTypeEClass, BuildingType.class, "BuildingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuildingType_GenericApplicationPropertyOfBuildingGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfBuildingGroup", null, 0, -1, BuildingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildingType_GenericApplicationPropertyOfBuilding(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuilding", null, 0, -1, BuildingType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ceilingSurfaceTypeEClass, CeilingSurfaceType.class, "CeilingSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfCeilingSurfaceGroup", null, 0, -1, CeilingSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfCeilingSurface", null, 0, -1, CeilingSurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(closureSurfaceTypeEClass, ClosureSurfaceType.class, "ClosureSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClosureSurfaceType_GenericApplicationPropertyOfClosureSurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfClosureSurfaceGroup", null, 0, -1, ClosureSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClosureSurfaceType_GenericApplicationPropertyOfClosureSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfClosureSurface", null, 0, -1, ClosureSurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AbstractBuilding(), this.getAbstractBuildingType(), null, "abstractBuilding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BoundarySurface(), this.getAbstractBoundarySurfaceType(), null, "boundarySurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfAbstractBuilding(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAbstractBuilding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfBoundarySurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBoundarySurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfBuilding(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuilding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfBuildingFurniture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuildingFurniture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfBuildingInstallation(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuildingInstallation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfBuildingPart(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfBuildingPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfCeilingSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfCeilingSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfClosureSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfClosureSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfDoor(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfDoor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfFloorSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfFloorSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfGroundSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfGroundSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfIntBuildingInstallation(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfIntBuildingInstallation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfInteriorWallSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfInteriorWallSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfOpening(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfOpening", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfRoofSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRoofSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfRoom(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRoom", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfWallSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfWallSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfWindow(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfWindow", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Opening(), this.getAbstractOpeningType(), null, "opening", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Building(), this.getBuildingType(), null, "building", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BuildingFurniture(), this.getBuildingFurnitureType(), null, "buildingFurniture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BuildingInstallation(), this.getBuildingInstallationType(), null, "buildingInstallation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BuildingPart(), this.getBuildingPartType(), null, "buildingPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CeilingSurface(), this.getCeilingSurfaceType(), null, "ceilingSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClosureSurface(), this.getClosureSurfaceType(), null, "closureSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Door(), this.getDoorType(), null, "door", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FloorSurface(), this.getFloorSurfaceType(), null, "floorSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GroundSurface(), this.getGroundSurfaceType(), null, "groundSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IntBuildingInstallation(), this.getIntBuildingInstallationType(), null, "intBuildingInstallation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InteriorWallSurface(), this.getInteriorWallSurfaceType(), null, "interiorWallSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RoofSurface(), this.getRoofSurfaceType(), null, "roofSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Room(), this.getRoomType(), null, "room", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WallSurface(), this.getWallSurfaceType(), null, "wallSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Window(), this.getWindowType(), null, "window", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(doorTypeEClass, DoorType.class, "DoorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoorType_Address(), theCitygmlPackage.getAddressPropertyType(), null, "address", null, 0, -1, DoorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoorType_GenericApplicationPropertyOfDoorGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfDoorGroup", null, 0, -1, DoorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoorType_GenericApplicationPropertyOfDoor(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfDoor", null, 0, -1, DoorType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(floorSurfaceTypeEClass, FloorSurfaceType.class, "FloorSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloorSurfaceType_GenericApplicationPropertyOfFloorSurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfFloorSurfaceGroup", null, 0, -1, FloorSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloorSurfaceType_GenericApplicationPropertyOfFloorSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfFloorSurface", null, 0, -1, FloorSurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(groundSurfaceTypeEClass, GroundSurfaceType.class, "GroundSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroundSurfaceType_GenericApplicationPropertyOfGroundSurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfGroundSurfaceGroup", null, 0, -1, GroundSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundSurfaceType_GenericApplicationPropertyOfGroundSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfGroundSurface", null, 0, -1, GroundSurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(intBuildingInstallationPropertyTypeEClass, IntBuildingInstallationPropertyType.class, "IntBuildingInstallationPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntBuildingInstallationPropertyType_IntBuildingInstallation(), this.getIntBuildingInstallationType(), null, "intBuildingInstallation", null, 0, 1, IntBuildingInstallationPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intBuildingInstallationTypeEClass, IntBuildingInstallationType.class, "IntBuildingInstallationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntBuildingInstallationType_Class(), this.getIntBuildingInstallationClassType(), "class", null, 0, 1, IntBuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntBuildingInstallationType_Function(), this.getIntBuildingInstallationFunctionType(), "function", null, 0, -1, IntBuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntBuildingInstallationType_Usage(), this.getIntBuildingInstallationUsageType(), "usage", null, 0, -1, IntBuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntBuildingInstallationType_Lod4Geometry(), theGmlPackage.getGeometryPropertyType(), null, "lod4Geometry", null, 0, 1, IntBuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallationGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfIntBuildingInstallationGroup", null, 0, -1, IntBuildingInstallationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallation(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfIntBuildingInstallation", null, 0, -1, IntBuildingInstallationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interiorFurniturePropertyTypeEClass, InteriorFurniturePropertyType.class, "InteriorFurniturePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteriorFurniturePropertyType_BuildingFurniture(), this.getBuildingFurnitureType(), null, "buildingFurniture", null, 0, 1, InteriorFurniturePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interiorRoomPropertyTypeEClass, InteriorRoomPropertyType.class, "InteriorRoomPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteriorRoomPropertyType_Room(), this.getRoomType(), null, "room", null, 0, 1, InteriorRoomPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interiorWallSurfaceTypeEClass, InteriorWallSurfaceType.class, "InteriorWallSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfInteriorWallSurfaceGroup", null, 0, -1, InteriorWallSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfInteriorWallSurface", null, 0, -1, InteriorWallSurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(openingPropertyTypeEClass, OpeningPropertyType.class, "OpeningPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpeningPropertyType_OpeningGroup(), ecorePackage.getEFeatureMapEntry(), "openingGroup", null, 0, 1, OpeningPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpeningPropertyType_Opening(), this.getAbstractOpeningType(), null, "opening", null, 0, 1, OpeningPropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roofSurfaceTypeEClass, RoofSurfaceType.class, "RoofSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoofSurfaceType_GenericApplicationPropertyOfRoofSurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfRoofSurfaceGroup", null, 0, -1, RoofSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoofSurfaceType_GenericApplicationPropertyOfRoofSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRoofSurface", null, 0, -1, RoofSurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Class(), this.getRoomClassType(), "class", null, 0, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomType_Function(), this.getRoomFunctionType(), "function", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomType_Usage(), this.getRoomUsageType(), "usage", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_Lod4Solid(), theGmlPackage.getSolidPropertyType(), null, "lod4Solid", null, 0, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_BoundedBy1(), this.getBoundarySurfacePropertyType(), null, "boundedBy1", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_InteriorFurniture(), this.getInteriorFurniturePropertyType(), null, "interiorFurniture", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_RoomInstallation(), this.getIntBuildingInstallationPropertyType(), null, "roomInstallation", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoomType_GenericApplicationPropertyOfRoomGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfRoomGroup", null, 0, -1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoomType_GenericApplicationPropertyOfRoom(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRoom", null, 0, -1, RoomType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(wallSurfaceTypeEClass, WallSurfaceType.class, "WallSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWallSurfaceType_GenericApplicationPropertyOfWallSurfaceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfWallSurfaceGroup", null, 0, -1, WallSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWallSurfaceType_GenericApplicationPropertyOfWallSurface(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfWallSurface", null, 0, -1, WallSurfaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(windowTypeEClass, WindowType.class, "WindowType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindowType_GenericApplicationPropertyOfWindowGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfWindowGroup", null, 0, -1, WindowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWindowType_GenericApplicationPropertyOfWindow(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfWindow", null, 0, -1, WindowType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(buildingClassTypeEDataType, String.class, "BuildingClassType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingFunctionTypeEDataType, String.class, "BuildingFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingFurnitureClassTypeEDataType, String.class, "BuildingFurnitureClassType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingFurnitureFunctionTypeEDataType, String.class, "BuildingFurnitureFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingFurnitureUsageTypeEDataType, String.class, "BuildingFurnitureUsageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingInstallationClassTypeEDataType, String.class, "BuildingInstallationClassType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingInstallationFunctionTypeEDataType, String.class, "BuildingInstallationFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingInstallationUsageTypeEDataType, String.class, "BuildingInstallationUsageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(buildingUsageTypeEDataType, String.class, "BuildingUsageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intBuildingInstallationClassTypeEDataType, String.class, "IntBuildingInstallationClassType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intBuildingInstallationFunctionTypeEDataType, String.class, "IntBuildingInstallationFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intBuildingInstallationUsageTypeEDataType, String.class, "IntBuildingInstallationUsageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roofTypeTypeEDataType, String.class, "RoofTypeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roomClassTypeEDataType, String.class, "RoomClassType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roomFunctionTypeEDataType, String.class, "RoomFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roomUsageTypeEDataType, String.class, "RoomUsageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (abstractBoundarySurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractBoundarySurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractBoundarySurfaceType_Lod2MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBoundarySurfaceType_Lod3MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBoundarySurfaceType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBoundarySurfaceType_Opening(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "opening",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfBoundarySurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBoundarySurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfBoundarySurface:group"
		   });			
		addAnnotation
		  (abstractBuildingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractBuildingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_YearOfConstruction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "yearOfConstruction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_YearOfDemolition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "yearOfDemolition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_RoofType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "roofType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_MeasuredHeight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measuredHeight",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_StoreysAboveGround(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "storeysAboveGround",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_StoreysBelowGround(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "storeysBelowGround",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_StoreyHeightsAboveGround(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "storeyHeightsAboveGround",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_StoreyHeightsBelowGround(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "storeyHeightsBelowGround",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod1Solid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1Solid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod1MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod1TerrainIntersection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1TerrainIntersection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod2Solid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2Solid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod2MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod2MultiCurve(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiCurve",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod2TerrainIntersection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2TerrainIntersection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_OuterBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "outerBuildingInstallation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_InteriorBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interiorBuildingInstallation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_BoundedBy1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boundedBy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod3Solid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3Solid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod3MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod3MultiCurve(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiCurve",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod3TerrainIntersection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3TerrainIntersection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod4Solid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4Solid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod4MultiCurve(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiCurve",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Lod4TerrainIntersection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4TerrainIntersection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_InteriorRoom(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interiorRoom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_ConsistsOfBuildingPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consistsOfBuildingPart",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuildingGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfAbstractBuilding:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuilding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAbstractBuilding",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfAbstractBuilding:group"
		   });			
		addAnnotation
		  (abstractOpeningTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractOpeningType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractOpeningType_Lod3MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractOpeningType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractOpeningType_GenericApplicationPropertyOfOpeningGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfOpening:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractOpeningType_GenericApplicationPropertyOfOpening(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfOpening",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfOpening:group"
		   });			
		addAnnotation
		  (boundarySurfacePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BoundarySurfacePropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBoundarySurfacePropertyType_BoundarySurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_BoundarySurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBoundarySurfacePropertyType_BoundarySurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_BoundarySurface",
			 "namespace", "##targetNamespace",
			 "group", "_BoundarySurface:group"
		   });			
		addAnnotation
		  (buildingClassTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingClassType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingFurnitureClassTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingFurnitureClassType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingFurnitureFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingFurnitureFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingFurnitureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BuildingFurnitureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBuildingFurnitureType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingFurnitureType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingFurnitureType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingFurnitureType_Lod4Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingFurnitureType_Lod4ImplicitRepresentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4ImplicitRepresentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurnitureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfBuildingFurniture:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurniture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuildingFurniture",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfBuildingFurniture:group"
		   });			
		addAnnotation
		  (buildingFurnitureUsageTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingFurnitureUsageType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingInstallationClassTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingInstallationClassType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingInstallationFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingInstallationFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingInstallationPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BuildingInstallationPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBuildingInstallationPropertyType_BuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingInstallation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (buildingInstallationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BuildingInstallationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBuildingInstallationType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingInstallationType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingInstallationType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingInstallationType_Lod2Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingInstallationType_Lod3Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingInstallationType_Lod4Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallationGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfBuildingInstallation:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuildingInstallation",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfBuildingInstallation:group"
		   });			
		addAnnotation
		  (buildingInstallationUsageTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingInstallationUsageType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (buildingPartPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BuildingPartPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBuildingPartPropertyType_BuildingPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingPart",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (buildingPartTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BuildingPartType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBuildingPartType_GenericApplicationPropertyOfBuildingPartGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfBuildingPart:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingPartType_GenericApplicationPropertyOfBuildingPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuildingPart",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfBuildingPart:group"
		   });		
		addAnnotation
		  (buildingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BuildingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBuildingType_GenericApplicationPropertyOfBuildingGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfBuilding:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBuildingType_GenericApplicationPropertyOfBuilding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuilding",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfBuilding:group"
		   });			
		addAnnotation
		  (buildingUsageTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "BuildingUsageType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (ceilingSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CeilingSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfCeilingSurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfCeilingSurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfCeilingSurface:group"
		   });		
		addAnnotation
		  (closureSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClosureSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getClosureSurfaceType_GenericApplicationPropertyOfClosureSurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfClosureSurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClosureSurfaceType_GenericApplicationPropertyOfClosureSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfClosureSurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfClosureSurface:group"
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
		  (getDocumentRoot_AbstractBuilding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_AbstractBuilding",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_Site"
		   });		
		addAnnotation
		  (getDocumentRoot_BoundarySurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_BoundarySurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfAbstractBuilding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAbstractBuilding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfBoundarySurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBoundarySurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfBuilding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuilding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfBuildingFurniture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuildingFurniture",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuildingInstallation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfBuildingPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfBuildingPart",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfCeilingSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfCeilingSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfClosureSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfClosureSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfDoor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfDoor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfFloorSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfFloorSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfGroundSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfGroundSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfIntBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfIntBuildingInstallation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfInteriorWallSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfInteriorWallSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfOpening(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfOpening",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfRoofSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRoofSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfRoom(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRoom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfWallSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfWallSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfWindow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfWindow",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Opening(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_Opening",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_Building(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Building",
			 "namespace", "##targetNamespace",
			 "affiliation", "_AbstractBuilding"
		   });		
		addAnnotation
		  (getDocumentRoot_BuildingFurniture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingFurniture",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_BuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingInstallation",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_BuildingPart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingPart",
			 "namespace", "##targetNamespace",
			 "affiliation", "_AbstractBuilding"
		   });		
		addAnnotation
		  (getDocumentRoot_CeilingSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CeilingSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "_BoundarySurface"
		   });		
		addAnnotation
		  (getDocumentRoot_ClosureSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClosureSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "_BoundarySurface"
		   });		
		addAnnotation
		  (getDocumentRoot_Door(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Door",
			 "namespace", "##targetNamespace",
			 "affiliation", "_Opening"
		   });		
		addAnnotation
		  (getDocumentRoot_FloorSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FloorSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "_BoundarySurface"
		   });		
		addAnnotation
		  (getDocumentRoot_GroundSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GroundSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "_BoundarySurface"
		   });		
		addAnnotation
		  (getDocumentRoot_IntBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IntBuildingInstallation",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_InteriorWallSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InteriorWallSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "_BoundarySurface"
		   });		
		addAnnotation
		  (getDocumentRoot_RoofSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RoofSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "_BoundarySurface"
		   });		
		addAnnotation
		  (getDocumentRoot_Room(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Room",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_WallSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WallSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "_BoundarySurface"
		   });		
		addAnnotation
		  (getDocumentRoot_Window(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Window",
			 "namespace", "##targetNamespace",
			 "affiliation", "_Opening"
		   });			
		addAnnotation
		  (doorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DoorType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDoorType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDoorType_GenericApplicationPropertyOfDoorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfDoor:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDoorType_GenericApplicationPropertyOfDoor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfDoor",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfDoor:group"
		   });		
		addAnnotation
		  (floorSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FloorSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFloorSurfaceType_GenericApplicationPropertyOfFloorSurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfFloorSurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFloorSurfaceType_GenericApplicationPropertyOfFloorSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfFloorSurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfFloorSurface:group"
		   });		
		addAnnotation
		  (groundSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GroundSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGroundSurfaceType_GenericApplicationPropertyOfGroundSurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfGroundSurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGroundSurfaceType_GenericApplicationPropertyOfGroundSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfGroundSurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfGroundSurface:group"
		   });			
		addAnnotation
		  (intBuildingInstallationClassTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "IntBuildingInstallationClassType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (intBuildingInstallationFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "IntBuildingInstallationFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (intBuildingInstallationPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IntBuildingInstallationPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIntBuildingInstallationPropertyType_IntBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IntBuildingInstallation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (intBuildingInstallationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IntBuildingInstallationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIntBuildingInstallationType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntBuildingInstallationType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntBuildingInstallationType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntBuildingInstallationType_Lod4Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallationGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfIntBuildingInstallation:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfIntBuildingInstallation",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfIntBuildingInstallation:group"
		   });			
		addAnnotation
		  (intBuildingInstallationUsageTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "IntBuildingInstallationUsageType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (interiorFurniturePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InteriorFurniturePropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInteriorFurniturePropertyType_BuildingFurniture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BuildingFurniture",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (interiorRoomPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InteriorRoomPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInteriorRoomPropertyType_Room(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Room",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (interiorWallSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InteriorWallSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfInteriorWallSurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfInteriorWallSurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfInteriorWallSurface:group"
		   });			
		addAnnotation
		  (openingPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OpeningPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOpeningPropertyType_OpeningGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_Opening:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOpeningPropertyType_Opening(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_Opening",
			 "namespace", "##targetNamespace",
			 "group", "_Opening:group"
		   });		
		addAnnotation
		  (roofSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RoofSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRoofSurfaceType_GenericApplicationPropertyOfRoofSurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfRoofSurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoofSurfaceType_GenericApplicationPropertyOfRoofSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRoofSurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfRoofSurface:group"
		   });			
		addAnnotation
		  (roofTypeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "RoofTypeType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (roomClassTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "RoomClassType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (roomFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "RoomFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (roomTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RoomType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRoomType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_Lod4Solid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4Solid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_BoundedBy1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boundedBy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_InteriorFurniture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interiorFurniture",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_RoomInstallation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "roomInstallation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_GenericApplicationPropertyOfRoomGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfRoom:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoomType_GenericApplicationPropertyOfRoom(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRoom",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfRoom:group"
		   });			
		addAnnotation
		  (roomUsageTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "RoomUsageType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (wallSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "WallSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWallSurfaceType_GenericApplicationPropertyOfWallSurfaceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfWallSurface:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWallSurfaceType_GenericApplicationPropertyOfWallSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfWallSurface",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfWallSurface:group"
		   });			
		addAnnotation
		  (windowTypeEClass, 
		   source, 
		   new String[] {
			 "name", "WindowType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWindowType_GenericApplicationPropertyOfWindowGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfWindow:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWindowType_GenericApplicationPropertyOfWindow(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfWindow",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfWindow:group"
		   });
	}

} //BuildingPackageImpl
