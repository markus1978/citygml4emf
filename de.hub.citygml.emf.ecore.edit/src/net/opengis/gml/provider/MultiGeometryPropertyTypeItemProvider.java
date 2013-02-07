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
import net.opengis.gml.MultiGeometryPropertyType;

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
 * This is the item provider adapter for a {@link net.opengis.gml.MultiGeometryPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiGeometryPropertyTypeItemProvider
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
	public MultiGeometryPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_MultiGeometryPropertyType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_actuate_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_Actuate(),
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
				 getString("_UI_MultiGeometryPropertyType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_arcrole_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_Arcrole(),
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
				 getString("_UI_MultiGeometryPropertyType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_href_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_Href(),
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
				 getString("_UI_MultiGeometryPropertyType_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_remoteSchema_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_RemoteSchema(),
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
				 getString("_UI_MultiGeometryPropertyType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_role_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_Role(),
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
				 getString("_UI_MultiGeometryPropertyType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_show_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_Show(),
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
				 getString("_UI_MultiGeometryPropertyType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_title_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_Title(),
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
				 getString("_UI_MultiGeometryPropertyType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MultiGeometryPropertyType_type_feature", "_UI_MultiGeometryPropertyType_type"),
				 GmlPackage.eINSTANCE.getMultiGeometryPropertyType_Type(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup());
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
	 * This returns MultiGeometryPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MultiGeometryPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActuateType labelValue = ((MultiGeometryPropertyType)object).getActuate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_MultiGeometryPropertyType_type") :
			getString("_UI_MultiGeometryPropertyType_type") + " " + label;
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

		switch (notification.getFeatureID(MultiGeometryPropertyType.class)) {
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__ACTUATE:
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__ARCROLE:
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__HREF:
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__REMOTE_SCHEMA:
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__ROLE:
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__SHOW:
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__TITLE:
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.MULTI_GEOMETRY_PROPERTY_TYPE__GEOMETRIC_AGGREGATE_GROUP:
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
				(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(),
					 GmlFactory.eINSTANCE.createMultiCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(),
					 GmlFactory.eINSTANCE.createMultiGeometryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(),
					 GmlFactory.eINSTANCE.createMultiLineStringType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(),
					 GmlFactory.eINSTANCE.createMultiPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(),
					 GmlFactory.eINSTANCE.createMultiPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(),
					 GmlFactory.eINSTANCE.createMultiSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getMultiGeometryPropertyType_GeometricAggregateGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(),
					 GmlFactory.eINSTANCE.createMultiSurfaceType())));
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
