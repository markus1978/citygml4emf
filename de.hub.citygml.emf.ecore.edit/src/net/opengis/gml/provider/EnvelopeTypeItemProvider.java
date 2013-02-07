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

import net.opengis.gml.EnvelopeType;
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

/**
 * This is the item provider adapter for a {@link net.opengis.gml.EnvelopeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvelopeTypeItemProvider
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
	public EnvelopeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAxisLabelsPropertyDescriptor(object);
			addSrsDimensionPropertyDescriptor(object);
			addSrsNamePropertyDescriptor(object);
			addUomLabelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Axis Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxisLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnvelopeType_axisLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnvelopeType_axisLabels_feature", "_UI_EnvelopeType_type"),
				 GmlPackage.eINSTANCE.getEnvelopeType_AxisLabels(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Srs Dimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrsDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnvelopeType_srsDimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnvelopeType_srsDimension_feature", "_UI_EnvelopeType_type"),
				 GmlPackage.eINSTANCE.getEnvelopeType_SrsDimension(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Srs Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSrsNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnvelopeType_srsName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnvelopeType_srsName_feature", "_UI_EnvelopeType_type"),
				 GmlPackage.eINSTANCE.getEnvelopeType_SrsName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uom Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUomLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EnvelopeType_uomLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EnvelopeType_uomLabels_feature", "_UI_EnvelopeType_type"),
				 GmlPackage.eINSTANCE.getEnvelopeType_UomLabels(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getEnvelopeType_LowerCorner());
			childrenFeatures.add(GmlPackage.eINSTANCE.getEnvelopeType_UpperCorner());
			childrenFeatures.add(GmlPackage.eINSTANCE.getEnvelopeType_Coord());
			childrenFeatures.add(GmlPackage.eINSTANCE.getEnvelopeType_Pos());
			childrenFeatures.add(GmlPackage.eINSTANCE.getEnvelopeType_Coordinates());
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
	 * This returns EnvelopeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EnvelopeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EnvelopeType)object).getSrsName();
		return label == null || label.length() == 0 ?
			getString("_UI_EnvelopeType_type") :
			getString("_UI_EnvelopeType_type") + " " + label;
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

		switch (notification.getFeatureID(EnvelopeType.class)) {
			case GmlPackage.ENVELOPE_TYPE__AXIS_LABELS:
			case GmlPackage.ENVELOPE_TYPE__SRS_DIMENSION:
			case GmlPackage.ENVELOPE_TYPE__SRS_NAME:
			case GmlPackage.ENVELOPE_TYPE__UOM_LABELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.ENVELOPE_TYPE__LOWER_CORNER:
			case GmlPackage.ENVELOPE_TYPE__UPPER_CORNER:
			case GmlPackage.ENVELOPE_TYPE__COORD:
			case GmlPackage.ENVELOPE_TYPE__POS:
			case GmlPackage.ENVELOPE_TYPE__COORDINATES:
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
				(GmlPackage.eINSTANCE.getEnvelopeType_LowerCorner(),
				 GmlFactory.eINSTANCE.createDirectPositionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEnvelopeType_UpperCorner(),
				 GmlFactory.eINSTANCE.createDirectPositionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEnvelopeType_Coord(),
				 GmlFactory.eINSTANCE.createCoordType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEnvelopeType_Pos(),
				 GmlFactory.eINSTANCE.createDirectPositionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEnvelopeType_Coordinates(),
				 GmlFactory.eINSTANCE.createCoordinatesType()));
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
			childFeature == GmlPackage.eINSTANCE.getEnvelopeType_LowerCorner() ||
			childFeature == GmlPackage.eINSTANCE.getEnvelopeType_UpperCorner() ||
			childFeature == GmlPackage.eINSTANCE.getEnvelopeType_Pos();

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
