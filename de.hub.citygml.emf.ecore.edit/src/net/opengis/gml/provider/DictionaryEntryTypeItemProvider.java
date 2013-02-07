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

import net.opengis.gml.DictionaryEntryType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

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

import org.w3._1999.xlink.ActuateType;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.DictionaryEntryType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DictionaryEntryTypeItemProvider
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
	public DictionaryEntryTypeItemProvider(AdapterFactory adapterFactory) {
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

			addActuatePropertyDescriptor(object);
			addArcrolePropertyDescriptor(object);
			addHrefPropertyDescriptor(object);
			addRemoteSchemaPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addShowPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actuate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActuatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_actuate_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_Actuate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arcrole feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArcrolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_arcrole_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_Arcrole(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Href feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_href_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_Href(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoteSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_remoteSchema_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_RemoteSchema(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_role_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_Role(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_show_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_Show(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_title_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_Title(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DictionaryEntryType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DictionaryEntryType_type_feature", "_UI_DictionaryEntryType_type"),
				 GmlPackage.eINSTANCE.getDictionaryEntryType_Type(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup());
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
	 * This returns DictionaryEntryType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DictionaryEntryType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActuateType labelValue = ((DictionaryEntryType)object).getActuate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DictionaryEntryType_type") :
			getString("_UI_DictionaryEntryType_type") + " " + label;
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

		switch (notification.getFeatureID(DictionaryEntryType.class)) {
			case GmlPackage.DICTIONARY_ENTRY_TYPE__ACTUATE:
			case GmlPackage.DICTIONARY_ENTRY_TYPE__ARCROLE:
			case GmlPackage.DICTIONARY_ENTRY_TYPE__HREF:
			case GmlPackage.DICTIONARY_ENTRY_TYPE__REMOTE_SCHEMA:
			case GmlPackage.DICTIONARY_ENTRY_TYPE__ROLE:
			case GmlPackage.DICTIONARY_ENTRY_TYPE__SHOW:
			case GmlPackage.DICTIONARY_ENTRY_TYPE__TITLE:
			case GmlPackage.DICTIONARY_ENTRY_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.DICTIONARY_ENTRY_TYPE__DEFINITION_GROUP:
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
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createUnitDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createCompoundCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createConcatenatedOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createConversionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createCylindricalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createDefinitionProxyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createDerivedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createEllipsoidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createEngineeringCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createEngineeringDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createGeocentricCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createGeodeticDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createGeographicCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createImageCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createImageDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createLinearCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createOperationMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createOperationParameterGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createOperationParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createPassThroughOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createPolarCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createPrimeMeridianType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createProjectedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createSphericalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTemporalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTemporalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTemporalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTimeCalendarEraType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTimeCalendarType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTimeClockType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTimeCoordinateSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTimeOrdinalEraType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createTransformationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createUserDefinedCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createVerticalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createVerticalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDictionaryEntryType_Definition(),
					 GmlFactory.eINSTANCE.createVerticalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createUnitDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createBaseUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(),
					 GmlFactory.eINSTANCE.createCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS(),
					 GmlFactory.eINSTANCE.createCompoundCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation(),
					 GmlFactory.eINSTANCE.createConcatenatedOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit(),
					 GmlFactory.eINSTANCE.createConventionalUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Conversion(),
					 GmlFactory.eINSTANCE.createConversionType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis(),
					 GmlFactory.eINSTANCE.createCoordinateSystemAxisType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(),
					 GmlFactory.eINSTANCE.createCylindricalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy(),
					 GmlFactory.eINSTANCE.createDefinitionProxyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS(),
					 GmlFactory.eINSTANCE.createDerivedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit(),
					 GmlFactory.eINSTANCE.createDerivedUnitType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary(),
					 GmlFactory.eINSTANCE.createDictionaryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid(),
					 GmlFactory.eINSTANCE.createEllipsoidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(),
					 GmlFactory.eINSTANCE.createEllipsoidalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS(),
					 GmlFactory.eINSTANCE.createEngineeringCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum(),
					 GmlFactory.eINSTANCE.createEngineeringDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS(),
					 GmlFactory.eINSTANCE.createGeocentricCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum(),
					 GmlFactory.eINSTANCE.createGeodeticDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS(),
					 GmlFactory.eINSTANCE.createGeographicCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS(),
					 GmlFactory.eINSTANCE.createImageCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum(),
					 GmlFactory.eINSTANCE.createImageDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(),
					 GmlFactory.eINSTANCE.createLinearCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(),
					 GmlFactory.eINSTANCE.createObliqueCartesianCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod(),
					 GmlFactory.eINSTANCE.createOperationMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter(),
					 GmlFactory.eINSTANCE.createOperationParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup(),
					 GmlFactory.eINSTANCE.createOperationParameterGroupType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation(),
					 GmlFactory.eINSTANCE.createPassThroughOperationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(),
					 GmlFactory.eINSTANCE.createPolarCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian(),
					 GmlFactory.eINSTANCE.createPrimeMeridianType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS(),
					 GmlFactory.eINSTANCE.createProjectedCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(),
					 GmlFactory.eINSTANCE.createSphericalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS(),
					 GmlFactory.eINSTANCE.createTemporalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(),
					 GmlFactory.eINSTANCE.createTemporalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum(),
					 GmlFactory.eINSTANCE.createTemporalDatumType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar(),
					 GmlFactory.eINSTANCE.createTimeCalendarType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra(),
					 GmlFactory.eINSTANCE.createTimeCalendarEraType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock(),
					 GmlFactory.eINSTANCE.createTimeClockType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem(),
					 GmlFactory.eINSTANCE.createTimeCoordinateSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem(),
					 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Transformation(),
					 GmlFactory.eINSTANCE.createTransformationType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(),
					 GmlFactory.eINSTANCE.createUserDefinedCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS(),
					 GmlFactory.eINSTANCE.createVerticalCRSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(),
					 GmlFactory.eINSTANCE.createVerticalCSType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDictionaryEntryType_DefinitionGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum(),
					 GmlFactory.eINSTANCE.createVerticalDatumType())));
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
			childFeature == GmlPackage.eINSTANCE.getDictionaryEntryType_Definition() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Conversion() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Dictionary() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LinearCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolarCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeClock() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Transformation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum();

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
