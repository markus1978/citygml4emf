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

import net.opengis.gml.CurveSegmentArrayPropertyType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.CurveSegmentArrayPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CurveSegmentArrayPropertyTypeItemProvider
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
	public CurveSegmentArrayPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup());
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
	 * This returns CurveSegmentArrayPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CurveSegmentArrayPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CurveSegmentArrayPropertyType_type");
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

		switch (notification.getFeatureID(CurveSegmentArrayPropertyType.class)) {
			case GmlPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE__CURVE_SEGMENT_GROUP:
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
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Arc(),
					 GmlFactory.eINSTANCE.createArcType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Arc(),
					 GmlFactory.eINSTANCE.createCircleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
					 GmlFactory.eINSTANCE.createArcStringType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
					 GmlFactory.eINSTANCE.createArcType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
					 GmlFactory.eINSTANCE.createCircleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge(),
					 GmlFactory.eINSTANCE.createArcByBulgeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(),
					 GmlFactory.eINSTANCE.createArcStringByBulgeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(),
					 GmlFactory.eINSTANCE.createArcByBulgeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(),
					 GmlFactory.eINSTANCE.createArcByCenterPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(),
					 GmlFactory.eINSTANCE.createCircleByCenterPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Bezier(),
					 GmlFactory.eINSTANCE.createBezierType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(),
					 GmlFactory.eINSTANCE.createBSplineType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(),
					 GmlFactory.eINSTANCE.createBezierType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Circle(),
					 GmlFactory.eINSTANCE.createCircleType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint(),
					 GmlFactory.eINSTANCE.createCircleByCenterPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Clothoid(),
					 GmlFactory.eINSTANCE.createClothoidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CubicSpline(),
					 GmlFactory.eINSTANCE.createCubicSplineType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Geodesic(),
					 GmlFactory.eINSTANCE.createGeodesicType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(),
					 GmlFactory.eINSTANCE.createGeodesicStringType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(),
					 GmlFactory.eINSTANCE.createGeodesicType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LineStringSegment(),
					 GmlFactory.eINSTANCE.createLineStringSegmentType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCurveSegmentArrayPropertyType_CurveSegmentGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OffsetCurve(),
					 GmlFactory.eINSTANCE.createOffsetCurveType())));
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
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Arc() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcString() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Circle() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Bezier() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BSpline() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Geodesic() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString();

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
