/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.util;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.AbstractSiteType;
import net.opengis.citygml.building.AbstractBoundarySurfaceType;
import net.opengis.citygml.building.AbstractBuildingType;
import net.opengis.citygml.building.AbstractOpeningType;
import net.opengis.citygml.building.BoundarySurfacePropertyType;
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
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AssociationType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.building.BuildingPackage
 * @generated
 */
public class BuildingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BuildingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingSwitch() {
		if (modelPackage == null) {
			modelPackage = BuildingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE: {
				AbstractBoundarySurfaceType abstractBoundarySurfaceType = (AbstractBoundarySurfaceType)theEObject;
				T result = caseAbstractBoundarySurfaceType(abstractBoundarySurfaceType);
				if (result == null) result = caseAbstractCityObjectType(abstractBoundarySurfaceType);
				if (result == null) result = caseAbstractFeatureType(abstractBoundarySurfaceType);
				if (result == null) result = caseAbstractGMLType(abstractBoundarySurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ABSTRACT_BUILDING_TYPE: {
				AbstractBuildingType abstractBuildingType = (AbstractBuildingType)theEObject;
				T result = caseAbstractBuildingType(abstractBuildingType);
				if (result == null) result = caseAbstractSiteType(abstractBuildingType);
				if (result == null) result = caseAbstractCityObjectType(abstractBuildingType);
				if (result == null) result = caseAbstractFeatureType(abstractBuildingType);
				if (result == null) result = caseAbstractGMLType(abstractBuildingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ABSTRACT_OPENING_TYPE: {
				AbstractOpeningType abstractOpeningType = (AbstractOpeningType)theEObject;
				T result = caseAbstractOpeningType(abstractOpeningType);
				if (result == null) result = caseAbstractCityObjectType(abstractOpeningType);
				if (result == null) result = caseAbstractFeatureType(abstractOpeningType);
				if (result == null) result = caseAbstractGMLType(abstractOpeningType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BOUNDARY_SURFACE_PROPERTY_TYPE: {
				BoundarySurfacePropertyType boundarySurfacePropertyType = (BoundarySurfacePropertyType)theEObject;
				T result = caseBoundarySurfacePropertyType(boundarySurfacePropertyType);
				if (result == null) result = caseAssociationType(boundarySurfacePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BUILDING_FURNITURE_TYPE: {
				BuildingFurnitureType buildingFurnitureType = (BuildingFurnitureType)theEObject;
				T result = caseBuildingFurnitureType(buildingFurnitureType);
				if (result == null) result = caseAbstractCityObjectType(buildingFurnitureType);
				if (result == null) result = caseAbstractFeatureType(buildingFurnitureType);
				if (result == null) result = caseAbstractGMLType(buildingFurnitureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BUILDING_INSTALLATION_PROPERTY_TYPE: {
				BuildingInstallationPropertyType buildingInstallationPropertyType = (BuildingInstallationPropertyType)theEObject;
				T result = caseBuildingInstallationPropertyType(buildingInstallationPropertyType);
				if (result == null) result = caseAssociationType(buildingInstallationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BUILDING_INSTALLATION_TYPE: {
				BuildingInstallationType buildingInstallationType = (BuildingInstallationType)theEObject;
				T result = caseBuildingInstallationType(buildingInstallationType);
				if (result == null) result = caseAbstractCityObjectType(buildingInstallationType);
				if (result == null) result = caseAbstractFeatureType(buildingInstallationType);
				if (result == null) result = caseAbstractGMLType(buildingInstallationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BUILDING_PART_PROPERTY_TYPE: {
				BuildingPartPropertyType buildingPartPropertyType = (BuildingPartPropertyType)theEObject;
				T result = caseBuildingPartPropertyType(buildingPartPropertyType);
				if (result == null) result = caseAssociationType(buildingPartPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BUILDING_PART_TYPE: {
				BuildingPartType buildingPartType = (BuildingPartType)theEObject;
				T result = caseBuildingPartType(buildingPartType);
				if (result == null) result = caseAbstractBuildingType(buildingPartType);
				if (result == null) result = caseAbstractSiteType(buildingPartType);
				if (result == null) result = caseAbstractCityObjectType(buildingPartType);
				if (result == null) result = caseAbstractFeatureType(buildingPartType);
				if (result == null) result = caseAbstractGMLType(buildingPartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.BUILDING_TYPE: {
				BuildingType buildingType = (BuildingType)theEObject;
				T result = caseBuildingType(buildingType);
				if (result == null) result = caseAbstractBuildingType(buildingType);
				if (result == null) result = caseAbstractSiteType(buildingType);
				if (result == null) result = caseAbstractCityObjectType(buildingType);
				if (result == null) result = caseAbstractFeatureType(buildingType);
				if (result == null) result = caseAbstractGMLType(buildingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.CEILING_SURFACE_TYPE: {
				CeilingSurfaceType ceilingSurfaceType = (CeilingSurfaceType)theEObject;
				T result = caseCeilingSurfaceType(ceilingSurfaceType);
				if (result == null) result = caseAbstractBoundarySurfaceType(ceilingSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(ceilingSurfaceType);
				if (result == null) result = caseAbstractFeatureType(ceilingSurfaceType);
				if (result == null) result = caseAbstractGMLType(ceilingSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.CLOSURE_SURFACE_TYPE: {
				ClosureSurfaceType closureSurfaceType = (ClosureSurfaceType)theEObject;
				T result = caseClosureSurfaceType(closureSurfaceType);
				if (result == null) result = caseAbstractBoundarySurfaceType(closureSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(closureSurfaceType);
				if (result == null) result = caseAbstractFeatureType(closureSurfaceType);
				if (result == null) result = caseAbstractGMLType(closureSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.DOOR_TYPE: {
				DoorType doorType = (DoorType)theEObject;
				T result = caseDoorType(doorType);
				if (result == null) result = caseAbstractOpeningType(doorType);
				if (result == null) result = caseAbstractCityObjectType(doorType);
				if (result == null) result = caseAbstractFeatureType(doorType);
				if (result == null) result = caseAbstractGMLType(doorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.FLOOR_SURFACE_TYPE: {
				FloorSurfaceType floorSurfaceType = (FloorSurfaceType)theEObject;
				T result = caseFloorSurfaceType(floorSurfaceType);
				if (result == null) result = caseAbstractBoundarySurfaceType(floorSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(floorSurfaceType);
				if (result == null) result = caseAbstractFeatureType(floorSurfaceType);
				if (result == null) result = caseAbstractGMLType(floorSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.GROUND_SURFACE_TYPE: {
				GroundSurfaceType groundSurfaceType = (GroundSurfaceType)theEObject;
				T result = caseGroundSurfaceType(groundSurfaceType);
				if (result == null) result = caseAbstractBoundarySurfaceType(groundSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(groundSurfaceType);
				if (result == null) result = caseAbstractFeatureType(groundSurfaceType);
				if (result == null) result = caseAbstractGMLType(groundSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.INT_BUILDING_INSTALLATION_PROPERTY_TYPE: {
				IntBuildingInstallationPropertyType intBuildingInstallationPropertyType = (IntBuildingInstallationPropertyType)theEObject;
				T result = caseIntBuildingInstallationPropertyType(intBuildingInstallationPropertyType);
				if (result == null) result = caseAssociationType(intBuildingInstallationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE: {
				IntBuildingInstallationType intBuildingInstallationType = (IntBuildingInstallationType)theEObject;
				T result = caseIntBuildingInstallationType(intBuildingInstallationType);
				if (result == null) result = caseAbstractCityObjectType(intBuildingInstallationType);
				if (result == null) result = caseAbstractFeatureType(intBuildingInstallationType);
				if (result == null) result = caseAbstractGMLType(intBuildingInstallationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE: {
				InteriorFurniturePropertyType interiorFurniturePropertyType = (InteriorFurniturePropertyType)theEObject;
				T result = caseInteriorFurniturePropertyType(interiorFurniturePropertyType);
				if (result == null) result = caseAssociationType(interiorFurniturePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.INTERIOR_ROOM_PROPERTY_TYPE: {
				InteriorRoomPropertyType interiorRoomPropertyType = (InteriorRoomPropertyType)theEObject;
				T result = caseInteriorRoomPropertyType(interiorRoomPropertyType);
				if (result == null) result = caseAssociationType(interiorRoomPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.INTERIOR_WALL_SURFACE_TYPE: {
				InteriorWallSurfaceType interiorWallSurfaceType = (InteriorWallSurfaceType)theEObject;
				T result = caseInteriorWallSurfaceType(interiorWallSurfaceType);
				if (result == null) result = caseAbstractBoundarySurfaceType(interiorWallSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(interiorWallSurfaceType);
				if (result == null) result = caseAbstractFeatureType(interiorWallSurfaceType);
				if (result == null) result = caseAbstractGMLType(interiorWallSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.OPENING_PROPERTY_TYPE: {
				OpeningPropertyType openingPropertyType = (OpeningPropertyType)theEObject;
				T result = caseOpeningPropertyType(openingPropertyType);
				if (result == null) result = caseAssociationType(openingPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ROOF_SURFACE_TYPE: {
				RoofSurfaceType roofSurfaceType = (RoofSurfaceType)theEObject;
				T result = caseRoofSurfaceType(roofSurfaceType);
				if (result == null) result = caseAbstractBoundarySurfaceType(roofSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(roofSurfaceType);
				if (result == null) result = caseAbstractFeatureType(roofSurfaceType);
				if (result == null) result = caseAbstractGMLType(roofSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				T result = caseRoomType(roomType);
				if (result == null) result = caseAbstractCityObjectType(roomType);
				if (result == null) result = caseAbstractFeatureType(roomType);
				if (result == null) result = caseAbstractGMLType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.WALL_SURFACE_TYPE: {
				WallSurfaceType wallSurfaceType = (WallSurfaceType)theEObject;
				T result = caseWallSurfaceType(wallSurfaceType);
				if (result == null) result = caseAbstractBoundarySurfaceType(wallSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(wallSurfaceType);
				if (result == null) result = caseAbstractFeatureType(wallSurfaceType);
				if (result == null) result = caseAbstractGMLType(wallSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuildingPackage.WINDOW_TYPE: {
				WindowType windowType = (WindowType)theEObject;
				T result = caseWindowType(windowType);
				if (result == null) result = caseAbstractOpeningType(windowType);
				if (result == null) result = caseAbstractCityObjectType(windowType);
				if (result == null) result = caseAbstractFeatureType(windowType);
				if (result == null) result = caseAbstractGMLType(windowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Boundary Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Boundary Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBoundarySurfaceType(AbstractBoundarySurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Building Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Building Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBuildingType(AbstractBuildingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Opening Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Opening Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOpeningType(AbstractOpeningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Surface Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Surface Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundarySurfacePropertyType(BoundarySurfacePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Furniture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Furniture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingFurnitureType(BuildingFurnitureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingInstallationPropertyType(BuildingInstallationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingInstallationType(BuildingInstallationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingPartPropertyType(BuildingPartPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingPartType(BuildingPartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingType(BuildingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ceiling Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ceiling Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCeilingSurfaceType(CeilingSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closure Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closure Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosureSurfaceType(ClosureSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorType(DoorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloorSurfaceType(FloorSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundSurfaceType(GroundSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Building Installation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Building Installation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntBuildingInstallationPropertyType(IntBuildingInstallationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Building Installation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Building Installation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntBuildingInstallationType(IntBuildingInstallationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interior Furniture Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interior Furniture Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteriorFurniturePropertyType(InteriorFurniturePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interior Room Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interior Room Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteriorRoomPropertyType(InteriorRoomPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interior Wall Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interior Wall Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteriorWallSurfaceType(InteriorWallSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opening Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opening Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpeningPropertyType(OpeningPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roof Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roof Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoofSurfaceType(RoofSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wall Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wall Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWallSurfaceType(WallSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Window Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Window Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowType(WindowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGMLType(AbstractGMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureType(AbstractFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract City Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract City Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCityObjectType(AbstractCityObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Site Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Site Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSiteType(AbstractSiteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationType(AssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BuildingSwitch
