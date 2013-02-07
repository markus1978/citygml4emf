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

import net.opengis.gml.CubicSplineType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
 * This is the item provider adapter for a {@link net.opengis.gml.CubicSplineType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CubicSplineTypeItemProvider
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
	public CubicSplineTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDegreePropertyDescriptor(object);
			addInterpolationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Degree feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDegreePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CubicSplineType_degree_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CubicSplineType_degree_feature", "_UI_CubicSplineType_type"),
				 GmlPackage.eINSTANCE.getCubicSplineType_Degree(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_CubicSplineType_interpolation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CubicSplineType_interpolation_feature", "_UI_CubicSplineType_type"),
				 GmlPackage.eINSTANCE.getCubicSplineType_Interpolation(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getCubicSplineType_Group());
			childrenFeatures.add(GmlPackage.eINSTANCE.getCubicSplineType_PosList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getCubicSplineType_Coordinates());
			childrenFeatures.add(GmlPackage.eINSTANCE.getCubicSplineType_VectorAtStart());
			childrenFeatures.add(GmlPackage.eINSTANCE.getCubicSplineType_VectorAtEnd());
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
	 * This returns CubicSplineType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CubicSplineType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((CubicSplineType)object).getNumDerivativeInterior();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CubicSplineType_type") :
			getString("_UI_CubicSplineType_type") + " " + label;
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

		switch (notification.getFeatureID(CubicSplineType.class)) {
			case GmlPackage.CUBIC_SPLINE_TYPE__DEGREE:
			case GmlPackage.CUBIC_SPLINE_TYPE__INTERPOLATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.CUBIC_SPLINE_TYPE__GROUP:
			case GmlPackage.CUBIC_SPLINE_TYPE__POS_LIST:
			case GmlPackage.CUBIC_SPLINE_TYPE__COORDINATES:
			case GmlPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_START:
			case GmlPackage.CUBIC_SPLINE_TYPE__VECTOR_AT_END:
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
				(GmlPackage.eINSTANCE.getCubicSplineType_Group(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getCubicSplineType_Pos(),
					 GmlFactory.eINSTANCE.createDirectPositionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCubicSplineType_Group(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getCubicSplineType_PointProperty(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCubicSplineType_Group(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getCubicSplineType_PointRep(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCubicSplineType_PosList(),
				 GmlFactory.eINSTANCE.createDirectPositionListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCubicSplineType_Coordinates(),
				 GmlFactory.eINSTANCE.createCoordinatesType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCubicSplineType_VectorAtStart(),
				 GmlFactory.eINSTANCE.createVectorType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCubicSplineType_VectorAtEnd(),
				 GmlFactory.eINSTANCE.createVectorType()));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == GmlPackage.eINSTANCE.getCubicSplineType_PointProperty() ||
			childFeature == GmlPackage.eINSTANCE.getCubicSplineType_PointRep() ||
			childFeature == GmlPackage.eINSTANCE.getCubicSplineType_VectorAtStart() ||
			childFeature == GmlPackage.eINSTANCE.getCubicSplineType_VectorAtEnd();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
