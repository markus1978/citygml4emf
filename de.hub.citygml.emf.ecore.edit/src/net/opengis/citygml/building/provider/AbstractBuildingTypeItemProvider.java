/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.CitygmlFactory;

import net.opengis.citygml.building.AbstractBuildingType;
import net.opengis.citygml.building.BuildingFactory;
import net.opengis.citygml.building.BuildingPackage;

import net.opengis.citygml.provider.AbstractSiteTypeItemProvider;

import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.citygml.building.AbstractBuildingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractBuildingTypeItemProvider
	extends AbstractSiteTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBuildingTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addClassPropertyDescriptor(object);
			addFunctionPropertyDescriptor(object);
			addUsagePropertyDescriptor(object);
			addYearOfConstructionPropertyDescriptor(object);
			addYearOfDemolitionPropertyDescriptor(object);
			addRoofTypePropertyDescriptor(object);
			addStoreysAboveGroundPropertyDescriptor(object);
			addStoreysBelowGroundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_class_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_function_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__FUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_usage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_usage_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__USAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Year Of Construction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearOfConstructionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_yearOfConstruction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_yearOfConstruction_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Year Of Demolition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYearOfDemolitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_yearOfDemolition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_yearOfDemolition_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Roof Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoofTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_roofType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_roofType_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__ROOF_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storeys Above Ground feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoreysAboveGroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_storeysAboveGround_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_storeysAboveGround_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storeys Below Ground feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoreysBelowGroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractBuildingType_storeysBelowGround_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractBuildingType_storeysBelowGround_feature", "_UI_AbstractBuildingType_type"),
				 BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_SOLID);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_SOLID);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_SOLID);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_SOLID);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__ADDRESS);
			childrenFeatures.add(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractBuildingType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractBuildingType_type") :
			getString("_UI_AbstractBuildingType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractBuildingType.class)) {
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CLASS:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__FUNCTION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__USAGE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ROOF_TYPE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ADDRESS:
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT,
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND,
				 GmlFactory.eINSTANCE.createMeasureOrNullListType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND,
				 GmlFactory.eINSTANCE.createQuantityExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND,
				 GmlFactory.eINSTANCE.createMeasureOrNullListType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND,
				 GmlFactory.eINSTANCE.createQuantityExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_SOLID,
				 GmlFactory.eINSTANCE.createSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_SOLID,
				 GmlFactory.eINSTANCE.createSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION,
				 BuildingFactory.eINSTANCE.createBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION,
				 BuildingFactory.eINSTANCE.createIntBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1,
				 BuildingFactory.eINSTANCE.createBoundarySurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_SOLID,
				 GmlFactory.eINSTANCE.createSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_SOLID,
				 GmlFactory.eINSTANCE.createSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM,
				 BuildingFactory.eINSTANCE.createInteriorRoomPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART,
				 BuildingFactory.eINSTANCE.createBuildingPartPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__ADDRESS,
				 CitygmlFactory.eINSTANCE.createAddressPropertyType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == GmlPackage.eINSTANCE.getAbstractGMLType_Name() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CsName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DatumName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GroupName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeridianName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsName() ||
			childFeature == GmlPackage.eINSTANCE.getAbstractFeatureType_Location() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation() ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_SOLID ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_SOLID ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_SOLID ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_SOLID ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE ||
			childFeature == BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CityGMLEditPlugin.INSTANCE;
	}

}
