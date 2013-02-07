/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.xml._1998.namespace.impl;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
import org.w3.xml._1998.namespace.DocumentRoot;
import org.w3.xml._1998.namespace.NamespaceFactory;
import org.w3.xml._1998.namespace.NamespacePackage;
import org.w3.xml._1998.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespacePackageImpl extends EPackageImpl implements NamespacePackage {
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
	private EEnum spaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spaceTypeObjectEDataType = null;

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
	 * @see org.w3.xml._1998.namespace.NamespacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NamespacePackageImpl() {
		super(eNS_URI, NamespaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NamespacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NamespacePackage init() {
		if (isInited) return (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);

		// Obtain or create and register package
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NamespacePackageImpl());

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

		// Load packages
		theGmlPackage.loadPackage();
		theXALPackage.loadPackage();

		// Create package meta-data objects
		theNamespacePackage.createPackageContents();
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

		// Initialize created meta-data
		theNamespacePackage.initializePackageContents();
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

		// Fix loaded packages
		theGmlPackage.fixPackageContents();
		theXALPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theNamespacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NamespacePackage.eNS_URI, theNamespacePackage);
		return theNamespacePackage;
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
	public EAttribute getDocumentRoot_Lang() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Space() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpaceType() {
		return spaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpaceTypeObject() {
		return spaceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceFactory getNamespaceFactory() {
		return (NamespaceFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LANG);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPACE);

		// Create enums
		spaceTypeEEnum = createEEnum(SPACE_TYPE);

		// Create data types
		spaceTypeObjectEDataType = createEDataType(SPACE_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Lang(), theXMLTypePackage.getLanguage(), "lang", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Space(), this.getSpaceType(), "space", "preserve", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(spaceTypeEEnum, SpaceType.class, "SpaceType");
		addEEnumLiteral(spaceTypeEEnum, SpaceType.DEFAULT);
		addEEnumLiteral(spaceTypeEEnum, SpaceType.PRESERVE);

		// Initialize data types
		initEDataType(spaceTypeObjectEDataType, SpaceType.class, "SpaceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (getDocumentRoot_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (spaceTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "space_._type"
		   });		
		addAnnotation
		  (spaceTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "space_._type:Object",
			 "baseType", "space_._type"
		   });
	}

} //NamespacePackageImpl
