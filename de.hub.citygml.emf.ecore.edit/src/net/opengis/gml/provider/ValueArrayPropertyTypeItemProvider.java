/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.CitygmlFactory;
import net.opengis.citygml.CitygmlPackage;

import net.opengis.citygml.appearance.AppearanceFactory;
import net.opengis.citygml.appearance.AppearancePackage;

import net.opengis.citygml.building.BuildingFactory;
import net.opengis.citygml.building.BuildingPackage;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.citygml.cityfurniture.CityfurnitureFactory;
import net.opengis.citygml.cityfurniture.CityfurniturePackage;

import net.opengis.citygml.cityobjectgroup.CityobjectgroupFactory;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage;

import net.opengis.citygml.generics.GenericsFactory;
import net.opengis.citygml.generics.GenericsPackage;

import net.opengis.citygml.landuse.LanduseFactory;
import net.opengis.citygml.landuse.LandusePackage;

import net.opengis.citygml.relief.ReliefFactory;
import net.opengis.citygml.relief.ReliefPackage;

import net.opengis.citygml.texturedsurface.TexturedsurfaceFactory;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;

import net.opengis.citygml.transportation.TransportationFactory;
import net.opengis.citygml.transportation.TransportationPackage;

import net.opengis.citygml.vegetation.VegetationFactory;
import net.opengis.citygml.vegetation.VegetationPackage;

import net.opengis.citygml.waterbody.WaterbodyFactory;
import net.opengis.citygml.waterbody.WaterbodyPackage;

