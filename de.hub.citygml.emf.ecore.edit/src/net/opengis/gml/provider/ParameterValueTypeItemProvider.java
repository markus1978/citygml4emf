/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.ParameterValueType;

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
 * This is the item provider adapter for a {@link net.opengis.gml.ParameterValueType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterValueTypeItemProvider
	extends AbstractGeneralParameterValueTypeItemProvider
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
	public ParameterValueTypeItemProvider(AdapterFactory adapterFactory) {
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

			addStringValuePropertyDescriptor(object);
			addIntegerValuePropertyDescriptor(object);
			addBooleanValuePropertyDescriptor(object);
			addIntegerValueListPropertyDescriptor(object);
			addValueFilePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the String Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterValueType_stringValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterValueType_stringValue_feature", "_UI_ParameterValueType_type"),
				 GmlPackage.eINSTANCE.getParameterValueType_StringValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Integer Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegerValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterValueType_integerValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterValueType_integerValue_feature", "_UI_ParameterValueType_type"),
				 GmlPackage.eINSTANCE.getParameterValueType_IntegerValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterValueType_booleanValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterValueType_booleanValue_feature", "_UI_ParameterValueType_type"),
				 GmlPackage.eINSTANCE.getParameterValueType_BooleanValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Integer Value List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegerValueListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterValueType_integerValueList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterValueType_integerValueList_feature", "_UI_ParameterValueType_type"),
				 GmlPackage.eINSTANCE.getParameterValueType_IntegerValueList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterValueType_valueFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterValueType_valueFile_feature", "_UI_ParameterValueType_type"),
				 GmlPackage.eINSTANCE.getParameterValueType_ValueFile(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getParameterValueType_Value());
			childrenFeatures.add(GmlPackage.eINSTANCE.getParameterValueType_DmsAngleValue());
			childrenFeatures.add(GmlPackage.eINSTANCE.getParameterValueType_ValueList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getParameterValueType_ValueOfParameter());
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
	 * This returns ParameterValueType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterValueType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ParameterValueType)object).getStringValue();
		return label == null || label.length() == 0 ?
			getString("_UI_ParameterValueType_type") :
			getString("_UI_ParameterValueType_type") + " " + label;
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

		switch (notification.getFeatureID(ParameterValueType.class)) {
			case GmlPackage.PARAMETER_VALUE_TYPE__STRING_VALUE:
			case GmlPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE:
			case GmlPackage.PARAMETER_VALUE_TYPE__BOOLEAN_VALUE:
			case GmlPackage.PARAMETER_VALUE_TYPE__INTEGER_VALUE_LIST:
			case GmlPackage.PARAMETER_VALUE_TYPE__VALUE_FILE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.PARAMETER_VALUE_TYPE__VALUE:
			case GmlPackage.PARAMETER_VALUE_TYPE__DMS_ANGLE_VALUE:
			case GmlPackage.PARAMETER_VALUE_TYPE__VALUE_LIST:
			case GmlPackage.PARAMETER_VALUE_TYPE__VALUE_OF_PARAMETER:
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
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_Value(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_DmsAngleValue(),
				 GmlFactory.eINSTANCE.createDMSAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_ValueList(),
				 GmlFactory.eINSTANCE.createMeasureListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getParameterValueType_ValueOfParameter(),
				 GmlFactory.eINSTANCE.createOperationParameterRefType()));
	}

}
