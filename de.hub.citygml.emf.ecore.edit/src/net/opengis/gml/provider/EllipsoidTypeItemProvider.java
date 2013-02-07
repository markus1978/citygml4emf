/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.gml.EllipsoidType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.EllipsoidType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EllipsoidTypeItemProvider
	extends EllipsoidBaseTypeItemProvider
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
	public EllipsoidTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getEllipsoidType_EllipsoidID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getEllipsoidType_Remarks());
			childrenFeatures.add(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis());
			childrenFeatures.add(GmlPackage.eINSTANCE.getEllipsoidType_SecondDefiningParameter());
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
	 * This returns EllipsoidType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EllipsoidType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EllipsoidType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_EllipsoidType_type") :
			getString("_UI_EllipsoidType_type") + " " + label;
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

		switch (notification.getFeatureID(EllipsoidType.class)) {
			case GmlPackage.ELLIPSOID_TYPE__ELLIPSOID_ID:
			case GmlPackage.ELLIPSOID_TYPE__REMARKS:
			case GmlPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS:
			case GmlPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER:
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
				(GmlPackage.eINSTANCE.getEllipsoidType_EllipsoidID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_Remarks(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getEllipsoidType_SecondDefiningParameter(),
				 GmlFactory.eINSTANCE.createSecondDefiningParameterType()));
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
			childFeature == GmlPackage.eINSTANCE.getEllipsoidType_Remarks() ||
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
			childFeature == GmlPackage.eINSTANCE.getEllipsoidBaseType_EllipsoidName();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
