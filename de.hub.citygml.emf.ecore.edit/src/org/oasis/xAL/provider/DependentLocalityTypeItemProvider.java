/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.provider;


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

import net.opengis.gml.CompassPointEnumeration;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.IsSphereType;

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

import org.oasis.xAL.DependentLocalityType;
import org.oasis.xAL.XALFactory;
import org.oasis.xAL.XALPackage;

import org.w3._2001.smil20.Smil20Package;

import org.w3._2001.smil20.language.LanguageFactory;
import org.w3._2001.smil20.language.LanguagePackage;

/**
 * This is the item provider adapter for a {@link org.oasis.xAL.DependentLocalityType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DependentLocalityTypeItemProvider
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
	public DependentLocalityTypeItemProvider(AdapterFactory adapterFactory) {
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

			addConnectorPropertyDescriptor(object);
			addIndicatorPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addUsageTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DependentLocalityType_connector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependentLocalityType_connector_feature", "_UI_DependentLocalityType_type"),
				 XALPackage.eINSTANCE.getDependentLocalityType_Connector(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indicator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndicatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DependentLocalityType_indicator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependentLocalityType_indicator_feature", "_UI_DependentLocalityType_type"),
				 XALPackage.eINSTANCE.getDependentLocalityType_Indicator(),
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
				 getString("_UI_DependentLocalityType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependentLocalityType_type_feature", "_UI_DependentLocalityType_type"),
				 XALPackage.eINSTANCE.getDependentLocalityType_Type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usage Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsageTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DependentLocalityType_usageType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependentLocalityType_usageType_feature", "_UI_DependentLocalityType_type"),
				 XALPackage.eINSTANCE.getDependentLocalityType_UsageType(),
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
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_AddressLine());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_DependentLocalityName());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_DependentLocalityNumber());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_PostBox());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_LargeMailUser());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_PostOffice());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_PostalRoute());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_Thoroughfare());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_Premise());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_DependentLocality());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_PostalCode());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_Any());
			childrenFeatures.add(XALPackage.eINSTANCE.getDependentLocalityType_AnyAttribute());
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
	 * This returns DependentLocalityType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DependentLocalityType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((DependentLocalityType)object).getConnector();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DependentLocalityType_type") :
			getString("_UI_DependentLocalityType_type") + " " + label;
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

		switch (notification.getFeatureID(DependentLocalityType.class)) {
			case XALPackage.DEPENDENT_LOCALITY_TYPE__CONNECTOR:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__INDICATOR:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__TYPE:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__USAGE_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ADDRESS_LINE:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NAME:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY_NUMBER:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_BOX:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__LARGE_MAIL_USER:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POST_OFFICE:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_ROUTE:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__THOROUGHFARE:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__PREMISE:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__DEPENDENT_LOCALITY:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__POSTAL_CODE:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY:
			case XALPackage.DEPENDENT_LOCALITY_TYPE__ANY_ATTRIBUTE:
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
				(XALPackage.eINSTANCE.getDependentLocalityType_AddressLine(),
				 XALFactory.eINSTANCE.createAddressLineType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_DependentLocalityName(),
				 XALFactory.eINSTANCE.createDependentLocalityNameType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_DependentLocalityNumber(),
				 XALFactory.eINSTANCE.createDependentLocalityNumberType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_PostBox(),
				 XALFactory.eINSTANCE.createPostBoxType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_LargeMailUser(),
				 XALFactory.eINSTANCE.createLargeMailUserType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_PostOffice(),
				 XALFactory.eINSTANCE.createPostOfficeType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_PostalRoute(),
				 XALFactory.eINSTANCE.createPostalRouteType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Thoroughfare(),
				 XALFactory.eINSTANCE.createThoroughfareType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Premise(),
				 XALFactory.eINSTANCE.createPremiseType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_DependentLocality(),
				 XALFactory.eINSTANCE.createDependentLocalityType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_PostalCode(),
				 XALFactory.eINSTANCE.createPostalCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING,
					 BuildingFactory.eINSTANCE.createBuildingType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE,
					 BuildingFactory.eINSTANCE.createBuildingFurnitureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION,
					 BuildingFactory.eINSTANCE.createBuildingInstallationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART,
					 BuildingFactory.eINSTANCE.createBuildingPartType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE,
					 BuildingFactory.eINSTANCE.createCeilingSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE,
					 BuildingFactory.eINSTANCE.createClosureSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR,
					 BuildingFactory.eINSTANCE.createDoorType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE,
					 BuildingFactory.eINSTANCE.createFloorSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE,
					 BuildingFactory.eINSTANCE.createGroundSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION,
					 BuildingFactory.eINSTANCE.createIntBuildingInstallationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE,
					 BuildingFactory.eINSTANCE.createInteriorWallSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE,
					 BuildingFactory.eINSTANCE.createRoofSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM,
					 BuildingFactory.eINSTANCE.createRoomType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE,
					 BuildingFactory.eINSTANCE.createWallSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW,
					 BuildingFactory.eINSTANCE.createWindowType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__ADDRESS,
					 CitygmlFactory.eINSTANCE.createAddressType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_MODEL,
					 CitygmlFactory.eINSTANCE.createCityModelType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_MEMBER,
					 GmlFactory.eINSTANCE.createFeaturePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_MEMBER,
					 AppearanceFactory.eINSTANCE.createAppearancePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(CitygmlPackage.Literals.DOCUMENT_ROOT__IMPLICIT_GEOMETRY,
					 CitygmlFactory.eINSTANCE.createImplicitGeometryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createUnitDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCompoundCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createConcatenatedOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createConversionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createCylindricalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDefinitionProxyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDerivedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEllipsoidType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEngineeringCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createEngineeringDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createGeocentricCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createGeodeticDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createGeographicCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createImageCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createImageDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createLinearCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createOperationMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createOperationParameterGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createOperationParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createPassThroughOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createPolarCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createPrimeMeridianType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createProjectedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createSphericalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTemporalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTemporalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTemporalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeCalendarEraType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeCalendarType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeClockType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeCoordinateSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeOrdinalEraType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createTransformationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createUserDefinedCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createVerticalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createVerticalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
					 GmlFactory.eINSTANCE.createVerticalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AbsoluteExternalPositionalAccuracy(),
					 GmlFactory.eINSTANCE.createAbsoluteExternalPositionalAccuracyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef(),
					 GmlFactory.eINSTANCE.createAbstractGeneralOperationParameterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AffinePlacement(),
					 GmlFactory.eINSTANCE.createAffinePlacementType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember(),
					 GmlFactory.eINSTANCE.createFeaturePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember(),
					 AppearanceFactory.eINSTANCE.createAppearancePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Arc(),
					 GmlFactory.eINSTANCE.createArcType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Arc(),
					 GmlFactory.eINSTANCE.createCircleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
					 GmlFactory.eINSTANCE.createArcStringType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
					 GmlFactory.eINSTANCE.createArcType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
					 GmlFactory.eINSTANCE.createCircleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge(),
					 GmlFactory.eINSTANCE.createArcByBulgeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(),
					 GmlFactory.eINSTANCE.createArcStringByBulgeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(),
					 GmlFactory.eINSTANCE.createArcByBulgeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(),
					 GmlFactory.eINSTANCE.createArcByCenterPointType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(),
					 GmlFactory.eINSTANCE.createCircleByCenterPointType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Array(),
					 GmlFactory.eINSTANCE.createArrayType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_AxisID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Bag(),
					 GmlFactory.eINSTANCE.createBagType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS(),
					 GmlFactory.eINSTANCE.createCoordinateReferenceSystemRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve(),
					 GmlFactory.eINSTANCE.createCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface(),
					 GmlFactory.eINSTANCE.createSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createUnitDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Bezier(),
					 GmlFactory.eINSTANCE.createBezierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(),
					 GmlFactory.eINSTANCE.createBSplineType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(),
					 GmlFactory.eINSTANCE.createBezierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Boolean(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, "false"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BooleanList(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getBooleanOrNullList(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BooleanValue(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, "false"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BoundedBy(),
					 GmlFactory.eINSTANCE.createBoundingShapeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox(),
					 GmlFactory.eINSTANCE.createEnvelopeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox(),
					 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon(),
					 GmlFactory.eINSTANCE.createPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(),
					 GmlFactory.eINSTANCE.createCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef(),
					 GmlFactory.eINSTANCE.createCartesianCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent(),
					 GmlFactory.eINSTANCE.createCategoryExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList(),
					 GmlFactory.eINSTANCE.createCodeOrNullListType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList(),
					 GmlFactory.eINSTANCE.createCategoryExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf(),
					 GmlFactory.eINSTANCE.createCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CenterOf(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Circle(),
					 GmlFactory.eINSTANCE.createCircleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint(),
					 GmlFactory.eINSTANCE.createCircleByCenterPointType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Clothoid(),
					 GmlFactory.eINSTANCE.createClothoidType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ColumnIndex(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompassPoint(),
					 CompassPointEnumeration.N)));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve(),
					 GmlFactory.eINSTANCE.createCompositeCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid(),
					 GmlFactory.eINSTANCE.createCompositeSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(),
					 GmlFactory.eINSTANCE.createCompositeSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue(),
					 GmlFactory.eINSTANCE.createCompositeValueType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue(),
					 GmlFactory.eINSTANCE.createValueArrayType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS(),
					 GmlFactory.eINSTANCE.createCompoundCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRSRef(),
					 GmlFactory.eINSTANCE.createCompoundCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation(),
					 GmlFactory.eINSTANCE.createConcatenatedOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperationRef(),
					 GmlFactory.eINSTANCE.createConcatenatedOperationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Cone(),
					 GmlFactory.eINSTANCE.createConeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Container(),
					 GmlFactory.eINSTANCE.createContainerPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Conversion(),
					 GmlFactory.eINSTANCE.createConversionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConversionRef(),
					 GmlFactory.eINSTANCE.createConversionRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit(),
					 GmlFactory.eINSTANCE.createConversionToPreferredUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Coord(),
					 GmlFactory.eINSTANCE.createCoordType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationRef(),
					 GmlFactory.eINSTANCE.createCoordinateOperationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef(),
					 GmlFactory.eINSTANCE.createCoordinateReferenceSystemRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Coordinates(),
					 GmlFactory.eINSTANCE.createCoordinatesType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef(),
					 GmlFactory.eINSTANCE.createCoordinateSystemRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Count(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CountExtent(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getCountExtentType(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CountList(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getIntegerOrNullList(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Covariance(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CovarianceMatrix(),
					 GmlFactory.eINSTANCE.createCovarianceMatrixType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoverageFunction(),
					 GmlFactory.eINSTANCE.createCoverageFunctionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CrsRef(),
					 GmlFactory.eINSTANCE.createCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CubicSpline(),
					 GmlFactory.eINSTANCE.createCubicSplineType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Curve1(),
					 GmlFactory.eINSTANCE.createCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty(),
					 GmlFactory.eINSTANCE.createCurveArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CurveMember(),
					 GmlFactory.eINSTANCE.createCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers(),
					 GmlFactory.eINSTANCE.createCurveArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty(),
					 GmlFactory.eINSTANCE.createCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Cylinder(),
					 GmlFactory.eINSTANCE.createCylinderType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(),
					 GmlFactory.eINSTANCE.createCylindricalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCSRef(),
					 GmlFactory.eINSTANCE.createCylindricalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DataBlock(),
					 GmlFactory.eINSTANCE.createDataBlockType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DataSource(),
					 GmlFactory.eINSTANCE.createStringOrRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumRef(),
					 GmlFactory.eINSTANCE.createDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DecimalMinutes(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getDecimalMinutesType(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefaultStyle(),
					 GmlFactory.eINSTANCE.createDefaultStylePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion(),
					 GmlFactory.eINSTANCE.createGeneralConversionRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember(),
					 GmlFactory.eINSTANCE.createDictionaryEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry(),
					 GmlFactory.eINSTANCE.createDictionaryEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy(),
					 GmlFactory.eINSTANCE.createDefinitionProxyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionRef(),
					 GmlFactory.eINSTANCE.createReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Degrees(),
					 GmlFactory.eINSTANCE.createDegreesType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm(),
					 GmlFactory.eINSTANCE.createDerivationUnitTermType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS(),
					 GmlFactory.eINSTANCE.createDerivedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSRef(),
					 GmlFactory.eINSTANCE.createDerivedCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Description(),
					 GmlFactory.eINSTANCE.createStringOrRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedEdge(),
					 GmlFactory.eINSTANCE.createDirectedEdgePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedFace(),
					 GmlFactory.eINSTANCE.createDirectedFacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedNode(),
					 GmlFactory.eINSTANCE.createDirectedNodePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(),
					 GmlFactory.eINSTANCE.createDirectedObservationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(),
					 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
					 GmlFactory.eINSTANCE.createObservationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
					 GmlFactory.eINSTANCE.createDirectedObservationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
					 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance(),
					 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectedTopoSolid(),
					 GmlFactory.eINSTANCE.createDirectedTopoSolidPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Direction(),
					 GmlFactory.eINSTANCE.createDirectionPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DirectionVector(),
					 GmlFactory.eINSTANCE.createDirectionVectorType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle(),
					 GmlFactory.eINSTANCE.createDMSAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue(),
					 GmlFactory.eINSTANCE.createDMSAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
					 GmlFactory.eINSTANCE.createDomainSetType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
					 GmlFactory.eINSTANCE.createGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiCurveDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiPointDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiSolidDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiSurfaceDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
					 GmlFactory.eINSTANCE.createRectifiedGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DoubleOrNullTupleList(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getDoubleOrNullList(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Duration(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DURATION, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Edge(),
					 GmlFactory.eINSTANCE.createEdgeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf(),
					 GmlFactory.eINSTANCE.createCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid(),
					 GmlFactory.eINSTANCE.createEllipsoidType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef(),
					 GmlFactory.eINSTANCE.createEllipsoidRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS(),
					 GmlFactory.eINSTANCE.createEngineeringCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRSRef(),
					 GmlFactory.eINSTANCE.createEngineeringCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum(),
					 GmlFactory.eINSTANCE.createEngineeringDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef(),
					 GmlFactory.eINSTANCE.createEngineeringDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Envelope(),
					 GmlFactory.eINSTANCE.createEnvelopeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Envelope(),
					 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod(),
					 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf(),
					 GmlFactory.eINSTANCE.createSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Exterior(),
					 GmlFactory.eINSTANCE.createAbstractRingPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Face(),
					 GmlFactory.eINSTANCE.createFaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(),
					 GmlFactory.eINSTANCE.createFeatureCollectionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(),
					 GmlFactory.eINSTANCE.createDynamicFeatureCollectionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMembers(),
					 GmlFactory.eINSTANCE.createFeatureArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty(),
					 GmlFactory.eINSTANCE.createFeaturePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty(),
					 AppearanceFactory.eINSTANCE.createAppearancePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle(),
					 GmlFactory.eINSTANCE.createFeatureStylePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle1(),
					 GmlFactory.eINSTANCE.createFeatureStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_File(),
					 GmlFactory.eINSTANCE.createFileType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef(),
					 GmlFactory.eINSTANCE.createGeneralConversionRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformationRef(),
					 GmlFactory.eINSTANCE.createGeneralTransformationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GenericMetaData(),
					 GmlFactory.eINSTANCE.createGenericMetaDataType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS(),
					 GmlFactory.eINSTANCE.createGeocentricCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRSRef(),
					 GmlFactory.eINSTANCE.createGeocentricCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Geodesic(),
					 GmlFactory.eINSTANCE.createGeodesicType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(),
					 GmlFactory.eINSTANCE.createGeodesicStringType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(),
					 GmlFactory.eINSTANCE.createGeodesicType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum(),
					 GmlFactory.eINSTANCE.createGeodeticDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef(),
					 GmlFactory.eINSTANCE.createGeodeticDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS(),
					 GmlFactory.eINSTANCE.createGeographicCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRSRef(),
					 GmlFactory.eINSTANCE.createGeographicCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex(),
					 GmlFactory.eINSTANCE.createGeometricComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMember(),
					 GmlFactory.eINSTANCE.createGeometryPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMembers(),
					 GmlFactory.eINSTANCE.createGeometryArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle(),
					 GmlFactory.eINSTANCE.createGeometryStylePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle1(),
					 GmlFactory.eINSTANCE.createGeometryStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle(),
					 GmlFactory.eINSTANCE.createGraphStylePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle1(),
					 GmlFactory.eINSTANCE.createGraphStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GreenwichLongitude(),
					 GmlFactory.eINSTANCE.createAngleChoiceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
					 GmlFactory.eINSTANCE.createGridType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
					 GmlFactory.eINSTANCE.createRectifiedGridType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GridCoverage(),
					 GmlFactory.eINSTANCE.createGridCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GridDomain(),
					 GmlFactory.eINSTANCE.createGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction(),
					 GmlFactory.eINSTANCE.createGridFunctionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction(),
					 GmlFactory.eINSTANCE.createIndexMapType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_History(),
					 GmlFactory.eINSTANCE.createHistoryPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_History(),
					 GmlFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS(),
					 GmlFactory.eINSTANCE.createImageCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRSRef(),
					 GmlFactory.eINSTANCE.createImageCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum(),
					 GmlFactory.eINSTANCE.createImageDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef(),
					 GmlFactory.eINSTANCE.createImageDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS(),
					 GmlFactory.eINSTANCE.createCoordinateReferenceSystemRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IncludesElement(),
					 GmlFactory.eINSTANCE.createCovarianceElementType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter(),
					 GmlFactory.eINSTANCE.createAbstractGeneralOperationParameterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue(),
					 GmlFactory.eINSTANCE.createParameterValueGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue(),
					 GmlFactory.eINSTANCE.createParameterValueType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IndexMap(),
					 GmlFactory.eINSTANCE.createIndexMapType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IndirectEntry(),
					 GmlFactory.eINSTANCE.createIndirectEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(),
					 GmlFactory.eINSTANCE.createAbstractRingPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Interior(),
					 GmlFactory.eINSTANCE.createAbstractRingPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IntegerValue(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IntegerValueList(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getIntegerList(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Isolated(),
					 GmlFactory.eINSTANCE.createIsolatedPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_IsSphere(),
					 IsSphereType.SPHERE)));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle(),
					 GmlFactory.eINSTANCE.createLabelStylePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle1(),
					 GmlFactory.eINSTANCE.createLabelStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(),
					 GmlFactory.eINSTANCE.createLinearCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearCSRef(),
					 GmlFactory.eINSTANCE.createLinearCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing(),
					 GmlFactory.eINSTANCE.createLinearRingType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LineString(),
					 GmlFactory.eINSTANCE.createLineStringType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember(),
					 GmlFactory.eINSTANCE.createLineStringPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty(),
					 GmlFactory.eINSTANCE.createLineStringPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LineStringSegment(),
					 GmlFactory.eINSTANCE.createLineStringSegmentType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Location(),
					 GmlFactory.eINSTANCE.createLocationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Location(),
					 GmlFactory.eINSTANCE.createPriorityLocationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LocationString(),
					 GmlFactory.eINSTANCE.createStringOrRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MappingRule(),
					 GmlFactory.eINSTANCE.createStringOrRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex(),
					 GmlFactory.eINSTANCE.createTopoComplexMemberType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MaximumOccurs(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 BuildingFactory.eINSTANCE.createBoundarySurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 BuildingFactory.eINSTANCE.createBuildingInstallationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 BuildingFactory.eINSTANCE.createBuildingPartPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 BuildingFactory.eINSTANCE.createIntBuildingInstallationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 BuildingFactory.eINSTANCE.createInteriorFurniturePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 BuildingFactory.eINSTANCE.createInteriorRoomPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 BuildingFactory.eINSTANCE.createOpeningPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 CitygmlFactory.eINSTANCE.createAddressPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 GmlFactory.eINSTANCE.createAssociationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 TransportationFactory.eINSTANCE.createTrafficAreaPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 ReliefFactory.eINSTANCE.createGridPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 ReliefFactory.eINSTANCE.createReliefComponentPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 ReliefFactory.eINSTANCE.createTinPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
					 WaterbodyFactory.eINSTANCE.createBoundedByWaterSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Members(),
					 GmlFactory.eINSTANCE.createArrayAssociationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MetaDataProperty(),
					 GmlFactory.eINSTANCE.createMetaDataPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MinimumOccurs(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Minutes(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getArcMinutesType(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ModifiedCoordinate(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MovingObjectStatus(),
					 GmlFactory.eINSTANCE.createMovingObjectStatusType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf(),
					 GmlFactory.eINSTANCE.createMultiCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf(),
					 GmlFactory.eINSTANCE.createMultiPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage(),
					 GmlFactory.eINSTANCE.createMultiSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(),
					 GmlFactory.eINSTANCE.createMultiCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveCoverage(),
					 GmlFactory.eINSTANCE.createMultiCurveCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain(),
					 GmlFactory.eINSTANCE.createMultiCurveDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty(),
					 GmlFactory.eINSTANCE.createMultiCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf(),
					 GmlFactory.eINSTANCE.createMultiCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf(),
					 GmlFactory.eINSTANCE.createMultiSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(),
					 GmlFactory.eINSTANCE.createMultiGeometryType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometryProperty(),
					 GmlFactory.eINSTANCE.createMultiGeometryPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(),
					 GmlFactory.eINSTANCE.createMultiLineStringType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation(),
					 GmlFactory.eINSTANCE.createMultiPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(),
					 GmlFactory.eINSTANCE.createMultiPointType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointCoverage(),
					 GmlFactory.eINSTANCE.createMultiPointCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain(),
					 GmlFactory.eINSTANCE.createMultiPointDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty(),
					 GmlFactory.eINSTANCE.createMultiPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(),
					 GmlFactory.eINSTANCE.createMultiPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition(),
					 GmlFactory.eINSTANCE.createMultiPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(),
					 GmlFactory.eINSTANCE.createMultiSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidCoverage(),
					 GmlFactory.eINSTANCE.createMultiSolidCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain(),
					 GmlFactory.eINSTANCE.createMultiSolidDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidProperty(),
					 GmlFactory.eINSTANCE.createMultiSolidPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(),
					 GmlFactory.eINSTANCE.createMultiSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceCoverage(),
					 GmlFactory.eINSTANCE.createMultiSurfaceCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain(),
					 GmlFactory.eINSTANCE.createMultiSurfaceDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty(),
					 GmlFactory.eINSTANCE.createMultiSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Node(),
					 GmlFactory.eINSTANCE.createNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Null(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getNullType(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OffsetCurve(),
					 GmlFactory.eINSTANCE.createOffsetCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod(),
					 GmlFactory.eINSTANCE.createOperationMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef(),
					 GmlFactory.eINSTANCE.createOperationMethodRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter(),
					 GmlFactory.eINSTANCE.createOperationParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup(),
					 GmlFactory.eINSTANCE.createOperationParameterGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef(),
					 GmlFactory.eINSTANCE.createOperationParameterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef(),
					 GmlFactory.eINSTANCE.createOperationParameterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationRef(),
					 GmlFactory.eINSTANCE.createOperationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationVersion(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve(),
					 GmlFactory.eINSTANCE.createOrientableCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 GmlFactory.eINSTANCE.createOrientableSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Origin(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(),
					 GmlFactory.eINSTANCE.createAbstractRingPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue(),
					 GmlFactory.eINSTANCE.createParameterValueType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup(),
					 GmlFactory.eINSTANCE.createParameterValueGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation(),
					 GmlFactory.eINSTANCE.createPassThroughOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperationRef(),
					 GmlFactory.eINSTANCE.createPassThroughOperationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Patches(),
					 GmlFactory.eINSTANCE.createSurfacePatchArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Patches(),
					 GmlFactory.eINSTANCE.createPolygonPatchArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Patches(),
					 GmlFactory.eINSTANCE.createTrianglePatchArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Point(),
					 GmlFactory.eINSTANCE.createPointType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty(),
					 GmlFactory.eINSTANCE.createPointArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PointMember(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PointMembers(),
					 GmlFactory.eINSTANCE.createPointArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PointProperty(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PointRep(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(),
					 GmlFactory.eINSTANCE.createPolarCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolarCSRef(),
					 GmlFactory.eINSTANCE.createPolarCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(),
					 GmlFactory.eINSTANCE.createPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember(),
					 GmlFactory.eINSTANCE.createPolygonPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatch(),
					 GmlFactory.eINSTANCE.createPolygonPatchType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches(),
					 GmlFactory.eINSTANCE.createPolygonPatchArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty(),
					 GmlFactory.eINSTANCE.createPolygonPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Pos(),
					 GmlFactory.eINSTANCE.createDirectPositionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Position(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PosList(),
					 GmlFactory.eINSTANCE.createDirectPositionListType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian(),
					 GmlFactory.eINSTANCE.createPrimeMeridianType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef(),
					 GmlFactory.eINSTANCE.createPrimeMeridianRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation(),
					 GmlFactory.eINSTANCE.createPriorityLocationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS(),
					 GmlFactory.eINSTANCE.createProjectedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRSRef(),
					 GmlFactory.eINSTANCE.createProjectedCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent(),
					 GmlFactory.eINSTANCE.createQuantityExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList(),
					 GmlFactory.eINSTANCE.createMeasureOrNullListType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList(),
					 GmlFactory.eINSTANCE.createQuantityExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_QuantityType(),
					 GmlFactory.eINSTANCE.createStringOrRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RangeParameters(),
					 GmlFactory.eINSTANCE.createRangeParametersType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RangeSet(),
					 GmlFactory.eINSTANCE.createRangeSetType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RealizationEpoch(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Rectangle(),
					 GmlFactory.eINSTANCE.createRectangleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid(),
					 GmlFactory.eINSTANCE.createRectifiedGridType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridCoverage(),
					 GmlFactory.eINSTANCE.createRectifiedGridCoverageType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain(),
					 GmlFactory.eINSTANCE.createRectifiedGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystemRef(),
					 GmlFactory.eINSTANCE.createReferenceSystemRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RelativeInternalPositionalAccuracy(),
					 GmlFactory.eINSTANCE.createRelativeInternalPositionalAccuracyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Remarks(),
					 GmlFactory.eINSTANCE.createStringOrRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 BuildingFactory.eINSTANCE.createBoundarySurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 BuildingFactory.eINSTANCE.createBuildingInstallationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 BuildingFactory.eINSTANCE.createBuildingPartPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 BuildingFactory.eINSTANCE.createIntBuildingInstallationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 BuildingFactory.eINSTANCE.createInteriorFurniturePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 BuildingFactory.eINSTANCE.createInteriorRoomPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 BuildingFactory.eINSTANCE.createOpeningPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 CitygmlFactory.eINSTANCE.createAddressPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 GmlFactory.eINSTANCE.createAssociationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 TransportationFactory.eINSTANCE.createTrafficAreaPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 ReliefFactory.eINSTANCE.createGridPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 ReliefFactory.eINSTANCE.createReliefComponentPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 ReliefFactory.eINSTANCE.createTinPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
					 WaterbodyFactory.eINSTANCE.createBoundedByWaterSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Ring1(),
					 GmlFactory.eINSTANCE.createRingType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit(),
					 GmlFactory.eINSTANCE.createConversionToPreferredUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RowIndex(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Scope(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SecondDefiningParameter(),
					 GmlFactory.eINSTANCE.createSecondDefiningParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Seconds(),
					 GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getArcSecondsType(), "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Segments(),
					 GmlFactory.eINSTANCE.createCurveSegmentArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef(),
					 GmlFactory.eINSTANCE.createSingleOperationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Solid1(),
					 GmlFactory.eINSTANCE.createSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty(),
					 GmlFactory.eINSTANCE.createSolidArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SolidMember(),
					 GmlFactory.eINSTANCE.createSolidPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers(),
					 GmlFactory.eINSTANCE.createSolidArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty(),
					 GmlFactory.eINSTANCE.createSolidPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS(),
					 GmlFactory.eINSTANCE.createCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SourceDimensions(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Sphere(),
					 GmlFactory.eINSTANCE.createSphereType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(),
					 GmlFactory.eINSTANCE.createSphericalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef(),
					 GmlFactory.eINSTANCE.createSphericalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsID(),
					 GmlFactory.eINSTANCE.createIdentifierType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Status(),
					 GmlFactory.eINSTANCE.createStringOrRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_StringValue(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Style1(),
					 GmlFactory.eINSTANCE.createStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SubComplex(),
					 GmlFactory.eINSTANCE.createTopoComplexMemberType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Subject(),
					 GmlFactory.eINSTANCE.createTargetPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Target(),
					 GmlFactory.eINSTANCE.createTargetPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex(),
					 GmlFactory.eINSTANCE.createTopoComplexMemberType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty(),
					 GmlFactory.eINSTANCE.createSurfaceArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember(),
					 GmlFactory.eINSTANCE.createSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers(),
					 GmlFactory.eINSTANCE.createSurfaceArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty(),
					 GmlFactory.eINSTANCE.createSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Symbol(),
					 GmlFactory.eINSTANCE.createSymbolType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS(),
					 GmlFactory.eINSTANCE.createCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TargetDimensions(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS(),
					 GmlFactory.eINSTANCE.createTemporalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRSRef(),
					 GmlFactory.eINSTANCE.createTemporalCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(),
					 GmlFactory.eINSTANCE.createTemporalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef(),
					 GmlFactory.eINSTANCE.createTemporalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum(),
					 GmlFactory.eINSTANCE.createTemporalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef(),
					 GmlFactory.eINSTANCE.createTemporalDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent(),
					 GmlFactory.eINSTANCE.createTimePeriodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar(),
					 GmlFactory.eINSTANCE.createTimeCalendarType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra(),
					 GmlFactory.eINSTANCE.createTimeCalendarEraType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock(),
					 GmlFactory.eINSTANCE.createTimeClockType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem(),
					 GmlFactory.eINSTANCE.createTimeCoordinateSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeEdge(),
					 GmlFactory.eINSTANCE.createTimeEdgeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeInstant(),
					 GmlFactory.eINSTANCE.createTimeInstantType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(),
					 GmlFactory.eINSTANCE.createTimeIntervalLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeNode(),
					 GmlFactory.eINSTANCE.createTimeNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra(),
					 GmlFactory.eINSTANCE.createTimeOrdinalEraType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem(),
					 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod(),
					 GmlFactory.eINSTANCE.createTimePeriodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimePosition(),
					 GmlFactory.eINSTANCE.createTimePositionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyComplex(),
					 GmlFactory.eINSTANCE.createTimeTopologyComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Tin(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplex(),
					 GmlFactory.eINSTANCE.createTopoComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty(),
					 GmlFactory.eINSTANCE.createTopoComplexMemberType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurve(),
					 GmlFactory.eINSTANCE.createTopoCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurveProperty(),
					 GmlFactory.eINSTANCE.createTopoCurvePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle(),
					 GmlFactory.eINSTANCE.createTopologyStylePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle1(),
					 GmlFactory.eINSTANCE.createTopologyStyleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoPoint(),
					 GmlFactory.eINSTANCE.createTopoPointType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoPointProperty(),
					 GmlFactory.eINSTANCE.createTopoPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMember(),
					 GmlFactory.eINSTANCE.createTopoPrimitiveMemberType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMembers(),
					 GmlFactory.eINSTANCE.createTopoPrimitiveArrayAssociationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoSolid(),
					 GmlFactory.eINSTANCE.createTopoSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurface(),
					 GmlFactory.eINSTANCE.createTopoSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurfaceProperty(),
					 GmlFactory.eINSTANCE.createTopoSurfacePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolume(),
					 GmlFactory.eINSTANCE.createTopoVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolumeProperty(),
					 GmlFactory.eINSTANCE.createTopoVolumePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Track(),
					 GmlFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Transformation(),
					 GmlFactory.eINSTANCE.createTransformationType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TransformationRef(),
					 GmlFactory.eINSTANCE.createTransformationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Triangle(),
					 GmlFactory.eINSTANCE.createTriangleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches(),
					 GmlFactory.eINSTANCE.createTrianglePatchArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TupleList(),
					 GmlFactory.eINSTANCE.createCoordinatesType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(),
					 GmlFactory.eINSTANCE.createUnitOfMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(),
					 GmlFactory.eINSTANCE.createConversionToPreferredUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(),
					 GmlFactory.eINSTANCE.createDerivationUnitTermType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(),
					 GmlFactory.eINSTANCE.createUserDefinedCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCSRef(),
					 GmlFactory.eINSTANCE.createUserDefinedCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS(),
					 GmlFactory.eINSTANCE.createCartesianCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesCS(),
					 GmlFactory.eINSTANCE.createCoordinateSystemRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid(),
					 GmlFactory.eINSTANCE.createEllipsoidRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum(),
					 GmlFactory.eINSTANCE.createEngineeringDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum(),
					 GmlFactory.eINSTANCE.createGeodeticDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum(),
					 GmlFactory.eINSTANCE.createImageDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod(),
					 GmlFactory.eINSTANCE.createOperationMethodRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation(),
					 GmlFactory.eINSTANCE.createOperationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter(),
					 GmlFactory.eINSTANCE.createAbstractGeneralOperationParameterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian(),
					 GmlFactory.eINSTANCE.createPrimeMeridianRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation(),
					 GmlFactory.eINSTANCE.createSingleOperationRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS(),
					 GmlFactory.eINSTANCE.createSphericalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS(),
					 GmlFactory.eINSTANCE.createTemporalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum(),
					 GmlFactory.eINSTANCE.createTemporalDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesValue(),
					 GmlFactory.eINSTANCE.createParameterValueType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS(),
					 GmlFactory.eINSTANCE.createVerticalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum(),
					 GmlFactory.eINSTANCE.createVerticalDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Using(),
					 GmlFactory.eINSTANCE.createFeaturePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Using(),
					 AppearanceFactory.eINSTANCE.createAppearancePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValidArea(),
					 GmlFactory.eINSTANCE.createExtentType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime(),
					 GmlFactory.eINSTANCE.createTimePrimitivePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime(),
					 GmlFactory.eINSTANCE.createRelatedTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createAngleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createGridLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createScaleType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createSpeedType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createTimeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
					 GmlFactory.eINSTANCE.createVolumeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray(),
					 GmlFactory.eINSTANCE.createValueArrayType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
					 GmlFactory.eINSTANCE.createValuePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
					 GmlFactory.eINSTANCE.createBooleanPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
					 GmlFactory.eINSTANCE.createCategoryPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
					 GmlFactory.eINSTANCE.createCountPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
					 GmlFactory.eINSTANCE.createQuantityPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
					 GmlFactory.eINSTANCE.createScalarValuePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponents(),
					 GmlFactory.eINSTANCE.createValueArrayPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueFile(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueList(),
					 GmlFactory.eINSTANCE.createMeasureListType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter(),
					 GmlFactory.eINSTANCE.createOperationParameterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
					 GmlFactory.eINSTANCE.createValuePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
					 GmlFactory.eINSTANCE.createBooleanPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
					 GmlFactory.eINSTANCE.createCategoryPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
					 GmlFactory.eINSTANCE.createCountPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
					 GmlFactory.eINSTANCE.createQuantityPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
					 GmlFactory.eINSTANCE.createScalarValuePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValuesOfGroup(),
					 GmlFactory.eINSTANCE.createOperationParameterGroupRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Vector(),
					 GmlFactory.eINSTANCE.createVectorType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Version(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS(),
					 GmlFactory.eINSTANCE.createVerticalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRSRef(),
					 GmlFactory.eINSTANCE.createVerticalCRSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(),
					 GmlFactory.eINSTANCE.createVerticalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef(),
					 GmlFactory.eINSTANCE.createVerticalCSRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum(),
					 GmlFactory.eINSTANCE.createVerticalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef(),
					 GmlFactory.eINSTANCE.createVerticalDatumRefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent(),
					 GmlFactory.eINSTANCE.createEnvelopeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent(),
					 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__APPEARANCE1,
					 TexturedsurfaceFactory.eINSTANCE.createAppearancePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__MATERIAL,
					 TexturedsurfaceFactory.eINSTANCE.createMaterialType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__SIMPLE_TEXTURE,
					 TexturedsurfaceFactory.eINSTANCE.createSimpleTextureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE,
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE,
					 AppearanceFactory.eINSTANCE.createAppearancePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER,
					 AppearanceFactory.eINSTANCE.createAppearancePropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE,
					 AppearanceFactory.eINSTANCE.createGeoreferencedTextureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE,
					 AppearanceFactory.eINSTANCE.createParameterizedTextureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_GEN,
					 AppearanceFactory.eINSTANCE.createTexCoordGenType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_LIST,
					 AppearanceFactory.eINSTANCE.createTexCoordListType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(AppearancePackage.Literals.DOCUMENT_ROOT__X3_DMATERIAL,
					 AppearanceFactory.eINSTANCE.createX3DMaterialType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTransportationComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
					 TransportationFactory.eINSTANCE.createTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA,
					 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createTransportationComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createRailwayType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD,
					 TransportationFactory.eINSTANCE.createRoadType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE,
					 TransportationFactory.eINSTANCE.createSquareType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK,
					 TransportationFactory.eINSTANCE.createTrackType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA,
					 TransportationFactory.eINSTANCE.createTrafficAreaType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF,
					 ReliefFactory.eINSTANCE.createBreaklineReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION,
					 GmlFactory.eINSTANCE.createLengthType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF,
					 ReliefFactory.eINSTANCE.createMassPointReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF,
					 ReliefFactory.eINSTANCE.createRasterReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE,
					 ReliefFactory.eINSTANCE.createReliefFeatureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF,
					 ReliefFactory.eINSTANCE.createTINReliefType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(CityfurniturePackage.Literals.DOCUMENT_ROOT__CITY_FURNITURE,
					 CityfurnitureFactory.eINSTANCE.createCityFurnitureType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(CityobjectgroupPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_GROUP,
					 CityobjectgroupFactory.eINSTANCE.createCityObjectGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(LandusePackage.Literals.DOCUMENT_ROOT__LAND_USE,
					 LanduseFactory.eINSTANCE.createLandUseType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createPlantCoverType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createSolitaryVegetationObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER,
					 VegetationFactory.eINSTANCE.createPlantCoverType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT,
					 VegetationFactory.eINSTANCE.createSolitaryVegetationObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT,
					 WaterbodyFactory.eINSTANCE.createWaterBodyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY,
					 WaterbodyFactory.eINSTANCE.createWaterBodyType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterClosureSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_GROUND_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterGroundSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_SURFACE,
					 WaterbodyFactory.eINSTANCE.createWaterSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__DATE_ATTRIBUTE,
					 GenericsFactory.eINSTANCE.createDateAttributeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE,
					 GenericsFactory.eINSTANCE.createDoubleAttributeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_CITY_OBJECT,
					 GenericsFactory.eINSTANCE.createGenericCityObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__INT_ATTRIBUTE,
					 GenericsFactory.eINSTANCE.createIntAttributeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__STRING_ATTRIBUTE,
					 GenericsFactory.eINSTANCE.createStringAttributeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(GenericsPackage.Literals.DOCUMENT_ROOT__URI_ATTRIBUTE,
					 GenericsFactory.eINSTANCE.createUriAttributeType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(Smil20Package.Literals.DOCUMENT_ROOT__ANIMATE,
					 LanguageFactory.eINSTANCE.createAnimateType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(Smil20Package.Literals.DOCUMENT_ROOT__ANIMATE_COLOR,
					 LanguageFactory.eINSTANCE.createAnimateColorType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(Smil20Package.Literals.DOCUMENT_ROOT__ANIMATE_MOTION,
					 LanguageFactory.eINSTANCE.createAnimateMotionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(Smil20Package.Literals.DOCUMENT_ROOT__SET,
					 LanguageFactory.eINSTANCE.createSetType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(LanguagePackage.Literals.DOCUMENT_ROOT__ANIMATE,
					 LanguageFactory.eINSTANCE.createAnimateType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(LanguagePackage.Literals.DOCUMENT_ROOT__ANIMATE_COLOR,
					 LanguageFactory.eINSTANCE.createAnimateColorType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(LanguagePackage.Literals.DOCUMENT_ROOT__ANIMATE_MOTION,
					 LanguageFactory.eINSTANCE.createAnimateMotionType())));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDependentLocalityType_Any(),
				 FeatureMapUtil.createEntry
					(LanguagePackage.Literals.DOCUMENT_ROOT__SET,
					 LanguageFactory.eINSTANCE.createSetType())));
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
			childFeature == CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_MEMBER ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Using() ||
			childFeature == AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE ||
			childFeature == AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER ||
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
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Transformation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Category() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Name() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CsName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DatumName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GroupName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeridianName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Angle() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Measure() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Quantity() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Result() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Value() ||
			childFeature == ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Arc() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcString() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Circle() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AxisID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CsID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DatumID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GroupID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeridianID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Bezier() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BSpline() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Envelope() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Polygon() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CategoryList() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CenterOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointRep() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Position() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueArray() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Coordinates() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TupleList() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CrsRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DataSource() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Description() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LocationString() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MappingRule() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_QuantityType() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Remarks() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Status() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Observation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DomainSet() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GridDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Exterior() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Interior() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Geodesic() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Grid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GridFunction() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IndexMap() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_History() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Track() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Location() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SubComplex() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Member() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ResultOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface() ||
			childFeature == TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Patches() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Surface1() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Tin() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_QuantityList() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Subject() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Target() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty() ||
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
			childFeature == WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY ||
			childFeature == Smil20Package.Literals.DOCUMENT_ROOT__ANIMATE ||
			childFeature == LanguagePackage.Literals.DOCUMENT_ROOT__ANIMATE ||
			childFeature == Smil20Package.Literals.DOCUMENT_ROOT__ANIMATE_COLOR ||
			childFeature == LanguagePackage.Literals.DOCUMENT_ROOT__ANIMATE_COLOR ||
			childFeature == Smil20Package.Literals.DOCUMENT_ROOT__ANIMATE_MOTION ||
			childFeature == LanguagePackage.Literals.DOCUMENT_ROOT__ANIMATE_MOTION ||
			childFeature == Smil20Package.Literals.DOCUMENT_ROOT__SET ||
			childFeature == LanguagePackage.Literals.DOCUMENT_ROOT__SET;

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
