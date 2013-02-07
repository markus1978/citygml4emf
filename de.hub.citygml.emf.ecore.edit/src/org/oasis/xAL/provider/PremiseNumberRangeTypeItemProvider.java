/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.oasis.xAL.PremiseNumberRangeType;
import org.oasis.xAL.XALFactory;
import org.oasis.xAL.XALPackage;

/**
 * This is the item provider adapter for a {@link org.oasis.xAL.PremiseNumberRangeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PremiseNumberRangeTypeItemProvider
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
	public PremiseNumberRangeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIndicatorPropertyDescriptor(object);
			addIndicatorOccurencePropertyDescriptor(object);
			addNumberRangeOccurencePropertyDescriptor(object);
			addRangeTypePropertyDescriptor(object);
			addSeparatorPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_PremiseNumberRangeType_indicator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PremiseNumberRangeType_indicator_feature", "_UI_PremiseNumberRangeType_type"),
				 XALPackage.eINSTANCE.getPremiseNumberRangeType_Indicator(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indicator Occurence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndicatorOccurencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PremiseNumberRangeType_indicatorOccurence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PremiseNumberRangeType_indicatorOccurence_feature", "_UI_PremiseNumberRangeType_type"),
				 XALPackage.eINSTANCE.getPremiseNumberRangeType_IndicatorOccurence(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Range Occurence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberRangeOccurencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PremiseNumberRangeType_numberRangeOccurence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PremiseNumberRangeType_numberRangeOccurence_feature", "_UI_PremiseNumberRangeType_type"),
				 XALPackage.eINSTANCE.getPremiseNumberRangeType_NumberRangeOccurence(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PremiseNumberRangeType_rangeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PremiseNumberRangeType_rangeType_feature", "_UI_PremiseNumberRangeType_type"),
				 XALPackage.eINSTANCE.getPremiseNumberRangeType_RangeType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Separator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeparatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PremiseNumberRangeType_separator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PremiseNumberRangeType_separator_feature", "_UI_PremiseNumberRangeType_type"),
				 XALPackage.eINSTANCE.getPremiseNumberRangeType_Separator(),
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
				 getString("_UI_PremiseNumberRangeType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PremiseNumberRangeType_type_feature", "_UI_PremiseNumberRangeType_type"),
				 XALPackage.eINSTANCE.getPremiseNumberRangeType_Type(),
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
			childrenFeatures.add(XALPackage.eINSTANCE.getPremiseNumberRangeType_PremiseNumberRangeFrom());
			childrenFeatures.add(XALPackage.eINSTANCE.getPremiseNumberRangeType_PremiseNumberRangeTo());
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
	 * This returns PremiseNumberRangeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PremiseNumberRangeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((PremiseNumberRangeType)object).getIndicator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PremiseNumberRangeType_type") :
			getString("_UI_PremiseNumberRangeType_type") + " " + label;
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

		switch (notification.getFeatureID(PremiseNumberRangeType.class)) {
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR:
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__INDICATOR_OCCURENCE:
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__NUMBER_RANGE_OCCURENCE:
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__RANGE_TYPE:
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__SEPARATOR:
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_FROM:
			case XALPackage.PREMISE_NUMBER_RANGE_TYPE__PREMISE_NUMBER_RANGE_TO:
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
				(XALPackage.eINSTANCE.getPremiseNumberRangeType_PremiseNumberRangeFrom(),
				 XALFactory.eINSTANCE.createPremiseNumberRangeFromType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getPremiseNumberRangeType_PremiseNumberRangeTo(),
				 XALFactory.eINSTANCE.createPremiseNumberRangeToType()));
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
