/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.citygml.relief.DocumentRoot;
import net.opengis.citygml.relief.ReliefFactory;
import net.opengis.citygml.relief.ReliefPackage;

import net.opengis.gml.GmlFactory;

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
 * This is the item provider adapter for a {@link net.opengis.citygml.relief.DocumentRoot} object.
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
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_COMPONENT);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE);
			childrenFeatures.add(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF);
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
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF:
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF:
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF:
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT:
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE:
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF:
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_COMPONENT:
			case ReliefPackage.DOCUMENT_ROOT__BREAKLINE_RELIEF:
			case ReliefPackage.DOCUMENT_ROOT__ELEVATION:
			case ReliefPackage.DOCUMENT_ROOT__MASS_POINT_RELIEF:
			case ReliefPackage.DOCUMENT_ROOT__RASTER_RELIEF:
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_FEATURE:
			case ReliefPackage.DOCUMENT_ROOT__TIN_RELIEF:
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
				(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF,
				 ReliefFactory.eINSTANCE.createBreaklineReliefType()));

		newChildDescriptors.add
			(createChildParameter
				(ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION,
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF,
				 ReliefFactory.eINSTANCE.createMassPointReliefType()));

		newChildDescriptors.add
			(createChildParameter
				(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF,
				 ReliefFactory.eINSTANCE.createRasterReliefType()));

		newChildDescriptors.add
			(createChildParameter
				(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE,
				 ReliefFactory.eINSTANCE.createReliefFeatureType()));

		newChildDescriptors.add
			(createChildParameter
				(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF,
				 ReliefFactory.eINSTANCE.createTINReliefType()));
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
