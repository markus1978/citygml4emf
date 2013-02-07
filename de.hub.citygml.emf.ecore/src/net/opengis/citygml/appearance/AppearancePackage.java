/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import net.opengis.gml.GmlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Top level GML schema
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Basic support for tracking moving objects and objects with changing state.     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML Feature schema. 		      
 *     Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Extends the units.xsd and basicTypes.xsd schemas with types for recording measures using specific types of units, especially the measures and units needed for coordinate reference systems and coordinate operations. The specific unit types encoded are length, angle, scale factor, time, area, volume, speed, and grid length. This schema allows angle values to be recorded as single numbers or in degree-minute-second format. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on Subclause 4.7 of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * Builds on gmlBase.xsd to encode units of measure (or uom), including definitions of units of measure and dictionaries of such definitions. GML 3.0 candidate schema, primary editor: Arliss Whiteside. Last updated 2005-06-22.
 * 	Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 	Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on most of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * 
 * 			Dictionary schema for GML 3.1.1 
 * 			Components to support the lists of definitions.  
 *     Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML base schema for GML 3
 * 		Components to support the GML encoding model.  
 * 		The abstract Schematron rules can be used by any schema that includes gmlBase.  
 * 		Copyright (c) 2001-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 
 *     Generic simpleContent components for use in GML 
 *     Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 *     
 * 
 * 			GML 3.0 candidate xlinks schema. Copyright (c) 2001 OGC, All Rights Reserved.
 * 		
 * The temporal schema for GML 3.1 provides constructs for handling time-varying spatial data. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * This schema defines "direction" element and type.
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 
 * 	Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML Coverage schema. 
 *         Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML conformant schema for Values in which the  
 * 		    * scalar Value types and lists have their values recorded in simpleContent elements 
 * 		    * complex Value types are built recursively
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Grid geometries
 *     A subset of implicit geometries
 *     Designed for use with GML Coverage schema, but maybe useful elsewhere as well.  
 *     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * How to encode coordinate reference system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate reference systems, including the specific subtypes of coordinate reference systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate Reference System (SC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates, with the exception of the abstract "SC_CRS" class. The "SC_CRS" class is encoded in referenceSystems.xsd, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode coordinate system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate systems, including the specific subtypes of coordinate systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate System (CS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode reference system definitions. Builds on several other parts of GML 3 to encode the data needed to define reference systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Reference System (RS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. The SC_CRS class is also encoded here, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. The RS_SpatialReferenceSystemUsingGeographicIdentifier class is not encoded, since it is not applicable to coordinate positions. The CI_Citation class is not directly encoded, since such information can be included as metaDataProperty elements which are optionally allowed. A modified version of the EX_Extent (DataType) class from ISO 19115 is currently encoded here, using GML 3 schema types. (A more extensive version of the EX_Extent package might be XML encoded in the future, probably in a separate extent.xsd schema.)
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111.
 * How to encode datum definitions. Builds on referenceSystems.xsd to encode the data needed to define datums, including the specific subtypes of datums. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Datum (CD_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode coordinate operation definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate operations, including Transformations, Conversions, and other specific subtypes of operations. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate Operation (CC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode positional data quality information. Builds on units.xsd to encode the data needed to describe the positional accuracy of coordinate operations. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Data Quality (DQ) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * Observation schema for GML 3.1     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Default Style schema for GML 3.1.0
 * 		Copyright (c) 2001-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		Compliance: reference to ISO Specifications
 * The Temporal Reference Systems schema for GML 3.1 provides constructs for handling various styles of temporal reference system. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * The temporal topology schema for ISO19136 provides constructs for handling topological complexes and 
 * 		temporal feature relationships. 
 * 		Temporal geometric characteristics of features are represented as instants and periods. 
 * 		While, temporal context of features that does not relate to the position of time is described as connectivity relationships 
 * 		among instants and periods. These relationships are called temporal topology as they do not change in time, 
 * 		as long as the direction of time does not change. 
 * 		It is used effectively in the case of describing a family tree expressing evolution of species, an ecological cycle, 
 * 		a lineage of lands or buildings, or a history of separation and merger of administrative boundaries.
 * 		This schema reflects a partial yet consistent implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * xAL: eXtensible Address Language 
 * This is an XML document type definition (DTD) for
 * defining addresses.
 * Original Date of Creation: 1 March 2001
 * Copyright(c) 2000, OASIS. All Rights Reserved [http://www.oasis-open.org]
 * Contact: Customer Information Quality Technical Committee, OASIS
 * http://www.oasis-open.org/committees/ciq
 * VERSION: 2.0 [MAJOR RELEASE] Date of Creation: 01 May 2002
 * Last Update: 24 July 2002
 * Previous Version: 1.3
 * Common Attributes:Type - If not documented then it means, possible values of Type not limited to: Official, Unique, Abbreviation, OldName, Synonym
 * Code:Address element codes are used by groups like postal groups like ECCMA, ADIS, UN/PROLIST for postal services
 * <!-- end-model-doc -->
 * @see net.opengis.citygml.appearance.AppearanceFactory
 * @model kind="package"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gml:3.1.1 appinfo='gml.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:feature:v3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1 appinfo='geometryBasic2d.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1 appinfo='geometryBasic0d1d.xsd\n\n\t\t\t<sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n\t\t\t<sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n\t\t\t\t<sch:rule abstract=\"true\" id=\"CRSLabels\">\n\t\t\t\t\t<sch:report test=\"not(@srsDimension) or @srsName\">The presence of a dimension attribute implies the presence of the srsName attribute.</sch:report>\n\t\t\t\t\t<sch:report test=\"not(@axisLabels) or @srsName\">The presence of an axisLabels attribute implies the presence of the srsName attribute.</sch:report>\n\t\t\t\t\t<sch:report test=\"not(@uomLabels) or @srsName\">The presence of an uomLabels attribute implies the presence of the srsName attribute.</sch:report>\n\t\t\t\t\t<sch:report test=\"(not(@uomLabels) and not(@axisLabels)) or (@uomLabels and @axisLabels)\">The presence of an uomLabels attribute implies the presence of the axisLabels attribute and vice versa.</sch:report>\n\t\t\t\t</sch:rule>\n\t\t\t</sch:pattern>\n\t\t\t<sch:pattern name=\"Check Dimension\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n\t\t\t\t<sch:rule abstract=\"true\" id=\"Count\">\n\t\t\t\t\t<sch:report test=\"not(@count) or @srsDimension\">The presence of a count attribute implies the presence of the dimension attribute.</sch:report>\n\t\t\t\t</sch:rule>\n\t\t\t</sch:pattern>\n\t\t'"
 *        annotation="urn:opengis:specification:gml:schema-measures:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-units:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1 appinfo='\n\t\t\t<sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\n\t\t\t<sch:ns prefix=\"gml\" uri=\"http://www.opengis.net/gml\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n\t\t\t<sch:ns prefix=\"xlink\" uri=\"http://www.w3.org/1999/xlink\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\n\t\t\t<sch:pattern name=\"Check either href or content not both\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\n\t\t\t\t<sch:rule abstract=\"true\" id=\"hrefOrContent\">\n\t\t\t\t\t<sch:report test=\"@xlink:href and (*|text())\">Property element may not carry both a reference to an object and contain an object.</sch:report>\n\t\t\t\t\t<sch:assert test=\"@xlink:href | (*|text())\">Property element must either carry a reference to an object or contain an object.</sch:assert>\n\t\t\t\t</sch:rule>\n\t\t\t</sch:pattern>\n\t\t'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1 appinfo='basicTypes.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xlinks:v3.0c2 appinfo='xlinks.xsd v3.0b2 2001-07'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporal:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:direction:3.1.1 appinfo='direction.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:topology:3.1.1 appinfo='topology.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1 appinfo='geometryComplexes.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1 appinfo='geometryAggregates.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1 appinfo='geometryPrimitives.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coverage:3.1.1 appinfo='coverage.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1 appinfo='valueObjects.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:grids:3.1.1 appinfo='grids.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:datums:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:observation:3.1.1 appinfo='observation.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-defaultStyle:v3.1.0 appinfo='defaultStyle.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1 appinfo=''"
 * @generated
 */
public interface AppearancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "appearance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/appearance/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppearancePackage eINSTANCE = net.opengis.citygml.appearance.impl.AppearancePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.AbstractSurfaceDataTypeImpl <em>Abstract Surface Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.AbstractSurfaceDataTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAbstractSurfaceDataType()
	 * @generated
	 */
	int ABSTRACT_SURFACE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_FEATURE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__NAME = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__ID = GmlPackage.ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__BOUNDED_BY = GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__LOCATION_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__LOCATION = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Surface Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.AbstractTextureParameterizationTypeImpl <em>Abstract Texture Parameterization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.AbstractTextureParameterizationTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAbstractTextureParameterizationType()
	 * @generated
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_GML_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__NAME = GmlPackage.ABSTRACT_GML_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__ID = GmlPackage.ABSTRACT_GML_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Parameterization Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Texture Parameterization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl <em>Abstract Texture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAbstractTextureType()
	 * @generated
	 */
	int ABSTRACT_TEXTURE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__META_DATA_PROPERTY = ABSTRACT_SURFACE_DATA_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__DESCRIPTION = ABSTRACT_SURFACE_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__NAME_GROUP = ABSTRACT_SURFACE_DATA_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__NAME = ABSTRACT_SURFACE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__ID = ABSTRACT_SURFACE_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__BOUNDED_BY = ABSTRACT_SURFACE_DATA_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__LOCATION_GROUP = ABSTRACT_SURFACE_DATA_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__LOCATION = ABSTRACT_SURFACE_DATA_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__IS_FRONT = ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP = ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA;

	/**
	 * The feature id for the '<em><b>Image URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__IMAGE_URI = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__MIME_TYPE = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Texture Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wrap Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__WRAP_MODE = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__BORDER_COLOR = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abstract Texture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.AppearancePropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.AppearancePropertyTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAppearancePropertyType()
	 * @generated
	 */
	int APPEARANCE_PROPERTY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__FEATURE_GROUP = GmlPackage.FEATURE_PROPERTY_TYPE__FEATURE_GROUP;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__FEATURE = GmlPackage.FEATURE_PROPERTY_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__ACTUATE = GmlPackage.FEATURE_PROPERTY_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__ARCROLE = GmlPackage.FEATURE_PROPERTY_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__HREF = GmlPackage.FEATURE_PROPERTY_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.FEATURE_PROPERTY_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__ROLE = GmlPackage.FEATURE_PROPERTY_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__SHOW = GmlPackage.FEATURE_PROPERTY_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__TITLE = GmlPackage.FEATURE_PROPERTY_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__TYPE = GmlPackage.FEATURE_PROPERTY_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__APPEARANCE = GmlPackage.FEATURE_PROPERTY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.FEATURE_PROPERTY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.AppearanceTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.AppearanceTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAppearanceType()
	 * @generated
	 */
	int APPEARANCE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_FEATURE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__NAME = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__ID = GmlPackage.ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__BOUNDED_BY = GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__LOCATION_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__LOCATION = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__THEME = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Surface Data Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__SURFACE_DATA_MEMBER = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Appearance Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Appearance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.DocumentRootImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE = 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Georeferenced Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE = 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Parameterized Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE = 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tex Coord Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN = 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tex Coord List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST = 8;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE = 9;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION = 10;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of X3D Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL = 11;

	/**
	 * The feature id for the '<em><b>Surface Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SURFACE_DATA = 12;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE = 13;

	/**
	 * The feature id for the '<em><b>Texture Parameterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION = 14;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPEARANCE = 15;

	/**
	 * The feature id for the '<em><b>Appearance Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPEARANCE_MEMBER = 16;

	/**
	 * The feature id for the '<em><b>Georeferenced Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GEOREFERENCED_TEXTURE = 17;

	/**
	 * The feature id for the '<em><b>Parameterized Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAMETERIZED_TEXTURE = 18;

	/**
	 * The feature id for the '<em><b>Tex Coord Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEX_COORD_GEN = 19;

	/**
	 * The feature id for the '<em><b>Tex Coord List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEX_COORD_LIST = 20;

	/**
	 * The feature id for the '<em><b>X3D Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X3_DMATERIAL = 21;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl <em>Georeferenced Texture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getGeoreferencedTextureType()
	 * @generated
	 */
	int GEOREFERENCED_TEXTURE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__META_DATA_PROPERTY = ABSTRACT_TEXTURE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__DESCRIPTION = ABSTRACT_TEXTURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__NAME_GROUP = ABSTRACT_TEXTURE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__NAME = ABSTRACT_TEXTURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__ID = ABSTRACT_TEXTURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__BOUNDED_BY = ABSTRACT_TEXTURE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__LOCATION_GROUP = ABSTRACT_TEXTURE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__LOCATION = ABSTRACT_TEXTURE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__IS_FRONT = ABSTRACT_TEXTURE_TYPE__IS_FRONT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA;

	/**
	 * The feature id for the '<em><b>Image URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__IMAGE_URI = ABSTRACT_TEXTURE_TYPE__IMAGE_URI;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__MIME_TYPE = ABSTRACT_TEXTURE_TYPE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Texture Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__TEXTURE_TYPE = ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE;

	/**
	 * The feature id for the '<em><b>Wrap Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__WRAP_MODE = ABSTRACT_TEXTURE_TYPE__WRAP_MODE;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__BORDER_COLOR = ABSTRACT_TEXTURE_TYPE__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE;

	/**
	 * The feature id for the '<em><b>Prefer World File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__ORIENTATION = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__TARGET = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Georeferenced Texture Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Georeferenced Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Georeferenced Texture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOREFERENCED_TEXTURE_TYPE_FEATURE_COUNT = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.ParameterizedTextureTypeImpl <em>Parameterized Texture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.ParameterizedTextureTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getParameterizedTextureType()
	 * @generated
	 */
	int PARAMETERIZED_TEXTURE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__META_DATA_PROPERTY = ABSTRACT_TEXTURE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__DESCRIPTION = ABSTRACT_TEXTURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__NAME_GROUP = ABSTRACT_TEXTURE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__NAME = ABSTRACT_TEXTURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__ID = ABSTRACT_TEXTURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__BOUNDED_BY = ABSTRACT_TEXTURE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__LOCATION_GROUP = ABSTRACT_TEXTURE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__LOCATION = ABSTRACT_TEXTURE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__IS_FRONT = ABSTRACT_TEXTURE_TYPE__IS_FRONT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA;

	/**
	 * The feature id for the '<em><b>Image URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__IMAGE_URI = ABSTRACT_TEXTURE_TYPE__IMAGE_URI;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__MIME_TYPE = ABSTRACT_TEXTURE_TYPE__MIME_TYPE;

	/**
	 * The feature id for the '<em><b>Texture Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__TEXTURE_TYPE = ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE;

	/**
	 * The feature id for the '<em><b>Wrap Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__WRAP_MODE = ABSTRACT_TEXTURE_TYPE__WRAP_MODE;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__BORDER_COLOR = ABSTRACT_TEXTURE_TYPE__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE = ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__TARGET = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Parameterized Texture Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Parameterized Texture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameterized Texture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEXTURE_TYPE_FEATURE_COUNT = ABSTRACT_TEXTURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.SurfaceDataPropertyTypeImpl <em>Surface Data Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.SurfaceDataPropertyTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getSurfaceDataPropertyType()
	 * @generated
	 */
	int SURFACE_DATA_PROPERTY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Surface Data Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__SURFACE_DATA_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Surface Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__SURFACE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__REMOTE_SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Surface Data Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_DATA_PROPERTY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.TexCoordGenTypeImpl <em>Tex Coord Gen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.TexCoordGenTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTexCoordGenType()
	 * @generated
	 */
	int TEX_COORD_GEN_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__META_DATA_PROPERTY = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__DESCRIPTION = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__NAME_GROUP = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__NAME = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__ID = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Parameterization Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION;

	/**
	 * The feature id for the '<em><b>World To Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tex Coord Gen Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tex Coord Gen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tex Coord Gen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_GEN_TYPE_FEATURE_COUNT = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.TexCoordListTypeImpl <em>Tex Coord List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.TexCoordListTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTexCoordListType()
	 * @generated
	 */
	int TEX_COORD_LIST_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__META_DATA_PROPERTY = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__DESCRIPTION = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__NAME_GROUP = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__NAME = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__ID = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Parameterization Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION;

	/**
	 * The feature id for the '<em><b>Texture Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tex Coord List Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tex Coord List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tex Coord List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEX_COORD_LIST_TYPE_FEATURE_COUNT = ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.TextureAssociationTypeImpl <em>Texture Association Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.TextureAssociationTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureAssociationType()
	 * @generated
	 */
	int TEXTURE_ASSOCIATION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Texture Parameterization Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__TEXTURE_PARAMETERIZATION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Texture Parameterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__TEXTURE_PARAMETERIZATION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__REMOTE_SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE__URI = 10;

	/**
	 * The number of structural features of the '<em>Texture Association Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_ASSOCIATION_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.TextureCoordinatesTypeImpl <em>Texture Coordinates Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.TextureCoordinatesTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureCoordinatesType()
	 * @generated
	 */
	int TEXTURE_COORDINATES_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_COORDINATES_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Ring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_COORDINATES_TYPE__RING = 1;

	/**
	 * The number of structural features of the '<em>Texture Coordinates Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_COORDINATES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl <em>World To Texture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getWorldToTextureType()
	 * @generated
	 */
	int WORLD_TO_TEXTURE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_TO_TEXTURE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Axis Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_TO_TEXTURE_TYPE__AXIS_LABELS = 1;

	/**
	 * The feature id for the '<em><b>Srs Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_TO_TEXTURE_TYPE__SRS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Uom Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_TO_TEXTURE_TYPE__UOM_LABELS = 4;

	/**
	 * The number of structural features of the '<em>World To Texture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_TO_TEXTURE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl <em>X3D Material Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getX3DMaterialType()
	 * @generated
	 */
	int X3D_MATERIAL_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__META_DATA_PROPERTY = ABSTRACT_SURFACE_DATA_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__DESCRIPTION = ABSTRACT_SURFACE_DATA_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__NAME_GROUP = ABSTRACT_SURFACE_DATA_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__NAME = ABSTRACT_SURFACE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__ID = ABSTRACT_SURFACE_DATA_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__BOUNDED_BY = ABSTRACT_SURFACE_DATA_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__LOCATION_GROUP = ABSTRACT_SURFACE_DATA_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__LOCATION = ABSTRACT_SURFACE_DATA_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__IS_FRONT = ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP = ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA;

	/**
	 * The feature id for the '<em><b>Ambient Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__AMBIENT_INTENSITY = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffuse Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__DIFFUSE_COLOR = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Emissive Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__EMISSIVE_COLOR = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specular Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__SPECULAR_COLOR = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__SHININESS = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__TRANSPARENCY = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Smooth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__IS_SMOOTH = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__TARGET = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of X3D Material Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of X3D Material</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>X3D Material Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int X3D_MATERIAL_TYPE_FEATURE_COUNT = ABSTRACT_SURFACE_DATA_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.TextureTypeType <em>Texture Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.TextureTypeType
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureTypeType()
	 * @generated
	 */
	int TEXTURE_TYPE_TYPE = 15;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.appearance.WrapModeType <em>Wrap Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.WrapModeType
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getWrapModeType()
	 * @generated
	 */
	int WRAP_MODE_TYPE = 16;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 17;

	/**
	 * The meta object id for the '<em>Color Plus Opacity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getColorPlusOpacity()
	 * @generated
	 */
	int COLOR_PLUS_OPACITY = 18;

	/**
	 * The meta object id for the '<em>Texture Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.TextureTypeType
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureTypeTypeObject()
	 * @generated
	 */
	int TEXTURE_TYPE_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Wrap Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.appearance.WrapModeType
	 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getWrapModeTypeObject()
	 * @generated
	 */
	int WRAP_MODE_TYPE_OBJECT = 20;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType <em>Abstract Surface Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Surface Data Type</em>'.
	 * @see net.opengis.citygml.appearance.AbstractSurfaceDataType
	 * @generated
	 */
	EClass getAbstractSurfaceDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#isIsFront <em>Is Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front</em>'.
	 * @see net.opengis.citygml.appearance.AbstractSurfaceDataType#isIsFront()
	 * @see #getAbstractSurfaceDataType()
	 * @generated
	 */
	EAttribute getAbstractSurfaceDataType_IsFront();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#getGenericApplicationPropertyOfSurfaceDataGroup <em>Generic Application Property Of Surface Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Surface Data Group</em>'.
	 * @see net.opengis.citygml.appearance.AbstractSurfaceDataType#getGenericApplicationPropertyOfSurfaceDataGroup()
	 * @see #getAbstractSurfaceDataType()
	 * @generated
	 */
	EAttribute getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceDataGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#getGenericApplicationPropertyOfSurfaceData <em>Generic Application Property Of Surface Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Surface Data</em>'.
	 * @see net.opengis.citygml.appearance.AbstractSurfaceDataType#getGenericApplicationPropertyOfSurfaceData()
	 * @see #getAbstractSurfaceDataType()
	 * @generated
	 */
	EReference getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceData();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.AbstractTextureParameterizationType <em>Abstract Texture Parameterization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Texture Parameterization Type</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureParameterizationType
	 * @generated
	 */
	EClass getAbstractTextureParameterizationType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.AbstractTextureParameterizationType#getGenericApplicationPropertyOfTextureParameterizationGroup <em>Generic Application Property Of Texture Parameterization Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Texture Parameterization Group</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureParameterizationType#getGenericApplicationPropertyOfTextureParameterizationGroup()
	 * @see #getAbstractTextureParameterizationType()
	 * @generated
	 */
	EAttribute getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterizationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.AbstractTextureParameterizationType#getGenericApplicationPropertyOfTextureParameterization <em>Generic Application Property Of Texture Parameterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Texture Parameterization</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureParameterizationType#getGenericApplicationPropertyOfTextureParameterization()
	 * @see #getAbstractTextureParameterizationType()
	 * @generated
	 */
	EReference getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterization();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.AbstractTextureType <em>Abstract Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Texture Type</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType
	 * @generated
	 */
	EClass getAbstractTextureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.AbstractTextureType#getImageURI <em>Image URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image URI</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType#getImageURI()
	 * @see #getAbstractTextureType()
	 * @generated
	 */
	EAttribute getAbstractTextureType_ImageURI();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.AbstractTextureType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType#getMimeType()
	 * @see #getAbstractTextureType()
	 * @generated
	 */
	EAttribute getAbstractTextureType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.AbstractTextureType#getTextureType <em>Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Type</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType#getTextureType()
	 * @see #getAbstractTextureType()
	 * @generated
	 */
	EAttribute getAbstractTextureType_TextureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.AbstractTextureType#getWrapMode <em>Wrap Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap Mode</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType#getWrapMode()
	 * @see #getAbstractTextureType()
	 * @generated
	 */
	EAttribute getAbstractTextureType_WrapMode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.AbstractTextureType#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType#getBorderColor()
	 * @see #getAbstractTextureType()
	 * @generated
	 */
	EAttribute getAbstractTextureType_BorderColor();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.AbstractTextureType#getGenericApplicationPropertyOfTextureGroup <em>Generic Application Property Of Texture Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Texture Group</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType#getGenericApplicationPropertyOfTextureGroup()
	 * @see #getAbstractTextureType()
	 * @generated
	 */
	EAttribute getAbstractTextureType_GenericApplicationPropertyOfTextureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.AbstractTextureType#getGenericApplicationPropertyOfTexture <em>Generic Application Property Of Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Texture</em>'.
	 * @see net.opengis.citygml.appearance.AbstractTextureType#getGenericApplicationPropertyOfTexture()
	 * @see #getAbstractTextureType()
	 * @generated
	 */
	EReference getAbstractTextureType_GenericApplicationPropertyOfTexture();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.AppearancePropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see net.opengis.citygml.appearance.AppearancePropertyType
	 * @generated
	 */
	EClass getAppearancePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.AppearancePropertyType#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see net.opengis.citygml.appearance.AppearancePropertyType#getAppearance()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EReference getAppearancePropertyType_Appearance();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.AppearanceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see net.opengis.citygml.appearance.AppearanceType
	 * @generated
	 */
	EClass getAppearanceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.AppearanceType#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see net.opengis.citygml.appearance.AppearanceType#getTheme()
	 * @see #getAppearanceType()
	 * @generated
	 */
	EAttribute getAppearanceType_Theme();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.AppearanceType#getSurfaceDataMember <em>Surface Data Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surface Data Member</em>'.
	 * @see net.opengis.citygml.appearance.AppearanceType#getSurfaceDataMember()
	 * @see #getAppearanceType()
	 * @generated
	 */
	EReference getAppearanceType_SurfaceDataMember();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.AppearanceType#getGenericApplicationPropertyOfAppearanceGroup <em>Generic Application Property Of Appearance Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Appearance Group</em>'.
	 * @see net.opengis.citygml.appearance.AppearanceType#getGenericApplicationPropertyOfAppearanceGroup()
	 * @see #getAppearanceType()
	 * @generated
	 */
	EAttribute getAppearanceType_GenericApplicationPropertyOfAppearanceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.AppearanceType#getGenericApplicationPropertyOfAppearance <em>Generic Application Property Of Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Appearance</em>'.
	 * @see net.opengis.citygml.appearance.AppearanceType#getGenericApplicationPropertyOfAppearance()
	 * @see #getAppearanceType()
	 * @generated
	 */
	EReference getAppearanceType_GenericApplicationPropertyOfAppearance();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.appearance.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.appearance.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfAppearance <em>Generic Application Property Of Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Appearance</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfAppearance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfAppearance();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfGeoreferencedTexture <em>Generic Application Property Of Georeferenced Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Georeferenced Texture</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfGeoreferencedTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfGeoreferencedTexture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfParameterizedTexture <em>Generic Application Property Of Parameterized Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Parameterized Texture</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfParameterizedTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfParameterizedTexture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfSurfaceData <em>Generic Application Property Of Surface Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Surface Data</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfSurfaceData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfSurfaceData();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexCoordGen <em>Generic Application Property Of Tex Coord Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Tex Coord Gen</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexCoordGen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTexCoordGen();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexCoordList <em>Generic Application Property Of Tex Coord List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Tex Coord List</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexCoordList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTexCoordList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexture <em>Generic Application Property Of Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Texture</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTexture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTextureParameterization <em>Generic Application Property Of Texture Parameterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Texture Parameterization</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTextureParameterization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTextureParameterization();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfX3DMaterial <em>Generic Application Property Of X3D Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of X3D Material</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfX3DMaterial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfX3DMaterial();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getSurfaceData <em>Surface Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Surface Data</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getSurfaceData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SurfaceData();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texture</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Texture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getTextureParameterization <em>Texture Parameterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texture Parameterization</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getTextureParameterization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TextureParameterization();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getAppearance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Appearance();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getAppearanceMember <em>Appearance Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance Member</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getAppearanceMember()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AppearanceMember();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getGeoreferencedTexture <em>Georeferenced Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Georeferenced Texture</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getGeoreferencedTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GeoreferencedTexture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getParameterizedTexture <em>Parameterized Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameterized Texture</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getParameterizedTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ParameterizedTexture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getTexCoordGen <em>Tex Coord Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tex Coord Gen</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getTexCoordGen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TexCoordGen();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getTexCoordList <em>Tex Coord List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tex Coord List</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getTexCoordList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TexCoordList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.DocumentRoot#getX3DMaterial <em>X3D Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>X3D Material</em>'.
	 * @see net.opengis.citygml.appearance.DocumentRoot#getX3DMaterial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_X3DMaterial();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.GeoreferencedTextureType <em>Georeferenced Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Georeferenced Texture Type</em>'.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType
	 * @generated
	 */
	EClass getGeoreferencedTextureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#isPreferWorldFile <em>Prefer World File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefer World File</em>'.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType#isPreferWorldFile()
	 * @see #getGeoreferencedTextureType()
	 * @generated
	 */
	EAttribute getGeoreferencedTextureType_PreferWorldFile();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getReferencePoint <em>Reference Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Point</em>'.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType#getReferencePoint()
	 * @see #getGeoreferencedTextureType()
	 * @generated
	 */
	EReference getGeoreferencedTextureType_ReferencePoint();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType#getOrientation()
	 * @see #getGeoreferencedTextureType()
	 * @generated
	 */
	EAttribute getGeoreferencedTextureType_Orientation();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target</em>'.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType#getTarget()
	 * @see #getGeoreferencedTextureType()
	 * @generated
	 */
	EAttribute getGeoreferencedTextureType_Target();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getGenericApplicationPropertyOfGeoreferencedTextureGroup <em>Generic Application Property Of Georeferenced Texture Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Georeferenced Texture Group</em>'.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType#getGenericApplicationPropertyOfGeoreferencedTextureGroup()
	 * @see #getGeoreferencedTextureType()
	 * @generated
	 */
	EAttribute getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTextureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getGenericApplicationPropertyOfGeoreferencedTexture <em>Generic Application Property Of Georeferenced Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Georeferenced Texture</em>'.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType#getGenericApplicationPropertyOfGeoreferencedTexture()
	 * @see #getGeoreferencedTextureType()
	 * @generated
	 */
	EReference getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTexture();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.ParameterizedTextureType <em>Parameterized Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Texture Type</em>'.
	 * @see net.opengis.citygml.appearance.ParameterizedTextureType
	 * @generated
	 */
	EClass getParameterizedTextureType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.ParameterizedTextureType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see net.opengis.citygml.appearance.ParameterizedTextureType#getTarget()
	 * @see #getParameterizedTextureType()
	 * @generated
	 */
	EReference getParameterizedTextureType_Target();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.ParameterizedTextureType#getGenericApplicationPropertyOfParameterizedTextureGroup <em>Generic Application Property Of Parameterized Texture Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Parameterized Texture Group</em>'.
	 * @see net.opengis.citygml.appearance.ParameterizedTextureType#getGenericApplicationPropertyOfParameterizedTextureGroup()
	 * @see #getParameterizedTextureType()
	 * @generated
	 */
	EAttribute getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTextureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.ParameterizedTextureType#getGenericApplicationPropertyOfParameterizedTexture <em>Generic Application Property Of Parameterized Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Parameterized Texture</em>'.
	 * @see net.opengis.citygml.appearance.ParameterizedTextureType#getGenericApplicationPropertyOfParameterizedTexture()
	 * @see #getParameterizedTextureType()
	 * @generated
	 */
	EReference getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTexture();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType <em>Surface Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Data Property Type</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType
	 * @generated
	 */
	EClass getSurfaceDataPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getSurfaceDataGroup <em>Surface Data Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Surface Data Group</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getSurfaceDataGroup()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_SurfaceDataGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getSurfaceData <em>Surface Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Surface Data</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getSurfaceData()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EReference getSurfaceDataPropertyType_SurfaceData();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getActuate()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getArcrole()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getHref()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getRemoteSchema <em>Remote Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Schema</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getRemoteSchema()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_RemoteSchema();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getRole()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getShow()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getTitle()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType#getType()
	 * @see #getSurfaceDataPropertyType()
	 * @generated
	 */
	EAttribute getSurfaceDataPropertyType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.TexCoordGenType <em>Tex Coord Gen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tex Coord Gen Type</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordGenType
	 * @generated
	 */
	EClass getTexCoordGenType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.TexCoordGenType#getWorldToTexture <em>World To Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>World To Texture</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordGenType#getWorldToTexture()
	 * @see #getTexCoordGenType()
	 * @generated
	 */
	EReference getTexCoordGenType_WorldToTexture();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.TexCoordGenType#getGenericApplicationPropertyOfTexCoordGenGroup <em>Generic Application Property Of Tex Coord Gen Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Tex Coord Gen Group</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordGenType#getGenericApplicationPropertyOfTexCoordGenGroup()
	 * @see #getTexCoordGenType()
	 * @generated
	 */
	EAttribute getTexCoordGenType_GenericApplicationPropertyOfTexCoordGenGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.TexCoordGenType#getGenericApplicationPropertyOfTexCoordGen <em>Generic Application Property Of Tex Coord Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Tex Coord Gen</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordGenType#getGenericApplicationPropertyOfTexCoordGen()
	 * @see #getTexCoordGenType()
	 * @generated
	 */
	EReference getTexCoordGenType_GenericApplicationPropertyOfTexCoordGen();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.TexCoordListType <em>Tex Coord List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tex Coord List Type</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordListType
	 * @generated
	 */
	EClass getTexCoordListType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.TexCoordListType#getTextureCoordinates <em>Texture Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texture Coordinates</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordListType#getTextureCoordinates()
	 * @see #getTexCoordListType()
	 * @generated
	 */
	EReference getTexCoordListType_TextureCoordinates();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.TexCoordListType#getGenericApplicationPropertyOfTexCoordListGroup <em>Generic Application Property Of Tex Coord List Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Tex Coord List Group</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordListType#getGenericApplicationPropertyOfTexCoordListGroup()
	 * @see #getTexCoordListType()
	 * @generated
	 */
	EAttribute getTexCoordListType_GenericApplicationPropertyOfTexCoordListGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.TexCoordListType#getGenericApplicationPropertyOfTexCoordList <em>Generic Application Property Of Tex Coord List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Tex Coord List</em>'.
	 * @see net.opengis.citygml.appearance.TexCoordListType#getGenericApplicationPropertyOfTexCoordList()
	 * @see #getTexCoordListType()
	 * @generated
	 */
	EReference getTexCoordListType_GenericApplicationPropertyOfTexCoordList();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.TextureAssociationType <em>Texture Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture Association Type</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType
	 * @generated
	 */
	EClass getTextureAssociationType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.TextureAssociationType#getTextureParameterizationGroup <em>Texture Parameterization Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Texture Parameterization Group</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getTextureParameterizationGroup()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_TextureParameterizationGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.appearance.TextureAssociationType#getTextureParameterization <em>Texture Parameterization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texture Parameterization</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getTextureParameterization()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EReference getTextureAssociationType_TextureParameterization();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getActuate()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getArcrole()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getHref()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getRemoteSchema <em>Remote Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Schema</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getRemoteSchema()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_RemoteSchema();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getRole()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getShow()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getTitle()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getType()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureAssociationType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see net.opengis.citygml.appearance.TextureAssociationType#getUri()
	 * @see #getTextureAssociationType()
	 * @generated
	 */
	EAttribute getTextureAssociationType_Uri();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.TextureCoordinatesType <em>Texture Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture Coordinates Type</em>'.
	 * @see net.opengis.citygml.appearance.TextureCoordinatesType
	 * @generated
	 */
	EClass getTextureCoordinatesType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureCoordinatesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.citygml.appearance.TextureCoordinatesType#getValue()
	 * @see #getTextureCoordinatesType()
	 * @generated
	 */
	EAttribute getTextureCoordinatesType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.TextureCoordinatesType#getRing <em>Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ring</em>'.
	 * @see net.opengis.citygml.appearance.TextureCoordinatesType#getRing()
	 * @see #getTextureCoordinatesType()
	 * @generated
	 */
	EAttribute getTextureCoordinatesType_Ring();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.WorldToTextureType <em>World To Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World To Texture Type</em>'.
	 * @see net.opengis.citygml.appearance.WorldToTextureType
	 * @generated
	 */
	EClass getWorldToTextureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.WorldToTextureType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.citygml.appearance.WorldToTextureType#getValue()
	 * @see #getWorldToTextureType()
	 * @generated
	 */
	EAttribute getWorldToTextureType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.WorldToTextureType#getAxisLabels <em>Axis Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Labels</em>'.
	 * @see net.opengis.citygml.appearance.WorldToTextureType#getAxisLabels()
	 * @see #getWorldToTextureType()
	 * @generated
	 */
	EAttribute getWorldToTextureType_AxisLabels();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.WorldToTextureType#getSrsDimension <em>Srs Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Dimension</em>'.
	 * @see net.opengis.citygml.appearance.WorldToTextureType#getSrsDimension()
	 * @see #getWorldToTextureType()
	 * @generated
	 */
	EAttribute getWorldToTextureType_SrsDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.WorldToTextureType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.citygml.appearance.WorldToTextureType#getSrsName()
	 * @see #getWorldToTextureType()
	 * @generated
	 */
	EAttribute getWorldToTextureType_SrsName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.WorldToTextureType#getUomLabels <em>Uom Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Labels</em>'.
	 * @see net.opengis.citygml.appearance.WorldToTextureType#getUomLabels()
	 * @see #getWorldToTextureType()
	 * @generated
	 */
	EAttribute getWorldToTextureType_UomLabels();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.appearance.X3DMaterialType <em>X3D Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>X3D Material Type</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType
	 * @generated
	 */
	EClass getX3DMaterialType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.X3DMaterialType#getAmbientIntensity <em>Ambient Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Intensity</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getAmbientIntensity()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_AmbientIntensity();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.X3DMaterialType#getDiffuseColor <em>Diffuse Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diffuse Color</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getDiffuseColor()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_DiffuseColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.X3DMaterialType#getEmissiveColor <em>Emissive Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emissive Color</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getEmissiveColor()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_EmissiveColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.X3DMaterialType#getSpecularColor <em>Specular Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specular Color</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getSpecularColor()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_SpecularColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.X3DMaterialType#getShininess <em>Shininess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shininess</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getShininess()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_Shininess();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.X3DMaterialType#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getTransparency()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.appearance.X3DMaterialType#isIsSmooth <em>Is Smooth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Smooth</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#isIsSmooth()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_IsSmooth();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.X3DMaterialType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getTarget()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_Target();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.appearance.X3DMaterialType#getGenericApplicationPropertyOfX3DMaterialGroup <em>Generic Application Property Of X3D Material Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of X3D Material Group</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getGenericApplicationPropertyOfX3DMaterialGroup()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EAttribute getX3DMaterialType_GenericApplicationPropertyOfX3DMaterialGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.appearance.X3DMaterialType#getGenericApplicationPropertyOfX3DMaterial <em>Generic Application Property Of X3D Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of X3D Material</em>'.
	 * @see net.opengis.citygml.appearance.X3DMaterialType#getGenericApplicationPropertyOfX3DMaterial()
	 * @see #getX3DMaterialType()
	 * @generated
	 */
	EReference getX3DMaterialType_GenericApplicationPropertyOfX3DMaterial();

	/**
	 * Returns the meta object for enum '{@link net.opengis.citygml.appearance.TextureTypeType <em>Texture Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Type Type</em>'.
	 * @see net.opengis.citygml.appearance.TextureTypeType
	 * @generated
	 */
	EEnum getTextureTypeType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.citygml.appearance.WrapModeType <em>Wrap Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wrap Mode Type</em>'.
	 * @see net.opengis.citygml.appearance.WrapModeType
	 * @generated
	 */
	EEnum getWrapModeType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='Color' baseType='http://www.opengis.net/citygml/1.0#doubleBetween0and1List' length='3'"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Color Plus Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Plus Opacity</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='ColorPlusOpacity' baseType='http://www.opengis.net/citygml/1.0#doubleBetween0and1List' minLength='3' maxLength='4'"
	 * @generated
	 */
	EDataType getColorPlusOpacity();

	/**
	 * Returns the meta object for data type '{@link net.opengis.citygml.appearance.TextureTypeType <em>Texture Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Type Type Object</em>'.
	 * @see net.opengis.citygml.appearance.TextureTypeType
	 * @model instanceClass="net.opengis.citygml.appearance.TextureTypeType"
	 *        extendedMetaData="name='TextureTypeType:Object' baseType='TextureTypeType'"
	 * @generated
	 */
	EDataType getTextureTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.citygml.appearance.WrapModeType <em>Wrap Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wrap Mode Type Object</em>'.
	 * @see net.opengis.citygml.appearance.WrapModeType
	 * @model instanceClass="net.opengis.citygml.appearance.WrapModeType"
	 *        extendedMetaData="name='WrapModeType:Object' baseType='WrapModeType'"
	 * @generated
	 */
	EDataType getWrapModeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppearanceFactory getAppearanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.AbstractSurfaceDataTypeImpl <em>Abstract Surface Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.AbstractSurfaceDataTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAbstractSurfaceDataType()
		 * @generated
		 */
		EClass ABSTRACT_SURFACE_DATA_TYPE = eINSTANCE.getAbstractSurfaceDataType();

		/**
		 * The meta object literal for the '<em><b>Is Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT = eINSTANCE.getAbstractSurfaceDataType_IsFront();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Surface Data Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP = eINSTANCE.getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceDataGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = eINSTANCE.getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceData();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.AbstractTextureParameterizationTypeImpl <em>Abstract Texture Parameterization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.AbstractTextureParameterizationTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAbstractTextureParameterizationType()
		 * @generated
		 */
		EClass ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE = eINSTANCE.getAbstractTextureParameterizationType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Texture Parameterization Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP = eINSTANCE.getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterizationGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION = eINSTANCE.getAbstractTextureParameterizationType_GenericApplicationPropertyOfTextureParameterization();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl <em>Abstract Texture Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAbstractTextureType()
		 * @generated
		 */
		EClass ABSTRACT_TEXTURE_TYPE = eINSTANCE.getAbstractTextureType();

		/**
		 * The meta object literal for the '<em><b>Image URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEXTURE_TYPE__IMAGE_URI = eINSTANCE.getAbstractTextureType_ImageURI();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEXTURE_TYPE__MIME_TYPE = eINSTANCE.getAbstractTextureType_MimeType();

		/**
		 * The meta object literal for the '<em><b>Texture Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE = eINSTANCE.getAbstractTextureType_TextureType();

		/**
		 * The meta object literal for the '<em><b>Wrap Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEXTURE_TYPE__WRAP_MODE = eINSTANCE.getAbstractTextureType_WrapMode();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEXTURE_TYPE__BORDER_COLOR = eINSTANCE.getAbstractTextureType_BorderColor();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Texture Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP = eINSTANCE.getAbstractTextureType_GenericApplicationPropertyOfTextureGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Texture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE = eINSTANCE.getAbstractTextureType_GenericApplicationPropertyOfTexture();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.AppearancePropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.AppearancePropertyTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAppearancePropertyType()
		 * @generated
		 */
		EClass APPEARANCE_PROPERTY_TYPE = eINSTANCE.getAppearancePropertyType();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE_PROPERTY_TYPE__APPEARANCE = eINSTANCE.getAppearancePropertyType_Appearance();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.AppearanceTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.AppearanceTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getAppearanceType()
		 * @generated
		 */
		EClass APPEARANCE_TYPE = eINSTANCE.getAppearanceType();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_TYPE__THEME = eINSTANCE.getAppearanceType_Theme();

		/**
		 * The meta object literal for the '<em><b>Surface Data Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE_TYPE__SURFACE_DATA_MEMBER = eINSTANCE.getAppearanceType_SurfaceDataMember();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Appearance Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP = eINSTANCE.getAppearanceType_GenericApplicationPropertyOfAppearanceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Appearance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE = eINSTANCE.getAppearanceType_GenericApplicationPropertyOfAppearance();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.DocumentRootImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfAppearance();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Georeferenced Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfGeoreferencedTexture();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Parameterized Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfParameterizedTexture();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfSurfaceData();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tex Coord Gen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTexCoordGen();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tex Coord List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTexCoordList();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTexture();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTextureParameterization();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of X3D Material</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfX3DMaterial();

		/**
		 * The meta object literal for the '<em><b>Surface Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SURFACE_DATA = eINSTANCE.getDocumentRoot_SurfaceData();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXTURE = eINSTANCE.getDocumentRoot_Texture();

		/**
		 * The meta object literal for the '<em><b>Texture Parameterization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION = eINSTANCE.getDocumentRoot_TextureParameterization();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPEARANCE = eINSTANCE.getDocumentRoot_Appearance();

		/**
		 * The meta object literal for the '<em><b>Appearance Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPEARANCE_MEMBER = eINSTANCE.getDocumentRoot_AppearanceMember();

		/**
		 * The meta object literal for the '<em><b>Georeferenced Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GEOREFERENCED_TEXTURE = eINSTANCE.getDocumentRoot_GeoreferencedTexture();

		/**
		 * The meta object literal for the '<em><b>Parameterized Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAMETERIZED_TEXTURE = eINSTANCE.getDocumentRoot_ParameterizedTexture();

		/**
		 * The meta object literal for the '<em><b>Tex Coord Gen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEX_COORD_GEN = eINSTANCE.getDocumentRoot_TexCoordGen();

		/**
		 * The meta object literal for the '<em><b>Tex Coord List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEX_COORD_LIST = eINSTANCE.getDocumentRoot_TexCoordList();

		/**
		 * The meta object literal for the '<em><b>X3D Material</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__X3_DMATERIAL = eINSTANCE.getDocumentRoot_X3DMaterial();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl <em>Georeferenced Texture Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getGeoreferencedTextureType()
		 * @generated
		 */
		EClass GEOREFERENCED_TEXTURE_TYPE = eINSTANCE.getGeoreferencedTextureType();

		/**
		 * The meta object literal for the '<em><b>Prefer World File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE = eINSTANCE.getGeoreferencedTextureType_PreferWorldFile();

		/**
		 * The meta object literal for the '<em><b>Reference Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT = eINSTANCE.getGeoreferencedTextureType_ReferencePoint();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOREFERENCED_TEXTURE_TYPE__ORIENTATION = eINSTANCE.getGeoreferencedTextureType_Orientation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOREFERENCED_TEXTURE_TYPE__TARGET = eINSTANCE.getGeoreferencedTextureType_Target();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Georeferenced Texture Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP = eINSTANCE.getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTextureGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Georeferenced Texture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE = eINSTANCE.getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTexture();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.ParameterizedTextureTypeImpl <em>Parameterized Texture Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.ParameterizedTextureTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getParameterizedTextureType()
		 * @generated
		 */
		EClass PARAMETERIZED_TEXTURE_TYPE = eINSTANCE.getParameterizedTextureType();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TEXTURE_TYPE__TARGET = eINSTANCE.getParameterizedTextureType_Target();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Parameterized Texture Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP = eINSTANCE.getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTextureGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Parameterized Texture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE = eINSTANCE.getParameterizedTextureType_GenericApplicationPropertyOfParameterizedTexture();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.SurfaceDataPropertyTypeImpl <em>Surface Data Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.SurfaceDataPropertyTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getSurfaceDataPropertyType()
		 * @generated
		 */
		EClass SURFACE_DATA_PROPERTY_TYPE = eINSTANCE.getSurfaceDataPropertyType();

		/**
		 * The meta object literal for the '<em><b>Surface Data Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__SURFACE_DATA_GROUP = eINSTANCE.getSurfaceDataPropertyType_SurfaceDataGroup();

		/**
		 * The meta object literal for the '<em><b>Surface Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_DATA_PROPERTY_TYPE__SURFACE_DATA = eINSTANCE.getSurfaceDataPropertyType_SurfaceData();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__ACTUATE = eINSTANCE.getSurfaceDataPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__ARCROLE = eINSTANCE.getSurfaceDataPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__HREF = eINSTANCE.getSurfaceDataPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Remote Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__REMOTE_SCHEMA = eINSTANCE.getSurfaceDataPropertyType_RemoteSchema();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__ROLE = eINSTANCE.getSurfaceDataPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__SHOW = eINSTANCE.getSurfaceDataPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__TITLE = eINSTANCE.getSurfaceDataPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURFACE_DATA_PROPERTY_TYPE__TYPE = eINSTANCE.getSurfaceDataPropertyType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.TexCoordGenTypeImpl <em>Tex Coord Gen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.TexCoordGenTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTexCoordGenType()
		 * @generated
		 */
		EClass TEX_COORD_GEN_TYPE = eINSTANCE.getTexCoordGenType();

		/**
		 * The meta object literal for the '<em><b>World To Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE = eINSTANCE.getTexCoordGenType_WorldToTexture();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tex Coord Gen Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP = eINSTANCE.getTexCoordGenType_GenericApplicationPropertyOfTexCoordGenGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tex Coord Gen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN = eINSTANCE.getTexCoordGenType_GenericApplicationPropertyOfTexCoordGen();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.TexCoordListTypeImpl <em>Tex Coord List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.TexCoordListTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTexCoordListType()
		 * @generated
		 */
		EClass TEX_COORD_LIST_TYPE = eINSTANCE.getTexCoordListType();

		/**
		 * The meta object literal for the '<em><b>Texture Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES = eINSTANCE.getTexCoordListType_TextureCoordinates();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tex Coord List Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP = eINSTANCE.getTexCoordListType_GenericApplicationPropertyOfTexCoordListGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tex Coord List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST = eINSTANCE.getTexCoordListType_GenericApplicationPropertyOfTexCoordList();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.TextureAssociationTypeImpl <em>Texture Association Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.TextureAssociationTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureAssociationType()
		 * @generated
		 */
		EClass TEXTURE_ASSOCIATION_TYPE = eINSTANCE.getTextureAssociationType();

		/**
		 * The meta object literal for the '<em><b>Texture Parameterization Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__TEXTURE_PARAMETERIZATION_GROUP = eINSTANCE.getTextureAssociationType_TextureParameterizationGroup();

		/**
		 * The meta object literal for the '<em><b>Texture Parameterization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTURE_ASSOCIATION_TYPE__TEXTURE_PARAMETERIZATION = eINSTANCE.getTextureAssociationType_TextureParameterization();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__ACTUATE = eINSTANCE.getTextureAssociationType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__ARCROLE = eINSTANCE.getTextureAssociationType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__HREF = eINSTANCE.getTextureAssociationType_Href();

		/**
		 * The meta object literal for the '<em><b>Remote Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__REMOTE_SCHEMA = eINSTANCE.getTextureAssociationType_RemoteSchema();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__ROLE = eINSTANCE.getTextureAssociationType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__SHOW = eINSTANCE.getTextureAssociationType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__TITLE = eINSTANCE.getTextureAssociationType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__TYPE = eINSTANCE.getTextureAssociationType_Type();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_ASSOCIATION_TYPE__URI = eINSTANCE.getTextureAssociationType_Uri();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.TextureCoordinatesTypeImpl <em>Texture Coordinates Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.TextureCoordinatesTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureCoordinatesType()
		 * @generated
		 */
		EClass TEXTURE_COORDINATES_TYPE = eINSTANCE.getTextureCoordinatesType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_COORDINATES_TYPE__VALUE = eINSTANCE.getTextureCoordinatesType_Value();

		/**
		 * The meta object literal for the '<em><b>Ring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE_COORDINATES_TYPE__RING = eINSTANCE.getTextureCoordinatesType_Ring();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl <em>World To Texture Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.WorldToTextureTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getWorldToTextureType()
		 * @generated
		 */
		EClass WORLD_TO_TEXTURE_TYPE = eINSTANCE.getWorldToTextureType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_TO_TEXTURE_TYPE__VALUE = eINSTANCE.getWorldToTextureType_Value();

		/**
		 * The meta object literal for the '<em><b>Axis Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_TO_TEXTURE_TYPE__AXIS_LABELS = eINSTANCE.getWorldToTextureType_AxisLabels();

		/**
		 * The meta object literal for the '<em><b>Srs Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_TO_TEXTURE_TYPE__SRS_DIMENSION = eINSTANCE.getWorldToTextureType_SrsDimension();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_TO_TEXTURE_TYPE__SRS_NAME = eINSTANCE.getWorldToTextureType_SrsName();

		/**
		 * The meta object literal for the '<em><b>Uom Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORLD_TO_TEXTURE_TYPE__UOM_LABELS = eINSTANCE.getWorldToTextureType_UomLabels();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl <em>X3D Material Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getX3DMaterialType()
		 * @generated
		 */
		EClass X3D_MATERIAL_TYPE = eINSTANCE.getX3DMaterialType();

		/**
		 * The meta object literal for the '<em><b>Ambient Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__AMBIENT_INTENSITY = eINSTANCE.getX3DMaterialType_AmbientIntensity();

		/**
		 * The meta object literal for the '<em><b>Diffuse Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__DIFFUSE_COLOR = eINSTANCE.getX3DMaterialType_DiffuseColor();

		/**
		 * The meta object literal for the '<em><b>Emissive Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__EMISSIVE_COLOR = eINSTANCE.getX3DMaterialType_EmissiveColor();

		/**
		 * The meta object literal for the '<em><b>Specular Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__SPECULAR_COLOR = eINSTANCE.getX3DMaterialType_SpecularColor();

		/**
		 * The meta object literal for the '<em><b>Shininess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__SHININESS = eINSTANCE.getX3DMaterialType_Shininess();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__TRANSPARENCY = eINSTANCE.getX3DMaterialType_Transparency();

		/**
		 * The meta object literal for the '<em><b>Is Smooth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__IS_SMOOTH = eINSTANCE.getX3DMaterialType_IsSmooth();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__TARGET = eINSTANCE.getX3DMaterialType_Target();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of X3D Material Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP = eINSTANCE.getX3DMaterialType_GenericApplicationPropertyOfX3DMaterialGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of X3D Material</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL = eINSTANCE.getX3DMaterialType_GenericApplicationPropertyOfX3DMaterial();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.TextureTypeType <em>Texture Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.TextureTypeType
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureTypeType()
		 * @generated
		 */
		EEnum TEXTURE_TYPE_TYPE = eINSTANCE.getTextureTypeType();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.appearance.WrapModeType <em>Wrap Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.WrapModeType
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getWrapModeType()
		 * @generated
		 */
		EEnum WRAP_MODE_TYPE = eINSTANCE.getWrapModeType();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Color Plus Opacity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getColorPlusOpacity()
		 * @generated
		 */
		EDataType COLOR_PLUS_OPACITY = eINSTANCE.getColorPlusOpacity();

		/**
		 * The meta object literal for the '<em>Texture Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.TextureTypeType
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getTextureTypeTypeObject()
		 * @generated
		 */
		EDataType TEXTURE_TYPE_TYPE_OBJECT = eINSTANCE.getTextureTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Wrap Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.appearance.WrapModeType
		 * @see net.opengis.citygml.appearance.impl.AppearancePackageImpl#getWrapModeTypeObject()
		 * @generated
		 */
		EDataType WRAP_MODE_TYPE_OBJECT = eINSTANCE.getWrapModeTypeObject();

	}

} //AppearancePackage
