/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.appearance.AppearanceFactory;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.AppearancePropertyType;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.citygml.transportation.TransportationPackage;

import net.opengis.citygml.vegetation.VegetationPackage;

import net.opengis.citygml.waterbody.WaterbodyPackage;

import net.opengis.gml.GmlPackage;

import net.opengis.gml.provider.FeaturePropertyTypeItemProvider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.w3._1999.xlink.ActuateType;

/**
 * This is the item provider adapter for a {@link net.opengis.citygml.appearance.AppearancePropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppearancePropertyTypeItemProvider
	extends FeaturePropertyTypeItemProvider
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
	public AppearancePropertyTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AppearancePackage.Literals.APPEARANCE_PROPERTY_TYPE__APPEARANCE);
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
	 * This returns AppearancePropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AppearancePropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActuateType labelValue = ((AppearancePropertyType)object).getActuate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AppearancePropertyType_type") :
			getString("_UI_AppearancePropertyType_type") + " " + label;
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

		switch (notification.getFeatureID(AppearancePropertyType.class)) {
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE:
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
				(AppearancePackage.Literals.APPEARANCE_PROPERTY_TYPE__APPEARANCE,
				 AppearanceFactory.eINSTANCE.createAppearanceType()));
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
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Observation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance() ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__ROAD ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRACK ||
			childFeature == TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA ||
			childFeature == VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT ||
			childFeature == VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER ||
			childFeature == VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT ||
			childFeature == WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT ||
			childFeature == WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY;

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
