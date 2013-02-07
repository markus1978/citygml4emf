/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import net.opengis.gml.ArcByCenterPointType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.ArcByCenterPointType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArcByCenterPointTypeItemProvider
	extends AbstractCurveSegmentTypeItemProvider
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
	public ArcByCenterPointTypeItemProvider(AdapterFactory adapterFactory) {
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

			addInterpolationPropertyDescriptor(object);
			addNumArcPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Interpolation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterpolationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArcByCenterPointType_interpolation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcByCenterPointType_interpolation_feature", "_UI_ArcByCenterPointType_type"),
				 GmlPackage.eINSTANCE.getArcByCenterPointType_Interpolation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Arc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumArcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ArcByCenterPointType_numArc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ArcByCenterPointType_numArc_feature", "_UI_ArcByCenterPointType_type"),
				 GmlPackage.eINSTANCE.getArcByCenterPointType_NumArc(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_Pos());
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_PointProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_PointRep());
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_PosList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_Coordinates());
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_Radius());
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_StartAngle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getArcByCenterPointType_EndAngle());
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
	 * This returns ArcByCenterPointType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArcByCenterPointType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((ArcByCenterPointType)object).getNumDerivativeInterior();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ArcByCenterPointType_type") :
			getString("_UI_ArcByCenterPointType_type") + " " + label;
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

		switch (notification.getFeatureID(ArcByCenterPointType.class)) {
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__INTERPOLATION:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__NUM_ARC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__POS:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__POINT_PROPERTY:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__POINT_REP:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__POS_LIST:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__COORDINATES:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__RADIUS:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__START_ANGLE:
			case GmlPackage.ARC_BY_CENTER_POINT_TYPE__END_ANGLE:
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
				(GmlPackage.eINSTANCE.getArcByCenterPointType_Pos(),
				 GmlFactory.eINSTANCE.createDirectPositionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getArcByCenterPointType_PointProperty(),
				 GmlFactory.eINSTANCE.createPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getArcByCenterPointType_PointRep(),
				 GmlFactory.eINSTANCE.createPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getArcByCenterPointType_PosList(),
				 GmlFactory.eINSTANCE.createDirectPositionListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getArcByCenterPointType_Coordinates(),
				 GmlFactory.eINSTANCE.createCoordinatesType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getArcByCenterPointType_Radius(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getArcByCenterPointType_StartAngle(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getArcByCenterPointType_EndAngle(),
				 GmlFactory.eINSTANCE.createAngleType()));
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
			childFeature == GmlPackage.eINSTANCE.getArcByCenterPointType_PointProperty() ||
			childFeature == GmlPackage.eINSTANCE.getArcByCenterPointType_PointRep() ||
			childFeature == GmlPackage.eINSTANCE.getArcByCenterPointType_StartAngle() ||
			childFeature == GmlPackage.eINSTANCE.getArcByCenterPointType_EndAngle();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
