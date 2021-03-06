/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.transportation.TransportationComplexType;
import net.opengis.citygml.transportation.TransportationFactory;
import net.opengis.citygml.transportation.TransportationPackage;

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
 * This is the item provider adapter for a {@link net.opengis.citygml.transportation.TransportationComplexType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransportationComplexTypeItemProvider
	extends AbstractTransportationObjectTypeItemProvider
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
	public TransportationComplexTypeItemProvider(AdapterFactory adapterFactory) {
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

			addFunctionPropertyDescriptor(object);
			addUsagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransportationComplexType_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransportationComplexType_function_feature", "_UI_TransportationComplexType_type"),
				 TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__FUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TransportationComplexType_usage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TransportationComplexType_usage_feature", "_UI_TransportationComplexType_type"),
				 TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__USAGE,
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
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA);
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA);
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK);
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE);
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE);
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE);
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE);
			childrenFeatures.add(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP);
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
	 * This returns TransportationComplexType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TransportationComplexType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TransportationComplexType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_TransportationComplexType_type") :
			getString("_UI_TransportationComplexType_type") + " " + label;
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

		switch (notification.getFeatureID(TransportationComplexType.class)) {
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__FUNCTION:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__USAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE:
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP:
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
				(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA,
				 TransportationFactory.eINSTANCE.createTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA,
				 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK,
				 GmlFactory.eINSTANCE.createGeometricComplexPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE,
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));
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
			childFeature == GmlPackage.eINSTANCE.getAbstractFeatureType_Location() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation() ||
			childFeature == TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE ||
			childFeature == TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE ||
			childFeature == TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE ||
			childFeature == TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
