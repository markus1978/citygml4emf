/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildingFactoryImpl extends EFactoryImpl implements BuildingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuildingFactory init() {
		try {
			BuildingFactory theBuildingFactory = (BuildingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/building/1.0"); 
			if (theBuildingFactory != null) {
				return theBuildingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuildingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingFactoryImpl() {
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
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE: return createBoundarySurfacePropertyType();
			case BuildingPackage.BUILDING_FURNITURE_TYPE: return createBuildingFurnitureType();
			case BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE: return createBuildingInstallationPropertyType();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE: return createBuildingInstallationType();
			case BuildingPackage.BUILDING_PART_PROPERTY_TYPE: return createBuildingPartPropertyType();
			case BuildingPackage.BUILDING_PART_TYPE: return createBuildingPartType();
			case BuildingPackage.BUILDING_TYPE: return createBuildingType();
			case BuildingPackage.CEILING_SURFACE_TYPE: return createCeilingSurfaceType();
			case BuildingPackage.CLOSURE_SURFACE_TYPE: return createClosureSurfaceType();
			case BuildingPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BuildingPackage.DOOR_TYPE: return createDoorType();
			case BuildingPackage.FLOOR_SURFACE_TYPE: return createFloorSurfaceType();
			case BuildingPackage.GROUND_SURFACE_TYPE: return createGroundSurfaceType();
			case BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE: return createIntBuildingInstallationPropertyType();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE: return createIntBuildingInstallationType();
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE: return createInteriorFurniturePropertyType();
			case BuildingPackage.INTERIOR_ROOM_PROPERTY_TYPE: return createInteriorRoomPropertyType();
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE: return createInteriorWallSurfaceType();
			case BuildingPackage.OPENING_PROPERTY_TYPE: return createOpeningPropertyType();
			case BuildingPackage.ROOF_SURFACE_TYPE: return createRoofSurfaceType();
			case BuildingPackage.ROOM_TYPE: return createRoomType();
			case BuildingPackage.WALL_SURFACE_TYPE: return createWallSurfaceType();
			case BuildingPackage.WINDOW_TYPE: return createWindowType();
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
			case BuildingPackage.BUILDING_CLASS_TYPE:
				return createBuildingClassTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_FUNCTION_TYPE:
				return createBuildingFunctionTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_FURNITURE_CLASS_TYPE:
				return createBuildingFurnitureClassTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_FURNITURE_FUNCTION_TYPE:
				return createBuildingFurnitureFunctionTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_FURNITURE_USAGE_TYPE:
				return createBuildingFurnitureUsageTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_INSTALLATION_CLASS_TYPE:
				return createBuildingInstallationClassTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_INSTALLATION_FUNCTION_TYPE:
				return createBuildingInstallationFunctionTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_INSTALLATION_USAGE_TYPE:
				return createBuildingInstallationUsageTypeFromString(eDataType, initialValue);
			case BuildingPackage.BUILDING_USAGE_TYPE:
				return createBuildingUsageTypeFromString(eDataType, initialValue);
			case BuildingPackage.INT_BUILDING_INSTALLATION_CLASS_TYPE:
				return createIntBuildingInstallationClassTypeFromString(eDataType, initialValue);
			case BuildingPackage.INT_BUILDING_INSTALLATION_FUNCTION_TYPE:
				return createIntBuildingInstallationFunctionTypeFromString(eDataType, initialValue);
			case BuildingPackage.INT_BUILDING_INSTALLATION_USAGE_TYPE:
				return createIntBuildingInstallationUsageTypeFromString(eDataType, initialValue);
			case BuildingPackage.ROOF_TYPE_TYPE:
				return createRoofTypeTypeFromString(eDataType, initialValue);
			case BuildingPackage.ROOM_CLASS_TYPE:
				return createRoomClassTypeFromString(eDataType, initialValue);
			case BuildingPackage.ROOM_FUNCTION_TYPE:
				return createRoomFunctionTypeFromString(eDataType, initialValue);
			case BuildingPackage.ROOM_USAGE_TYPE:
				return createRoomUsageTypeFromString(eDataType, initialValue);
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
			case BuildingPackage.BUILDING_CLASS_TYPE:
				return convertBuildingClassTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_FUNCTION_TYPE:
				return convertBuildingFunctionTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_FURNITURE_CLASS_TYPE:
				return convertBuildingFurnitureClassTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_FURNITURE_FUNCTION_TYPE:
				return convertBuildingFurnitureFunctionTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_FURNITURE_USAGE_TYPE:
				return convertBuildingFurnitureUsageTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_INSTALLATION_CLASS_TYPE:
				return convertBuildingInstallationClassTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_INSTALLATION_FUNCTION_TYPE:
				return convertBuildingInstallationFunctionTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_INSTALLATION_USAGE_TYPE:
				return convertBuildingInstallationUsageTypeToString(eDataType, instanceValue);
			case BuildingPackage.BUILDING_USAGE_TYPE:
				return convertBuildingUsageTypeToString(eDataType, instanceValue);
			case BuildingPackage.INT_BUILDING_INSTALLATION_CLASS_TYPE:
				return convertIntBuildingInstallationClassTypeToString(eDataType, instanceValue);
			case BuildingPackage.INT_BUILDING_INSTALLATION_FUNCTION_TYPE:
				return convertIntBuildingInstallationFunctionTypeToString(eDataType, instanceValue);
			case BuildingPackage.INT_BUILDING_INSTALLATION_USAGE_TYPE:
				return convertIntBuildingInstallationUsageTypeToString(eDataType, instanceValue);
			case BuildingPackage.ROOF_TYPE_TYPE:
				return convertRoofTypeTypeToString(eDataType, instanceValue);
			case BuildingPackage.ROOM_CLASS_TYPE:
				return convertRoomClassTypeToString(eDataType, instanceValue);
			case BuildingPackage.ROOM_FUNCTION_TYPE:
				return convertRoomFunctionTypeToString(eDataType, instanceValue);
			case BuildingPackage.ROOM_USAGE_TYPE:
				return convertRoomUsageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundarySurfacePropertyType createBoundarySurfacePropertyType() {
		BoundarySurfacePropertyTypeImpl boundarySurfacePropertyType = new BoundarySurfacePropertyTypeImpl();
		return boundarySurfacePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingFurnitureType createBuildingFurnitureType() {
		BuildingFurnitureTypeImpl buildingFurnitureType = new BuildingFurnitureTypeImpl();
		return buildingFurnitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingInstallationPropertyType createBuildingInstallationPropertyType() {
		BuildingInstallationPropertyTypeImpl buildingInstallationPropertyType = new BuildingInstallationPropertyTypeImpl();
		return buildingInstallationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingInstallationType createBuildingInstallationType() {
		BuildingInstallationTypeImpl buildingInstallationType = new BuildingInstallationTypeImpl();
		return buildingInstallationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingPartPropertyType createBuildingPartPropertyType() {
		BuildingPartPropertyTypeImpl buildingPartPropertyType = new BuildingPartPropertyTypeImpl();
		return buildingPartPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingPartType createBuildingPartType() {
		BuildingPartTypeImpl buildingPartType = new BuildingPartTypeImpl();
		return buildingPartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingType createBuildingType() {
		BuildingTypeImpl buildingType = new BuildingTypeImpl();
		return buildingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilingSurfaceType createCeilingSurfaceType() {
		CeilingSurfaceTypeImpl ceilingSurfaceType = new CeilingSurfaceTypeImpl();
		return ceilingSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureSurfaceType createClosureSurfaceType() {
		ClosureSurfaceTypeImpl closureSurfaceType = new ClosureSurfaceTypeImpl();
		return closureSurfaceType;
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
	public DoorType createDoorType() {
		DoorTypeImpl doorType = new DoorTypeImpl();
		return doorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorSurfaceType createFloorSurfaceType() {
		FloorSurfaceTypeImpl floorSurfaceType = new FloorSurfaceTypeImpl();
		return floorSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundSurfaceType createGroundSurfaceType() {
		GroundSurfaceTypeImpl groundSurfaceType = new GroundSurfaceTypeImpl();
		return groundSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntBuildingInstallationPropertyType createIntBuildingInstallationPropertyType() {
		IntBuildingInstallationPropertyTypeImpl intBuildingInstallationPropertyType = new IntBuildingInstallationPropertyTypeImpl();
		return intBuildingInstallationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntBuildingInstallationType createIntBuildingInstallationType() {
		IntBuildingInstallationTypeImpl intBuildingInstallationType = new IntBuildingInstallationTypeImpl();
		return intBuildingInstallationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteriorFurniturePropertyType createInteriorFurniturePropertyType() {
		InteriorFurniturePropertyTypeImpl interiorFurniturePropertyType = new InteriorFurniturePropertyTypeImpl();
		return interiorFurniturePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteriorRoomPropertyType createInteriorRoomPropertyType() {
		InteriorRoomPropertyTypeImpl interiorRoomPropertyType = new InteriorRoomPropertyTypeImpl();
		return interiorRoomPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteriorWallSurfaceType createInteriorWallSurfaceType() {
		InteriorWallSurfaceTypeImpl interiorWallSurfaceType = new InteriorWallSurfaceTypeImpl();
		return interiorWallSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpeningPropertyType createOpeningPropertyType() {
		OpeningPropertyTypeImpl openingPropertyType = new OpeningPropertyTypeImpl();
		return openingPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoofSurfaceType createRoofSurfaceType() {
		RoofSurfaceTypeImpl roofSurfaceType = new RoofSurfaceTypeImpl();
		return roofSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallSurfaceType createWallSurfaceType() {
		WallSurfaceTypeImpl wallSurfaceType = new WallSurfaceTypeImpl();
		return wallSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowType createWindowType() {
		WindowTypeImpl windowType = new WindowTypeImpl();
		return windowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingFurnitureClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingFurnitureClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingFurnitureFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingFurnitureFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingFurnitureUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingFurnitureUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingInstallationClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingInstallationClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingInstallationFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingInstallationFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingInstallationUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingInstallationUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBuildingUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildingUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIntBuildingInstallationClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntBuildingInstallationClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIntBuildingInstallationFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntBuildingInstallationFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIntBuildingInstallationUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntBuildingInstallationUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoofTypeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoofTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoomClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoomFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoomUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingPackage getBuildingPackage() {
		return (BuildingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuildingPackage getPackage() {
		return BuildingPackage.eINSTANCE;
	}

} //BuildingFactoryImpl
