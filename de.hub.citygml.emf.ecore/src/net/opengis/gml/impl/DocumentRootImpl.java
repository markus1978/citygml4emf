/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.*;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGML <em>GML</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getObject <em>Object</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getContinuousCoverage <em>Continuous Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateOperation <em>Coordinate Operation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateReferenceSystem <em>Coordinate Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCRS <em>CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getReferenceSystem <em>Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometricPrimitive <em>Geometric Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCurveSegment <em>Curve Segment</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDatum <em>Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDiscreteCoverage <em>Discrete Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeatureCollection <em>Feature Collection</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeneralConversion <em>General Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSingleOperation <em>Single Operation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeneralDerivedCRS <em>General Derived CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeneralOperationParameter <em>General Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeneralParameterValue <em>General Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeneralTransformation <em>General Transformation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometricAggregate <em>Geometric Aggregate</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGriddedSurface <em>Gridded Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getParametricCurveSurface <em>Parametric Curve Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSurfacePatch <em>Surface Patch</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getImplicitGeometry <em>Implicit Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPositionalAccuracy <em>Positional Accuracy</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRing <em>Ring</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSolid <em>Solid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getStrictAssociation <em>Strict Association</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeComplex <em>Time Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeObject <em>Time Object</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeGeometricPrimitive <em>Time Geometric Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimePrimitive <em>Time Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeReferenceSystem <em>Time Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeSlice <em>Time Slice</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeTopologyPrimitive <em>Time Topology Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopology <em>Topology</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoPrimitive <em>Topo Primitive</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAbsoluteExternalPositionalAccuracy <em>Absolute External Positional Accuracy</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAbstractGeneralOperationParameterRef <em>Abstract General Operation Parameter Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAffinePlacement <em>Affine Placement</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAnchorPoint <em>Anchor Point</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeatureMember <em>Feature Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getArcString <em>Arc String</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getArcByBulge <em>Arc By Bulge</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getArcStringByBulge <em>Arc String By Bulge</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getArcByCenterPoint <em>Arc By Center Point</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getArray <em>Array</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAxisAbbrev <em>Axis Abbrev</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAxisDirection <em>Axis Direction</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getAxisID <em>Axis ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBaseCRS <em>Base CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBaseCurve <em>Base Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBaseUnit <em>Base Unit</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUnitDefinition <em>Unit Definition</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBezier <em>Bezier</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBSpline <em>BSpline</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#isBoolean <em>Boolean</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBooleanList <em>Boolean List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#isBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBoundedBy <em>Bounded By</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getBoundingPolygon <em>Bounding Polygon</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCartesianCS <em>Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCartesianCSRef <em>Cartesian CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCatalogSymbol <em>Catalog Symbol</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCategoryExtent <em>Category Extent</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCategoryList <em>Category List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCenterLineOf <em>Center Line Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCenterOf <em>Center Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCircleByCenterPoint <em>Circle By Center Point</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getClothoid <em>Clothoid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getColumnIndex <em>Column Index</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCompassPoint <em>Compass Point</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCompositeCurve <em>Composite Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCompositeSolid <em>Composite Solid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCompositeSurface <em>Composite Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCompoundCRS <em>Compound CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCompoundCRSRef <em>Compound CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getConcatenatedOperation <em>Concatenated Operation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getConcatenatedOperationRef <em>Concatenated Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCone <em>Cone</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getConventionalUnit <em>Conventional Unit</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getConversion <em>Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getConversionRef <em>Conversion Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getConversionToPreferredUnit <em>Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoord <em>Coord</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateOperationID <em>Coordinate Operation ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateOperationName <em>Coordinate Operation Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateOperationRef <em>Coordinate Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateReferenceSystemRef <em>Coordinate Reference System Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateSystemAxis <em>Coordinate System Axis</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateSystemAxisRef <em>Coordinate System Axis Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoordinateSystemRef <em>Coordinate System Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCount <em>Count</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCountExtent <em>Count Extent</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCountList <em>Count List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCovariance <em>Covariance</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCovarianceMatrix <em>Covariance Matrix</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCoverageFunction <em>Coverage Function</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCrsRef <em>Crs Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCsID <em>Cs ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCsName <em>Cs Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCubicSpline <em>Cubic Spline</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCurve1 <em>Curve1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCurveArrayProperty <em>Curve Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCurveMember <em>Curve Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCurveMembers <em>Curve Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCurveProperty <em>Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCylindricalCS <em>Cylindrical CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getCylindricalCSRef <em>Cylindrical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDataBlock <em>Data Block</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDatumID <em>Datum ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDatumName <em>Datum Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDatumRef <em>Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDecimalMinutes <em>Decimal Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDefaultStyle <em>Default Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDefinedByConversion <em>Defined By Conversion</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDefinitionCollection <em>Definition Collection</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDefinitionMember <em>Definition Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDictionaryEntry <em>Dictionary Entry</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDefinitionProxy <em>Definition Proxy</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDefinitionRef <em>Definition Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDerivationUnitTerm <em>Derivation Unit Term</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDerivedCRS <em>Derived CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDerivedCRSRef <em>Derived CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDerivedCRSType <em>Derived CRS Type</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDerivedUnit <em>Derived Unit</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDictionary <em>Dictionary</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirectedNode <em>Directed Node</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirectedObservation <em>Directed Observation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirectedObservationAtDistance <em>Directed Observation At Distance</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirectedTopoSolid <em>Directed Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDirectionVector <em>Direction Vector</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDmsAngle <em>Dms Angle</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDmsAngleValue <em>Dms Angle Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDomainSet <em>Domain Set</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDoubleOrNullTupleList <em>Double Or Null Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEdgeOf <em>Edge Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEllipsoid <em>Ellipsoid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEllipsoidalCS <em>Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEllipsoidalCSRef <em>Ellipsoidal CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEllipsoidID <em>Ellipsoid ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEllipsoidName <em>Ellipsoid Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEllipsoidRef <em>Ellipsoid Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEngineeringCRS <em>Engineering CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEngineeringCRSRef <em>Engineering CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEngineeringDatum <em>Engineering Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEngineeringDatumRef <em>Engineering Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getEnvelopeWithTimePeriod <em>Envelope With Time Period</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getExtentOf <em>Extent Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFace <em>Face</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeatureCollection1 <em>Feature Collection1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeatureMembers <em>Feature Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeatureProperty <em>Feature Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeatureStyle <em>Feature Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFeatureStyle1 <em>Feature Style1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getFile <em>File</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeneralConversionRef <em>General Conversion Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeneralTransformationRef <em>General Transformation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGenericMetaData <em>Generic Meta Data</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeocentricCRS <em>Geocentric CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeocentricCRSRef <em>Geocentric CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeodesic <em>Geodesic</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeodesicString <em>Geodesic String</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeodeticDatum <em>Geodetic Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeodeticDatumRef <em>Geodetic Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeographicCRS <em>Geographic CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeographicCRSRef <em>Geographic CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometricComplex <em>Geometric Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometryMember <em>Geometry Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometryMembers <em>Geometry Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometryStyle <em>Geometry Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGeometryStyle1 <em>Geometry Style1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGraphStyle <em>Graph Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGraphStyle1 <em>Graph Style1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGreenwichLongitude <em>Greenwich Longitude</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGridCoverage <em>Grid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGridDomain <em>Grid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGridFunction <em>Grid Function</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getHistory <em>History</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getImageCRS <em>Image CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getImageCRSRef <em>Image CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getImageDatum <em>Image Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getImageDatumRef <em>Image Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIncludesCRS <em>Includes CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIncludesElement <em>Includes Element</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIncludesParameter <em>Includes Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIncludesValue <em>Includes Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIndexMap <em>Index Map</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIndirectEntry <em>Indirect Entry</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getInnerBoundaryIs <em>Inner Boundary Is</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getInterior <em>Interior</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIntegerValueList <em>Integer Value List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getInverseFlattening <em>Inverse Flattening</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIsolated <em>Isolated</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getIsSphere <em>Is Sphere</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLabelStyle1 <em>Label Style1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLinearCS <em>Linear CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLinearCSRef <em>Linear CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLineString <em>Line String</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLineStringMember <em>Line String Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLineStringProperty <em>Line String Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLineStringSegment <em>Line String Segment</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLocationKeyWord <em>Location Key Word</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getLocationString <em>Location String</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMappingRule <em>Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMaximalComplex <em>Maximal Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMaximumOccurs <em>Maximum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMeasureDescription <em>Measure Description</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMember <em>Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMeridianID <em>Meridian ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMeridianName <em>Meridian Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMetaDataProperty <em>Meta Data Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMethodFormula <em>Method Formula</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMinimumOccurs <em>Minimum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getModifiedCoordinate <em>Modified Coordinate</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMovingObjectStatus <em>Moving Object Status</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiCenterLineOf <em>Multi Center Line Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiCenterOf <em>Multi Center Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiCoverage <em>Multi Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiCurve <em>Multi Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiCurveCoverage <em>Multi Curve Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiCurveDomain <em>Multi Curve Domain</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiCurveProperty <em>Multi Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiEdgeOf <em>Multi Edge Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiExtentOf <em>Multi Extent Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiGeometry <em>Multi Geometry</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiGeometryProperty <em>Multi Geometry Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiLineString <em>Multi Line String</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiLocation <em>Multi Location</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiPoint <em>Multi Point</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiPointCoverage <em>Multi Point Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiPointDomain <em>Multi Point Domain</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiPointProperty <em>Multi Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiPolygon <em>Multi Polygon</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiPosition <em>Multi Position</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSolid <em>Multi Solid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSolidCoverage <em>Multi Solid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSolidDomain <em>Multi Solid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSolidProperty <em>Multi Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSurface <em>Multi Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSurfaceCoverage <em>Multi Surface Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSurfaceDomain <em>Multi Surface Domain</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getMultiSurfaceProperty <em>Multi Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getObliqueCartesianCS <em>Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getObliqueCartesianCSRef <em>Oblique Cartesian CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOffsetCurve <em>Offset Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationMethod <em>Operation Method</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationMethodRef <em>Operation Method Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationParameter <em>Operation Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationParameterGroup <em>Operation Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationParameterGroupRef <em>Operation Parameter Group Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationParameterRef <em>Operation Parameter Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOperationVersion <em>Operation Version</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOrientableCurve <em>Orientable Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOrientableSurface <em>Orientable Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getOuterBoundaryIs <em>Outer Boundary Is</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getParameterID <em>Parameter ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getParameterValueGroup <em>Parameter Value Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPassThroughOperation <em>Pass Through Operation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPassThroughOperationRef <em>Pass Through Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPatches <em>Patches</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPixelInCell <em>Pixel In Cell</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPointArrayProperty <em>Point Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPointMember <em>Point Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPointMembers <em>Point Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPointRep <em>Point Rep</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolarCS <em>Polar CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolarCSRef <em>Polar CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolygonMember <em>Polygon Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolygonPatch <em>Polygon Patch</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolygonPatches <em>Polygon Patches</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolygonProperty <em>Polygon Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPolyhedralSurface <em>Polyhedral Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSurface1 <em>Surface1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPrimeMeridian <em>Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPrimeMeridianRef <em>Prime Meridian Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getPriorityLocation <em>Priority Location</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getProjectedCRS <em>Projected CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getProjectedCRSRef <em>Projected CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getQuantityExtent <em>Quantity Extent</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getQuantityList <em>Quantity List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getQuantityType <em>Quantity Type</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRangeParameters <em>Range Parameters</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRangeSet <em>Range Set</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRealizationEpoch <em>Realization Epoch</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRectifiedGrid <em>Rectified Grid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRectifiedGridDomain <em>Rectified Grid Domain</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getReferenceSystemRef <em>Reference System Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRelativeInternalPositionalAccuracy <em>Relative Internal Positional Accuracy</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getResult <em>Result</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRing1 <em>Ring1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRoughConversionToPreferredUnit <em>Rough Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSemiMajorAxis <em>Semi Major Axis</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSemiMinorAxis <em>Semi Minor Axis</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSingleOperationRef <em>Single Operation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSolid1 <em>Solid1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSolidArrayProperty <em>Solid Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSolidMember <em>Solid Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSolidMembers <em>Solid Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSolidProperty <em>Solid Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSourceCRS <em>Source CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSourceDimensions <em>Source Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSphericalCS <em>Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSphericalCSRef <em>Spherical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSrsID <em>Srs ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSrsName <em>Srs Name</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getStyle1 <em>Style1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSubComplex <em>Sub Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSuperComplex <em>Super Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSurfaceArrayProperty <em>Surface Array Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSurfaceMember <em>Surface Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSurfaceMembers <em>Surface Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSurfaceProperty <em>Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTargetCRS <em>Target CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTargetDimensions <em>Target Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTemporalCRS <em>Temporal CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTemporalCRSRef <em>Temporal CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTemporalCS <em>Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTemporalCSRef <em>Temporal CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTemporalDatum <em>Temporal Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTemporalDatumRef <em>Temporal Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTemporalExtent <em>Temporal Extent</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeCalendar <em>Time Calendar</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeCalendarEra <em>Time Calendar Era</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeClock <em>Time Clock</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeCoordinateSystem <em>Time Coordinate System</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeEdge <em>Time Edge</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeInstant <em>Time Instant</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeNode <em>Time Node</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeOrdinalEra <em>Time Ordinal Era</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeOrdinalReferenceSystem <em>Time Ordinal Reference System</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimePosition <em>Time Position</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTimeTopologyComplex <em>Time Topology Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTin <em>Tin</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTriangulatedSurface <em>Triangulated Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoComplex <em>Topo Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoComplexProperty <em>Topo Complex Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoCurve <em>Topo Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoCurveProperty <em>Topo Curve Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopologyStyle <em>Topology Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopologyStyle1 <em>Topology Style1</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoPoint <em>Topo Point</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoPointProperty <em>Topo Point Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoPrimitiveMember <em>Topo Primitive Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoPrimitiveMembers <em>Topo Primitive Members</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoSolid <em>Topo Solid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoSurface <em>Topo Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoSurfaceProperty <em>Topo Surface Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoVolume <em>Topo Volume</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTopoVolumeProperty <em>Topo Volume Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTransformationRef <em>Transformation Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTriangle <em>Triangle</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTrianglePatches <em>Triangle Patches</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUserDefinedCS <em>User Defined CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUserDefinedCSRef <em>User Defined CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesAxis <em>Uses Axis</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesCS <em>Uses CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesEllipsoid <em>Uses Ellipsoid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesEllipsoidalCS <em>Uses Ellipsoidal CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesEngineeringDatum <em>Uses Engineering Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesGeodeticDatum <em>Uses Geodetic Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesImageDatum <em>Uses Image Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesMethod <em>Uses Method</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesOperation <em>Uses Operation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesParameter <em>Uses Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesPrimeMeridian <em>Uses Prime Meridian</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesSingleOperation <em>Uses Single Operation</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesSphericalCS <em>Uses Spherical CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesTemporalCS <em>Uses Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesTemporalDatum <em>Uses Temporal Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesValue <em>Uses Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesVerticalCS <em>Uses Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsesVerticalDatum <em>Uses Vertical Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUsing <em>Using</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValidArea <em>Valid Area</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValueArray <em>Value Array</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValueComponents <em>Value Components</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValueFile <em>Value File</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValueList <em>Value List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValueOfParameter <em>Value Of Parameter</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValueProperty <em>Value Property</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getValuesOfGroup <em>Values Of Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalCRS <em>Vertical CRS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalCRSRef <em>Vertical CRS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalCS <em>Vertical CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalCSRef <em>Vertical CS Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalDatum <em>Vertical Datum</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalDatumRef <em>Vertical Datum Ref</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalDatumType <em>Vertical Datum Type</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getVerticalExtent <em>Vertical Extent</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DocumentRootImpl#getUom <em>Uom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #isBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getBooleanList() <em>Boolean List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanList()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> BOOLEAN_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColumnIndex() <em>Column Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_INDEX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCompassPoint() <em>Compass Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompassPoint()
	 * @generated
	 * @ordered
	 */
	protected static final CompassPointEnumeration COMPASS_POINT_EDEFAULT = CompassPointEnumeration.N;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COUNT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountExtent() <em>Count Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountExtent()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> COUNT_EXTENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountList() <em>Count List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountList()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> COUNT_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCovariance() <em>Covariance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovariance()
	 * @generated
	 * @ordered
	 */
	protected static final double COVARIANCE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getDecimalMinutes() <em>Decimal Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DECIMAL_MINUTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDoubleOrNullTupleList() <em>Double Or Null Tuple List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleOrNullTupleList()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntegerValue() <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INTEGER_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntegerValueList() <em>Integer Value List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValueList()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> INTEGER_VALUE_LIST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsSphere() <em>Is Sphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSphere()
	 * @generated
	 * @ordered
	 */
	protected static final IsSphereType IS_SPHERE_EDEFAULT = IsSphereType.SPHERE;

	/**
	 * The default value of the '{@link #getMaximumOccurs() <em>Maximum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_OCCURS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinimumOccurs() <em>Minimum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_OCCURS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinutes() <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINUTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModifiedCoordinate() <em>Modified Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MODIFIED_COORDINATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected static final Object NULL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOperationVersion() <em>Operation Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ORIGIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRealizationEpoch() <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizationEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REALIZATION_EPOCH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROW_INDEX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SECONDS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSourceDimensions() <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOURCE_DIMENSIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetDimensions() <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TARGET_DIMENSIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValueFile() <em>Value File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFile()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FILE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected String remoteSchema = REMOTE_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected String transform = TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected String uom = UOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GmlPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeatureType getFeature() {
		return (AbstractFeatureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Feature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(AbstractFeatureType newFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Feature(), newFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGMLType getGML() {
		return (AbstractGMLType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GML(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGML(AbstractGMLType newGML, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GML(), newGML, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObject() {
		return (EObject)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Object(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(EObject newObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Object(), newObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType getAssociation() {
		return (AssociationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Association(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(AssociationType newAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Association(), newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractContinuousCoverageType getContinuousCoverage() {
		return (AbstractContinuousCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ContinuousCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuousCoverage(AbstractContinuousCoverageType newContinuousCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ContinuousCoverage(), newContinuousCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoverageType getCoverage() {
		return (AbstractCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Coverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(AbstractCoverageType newCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Coverage(), newCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinateOperationType getCoordinateOperation() {
		return (AbstractCoordinateOperationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateOperation(AbstractCoordinateOperationType newCoordinateOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperation(), newCoordinateOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionType getDefinition() {
		return (DefinitionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Definition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(DefinitionType newDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Definition(), newDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(DefinitionType newDefinition) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Definition(), newDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractReferenceSystemType getCoordinateReferenceSystem() {
		return (AbstractReferenceSystemType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateReferenceSystem(AbstractReferenceSystemType newCoordinateReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystem(), newCoordinateReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractReferenceSystemType getCRS() {
		return (AbstractReferenceSystemType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCRS(AbstractReferenceSystemType newCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CRS(), newCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractReferenceSystemType getReferenceSystem() {
		return (AbstractReferenceSystemType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSystem(AbstractReferenceSystemType newReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystem(), newReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinateSystemType getCoordinateSystem() {
		return (AbstractCoordinateSystemType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystem(AbstractCoordinateSystemType newCoordinateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystem(), newCoordinateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCurveType getCurve() {
		return (AbstractCurveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Curve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurve(AbstractCurveType newCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Curve(), newCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeometricPrimitiveType getGeometricPrimitive() {
		return (AbstractGeometricPrimitiveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeometricPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricPrimitive(AbstractGeometricPrimitiveType newGeometricPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeometricPrimitive(), newGeometricPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeometryType getGeometry() {
		return (AbstractGeometryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Geometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(AbstractGeometryType newGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Geometry(), newGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCurveSegmentType getCurveSegment() {
		return (AbstractCurveSegmentType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CurveSegment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveSegment(AbstractCurveSegmentType newCurveSegment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CurveSegment(), newCurveSegment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDatumType getDatum() {
		return (AbstractDatumType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Datum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatum(AbstractDatumType newDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Datum(), newDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDiscreteCoverageType getDiscreteCoverage() {
		return (AbstractDiscreteCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DiscreteCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscreteCoverage(AbstractDiscreteCoverageType newDiscreteCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DiscreteCoverage(), newDiscreteCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeatureCollectionType getFeatureCollection() {
		return (AbstractFeatureCollectionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCollection(AbstractFeatureCollectionType newFeatureCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection(), newFeatureCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralConversionType getGeneralConversion() {
		return (AbstractGeneralConversionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralConversion(AbstractGeneralConversionType newGeneralConversion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversion(), newGeneralConversion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinateOperationType getOperation() {
		return (AbstractCoordinateOperationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Operation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(AbstractCoordinateOperationType newOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Operation(), newOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCoordinateOperationType getSingleOperation() {
		return (AbstractCoordinateOperationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleOperation(AbstractCoordinateOperationType newSingleOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperation(), newSingleOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralDerivedCRSType getGeneralDerivedCRS() {
		return (AbstractGeneralDerivedCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeneralDerivedCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralDerivedCRS(AbstractGeneralDerivedCRSType newGeneralDerivedCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeneralDerivedCRS(), newGeneralDerivedCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralOperationParameterType getGeneralOperationParameter() {
		return (AbstractGeneralOperationParameterType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeneralOperationParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralOperationParameter(AbstractGeneralOperationParameterType newGeneralOperationParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeneralOperationParameter(), newGeneralOperationParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralParameterValueType getGeneralParameterValue() {
		return (AbstractGeneralParameterValueType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeneralParameterValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralParameterValue(AbstractGeneralParameterValueType newGeneralParameterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeneralParameterValue(), newGeneralParameterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralTransformationType getGeneralTransformation() {
		return (AbstractGeneralTransformationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralTransformation(AbstractGeneralTransformationType newGeneralTransformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformation(), newGeneralTransformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeometricAggregateType getGeometricAggregate() {
		return (AbstractGeometricAggregateType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeometricAggregate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricAggregate(AbstractGeometricAggregateType newGeometricAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeometricAggregate(), newGeometricAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGriddedSurfaceType getGriddedSurface() {
		return (AbstractGriddedSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GriddedSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGriddedSurface(AbstractGriddedSurfaceType newGriddedSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GriddedSurface(), newGriddedSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractParametricCurveSurfaceType getParametricCurveSurface() {
		return (AbstractParametricCurveSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ParametricCurveSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametricCurveSurface(AbstractParametricCurveSurfaceType newParametricCurveSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ParametricCurveSurface(), newParametricCurveSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSurfacePatchType getSurfacePatch() {
		return (AbstractSurfacePatchType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SurfacePatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfacePatch(AbstractSurfacePatchType newSurfacePatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SurfacePatch(), newSurfacePatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeometryType getImplicitGeometry() {
		return (AbstractGeometryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ImplicitGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplicitGeometry(AbstractGeometryType newImplicitGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ImplicitGeometry(), newImplicitGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMetaDataType getMetaData() {
		return (AbstractMetaDataType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MetaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaData(AbstractMetaDataType newMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MetaData(), newMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPositionalAccuracyType getPositionalAccuracy() {
		return (AbstractPositionalAccuracyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PositionalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionalAccuracy(AbstractPositionalAccuracyType newPositionalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PositionalAccuracy(), newPositionalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getReference() {
		return (ReferenceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Reference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Reference(), newReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingType getRing() {
		return (AbstractRingType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Ring(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRing(AbstractRingType newRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Ring(), newRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSolidType getSolid() {
		return (AbstractSolidType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Solid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolid(AbstractSolidType newSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Solid(), newSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType getStrictAssociation() {
		return (AssociationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_StrictAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrictAssociation(AssociationType newStrictAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_StrictAssociation(), newStrictAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStyleType getStyle() {
		return (AbstractStyleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Style(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(AbstractStyleType newStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Style(), newStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSurfaceType getSurface() {
		return (AbstractSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Surface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurface(AbstractSurfaceType newSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Surface(), newSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTimeComplexType getTimeComplex() {
		return (AbstractTimeComplexType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeComplex(AbstractTimeComplexType newTimeComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeComplex(), newTimeComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTimeObjectType getTimeObject() {
		return (AbstractTimeObjectType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeObject(AbstractTimeObjectType newTimeObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeObject(), newTimeObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTimeGeometricPrimitiveType getTimeGeometricPrimitive() {
		return (AbstractTimeGeometricPrimitiveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeGeometricPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeGeometricPrimitive(AbstractTimeGeometricPrimitiveType newTimeGeometricPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeGeometricPrimitive(), newTimeGeometricPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTimePrimitiveType getTimePrimitive() {
		return (AbstractTimePrimitiveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimePrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePrimitive(AbstractTimePrimitiveType newTimePrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimePrimitive(), newTimePrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTimeReferenceSystemType getTimeReferenceSystem() {
		return (AbstractTimeReferenceSystemType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeReferenceSystem(AbstractTimeReferenceSystemType newTimeReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeReferenceSystem(), newTimeReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTimeSliceType getTimeSlice() {
		return (AbstractTimeSliceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeSlice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSlice(AbstractTimeSliceType newTimeSlice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeSlice(), newTimeSlice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTimeTopologyPrimitiveType getTimeTopologyPrimitive() {
		return (AbstractTimeTopologyPrimitiveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTopologyPrimitive(AbstractTimeTopologyPrimitiveType newTimeTopologyPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyPrimitive(), newTimeTopologyPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTopologyType getTopology() {
		return (AbstractTopologyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Topology(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopology(AbstractTopologyType newTopology, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Topology(), newTopology, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTopoPrimitiveType getTopoPrimitive() {
		return (AbstractTopoPrimitiveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPrimitive(AbstractTopoPrimitiveType newTopoPrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitive(), newTopoPrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteExternalPositionalAccuracyType getAbsoluteExternalPositionalAccuracy() {
		return (AbsoluteExternalPositionalAccuracyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_AbsoluteExternalPositionalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbsoluteExternalPositionalAccuracy(AbsoluteExternalPositionalAccuracyType newAbsoluteExternalPositionalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_AbsoluteExternalPositionalAccuracy(), newAbsoluteExternalPositionalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteExternalPositionalAccuracy(AbsoluteExternalPositionalAccuracyType newAbsoluteExternalPositionalAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_AbsoluteExternalPositionalAccuracy(), newAbsoluteExternalPositionalAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralOperationParameterRefType getAbstractGeneralOperationParameterRef() {
		return (AbstractGeneralOperationParameterRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGeneralOperationParameterRef(AbstractGeneralOperationParameterRefType newAbstractGeneralOperationParameterRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef(), newAbstractGeneralOperationParameterRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractGeneralOperationParameterRef(AbstractGeneralOperationParameterRefType newAbstractGeneralOperationParameterRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_AbstractGeneralOperationParameterRef(), newAbstractGeneralOperationParameterRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffinePlacementType getAffinePlacement() {
		return (AffinePlacementType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_AffinePlacement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffinePlacement(AffinePlacementType newAffinePlacement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_AffinePlacement(), newAffinePlacement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinePlacement(AffinePlacementType newAffinePlacement) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_AffinePlacement(), newAffinePlacement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getAnchorPoint() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchorPoint(CodeType newAnchorPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(), newAnchorPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorPoint(CodeType newAnchorPoint) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_AnchorPoint(), newAnchorPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getAngle() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Angle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(MeasureType newAngle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Angle(), newAngle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(MeasureType newAngle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Angle(), newAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePropertyType getFeatureMember() {
		return (FeaturePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureMember(FeaturePropertyType newFeatureMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember(), newFeatureMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureMember(FeaturePropertyType newFeatureMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMember(), newFeatureMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcType getArc() {
		return (ArcType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Arc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArc(ArcType newArc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Arc(), newArc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArc(ArcType newArc) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Arc(), newArc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcStringType getArcString() {
		return (ArcStringType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcString(ArcStringType newArcString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(), newArcString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcString(ArcStringType newArcString) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ArcString(), newArcString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcByBulgeType getArcByBulge() {
		return (ArcByBulgeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcByBulge(ArcByBulgeType newArcByBulge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge(), newArcByBulge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcByBulge(ArcByBulgeType newArcByBulge) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ArcByBulge(), newArcByBulge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcStringByBulgeType getArcStringByBulge() {
		return (ArcStringByBulgeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcStringByBulge(ArcStringByBulgeType newArcStringByBulge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(), newArcStringByBulge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcStringByBulge(ArcStringByBulgeType newArcStringByBulge) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ArcStringByBulge(), newArcStringByBulge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcByCenterPointType getArcByCenterPoint() {
		return (ArcByCenterPointType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArcByCenterPoint(ArcByCenterPointType newArcByCenterPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(), newArcByCenterPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcByCenterPoint(ArcByCenterPointType newArcByCenterPoint) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ArcByCenterPoint(), newArcByCenterPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType getArray() {
		return (ArrayType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Array(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(ArrayType newArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Array(), newArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(ArrayType newArray) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Array(), newArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getAxisAbbrev() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisAbbrev(CodeType newAxisAbbrev, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(), newAxisAbbrev, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisAbbrev(CodeType newAxisAbbrev) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_AxisAbbrev(), newAxisAbbrev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getAxisDirection() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisDirection(CodeType newAxisDirection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(), newAxisDirection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisDirection(CodeType newAxisDirection) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_AxisDirection(), newAxisDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getAxisID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_AxisID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisID(IdentifierType newAxisID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_AxisID(), newAxisID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisID(IdentifierType newAxisID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_AxisID(), newAxisID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagType getBag() {
		return (BagType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Bag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBag(BagType newBag, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Bag(), newBag, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBag(BagType newBag) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Bag(), newBag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateReferenceSystemRefType getBaseCRS() {
		return (CoordinateReferenceSystemRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCRS(CoordinateReferenceSystemRefType newBaseCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS(), newBaseCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCRS(CoordinateReferenceSystemRefType newBaseCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BaseCRS(), newBaseCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurvePropertyType getBaseCurve() {
		return (CurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseCurve(CurvePropertyType newBaseCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve(), newBaseCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseCurve(CurvePropertyType newBaseCurve) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BaseCurve(), newBaseCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePropertyType getBaseSurface() {
		return (SurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseSurface(SurfacePropertyType newBaseSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface(), newBaseSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseSurface(SurfacePropertyType newBaseSurface) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BaseSurface(), newBaseSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseUnitType getBaseUnit() {
		return (BaseUnitType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseUnit(BaseUnitType newBaseUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit(), newBaseUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUnit(BaseUnitType newBaseUnit) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BaseUnit(), newBaseUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDefinitionType getUnitDefinition() {
		return (UnitDefinitionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitDefinition(UnitDefinitionType newUnitDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(), newUnitDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitDefinition(UnitDefinitionType newUnitDefinition) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UnitDefinition(), newUnitDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BezierType getBezier() {
		return (BezierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Bezier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezier(BezierType newBezier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Bezier(), newBezier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBezier(BezierType newBezier) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Bezier(), newBezier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSplineType getBSpline() {
		return (BSplineType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBSpline(BSplineType newBSpline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(), newBSpline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBSpline(BSplineType newBSpline) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BSpline(), newBSpline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolean() {
		return (Boolean)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Boolean(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(boolean newBoolean) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Boolean(), newBoolean);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Object> getBooleanList() {
		return (List<Object>)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BooleanList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanList(List<Object> newBooleanList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BooleanList(), newBooleanList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBooleanValue() {
		return (Boolean)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BooleanValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(boolean newBooleanValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BooleanValue(), newBooleanValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingShapeType getBoundedBy() {
		return (BoundingShapeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BoundedBy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundedBy(BoundingShapeType newBoundedBy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BoundedBy(), newBoundedBy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundedBy(BoundingShapeType newBoundedBy) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BoundedBy(), newBoundedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvelopeType getBoundingBox() {
		return (EnvelopeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingBox(EnvelopeType newBoundingBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox(), newBoundingBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundingBox(EnvelopeType newBoundingBox) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BoundingBox(), newBoundingBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType getBoundingPolygon() {
		return (PolygonType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingPolygon(PolygonType newBoundingPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon(), newBoundingPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundingPolygon(PolygonType newBoundingPolygon) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_BoundingPolygon(), newBoundingPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCSType getCartesianCS() {
		return (CartesianCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCS(CartesianCSType newCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(), newCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianCS(CartesianCSType newCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCS(), newCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCSRefType getCartesianCSRef() {
		return (CartesianCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCartesianCSRef(CartesianCSRefType newCartesianCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef(), newCartesianCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianCSRef(CartesianCSRefType newCartesianCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CartesianCSRef(), newCartesianCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getCatalogSymbol() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalogSymbol(CodeType newCatalogSymbol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(), newCatalogSymbol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogSymbol(CodeType newCatalogSymbol) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CatalogSymbol(), newCatalogSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getCategory() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Category(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeType newCategory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Category(), newCategory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(CodeType newCategory) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Category(), newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryExtentType getCategoryExtent() {
		return (CategoryExtentType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoryExtent(CategoryExtentType newCategoryExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent(), newCategoryExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryExtent(CategoryExtentType newCategoryExtent) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CategoryExtent(), newCategoryExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeOrNullListType getCategoryList() {
		return (CodeOrNullListType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoryList(CodeOrNullListType newCategoryList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList(), newCategoryList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryList(CodeOrNullListType newCategoryList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CategoryList(), newCategoryList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurvePropertyType getCenterLineOf() {
		return (CurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterLineOf(CurvePropertyType newCenterLineOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf(), newCenterLineOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterLineOf(CurvePropertyType newCenterLineOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CenterLineOf(), newCenterLineOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointPropertyType getCenterOf() {
		return (PointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CenterOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterOf(PointPropertyType newCenterOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CenterOf(), newCenterOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterOf(PointPropertyType newCenterOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CenterOf(), newCenterOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleType getCircle() {
		return (CircleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Circle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircle(CircleType newCircle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Circle(), newCircle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircle(CircleType newCircle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Circle(), newCircle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleByCenterPointType getCircleByCenterPoint() {
		return (CircleByCenterPointType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircleByCenterPoint(CircleByCenterPointType newCircleByCenterPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint(), newCircleByCenterPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircleByCenterPoint(CircleByCenterPointType newCircleByCenterPoint) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CircleByCenterPoint(), newCircleByCenterPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClothoidType getClothoid() {
		return (ClothoidType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Clothoid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClothoid(ClothoidType newClothoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Clothoid(), newClothoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClothoid(ClothoidType newClothoid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Clothoid(), newClothoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColumnIndex() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ColumnIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnIndex(BigInteger newColumnIndex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ColumnIndex(), newColumnIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompassPointEnumeration getCompassPoint() {
		return (CompassPointEnumeration)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CompassPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompassPoint(CompassPointEnumeration newCompassPoint) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CompassPoint(), newCompassPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCurveType getCompositeCurve() {
		return (CompositeCurveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeCurve(CompositeCurveType newCompositeCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve(), newCompositeCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeCurve(CompositeCurveType newCompositeCurve) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CompositeCurve(), newCompositeCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSolidType getCompositeSolid() {
		return (CompositeSolidType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSolid(CompositeSolidType newCompositeSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid(), newCompositeSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeSolid(CompositeSolidType newCompositeSolid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSolid(), newCompositeSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSurfaceType getCompositeSurface() {
		return (CompositeSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSurface(CompositeSurfaceType newCompositeSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(), newCompositeSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeSurface(CompositeSurfaceType newCompositeSurface) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CompositeSurface(), newCompositeSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValueType getCompositeValue() {
		return (CompositeValueType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeValue(CompositeValueType newCompositeValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue(), newCompositeValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeValue(CompositeValueType newCompositeValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CompositeValue(), newCompositeValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundCRSType getCompoundCRS() {
		return (CompoundCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundCRS(CompoundCRSType newCompoundCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS(), newCompoundCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundCRS(CompoundCRSType newCompoundCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRS(), newCompoundCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundCRSRefType getCompoundCRSRef() {
		return (CompoundCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundCRSRef(CompoundCRSRefType newCompoundCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRSRef(), newCompoundCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundCRSRef(CompoundCRSRefType newCompoundCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CompoundCRSRef(), newCompoundCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcatenatedOperationType getConcatenatedOperation() {
		return (ConcatenatedOperationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcatenatedOperation(ConcatenatedOperationType newConcatenatedOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation(), newConcatenatedOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcatenatedOperation(ConcatenatedOperationType newConcatenatedOperation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperation(), newConcatenatedOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcatenatedOperationRefType getConcatenatedOperationRef() {
		return (ConcatenatedOperationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcatenatedOperationRef(ConcatenatedOperationRefType newConcatenatedOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperationRef(), newConcatenatedOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcatenatedOperationRef(ConcatenatedOperationRefType newConcatenatedOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ConcatenatedOperationRef(), newConcatenatedOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConeType getCone() {
		return (ConeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Cone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCone(ConeType newCone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Cone(), newCone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCone(ConeType newCone) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Cone(), newCone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerPropertyType getContainer() {
		return (ContainerPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Container(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ContainerPropertyType newContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Container(), newContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ContainerPropertyType newContainer) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Container(), newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConventionalUnitType getConventionalUnit() {
		return (ConventionalUnitType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConventionalUnit(ConventionalUnitType newConventionalUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit(), newConventionalUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConventionalUnit(ConventionalUnitType newConventionalUnit) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ConventionalUnit(), newConventionalUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionType getConversion() {
		return (ConversionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Conversion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversion(ConversionType newConversion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Conversion(), newConversion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversion(ConversionType newConversion) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Conversion(), newConversion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionRefType getConversionRef() {
		return (ConversionRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ConversionRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionRef(ConversionRefType newConversionRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ConversionRef(), newConversionRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionRef(ConversionRefType newConversionRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ConversionRef(), newConversionRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionToPreferredUnitType getConversionToPreferredUnit() {
		return (ConversionToPreferredUnitType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversionToPreferredUnit(ConversionToPreferredUnitType newConversionToPreferredUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit(), newConversionToPreferredUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionToPreferredUnit(ConversionToPreferredUnitType newConversionToPreferredUnit) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ConversionToPreferredUnit(), newConversionToPreferredUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordType getCoord() {
		return (CoordType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Coord(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoord(CoordType newCoord, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Coord(), newCoord, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoord(CoordType newCoord) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Coord(), newCoord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getCoordinateOperationID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateOperationID(IdentifierType newCoordinateOperationID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID(), newCoordinateOperationID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateOperationID(IdentifierType newCoordinateOperationID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationID(), newCoordinateOperationID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getCoordinateOperationName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateOperationName(CodeType newCoordinateOperationName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(), newCoordinateOperationName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateOperationName(CodeType newCoordinateOperationName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationName(), newCoordinateOperationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CodeType newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Name(), newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(CodeType newName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateOperationRefType getCoordinateOperationRef() {
		return (CoordinateOperationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateOperationRef(CoordinateOperationRefType newCoordinateOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationRef(), newCoordinateOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateOperationRef(CoordinateOperationRefType newCoordinateOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateOperationRef(), newCoordinateOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateReferenceSystemRefType getCoordinateReferenceSystemRef() {
		return (CoordinateReferenceSystemRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateReferenceSystemRef(CoordinateReferenceSystemRefType newCoordinateReferenceSystemRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef(), newCoordinateReferenceSystemRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateReferenceSystemRef(CoordinateReferenceSystemRefType newCoordinateReferenceSystemRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateReferenceSystemRef(), newCoordinateReferenceSystemRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesType getCoordinates() {
		return (CoordinatesType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Coordinates(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(CoordinatesType newCoordinates, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Coordinates(), newCoordinates, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(CoordinatesType newCoordinates) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Coordinates(), newCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemAxisType getCoordinateSystemAxis() {
		return (CoordinateSystemAxisType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystemAxis(CoordinateSystemAxisType newCoordinateSystemAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis(), newCoordinateSystemAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSystemAxis(CoordinateSystemAxisType newCoordinateSystemAxis) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxis(), newCoordinateSystemAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemAxisRefType getCoordinateSystemAxisRef() {
		return (CoordinateSystemAxisRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystemAxisRef(CoordinateSystemAxisRefType newCoordinateSystemAxisRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef(), newCoordinateSystemAxisRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSystemAxisRef(CoordinateSystemAxisRefType newCoordinateSystemAxisRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemAxisRef(), newCoordinateSystemAxisRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemRefType getCoordinateSystemRef() {
		return (CoordinateSystemRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinateSystemRef(CoordinateSystemRefType newCoordinateSystemRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef(), newCoordinateSystemRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinateSystemRef(CoordinateSystemRefType newCoordinateSystemRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoordinateSystemRef(), newCoordinateSystemRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCount() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Count(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(BigInteger newCount) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Count(), newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Object> getCountExtent() {
		return (List<Object>)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CountExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountExtent(List<Object> newCountExtent) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CountExtent(), newCountExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Object> getCountList() {
		return (List<Object>)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CountList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountList(List<Object> newCountList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CountList(), newCountList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCovariance() {
		return (Double)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Covariance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovariance(double newCovariance) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Covariance(), newCovariance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CovarianceMatrixType getCovarianceMatrix() {
		return (CovarianceMatrixType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CovarianceMatrix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCovarianceMatrix(CovarianceMatrixType newCovarianceMatrix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CovarianceMatrix(), newCovarianceMatrix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovarianceMatrix(CovarianceMatrixType newCovarianceMatrix) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CovarianceMatrix(), newCovarianceMatrix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageFunctionType getCoverageFunction() {
		return (CoverageFunctionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CoverageFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverageFunction(CoverageFunctionType newCoverageFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CoverageFunction(), newCoverageFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverageFunction(CoverageFunctionType newCoverageFunction) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CoverageFunction(), newCoverageFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRSRefType getCrsRef() {
		return (CRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CrsRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrsRef(CRSRefType newCrsRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CrsRef(), newCrsRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrsRef(CRSRefType newCrsRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CrsRef(), newCrsRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getCsID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CsID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsID(IdentifierType newCsID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CsID(), newCsID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsID(IdentifierType newCsID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CsID(), newCsID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getCsName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CsName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsName(CodeType newCsName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CsName(), newCsName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsName(CodeType newCsName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CsName(), newCsName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubicSplineType getCubicSpline() {
		return (CubicSplineType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CubicSpline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCubicSpline(CubicSplineType newCubicSpline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CubicSpline(), newCubicSpline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubicSpline(CubicSplineType newCubicSpline) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CubicSpline(), newCubicSpline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveType getCurve1() {
		return (CurveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Curve1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurve1(CurveType newCurve1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Curve1(), newCurve1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve1(CurveType newCurve1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Curve1(), newCurve1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveArrayPropertyType getCurveArrayProperty() {
		return (CurveArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveArrayProperty(CurveArrayPropertyType newCurveArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty(), newCurveArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveArrayProperty(CurveArrayPropertyType newCurveArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CurveArrayProperty(), newCurveArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurvePropertyType getCurveMember() {
		return (CurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CurveMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveMember(CurvePropertyType newCurveMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CurveMember(), newCurveMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveMember(CurvePropertyType newCurveMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CurveMember(), newCurveMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveArrayPropertyType getCurveMembers() {
		return (CurveArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveMembers(CurveArrayPropertyType newCurveMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers(), newCurveMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveMembers(CurveArrayPropertyType newCurveMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CurveMembers(), newCurveMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurvePropertyType getCurveProperty() {
		return (CurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveProperty(CurvePropertyType newCurveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty(), newCurveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveProperty(CurvePropertyType newCurveProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CurveProperty(), newCurveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylinderType getCylinder() {
		return (CylinderType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Cylinder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylinder(CylinderType newCylinder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Cylinder(), newCylinder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCylinder(CylinderType newCylinder) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Cylinder(), newCylinder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylindricalCSType getCylindricalCS() {
		return (CylindricalCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCS(CylindricalCSType newCylindricalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(), newCylindricalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCylindricalCS(CylindricalCSType newCylindricalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCS(), newCylindricalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylindricalCSRefType getCylindricalCSRef() {
		return (CylindricalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylindricalCSRef(CylindricalCSRefType newCylindricalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCSRef(), newCylindricalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCylindricalCSRef(CylindricalCSRefType newCylindricalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_CylindricalCSRef(), newCylindricalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBlockType getDataBlock() {
		return (DataBlockType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DataBlock(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataBlock(DataBlockType newDataBlock, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DataBlock(), newDataBlock, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBlock(DataBlockType newDataBlock) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DataBlock(), newDataBlock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getDataSource() {
		return (StringOrRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DataSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(StringOrRefType newDataSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DataSource(), newDataSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(StringOrRefType newDataSource) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DataSource(), newDataSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getDatumID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DatumID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumID(IdentifierType newDatumID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DatumID(), newDatumID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatumID(IdentifierType newDatumID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DatumID(), newDatumID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getDatumName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumName(CodeType newDatumName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(), newDatumName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatumName(CodeType newDatumName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DatumName(), newDatumName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatumRefType getDatumRef() {
		return (DatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumRef(DatumRefType newDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DatumRef(), newDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatumRef(DatumRefType newDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DatumRef(), newDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getDecimalMinutes() {
		return (BigDecimal)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DecimalMinutes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalMinutes(BigDecimal newDecimalMinutes) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DecimalMinutes(), newDecimalMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultStylePropertyType getDefaultStyle() {
		return (DefaultStylePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DefaultStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultStyle(DefaultStylePropertyType newDefaultStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DefaultStyle(), newDefaultStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultStyle(DefaultStylePropertyType newDefaultStyle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DefaultStyle(), newDefaultStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralConversionRefType getDefinedByConversion() {
		return (GeneralConversionRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedByConversion(GeneralConversionRefType newDefinedByConversion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion(), newDefinedByConversion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedByConversion(GeneralConversionRefType newDefinedByConversion) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DefinedByConversion(), newDefinedByConversion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType getDefinitionCollection() {
		return (DictionaryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionCollection(DictionaryType newDefinitionCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection(), newDefinitionCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionCollection(DictionaryType newDefinitionCollection) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionCollection(), newDefinitionCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryEntryType getDefinitionMember() {
		return (DictionaryEntryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionMember(DictionaryEntryType newDefinitionMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember(), newDefinitionMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionMember(DictionaryEntryType newDefinitionMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionMember(), newDefinitionMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryEntryType getDictionaryEntry() {
		return (DictionaryEntryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionaryEntry(DictionaryEntryType newDictionaryEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry(), newDictionaryEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryEntry(DictionaryEntryType newDictionaryEntry) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DictionaryEntry(), newDictionaryEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionProxyType getDefinitionProxy() {
		return (DefinitionProxyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionProxy(DefinitionProxyType newDefinitionProxy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy(), newDefinitionProxy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionProxy(DefinitionProxyType newDefinitionProxy) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionProxy(), newDefinitionProxy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getDefinitionRef() {
		return (ReferenceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionRef(ReferenceType newDefinitionRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionRef(), newDefinitionRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionRef(ReferenceType newDefinitionRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DefinitionRef(), newDefinitionRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreesType getDegrees() {
		return (DegreesType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Degrees(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDegrees(DegreesType newDegrees, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Degrees(), newDegrees, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegrees(DegreesType newDegrees) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Degrees(), newDegrees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationUnitTermType getDerivationUnitTerm() {
		return (DerivationUnitTermType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationUnitTerm(DerivationUnitTermType newDerivationUnitTerm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm(), newDerivationUnitTerm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationUnitTerm(DerivationUnitTermType newDerivationUnitTerm) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DerivationUnitTerm(), newDerivationUnitTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedCRSType getDerivedCRS() {
		return (DerivedCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedCRS(DerivedCRSType newDerivedCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS(), newDerivedCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedCRS(DerivedCRSType newDerivedCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRS(), newDerivedCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedCRSRefType getDerivedCRSRef() {
		return (DerivedCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedCRSRef(DerivedCRSRefType newDerivedCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSRef(), newDerivedCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedCRSRef(DerivedCRSRefType newDerivedCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSRef(), newDerivedCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedCRSTypeType getDerivedCRSType() {
		return (DerivedCRSTypeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedCRSType(DerivedCRSTypeType newDerivedCRSType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType(), newDerivedCRSType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedCRSType(DerivedCRSTypeType newDerivedCRSType) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DerivedCRSType(), newDerivedCRSType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedUnitType getDerivedUnit() {
		return (DerivedUnitType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedUnit(DerivedUnitType newDerivedUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit(), newDerivedUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedUnit(DerivedUnitType newDerivedUnit) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DerivedUnit(), newDerivedUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getDescription() {
		return (StringOrRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringOrRefType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Description(), newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(StringOrRefType newDescription) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryType getDictionary() {
		return (DictionaryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionary(DictionaryType newDictionary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary(), newDictionary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionary(DictionaryType newDictionary) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Dictionary(), newDictionary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedEdgePropertyType getDirectedEdge() {
		return (DirectedEdgePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DirectedEdge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedEdge(DirectedEdgePropertyType newDirectedEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DirectedEdge(), newDirectedEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedEdge(DirectedEdgePropertyType newDirectedEdge) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DirectedEdge(), newDirectedEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedFacePropertyType getDirectedFace() {
		return (DirectedFacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DirectedFace(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedFace(DirectedFacePropertyType newDirectedFace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DirectedFace(), newDirectedFace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedFace(DirectedFacePropertyType newDirectedFace) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DirectedFace(), newDirectedFace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedNodePropertyType getDirectedNode() {
		return (DirectedNodePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DirectedNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedNode(DirectedNodePropertyType newDirectedNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DirectedNode(), newDirectedNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedNode(DirectedNodePropertyType newDirectedNode) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DirectedNode(), newDirectedNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedObservationType getDirectedObservation() {
		return (DirectedObservationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedObservation(DirectedObservationType newDirectedObservation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(), newDirectedObservation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedObservation(DirectedObservationType newDirectedObservation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservation(), newDirectedObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationType getObservation() {
		return (ObservationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Observation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(ObservationType newObservation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Observation(), newObservation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(ObservationType newObservation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Observation(), newObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedObservationAtDistanceType getDirectedObservationAtDistance() {
		return (DirectedObservationAtDistanceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedObservationAtDistance(DirectedObservationAtDistanceType newDirectedObservationAtDistance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance(), newDirectedObservationAtDistance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedObservationAtDistance(DirectedObservationAtDistanceType newDirectedObservationAtDistance) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DirectedObservationAtDistance(), newDirectedObservationAtDistance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedTopoSolidPropertyType getDirectedTopoSolid() {
		return (DirectedTopoSolidPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DirectedTopoSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedTopoSolid(DirectedTopoSolidPropertyType newDirectedTopoSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DirectedTopoSolid(), newDirectedTopoSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectedTopoSolid(DirectedTopoSolidPropertyType newDirectedTopoSolid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DirectedTopoSolid(), newDirectedTopoSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionPropertyType getDirection() {
		return (DirectionPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Direction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(DirectionPropertyType newDirection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Direction(), newDirection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionPropertyType newDirection) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Direction(), newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionVectorType getDirectionVector() {
		return (DirectionVectorType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DirectionVector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionVector(DirectionVectorType newDirectionVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DirectionVector(), newDirectionVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionVector(DirectionVectorType newDirectionVector) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DirectionVector(), newDirectionVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMSAngleType getDmsAngle() {
		return (DMSAngleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDmsAngle(DMSAngleType newDmsAngle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle(), newDmsAngle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmsAngle(DMSAngleType newDmsAngle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngle(), newDmsAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMSAngleType getDmsAngleValue() {
		return (DMSAngleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDmsAngleValue(DMSAngleType newDmsAngleValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue(), newDmsAngleValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmsAngleValue(DMSAngleType newDmsAngleValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DmsAngleValue(), newDmsAngleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSetType getDomainSet() {
		return (DomainSetType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainSet(DomainSetType newDomainSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(), newDomainSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainSet(DomainSetType newDomainSet) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DomainSet(), newDomainSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Object> getDoubleOrNullTupleList() {
		return (List<Object>)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_DoubleOrNullTupleList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleOrNullTupleList(List<Object> newDoubleOrNullTupleList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_DoubleOrNullTupleList(), newDoubleOrNullTupleList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return (Duration)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Duration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Duration(), newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeType getEdge() {
		return (EdgeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Edge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdge(EdgeType newEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Edge(), newEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge(EdgeType newEdge) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Edge(), newEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurvePropertyType getEdgeOf() {
		return (CurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeOf(CurvePropertyType newEdgeOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf(), newEdgeOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeOf(CurvePropertyType newEdgeOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EdgeOf(), newEdgeOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsoidType getEllipsoid() {
		return (EllipsoidType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoid(EllipsoidType newEllipsoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid(), newEllipsoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipsoid(EllipsoidType newEllipsoid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Ellipsoid(), newEllipsoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsoidalCSType getEllipsoidalCS() {
		return (EllipsoidalCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCS(EllipsoidalCSType newEllipsoidalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(), newEllipsoidalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipsoidalCS(EllipsoidalCSType newEllipsoidalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCS(), newEllipsoidalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsoidalCSRefType getEllipsoidalCSRef() {
		return (EllipsoidalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidalCSRef(EllipsoidalCSRefType newEllipsoidalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef(), newEllipsoidalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipsoidalCSRef(EllipsoidalCSRefType newEllipsoidalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidalCSRef(), newEllipsoidalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getEllipsoidID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidID(IdentifierType newEllipsoidID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID(), newEllipsoidID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipsoidID(IdentifierType newEllipsoidID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidID(), newEllipsoidID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getEllipsoidName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidName(CodeType newEllipsoidName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(), newEllipsoidName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipsoidName(CodeType newEllipsoidName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidName(), newEllipsoidName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsoidRefType getEllipsoidRef() {
		return (EllipsoidRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipsoidRef(EllipsoidRefType newEllipsoidRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef(), newEllipsoidRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEllipsoidRef(EllipsoidRefType newEllipsoidRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EllipsoidRef(), newEllipsoidRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringCRSType getEngineeringCRS() {
		return (EngineeringCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringCRS(EngineeringCRSType newEngineeringCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS(), newEngineeringCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringCRS(EngineeringCRSType newEngineeringCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRS(), newEngineeringCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringCRSRefType getEngineeringCRSRef() {
		return (EngineeringCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringCRSRef(EngineeringCRSRefType newEngineeringCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRSRef(), newEngineeringCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringCRSRef(EngineeringCRSRefType newEngineeringCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringCRSRef(), newEngineeringCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDatumType getEngineeringDatum() {
		return (EngineeringDatumType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatum(EngineeringDatumType newEngineeringDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum(), newEngineeringDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringDatum(EngineeringDatumType newEngineeringDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatum(), newEngineeringDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDatumRefType getEngineeringDatumRef() {
		return (EngineeringDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngineeringDatumRef(EngineeringDatumRefType newEngineeringDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef(), newEngineeringDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineeringDatumRef(EngineeringDatumRefType newEngineeringDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EngineeringDatumRef(), newEngineeringDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvelopeType getEnvelope() {
		return (EnvelopeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Envelope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelope(EnvelopeType newEnvelope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Envelope(), newEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvelope(EnvelopeType newEnvelope) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Envelope(), newEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvelopeWithTimePeriodType getEnvelopeWithTimePeriod() {
		return (EnvelopeWithTimePeriodType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType newEnvelopeWithTimePeriod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod(), newEnvelopeWithTimePeriod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType newEnvelopeWithTimePeriod) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_EnvelopeWithTimePeriod(), newEnvelopeWithTimePeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePropertyType getExtentOf() {
		return (SurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtentOf(SurfacePropertyType newExtentOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf(), newExtentOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtentOf(SurfacePropertyType newExtentOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ExtentOf(), newExtentOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingPropertyType getExterior() {
		return (AbstractRingPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Exterior(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExterior(AbstractRingPropertyType newExterior, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Exterior(), newExterior, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExterior(AbstractRingPropertyType newExterior) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Exterior(), newExterior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaceType getFace() {
		return (FaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Face(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFace(FaceType newFace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Face(), newFace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFace(FaceType newFace) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Face(), newFace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCollectionType getFeatureCollection1() {
		return (FeatureCollectionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCollection1(FeatureCollectionType newFeatureCollection1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(), newFeatureCollection1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureCollection1(FeatureCollectionType newFeatureCollection1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_FeatureCollection1(), newFeatureCollection1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureArrayPropertyType getFeatureMembers() {
		return (FeatureArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureMembers(FeatureArrayPropertyType newFeatureMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMembers(), newFeatureMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureMembers(FeatureArrayPropertyType newFeatureMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_FeatureMembers(), newFeatureMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePropertyType getFeatureProperty() {
		return (FeaturePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureProperty(FeaturePropertyType newFeatureProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty(), newFeatureProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureProperty(FeaturePropertyType newFeatureProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_FeatureProperty(), newFeatureProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureStylePropertyType getFeatureStyle() {
		return (FeatureStylePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureStyle(FeatureStylePropertyType newFeatureStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle(), newFeatureStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureStyle(FeatureStylePropertyType newFeatureStyle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle(), newFeatureStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureStyleType getFeatureStyle1() {
		return (FeatureStyleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureStyle1(FeatureStyleType newFeatureStyle1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle1(), newFeatureStyle1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureStyle1(FeatureStyleType newFeatureStyle1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_FeatureStyle1(), newFeatureStyle1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getFile() {
		return (FileType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_File(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_File(), newFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(FileType newFile) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_File(), newFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralConversionRefType getGeneralConversionRef() {
		return (GeneralConversionRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralConversionRef(GeneralConversionRefType newGeneralConversionRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef(), newGeneralConversionRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralConversionRef(GeneralConversionRefType newGeneralConversionRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeneralConversionRef(), newGeneralConversionRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralTransformationRefType getGeneralTransformationRef() {
		return (GeneralTransformationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralTransformationRef(GeneralTransformationRefType newGeneralTransformationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformationRef(), newGeneralTransformationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralTransformationRef(GeneralTransformationRefType newGeneralTransformationRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeneralTransformationRef(), newGeneralTransformationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMetaDataType getGenericMetaData() {
		return (GenericMetaDataType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GenericMetaData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericMetaData(GenericMetaDataType newGenericMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GenericMetaData(), newGenericMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericMetaData(GenericMetaDataType newGenericMetaData) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GenericMetaData(), newGenericMetaData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeocentricCRSType getGeocentricCRS() {
		return (GeocentricCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeocentricCRS(GeocentricCRSType newGeocentricCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS(), newGeocentricCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeocentricCRS(GeocentricCRSType newGeocentricCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRS(), newGeocentricCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeocentricCRSRefType getGeocentricCRSRef() {
		return (GeocentricCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeocentricCRSRef(GeocentricCRSRefType newGeocentricCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRSRef(), newGeocentricCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeocentricCRSRef(GeocentricCRSRefType newGeocentricCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeocentricCRSRef(), newGeocentricCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodesicType getGeodesic() {
		return (GeodesicType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Geodesic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodesic(GeodesicType newGeodesic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Geodesic(), newGeodesic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeodesic(GeodesicType newGeodesic) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Geodesic(), newGeodesic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodesicStringType getGeodesicString() {
		return (GeodesicStringType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodesicString(GeodesicStringType newGeodesicString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(), newGeodesicString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeodesicString(GeodesicStringType newGeodesicString) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeodesicString(), newGeodesicString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodeticDatumType getGeodeticDatum() {
		return (GeodeticDatumType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatum(GeodeticDatumType newGeodeticDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum(), newGeodeticDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeodeticDatum(GeodeticDatumType newGeodeticDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatum(), newGeodeticDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodeticDatumRefType getGeodeticDatumRef() {
		return (GeodeticDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeodeticDatumRef(GeodeticDatumRefType newGeodeticDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef(), newGeodeticDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeodeticDatumRef(GeodeticDatumRefType newGeodeticDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeodeticDatumRef(), newGeodeticDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCRSType getGeographicCRS() {
		return (GeographicCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicCRS(GeographicCRSType newGeographicCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS(), newGeographicCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicCRS(GeographicCRSType newGeographicCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRS(), newGeographicCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCRSRefType getGeographicCRSRef() {
		return (GeographicCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicCRSRef(GeographicCRSRefType newGeographicCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRSRef(), newGeographicCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicCRSRef(GeographicCRSRefType newGeographicCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeographicCRSRef(), newGeographicCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometricComplexType getGeometricComplex() {
		return (GeometricComplexType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricComplex(GeometricComplexType newGeometricComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex(), newGeometricComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometricComplex(GeometricComplexType newGeometricComplex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeometricComplex(), newGeometricComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getGeometryMember() {
		return (GeometryPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryMember(GeometryPropertyType newGeometryMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMember(), newGeometryMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryMember(GeometryPropertyType newGeometryMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMember(), newGeometryMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryArrayPropertyType getGeometryMembers() {
		return (GeometryArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryMembers(GeometryArrayPropertyType newGeometryMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMembers(), newGeometryMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryMembers(GeometryArrayPropertyType newGeometryMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeometryMembers(), newGeometryMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryStylePropertyType getGeometryStyle() {
		return (GeometryStylePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryStyle(GeometryStylePropertyType newGeometryStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle(), newGeometryStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryStyle(GeometryStylePropertyType newGeometryStyle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle(), newGeometryStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryStyleType getGeometryStyle1() {
		return (GeometryStyleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryStyle1(GeometryStyleType newGeometryStyle1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle1(), newGeometryStyle1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryStyle1(GeometryStyleType newGeometryStyle1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GeometryStyle1(), newGeometryStyle1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphStylePropertyType getGraphStyle() {
		return (GraphStylePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphStyle(GraphStylePropertyType newGraphStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle(), newGraphStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphStyle(GraphStylePropertyType newGraphStyle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle(), newGraphStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphStyleType getGraphStyle1() {
		return (GraphStyleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphStyle1(GraphStyleType newGraphStyle1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle1(), newGraphStyle1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphStyle1(GraphStyleType newGraphStyle1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GraphStyle1(), newGraphStyle1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleChoiceType getGreenwichLongitude() {
		return (AngleChoiceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GreenwichLongitude(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGreenwichLongitude(AngleChoiceType newGreenwichLongitude, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GreenwichLongitude(), newGreenwichLongitude, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreenwichLongitude(AngleChoiceType newGreenwichLongitude) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GreenwichLongitude(), newGreenwichLongitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridType getGrid() {
		return (GridType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Grid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(GridType newGrid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Grid(), newGrid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(GridType newGrid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Grid(), newGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridCoverageType getGridCoverage() {
		return (GridCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GridCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridCoverage(GridCoverageType newGridCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GridCoverage(), newGridCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridCoverage(GridCoverageType newGridCoverage) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GridCoverage(), newGridCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridDomainType getGridDomain() {
		return (GridDomainType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GridDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridDomain(GridDomainType newGridDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GridDomain(), newGridDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridDomain(GridDomainType newGridDomain) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GridDomain(), newGridDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridFunctionType getGridFunction() {
		return (GridFunctionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridFunction(GridFunctionType newGridFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction(), newGridFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridFunction(GridFunctionType newGridFunction) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GridFunction(), newGridFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getGroupID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GroupID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupID(IdentifierType newGroupID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GroupID(), newGroupID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupID(IdentifierType newGroupID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GroupID(), newGroupID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getGroupName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupName(CodeType newGroupName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(), newGroupName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(CodeType newGroupName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_GroupName(), newGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryPropertyType getHistory() {
		return (HistoryPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_History(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistory(HistoryPropertyType newHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_History(), newHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(HistoryPropertyType newHistory) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_History(), newHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCRSType getImageCRS() {
		return (ImageCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCRS(ImageCRSType newImageCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS(), newImageCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCRS(ImageCRSType newImageCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRS(), newImageCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageCRSRefType getImageCRSRef() {
		return (ImageCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCRSRef(ImageCRSRefType newImageCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRSRef(), newImageCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCRSRef(ImageCRSRefType newImageCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ImageCRSRef(), newImageCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageDatumType getImageDatum() {
		return (ImageDatumType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatum(ImageDatumType newImageDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum(), newImageDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageDatum(ImageDatumType newImageDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatum(), newImageDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageDatumRefType getImageDatumRef() {
		return (ImageDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDatumRef(ImageDatumRefType newImageDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef(), newImageDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageDatumRef(ImageDatumRefType newImageDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ImageDatumRef(), newImageDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateReferenceSystemRefType getIncludesCRS() {
		return (CoordinateReferenceSystemRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesCRS(CoordinateReferenceSystemRefType newIncludesCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS(), newIncludesCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludesCRS(CoordinateReferenceSystemRefType newIncludesCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IncludesCRS(), newIncludesCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CovarianceElementType getIncludesElement() {
		return (CovarianceElementType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IncludesElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesElement(CovarianceElementType newIncludesElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_IncludesElement(), newIncludesElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludesElement(CovarianceElementType newIncludesElement) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IncludesElement(), newIncludesElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralOperationParameterRefType getIncludesParameter() {
		return (AbstractGeneralOperationParameterRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesParameter(AbstractGeneralOperationParameterRefType newIncludesParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter(), newIncludesParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludesParameter(AbstractGeneralOperationParameterRefType newIncludesParameter) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IncludesParameter(), newIncludesParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralParameterValueType getIncludesValue() {
		return (AbstractGeneralParameterValueType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesValue(AbstractGeneralParameterValueType newIncludesValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue(), newIncludesValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludesValue(AbstractGeneralParameterValueType newIncludesValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IncludesValue(), newIncludesValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexMapType getIndexMap() {
		return (IndexMapType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IndexMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexMap(IndexMapType newIndexMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_IndexMap(), newIndexMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexMap(IndexMapType newIndexMap) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IndexMap(), newIndexMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndirectEntryType getIndirectEntry() {
		return (IndirectEntryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IndirectEntry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndirectEntry(IndirectEntryType newIndirectEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_IndirectEntry(), newIndirectEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndirectEntry(IndirectEntryType newIndirectEntry) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IndirectEntry(), newIndirectEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingPropertyType getInnerBoundaryIs() {
		return (AbstractRingPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBoundaryIs(AbstractRingPropertyType newInnerBoundaryIs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(), newInnerBoundaryIs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerBoundaryIs(AbstractRingPropertyType newInnerBoundaryIs) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_InnerBoundaryIs(), newInnerBoundaryIs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingPropertyType getInterior() {
		return (AbstractRingPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Interior(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterior(AbstractRingPropertyType newInterior, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Interior(), newInterior, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterior(AbstractRingPropertyType newInterior) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Interior(), newInterior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIntegerValue() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IntegerValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerValue(BigInteger newIntegerValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IntegerValue(), newIntegerValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<BigInteger> getIntegerValueList() {
		return (List<BigInteger>)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IntegerValueList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerValueList(List<BigInteger> newIntegerValueList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IntegerValueList(), newIntegerValueList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getInverseFlattening() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInverseFlattening(MeasureType newInverseFlattening, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(), newInverseFlattening, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseFlattening(MeasureType newInverseFlattening) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_InverseFlattening(), newInverseFlattening);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolatedPropertyType getIsolated() {
		return (IsolatedPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Isolated(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsolated(IsolatedPropertyType newIsolated, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Isolated(), newIsolated, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolated(IsolatedPropertyType newIsolated) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Isolated(), newIsolated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsSphereType getIsSphere() {
		return (IsSphereType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_IsSphere(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSphere(IsSphereType newIsSphere) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_IsSphere(), newIsSphere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStylePropertyType getLabelStyle() {
		return (LabelStylePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelStyle(LabelStylePropertyType newLabelStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle(), newLabelStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelStyle(LabelStylePropertyType newLabelStyle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle(), newLabelStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStyleType getLabelStyle1() {
		return (LabelStyleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelStyle1(LabelStyleType newLabelStyle1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle1(), newLabelStyle1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelStyle1(LabelStyleType newLabelStyle1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LabelStyle1(), newLabelStyle1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearCSType getLinearCS() {
		return (LinearCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCS(LinearCSType newLinearCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(), newLinearCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearCS(LinearCSType newLinearCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LinearCS(), newLinearCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearCSRefType getLinearCSRef() {
		return (LinearCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LinearCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCSRef(LinearCSRefType newLinearCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LinearCSRef(), newLinearCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearCSRef(LinearCSRefType newLinearCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LinearCSRef(), newLinearCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRingType getLinearRing() {
		return (LinearRingType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearRing(LinearRingType newLinearRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing(), newLinearRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearRing(LinearRingType newLinearRing) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LinearRing(), newLinearRing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStringType getLineString() {
		return (LineStringType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LineString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineString(LineStringType newLineString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LineString(), newLineString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineString(LineStringType newLineString) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LineString(), newLineString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStringPropertyType getLineStringMember() {
		return (LineStringPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStringMember(LineStringPropertyType newLineStringMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember(), newLineStringMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStringMember(LineStringPropertyType newLineStringMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LineStringMember(), newLineStringMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStringPropertyType getLineStringProperty() {
		return (LineStringPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStringProperty(LineStringPropertyType newLineStringProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty(), newLineStringProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStringProperty(LineStringPropertyType newLineStringProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LineStringProperty(), newLineStringProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStringSegmentType getLineStringSegment() {
		return (LineStringSegmentType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LineStringSegment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStringSegment(LineStringSegmentType newLineStringSegment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LineStringSegment(), newLineStringSegment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStringSegment(LineStringSegmentType newLineStringSegment) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LineStringSegment(), newLineStringSegment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPropertyType getLocation() {
		return (LocationPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationPropertyType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Location(), newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationPropertyType newLocation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getLocationKeyWord() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationKeyWord(CodeType newLocationKeyWord, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(), newLocationKeyWord, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationKeyWord(CodeType newLocationKeyWord) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LocationKeyWord(), newLocationKeyWord);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getLocationString() {
		return (StringOrRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_LocationString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationString(StringOrRefType newLocationString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_LocationString(), newLocationString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationString(StringOrRefType newLocationString) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_LocationString(), newLocationString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getMappingRule() {
		return (StringOrRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MappingRule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingRule(StringOrRefType newMappingRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MappingRule(), newMappingRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingRule(StringOrRefType newMappingRule) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MappingRule(), newMappingRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoComplexMemberType getMaximalComplex() {
		return (TopoComplexMemberType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaximalComplex(TopoComplexMemberType newMaximalComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex(), newMaximalComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximalComplex(TopoComplexMemberType newMaximalComplex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MaximalComplex(), newMaximalComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumOccurs() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MaximumOccurs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumOccurs(BigInteger newMaximumOccurs) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MaximumOccurs(), newMaximumOccurs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getMeasure() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Measure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(MeasureType newMeasure) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getMeasureDescription() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureDescription(CodeType newMeasureDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(), newMeasureDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureDescription(CodeType newMeasureDescription) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MeasureDescription(), newMeasureDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType getMember() {
		return (AssociationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Member(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(AssociationType newMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Member(), newMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(AssociationType newMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Member(), newMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAssociationType getMembers() {
		return (ArrayAssociationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Members(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembers(ArrayAssociationType newMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Members(), newMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembers(ArrayAssociationType newMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Members(), newMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getMeridianID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MeridianID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeridianID(IdentifierType newMeridianID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MeridianID(), newMeridianID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeridianID(IdentifierType newMeridianID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MeridianID(), newMeridianID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getMeridianName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeridianName(CodeType newMeridianName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(), newMeridianName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeridianName(CodeType newMeridianName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MeridianName(), newMeridianName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaDataPropertyType getMetaDataProperty() {
		return (MetaDataPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MetaDataProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaDataProperty(MetaDataPropertyType newMetaDataProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MetaDataProperty(), newMetaDataProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaDataProperty(MetaDataPropertyType newMetaDataProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MetaDataProperty(), newMetaDataProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getMethodFormula() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodFormula(CodeType newMethodFormula, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(), newMethodFormula, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodFormula(CodeType newMethodFormula) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MethodFormula(), newMethodFormula);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getMethodID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MethodID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodID(IdentifierType newMethodID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MethodID(), newMethodID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodID(IdentifierType newMethodID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MethodID(), newMethodID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getMethodName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodName(CodeType newMethodName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(), newMethodName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(CodeType newMethodName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MethodName(), newMethodName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimumOccurs() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MinimumOccurs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumOccurs(BigInteger newMinimumOccurs) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MinimumOccurs(), newMinimumOccurs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinutes() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Minutes(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes(BigInteger newMinutes) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Minutes(), newMinutes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getModifiedCoordinate() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ModifiedCoordinate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedCoordinate(BigInteger newModifiedCoordinate) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ModifiedCoordinate(), newModifiedCoordinate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovingObjectStatusType getMovingObjectStatus() {
		return (MovingObjectStatusType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MovingObjectStatus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovingObjectStatus(MovingObjectStatusType newMovingObjectStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MovingObjectStatus(), newMovingObjectStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovingObjectStatus(MovingObjectStatusType newMovingObjectStatus) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MovingObjectStatus(), newMovingObjectStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getMultiCenterLineOf() {
		return (MultiCurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCenterLineOf(MultiCurvePropertyType newMultiCenterLineOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf(), newMultiCenterLineOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCenterLineOf(MultiCurvePropertyType newMultiCenterLineOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterLineOf(), newMultiCenterLineOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointPropertyType getMultiCenterOf() {
		return (MultiPointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCenterOf(MultiPointPropertyType newMultiCenterOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf(), newMultiCenterOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCenterOf(MultiPointPropertyType newMultiCenterOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiCenterOf(), newMultiCenterOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getMultiCoverage() {
		return (MultiSurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCoverage(MultiSurfacePropertyType newMultiCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage(), newMultiCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCoverage(MultiSurfacePropertyType newMultiCoverage) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiCoverage(), newMultiCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurveType getMultiCurve() {
		return (MultiCurveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurve(MultiCurveType newMultiCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(), newMultiCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCurve(MultiCurveType newMultiCurve) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurve(), newMultiCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurveCoverageType getMultiCurveCoverage() {
		return (MultiCurveCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurveCoverage(MultiCurveCoverageType newMultiCurveCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveCoverage(), newMultiCurveCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCurveCoverage(MultiCurveCoverageType newMultiCurveCoverage) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveCoverage(), newMultiCurveCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurveDomainType getMultiCurveDomain() {
		return (MultiCurveDomainType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurveDomain(MultiCurveDomainType newMultiCurveDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain(), newMultiCurveDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCurveDomain(MultiCurveDomainType newMultiCurveDomain) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveDomain(), newMultiCurveDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getMultiCurveProperty() {
		return (MultiCurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurveProperty(MultiCurvePropertyType newMultiCurveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty(), newMultiCurveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCurveProperty(MultiCurvePropertyType newMultiCurveProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiCurveProperty(), newMultiCurveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getMultiEdgeOf() {
		return (MultiCurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiEdgeOf(MultiCurvePropertyType newMultiEdgeOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf(), newMultiEdgeOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiEdgeOf(MultiCurvePropertyType newMultiEdgeOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiEdgeOf(), newMultiEdgeOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getMultiExtentOf() {
		return (MultiSurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiExtentOf(MultiSurfacePropertyType newMultiExtentOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf(), newMultiExtentOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiExtentOf(MultiSurfacePropertyType newMultiExtentOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiExtentOf(), newMultiExtentOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiGeometryType getMultiGeometry() {
		return (MultiGeometryType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiGeometry(MultiGeometryType newMultiGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(), newMultiGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiGeometry(MultiGeometryType newMultiGeometry) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometry(), newMultiGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiGeometryPropertyType getMultiGeometryProperty() {
		return (MultiGeometryPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometryProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiGeometryProperty(MultiGeometryPropertyType newMultiGeometryProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometryProperty(), newMultiGeometryProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiGeometryProperty(MultiGeometryPropertyType newMultiGeometryProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiGeometryProperty(), newMultiGeometryProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLineStringType getMultiLineString() {
		return (MultiLineStringType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiLineString(MultiLineStringType newMultiLineString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(), newMultiLineString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLineString(MultiLineStringType newMultiLineString) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiLineString(), newMultiLineString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointPropertyType getMultiLocation() {
		return (MultiPointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiLocation(MultiPointPropertyType newMultiLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation(), newMultiLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLocation(MultiPointPropertyType newMultiLocation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiLocation(), newMultiLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointType getMultiPoint() {
		return (MultiPointType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPoint(MultiPointType newMultiPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(), newMultiPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPoint(MultiPointType newMultiPoint) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiPoint(), newMultiPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointCoverageType getMultiPointCoverage() {
		return (MultiPointCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPointCoverage(MultiPointCoverageType newMultiPointCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointCoverage(), newMultiPointCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPointCoverage(MultiPointCoverageType newMultiPointCoverage) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointCoverage(), newMultiPointCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointDomainType getMultiPointDomain() {
		return (MultiPointDomainType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPointDomain(MultiPointDomainType newMultiPointDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain(), newMultiPointDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPointDomain(MultiPointDomainType newMultiPointDomain) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointDomain(), newMultiPointDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointPropertyType getMultiPointProperty() {
		return (MultiPointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPointProperty(MultiPointPropertyType newMultiPointProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty(), newMultiPointProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPointProperty(MultiPointPropertyType newMultiPointProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiPointProperty(), newMultiPointProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPolygonType getMultiPolygon() {
		return (MultiPolygonType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPolygon(MultiPolygonType newMultiPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(), newMultiPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPolygon(MultiPolygonType newMultiPolygon) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiPolygon(), newMultiPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointPropertyType getMultiPosition() {
		return (MultiPointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPosition(MultiPointPropertyType newMultiPosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition(), newMultiPosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPosition(MultiPointPropertyType newMultiPosition) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiPosition(), newMultiPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidType getMultiSolid() {
		return (MultiSolidType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolid(MultiSolidType newMultiSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(), newMultiSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSolid(MultiSolidType newMultiSolid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolid(), newMultiSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidCoverageType getMultiSolidCoverage() {
		return (MultiSolidCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolidCoverage(MultiSolidCoverageType newMultiSolidCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidCoverage(), newMultiSolidCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSolidCoverage(MultiSolidCoverageType newMultiSolidCoverage) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidCoverage(), newMultiSolidCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidDomainType getMultiSolidDomain() {
		return (MultiSolidDomainType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolidDomain(MultiSolidDomainType newMultiSolidDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain(), newMultiSolidDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSolidDomain(MultiSolidDomainType newMultiSolidDomain) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidDomain(), newMultiSolidDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidPropertyType getMultiSolidProperty() {
		return (MultiSolidPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolidProperty(MultiSolidPropertyType newMultiSolidProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidProperty(), newMultiSolidProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSolidProperty(MultiSolidPropertyType newMultiSolidProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSolidProperty(), newMultiSolidProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfaceType getMultiSurface() {
		return (MultiSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurface(MultiSurfaceType newMultiSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(), newMultiSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSurface(MultiSurfaceType newMultiSurface) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurface(), newMultiSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfaceCoverageType getMultiSurfaceCoverage() {
		return (MultiSurfaceCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurfaceCoverage(MultiSurfaceCoverageType newMultiSurfaceCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceCoverage(), newMultiSurfaceCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSurfaceCoverage(MultiSurfaceCoverageType newMultiSurfaceCoverage) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceCoverage(), newMultiSurfaceCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfaceDomainType getMultiSurfaceDomain() {
		return (MultiSurfaceDomainType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurfaceDomain(MultiSurfaceDomainType newMultiSurfaceDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain(), newMultiSurfaceDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSurfaceDomain(MultiSurfaceDomainType newMultiSurfaceDomain) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceDomain(), newMultiSurfaceDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getMultiSurfaceProperty() {
		return (MultiSurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSurfaceProperty(MultiSurfacePropertyType newMultiSurfaceProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty(), newMultiSurfaceProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSurfaceProperty(MultiSurfacePropertyType newMultiSurfaceProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_MultiSurfaceProperty(), newMultiSurfaceProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType getNode() {
		return (NodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Node(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(NodeType newNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Node(), newNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(NodeType newNode) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Node(), newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNull() {
		return getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Null(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNull(Object newNull) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Null(), newNull);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObliqueCartesianCSType getObliqueCartesianCS() {
		return (ObliqueCartesianCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObliqueCartesianCS(ObliqueCartesianCSType newObliqueCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(), newObliqueCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObliqueCartesianCS(ObliqueCartesianCSType newObliqueCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCS(), newObliqueCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObliqueCartesianCSRefType getObliqueCartesianCSRef() {
		return (ObliqueCartesianCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObliqueCartesianCSRef(ObliqueCartesianCSRefType newObliqueCartesianCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef(), newObliqueCartesianCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObliqueCartesianCSRef(ObliqueCartesianCSRefType newObliqueCartesianCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ObliqueCartesianCSRef(), newObliqueCartesianCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetCurveType getOffsetCurve() {
		return (OffsetCurveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OffsetCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetCurve(OffsetCurveType newOffsetCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OffsetCurve(), newOffsetCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetCurve(OffsetCurveType newOffsetCurve) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OffsetCurve(), newOffsetCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationMethodType getOperationMethod() {
		return (OperationMethodType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationMethod(OperationMethodType newOperationMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod(), newOperationMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationMethod(OperationMethodType newOperationMethod) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethod(), newOperationMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationMethodRefType getOperationMethodRef() {
		return (OperationMethodRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationMethodRef(OperationMethodRefType newOperationMethodRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef(), newOperationMethodRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationMethodRef(OperationMethodRefType newOperationMethodRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationMethodRef(), newOperationMethodRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterType getOperationParameter() {
		return (OperationParameterType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameter(OperationParameterType newOperationParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter(), newOperationParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationParameter(OperationParameterType newOperationParameter) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameter(), newOperationParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterGroupType getOperationParameterGroup() {
		return (OperationParameterGroupType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameterGroup(OperationParameterGroupType newOperationParameterGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup(), newOperationParameterGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationParameterGroup(OperationParameterGroupType newOperationParameterGroup) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroup(), newOperationParameterGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterRefType getOperationParameterGroupRef() {
		return (OperationParameterRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameterGroupRef(OperationParameterRefType newOperationParameterGroupRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef(), newOperationParameterGroupRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationParameterGroupRef(OperationParameterRefType newOperationParameterGroupRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterGroupRef(), newOperationParameterGroupRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterRefType getOperationParameterRef() {
		return (OperationParameterRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationParameterRef(OperationParameterRefType newOperationParameterRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef(), newOperationParameterRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationParameterRef(OperationParameterRefType newOperationParameterRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationParameterRef(), newOperationParameterRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRefType getOperationRef() {
		return (OperationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationRef(OperationRefType newOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OperationRef(), newOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(OperationRefType newOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationRef(), newOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationVersion() {
		return (String)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OperationVersion(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationVersion(String newOperationVersion) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OperationVersion(), newOperationVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientableCurveType getOrientableCurve() {
		return (OrientableCurveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientableCurve(OrientableCurveType newOrientableCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve(), newOrientableCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientableCurve(OrientableCurveType newOrientableCurve) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OrientableCurve(), newOrientableCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientableSurfaceType getOrientableSurface() {
		return (OrientableSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientableSurface(OrientableSurfaceType newOrientableSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(), newOrientableSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientableSurface(OrientableSurfaceType newOrientableSurface) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OrientableSurface(), newOrientableSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getOrigin() {
		return (XMLGregorianCalendar)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Origin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(XMLGregorianCalendar newOrigin) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Origin(), newOrigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingPropertyType getOuterBoundaryIs() {
		return (AbstractRingPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundaryIs(AbstractRingPropertyType newOuterBoundaryIs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(), newOuterBoundaryIs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundaryIs(AbstractRingPropertyType newOuterBoundaryIs) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_OuterBoundaryIs(), newOuterBoundaryIs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getParameterID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ParameterID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterID(IdentifierType newParameterID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ParameterID(), newParameterID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterID(IdentifierType newParameterID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ParameterID(), newParameterID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getParameterName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterName(CodeType newParameterName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(), newParameterName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterName(CodeType newParameterName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ParameterName(), newParameterName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueType getParameterValue() {
		return (ParameterValueType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValue(ParameterValueType newParameterValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue(), newParameterValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValue(ParameterValueType newParameterValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValue(), newParameterValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueGroupType getParameterValueGroup() {
		return (ParameterValueGroupType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValueGroup(ParameterValueGroupType newParameterValueGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup(), newParameterValueGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValueGroup(ParameterValueGroupType newParameterValueGroup) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ParameterValueGroup(), newParameterValueGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThroughOperationType getPassThroughOperation() {
		return (PassThroughOperationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughOperation(PassThroughOperationType newPassThroughOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation(), newPassThroughOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassThroughOperation(PassThroughOperationType newPassThroughOperation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperation(), newPassThroughOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassThroughOperationRefType getPassThroughOperationRef() {
		return (PassThroughOperationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughOperationRef(PassThroughOperationRefType newPassThroughOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperationRef(), newPassThroughOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassThroughOperationRef(PassThroughOperationRefType newPassThroughOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PassThroughOperationRef(), newPassThroughOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePatchArrayPropertyType getPatches() {
		return (SurfacePatchArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Patches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatches(SurfacePatchArrayPropertyType newPatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Patches(), newPatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatches(SurfacePatchArrayPropertyType newPatches) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Patches(), newPatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PixelInCellType getPixelInCell() {
		return (PixelInCellType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelInCell(PixelInCellType newPixelInCell, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell(), newPixelInCell, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixelInCell(PixelInCellType newPixelInCell) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PixelInCell(), newPixelInCell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointType getPoint() {
		return (PointType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Point(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(PointType newPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Point(), newPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(PointType newPoint) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Point(), newPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointArrayPropertyType getPointArrayProperty() {
		return (PointArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointArrayProperty(PointArrayPropertyType newPointArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty(), newPointArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointArrayProperty(PointArrayPropertyType newPointArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PointArrayProperty(), newPointArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointPropertyType getPointMember() {
		return (PointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PointMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointMember(PointPropertyType newPointMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PointMember(), newPointMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointMember(PointPropertyType newPointMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PointMember(), newPointMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointArrayPropertyType getPointMembers() {
		return (PointArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PointMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointMembers(PointArrayPropertyType newPointMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PointMembers(), newPointMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointMembers(PointArrayPropertyType newPointMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PointMembers(), newPointMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointPropertyType getPointProperty() {
		return (PointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PointProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointProperty(PointPropertyType newPointProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PointProperty(), newPointProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointProperty(PointPropertyType newPointProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PointProperty(), newPointProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointPropertyType getPointRep() {
		return (PointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PointRep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointRep(PointPropertyType newPointRep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PointRep(), newPointRep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointRep(PointPropertyType newPointRep) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PointRep(), newPointRep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarCSType getPolarCS() {
		return (PolarCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCS(PolarCSType newPolarCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(), newPolarCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolarCS(PolarCSType newPolarCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PolarCS(), newPolarCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolarCSRefType getPolarCSRef() {
		return (PolarCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PolarCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolarCSRef(PolarCSRefType newPolarCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PolarCSRef(), newPolarCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolarCSRef(PolarCSRefType newPolarCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PolarCSRef(), newPolarCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType getPolygon() {
		return (PolygonType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(PolygonType newPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygon(PolygonType newPolygon) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPropertyType getPolygonMember() {
		return (PolygonPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonMember(PolygonPropertyType newPolygonMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember(), newPolygonMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonMember(PolygonPropertyType newPolygonMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PolygonMember(), newPolygonMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPatchType getPolygonPatch() {
		return (PolygonPatchType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonPatch(PolygonPatchType newPolygonPatch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatch(), newPolygonPatch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonPatch(PolygonPatchType newPolygonPatch) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatch(), newPolygonPatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPatchArrayPropertyType getPolygonPatches() {
		return (PolygonPatchArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonPatches(PolygonPatchArrayPropertyType newPolygonPatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches(), newPolygonPatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonPatches(PolygonPatchArrayPropertyType newPolygonPatches) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PolygonPatches(), newPolygonPatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPropertyType getPolygonProperty() {
		return (PolygonPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonProperty(PolygonPropertyType newPolygonProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty(), newPolygonProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygonProperty(PolygonPropertyType newPolygonProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PolygonProperty(), newPolygonProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyhedralSurfaceType getPolyhedralSurface() {
		return (PolyhedralSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyhedralSurface(PolyhedralSurfaceType newPolyhedralSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(), newPolyhedralSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyhedralSurface(PolyhedralSurfaceType newPolyhedralSurface) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PolyhedralSurface(), newPolyhedralSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceType getSurface1() {
		return (SurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurface1(SurfaceType newSurface1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(), newSurface1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurface1(SurfaceType newSurface1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Surface1(), newSurface1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectPositionType getPos() {
		return (DirectPositionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Pos(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPos(DirectPositionType newPos, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Pos(), newPos, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(DirectPositionType newPos) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Pos(), newPos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointPropertyType getPosition() {
		return (PointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PointPropertyType newPosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Position(), newPosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PointPropertyType newPosition) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Position(), newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectPositionListType getPosList() {
		return (DirectPositionListType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PosList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosList(DirectPositionListType newPosList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PosList(), newPosList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosList(DirectPositionListType newPosList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PosList(), newPosList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimeMeridianType getPrimeMeridian() {
		return (PrimeMeridianType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridian(PrimeMeridianType newPrimeMeridian, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian(), newPrimeMeridian, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimeMeridian(PrimeMeridianType newPrimeMeridian) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridian(), newPrimeMeridian);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimeMeridianRefType getPrimeMeridianRef() {
		return (PrimeMeridianRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimeMeridianRef(PrimeMeridianRefType newPrimeMeridianRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef(), newPrimeMeridianRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimeMeridianRef(PrimeMeridianRefType newPrimeMeridianRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PrimeMeridianRef(), newPrimeMeridianRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityLocationPropertyType getPriorityLocation() {
		return (PriorityLocationPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorityLocation(PriorityLocationPropertyType newPriorityLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation(), newPriorityLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityLocation(PriorityLocationPropertyType newPriorityLocation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_PriorityLocation(), newPriorityLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectedCRSType getProjectedCRS() {
		return (ProjectedCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectedCRS(ProjectedCRSType newProjectedCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS(), newProjectedCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedCRS(ProjectedCRSType newProjectedCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRS(), newProjectedCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectedCRSRefType getProjectedCRSRef() {
		return (ProjectedCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectedCRSRef(ProjectedCRSRefType newProjectedCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRSRef(), newProjectedCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedCRSRef(ProjectedCRSRefType newProjectedCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ProjectedCRSRef(), newProjectedCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getQuantity() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(MeasureType newQuantity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(), newQuantity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(MeasureType newQuantity) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Quantity(), newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityExtentType getQuantityExtent() {
		return (QuantityExtentType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityExtent(QuantityExtentType newQuantityExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent(), newQuantityExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityExtent(QuantityExtentType newQuantityExtent) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_QuantityExtent(), newQuantityExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureOrNullListType getQuantityList() {
		return (MeasureOrNullListType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityList(MeasureOrNullListType newQuantityList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList(), newQuantityList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityList(MeasureOrNullListType newQuantityList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_QuantityList(), newQuantityList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getQuantityType() {
		return (StringOrRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_QuantityType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityType(StringOrRefType newQuantityType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_QuantityType(), newQuantityType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityType(StringOrRefType newQuantityType) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_QuantityType(), newQuantityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeParametersType getRangeParameters() {
		return (RangeParametersType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RangeParameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeParameters(RangeParametersType newRangeParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_RangeParameters(), newRangeParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeParameters(RangeParametersType newRangeParameters) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RangeParameters(), newRangeParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSetType getRangeSet() {
		return (RangeSetType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RangeSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeSet(RangeSetType newRangeSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_RangeSet(), newRangeSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeSet(RangeSetType newRangeSet) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RangeSet(), newRangeSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRealizationEpoch() {
		return (XMLGregorianCalendar)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RealizationEpoch(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizationEpoch(XMLGregorianCalendar newRealizationEpoch) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RealizationEpoch(), newRealizationEpoch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleType getRectangle() {
		return (RectangleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Rectangle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectangle(RectangleType newRectangle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Rectangle(), newRectangle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectangle(RectangleType newRectangle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Rectangle(), newRectangle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifiedGridType getRectifiedGrid() {
		return (RectifiedGridType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGrid(RectifiedGridType newRectifiedGrid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid(), newRectifiedGrid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectifiedGrid(RectifiedGridType newRectifiedGrid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGrid(), newRectifiedGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifiedGridCoverageType getRectifiedGridCoverage() {
		return (RectifiedGridCoverageType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridCoverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGridCoverage(RectifiedGridCoverageType newRectifiedGridCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridCoverage(), newRectifiedGridCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectifiedGridCoverage(RectifiedGridCoverageType newRectifiedGridCoverage) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridCoverage(), newRectifiedGridCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifiedGridDomainType getRectifiedGridDomain() {
		return (RectifiedGridDomainType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGridDomain(RectifiedGridDomainType newRectifiedGridDomain, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain(), newRectifiedGridDomain, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectifiedGridDomain(RectifiedGridDomainType newRectifiedGridDomain) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RectifiedGridDomain(), newRectifiedGridDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSystemRefType getReferenceSystemRef() {
		return (ReferenceSystemRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystemRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSystemRef(ReferenceSystemRefType newReferenceSystemRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystemRef(), newReferenceSystemRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSystemRef(ReferenceSystemRefType newReferenceSystemRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ReferenceSystemRef(), newReferenceSystemRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeInternalPositionalAccuracyType getRelativeInternalPositionalAccuracy() {
		return (RelativeInternalPositionalAccuracyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RelativeInternalPositionalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativeInternalPositionalAccuracy(RelativeInternalPositionalAccuracyType newRelativeInternalPositionalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_RelativeInternalPositionalAccuracy(), newRelativeInternalPositionalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeInternalPositionalAccuracy(RelativeInternalPositionalAccuracyType newRelativeInternalPositionalAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RelativeInternalPositionalAccuracy(), newRelativeInternalPositionalAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getRemarks() {
		return (StringOrRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Remarks(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(StringOrRefType newRemarks, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Remarks(), newRemarks, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(StringOrRefType newRemarks) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Remarks(), newRemarks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getResult() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Result(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(MeasureType newResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Result(), newResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(MeasureType newResult) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Result(), newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType getResultOf() {
		return (AssociationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultOf(AssociationType newResultOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(), newResultOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultOf(AssociationType newResultOf) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ResultOf(), newResultOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingType getRing1() {
		return (RingType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Ring1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRing1(RingType newRing1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Ring1(), newRing1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRing1(RingType newRing1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Ring1(), newRing1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionToPreferredUnitType getRoughConversionToPreferredUnit() {
		return (ConversionToPreferredUnitType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoughConversionToPreferredUnit(ConversionToPreferredUnitType newRoughConversionToPreferredUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit(), newRoughConversionToPreferredUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType newRoughConversionToPreferredUnit) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RoughConversionToPreferredUnit(), newRoughConversionToPreferredUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRowIndex() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_RowIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowIndex(BigInteger newRowIndex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_RowIndex(), newRowIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return (String)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Scope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Scope(), newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondDefiningParameterType getSecondDefiningParameter() {
		return (SecondDefiningParameterType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SecondDefiningParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondDefiningParameter(SecondDefiningParameterType newSecondDefiningParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SecondDefiningParameter(), newSecondDefiningParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondDefiningParameter(SecondDefiningParameterType newSecondDefiningParameter) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SecondDefiningParameter(), newSecondDefiningParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getSeconds() {
		return (BigDecimal)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Seconds(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeconds(BigDecimal newSeconds) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Seconds(), newSeconds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveSegmentArrayPropertyType getSegments() {
		return (CurveSegmentArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Segments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(CurveSegmentArrayPropertyType newSegments, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Segments(), newSegments, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegments(CurveSegmentArrayPropertyType newSegments) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Segments(), newSegments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getSemiMajorAxis() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemiMajorAxis(MeasureType newSemiMajorAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(), newSemiMajorAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiMajorAxis(MeasureType newSemiMajorAxis) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SemiMajorAxis(), newSemiMajorAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getSemiMinorAxis() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemiMinorAxis(MeasureType newSemiMinorAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(), newSemiMinorAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiMinorAxis(MeasureType newSemiMinorAxis) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SemiMinorAxis(), newSemiMinorAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOperationRefType getSingleOperationRef() {
		return (SingleOperationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleOperationRef(SingleOperationRefType newSingleOperationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef(), newSingleOperationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleOperationRef(SingleOperationRefType newSingleOperationRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SingleOperationRef(), newSingleOperationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidType getSolid1() {
		return (SolidType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Solid1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolid1(SolidType newSolid1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Solid1(), newSolid1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolid1(SolidType newSolid1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Solid1(), newSolid1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidArrayPropertyType getSolidArrayProperty() {
		return (SolidArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidArrayProperty(SolidArrayPropertyType newSolidArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty(), newSolidArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolidArrayProperty(SolidArrayPropertyType newSolidArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SolidArrayProperty(), newSolidArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidPropertyType getSolidMember() {
		return (SolidPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SolidMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidMember(SolidPropertyType newSolidMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SolidMember(), newSolidMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolidMember(SolidPropertyType newSolidMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SolidMember(), newSolidMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidArrayPropertyType getSolidMembers() {
		return (SolidArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidMembers(SolidArrayPropertyType newSolidMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers(), newSolidMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolidMembers(SolidArrayPropertyType newSolidMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SolidMembers(), newSolidMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidPropertyType getSolidProperty() {
		return (SolidPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidProperty(SolidPropertyType newSolidProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty(), newSolidProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolidProperty(SolidPropertyType newSolidProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SolidProperty(), newSolidProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRSRefType getSourceCRS() {
		return (CRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCRS(CRSRefType newSourceCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS(), newSourceCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCRS(CRSRefType newSourceCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SourceCRS(), newSourceCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSourceDimensions() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SourceDimensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDimensions(BigInteger newSourceDimensions) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SourceDimensions(), newSourceDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphereType getSphere() {
		return (SphereType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Sphere(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphere(SphereType newSphere, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Sphere(), newSphere, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphere(SphereType newSphere) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Sphere(), newSphere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalCSType getSphericalCS() {
		return (SphericalCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCS(SphericalCSType newSphericalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(), newSphericalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphericalCS(SphericalCSType newSphericalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCS(), newSphericalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalCSRefType getSphericalCSRef() {
		return (SphericalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphericalCSRef(SphericalCSRefType newSphericalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef(), newSphericalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphericalCSRef(SphericalCSRefType newSphericalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SphericalCSRef(), newSphericalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getSrsID() {
		return (IdentifierType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SrsID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrsID(IdentifierType newSrsID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SrsID(), newSrsID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrsID(IdentifierType newSrsID) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SrsID(), newSrsID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType getSrsName() {
		return (CodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrsName(CodeType newSrsName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(), newSrsName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrsName(CodeType newSrsName) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SrsName(), newSrsName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getStatus() {
		return (StringOrRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Status(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StringOrRefType newStatus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Status(), newStatus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StringOrRefType newStatus) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Status(), newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue() {
		return (String)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_StringValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_StringValue(), newStringValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType getStyle1() {
		return (StyleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Style1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle1(StyleType newStyle1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Style1(), newStyle1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle1(StyleType newStyle1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Style1(), newStyle1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoComplexMemberType getSubComplex() {
		return (TopoComplexMemberType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SubComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubComplex(TopoComplexMemberType newSubComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SubComplex(), newSubComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubComplex(TopoComplexMemberType newSubComplex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SubComplex(), newSubComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPropertyType getSubject() {
		return (TargetPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Subject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(TargetPropertyType newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(TargetPropertyType newSubject) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Subject(), newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPropertyType getTarget() {
		return (TargetPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Target(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetPropertyType newTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Target(), newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TargetPropertyType newTarget) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Target(), newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoComplexMemberType getSuperComplex() {
		return (TopoComplexMemberType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperComplex(TopoComplexMemberType newSuperComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex(), newSuperComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperComplex(TopoComplexMemberType newSuperComplex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SuperComplex(), newSuperComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceArrayPropertyType getSurfaceArrayProperty() {
		return (SurfaceArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceArrayProperty(SurfaceArrayPropertyType newSurfaceArrayProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty(), newSurfaceArrayProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceArrayProperty(SurfaceArrayPropertyType newSurfaceArrayProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceArrayProperty(), newSurfaceArrayProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePropertyType getSurfaceMember() {
		return (SurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceMember(SurfacePropertyType newSurfaceMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember(), newSurfaceMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceMember(SurfacePropertyType newSurfaceMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMember(), newSurfaceMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceArrayPropertyType getSurfaceMembers() {
		return (SurfaceArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceMembers(SurfaceArrayPropertyType newSurfaceMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers(), newSurfaceMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceMembers(SurfaceArrayPropertyType newSurfaceMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceMembers(), newSurfaceMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePropertyType getSurfaceProperty() {
		return (SurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceProperty(SurfacePropertyType newSurfaceProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty(), newSurfaceProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceProperty(SurfacePropertyType newSurfaceProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_SurfaceProperty(), newSurfaceProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolType getSymbol() {
		return (SymbolType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Symbol(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSymbol(SymbolType newSymbol, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Symbol(), newSymbol, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(SymbolType newSymbol) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Symbol(), newSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRSRefType getTargetCRS() {
		return (CRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetCRS(CRSRefType newTargetCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS(), newTargetCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCRS(CRSRefType newTargetCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TargetCRS(), newTargetCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTargetDimensions() {
		return (BigInteger)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TargetDimensions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDimensions(BigInteger newTargetDimensions) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TargetDimensions(), newTargetDimensions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalCRSType getTemporalCRS() {
		return (TemporalCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCRS(TemporalCRSType newTemporalCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS(), newTemporalCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalCRS(TemporalCRSType newTemporalCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRS(), newTemporalCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalCRSRefType getTemporalCRSRef() {
		return (TemporalCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCRSRef(TemporalCRSRefType newTemporalCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRSRef(), newTemporalCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalCRSRef(TemporalCRSRefType newTemporalCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCRSRef(), newTemporalCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalCSType getTemporalCS() {
		return (TemporalCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCS(TemporalCSType newTemporalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(), newTemporalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalCS(TemporalCSType newTemporalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCS(), newTemporalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalCSRefType getTemporalCSRef() {
		return (TemporalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalCSRef(TemporalCSRefType newTemporalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef(), newTemporalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalCSRef(TemporalCSRefType newTemporalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TemporalCSRef(), newTemporalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDatumType getTemporalDatum() {
		return (TemporalDatumType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatum(TemporalDatumType newTemporalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum(), newTemporalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalDatum(TemporalDatumType newTemporalDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatum(), newTemporalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDatumRefType getTemporalDatumRef() {
		return (TemporalDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalDatumRef(TemporalDatumRefType newTemporalDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef(), newTemporalDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalDatumRef(TemporalDatumRefType newTemporalDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TemporalDatumRef(), newTemporalDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType getTemporalExtent() {
		return (TimePeriodType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalExtent(TimePeriodType newTemporalExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent(), newTemporalExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalExtent(TimePeriodType newTemporalExtent) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TemporalExtent(), newTemporalExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCalendarType getTimeCalendar() {
		return (TimeCalendarType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCalendar(TimeCalendarType newTimeCalendar, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar(), newTimeCalendar, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCalendar(TimeCalendarType newTimeCalendar) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendar(), newTimeCalendar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCalendarEraType getTimeCalendarEra() {
		return (TimeCalendarEraType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCalendarEra(TimeCalendarEraType newTimeCalendarEra, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra(), newTimeCalendarEra, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCalendarEra(TimeCalendarEraType newTimeCalendarEra) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeCalendarEra(), newTimeCalendarEra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeClockType getTimeClock() {
		return (TimeClockType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeClock(TimeClockType newTimeClock, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock(), newTimeClock, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeClock(TimeClockType newTimeClock) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeClock(), newTimeClock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCoordinateSystemType getTimeCoordinateSystem() {
		return (TimeCoordinateSystemType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeCoordinateSystem(TimeCoordinateSystemType newTimeCoordinateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem(), newTimeCoordinateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCoordinateSystem(TimeCoordinateSystemType newTimeCoordinateSystem) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeCoordinateSystem(), newTimeCoordinateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEdgeType getTimeEdge() {
		return (TimeEdgeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeEdge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeEdge(TimeEdgeType newTimeEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeEdge(), newTimeEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeEdge(TimeEdgeType newTimeEdge) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeEdge(), newTimeEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInstantType getTimeInstant() {
		return (TimeInstantType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeInstant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeInstant(TimeInstantType newTimeInstant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeInstant(), newTimeInstant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInstant(TimeInstantType newTimeInstant) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeInstant(), newTimeInstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntervalLengthType getTimeInterval() {
		return (TimeIntervalLengthType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeInterval(TimeIntervalLengthType newTimeInterval, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(), newTimeInterval, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(TimeIntervalLengthType newTimeInterval) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeInterval(), newTimeInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeNodeType getTimeNode() {
		return (TimeNodeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeNode(TimeNodeType newTimeNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeNode(), newTimeNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeNode(TimeNodeType newTimeNode) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeNode(), newTimeNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOrdinalEraType getTimeOrdinalEra() {
		return (TimeOrdinalEraType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeOrdinalEra(TimeOrdinalEraType newTimeOrdinalEra, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra(), newTimeOrdinalEra, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOrdinalEra(TimeOrdinalEraType newTimeOrdinalEra) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalEra(), newTimeOrdinalEra);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOrdinalReferenceSystemType getTimeOrdinalReferenceSystem() {
		return (TimeOrdinalReferenceSystemType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeOrdinalReferenceSystem(TimeOrdinalReferenceSystemType newTimeOrdinalReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem(), newTimeOrdinalReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeOrdinalReferenceSystem(TimeOrdinalReferenceSystemType newTimeOrdinalReferenceSystem) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeOrdinalReferenceSystem(), newTimeOrdinalReferenceSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodType getTimePeriod() {
		return (TimePeriodType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePeriod(TimePeriodType newTimePeriod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod(), newTimePeriod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePeriod(TimePeriodType newTimePeriod) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimePeriod(), newTimePeriod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePositionType getTimePosition() {
		return (TimePositionType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimePosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePosition(TimePositionType newTimePosition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimePosition(), newTimePosition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePosition(TimePositionType newTimePosition) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimePosition(), newTimePosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTopologyComplexType getTimeTopologyComplex() {
		return (TimeTopologyComplexType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTopologyComplex(TimeTopologyComplexType newTimeTopologyComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyComplex(), newTimeTopologyComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeTopologyComplex(TimeTopologyComplexType newTimeTopologyComplex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TimeTopologyComplex(), newTimeTopologyComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinType getTin() {
		return (TinType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Tin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTin(TinType newTin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Tin(), newTin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTin(TinType newTin) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Tin(), newTin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangulatedSurfaceType getTriangulatedSurface() {
		return (TriangulatedSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriangulatedSurface(TriangulatedSurfaceType newTriangulatedSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(), newTriangulatedSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriangulatedSurface(TriangulatedSurfaceType newTriangulatedSurface) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TriangulatedSurface(), newTriangulatedSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoComplexType getTopoComplex() {
		return (TopoComplexType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoComplex(TopoComplexType newTopoComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplex(), newTopoComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoComplex(TopoComplexType newTopoComplex) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplex(), newTopoComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoComplexMemberType getTopoComplexProperty() {
		return (TopoComplexMemberType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoComplexProperty(TopoComplexMemberType newTopoComplexProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty(), newTopoComplexProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoComplexProperty(TopoComplexMemberType newTopoComplexProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoComplexProperty(), newTopoComplexProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoCurveType getTopoCurve() {
		return (TopoCurveType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoCurve(TopoCurveType newTopoCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurve(), newTopoCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoCurve(TopoCurveType newTopoCurve) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurve(), newTopoCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoCurvePropertyType getTopoCurveProperty() {
		return (TopoCurvePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurveProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoCurveProperty(TopoCurvePropertyType newTopoCurveProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurveProperty(), newTopoCurveProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoCurveProperty(TopoCurvePropertyType newTopoCurveProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoCurveProperty(), newTopoCurveProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyStylePropertyType getTopologyStyle() {
		return (TopologyStylePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyStyle(TopologyStylePropertyType newTopologyStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle(), newTopologyStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyStyle(TopologyStylePropertyType newTopologyStyle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle(), newTopologyStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyStyleType getTopologyStyle1() {
		return (TopologyStyleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyStyle1(TopologyStyleType newTopologyStyle1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle1(), newTopologyStyle1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyStyle1(TopologyStyleType newTopologyStyle1) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopologyStyle1(), newTopologyStyle1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoPointType getTopoPoint() {
		return (TopoPointType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPoint(TopoPointType newTopoPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoPoint(), newTopoPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoPoint(TopoPointType newTopoPoint) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoPoint(), newTopoPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoPointPropertyType getTopoPointProperty() {
		return (TopoPointPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoPointProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPointProperty(TopoPointPropertyType newTopoPointProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoPointProperty(), newTopoPointProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoPointProperty(TopoPointPropertyType newTopoPointProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoPointProperty(), newTopoPointProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoPrimitiveMemberType getTopoPrimitiveMember() {
		return (TopoPrimitiveMemberType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPrimitiveMember(TopoPrimitiveMemberType newTopoPrimitiveMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMember(), newTopoPrimitiveMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoPrimitiveMember(TopoPrimitiveMemberType newTopoPrimitiveMember) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMember(), newTopoPrimitiveMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers() {
		return (TopoPrimitiveArrayAssociationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMembers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType newTopoPrimitiveMembers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMembers(), newTopoPrimitiveMembers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType newTopoPrimitiveMembers) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoPrimitiveMembers(), newTopoPrimitiveMembers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoSolidType getTopoSolid() {
		return (TopoSolidType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoSolid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoSolid(TopoSolidType newTopoSolid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoSolid(), newTopoSolid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoSolid(TopoSolidType newTopoSolid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoSolid(), newTopoSolid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoSurfaceType getTopoSurface() {
		return (TopoSurfaceType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoSurface(TopoSurfaceType newTopoSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurface(), newTopoSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoSurface(TopoSurfaceType newTopoSurface) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurface(), newTopoSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoSurfacePropertyType getTopoSurfaceProperty() {
		return (TopoSurfacePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurfaceProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoSurfaceProperty(TopoSurfacePropertyType newTopoSurfaceProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurfaceProperty(), newTopoSurfaceProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoSurfaceProperty(TopoSurfacePropertyType newTopoSurfaceProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoSurfaceProperty(), newTopoSurfaceProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoVolumeType getTopoVolume() {
		return (TopoVolumeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolume(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoVolume(TopoVolumeType newTopoVolume, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolume(), newTopoVolume, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoVolume(TopoVolumeType newTopoVolume) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolume(), newTopoVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoVolumePropertyType getTopoVolumeProperty() {
		return (TopoVolumePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolumeProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoVolumeProperty(TopoVolumePropertyType newTopoVolumeProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolumeProperty(), newTopoVolumeProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoVolumeProperty(TopoVolumePropertyType newTopoVolumeProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TopoVolumeProperty(), newTopoVolumeProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackType getTrack() {
		return (TrackType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Track(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrack(TrackType newTrack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Track(), newTrack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrack(TrackType newTrack) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Track(), newTrack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationType getTransformation() {
		return (TransformationType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Transformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Transformation(), newTransformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(TransformationType newTransformation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Transformation(), newTransformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRefType getTransformationRef() {
		return (TransformationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TransformationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationRef(TransformationRefType newTransformationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TransformationRef(), newTransformationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationRef(TransformationRefType newTransformationRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TransformationRef(), newTransformationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangleType getTriangle() {
		return (TriangleType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Triangle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriangle(TriangleType newTriangle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Triangle(), newTriangle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriangle(TriangleType newTriangle) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Triangle(), newTriangle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrianglePatchArrayPropertyType getTrianglePatches() {
		return (TrianglePatchArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrianglePatches(TrianglePatchArrayPropertyType newTrianglePatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches(), newTrianglePatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrianglePatches(TrianglePatchArrayPropertyType newTrianglePatches) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TrianglePatches(), newTrianglePatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesType getTupleList() {
		return (CoordinatesType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_TupleList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleList(CoordinatesType newTupleList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_TupleList(), newTupleList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleList(CoordinatesType newTupleList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_TupleList(), newTupleList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitOfMeasureType getUnitOfMeasure() {
		return (UnitOfMeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitOfMeasure(UnitOfMeasureType newUnitOfMeasure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(), newUnitOfMeasure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfMeasure(UnitOfMeasureType newUnitOfMeasure) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UnitOfMeasure(), newUnitOfMeasure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedCSType getUserDefinedCS() {
		return (UserDefinedCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCS(UserDefinedCSType newUserDefinedCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(), newUserDefinedCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedCS(UserDefinedCSType newUserDefinedCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCS(), newUserDefinedCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedCSRefType getUserDefinedCSRef() {
		return (UserDefinedCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefinedCSRef(UserDefinedCSRefType newUserDefinedCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCSRef(), newUserDefinedCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedCSRef(UserDefinedCSRefType newUserDefinedCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UserDefinedCSRef(), newUserDefinedCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemAxisRefType getUsesAxis() {
		return (CoordinateSystemAxisRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesAxis(CoordinateSystemAxisRefType newUsesAxis, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis(), newUsesAxis, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesAxis(CoordinateSystemAxisRefType newUsesAxis) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesAxis(), newUsesAxis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCSRefType getUsesCartesianCS() {
		return (CartesianCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCartesianCS(CartesianCSRefType newUsesCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS(), newUsesCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesCartesianCS(CartesianCSRefType newUsesCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesCartesianCS(), newUsesCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemRefType getUsesCS() {
		return (CoordinateSystemRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCS(CoordinateSystemRefType newUsesCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesCS(), newUsesCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesCS(CoordinateSystemRefType newUsesCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesCS(), newUsesCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsoidRefType getUsesEllipsoid() {
		return (EllipsoidRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEllipsoid(EllipsoidRefType newUsesEllipsoid, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid(), newUsesEllipsoid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesEllipsoid(EllipsoidRefType newUsesEllipsoid) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoid(), newUsesEllipsoid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipsoidalCSRefType getUsesEllipsoidalCS() {
		return (EllipsoidalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEllipsoidalCS(EllipsoidalCSRefType newUsesEllipsoidalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS(), newUsesEllipsoidalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesEllipsoidalCS(EllipsoidalCSRefType newUsesEllipsoidalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesEllipsoidalCS(), newUsesEllipsoidalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDatumRefType getUsesEngineeringDatum() {
		return (EngineeringDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEngineeringDatum(EngineeringDatumRefType newUsesEngineeringDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum(), newUsesEngineeringDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesEngineeringDatum(EngineeringDatumRefType newUsesEngineeringDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesEngineeringDatum(), newUsesEngineeringDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeodeticDatumRefType getUsesGeodeticDatum() {
		return (GeodeticDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesGeodeticDatum(GeodeticDatumRefType newUsesGeodeticDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum(), newUsesGeodeticDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesGeodeticDatum(GeodeticDatumRefType newUsesGeodeticDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesGeodeticDatum(), newUsesGeodeticDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageDatumRefType getUsesImageDatum() {
		return (ImageDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesImageDatum(ImageDatumRefType newUsesImageDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum(), newUsesImageDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesImageDatum(ImageDatumRefType newUsesImageDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesImageDatum(), newUsesImageDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationMethodRefType getUsesMethod() {
		return (OperationMethodRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesMethod(OperationMethodRefType newUsesMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod(), newUsesMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesMethod(OperationMethodRefType newUsesMethod) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesMethod(), newUsesMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObliqueCartesianCSRefType getUsesObliqueCartesianCS() {
		return (ObliqueCartesianCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesObliqueCartesianCS(ObliqueCartesianCSRefType newUsesObliqueCartesianCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS(), newUsesObliqueCartesianCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesObliqueCartesianCS(ObliqueCartesianCSRefType newUsesObliqueCartesianCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesObliqueCartesianCS(), newUsesObliqueCartesianCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRefType getUsesOperation() {
		return (OperationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesOperation(OperationRefType newUsesOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation(), newUsesOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesOperation(OperationRefType newUsesOperation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesOperation(), newUsesOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGeneralOperationParameterRefType getUsesParameter() {
		return (AbstractGeneralOperationParameterRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesParameter(AbstractGeneralOperationParameterRefType newUsesParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter(), newUsesParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesParameter(AbstractGeneralOperationParameterRefType newUsesParameter) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesParameter(), newUsesParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimeMeridianRefType getUsesPrimeMeridian() {
		return (PrimeMeridianRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesPrimeMeridian(PrimeMeridianRefType newUsesPrimeMeridian, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian(), newUsesPrimeMeridian, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesPrimeMeridian(PrimeMeridianRefType newUsesPrimeMeridian) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesPrimeMeridian(), newUsesPrimeMeridian);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOperationRefType getUsesSingleOperation() {
		return (SingleOperationRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesSingleOperation(SingleOperationRefType newUsesSingleOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation(), newUsesSingleOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesSingleOperation(SingleOperationRefType newUsesSingleOperation) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesSingleOperation(), newUsesSingleOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalCSRefType getUsesSphericalCS() {
		return (SphericalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesSphericalCS(SphericalCSRefType newUsesSphericalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS(), newUsesSphericalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesSphericalCS(SphericalCSRefType newUsesSphericalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesSphericalCS(), newUsesSphericalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalCSRefType getUsesTemporalCS() {
		return (TemporalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTemporalCS(TemporalCSRefType newUsesTemporalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS(), newUsesTemporalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesTemporalCS(TemporalCSRefType newUsesTemporalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalCS(), newUsesTemporalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDatumRefType getUsesTemporalDatum() {
		return (TemporalDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTemporalDatum(TemporalDatumRefType newUsesTemporalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum(), newUsesTemporalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesTemporalDatum(TemporalDatumRefType newUsesTemporalDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesTemporalDatum(), newUsesTemporalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueType getUsesValue() {
		return (ParameterValueType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesValue(ParameterValueType newUsesValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesValue(), newUsesValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesValue(ParameterValueType newUsesValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesValue(), newUsesValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalCSRefType getUsesVerticalCS() {
		return (VerticalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesVerticalCS(VerticalCSRefType newUsesVerticalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS(), newUsesVerticalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesVerticalCS(VerticalCSRefType newUsesVerticalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalCS(), newUsesVerticalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalDatumRefType getUsesVerticalDatum() {
		return (VerticalDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesVerticalDatum(VerticalDatumRefType newUsesVerticalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum(), newUsesVerticalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesVerticalDatum(VerticalDatumRefType newUsesVerticalDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_UsesVerticalDatum(), newUsesVerticalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePropertyType getUsing() {
		return (FeaturePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Using(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsing(FeaturePropertyType newUsing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Using(), newUsing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsing(FeaturePropertyType newUsing) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Using(), newUsing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtentType getValidArea() {
		return (ExtentType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValidArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidArea(ExtentType newValidArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValidArea(), newValidArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidArea(ExtentType newValidArea) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValidArea(), newValidArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePrimitivePropertyType getValidTime() {
		return (TimePrimitivePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTime(TimePrimitivePropertyType newValidTime, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime(), newValidTime, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTime(TimePrimitivePropertyType newValidTime) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValidTime(), newValidTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getValue() {
		return (MeasureType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Value(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(MeasureType newValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Value(), newValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(MeasureType newValue) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Value(), newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueArrayType getValueArray() {
		return (ValueArrayType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueArray(ValueArrayType newValueArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray(), newValueArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueArray(ValueArrayType newValueArray) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValueArray(), newValueArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePropertyType getValueComponent() {
		return (ValuePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueComponent(ValuePropertyType newValueComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(), newValueComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComponent(ValuePropertyType newValueComponent) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponent(), newValueComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueArrayPropertyType getValueComponents() {
		return (ValueArrayPropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponents(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueComponents(ValueArrayPropertyType newValueComponents, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponents(), newValueComponents, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComponents(ValueArrayPropertyType newValueComponents) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValueComponents(), newValueComponents);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueFile() {
		return (String)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValueFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFile(String newValueFile) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValueFile(), newValueFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureListType getValueList() {
		return (MeasureListType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValueList(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueList(MeasureListType newValueList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValueList(), newValueList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueList(MeasureListType newValueList) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValueList(), newValueList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterRefType getValueOfParameter() {
		return (OperationParameterRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueOfParameter(OperationParameterRefType newValueOfParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter(), newValueOfParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOfParameter(OperationParameterRefType newValueOfParameter) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValueOfParameter(), newValueOfParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePropertyType getValueProperty() {
		return (ValuePropertyType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueProperty(ValuePropertyType newValueProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(), newValueProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueProperty(ValuePropertyType newValueProperty) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValueProperty(), newValueProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameterGroupRefType getValuesOfGroup() {
		return (OperationParameterGroupRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_ValuesOfGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuesOfGroup(OperationParameterGroupRefType newValuesOfGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_ValuesOfGroup(), newValuesOfGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesOfGroup(OperationParameterGroupRefType newValuesOfGroup) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_ValuesOfGroup(), newValuesOfGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType getVector() {
		return (VectorType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Vector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(VectorType newVector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_Vector(), newVector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVector(VectorType newVector) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Vector(), newVector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_Version(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_Version(), newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalCRSType getVerticalCRS() {
		return (VerticalCRSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCRS(VerticalCRSType newVerticalCRS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS(), newVerticalCRS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalCRS(VerticalCRSType newVerticalCRS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRS(), newVerticalCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalCRSRefType getVerticalCRSRef() {
		return (VerticalCRSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCRSRef(VerticalCRSRefType newVerticalCRSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRSRef(), newVerticalCRSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalCRSRef(VerticalCRSRefType newVerticalCRSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCRSRef(), newVerticalCRSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalCSType getVerticalCS() {
		return (VerticalCSType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCS(VerticalCSType newVerticalCS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(), newVerticalCS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalCS(VerticalCSType newVerticalCS) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCS(), newVerticalCS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalCSRefType getVerticalCSRef() {
		return (VerticalCSRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalCSRef(VerticalCSRefType newVerticalCSRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef(), newVerticalCSRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalCSRef(VerticalCSRefType newVerticalCSRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalCSRef(), newVerticalCSRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalDatumType getVerticalDatum() {
		return (VerticalDatumType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatum(VerticalDatumType newVerticalDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum(), newVerticalDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalDatum(VerticalDatumType newVerticalDatum) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatum(), newVerticalDatum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalDatumRefType getVerticalDatumRef() {
		return (VerticalDatumRefType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatumRef(VerticalDatumRefType newVerticalDatumRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef(), newVerticalDatumRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalDatumRef(VerticalDatumRefType newVerticalDatumRef) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumRef(), newVerticalDatumRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalDatumTypeType getVerticalDatumType() {
		return (VerticalDatumTypeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatumType(VerticalDatumTypeType newVerticalDatumType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType(), newVerticalDatumType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalDatumType(VerticalDatumTypeType newVerticalDatumType) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalDatumType(), newVerticalDatumType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvelopeType getVerticalExtent() {
		return (EnvelopeType)getMixed().get(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalExtent(EnvelopeType newVerticalExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent(), newVerticalExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalExtent(EnvelopeType newVerticalExtent) {
		((FeatureMap.Internal)getMixed()).set(GmlPackage.eINSTANCE.getDocumentRoot_VerticalExtent(), newVerticalExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.DOCUMENT_ROOT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteSchema() {
		return remoteSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteSchema(String newRemoteSchema) {
		String oldRemoteSchema = remoteSchema;
		remoteSchema = newRemoteSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.DOCUMENT_ROOT__REMOTE_SCHEMA, oldRemoteSchema, remoteSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(String newTransform) {
		String oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.DOCUMENT_ROOT__TRANSFORM, oldTransform, transform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUom() {
		return uom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUom(String newUom) {
		String oldUom = uom;
		uom = newUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.DOCUMENT_ROOT__UOM, oldUom, uom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case GmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE:
				return basicSetFeature(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GML:
				return basicSetGML(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OBJECT:
				return basicSetObject(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONTINUOUS_COVERAGE:
				return basicSetContinuousCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COVERAGE:
				return basicSetCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION:
				return basicSetCoordinateOperation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEFINITION:
				return basicSetDefinition(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM:
				return basicSetCoordinateReferenceSystem(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CRS:
				return basicSetCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM:
				return basicSetReferenceSystem(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM:
				return basicSetCoordinateSystem(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CURVE:
				return basicSetCurve(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_PRIMITIVE:
				return basicSetGeometricPrimitive(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CURVE_SEGMENT:
				return basicSetCurveSegment(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DATUM:
				return basicSetDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DISCRETE_COVERAGE:
				return basicSetDiscreteCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return basicSetFeatureCollection(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION:
				return basicSetGeneralConversion(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION:
				return basicSetOperation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION:
				return basicSetSingleOperation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERAL_DERIVED_CRS:
				return basicSetGeneralDerivedCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				return basicSetGeneralOperationParameter(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERAL_PARAMETER_VALUE:
				return basicSetGeneralParameterValue(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION:
				return basicSetGeneralTransformation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_AGGREGATE:
				return basicSetGeometricAggregate(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GRIDDED_SURFACE:
				return basicSetGriddedSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PARAMETRIC_CURVE_SURFACE:
				return basicSetParametricCurveSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PATCH:
				return basicSetSurfacePatch(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				return basicSetImplicitGeometry(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__META_DATA:
				return basicSetMetaData(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POSITIONAL_ACCURACY:
				return basicSetPositionalAccuracy(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__REFERENCE:
				return basicSetReference(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RING:
				return basicSetRing(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SOLID:
				return basicSetSolid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__STRICT_ASSOCIATION:
				return basicSetStrictAssociation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__STYLE:
				return basicSetStyle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SURFACE:
				return basicSetSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_COMPLEX:
				return basicSetTimeComplex(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_OBJECT:
				return basicSetTimeObject(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_GEOMETRIC_PRIMITIVE:
				return basicSetTimeGeometricPrimitive(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_PRIMITIVE:
				return basicSetTimePrimitive(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				return basicSetTimeReferenceSystem(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_SLICE:
				return basicSetTimeSlice(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_PRIMITIVE:
				return basicSetTimeTopologyPrimitive(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY:
				return basicSetTopology(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE:
				return basicSetTopoPrimitive(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				return basicSetAbsoluteExternalPositionalAccuracy(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				return basicSetAbstractGeneralOperationParameterRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__AFFINE_PLACEMENT:
				return basicSetAffinePlacement(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ANCHOR_POINT:
				return basicSetAnchorPoint(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ANGLE:
				return basicSetAngle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBER:
				return basicSetFeatureMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ARC:
				return basicSetArc(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING:
				return basicSetArcString(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_BULGE:
				return basicSetArcByBulge(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				return basicSetArcStringByBulge(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				return basicSetArcByCenterPoint(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ARRAY:
				return basicSetArray(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__AXIS_ABBREV:
				return basicSetAxisAbbrev(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__AXIS_DIRECTION:
				return basicSetAxisDirection(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__AXIS_ID:
				return basicSetAxisID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BAG:
				return basicSetBag(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BASE_CRS:
				return basicSetBaseCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BASE_CURVE:
				return basicSetBaseCurve(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BASE_SURFACE:
				return basicSetBaseSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BASE_UNIT:
				return basicSetBaseUnit(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__UNIT_DEFINITION:
				return basicSetUnitDefinition(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BEZIER:
				return basicSetBezier(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BSPLINE:
				return basicSetBSpline(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BOUNDED_BY:
				return basicSetBoundedBy(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return basicSetBoundingBox(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_POLYGON:
				return basicSetBoundingPolygon(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS:
				return basicSetCartesianCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS_REF:
				return basicSetCartesianCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CATALOG_SYMBOL:
				return basicSetCatalogSymbol(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CATEGORY:
				return basicSetCategory(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_EXTENT:
				return basicSetCategoryExtent(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_LIST:
				return basicSetCategoryList(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CENTER_LINE_OF:
				return basicSetCenterLineOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CENTER_OF:
				return basicSetCenterOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CIRCLE:
				return basicSetCircle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				return basicSetCircleByCenterPoint(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CLOTHOID:
				return basicSetClothoid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_CURVE:
				return basicSetCompositeCurve(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SOLID:
				return basicSetCompositeSolid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SURFACE:
				return basicSetCompositeSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				return basicSetCompositeValue(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS:
				return basicSetCompoundCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS_REF:
				return basicSetCompoundCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION:
				return basicSetConcatenatedOperation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				return basicSetConcatenatedOperationRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONE:
				return basicSetCone(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONTAINER:
				return basicSetContainer(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				return basicSetConventionalUnit(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONVERSION:
				return basicSetConversion(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_REF:
				return basicSetConversionRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				return basicSetConversionToPreferredUnit(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORD:
				return basicSetCoord(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_ID:
				return basicSetCoordinateOperationID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_NAME:
				return basicSetCoordinateOperationName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				return basicSetCoordinateOperationRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM_REF:
				return basicSetCoordinateReferenceSystemRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATES:
				return basicSetCoordinates(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				return basicSetCoordinateSystemAxis(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				return basicSetCoordinateSystemAxisRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				return basicSetCoordinateSystemRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE_MATRIX:
				return basicSetCovarianceMatrix(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__COVERAGE_FUNCTION:
				return basicSetCoverageFunction(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CRS_REF:
				return basicSetCrsRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CS_ID:
				return basicSetCsID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CS_NAME:
				return basicSetCsName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CUBIC_SPLINE:
				return basicSetCubicSpline(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CURVE1:
				return basicSetCurve1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				return basicSetCurveArrayProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBER:
				return basicSetCurveMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBERS:
				return basicSetCurveMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CURVE_PROPERTY:
				return basicSetCurveProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CYLINDER:
				return basicSetCylinder(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS:
				return basicSetCylindricalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				return basicSetCylindricalCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DATA_BLOCK:
				return basicSetDataBlock(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DATUM_ID:
				return basicSetDatumID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DATUM_NAME:
				return basicSetDatumName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DATUM_REF:
				return basicSetDatumRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				return basicSetDefaultStyle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				return basicSetDefinedByConversion(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_COLLECTION:
				return basicSetDefinitionCollection(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_MEMBER:
				return basicSetDefinitionMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY_ENTRY:
				return basicSetDictionaryEntry(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_PROXY:
				return basicSetDefinitionProxy(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_REF:
				return basicSetDefinitionRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DEGREES:
				return basicSetDegrees(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				return basicSetDerivationUnitTerm(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS:
				return basicSetDerivedCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_REF:
				return basicSetDerivedCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				return basicSetDerivedCRSType(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DERIVED_UNIT:
				return basicSetDerivedUnit(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY:
				return basicSetDictionary(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_EDGE:
				return basicSetDirectedEdge(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_FACE:
				return basicSetDirectedFace(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_NODE:
				return basicSetDirectedNode(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				return basicSetDirectedObservation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OBSERVATION:
				return basicSetObservation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				return basicSetDirectedObservationAtDistance(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				return basicSetDirectedTopoSolid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTION:
				return basicSetDirection(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DIRECTION_VECTOR:
				return basicSetDirectionVector(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE:
				return basicSetDmsAngle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				return basicSetDmsAngleValue(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__DOMAIN_SET:
				return basicSetDomainSet(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__EDGE:
				return basicSetEdge(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__EDGE_OF:
				return basicSetEdgeOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID:
				return basicSetEllipsoid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				return basicSetEllipsoidalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				return basicSetEllipsoidalCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_ID:
				return basicSetEllipsoidID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_NAME:
				return basicSetEllipsoidName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_REF:
				return basicSetEllipsoidRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS:
				return basicSetEngineeringCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				return basicSetEngineeringCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM:
				return basicSetEngineeringDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				return basicSetEngineeringDatumRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE:
				return basicSetEnvelope(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				return basicSetEnvelopeWithTimePeriod(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__EXTENT_OF:
				return basicSetExtentOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__EXTERIOR:
				return basicSetExterior(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FACE:
				return basicSetFace(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION1:
				return basicSetFeatureCollection1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBERS:
				return basicSetFeatureMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE_PROPERTY:
				return basicSetFeatureProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE:
				return basicSetFeatureStyle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE1:
				return basicSetFeatureStyle1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__FILE:
				return basicSetFile(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				return basicSetGeneralConversionRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				return basicSetGeneralTransformationRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GENERIC_META_DATA:
				return basicSetGenericMetaData(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS:
				return basicSetGeocentricCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				return basicSetGeocentricCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEODESIC:
				return basicSetGeodesic(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEODESIC_STRING:
				return basicSetGeodesicString(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM:
				return basicSetGeodeticDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				return basicSetGeodeticDatumRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				return basicSetGeographicCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				return basicSetGeographicCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				return basicSetGeometricComplex(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBER:
				return basicSetGeometryMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				return basicSetGeometryMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE:
				return basicSetGeometryStyle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE1:
				return basicSetGeometryStyle1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE:
				return basicSetGraphStyle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE1:
				return basicSetGraphStyle1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				return basicSetGreenwichLongitude(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GRID:
				return basicSetGrid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GRID_COVERAGE:
				return basicSetGridCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GRID_DOMAIN:
				return basicSetGridDomain(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GRID_FUNCTION:
				return basicSetGridFunction(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GROUP_ID:
				return basicSetGroupID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__GROUP_NAME:
				return basicSetGroupName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__HISTORY:
				return basicSetHistory(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS:
				return basicSetImageCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS_REF:
				return basicSetImageCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM:
				return basicSetImageDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM_REF:
				return basicSetImageDatumRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_CRS:
				return basicSetIncludesCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_ELEMENT:
				return basicSetIncludesElement(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_PARAMETER:
				return basicSetIncludesParameter(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_VALUE:
				return basicSetIncludesValue(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INDEX_MAP:
				return basicSetIndexMap(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INDIRECT_ENTRY:
				return basicSetIndirectEntry(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				return basicSetInnerBoundaryIs(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INTERIOR:
				return basicSetInterior(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__INVERSE_FLATTENING:
				return basicSetInverseFlattening(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ISOLATED:
				return basicSetIsolated(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE:
				return basicSetLabelStyle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE1:
				return basicSetLabelStyle1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS:
				return basicSetLinearCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS_REF:
				return basicSetLinearCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LINEAR_RING:
				return basicSetLinearRing(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING:
				return basicSetLineString(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_MEMBER:
				return basicSetLineStringMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_PROPERTY:
				return basicSetLineStringProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				return basicSetLineStringSegment(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LOCATION_KEY_WORD:
				return basicSetLocationKeyWord(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__LOCATION_STRING:
				return basicSetLocationString(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MAPPING_RULE:
				return basicSetMappingRule(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				return basicSetMaximalComplex(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MEASURE:
				return basicSetMeasure(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MEASURE_DESCRIPTION:
				return basicSetMeasureDescription(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MEMBER:
				return basicSetMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MEMBERS:
				return basicSetMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_ID:
				return basicSetMeridianID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_NAME:
				return basicSetMeridianName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__META_DATA_PROPERTY:
				return basicSetMetaDataProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__METHOD_FORMULA:
				return basicSetMethodFormula(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__METHOD_ID:
				return basicSetMethodID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__METHOD_NAME:
				return basicSetMethodName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				return basicSetMovingObjectStatus(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				return basicSetMultiCenterLineOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_OF:
				return basicSetMultiCenterOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_COVERAGE:
				return basicSetMultiCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE:
				return basicSetMultiCurve(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				return basicSetMultiCurveCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				return basicSetMultiCurveDomain(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				return basicSetMultiCurveProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_EDGE_OF:
				return basicSetMultiEdgeOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_EXTENT_OF:
				return basicSetMultiExtentOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return basicSetMultiGeometry(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				return basicSetMultiGeometryProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_LINE_STRING:
				return basicSetMultiLineString(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_LOCATION:
				return basicSetMultiLocation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT:
				return basicSetMultiPoint(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				return basicSetMultiPointCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				return basicSetMultiPointDomain(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				return basicSetMultiPointProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_POLYGON:
				return basicSetMultiPolygon(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_POSITION:
				return basicSetMultiPosition(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID:
				return basicSetMultiSolid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				return basicSetMultiSolidCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				return basicSetMultiSolidDomain(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				return basicSetMultiSolidProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE:
				return basicSetMultiSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				return basicSetMultiSurfaceCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				return basicSetMultiSurfaceDomain(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				return basicSetMultiSurfaceProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__NODE:
				return basicSetNode(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				return basicSetObliqueCartesianCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				return basicSetObliqueCartesianCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OFFSET_CURVE:
				return basicSetOffsetCurve(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD:
				return basicSetOperationMethod(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD_REF:
				return basicSetOperationMethodRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER:
				return basicSetOperationParameter(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				return basicSetOperationParameterGroup(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				return basicSetOperationParameterGroupRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				return basicSetOperationParameterRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OPERATION_REF:
				return basicSetOperationRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_CURVE:
				return basicSetOrientableCurve(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				return basicSetOrientableSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				return basicSetOuterBoundaryIs(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_ID:
				return basicSetParameterID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_NAME:
				return basicSetParameterName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE:
				return basicSetParameterValue(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				return basicSetParameterValueGroup(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				return basicSetPassThroughOperation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				return basicSetPassThroughOperationRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PATCHES:
				return basicSetPatches(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PIXEL_IN_CELL:
				return basicSetPixelInCell(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POINT:
				return basicSetPoint(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				return basicSetPointArrayProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBER:
				return basicSetPointMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBERS:
				return basicSetPointMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POINT_PROPERTY:
				return basicSetPointProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POINT_REP:
				return basicSetPointRep(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS:
				return basicSetPolarCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS_REF:
				return basicSetPolarCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLYGON:
				return basicSetPolygon(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLYGON_MEMBER:
				return basicSetPolygonMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCH:
				return basicSetPolygonPatch(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCHES:
				return basicSetPolygonPatches(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PROPERTY:
				return basicSetPolygonProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				return basicSetPolyhedralSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SURFACE1:
				return basicSetSurface1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POS:
				return basicSetPos(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POSITION:
				return basicSetPosition(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__POS_LIST:
				return basicSetPosList(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN:
				return basicSetPrimeMeridian(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				return basicSetPrimeMeridianRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PRIORITY_LOCATION:
				return basicSetPriorityLocation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS:
				return basicSetProjectedCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS_REF:
				return basicSetProjectedCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__QUANTITY:
				return basicSetQuantity(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_EXTENT:
				return basicSetQuantityExtent(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_LIST:
				return basicSetQuantityList(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_TYPE:
				return basicSetQuantityType(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RANGE_PARAMETERS:
				return basicSetRangeParameters(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RANGE_SET:
				return basicSetRangeSet(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RECTANGLE:
				return basicSetRectangle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID:
				return basicSetRectifiedGrid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				return basicSetRectifiedGridCoverage(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				return basicSetRectifiedGridDomain(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				return basicSetReferenceSystemRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				return basicSetRelativeInternalPositionalAccuracy(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__REMARKS:
				return basicSetRemarks(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RESULT:
				return basicSetResult(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RESULT_OF:
				return basicSetResultOf(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__RING1:
				return basicSetRing1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				return basicSetRoughConversionToPreferredUnit(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				return basicSetSecondDefiningParameter(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SEGMENTS:
				return basicSetSegments(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				return basicSetSemiMajorAxis(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SEMI_MINOR_AXIS:
				return basicSetSemiMinorAxis(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				return basicSetSingleOperationRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SOLID1:
				return basicSetSolid1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				return basicSetSolidArrayProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBER:
				return basicSetSolidMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBERS:
				return basicSetSolidMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SOLID_PROPERTY:
				return basicSetSolidProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SOURCE_CRS:
				return basicSetSourceCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SPHERE:
				return basicSetSphere(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS:
				return basicSetSphericalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS_REF:
				return basicSetSphericalCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SRS_ID:
				return basicSetSrsID(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SRS_NAME:
				return basicSetSrsName(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__STATUS:
				return basicSetStatus(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__STYLE1:
				return basicSetStyle1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SUB_COMPLEX:
				return basicSetSubComplex(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SUBJECT:
				return basicSetSubject(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TARGET:
				return basicSetTarget(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SUPER_COMPLEX:
				return basicSetSuperComplex(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				return basicSetSurfaceArrayProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBER:
				return basicSetSurfaceMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBERS:
				return basicSetSurfaceMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PROPERTY:
				return basicSetSurfaceProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__SYMBOL:
				return basicSetSymbol(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TARGET_CRS:
				return basicSetTargetCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS:
				return basicSetTemporalCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				return basicSetTemporalCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS:
				return basicSetTemporalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS_REF:
				return basicSetTemporalCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM:
				return basicSetTemporalDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				return basicSetTemporalDatumRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				return basicSetTemporalExtent(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR:
				return basicSetTimeCalendar(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				return basicSetTimeCalendarEra(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_CLOCK:
				return basicSetTimeClock(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				return basicSetTimeCoordinateSystem(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_EDGE:
				return basicSetTimeEdge(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_INSTANT:
				return basicSetTimeInstant(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				return basicSetTimeInterval(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_NODE:
				return basicSetTimeNode(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				return basicSetTimeOrdinalEra(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				return basicSetTimeOrdinalReferenceSystem(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_PERIOD:
				return basicSetTimePeriod(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_POSITION:
				return basicSetTimePosition(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				return basicSetTimeTopologyComplex(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TIN:
				return basicSetTin(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				return basicSetTriangulatedSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX:
				return basicSetTopoComplex(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				return basicSetTopoComplexProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE:
				return basicSetTopoCurve(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				return basicSetTopoCurveProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE:
				return basicSetTopologyStyle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE1:
				return basicSetTopologyStyle1(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT:
				return basicSetTopoPoint(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				return basicSetTopoPointProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				return basicSetTopoPrimitiveMember(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				return basicSetTopoPrimitiveMembers(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_SOLID:
				return basicSetTopoSolid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE:
				return basicSetTopoSurface(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				return basicSetTopoSurfaceProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME:
				return basicSetTopoVolume(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				return basicSetTopoVolumeProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TRACK:
				return basicSetTrack(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION_REF:
				return basicSetTransformationRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE:
				return basicSetTriangle(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE_PATCHES:
				return basicSetTrianglePatches(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__TUPLE_LIST:
				return basicSetTupleList(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return basicSetUnitOfMeasure(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS:
				return basicSetUserDefinedCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				return basicSetUserDefinedCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_AXIS:
				return basicSetUsesAxis(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_CARTESIAN_CS:
				return basicSetUsesCartesianCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_CS:
				return basicSetUsesCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOID:
				return basicSetUsesEllipsoid(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				return basicSetUsesEllipsoidalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				return basicSetUsesEngineeringDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				return basicSetUsesGeodeticDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_IMAGE_DATUM:
				return basicSetUsesImageDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_METHOD:
				return basicSetUsesMethod(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				return basicSetUsesObliqueCartesianCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_OPERATION:
				return basicSetUsesOperation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_PARAMETER:
				return basicSetUsesParameter(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				return basicSetUsesPrimeMeridian(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				return basicSetUsesSingleOperation(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_SPHERICAL_CS:
				return basicSetUsesSphericalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_CS:
				return basicSetUsesTemporalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				return basicSetUsesTemporalDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_VALUE:
				return basicSetUsesValue(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_CS:
				return basicSetUsesVerticalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				return basicSetUsesVerticalDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__USING:
				return basicSetUsing(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALID_AREA:
				return basicSetValidArea(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALID_TIME:
				return basicSetValidTime(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUE:
				return basicSetValue(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUE_ARRAY:
				return basicSetValueArray(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENT:
				return basicSetValueComponent(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENTS:
				return basicSetValueComponents(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUE_LIST:
				return basicSetValueList(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				return basicSetValueOfParameter(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUE_PROPERTY:
				return basicSetValueProperty(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VALUES_OF_GROUP:
				return basicSetValuesOfGroup(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VECTOR:
				return basicSetVector(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS:
				return basicSetVerticalCRS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS_REF:
				return basicSetVerticalCRSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS:
				return basicSetVerticalCS(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS_REF:
				return basicSetVerticalCSRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM:
				return basicSetVerticalDatum(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				return basicSetVerticalDatumRef(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_TYPE:
				return basicSetVerticalDatumType(null, msgs);
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_EXTENT:
				return basicSetVerticalExtent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GmlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case GmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case GmlPackage.DOCUMENT_ROOT__FEATURE:
				return getFeature();
			case GmlPackage.DOCUMENT_ROOT__GML:
				return getGML();
			case GmlPackage.DOCUMENT_ROOT__OBJECT:
				return getObject();
			case GmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation();
			case GmlPackage.DOCUMENT_ROOT__CONTINUOUS_COVERAGE:
				return getContinuousCoverage();
			case GmlPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION:
				return getCoordinateOperation();
			case GmlPackage.DOCUMENT_ROOT__DEFINITION:
				return getDefinition();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM:
				return getCoordinateReferenceSystem();
			case GmlPackage.DOCUMENT_ROOT__CRS:
				return getCRS();
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM:
				return getReferenceSystem();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM:
				return getCoordinateSystem();
			case GmlPackage.DOCUMENT_ROOT__CURVE:
				return getCurve();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_PRIMITIVE:
				return getGeometricPrimitive();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY:
				return getGeometry();
			case GmlPackage.DOCUMENT_ROOT__CURVE_SEGMENT:
				return getCurveSegment();
			case GmlPackage.DOCUMENT_ROOT__DATUM:
				return getDatum();
			case GmlPackage.DOCUMENT_ROOT__DISCRETE_COVERAGE:
				return getDiscreteCoverage();
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection();
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION:
				return getGeneralConversion();
			case GmlPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation();
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION:
				return getSingleOperation();
			case GmlPackage.DOCUMENT_ROOT__GENERAL_DERIVED_CRS:
				return getGeneralDerivedCRS();
			case GmlPackage.DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				return getGeneralOperationParameter();
			case GmlPackage.DOCUMENT_ROOT__GENERAL_PARAMETER_VALUE:
				return getGeneralParameterValue();
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION:
				return getGeneralTransformation();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_AGGREGATE:
				return getGeometricAggregate();
			case GmlPackage.DOCUMENT_ROOT__GRIDDED_SURFACE:
				return getGriddedSurface();
			case GmlPackage.DOCUMENT_ROOT__PARAMETRIC_CURVE_SURFACE:
				return getParametricCurveSurface();
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PATCH:
				return getSurfacePatch();
			case GmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				return getImplicitGeometry();
			case GmlPackage.DOCUMENT_ROOT__META_DATA:
				return getMetaData();
			case GmlPackage.DOCUMENT_ROOT__POSITIONAL_ACCURACY:
				return getPositionalAccuracy();
			case GmlPackage.DOCUMENT_ROOT__REFERENCE:
				return getReference();
			case GmlPackage.DOCUMENT_ROOT__RING:
				return getRing();
			case GmlPackage.DOCUMENT_ROOT__SOLID:
				return getSolid();
			case GmlPackage.DOCUMENT_ROOT__STRICT_ASSOCIATION:
				return getStrictAssociation();
			case GmlPackage.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case GmlPackage.DOCUMENT_ROOT__SURFACE:
				return getSurface();
			case GmlPackage.DOCUMENT_ROOT__TIME_COMPLEX:
				return getTimeComplex();
			case GmlPackage.DOCUMENT_ROOT__TIME_OBJECT:
				return getTimeObject();
			case GmlPackage.DOCUMENT_ROOT__TIME_GEOMETRIC_PRIMITIVE:
				return getTimeGeometricPrimitive();
			case GmlPackage.DOCUMENT_ROOT__TIME_PRIMITIVE:
				return getTimePrimitive();
			case GmlPackage.DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				return getTimeReferenceSystem();
			case GmlPackage.DOCUMENT_ROOT__TIME_SLICE:
				return getTimeSlice();
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_PRIMITIVE:
				return getTimeTopologyPrimitive();
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY:
				return getTopology();
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE:
				return getTopoPrimitive();
			case GmlPackage.DOCUMENT_ROOT__ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				return getAbsoluteExternalPositionalAccuracy();
			case GmlPackage.DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				return getAbstractGeneralOperationParameterRef();
			case GmlPackage.DOCUMENT_ROOT__AFFINE_PLACEMENT:
				return getAffinePlacement();
			case GmlPackage.DOCUMENT_ROOT__ANCHOR_POINT:
				return getAnchorPoint();
			case GmlPackage.DOCUMENT_ROOT__ANGLE:
				return getAngle();
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBER:
				return getFeatureMember();
			case GmlPackage.DOCUMENT_ROOT__ARC:
				return getArc();
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING:
				return getArcString();
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_BULGE:
				return getArcByBulge();
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				return getArcStringByBulge();
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				return getArcByCenterPoint();
			case GmlPackage.DOCUMENT_ROOT__ARRAY:
				return getArray();
			case GmlPackage.DOCUMENT_ROOT__AXIS_ABBREV:
				return getAxisAbbrev();
			case GmlPackage.DOCUMENT_ROOT__AXIS_DIRECTION:
				return getAxisDirection();
			case GmlPackage.DOCUMENT_ROOT__AXIS_ID:
				return getAxisID();
			case GmlPackage.DOCUMENT_ROOT__BAG:
				return getBag();
			case GmlPackage.DOCUMENT_ROOT__BASE_CRS:
				return getBaseCRS();
			case GmlPackage.DOCUMENT_ROOT__BASE_CURVE:
				return getBaseCurve();
			case GmlPackage.DOCUMENT_ROOT__BASE_SURFACE:
				return getBaseSurface();
			case GmlPackage.DOCUMENT_ROOT__BASE_UNIT:
				return getBaseUnit();
			case GmlPackage.DOCUMENT_ROOT__UNIT_DEFINITION:
				return getUnitDefinition();
			case GmlPackage.DOCUMENT_ROOT__BEZIER:
				return getBezier();
			case GmlPackage.DOCUMENT_ROOT__BSPLINE:
				return getBSpline();
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN:
				return isBoolean();
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_LIST:
				return getBooleanList();
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				return isBooleanValue();
			case GmlPackage.DOCUMENT_ROOT__BOUNDED_BY:
				return getBoundedBy();
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return getBoundingBox();
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_POLYGON:
				return getBoundingPolygon();
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS:
				return getCartesianCS();
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS_REF:
				return getCartesianCSRef();
			case GmlPackage.DOCUMENT_ROOT__CATALOG_SYMBOL:
				return getCatalogSymbol();
			case GmlPackage.DOCUMENT_ROOT__CATEGORY:
				return getCategory();
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_EXTENT:
				return getCategoryExtent();
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_LIST:
				return getCategoryList();
			case GmlPackage.DOCUMENT_ROOT__CENTER_LINE_OF:
				return getCenterLineOf();
			case GmlPackage.DOCUMENT_ROOT__CENTER_OF:
				return getCenterOf();
			case GmlPackage.DOCUMENT_ROOT__CIRCLE:
				return getCircle();
			case GmlPackage.DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				return getCircleByCenterPoint();
			case GmlPackage.DOCUMENT_ROOT__CLOTHOID:
				return getClothoid();
			case GmlPackage.DOCUMENT_ROOT__COLUMN_INDEX:
				return getColumnIndex();
			case GmlPackage.DOCUMENT_ROOT__COMPASS_POINT:
				return getCompassPoint();
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_CURVE:
				return getCompositeCurve();
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SOLID:
				return getCompositeSolid();
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SURFACE:
				return getCompositeSurface();
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				return getCompositeValue();
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS:
				return getCompoundCRS();
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS_REF:
				return getCompoundCRSRef();
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION:
				return getConcatenatedOperation();
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				return getConcatenatedOperationRef();
			case GmlPackage.DOCUMENT_ROOT__CONE:
				return getCone();
			case GmlPackage.DOCUMENT_ROOT__CONTAINER:
				return getContainer();
			case GmlPackage.DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				return getConventionalUnit();
			case GmlPackage.DOCUMENT_ROOT__CONVERSION:
				return getConversion();
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_REF:
				return getConversionRef();
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				return getConversionToPreferredUnit();
			case GmlPackage.DOCUMENT_ROOT__COORD:
				return getCoord();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_ID:
				return getCoordinateOperationID();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_NAME:
				return getCoordinateOperationName();
			case GmlPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				return getCoordinateOperationRef();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM_REF:
				return getCoordinateReferenceSystemRef();
			case GmlPackage.DOCUMENT_ROOT__COORDINATES:
				return getCoordinates();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				return getCoordinateSystemAxis();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				return getCoordinateSystemAxisRef();
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				return getCoordinateSystemRef();
			case GmlPackage.DOCUMENT_ROOT__COUNT:
				return getCount();
			case GmlPackage.DOCUMENT_ROOT__COUNT_EXTENT:
				return getCountExtent();
			case GmlPackage.DOCUMENT_ROOT__COUNT_LIST:
				return getCountList();
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE:
				return getCovariance();
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE_MATRIX:
				return getCovarianceMatrix();
			case GmlPackage.DOCUMENT_ROOT__COVERAGE_FUNCTION:
				return getCoverageFunction();
			case GmlPackage.DOCUMENT_ROOT__CRS_REF:
				return getCrsRef();
			case GmlPackage.DOCUMENT_ROOT__CS_ID:
				return getCsID();
			case GmlPackage.DOCUMENT_ROOT__CS_NAME:
				return getCsName();
			case GmlPackage.DOCUMENT_ROOT__CUBIC_SPLINE:
				return getCubicSpline();
			case GmlPackage.DOCUMENT_ROOT__CURVE1:
				return getCurve1();
			case GmlPackage.DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				return getCurveArrayProperty();
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBER:
				return getCurveMember();
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBERS:
				return getCurveMembers();
			case GmlPackage.DOCUMENT_ROOT__CURVE_PROPERTY:
				return getCurveProperty();
			case GmlPackage.DOCUMENT_ROOT__CYLINDER:
				return getCylinder();
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS:
				return getCylindricalCS();
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				return getCylindricalCSRef();
			case GmlPackage.DOCUMENT_ROOT__DATA_BLOCK:
				return getDataBlock();
			case GmlPackage.DOCUMENT_ROOT__DATA_SOURCE:
				return getDataSource();
			case GmlPackage.DOCUMENT_ROOT__DATUM_ID:
				return getDatumID();
			case GmlPackage.DOCUMENT_ROOT__DATUM_NAME:
				return getDatumName();
			case GmlPackage.DOCUMENT_ROOT__DATUM_REF:
				return getDatumRef();
			case GmlPackage.DOCUMENT_ROOT__DECIMAL_MINUTES:
				return getDecimalMinutes();
			case GmlPackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				return getDefaultStyle();
			case GmlPackage.DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				return getDefinedByConversion();
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_COLLECTION:
				return getDefinitionCollection();
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_MEMBER:
				return getDefinitionMember();
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY_ENTRY:
				return getDictionaryEntry();
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_PROXY:
				return getDefinitionProxy();
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_REF:
				return getDefinitionRef();
			case GmlPackage.DOCUMENT_ROOT__DEGREES:
				return getDegrees();
			case GmlPackage.DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				return getDerivationUnitTerm();
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS:
				return getDerivedCRS();
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_REF:
				return getDerivedCRSRef();
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				return getDerivedCRSType();
			case GmlPackage.DOCUMENT_ROOT__DERIVED_UNIT:
				return getDerivedUnit();
			case GmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY:
				return getDictionary();
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_EDGE:
				return getDirectedEdge();
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_FACE:
				return getDirectedFace();
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_NODE:
				return getDirectedNode();
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				return getDirectedObservation();
			case GmlPackage.DOCUMENT_ROOT__OBSERVATION:
				return getObservation();
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				return getDirectedObservationAtDistance();
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				return getDirectedTopoSolid();
			case GmlPackage.DOCUMENT_ROOT__DIRECTION:
				return getDirection();
			case GmlPackage.DOCUMENT_ROOT__DIRECTION_VECTOR:
				return getDirectionVector();
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE:
				return getDmsAngle();
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				return getDmsAngleValue();
			case GmlPackage.DOCUMENT_ROOT__DOMAIN_SET:
				return getDomainSet();
			case GmlPackage.DOCUMENT_ROOT__DOUBLE_OR_NULL_TUPLE_LIST:
				return getDoubleOrNullTupleList();
			case GmlPackage.DOCUMENT_ROOT__DURATION:
				return getDuration();
			case GmlPackage.DOCUMENT_ROOT__EDGE:
				return getEdge();
			case GmlPackage.DOCUMENT_ROOT__EDGE_OF:
				return getEdgeOf();
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID:
				return getEllipsoid();
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				return getEllipsoidalCS();
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				return getEllipsoidalCSRef();
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_ID:
				return getEllipsoidID();
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_NAME:
				return getEllipsoidName();
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_REF:
				return getEllipsoidRef();
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS:
				return getEngineeringCRS();
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				return getEngineeringCRSRef();
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM:
				return getEngineeringDatum();
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				return getEngineeringDatumRef();
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE:
				return getEnvelope();
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				return getEnvelopeWithTimePeriod();
			case GmlPackage.DOCUMENT_ROOT__EXTENT_OF:
				return getExtentOf();
			case GmlPackage.DOCUMENT_ROOT__EXTERIOR:
				return getExterior();
			case GmlPackage.DOCUMENT_ROOT__FACE:
				return getFace();
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION1:
				return getFeatureCollection1();
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBERS:
				return getFeatureMembers();
			case GmlPackage.DOCUMENT_ROOT__FEATURE_PROPERTY:
				return getFeatureProperty();
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE:
				return getFeatureStyle();
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE1:
				return getFeatureStyle1();
			case GmlPackage.DOCUMENT_ROOT__FILE:
				return getFile();
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				return getGeneralConversionRef();
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				return getGeneralTransformationRef();
			case GmlPackage.DOCUMENT_ROOT__GENERIC_META_DATA:
				return getGenericMetaData();
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS:
				return getGeocentricCRS();
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				return getGeocentricCRSRef();
			case GmlPackage.DOCUMENT_ROOT__GEODESIC:
				return getGeodesic();
			case GmlPackage.DOCUMENT_ROOT__GEODESIC_STRING:
				return getGeodesicString();
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM:
				return getGeodeticDatum();
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				return getGeodeticDatumRef();
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				return getGeographicCRS();
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				return getGeographicCRSRef();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				return getGeometricComplex();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBER:
				return getGeometryMember();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				return getGeometryMembers();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE:
				return getGeometryStyle();
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE1:
				return getGeometryStyle1();
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE:
				return getGraphStyle();
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE1:
				return getGraphStyle1();
			case GmlPackage.DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				return getGreenwichLongitude();
			case GmlPackage.DOCUMENT_ROOT__GRID:
				return getGrid();
			case GmlPackage.DOCUMENT_ROOT__GRID_COVERAGE:
				return getGridCoverage();
			case GmlPackage.DOCUMENT_ROOT__GRID_DOMAIN:
				return getGridDomain();
			case GmlPackage.DOCUMENT_ROOT__GRID_FUNCTION:
				return getGridFunction();
			case GmlPackage.DOCUMENT_ROOT__GROUP_ID:
				return getGroupID();
			case GmlPackage.DOCUMENT_ROOT__GROUP_NAME:
				return getGroupName();
			case GmlPackage.DOCUMENT_ROOT__HISTORY:
				return getHistory();
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS:
				return getImageCRS();
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS_REF:
				return getImageCRSRef();
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM:
				return getImageDatum();
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM_REF:
				return getImageDatumRef();
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_CRS:
				return getIncludesCRS();
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_ELEMENT:
				return getIncludesElement();
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_PARAMETER:
				return getIncludesParameter();
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_VALUE:
				return getIncludesValue();
			case GmlPackage.DOCUMENT_ROOT__INDEX_MAP:
				return getIndexMap();
			case GmlPackage.DOCUMENT_ROOT__INDIRECT_ENTRY:
				return getIndirectEntry();
			case GmlPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				return getInnerBoundaryIs();
			case GmlPackage.DOCUMENT_ROOT__INTERIOR:
				return getInterior();
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE:
				return getIntegerValue();
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				return getIntegerValueList();
			case GmlPackage.DOCUMENT_ROOT__INVERSE_FLATTENING:
				return getInverseFlattening();
			case GmlPackage.DOCUMENT_ROOT__ISOLATED:
				return getIsolated();
			case GmlPackage.DOCUMENT_ROOT__IS_SPHERE:
				return getIsSphere();
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE:
				return getLabelStyle();
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE1:
				return getLabelStyle1();
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS:
				return getLinearCS();
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS_REF:
				return getLinearCSRef();
			case GmlPackage.DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing();
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING:
				return getLineString();
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_MEMBER:
				return getLineStringMember();
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_PROPERTY:
				return getLineStringProperty();
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				return getLineStringSegment();
			case GmlPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case GmlPackage.DOCUMENT_ROOT__LOCATION_KEY_WORD:
				return getLocationKeyWord();
			case GmlPackage.DOCUMENT_ROOT__LOCATION_STRING:
				return getLocationString();
			case GmlPackage.DOCUMENT_ROOT__MAPPING_RULE:
				return getMappingRule();
			case GmlPackage.DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				return getMaximalComplex();
			case GmlPackage.DOCUMENT_ROOT__MAXIMUM_OCCURS:
				return getMaximumOccurs();
			case GmlPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure();
			case GmlPackage.DOCUMENT_ROOT__MEASURE_DESCRIPTION:
				return getMeasureDescription();
			case GmlPackage.DOCUMENT_ROOT__MEMBER:
				return getMember();
			case GmlPackage.DOCUMENT_ROOT__MEMBERS:
				return getMembers();
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_ID:
				return getMeridianID();
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_NAME:
				return getMeridianName();
			case GmlPackage.DOCUMENT_ROOT__META_DATA_PROPERTY:
				return getMetaDataProperty();
			case GmlPackage.DOCUMENT_ROOT__METHOD_FORMULA:
				return getMethodFormula();
			case GmlPackage.DOCUMENT_ROOT__METHOD_ID:
				return getMethodID();
			case GmlPackage.DOCUMENT_ROOT__METHOD_NAME:
				return getMethodName();
			case GmlPackage.DOCUMENT_ROOT__MINIMUM_OCCURS:
				return getMinimumOccurs();
			case GmlPackage.DOCUMENT_ROOT__MINUTES:
				return getMinutes();
			case GmlPackage.DOCUMENT_ROOT__MODIFIED_COORDINATE:
				return getModifiedCoordinate();
			case GmlPackage.DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				return getMovingObjectStatus();
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				return getMultiCenterLineOf();
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_OF:
				return getMultiCenterOf();
			case GmlPackage.DOCUMENT_ROOT__MULTI_COVERAGE:
				return getMultiCoverage();
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE:
				return getMultiCurve();
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				return getMultiCurveCoverage();
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				return getMultiCurveDomain();
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				return getMultiCurveProperty();
			case GmlPackage.DOCUMENT_ROOT__MULTI_EDGE_OF:
				return getMultiEdgeOf();
			case GmlPackage.DOCUMENT_ROOT__MULTI_EXTENT_OF:
				return getMultiExtentOf();
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry();
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				return getMultiGeometryProperty();
			case GmlPackage.DOCUMENT_ROOT__MULTI_LINE_STRING:
				return getMultiLineString();
			case GmlPackage.DOCUMENT_ROOT__MULTI_LOCATION:
				return getMultiLocation();
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT:
				return getMultiPoint();
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				return getMultiPointCoverage();
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				return getMultiPointDomain();
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				return getMultiPointProperty();
			case GmlPackage.DOCUMENT_ROOT__MULTI_POLYGON:
				return getMultiPolygon();
			case GmlPackage.DOCUMENT_ROOT__MULTI_POSITION:
				return getMultiPosition();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID:
				return getMultiSolid();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				return getMultiSolidCoverage();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				return getMultiSolidDomain();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				return getMultiSolidProperty();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE:
				return getMultiSurface();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				return getMultiSurfaceCoverage();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				return getMultiSurfaceDomain();
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				return getMultiSurfaceProperty();
			case GmlPackage.DOCUMENT_ROOT__NODE:
				return getNode();
			case GmlPackage.DOCUMENT_ROOT__NULL:
				return getNull();
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				return getObliqueCartesianCS();
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				return getObliqueCartesianCSRef();
			case GmlPackage.DOCUMENT_ROOT__OFFSET_CURVE:
				return getOffsetCurve();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD:
				return getOperationMethod();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD_REF:
				return getOperationMethodRef();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER:
				return getOperationParameter();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				return getOperationParameterGroup();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				return getOperationParameterGroupRef();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				return getOperationParameterRef();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_REF:
				return getOperationRef();
			case GmlPackage.DOCUMENT_ROOT__OPERATION_VERSION:
				return getOperationVersion();
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_CURVE:
				return getOrientableCurve();
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				return getOrientableSurface();
			case GmlPackage.DOCUMENT_ROOT__ORIGIN:
				return getOrigin();
			case GmlPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				return getOuterBoundaryIs();
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_ID:
				return getParameterID();
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_NAME:
				return getParameterName();
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE:
				return getParameterValue();
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				return getParameterValueGroup();
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				return getPassThroughOperation();
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				return getPassThroughOperationRef();
			case GmlPackage.DOCUMENT_ROOT__PATCHES:
				return getPatches();
			case GmlPackage.DOCUMENT_ROOT__PIXEL_IN_CELL:
				return getPixelInCell();
			case GmlPackage.DOCUMENT_ROOT__POINT:
				return getPoint();
			case GmlPackage.DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				return getPointArrayProperty();
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBER:
				return getPointMember();
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBERS:
				return getPointMembers();
			case GmlPackage.DOCUMENT_ROOT__POINT_PROPERTY:
				return getPointProperty();
			case GmlPackage.DOCUMENT_ROOT__POINT_REP:
				return getPointRep();
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS:
				return getPolarCS();
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS_REF:
				return getPolarCSRef();
			case GmlPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon();
			case GmlPackage.DOCUMENT_ROOT__POLYGON_MEMBER:
				return getPolygonMember();
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCH:
				return getPolygonPatch();
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCHES:
				return getPolygonPatches();
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PROPERTY:
				return getPolygonProperty();
			case GmlPackage.DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				return getPolyhedralSurface();
			case GmlPackage.DOCUMENT_ROOT__SURFACE1:
				return getSurface1();
			case GmlPackage.DOCUMENT_ROOT__POS:
				return getPos();
			case GmlPackage.DOCUMENT_ROOT__POSITION:
				return getPosition();
			case GmlPackage.DOCUMENT_ROOT__POS_LIST:
				return getPosList();
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN:
				return getPrimeMeridian();
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				return getPrimeMeridianRef();
			case GmlPackage.DOCUMENT_ROOT__PRIORITY_LOCATION:
				return getPriorityLocation();
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS:
				return getProjectedCRS();
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS_REF:
				return getProjectedCRSRef();
			case GmlPackage.DOCUMENT_ROOT__QUANTITY:
				return getQuantity();
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_EXTENT:
				return getQuantityExtent();
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_LIST:
				return getQuantityList();
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_TYPE:
				return getQuantityType();
			case GmlPackage.DOCUMENT_ROOT__RANGE_PARAMETERS:
				return getRangeParameters();
			case GmlPackage.DOCUMENT_ROOT__RANGE_SET:
				return getRangeSet();
			case GmlPackage.DOCUMENT_ROOT__REALIZATION_EPOCH:
				return getRealizationEpoch();
			case GmlPackage.DOCUMENT_ROOT__RECTANGLE:
				return getRectangle();
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID:
				return getRectifiedGrid();
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				return getRectifiedGridCoverage();
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				return getRectifiedGridDomain();
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				return getReferenceSystemRef();
			case GmlPackage.DOCUMENT_ROOT__RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				return getRelativeInternalPositionalAccuracy();
			case GmlPackage.DOCUMENT_ROOT__REMARKS:
				return getRemarks();
			case GmlPackage.DOCUMENT_ROOT__RESULT:
				return getResult();
			case GmlPackage.DOCUMENT_ROOT__RESULT_OF:
				return getResultOf();
			case GmlPackage.DOCUMENT_ROOT__RING1:
				return getRing1();
			case GmlPackage.DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				return getRoughConversionToPreferredUnit();
			case GmlPackage.DOCUMENT_ROOT__ROW_INDEX:
				return getRowIndex();
			case GmlPackage.DOCUMENT_ROOT__SCOPE:
				return getScope();
			case GmlPackage.DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				return getSecondDefiningParameter();
			case GmlPackage.DOCUMENT_ROOT__SECONDS:
				return getSeconds();
			case GmlPackage.DOCUMENT_ROOT__SEGMENTS:
				return getSegments();
			case GmlPackage.DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				return getSemiMajorAxis();
			case GmlPackage.DOCUMENT_ROOT__SEMI_MINOR_AXIS:
				return getSemiMinorAxis();
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				return getSingleOperationRef();
			case GmlPackage.DOCUMENT_ROOT__SOLID1:
				return getSolid1();
			case GmlPackage.DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				return getSolidArrayProperty();
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBER:
				return getSolidMember();
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBERS:
				return getSolidMembers();
			case GmlPackage.DOCUMENT_ROOT__SOLID_PROPERTY:
				return getSolidProperty();
			case GmlPackage.DOCUMENT_ROOT__SOURCE_CRS:
				return getSourceCRS();
			case GmlPackage.DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				return getSourceDimensions();
			case GmlPackage.DOCUMENT_ROOT__SPHERE:
				return getSphere();
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS:
				return getSphericalCS();
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS_REF:
				return getSphericalCSRef();
			case GmlPackage.DOCUMENT_ROOT__SRS_ID:
				return getSrsID();
			case GmlPackage.DOCUMENT_ROOT__SRS_NAME:
				return getSrsName();
			case GmlPackage.DOCUMENT_ROOT__STATUS:
				return getStatus();
			case GmlPackage.DOCUMENT_ROOT__STRING_VALUE:
				return getStringValue();
			case GmlPackage.DOCUMENT_ROOT__STYLE1:
				return getStyle1();
			case GmlPackage.DOCUMENT_ROOT__SUB_COMPLEX:
				return getSubComplex();
			case GmlPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject();
			case GmlPackage.DOCUMENT_ROOT__TARGET:
				return getTarget();
			case GmlPackage.DOCUMENT_ROOT__SUPER_COMPLEX:
				return getSuperComplex();
			case GmlPackage.DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				return getSurfaceArrayProperty();
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBER:
				return getSurfaceMember();
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBERS:
				return getSurfaceMembers();
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PROPERTY:
				return getSurfaceProperty();
			case GmlPackage.DOCUMENT_ROOT__SYMBOL:
				return getSymbol();
			case GmlPackage.DOCUMENT_ROOT__TARGET_CRS:
				return getTargetCRS();
			case GmlPackage.DOCUMENT_ROOT__TARGET_DIMENSIONS:
				return getTargetDimensions();
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS:
				return getTemporalCRS();
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				return getTemporalCRSRef();
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS:
				return getTemporalCS();
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS_REF:
				return getTemporalCSRef();
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM:
				return getTemporalDatum();
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				return getTemporalDatumRef();
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				return getTemporalExtent();
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR:
				return getTimeCalendar();
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				return getTimeCalendarEra();
			case GmlPackage.DOCUMENT_ROOT__TIME_CLOCK:
				return getTimeClock();
			case GmlPackage.DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				return getTimeCoordinateSystem();
			case GmlPackage.DOCUMENT_ROOT__TIME_EDGE:
				return getTimeEdge();
			case GmlPackage.DOCUMENT_ROOT__TIME_INSTANT:
				return getTimeInstant();
			case GmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				return getTimeInterval();
			case GmlPackage.DOCUMENT_ROOT__TIME_NODE:
				return getTimeNode();
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				return getTimeOrdinalEra();
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				return getTimeOrdinalReferenceSystem();
			case GmlPackage.DOCUMENT_ROOT__TIME_PERIOD:
				return getTimePeriod();
			case GmlPackage.DOCUMENT_ROOT__TIME_POSITION:
				return getTimePosition();
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				return getTimeTopologyComplex();
			case GmlPackage.DOCUMENT_ROOT__TIN:
				return getTin();
			case GmlPackage.DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				return getTriangulatedSurface();
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX:
				return getTopoComplex();
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				return getTopoComplexProperty();
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE:
				return getTopoCurve();
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				return getTopoCurveProperty();
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE:
				return getTopologyStyle();
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE1:
				return getTopologyStyle1();
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT:
				return getTopoPoint();
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				return getTopoPointProperty();
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				return getTopoPrimitiveMember();
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				return getTopoPrimitiveMembers();
			case GmlPackage.DOCUMENT_ROOT__TOPO_SOLID:
				return getTopoSolid();
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE:
				return getTopoSurface();
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				return getTopoSurfaceProperty();
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME:
				return getTopoVolume();
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				return getTopoVolumeProperty();
			case GmlPackage.DOCUMENT_ROOT__TRACK:
				return getTrack();
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION:
				return getTransformation();
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION_REF:
				return getTransformationRef();
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE:
				return getTriangle();
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE_PATCHES:
				return getTrianglePatches();
			case GmlPackage.DOCUMENT_ROOT__TUPLE_LIST:
				return getTupleList();
			case GmlPackage.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS:
				return getUserDefinedCS();
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				return getUserDefinedCSRef();
			case GmlPackage.DOCUMENT_ROOT__USES_AXIS:
				return getUsesAxis();
			case GmlPackage.DOCUMENT_ROOT__USES_CARTESIAN_CS:
				return getUsesCartesianCS();
			case GmlPackage.DOCUMENT_ROOT__USES_CS:
				return getUsesCS();
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOID:
				return getUsesEllipsoid();
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				return getUsesEllipsoidalCS();
			case GmlPackage.DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				return getUsesEngineeringDatum();
			case GmlPackage.DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				return getUsesGeodeticDatum();
			case GmlPackage.DOCUMENT_ROOT__USES_IMAGE_DATUM:
				return getUsesImageDatum();
			case GmlPackage.DOCUMENT_ROOT__USES_METHOD:
				return getUsesMethod();
			case GmlPackage.DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				return getUsesObliqueCartesianCS();
			case GmlPackage.DOCUMENT_ROOT__USES_OPERATION:
				return getUsesOperation();
			case GmlPackage.DOCUMENT_ROOT__USES_PARAMETER:
				return getUsesParameter();
			case GmlPackage.DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				return getUsesPrimeMeridian();
			case GmlPackage.DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				return getUsesSingleOperation();
			case GmlPackage.DOCUMENT_ROOT__USES_SPHERICAL_CS:
				return getUsesSphericalCS();
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_CS:
				return getUsesTemporalCS();
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				return getUsesTemporalDatum();
			case GmlPackage.DOCUMENT_ROOT__USES_VALUE:
				return getUsesValue();
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_CS:
				return getUsesVerticalCS();
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				return getUsesVerticalDatum();
			case GmlPackage.DOCUMENT_ROOT__USING:
				return getUsing();
			case GmlPackage.DOCUMENT_ROOT__VALID_AREA:
				return getValidArea();
			case GmlPackage.DOCUMENT_ROOT__VALID_TIME:
				return getValidTime();
			case GmlPackage.DOCUMENT_ROOT__VALUE:
				return getValue();
			case GmlPackage.DOCUMENT_ROOT__VALUE_ARRAY:
				return getValueArray();
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENT:
				return getValueComponent();
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENTS:
				return getValueComponents();
			case GmlPackage.DOCUMENT_ROOT__VALUE_FILE:
				return getValueFile();
			case GmlPackage.DOCUMENT_ROOT__VALUE_LIST:
				return getValueList();
			case GmlPackage.DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				return getValueOfParameter();
			case GmlPackage.DOCUMENT_ROOT__VALUE_PROPERTY:
				return getValueProperty();
			case GmlPackage.DOCUMENT_ROOT__VALUES_OF_GROUP:
				return getValuesOfGroup();
			case GmlPackage.DOCUMENT_ROOT__VECTOR:
				return getVector();
			case GmlPackage.DOCUMENT_ROOT__VERSION:
				return getVersion();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS:
				return getVerticalCRS();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS_REF:
				return getVerticalCRSRef();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS:
				return getVerticalCS();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS_REF:
				return getVerticalCSRef();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM:
				return getVerticalDatum();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				return getVerticalDatumRef();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_TYPE:
				return getVerticalDatumType();
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_EXTENT:
				return getVerticalExtent();
			case GmlPackage.DOCUMENT_ROOT__ID:
				return getId();
			case GmlPackage.DOCUMENT_ROOT__REMOTE_SCHEMA:
				return getRemoteSchema();
			case GmlPackage.DOCUMENT_ROOT__TRANSFORM:
				return getTransform();
			case GmlPackage.DOCUMENT_ROOT__UOM:
				return getUom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GmlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION:
				setDefinition((DefinitionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				setAbsoluteExternalPositionalAccuracy((AbsoluteExternalPositionalAccuracyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				setAbstractGeneralOperationParameterRef((AbstractGeneralOperationParameterRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__AFFINE_PLACEMENT:
				setAffinePlacement((AffinePlacementType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ANCHOR_POINT:
				setAnchorPoint((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ANGLE:
				setAngle((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBER:
				setFeatureMember((FeaturePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC:
				setArc((ArcType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING:
				setArcString((ArcStringType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_BULGE:
				setArcByBulge((ArcByBulgeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				setArcStringByBulge((ArcStringByBulgeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				setArcByCenterPoint((ArcByCenterPointType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARRAY:
				setArray((ArrayType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__AXIS_ABBREV:
				setAxisAbbrev((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__AXIS_DIRECTION:
				setAxisDirection((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__AXIS_ID:
				setAxisID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BAG:
				setBag((BagType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_CRS:
				setBaseCRS((CoordinateReferenceSystemRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_CURVE:
				setBaseCurve((CurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_SURFACE:
				setBaseSurface((SurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_UNIT:
				setBaseUnit((BaseUnitType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__UNIT_DEFINITION:
				setUnitDefinition((UnitDefinitionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BEZIER:
				setBezier((BezierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BSPLINE:
				setBSpline((BSplineType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean((Boolean)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_LIST:
				setBooleanList((List<Object>)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				setBooleanValue((Boolean)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOUNDED_BY:
				setBoundedBy((BoundingShapeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				setBoundingBox((EnvelopeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_POLYGON:
				setBoundingPolygon((PolygonType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS:
				setCartesianCS((CartesianCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS_REF:
				setCartesianCSRef((CartesianCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATALOG_SYMBOL:
				setCatalogSymbol((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY:
				setCategory((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_EXTENT:
				setCategoryExtent((CategoryExtentType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_LIST:
				setCategoryList((CodeOrNullListType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CENTER_LINE_OF:
				setCenterLineOf((CurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CENTER_OF:
				setCenterOf((PointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CIRCLE:
				setCircle((CircleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				setCircleByCenterPoint((CircleByCenterPointType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CLOTHOID:
				setClothoid((ClothoidType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COLUMN_INDEX:
				setColumnIndex((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPASS_POINT:
				setCompassPoint((CompassPointEnumeration)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_CURVE:
				setCompositeCurve((CompositeCurveType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SOLID:
				setCompositeSolid((CompositeSolidType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SURFACE:
				setCompositeSurface((CompositeSurfaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS:
				setCompoundCRS((CompoundCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS_REF:
				setCompoundCRSRef((CompoundCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION:
				setConcatenatedOperation((ConcatenatedOperationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				setConcatenatedOperationRef((ConcatenatedOperationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONE:
				setCone((ConeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONTAINER:
				setContainer((ContainerPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				setConventionalUnit((ConventionalUnitType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION:
				setConversion((ConversionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_REF:
				setConversionRef((ConversionRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				setConversionToPreferredUnit((ConversionToPreferredUnitType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORD:
				setCoord((CoordType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_ID:
				setCoordinateOperationID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_NAME:
				setCoordinateOperationName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__NAME:
				setName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				setCoordinateOperationRef((CoordinateOperationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM_REF:
				setCoordinateReferenceSystemRef((CoordinateReferenceSystemRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATES:
				setCoordinates((CoordinatesType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				setCoordinateSystemAxis((CoordinateSystemAxisType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				setCoordinateSystemAxisRef((CoordinateSystemAxisRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				setCoordinateSystemRef((CoordinateSystemRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COUNT:
				setCount((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COUNT_EXTENT:
				setCountExtent((List<Object>)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COUNT_LIST:
				setCountList((List<Object>)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE:
				setCovariance((Double)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE_MATRIX:
				setCovarianceMatrix((CovarianceMatrixType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CRS_REF:
				setCrsRef((CRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CS_ID:
				setCsID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CS_NAME:
				setCsName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CUBIC_SPLINE:
				setCubicSpline((CubicSplineType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE1:
				setCurve1((CurveType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				setCurveArrayProperty((CurveArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBER:
				setCurveMember((CurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBERS:
				setCurveMembers((CurveArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_PROPERTY:
				setCurveProperty((CurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CYLINDER:
				setCylinder((CylinderType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS:
				setCylindricalCS((CylindricalCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				setCylindricalCSRef((CylindricalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATA_BLOCK:
				setDataBlock((DataBlockType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATA_SOURCE:
				setDataSource((StringOrRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATUM_ID:
				setDatumID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATUM_NAME:
				setDatumName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATUM_REF:
				setDatumRef((DatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DECIMAL_MINUTES:
				setDecimalMinutes((BigDecimal)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				setDefaultStyle((DefaultStylePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				setDefinedByConversion((GeneralConversionRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_COLLECTION:
				setDefinitionCollection((DictionaryType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_MEMBER:
				setDefinitionMember((DictionaryEntryType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY_ENTRY:
				setDictionaryEntry((DictionaryEntryType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_REF:
				setDefinitionRef((ReferenceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				setDerivationUnitTerm((DerivationUnitTermType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS:
				setDerivedCRS((DerivedCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_REF:
				setDerivedCRSRef((DerivedCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				setDerivedCRSType((DerivedCRSTypeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_UNIT:
				setDerivedUnit((DerivedUnitType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((StringOrRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY:
				setDictionary((DictionaryType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_EDGE:
				setDirectedEdge((DirectedEdgePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_FACE:
				setDirectedFace((DirectedFacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_NODE:
				setDirectedNode((DirectedNodePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				setDirectedObservation((DirectedObservationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OBSERVATION:
				setObservation((ObservationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				setDirectedObservationAtDistance((DirectedObservationAtDistanceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				setDirectedTopoSolid((DirectedTopoSolidPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTION:
				setDirection((DirectionPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTION_VECTOR:
				setDirectionVector((DirectionVectorType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE:
				setDmsAngle((DMSAngleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				setDmsAngleValue((DMSAngleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DOMAIN_SET:
				setDomainSet((DomainSetType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DOUBLE_OR_NULL_TUPLE_LIST:
				setDoubleOrNullTupleList((List<Object>)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__DURATION:
				setDuration((Duration)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__EDGE:
				setEdge((EdgeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__EDGE_OF:
				setEdgeOf((CurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID:
				setEllipsoid((EllipsoidType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				setEllipsoidalCS((EllipsoidalCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				setEllipsoidalCSRef((EllipsoidalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_ID:
				setEllipsoidID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_NAME:
				setEllipsoidName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_REF:
				setEllipsoidRef((EllipsoidRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS:
				setEngineeringCRS((EngineeringCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				setEngineeringCRSRef((EngineeringCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM:
				setEngineeringDatum((EngineeringDatumType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				setEngineeringDatumRef((EngineeringDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE:
				setEnvelope((EnvelopeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				setEnvelopeWithTimePeriod((EnvelopeWithTimePeriodType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__EXTENT_OF:
				setExtentOf((SurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__EXTERIOR:
				setExterior((AbstractRingPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FACE:
				setFace((FaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION1:
				setFeatureCollection1((FeatureCollectionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBERS:
				setFeatureMembers((FeatureArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_PROPERTY:
				setFeatureProperty((FeaturePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE:
				setFeatureStyle((FeatureStylePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE1:
				setFeatureStyle1((FeatureStyleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__FILE:
				setFile((FileType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				setGeneralConversionRef((GeneralConversionRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				setGeneralTransformationRef((GeneralTransformationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GENERIC_META_DATA:
				setGenericMetaData((GenericMetaDataType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS:
				setGeocentricCRS((GeocentricCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				setGeocentricCRSRef((GeocentricCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODESIC:
				setGeodesic((GeodesicType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODESIC_STRING:
				setGeodesicString((GeodesicStringType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM:
				setGeodeticDatum((GeodeticDatumType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				setGeodeticDatumRef((GeodeticDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				setGeographicCRS((GeographicCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				setGeographicCRSRef((GeographicCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				setGeometricComplex((GeometricComplexType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBER:
				setGeometryMember((GeometryPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				setGeometryMembers((GeometryArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE:
				setGeometryStyle((GeometryStylePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE1:
				setGeometryStyle1((GeometryStyleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE:
				setGraphStyle((GraphStylePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE1:
				setGraphStyle1((GraphStyleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleChoiceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID:
				setGrid((GridType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID_COVERAGE:
				setGridCoverage((GridCoverageType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID_DOMAIN:
				setGridDomain((GridDomainType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID_FUNCTION:
				setGridFunction((GridFunctionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GROUP_ID:
				setGroupID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__GROUP_NAME:
				setGroupName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__HISTORY:
				setHistory((HistoryPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS:
				setImageCRS((ImageCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS_REF:
				setImageCRSRef((ImageCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM:
				setImageDatum((ImageDatumType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM_REF:
				setImageDatumRef((ImageDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_CRS:
				setIncludesCRS((CoordinateReferenceSystemRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_ELEMENT:
				setIncludesElement((CovarianceElementType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_PARAMETER:
				setIncludesParameter((AbstractGeneralOperationParameterRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_VALUE:
				setIncludesValue((AbstractGeneralParameterValueType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INDEX_MAP:
				setIndexMap((IndexMapType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INDIRECT_ENTRY:
				setIndirectEntry((IndirectEntryType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				setInnerBoundaryIs((AbstractRingPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INTERIOR:
				setInterior((AbstractRingPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE:
				setIntegerValue((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				setIntegerValueList((List<BigInteger>)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__INVERSE_FLATTENING:
				setInverseFlattening((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ISOLATED:
				setIsolated((IsolatedPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__IS_SPHERE:
				setIsSphere((IsSphereType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE:
				setLabelStyle((LabelStylePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE1:
				setLabelStyle1((LabelStyleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS:
				setLinearCS((LinearCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS_REF:
				setLinearCSRef((LinearCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_MEMBER:
				setLineStringMember((LineStringPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_PROPERTY:
				setLineStringProperty((LineStringPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				setLineStringSegment((LineStringSegmentType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LOCATION_KEY_WORD:
				setLocationKeyWord((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__LOCATION_STRING:
				setLocationString((StringOrRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MAPPING_RULE:
				setMappingRule((StringOrRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				setMaximalComplex((TopoComplexMemberType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MAXIMUM_OCCURS:
				setMaximumOccurs((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEASURE_DESCRIPTION:
				setMeasureDescription((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEMBER:
				setMember((AssociationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEMBERS:
				setMembers((ArrayAssociationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_ID:
				setMeridianID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_NAME:
				setMeridianName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__META_DATA_PROPERTY:
				setMetaDataProperty((MetaDataPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__METHOD_FORMULA:
				setMethodFormula((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__METHOD_ID:
				setMethodID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__METHOD_NAME:
				setMethodName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MINIMUM_OCCURS:
				setMinimumOccurs((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MINUTES:
				setMinutes((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MODIFIED_COORDINATE:
				setModifiedCoordinate((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				setMovingObjectStatus((MovingObjectStatusType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				setMultiCenterLineOf((MultiCurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_OF:
				setMultiCenterOf((MultiPointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_COVERAGE:
				setMultiCoverage((MultiSurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE:
				setMultiCurve((MultiCurveType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				setMultiCurveCoverage((MultiCurveCoverageType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				setMultiCurveDomain((MultiCurveDomainType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				setMultiCurveProperty((MultiCurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_EDGE_OF:
				setMultiEdgeOf((MultiCurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_EXTENT_OF:
				setMultiExtentOf((MultiSurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				setMultiGeometryProperty((MultiGeometryPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_LINE_STRING:
				setMultiLineString((MultiLineStringType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_LOCATION:
				setMultiLocation((MultiPointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT:
				setMultiPoint((MultiPointType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				setMultiPointCoverage((MultiPointCoverageType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				setMultiPointDomain((MultiPointDomainType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				setMultiPointProperty((MultiPointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POLYGON:
				setMultiPolygon((MultiPolygonType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POSITION:
				setMultiPosition((MultiPointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID:
				setMultiSolid((MultiSolidType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				setMultiSolidCoverage((MultiSolidCoverageType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				setMultiSolidDomain((MultiSolidDomainType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				setMultiSolidProperty((MultiSolidPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE:
				setMultiSurface((MultiSurfaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				setMultiSurfaceCoverage((MultiSurfaceCoverageType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				setMultiSurfaceDomain((MultiSurfaceDomainType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				setMultiSurfaceProperty((MultiSurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__NODE:
				setNode((NodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__NULL:
				setNull(newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				setObliqueCartesianCS((ObliqueCartesianCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				setObliqueCartesianCSRef((ObliqueCartesianCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OFFSET_CURVE:
				setOffsetCurve((OffsetCurveType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD:
				setOperationMethod((OperationMethodType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD_REF:
				setOperationMethodRef((OperationMethodRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER:
				setOperationParameter((OperationParameterType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				setOperationParameterGroup((OperationParameterGroupType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				setOperationParameterGroupRef((OperationParameterRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				setOperationParameterRef((OperationParameterRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_REF:
				setOperationRef((OperationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_VERSION:
				setOperationVersion((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_CURVE:
				setOrientableCurve((OrientableCurveType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				setOrientableSurface((OrientableSurfaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ORIGIN:
				setOrigin((XMLGregorianCalendar)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((AbstractRingPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_ID:
				setParameterID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_NAME:
				setParameterName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE:
				setParameterValue((ParameterValueType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				setParameterValueGroup((ParameterValueGroupType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				setPassThroughOperation((PassThroughOperationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				setPassThroughOperationRef((PassThroughOperationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PATCHES:
				setPatches((SurfacePatchArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PIXEL_IN_CELL:
				setPixelInCell((PixelInCellType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT:
				setPoint((PointType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				setPointArrayProperty((PointArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBER:
				setPointMember((PointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBERS:
				setPointMembers((PointArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_PROPERTY:
				setPointProperty((PointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_REP:
				setPointRep((PointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS:
				setPolarCS((PolarCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS_REF:
				setPolarCSRef((PolarCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_MEMBER:
				setPolygonMember((PolygonPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCH:
				setPolygonPatch((PolygonPatchType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCHES:
				setPolygonPatches((PolygonPatchArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PROPERTY:
				setPolygonProperty((PolygonPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				setPolyhedralSurface((PolyhedralSurfaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE1:
				setSurface1((SurfaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POS:
				setPos((DirectPositionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POSITION:
				setPosition((PointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__POS_LIST:
				setPosList((DirectPositionListType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				setPrimeMeridianRef((PrimeMeridianRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PRIORITY_LOCATION:
				setPriorityLocation((PriorityLocationPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS:
				setProjectedCRS((ProjectedCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS_REF:
				setProjectedCRSRef((ProjectedCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY:
				setQuantity((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_EXTENT:
				setQuantityExtent((QuantityExtentType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_LIST:
				setQuantityList((MeasureOrNullListType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_TYPE:
				setQuantityType((StringOrRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RANGE_PARAMETERS:
				setRangeParameters((RangeParametersType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RANGE_SET:
				setRangeSet((RangeSetType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__REALIZATION_EPOCH:
				setRealizationEpoch((XMLGregorianCalendar)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTANGLE:
				setRectangle((RectangleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID:
				setRectifiedGrid((RectifiedGridType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				setRectifiedGridCoverage((RectifiedGridCoverageType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				setRectifiedGridDomain((RectifiedGridDomainType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				setReferenceSystemRef((ReferenceSystemRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				setRelativeInternalPositionalAccuracy((RelativeInternalPositionalAccuracyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__REMARKS:
				setRemarks((StringOrRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RESULT:
				setResult((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RESULT_OF:
				setResultOf((AssociationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__RING1:
				setRing1((RingType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				setRoughConversionToPreferredUnit((ConversionToPreferredUnitType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ROW_INDEX:
				setRowIndex((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SCOPE:
				setScope((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SECONDS:
				setSeconds((BigDecimal)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SEGMENTS:
				setSegments((CurveSegmentArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				setSemiMajorAxis((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SEMI_MINOR_AXIS:
				setSemiMinorAxis((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				setSingleOperationRef((SingleOperationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID1:
				setSolid1((SolidType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				setSolidArrayProperty((SolidArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBER:
				setSolidMember((SolidPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBERS:
				setSolidMembers((SolidArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_PROPERTY:
				setSolidProperty((SolidPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOURCE_CRS:
				setSourceCRS((CRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				setSourceDimensions((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SPHERE:
				setSphere((SphereType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS:
				setSphericalCS((SphericalCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS_REF:
				setSphericalCSRef((SphericalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SRS_ID:
				setSrsID((IdentifierType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SRS_NAME:
				setSrsName((CodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__STATUS:
				setStatus((StringOrRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__STYLE1:
				setStyle1((StyleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SUB_COMPLEX:
				setSubComplex((TopoComplexMemberType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((TargetPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TARGET:
				setTarget((TargetPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SUPER_COMPLEX:
				setSuperComplex((TopoComplexMemberType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				setSurfaceArrayProperty((SurfaceArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBER:
				setSurfaceMember((SurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBERS:
				setSurfaceMembers((SurfaceArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PROPERTY:
				setSurfaceProperty((SurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__SYMBOL:
				setSymbol((SymbolType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TARGET_CRS:
				setTargetCRS((CRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TARGET_DIMENSIONS:
				setTargetDimensions((BigInteger)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS:
				setTemporalCRS((TemporalCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				setTemporalCRSRef((TemporalCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS:
				setTemporalCS((TemporalCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS_REF:
				setTemporalCSRef((TemporalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM:
				setTemporalDatum((TemporalDatumType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				setTemporalDatumRef((TemporalDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				setTemporalExtent((TimePeriodType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR:
				setTimeCalendar((TimeCalendarType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				setTimeCalendarEra((TimeCalendarEraType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_CLOCK:
				setTimeClock((TimeClockType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				setTimeCoordinateSystem((TimeCoordinateSystemType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_EDGE:
				setTimeEdge((TimeEdgeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_INSTANT:
				setTimeInstant((TimeInstantType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				setTimeInterval((TimeIntervalLengthType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_NODE:
				setTimeNode((TimeNodeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				setTimeOrdinalEra((TimeOrdinalEraType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				setTimeOrdinalReferenceSystem((TimeOrdinalReferenceSystemType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_PERIOD:
				setTimePeriod((TimePeriodType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_POSITION:
				setTimePosition((TimePositionType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				setTimeTopologyComplex((TimeTopologyComplexType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIN:
				setTin((TinType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				setTriangulatedSurface((TriangulatedSurfaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX:
				setTopoComplex((TopoComplexType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				setTopoComplexProperty((TopoComplexMemberType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE:
				setTopoCurve((TopoCurveType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				setTopoCurveProperty((TopoCurvePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE:
				setTopologyStyle((TopologyStylePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE1:
				setTopologyStyle1((TopologyStyleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT:
				setTopoPoint((TopoPointType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				setTopoPointProperty((TopoPointPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				setTopoPrimitiveMember((TopoPrimitiveMemberType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				setTopoPrimitiveMembers((TopoPrimitiveArrayAssociationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SOLID:
				setTopoSolid((TopoSolidType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE:
				setTopoSurface((TopoSurfaceType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				setTopoSurfaceProperty((TopoSurfacePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				setTopoVolumeProperty((TopoVolumePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRACK:
				setTrack((TrackType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION:
				setTransformation((TransformationType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION_REF:
				setTransformationRef((TransformationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE:
				setTriangle((TriangleType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE_PATCHES:
				setTrianglePatches((TrianglePatchArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TUPLE_LIST:
				setTupleList((CoordinatesType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure((UnitOfMeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS:
				setUserDefinedCS((UserDefinedCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				setUserDefinedCSRef((UserDefinedCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_AXIS:
				setUsesAxis((CoordinateSystemAxisRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_CS:
				setUsesCS((CoordinateSystemRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOID:
				setUsesEllipsoid((EllipsoidRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				setUsesEllipsoidalCS((EllipsoidalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				setUsesEngineeringDatum((EngineeringDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_IMAGE_DATUM:
				setUsesImageDatum((ImageDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_METHOD:
				setUsesMethod((OperationMethodRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_OPERATION:
				setUsesOperation((OperationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_PARAMETER:
				setUsesParameter((AbstractGeneralOperationParameterRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				setUsesPrimeMeridian((PrimeMeridianRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				setUsesSingleOperation((SingleOperationRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_SPHERICAL_CS:
				setUsesSphericalCS((SphericalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				setUsesTemporalDatum((TemporalDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_VALUE:
				setUsesValue((ParameterValueType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_CS:
				setUsesVerticalCS((VerticalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				setUsesVerticalDatum((VerticalDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__USING:
				setUsing((FeaturePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALID_AREA:
				setValidArea((ExtentType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE:
				setValue((MeasureType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_ARRAY:
				setValueArray((ValueArrayType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENT:
				setValueComponent((ValuePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENTS:
				setValueComponents((ValueArrayPropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_FILE:
				setValueFile((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_LIST:
				setValueList((MeasureListType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				setValueOfParameter((OperationParameterRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_PROPERTY:
				setValueProperty((ValuePropertyType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUES_OF_GROUP:
				setValuesOfGroup((OperationParameterGroupRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VECTOR:
				setVector((VectorType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERSION:
				setVersion((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS:
				setVerticalCRS((VerticalCRSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS_REF:
				setVerticalCRSRef((VerticalCRSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS:
				setVerticalCS((VerticalCSType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS_REF:
				setVerticalCSRef((VerticalCSRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM:
				setVerticalDatum((VerticalDatumType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				setVerticalDatumRef((VerticalDatumRefType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_TYPE:
				setVerticalDatumType((VerticalDatumTypeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_EXTENT:
				setVerticalExtent((EnvelopeType)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__ID:
				setId((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__REMOTE_SCHEMA:
				setRemoteSchema((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform((String)newValue);
				return;
			case GmlPackage.DOCUMENT_ROOT__UOM:
				setUom((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GmlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case GmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case GmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION:
				setDefinition((DefinitionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				setAbsoluteExternalPositionalAccuracy((AbsoluteExternalPositionalAccuracyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				setAbstractGeneralOperationParameterRef((AbstractGeneralOperationParameterRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__AFFINE_PLACEMENT:
				setAffinePlacement((AffinePlacementType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ANCHOR_POINT:
				setAnchorPoint((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ANGLE:
				setAngle((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBER:
				setFeatureMember((FeaturePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC:
				setArc((ArcType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING:
				setArcString((ArcStringType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_BULGE:
				setArcByBulge((ArcByBulgeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				setArcStringByBulge((ArcStringByBulgeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				setArcByCenterPoint((ArcByCenterPointType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ARRAY:
				setArray((ArrayType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__AXIS_ABBREV:
				setAxisAbbrev((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__AXIS_DIRECTION:
				setAxisDirection((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__AXIS_ID:
				setAxisID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BAG:
				setBag((BagType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_CRS:
				setBaseCRS((CoordinateReferenceSystemRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_CURVE:
				setBaseCurve((CurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_SURFACE:
				setBaseSurface((SurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BASE_UNIT:
				setBaseUnit((BaseUnitType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__UNIT_DEFINITION:
				setUnitDefinition((UnitDefinitionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BEZIER:
				setBezier((BezierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BSPLINE:
				setBSpline((BSplineType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN:
				setBoolean(BOOLEAN_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_LIST:
				setBooleanList(BOOLEAN_LIST_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOUNDED_BY:
				setBoundedBy((BoundingShapeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				setBoundingBox((EnvelopeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_POLYGON:
				setBoundingPolygon((PolygonType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS:
				setCartesianCS((CartesianCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS_REF:
				setCartesianCSRef((CartesianCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATALOG_SYMBOL:
				setCatalogSymbol((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY:
				setCategory((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_EXTENT:
				setCategoryExtent((CategoryExtentType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_LIST:
				setCategoryList((CodeOrNullListType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CENTER_LINE_OF:
				setCenterLineOf((CurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CENTER_OF:
				setCenterOf((PointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CIRCLE:
				setCircle((CircleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				setCircleByCenterPoint((CircleByCenterPointType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CLOTHOID:
				setClothoid((ClothoidType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COLUMN_INDEX:
				setColumnIndex(COLUMN_INDEX_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPASS_POINT:
				setCompassPoint(COMPASS_POINT_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_CURVE:
				setCompositeCurve((CompositeCurveType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SOLID:
				setCompositeSolid((CompositeSolidType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SURFACE:
				setCompositeSurface((CompositeSurfaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				setCompositeValue((CompositeValueType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS:
				setCompoundCRS((CompoundCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS_REF:
				setCompoundCRSRef((CompoundCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION:
				setConcatenatedOperation((ConcatenatedOperationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				setConcatenatedOperationRef((ConcatenatedOperationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONE:
				setCone((ConeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONTAINER:
				setContainer((ContainerPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				setConventionalUnit((ConventionalUnitType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION:
				setConversion((ConversionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_REF:
				setConversionRef((ConversionRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				setConversionToPreferredUnit((ConversionToPreferredUnitType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORD:
				setCoord((CoordType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_ID:
				setCoordinateOperationID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_NAME:
				setCoordinateOperationName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__NAME:
				setName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				setCoordinateOperationRef((CoordinateOperationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM_REF:
				setCoordinateReferenceSystemRef((CoordinateReferenceSystemRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATES:
				setCoordinates((CoordinatesType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				setCoordinateSystemAxis((CoordinateSystemAxisType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				setCoordinateSystemAxisRef((CoordinateSystemAxisRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				setCoordinateSystemRef((CoordinateSystemRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__COUNT_EXTENT:
				setCountExtent(COUNT_EXTENT_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__COUNT_LIST:
				setCountList(COUNT_LIST_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE:
				setCovariance(COVARIANCE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE_MATRIX:
				setCovarianceMatrix((CovarianceMatrixType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__COVERAGE_FUNCTION:
				setCoverageFunction((CoverageFunctionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CRS_REF:
				setCrsRef((CRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CS_ID:
				setCsID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CS_NAME:
				setCsName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CUBIC_SPLINE:
				setCubicSpline((CubicSplineType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE1:
				setCurve1((CurveType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				setCurveArrayProperty((CurveArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBER:
				setCurveMember((CurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBERS:
				setCurveMembers((CurveArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CURVE_PROPERTY:
				setCurveProperty((CurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CYLINDER:
				setCylinder((CylinderType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS:
				setCylindricalCS((CylindricalCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				setCylindricalCSRef((CylindricalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATA_BLOCK:
				setDataBlock((DataBlockType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATA_SOURCE:
				setDataSource((StringOrRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATUM_ID:
				setDatumID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATUM_NAME:
				setDatumName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DATUM_REF:
				setDatumRef((DatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DECIMAL_MINUTES:
				setDecimalMinutes(DECIMAL_MINUTES_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				setDefaultStyle((DefaultStylePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				setDefinedByConversion((GeneralConversionRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_COLLECTION:
				setDefinitionCollection((DictionaryType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_MEMBER:
				setDefinitionMember((DictionaryEntryType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY_ENTRY:
				setDictionaryEntry((DictionaryEntryType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_REF:
				setDefinitionRef((ReferenceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DEGREES:
				setDegrees((DegreesType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				setDerivationUnitTerm((DerivationUnitTermType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS:
				setDerivedCRS((DerivedCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_REF:
				setDerivedCRSRef((DerivedCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				setDerivedCRSType((DerivedCRSTypeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_UNIT:
				setDerivedUnit((DerivedUnitType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((StringOrRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY:
				setDictionary((DictionaryType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_EDGE:
				setDirectedEdge((DirectedEdgePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_FACE:
				setDirectedFace((DirectedFacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_NODE:
				setDirectedNode((DirectedNodePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				setDirectedObservation((DirectedObservationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OBSERVATION:
				setObservation((ObservationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				setDirectedObservationAtDistance((DirectedObservationAtDistanceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				setDirectedTopoSolid((DirectedTopoSolidPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTION:
				setDirection((DirectionPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DIRECTION_VECTOR:
				setDirectionVector((DirectionVectorType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE:
				setDmsAngle((DMSAngleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				setDmsAngleValue((DMSAngleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DOMAIN_SET:
				setDomainSet((DomainSetType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__DOUBLE_OR_NULL_TUPLE_LIST:
				setDoubleOrNullTupleList(DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__EDGE:
				setEdge((EdgeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__EDGE_OF:
				setEdgeOf((CurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID:
				setEllipsoid((EllipsoidType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				setEllipsoidalCS((EllipsoidalCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				setEllipsoidalCSRef((EllipsoidalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_ID:
				setEllipsoidID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_NAME:
				setEllipsoidName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_REF:
				setEllipsoidRef((EllipsoidRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS:
				setEngineeringCRS((EngineeringCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				setEngineeringCRSRef((EngineeringCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM:
				setEngineeringDatum((EngineeringDatumType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				setEngineeringDatumRef((EngineeringDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE:
				setEnvelope((EnvelopeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				setEnvelopeWithTimePeriod((EnvelopeWithTimePeriodType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__EXTENT_OF:
				setExtentOf((SurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__EXTERIOR:
				setExterior((AbstractRingPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FACE:
				setFace((FaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION1:
				setFeatureCollection1((FeatureCollectionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBERS:
				setFeatureMembers((FeatureArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_PROPERTY:
				setFeatureProperty((FeaturePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE:
				setFeatureStyle((FeatureStylePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE1:
				setFeatureStyle1((FeatureStyleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__FILE:
				setFile((FileType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				setGeneralConversionRef((GeneralConversionRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				setGeneralTransformationRef((GeneralTransformationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GENERIC_META_DATA:
				setGenericMetaData((GenericMetaDataType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS:
				setGeocentricCRS((GeocentricCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				setGeocentricCRSRef((GeocentricCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODESIC:
				setGeodesic((GeodesicType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODESIC_STRING:
				setGeodesicString((GeodesicStringType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM:
				setGeodeticDatum((GeodeticDatumType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				setGeodeticDatumRef((GeodeticDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				setGeographicCRS((GeographicCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				setGeographicCRSRef((GeographicCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				setGeometricComplex((GeometricComplexType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBER:
				setGeometryMember((GeometryPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				setGeometryMembers((GeometryArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE:
				setGeometryStyle((GeometryStylePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE1:
				setGeometryStyle1((GeometryStyleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE:
				setGraphStyle((GraphStylePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE1:
				setGraphStyle1((GraphStyleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				setGreenwichLongitude((AngleChoiceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID:
				setGrid((GridType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID_COVERAGE:
				setGridCoverage((GridCoverageType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID_DOMAIN:
				setGridDomain((GridDomainType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GRID_FUNCTION:
				setGridFunction((GridFunctionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GROUP_ID:
				setGroupID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__GROUP_NAME:
				setGroupName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__HISTORY:
				setHistory((HistoryPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS:
				setImageCRS((ImageCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS_REF:
				setImageCRSRef((ImageCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM:
				setImageDatum((ImageDatumType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM_REF:
				setImageDatumRef((ImageDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_CRS:
				setIncludesCRS((CoordinateReferenceSystemRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_ELEMENT:
				setIncludesElement((CovarianceElementType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_PARAMETER:
				setIncludesParameter((AbstractGeneralOperationParameterRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_VALUE:
				setIncludesValue((AbstractGeneralParameterValueType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INDEX_MAP:
				setIndexMap((IndexMapType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INDIRECT_ENTRY:
				setIndirectEntry((IndirectEntryType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				setInnerBoundaryIs((AbstractRingPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INTERIOR:
				setInterior((AbstractRingPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE:
				setIntegerValue(INTEGER_VALUE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				setIntegerValueList(INTEGER_VALUE_LIST_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__INVERSE_FLATTENING:
				setInverseFlattening((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ISOLATED:
				setIsolated((IsolatedPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__IS_SPHERE:
				setIsSphere(IS_SPHERE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE:
				setLabelStyle((LabelStylePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE1:
				setLabelStyle1((LabelStyleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS:
				setLinearCS((LinearCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS_REF:
				setLinearCSRef((LinearCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_MEMBER:
				setLineStringMember((LineStringPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_PROPERTY:
				setLineStringProperty((LineStringPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				setLineStringSegment((LineStringSegmentType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LOCATION_KEY_WORD:
				setLocationKeyWord((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__LOCATION_STRING:
				setLocationString((StringOrRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MAPPING_RULE:
				setMappingRule((StringOrRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				setMaximalComplex((TopoComplexMemberType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MAXIMUM_OCCURS:
				setMaximumOccurs(MAXIMUM_OCCURS_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEASURE:
				setMeasure((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEASURE_DESCRIPTION:
				setMeasureDescription((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEMBER:
				setMember((AssociationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MEMBERS:
				setMembers((ArrayAssociationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_ID:
				setMeridianID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_NAME:
				setMeridianName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__META_DATA_PROPERTY:
				setMetaDataProperty((MetaDataPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__METHOD_FORMULA:
				setMethodFormula((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__METHOD_ID:
				setMethodID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__METHOD_NAME:
				setMethodName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MINIMUM_OCCURS:
				setMinimumOccurs(MINIMUM_OCCURS_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__MINUTES:
				setMinutes(MINUTES_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__MODIFIED_COORDINATE:
				setModifiedCoordinate(MODIFIED_COORDINATE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				setMovingObjectStatus((MovingObjectStatusType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				setMultiCenterLineOf((MultiCurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_OF:
				setMultiCenterOf((MultiPointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_COVERAGE:
				setMultiCoverage((MultiSurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE:
				setMultiCurve((MultiCurveType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				setMultiCurveCoverage((MultiCurveCoverageType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				setMultiCurveDomain((MultiCurveDomainType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				setMultiCurveProperty((MultiCurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_EDGE_OF:
				setMultiEdgeOf((MultiCurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_EXTENT_OF:
				setMultiExtentOf((MultiSurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				setMultiGeometryProperty((MultiGeometryPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_LINE_STRING:
				setMultiLineString((MultiLineStringType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_LOCATION:
				setMultiLocation((MultiPointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT:
				setMultiPoint((MultiPointType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				setMultiPointCoverage((MultiPointCoverageType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				setMultiPointDomain((MultiPointDomainType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				setMultiPointProperty((MultiPointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POLYGON:
				setMultiPolygon((MultiPolygonType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POSITION:
				setMultiPosition((MultiPointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID:
				setMultiSolid((MultiSolidType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				setMultiSolidCoverage((MultiSolidCoverageType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				setMultiSolidDomain((MultiSolidDomainType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				setMultiSolidProperty((MultiSolidPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE:
				setMultiSurface((MultiSurfaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				setMultiSurfaceCoverage((MultiSurfaceCoverageType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				setMultiSurfaceDomain((MultiSurfaceDomainType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				setMultiSurfaceProperty((MultiSurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__NODE:
				setNode((NodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__NULL:
				setNull(NULL_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				setObliqueCartesianCS((ObliqueCartesianCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				setObliqueCartesianCSRef((ObliqueCartesianCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OFFSET_CURVE:
				setOffsetCurve((OffsetCurveType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD:
				setOperationMethod((OperationMethodType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD_REF:
				setOperationMethodRef((OperationMethodRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER:
				setOperationParameter((OperationParameterType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				setOperationParameterGroup((OperationParameterGroupType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				setOperationParameterGroupRef((OperationParameterRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				setOperationParameterRef((OperationParameterRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_REF:
				setOperationRef((OperationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_VERSION:
				setOperationVersion(OPERATION_VERSION_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_CURVE:
				setOrientableCurve((OrientableCurveType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				setOrientableSurface((OrientableSurfaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((AbstractRingPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_ID:
				setParameterID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_NAME:
				setParameterName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE:
				setParameterValue((ParameterValueType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				setParameterValueGroup((ParameterValueGroupType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				setPassThroughOperation((PassThroughOperationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				setPassThroughOperationRef((PassThroughOperationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PATCHES:
				setPatches((SurfacePatchArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PIXEL_IN_CELL:
				setPixelInCell((PixelInCellType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT:
				setPoint((PointType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				setPointArrayProperty((PointArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBER:
				setPointMember((PointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBERS:
				setPointMembers((PointArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_PROPERTY:
				setPointProperty((PointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POINT_REP:
				setPointRep((PointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS:
				setPolarCS((PolarCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS_REF:
				setPolarCSRef((PolarCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_MEMBER:
				setPolygonMember((PolygonPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCH:
				setPolygonPatch((PolygonPatchType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCHES:
				setPolygonPatches((PolygonPatchArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PROPERTY:
				setPolygonProperty((PolygonPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				setPolyhedralSurface((PolyhedralSurfaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE1:
				setSurface1((SurfaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POS:
				setPos((DirectPositionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POSITION:
				setPosition((PointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__POS_LIST:
				setPosList((DirectPositionListType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN:
				setPrimeMeridian((PrimeMeridianType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				setPrimeMeridianRef((PrimeMeridianRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PRIORITY_LOCATION:
				setPriorityLocation((PriorityLocationPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS:
				setProjectedCRS((ProjectedCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS_REF:
				setProjectedCRSRef((ProjectedCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY:
				setQuantity((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_EXTENT:
				setQuantityExtent((QuantityExtentType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_LIST:
				setQuantityList((MeasureOrNullListType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_TYPE:
				setQuantityType((StringOrRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RANGE_PARAMETERS:
				setRangeParameters((RangeParametersType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RANGE_SET:
				setRangeSet((RangeSetType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__REALIZATION_EPOCH:
				setRealizationEpoch(REALIZATION_EPOCH_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTANGLE:
				setRectangle((RectangleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID:
				setRectifiedGrid((RectifiedGridType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				setRectifiedGridCoverage((RectifiedGridCoverageType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				setRectifiedGridDomain((RectifiedGridDomainType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				setReferenceSystemRef((ReferenceSystemRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				setRelativeInternalPositionalAccuracy((RelativeInternalPositionalAccuracyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__REMARKS:
				setRemarks((StringOrRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RESULT:
				setResult((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RESULT_OF:
				setResultOf((AssociationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__RING1:
				setRing1((RingType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				setRoughConversionToPreferredUnit((ConversionToPreferredUnitType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ROW_INDEX:
				setRowIndex(ROW_INDEX_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__SEGMENTS:
				setSegments((CurveSegmentArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				setSemiMajorAxis((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SEMI_MINOR_AXIS:
				setSemiMinorAxis((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				setSingleOperationRef((SingleOperationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID1:
				setSolid1((SolidType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				setSolidArrayProperty((SolidArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBER:
				setSolidMember((SolidPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBERS:
				setSolidMembers((SolidArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOLID_PROPERTY:
				setSolidProperty((SolidPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOURCE_CRS:
				setSourceCRS((CRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				setSourceDimensions(SOURCE_DIMENSIONS_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__SPHERE:
				setSphere((SphereType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS:
				setSphericalCS((SphericalCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS_REF:
				setSphericalCSRef((SphericalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SRS_ID:
				setSrsID((IdentifierType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SRS_NAME:
				setSrsName((CodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__STATUS:
				setStatus((StringOrRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__STYLE1:
				setStyle1((StyleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SUB_COMPLEX:
				setSubComplex((TopoComplexMemberType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((TargetPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TARGET:
				setTarget((TargetPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SUPER_COMPLEX:
				setSuperComplex((TopoComplexMemberType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				setSurfaceArrayProperty((SurfaceArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBER:
				setSurfaceMember((SurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBERS:
				setSurfaceMembers((SurfaceArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PROPERTY:
				setSurfaceProperty((SurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__SYMBOL:
				setSymbol((SymbolType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TARGET_CRS:
				setTargetCRS((CRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TARGET_DIMENSIONS:
				setTargetDimensions(TARGET_DIMENSIONS_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS:
				setTemporalCRS((TemporalCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				setTemporalCRSRef((TemporalCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS:
				setTemporalCS((TemporalCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS_REF:
				setTemporalCSRef((TemporalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM:
				setTemporalDatum((TemporalDatumType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				setTemporalDatumRef((TemporalDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				setTemporalExtent((TimePeriodType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR:
				setTimeCalendar((TimeCalendarType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				setTimeCalendarEra((TimeCalendarEraType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_CLOCK:
				setTimeClock((TimeClockType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				setTimeCoordinateSystem((TimeCoordinateSystemType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_EDGE:
				setTimeEdge((TimeEdgeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_INSTANT:
				setTimeInstant((TimeInstantType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				setTimeInterval((TimeIntervalLengthType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_NODE:
				setTimeNode((TimeNodeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				setTimeOrdinalEra((TimeOrdinalEraType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				setTimeOrdinalReferenceSystem((TimeOrdinalReferenceSystemType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_PERIOD:
				setTimePeriod((TimePeriodType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_POSITION:
				setTimePosition((TimePositionType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				setTimeTopologyComplex((TimeTopologyComplexType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TIN:
				setTin((TinType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				setTriangulatedSurface((TriangulatedSurfaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX:
				setTopoComplex((TopoComplexType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				setTopoComplexProperty((TopoComplexMemberType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE:
				setTopoCurve((TopoCurveType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				setTopoCurveProperty((TopoCurvePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE:
				setTopologyStyle((TopologyStylePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE1:
				setTopologyStyle1((TopologyStyleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT:
				setTopoPoint((TopoPointType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				setTopoPointProperty((TopoPointPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				setTopoPrimitiveMember((TopoPrimitiveMemberType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				setTopoPrimitiveMembers((TopoPrimitiveArrayAssociationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SOLID:
				setTopoSolid((TopoSolidType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE:
				setTopoSurface((TopoSurfaceType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				setTopoSurfaceProperty((TopoSurfacePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				setTopoVolumeProperty((TopoVolumePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRACK:
				setTrack((TrackType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION:
				setTransformation((TransformationType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION_REF:
				setTransformationRef((TransformationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE:
				setTriangle((TriangleType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE_PATCHES:
				setTrianglePatches((TrianglePatchArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__TUPLE_LIST:
				setTupleList((CoordinatesType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				setUnitOfMeasure((UnitOfMeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS:
				setUserDefinedCS((UserDefinedCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				setUserDefinedCSRef((UserDefinedCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_AXIS:
				setUsesAxis((CoordinateSystemAxisRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_CS:
				setUsesCS((CoordinateSystemRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOID:
				setUsesEllipsoid((EllipsoidRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				setUsesEllipsoidalCS((EllipsoidalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				setUsesEngineeringDatum((EngineeringDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				setUsesGeodeticDatum((GeodeticDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_IMAGE_DATUM:
				setUsesImageDatum((ImageDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_METHOD:
				setUsesMethod((OperationMethodRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_OPERATION:
				setUsesOperation((OperationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_PARAMETER:
				setUsesParameter((AbstractGeneralOperationParameterRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				setUsesPrimeMeridian((PrimeMeridianRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				setUsesSingleOperation((SingleOperationRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_SPHERICAL_CS:
				setUsesSphericalCS((SphericalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				setUsesTemporalDatum((TemporalDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_VALUE:
				setUsesValue((ParameterValueType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_CS:
				setUsesVerticalCS((VerticalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				setUsesVerticalDatum((VerticalDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__USING:
				setUsing((FeaturePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALID_AREA:
				setValidArea((ExtentType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALID_TIME:
				setValidTime((TimePrimitivePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE:
				setValue((MeasureType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_ARRAY:
				setValueArray((ValueArrayType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENT:
				setValueComponent((ValuePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENTS:
				setValueComponents((ValueArrayPropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_FILE:
				setValueFile(VALUE_FILE_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_LIST:
				setValueList((MeasureListType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				setValueOfParameter((OperationParameterRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUE_PROPERTY:
				setValueProperty((ValuePropertyType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VALUES_OF_GROUP:
				setValuesOfGroup((OperationParameterGroupRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VECTOR:
				setVector((VectorType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS:
				setVerticalCRS((VerticalCRSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS_REF:
				setVerticalCRSRef((VerticalCRSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS:
				setVerticalCS((VerticalCSType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS_REF:
				setVerticalCSRef((VerticalCSRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM:
				setVerticalDatum((VerticalDatumType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				setVerticalDatumRef((VerticalDatumRefType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_TYPE:
				setVerticalDatumType((VerticalDatumTypeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_EXTENT:
				setVerticalExtent((EnvelopeType)null);
				return;
			case GmlPackage.DOCUMENT_ROOT__ID:
				setId(ID_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__REMOTE_SCHEMA:
				setRemoteSchema(REMOTE_SCHEMA_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORM:
				setTransform(TRANSFORM_EDEFAULT);
				return;
			case GmlPackage.DOCUMENT_ROOT__UOM:
				setUom(UOM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GmlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case GmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case GmlPackage.DOCUMENT_ROOT__FEATURE:
				return getFeature() != null;
			case GmlPackage.DOCUMENT_ROOT__GML:
				return getGML() != null;
			case GmlPackage.DOCUMENT_ROOT__OBJECT:
				return getObject() != null;
			case GmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case GmlPackage.DOCUMENT_ROOT__CONTINUOUS_COVERAGE:
				return getContinuousCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION:
				return getCoordinateOperation() != null;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION:
				return getDefinition() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM:
				return getCoordinateReferenceSystem() != null;
			case GmlPackage.DOCUMENT_ROOT__CRS:
				return getCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM:
				return getReferenceSystem() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM:
				return getCoordinateSystem() != null;
			case GmlPackage.DOCUMENT_ROOT__CURVE:
				return getCurve() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_PRIMITIVE:
				return getGeometricPrimitive() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY:
				return getGeometry() != null;
			case GmlPackage.DOCUMENT_ROOT__CURVE_SEGMENT:
				return getCurveSegment() != null;
			case GmlPackage.DOCUMENT_ROOT__DATUM:
				return getDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__DISCRETE_COVERAGE:
				return getDiscreteCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION:
				return getFeatureCollection() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION:
				return getGeneralConversion() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation() != null;
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION:
				return getSingleOperation() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_DERIVED_CRS:
				return getGeneralDerivedCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_OPERATION_PARAMETER:
				return getGeneralOperationParameter() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_PARAMETER_VALUE:
				return getGeneralParameterValue() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION:
				return getGeneralTransformation() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_AGGREGATE:
				return getGeometricAggregate() != null;
			case GmlPackage.DOCUMENT_ROOT__GRIDDED_SURFACE:
				return getGriddedSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__PARAMETRIC_CURVE_SURFACE:
				return getParametricCurveSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PATCH:
				return getSurfacePatch() != null;
			case GmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				return getImplicitGeometry() != null;
			case GmlPackage.DOCUMENT_ROOT__META_DATA:
				return getMetaData() != null;
			case GmlPackage.DOCUMENT_ROOT__POSITIONAL_ACCURACY:
				return getPositionalAccuracy() != null;
			case GmlPackage.DOCUMENT_ROOT__REFERENCE:
				return getReference() != null;
			case GmlPackage.DOCUMENT_ROOT__RING:
				return getRing() != null;
			case GmlPackage.DOCUMENT_ROOT__SOLID:
				return getSolid() != null;
			case GmlPackage.DOCUMENT_ROOT__STRICT_ASSOCIATION:
				return getStrictAssociation() != null;
			case GmlPackage.DOCUMENT_ROOT__STYLE:
				return getStyle() != null;
			case GmlPackage.DOCUMENT_ROOT__SURFACE:
				return getSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_COMPLEX:
				return getTimeComplex() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_OBJECT:
				return getTimeObject() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_GEOMETRIC_PRIMITIVE:
				return getTimeGeometricPrimitive() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_PRIMITIVE:
				return getTimePrimitive() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_REFERENCE_SYSTEM:
				return getTimeReferenceSystem() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_SLICE:
				return getTimeSlice() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_PRIMITIVE:
				return getTimeTopologyPrimitive() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY:
				return getTopology() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE:
				return getTopoPrimitive() != null;
			case GmlPackage.DOCUMENT_ROOT__ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				return getAbsoluteExternalPositionalAccuracy() != null;
			case GmlPackage.DOCUMENT_ROOT__ABSTRACT_GENERAL_OPERATION_PARAMETER_REF:
				return getAbstractGeneralOperationParameterRef() != null;
			case GmlPackage.DOCUMENT_ROOT__AFFINE_PLACEMENT:
				return getAffinePlacement() != null;
			case GmlPackage.DOCUMENT_ROOT__ANCHOR_POINT:
				return getAnchorPoint() != null;
			case GmlPackage.DOCUMENT_ROOT__ANGLE:
				return getAngle() != null;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBER:
				return getFeatureMember() != null;
			case GmlPackage.DOCUMENT_ROOT__ARC:
				return getArc() != null;
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING:
				return getArcString() != null;
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_BULGE:
				return getArcByBulge() != null;
			case GmlPackage.DOCUMENT_ROOT__ARC_STRING_BY_BULGE:
				return getArcStringByBulge() != null;
			case GmlPackage.DOCUMENT_ROOT__ARC_BY_CENTER_POINT:
				return getArcByCenterPoint() != null;
			case GmlPackage.DOCUMENT_ROOT__ARRAY:
				return getArray() != null;
			case GmlPackage.DOCUMENT_ROOT__AXIS_ABBREV:
				return getAxisAbbrev() != null;
			case GmlPackage.DOCUMENT_ROOT__AXIS_DIRECTION:
				return getAxisDirection() != null;
			case GmlPackage.DOCUMENT_ROOT__AXIS_ID:
				return getAxisID() != null;
			case GmlPackage.DOCUMENT_ROOT__BAG:
				return getBag() != null;
			case GmlPackage.DOCUMENT_ROOT__BASE_CRS:
				return getBaseCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__BASE_CURVE:
				return getBaseCurve() != null;
			case GmlPackage.DOCUMENT_ROOT__BASE_SURFACE:
				return getBaseSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__BASE_UNIT:
				return getBaseUnit() != null;
			case GmlPackage.DOCUMENT_ROOT__UNIT_DEFINITION:
				return getUnitDefinition() != null;
			case GmlPackage.DOCUMENT_ROOT__BEZIER:
				return getBezier() != null;
			case GmlPackage.DOCUMENT_ROOT__BSPLINE:
				return getBSpline() != null;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN:
				return isBoolean() != BOOLEAN_EDEFAULT;
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_LIST:
				return BOOLEAN_LIST_EDEFAULT == null ? getBooleanList() != null : !BOOLEAN_LIST_EDEFAULT.equals(getBooleanList());
			case GmlPackage.DOCUMENT_ROOT__BOOLEAN_VALUE:
				return isBooleanValue() != BOOLEAN_VALUE_EDEFAULT;
			case GmlPackage.DOCUMENT_ROOT__BOUNDED_BY:
				return getBoundedBy() != null;
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return getBoundingBox() != null;
			case GmlPackage.DOCUMENT_ROOT__BOUNDING_POLYGON:
				return getBoundingPolygon() != null;
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS:
				return getCartesianCS() != null;
			case GmlPackage.DOCUMENT_ROOT__CARTESIAN_CS_REF:
				return getCartesianCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__CATALOG_SYMBOL:
				return getCatalogSymbol() != null;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY:
				return getCategory() != null;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_EXTENT:
				return getCategoryExtent() != null;
			case GmlPackage.DOCUMENT_ROOT__CATEGORY_LIST:
				return getCategoryList() != null;
			case GmlPackage.DOCUMENT_ROOT__CENTER_LINE_OF:
				return getCenterLineOf() != null;
			case GmlPackage.DOCUMENT_ROOT__CENTER_OF:
				return getCenterOf() != null;
			case GmlPackage.DOCUMENT_ROOT__CIRCLE:
				return getCircle() != null;
			case GmlPackage.DOCUMENT_ROOT__CIRCLE_BY_CENTER_POINT:
				return getCircleByCenterPoint() != null;
			case GmlPackage.DOCUMENT_ROOT__CLOTHOID:
				return getClothoid() != null;
			case GmlPackage.DOCUMENT_ROOT__COLUMN_INDEX:
				return COLUMN_INDEX_EDEFAULT == null ? getColumnIndex() != null : !COLUMN_INDEX_EDEFAULT.equals(getColumnIndex());
			case GmlPackage.DOCUMENT_ROOT__COMPASS_POINT:
				return getCompassPoint() != COMPASS_POINT_EDEFAULT;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_CURVE:
				return getCompositeCurve() != null;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SOLID:
				return getCompositeSolid() != null;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_SURFACE:
				return getCompositeSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__COMPOSITE_VALUE:
				return getCompositeValue() != null;
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS:
				return getCompoundCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__COMPOUND_CRS_REF:
				return getCompoundCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION:
				return getConcatenatedOperation() != null;
			case GmlPackage.DOCUMENT_ROOT__CONCATENATED_OPERATION_REF:
				return getConcatenatedOperationRef() != null;
			case GmlPackage.DOCUMENT_ROOT__CONE:
				return getCone() != null;
			case GmlPackage.DOCUMENT_ROOT__CONTAINER:
				return getContainer() != null;
			case GmlPackage.DOCUMENT_ROOT__CONVENTIONAL_UNIT:
				return getConventionalUnit() != null;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION:
				return getConversion() != null;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_REF:
				return getConversionRef() != null;
			case GmlPackage.DOCUMENT_ROOT__CONVERSION_TO_PREFERRED_UNIT:
				return getConversionToPreferredUnit() != null;
			case GmlPackage.DOCUMENT_ROOT__COORD:
				return getCoord() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_ID:
				return getCoordinateOperationID() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_NAME:
				return getCoordinateOperationName() != null;
			case GmlPackage.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_OPERATION_REF:
				return getCoordinateOperationRef() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_REFERENCE_SYSTEM_REF:
				return getCoordinateReferenceSystemRef() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATES:
				return getCoordinates() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS:
				return getCoordinateSystemAxis() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_AXIS_REF:
				return getCoordinateSystemAxisRef() != null;
			case GmlPackage.DOCUMENT_ROOT__COORDINATE_SYSTEM_REF:
				return getCoordinateSystemRef() != null;
			case GmlPackage.DOCUMENT_ROOT__COUNT:
				return COUNT_EDEFAULT == null ? getCount() != null : !COUNT_EDEFAULT.equals(getCount());
			case GmlPackage.DOCUMENT_ROOT__COUNT_EXTENT:
				return COUNT_EXTENT_EDEFAULT == null ? getCountExtent() != null : !COUNT_EXTENT_EDEFAULT.equals(getCountExtent());
			case GmlPackage.DOCUMENT_ROOT__COUNT_LIST:
				return COUNT_LIST_EDEFAULT == null ? getCountList() != null : !COUNT_LIST_EDEFAULT.equals(getCountList());
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE:
				return getCovariance() != COVARIANCE_EDEFAULT;
			case GmlPackage.DOCUMENT_ROOT__COVARIANCE_MATRIX:
				return getCovarianceMatrix() != null;
			case GmlPackage.DOCUMENT_ROOT__COVERAGE_FUNCTION:
				return getCoverageFunction() != null;
			case GmlPackage.DOCUMENT_ROOT__CRS_REF:
				return getCrsRef() != null;
			case GmlPackage.DOCUMENT_ROOT__CS_ID:
				return getCsID() != null;
			case GmlPackage.DOCUMENT_ROOT__CS_NAME:
				return getCsName() != null;
			case GmlPackage.DOCUMENT_ROOT__CUBIC_SPLINE:
				return getCubicSpline() != null;
			case GmlPackage.DOCUMENT_ROOT__CURVE1:
				return getCurve1() != null;
			case GmlPackage.DOCUMENT_ROOT__CURVE_ARRAY_PROPERTY:
				return getCurveArrayProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBER:
				return getCurveMember() != null;
			case GmlPackage.DOCUMENT_ROOT__CURVE_MEMBERS:
				return getCurveMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__CURVE_PROPERTY:
				return getCurveProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__CYLINDER:
				return getCylinder() != null;
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS:
				return getCylindricalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__CYLINDRICAL_CS_REF:
				return getCylindricalCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__DATA_BLOCK:
				return getDataBlock() != null;
			case GmlPackage.DOCUMENT_ROOT__DATA_SOURCE:
				return getDataSource() != null;
			case GmlPackage.DOCUMENT_ROOT__DATUM_ID:
				return getDatumID() != null;
			case GmlPackage.DOCUMENT_ROOT__DATUM_NAME:
				return getDatumName() != null;
			case GmlPackage.DOCUMENT_ROOT__DATUM_REF:
				return getDatumRef() != null;
			case GmlPackage.DOCUMENT_ROOT__DECIMAL_MINUTES:
				return DECIMAL_MINUTES_EDEFAULT == null ? getDecimalMinutes() != null : !DECIMAL_MINUTES_EDEFAULT.equals(getDecimalMinutes());
			case GmlPackage.DOCUMENT_ROOT__DEFAULT_STYLE:
				return getDefaultStyle() != null;
			case GmlPackage.DOCUMENT_ROOT__DEFINED_BY_CONVERSION:
				return getDefinedByConversion() != null;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_COLLECTION:
				return getDefinitionCollection() != null;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_MEMBER:
				return getDefinitionMember() != null;
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY_ENTRY:
				return getDictionaryEntry() != null;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_PROXY:
				return getDefinitionProxy() != null;
			case GmlPackage.DOCUMENT_ROOT__DEFINITION_REF:
				return getDefinitionRef() != null;
			case GmlPackage.DOCUMENT_ROOT__DEGREES:
				return getDegrees() != null;
			case GmlPackage.DOCUMENT_ROOT__DERIVATION_UNIT_TERM:
				return getDerivationUnitTerm() != null;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS:
				return getDerivedCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_REF:
				return getDerivedCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_CRS_TYPE:
				return getDerivedCRSType() != null;
			case GmlPackage.DOCUMENT_ROOT__DERIVED_UNIT:
				return getDerivedUnit() != null;
			case GmlPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case GmlPackage.DOCUMENT_ROOT__DICTIONARY:
				return getDictionary() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_EDGE:
				return getDirectedEdge() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_FACE:
				return getDirectedFace() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_NODE:
				return getDirectedNode() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION:
				return getDirectedObservation() != null;
			case GmlPackage.DOCUMENT_ROOT__OBSERVATION:
				return getObservation() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_OBSERVATION_AT_DISTANCE:
				return getDirectedObservationAtDistance() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTED_TOPO_SOLID:
				return getDirectedTopoSolid() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTION:
				return getDirection() != null;
			case GmlPackage.DOCUMENT_ROOT__DIRECTION_VECTOR:
				return getDirectionVector() != null;
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE:
				return getDmsAngle() != null;
			case GmlPackage.DOCUMENT_ROOT__DMS_ANGLE_VALUE:
				return getDmsAngleValue() != null;
			case GmlPackage.DOCUMENT_ROOT__DOMAIN_SET:
				return getDomainSet() != null;
			case GmlPackage.DOCUMENT_ROOT__DOUBLE_OR_NULL_TUPLE_LIST:
				return DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT == null ? getDoubleOrNullTupleList() != null : !DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT.equals(getDoubleOrNullTupleList());
			case GmlPackage.DOCUMENT_ROOT__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case GmlPackage.DOCUMENT_ROOT__EDGE:
				return getEdge() != null;
			case GmlPackage.DOCUMENT_ROOT__EDGE_OF:
				return getEdgeOf() != null;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID:
				return getEllipsoid() != null;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS:
				return getEllipsoidalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOIDAL_CS_REF:
				return getEllipsoidalCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_ID:
				return getEllipsoidID() != null;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_NAME:
				return getEllipsoidName() != null;
			case GmlPackage.DOCUMENT_ROOT__ELLIPSOID_REF:
				return getEllipsoidRef() != null;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS:
				return getEngineeringCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_CRS_REF:
				return getEngineeringCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM:
				return getEngineeringDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__ENGINEERING_DATUM_REF:
				return getEngineeringDatumRef() != null;
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE:
				return getEnvelope() != null;
			case GmlPackage.DOCUMENT_ROOT__ENVELOPE_WITH_TIME_PERIOD:
				return getEnvelopeWithTimePeriod() != null;
			case GmlPackage.DOCUMENT_ROOT__EXTENT_OF:
				return getExtentOf() != null;
			case GmlPackage.DOCUMENT_ROOT__EXTERIOR:
				return getExterior() != null;
			case GmlPackage.DOCUMENT_ROOT__FACE:
				return getFace() != null;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_COLLECTION1:
				return getFeatureCollection1() != null;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_MEMBERS:
				return getFeatureMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_PROPERTY:
				return getFeatureProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE:
				return getFeatureStyle() != null;
			case GmlPackage.DOCUMENT_ROOT__FEATURE_STYLE1:
				return getFeatureStyle1() != null;
			case GmlPackage.DOCUMENT_ROOT__FILE:
				return getFile() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_CONVERSION_REF:
				return getGeneralConversionRef() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERAL_TRANSFORMATION_REF:
				return getGeneralTransformationRef() != null;
			case GmlPackage.DOCUMENT_ROOT__GENERIC_META_DATA:
				return getGenericMetaData() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS:
				return getGeocentricCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOCENTRIC_CRS_REF:
				return getGeocentricCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__GEODESIC:
				return getGeodesic() != null;
			case GmlPackage.DOCUMENT_ROOT__GEODESIC_STRING:
				return getGeodesicString() != null;
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM:
				return getGeodeticDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__GEODETIC_DATUM_REF:
				return getGeodeticDatumRef() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS:
				return getGeographicCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOGRAPHIC_CRS_REF:
				return getGeographicCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRIC_COMPLEX:
				return getGeometricComplex() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBER:
				return getGeometryMember() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_MEMBERS:
				return getGeometryMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE:
				return getGeometryStyle() != null;
			case GmlPackage.DOCUMENT_ROOT__GEOMETRY_STYLE1:
				return getGeometryStyle1() != null;
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE:
				return getGraphStyle() != null;
			case GmlPackage.DOCUMENT_ROOT__GRAPH_STYLE1:
				return getGraphStyle1() != null;
			case GmlPackage.DOCUMENT_ROOT__GREENWICH_LONGITUDE:
				return getGreenwichLongitude() != null;
			case GmlPackage.DOCUMENT_ROOT__GRID:
				return getGrid() != null;
			case GmlPackage.DOCUMENT_ROOT__GRID_COVERAGE:
				return getGridCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__GRID_DOMAIN:
				return getGridDomain() != null;
			case GmlPackage.DOCUMENT_ROOT__GRID_FUNCTION:
				return getGridFunction() != null;
			case GmlPackage.DOCUMENT_ROOT__GROUP_ID:
				return getGroupID() != null;
			case GmlPackage.DOCUMENT_ROOT__GROUP_NAME:
				return getGroupName() != null;
			case GmlPackage.DOCUMENT_ROOT__HISTORY:
				return getHistory() != null;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS:
				return getImageCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_CRS_REF:
				return getImageCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM:
				return getImageDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__IMAGE_DATUM_REF:
				return getImageDatumRef() != null;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_CRS:
				return getIncludesCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_ELEMENT:
				return getIncludesElement() != null;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_PARAMETER:
				return getIncludesParameter() != null;
			case GmlPackage.DOCUMENT_ROOT__INCLUDES_VALUE:
				return getIncludesValue() != null;
			case GmlPackage.DOCUMENT_ROOT__INDEX_MAP:
				return getIndexMap() != null;
			case GmlPackage.DOCUMENT_ROOT__INDIRECT_ENTRY:
				return getIndirectEntry() != null;
			case GmlPackage.DOCUMENT_ROOT__INNER_BOUNDARY_IS:
				return getInnerBoundaryIs() != null;
			case GmlPackage.DOCUMENT_ROOT__INTERIOR:
				return getInterior() != null;
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE:
				return INTEGER_VALUE_EDEFAULT == null ? getIntegerValue() != null : !INTEGER_VALUE_EDEFAULT.equals(getIntegerValue());
			case GmlPackage.DOCUMENT_ROOT__INTEGER_VALUE_LIST:
				return INTEGER_VALUE_LIST_EDEFAULT == null ? getIntegerValueList() != null : !INTEGER_VALUE_LIST_EDEFAULT.equals(getIntegerValueList());
			case GmlPackage.DOCUMENT_ROOT__INVERSE_FLATTENING:
				return getInverseFlattening() != null;
			case GmlPackage.DOCUMENT_ROOT__ISOLATED:
				return getIsolated() != null;
			case GmlPackage.DOCUMENT_ROOT__IS_SPHERE:
				return getIsSphere() != IS_SPHERE_EDEFAULT;
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE:
				return getLabelStyle() != null;
			case GmlPackage.DOCUMENT_ROOT__LABEL_STYLE1:
				return getLabelStyle1() != null;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS:
				return getLinearCS() != null;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_CS_REF:
				return getLinearCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing() != null;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING:
				return getLineString() != null;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_MEMBER:
				return getLineStringMember() != null;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_PROPERTY:
				return getLineStringProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__LINE_STRING_SEGMENT:
				return getLineStringSegment() != null;
			case GmlPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case GmlPackage.DOCUMENT_ROOT__LOCATION_KEY_WORD:
				return getLocationKeyWord() != null;
			case GmlPackage.DOCUMENT_ROOT__LOCATION_STRING:
				return getLocationString() != null;
			case GmlPackage.DOCUMENT_ROOT__MAPPING_RULE:
				return getMappingRule() != null;
			case GmlPackage.DOCUMENT_ROOT__MAXIMAL_COMPLEX:
				return getMaximalComplex() != null;
			case GmlPackage.DOCUMENT_ROOT__MAXIMUM_OCCURS:
				return MAXIMUM_OCCURS_EDEFAULT == null ? getMaximumOccurs() != null : !MAXIMUM_OCCURS_EDEFAULT.equals(getMaximumOccurs());
			case GmlPackage.DOCUMENT_ROOT__MEASURE:
				return getMeasure() != null;
			case GmlPackage.DOCUMENT_ROOT__MEASURE_DESCRIPTION:
				return getMeasureDescription() != null;
			case GmlPackage.DOCUMENT_ROOT__MEMBER:
				return getMember() != null;
			case GmlPackage.DOCUMENT_ROOT__MEMBERS:
				return getMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_ID:
				return getMeridianID() != null;
			case GmlPackage.DOCUMENT_ROOT__MERIDIAN_NAME:
				return getMeridianName() != null;
			case GmlPackage.DOCUMENT_ROOT__META_DATA_PROPERTY:
				return getMetaDataProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__METHOD_FORMULA:
				return getMethodFormula() != null;
			case GmlPackage.DOCUMENT_ROOT__METHOD_ID:
				return getMethodID() != null;
			case GmlPackage.DOCUMENT_ROOT__METHOD_NAME:
				return getMethodName() != null;
			case GmlPackage.DOCUMENT_ROOT__MINIMUM_OCCURS:
				return MINIMUM_OCCURS_EDEFAULT == null ? getMinimumOccurs() != null : !MINIMUM_OCCURS_EDEFAULT.equals(getMinimumOccurs());
			case GmlPackage.DOCUMENT_ROOT__MINUTES:
				return MINUTES_EDEFAULT == null ? getMinutes() != null : !MINUTES_EDEFAULT.equals(getMinutes());
			case GmlPackage.DOCUMENT_ROOT__MODIFIED_COORDINATE:
				return MODIFIED_COORDINATE_EDEFAULT == null ? getModifiedCoordinate() != null : !MODIFIED_COORDINATE_EDEFAULT.equals(getModifiedCoordinate());
			case GmlPackage.DOCUMENT_ROOT__MOVING_OBJECT_STATUS:
				return getMovingObjectStatus() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_LINE_OF:
				return getMultiCenterLineOf() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CENTER_OF:
				return getMultiCenterOf() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_COVERAGE:
				return getMultiCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE:
				return getMultiCurve() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_COVERAGE:
				return getMultiCurveCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_DOMAIN:
				return getMultiCurveDomain() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_CURVE_PROPERTY:
				return getMultiCurveProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_EDGE_OF:
				return getMultiEdgeOf() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_EXTENT_OF:
				return getMultiExtentOf() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_GEOMETRY_PROPERTY:
				return getMultiGeometryProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_LINE_STRING:
				return getMultiLineString() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_LOCATION:
				return getMultiLocation() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT:
				return getMultiPoint() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_COVERAGE:
				return getMultiPointCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_DOMAIN:
				return getMultiPointDomain() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POINT_PROPERTY:
				return getMultiPointProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POLYGON:
				return getMultiPolygon() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_POSITION:
				return getMultiPosition() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID:
				return getMultiSolid() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_COVERAGE:
				return getMultiSolidCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_DOMAIN:
				return getMultiSolidDomain() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SOLID_PROPERTY:
				return getMultiSolidProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE:
				return getMultiSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_COVERAGE:
				return getMultiSurfaceCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_DOMAIN:
				return getMultiSurfaceDomain() != null;
			case GmlPackage.DOCUMENT_ROOT__MULTI_SURFACE_PROPERTY:
				return getMultiSurfaceProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__NODE:
				return getNode() != null;
			case GmlPackage.DOCUMENT_ROOT__NULL:
				return NULL_EDEFAULT == null ? getNull() != null : !NULL_EDEFAULT.equals(getNull());
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS:
				return getObliqueCartesianCS() != null;
			case GmlPackage.DOCUMENT_ROOT__OBLIQUE_CARTESIAN_CS_REF:
				return getObliqueCartesianCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__OFFSET_CURVE:
				return getOffsetCurve() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD:
				return getOperationMethod() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_METHOD_REF:
				return getOperationMethodRef() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER:
				return getOperationParameter() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP:
				return getOperationParameterGroup() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_GROUP_REF:
				return getOperationParameterGroupRef() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_PARAMETER_REF:
				return getOperationParameterRef() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_REF:
				return getOperationRef() != null;
			case GmlPackage.DOCUMENT_ROOT__OPERATION_VERSION:
				return OPERATION_VERSION_EDEFAULT == null ? getOperationVersion() != null : !OPERATION_VERSION_EDEFAULT.equals(getOperationVersion());
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_CURVE:
				return getOrientableCurve() != null;
			case GmlPackage.DOCUMENT_ROOT__ORIENTABLE_SURFACE:
				return getOrientableSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? getOrigin() != null : !ORIGIN_EDEFAULT.equals(getOrigin());
			case GmlPackage.DOCUMENT_ROOT__OUTER_BOUNDARY_IS:
				return getOuterBoundaryIs() != null;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_ID:
				return getParameterID() != null;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_NAME:
				return getParameterName() != null;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE:
				return getParameterValue() != null;
			case GmlPackage.DOCUMENT_ROOT__PARAMETER_VALUE_GROUP:
				return getParameterValueGroup() != null;
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION:
				return getPassThroughOperation() != null;
			case GmlPackage.DOCUMENT_ROOT__PASS_THROUGH_OPERATION_REF:
				return getPassThroughOperationRef() != null;
			case GmlPackage.DOCUMENT_ROOT__PATCHES:
				return getPatches() != null;
			case GmlPackage.DOCUMENT_ROOT__PIXEL_IN_CELL:
				return getPixelInCell() != null;
			case GmlPackage.DOCUMENT_ROOT__POINT:
				return getPoint() != null;
			case GmlPackage.DOCUMENT_ROOT__POINT_ARRAY_PROPERTY:
				return getPointArrayProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBER:
				return getPointMember() != null;
			case GmlPackage.DOCUMENT_ROOT__POINT_MEMBERS:
				return getPointMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__POINT_PROPERTY:
				return getPointProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__POINT_REP:
				return getPointRep() != null;
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS:
				return getPolarCS() != null;
			case GmlPackage.DOCUMENT_ROOT__POLAR_CS_REF:
				return getPolarCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon() != null;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_MEMBER:
				return getPolygonMember() != null;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCH:
				return getPolygonPatch() != null;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PATCHES:
				return getPolygonPatches() != null;
			case GmlPackage.DOCUMENT_ROOT__POLYGON_PROPERTY:
				return getPolygonProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__POLYHEDRAL_SURFACE:
				return getPolyhedralSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__SURFACE1:
				return getSurface1() != null;
			case GmlPackage.DOCUMENT_ROOT__POS:
				return getPos() != null;
			case GmlPackage.DOCUMENT_ROOT__POSITION:
				return getPosition() != null;
			case GmlPackage.DOCUMENT_ROOT__POS_LIST:
				return getPosList() != null;
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN:
				return getPrimeMeridian() != null;
			case GmlPackage.DOCUMENT_ROOT__PRIME_MERIDIAN_REF:
				return getPrimeMeridianRef() != null;
			case GmlPackage.DOCUMENT_ROOT__PRIORITY_LOCATION:
				return getPriorityLocation() != null;
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS:
				return getProjectedCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__PROJECTED_CRS_REF:
				return getProjectedCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY:
				return getQuantity() != null;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_EXTENT:
				return getQuantityExtent() != null;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_LIST:
				return getQuantityList() != null;
			case GmlPackage.DOCUMENT_ROOT__QUANTITY_TYPE:
				return getQuantityType() != null;
			case GmlPackage.DOCUMENT_ROOT__RANGE_PARAMETERS:
				return getRangeParameters() != null;
			case GmlPackage.DOCUMENT_ROOT__RANGE_SET:
				return getRangeSet() != null;
			case GmlPackage.DOCUMENT_ROOT__REALIZATION_EPOCH:
				return REALIZATION_EPOCH_EDEFAULT == null ? getRealizationEpoch() != null : !REALIZATION_EPOCH_EDEFAULT.equals(getRealizationEpoch());
			case GmlPackage.DOCUMENT_ROOT__RECTANGLE:
				return getRectangle() != null;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID:
				return getRectifiedGrid() != null;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_COVERAGE:
				return getRectifiedGridCoverage() != null;
			case GmlPackage.DOCUMENT_ROOT__RECTIFIED_GRID_DOMAIN:
				return getRectifiedGridDomain() != null;
			case GmlPackage.DOCUMENT_ROOT__REFERENCE_SYSTEM_REF:
				return getReferenceSystemRef() != null;
			case GmlPackage.DOCUMENT_ROOT__RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				return getRelativeInternalPositionalAccuracy() != null;
			case GmlPackage.DOCUMENT_ROOT__REMARKS:
				return getRemarks() != null;
			case GmlPackage.DOCUMENT_ROOT__RESULT:
				return getResult() != null;
			case GmlPackage.DOCUMENT_ROOT__RESULT_OF:
				return getResultOf() != null;
			case GmlPackage.DOCUMENT_ROOT__RING1:
				return getRing1() != null;
			case GmlPackage.DOCUMENT_ROOT__ROUGH_CONVERSION_TO_PREFERRED_UNIT:
				return getRoughConversionToPreferredUnit() != null;
			case GmlPackage.DOCUMENT_ROOT__ROW_INDEX:
				return ROW_INDEX_EDEFAULT == null ? getRowIndex() != null : !ROW_INDEX_EDEFAULT.equals(getRowIndex());
			case GmlPackage.DOCUMENT_ROOT__SCOPE:
				return SCOPE_EDEFAULT == null ? getScope() != null : !SCOPE_EDEFAULT.equals(getScope());
			case GmlPackage.DOCUMENT_ROOT__SECOND_DEFINING_PARAMETER:
				return getSecondDefiningParameter() != null;
			case GmlPackage.DOCUMENT_ROOT__SECONDS:
				return SECONDS_EDEFAULT == null ? getSeconds() != null : !SECONDS_EDEFAULT.equals(getSeconds());
			case GmlPackage.DOCUMENT_ROOT__SEGMENTS:
				return getSegments() != null;
			case GmlPackage.DOCUMENT_ROOT__SEMI_MAJOR_AXIS:
				return getSemiMajorAxis() != null;
			case GmlPackage.DOCUMENT_ROOT__SEMI_MINOR_AXIS:
				return getSemiMinorAxis() != null;
			case GmlPackage.DOCUMENT_ROOT__SINGLE_OPERATION_REF:
				return getSingleOperationRef() != null;
			case GmlPackage.DOCUMENT_ROOT__SOLID1:
				return getSolid1() != null;
			case GmlPackage.DOCUMENT_ROOT__SOLID_ARRAY_PROPERTY:
				return getSolidArrayProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBER:
				return getSolidMember() != null;
			case GmlPackage.DOCUMENT_ROOT__SOLID_MEMBERS:
				return getSolidMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__SOLID_PROPERTY:
				return getSolidProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__SOURCE_CRS:
				return getSourceCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__SOURCE_DIMENSIONS:
				return SOURCE_DIMENSIONS_EDEFAULT == null ? getSourceDimensions() != null : !SOURCE_DIMENSIONS_EDEFAULT.equals(getSourceDimensions());
			case GmlPackage.DOCUMENT_ROOT__SPHERE:
				return getSphere() != null;
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS:
				return getSphericalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__SPHERICAL_CS_REF:
				return getSphericalCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__SRS_ID:
				return getSrsID() != null;
			case GmlPackage.DOCUMENT_ROOT__SRS_NAME:
				return getSrsName() != null;
			case GmlPackage.DOCUMENT_ROOT__STATUS:
				return getStatus() != null;
			case GmlPackage.DOCUMENT_ROOT__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? getStringValue() != null : !STRING_VALUE_EDEFAULT.equals(getStringValue());
			case GmlPackage.DOCUMENT_ROOT__STYLE1:
				return getStyle1() != null;
			case GmlPackage.DOCUMENT_ROOT__SUB_COMPLEX:
				return getSubComplex() != null;
			case GmlPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject() != null;
			case GmlPackage.DOCUMENT_ROOT__TARGET:
				return getTarget() != null;
			case GmlPackage.DOCUMENT_ROOT__SUPER_COMPLEX:
				return getSuperComplex() != null;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_ARRAY_PROPERTY:
				return getSurfaceArrayProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBER:
				return getSurfaceMember() != null;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_MEMBERS:
				return getSurfaceMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__SURFACE_PROPERTY:
				return getSurfaceProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__SYMBOL:
				return getSymbol() != null;
			case GmlPackage.DOCUMENT_ROOT__TARGET_CRS:
				return getTargetCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__TARGET_DIMENSIONS:
				return TARGET_DIMENSIONS_EDEFAULT == null ? getTargetDimensions() != null : !TARGET_DIMENSIONS_EDEFAULT.equals(getTargetDimensions());
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS:
				return getTemporalCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CRS_REF:
				return getTemporalCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS:
				return getTemporalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_CS_REF:
				return getTemporalCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM:
				return getTemporalDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_DATUM_REF:
				return getTemporalDatumRef() != null;
			case GmlPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				return getTemporalExtent() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR:
				return getTimeCalendar() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_CALENDAR_ERA:
				return getTimeCalendarEra() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_CLOCK:
				return getTimeClock() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_COORDINATE_SYSTEM:
				return getTimeCoordinateSystem() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_EDGE:
				return getTimeEdge() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_INSTANT:
				return getTimeInstant() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_INTERVAL:
				return getTimeInterval() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_NODE:
				return getTimeNode() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_ERA:
				return getTimeOrdinalEra() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_ORDINAL_REFERENCE_SYSTEM:
				return getTimeOrdinalReferenceSystem() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_PERIOD:
				return getTimePeriod() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_POSITION:
				return getTimePosition() != null;
			case GmlPackage.DOCUMENT_ROOT__TIME_TOPOLOGY_COMPLEX:
				return getTimeTopologyComplex() != null;
			case GmlPackage.DOCUMENT_ROOT__TIN:
				return getTin() != null;
			case GmlPackage.DOCUMENT_ROOT__TRIANGULATED_SURFACE:
				return getTriangulatedSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX:
				return getTopoComplex() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_COMPLEX_PROPERTY:
				return getTopoComplexProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE:
				return getTopoCurve() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_CURVE_PROPERTY:
				return getTopoCurveProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE:
				return getTopologyStyle() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPOLOGY_STYLE1:
				return getTopologyStyle1() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT:
				return getTopoPoint() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_POINT_PROPERTY:
				return getTopoPointProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBER:
				return getTopoPrimitiveMember() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_PRIMITIVE_MEMBERS:
				return getTopoPrimitiveMembers() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SOLID:
				return getTopoSolid() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE:
				return getTopoSurface() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_SURFACE_PROPERTY:
				return getTopoSurfaceProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME:
				return getTopoVolume() != null;
			case GmlPackage.DOCUMENT_ROOT__TOPO_VOLUME_PROPERTY:
				return getTopoVolumeProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__TRACK:
				return getTrack() != null;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION:
				return getTransformation() != null;
			case GmlPackage.DOCUMENT_ROOT__TRANSFORMATION_REF:
				return getTransformationRef() != null;
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE:
				return getTriangle() != null;
			case GmlPackage.DOCUMENT_ROOT__TRIANGLE_PATCHES:
				return getTrianglePatches() != null;
			case GmlPackage.DOCUMENT_ROOT__TUPLE_LIST:
				return getTupleList() != null;
			case GmlPackage.DOCUMENT_ROOT__UNIT_OF_MEASURE:
				return getUnitOfMeasure() != null;
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS:
				return getUserDefinedCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USER_DEFINED_CS_REF:
				return getUserDefinedCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_AXIS:
				return getUsesAxis() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_CARTESIAN_CS:
				return getUsesCartesianCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_CS:
				return getUsesCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOID:
				return getUsesEllipsoid() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_ELLIPSOIDAL_CS:
				return getUsesEllipsoidalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_ENGINEERING_DATUM:
				return getUsesEngineeringDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_GEODETIC_DATUM:
				return getUsesGeodeticDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_IMAGE_DATUM:
				return getUsesImageDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_METHOD:
				return getUsesMethod() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_OBLIQUE_CARTESIAN_CS:
				return getUsesObliqueCartesianCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_OPERATION:
				return getUsesOperation() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_PARAMETER:
				return getUsesParameter() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_PRIME_MERIDIAN:
				return getUsesPrimeMeridian() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_SINGLE_OPERATION:
				return getUsesSingleOperation() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_SPHERICAL_CS:
				return getUsesSphericalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_CS:
				return getUsesTemporalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_TEMPORAL_DATUM:
				return getUsesTemporalDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_VALUE:
				return getUsesValue() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_CS:
				return getUsesVerticalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__USES_VERTICAL_DATUM:
				return getUsesVerticalDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__USING:
				return getUsing() != null;
			case GmlPackage.DOCUMENT_ROOT__VALID_AREA:
				return getValidArea() != null;
			case GmlPackage.DOCUMENT_ROOT__VALID_TIME:
				return getValidTime() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUE:
				return getValue() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUE_ARRAY:
				return getValueArray() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENT:
				return getValueComponent() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUE_COMPONENTS:
				return getValueComponents() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUE_FILE:
				return VALUE_FILE_EDEFAULT == null ? getValueFile() != null : !VALUE_FILE_EDEFAULT.equals(getValueFile());
			case GmlPackage.DOCUMENT_ROOT__VALUE_LIST:
				return getValueList() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUE_OF_PARAMETER:
				return getValueOfParameter() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUE_PROPERTY:
				return getValueProperty() != null;
			case GmlPackage.DOCUMENT_ROOT__VALUES_OF_GROUP:
				return getValuesOfGroup() != null;
			case GmlPackage.DOCUMENT_ROOT__VECTOR:
				return getVector() != null;
			case GmlPackage.DOCUMENT_ROOT__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS:
				return getVerticalCRS() != null;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CRS_REF:
				return getVerticalCRSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS:
				return getVerticalCS() != null;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_CS_REF:
				return getVerticalCSRef() != null;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM:
				return getVerticalDatum() != null;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_REF:
				return getVerticalDatumRef() != null;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_DATUM_TYPE:
				return getVerticalDatumType() != null;
			case GmlPackage.DOCUMENT_ROOT__VERTICAL_EXTENT:
				return getVerticalExtent() != null;
			case GmlPackage.DOCUMENT_ROOT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GmlPackage.DOCUMENT_ROOT__REMOTE_SCHEMA:
				return REMOTE_SCHEMA_EDEFAULT == null ? remoteSchema != null : !REMOTE_SCHEMA_EDEFAULT.equals(remoteSchema);
			case GmlPackage.DOCUMENT_ROOT__TRANSFORM:
				return TRANSFORM_EDEFAULT == null ? transform != null : !TRANSFORM_EDEFAULT.equals(transform);
			case GmlPackage.DOCUMENT_ROOT__UOM:
				return UOM_EDEFAULT == null ? uom != null : !UOM_EDEFAULT.equals(uom);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", id: ");
		result.append(id);
		result.append(", remoteSchema: ");
		result.append(remoteSchema);
		result.append(", transform: ");
		result.append(transform);
		result.append(", uom: ");
		result.append(uom);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
