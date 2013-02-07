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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.building.BuildingPackage
 * @generated
 */
public class BuildingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BuildingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BuildingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingSwitch<Adapter> modelSwitch =
		new BuildingSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractBoundarySurfaceType(AbstractBoundarySurfaceType object) {
				return createAbstractBoundarySurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractBuildingType(AbstractBuildingType object) {
				return createAbstractBuildingTypeAdapter();
			}
			@Override
			public Adapter caseAbstractOpeningType(AbstractOpeningType object) {
				return createAbstractOpeningTypeAdapter();
			}
			@Override
			public Adapter caseBoundarySurfacePropertyType(BoundarySurfacePropertyType object) {
				return createBoundarySurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseBuildingFurnitureType(BuildingFurnitureType object) {
				return createBuildingFurnitureTypeAdapter();
			}
			@Override
			public Adapter caseBuildingInstallationPropertyType(BuildingInstallationPropertyType object) {
				return createBuildingInstallationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBuildingInstallationType(BuildingInstallationType object) {
				return createBuildingInstallationTypeAdapter();
			}
			@Override
			public Adapter caseBuildingPartPropertyType(BuildingPartPropertyType object) {
				return createBuildingPartPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBuildingPartType(BuildingPartType object) {
				return createBuildingPartTypeAdapter();
			}
			@Override
			public Adapter caseBuildingType(BuildingType object) {
				return createBuildingTypeAdapter();
			}
			@Override
			public Adapter caseCeilingSurfaceType(CeilingSurfaceType object) {
				return createCeilingSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseClosureSurfaceType(ClosureSurfaceType object) {
				return createClosureSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoorType(DoorType object) {
				return createDoorTypeAdapter();
			}
			@Override
			public Adapter caseFloorSurfaceType(FloorSurfaceType object) {
				return createFloorSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseGroundSurfaceType(GroundSurfaceType object) {
				return createGroundSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseIntBuildingInstallationPropertyType(IntBuildingInstallationPropertyType object) {
				return createIntBuildingInstallationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseIntBuildingInstallationType(IntBuildingInstallationType object) {
				return createIntBuildingInstallationTypeAdapter();
			}
			@Override
			public Adapter caseInteriorFurniturePropertyType(InteriorFurniturePropertyType object) {
				return createInteriorFurniturePropertyTypeAdapter();
			}
			@Override
			public Adapter caseInteriorRoomPropertyType(InteriorRoomPropertyType object) {
				return createInteriorRoomPropertyTypeAdapter();
			}
			@Override
			public Adapter caseInteriorWallSurfaceType(InteriorWallSurfaceType object) {
				return createInteriorWallSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseOpeningPropertyType(OpeningPropertyType object) {
				return createOpeningPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRoofSurfaceType(RoofSurfaceType object) {
				return createRoofSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			@Override
			public Adapter caseWallSurfaceType(WallSurfaceType object) {
				return createWallSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseWindowType(WindowType object) {
				return createWindowTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureType(AbstractFeatureType object) {
				return createAbstractFeatureTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCityObjectType(AbstractCityObjectType object) {
				return createAbstractCityObjectTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSiteType(AbstractSiteType object) {
				return createAbstractSiteTypeAdapter();
			}
			@Override
			public Adapter caseAssociationType(AssociationType object) {
				return createAssociationTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType <em>Abstract Boundary Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType
	 * @generated
	 */
	public Adapter createAbstractBoundarySurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.AbstractBuildingType <em>Abstract Building Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.AbstractBuildingType
	 * @generated
	 */
	public Adapter createAbstractBuildingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.AbstractOpeningType <em>Abstract Opening Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.AbstractOpeningType
	 * @generated
	 */
	public Adapter createAbstractOpeningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.BoundarySurfacePropertyType <em>Boundary Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.BoundarySurfacePropertyType
	 * @generated
	 */
	public Adapter createBoundarySurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.BuildingFurnitureType <em>Furniture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.BuildingFurnitureType
	 * @generated
	 */
	public Adapter createBuildingFurnitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.BuildingInstallationPropertyType <em>Installation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.BuildingInstallationPropertyType
	 * @generated
	 */
	public Adapter createBuildingInstallationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.BuildingInstallationType <em>Installation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.BuildingInstallationType
	 * @generated
	 */
	public Adapter createBuildingInstallationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.BuildingPartPropertyType <em>Part Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.BuildingPartPropertyType
	 * @generated
	 */
	public Adapter createBuildingPartPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.BuildingPartType <em>Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.BuildingPartType
	 * @generated
	 */
	public Adapter createBuildingPartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.BuildingType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.BuildingType
	 * @generated
	 */
	public Adapter createBuildingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.CeilingSurfaceType <em>Ceiling Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.CeilingSurfaceType
	 * @generated
	 */
	public Adapter createCeilingSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.ClosureSurfaceType <em>Closure Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.ClosureSurfaceType
	 * @generated
	 */
	public Adapter createClosureSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.DoorType <em>Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.DoorType
	 * @generated
	 */
	public Adapter createDoorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.FloorSurfaceType <em>Floor Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.FloorSurfaceType
	 * @generated
	 */
	public Adapter createFloorSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.GroundSurfaceType <em>Ground Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.GroundSurfaceType
	 * @generated
	 */
	public Adapter createGroundSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.IntBuildingInstallationPropertyType <em>Int Building Installation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.IntBuildingInstallationPropertyType
	 * @generated
	 */
	public Adapter createIntBuildingInstallationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.IntBuildingInstallationType <em>Int Building Installation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType
	 * @generated
	 */
	public Adapter createIntBuildingInstallationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.InteriorFurniturePropertyType <em>Interior Furniture Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.InteriorFurniturePropertyType
	 * @generated
	 */
	public Adapter createInteriorFurniturePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.InteriorRoomPropertyType <em>Interior Room Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.InteriorRoomPropertyType
	 * @generated
	 */
	public Adapter createInteriorRoomPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.InteriorWallSurfaceType <em>Interior Wall Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.InteriorWallSurfaceType
	 * @generated
	 */
	public Adapter createInteriorWallSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.OpeningPropertyType <em>Opening Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.OpeningPropertyType
	 * @generated
	 */
	public Adapter createOpeningPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.RoofSurfaceType <em>Roof Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.RoofSurfaceType
	 * @generated
	 */
	public Adapter createRoofSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.WallSurfaceType <em>Wall Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.WallSurfaceType
	 * @generated
	 */
	public Adapter createWallSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.building.WindowType <em>Window Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.building.WindowType
	 * @generated
	 */
	public Adapter createWindowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGMLType <em>Abstract GML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGMLType
	 * @generated
	 */
	public Adapter createAbstractGMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractFeatureType <em>Abstract Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractFeatureType
	 * @generated
	 */
	public Adapter createAbstractFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.AbstractCityObjectType <em>Abstract City Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.AbstractCityObjectType
	 * @generated
	 */
	public Adapter createAbstractCityObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.AbstractSiteType <em>Abstract Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.AbstractSiteType
	 * @generated
	 */
	public Adapter createAbstractSiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AssociationType
	 * @generated
	 */
	public Adapter createAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BuildingAdapterFactory
