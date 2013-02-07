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

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import net.opengis.citygml.relief.ReliefFactory;

import net.opengis.citygml.texturedsurface.TexturedsurfaceFactory;

import net.opengis.citygml.transportation.TransportationFactory;

import net.opengis.citygml.waterbody.WaterbodyFactory;

import net.opengis.gml.DocumentRoot;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link net.opengis.gml.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

			addBooleanPropertyDescriptor(object);
			addBooleanListPropertyDescriptor(object);
			addBooleanValuePropertyDescriptor(object);
			addColumnIndexPropertyDescriptor(object);
			addCompassPointPropertyDescriptor(object);
			addCountPropertyDescriptor(object);
			addCountExtentPropertyDescriptor(object);
			addCountListPropertyDescriptor(object);
			addCovariancePropertyDescriptor(object);
			addDecimalMinutesPropertyDescriptor(object);
			addDoubleOrNullTupleListPropertyDescriptor(object);
			addDurationPropertyDescriptor(object);
			addIntegerValuePropertyDescriptor(object);
			addIntegerValueListPropertyDescriptor(object);
			addIsSpherePropertyDescriptor(object);
			addMaximumOccursPropertyDescriptor(object);
			addMinimumOccursPropertyDescriptor(object);
			addMinutesPropertyDescriptor(object);
			addModifiedCoordinatePropertyDescriptor(object);
			addNullPropertyDescriptor(object);
			addOperationVersionPropertyDescriptor(object);
			addOriginPropertyDescriptor(object);
			addRealizationEpochPropertyDescriptor(object);
			addRowIndexPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addSecondsPropertyDescriptor(object);
			addSourceDimensionsPropertyDescriptor(object);
			addStringValuePropertyDescriptor(object);
			addTargetDimensionsPropertyDescriptor(object);
			addValueFilePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addRemoteSchemaPropertyDescriptor(object);
			addTransformPropertyDescriptor(object);
			addUomPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Boolean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_boolean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_boolean_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Boolean(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_booleanList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_booleanList_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_BooleanList(),
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
				 getString("_UI_DocumentRoot_booleanValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_booleanValue_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_BooleanValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_columnIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_columnIndex_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_ColumnIndex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compass Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompassPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_compassPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_compassPoint_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_CompassPoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_count_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_count_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Count(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Count Extent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountExtentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_countExtent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_countExtent_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_CountExtent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Count List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCountListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_countList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_countList_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_CountList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Covariance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCovariancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_covariance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_covariance_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Covariance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decimal Minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecimalMinutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_decimalMinutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_decimalMinutes_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_DecimalMinutes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Double Or Null Tuple List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoubleOrNullTupleListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_doubleOrNullTupleList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_doubleOrNullTupleList_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_DoubleOrNullTupleList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_duration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_duration_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Duration(),
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
				 getString("_UI_DocumentRoot_integerValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_integerValue_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_IntegerValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_DocumentRoot_integerValueList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_integerValueList_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_IntegerValueList(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Sphere feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSpherePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_isSphere_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_isSphere_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_IsSphere(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_maximumOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_maximumOccurs_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_MaximumOccurs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_minimumOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_minimumOccurs_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_MinimumOccurs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_minutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_minutes_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Minutes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified Coordinate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedCoordinatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_modifiedCoordinate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_modifiedCoordinate_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_ModifiedCoordinate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_DocumentRoot_null_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_null_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Null(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_operationVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_operationVersion_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_OperationVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_origin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_origin_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Origin(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Realization Epoch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRealizationEpochPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_realizationEpoch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_realizationEpoch_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_RealizationEpoch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_rowIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_rowIndex_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_RowIndex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_scope_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Scope(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seconds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_seconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_seconds_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Seconds(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Dimensions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceDimensionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_sourceDimensions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_sourceDimensions_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_SourceDimensions(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_DocumentRoot_stringValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_stringValue_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_StringValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Dimensions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetDimensionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_targetDimensions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_targetDimensions_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_TargetDimensions(),
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
				 getString("_UI_DocumentRoot_valueFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_valueFile_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_ValueFile(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_version_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Version(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_id_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Id(),
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
				 getString("_UI_DocumentRoot_remoteSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_remoteSchema_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_RemoteSchema(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_transform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_transform_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Transform(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_uom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_uom_feature", "_UI_DocumentRoot_type"),
				 GmlPackage.eINSTANCE.getDocumentRoot_Uom(),
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
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Feature());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GML());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Object());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Association());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ContinuousCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Coverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Definition());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystem());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystem());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystem());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Curve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeometricPrimitive());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Geometry());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CurveSegment());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Datum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DiscreteCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversion());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Operation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeneralDerivedCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeneralOperationParameter());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeneralParameterValue());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeometricAggregate());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GriddedSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ParametricCurveSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SurfacePatch());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ImplicitGeometry());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MetaData());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PositionalAccuracy());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Reference());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Ring());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Solid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_StrictAssociation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Style());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Surface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeObject());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeGeometricPrimitive());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimePrimitive());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeReferenceSystem());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeSlice());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyPrimitive());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Topology());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitive());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_AbsoluteExternalPositionalAccuracy());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_AffinePlacement());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Angle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Arc());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ArcString());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Array());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_AxisID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Bag());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Bezier());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BSpline());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BoundedBy());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Category());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CenterOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Circle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Clothoid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperationRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Cone());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Container());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Conversion());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ConversionRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Coord());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Name());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Coordinates());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CovarianceMatrix());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CoverageFunction());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CrsRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CsID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CsName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CubicSpline());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Curve1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CurveMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Cylinder());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DataBlock());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DataSource());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DatumID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DatumName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DatumRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DefaultStyle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Degrees());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Description());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DirectedEdge());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DirectedFace());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DirectedNode());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Observation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DirectedTopoSolid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Direction());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DirectionVector());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Edge());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Envelope());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Exterior());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Face());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMembers());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_File());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformationRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GenericMetaData());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Geodesic());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMembers());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GreenwichLongitude());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Grid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GridCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GridDomain());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GroupID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_GroupName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_History());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_IncludesElement());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_IndexMap());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_IndirectEntry());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Interior());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Isolated());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LinearCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LineString());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LineStringSegment());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Location());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_LocationString());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MappingRule());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Measure());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Member());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Members());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MeridianID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MetaDataProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MethodID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MethodName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MovingObjectStatus());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometryProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Node());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OffsetCurve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OperationRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ParameterID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperationRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Patches());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Point());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PointMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PointMembers());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PointProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PointRep());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PolarCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Polygon());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatch());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Surface1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Pos());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Position());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PosList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Quantity());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_QuantityType());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_RangeParameters());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_RangeSet());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Rectangle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridCoverage());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystemRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_RelativeInternalPositionalAccuracy());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Remarks());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Result());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Ring1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SecondDefiningParameter());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Segments());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Solid1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SolidMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Sphere());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SrsID());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SrsName());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Status());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Style1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SubComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Subject());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Target());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Symbol());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeEdge());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeInstant());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeInterval());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeNode());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimePosition());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Tin());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplex());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurve());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurveProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle1());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoPoint());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoPointProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMember());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMembers());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoSolid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurface());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurfaceProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolume());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolumeProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Track());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Transformation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TransformationRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Triangle());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_TupleList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesValue());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Using());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValidArea());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Value());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponents());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValueList());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_ValuesOfGroup());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_Vector());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType());
			childrenFeatures.add(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent());
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN:
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_LIST:
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
			case GmlPackage.DOCUMENT_ROOT__COLUMN_INDEX:
			case GmlPackage.DOCUMENT_ROOT__COMPASS_POINT:
			case GmlPackage.DOCUMENT_ROOT__COUNT:
			case GmlPackage.DOCUMENT_ROOT__COUNT_EXTENT:
			case GmlPackage.DOCUMENT_ROOT__COUNT_LIST:
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE:
			case GmlPackage.DOCUMENT_ROOT__DECIMAL_MINUTES:
			case GmlPackage.DOCUMENT_ROOT__DOUBLE_OR_NULL_TUPLE_LIST:
			case GmlPackage.DOCUMENT_ROOT__DURATION:
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE:
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE_LIST:
			case GmlPackage.DOCUMENT_ROOT__IS_SPHERE:
			case GmlPackage.DOCUMENT_ROOT__MAXIMUM_OCCURS:
			case GmlPackage.DOCUMENT_ROOT__MINIMUM_OCCURS:
			case GmlPackage.DOCUMENT_ROOT__MINUTES:
			case GmlPackage.DOCUMENT_ROOT__MODIFIED_COORDINATE:
			case GmlPackage.DOCUMENT_ROOT__NULL:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_VERSION:
			case GmlPackage.DOCUMENT_ROOT__ORIGIN:
			case GmlPackage.DOCUMENT_ROOT__REALIZATION_EPOCH:
			case GmlPackage.DOCUMENT_ROOT__ROW_INDEX:
			case GmlPackage.DOCUMENT_ROOT__SCOPE:
			case GmlPackage.DOCUMENT_ROOT__SECONDS:
			case GmlPackage.DOCUMENT_ROOT__SOURCE_DIMENSIONS:
			case GmlPackage.DOCUMENT_ROOT__STRING_VALUE:
			case GmlPackage.DOCUMENT_ROOT__TARGET_DIMENSIONS:
			case GmlPackage.DOCUMENT_ROOT__VALUE_FILE:
			case GmlPackage.DOCUMENT_ROOT__VERSION:
			case GmlPackage.DOCUMENT_ROOT__ID:
			case GmlPackage.DOCUMENT_ROOT__REMOTE_SCHEMA:
			case GmlPackage.DOCUMENT_ROOT__TRANSFORM:
			case GmlPackage.DOCUMENT_ROOT__UOM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE:
			case GmlPackage.DOCUMENT_ROOT__GML:
			case GmlPackage.DOCUMENT_ROOT__OBJECT:
			case GmlPackage.DOCUMENT_ROOT__ASSOCIATION:
			case GmlPackage.DOCUMENT_ROOT__CONTINUOUS_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION:
			case GmlPackage.DOCUMENT_ROOT__DEFINITION:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM:
			case GmlPackage.DOCUMENT_ROOT__CRS:
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM:
			case GmlPackage.DOCUMENT_ROOT__CURVE:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_PRIMITIVE:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY:
			case GmlPackage.DOCUMENT_ROOT__CURVE_SEGMENT:
			case GmlPackage.DOCUMENT_ROOT__DATUM:
			case GmlPackage.DOCUMENT_ROOT__DISCRETE_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION:
			case GmlPackage.DOCUMENT_ROOT__OPERATION:
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION:
			case GmlPackage.DOCUMENT_ROOT__GENERAL_DERIVED_CRS:
			case GmlPackage.DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
			case GmlPackage.DOCUMENT_ROOT__GENERAL_PARAMETER_VALUE:
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_AGGREGATE:
			case GmlPackage.DOCUMENT_ROOT__GRIDDED_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__PARAMETRIC_CURVE_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PATCH:
			case GmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
			case GmlPackage.DOCUMENT_ROOT__META_DATA:
			case GmlPackage.DOCUMENT_ROOT__POSITIONAL_ACCURACY:
			case GmlPackage.DOCUMENT_ROOT__REFERENCE:
			case GmlPackage.DOCUMENT_ROOT__RING:
			case GmlPackage.DOCUMENT_ROOT__SOLID:
			case GmlPackage.DOCUMENT_ROOT__STRICT_ASSOCIATION:
			case GmlPackage.DOCUMENT_ROOT__STYLE:
			case GmlPackage.DOCUMENT_ROOT__SURFACE:
			case GmlPackage.DOCUMENT_ROOT__TIME_COMPLEX:
			case GmlPackage.DOCUMENT_ROOT__TIME_OBJECT:
			case GmlPackage.DOCUMENT_ROOT__TIME_GEOMETRIC_PRIMITIVE:
			case GmlPackage.DOCUMENT_ROOT__TIME_PRIMITIVE:
			case GmlPackage.DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
			case GmlPackage.DOCUMENT_ROOT__TIME_SLICE:
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_PRIMITIVE:
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY:
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE:
			case GmlPackage.DOCUMENT_ROOT__ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
			case GmlPackage.DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
			case GmlPackage.DOCUMENT_ROOT__AFFINE_PLACEMENT:
			case GmlPackage.DOCUMENT_ROOT__ANCHOR_POINT:
			case GmlPackage.DOCUMENT_ROOT__ANGLE:
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__ARC:
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING:
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_BULGE:
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
			case GmlPackage.DOCUMENT_ROOT__ARRAY:
			case GmlPackage.DOCUMENT_ROOT__AXIS_ABBREV:
			case GmlPackage.DOCUMENT_ROOT__AXIS_DIRECTION:
			case GmlPackage.DOCUMENT_ROOT__AXIS_ID:
			case GmlPackage.DOCUMENT_ROOT__BAG:
			case GmlPackage.DOCUMENT_ROOT__BASE_CRS:
			case GmlPackage.DOCUMENT_ROOT__BASE_CURVE:
			case GmlPackage.DOCUMENT_ROOT__BASE_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__BASE_UNIT:
			case GmlPackage.DOCUMENT_ROOT__UNIT_DEFINITION:
			case GmlPackage.DOCUMENT_ROOT__BEZIER:
			case GmlPackage.DOCUMENT_ROOT__BSPLINE:
			case GmlPackage.DOCUMENT_ROOT__BOUNDED_BY:
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_BOX:
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_POLYGON:
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS:
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__CATALOG_SYMBOL:
			case GmlPackage.DOCUMENT_ROOT__CATEGORY:
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_EXTENT:
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_LIST:
			case GmlPackage.DOCUMENT_ROOT__CENTER_LINE_OF:
			case GmlPackage.DOCUMENT_ROOT__CENTER_OF:
			case GmlPackage.DOCUMENT_ROOT__CIRCLE:
			case GmlPackage.DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
			case GmlPackage.DOCUMENT_ROOT__CLOTHOID:
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_CURVE:
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SOLID:
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS:
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION:
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
			case GmlPackage.DOCUMENT_ROOT__CONE:
			case GmlPackage.DOCUMENT_ROOT__CONTAINER:
			case GmlPackage.DOCUMENT_ROOT__CONVENTIONAL_UNIT:
			case GmlPackage.DOCUMENT_ROOT__CONVERSION:
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_REF:
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
			case GmlPackage.DOCUMENT_ROOT__COORD:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_ID:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_NAME:
			case GmlPackage.DOCUMENT_ROOT__NAME:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM_REF:
			case GmlPackage.DOCUMENT_ROOT__COORDINATES:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE_MATRIX:
			case GmlPackage.DOCUMENT_ROOT__COVERAGE_FUNCTION:
			case GmlPackage.DOCUMENT_ROOT__CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__CS_ID:
			case GmlPackage.DOCUMENT_ROOT__CS_NAME:
			case GmlPackage.DOCUMENT_ROOT__CUBIC_SPLINE:
			case GmlPackage.DOCUMENT_ROOT__CURVE1:
			case GmlPackage.DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__CURVE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__CYLINDER:
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS:
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__DATA_BLOCK:
			case GmlPackage.DOCUMENT_ROOT__DATA_SOURCE:
			case GmlPackage.DOCUMENT_ROOT__DATUM_ID:
			case GmlPackage.DOCUMENT_ROOT__DATUM_NAME:
			case GmlPackage.DOCUMENT_ROOT__DATUM_REF:
			case GmlPackage.DOCUMENT_ROOT__DEFAULT_STYLE:
			case GmlPackage.DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_COLLECTION:
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY_ENTRY:
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_PROXY:
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_REF:
			case GmlPackage.DOCUMENT_ROOT__DEGREES:
			case GmlPackage.DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS:
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_TYPE:
			case GmlPackage.DOCUMENT_ROOT__DERIVED_UNIT:
			case GmlPackage.DOCUMENT_ROOT__DESCRIPTION:
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY:
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_EDGE:
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_FACE:
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_NODE:
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION:
			case GmlPackage.DOCUMENT_ROOT__OBSERVATION:
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
			case GmlPackage.DOCUMENT_ROOT__DIRECTION:
			case GmlPackage.DOCUMENT_ROOT__DIRECTION_VECTOR:
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE:
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE_VALUE:
			case GmlPackage.DOCUMENT_ROOT__DOMAIN_SET:
			case GmlPackage.DOCUMENT_ROOT__EDGE:
			case GmlPackage.DOCUMENT_ROOT__EDGE_OF:
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID:
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS:
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_ID:
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_NAME:
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_REF:
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS:
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM:
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE:
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
			case GmlPackage.DOCUMENT_ROOT__EXTENT_OF:
			case GmlPackage.DOCUMENT_ROOT__EXTERIOR:
			case GmlPackage.DOCUMENT_ROOT__FACE:
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION1:
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__FEATURE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE:
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE1:
			case GmlPackage.DOCUMENT_ROOT__FILE:
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
			case GmlPackage.DOCUMENT_ROOT__GENERIC_META_DATA:
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS:
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__GEODESIC:
			case GmlPackage.DOCUMENT_ROOT__GEODESIC_STRING:
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM:
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM_REF:
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS:
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE:
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE1:
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE:
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE1:
			case GmlPackage.DOCUMENT_ROOT__GREENWICH_LONGITUDE:
			case GmlPackage.DOCUMENT_ROOT__GRID:
			case GmlPackage.DOCUMENT_ROOT__GRID_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__GRID_DOMAIN:
			case GmlPackage.DOCUMENT_ROOT__GRID_FUNCTION:
			case GmlPackage.DOCUMENT_ROOT__GROUP_ID:
			case GmlPackage.DOCUMENT_ROOT__GROUP_NAME:
			case GmlPackage.DOCUMENT_ROOT__HISTORY:
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS:
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM:
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM_REF:
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_CRS:
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_ELEMENT:
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_PARAMETER:
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_VALUE:
			case GmlPackage.DOCUMENT_ROOT__INDEX_MAP:
			case GmlPackage.DOCUMENT_ROOT__INDIRECT_ENTRY:
			case GmlPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
			case GmlPackage.DOCUMENT_ROOT__INTERIOR:
			case GmlPackage.DOCUMENT_ROOT__INVERSE_FLATTENING:
			case GmlPackage.DOCUMENT_ROOT__ISOLATED:
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE:
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE1:
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS:
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__LINEAR_RING:
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING:
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_SEGMENT:
			case GmlPackage.DOCUMENT_ROOT__LOCATION:
			case GmlPackage.DOCUMENT_ROOT__LOCATION_KEY_WORD:
			case GmlPackage.DOCUMENT_ROOT__LOCATION_STRING:
			case GmlPackage.DOCUMENT_ROOT__MAPPING_RULE:
			case GmlPackage.DOCUMENT_ROOT__MAXIMAL_COMPLEX:
			case GmlPackage.DOCUMENT_ROOT__MEASURE:
			case GmlPackage.DOCUMENT_ROOT__MEASURE_DESCRIPTION:
			case GmlPackage.DOCUMENT_ROOT__MEMBER:
			case GmlPackage.DOCUMENT_ROOT__MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_ID:
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_NAME:
			case GmlPackage.DOCUMENT_ROOT__META_DATA_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__METHOD_FORMULA:
			case GmlPackage.DOCUMENT_ROOT__METHOD_ID:
			case GmlPackage.DOCUMENT_ROOT__METHOD_NAME:
			case GmlPackage.DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_OF:
			case GmlPackage.DOCUMENT_ROOT__MULTI_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE:
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__MULTI_EDGE_OF:
			case GmlPackage.DOCUMENT_ROOT__MULTI_EXTENT_OF:
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__MULTI_LINE_STRING:
			case GmlPackage.DOCUMENT_ROOT__MULTI_LOCATION:
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT:
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__MULTI_POLYGON:
			case GmlPackage.DOCUMENT_ROOT__MULTI_POSITION:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__NODE:
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__OFFSET_CURVE:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD_REF:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
			case GmlPackage.DOCUMENT_ROOT__OPERATION_REF:
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_CURVE:
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_ID:
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_NAME:
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE:
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
			case GmlPackage.DOCUMENT_ROOT__PATCHES:
			case GmlPackage.DOCUMENT_ROOT__PIXEL_IN_CELL:
			case GmlPackage.DOCUMENT_ROOT__POINT:
			case GmlPackage.DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__POINT_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__POINT_REP:
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS:
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__POLYGON:
			case GmlPackage.DOCUMENT_ROOT__POLYGON_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCH:
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCHES:
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__SURFACE1:
			case GmlPackage.DOCUMENT_ROOT__POS:
			case GmlPackage.DOCUMENT_ROOT__POSITION:
			case GmlPackage.DOCUMENT_ROOT__POS_LIST:
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN:
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
			case GmlPackage.DOCUMENT_ROOT__PRIORITY_LOCATION:
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS:
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__QUANTITY:
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_EXTENT:
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_LIST:
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_TYPE:
			case GmlPackage.DOCUMENT_ROOT__RANGE_PARAMETERS:
			case GmlPackage.DOCUMENT_ROOT__RANGE_SET:
			case GmlPackage.DOCUMENT_ROOT__RECTANGLE:
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID:
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
			case GmlPackage.DOCUMENT_ROOT__RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
			case GmlPackage.DOCUMENT_ROOT__REMARKS:
			case GmlPackage.DOCUMENT_ROOT__RESULT:
			case GmlPackage.DOCUMENT_ROOT__RESULT_OF:
			case GmlPackage.DOCUMENT_ROOT__RING1:
			case GmlPackage.DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
			case GmlPackage.DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
			case GmlPackage.DOCUMENT_ROOT__SEGMENTS:
			case GmlPackage.DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
			case GmlPackage.DOCUMENT_ROOT__SEMI_MINOR_AXIS:
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION_REF:
			case GmlPackage.DOCUMENT_ROOT__SOLID1:
			case GmlPackage.DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__SOLID_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__SOURCE_CRS:
			case GmlPackage.DOCUMENT_ROOT__SPHERE:
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS:
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__SRS_ID:
			case GmlPackage.DOCUMENT_ROOT__SRS_NAME:
			case GmlPackage.DOCUMENT_ROOT__STATUS:
			case GmlPackage.DOCUMENT_ROOT__STYLE1:
			case GmlPackage.DOCUMENT_ROOT__SUB_COMPLEX:
			case GmlPackage.DOCUMENT_ROOT__SUBJECT:
			case GmlPackage.DOCUMENT_ROOT__TARGET:
			case GmlPackage.DOCUMENT_ROOT__SUPER_COMPLEX:
			case GmlPackage.DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__SYMBOL:
			case GmlPackage.DOCUMENT_ROOT__TARGET_CRS:
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS:
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS:
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM:
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR:
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR_ERA:
			case GmlPackage.DOCUMENT_ROOT__TIME_CLOCK:
			case GmlPackage.DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
			case GmlPackage.DOCUMENT_ROOT__TIME_EDGE:
			case GmlPackage.DOCUMENT_ROOT__TIME_INSTANT:
			case GmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
			case GmlPackage.DOCUMENT_ROOT__TIME_NODE:
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_ERA:
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
			case GmlPackage.DOCUMENT_ROOT__TIME_PERIOD:
			case GmlPackage.DOCUMENT_ROOT__TIME_POSITION:
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
			case GmlPackage.DOCUMENT_ROOT__TIN:
			case GmlPackage.DOCUMENT_ROOT__TRIANGULATED_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX:
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE:
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE:
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE1:
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT:
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
			case GmlPackage.DOCUMENT_ROOT__TOPO_SOLID:
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE:
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME:
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__TRACK:
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION:
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION_REF:
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE:
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE_PATCHES:
			case GmlPackage.DOCUMENT_ROOT__TUPLE_LIST:
			case GmlPackage.DOCUMENT_ROOT__UNIT_OF_MEASURE:
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS:
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__USES_AXIS:
			case GmlPackage.DOCUMENT_ROOT__USES_CARTESIAN_CS:
			case GmlPackage.DOCUMENT_ROOT__USES_CS:
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOID:
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
			case GmlPackage.DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
			case GmlPackage.DOCUMENT_ROOT__USES_GEODETIC_DATUM:
			case GmlPackage.DOCUMENT_ROOT__USES_IMAGE_DATUM:
			case GmlPackage.DOCUMENT_ROOT__USES_METHOD:
			case GmlPackage.DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
			case GmlPackage.DOCUMENT_ROOT__USES_OPERATION:
			case GmlPackage.DOCUMENT_ROOT__USES_PARAMETER:
			case GmlPackage.DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
			case GmlPackage.DOCUMENT_ROOT__USES_SINGLE_OPERATION:
			case GmlPackage.DOCUMENT_ROOT__USES_SPHERICAL_CS:
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_CS:
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
			case GmlPackage.DOCUMENT_ROOT__USES_VALUE:
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_CS:
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_DATUM:
			case GmlPackage.DOCUMENT_ROOT__USING:
			case GmlPackage.DOCUMENT_ROOT__VALID_AREA:
			case GmlPackage.DOCUMENT_ROOT__VALID_TIME:
			case GmlPackage.DOCUMENT_ROOT__VALUE:
			case GmlPackage.DOCUMENT_ROOT__VALUE_ARRAY:
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENT:
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENTS:
			case GmlPackage.DOCUMENT_ROOT__VALUE_LIST:
			case GmlPackage.DOCUMENT_ROOT__VALUE_OF_PARAMETER:
			case GmlPackage.DOCUMENT_ROOT__VALUE_PROPERTY:
			case GmlPackage.DOCUMENT_ROOT__VALUES_OF_GROUP:
			case GmlPackage.DOCUMENT_ROOT__VECTOR:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS_REF:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS_REF:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_REF:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_TYPE:
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_EXTENT:
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
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createDefinitionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createUnitDefinitionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createBaseUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createCartesianCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createCompoundCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createConcatenatedOperationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createConventionalUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createConversionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createCoordinateSystemAxisType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createCylindricalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createDefinitionProxyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createDerivedCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createDerivedUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createDictionaryType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createEllipsoidalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createEllipsoidType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createEngineeringCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createEngineeringDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createGeocentricCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createGeodeticDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createGeographicCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createImageCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createImageDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createLinearCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createObliqueCartesianCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createOperationMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createOperationParameterGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createOperationParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createPassThroughOperationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createPolarCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createPrimeMeridianType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createProjectedCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createSphericalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTemporalCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTemporalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTemporalDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTimeCalendarEraType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTimeCalendarType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTimeClockType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTimeCoordinateSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTimeOrdinalEraType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createTransformationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createUserDefinedCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createVerticalCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createVerticalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Definition(),
				 GmlFactory.eINSTANCE.createVerticalDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AbsoluteExternalPositionalAccuracy(),
				 GmlFactory.eINSTANCE.createAbsoluteExternalPositionalAccuracyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef(),
				 GmlFactory.eINSTANCE.createAbstractGeneralOperationParameterRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AffinePlacement(),
				 GmlFactory.eINSTANCE.createAffinePlacementType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Angle(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember(),
				 GmlFactory.eINSTANCE.createFeaturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember(),
				 AppearanceFactory.eINSTANCE.createAppearancePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Arc(),
				 GmlFactory.eINSTANCE.createArcType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Arc(),
				 GmlFactory.eINSTANCE.createCircleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
				 GmlFactory.eINSTANCE.createArcStringType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
				 GmlFactory.eINSTANCE.createArcType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(),
				 GmlFactory.eINSTANCE.createCircleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge(),
				 GmlFactory.eINSTANCE.createArcByBulgeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(),
				 GmlFactory.eINSTANCE.createArcStringByBulgeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(),
				 GmlFactory.eINSTANCE.createArcByBulgeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(),
				 GmlFactory.eINSTANCE.createArcByCenterPointType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(),
				 GmlFactory.eINSTANCE.createCircleByCenterPointType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Array(),
				 GmlFactory.eINSTANCE.createArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_AxisID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Bag(),
				 GmlFactory.eINSTANCE.createBagType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS(),
				 GmlFactory.eINSTANCE.createCoordinateReferenceSystemRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve(),
				 GmlFactory.eINSTANCE.createCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface(),
				 GmlFactory.eINSTANCE.createSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit(),
				 GmlFactory.eINSTANCE.createBaseUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
				 GmlFactory.eINSTANCE.createUnitDefinitionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
				 GmlFactory.eINSTANCE.createBaseUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
				 GmlFactory.eINSTANCE.createConventionalUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(),
				 GmlFactory.eINSTANCE.createDerivedUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Bezier(),
				 GmlFactory.eINSTANCE.createBezierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(),
				 GmlFactory.eINSTANCE.createBSplineType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(),
				 GmlFactory.eINSTANCE.createBezierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BoundedBy(),
				 GmlFactory.eINSTANCE.createBoundingShapeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox(),
				 GmlFactory.eINSTANCE.createEnvelopeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox(),
				 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon(),
				 GmlFactory.eINSTANCE.createPolygonType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(),
				 GmlFactory.eINSTANCE.createCartesianCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef(),
				 GmlFactory.eINSTANCE.createCartesianCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Category(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent(),
				 GmlFactory.eINSTANCE.createCategoryExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList(),
				 GmlFactory.eINSTANCE.createCodeOrNullListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList(),
				 GmlFactory.eINSTANCE.createCategoryExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf(),
				 GmlFactory.eINSTANCE.createCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CenterOf(),
				 GmlFactory.eINSTANCE.createPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Circle(),
				 GmlFactory.eINSTANCE.createCircleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint(),
				 GmlFactory.eINSTANCE.createCircleByCenterPointType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Clothoid(),
				 GmlFactory.eINSTANCE.createClothoidType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve(),
				 GmlFactory.eINSTANCE.createCompositeCurveType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid(),
				 GmlFactory.eINSTANCE.createCompositeSolidType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(),
				 GmlFactory.eINSTANCE.createCompositeSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue(),
				 GmlFactory.eINSTANCE.createCompositeValueType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue(),
				 GmlFactory.eINSTANCE.createValueArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS(),
				 GmlFactory.eINSTANCE.createCompoundCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRSRef(),
				 GmlFactory.eINSTANCE.createCompoundCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation(),
				 GmlFactory.eINSTANCE.createConcatenatedOperationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperationRef(),
				 GmlFactory.eINSTANCE.createConcatenatedOperationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Cone(),
				 GmlFactory.eINSTANCE.createConeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Container(),
				 GmlFactory.eINSTANCE.createContainerPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit(),
				 GmlFactory.eINSTANCE.createConventionalUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Conversion(),
				 GmlFactory.eINSTANCE.createConversionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ConversionRef(),
				 GmlFactory.eINSTANCE.createConversionRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit(),
				 GmlFactory.eINSTANCE.createConversionToPreferredUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Coord(),
				 GmlFactory.eINSTANCE.createCoordType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Name(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationRef(),
				 GmlFactory.eINSTANCE.createCoordinateOperationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef(),
				 GmlFactory.eINSTANCE.createCoordinateReferenceSystemRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Coordinates(),
				 GmlFactory.eINSTANCE.createCoordinatesType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis(),
				 GmlFactory.eINSTANCE.createCoordinateSystemAxisType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef(),
				 GmlFactory.eINSTANCE.createCoordinateSystemAxisRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef(),
				 GmlFactory.eINSTANCE.createCoordinateSystemRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CovarianceMatrix(),
				 GmlFactory.eINSTANCE.createCovarianceMatrixType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CoverageFunction(),
				 GmlFactory.eINSTANCE.createCoverageFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CrsRef(),
				 GmlFactory.eINSTANCE.createCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CsID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CsName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CubicSpline(),
				 GmlFactory.eINSTANCE.createCubicSplineType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Curve1(),
				 GmlFactory.eINSTANCE.createCurveType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty(),
				 GmlFactory.eINSTANCE.createCurveArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CurveMember(),
				 GmlFactory.eINSTANCE.createCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers(),
				 GmlFactory.eINSTANCE.createCurveArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty(),
				 GmlFactory.eINSTANCE.createCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Cylinder(),
				 GmlFactory.eINSTANCE.createCylinderType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(),
				 GmlFactory.eINSTANCE.createCylindricalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCSRef(),
				 GmlFactory.eINSTANCE.createCylindricalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DataBlock(),
				 GmlFactory.eINSTANCE.createDataBlockType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DataSource(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DatumID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DatumRef(),
				 GmlFactory.eINSTANCE.createDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DefaultStyle(),
				 GmlFactory.eINSTANCE.createDefaultStylePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion(),
				 GmlFactory.eINSTANCE.createGeneralConversionRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection(),
				 GmlFactory.eINSTANCE.createDictionaryType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember(),
				 GmlFactory.eINSTANCE.createDictionaryEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry(),
				 GmlFactory.eINSTANCE.createDictionaryEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy(),
				 GmlFactory.eINSTANCE.createDefinitionProxyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionRef(),
				 GmlFactory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Degrees(),
				 GmlFactory.eINSTANCE.createDegreesType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm(),
				 GmlFactory.eINSTANCE.createDerivationUnitTermType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS(),
				 GmlFactory.eINSTANCE.createDerivedCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSRef(),
				 GmlFactory.eINSTANCE.createDerivedCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit(),
				 GmlFactory.eINSTANCE.createDerivedUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Description(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary(),
				 GmlFactory.eINSTANCE.createDictionaryType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectedEdge(),
				 GmlFactory.eINSTANCE.createDirectedEdgePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectedFace(),
				 GmlFactory.eINSTANCE.createDirectedFacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectedNode(),
				 GmlFactory.eINSTANCE.createDirectedNodePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(),
				 GmlFactory.eINSTANCE.createDirectedObservationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(),
				 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
				 GmlFactory.eINSTANCE.createObservationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
				 GmlFactory.eINSTANCE.createDirectedObservationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Observation(),
				 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance(),
				 GmlFactory.eINSTANCE.createDirectedObservationAtDistanceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectedTopoSolid(),
				 GmlFactory.eINSTANCE.createDirectedTopoSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Direction(),
				 GmlFactory.eINSTANCE.createDirectionPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DirectionVector(),
				 GmlFactory.eINSTANCE.createDirectionVectorType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle(),
				 GmlFactory.eINSTANCE.createDMSAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue(),
				 GmlFactory.eINSTANCE.createDMSAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
				 GmlFactory.eINSTANCE.createDomainSetType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
				 GmlFactory.eINSTANCE.createGridDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
				 GmlFactory.eINSTANCE.createMultiCurveDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
				 GmlFactory.eINSTANCE.createMultiPointDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
				 GmlFactory.eINSTANCE.createMultiSolidDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
				 GmlFactory.eINSTANCE.createMultiSurfaceDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(),
				 GmlFactory.eINSTANCE.createRectifiedGridDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Edge(),
				 GmlFactory.eINSTANCE.createEdgeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf(),
				 GmlFactory.eINSTANCE.createCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid(),
				 GmlFactory.eINSTANCE.createEllipsoidType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(),
				 GmlFactory.eINSTANCE.createEllipsoidalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef(),
				 GmlFactory.eINSTANCE.createEllipsoidalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef(),
				 GmlFactory.eINSTANCE.createEllipsoidRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS(),
				 GmlFactory.eINSTANCE.createEngineeringCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRSRef(),
				 GmlFactory.eINSTANCE.createEngineeringCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum(),
				 GmlFactory.eINSTANCE.createEngineeringDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef(),
				 GmlFactory.eINSTANCE.createEngineeringDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Envelope(),
				 GmlFactory.eINSTANCE.createEnvelopeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Envelope(),
				 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod(),
				 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf(),
				 GmlFactory.eINSTANCE.createSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Exterior(),
				 GmlFactory.eINSTANCE.createAbstractRingPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Face(),
				 GmlFactory.eINSTANCE.createFaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(),
				 GmlFactory.eINSTANCE.createFeatureCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(),
				 GmlFactory.eINSTANCE.createDynamicFeatureCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMembers(),
				 GmlFactory.eINSTANCE.createFeatureArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty(),
				 GmlFactory.eINSTANCE.createFeaturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty(),
				 AppearanceFactory.eINSTANCE.createAppearancePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle(),
				 GmlFactory.eINSTANCE.createFeatureStylePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle1(),
				 GmlFactory.eINSTANCE.createFeatureStyleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_File(),
				 GmlFactory.eINSTANCE.createFileType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef(),
				 GmlFactory.eINSTANCE.createGeneralConversionRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformationRef(),
				 GmlFactory.eINSTANCE.createGeneralTransformationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GenericMetaData(),
				 GmlFactory.eINSTANCE.createGenericMetaDataType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS(),
				 GmlFactory.eINSTANCE.createGeocentricCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRSRef(),
				 GmlFactory.eINSTANCE.createGeocentricCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Geodesic(),
				 GmlFactory.eINSTANCE.createGeodesicType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(),
				 GmlFactory.eINSTANCE.createGeodesicStringType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(),
				 GmlFactory.eINSTANCE.createGeodesicType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum(),
				 GmlFactory.eINSTANCE.createGeodeticDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef(),
				 GmlFactory.eINSTANCE.createGeodeticDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS(),
				 GmlFactory.eINSTANCE.createGeographicCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRSRef(),
				 GmlFactory.eINSTANCE.createGeographicCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex(),
				 GmlFactory.eINSTANCE.createGeometricComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMember(),
				 GmlFactory.eINSTANCE.createGeometryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMembers(),
				 GmlFactory.eINSTANCE.createGeometryArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle(),
				 GmlFactory.eINSTANCE.createGeometryStylePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle1(),
				 GmlFactory.eINSTANCE.createGeometryStyleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle(),
				 GmlFactory.eINSTANCE.createGraphStylePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle1(),
				 GmlFactory.eINSTANCE.createGraphStyleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GreenwichLongitude(),
				 GmlFactory.eINSTANCE.createAngleChoiceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
				 GmlFactory.eINSTANCE.createGridType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Grid(),
				 GmlFactory.eINSTANCE.createRectifiedGridType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GridCoverage(),
				 GmlFactory.eINSTANCE.createGridCoverageType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GridDomain(),
				 GmlFactory.eINSTANCE.createGridDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction(),
				 GmlFactory.eINSTANCE.createGridFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction(),
				 GmlFactory.eINSTANCE.createIndexMapType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GroupID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_History(),
				 GmlFactory.eINSTANCE.createHistoryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_History(),
				 GmlFactory.eINSTANCE.createTrackType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS(),
				 GmlFactory.eINSTANCE.createImageCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRSRef(),
				 GmlFactory.eINSTANCE.createImageCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum(),
				 GmlFactory.eINSTANCE.createImageDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef(),
				 GmlFactory.eINSTANCE.createImageDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS(),
				 GmlFactory.eINSTANCE.createCoordinateReferenceSystemRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_IncludesElement(),
				 GmlFactory.eINSTANCE.createCovarianceElementType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter(),
				 GmlFactory.eINSTANCE.createAbstractGeneralOperationParameterRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue(),
				 GmlFactory.eINSTANCE.createParameterValueGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue(),
				 GmlFactory.eINSTANCE.createParameterValueType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_IndexMap(),
				 GmlFactory.eINSTANCE.createIndexMapType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_IndirectEntry(),
				 GmlFactory.eINSTANCE.createIndirectEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(),
				 GmlFactory.eINSTANCE.createAbstractRingPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Interior(),
				 GmlFactory.eINSTANCE.createAbstractRingPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Isolated(),
				 GmlFactory.eINSTANCE.createIsolatedPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle(),
				 GmlFactory.eINSTANCE.createLabelStylePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle1(),
				 GmlFactory.eINSTANCE.createLabelStyleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(),
				 GmlFactory.eINSTANCE.createLinearCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LinearCSRef(),
				 GmlFactory.eINSTANCE.createLinearCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing(),
				 GmlFactory.eINSTANCE.createLinearRingType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LineString(),
				 GmlFactory.eINSTANCE.createLineStringType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember(),
				 GmlFactory.eINSTANCE.createLineStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty(),
				 GmlFactory.eINSTANCE.createLineStringPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LineStringSegment(),
				 GmlFactory.eINSTANCE.createLineStringSegmentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Location(),
				 GmlFactory.eINSTANCE.createLocationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Location(),
				 GmlFactory.eINSTANCE.createPriorityLocationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_LocationString(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MappingRule(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex(),
				 GmlFactory.eINSTANCE.createTopoComplexMemberType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Measure(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 GmlFactory.eINSTANCE.createAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 BuildingFactory.eINSTANCE.createBoundarySurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 BuildingFactory.eINSTANCE.createBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 BuildingFactory.eINSTANCE.createBuildingPartPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 BuildingFactory.eINSTANCE.createIntBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 BuildingFactory.eINSTANCE.createInteriorFurniturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 BuildingFactory.eINSTANCE.createInteriorRoomPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 BuildingFactory.eINSTANCE.createOpeningPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 CitygmlFactory.eINSTANCE.createAddressPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 TransportationFactory.eINSTANCE.createTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 ReliefFactory.eINSTANCE.createGridPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 ReliefFactory.eINSTANCE.createReliefComponentPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 ReliefFactory.eINSTANCE.createTinPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Member(),
				 WaterbodyFactory.eINSTANCE.createBoundedByWaterSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Members(),
				 GmlFactory.eINSTANCE.createArrayAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeridianID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MetaDataProperty(),
				 GmlFactory.eINSTANCE.createMetaDataPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MovingObjectStatus(),
				 GmlFactory.eINSTANCE.createMovingObjectStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf(),
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf(),
				 GmlFactory.eINSTANCE.createMultiPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage(),
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(),
				 GmlFactory.eINSTANCE.createMultiCurveType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveCoverage(),
				 GmlFactory.eINSTANCE.createMultiCurveCoverageType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain(),
				 GmlFactory.eINSTANCE.createMultiCurveDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty(),
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf(),
				 GmlFactory.eINSTANCE.createMultiCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf(),
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(),
				 GmlFactory.eINSTANCE.createMultiGeometryType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometryProperty(),
				 GmlFactory.eINSTANCE.createMultiGeometryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(),
				 GmlFactory.eINSTANCE.createMultiLineStringType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation(),
				 GmlFactory.eINSTANCE.createMultiPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(),
				 GmlFactory.eINSTANCE.createMultiPointType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointCoverage(),
				 GmlFactory.eINSTANCE.createMultiPointCoverageType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain(),
				 GmlFactory.eINSTANCE.createMultiPointDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty(),
				 GmlFactory.eINSTANCE.createMultiPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(),
				 GmlFactory.eINSTANCE.createMultiPolygonType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition(),
				 GmlFactory.eINSTANCE.createMultiPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(),
				 GmlFactory.eINSTANCE.createMultiSolidType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidCoverage(),
				 GmlFactory.eINSTANCE.createMultiSolidCoverageType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain(),
				 GmlFactory.eINSTANCE.createMultiSolidDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidProperty(),
				 GmlFactory.eINSTANCE.createMultiSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(),
				 GmlFactory.eINSTANCE.createMultiSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceCoverage(),
				 GmlFactory.eINSTANCE.createMultiSurfaceCoverageType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain(),
				 GmlFactory.eINSTANCE.createMultiSurfaceDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty(),
				 GmlFactory.eINSTANCE.createMultiSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Node(),
				 GmlFactory.eINSTANCE.createNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(),
				 GmlFactory.eINSTANCE.createObliqueCartesianCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef(),
				 GmlFactory.eINSTANCE.createObliqueCartesianCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OffsetCurve(),
				 GmlFactory.eINSTANCE.createOffsetCurveType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod(),
				 GmlFactory.eINSTANCE.createOperationMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef(),
				 GmlFactory.eINSTANCE.createOperationMethodRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter(),
				 GmlFactory.eINSTANCE.createOperationParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup(),
				 GmlFactory.eINSTANCE.createOperationParameterGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef(),
				 GmlFactory.eINSTANCE.createOperationParameterRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef(),
				 GmlFactory.eINSTANCE.createOperationParameterRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OperationRef(),
				 GmlFactory.eINSTANCE.createOperationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve(),
				 GmlFactory.eINSTANCE.createOrientableCurveType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
				 GmlFactory.eINSTANCE.createOrientableSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(),
				 TexturedsurfaceFactory.eINSTANCE.createTexturedSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(),
				 GmlFactory.eINSTANCE.createAbstractRingPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ParameterID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue(),
				 GmlFactory.eINSTANCE.createParameterValueType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup(),
				 GmlFactory.eINSTANCE.createParameterValueGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation(),
				 GmlFactory.eINSTANCE.createPassThroughOperationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperationRef(),
				 GmlFactory.eINSTANCE.createPassThroughOperationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Patches(),
				 GmlFactory.eINSTANCE.createSurfacePatchArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Patches(),
				 GmlFactory.eINSTANCE.createPolygonPatchArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Patches(),
				 GmlFactory.eINSTANCE.createTrianglePatchArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Point(),
				 GmlFactory.eINSTANCE.createPointType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty(),
				 GmlFactory.eINSTANCE.createPointArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PointMember(),
				 GmlFactory.eINSTANCE.createPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PointMembers(),
				 GmlFactory.eINSTANCE.createPointArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PointProperty(),
				 GmlFactory.eINSTANCE.createPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PointRep(),
				 GmlFactory.eINSTANCE.createPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(),
				 GmlFactory.eINSTANCE.createPolarCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PolarCSRef(),
				 GmlFactory.eINSTANCE.createPolarCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(),
				 GmlFactory.eINSTANCE.createPolygonType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember(),
				 GmlFactory.eINSTANCE.createPolygonPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatch(),
				 GmlFactory.eINSTANCE.createPolygonPatchType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches(),
				 GmlFactory.eINSTANCE.createPolygonPatchArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty(),
				 GmlFactory.eINSTANCE.createPolygonPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(),
				 GmlFactory.eINSTANCE.createPolyhedralSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
				 GmlFactory.eINSTANCE.createSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
				 GmlFactory.eINSTANCE.createPolyhedralSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
				 GmlFactory.eINSTANCE.createTriangulatedSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(),
				 GmlFactory.eINSTANCE.createTinType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Pos(),
				 GmlFactory.eINSTANCE.createDirectPositionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Position(),
				 GmlFactory.eINSTANCE.createPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PosList(),
				 GmlFactory.eINSTANCE.createDirectPositionListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian(),
				 GmlFactory.eINSTANCE.createPrimeMeridianType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef(),
				 GmlFactory.eINSTANCE.createPrimeMeridianRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation(),
				 GmlFactory.eINSTANCE.createPriorityLocationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS(),
				 GmlFactory.eINSTANCE.createProjectedCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRSRef(),
				 GmlFactory.eINSTANCE.createProjectedCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent(),
				 GmlFactory.eINSTANCE.createQuantityExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList(),
				 GmlFactory.eINSTANCE.createMeasureOrNullListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList(),
				 GmlFactory.eINSTANCE.createQuantityExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_QuantityType(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_RangeParameters(),
				 GmlFactory.eINSTANCE.createRangeParametersType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_RangeSet(),
				 GmlFactory.eINSTANCE.createRangeSetType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Rectangle(),
				 GmlFactory.eINSTANCE.createRectangleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid(),
				 GmlFactory.eINSTANCE.createRectifiedGridType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridCoverage(),
				 GmlFactory.eINSTANCE.createRectifiedGridCoverageType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain(),
				 GmlFactory.eINSTANCE.createRectifiedGridDomainType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystemRef(),
				 GmlFactory.eINSTANCE.createReferenceSystemRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_RelativeInternalPositionalAccuracy(),
				 GmlFactory.eINSTANCE.createRelativeInternalPositionalAccuracyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Remarks(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Result(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 GmlFactory.eINSTANCE.createAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 BuildingFactory.eINSTANCE.createBoundarySurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 BuildingFactory.eINSTANCE.createBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 BuildingFactory.eINSTANCE.createBuildingPartPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 BuildingFactory.eINSTANCE.createIntBuildingInstallationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 BuildingFactory.eINSTANCE.createInteriorFurniturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 BuildingFactory.eINSTANCE.createInteriorRoomPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 BuildingFactory.eINSTANCE.createOpeningPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 CitygmlFactory.eINSTANCE.createAddressPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 CitygmlFactory.eINSTANCE.createImplicitRepresentationPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 TransportationFactory.eINSTANCE.createAuxiliaryTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 TransportationFactory.eINSTANCE.createTrafficAreaPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 ReliefFactory.eINSTANCE.createGridPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 ReliefFactory.eINSTANCE.createReliefComponentPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 ReliefFactory.eINSTANCE.createTinPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(),
				 WaterbodyFactory.eINSTANCE.createBoundedByWaterSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Ring1(),
				 GmlFactory.eINSTANCE.createRingType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit(),
				 GmlFactory.eINSTANCE.createConversionToPreferredUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SecondDefiningParameter(),
				 GmlFactory.eINSTANCE.createSecondDefiningParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Segments(),
				 GmlFactory.eINSTANCE.createCurveSegmentArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef(),
				 GmlFactory.eINSTANCE.createSingleOperationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Solid1(),
				 GmlFactory.eINSTANCE.createSolidType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty(),
				 GmlFactory.eINSTANCE.createSolidArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SolidMember(),
				 GmlFactory.eINSTANCE.createSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers(),
				 GmlFactory.eINSTANCE.createSolidArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty(),
				 GmlFactory.eINSTANCE.createSolidPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS(),
				 GmlFactory.eINSTANCE.createCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Sphere(),
				 GmlFactory.eINSTANCE.createSphereType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(),
				 GmlFactory.eINSTANCE.createSphericalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef(),
				 GmlFactory.eINSTANCE.createSphericalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SrsID(),
				 GmlFactory.eINSTANCE.createIdentifierType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
				 GmlFactory.eINSTANCE.createCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
				 GmlFactory.eINSTANCE.createDerivedCRSTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
				 GmlFactory.eINSTANCE.createPixelInCellType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Status(),
				 GmlFactory.eINSTANCE.createStringOrRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Style1(),
				 GmlFactory.eINSTANCE.createStyleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SubComplex(),
				 GmlFactory.eINSTANCE.createTopoComplexMemberType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Subject(),
				 GmlFactory.eINSTANCE.createTargetPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Target(),
				 GmlFactory.eINSTANCE.createTargetPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex(),
				 GmlFactory.eINSTANCE.createTopoComplexMemberType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty(),
				 GmlFactory.eINSTANCE.createSurfaceArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember(),
				 GmlFactory.eINSTANCE.createSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers(),
				 GmlFactory.eINSTANCE.createSurfaceArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty(),
				 GmlFactory.eINSTANCE.createSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Symbol(),
				 GmlFactory.eINSTANCE.createSymbolType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS(),
				 GmlFactory.eINSTANCE.createCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS(),
				 GmlFactory.eINSTANCE.createTemporalCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRSRef(),
				 GmlFactory.eINSTANCE.createTemporalCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(),
				 GmlFactory.eINSTANCE.createTemporalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef(),
				 GmlFactory.eINSTANCE.createTemporalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum(),
				 GmlFactory.eINSTANCE.createTemporalDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef(),
				 GmlFactory.eINSTANCE.createTemporalDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent(),
				 GmlFactory.eINSTANCE.createTimePeriodType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar(),
				 GmlFactory.eINSTANCE.createTimeCalendarType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra(),
				 GmlFactory.eINSTANCE.createTimeCalendarEraType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock(),
				 GmlFactory.eINSTANCE.createTimeClockType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem(),
				 GmlFactory.eINSTANCE.createTimeCoordinateSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeEdge(),
				 GmlFactory.eINSTANCE.createTimeEdgeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeInstant(),
				 GmlFactory.eINSTANCE.createTimeInstantType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(),
				 GmlFactory.eINSTANCE.createTimeIntervalLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeNode(),
				 GmlFactory.eINSTANCE.createTimeNodeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra(),
				 GmlFactory.eINSTANCE.createTimeOrdinalEraType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem(),
				 GmlFactory.eINSTANCE.createTimeOrdinalReferenceSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod(),
				 GmlFactory.eINSTANCE.createTimePeriodType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimePosition(),
				 GmlFactory.eINSTANCE.createTimePositionType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyComplex(),
				 GmlFactory.eINSTANCE.createTimeTopologyComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Tin(),
				 GmlFactory.eINSTANCE.createTinType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
				 GmlFactory.eINSTANCE.createTriangulatedSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(),
				 GmlFactory.eINSTANCE.createTinType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplex(),
				 GmlFactory.eINSTANCE.createTopoComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty(),
				 GmlFactory.eINSTANCE.createTopoComplexMemberType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurve(),
				 GmlFactory.eINSTANCE.createTopoCurveType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurveProperty(),
				 GmlFactory.eINSTANCE.createTopoCurvePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle(),
				 GmlFactory.eINSTANCE.createTopologyStylePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle1(),
				 GmlFactory.eINSTANCE.createTopologyStyleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoPoint(),
				 GmlFactory.eINSTANCE.createTopoPointType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoPointProperty(),
				 GmlFactory.eINSTANCE.createTopoPointPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMember(),
				 GmlFactory.eINSTANCE.createTopoPrimitiveMemberType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMembers(),
				 GmlFactory.eINSTANCE.createTopoPrimitiveArrayAssociationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoSolid(),
				 GmlFactory.eINSTANCE.createTopoSolidType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurface(),
				 GmlFactory.eINSTANCE.createTopoSurfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurfaceProperty(),
				 GmlFactory.eINSTANCE.createTopoSurfacePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolume(),
				 GmlFactory.eINSTANCE.createTopoVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolumeProperty(),
				 GmlFactory.eINSTANCE.createTopoVolumePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Track(),
				 GmlFactory.eINSTANCE.createTrackType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Transformation(),
				 GmlFactory.eINSTANCE.createTransformationType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TransformationRef(),
				 GmlFactory.eINSTANCE.createTransformationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Triangle(),
				 GmlFactory.eINSTANCE.createTriangleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches(),
				 GmlFactory.eINSTANCE.createTrianglePatchArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_TupleList(),
				 GmlFactory.eINSTANCE.createCoordinatesType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(),
				 GmlFactory.eINSTANCE.createUnitOfMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(),
				 GmlFactory.eINSTANCE.createConversionToPreferredUnitType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(),
				 GmlFactory.eINSTANCE.createDerivationUnitTermType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(),
				 GmlFactory.eINSTANCE.createUserDefinedCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCSRef(),
				 GmlFactory.eINSTANCE.createUserDefinedCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis(),
				 GmlFactory.eINSTANCE.createCoordinateSystemAxisRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS(),
				 GmlFactory.eINSTANCE.createCartesianCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesCS(),
				 GmlFactory.eINSTANCE.createCoordinateSystemRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid(),
				 GmlFactory.eINSTANCE.createEllipsoidRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS(),
				 GmlFactory.eINSTANCE.createEllipsoidalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum(),
				 GmlFactory.eINSTANCE.createEngineeringDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum(),
				 GmlFactory.eINSTANCE.createGeodeticDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum(),
				 GmlFactory.eINSTANCE.createImageDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod(),
				 GmlFactory.eINSTANCE.createOperationMethodRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS(),
				 GmlFactory.eINSTANCE.createObliqueCartesianCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation(),
				 GmlFactory.eINSTANCE.createOperationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter(),
				 GmlFactory.eINSTANCE.createAbstractGeneralOperationParameterRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian(),
				 GmlFactory.eINSTANCE.createPrimeMeridianRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation(),
				 GmlFactory.eINSTANCE.createSingleOperationRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS(),
				 GmlFactory.eINSTANCE.createSphericalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS(),
				 GmlFactory.eINSTANCE.createTemporalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum(),
				 GmlFactory.eINSTANCE.createTemporalDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesValue(),
				 GmlFactory.eINSTANCE.createParameterValueType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS(),
				 GmlFactory.eINSTANCE.createVerticalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum(),
				 GmlFactory.eINSTANCE.createVerticalDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Using(),
				 GmlFactory.eINSTANCE.createFeaturePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Using(),
				 AppearanceFactory.eINSTANCE.createAppearancePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValidArea(),
				 GmlFactory.eINSTANCE.createExtentType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime(),
				 GmlFactory.eINSTANCE.createTimePrimitivePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime(),
				 GmlFactory.eINSTANCE.createRelatedTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createMeasureType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createAngleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createGridLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createLengthType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createScaleType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createSpeedType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Value(),
				 GmlFactory.eINSTANCE.createVolumeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray(),
				 GmlFactory.eINSTANCE.createValueArrayType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
				 GmlFactory.eINSTANCE.createValuePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
				 GmlFactory.eINSTANCE.createBooleanPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
				 GmlFactory.eINSTANCE.createCategoryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
				 GmlFactory.eINSTANCE.createCountPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
				 GmlFactory.eINSTANCE.createQuantityPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(),
				 GmlFactory.eINSTANCE.createScalarValuePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponents(),
				 GmlFactory.eINSTANCE.createValueArrayPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueList(),
				 GmlFactory.eINSTANCE.createMeasureListType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter(),
				 GmlFactory.eINSTANCE.createOperationParameterRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
				 GmlFactory.eINSTANCE.createValuePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
				 GmlFactory.eINSTANCE.createBooleanPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
				 GmlFactory.eINSTANCE.createCategoryPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
				 GmlFactory.eINSTANCE.createCountPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
				 GmlFactory.eINSTANCE.createQuantityPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(),
				 GmlFactory.eINSTANCE.createScalarValuePropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_ValuesOfGroup(),
				 GmlFactory.eINSTANCE.createOperationParameterGroupRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_Vector(),
				 GmlFactory.eINSTANCE.createVectorType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS(),
				 GmlFactory.eINSTANCE.createVerticalCRSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRSRef(),
				 GmlFactory.eINSTANCE.createVerticalCRSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(),
				 GmlFactory.eINSTANCE.createVerticalCSType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef(),
				 GmlFactory.eINSTANCE.createVerticalCSRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum(),
				 GmlFactory.eINSTANCE.createVerticalDatumType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef(),
				 GmlFactory.eINSTANCE.createVerticalDatumRefType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType(),
				 GmlFactory.eINSTANCE.createVerticalDatumTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent(),
				 GmlFactory.eINSTANCE.createEnvelopeType()));

		newChildDescriptors.add
			(createChildParameter
				(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent(),
				 GmlFactory.eINSTANCE.createEnvelopeWithTimePeriodType()));
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

		boolean qualify =
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
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Transformation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Category() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Name() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CsName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DatumName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GroupName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeridianName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsName() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Angle() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Measure() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Quantity() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Result() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Value() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Using() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Arc() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcString() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Circle() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_AxisID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CsID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DatumID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GroupID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MeridianID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MethodID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SrsID() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Bezier() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BSpline() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Envelope() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Polygon() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CategoryList() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CenterOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointRep() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Position() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueArray() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Coordinates() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TupleList() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CrsRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DataSource() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Description() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LocationString() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MappingRule() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_QuantityType() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Remarks() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Status() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Observation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_DomainSet() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GridDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Exterior() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Interior() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Geodesic() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Grid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_GridFunction() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IndexMap() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_History() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Track() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesValue() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Location() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SubComplex() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Member() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ResultOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_OperationRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Patches() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PointMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Surface1() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Tin() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_QuantityList() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidMember() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Subject() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_Target() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent() ||
			childFeature == GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty();

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
