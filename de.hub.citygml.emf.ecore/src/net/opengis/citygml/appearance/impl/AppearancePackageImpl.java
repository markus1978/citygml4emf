/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.List;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.appearance.AbstractSurfaceDataType;
import net.opengis.citygml.appearance.AbstractTextureParameterizationType;
import net.opengis.citygml.appearance.AbstractTextureType;
import net.opengis.citygml.appearance.AppearanceFactory;
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
import net.opengis.citygml.appearance.util.AppearanceValidator;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class AppearancePackageImpl extends EPackageImpl implements AppearancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSurfaceDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTextureParameterizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTextureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearancePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceTypeEClass = null;

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
	private EClass georeferencedTextureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTextureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceDataPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texCoordGenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texCoordListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureCoordinatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass worldToTextureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass x3DMaterialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wrapModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorPlusOpacityEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wrapModeTypeObjectEDataType = null;

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
	 * @see net.opengis.citygml.appearance.AppearancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppearancePackageImpl() {
		super(eNS_URI, AppearanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AppearancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppearancePackage init() {
		if (isInited) return (AppearancePackage)EPackage.Registry.INSTANCE.getEPackage(AppearancePackage.eNS_URI);

		// Obtain or create and register package
		AppearancePackageImpl theAppearancePackage = (AppearancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppearancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppearancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) : BuildingPackage.eINSTANCE);
		CitygmlPackageImpl theCitygmlPackage = (CitygmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) instanceof CitygmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) : CitygmlPackage.eINSTANCE);
		GmlPackageImpl theGmlPackage = (GmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) instanceof GmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) : GmlPackage.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) : XALPackage.eINSTANCE);
		TexturedsurfacePackageImpl theTexturedsurfacePackage = (TexturedsurfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TexturedsurfacePackage.eNS_URI) instanceof TexturedsurfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TexturedsurfacePackage.eNS_URI) : TexturedsurfacePackage.eINSTANCE);
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
		theAppearancePackage.createPackageContents();
		theBuildingPackage.createPackageContents();
		theCitygmlPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
		theTexturedsurfacePackage.createPackageContents();
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
		theAppearancePackage.initializePackageContents();
		theBuildingPackage.initializePackageContents();
		theCitygmlPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
		theTexturedsurfacePackage.initializePackageContents();
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
			(theAppearancePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AppearanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAppearancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppearancePackage.eNS_URI, theAppearancePackage);
		return theAppearancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSurfaceDataType() {
		return abstractSurfaceDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSurfaceDataType_IsFront() {
		return (EAttribute)abstractSurfaceDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceDataGroup() {
		return (EAttribute)abstractSurfaceDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceData() {
		return (EReference)abstractSurfaceDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTextureParameterizationType() {
		return abstractTextureParameterizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterizationGroup() {
		return (EAttribute)abstractTextureParameterizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterization() {
		return (EReference)abstractTextureParameterizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTextureType() {
		return abstractTextureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTextureType_ImageURI() {
		return (EAttribute)abstractTextureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTextureType_MimeType() {
		return (EAttribute)abstractTextureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTextureType_TextureType() {
		return (EAttribute)abstractTextureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTextureType_WrapMode() {
		return (EAttribute)abstractTextureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTextureType_BorderColor() {
		return (EAttribute)abstractTextureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTextureType_GenericApplicationPropertyOfTextureGroup() {
		return (EAttribute)abstractTextureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTextureType_GenericApplicationPropertyOfTexture() {
		return (EReference)abstractTextureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppearancePropertyType() {
		return appearancePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearancePropertyType_Appearance() {
		return (EReference)appearancePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppearanceType() {
		return appearanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearanceType_Theme() {
		return (EAttribute)appearanceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearanceType_SurfaceDataMember() {
		return (EReference)appearanceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearanceType_GenericApplicationPropertyOfAppearanceGroup() {
		return (EAttribute)appearanceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearanceType_GenericApplicationPropertyOfAppearance() {
		return (EReference)appearanceTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_GenericApplicationPropertyOfAppearance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfGeoreferencedTexture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfParameterizedTexture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfSurfaceData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTexCoordGen() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTexCoordList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTexture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfTextureParameterization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericApplicationPropertyOfX3DMaterial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SurfaceData() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Texture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextureParameterization() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Appearance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AppearanceMember() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeoreferencedTexture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ParameterizedTexture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TexCoordGen() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TexCoordList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_X3DMaterial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoreferencedTextureType() {
		return georeferencedTextureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoreferencedTextureType_PreferWorldFile() {
		return (EAttribute)georeferencedTextureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoreferencedTextureType_ReferencePoint() {
		return (EReference)georeferencedTextureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoreferencedTextureType_Orientation() {
		return (EAttribute)georeferencedTextureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoreferencedTextureType_Target() {
		return (EAttribute)georeferencedTextureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTextureGroup() {
		return (EAttribute)georeferencedTextureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTexture() {
		return (EReference)georeferencedTextureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedTextureType() {
		return parameterizedTextureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedTextureType_Target() {
		return (EReference)parameterizedTextureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTextureGroup() {
		return (EAttribute)parameterizedTextureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTexture() {
		return (EReference)parameterizedTextureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceDataPropertyType() {
		return surfaceDataPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_SurfaceDataGroup() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceDataPropertyType_SurfaceData() {
		return (EReference)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_Actuate() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_Arcrole() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_Href() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_RemoteSchema() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_Role() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_Show() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_Title() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurfaceDataPropertyType_Type() {
		return (EAttribute)surfaceDataPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexCoordGenType() {
		return texCoordGenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexCoordGenType_WorldToTexture() {
		return (EReference)texCoordGenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexCoordGenType_GenericApplicationPropertyOfTexCoordGenGroup() {
		return (EAttribute)texCoordGenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexCoordGenType_GenericApplicationPropertyOfTexCoordGen() {
		return (EReference)texCoordGenTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexCoordListType() {
		return texCoordListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexCoordListType_TextureCoordinates() {
		return (EReference)texCoordListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexCoordListType_GenericApplicationPropertyOfTexCoordListGroup() {
		return (EAttribute)texCoordListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexCoordListType_GenericApplicationPropertyOfTexCoordList() {
		return (EReference)texCoordListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureAssociationType() {
		return textureAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_TextureParameterizationGroup() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextureAssociationType_TextureParameterization() {
		return (EReference)textureAssociationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Actuate() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Arcrole() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Href() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_RemoteSchema() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Role() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Show() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Title() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Type() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureAssociationType_Uri() {
		return (EAttribute)textureAssociationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextureCoordinatesType() {
		return textureCoordinatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureCoordinatesType_Value() {
		return (EAttribute)textureCoordinatesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextureCoordinatesType_Ring() {
		return (EAttribute)textureCoordinatesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorldToTextureType() {
		return worldToTextureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorldToTextureType_Value() {
		return (EAttribute)worldToTextureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorldToTextureType_AxisLabels() {
		return (EAttribute)worldToTextureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorldToTextureType_SrsDimension() {
		return (EAttribute)worldToTextureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorldToTextureType_SrsName() {
		return (EAttribute)worldToTextureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorldToTextureType_UomLabels() {
		return (EAttribute)worldToTextureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getX3DMaterialType() {
		return x3DMaterialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_AmbientIntensity() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_DiffuseColor() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_EmissiveColor() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_SpecularColor() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_Shininess() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_Transparency() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_IsSmooth() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_Target() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getX3DMaterialType_GenericApplicationPropertyOfX3DMaterialGroup() {
		return (EAttribute)x3DMaterialTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getX3DMaterialType_GenericApplicationPropertyOfX3DMaterial() {
		return (EReference)x3DMaterialTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureTypeType() {
		return textureTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWrapModeType() {
		return wrapModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorPlusOpacity() {
		return colorPlusOpacityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextureTypeTypeObject() {
		return textureTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWrapModeTypeObject() {
		return wrapModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceFactory getAppearanceFactory() {
		return (AppearanceFactory)getEFactoryInstance();
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
		abstractSurfaceDataTypeEClass = createEClass(ABSTRACT_SURFACE_DATA_TYPE);
		createEAttribute(abstractSurfaceDataTypeEClass, ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT);
		createEAttribute(abstractSurfaceDataTypeEClass, ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP);
		createEReference(abstractSurfaceDataTypeEClass, ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA);

		abstractTextureParameterizationTypeEClass = createEClass(ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE);
		createEAttribute(abstractTextureParameterizationTypeEClass, ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP);
		createEReference(abstractTextureParameterizationTypeEClass, ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION);

		abstractTextureTypeEClass = createEClass(ABSTRACT_TEXTURE_TYPE);
		createEAttribute(abstractTextureTypeEClass, ABSTRACT_TEXTURE_TYPE__IMAGE_URI);
		createEAttribute(abstractTextureTypeEClass, ABSTRACT_TEXTURE_TYPE__MIME_TYPE);
		createEAttribute(abstractTextureTypeEClass, ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE);
		createEAttribute(abstractTextureTypeEClass, ABSTRACT_TEXTURE_TYPE__WRAP_MODE);
		createEAttribute(abstractTextureTypeEClass, ABSTRACT_TEXTURE_TYPE__BORDER_COLOR);
		createEAttribute(abstractTextureTypeEClass, ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP);
		createEReference(abstractTextureTypeEClass, ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE);

		appearancePropertyTypeEClass = createEClass(APPEARANCE_PROPERTY_TYPE);
		createEReference(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__APPEARANCE);

		appearanceTypeEClass = createEClass(APPEARANCE_TYPE);
		createEAttribute(appearanceTypeEClass, APPEARANCE_TYPE__THEME);
		createEReference(appearanceTypeEClass, APPEARANCE_TYPE__SURFACE_DATA_MEMBER);
		createEAttribute(appearanceTypeEClass, APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP);
		createEReference(appearanceTypeEClass, APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SURFACE_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPEARANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPEARANCE_MEMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GEOREFERENCED_TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARAMETERIZED_TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEX_COORD_GEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEX_COORD_LIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__X3_DMATERIAL);

		georeferencedTextureTypeEClass = createEClass(GEOREFERENCED_TEXTURE_TYPE);
		createEAttribute(georeferencedTextureTypeEClass, GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE);
		createEReference(georeferencedTextureTypeEClass, GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT);
		createEAttribute(georeferencedTextureTypeEClass, GEOREFERENCED_TEXTURE_TYPE__ORIENTATION);
		createEAttribute(georeferencedTextureTypeEClass, GEOREFERENCED_TEXTURE_TYPE__TARGET);
		createEAttribute(georeferencedTextureTypeEClass, GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP);
		createEReference(georeferencedTextureTypeEClass, GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE);

		parameterizedTextureTypeEClass = createEClass(PARAMETERIZED_TEXTURE_TYPE);
		createEReference(parameterizedTextureTypeEClass, PARAMETERIZED_TEXTURE_TYPE__TARGET);
		createEAttribute(parameterizedTextureTypeEClass, PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP);
		createEReference(parameterizedTextureTypeEClass, PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE);

		surfaceDataPropertyTypeEClass = createEClass(SURFACE_DATA_PROPERTY_TYPE);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__SURFACE_DATA_GROUP);
		createEReference(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__SURFACE_DATA);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__ACTUATE);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__ARCROLE);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__HREF);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__REMOTE_SCHEMA);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__ROLE);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__SHOW);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__TITLE);
		createEAttribute(surfaceDataPropertyTypeEClass, SURFACE_DATA_PROPERTY_TYPE__TYPE);

		texCoordGenTypeEClass = createEClass(TEX_COORD_GEN_TYPE);
		createEReference(texCoordGenTypeEClass, TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE);
		createEAttribute(texCoordGenTypeEClass, TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP);
		createEReference(texCoordGenTypeEClass, TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN);

		texCoordListTypeEClass = createEClass(TEX_COORD_LIST_TYPE);
		createEReference(texCoordListTypeEClass, TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES);
		createEAttribute(texCoordListTypeEClass, TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP);
		createEReference(texCoordListTypeEClass, TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST);

		textureAssociationTypeEClass = createEClass(TEXTURE_ASSOCIATION_TYPE);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__TEXTURE_PARAMETERIZATION_GROUP);
		createEReference(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__TEXTURE_PARAMETERIZATION);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__ACTUATE);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__ARCROLE);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__HREF);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__REMOTE_SCHEMA);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__ROLE);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__SHOW);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__TITLE);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__TYPE);
		createEAttribute(textureAssociationTypeEClass, TEXTURE_ASSOCIATION_TYPE__URI);

		textureCoordinatesTypeEClass = createEClass(TEXTURE_COORDINATES_TYPE);
		createEAttribute(textureCoordinatesTypeEClass, TEXTURE_COORDINATES_TYPE__VALUE);
		createEAttribute(textureCoordinatesTypeEClass, TEXTURE_COORDINATES_TYPE__RING);

		worldToTextureTypeEClass = createEClass(WORLD_TO_TEXTURE_TYPE);
		createEAttribute(worldToTextureTypeEClass, WORLD_TO_TEXTURE_TYPE__VALUE);
		createEAttribute(worldToTextureTypeEClass, WORLD_TO_TEXTURE_TYPE__AXIS_LABELS);
		createEAttribute(worldToTextureTypeEClass, WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION);
		createEAttribute(worldToTextureTypeEClass, WORLD_TO_TEXTURE_TYPE__SRS_NAME);
		createEAttribute(worldToTextureTypeEClass, WORLD_TO_TEXTURE_TYPE__UOM_LABELS);

		x3DMaterialTypeEClass = createEClass(X3D_MATERIAL_TYPE);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__AMBIENT_INTENSITY);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__DIFFUSE_COLOR);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__EMISSIVE_COLOR);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__SPECULAR_COLOR);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__SHININESS);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__TRANSPARENCY);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__IS_SMOOTH);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__TARGET);
		createEAttribute(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP);
		createEReference(x3DMaterialTypeEClass, X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL);

		// Create enums
		textureTypeTypeEEnum = createEEnum(TEXTURE_TYPE_TYPE);
		wrapModeTypeEEnum = createEEnum(WRAP_MODE_TYPE);

		// Create data types
		colorEDataType = createEDataType(COLOR);
		colorPlusOpacityEDataType = createEDataType(COLOR_PLUS_OPACITY);
		textureTypeTypeObjectEDataType = createEDataType(TEXTURE_TYPE_TYPE_OBJECT);
		wrapModeTypeObjectEDataType = createEDataType(WRAP_MODE_TYPE_OBJECT);
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
		CitygmlPackage theCitygmlPackage = (CitygmlPackage)EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI);
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractSurfaceDataTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractFeatureType());
		abstractTextureParameterizationTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractGMLType());
		abstractTextureTypeEClass.getESuperTypes().add(this.getAbstractSurfaceDataType());
		appearancePropertyTypeEClass.getESuperTypes().add(theGmlPackage.getFeaturePropertyType());
		appearanceTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractFeatureType());
		georeferencedTextureTypeEClass.getESuperTypes().add(this.getAbstractTextureType());
		parameterizedTextureTypeEClass.getESuperTypes().add(this.getAbstractTextureType());
		texCoordGenTypeEClass.getESuperTypes().add(this.getAbstractTextureParameterizationType());
		texCoordListTypeEClass.getESuperTypes().add(this.getAbstractTextureParameterizationType());
		x3DMaterialTypeEClass.getESuperTypes().add(this.getAbstractSurfaceDataType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractSurfaceDataTypeEClass, AbstractSurfaceDataType.class, "AbstractSurfaceDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSurfaceDataType_IsFront(), theXMLTypePackage.getBoolean(), "isFront", "true", 0, 1, AbstractSurfaceDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceDataGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfSurfaceDataGroup", null, 0, -1, AbstractSurfaceDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceData(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSurfaceData", null, 0, -1, AbstractSurfaceDataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractTextureParameterizationTypeEClass, AbstractTextureParameterizationType.class, "AbstractTextureParameterizationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterizationGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTextureParameterizationGroup", null, 0, -1, AbstractTextureParameterizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterization(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTextureParameterization", null, 0, -1, AbstractTextureParameterizationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractTextureTypeEClass, AbstractTextureType.class, "AbstractTextureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTextureType_ImageURI(), theXMLTypePackage.getAnyURI(), "imageURI", null, 1, 1, AbstractTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextureType_MimeType(), theCitygmlPackage.getMimeTypeType(), "mimeType", null, 0, 1, AbstractTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextureType_TextureType(), this.getTextureTypeType(), "textureType", null, 0, 1, AbstractTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextureType_WrapMode(), this.getWrapModeType(), "wrapMode", null, 0, 1, AbstractTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextureType_BorderColor(), this.getColorPlusOpacity(), "borderColor", null, 0, 1, AbstractTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTextureType_GenericApplicationPropertyOfTextureGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTextureGroup", null, 0, -1, AbstractTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTextureType_GenericApplicationPropertyOfTexture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTexture", null, 0, -1, AbstractTextureType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(appearancePropertyTypeEClass, AppearancePropertyType.class, "AppearancePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppearancePropertyType_Appearance(), this.getAppearanceType(), null, "appearance", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceTypeEClass, AppearanceType.class, "AppearanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppearanceType_Theme(), theXMLTypePackage.getString(), "theme", null, 0, 1, AppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearanceType_SurfaceDataMember(), this.getSurfaceDataPropertyType(), null, "surfaceDataMember", null, 0, -1, AppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearanceType_GenericApplicationPropertyOfAppearanceGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfAppearanceGroup", null, 0, -1, AppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearanceType_GenericApplicationPropertyOfAppearance(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAppearance", null, 0, -1, AppearanceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfAppearance(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfAppearance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfGeoreferencedTexture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfGeoreferencedTexture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfParameterizedTexture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfParameterizedTexture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfSurfaceData(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfSurfaceData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTexCoordGen(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTexCoordGen", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTexCoordList(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTexCoordList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTexture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTexture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfTextureParameterization(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTextureParameterization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GenericApplicationPropertyOfX3DMaterial(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfX3DMaterial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SurfaceData(), this.getAbstractSurfaceDataType(), null, "surfaceData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Texture(), this.getAbstractTextureType(), null, "texture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TextureParameterization(), this.getAbstractTextureParameterizationType(), null, "textureParameterization", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Appearance(), this.getAppearancePropertyType(), null, "appearance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AppearanceMember(), this.getAppearancePropertyType(), null, "appearanceMember", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GeoreferencedTexture(), this.getGeoreferencedTextureType(), null, "georeferencedTexture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ParameterizedTexture(), this.getParameterizedTextureType(), null, "parameterizedTexture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TexCoordGen(), this.getTexCoordGenType(), null, "texCoordGen", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TexCoordList(), this.getTexCoordListType(), null, "texCoordList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_X3DMaterial(), this.getX3DMaterialType(), null, "x3DMaterial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(georeferencedTextureTypeEClass, GeoreferencedTextureType.class, "GeoreferencedTextureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoreferencedTextureType_PreferWorldFile(), theXMLTypePackage.getBoolean(), "preferWorldFile", "true", 0, 1, GeoreferencedTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeoreferencedTextureType_ReferencePoint(), theGmlPackage.getPointPropertyType(), null, "referencePoint", null, 0, 1, GeoreferencedTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoreferencedTextureType_Orientation(), theCitygmlPackage.getTransformationMatrix2x2Type(), "orientation", null, 0, 1, GeoreferencedTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoreferencedTextureType_Target(), theXMLTypePackage.getAnyURI(), "target", null, 0, -1, GeoreferencedTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTextureGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfGeoreferencedTextureGroup", null, 0, -1, GeoreferencedTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTexture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfGeoreferencedTexture", null, 0, -1, GeoreferencedTextureType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedTextureTypeEClass, ParameterizedTextureType.class, "ParameterizedTextureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedTextureType_Target(), this.getTextureAssociationType(), null, "target", null, 0, -1, ParameterizedTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTextureGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfParameterizedTextureGroup", null, 0, -1, ParameterizedTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTexture(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfParameterizedTexture", null, 0, -1, ParameterizedTextureType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(surfaceDataPropertyTypeEClass, SurfaceDataPropertyType.class, "SurfaceDataPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurfaceDataPropertyType_SurfaceDataGroup(), ecorePackage.getEFeatureMapEntry(), "surfaceDataGroup", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurfaceDataPropertyType_SurfaceData(), this.getAbstractSurfaceDataType(), null, "surfaceData", null, 0, 1, SurfaceDataPropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_Arcrole(), theXMLTypePackage.getAnyURI(), "arcrole", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_RemoteSchema(), theXMLTypePackage.getAnyURI(), "remoteSchema", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_Role(), theXMLTypePackage.getAnyURI(), "role", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurfaceDataPropertyType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, SurfaceDataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(texCoordGenTypeEClass, TexCoordGenType.class, "TexCoordGenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTexCoordGenType_WorldToTexture(), this.getWorldToTextureType(), null, "worldToTexture", null, 1, 1, TexCoordGenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTexCoordGenType_GenericApplicationPropertyOfTexCoordGenGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTexCoordGenGroup", null, 0, -1, TexCoordGenType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTexCoordGenType_GenericApplicationPropertyOfTexCoordGen(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTexCoordGen", null, 0, -1, TexCoordGenType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(texCoordListTypeEClass, TexCoordListType.class, "TexCoordListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTexCoordListType_TextureCoordinates(), this.getTextureCoordinatesType(), null, "textureCoordinates", null, 1, -1, TexCoordListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTexCoordListType_GenericApplicationPropertyOfTexCoordListGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfTexCoordListGroup", null, 0, -1, TexCoordListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTexCoordListType_GenericApplicationPropertyOfTexCoordList(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfTexCoordList", null, 0, -1, TexCoordListType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(textureAssociationTypeEClass, TextureAssociationType.class, "TextureAssociationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextureAssociationType_TextureParameterizationGroup(), ecorePackage.getEFeatureMapEntry(), "textureParameterizationGroup", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextureAssociationType_TextureParameterization(), this.getAbstractTextureParameterizationType(), null, "textureParameterization", null, 0, 1, TextureAssociationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Arcrole(), theXMLTypePackage.getAnyURI(), "arcrole", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_RemoteSchema(), theXMLTypePackage.getAnyURI(), "remoteSchema", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Role(), theXMLTypePackage.getAnyURI(), "role", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureAssociationType_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, TextureAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textureCoordinatesTypeEClass, TextureCoordinatesType.class, "TextureCoordinatesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextureCoordinatesType_Value(), theGmlPackage.getDoubleList(), "value", null, 0, 1, TextureCoordinatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextureCoordinatesType_Ring(), theXMLTypePackage.getAnyURI(), "ring", null, 1, 1, TextureCoordinatesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worldToTextureTypeEClass, WorldToTextureType.class, "WorldToTextureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorldToTextureType_Value(), theCitygmlPackage.getTransformationMatrix3x4Type(), "value", null, 0, 1, WorldToTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorldToTextureType_AxisLabels(), theGmlPackage.getNCNameList(), "axisLabels", null, 0, 1, WorldToTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorldToTextureType_SrsDimension(), theXMLTypePackage.getPositiveInteger(), "srsDimension", null, 0, 1, WorldToTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorldToTextureType_SrsName(), theXMLTypePackage.getAnyURI(), "srsName", null, 0, 1, WorldToTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorldToTextureType_UomLabels(), theGmlPackage.getNCNameList(), "uomLabels", null, 0, 1, WorldToTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(x3DMaterialTypeEClass, X3DMaterialType.class, "X3DMaterialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getX3DMaterialType_AmbientIntensity(), theCitygmlPackage.getDoubleBetween0and1(), "ambientIntensity", "0.2", 0, 1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_DiffuseColor(), this.getColor(), "diffuseColor", "0.8 0.8 0.8", 0, 1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_EmissiveColor(), this.getColor(), "emissiveColor", "0.0 0.0 0.0", 0, 1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_SpecularColor(), this.getColor(), "specularColor", "1.0 1.0 1.0", 0, 1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_Shininess(), theCitygmlPackage.getDoubleBetween0and1(), "shininess", "0.2", 0, 1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_Transparency(), theCitygmlPackage.getDoubleBetween0and1(), "transparency", "0.0", 0, 1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_IsSmooth(), theXMLTypePackage.getBoolean(), "isSmooth", "false", 0, 1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_Target(), theXMLTypePackage.getAnyURI(), "target", null, 0, -1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getX3DMaterialType_GenericApplicationPropertyOfX3DMaterialGroup(), ecorePackage.getEFeatureMapEntry(), "genericApplicationPropertyOfX3DMaterialGroup", null, 0, -1, X3DMaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getX3DMaterialType_GenericApplicationPropertyOfX3DMaterial(), ecorePackage.getEObject(), null, "genericApplicationPropertyOfX3DMaterial", null, 0, -1, X3DMaterialType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(textureTypeTypeEEnum, TextureTypeType.class, "TextureTypeType");
		addEEnumLiteral(textureTypeTypeEEnum, TextureTypeType.SPECIFIC);
		addEEnumLiteral(textureTypeTypeEEnum, TextureTypeType.TYPICAL);
		addEEnumLiteral(textureTypeTypeEEnum, TextureTypeType.UNKNOWN);

		initEEnum(wrapModeTypeEEnum, WrapModeType.class, "WrapModeType");
		addEEnumLiteral(wrapModeTypeEEnum, WrapModeType.NONE);
		addEEnumLiteral(wrapModeTypeEEnum, WrapModeType.WRAP);
		addEEnumLiteral(wrapModeTypeEEnum, WrapModeType.MIRROR);
		addEEnumLiteral(wrapModeTypeEEnum, WrapModeType.CLAMP);
		addEEnumLiteral(wrapModeTypeEEnum, WrapModeType.BORDER);

		// Initialize data types
		initEDataType(colorEDataType, List.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorPlusOpacityEDataType, List.class, "ColorPlusOpacity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureTypeTypeObjectEDataType, TextureTypeType.class, "TextureTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wrapModeTypeObjectEDataType, WrapModeType.class, "WrapModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (abstractSurfaceDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractSurfaceDataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractSurfaceDataType_IsFront(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isFront",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceDataGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfSurfaceData:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSurfaceData",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfSurfaceData:group"
		   });			
		addAnnotation
		  (abstractTextureParameterizationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractTextureParameterizationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterizationGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTextureParameterization:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTextureParameterization",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTextureParameterization:group"
		   });			
		addAnnotation
		  (abstractTextureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractTextureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractTextureType_ImageURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageURI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTextureType_MimeType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mimeType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTextureType_TextureType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textureType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTextureType_WrapMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wrapMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTextureType_BorderColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "borderColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTextureType_GenericApplicationPropertyOfTextureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTexture:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbstractTextureType_GenericApplicationPropertyOfTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTexture",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTexture:group"
		   });			
		addAnnotation
		  (appearancePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AppearancePropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Appearance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Appearance",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (appearanceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AppearanceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAppearanceType_Theme(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "theme",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAppearanceType_SurfaceDataMember(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "surfaceDataMember",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAppearanceType_GenericApplicationPropertyOfAppearanceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfAppearance:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAppearanceType_GenericApplicationPropertyOfAppearance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAppearance",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfAppearance:group"
		   });			
		addAnnotation
		  (colorEDataType, 
		   source, 
		   new String[] {
			 "name", "Color",
			 "baseType", "http://www.opengis.net/citygml/1.0#doubleBetween0and1List",
			 "length", "3"
		   });			
		addAnnotation
		  (colorPlusOpacityEDataType, 
		   source, 
		   new String[] {
			 "name", "ColorPlusOpacity",
			 "baseType", "http://www.opengis.net/citygml/1.0#doubleBetween0and1List",
			 "minLength", "3",
			 "maxLength", "4"
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
		  (getDocumentRoot_GenericApplicationPropertyOfAppearance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfAppearance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfGeoreferencedTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfGeoreferencedTexture",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfParameterizedTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfParameterizedTexture",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfSurfaceData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfSurfaceData",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTexCoordGen(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTexCoordGen",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTexCoordList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTexCoordList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTexture",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfTextureParameterization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTextureParameterization",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GenericApplicationPropertyOfX3DMaterial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfX3DMaterial",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SurfaceData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_SurfaceData",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#_Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_Texture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_Texture",
			 "namespace", "##targetNamespace",
			 "affiliation", "_SurfaceData"
		   });		
		addAnnotation
		  (getDocumentRoot_TextureParameterization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_TextureParameterization",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#_GML"
		   });		
		addAnnotation
		  (getDocumentRoot_Appearance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appearance",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/citygml/1.0#_GenericApplicationPropertyOfCityObject"
		   });		
		addAnnotation
		  (getDocumentRoot_AppearanceMember(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appearanceMember",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#featureMember"
		   });		
		addAnnotation
		  (getDocumentRoot_GeoreferencedTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GeoreferencedTexture",
			 "namespace", "##targetNamespace",
			 "affiliation", "_Texture"
		   });		
		addAnnotation
		  (getDocumentRoot_ParameterizedTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ParameterizedTexture",
			 "namespace", "##targetNamespace",
			 "affiliation", "_Texture"
		   });		
		addAnnotation
		  (getDocumentRoot_TexCoordGen(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TexCoordGen",
			 "namespace", "##targetNamespace",
			 "affiliation", "_TextureParameterization"
		   });		
		addAnnotation
		  (getDocumentRoot_TexCoordList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TexCoordList",
			 "namespace", "##targetNamespace",
			 "affiliation", "_TextureParameterization"
		   });		
		addAnnotation
		  (getDocumentRoot_X3DMaterial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "X3DMaterial",
			 "namespace", "##targetNamespace",
			 "affiliation", "_SurfaceData"
		   });			
		addAnnotation
		  (georeferencedTextureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GeoreferencedTextureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGeoreferencedTextureType_PreferWorldFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preferWorldFile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeoreferencedTextureType_ReferencePoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencePoint",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeoreferencedTextureType_Orientation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orientation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeoreferencedTextureType_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "target",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTextureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfGeoreferencedTexture:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfGeoreferencedTexture",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfGeoreferencedTexture:group"
		   });			
		addAnnotation
		  (parameterizedTextureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ParameterizedTextureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParameterizedTextureType_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "target",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTextureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfParameterizedTexture:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfParameterizedTexture",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfParameterizedTexture:group"
		   });			
		addAnnotation
		  (surfaceDataPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SurfaceDataPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSurfaceDataPropertyType_SurfaceDataGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_SurfaceData:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSurfaceDataPropertyType_SurfaceData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_SurfaceData",
			 "namespace", "##targetNamespace",
			 "group", "_SurfaceData:group"
		   });			
		addAnnotation
		  (getSurfaceDataPropertyType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getSurfaceDataPropertyType_Arcrole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arcrole",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getSurfaceDataPropertyType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getSurfaceDataPropertyType_RemoteSchema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSchema",
			 "namespace", "http://www.opengis.net/gml"
		   });		
		addAnnotation
		  (getSurfaceDataPropertyType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getSurfaceDataPropertyType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getSurfaceDataPropertyType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getSurfaceDataPropertyType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (texCoordGenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TexCoordGenType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTexCoordGenType_WorldToTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "worldToTexture",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTexCoordGenType_GenericApplicationPropertyOfTexCoordGenGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTexCoordGen:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTexCoordGenType_GenericApplicationPropertyOfTexCoordGen(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTexCoordGen",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTexCoordGen:group"
		   });			
		addAnnotation
		  (texCoordListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TexCoordListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTexCoordListType_TextureCoordinates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textureCoordinates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTexCoordListType_GenericApplicationPropertyOfTexCoordListGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfTexCoordList:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTexCoordListType_GenericApplicationPropertyOfTexCoordList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfTexCoordList",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfTexCoordList:group"
		   });			
		addAnnotation
		  (textureAssociationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TextureAssociationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTextureAssociationType_TextureParameterizationGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_TextureParameterization:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextureAssociationType_TextureParameterization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_TextureParameterization",
			 "namespace", "##targetNamespace",
			 "group", "_TextureParameterization:group"
		   });			
		addAnnotation
		  (getTextureAssociationType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTextureAssociationType_Arcrole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arcrole",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTextureAssociationType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getTextureAssociationType_RemoteSchema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSchema",
			 "namespace", "http://www.opengis.net/gml"
		   });		
		addAnnotation
		  (getTextureAssociationType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getTextureAssociationType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTextureAssociationType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTextureAssociationType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTextureAssociationType_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (textureCoordinatesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "textureCoordinates_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTextureCoordinatesType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTextureCoordinatesType_Ring(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ring"
		   });			
		addAnnotation
		  (textureTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TextureTypeType"
		   });		
		addAnnotation
		  (textureTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TextureTypeType:Object",
			 "baseType", "TextureTypeType"
		   });		
		addAnnotation
		  (worldToTextureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "worldToTexture_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getWorldToTextureType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });			
		addAnnotation
		  (getWorldToTextureType_AxisLabels(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "axisLabels"
		   });			
		addAnnotation
		  (getWorldToTextureType_SrsDimension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "srsDimension"
		   });			
		addAnnotation
		  (getWorldToTextureType_SrsName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "srsName"
		   });			
		addAnnotation
		  (getWorldToTextureType_UomLabels(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uomLabels"
		   });			
		addAnnotation
		  (wrapModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "WrapModeType"
		   });		
		addAnnotation
		  (wrapModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "WrapModeType:Object",
			 "baseType", "WrapModeType"
		   });			
		addAnnotation
		  (x3DMaterialTypeEClass, 
		   source, 
		   new String[] {
			 "name", "X3DMaterialType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getX3DMaterialType_AmbientIntensity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ambientIntensity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_DiffuseColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diffuseColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_EmissiveColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emissiveColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_SpecularColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "specularColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_Shininess(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shininess",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_Transparency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transparency",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_IsSmooth(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isSmooth",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "target",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_GenericApplicationPropertyOfX3DMaterialGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_GenericApplicationPropertyOfX3DMaterial:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getX3DMaterialType_GenericApplicationPropertyOfX3DMaterial(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_GenericApplicationPropertyOfX3DMaterial",
			 "namespace", "##targetNamespace",
			 "group", "_GenericApplicationPropertyOfX3DMaterial:group"
		   });
	}

} //AppearancePackageImpl
