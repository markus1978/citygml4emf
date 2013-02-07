/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.impl;

import java.util.List;

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
import net.opengis.citygml.texturedsurface.AbstractAppearanceType;
import net.opengis.citygml.texturedsurface.AppearancePropertyType;
import net.opengis.citygml.texturedsurface.DocumentRoot;
import net.opengis.citygml.texturedsurface.MaterialType;
import net.opengis.citygml.texturedsurface.SimpleTextureType;
import net.opengis.citygml.texturedsurface.TextureTypeType;
import net.opengis.citygml.texturedsurface.TexturedSurfaceType;
import net.opengis.citygml.texturedsurface.TexturedsurfaceFactory;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;
import net.opengis.citygml.texturedsurface.util.TexturedsurfaceValidator;
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
public class TexturedsurfacePackageImpl extends EPackageImpl implements TexturedsurfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAppearanceTypeEClass = null;

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
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTextureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass texturedSurfaceTypeEClass = null;

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
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureTypeTypeObjectEDataType = null;

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
	 * @see net.opengis.citygml.texturedsurface.TexturedsurfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TexturedsurfacePackageImpl() {
		super(eNS_URI, TexturedsurfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TexturedsurfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TexturedsurfacePackage init() {
		if (isInited) return (TexturedsurfacePackage)EPackage.Registry.INSTANCE.getEPackage(TexturedsurfacePackage.eNS_URI);

		// Obtain or create and register package
		TexturedsurfacePackageImpl theTexturedsurfacePackage = (TexturedsurfacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TexturedsurfacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TexturedsurfacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BuildingPackageImpl theBuildingPackage = (BuildingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) instanceof BuildingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildingPackage.eNS_URI) : BuildingPackage.eINSTANCE);
		CitygmlPackageImpl theCitygmlPackage = (CitygmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) instanceof CitygmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI) : CitygmlPackage.eINSTANCE);
		GmlPackageImpl theGmlPackage = (GmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) instanceof GmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GmlPackage.eNS_URI) : GmlPackage.eINSTANCE);
		XlinkPackageImpl theXlinkPackage = (XlinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) instanceof XlinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI) : XlinkPackage.eINSTANCE);
		XALPackageImpl theXALPackage = (XALPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) instanceof XALPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XALPackage.eNS_URI) : XALPackage.eINSTANCE);
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
		theTexturedsurfacePackage.createPackageContents();
		theBuildingPackage.createPackageContents();
		theCitygmlPackage.createPackageContents();
		theXlinkPackage.createPackageContents();
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
		theTexturedsurfacePackage.initializePackageContents();
		theBuildingPackage.initializePackageContents();
		theCitygmlPackage.initializePackageContents();
		theXlinkPackage.initializePackageContents();
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
			(theTexturedsurfacePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TexturedsurfaceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTexturedsurfacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TexturedsurfacePackage.eNS_URI, theTexturedsurfacePackage);
		return theTexturedsurfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAppearanceType() {
		return abstractAppearanceTypeEClass;
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
	public EAttribute getAppearancePropertyType_AppearanceGroup() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppearancePropertyType_Appearance() {
		return (EReference)appearancePropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Actuate() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Arcrole() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Href() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Orientation() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_RemoteSchema() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Role() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Show() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Title() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppearancePropertyType_Type() {
		return (EAttribute)appearancePropertyTypeEClass.getEStructuralFeatures().get(10);
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
	public EReference getDocumentRoot_Appearance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Appearance1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Material() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SimpleTexture() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TexturedSurface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialType() {
		return materialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_Shininess() {
		return (EAttribute)materialTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_Transparency() {
		return (EAttribute)materialTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_AmbientIntensity() {
		return (EAttribute)materialTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_SpecularColor() {
		return (EAttribute)materialTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_DiffuseColor() {
		return (EAttribute)materialTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialType_EmissiveColor() {
		return (EAttribute)materialTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTextureType() {
		return simpleTextureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextureType_TextureMap() {
		return (EAttribute)simpleTextureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextureType_TextureCoordinates() {
		return (EAttribute)simpleTextureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextureType_TextureType() {
		return (EAttribute)simpleTextureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTextureType_Repeat() {
		return (EAttribute)simpleTextureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexturedSurfaceType() {
		return texturedSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTexturedSurfaceType_Appearance() {
		return (EReference)texturedSurfaceTypeEClass.getEStructuralFeatures().get(0);
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
	public EDataType getColor() {
		return colorEDataType;
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
	public TexturedsurfaceFactory getTexturedsurfaceFactory() {
		return (TexturedsurfaceFactory)getEFactoryInstance();
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
		abstractAppearanceTypeEClass = createEClass(ABSTRACT_APPEARANCE_TYPE);

		appearancePropertyTypeEClass = createEClass(APPEARANCE_PROPERTY_TYPE);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__APPEARANCE_GROUP);
		createEReference(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__APPEARANCE);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__ACTUATE);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__ARCROLE);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__HREF);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__ORIENTATION);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__REMOTE_SCHEMA);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__ROLE);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__SHOW);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__TITLE);
		createEAttribute(appearancePropertyTypeEClass, APPEARANCE_PROPERTY_TYPE__TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPEARANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPEARANCE1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MATERIAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_TEXTURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXTURED_SURFACE);

		materialTypeEClass = createEClass(MATERIAL_TYPE);
		createEAttribute(materialTypeEClass, MATERIAL_TYPE__SHININESS);
		createEAttribute(materialTypeEClass, MATERIAL_TYPE__TRANSPARENCY);
		createEAttribute(materialTypeEClass, MATERIAL_TYPE__AMBIENT_INTENSITY);
		createEAttribute(materialTypeEClass, MATERIAL_TYPE__SPECULAR_COLOR);
		createEAttribute(materialTypeEClass, MATERIAL_TYPE__DIFFUSE_COLOR);
		createEAttribute(materialTypeEClass, MATERIAL_TYPE__EMISSIVE_COLOR);

		simpleTextureTypeEClass = createEClass(SIMPLE_TEXTURE_TYPE);
		createEAttribute(simpleTextureTypeEClass, SIMPLE_TEXTURE_TYPE__TEXTURE_MAP);
		createEAttribute(simpleTextureTypeEClass, SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES);
		createEAttribute(simpleTextureTypeEClass, SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE);
		createEAttribute(simpleTextureTypeEClass, SIMPLE_TEXTURE_TYPE__REPEAT);

		texturedSurfaceTypeEClass = createEClass(TEXTURED_SURFACE_TYPE);
		createEReference(texturedSurfaceTypeEClass, TEXTURED_SURFACE_TYPE__APPEARANCE);

		// Create enums
		textureTypeTypeEEnum = createEEnum(TEXTURE_TYPE_TYPE);

		// Create data types
		colorEDataType = createEDataType(COLOR);
		textureTypeTypeObjectEDataType = createEDataType(TEXTURE_TYPE_TYPE_OBJECT);
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
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		CitygmlPackage theCitygmlPackage = (CitygmlPackage)EPackage.Registry.INSTANCE.getEPackage(CitygmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractAppearanceTypeEClass.getESuperTypes().add(theGmlPackage.getAbstractGMLType());
		materialTypeEClass.getESuperTypes().add(this.getAbstractAppearanceType());
		simpleTextureTypeEClass.getESuperTypes().add(this.getAbstractAppearanceType());
		texturedSurfaceTypeEClass.getESuperTypes().add(theGmlPackage.getOrientableSurfaceType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractAppearanceTypeEClass, AbstractAppearanceType.class, "AbstractAppearanceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appearancePropertyTypeEClass, AppearancePropertyType.class, "AppearancePropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppearancePropertyType_AppearanceGroup(), ecorePackage.getEFeatureMapEntry(), "appearanceGroup", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearancePropertyType_Appearance(), this.getAbstractAppearanceType(), null, "appearance", null, 0, 1, AppearancePropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Arcrole(), theXMLTypePackage.getAnyURI(), "arcrole", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Orientation(), theGmlPackage.getSignType(), "orientation", "+", 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_RemoteSchema(), theXMLTypePackage.getAnyURI(), "remoteSchema", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Role(), theXMLTypePackage.getAnyURI(), "role", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearancePropertyType_Type(), theXMLTypePackage.getString(), "type", "simple", 0, 1, AppearancePropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Appearance(), this.getAbstractAppearanceType(), null, "appearance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Appearance1(), this.getAppearancePropertyType(), null, "appearance1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Material(), this.getMaterialType(), null, "material", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SimpleTexture(), this.getSimpleTextureType(), null, "simpleTexture", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TexturedSurface(), this.getTexturedSurfaceType(), null, "texturedSurface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(materialTypeEClass, MaterialType.class, "MaterialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterialType_Shininess(), theCitygmlPackage.getDoubleBetween0and1(), "shininess", null, 0, 1, MaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterialType_Transparency(), theCitygmlPackage.getDoubleBetween0and1(), "transparency", null, 0, 1, MaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterialType_AmbientIntensity(), theCitygmlPackage.getDoubleBetween0and1(), "ambientIntensity", null, 0, 1, MaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterialType_SpecularColor(), this.getColor(), "specularColor", null, 0, 1, MaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterialType_DiffuseColor(), this.getColor(), "diffuseColor", null, 0, 1, MaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterialType_EmissiveColor(), this.getColor(), "emissiveColor", null, 0, 1, MaterialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTextureTypeEClass, SimpleTextureType.class, "SimpleTextureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleTextureType_TextureMap(), theXMLTypePackage.getAnyURI(), "textureMap", null, 1, 1, SimpleTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTextureType_TextureCoordinates(), theGmlPackage.getDoubleList(), "textureCoordinates", null, 1, 1, SimpleTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTextureType_TextureType(), this.getTextureTypeType(), "textureType", null, 0, 1, SimpleTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTextureType_Repeat(), theXMLTypePackage.getBoolean(), "repeat", null, 0, 1, SimpleTextureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(texturedSurfaceTypeEClass, TexturedSurfaceType.class, "TexturedSurfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTexturedSurfaceType_Appearance(), this.getAppearancePropertyType(), null, "appearance", null, 1, -1, TexturedSurfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(textureTypeTypeEEnum, TextureTypeType.class, "TextureTypeType");
		addEEnumLiteral(textureTypeTypeEEnum, TextureTypeType.SPECIFIC);
		addEEnumLiteral(textureTypeTypeEEnum, TextureTypeType.TYPICAL);
		addEEnumLiteral(textureTypeTypeEEnum, TextureTypeType.UNKNOWN);

		// Initialize data types
		initEDataType(colorEDataType, List.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureTypeTypeObjectEDataType, TextureTypeType.class, "TextureTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		// null
		createNullAnnotations();
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
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;																																		
		addAnnotation
		  (abstractAppearanceTypeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "deprecated"
		   });				
		addAnnotation
		  (appearancePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "deprecated"
		   });																		
		addAnnotation
		  (colorEDataType, 
		   source, 
		   new String[] {
			 "appinfo", "deprecated"
		   });													
		addAnnotation
		  (materialTypeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "deprecated"
		   });										
		addAnnotation
		  (simpleTextureTypeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "deprecated"
		   });								
		addAnnotation
		  (texturedSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "deprecated"
		   });					
		addAnnotation
		  (textureTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "appinfo", "deprecated"
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
		  (abstractAppearanceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractAppearanceType",
			 "kind", "elementOnly"
		   });				
		addAnnotation
		  (appearancePropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AppearancePropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAppearancePropertyType_AppearanceGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "_Appearance:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Appearance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_Appearance",
			 "namespace", "##targetNamespace",
			 "group", "_Appearance:group"
		   });			
		addAnnotation
		  (getAppearancePropertyType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Arcrole(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arcrole",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Orientation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "orientation"
		   });			
		addAnnotation
		  (getAppearancePropertyType_RemoteSchema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "remoteSchema",
			 "namespace", "http://www.opengis.net/gml"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getAppearancePropertyType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAppearancePropertyType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
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
		  (getDocumentRoot_Appearance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "_Appearance",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#_GML"
		   });		
		addAnnotation
		  (getDocumentRoot_Appearance1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appearance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Material(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Material",
			 "namespace", "##targetNamespace",
			 "affiliation", "_Appearance"
		   });		
		addAnnotation
		  (getDocumentRoot_SimpleTexture(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SimpleTexture",
			 "namespace", "##targetNamespace",
			 "affiliation", "_Appearance"
		   });		
		addAnnotation
		  (getDocumentRoot_TexturedSurface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TexturedSurface",
			 "namespace", "##targetNamespace",
			 "affiliation", "http://www.opengis.net/gml#OrientableSurface"
		   });				
		addAnnotation
		  (materialTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MaterialType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMaterialType_Shininess(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shininess",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMaterialType_Transparency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transparency",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMaterialType_AmbientIntensity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ambientIntensity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMaterialType_SpecularColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "specularColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMaterialType_DiffuseColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diffuseColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMaterialType_EmissiveColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emissiveColor",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (simpleTextureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleTextureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleTextureType_TextureMap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textureMap",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleTextureType_TextureCoordinates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textureCoordinates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleTextureType_TextureType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textureType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleTextureType_Repeat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "repeat",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (texturedSurfaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TexturedSurfaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTexturedSurfaceType_Appearance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appearance",
			 "namespace", "##targetNamespace"
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
	}

} //TexturedsurfacePackageImpl
