/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.BuildingFactory;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.DocumentRoot;

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
 * This is the item provider adapter for a {@link net.opengis.citygml.building.DocumentRoot} object.
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
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__ABSTRACT_BUILDING);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__BOUNDARY_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__OPENING);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE);
			childrenFeatures.add(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW);
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
			case BuildingPackage.DOCUMENT_ROOT__ABSTRACT_BUILDING:
			case BuildingPackage.DOCUMENT_ROOT__BOUNDARY_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW:
			case BuildingPackage.DOCUMENT_ROOT__OPENING:
			case BuildingPackage.DOCUMENT_ROOT__BUILDING:
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_FURNITURE:
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_INSTALLATION:
			case BuildingPackage.DOCUMENT_ROOT__BUILDING_PART:
			case BuildingPackage.DOCUMENT_ROOT__CEILING_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__CLOSURE_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__DOOR:
			case BuildingPackage.DOCUMENT_ROOT__FLOOR_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__GROUND_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION:
			case BuildingPackage.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__ROOF_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__ROOM:
			case BuildingPackage.DOCUMENT_ROOT__WALL_SURFACE:
			case BuildingPackage.DOCUMENT_ROOT__WINDOW:
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
				(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING,
				 BuildingFactory.eINSTANCE.createBuildingType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE,
				 BuildingFactory.eINSTANCE.createBuildingFurnitureType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_INSTALLATION,
				 BuildingFactory.eINSTANCE.createBuildingInstallationType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_PART,
				 BuildingFactory.eINSTANCE.createBuildingPartType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__CEILING_SURFACE,
				 BuildingFactory.eINSTANCE.createCeilingSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__CLOSURE_SURFACE,
				 BuildingFactory.eINSTANCE.createClosureSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__DOOR,
				 BuildingFactory.eINSTANCE.createDoorType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__FLOOR_SURFACE,
				 BuildingFactory.eINSTANCE.createFloorSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__GROUND_SURFACE,
				 BuildingFactory.eINSTANCE.createGroundSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__INT_BUILDING_INSTALLATION,
				 BuildingFactory.eINSTANCE.createIntBuildingInstallationType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__INTERIOR_WALL_SURFACE,
				 BuildingFactory.eINSTANCE.createInteriorWallSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__ROOF_SURFACE,
				 BuildingFactory.eINSTANCE.createRoofSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__ROOM,
				 BuildingFactory.eINSTANCE.createRoomType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__WALL_SURFACE,
				 BuildingFactory.eINSTANCE.createWallSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(BuildingPackage.Literals.DOCUMENT_ROOT__WINDOW,
				 BuildingFactory.eINSTANCE.createWindowType()));
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
