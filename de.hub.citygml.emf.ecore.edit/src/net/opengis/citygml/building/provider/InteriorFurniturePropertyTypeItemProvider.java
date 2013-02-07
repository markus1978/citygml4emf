/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.BuildingFactory;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.InteriorFurniturePropertyType;

import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;

import net.opengis.citygml.transportation.TransportationPackage;

import net.opengis.citygml.vegetation.VegetationPackage;

import net.opengis.citygml.waterbody.WaterbodyPackage;

import net.opengis.gml.GmlPackage;

import net.opengis.gml.provider.AssociationTypeItemProvider;

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
 * This is the item provider adapter for a {@link net.opengis.citygml.building.InteriorFurniturePropertyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteriorFurniturePropertyTypeItemProvider
	extends AssociationTypeItemProvider
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
	public InteriorFurniturePropertyTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BuildingPackage.Literals.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE);
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
	 * This returns InteriorFurniturePropertyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InteriorFurniturePropertyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ActuateType labelValue = ((InteriorFurniturePropertyType)object).getActuate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_InteriorFurniturePropertyType_type") :
			getString("_UI_InteriorFurniturePropertyType_type") + " " + label;
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

		switch (notification.getFeatureID(InteriorFurniturePropertyType.class)) {
			case BuildingPackage.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE:
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
				(BuildingPackage.Literals.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE,
				 BuildingFactory.eINSTANCE.createBuildingFurnitureType()));
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
			childFeature == BuildingPackage.Literals.DOCUMENT_ROOT__BUILDING_FURNITURE ||
			childFeature == BuildingPackage.Literals.INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Definition() ||
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
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Observation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Grid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface() ||
			childFeature == TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Surface1() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Tin() ||
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
