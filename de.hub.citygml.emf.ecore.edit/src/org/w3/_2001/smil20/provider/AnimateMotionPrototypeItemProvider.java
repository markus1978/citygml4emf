/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3._2001.smil20.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.w3._2001.smil20.AccumulateType;
import org.w3._2001.smil20.AnimateMotionPrototype;
import org.w3._2001.smil20.Smil20Package;

/**
 * This is the item provider adapter for a {@link org.w3._2001.smil20.AnimateMotionPrototype} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnimateMotionPrototypeItemProvider
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
	public AnimateMotionPrototypeItemProvider(AdapterFactory adapterFactory) {
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

			addAccumulatePropertyDescriptor(object);
			addAdditivePropertyDescriptor(object);
			addByPropertyDescriptor(object);
			addFromPropertyDescriptor(object);
			addOriginPropertyDescriptor(object);
			addToPropertyDescriptor(object);
			addValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Accumulate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccumulatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnimateMotionPrototype_accumulate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnimateMotionPrototype_accumulate_feature", "_UI_AnimateMotionPrototype_type"),
				 Smil20Package.Literals.ANIMATE_MOTION_PROTOTYPE__ACCUMULATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Additive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnimateMotionPrototype_additive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnimateMotionPrototype_additive_feature", "_UI_AnimateMotionPrototype_type"),
				 Smil20Package.Literals.ANIMATE_MOTION_PROTOTYPE__ADDITIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnimateMotionPrototype_by_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnimateMotionPrototype_by_feature", "_UI_AnimateMotionPrototype_type"),
				 Smil20Package.Literals.ANIMATE_MOTION_PROTOTYPE__BY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnimateMotionPrototype_from_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnimateMotionPrototype_from_feature", "_UI_AnimateMotionPrototype_type"),
				 Smil20Package.Literals.ANIMATE_MOTION_PROTOTYPE__FROM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnimateMotionPrototype_origin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnimateMotionPrototype_origin_feature", "_UI_AnimateMotionPrototype_type"),
				 Smil20Package.Literals.ANIMATE_MOTION_PROTOTYPE__ORIGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnimateMotionPrototype_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnimateMotionPrototype_to_feature", "_UI_AnimateMotionPrototype_type"),
				 Smil20Package.Literals.ANIMATE_MOTION_PROTOTYPE__TO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnimateMotionPrototype_values_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnimateMotionPrototype_values_feature", "_UI_AnimateMotionPrototype_type"),
				 Smil20Package.Literals.ANIMATE_MOTION_PROTOTYPE__VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AnimateMotionPrototype.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnimateMotionPrototype"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AccumulateType labelValue = ((AnimateMotionPrototype)object).getAccumulate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AnimateMotionPrototype_type") :
			getString("_UI_AnimateMotionPrototype_type") + " " + label;
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

		switch (notification.getFeatureID(AnimateMotionPrototype.class)) {
			case Smil20Package.ANIMATE_MOTION_PROTOTYPE__ACCUMULATE:
			case Smil20Package.ANIMATE_MOTION_PROTOTYPE__ADDITIVE:
			case Smil20Package.ANIMATE_MOTION_PROTOTYPE__BY:
			case Smil20Package.ANIMATE_MOTION_PROTOTYPE__FROM:
			case Smil20Package.ANIMATE_MOTION_PROTOTYPE__ORIGIN:
			case Smil20Package.ANIMATE_MOTION_PROTOTYPE__TO:
			case Smil20Package.ANIMATE_MOTION_PROTOTYPE__VALUES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
