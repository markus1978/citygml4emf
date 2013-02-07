/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.GraphStyleType;

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
 * This is the item provider adapter for a {@link net.opengis.gml.GraphStyleType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphStyleTypeItemProvider
	extends BaseStyleDescriptorTypeItemProvider
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
	public GraphStyleTypeItemProvider(AdapterFactory adapterFactory) {
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

			addPlanarPropertyDescriptor(object);
			addDirectedPropertyDescriptor(object);
			addGridPropertyDescriptor(object);
			addMinDistancePropertyDescriptor(object);
			addMinAnglePropertyDescriptor(object);
			addGraphTypePropertyDescriptor(object);
			addDrawingTypePropertyDescriptor(object);
			addLineTypePropertyDescriptor(object);
			addAestheticCriteriaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Planar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlanarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_planar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_planar_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_Planar(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_directed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_directed_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_Directed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_grid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_grid_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_Grid(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_minDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_minDistance_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_MinDistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_minAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_minAngle_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_MinAngle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Graph Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGraphTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_graphType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_graphType_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_GraphType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Drawing Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDrawingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_drawingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_drawingType_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_DrawingType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_lineType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_lineType_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_LineType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aesthetic Criteria feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAestheticCriteriaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphStyleType_aestheticCriteria_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphStyleType_aestheticCriteria_feature", "_UI_GraphStyleType_type"),
				 GmlPackage.eINSTANCE.getGraphStyleType_AestheticCriteria(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GraphStyleType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphStyleType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GraphStyleType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphStyleType_type") :
			getString("_UI_GraphStyleType_type") + " " + label;
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

		switch (notification.getFeatureID(GraphStyleType.class)) {
			case GmlPackage.GRAPH_STYLE_TYPE__PLANAR:
			case GmlPackage.GRAPH_STYLE_TYPE__DIRECTED:
			case GmlPackage.GRAPH_STYLE_TYPE__GRID:
			case GmlPackage.GRAPH_STYLE_TYPE__MIN_DISTANCE:
			case GmlPackage.GRAPH_STYLE_TYPE__MIN_ANGLE:
			case GmlPackage.GRAPH_STYLE_TYPE__GRAPH_TYPE:
			case GmlPackage.GRAPH_STYLE_TYPE__DRAWING_TYPE:
			case GmlPackage.GRAPH_STYLE_TYPE__LINE_TYPE:
			case GmlPackage.GRAPH_STYLE_TYPE__AESTHETIC_CRITERIA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsName();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
