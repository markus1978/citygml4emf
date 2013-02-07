/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.util;

import net.opengis.gml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.gml.GmlPackage
 * @generated
 */
public class GmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GmlSwitch<Adapter> modelSwitch =
		new GmlSwitch<Adapter>() {
			@Override
			public Adapter caseAbsoluteExternalPositionalAccuracyType(AbsoluteExternalPositionalAccuracyType object) {
				return createAbsoluteExternalPositionalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractContinuousCoverageType(AbstractContinuousCoverageType object) {
				return createAbstractContinuousCoverageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateOperationBaseType(AbstractCoordinateOperationBaseType object) {
				return createAbstractCoordinateOperationBaseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateOperationType(AbstractCoordinateOperationType object) {
				return createAbstractCoordinateOperationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateSystemBaseType(AbstractCoordinateSystemBaseType object) {
				return createAbstractCoordinateSystemBaseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateSystemType(AbstractCoordinateSystemType object) {
				return createAbstractCoordinateSystemTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoverageType(AbstractCoverageType object) {
				return createAbstractCoverageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCurveSegmentType(AbstractCurveSegmentType object) {
				return createAbstractCurveSegmentTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCurveType(AbstractCurveType object) {
				return createAbstractCurveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDatumBaseType(AbstractDatumBaseType object) {
				return createAbstractDatumBaseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDatumType(AbstractDatumType object) {
				return createAbstractDatumTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDiscreteCoverageType(AbstractDiscreteCoverageType object) {
				return createAbstractDiscreteCoverageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureCollectionType(AbstractFeatureCollectionType object) {
				return createAbstractFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureType(AbstractFeatureType object) {
				return createAbstractFeatureTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralConversionType(AbstractGeneralConversionType object) {
				return createAbstractGeneralConversionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralDerivedCRSType(AbstractGeneralDerivedCRSType object) {
				return createAbstractGeneralDerivedCRSTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralOperationParameterRefType(AbstractGeneralOperationParameterRefType object) {
				return createAbstractGeneralOperationParameterRefTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralOperationParameterType(AbstractGeneralOperationParameterType object) {
				return createAbstractGeneralOperationParameterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralParameterValueType(AbstractGeneralParameterValueType object) {
				return createAbstractGeneralParameterValueTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralTransformationType(AbstractGeneralTransformationType object) {
				return createAbstractGeneralTransformationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometricAggregateType(AbstractGeometricAggregateType object) {
				return createAbstractGeometricAggregateTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType object) {
				return createAbstractGeometricPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometryType(AbstractGeometryType object) {
				return createAbstractGeometryTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGriddedSurfaceType(AbstractGriddedSurfaceType object) {
				return createAbstractGriddedSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMetaDataType(AbstractMetaDataType object) {
				return createAbstractMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseAbstractParametricCurveSurfaceType(AbstractParametricCurveSurfaceType object) {
				return createAbstractParametricCurveSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractPositionalAccuracyType(AbstractPositionalAccuracyType object) {
				return createAbstractPositionalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractReferenceSystemBaseType(AbstractReferenceSystemBaseType object) {
				return createAbstractReferenceSystemBaseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractReferenceSystemType(AbstractReferenceSystemType object) {
				return createAbstractReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingPropertyType(AbstractRingPropertyType object) {
				return createAbstractRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingType(AbstractRingType object) {
				return createAbstractRingTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSolidType(AbstractSolidType object) {
				return createAbstractSolidTypeAdapter();
			}
			@Override
			public Adapter caseAbstractStyleType(AbstractStyleType object) {
				return createAbstractStyleTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSurfacePatchType(AbstractSurfacePatchType object) {
				return createAbstractSurfacePatchTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSurfaceType(AbstractSurfaceType object) {
				return createAbstractSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeComplexType(AbstractTimeComplexType object) {
				return createAbstractTimeComplexTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeGeometricPrimitiveType(AbstractTimeGeometricPrimitiveType object) {
				return createAbstractTimeGeometricPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeObjectType(AbstractTimeObjectType object) {
				return createAbstractTimeObjectTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimePrimitiveType(AbstractTimePrimitiveType object) {
				return createAbstractTimePrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeReferenceSystemType(AbstractTimeReferenceSystemType object) {
				return createAbstractTimeReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeSliceType(AbstractTimeSliceType object) {
				return createAbstractTimeSliceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeTopologyPrimitiveType(AbstractTimeTopologyPrimitiveType object) {
				return createAbstractTimeTopologyPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTopologyType(AbstractTopologyType object) {
				return createAbstractTopologyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTopoPrimitiveType(AbstractTopoPrimitiveType object) {
				return createAbstractTopoPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAffinePlacementType(AffinePlacementType object) {
				return createAffinePlacementTypeAdapter();
			}
			@Override
			public Adapter caseAngleChoiceType(AngleChoiceType object) {
				return createAngleChoiceTypeAdapter();
			}
			@Override
			public Adapter caseAngleType(AngleType object) {
				return createAngleTypeAdapter();
			}
			@Override
			public Adapter caseArcByBulgeType(ArcByBulgeType object) {
				return createArcByBulgeTypeAdapter();
			}
			@Override
			public Adapter caseArcByCenterPointType(ArcByCenterPointType object) {
				return createArcByCenterPointTypeAdapter();
			}
			@Override
			public Adapter caseArcStringByBulgeType(ArcStringByBulgeType object) {
				return createArcStringByBulgeTypeAdapter();
			}
			@Override
			public Adapter caseArcStringType(ArcStringType object) {
				return createArcStringTypeAdapter();
			}
			@Override
			public Adapter caseArcType(ArcType object) {
				return createArcTypeAdapter();
			}
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseArrayAssociationType(ArrayAssociationType object) {
				return createArrayAssociationTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseAssociationType(AssociationType object) {
				return createAssociationTypeAdapter();
			}
			@Override
			public Adapter caseBagType(BagType object) {
				return createBagTypeAdapter();
			}
			@Override
			public Adapter caseBaseStyleDescriptorType(BaseStyleDescriptorType object) {
				return createBaseStyleDescriptorTypeAdapter();
			}
			@Override
			public Adapter caseBaseUnitType(BaseUnitType object) {
				return createBaseUnitTypeAdapter();
			}
			@Override
			public Adapter caseBezierType(BezierType object) {
				return createBezierTypeAdapter();
			}
			@Override
			public Adapter caseBooleanPropertyType(BooleanPropertyType object) {
				return createBooleanPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBoundedFeatureType(BoundedFeatureType object) {
				return createBoundedFeatureTypeAdapter();
			}
			@Override
			public Adapter caseBoundingShapeType(BoundingShapeType object) {
				return createBoundingShapeTypeAdapter();
			}
			@Override
			public Adapter caseBSplineType(BSplineType object) {
				return createBSplineTypeAdapter();
			}
			@Override
			public Adapter caseCartesianCSRefType(CartesianCSRefType object) {
				return createCartesianCSRefTypeAdapter();
			}
			@Override
			public Adapter caseCartesianCSType(CartesianCSType object) {
				return createCartesianCSTypeAdapter();
			}
			@Override
			public Adapter caseCategoryExtentType(CategoryExtentType object) {
				return createCategoryExtentTypeAdapter();
			}
			@Override
			public Adapter caseCategoryPropertyType(CategoryPropertyType object) {
				return createCategoryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCircleByCenterPointType(CircleByCenterPointType object) {
				return createCircleByCenterPointTypeAdapter();
			}
			@Override
			public Adapter caseCircleType(CircleType object) {
				return createCircleTypeAdapter();
			}
			@Override
			public Adapter caseClothoidType(ClothoidType object) {
				return createClothoidTypeAdapter();
			}
			@Override
			public Adapter caseCodeListType(CodeListType object) {
				return createCodeListTypeAdapter();
			}
			@Override
			public Adapter caseCodeOrNullListType(CodeOrNullListType object) {
				return createCodeOrNullListTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseCompositeCurvePropertyType(CompositeCurvePropertyType object) {
				return createCompositeCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompositeCurveType(CompositeCurveType object) {
				return createCompositeCurveTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSolidPropertyType(CompositeSolidPropertyType object) {
				return createCompositeSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSolidType(CompositeSolidType object) {
				return createCompositeSolidTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSurfacePropertyType(CompositeSurfacePropertyType object) {
				return createCompositeSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSurfaceType(CompositeSurfaceType object) {
				return createCompositeSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseCompositeValueType(CompositeValueType object) {
				return createCompositeValueTypeAdapter();
			}
			@Override
			public Adapter caseCompoundCRSRefType(CompoundCRSRefType object) {
				return createCompoundCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseCompoundCRSType(CompoundCRSType object) {
				return createCompoundCRSTypeAdapter();
			}
			@Override
			public Adapter caseConcatenatedOperationRefType(ConcatenatedOperationRefType object) {
				return createConcatenatedOperationRefTypeAdapter();
			}
			@Override
			public Adapter caseConcatenatedOperationType(ConcatenatedOperationType object) {
				return createConcatenatedOperationTypeAdapter();
			}
			@Override
			public Adapter caseConeType(ConeType object) {
				return createConeTypeAdapter();
			}
			@Override
			public Adapter caseContainerPropertyType(ContainerPropertyType object) {
				return createContainerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseControlPointType(ControlPointType object) {
				return createControlPointTypeAdapter();
			}
			@Override
			public Adapter caseConventionalUnitType(ConventionalUnitType object) {
				return createConventionalUnitTypeAdapter();
			}
			@Override
			public Adapter caseConversionRefType(ConversionRefType object) {
				return createConversionRefTypeAdapter();
			}
			@Override
			public Adapter caseConversionToPreferredUnitType(ConversionToPreferredUnitType object) {
				return createConversionToPreferredUnitTypeAdapter();
			}
			@Override
			public Adapter caseConversionType(ConversionType object) {
				return createConversionTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateOperationRefType(CoordinateOperationRefType object) {
				return createCoordinateOperationRefTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateReferenceSystemRefType(CoordinateReferenceSystemRefType object) {
				return createCoordinateReferenceSystemRefTypeAdapter();
			}
			@Override
			public Adapter caseCoordinatesType(CoordinatesType object) {
				return createCoordinatesTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxisBaseType(CoordinateSystemAxisBaseType object) {
				return createCoordinateSystemAxisBaseTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxisRefType(CoordinateSystemAxisRefType object) {
				return createCoordinateSystemAxisRefTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxisType(CoordinateSystemAxisType object) {
				return createCoordinateSystemAxisTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemRefType(CoordinateSystemRefType object) {
				return createCoordinateSystemRefTypeAdapter();
			}
			@Override
			public Adapter caseCoordType(CoordType object) {
				return createCoordTypeAdapter();
			}
			@Override
			public Adapter caseCountPropertyType(CountPropertyType object) {
				return createCountPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCovarianceElementType(CovarianceElementType object) {
				return createCovarianceElementTypeAdapter();
			}
			@Override
			public Adapter caseCovarianceMatrixType(CovarianceMatrixType object) {
				return createCovarianceMatrixTypeAdapter();
			}
			@Override
			public Adapter caseCoverageFunctionType(CoverageFunctionType object) {
				return createCoverageFunctionTypeAdapter();
			}
			@Override
			public Adapter caseCRSRefType(CRSRefType object) {
				return createCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseCubicSplineType(CubicSplineType object) {
				return createCubicSplineTypeAdapter();
			}
			@Override
			public Adapter caseCurveArrayPropertyType(CurveArrayPropertyType object) {
				return createCurveArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurvePropertyType(CurvePropertyType object) {
				return createCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurveSegmentArrayPropertyType(CurveSegmentArrayPropertyType object) {
				return createCurveSegmentArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurveType(CurveType object) {
				return createCurveTypeAdapter();
			}
			@Override
			public Adapter caseCylinderType(CylinderType object) {
				return createCylinderTypeAdapter();
			}
			@Override
			public Adapter caseCylindricalCSRefType(CylindricalCSRefType object) {
				return createCylindricalCSRefTypeAdapter();
			}
			@Override
			public Adapter caseCylindricalCSType(CylindricalCSType object) {
				return createCylindricalCSTypeAdapter();
			}
			@Override
			public Adapter caseDataBlockType(DataBlockType object) {
				return createDataBlockTypeAdapter();
			}
			@Override
			public Adapter caseDatumRefType(DatumRefType object) {
				return createDatumRefTypeAdapter();
			}
			@Override
			public Adapter caseDefaultStylePropertyType(DefaultStylePropertyType object) {
				return createDefaultStylePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionProxyType(DefinitionProxyType object) {
				return createDefinitionProxyTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionType(DefinitionType object) {
				return createDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseDegreesType(DegreesType object) {
				return createDegreesTypeAdapter();
			}
			@Override
			public Adapter caseDerivationUnitTermType(DerivationUnitTermType object) {
				return createDerivationUnitTermTypeAdapter();
			}
			@Override
			public Adapter caseDerivedCRSRefType(DerivedCRSRefType object) {
				return createDerivedCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseDerivedCRSType(DerivedCRSType object) {
				return createDerivedCRSTypeAdapter();
			}
			@Override
			public Adapter caseDerivedCRSTypeType(DerivedCRSTypeType object) {
				return createDerivedCRSTypeTypeAdapter();
			}
			@Override
			public Adapter caseDerivedUnitType(DerivedUnitType object) {
				return createDerivedUnitTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryEntryType(DictionaryEntryType object) {
				return createDictionaryEntryTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			@Override
			public Adapter caseDirectedEdgePropertyType(DirectedEdgePropertyType object) {
				return createDirectedEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedFacePropertyType(DirectedFacePropertyType object) {
				return createDirectedFacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedNodePropertyType(DirectedNodePropertyType object) {
				return createDirectedNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedObservationAtDistanceType(DirectedObservationAtDistanceType object) {
				return createDirectedObservationAtDistanceTypeAdapter();
			}
			@Override
			public Adapter caseDirectedObservationType(DirectedObservationType object) {
				return createDirectedObservationTypeAdapter();
			}
			@Override
			public Adapter caseDirectedTopoSolidPropertyType(DirectedTopoSolidPropertyType object) {
				return createDirectedTopoSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectionPropertyType(DirectionPropertyType object) {
				return createDirectionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectionVectorType(DirectionVectorType object) {
				return createDirectionVectorTypeAdapter();
			}
			@Override
			public Adapter caseDirectPositionListType(DirectPositionListType object) {
				return createDirectPositionListTypeAdapter();
			}
			@Override
			public Adapter caseDirectPositionType(DirectPositionType object) {
				return createDirectPositionTypeAdapter();
			}
			@Override
			public Adapter caseDMSAngleType(DMSAngleType object) {
				return createDMSAngleTypeAdapter();
			}
			@Override
			public Adapter caseDomainSetType(DomainSetType object) {
				return createDomainSetTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureCollectionType(DynamicFeatureCollectionType object) {
				return createDynamicFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureType(DynamicFeatureType object) {
				return createDynamicFeatureTypeAdapter();
			}
			@Override
			public Adapter caseEdgeType(EdgeType object) {
				return createEdgeTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidalCSRefType(EllipsoidalCSRefType object) {
				return createEllipsoidalCSRefTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidalCSType(EllipsoidalCSType object) {
				return createEllipsoidalCSTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidBaseType(EllipsoidBaseType object) {
				return createEllipsoidBaseTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidRefType(EllipsoidRefType object) {
				return createEllipsoidRefTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidType(EllipsoidType object) {
				return createEllipsoidTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringCRSRefType(EngineeringCRSRefType object) {
				return createEngineeringCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringCRSType(EngineeringCRSType object) {
				return createEngineeringCRSTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringDatumRefType(EngineeringDatumRefType object) {
				return createEngineeringDatumRefTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringDatumType(EngineeringDatumType object) {
				return createEngineeringDatumTypeAdapter();
			}
			@Override
			public Adapter caseEnvelopeType(EnvelopeType object) {
				return createEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseEnvelopeWithTimePeriodType(EnvelopeWithTimePeriodType object) {
				return createEnvelopeWithTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseExtentType(ExtentType object) {
				return createExtentTypeAdapter();
			}
			@Override
			public Adapter caseFaceType(FaceType object) {
				return createFaceTypeAdapter();
			}
			@Override
			public Adapter caseFeatureArrayPropertyType(FeatureArrayPropertyType object) {
				return createFeatureArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFeatureCollectionType(FeatureCollectionType object) {
				return createFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseFeaturePropertyType(FeaturePropertyType object) {
				return createFeaturePropertyTypeAdapter();
			}
			@Override
			public Adapter caseFeatureStylePropertyType(FeatureStylePropertyType object) {
				return createFeatureStylePropertyTypeAdapter();
			}
			@Override
			public Adapter caseFeatureStyleType(FeatureStyleType object) {
				return createFeatureStyleTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseFormulaType(FormulaType object) {
				return createFormulaTypeAdapter();
			}
			@Override
			public Adapter caseGeneralConversionRefType(GeneralConversionRefType object) {
				return createGeneralConversionRefTypeAdapter();
			}
			@Override
			public Adapter caseGeneralTransformationRefType(GeneralTransformationRefType object) {
				return createGeneralTransformationRefTypeAdapter();
			}
			@Override
			public Adapter caseGenericMetaDataType(GenericMetaDataType object) {
				return createGenericMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseGeocentricCRSRefType(GeocentricCRSRefType object) {
				return createGeocentricCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseGeocentricCRSType(GeocentricCRSType object) {
				return createGeocentricCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeodesicStringType(GeodesicStringType object) {
				return createGeodesicStringTypeAdapter();
			}
			@Override
			public Adapter caseGeodesicType(GeodesicType object) {
				return createGeodesicTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticDatumRefType(GeodeticDatumRefType object) {
				return createGeodeticDatumRefTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticDatumType(GeodeticDatumType object) {
				return createGeodeticDatumTypeAdapter();
			}
			@Override
			public Adapter caseGeographicCRSRefType(GeographicCRSRefType object) {
				return createGeographicCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseGeographicCRSType(GeographicCRSType object) {
				return createGeographicCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeometricComplexPropertyType(GeometricComplexPropertyType object) {
				return createGeometricComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometricComplexType(GeometricComplexType object) {
				return createGeometricComplexTypeAdapter();
			}
			@Override
			public Adapter caseGeometricPrimitivePropertyType(GeometricPrimitivePropertyType object) {
				return createGeometricPrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryArrayPropertyType(GeometryArrayPropertyType object) {
				return createGeometryArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryPropertyType(GeometryPropertyType object) {
				return createGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryStylePropertyType(GeometryStylePropertyType object) {
				return createGeometryStylePropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryStyleType(GeometryStyleType object) {
				return createGeometryStyleTypeAdapter();
			}
			@Override
			public Adapter caseGraphStylePropertyType(GraphStylePropertyType object) {
				return createGraphStylePropertyTypeAdapter();
			}
			@Override
			public Adapter caseGraphStyleType(GraphStyleType object) {
				return createGraphStyleTypeAdapter();
			}
			@Override
			public Adapter caseGridCoverageType(GridCoverageType object) {
				return createGridCoverageTypeAdapter();
			}
			@Override
			public Adapter caseGridDomainType(GridDomainType object) {
				return createGridDomainTypeAdapter();
			}
			@Override
			public Adapter caseGridEnvelopeType(GridEnvelopeType object) {
				return createGridEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseGridFunctionType(GridFunctionType object) {
				return createGridFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGridLengthType(GridLengthType object) {
				return createGridLengthTypeAdapter();
			}
			@Override
			public Adapter caseGridLimitsType(GridLimitsType object) {
				return createGridLimitsTypeAdapter();
			}
			@Override
			public Adapter caseGridType(GridType object) {
				return createGridTypeAdapter();
			}
			@Override
			public Adapter caseHistoryPropertyType(HistoryPropertyType object) {
				return createHistoryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseIdentifierType(IdentifierType object) {
				return createIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseImageCRSRefType(ImageCRSRefType object) {
				return createImageCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseImageCRSType(ImageCRSType object) {
				return createImageCRSTypeAdapter();
			}
			@Override
			public Adapter caseImageDatumRefType(ImageDatumRefType object) {
				return createImageDatumRefTypeAdapter();
			}
			@Override
			public Adapter caseImageDatumType(ImageDatumType object) {
				return createImageDatumTypeAdapter();
			}
			@Override
			public Adapter caseIndexMapType(IndexMapType object) {
				return createIndexMapTypeAdapter();
			}
			@Override
			public Adapter caseIndirectEntryType(IndirectEntryType object) {
				return createIndirectEntryTypeAdapter();
			}
			@Override
			public Adapter caseIsolatedPropertyType(IsolatedPropertyType object) {
				return createIsolatedPropertyTypeAdapter();
			}
			@Override
			public Adapter caseKnotPropertyType(KnotPropertyType object) {
				return createKnotPropertyTypeAdapter();
			}
			@Override
			public Adapter caseKnotType(KnotType object) {
				return createKnotTypeAdapter();
			}
			@Override
			public Adapter caseLabelStylePropertyType(LabelStylePropertyType object) {
				return createLabelStylePropertyTypeAdapter();
			}
			@Override
			public Adapter caseLabelStyleType(LabelStyleType object) {
				return createLabelStyleTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLengthType(LengthType object) {
				return createLengthTypeAdapter();
			}
			@Override
			public Adapter caseLinearCSRefType(LinearCSRefType object) {
				return createLinearCSRefTypeAdapter();
			}
			@Override
			public Adapter caseLinearCSType(LinearCSType object) {
				return createLinearCSTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingPropertyType(LinearRingPropertyType object) {
				return createLinearRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingType(LinearRingType object) {
				return createLinearRingTypeAdapter();
			}
			@Override
			public Adapter caseLineStringPropertyType(LineStringPropertyType object) {
				return createLineStringPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLineStringSegmentArrayPropertyType(LineStringSegmentArrayPropertyType object) {
				return createLineStringSegmentArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLineStringSegmentType(LineStringSegmentType object) {
				return createLineStringSegmentTypeAdapter();
			}
			@Override
			public Adapter caseLineStringType(LineStringType object) {
				return createLineStringTypeAdapter();
			}
			@Override
			public Adapter caseLocationPropertyType(LocationPropertyType object) {
				return createLocationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMeasureListType(MeasureListType object) {
				return createMeasureListTypeAdapter();
			}
			@Override
			public Adapter caseMeasureOrNullListType(MeasureOrNullListType object) {
				return createMeasureOrNullListTypeAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseMetaDataPropertyType(MetaDataPropertyType object) {
				return createMetaDataPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMovingObjectStatusType(MovingObjectStatusType object) {
				return createMovingObjectStatusTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurveCoverageType(MultiCurveCoverageType object) {
				return createMultiCurveCoverageTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurveDomainType(MultiCurveDomainType object) {
				return createMultiCurveDomainTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurvePropertyType(MultiCurvePropertyType object) {
				return createMultiCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurveType(MultiCurveType object) {
				return createMultiCurveTypeAdapter();
			}
			@Override
			public Adapter caseMultiGeometryPropertyType(MultiGeometryPropertyType object) {
				return createMultiGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiGeometryType(MultiGeometryType object) {
				return createMultiGeometryTypeAdapter();
			}
			@Override
			public Adapter caseMultiLineStringPropertyType(MultiLineStringPropertyType object) {
				return createMultiLineStringPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiLineStringType(MultiLineStringType object) {
				return createMultiLineStringTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointCoverageType(MultiPointCoverageType object) {
				return createMultiPointCoverageTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointDomainType(MultiPointDomainType object) {
				return createMultiPointDomainTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointPropertyType(MultiPointPropertyType object) {
				return createMultiPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointType(MultiPointType object) {
				return createMultiPointTypeAdapter();
			}
			@Override
			public Adapter caseMultiPolygonPropertyType(MultiPolygonPropertyType object) {
				return createMultiPolygonPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiPolygonType(MultiPolygonType object) {
				return createMultiPolygonTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidCoverageType(MultiSolidCoverageType object) {
				return createMultiSolidCoverageTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidDomainType(MultiSolidDomainType object) {
				return createMultiSolidDomainTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidPropertyType(MultiSolidPropertyType object) {
				return createMultiSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidType(MultiSolidType object) {
				return createMultiSolidTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfaceCoverageType(MultiSurfaceCoverageType object) {
				return createMultiSurfaceCoverageTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfaceDomainType(MultiSurfaceDomainType object) {
				return createMultiSurfaceDomainTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfacePropertyType(MultiSurfacePropertyType object) {
				return createMultiSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfaceType(MultiSurfaceType object) {
				return createMultiSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseNodeType(NodeType object) {
				return createNodeTypeAdapter();
			}
			@Override
			public Adapter caseObliqueCartesianCSRefType(ObliqueCartesianCSRefType object) {
				return createObliqueCartesianCSRefTypeAdapter();
			}
			@Override
			public Adapter caseObliqueCartesianCSType(ObliqueCartesianCSType object) {
				return createObliqueCartesianCSTypeAdapter();
			}
			@Override
			public Adapter caseObservationType(ObservationType object) {
				return createObservationTypeAdapter();
			}
			@Override
			public Adapter caseOffsetCurveType(OffsetCurveType object) {
				return createOffsetCurveTypeAdapter();
			}
			@Override
			public Adapter caseOperationMethodBaseType(OperationMethodBaseType object) {
				return createOperationMethodBaseTypeAdapter();
			}
			@Override
			public Adapter caseOperationMethodRefType(OperationMethodRefType object) {
				return createOperationMethodRefTypeAdapter();
			}
			@Override
			public Adapter caseOperationMethodType(OperationMethodType object) {
				return createOperationMethodTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterBaseType(OperationParameterBaseType object) {
				return createOperationParameterBaseTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterGroupBaseType(OperationParameterGroupBaseType object) {
				return createOperationParameterGroupBaseTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterGroupRefType(OperationParameterGroupRefType object) {
				return createOperationParameterGroupRefTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterGroupType(OperationParameterGroupType object) {
				return createOperationParameterGroupTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterRefType(OperationParameterRefType object) {
				return createOperationParameterRefTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterType(OperationParameterType object) {
				return createOperationParameterTypeAdapter();
			}
			@Override
			public Adapter caseOperationRefType(OperationRefType object) {
				return createOperationRefTypeAdapter();
			}
			@Override
			public Adapter caseOrientableCurveType(OrientableCurveType object) {
				return createOrientableCurveTypeAdapter();
			}
			@Override
			public Adapter caseOrientableSurfaceType(OrientableSurfaceType object) {
				return createOrientableSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseParameterValueGroupType(ParameterValueGroupType object) {
				return createParameterValueGroupTypeAdapter();
			}
			@Override
			public Adapter caseParameterValueType(ParameterValueType object) {
				return createParameterValueTypeAdapter();
			}
			@Override
			public Adapter casePassThroughOperationRefType(PassThroughOperationRefType object) {
				return createPassThroughOperationRefTypeAdapter();
			}
			@Override
			public Adapter casePassThroughOperationType(PassThroughOperationType object) {
				return createPassThroughOperationTypeAdapter();
			}
			@Override
			public Adapter casePixelInCellType(PixelInCellType object) {
				return createPixelInCellTypeAdapter();
			}
			@Override
			public Adapter casePointArrayPropertyType(PointArrayPropertyType object) {
				return createPointArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointPropertyType(PointPropertyType object) {
				return createPointPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolarCSRefType(PolarCSRefType object) {
				return createPolarCSRefTypeAdapter();
			}
			@Override
			public Adapter casePolarCSType(PolarCSType object) {
				return createPolarCSTypeAdapter();
			}
			@Override
			public Adapter casePolygonPatchArrayPropertyType(PolygonPatchArrayPropertyType object) {
				return createPolygonPatchArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter casePolygonPatchType(PolygonPatchType object) {
				return createPolygonPatchTypeAdapter();
			}
			@Override
			public Adapter casePolygonPropertyType(PolygonPropertyType object) {
				return createPolygonPropertyTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter casePolyhedralSurfaceType(PolyhedralSurfaceType object) {
				return createPolyhedralSurfaceTypeAdapter();
			}
			@Override
			public Adapter casePrimeMeridianBaseType(PrimeMeridianBaseType object) {
				return createPrimeMeridianBaseTypeAdapter();
			}
			@Override
			public Adapter casePrimeMeridianRefType(PrimeMeridianRefType object) {
				return createPrimeMeridianRefTypeAdapter();
			}
			@Override
			public Adapter casePrimeMeridianType(PrimeMeridianType object) {
				return createPrimeMeridianTypeAdapter();
			}
			@Override
			public Adapter casePriorityLocationPropertyType(PriorityLocationPropertyType object) {
				return createPriorityLocationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProjectedCRSRefType(ProjectedCRSRefType object) {
				return createProjectedCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseProjectedCRSType(ProjectedCRSType object) {
				return createProjectedCRSTypeAdapter();
			}
			@Override
			public Adapter caseQuantityExtentType(QuantityExtentType object) {
				return createQuantityExtentTypeAdapter();
			}
			@Override
			public Adapter caseQuantityPropertyType(QuantityPropertyType object) {
				return createQuantityPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRangeParametersType(RangeParametersType object) {
				return createRangeParametersTypeAdapter();
			}
			@Override
			public Adapter caseRangeSetType(RangeSetType object) {
				return createRangeSetTypeAdapter();
			}
			@Override
			public Adapter caseRectangleType(RectangleType object) {
				return createRectangleTypeAdapter();
			}
			@Override
			public Adapter caseRectifiedGridCoverageType(RectifiedGridCoverageType object) {
				return createRectifiedGridCoverageTypeAdapter();
			}
			@Override
			public Adapter caseRectifiedGridDomainType(RectifiedGridDomainType object) {
				return createRectifiedGridDomainTypeAdapter();
			}
			@Override
			public Adapter caseRectifiedGridType(RectifiedGridType object) {
				return createRectifiedGridTypeAdapter();
			}
			@Override
			public Adapter caseReferenceSystemRefType(ReferenceSystemRefType object) {
				return createReferenceSystemRefTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRefLocationType(RefLocationType object) {
				return createRefLocationTypeAdapter();
			}
			@Override
			public Adapter caseRelatedTimeType(RelatedTimeType object) {
				return createRelatedTimeTypeAdapter();
			}
			@Override
			public Adapter caseRelativeInternalPositionalAccuracyType(RelativeInternalPositionalAccuracyType object) {
				return createRelativeInternalPositionalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseRingPropertyType(RingPropertyType object) {
				return createRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRingType(RingType object) {
				return createRingTypeAdapter();
			}
			@Override
			public Adapter caseScalarValuePropertyType(ScalarValuePropertyType object) {
				return createScalarValuePropertyTypeAdapter();
			}
			@Override
			public Adapter caseScaleType(ScaleType object) {
				return createScaleTypeAdapter();
			}
			@Override
			public Adapter caseSecondDefiningParameterType(SecondDefiningParameterType object) {
				return createSecondDefiningParameterTypeAdapter();
			}
			@Override
			public Adapter caseSequenceRuleType(SequenceRuleType object) {
				return createSequenceRuleTypeAdapter();
			}
			@Override
			public Adapter caseSingleOperationRefType(SingleOperationRefType object) {
				return createSingleOperationRefTypeAdapter();
			}
			@Override
			public Adapter caseSolidPropertyType(SolidPropertyType object) {
				return createSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSphericalCSRefType(SphericalCSRefType object) {
				return createSphericalCSRefTypeAdapter();
			}
			@Override
			public Adapter caseSphericalCSType(SphericalCSType object) {
				return createSphericalCSTypeAdapter();
			}
			@Override
			public Adapter caseStringOrRefType(StringOrRefType object) {
				return createStringOrRefTypeAdapter();
			}
			@Override
			public Adapter caseSurfaceArrayPropertyType(SurfaceArrayPropertyType object) {
				return createSurfaceArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfacePropertyType(SurfacePropertyType object) {
				return createSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseRowType(RowType object) {
				return createRowTypeAdapter();
			}
			@Override
			public Adapter caseSolidArrayPropertyType(SolidArrayPropertyType object) {
				return createSolidArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidType(SolidType object) {
				return createSolidTypeAdapter();
			}
			@Override
			public Adapter caseSpeedType(SpeedType object) {
				return createSpeedTypeAdapter();
			}
			@Override
			public Adapter caseSphereType(SphereType object) {
				return createSphereTypeAdapter();
			}
			@Override
			public Adapter caseStyleType(StyleType object) {
				return createStyleTypeAdapter();
			}
			@Override
			public Adapter caseStyleVariationType(StyleVariationType object) {
				return createStyleVariationTypeAdapter();
			}
			@Override
			public Adapter caseSurfacePatchArrayPropertyType(SurfacePatchArrayPropertyType object) {
				return createSurfacePatchArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfaceType(SurfaceType object) {
				return createSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseSymbolType(SymbolType object) {
				return createSymbolTypeAdapter();
			}
			@Override
			public Adapter caseTargetPropertyType(TargetPropertyType object) {
				return createTargetPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCRSRefType(TemporalCRSRefType object) {
				return createTemporalCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCRSType(TemporalCRSType object) {
				return createTemporalCRSTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCSRefType(TemporalCSRefType object) {
				return createTemporalCSRefTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCSType(TemporalCSType object) {
				return createTemporalCSTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumBaseType(TemporalDatumBaseType object) {
				return createTemporalDatumBaseTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumRefType(TemporalDatumRefType object) {
				return createTemporalDatumRefTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumType(TemporalDatumType object) {
				return createTemporalDatumTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarEraPropertyType(TimeCalendarEraPropertyType object) {
				return createTimeCalendarEraPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarEraType(TimeCalendarEraType object) {
				return createTimeCalendarEraTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarPropertyType(TimeCalendarPropertyType object) {
				return createTimeCalendarPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarType(TimeCalendarType object) {
				return createTimeCalendarTypeAdapter();
			}
			@Override
			public Adapter caseTimeClockPropertyType(TimeClockPropertyType object) {
				return createTimeClockPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeClockType(TimeClockType object) {
				return createTimeClockTypeAdapter();
			}
			@Override
			public Adapter caseTimeCoordinateSystemType(TimeCoordinateSystemType object) {
				return createTimeCoordinateSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimeEdgePropertyType(TimeEdgePropertyType object) {
				return createTimeEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeEdgeType(TimeEdgeType object) {
				return createTimeEdgeTypeAdapter();
			}
			@Override
			public Adapter caseTimeGeometricPrimitivePropertyType(TimeGeometricPrimitivePropertyType object) {
				return createTimeGeometricPrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeInstantPropertyType(TimeInstantPropertyType object) {
				return createTimeInstantPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeInstantType(TimeInstantType object) {
				return createTimeInstantTypeAdapter();
			}
			@Override
			public Adapter caseTimeIntervalLengthType(TimeIntervalLengthType object) {
				return createTimeIntervalLengthTypeAdapter();
			}
			@Override
			public Adapter caseTimeNodePropertyType(TimeNodePropertyType object) {
				return createTimeNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeNodeType(TimeNodeType object) {
				return createTimeNodeTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalEraPropertyType(TimeOrdinalEraPropertyType object) {
				return createTimeOrdinalEraPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalEraType(TimeOrdinalEraType object) {
				return createTimeOrdinalEraTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalReferenceSystemType(TimeOrdinalReferenceSystemType object) {
				return createTimeOrdinalReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodPropertyType(TimePeriodPropertyType object) {
				return createTimePeriodPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodType(TimePeriodType object) {
				return createTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseTimePositionType(TimePositionType object) {
				return createTimePositionTypeAdapter();
			}
			@Override
			public Adapter caseTimePrimitivePropertyType(TimePrimitivePropertyType object) {
				return createTimePrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyComplexPropertyType(TimeTopologyComplexPropertyType object) {
				return createTimeTopologyComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyComplexType(TimeTopologyComplexType object) {
				return createTimeTopologyComplexTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyPrimitivePropertyType(TimeTopologyPrimitivePropertyType object) {
				return createTimeTopologyPrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseTinType(TinType object) {
				return createTinTypeAdapter();
			}
			@Override
			public Adapter caseTopoComplexMemberType(TopoComplexMemberType object) {
				return createTopoComplexMemberTypeAdapter();
			}
			@Override
			public Adapter caseTopoComplexType(TopoComplexType object) {
				return createTopoComplexTypeAdapter();
			}
			@Override
			public Adapter caseTopoCurvePropertyType(TopoCurvePropertyType object) {
				return createTopoCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoCurveType(TopoCurveType object) {
				return createTopoCurveTypeAdapter();
			}
			@Override
			public Adapter caseTopologyStylePropertyType(TopologyStylePropertyType object) {
				return createTopologyStylePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopologyStyleType(TopologyStyleType object) {
				return createTopologyStyleTypeAdapter();
			}
			@Override
			public Adapter caseTopoPointPropertyType(TopoPointPropertyType object) {
				return createTopoPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoPointType(TopoPointType object) {
				return createTopoPointTypeAdapter();
			}
			@Override
			public Adapter caseTopoPrimitiveArrayAssociationType(TopoPrimitiveArrayAssociationType object) {
				return createTopoPrimitiveArrayAssociationTypeAdapter();
			}
			@Override
			public Adapter caseTopoPrimitiveMemberType(TopoPrimitiveMemberType object) {
				return createTopoPrimitiveMemberTypeAdapter();
			}
			@Override
			public Adapter caseTopoSolidType(TopoSolidType object) {
				return createTopoSolidTypeAdapter();
			}
			@Override
			public Adapter caseTopoSurfacePropertyType(TopoSurfacePropertyType object) {
				return createTopoSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoSurfaceType(TopoSurfaceType object) {
				return createTopoSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseTopoVolumePropertyType(TopoVolumePropertyType object) {
				return createTopoVolumePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoVolumeType(TopoVolumeType object) {
				return createTopoVolumeTypeAdapter();
			}
			@Override
			public Adapter caseTrackType(TrackType object) {
				return createTrackTypeAdapter();
			}
			@Override
			public Adapter caseTransformationRefType(TransformationRefType object) {
				return createTransformationRefTypeAdapter();
			}
			@Override
			public Adapter caseTransformationType(TransformationType object) {
				return createTransformationTypeAdapter();
			}
			@Override
			public Adapter caseTrianglePatchArrayPropertyType(TrianglePatchArrayPropertyType object) {
				return createTrianglePatchArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTriangleType(TriangleType object) {
				return createTriangleTypeAdapter();
			}
			@Override
			public Adapter caseTriangulatedSurfaceType(TriangulatedSurfaceType object) {
				return createTriangulatedSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseUnitDefinitionType(UnitDefinitionType object) {
				return createUnitDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseUnitOfMeasureType(UnitOfMeasureType object) {
				return createUnitOfMeasureTypeAdapter();
			}
			@Override
			public Adapter caseUserDefinedCSRefType(UserDefinedCSRefType object) {
				return createUserDefinedCSRefTypeAdapter();
			}
			@Override
			public Adapter caseUserDefinedCSType(UserDefinedCSType object) {
				return createUserDefinedCSTypeAdapter();
			}
			@Override
			public Adapter caseValueArrayPropertyType(ValueArrayPropertyType object) {
				return createValueArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseValueArrayType(ValueArrayType object) {
				return createValueArrayTypeAdapter();
			}
			@Override
			public Adapter caseValuePropertyType(ValuePropertyType object) {
				return createValuePropertyTypeAdapter();
			}
			@Override
			public Adapter caseVectorType(VectorType object) {
				return createVectorTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCRSRefType(VerticalCRSRefType object) {
				return createVerticalCRSRefTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCRSType(VerticalCRSType object) {
				return createVerticalCRSTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCSRefType(VerticalCSRefType object) {
				return createVerticalCSRefTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCSType(VerticalCSType object) {
				return createVerticalCSTypeAdapter();
			}
			@Override
			public Adapter caseVerticalDatumRefType(VerticalDatumRefType object) {
				return createVerticalDatumRefTypeAdapter();
			}
			@Override
			public Adapter caseVerticalDatumType(VerticalDatumType object) {
				return createVerticalDatumTypeAdapter();
			}
			@Override
			public Adapter caseVerticalDatumTypeType(VerticalDatumTypeType object) {
				return createVerticalDatumTypeTypeAdapter();
			}
			@Override
			public Adapter caseVolumeType(VolumeType object) {
				return createVolumeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbsoluteExternalPositionalAccuracyType <em>Absolute External Positional Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbsoluteExternalPositionalAccuracyType
	 * @generated
	 */
	public Adapter createAbsoluteExternalPositionalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractContinuousCoverageType <em>Abstract Continuous Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractContinuousCoverageType
	 * @generated
	 */
	public Adapter createAbstractContinuousCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractCoordinateOperationBaseType <em>Abstract Coordinate Operation Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractCoordinateOperationBaseType
	 * @generated
	 */
	public Adapter createAbstractCoordinateOperationBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractCoordinateOperationType <em>Abstract Coordinate Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractCoordinateOperationType
	 * @generated
	 */
	public Adapter createAbstractCoordinateOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractCoordinateSystemBaseType <em>Abstract Coordinate System Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractCoordinateSystemBaseType
	 * @generated
	 */
	public Adapter createAbstractCoordinateSystemBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractCoordinateSystemType <em>Abstract Coordinate System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractCoordinateSystemType
	 * @generated
	 */
	public Adapter createAbstractCoordinateSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractCoverageType <em>Abstract Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractCoverageType
	 * @generated
	 */
	public Adapter createAbstractCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractCurveSegmentType <em>Abstract Curve Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractCurveSegmentType
	 * @generated
	 */
	public Adapter createAbstractCurveSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractCurveType <em>Abstract Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractCurveType
	 * @generated
	 */
	public Adapter createAbstractCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractDatumBaseType <em>Abstract Datum Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractDatumBaseType
	 * @generated
	 */
	public Adapter createAbstractDatumBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractDatumType <em>Abstract Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractDatumType
	 * @generated
	 */
	public Adapter createAbstractDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractDiscreteCoverageType <em>Abstract Discrete Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractDiscreteCoverageType
	 * @generated
	 */
	public Adapter createAbstractDiscreteCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractFeatureCollectionType <em>Abstract Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractFeatureCollectionType
	 * @generated
	 */
	public Adapter createAbstractFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractFeatureType <em>Abstract Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractFeatureType
	 * @generated
	 */
	public Adapter createAbstractFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeneralConversionType <em>Abstract General Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeneralConversionType
	 * @generated
	 */
	public Adapter createAbstractGeneralConversionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeneralDerivedCRSType <em>Abstract General Derived CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeneralDerivedCRSType
	 * @generated
	 */
	public Adapter createAbstractGeneralDerivedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeneralOperationParameterRefType <em>Abstract General Operation Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeneralOperationParameterRefType
	 * @generated
	 */
	public Adapter createAbstractGeneralOperationParameterRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeneralOperationParameterType <em>Abstract General Operation Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeneralOperationParameterType
	 * @generated
	 */
	public Adapter createAbstractGeneralOperationParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeneralParameterValueType <em>Abstract General Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeneralParameterValueType
	 * @generated
	 */
	public Adapter createAbstractGeneralParameterValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeneralTransformationType <em>Abstract General Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeneralTransformationType
	 * @generated
	 */
	public Adapter createAbstractGeneralTransformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeometricAggregateType <em>Abstract Geometric Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeometricAggregateType
	 * @generated
	 */
	public Adapter createAbstractGeometricAggregateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeometricPrimitiveType <em>Abstract Geometric Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeometricPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractGeometricPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGeometryType <em>Abstract Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGeometryType
	 * @generated
	 */
	public Adapter createAbstractGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGMLType <em>Abstract GML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGMLType
	 * @generated
	 */
	public Adapter createAbstractGMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGriddedSurfaceType <em>Abstract Gridded Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGriddedSurfaceType
	 * @generated
	 */
	public Adapter createAbstractGriddedSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractMetaDataType <em>Abstract Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractMetaDataType
	 * @generated
	 */
	public Adapter createAbstractMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractParametricCurveSurfaceType <em>Abstract Parametric Curve Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractParametricCurveSurfaceType
	 * @generated
	 */
	public Adapter createAbstractParametricCurveSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractPositionalAccuracyType <em>Abstract Positional Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractPositionalAccuracyType
	 * @generated
	 */
	public Adapter createAbstractPositionalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractReferenceSystemBaseType <em>Abstract Reference System Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractReferenceSystemBaseType
	 * @generated
	 */
	public Adapter createAbstractReferenceSystemBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractReferenceSystemType <em>Abstract Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractReferenceSystemType
	 * @generated
	 */
	public Adapter createAbstractReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractRingPropertyType <em>Abstract Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractRingPropertyType
	 * @generated
	 */
	public Adapter createAbstractRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractRingType <em>Abstract Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractRingType
	 * @generated
	 */
	public Adapter createAbstractRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractSolidType <em>Abstract Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractSolidType
	 * @generated
	 */
	public Adapter createAbstractSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractStyleType <em>Abstract Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractStyleType
	 * @generated
	 */
	public Adapter createAbstractStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractSurfacePatchType <em>Abstract Surface Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractSurfacePatchType
	 * @generated
	 */
	public Adapter createAbstractSurfacePatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractSurfaceType <em>Abstract Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractSurfaceType
	 * @generated
	 */
	public Adapter createAbstractSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTimeComplexType <em>Abstract Time Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTimeComplexType
	 * @generated
	 */
	public Adapter createAbstractTimeComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTimeGeometricPrimitiveType <em>Abstract Time Geometric Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTimeGeometricPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimeGeometricPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTimeObjectType <em>Abstract Time Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTimeObjectType
	 * @generated
	 */
	public Adapter createAbstractTimeObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTimePrimitiveType <em>Abstract Time Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTimePrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimePrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTimeReferenceSystemType <em>Abstract Time Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTimeReferenceSystemType
	 * @generated
	 */
	public Adapter createAbstractTimeReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTimeSliceType <em>Abstract Time Slice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTimeSliceType
	 * @generated
	 */
	public Adapter createAbstractTimeSliceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTimeTopologyPrimitiveType <em>Abstract Time Topology Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTimeTopologyPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimeTopologyPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTopologyType <em>Abstract Topology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTopologyType
	 * @generated
	 */
	public Adapter createAbstractTopologyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractTopoPrimitiveType <em>Abstract Topo Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractTopoPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTopoPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AffinePlacementType <em>Affine Placement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AffinePlacementType
	 * @generated
	 */
	public Adapter createAffinePlacementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AngleChoiceType <em>Angle Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AngleChoiceType
	 * @generated
	 */
	public Adapter createAngleChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AngleType <em>Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AngleType
	 * @generated
	 */
	public Adapter createAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ArcByBulgeType <em>Arc By Bulge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ArcByBulgeType
	 * @generated
	 */
	public Adapter createArcByBulgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ArcByCenterPointType <em>Arc By Center Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ArcByCenterPointType
	 * @generated
	 */
	public Adapter createArcByCenterPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ArcStringByBulgeType <em>Arc String By Bulge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ArcStringByBulgeType
	 * @generated
	 */
	public Adapter createArcStringByBulgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ArcStringType <em>Arc String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ArcStringType
	 * @generated
	 */
	public Adapter createArcStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ArcType
	 * @generated
	 */
	public Adapter createArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ArrayAssociationType <em>Array Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ArrayAssociationType
	 * @generated
	 */
	public Adapter createArrayAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AssociationType
	 * @generated
	 */
	public Adapter createAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BaseStyleDescriptorType <em>Base Style Descriptor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BaseStyleDescriptorType
	 * @generated
	 */
	public Adapter createBaseStyleDescriptorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BaseUnitType <em>Base Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BaseUnitType
	 * @generated
	 */
	public Adapter createBaseUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BezierType <em>Bezier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BezierType
	 * @generated
	 */
	public Adapter createBezierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BooleanPropertyType <em>Boolean Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BooleanPropertyType
	 * @generated
	 */
	public Adapter createBooleanPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BoundedFeatureType <em>Bounded Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BoundedFeatureType
	 * @generated
	 */
	public Adapter createBoundedFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BoundingShapeType <em>Bounding Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BoundingShapeType
	 * @generated
	 */
	public Adapter createBoundingShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.BSplineType <em>BSpline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.BSplineType
	 * @generated
	 */
	public Adapter createBSplineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CartesianCSRefType <em>Cartesian CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CartesianCSRefType
	 * @generated
	 */
	public Adapter createCartesianCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CartesianCSType <em>Cartesian CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CartesianCSType
	 * @generated
	 */
	public Adapter createCartesianCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CategoryExtentType <em>Category Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CategoryExtentType
	 * @generated
	 */
	public Adapter createCategoryExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CategoryPropertyType <em>Category Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CategoryPropertyType
	 * @generated
	 */
	public Adapter createCategoryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CircleByCenterPointType <em>Circle By Center Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CircleByCenterPointType
	 * @generated
	 */
	public Adapter createCircleByCenterPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CircleType <em>Circle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CircleType
	 * @generated
	 */
	public Adapter createCircleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ClothoidType <em>Clothoid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ClothoidType
	 * @generated
	 */
	public Adapter createClothoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CodeListType <em>Code List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CodeListType
	 * @generated
	 */
	public Adapter createCodeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CodeOrNullListType <em>Code Or Null List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CodeOrNullListType
	 * @generated
	 */
	public Adapter createCodeOrNullListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompositeCurvePropertyType <em>Composite Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompositeCurvePropertyType
	 * @generated
	 */
	public Adapter createCompositeCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompositeCurveType <em>Composite Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompositeCurveType
	 * @generated
	 */
	public Adapter createCompositeCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompositeSolidPropertyType <em>Composite Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompositeSolidPropertyType
	 * @generated
	 */
	public Adapter createCompositeSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompositeSolidType <em>Composite Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompositeSolidType
	 * @generated
	 */
	public Adapter createCompositeSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompositeSurfacePropertyType <em>Composite Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompositeSurfacePropertyType
	 * @generated
	 */
	public Adapter createCompositeSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompositeSurfaceType <em>Composite Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompositeSurfaceType
	 * @generated
	 */
	public Adapter createCompositeSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompositeValueType <em>Composite Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompositeValueType
	 * @generated
	 */
	public Adapter createCompositeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompoundCRSRefType <em>Compound CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompoundCRSRefType
	 * @generated
	 */
	public Adapter createCompoundCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CompoundCRSType <em>Compound CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CompoundCRSType
	 * @generated
	 */
	public Adapter createCompoundCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ConcatenatedOperationRefType <em>Concatenated Operation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ConcatenatedOperationRefType
	 * @generated
	 */
	public Adapter createConcatenatedOperationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ConcatenatedOperationType <em>Concatenated Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ConcatenatedOperationType
	 * @generated
	 */
	public Adapter createConcatenatedOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ConeType <em>Cone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ConeType
	 * @generated
	 */
	public Adapter createConeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ContainerPropertyType <em>Container Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ContainerPropertyType
	 * @generated
	 */
	public Adapter createContainerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ControlPointType <em>Control Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ControlPointType
	 * @generated
	 */
	public Adapter createControlPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ConventionalUnitType <em>Conventional Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ConventionalUnitType
	 * @generated
	 */
	public Adapter createConventionalUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ConversionRefType <em>Conversion Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ConversionRefType
	 * @generated
	 */
	public Adapter createConversionRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ConversionToPreferredUnitType <em>Conversion To Preferred Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ConversionToPreferredUnitType
	 * @generated
	 */
	public Adapter createConversionToPreferredUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ConversionType <em>Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ConversionType
	 * @generated
	 */
	public Adapter createConversionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordinateOperationRefType <em>Coordinate Operation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordinateOperationRefType
	 * @generated
	 */
	public Adapter createCoordinateOperationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordinateReferenceSystemRefType <em>Coordinate Reference System Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordinateReferenceSystemRefType
	 * @generated
	 */
	public Adapter createCoordinateReferenceSystemRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordinatesType <em>Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordinatesType
	 * @generated
	 */
	public Adapter createCoordinatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordinateSystemAxisBaseType <em>Coordinate System Axis Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordinateSystemAxisBaseType
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordinateSystemAxisRefType <em>Coordinate System Axis Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordinateSystemAxisRefType
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordinateSystemAxisType <em>Coordinate System Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordinateSystemAxisType
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordinateSystemRefType <em>Coordinate System Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordinateSystemRefType
	 * @generated
	 */
	public Adapter createCoordinateSystemRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoordType <em>Coord Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoordType
	 * @generated
	 */
	public Adapter createCoordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CountPropertyType <em>Count Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CountPropertyType
	 * @generated
	 */
	public Adapter createCountPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CovarianceElementType <em>Covariance Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CovarianceElementType
	 * @generated
	 */
	public Adapter createCovarianceElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CovarianceMatrixType <em>Covariance Matrix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CovarianceMatrixType
	 * @generated
	 */
	public Adapter createCovarianceMatrixTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CoverageFunctionType <em>Coverage Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CoverageFunctionType
	 * @generated
	 */
	public Adapter createCoverageFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CRSRefType <em>CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CRSRefType
	 * @generated
	 */
	public Adapter createCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CubicSplineType <em>Cubic Spline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CubicSplineType
	 * @generated
	 */
	public Adapter createCubicSplineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CurveArrayPropertyType <em>Curve Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CurveArrayPropertyType
	 * @generated
	 */
	public Adapter createCurveArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CurvePropertyType <em>Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CurvePropertyType
	 * @generated
	 */
	public Adapter createCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CurveSegmentArrayPropertyType <em>Curve Segment Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CurveSegmentArrayPropertyType
	 * @generated
	 */
	public Adapter createCurveSegmentArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CurveType <em>Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CurveType
	 * @generated
	 */
	public Adapter createCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CylinderType <em>Cylinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CylinderType
	 * @generated
	 */
	public Adapter createCylinderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CylindricalCSRefType <em>Cylindrical CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CylindricalCSRefType
	 * @generated
	 */
	public Adapter createCylindricalCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.CylindricalCSType <em>Cylindrical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.CylindricalCSType
	 * @generated
	 */
	public Adapter createCylindricalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DataBlockType <em>Data Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DataBlockType
	 * @generated
	 */
	public Adapter createDataBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DatumRefType <em>Datum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DatumRefType
	 * @generated
	 */
	public Adapter createDatumRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DefaultStylePropertyType <em>Default Style Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DefaultStylePropertyType
	 * @generated
	 */
	public Adapter createDefaultStylePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DefinitionProxyType <em>Definition Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DefinitionProxyType
	 * @generated
	 */
	public Adapter createDefinitionProxyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DefinitionType
	 * @generated
	 */
	public Adapter createDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DegreesType <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DegreesType
	 * @generated
	 */
	public Adapter createDegreesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DerivationUnitTermType <em>Derivation Unit Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DerivationUnitTermType
	 * @generated
	 */
	public Adapter createDerivationUnitTermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DerivedCRSRefType <em>Derived CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DerivedCRSRefType
	 * @generated
	 */
	public Adapter createDerivedCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DerivedCRSType <em>Derived CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DerivedCRSType
	 * @generated
	 */
	public Adapter createDerivedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DerivedCRSTypeType <em>Derived CRS Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DerivedCRSTypeType
	 * @generated
	 */
	public Adapter createDerivedCRSTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DerivedUnitType <em>Derived Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DerivedUnitType
	 * @generated
	 */
	public Adapter createDerivedUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DictionaryEntryType <em>Dictionary Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DictionaryEntryType
	 * @generated
	 */
	public Adapter createDictionaryEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DictionaryType
	 * @generated
	 */
	public Adapter createDictionaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectedEdgePropertyType <em>Directed Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectedEdgePropertyType
	 * @generated
	 */
	public Adapter createDirectedEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectedFacePropertyType <em>Directed Face Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectedFacePropertyType
	 * @generated
	 */
	public Adapter createDirectedFacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectedNodePropertyType <em>Directed Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectedNodePropertyType
	 * @generated
	 */
	public Adapter createDirectedNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectedObservationAtDistanceType <em>Directed Observation At Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectedObservationAtDistanceType
	 * @generated
	 */
	public Adapter createDirectedObservationAtDistanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectedObservationType <em>Directed Observation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectedObservationType
	 * @generated
	 */
	public Adapter createDirectedObservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectedTopoSolidPropertyType <em>Directed Topo Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectedTopoSolidPropertyType
	 * @generated
	 */
	public Adapter createDirectedTopoSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectionPropertyType <em>Direction Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectionPropertyType
	 * @generated
	 */
	public Adapter createDirectionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectionVectorType <em>Direction Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectionVectorType
	 * @generated
	 */
	public Adapter createDirectionVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectPositionListType <em>Direct Position List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectPositionListType
	 * @generated
	 */
	public Adapter createDirectPositionListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DirectPositionType <em>Direct Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DirectPositionType
	 * @generated
	 */
	public Adapter createDirectPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DMSAngleType <em>DMS Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DMSAngleType
	 * @generated
	 */
	public Adapter createDMSAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DomainSetType <em>Domain Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DomainSetType
	 * @generated
	 */
	public Adapter createDomainSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DynamicFeatureCollectionType <em>Dynamic Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DynamicFeatureCollectionType
	 * @generated
	 */
	public Adapter createDynamicFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DynamicFeatureType <em>Dynamic Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DynamicFeatureType
	 * @generated
	 */
	public Adapter createDynamicFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EdgeType
	 * @generated
	 */
	public Adapter createEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EllipsoidalCSRefType <em>Ellipsoidal CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EllipsoidalCSRefType
	 * @generated
	 */
	public Adapter createEllipsoidalCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EllipsoidalCSType <em>Ellipsoidal CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EllipsoidalCSType
	 * @generated
	 */
	public Adapter createEllipsoidalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EllipsoidBaseType <em>Ellipsoid Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EllipsoidBaseType
	 * @generated
	 */
	public Adapter createEllipsoidBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EllipsoidRefType <em>Ellipsoid Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EllipsoidRefType
	 * @generated
	 */
	public Adapter createEllipsoidRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EllipsoidType <em>Ellipsoid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EllipsoidType
	 * @generated
	 */
	public Adapter createEllipsoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EngineeringCRSRefType <em>Engineering CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EngineeringCRSRefType
	 * @generated
	 */
	public Adapter createEngineeringCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EngineeringCRSType <em>Engineering CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EngineeringCRSType
	 * @generated
	 */
	public Adapter createEngineeringCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EngineeringDatumRefType <em>Engineering Datum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EngineeringDatumRefType
	 * @generated
	 */
	public Adapter createEngineeringDatumRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EngineeringDatumType <em>Engineering Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EngineeringDatumType
	 * @generated
	 */
	public Adapter createEngineeringDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EnvelopeType <em>Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EnvelopeType
	 * @generated
	 */
	public Adapter createEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.EnvelopeWithTimePeriodType <em>Envelope With Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.EnvelopeWithTimePeriodType
	 * @generated
	 */
	public Adapter createEnvelopeWithTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ExtentType <em>Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ExtentType
	 * @generated
	 */
	public Adapter createExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FaceType <em>Face Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FaceType
	 * @generated
	 */
	public Adapter createFaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FeatureArrayPropertyType <em>Feature Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FeatureArrayPropertyType
	 * @generated
	 */
	public Adapter createFeatureArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FeatureCollectionType <em>Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FeatureCollectionType
	 * @generated
	 */
	public Adapter createFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FeaturePropertyType <em>Feature Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FeaturePropertyType
	 * @generated
	 */
	public Adapter createFeaturePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FeatureStylePropertyType <em>Feature Style Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FeatureStylePropertyType
	 * @generated
	 */
	public Adapter createFeatureStylePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FeatureStyleType <em>Feature Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FeatureStyleType
	 * @generated
	 */
	public Adapter createFeatureStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FormulaType <em>Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FormulaType
	 * @generated
	 */
	public Adapter createFormulaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeneralConversionRefType <em>General Conversion Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeneralConversionRefType
	 * @generated
	 */
	public Adapter createGeneralConversionRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeneralTransformationRefType <em>General Transformation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeneralTransformationRefType
	 * @generated
	 */
	public Adapter createGeneralTransformationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GenericMetaDataType <em>Generic Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GenericMetaDataType
	 * @generated
	 */
	public Adapter createGenericMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeocentricCRSRefType <em>Geocentric CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeocentricCRSRefType
	 * @generated
	 */
	public Adapter createGeocentricCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeocentricCRSType <em>Geocentric CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeocentricCRSType
	 * @generated
	 */
	public Adapter createGeocentricCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeodesicStringType <em>Geodesic String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeodesicStringType
	 * @generated
	 */
	public Adapter createGeodesicStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeodesicType <em>Geodesic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeodesicType
	 * @generated
	 */
	public Adapter createGeodesicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeodeticDatumRefType <em>Geodetic Datum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeodeticDatumRefType
	 * @generated
	 */
	public Adapter createGeodeticDatumRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeodeticDatumType <em>Geodetic Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeodeticDatumType
	 * @generated
	 */
	public Adapter createGeodeticDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeographicCRSRefType <em>Geographic CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeographicCRSRefType
	 * @generated
	 */
	public Adapter createGeographicCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeographicCRSType <em>Geographic CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeographicCRSType
	 * @generated
	 */
	public Adapter createGeographicCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeometricComplexPropertyType <em>Geometric Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeometricComplexPropertyType
	 * @generated
	 */
	public Adapter createGeometricComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeometricComplexType <em>Geometric Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeometricComplexType
	 * @generated
	 */
	public Adapter createGeometricComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeometricPrimitivePropertyType <em>Geometric Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeometricPrimitivePropertyType
	 * @generated
	 */
	public Adapter createGeometricPrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeometryArrayPropertyType <em>Geometry Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeometryArrayPropertyType
	 * @generated
	 */
	public Adapter createGeometryArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeometryPropertyType <em>Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeometryPropertyType
	 * @generated
	 */
	public Adapter createGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeometryStylePropertyType <em>Geometry Style Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeometryStylePropertyType
	 * @generated
	 */
	public Adapter createGeometryStylePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GeometryStyleType <em>Geometry Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GeometryStyleType
	 * @generated
	 */
	public Adapter createGeometryStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GraphStylePropertyType <em>Graph Style Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GraphStylePropertyType
	 * @generated
	 */
	public Adapter createGraphStylePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GraphStyleType <em>Graph Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GraphStyleType
	 * @generated
	 */
	public Adapter createGraphStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GridCoverageType <em>Grid Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GridCoverageType
	 * @generated
	 */
	public Adapter createGridCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GridDomainType <em>Grid Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GridDomainType
	 * @generated
	 */
	public Adapter createGridDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GridEnvelopeType <em>Grid Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GridEnvelopeType
	 * @generated
	 */
	public Adapter createGridEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GridFunctionType <em>Grid Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GridFunctionType
	 * @generated
	 */
	public Adapter createGridFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GridLengthType <em>Grid Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GridLengthType
	 * @generated
	 */
	public Adapter createGridLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GridLimitsType <em>Grid Limits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GridLimitsType
	 * @generated
	 */
	public Adapter createGridLimitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.GridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.GridType
	 * @generated
	 */
	public Adapter createGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.HistoryPropertyType <em>History Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.HistoryPropertyType
	 * @generated
	 */
	public Adapter createHistoryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.IdentifierType
	 * @generated
	 */
	public Adapter createIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ImageCRSRefType <em>Image CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ImageCRSRefType
	 * @generated
	 */
	public Adapter createImageCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ImageCRSType <em>Image CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ImageCRSType
	 * @generated
	 */
	public Adapter createImageCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ImageDatumRefType <em>Image Datum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ImageDatumRefType
	 * @generated
	 */
	public Adapter createImageDatumRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ImageDatumType <em>Image Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ImageDatumType
	 * @generated
	 */
	public Adapter createImageDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.IndexMapType <em>Index Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.IndexMapType
	 * @generated
	 */
	public Adapter createIndexMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.IndirectEntryType <em>Indirect Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.IndirectEntryType
	 * @generated
	 */
	public Adapter createIndirectEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.IsolatedPropertyType <em>Isolated Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.IsolatedPropertyType
	 * @generated
	 */
	public Adapter createIsolatedPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.KnotPropertyType <em>Knot Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.KnotPropertyType
	 * @generated
	 */
	public Adapter createKnotPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.KnotType <em>Knot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.KnotType
	 * @generated
	 */
	public Adapter createKnotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LabelStylePropertyType <em>Label Style Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LabelStylePropertyType
	 * @generated
	 */
	public Adapter createLabelStylePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LabelStyleType <em>Label Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LabelStyleType
	 * @generated
	 */
	public Adapter createLabelStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LengthType <em>Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LengthType
	 * @generated
	 */
	public Adapter createLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LinearCSRefType <em>Linear CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LinearCSRefType
	 * @generated
	 */
	public Adapter createLinearCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LinearCSType <em>Linear CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LinearCSType
	 * @generated
	 */
	public Adapter createLinearCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LinearRingPropertyType <em>Linear Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LinearRingPropertyType
	 * @generated
	 */
	public Adapter createLinearRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LinearRingType <em>Linear Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LinearRingType
	 * @generated
	 */
	public Adapter createLinearRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LineStringPropertyType <em>Line String Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LineStringPropertyType
	 * @generated
	 */
	public Adapter createLineStringPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LineStringSegmentArrayPropertyType <em>Line String Segment Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LineStringSegmentArrayPropertyType
	 * @generated
	 */
	public Adapter createLineStringSegmentArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LineStringSegmentType <em>Line String Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LineStringSegmentType
	 * @generated
	 */
	public Adapter createLineStringSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LineStringType <em>Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LineStringType
	 * @generated
	 */
	public Adapter createLineStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.LocationPropertyType <em>Location Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.LocationPropertyType
	 * @generated
	 */
	public Adapter createLocationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MeasureListType <em>Measure List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MeasureListType
	 * @generated
	 */
	public Adapter createMeasureListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MeasureOrNullListType <em>Measure Or Null List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MeasureOrNullListType
	 * @generated
	 */
	public Adapter createMeasureOrNullListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MetaDataPropertyType <em>Meta Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MetaDataPropertyType
	 * @generated
	 */
	public Adapter createMetaDataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MovingObjectStatusType <em>Moving Object Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MovingObjectStatusType
	 * @generated
	 */
	public Adapter createMovingObjectStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiCurveCoverageType <em>Multi Curve Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiCurveCoverageType
	 * @generated
	 */
	public Adapter createMultiCurveCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiCurveDomainType <em>Multi Curve Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiCurveDomainType
	 * @generated
	 */
	public Adapter createMultiCurveDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiCurvePropertyType <em>Multi Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiCurvePropertyType
	 * @generated
	 */
	public Adapter createMultiCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiCurveType <em>Multi Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiCurveType
	 * @generated
	 */
	public Adapter createMultiCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiGeometryPropertyType <em>Multi Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiGeometryPropertyType
	 * @generated
	 */
	public Adapter createMultiGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiGeometryType <em>Multi Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiGeometryType
	 * @generated
	 */
	public Adapter createMultiGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiLineStringPropertyType <em>Multi Line String Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiLineStringPropertyType
	 * @generated
	 */
	public Adapter createMultiLineStringPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiLineStringType <em>Multi Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiLineStringType
	 * @generated
	 */
	public Adapter createMultiLineStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiPointCoverageType <em>Multi Point Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiPointCoverageType
	 * @generated
	 */
	public Adapter createMultiPointCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiPointDomainType <em>Multi Point Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiPointDomainType
	 * @generated
	 */
	public Adapter createMultiPointDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiPointPropertyType <em>Multi Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiPointPropertyType
	 * @generated
	 */
	public Adapter createMultiPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiPointType <em>Multi Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiPointType
	 * @generated
	 */
	public Adapter createMultiPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiPolygonPropertyType <em>Multi Polygon Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiPolygonPropertyType
	 * @generated
	 */
	public Adapter createMultiPolygonPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiPolygonType <em>Multi Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiPolygonType
	 * @generated
	 */
	public Adapter createMultiPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSolidCoverageType <em>Multi Solid Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSolidCoverageType
	 * @generated
	 */
	public Adapter createMultiSolidCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSolidDomainType <em>Multi Solid Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSolidDomainType
	 * @generated
	 */
	public Adapter createMultiSolidDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSolidPropertyType <em>Multi Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSolidPropertyType
	 * @generated
	 */
	public Adapter createMultiSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSolidType <em>Multi Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSolidType
	 * @generated
	 */
	public Adapter createMultiSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSurfaceCoverageType <em>Multi Surface Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSurfaceCoverageType
	 * @generated
	 */
	public Adapter createMultiSurfaceCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSurfaceDomainType <em>Multi Surface Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSurfaceDomainType
	 * @generated
	 */
	public Adapter createMultiSurfaceDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSurfacePropertyType <em>Multi Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSurfacePropertyType
	 * @generated
	 */
	public Adapter createMultiSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.MultiSurfaceType <em>Multi Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.MultiSurfaceType
	 * @generated
	 */
	public Adapter createMultiSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ObliqueCartesianCSRefType <em>Oblique Cartesian CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ObliqueCartesianCSRefType
	 * @generated
	 */
	public Adapter createObliqueCartesianCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ObliqueCartesianCSType <em>Oblique Cartesian CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ObliqueCartesianCSType
	 * @generated
	 */
	public Adapter createObliqueCartesianCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ObservationType <em>Observation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ObservationType
	 * @generated
	 */
	public Adapter createObservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OffsetCurveType <em>Offset Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OffsetCurveType
	 * @generated
	 */
	public Adapter createOffsetCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationMethodBaseType <em>Operation Method Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationMethodBaseType
	 * @generated
	 */
	public Adapter createOperationMethodBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationMethodRefType <em>Operation Method Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationMethodRefType
	 * @generated
	 */
	public Adapter createOperationMethodRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationMethodType <em>Operation Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationMethodType
	 * @generated
	 */
	public Adapter createOperationMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationParameterBaseType <em>Operation Parameter Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationParameterBaseType
	 * @generated
	 */
	public Adapter createOperationParameterBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationParameterGroupBaseType <em>Operation Parameter Group Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationParameterGroupBaseType
	 * @generated
	 */
	public Adapter createOperationParameterGroupBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationParameterGroupRefType <em>Operation Parameter Group Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationParameterGroupRefType
	 * @generated
	 */
	public Adapter createOperationParameterGroupRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationParameterGroupType <em>Operation Parameter Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationParameterGroupType
	 * @generated
	 */
	public Adapter createOperationParameterGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationParameterRefType <em>Operation Parameter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationParameterRefType
	 * @generated
	 */
	public Adapter createOperationParameterRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationParameterType <em>Operation Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationParameterType
	 * @generated
	 */
	public Adapter createOperationParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OperationRefType <em>Operation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OperationRefType
	 * @generated
	 */
	public Adapter createOperationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OrientableCurveType <em>Orientable Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OrientableCurveType
	 * @generated
	 */
	public Adapter createOrientableCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.OrientableSurfaceType <em>Orientable Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.OrientableSurfaceType
	 * @generated
	 */
	public Adapter createOrientableSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ParameterValueGroupType <em>Parameter Value Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ParameterValueGroupType
	 * @generated
	 */
	public Adapter createParameterValueGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ParameterValueType <em>Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ParameterValueType
	 * @generated
	 */
	public Adapter createParameterValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PassThroughOperationRefType <em>Pass Through Operation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PassThroughOperationRefType
	 * @generated
	 */
	public Adapter createPassThroughOperationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PassThroughOperationType <em>Pass Through Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PassThroughOperationType
	 * @generated
	 */
	public Adapter createPassThroughOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PixelInCellType <em>Pixel In Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PixelInCellType
	 * @generated
	 */
	public Adapter createPixelInCellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PointArrayPropertyType <em>Point Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PointArrayPropertyType
	 * @generated
	 */
	public Adapter createPointArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PointPropertyType <em>Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PointPropertyType
	 * @generated
	 */
	public Adapter createPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PolarCSRefType <em>Polar CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PolarCSRefType
	 * @generated
	 */
	public Adapter createPolarCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PolarCSType <em>Polar CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PolarCSType
	 * @generated
	 */
	public Adapter createPolarCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PolygonPatchArrayPropertyType <em>Polygon Patch Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PolygonPatchArrayPropertyType
	 * @generated
	 */
	public Adapter createPolygonPatchArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PolygonPatchType <em>Polygon Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PolygonPatchType
	 * @generated
	 */
	public Adapter createPolygonPatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PolygonPropertyType <em>Polygon Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PolygonPropertyType
	 * @generated
	 */
	public Adapter createPolygonPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PolyhedralSurfaceType <em>Polyhedral Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PolyhedralSurfaceType
	 * @generated
	 */
	public Adapter createPolyhedralSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PrimeMeridianBaseType <em>Prime Meridian Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PrimeMeridianBaseType
	 * @generated
	 */
	public Adapter createPrimeMeridianBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PrimeMeridianRefType <em>Prime Meridian Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PrimeMeridianRefType
	 * @generated
	 */
	public Adapter createPrimeMeridianRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PrimeMeridianType <em>Prime Meridian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PrimeMeridianType
	 * @generated
	 */
	public Adapter createPrimeMeridianTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.PriorityLocationPropertyType <em>Priority Location Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.PriorityLocationPropertyType
	 * @generated
	 */
	public Adapter createPriorityLocationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ProjectedCRSRefType <em>Projected CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ProjectedCRSRefType
	 * @generated
	 */
	public Adapter createProjectedCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ProjectedCRSType <em>Projected CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ProjectedCRSType
	 * @generated
	 */
	public Adapter createProjectedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.QuantityExtentType <em>Quantity Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.QuantityExtentType
	 * @generated
	 */
	public Adapter createQuantityExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.QuantityPropertyType <em>Quantity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.QuantityPropertyType
	 * @generated
	 */
	public Adapter createQuantityPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RangeParametersType <em>Range Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RangeParametersType
	 * @generated
	 */
	public Adapter createRangeParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RangeSetType <em>Range Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RangeSetType
	 * @generated
	 */
	public Adapter createRangeSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RectangleType <em>Rectangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RectangleType
	 * @generated
	 */
	public Adapter createRectangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RectifiedGridCoverageType <em>Rectified Grid Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RectifiedGridCoverageType
	 * @generated
	 */
	public Adapter createRectifiedGridCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RectifiedGridDomainType <em>Rectified Grid Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RectifiedGridDomainType
	 * @generated
	 */
	public Adapter createRectifiedGridDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RectifiedGridType <em>Rectified Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RectifiedGridType
	 * @generated
	 */
	public Adapter createRectifiedGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ReferenceSystemRefType <em>Reference System Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ReferenceSystemRefType
	 * @generated
	 */
	public Adapter createReferenceSystemRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RefLocationType <em>Ref Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RefLocationType
	 * @generated
	 */
	public Adapter createRefLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RelatedTimeType <em>Related Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RelatedTimeType
	 * @generated
	 */
	public Adapter createRelatedTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RelativeInternalPositionalAccuracyType <em>Relative Internal Positional Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RelativeInternalPositionalAccuracyType
	 * @generated
	 */
	public Adapter createRelativeInternalPositionalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RingPropertyType <em>Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RingPropertyType
	 * @generated
	 */
	public Adapter createRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RingType <em>Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RingType
	 * @generated
	 */
	public Adapter createRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ScalarValuePropertyType <em>Scalar Value Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ScalarValuePropertyType
	 * @generated
	 */
	public Adapter createScalarValuePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ScaleType
	 * @generated
	 */
	public Adapter createScaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SecondDefiningParameterType <em>Second Defining Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SecondDefiningParameterType
	 * @generated
	 */
	public Adapter createSecondDefiningParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SequenceRuleType <em>Sequence Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SequenceRuleType
	 * @generated
	 */
	public Adapter createSequenceRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SingleOperationRefType <em>Single Operation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SingleOperationRefType
	 * @generated
	 */
	public Adapter createSingleOperationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SolidPropertyType <em>Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SolidPropertyType
	 * @generated
	 */
	public Adapter createSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SphericalCSRefType <em>Spherical CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SphericalCSRefType
	 * @generated
	 */
	public Adapter createSphericalCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SphericalCSType <em>Spherical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SphericalCSType
	 * @generated
	 */
	public Adapter createSphericalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.StringOrRefType <em>String Or Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.StringOrRefType
	 * @generated
	 */
	public Adapter createStringOrRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SurfaceArrayPropertyType <em>Surface Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SurfaceArrayPropertyType
	 * @generated
	 */
	public Adapter createSurfaceArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SurfacePropertyType <em>Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SurfacePropertyType
	 * @generated
	 */
	public Adapter createSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.RowType <em>Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.RowType
	 * @generated
	 */
	public Adapter createRowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SolidArrayPropertyType <em>Solid Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SolidArrayPropertyType
	 * @generated
	 */
	public Adapter createSolidArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SolidType <em>Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SolidType
	 * @generated
	 */
	public Adapter createSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SpeedType <em>Speed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SpeedType
	 * @generated
	 */
	public Adapter createSpeedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SphereType <em>Sphere Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SphereType
	 * @generated
	 */
	public Adapter createSphereTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.StyleType
	 * @generated
	 */
	public Adapter createStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.StyleVariationType <em>Style Variation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.StyleVariationType
	 * @generated
	 */
	public Adapter createStyleVariationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SurfacePatchArrayPropertyType <em>Surface Patch Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SurfacePatchArrayPropertyType
	 * @generated
	 */
	public Adapter createSurfacePatchArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SurfaceType <em>Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SurfaceType
	 * @generated
	 */
	public Adapter createSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.SymbolType <em>Symbol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.SymbolType
	 * @generated
	 */
	public Adapter createSymbolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TargetPropertyType <em>Target Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TargetPropertyType
	 * @generated
	 */
	public Adapter createTargetPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TemporalCRSRefType <em>Temporal CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TemporalCRSRefType
	 * @generated
	 */
	public Adapter createTemporalCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TemporalCRSType <em>Temporal CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TemporalCRSType
	 * @generated
	 */
	public Adapter createTemporalCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TemporalCSRefType <em>Temporal CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TemporalCSRefType
	 * @generated
	 */
	public Adapter createTemporalCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TemporalCSType <em>Temporal CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TemporalCSType
	 * @generated
	 */
	public Adapter createTemporalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TemporalDatumBaseType <em>Temporal Datum Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TemporalDatumBaseType
	 * @generated
	 */
	public Adapter createTemporalDatumBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TemporalDatumRefType <em>Temporal Datum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TemporalDatumRefType
	 * @generated
	 */
	public Adapter createTemporalDatumRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TemporalDatumType <em>Temporal Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TemporalDatumType
	 * @generated
	 */
	public Adapter createTemporalDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeCalendarEraPropertyType <em>Time Calendar Era Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeCalendarEraPropertyType
	 * @generated
	 */
	public Adapter createTimeCalendarEraPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeCalendarEraType <em>Time Calendar Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeCalendarEraType
	 * @generated
	 */
	public Adapter createTimeCalendarEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeCalendarPropertyType <em>Time Calendar Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeCalendarPropertyType
	 * @generated
	 */
	public Adapter createTimeCalendarPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeCalendarType <em>Time Calendar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeCalendarType
	 * @generated
	 */
	public Adapter createTimeCalendarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeClockPropertyType <em>Time Clock Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeClockPropertyType
	 * @generated
	 */
	public Adapter createTimeClockPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeClockType <em>Time Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeClockType
	 * @generated
	 */
	public Adapter createTimeClockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeCoordinateSystemType <em>Time Coordinate System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeCoordinateSystemType
	 * @generated
	 */
	public Adapter createTimeCoordinateSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeEdgePropertyType <em>Time Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeEdgePropertyType
	 * @generated
	 */
	public Adapter createTimeEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeEdgeType <em>Time Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeEdgeType
	 * @generated
	 */
	public Adapter createTimeEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeGeometricPrimitivePropertyType <em>Time Geometric Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeGeometricPrimitivePropertyType
	 * @generated
	 */
	public Adapter createTimeGeometricPrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeInstantPropertyType <em>Time Instant Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeInstantPropertyType
	 * @generated
	 */
	public Adapter createTimeInstantPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeInstantType <em>Time Instant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeInstantType
	 * @generated
	 */
	public Adapter createTimeInstantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeIntervalLengthType <em>Time Interval Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeIntervalLengthType
	 * @generated
	 */
	public Adapter createTimeIntervalLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeNodePropertyType <em>Time Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeNodePropertyType
	 * @generated
	 */
	public Adapter createTimeNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeNodeType <em>Time Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeNodeType
	 * @generated
	 */
	public Adapter createTimeNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeOrdinalEraPropertyType <em>Time Ordinal Era Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeOrdinalEraPropertyType
	 * @generated
	 */
	public Adapter createTimeOrdinalEraPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeOrdinalEraType <em>Time Ordinal Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeOrdinalEraType
	 * @generated
	 */
	public Adapter createTimeOrdinalEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeOrdinalReferenceSystemType <em>Time Ordinal Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeOrdinalReferenceSystemType
	 * @generated
	 */
	public Adapter createTimeOrdinalReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimePeriodPropertyType <em>Time Period Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimePeriodPropertyType
	 * @generated
	 */
	public Adapter createTimePeriodPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimePeriodType
	 * @generated
	 */
	public Adapter createTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimePositionType <em>Time Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimePositionType
	 * @generated
	 */
	public Adapter createTimePositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimePrimitivePropertyType <em>Time Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimePrimitivePropertyType
	 * @generated
	 */
	public Adapter createTimePrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeTopologyComplexPropertyType <em>Time Topology Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeTopologyComplexPropertyType
	 * @generated
	 */
	public Adapter createTimeTopologyComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeTopologyComplexType <em>Time Topology Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeTopologyComplexType
	 * @generated
	 */
	public Adapter createTimeTopologyComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeTopologyPrimitivePropertyType <em>Time Topology Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeTopologyPrimitivePropertyType
	 * @generated
	 */
	public Adapter createTimeTopologyPrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TinType <em>Tin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TinType
	 * @generated
	 */
	public Adapter createTinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoComplexMemberType <em>Topo Complex Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoComplexMemberType
	 * @generated
	 */
	public Adapter createTopoComplexMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoComplexType <em>Topo Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoComplexType
	 * @generated
	 */
	public Adapter createTopoComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoCurvePropertyType <em>Topo Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoCurvePropertyType
	 * @generated
	 */
	public Adapter createTopoCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoCurveType <em>Topo Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoCurveType
	 * @generated
	 */
	public Adapter createTopoCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopologyStylePropertyType <em>Topology Style Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopologyStylePropertyType
	 * @generated
	 */
	public Adapter createTopologyStylePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopologyStyleType <em>Topology Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopologyStyleType
	 * @generated
	 */
	public Adapter createTopologyStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoPointPropertyType <em>Topo Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoPointPropertyType
	 * @generated
	 */
	public Adapter createTopoPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoPointType <em>Topo Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoPointType
	 * @generated
	 */
	public Adapter createTopoPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoPrimitiveArrayAssociationType <em>Topo Primitive Array Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoPrimitiveArrayAssociationType
	 * @generated
	 */
	public Adapter createTopoPrimitiveArrayAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoPrimitiveMemberType <em>Topo Primitive Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoPrimitiveMemberType
	 * @generated
	 */
	public Adapter createTopoPrimitiveMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoSolidType <em>Topo Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoSolidType
	 * @generated
	 */
	public Adapter createTopoSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoSurfacePropertyType <em>Topo Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoSurfacePropertyType
	 * @generated
	 */
	public Adapter createTopoSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoSurfaceType <em>Topo Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoSurfaceType
	 * @generated
	 */
	public Adapter createTopoSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoVolumePropertyType <em>Topo Volume Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoVolumePropertyType
	 * @generated
	 */
	public Adapter createTopoVolumePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TopoVolumeType <em>Topo Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TopoVolumeType
	 * @generated
	 */
	public Adapter createTopoVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TrackType <em>Track Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TrackType
	 * @generated
	 */
	public Adapter createTrackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TransformationRefType <em>Transformation Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TransformationRefType
	 * @generated
	 */
	public Adapter createTransformationRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TransformationType <em>Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TransformationType
	 * @generated
	 */
	public Adapter createTransformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TrianglePatchArrayPropertyType <em>Triangle Patch Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TrianglePatchArrayPropertyType
	 * @generated
	 */
	public Adapter createTrianglePatchArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TriangleType <em>Triangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TriangleType
	 * @generated
	 */
	public Adapter createTriangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.TriangulatedSurfaceType <em>Triangulated Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.TriangulatedSurfaceType
	 * @generated
	 */
	public Adapter createTriangulatedSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.UnitDefinitionType <em>Unit Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.UnitDefinitionType
	 * @generated
	 */
	public Adapter createUnitDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.UnitOfMeasureType <em>Unit Of Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.UnitOfMeasureType
	 * @generated
	 */
	public Adapter createUnitOfMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.UserDefinedCSRefType <em>User Defined CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.UserDefinedCSRefType
	 * @generated
	 */
	public Adapter createUserDefinedCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.UserDefinedCSType <em>User Defined CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.UserDefinedCSType
	 * @generated
	 */
	public Adapter createUserDefinedCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ValueArrayPropertyType <em>Value Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ValueArrayPropertyType
	 * @generated
	 */
	public Adapter createValueArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ValueArrayType <em>Value Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ValueArrayType
	 * @generated
	 */
	public Adapter createValueArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.ValuePropertyType <em>Value Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.ValuePropertyType
	 * @generated
	 */
	public Adapter createValuePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VectorType
	 * @generated
	 */
	public Adapter createVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VerticalCRSRefType <em>Vertical CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VerticalCRSRefType
	 * @generated
	 */
	public Adapter createVerticalCRSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VerticalCRSType <em>Vertical CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VerticalCRSType
	 * @generated
	 */
	public Adapter createVerticalCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VerticalCSRefType <em>Vertical CS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VerticalCSRefType
	 * @generated
	 */
	public Adapter createVerticalCSRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VerticalCSType <em>Vertical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VerticalCSType
	 * @generated
	 */
	public Adapter createVerticalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VerticalDatumRefType <em>Vertical Datum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VerticalDatumRefType
	 * @generated
	 */
	public Adapter createVerticalDatumRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VerticalDatumType <em>Vertical Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VerticalDatumType
	 * @generated
	 */
	public Adapter createVerticalDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VerticalDatumTypeType <em>Vertical Datum Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VerticalDatumTypeType
	 * @generated
	 */
	public Adapter createVerticalDatumTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.VolumeType
	 * @generated
	 */
	public Adapter createVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GmlAdapterFactory
