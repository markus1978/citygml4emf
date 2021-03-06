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

import net.opengis.citygml.texturedsurface.TexturedsurfaceFactory;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;

import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.LocationPropertyType;

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
 * This is the item provider adapter for a {@link net.opengis.gml.LocationPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationPropertyTypeItemProvider
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
	public LocationPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNullPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Null feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocationPropertyType_null_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_null_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Null(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_LocationPropertyType_actuate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_actuate_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Actuate(),
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
				 getString("_UI_LocationPropertyType_arcrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_arcrole_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Arcrole(),
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
				 getString("_UI_LocationPropertyType_href_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_href_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Href(),
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
				 getString("_UI_LocationPropertyType_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_remoteSchema_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_RemoteSchema(),
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
				 getString("_UI_LocationPropertyType_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_role_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Role(),
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
				 getString("_UI_LocationPropertyType_show_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_show_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Show(),
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
				 getString("_UI_LocationPropertyType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_title_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Title(),
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
				 getString("_UI_LocationPropertyType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocationPropertyType_type_feature", "_UI_LocationPropertyType_type"),
				 GmlPackage.eINSTANCE.getLocationPropertyType_Type(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup());
			childrenFeatures.add(GmlPackage.eINSTANCE.getLocationPropertyType_LocationKeyWord());
			childrenFeatures.add(GmlPackage.eINSTANCE.getLocationPropertyType_LocationString());
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
	 * This returns LocationPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocationPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((LocationPropertyType)object).getNull();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_LocationPropertyType_type") :
			getString("_UI_LocationPropertyType_type") + " " + label;
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

		switch (notification.getFeatureID(LocationPropertyType.class)) {
			case GmlPackage.LOCATION_PROPERTY_TYPE__NULL:
			case GmlPackage.LOCATION_PROPERTY_TYPE__ACTUATE:
			case GmlPackage.LOCATION_PROPERTY_TYPE__ARCROLE:
			case GmlPackage.LOCATION_PROPERTY_TYPE__HREF:
			case GmlPackage.LOCATION_PROPERTY_TYPE__REMOTE_SCHEMA:
			case GmlPackage.LOCATION_PROPERTY_TYPE__ROLE:
			case GmlPackage.LOCATION_PROPERTY_TYPE__SHOW:
			case GmlPackage.LOCATION_PROPERTY_TYPE__TITLE:
			case GmlPackage.LOCATION_PROPERTY_TYPE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.LOCATION_PROPERTY_TYPE__GEOMETRY_GROUP:
			case GmlPackage.LOCATION_PROPERTY_TYPE__LOCATION_KEY_WORD:
			case GmlPackage.LOCATION_PROPERTY_TYPE__LOCATION_STRING:
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
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve(),
					 GmlFactory.eINSTANCE.createCompositeCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid(),
					 GmlFactory.eINSTANCE.createCompositeSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(),
					 GmlFactory.eINSTANCE.createCompositeSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Curve1(),
					 GmlFactory.eINSTANCE.createCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex(),
					 GmlFactory.eINSTANCE.createGeometricComplexType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
					 GmlFactory.eINSTANCE.createGridType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
					 GmlFactory.eINSTANCE.createRectifiedGridType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing(),
					 GmlFactory.eINSTANCE.createLinearRingType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_LineString(),
					 GmlFactory.eINSTANCE.createLineStringType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(),
					 GmlFactory.eINSTANCE.createMultiCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(),
					 GmlFactory.eINSTANCE.createMultiGeometryType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(),
					 GmlFactory.eINSTANCE.createMultiLineStringType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(),
					 GmlFactory.eINSTANCE.createMultiPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(),
					 GmlFactory.eINSTANCE.createMultiPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(),
					 GmlFactory.eINSTANCE.createMultiSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(),
					 GmlFactory.eINSTANCE.createMultiSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve(),
					 GmlFactory.eINSTANCE.createOrientableCurveType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 GmlFactory.eINSTANCE.createOrientableSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Point(),
					 GmlFactory.eINSTANCE.createPointType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(),
					 GmlFactory.eINSTANCE.createPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid(),
					 GmlFactory.eINSTANCE.createRectifiedGridType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Ring1(),
					 GmlFactory.eINSTANCE.createRingType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Solid1(),
					 GmlFactory.eINSTANCE.createSolidType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Tin(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_GeometryGroup(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE,
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getLocationPropertyType_LocationString(),
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
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Grid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface() ||
			childFeature == TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Surface1() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Tin();

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
