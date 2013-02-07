/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.appearance.AppearanceFactory;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.DocumentRoot;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.citygml.appearance.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__SURFACE_DATA);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__TEXTURE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_GEN);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_LIST);
			childrenFeatures.add(AppearancePackage.Literals.DOCUMENT_ROOT__X3_DMATERIAL);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION:
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL:
			case AppearancePackage.DOCUMENT_ROOT__SURFACE_DATA:
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE:
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION:
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE:
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE_MEMBER:
			case AppearancePackage.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE:
			case AppearancePackage.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE:
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_GEN:
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_LIST:
			case AppearancePackage.DOCUMENT_ROOT__X3_DMATERIAL:
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
				(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE,
				 AppearanceFactory.eINSTANCE.createAppearancePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER,
				 AppearanceFactory.eINSTANCE.createAppearancePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(AppearancePackage.Literals.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE,
				 AppearanceFactory.eINSTANCE.createGeoreferencedTextureType()));

		newChildDescriptors.add
			(createChildParameter
				(AppearancePackage.Literals.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE,
				 AppearanceFactory.eINSTANCE.createParameterizedTextureType()));

		newChildDescriptors.add
			(createChildParameter
				(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_GEN,
				 AppearanceFactory.eINSTANCE.createTexCoordGenType()));

		newChildDescriptors.add
			(createChildParameter
				(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_LIST,
				 AppearanceFactory.eINSTANCE.createTexCoordListType()));

		newChildDescriptors.add
			(createChildParameter
				(AppearancePackage.Literals.DOCUMENT_ROOT__X3_DMATERIAL,
				 AppearanceFactory.eINSTANCE.createX3DMaterialType()));
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

		boolean qualify =
			childFeature == AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE ||
			childFeature == AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER;

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
