/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.citygml.transportation.DocumentRoot;
import net.opengis.citygml.transportation.TransportationFactory;
import net.opengis.citygml.transportation.TransportationPackage;

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
 * This is the item provider adapter for a {@link net.opengis.citygml.transportation.DocumentRoot} object.
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
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK);
			childrenFeatures.add(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA);
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
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA:
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY:
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD:
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE:
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK:
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA:
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX:
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT:
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_OBJECT:
			case TransportationPackage.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA:
			case TransportationPackage.DOCUMENT_ROOT__RAILWAY:
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX:
			case TransportationPackage.DOCUMENT_ROOT__ROAD:
			case TransportationPackage.DOCUMENT_ROOT__SQUARE:
			case TransportationPackage.DOCUMENT_ROOT__TRACK:
			case TransportationPackage.DOCUMENT_ROOT__TRAFFIC_AREA:
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
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
				 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
				 TransportationFactory.eINSTANCE.createTransportationComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
				 TransportationFactory.eINSTANCE.createRailwayType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
				 TransportationFactory.eINSTANCE.createRoadType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
				 TransportationFactory.eINSTANCE.createSquareType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
				 TransportationFactory.eINSTANCE.createTrackType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT,
				 TransportationFactory.eINSTANCE.createTrafficAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA,
				 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY,
				 TransportationFactory.eINSTANCE.createRailwayType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
				 TransportationFactory.eINSTANCE.createTransportationComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
				 TransportationFactory.eINSTANCE.createRailwayType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
				 TransportationFactory.eINSTANCE.createRoadType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
				 TransportationFactory.eINSTANCE.createSquareType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX,
				 TransportationFactory.eINSTANCE.createTrackType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD,
				 TransportationFactory.eINSTANCE.createRoadType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE,
				 TransportationFactory.eINSTANCE.createSquareType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK,
				 TransportationFactory.eINSTANCE.createTrackType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA,
				 TransportationFactory.eINSTANCE.createTrafficAreaType()));
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
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__ROAD ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRACK ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA;

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
