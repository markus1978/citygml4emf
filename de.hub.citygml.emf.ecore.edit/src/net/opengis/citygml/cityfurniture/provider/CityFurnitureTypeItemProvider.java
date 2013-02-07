/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityfurniture.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.CitygmlFactory;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.citygml.cityfurniture.CityFurnitureType;
import net.opengis.citygml.cityfurniture.CityfurniturePackage;

import net.opengis.citygml.provider.AbstractCityObjectTypeItemProvider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.citygml.cityfurniture.CityFurnitureType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CityFurnitureTypeItemProvider
	extends AbstractCityObjectTypeItemProvider
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
	public CityFurnitureTypeItemProvider(AdapterFactory adapterFactory) {
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

			addClassPropertyDescriptor(object);
			addFunctionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CityFurnitureType_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityFurnitureType_class_feature", "_UI_CityFurnitureType_type"),
				 CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_CityFurnitureType_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CityFurnitureType_function_feature", "_UI_CityFurnitureType_type"),
				 CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__FUNCTION,
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
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_GEOMETRY);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_GEOMETRY);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_GEOMETRY);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_GEOMETRY);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION);
			childrenFeatures.add(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP);
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
	 * This returns CityFurnitureType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CityFurnitureType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CityFurnitureType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_CityFurnitureType_type") :
			getString("_UI_CityFurnitureType_type") + " " + label;
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

		switch (notification.getFeatureID(CityFurnitureType.class)) {
			case CityfurniturePackage.CITY_FURNITURE_TYPE__CLASS:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__FUNCTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP:
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
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_GEOMETRY,
				 GmlFactory.eINSTANCE.createGeometryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_GEOMETRY,
				 GmlFactory.eINSTANCE.createGeometryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_GEOMETRY,
				 GmlFactory.eINSTANCE.createGeometryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_GEOMETRY,
				 GmlFactory.eINSTANCE.createGeometryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION,
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION,
				 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION,
				 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION,
				 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION,
				 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType()));
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
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_GEOMETRY ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_GEOMETRY ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_GEOMETRY ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_GEOMETRY ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION ||
			childFeature == CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION;

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
