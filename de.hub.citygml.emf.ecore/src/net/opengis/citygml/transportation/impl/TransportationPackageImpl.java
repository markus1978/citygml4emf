/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

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
import net.opengis.citygml.transportation.AbstractTransportationObjectType;
import net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType;
import net.opengis.citygml.transportation.AuxiliaryTrafficAreaType;
import net.opengis.citygml.transportation.DocumentRoot;
import net.opengis.citygml.transportation.RailwayType;
import net.opengis.citygml.transportation.RoadType;
import net.opengis.citygml.transportation.SquareType;
import net.opengis.citygml.transportation.TrackType;
import net.opengis.citygml.transportation.TrafficAreaPropertyType;
import net.opengis.citygml.transportation.TrafficAreaType;
import net.opengis.citygml.transportation.TransportationComplexType;
import net.opengis.citygml.transportation.TransportationFactory;
import net.opengis.citygml.transportation.TransportationPackage;
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
public class TransportationPackageImpl extends EPackageImpl implements TransportationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransportationObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryTrafficAreaPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryTrafficAreaTypeEClass = null;

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
	private EClass railwayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficAreaPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficAreaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auxiliaryTrafficAreaFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trafficAreaFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trafficAreaUsageTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType trafficSurfaceMaterialTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transportationComplexFunctionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transportationComplexUsageTypeEDataType = null;

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
	 * @see net.opengis.citygml.transportation.TransportationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransportationPackageImpl() {
		super(eNS_URI, TransportationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransportationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransportationPackage init() {
		if (isInited) return (TransportationPackage)EPackage.Registry.INSTANCE.getEPackage(TransportationPackage.eNS_URI);

		// Obtain or create and register package
		TransportationPackageImpl theTransportationPackage = (TransportationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransportationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransportationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) : BuildingPackage.eINSTANCE);
		CitygmlPackageImpl theCitygmlPackage = (CitygmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) instanceof CitygmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) : CitygmlPackage.eINSTANCE);
		GmlPackageImpl theGmlPackage = (GmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) instanceof GmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) : GmlPackage.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) : XALPackage.eINSTANCE);
		TexturedsurfacePackageImpl theTexturedsurfacePackage = (TexturedsurfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TexturedsurfacePackage.eNS_URI) instanceof TexturedsurfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TexturedsurfacePackage.eNS_URI) : TexturedsurfacePackage.eINSTANCE);
		AppearancePackageImpl theAppearancePackage = (AppearancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AppearancePackage.eNS_URI) instanceof AppearancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AppearancePackage.eNS_URI) : AppearancePackage.eINSTANCE);
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
		theTransportationPackage.createPackageContents();
		theBuildingPackage.createPackageContents();
		theCitygmlPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
		theTexturedsurfacePackage.createPackageContents();
		theAppearancePackage.createPackageContents();
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
		theTransportationPackage.initializePackageContents();
		theBuildingPackage.initializePackageContents();
		theCitygmlPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theTexturedsurfacePackage.initializePackageContents();
		theAppearancePackage.initializePackageContents();
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
		theTransportationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransportationPackage.eNS_URI, theTransportationPackage);
		return theTransportationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransportationObjectType() {
		return abstractTransportationObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObjectGroup() {
		return (EAttribute)abstractTransportationObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObject() {
		return (EReference)abstractTransportationObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliaryTrafficAreaPropertyType() {
		return auxiliaryTrafficAreaPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxiliaryTrafficAreaType() {
		return auxiliaryTrafficAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryTrafficAreaType_Function() {
		return (EAttribute)auxiliaryTrafficAreaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryTrafficAreaType_SurfaceMaterial() {
		return (EAttribute)auxiliaryTrafficAreaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryTrafficAreaType_Lod2MultiSurface() {
		return (EReference)auxiliaryTrafficAreaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryTrafficAreaType_Lod3MultiSurface() {
		return (EReference)auxiliaryTrafficAreaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryTrafficAreaType_Lod4MultiSurface() {
		return (EReference)auxiliaryTrafficAreaTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficAreaGroup() {
		return (EAttribute)auxiliaryTrafficAreaTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficArea() {
		return (EReference)auxiliaryTrafficAreaTypeEClass.getEStructuralFeatures().get(6);
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
	public EReference getDocumentRoot_GenericApplicationPropertyOfAuxiliaryTrafficArea() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfRailway() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfRoad() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfSquare() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTrack() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTrafficArea() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTransportationComplex() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTransportationObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransportationObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuxiliaryTrafficArea() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Railway() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransportationComplex() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Road() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Square() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Track() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TrafficArea() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailwayType() {
		return railwayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRailwayType_GenericApplicationPropertyOfRailwayGroup() {
		return (EAttribute)railwayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayType_GenericApplicationPropertyOfRailway() {
		return (EReference)railwayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoadType() {
		return roadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoadType_GenericApplicationPropertyOfRoadGroup() {
		return (EAttribute)roadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoadType_GenericApplicationPropertyOfRoad() {
		return (EReference)roadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquareType() {
		return squareTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquareType_GenericApplicationPropertyOfSquareGroup() {
		return (EAttribute)squareTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquareType_GenericApplicationPropertyOfSquare() {
		return (EReference)squareTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrackType() {
		return trackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrackType_GenericApplicationPropertyOfTrackGroup() {
		return (EAttribute)trackTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrackType_GenericApplicationPropertyOfTrack() {
		return (EReference)trackTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrafficAreaPropertyType() {
		return trafficAreaPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrafficAreaPropertyType_TrafficArea() {
		return (EReference)trafficAreaPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrafficAreaType() {
		return trafficAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficAreaType_Usage() {
		return (EAttribute)trafficAreaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficAreaType_Function() {
		return (EAttribute)trafficAreaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficAreaType_SurfaceMaterial() {
		return (EAttribute)trafficAreaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrafficAreaType_Lod2MultiSurface() {
		return (EReference)trafficAreaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrafficAreaType_Lod3MultiSurface() {
		return (EReference)trafficAreaTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrafficAreaType_Lod4MultiSurface() {
		return (EReference)trafficAreaTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficAreaType_GenericApplicationPropertyOfTrafficAreaGroup() {
		return (EAttribute)trafficAreaTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrafficAreaType_GenericApplicationPropertyOfTrafficArea() {
		return (EReference)trafficAreaTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportationComplexType() {
		return transportationComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationComplexType_Function() {
		return (EAttribute)transportationComplexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationComplexType_Usage() {
		return (EAttribute)transportationComplexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_TrafficArea() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_AuxiliaryTrafficArea() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_Lod0Network() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_Lod1MultiSurface() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_Lod2MultiSurface() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_Lod3MultiSurface() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_Lod4MultiSurface() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationComplexType_GenericApplicationPropertyOfTransportationComplexGroup() {
		return (EAttribute)transportationComplexTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationComplexType_GenericApplicationPropertyOfTransportationComplex() {
		return (EReference)transportationComplexTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuxiliaryTrafficAreaFunctionType() {
		return auxiliaryTrafficAreaFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrafficAreaFunctionType() {
		return trafficAreaFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrafficAreaUsageType() {
		return trafficAreaUsageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTrafficSurfaceMaterialType() {
		return trafficSurfaceMaterialTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransportationComplexFunctionType() {
		return transportationComplexFunctionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransportationComplexUsageType() {
		return transportationComplexUsageTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationFactory getTransportationFactory() {
		return (TransportationFactory)getEFactoryInstance();
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
		abstractTransportationObjectTypeEClass = createEClass(ABSTRACT_TRANSPORTATION_OBJECT_TYPE);
		createEAttribute(abstractTransportationObjectTypeEClass, ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP);
		createEReference(abstractTransportationObjectTypeEClass, ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT);

		auxiliaryTrafficAreaPropertyTypeEClass = createEClass(AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE);

		auxiliaryTrafficAreaTypeEClass = createEClass(AUXILIARY_TRAFFIC_AREA_TYPE);
		createEAttribute(auxiliaryTrafficAreaTypeEClass, AUXILIARY_TRAFFIC_AREA_TYPE__FUNCTION);
		createEAttribute(auxiliaryTrafficAreaTypeEClass, AUXILIARY_TRAFFIC_AREA_TYPE__SURFACE_MATERIAL);
		createEReference(auxiliaryTrafficAreaTypeEClass, AUXILIARY_TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE);
		createEReference(auxiliaryTrafficAreaTypeEClass, AUXILIARY_TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE);
		createEReference(auxiliaryTrafficAreaTypeEClass, AUXILIARY_TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE);
		createEAttribute(auxiliaryTrafficAreaTypeEClass, AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA_GROUP);
		createEReference(auxiliaryTrafficAreaTypeEClass, AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSPORTATION_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RAILWAY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSPORTATION_COMPLEX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROAD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SQUARE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRACK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRAFFIC_AREA);

		railwayTypeEClass = createEClass(RAILWAY_TYPE);
		createEAttribute(railwayTypeEClass, RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP);
		createEReference(railwayTypeEClass, RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY);

		roadTypeEClass = createEClass(ROAD_TYPE);
		createEAttribute(roadTypeEClass, ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP);
		createEReference(roadTypeEClass, ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD);

		squareTypeEClass = createEClass(SQUARE_TYPE);
		createEAttribute(squareTypeEClass, SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP);
		createEReference(squareTypeEClass, SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE);

		trackTypeEClass = createEClass(TRACK_TYPE);
		createEAttribute(trackTypeEClass, TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP);
		createEReference(trackTypeEClass, TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK);

		trafficAreaPropertyTypeEClass = createEClass(TRAFFIC_AREA_PROPERTY_TYPE);
		createEReference(trafficAreaPropertyTypeEClass, TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA);

		trafficAreaTypeEClass = createEClass(TRAFFIC_AREA_TYPE);
		createEAttribute(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__USAGE);
		createEAttribute(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__FUNCTION);
		createEAttribute(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__SURFACE_MATERIAL);
		createEReference(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE);
		createEReference(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE);
		createEReference(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE);
		createEAttribute(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP);
		createEReference(trafficAreaTypeEClass, TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA);

		transportationComplexTypeEClass = createEClass(TRANSPORTATION_COMPLEX_TYPE);
		createEAttribute(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__FUNCTION);
		createEAttribute(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__USAGE);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE);
		createEAttribute(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP);
		createEReference(transportationComplexTypeEClass, TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX);

		// Create data types
		auxiliaryTrafficAreaFunctionTypeEDataType = createEDataType(AUXILIARY_TRAFFIC_AREA_FUNCTION_TYPE);
		trafficAreaFunctionTypeEDataType = createEDataType(TRAFFIC_AREA_FUNCTION_TYPE);
		trafficAreaUsageTypeEDataType = createEDataType(TRAFFIC_AREA_USAGE_TYPE);
		trafficSurfaceMaterialTypeEDataType = createEDataType(TRAFFIC_SURFACE_MATERIAL_TYPE);
		transportationComplexFunctionTypeEDataType = createEDataType(TRANSPORTATION_COMPLEX_FUNCTION_TYPE);
		transportationComplexUsageTypeEDataType = createEDataType(TRANSPORTATION_COMPLEX_USAGE_TYPE);
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
		abstractTransportationObjectTypeEClass.getESuperTypes().add(theCitygmlPackage.getAbstractCityObjectType());
		auxiliaryTrafficAreaPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		auxiliaryTrafficAreaTypeEClass.getESuperTypes().add(this.getAbstractTransportationObjectType());
		railwayTypeEClass.getESuperTypes().add(this.getTransportationComplexType());
		roadTypeEClass.getESuperTypes().add(this.getTransportationComplexType());
		squareTypeEClass.getESuperTypes().add(this.getTransportationComplexType());
		trackTypeEClass.getESuperTypes().add(this.getTransportationComplexType());
		trafficAreaPropertyTypeEClass.getESuperTypes().add(theGmlPackage.getAssociationType());
		trafficAreaTypeEClass.getESuperTypes().add(this.getAbstractTransportationObjectType());
		transportationComplexTypeEClass.getESuperTypes().add(this.getAbstractTransportationObjectType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTransportationObjectTypeEClass, AbstractTransportationObjectType.class, "AbstractTransportationObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObjectGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTransportationObjectGroup", null, 0, -1, AbstractTransportationObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTransportationObject", null, 0, -1, AbstractTransportationObjectType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(auxiliaryTrafficAreaPropertyTypeEClass, AuxiliaryTrafficAreaPropertyType.class, "AuxiliaryTrafficAreaPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(auxiliaryTrafficAreaTypeEClass, AuxiliaryTrafficAreaType.class, "AuxiliaryTrafficAreaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuxiliaryTrafficAreaType_Function(), this.getAuxiliaryTrafficAreaFunctionType(), "function", null, 0, -1, AuxiliaryTrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuxiliaryTrafficAreaType_SurfaceMaterial(), this.getTrafficSurfaceMaterialType(), "surfaceMaterial", null, 0, 1, AuxiliaryTrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliaryTrafficAreaType_Lod2MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod2MultiSurface", null, 0, 1, AuxiliaryTrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliaryTrafficAreaType_Lod3MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod3MultiSurface", null, 0, 1, AuxiliaryTrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliaryTrafficAreaType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, AuxiliaryTrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficAreaGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfAuxiliaryTrafficAreaGroup", null, 0, -1, AuxiliaryTrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficArea(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAuxiliaryTrafficArea", null, 0, -1, AuxiliaryTrafficAreaType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfAuxiliaryTrafficArea(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAuxiliaryTrafficArea", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfRailway(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRailway", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfRoad(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRoad", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfSquare(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSquare", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTrack(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTrack", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTrafficArea(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTrafficArea", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTransportationComplex(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTransportationComplex", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTransportationObject(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTransportationObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransportationObject(), this.getAbstractTransportationObjectType(), null, "transportationObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuxiliaryTrafficArea(), this.getAuxiliaryTrafficAreaType(), null, "auxiliaryTrafficArea", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Railway(), this.getRailwayType(), null, "railway", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransportationComplex(), this.getTransportationComplexType(), null, "transportationComplex", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Road(), this.getRoadType(), null, "road", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Square(), this.getSquareType(), null, "square", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Track(), this.getTrackType(), null, "track", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TrafficArea(), this.getTrafficAreaType(), null, "trafficArea", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(railwayTypeEClass, RailwayType.class, "RailwayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRailwayType_GenericApplicationPropertyOfRailwayGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfRailwayGroup", null, 0, -1, RailwayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayType_GenericApplicationPropertyOfRailway(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRailway", null, 0, -1, RailwayType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roadTypeEClass, RoadType.class, "RoadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoadType_GenericApplicationPropertyOfRoadGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfRoadGroup", null, 0, -1, RoadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoadType_GenericApplicationPropertyOfRoad(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfRoad", null, 0, -1, RoadType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(squareTypeEClass, SquareType.class, "SquareType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSquareType_GenericApplicationPropertyOfSquareGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfSquareGroup", null, 0, -1, SquareType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSquareType_GenericApplicationPropertyOfSquare(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSquare", null, 0, -1, SquareType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(trackTypeEClass, TrackType.class, "TrackType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrackType_GenericApplicationPropertyOfTrackGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTrackGroup", null, 0, -1, TrackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrackType_GenericApplicationPropertyOfTrack(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTrack", null, 0, -1, TrackType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(trafficAreaPropertyTypeEClass, TrafficAreaPropertyType.class, "TrafficAreaPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrafficAreaPropertyType_TrafficArea(), this.getTrafficAreaType(), null, "trafficArea", null, 0, 1, TrafficAreaPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trafficAreaTypeEClass, TrafficAreaType.class, "TrafficAreaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafficAreaType_Usage(), this.getTrafficAreaUsageType(), "usage", null, 0, -1, TrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafficAreaType_Function(), this.getTrafficAreaFunctionType(), "function", null, 0, -1, TrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafficAreaType_SurfaceMaterial(), this.getTrafficSurfaceMaterialType(), "surfaceMaterial", null, 0, 1, TrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficAreaType_Lod2MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod2MultiSurface", null, 0, 1, TrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficAreaType_Lod3MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod3MultiSurface", null, 0, 1, TrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficAreaType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, TrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafficAreaType_GenericApplicationPropertyOfTrafficAreaGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTrafficAreaGroup", null, 0, -1, TrafficAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrafficAreaType_GenericApplicationPropertyOfTrafficArea(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTrafficArea", null, 0, -1, TrafficAreaType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(transportationComplexTypeEClass, TransportationComplexType.class, "TransportationComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportationComplexType_Function(), this.getTransportationComplexFunctionType(), "function", null, 0, -1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportationComplexType_Usage(), this.getTransportationComplexUsageType(), "usage", null, 0, -1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_TrafficArea(), this.getTrafficAreaPropertyType(), null, "trafficArea", null, 0, -1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_AuxiliaryTrafficArea(), this.getAuxiliaryTrafficAreaPropertyType(), null, "auxiliaryTrafficArea", null, 0, -1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_Lod0Network(), theGmlPackage.getGeometricComplexPropertyType(), null, "lod0Network", null, 0, -1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_Lod1MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod1MultiSurface", null, 0, 1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_Lod2MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod2MultiSurface", null, 0, 1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_Lod3MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod3MultiSurface", null, 0, 1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_Lod4MultiSurface(), theGmlPackage.getMultiSurfacePropertyType(), null, "lod4MultiSurface", null, 0, 1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportationComplexType_GenericApplicationPropertyOfTransportationComplexGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTransportationComplexGroup", null, 0, -1, TransportationComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransportationComplexType_GenericApplicationPropertyOfTransportationComplex(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTransportationComplex", null, 0, -1, TransportationComplexType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(auxiliaryTrafficAreaFunctionTypeEDataType, String.class, "AuxiliaryTrafficAreaFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(trafficAreaFunctionTypeEDataType, String.class, "TrafficAreaFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(trafficAreaUsageTypeEDataType, String.class, "TrafficAreaUsageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(trafficSurfaceMaterialTypeEDataType, String.class, "TrafficSurfaceMaterialType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transportationComplexFunctionTypeEDataType, String.class, "TransportationComplexFunctionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transportationComplexUsageTypeEDataType, String.class, "TransportationComplexUsageType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (abstractTransportationObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractTransportationObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObjectGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTransportationObject:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTransportationObject",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTransportationObject:group"
		   });			
		addAnnotation
		  (auxiliaryTrafficAreaFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "AuxiliaryTrafficAreaFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (auxiliaryTrafficAreaPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuxiliaryTrafficAreaPropertyType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (auxiliaryTrafficAreaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AuxiliaryTrafficAreaType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuxiliaryTrafficAreaType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuxiliaryTrafficAreaType_SurfaceMaterial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "surfaceMaterial",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuxiliaryTrafficAreaType_Lod2MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuxiliaryTrafficAreaType_Lod3MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuxiliaryTrafficAreaType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficAreaGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfAuxiliaryTrafficArea:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAuxiliaryTrafficArea",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfAuxiliaryTrafficArea:group"
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
		  (getDocumentRoot_GenericApplicationPropertyOfAuxiliaryTrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAuxiliaryTrafficArea",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfRailway(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRailway",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfRoad(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRoad",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfSquare(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSquare",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTrack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTrack",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTrafficArea",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTransportationComplex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTransportationComplex",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTransportationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTransportationObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransportationObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_TransportationObject",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_CityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_AuxiliaryTrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuxiliaryTrafficArea",
			 "namespace", "##targetNamespace",
			 "affiliation", "_TransportationObject"
		   });		
		addAnnotation
		  (getDocumentRoot_Railway(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Railway",
			 "namespace", "##targetNamespace",
			 "affiliation", "TransportationComplex"
		   });		
		addAnnotation
		  (getDocumentRoot_TransportationComplex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransportationComplex",
			 "namespace", "##targetNamespace",
			 "affiliation", "_TransportationObject"
		   });		
		addAnnotation
		  (getDocumentRoot_Road(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Road",
			 "namespace", "##targetNamespace",
			 "affiliation", "TransportationComplex"
		   });		
		addAnnotation
		  (getDocumentRoot_Square(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Square",
			 "namespace", "##targetNamespace",
			 "affiliation", "TransportationComplex"
		   });		
		addAnnotation
		  (getDocumentRoot_Track(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Track",
			 "namespace", "##targetNamespace",
			 "affiliation", "TransportationComplex"
		   });		
		addAnnotation
		  (getDocumentRoot_TrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TrafficArea",
			 "namespace", "##targetNamespace",
			 "affiliation", "_TransportationObject"
		   });			
		addAnnotation
		  (railwayTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RailwayType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRailwayType_GenericApplicationPropertyOfRailwayGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfRailway:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRailwayType_GenericApplicationPropertyOfRailway(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRailway",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfRailway:group"
		   });			
		addAnnotation
		  (roadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RoadType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRoadType_GenericApplicationPropertyOfRoadGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfRoad:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRoadType_GenericApplicationPropertyOfRoad(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfRoad",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfRoad:group"
		   });			
		addAnnotation
		  (squareTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SquareType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSquareType_GenericApplicationPropertyOfSquareGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfSquare:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSquareType_GenericApplicationPropertyOfSquare(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSquare",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfSquare:group"
		   });			
		addAnnotation
		  (trackTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TrackType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrackType_GenericApplicationPropertyOfTrackGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTrack:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrackType_GenericApplicationPropertyOfTrack(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTrack",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTrack:group"
		   });			
		addAnnotation
		  (trafficAreaFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TrafficAreaFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (trafficAreaPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TrafficAreaPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrafficAreaPropertyType_TrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TrafficArea",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (trafficAreaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TrafficAreaType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrafficAreaType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrafficAreaType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrafficAreaType_SurfaceMaterial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "surfaceMaterial",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrafficAreaType_Lod2MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrafficAreaType_Lod3MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrafficAreaType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrafficAreaType_GenericApplicationPropertyOfTrafficAreaGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTrafficArea:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTrafficAreaType_GenericApplicationPropertyOfTrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTrafficArea",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTrafficArea:group"
		   });			
		addAnnotation
		  (trafficAreaUsageTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TrafficAreaUsageType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (trafficSurfaceMaterialTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TrafficSurfaceMaterialType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (transportationComplexFunctionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TransportationComplexFunctionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (transportationComplexTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TransportationComplexType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransportationComplexType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_Usage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "usage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_TrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "trafficArea",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_AuxiliaryTrafficArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "auxiliaryTrafficArea",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_Lod0Network(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod0Network",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_Lod1MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod1MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_Lod2MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod2MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_Lod3MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod3MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_Lod4MultiSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod4MultiSurface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_GenericApplicationPropertyOfTransportationComplexGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTransportationComplex:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransportationComplexType_GenericApplicationPropertyOfTransportationComplex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTransportationComplex",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTransportationComplex:group"
		   });			
		addAnnotation
		  (transportationComplexUsageTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TransportationComplexUsageType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
	}

} //TransportationPackageImpl
