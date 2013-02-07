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

import net.opengis.gml.GeometricComplexPropertyType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

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

import org.w3._1999.xlink.ActuateType;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.GeometricComplexPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometricComplexPropertyTypeItemProvider
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
	public GeometricComplexPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_GeometricComplexPropertyType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_actuate_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_Actuate(),
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
				 getString("_UI_GeometricComplexPropertyType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_arcrole_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_Arcrole(),
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
				 getString("_UI_GeometricComplexPropertyType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_href_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_Href(),
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
				 getString("_UI_GeometricComplexPropertyType_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_remoteSchema_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_RemoteSchema(),
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
				 getString("_UI_GeometricComplexPropertyType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_role_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_Role(),
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
				 getString("_UI_GeometricComplexPropertyType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_show_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_Show(),
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
				 getString("_UI_GeometricComplexPropertyType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_title_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_Title(),
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
				 getString("_UI_GeometricComplexPropertyType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeometricComplexPropertyType_type_feature", "_UI_GeometricComplexPropertyType_type"),
				 GmlPackage.eINSTANCE.getGeometricComplexPropertyType_Type(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_GeometricComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_CompositeCurve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_CompositeSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_CompositeSolid());
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
	 * This returns GeometricComplexPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GeometricComplexPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActuateType labelValue = ((GeometricComplexPropertyType)object).getActuate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_GeometricComplexPropertyType_type") :
			getString("_UI_GeometricComplexPropertyType_type") + " " + label;
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

		switch (notification.getFeatureID(GeometricComplexPropertyType.class)) {
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ACTUATE:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ARCROLE:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__HREF:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__REMOTE_SCHEMA:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ROLE:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__SHOW:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TITLE:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE:
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID:
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
				(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_GeometricComplex(),
				 GmlFactory.eINSTANCE.createGeometricComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_CompositeCurve(),
				 GmlFactory.eINSTANCE.createCompositeCurveType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_CompositeSurface(),
				 GmlFactory.eINSTANCE.createCompositeSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getGeometricComplexPropertyType_CompositeSolid(),
				 GmlFactory.eINSTANCE.createCompositeSolidType()));
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
