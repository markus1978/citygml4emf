/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.RangeParametersType;

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

/**
 * This is the item provider adapter for a {@link net.opengis.gml.RangeParametersType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeParametersTypeItemProvider
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
	public RangeParametersTypeItemProvider(AdapterFactory adapterFactory) {
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
			addActuatePropertyDescriptor(object);
			addArcrolePropertyDescriptor(object);
			addHrefPropertyDescriptor(object);
			addRemoteSchemaPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addShowPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
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
				 getString("_UI_RangeParametersType_boolean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_boolean_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Boolean(),
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
				 getString("_UI_RangeParametersType_count_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_count_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Count(),
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
				 getString("_UI_RangeParametersType_booleanList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_booleanList_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_BooleanList(),
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
				 getString("_UI_RangeParametersType_countList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_countList_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_CountList(),
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
				 getString("_UI_RangeParametersType_countExtent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_countExtent_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_CountExtent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_RangeParametersType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_actuate_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Actuate(),
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
				 getString("_UI_RangeParametersType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_arcrole_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Arcrole(),
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
				 getString("_UI_RangeParametersType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_href_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Href(),
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
				 getString("_UI_RangeParametersType_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_remoteSchema_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_RemoteSchema(),
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
				 getString("_UI_RangeParametersType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_role_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Role(),
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
				 getString("_UI_RangeParametersType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_show_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Show(),
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
				 getString("_UI_RangeParametersType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_title_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Title(),
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
				 getString("_UI_RangeParametersType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeParametersType_type_feature", "_UI_RangeParametersType_type"),
				 GmlPackage.eINSTANCE.getRangeParametersType_Type(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getRangeParametersType_Category());
			childrenFeatures.add(GmlPackage.eINSTANCE.getRangeParametersType_Quantity());
			childrenFeatures.add(GmlPackage.eINSTANCE.getRangeParametersType_CategoryList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getRangeParametersType_QuantityList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getRangeParametersType_CategoryExtent());
			childrenFeatures.add(GmlPackage.eINSTANCE.getRangeParametersType_QuantityExtent());
			childrenFeatures.add(GmlPackage.eINSTANCE.getRangeParametersType_CompositeValueGroup());
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
	 * This returns RangeParametersType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RangeParametersType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RangeParametersType rangeParametersType = (RangeParametersType)object;
		return getString("_UI_RangeParametersType_type") + " " + rangeParametersType.isBoolean();
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

		switch (notification.getFeatureID(RangeParametersType.class)) {
			case GmlPackage.RANGE_PARAMETERS_TYPE__BOOLEAN:
			case GmlPackage.RANGE_PARAMETERS_TYPE__COUNT:
			case GmlPackage.RANGE_PARAMETERS_TYPE__BOOLEAN_LIST:
			case GmlPackage.RANGE_PARAMETERS_TYPE__COUNT_LIST:
			case GmlPackage.RANGE_PARAMETERS_TYPE__COUNT_EXTENT:
			case GmlPackage.RANGE_PARAMETERS_TYPE__ACTUATE:
			case GmlPackage.RANGE_PARAMETERS_TYPE__ARCROLE:
			case GmlPackage.RANGE_PARAMETERS_TYPE__HREF:
			case GmlPackage.RANGE_PARAMETERS_TYPE__REMOTE_SCHEMA:
			case GmlPackage.RANGE_PARAMETERS_TYPE__ROLE:
			case GmlPackage.RANGE_PARAMETERS_TYPE__SHOW:
			case GmlPackage.RANGE_PARAMETERS_TYPE__TITLE:
			case GmlPackage.RANGE_PARAMETERS_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.RANGE_PARAMETERS_TYPE__CATEGORY:
			case GmlPackage.RANGE_PARAMETERS_TYPE__QUANTITY:
			case GmlPackage.RANGE_PARAMETERS_TYPE__CATEGORY_LIST:
			case GmlPackage.RANGE_PARAMETERS_TYPE__QUANTITY_LIST:
			case GmlPackage.RANGE_PARAMETERS_TYPE__CATEGORY_EXTENT:
			case GmlPackage.RANGE_PARAMETERS_TYPE__QUANTITY_EXTENT:
			case GmlPackage.RANGE_PARAMETERS_TYPE__COMPOSITE_VALUE_GROUP:
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
				(GmlPackage.eINSTANCE.getRangeParametersType_Category(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Category(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Category(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Category(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_Quantity(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_CategoryList(),
				 GmlFactory.eINSTANCE.createCodeOrNullListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_CategoryList(),
				 GmlFactory.eINSTANCE.createCategoryExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_QuantityList(),
				 GmlFactory.eINSTANCE.createMeasureOrNullListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_QuantityList(),
				 GmlFactory.eINSTANCE.createQuantityExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_CategoryExtent(),
				 GmlFactory.eINSTANCE.createCategoryExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_QuantityExtent(),
				 GmlFactory.eINSTANCE.createQuantityExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_CompositeValueGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getRangeParametersType_CompositeValue(),
					 GmlFactory.eINSTANCE.createCompositeValueType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_CompositeValueGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getRangeParametersType_CompositeValue(),
					 GmlFactory.eINSTANCE.createValueArrayType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getRangeParametersType_CompositeValueGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray(),
					 GmlFactory.eINSTANCE.createValueArrayType())));
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
			childFeature == GmlPackage.eINSTANCE.getRangeParametersType_CategoryList() ||
			childFeature == GmlPackage.eINSTANCE.getRangeParametersType_CategoryExtent() ||
			childFeature == GmlPackage.eINSTANCE.getRangeParametersType_QuantityList() ||
			childFeature == GmlPackage.eINSTANCE.getRangeParametersType_QuantityExtent() ||
			childFeature == GmlPackage.eINSTANCE.getRangeParametersType_CompositeValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueArray();

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
