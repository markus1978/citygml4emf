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

import net.opengis.gml.CoordinateSystemRefType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link net.opengis.gml.CoordinateSystemRefType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinateSystemRefTypeItemProvider
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
	public CoordinateSystemRefTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_CoordinateSystemRefType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_actuate_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_Actuate(),
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
				 getString("_UI_CoordinateSystemRefType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_arcrole_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_Arcrole(),
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
				 getString("_UI_CoordinateSystemRefType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_href_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_Href(),
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
				 getString("_UI_CoordinateSystemRefType_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_remoteSchema_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_RemoteSchema(),
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
				 getString("_UI_CoordinateSystemRefType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_role_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_Role(),
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
				 getString("_UI_CoordinateSystemRefType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_show_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_Show(),
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
				 getString("_UI_CoordinateSystemRefType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_title_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_Title(),
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
				 getString("_UI_CoordinateSystemRefType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemRefType_type_feature", "_UI_CoordinateSystemRefType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemRefType_Type(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup());
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
	 * This returns CoordinateSystemRefType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinateSystemRefType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActuateType labelValue = ((CoordinateSystemRefType)object).getActuate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CoordinateSystemRefType_type") :
			getString("_UI_CoordinateSystemRefType_type") + " " + label;
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

		switch (notification.getFeatureID(CoordinateSystemRefType.class)) {
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__ACTUATE:
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__ARCROLE:
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__HREF:
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__REMOTE_SCHEMA:
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__ROLE:
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__SHOW:
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__TITLE:
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.COORDINATE_SYSTEM_REF_TYPE__COORDINATE_SYSTEM_GROUP:
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
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(),
					 GmlFactory.eINSTANCE.createCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(),
					 GmlFactory.eINSTANCE.createCylindricalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(),
					 GmlFactory.eINSTANCE.createLinearCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(),
					 GmlFactory.eINSTANCE.createPolarCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(),
					 GmlFactory.eINSTANCE.createSphericalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(),
					 GmlFactory.eINSTANCE.createTemporalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(),
					 GmlFactory.eINSTANCE.createUserDefinedCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemRefType_CoordinateSystemGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(),
					 GmlFactory.eINSTANCE.createVerticalCSType())));
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
