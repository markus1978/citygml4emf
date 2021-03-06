/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.gml.AbstractCoverageType;
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
 * This is the item provider adapter for a {@link net.opengis.gml.AbstractCoverageType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractCoverageTypeItemProvider
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
	public AbstractCoverageTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDimensionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractCoverageType_dimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractCoverageType_dimension_feature", "_UI_AbstractCoverageType_type"),
				 GmlPackage.eINSTANCE.getAbstractCoverageType_Dimension(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup());
			childrenFeatures.add(GmlPackage.eINSTANCE.getAbstractCoverageType_RangeSet());
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
		String label = ((AbstractCoverageType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractCoverageType_type") :
			getString("_UI_AbstractCoverageType_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractCoverageType.class)) {
			case GmlPackage.ABSTRACT_COVERAGE_TYPE__DIMENSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.ABSTRACT_COVERAGE_TYPE__DOMAIN_SET_GROUP:
			case GmlPackage.ABSTRACT_COVERAGE_TYPE__RANGE_SET:
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
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet(),
					 GmlFactory.eINSTANCE.createDomainSetType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet(),
					 GmlFactory.eINSTANCE.createGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiCurveDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiPointDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiSolidDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet(),
					 GmlFactory.eINSTANCE.createMultiSurfaceDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet(),
					 GmlFactory.eINSTANCE.createRectifiedGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GridDomain(),
					 GmlFactory.eINSTANCE.createGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain(),
					 GmlFactory.eINSTANCE.createMultiCurveDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain(),
					 GmlFactory.eINSTANCE.createMultiPointDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain(),
					 GmlFactory.eINSTANCE.createMultiSolidDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain(),
					 GmlFactory.eINSTANCE.createMultiSurfaceDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSetGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain(),
					 GmlFactory.eINSTANCE.createRectifiedGridDomainType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getAbstractCoverageType_RangeSet(),
				 GmlFactory.eINSTANCE.createRangeSetType()));
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
			childFeature == GmlPackage.eINSTANCE.getAbstractCoverageType_DomainSet() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GridDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