import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.ValueArrayPropertyType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.ValueArrayPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueArrayPropertyTypeItemProvider
	extends ItemProviderAdapter
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
	public ValueArrayPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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

			addBooleanPropertyDescriptor(object);
			addCountPropertyDescriptor(object);
			addBooleanListPropertyDescriptor(object);
			addCountListPropertyDescriptor(object);
			addCountExtentPropertyDescriptor(object);
			addNullPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Boolean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueArrayPropertyType_boolean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueArrayPropertyType_boolean_feature", "_UI_ValueArrayPropertyType_type"),
				 GmlPackage.eINSTANCE.getValueArrayPropertyType_Boolean(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueArrayPropertyType_count_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueArrayPropertyType_count_feature", "_UI_ValueArrayPropertyType_type"),
				 GmlPackage.eINSTANCE.getValueArrayPropertyType_Count(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueArrayPropertyType_booleanList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueArrayPropertyType_booleanList_feature", "_UI_ValueArrayPropertyType_type"),
				 GmlPackage.eINSTANCE.getValueArrayPropertyType_BooleanList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Count List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueArrayPropertyType_countList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueArrayPropertyType_countList_feature", "_UI_ValueArrayPropertyType_type"),
				 GmlPackage.eINSTANCE.getValueArrayPropertyType_CountList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Count Extent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountExtentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueArrayPropertyType_countExtent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueArrayPropertyType_countExtent_feature", "_UI_ValueArrayPropertyType_type"),
				 GmlPackage.eINSTANCE.getValueArrayPropertyType_CountExtent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Null feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ValueArrayPropertyType_null_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ValueArrayPropertyType_null_feature", "_UI_ValueArrayPropertyType_type"),
				 GmlPackage.eINSTANCE.getValueArrayPropertyType_Null(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value());
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
	 * This returns ValueArrayPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ValueArrayPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ValueArrayPropertyType_type");
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

		switch (notification.getFeatureID(ValueArrayPropertyType.class)) {
			case GmlPackage.VALUE_ARRAY_PROPERTY_TYPE__BOOLEAN:
			case GmlPackage.VALUE_ARRAY_PROPERTY_TYPE__COUNT:
			case GmlPackage.VALUE_ARRAY_PROPERTY_TYPE__BOOLEAN_LIST:
			case GmlPackage.VALUE_ARRAY_PROPERTY_TYPE__COUNT_LIST:
			case GmlPackage.VALUE_ARRAY_PROPERTY_TYPE__COUNT_EXTENT:
			case GmlPackage.VALUE_ARRAY_PROPERTY_TYPE__NULL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.VALUE_ARRAY_PROPERTY_TYPE__VALUE:
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
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Boolean(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, "false"))));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Category(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Category(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Category(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Category(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Count(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_BooleanList(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getBooleanOrNullList(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_CategoryList(),
					 GmlFactory.eINSTANCE.createCodeOrNullListType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_CategoryList(),
					 GmlFactory.eINSTANCE.createCategoryExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_QuantityList(),
					 GmlFactory.eINSTANCE.createMeasureOrNullListType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_QuantityList(),
					 GmlFactory.eINSTANCE.createQuantityExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_CountList(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getIntegerOrNullList(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_CategoryExtent(),
					 GmlFactory.eINSTANCE.createCategoryExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_QuantityExtent(),
					 GmlFactory.eINSTANCE.createQuantityExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_CountExtent(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getCountExtentType(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_CompositeValue(),
					 GmlFactory.eINSTANCE.createCompositeValueType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_CompositeValue(),
					 GmlFactory.eINSTANCE.createValueArrayType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray(),
					 GmlFactory.eINSTANCE.createValueArrayType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING,
					 BuildingFactory.eINSTANCE.createBuildingType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE,
					 BuildingFactory.eINSTANCE.createBuildingFurnitureType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION,
					 BuildingFactory.eINSTANCE.createBuildingInstallationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART,
					 BuildingFactory.eINSTANCE.createBuildingPartType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE,
					 BuildingFactory.eINSTANCE.createCeilingSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE,
					 BuildingFactory.eINSTANCE.createClosureSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR,
					 BuildingFactory.eINSTANCE.createDoorType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE,
					 BuildingFactory.eINSTANCE.createFloorSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE,
					 BuildingFactory.eINSTANCE.createGroundSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION,
					 BuildingFactory.eINSTANCE.createIntBuildingInstallationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE,
					 BuildingFactory.eINSTANCE.createInteriorWallSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE,
					 BuildingFactory.eINSTANCE.createRoofSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM,
					 BuildingFactory.eINSTANCE.createRoomType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE,
					 BuildingFactory.eINSTANCE.createWallSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW,
					 BuildingFactory.eINSTANCE.createWindowType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__ADDRESS,
					 CitygmlFactory.eINSTANCE.createAddressType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_MODEL,
					 CitygmlFactory.eINSTANCE.createCityModelType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__IMPLICIT_GEOMETRY,
					 CitygmlFactory.eINSTANCE.createImplicitGeometryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createUnitDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCompoundCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createConcatenatedOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createConversionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCylindricalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDefinitionProxyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDerivedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEllipsoidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEngineeringCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEngineeringDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createGeocentricCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createGeodeticDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createGeographicCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createImageCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createImageDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createLinearCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createOperationMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createOperationParameterGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createOperationParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createPassThroughOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createPolarCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createPrimeMeridianType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createProjectedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createSphericalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTemporalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTemporalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTemporalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeCalendarEraType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeCalendarType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeClockType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeCoordinateSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeOrdinalEraType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTransformationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createUserDefinedCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createVerticalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createVerticalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createVerticalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Array(),
					 GmlFactory.eINSTANCE.createArrayType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Bag(),
					 GmlFactory.eINSTANCE.createBagType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createUnitDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(),
					 GmlFactory.eINSTANCE.createCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve(),
					 GmlFactory.eINSTANCE.createCompositeCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid(),
					 GmlFactory.eINSTANCE.createCompositeSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(),
					 GmlFactory.eINSTANCE.createCompositeSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS(),
					 GmlFactory.eINSTANCE.createCompoundCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation(),
					 GmlFactory.eINSTANCE.createConcatenatedOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Conversion(),
					 GmlFactory.eINSTANCE.createConversionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Curve1(),
					 GmlFactory.eINSTANCE.createCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(),
					 GmlFactory.eINSTANCE.createCylindricalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy(),
					 GmlFactory.eINSTANCE.createDefinitionProxyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS(),
					 GmlFactory.eINSTANCE.createDerivedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(),
					 GmlFactory.eINSTANCE.createDirectedObservationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(),
					 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
					 GmlFactory.eINSTANCE.createObservationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
					 GmlFactory.eINSTANCE.createDirectedObservationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
					 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance(),
					 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Edge(),
					 GmlFactory.eINSTANCE.createEdgeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid(),
					 GmlFactory.eINSTANCE.createEllipsoidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS(),
					 GmlFactory.eINSTANCE.createEngineeringCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum(),
					 GmlFactory.eINSTANCE.createEngineeringDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Face(),
					 GmlFactory.eINSTANCE.createFaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(),
					 GmlFactory.eINSTANCE.createFeatureCollectionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(),
					 GmlFactory.eINSTANCE.createDynamicFeatureCollectionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle1(),
					 GmlFactory.eINSTANCE.createFeatureStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GenericMetaData(),
					 GmlFactory.eINSTANCE.createGenericMetaDataType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS(),
					 GmlFactory.eINSTANCE.createGeocentricCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum(),
					 GmlFactory.eINSTANCE.createGeodeticDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS(),
					 GmlFactory.eINSTANCE.createGeographicCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex(),
					 GmlFactory.eINSTANCE.createGeometricComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle1(),
					 GmlFactory.eINSTANCE.createGeometryStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle1(),
					 GmlFactory.eINSTANCE.createGraphStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
					 GmlFactory.eINSTANCE.createGridType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
					 GmlFactory.eINSTANCE.createRectifiedGridType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GridCoverage(),
					 GmlFactory.eINSTANCE.createGridCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS(),
					 GmlFactory.eINSTANCE.createImageCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum(),
					 GmlFactory.eINSTANCE.createImageDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle1(),
					 GmlFactory.eINSTANCE.createLabelStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(),
					 GmlFactory.eINSTANCE.createLinearCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing(),
					 GmlFactory.eINSTANCE.createLinearRingType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LineString(),
					 GmlFactory.eINSTANCE.createLineStringType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MovingObjectStatus(),
					 GmlFactory.eINSTANCE.createMovingObjectStatusType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(),
					 GmlFactory.eINSTANCE.createMultiCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveCoverage(),
					 GmlFactory.eINSTANCE.createMultiCurveCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(),
					 GmlFactory.eINSTANCE.createMultiGeometryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(),
					 GmlFactory.eINSTANCE.createMultiLineStringType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(),
					 GmlFactory.eINSTANCE.createMultiPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointCoverage(),
					 GmlFactory.eINSTANCE.createMultiPointCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(),
					 GmlFactory.eINSTANCE.createMultiPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(),
					 GmlFactory.eINSTANCE.createMultiSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidCoverage(),
					 GmlFactory.eINSTANCE.createMultiSolidCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(),
					 GmlFactory.eINSTANCE.createMultiSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceCoverage(),
					 GmlFactory.eINSTANCE.createMultiSurfaceCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Node(),
					 GmlFactory.eINSTANCE.createNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod(),
					 GmlFactory.eINSTANCE.createOperationMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter(),
					 GmlFactory.eINSTANCE.createOperationParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup(),
					 GmlFactory.eINSTANCE.createOperationParameterGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve(),
					 GmlFactory.eINSTANCE.createOrientableCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 GmlFactory.eINSTANCE.createOrientableSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation(),
					 GmlFactory.eINSTANCE.createPassThroughOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Point(),
					 GmlFactory.eINSTANCE.createPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(),
					 GmlFactory.eINSTANCE.createPolarCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(),
					 GmlFactory.eINSTANCE.createPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian(),
					 GmlFactory.eINSTANCE.createPrimeMeridianType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS(),
					 GmlFactory.eINSTANCE.createProjectedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid(),
					 GmlFactory.eINSTANCE.createRectifiedGridType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridCoverage(),
					 GmlFactory.eINSTANCE.createRectifiedGridCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Ring1(),
					 GmlFactory.eINSTANCE.createRingType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Solid1(),
					 GmlFactory.eINSTANCE.createSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(),
					 GmlFactory.eINSTANCE.createSphericalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Style1(),
					 GmlFactory.eINSTANCE.createStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS(),
					 GmlFactory.eINSTANCE.createTemporalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(),
					 GmlFactory.eINSTANCE.createTemporalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum(),
					 GmlFactory.eINSTANCE.createTemporalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar(),
					 GmlFactory.eINSTANCE.createTimeCalendarType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra(),
					 GmlFactory.eINSTANCE.createTimeCalendarEraType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock(),
					 GmlFactory.eINSTANCE.createTimeClockType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem(),
					 GmlFactory.eINSTANCE.createTimeCoordinateSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeEdge(),
					 GmlFactory.eINSTANCE.createTimeEdgeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeInstant(),
					 GmlFactory.eINSTANCE.createTimeInstantType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeNode(),
					 GmlFactory.eINSTANCE.createTimeNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem(),
					 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod(),
					 GmlFactory.eINSTANCE.createTimePeriodType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyComplex(),
					 GmlFactory.eINSTANCE.createTimeTopologyComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Tin(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplex(),
					 GmlFactory.eINSTANCE.createTopoComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle1(),
					 GmlFactory.eINSTANCE.createTopologyStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoSolid(),
					 GmlFactory.eINSTANCE.createTopoSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Transformation(),
					 GmlFactory.eINSTANCE.createTransformationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(),
					 GmlFactory.eINSTANCE.createUserDefinedCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS(),
					 GmlFactory.eINSTANCE.createVerticalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(),
					 GmlFactory.eINSTANCE.createVerticalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum(),
					 GmlFactory.eINSTANCE.createVerticalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__MATERIAL,
					 TexturedsurfaceFactory.eINSTANCE.createMaterialType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__SIMPLE_TEXTURE,
					 TexturedsurfaceFactory.eINSTANCE.createSimpleTextureType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE,
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE,
					 AppearanceFactory.eINSTANCE.createGeoreferencedTextureType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE,
					 AppearanceFactory.eINSTANCE.createParameterizedTextureType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_GEN,
					 AppearanceFactory.eINSTANCE.createTexCoordGenType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_LIST,
					 AppearanceFactory.eINSTANCE.createTexCoordListType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__X3_DMATERIAL,
					 AppearanceFactory.eINSTANCE.createX3DMaterialType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTransportationComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA,
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createTransportationComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA,
					 TransportationFactory.eINSTANCE.createTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF,
					 ReliefFactory.eINSTANCE.createBreaklineReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION,
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF,
					 ReliefFactory.eINSTANCE.createMassPointReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF,
					 ReliefFactory.eINSTANCE.createRasterReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE,
					 ReliefFactory.eINSTANCE.createReliefFeatureType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF,
					 ReliefFactory.eINSTANCE.createTINReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(CityfurniturePackage.Literals.DOCUMENT_ROOT__CITY_FURNITURE,
					 CityfurnitureFactory.eINSTANCE.createCityFurnitureType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(CityobjectgroupPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_GROUP,
					 CityobjectgroupFactory.eINSTANCE.createCityObjectGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(LandusePackage.Literals.DOCUMENT_ROOT__LAND_USE,
					 LanduseFactory.eINSTANCE.createLandUseType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createPlantCoverType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createSolitaryVegetationObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER,
					 VegetationFactory.eINSTANCE.createPlantCoverType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createSolitaryVegetationObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT,
					 WaterbodyFactory.eINSTANCE.createWaterBodyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY,
					 WaterbodyFactory.eINSTANCE.createWaterBodyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterClosureSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_GROUND_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterGroundSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_CITY_OBJECT,
					 GenericsFactory.eINSTANCE.createGenericCityObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getValueArrayPropertyType_Value(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getValueArrayPropertyType_Null(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getNullType(), null)))); // TODO: ensure this is a valid literal value
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
			childFeature == GmlPackage.eINSTANCE.getValueArrayPropertyType_Quantity() ||
			childFeature == ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION ||
			childFeature == GmlPackage.eINSTANCE.getValueArrayPropertyType_CategoryList() ||
			childFeature == GmlPackage.eINSTANCE.getValueArrayPropertyType_CategoryExtent() ||
			childFeature == GmlPackage.eINSTANCE.getValueArrayPropertyType_QuantityList() ||
			childFeature == GmlPackage.eINSTANCE.getValueArrayPropertyType_QuantityExtent() ||
			childFeature == GmlPackage.eINSTANCE.getValueArrayPropertyType_CompositeValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueArray() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Definition() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Conversion() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Dictionary() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LinearCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolarCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeClock() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Transformation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Observation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Grid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface() ||
			childFeature == TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Surface1() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Tin() ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__ROAD ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRACK ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA ||
			childFeature == VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT ||
			childFeature == VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER ||
			childFeature == VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT ||
			childFeature == WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT ||
			childFeature == WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY;

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
