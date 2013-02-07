/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.gml.AbstractDatumType;
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
 * This is the item provider adapter for a {@link net.opengis.gml.AbstractDatumType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractDatumTypeItemProvider
	extends AbstractDatumBaseTypeItemProvider
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
	public AbstractDatumTypeItemProvider(AdapterFactory adapterFactory) {
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

			addRealizationEpochPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Realization Epoch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizationEpochPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractDatumType_realizationEpoch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractDatumType_realizationEpoch_feature", "_UI_AbstractDatumType_type"),
				 GmlPackage.eINSTANCE.getAbstractDatumType_RealizationEpoch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractDatumType_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractDatumType_scope_feature", "_UI_AbstractDatumType_type"),
				 GmlPackage.eINSTANCE.getAbstractDatumType_Scope(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getAbstractDatumType_DatumID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getAbstractDatumType_Remarks());
			childrenFeatures.add(GmlPackage.eINSTANCE.getAbstractDatumType_AnchorPoint());
			childrenFeatures.add(GmlPackage.eINSTANCE.getAbstractDatumType_ValidArea());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractDatumType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractDatumType_type") :
			getString("_UI_AbstractDatumType_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractDatumType.class)) {
			case GmlPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
			case GmlPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.ABSTRACT_DATUM_TYPE__DATUM_ID:
			case GmlPackage.ABSTRACT_DATUM_TYPE__REMARKS:
			case GmlPackage.ABSTRACT_DATUM_TYPE__ANCHOR_POINT:
			case GmlPackage.ABSTRACT_DATUM_TYPE__VALID_AREA:
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
				(GmlPackage.eINSTANCE.getAbstractDatumType_DatumID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractDatumType_Remarks(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractDatumType_AnchorPoint(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractDatumType_AnchorPoint(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractDatumType_AnchorPoint(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractDatumType_AnchorPoint(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractDatumType_ValidArea(),
				 GmlFactory.eINSTANCE.createExtentType()));
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
			childFeature == GmlPackage.eINSTANCE.getAbstractDatumType_Remarks() ||
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
			childFeature == GmlPackage.eINSTANCE.getAbstractDatumBaseType_DatumName() ||
			childFeature == GmlPackage.eINSTANCE.getAbstractDatumType_AnchorPoint();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
