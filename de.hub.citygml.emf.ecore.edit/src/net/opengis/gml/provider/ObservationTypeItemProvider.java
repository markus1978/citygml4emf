/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.CitygmlFactory;

import net.opengis.citygml.appearance.AppearanceFactory;

import net.opengis.citygml.building.BuildingFactory;

import net.opengis.citygml.relief.ReliefFactory;

import net.opengis.citygml.transportation.TransportationFactory;

import net.opengis.citygml.waterbody.WaterbodyFactory;

import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.ObservationType;

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
 * This is the item provider adapter for a {@link net.opengis.gml.ObservationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObservationTypeItemProvider
	extends AbstractFeatureTypeItemProvider
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
	public ObservationTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getObservationType_ValidTime());
			childrenFeatures.add(GmlPackage.eINSTANCE.getObservationType_Using());
			childrenFeatures.add(GmlPackage.eINSTANCE.getObservationType_TargetGroup());
			childrenFeatures.add(GmlPackage.eINSTANCE.getObservationType_ResultOf());
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
	 * This returns ObservationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObservationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObservationType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ObservationType_type") :
			getString("_UI_ObservationType_type") + " " + label;
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

		switch (notification.getFeatureID(ObservationType.class)) {
			case GmlPackage.OBSERVATION_TYPE__VALID_TIME:
			case GmlPackage.OBSERVATION_TYPE__USING:
			case GmlPackage.OBSERVATION_TYPE__TARGET_GROUP:
			case GmlPackage.OBSERVATION_TYPE__RESULT_OF:
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
				(GmlPackage.eINSTANCE.getObservationType_ValidTime(),
				 GmlFactory.eINSTANCE.createTimePrimitivePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ValidTime(),
				 GmlFactory.eINSTANCE.createRelatedTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_Using(),
				 GmlFactory.eINSTANCE.createFeaturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_Using(),
				 AppearanceFactory.eINSTANCE.createAppearancePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_TargetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getObservationType_Target(),
					 GmlFactory.eINSTANCE.createTargetPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_TargetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Subject(),
					 GmlFactory.eINSTANCE.createTargetPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 GmlFactory.eINSTANCE.createAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 BuildingFactory.eINSTANCE.createBoundarySurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 BuildingFactory.eINSTANCE.createBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 BuildingFactory.eINSTANCE.createBuildingPartPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 BuildingFactory.eINSTANCE.createIntBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 BuildingFactory.eINSTANCE.createInteriorFurniturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 BuildingFactory.eINSTANCE.createInteriorRoomPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 BuildingFactory.eINSTANCE.createOpeningPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 CitygmlFactory.eINSTANCE.createAddressPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 TransportationFactory.eINSTANCE.createTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 ReliefFactory.eINSTANCE.createGridPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 ReliefFactory.eINSTANCE.createReliefComponentPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 ReliefFactory.eINSTANCE.createTinPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getObservationType_ResultOf(),
				 WaterbodyFactory.eINSTANCE.createBoundedByWaterSurfacePropertyType()));
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
			childFeature == GmlPackage.eINSTANCE.getObservationType_Target() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Subject();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
