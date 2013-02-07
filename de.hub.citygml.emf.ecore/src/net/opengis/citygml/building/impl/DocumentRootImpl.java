/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.AbstractBoundarySurfaceType;
import net.opengis.citygml.building.AbstractBuildingType;
import net.opengis.citygml.building.AbstractOpeningType;
import net.opengis.citygml.building.BuildingFurnitureType;
import net.opengis.citygml.building.BuildingInstallationType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.BuildingPartType;
import net.opengis.citygml.building.BuildingType;
import net.opengis.citygml.building.CeilingSurfaceType;
import net.opengis.citygml.building.ClosureSurfaceType;
import net.opengis.citygml.building.DocumentRoot;
import net.opengis.citygml.building.DoorType;
import net.opengis.citygml.building.FloorSurfaceType;
import net.opengis.citygml.building.GroundSurfaceType;
import net.opengis.citygml.building.IntBuildingInstallationType;
import net.opengis.citygml.building.InteriorWallSurfaceType;
import net.opengis.citygml.building.RoofSurfaceType;
import net.opengis.citygml.building.RoomType;
import net.opengis.citygml.building.WallSurfaceType;
import net.opengis.citygml.building.WindowType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getAbstractBuilding <em>Abstract Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getBoundarySurface <em>Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfAbstractBuilding <em>Generic Application Property Of Abstract Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfBoundarySurface <em>Generic Application Property Of Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfBuilding <em>Generic Application Property Of Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfBuildingFurniture <em>Generic Application Property Of Building Furniture</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfBuildingInstallation <em>Generic Application Property Of Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfBuildingPart <em>Generic Application Property Of Building Part</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfCeilingSurface <em>Generic Application Property Of Ceiling Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfClosureSurface <em>Generic Application Property Of Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfDoor <em>Generic Application Property Of Door</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfFloorSurface <em>Generic Application Property Of Floor Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfGroundSurface <em>Generic Application Property Of Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfIntBuildingInstallation <em>Generic Application Property Of Int Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfInteriorWallSurface <em>Generic Application Property Of Interior Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfOpening <em>Generic Application Property Of Opening</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfRoofSurface <em>Generic Application Property Of Roof Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfRoom <em>Generic Application Property Of Room</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfWallSurface <em>Generic Application Property Of Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGenericApplicationPropertyOfWindow <em>Generic Application Property Of Window</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getOpening <em>Opening</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getBuilding <em>Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getBuildingFurniture <em>Building Furniture</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getBuildingInstallation <em>Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getBuildingPart <em>Building Part</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getCeilingSurface <em>Ceiling Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getClosureSurface <em>Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getDoor <em>Door</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getFloorSurface <em>Floor Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getGroundSurface <em>Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getIntBuildingInstallation <em>Int Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getInteriorWallSurface <em>Interior Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getRoofSurface <em>Roof Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getWallSurface <em>Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.DocumentRootImpl#getWindow <em>Window</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BuildingPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BuildingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BuildingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBuildingType getAbstractBuilding() {
		return (AbstractBuildingType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__ABSTRACT_BUILDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractBuilding(AbstractBuildingType newAbstractBuilding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__ABSTRACT_BUILDING, newAbstractBuilding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBoundarySurfaceType getBoundarySurface() {
		return (AbstractBoundarySurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__BOUNDARY_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundarySurface(AbstractBoundarySurfaceType newBoundarySurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__BOUNDARY_SURFACE, newBoundarySurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfAbstractBuilding() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfAbstractBuilding(EObject newGenericApplicationPropertyOfAbstractBuilding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING, newGenericApplicationPropertyOfAbstractBuilding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfBoundarySurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfBoundarySurface(EObject newGenericApplicationPropertyOfBoundarySurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE, newGenericApplicationPropertyOfBoundarySurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfBuilding() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfBuilding(EObject newGenericApplicationPropertyOfBuilding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING, newGenericApplicationPropertyOfBuilding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfBuildingFurniture() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfBuildingFurniture(EObject newGenericApplicationPropertyOfBuildingFurniture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE, newGenericApplicationPropertyOfBuildingFurniture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfBuildingInstallation() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfBuildingInstallation(EObject newGenericApplicationPropertyOfBuildingInstallation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION, newGenericApplicationPropertyOfBuildingInstallation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfBuildingPart() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfBuildingPart(EObject newGenericApplicationPropertyOfBuildingPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART, newGenericApplicationPropertyOfBuildingPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfCeilingSurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfCeilingSurface(EObject newGenericApplicationPropertyOfCeilingSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE, newGenericApplicationPropertyOfCeilingSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfClosureSurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfClosureSurface(EObject newGenericApplicationPropertyOfClosureSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE, newGenericApplicationPropertyOfClosureSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfDoor() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfDoor(EObject newGenericApplicationPropertyOfDoor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR, newGenericApplicationPropertyOfDoor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfFloorSurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfFloorSurface(EObject newGenericApplicationPropertyOfFloorSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE, newGenericApplicationPropertyOfFloorSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfGroundSurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfGroundSurface(EObject newGenericApplicationPropertyOfGroundSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE, newGenericApplicationPropertyOfGroundSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfIntBuildingInstallation() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfIntBuildingInstallation(EObject newGenericApplicationPropertyOfIntBuildingInstallation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION, newGenericApplicationPropertyOfIntBuildingInstallation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfInteriorWallSurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfInteriorWallSurface(EObject newGenericApplicationPropertyOfInteriorWallSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE, newGenericApplicationPropertyOfInteriorWallSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfOpening() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfOpening(EObject newGenericApplicationPropertyOfOpening, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING, newGenericApplicationPropertyOfOpening, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfRoofSurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfRoofSurface(EObject newGenericApplicationPropertyOfRoofSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE, newGenericApplicationPropertyOfRoofSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfRoom() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfRoom(EObject newGenericApplicationPropertyOfRoom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM, newGenericApplicationPropertyOfRoom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWallSurface() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWallSurface(EObject newGenericApplicationPropertyOfWallSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE, newGenericApplicationPropertyOfWallSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWindow() {
		return (EObject)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWindow(EObject newGenericApplicationPropertyOfWindow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW, newGenericApplicationPropertyOfWindow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOpeningType getOpening() {
		return (AbstractOpeningType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__OPENING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpening(AbstractOpeningType newOpening, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__OPENING, newOpening, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingType getBuilding() {
		return (BuildingType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuilding(BuildingType newBuilding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING, newBuilding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuilding(BuildingType newBuilding) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING, newBuilding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingFurnitureType getBuildingFurniture() {
		return (BuildingFurnitureType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildingFurniture(BuildingFurnitureType newBuildingFurniture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE, newBuildingFurniture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingFurniture(BuildingFurnitureType newBuildingFurniture) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE, newBuildingFurniture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingInstallationType getBuildingInstallation() {
		return (BuildingInstallationType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildingInstallation(BuildingInstallationType newBuildingInstallation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION, newBuildingInstallation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingInstallation(BuildingInstallationType newBuildingInstallation) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION, newBuildingInstallation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingPartType getBuildingPart() {
		return (BuildingPartType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildingPart(BuildingPartType newBuildingPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART, newBuildingPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingPart(BuildingPartType newBuildingPart) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART, newBuildingPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeilingSurfaceType getCeilingSurface() {
		return (CeilingSurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCeilingSurface(CeilingSurfaceType newCeilingSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE, newCeilingSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCeilingSurface(CeilingSurfaceType newCeilingSurface) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE, newCeilingSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureSurfaceType getClosureSurface() {
		return (ClosureSurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosureSurface(ClosureSurfaceType newClosureSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE, newClosureSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosureSurface(ClosureSurfaceType newClosureSurface) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE, newClosureSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorType getDoor() {
		return (DoorType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor(DoorType newDoor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR, newDoor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(DoorType newDoor) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR, newDoor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloorSurfaceType getFloorSurface() {
		return (FloorSurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloorSurface(FloorSurfaceType newFloorSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE, newFloorSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloorSurface(FloorSurfaceType newFloorSurface) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE, newFloorSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundSurfaceType getGroundSurface() {
		return (GroundSurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundSurface(GroundSurfaceType newGroundSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE, newGroundSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundSurface(GroundSurfaceType newGroundSurface) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE, newGroundSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntBuildingInstallationType getIntBuildingInstallation() {
		return (IntBuildingInstallationType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntBuildingInstallation(IntBuildingInstallationType newIntBuildingInstallation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION, newIntBuildingInstallation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntBuildingInstallation(IntBuildingInstallationType newIntBuildingInstallation) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION, newIntBuildingInstallation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteriorWallSurfaceType getInteriorWallSurface() {
		return (InteriorWallSurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteriorWallSurface(InteriorWallSurfaceType newInteriorWallSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE, newInteriorWallSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteriorWallSurface(InteriorWallSurfaceType newInteriorWallSurface) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE, newInteriorWallSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoofSurfaceType getRoofSurface() {
		return (RoofSurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoofSurface(RoofSurfaceType newRoofSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE, newRoofSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoofSurface(RoofSurfaceType newRoofSurface) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE, newRoofSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoom() {
		return (RoomType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(RoomType newRoom, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM, newRoom, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(RoomType newRoom) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM, newRoom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WallSurfaceType getWallSurface() {
		return (WallSurfaceType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWallSurface(WallSurfaceType newWallSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE, newWallSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallSurface(WallSurfaceType newWallSurface) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE, newWallSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowType getWindow() {
		return (WindowType)getMixed().get(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindow(WindowType newWindow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW, newWindow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow(WindowType newWindow) {
		((FeatureMap.Internal)getMixed()).set(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW, newWindow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BuildingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BuildingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BuildingPackage.DOCUMENT_ROOT__ABSTRACT_BUILDING:
				return basicSetAbstractBuilding(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__BOUNDARY_SURFACE:
				return basicSetBoundarySurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING:
				return basicSetGenericApplicationPropertyOfAbstractBuilding(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE:
				return basicSetGenericApplicationPropertyOfBoundarySurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING:
				return basicSetGenericApplicationPropertyOfBuilding(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE:
				return basicSetGenericApplicationPropertyOfBuildingFurniture(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION:
				return basicSetGenericApplicationPropertyOfBuildingInstallation(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART:
				return basicSetGenericApplicationPropertyOfBuildingPart(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE:
				return basicSetGenericApplicationPropertyOfCeilingSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE:
				return basicSetGenericApplicationPropertyOfClosureSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR:
				return basicSetGenericApplicationPropertyOfDoor(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE:
				return basicSetGenericApplicationPropertyOfFloorSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE:
				return basicSetGenericApplicationPropertyOfGroundSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION:
				return basicSetGenericApplicationPropertyOfIntBuildingInstallation(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE:
				return basicSetGenericApplicationPropertyOfInteriorWallSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING:
				return basicSetGenericApplicationPropertyOfOpening(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE:
				return basicSetGenericApplicationPropertyOfRoofSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM:
				return basicSetGenericApplicationPropertyOfRoom(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE:
				return basicSetGenericApplicationPropertyOfWallSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW:
				return basicSetGenericApplicationPropertyOfWindow(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__OPENING:
				return basicSetOpening(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__BUILDING:
				return basicSetBuilding(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_FURNITURE:
				return basicSetBuildingFurniture(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_INSTALLATION:
				return basicSetBuildingInstallation(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_PART:
				return basicSetBuildingPart(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__CEILING_SURFACE:
				return basicSetCeilingSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__CLOSURE_SURFACE:
				return basicSetClosureSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__DOOR:
				return basicSetDoor(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__FLOOR_SURFACE:
				return basicSetFloorSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__GROUND_SURFACE:
				return basicSetGroundSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION:
				return basicSetIntBuildingInstallation(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE:
				return basicSetInteriorWallSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__ROOF_SURFACE:
				return basicSetRoofSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__ROOM:
				return basicSetRoom(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__WALL_SURFACE:
				return basicSetWallSurface(null, msgs);
			case BuildingPackage.DOCUMENT_ROOT__WINDOW:
				return basicSetWindow(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildingPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BuildingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BuildingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BuildingPackage.DOCUMENT_ROOT__ABSTRACT_BUILDING:
				return getAbstractBuilding();
			case BuildingPackage.DOCUMENT_ROOT__BOUNDARY_SURFACE:
				return getBoundarySurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING:
				return getGenericApplicationPropertyOfAbstractBuilding();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE:
				return getGenericApplicationPropertyOfBoundarySurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING:
				return getGenericApplicationPropertyOfBuilding();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE:
				return getGenericApplicationPropertyOfBuildingFurniture();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION:
				return getGenericApplicationPropertyOfBuildingInstallation();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART:
				return getGenericApplicationPropertyOfBuildingPart();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE:
				return getGenericApplicationPropertyOfCeilingSurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE:
				return getGenericApplicationPropertyOfClosureSurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR:
				return getGenericApplicationPropertyOfDoor();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE:
				return getGenericApplicationPropertyOfFloorSurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE:
				return getGenericApplicationPropertyOfGroundSurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION:
				return getGenericApplicationPropertyOfIntBuildingInstallation();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE:
				return getGenericApplicationPropertyOfInteriorWallSurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING:
				return getGenericApplicationPropertyOfOpening();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE:
				return getGenericApplicationPropertyOfRoofSurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM:
				return getGenericApplicationPropertyOfRoom();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE:
				return getGenericApplicationPropertyOfWallSurface();
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW:
				return getGenericApplicationPropertyOfWindow();
			case BuildingPackage.DOCUMENT_ROOT__OPENING:
				return getOpening();
			case BuildingPackage.DOCUMENT_ROOT__BUILDING:
				return getBuilding();
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_FURNITURE:
				return getBuildingFurniture();
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_INSTALLATION:
				return getBuildingInstallation();
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_PART:
				return getBuildingPart();
			case BuildingPackage.DOCUMENT_ROOT__CEILING_SURFACE:
				return getCeilingSurface();
			case BuildingPackage.DOCUMENT_ROOT__CLOSURE_SURFACE:
				return getClosureSurface();
			case BuildingPackage.DOCUMENT_ROOT__DOOR:
				return getDoor();
			case BuildingPackage.DOCUMENT_ROOT__FLOOR_SURFACE:
				return getFloorSurface();
			case BuildingPackage.DOCUMENT_ROOT__GROUND_SURFACE:
				return getGroundSurface();
			case BuildingPackage.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION:
				return getIntBuildingInstallation();
			case BuildingPackage.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE:
				return getInteriorWallSurface();
			case BuildingPackage.DOCUMENT_ROOT__ROOF_SURFACE:
				return getRoofSurface();
			case BuildingPackage.DOCUMENT_ROOT__ROOM:
				return getRoom();
			case BuildingPackage.DOCUMENT_ROOT__WALL_SURFACE:
				return getWallSurface();
			case BuildingPackage.DOCUMENT_ROOT__WINDOW:
				return getWindow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuildingPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING:
				setBuilding((BuildingType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_FURNITURE:
				setBuildingFurniture((BuildingFurnitureType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_INSTALLATION:
				setBuildingInstallation((BuildingInstallationType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_PART:
				setBuildingPart((BuildingPartType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__CEILING_SURFACE:
				setCeilingSurface((CeilingSurfaceType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__CLOSURE_SURFACE:
				setClosureSurface((ClosureSurfaceType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__DOOR:
				setDoor((DoorType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__FLOOR_SURFACE:
				setFloorSurface((FloorSurfaceType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__GROUND_SURFACE:
				setGroundSurface((GroundSurfaceType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION:
				setIntBuildingInstallation((IntBuildingInstallationType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE:
				setInteriorWallSurface((InteriorWallSurfaceType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__ROOF_SURFACE:
				setRoofSurface((RoofSurfaceType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__ROOM:
				setRoom((RoomType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__WALL_SURFACE:
				setWallSurface((WallSurfaceType)newValue);
				return;
			case BuildingPackage.DOCUMENT_ROOT__WINDOW:
				setWindow((WindowType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuildingPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case BuildingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BuildingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING:
				setBuilding((BuildingType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_FURNITURE:
				setBuildingFurniture((BuildingFurnitureType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_INSTALLATION:
				setBuildingInstallation((BuildingInstallationType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_PART:
				setBuildingPart((BuildingPartType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__CEILING_SURFACE:
				setCeilingSurface((CeilingSurfaceType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__CLOSURE_SURFACE:
				setClosureSurface((ClosureSurfaceType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__DOOR:
				setDoor((DoorType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__FLOOR_SURFACE:
				setFloorSurface((FloorSurfaceType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__GROUND_SURFACE:
				setGroundSurface((GroundSurfaceType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION:
				setIntBuildingInstallation((IntBuildingInstallationType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE:
				setInteriorWallSurface((InteriorWallSurfaceType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__ROOF_SURFACE:
				setRoofSurface((RoofSurfaceType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__ROOM:
				setRoom((RoomType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__WALL_SURFACE:
				setWallSurface((WallSurfaceType)null);
				return;
			case BuildingPackage.DOCUMENT_ROOT__WINDOW:
				setWindow((WindowType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuildingPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BuildingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BuildingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BuildingPackage.DOCUMENT_ROOT__ABSTRACT_BUILDING:
				return getAbstractBuilding() != null;
			case BuildingPackage.DOCUMENT_ROOT__BOUNDARY_SURFACE:
				return getBoundarySurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING:
				return getGenericApplicationPropertyOfAbstractBuilding() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE:
				return getGenericApplicationPropertyOfBoundarySurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING:
				return getGenericApplicationPropertyOfBuilding() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE:
				return getGenericApplicationPropertyOfBuildingFurniture() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION:
				return getGenericApplicationPropertyOfBuildingInstallation() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART:
				return getGenericApplicationPropertyOfBuildingPart() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE:
				return getGenericApplicationPropertyOfCeilingSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE:
				return getGenericApplicationPropertyOfClosureSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR:
				return getGenericApplicationPropertyOfDoor() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE:
				return getGenericApplicationPropertyOfFloorSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE:
				return getGenericApplicationPropertyOfGroundSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION:
				return getGenericApplicationPropertyOfIntBuildingInstallation() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE:
				return getGenericApplicationPropertyOfInteriorWallSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING:
				return getGenericApplicationPropertyOfOpening() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE:
				return getGenericApplicationPropertyOfRoofSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM:
				return getGenericApplicationPropertyOfRoom() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE:
				return getGenericApplicationPropertyOfWallSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW:
				return getGenericApplicationPropertyOfWindow() != null;
			case BuildingPackage.DOCUMENT_ROOT__OPENING:
				return getOpening() != null;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING:
				return getBuilding() != null;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_FURNITURE:
				return getBuildingFurniture() != null;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_INSTALLATION:
				return getBuildingInstallation() != null;
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_PART:
				return getBuildingPart() != null;
			case BuildingPackage.DOCUMENT_ROOT__CEILING_SURFACE:
				return getCeilingSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__CLOSURE_SURFACE:
				return getClosureSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__DOOR:
				return getDoor() != null;
			case BuildingPackage.DOCUMENT_ROOT__FLOOR_SURFACE:
				return getFloorSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__GROUND_SURFACE:
				return getGroundSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION:
				return getIntBuildingInstallation() != null;
			case BuildingPackage.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE:
				return getInteriorWallSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__ROOF_SURFACE:
				return getRoofSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__ROOM:
				return getRoom() != null;
			case BuildingPackage.DOCUMENT_ROOT__WALL_SURFACE:
				return getWallSurface() != null;
			case BuildingPackage.DOCUMENT_ROOT__WINDOW:
				return getWindow() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
