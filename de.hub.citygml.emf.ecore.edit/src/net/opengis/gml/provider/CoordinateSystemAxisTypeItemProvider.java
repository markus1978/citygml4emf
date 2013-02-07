/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.gml.CoordinateSystemAxisType;
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
 * This is the item provider adapter for a {@link net.opengis.gml.CoordinateSystemAxisType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinateSystemAxisTypeItemProvider
	extends CoordinateSystemAxisBaseTypeItemProvider
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
	public CoordinateSystemAxisTypeItemProvider(AdapterFactory adapterFactory) {
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

			addUomPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinateSystemAxisType_uom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinateSystemAxisType_uom_feature", "_UI_CoordinateSystemAxisType_type"),
				 GmlPackage.eINSTANCE.getCoordinateSystemAxisType_Uom(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_Remarks());
			childrenFeatures.add(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisAbbrev());
			childrenFeatures.add(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisDirection());
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
	 * This returns CoordinateSystemAxisType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinateSystemAxisType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CoordinateSystemAxisType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_CoordinateSystemAxisType_type") :
			getString("_UI_CoordinateSystemAxisType_type") + " " + label;
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

		switch (notification.getFeatureID(CoordinateSystemAxisType.class)) {
			case GmlPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ID:
			case GmlPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS:
			case GmlPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
			case GmlPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
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
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_Remarks(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisDirection(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisDirection(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisDirection(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisDirection(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));
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
			childFeature == GmlPackage.eINSTANCE.getAbstractGMLType_Description() ||
			childFeature == GmlPackage.eINSTANCE.getCoordinateSystemAxisType_Remarks() ||
			childFeature == GmlPackage.eINSTANCE.getAbstractGMLType_Name() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CsName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DatumName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GroupName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeridianName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsName() ||
			childFeature == GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisAbbrev() ||
			childFeature == GmlPackage.eINSTANCE.getCoordinateSystemAxisType_AxisDirection();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
