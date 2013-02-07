/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityobjectgroup.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.BuildingFactory;
import net.opengis.citygml.building.BuildingPackage;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.citygml.cityfurniture.CityfurnitureFactory;
import net.opengis.citygml.cityfurniture.CityfurniturePackage;

import net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupFactory;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage;

import net.opengis.citygml.generics.GenericsFactory;
import net.opengis.citygml.generics.GenericsPackage;

import net.opengis.citygml.landuse.LanduseFactory;
import net.opengis.citygml.landuse.LandusePackage;

import net.opengis.citygml.relief.ReliefFactory;
import net.opengis.citygml.relief.ReliefPackage;

import net.opengis.citygml.transportation.TransportationFactory;
import net.opengis.citygml.transportation.TransportationPackage;

import net.opengis.citygml.vegetation.VegetationFactory;
import net.opengis.citygml.vegetation.VegetationPackage;

import net.opengis.citygml.waterbody.WaterbodyFactory;
import net.opengis.citygml.waterbody.WaterbodyPackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.w3._1999.xlink.ActuateType;

/**
 * This is the item provider adapter for a {@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CityObjectGroupMemberTypeItemProvider
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
	public CityObjectGroupMemberTypeItemProvider(AdapterFactory adapterFactory) {
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

			addActuatePropertyDescriptor(object);
			addArcrolePropertyDescriptor(object);
			addHrefPropertyDescriptor(object);
			addRemoteSchemaPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addRole1PropertyDescriptor(object);
			addShowPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actuate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActuatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_actuate_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arcrole feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArcrolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_arcrole_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Href feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_href_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__HREF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoteSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_remoteSchema_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_role_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRole1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_role1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_role1_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_show_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_title_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityObjectGroupMemberType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityObjectGroupMemberType_type_feature", "_UI_CityObjectGroupMemberType_type"),
				 CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE,
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
			childrenFeatures.add(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP);
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
	 * This returns CityObjectGroupMemberType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CityObjectGroupMemberType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActuateType labelValue = ((CityObjectGroupMemberType)object).getActuate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CityObjectGroupMemberType_type") :
			getString("_UI_CityObjectGroupMemberType_type") + " " + label;
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

		switch (notification.getFeatureID(CityObjectGroupMemberType.class)) {
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__HREF:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE:
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP:
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
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING,
					 BuildingFactory.eINSTANCE.createBuildingType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE,
					 BuildingFactory.eINSTANCE.createBuildingFurnitureType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION,
					 BuildingFactory.eINSTANCE.createBuildingInstallationType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART,
					 BuildingFactory.eINSTANCE.createBuildingPartType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE,
					 BuildingFactory.eINSTANCE.createCeilingSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE,
					 BuildingFactory.eINSTANCE.createClosureSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR,
					 BuildingFactory.eINSTANCE.createDoorType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE,
					 BuildingFactory.eINSTANCE.createFloorSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE,
					 BuildingFactory.eINSTANCE.createGroundSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION,
					 BuildingFactory.eINSTANCE.createIntBuildingInstallationType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE,
					 BuildingFactory.eINSTANCE.createInteriorWallSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE,
					 BuildingFactory.eINSTANCE.createRoofSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM,
					 BuildingFactory.eINSTANCE.createRoomType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE,
					 BuildingFactory.eINSTANCE.createWallSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW,
					 BuildingFactory.eINSTANCE.createWindowType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTransportationComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA,
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createTransportationComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA,
					 TransportationFactory.eINSTANCE.createTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF,
					 ReliefFactory.eINSTANCE.createBreaklineReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF,
					 ReliefFactory.eINSTANCE.createMassPointReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF,
					 ReliefFactory.eINSTANCE.createRasterReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE,
					 ReliefFactory.eINSTANCE.createReliefFeatureType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF,
					 ReliefFactory.eINSTANCE.createTINReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(CityfurniturePackage.Literals.DOCUMENT_ROOT__CITY_FURNITURE,
					 CityfurnitureFactory.eINSTANCE.createCityFurnitureType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(CityobjectgroupPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_GROUP,
					 CityobjectgroupFactory.eINSTANCE.createCityObjectGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(LandusePackage.Literals.DOCUMENT_ROOT__LAND_USE,
					 LanduseFactory.eINSTANCE.createLandUseType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createPlantCoverType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createSolitaryVegetationObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER,
					 VegetationFactory.eINSTANCE.createPlantCoverType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createSolitaryVegetationObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT,
					 WaterbodyFactory.eINSTANCE.createWaterBodyType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY,
					 WaterbodyFactory.eINSTANCE.createWaterBodyType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterClosureSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_GROUND_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterGroundSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP,
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_CITY_OBJECT,
					 GenericsFactory.eINSTANCE.createGenericCityObjectType())));
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
