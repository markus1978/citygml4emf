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

import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.IdentifierType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.IdentifierType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifierTypeItemProvider
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
	public IdentifierTypeItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IdentifierType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IdentifierType_version_feature", "_UI_IdentifierType_type"),
				 GmlPackage.eINSTANCE.getIdentifierType_Version(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getIdentifierType_NameGroup());
			childrenFeatures.add(GmlPackage.eINSTANCE.getIdentifierType_Remarks());
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
	 * This returns IdentifierType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IdentifierType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IdentifierType)object).getVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_IdentifierType_type") :
			getString("_UI_IdentifierType_type") + " " + label;
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

		switch (notification.getFeatureID(IdentifierType.class)) {
			case GmlPackage.IDENTIFIER_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.IDENTIFIER_TYPE__NAME_GROUP:
			case GmlPackage.IDENTIFIER_TYPE__REMARKS:
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
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getIdentifierType_Name(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getIdentifierType_Name(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getIdentifierType_Name(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getIdentifierType_Name(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createDerivedCRSTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createPixelInCellType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_NameGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
					 GmlFactory.eINSTANCE.createVerticalDatumTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getIdentifierType_Remarks(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));
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
			childFeature == GmlPackage.eINSTANCE.getIdentifierType_Name() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CsName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DatumName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GroupName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeridianName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsName();

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
