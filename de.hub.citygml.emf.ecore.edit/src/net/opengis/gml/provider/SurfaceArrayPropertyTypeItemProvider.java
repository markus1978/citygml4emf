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
import net.opengis.gml.SurfaceArrayPropertyType;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.opengis.gml.SurfaceArrayPropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SurfaceArrayPropertyTypeItemProvider
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
	public SurfaceArrayPropertyTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup());
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
	 * This returns SurfaceArrayPropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SurfaceArrayPropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SurfaceArrayPropertyType_type");
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

		switch (notification.getFeatureID(SurfaceArrayPropertyType.class)) {
			case GmlPackage.SURFACE_ARRAY_PROPERTY_TYPE__SURFACE_GROUP:
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
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(),
					 GmlFactory.eINSTANCE.createCompositeSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 GmlFactory.eINSTANCE.createOrientableSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(),
					 GmlFactory.eINSTANCE.createPolygonType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createPolyhedralSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_Tin(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTriangulatedSurfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
					 GmlFactory.eINSTANCE.createTinType())));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getSurfaceArrayPropertyType_SurfaceGroup(),
				 FeatureMapUtil.createEntry
					(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE,
					 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType())));
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
