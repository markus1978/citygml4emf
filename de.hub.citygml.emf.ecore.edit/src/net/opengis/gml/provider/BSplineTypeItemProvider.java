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

import net.opengis.gml.BSplineType;
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
 * This is the item provider adapter for a {@link net.opengis.gml.BSplineType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BSplineTypeItemProvider
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
	public BSplineTypeItemProvider(AdapterFactory adapterFactory) {
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
			addIsPolynomialPropertyDescriptor(object);
			addKnotTypePropertyDescriptor(object);
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
				 getString("_UI_BSplineType_degree_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BSplineType_degree_feature", "_UI_BSplineType_type"),
				 GmlPackage.eINSTANCE.getBSplineType_Degree(),
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
				 getString("_UI_BSplineType_interpolation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BSplineType_interpolation_feature", "_UI_BSplineType_type"),
				 GmlPackage.eINSTANCE.getBSplineType_Interpolation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Polynomial feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPolynomialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BSplineType_isPolynomial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BSplineType_isPolynomial_feature", "_UI_BSplineType_type"),
				 GmlPackage.eINSTANCE.getBSplineType_IsPolynomial(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Knot Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKnotTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BSplineType_knotType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BSplineType_knotType_feature", "_UI_BSplineType_type"),
				 GmlPackage.eINSTANCE.getBSplineType_KnotType(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getBSplineType_Group());
			childrenFeatures.add(GmlPackage.eINSTANCE.getBSplineType_PosList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getBSplineType_Coordinates());
			childrenFeatures.add(GmlPackage.eINSTANCE.getBSplineType_Knot());
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
	 * This returns BSplineType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BSplineType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((BSplineType)object).getNumDerivativeInterior();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BSplineType_type") :
			getString("_UI_BSplineType_type") + " " + label;
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

		switch (notification.getFeatureID(BSplineType.class)) {
			case GmlPackage.BSPLINE_TYPE__DEGREE:
			case GmlPackage.BSPLINE_TYPE__INTERPOLATION:
			case GmlPackage.BSPLINE_TYPE__IS_POLYNOMIAL:
			case GmlPackage.BSPLINE_TYPE__KNOT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.BSPLINE_TYPE__GROUP:
			case GmlPackage.BSPLINE_TYPE__POS_LIST:
			case GmlPackage.BSPLINE_TYPE__COORDINATES:
			case GmlPackage.BSPLINE_TYPE__KNOT:
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
				(GmlPackage.eINSTANCE.getBSplineType_Group(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getBSplineType_Pos(),
					 GmlFactory.eINSTANCE.createDirectPositionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getBSplineType_Group(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getBSplineType_PointProperty(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getBSplineType_Group(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getBSplineType_PointRep(),
					 GmlFactory.eINSTANCE.createPointPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getBSplineType_PosList(),
				 GmlFactory.eINSTANCE.createDirectPositionListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getBSplineType_Coordinates(),
				 GmlFactory.eINSTANCE.createCoordinatesType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getBSplineType_Knot(),
				 GmlFactory.eINSTANCE.createKnotPropertyType()));
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
			childFeature == GmlPackage.eINSTANCE.getBSplineType_PointProperty() ||
			childFeature == GmlPackage.eINSTANCE.getBSplineType_PointRep();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
