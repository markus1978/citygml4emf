/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see net.opengis.citygml.waterbody.WaterbodyFactory
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
public interface WaterbodyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "waterbody";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/waterbody/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wtr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WaterbodyPackage eINSTANCE = net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl <em>Abstract Water Boundary Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getAbstractWaterBoundarySurfaceType()
	 * @generated
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lod3 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lod4 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Water Boundary Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.AbstractWaterObjectTypeImpl <em>Abstract Water Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.AbstractWaterObjectTypeImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getAbstractWaterObjectType()
	 * @generated
	 */
	int ABSTRACT_WATER_OBJECT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Water Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.BoundedByWaterSurfacePropertyTypeImpl <em>Bounded By Water Surface Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.BoundedByWaterSurfacePropertyTypeImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getBoundedByWaterSurfacePropertyType()
	 * @generated
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Bounded By Water Surface Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.DocumentRootImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Generic Application Property Of Water Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY = 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE = 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE = 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE = 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE = 8;

	/**
	 * The feature id for the '<em><b>Water Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_BOUNDARY_SURFACE = 9;

	/**
	 * The feature id for the '<em><b>Water Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Water Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_BODY = 11;

	/**
	 * The feature id for the '<em><b>Water Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_CLOSURE_SURFACE = 12;

	/**
	 * The feature id for the '<em><b>Water Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_GROUND_SURFACE = 13;

	/**
	 * The feature id for the '<em><b>Water Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WATER_SURFACE = 14;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl <em>Water Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyType()
	 * @generated
	 */
	int WATER_BODY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__META_DATA_PROPERTY = ABSTRACT_WATER_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__DESCRIPTION = ABSTRACT_WATER_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__NAME_GROUP = ABSTRACT_WATER_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__NAME = ABSTRACT_WATER_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__ID = ABSTRACT_WATER_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__BOUNDED_BY = ABSTRACT_WATER_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOCATION_GROUP = ABSTRACT_WATER_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOCATION = ABSTRACT_WATER_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__CREATION_DATE = ABSTRACT_WATER_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__TERMINATION_DATE = ABSTRACT_WATER_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__EXTERNAL_REFERENCE = ABSTRACT_WATER_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__GENERALIZES_TO = ABSTRACT_WATER_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP = ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT = ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__CLASS = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__FUNCTION = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__USAGE = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod0 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD0_MULTI_CURVE = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod0 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD0_MULTI_SURFACE = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD1_MULTI_CURVE = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD1_MULTI_SURFACE = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lod1 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD1_SOLID = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lod2 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD2_SOLID = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lod3 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD3_SOLID = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lod4 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__LOD4_SOLID = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bounded By1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__BOUNDED_BY1 = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Body Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Water Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_BODY_TYPE_FEATURE_COUNT = ABSTRACT_WATER_OBJECT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.WaterClosureSurfaceTypeImpl <em>Water Closure Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.WaterClosureSurfaceTypeImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterClosureSurfaceType()
	 * @generated
	 */
	int WATER_CLOSURE_SURFACE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__DESCRIPTION = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__NAME_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__NAME = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__ID = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__LOCATION = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__CREATION_DATE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__LOD2_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__LOD3_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__LOD4_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Closure Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Closure Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Water Closure Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_CLOSURE_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.WaterGroundSurfaceTypeImpl <em>Water Ground Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.WaterGroundSurfaceTypeImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterGroundSurfaceType()
	 * @generated
	 */
	int WATER_GROUND_SURFACE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__DESCRIPTION = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__NAME_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__NAME = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__ID = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__LOCATION = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__CREATION_DATE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__LOD2_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__LOD3_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__LOD4_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Ground Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Ground Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Water Ground Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_GROUND_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.waterbody.impl.WaterSurfaceTypeImpl <em>Water Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.waterbody.impl.WaterSurfaceTypeImpl
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterSurfaceType()
	 * @generated
	 */
	int WATER_SURFACE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__DESCRIPTION = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__NAME_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__NAME = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__ID = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__LOCATION = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__CREATION_DATE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__LOD2_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__LOD3_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__LOD4_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Water Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__WATER_LEVEL = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Water Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Water Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>Water Body Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyClassType()
	 * @generated
	 */
	int WATER_BODY_CLASS_TYPE = 8;

	/**
	 * The meta object id for the '<em>Water Body Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyFunctionType()
	 * @generated
	 */
	int WATER_BODY_FUNCTION_TYPE = 9;

	/**
	 * The meta object id for the '<em>Water Body Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyUsageType()
	 * @generated
	 */
	int WATER_BODY_USAGE_TYPE = 10;

	/**
	 * The meta object id for the '<em>Water Level Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterLevelType()
	 * @generated
	 */
	int WATER_LEVEL_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType <em>Abstract Water Boundary Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Water Boundary Surface Type</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType
	 * @generated
	 */
	EClass getAbstractWaterBoundarySurfaceType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod2Surface <em>Lod2 Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Surface</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod2Surface()
	 * @see #getAbstractWaterBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractWaterBoundarySurfaceType_Lod2Surface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod3Surface <em>Lod3 Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Surface</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod3Surface()
	 * @see #getAbstractWaterBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractWaterBoundarySurfaceType_Lod3Surface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod4Surface <em>Lod4 Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Surface</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getLod4Surface()
	 * @see #getAbstractWaterBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractWaterBoundarySurfaceType_Lod4Surface();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getGenericApplicationPropertyOfWaterBoundarySurfaceGroup <em>Generic Application Property Of Water Boundary Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Water Boundary Surface Group</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getGenericApplicationPropertyOfWaterBoundarySurfaceGroup()
	 * @see #getAbstractWaterBoundarySurfaceType()
	 * @generated
	 */
	EAttribute getAbstractWaterBoundarySurfaceType_GenericApplicationPropertyOfWaterBoundarySurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getGenericApplicationPropertyOfWaterBoundarySurface <em>Generic Application Property Of Water Boundary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Water Boundary Surface</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType#getGenericApplicationPropertyOfWaterBoundarySurface()
	 * @see #getAbstractWaterBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractWaterBoundarySurfaceType_GenericApplicationPropertyOfWaterBoundarySurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.AbstractWaterObjectType <em>Abstract Water Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Water Object Type</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterObjectType
	 * @generated
	 */
	EClass getAbstractWaterObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.AbstractWaterObjectType#getGenericApplicationPropertyOfWaterObjectGroup <em>Generic Application Property Of Water Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Water Object Group</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterObjectType#getGenericApplicationPropertyOfWaterObjectGroup()
	 * @see #getAbstractWaterObjectType()
	 * @generated
	 */
	EAttribute getAbstractWaterObjectType_GenericApplicationPropertyOfWaterObjectGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.waterbody.AbstractWaterObjectType#getGenericApplicationPropertyOfWaterObject <em>Generic Application Property Of Water Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Water Object</em>'.
	 * @see net.opengis.citygml.waterbody.AbstractWaterObjectType#getGenericApplicationPropertyOfWaterObject()
	 * @see #getAbstractWaterObjectType()
	 * @generated
	 */
	EReference getAbstractWaterObjectType_GenericApplicationPropertyOfWaterObject();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.BoundedByWaterSurfacePropertyType <em>Bounded By Water Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded By Water Surface Property Type</em>'.
	 * @see net.opengis.citygml.waterbody.BoundedByWaterSurfacePropertyType
	 * @generated
	 */
	EClass getBoundedByWaterSurfacePropertyType();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.waterbody.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.waterbody.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterBody <em>Generic Application Property Of Water Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Water Body</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWaterBody();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterBoundarySurface <em>Generic Application Property Of Water Boundary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Water Boundary Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterBoundarySurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWaterBoundarySurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterClosureSurface <em>Generic Application Property Of Water Closure Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Water Closure Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterClosureSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWaterClosureSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterGroundSurface <em>Generic Application Property Of Water Ground Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Water Ground Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterGroundSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWaterGroundSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterObject <em>Generic Application Property Of Water Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Water Object</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWaterObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterSurface <em>Generic Application Property Of Water Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Water Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWaterSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterBoundarySurface <em>Water Boundary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Water Boundary Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getWaterBoundarySurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WaterBoundarySurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterObject <em>Water Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Water Object</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getWaterObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WaterObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterBody <em>Water Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Water Body</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getWaterBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WaterBody();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterClosureSurface <em>Water Closure Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Water Closure Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getWaterClosureSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WaterClosureSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterGroundSurface <em>Water Ground Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Water Ground Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getWaterGroundSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WaterGroundSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterSurface <em>Water Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Water Surface</em>'.
	 * @see net.opengis.citygml.waterbody.DocumentRoot#getWaterSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WaterSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.WaterBodyType <em>Water Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Body Type</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType
	 * @generated
	 */
	EClass getWaterBodyType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.waterbody.WaterBodyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getClass_()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EAttribute getWaterBodyType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.WaterBodyType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getFunction()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EAttribute getWaterBodyType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.WaterBodyType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getUsage()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EAttribute getWaterBodyType_Usage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiCurve <em>Lod0 Multi Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod0 Multi Curve</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiCurve()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod0MultiCurve();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiSurface <em>Lod0 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod0 Multi Surface</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod0MultiSurface()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod0MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiCurve <em>Lod1 Multi Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Multi Curve</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiCurve()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod1MultiCurve();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Multi Surface</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod1MultiSurface()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod1MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod1Solid <em>Lod1 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Solid</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod1Solid()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod1Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod2Solid <em>Lod2 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Solid</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod2Solid()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod2Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod3Solid <em>Lod3 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Solid</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod3Solid()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod3Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.waterbody.WaterBodyType#getLod4Solid <em>Lod4 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Solid</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getLod4Solid()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_Lod4Solid();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.waterbody.WaterBodyType#getBoundedBy1 <em>Bounded By1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded By1</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getBoundedBy1()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_BoundedBy1();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.WaterBodyType#getGenericApplicationPropertyOfWaterBodyGroup <em>Generic Application Property Of Water Body Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Water Body Group</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getGenericApplicationPropertyOfWaterBodyGroup()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EAttribute getWaterBodyType_GenericApplicationPropertyOfWaterBodyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.waterbody.WaterBodyType#getGenericApplicationPropertyOfWaterBody <em>Generic Application Property Of Water Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Water Body</em>'.
	 * @see net.opengis.citygml.waterbody.WaterBodyType#getGenericApplicationPropertyOfWaterBody()
	 * @see #getWaterBodyType()
	 * @generated
	 */
	EReference getWaterBodyType_GenericApplicationPropertyOfWaterBody();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.WaterClosureSurfaceType <em>Water Closure Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Closure Surface Type</em>'.
	 * @see net.opengis.citygml.waterbody.WaterClosureSurfaceType
	 * @generated
	 */
	EClass getWaterClosureSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.WaterClosureSurfaceType#getGenericApplicationPropertyOfWaterClosureSurfaceGroup <em>Generic Application Property Of Water Closure Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Water Closure Surface Group</em>'.
	 * @see net.opengis.citygml.waterbody.WaterClosureSurfaceType#getGenericApplicationPropertyOfWaterClosureSurfaceGroup()
	 * @see #getWaterClosureSurfaceType()
	 * @generated
	 */
	EAttribute getWaterClosureSurfaceType_GenericApplicationPropertyOfWaterClosureSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.waterbody.WaterClosureSurfaceType#getGenericApplicationPropertyOfWaterClosureSurface <em>Generic Application Property Of Water Closure Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Water Closure Surface</em>'.
	 * @see net.opengis.citygml.waterbody.WaterClosureSurfaceType#getGenericApplicationPropertyOfWaterClosureSurface()
	 * @see #getWaterClosureSurfaceType()
	 * @generated
	 */
	EReference getWaterClosureSurfaceType_GenericApplicationPropertyOfWaterClosureSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.WaterGroundSurfaceType <em>Water Ground Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Ground Surface Type</em>'.
	 * @see net.opengis.citygml.waterbody.WaterGroundSurfaceType
	 * @generated
	 */
	EClass getWaterGroundSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.WaterGroundSurfaceType#getGenericApplicationPropertyOfWaterGroundSurfaceGroup <em>Generic Application Property Of Water Ground Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Water Ground Surface Group</em>'.
	 * @see net.opengis.citygml.waterbody.WaterGroundSurfaceType#getGenericApplicationPropertyOfWaterGroundSurfaceGroup()
	 * @see #getWaterGroundSurfaceType()
	 * @generated
	 */
	EAttribute getWaterGroundSurfaceType_GenericApplicationPropertyOfWaterGroundSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.waterbody.WaterGroundSurfaceType#getGenericApplicationPropertyOfWaterGroundSurface <em>Generic Application Property Of Water Ground Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Water Ground Surface</em>'.
	 * @see net.opengis.citygml.waterbody.WaterGroundSurfaceType#getGenericApplicationPropertyOfWaterGroundSurface()
	 * @see #getWaterGroundSurfaceType()
	 * @generated
	 */
	EReference getWaterGroundSurfaceType_GenericApplicationPropertyOfWaterGroundSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.waterbody.WaterSurfaceType <em>Water Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Surface Type</em>'.
	 * @see net.opengis.citygml.waterbody.WaterSurfaceType
	 * @generated
	 */
	EClass getWaterSurfaceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.waterbody.WaterSurfaceType#getWaterLevel <em>Water Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water Level</em>'.
	 * @see net.opengis.citygml.waterbody.WaterSurfaceType#getWaterLevel()
	 * @see #getWaterSurfaceType()
	 * @generated
	 */
	EAttribute getWaterSurfaceType_WaterLevel();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.waterbody.WaterSurfaceType#getGenericApplicationPropertyOfWaterSurfaceGroup <em>Generic Application Property Of Water Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Water Surface Group</em>'.
	 * @see net.opengis.citygml.waterbody.WaterSurfaceType#getGenericApplicationPropertyOfWaterSurfaceGroup()
	 * @see #getWaterSurfaceType()
	 * @generated
	 */
	EAttribute getWaterSurfaceType_GenericApplicationPropertyOfWaterSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.waterbody.WaterSurfaceType#getGenericApplicationPropertyOfWaterSurface <em>Generic Application Property Of Water Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Water Surface</em>'.
	 * @see net.opengis.citygml.waterbody.WaterSurfaceType#getGenericApplicationPropertyOfWaterSurface()
	 * @see #getWaterSurfaceType()
	 * @generated
	 */
	EReference getWaterSurfaceType_GenericApplicationPropertyOfWaterSurface();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Water Body Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Water Body Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WaterBodyClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getWaterBodyClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Water Body Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Water Body Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WaterBodyFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getWaterBodyFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Water Body Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Water Body Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WaterBodyUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getWaterBodyUsageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Water Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Water Level Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='WaterLevelType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getWaterLevelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WaterbodyFactory getWaterbodyFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl <em>Abstract Water Boundary Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getAbstractWaterBoundarySurfaceType()
		 * @generated
		 */
		EClass ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE = eINSTANCE.getAbstractWaterBoundarySurfaceType();

		/**
		 * The meta object literal for the '<em><b>Lod2 Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE = eINSTANCE.getAbstractWaterBoundarySurfaceType_Lod2Surface();

		/**
		 * The meta object literal for the '<em><b>Lod3 Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE = eINSTANCE.getAbstractWaterBoundarySurfaceType_Lod3Surface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE = eINSTANCE.getAbstractWaterBoundarySurfaceType_Lod4Surface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Boundary Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP = eINSTANCE.getAbstractWaterBoundarySurfaceType_GenericApplicationPropertyOfWaterBoundarySurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE = eINSTANCE.getAbstractWaterBoundarySurfaceType_GenericApplicationPropertyOfWaterBoundarySurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.AbstractWaterObjectTypeImpl <em>Abstract Water Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.AbstractWaterObjectTypeImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getAbstractWaterObjectType()
		 * @generated
		 */
		EClass ABSTRACT_WATER_OBJECT_TYPE = eINSTANCE.getAbstractWaterObjectType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP = eINSTANCE.getAbstractWaterObjectType_GenericApplicationPropertyOfWaterObjectGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT = eINSTANCE.getAbstractWaterObjectType_GenericApplicationPropertyOfWaterObject();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.BoundedByWaterSurfacePropertyTypeImpl <em>Bounded By Water Surface Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.BoundedByWaterSurfacePropertyTypeImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getBoundedByWaterSurfacePropertyType()
		 * @generated
		 */
		EClass BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE = eINSTANCE.getBoundedByWaterSurfacePropertyType();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.DocumentRootImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWaterBody();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWaterBoundarySurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Closure Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWaterClosureSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Ground Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWaterGroundSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWaterObject();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWaterSurface();

		/**
		 * The meta object literal for the '<em><b>Water Boundary Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WATER_BOUNDARY_SURFACE = eINSTANCE.getDocumentRoot_WaterBoundarySurface();

		/**
		 * The meta object literal for the '<em><b>Water Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WATER_OBJECT = eINSTANCE.getDocumentRoot_WaterObject();

		/**
		 * The meta object literal for the '<em><b>Water Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WATER_BODY = eINSTANCE.getDocumentRoot_WaterBody();

		/**
		 * The meta object literal for the '<em><b>Water Closure Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WATER_CLOSURE_SURFACE = eINSTANCE.getDocumentRoot_WaterClosureSurface();

		/**
		 * The meta object literal for the '<em><b>Water Ground Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WATER_GROUND_SURFACE = eINSTANCE.getDocumentRoot_WaterGroundSurface();

		/**
		 * The meta object literal for the '<em><b>Water Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WATER_SURFACE = eINSTANCE.getDocumentRoot_WaterSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl <em>Water Body Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyType()
		 * @generated
		 */
		EClass WATER_BODY_TYPE = eINSTANCE.getWaterBodyType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_BODY_TYPE__CLASS = eINSTANCE.getWaterBodyType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_BODY_TYPE__FUNCTION = eINSTANCE.getWaterBodyType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_BODY_TYPE__USAGE = eINSTANCE.getWaterBodyType_Usage();

		/**
		 * The meta object literal for the '<em><b>Lod0 Multi Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD0_MULTI_CURVE = eINSTANCE.getWaterBodyType_Lod0MultiCurve();

		/**
		 * The meta object literal for the '<em><b>Lod0 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD0_MULTI_SURFACE = eINSTANCE.getWaterBodyType_Lod0MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod1 Multi Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD1_MULTI_CURVE = eINSTANCE.getWaterBodyType_Lod1MultiCurve();

		/**
		 * The meta object literal for the '<em><b>Lod1 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD1_MULTI_SURFACE = eINSTANCE.getWaterBodyType_Lod1MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod1 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD1_SOLID = eINSTANCE.getWaterBodyType_Lod1Solid();

		/**
		 * The meta object literal for the '<em><b>Lod2 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD2_SOLID = eINSTANCE.getWaterBodyType_Lod2Solid();

		/**
		 * The meta object literal for the '<em><b>Lod3 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD3_SOLID = eINSTANCE.getWaterBodyType_Lod3Solid();

		/**
		 * The meta object literal for the '<em><b>Lod4 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__LOD4_SOLID = eINSTANCE.getWaterBodyType_Lod4Solid();

		/**
		 * The meta object literal for the '<em><b>Bounded By1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__BOUNDED_BY1 = eINSTANCE.getWaterBodyType_BoundedBy1();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Body Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP = eINSTANCE.getWaterBodyType_GenericApplicationPropertyOfWaterBodyGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY = eINSTANCE.getWaterBodyType_GenericApplicationPropertyOfWaterBody();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.WaterClosureSurfaceTypeImpl <em>Water Closure Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.WaterClosureSurfaceTypeImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterClosureSurfaceType()
		 * @generated
		 */
		EClass WATER_CLOSURE_SURFACE_TYPE = eINSTANCE.getWaterClosureSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Closure Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE_GROUP = eINSTANCE.getWaterClosureSurfaceType_GenericApplicationPropertyOfWaterClosureSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Closure Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE = eINSTANCE.getWaterClosureSurfaceType_GenericApplicationPropertyOfWaterClosureSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.WaterGroundSurfaceTypeImpl <em>Water Ground Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.WaterGroundSurfaceTypeImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterGroundSurfaceType()
		 * @generated
		 */
		EClass WATER_GROUND_SURFACE_TYPE = eINSTANCE.getWaterGroundSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Ground Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE_GROUP = eINSTANCE.getWaterGroundSurfaceType_GenericApplicationPropertyOfWaterGroundSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Ground Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE = eINSTANCE.getWaterGroundSurfaceType_GenericApplicationPropertyOfWaterGroundSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.waterbody.impl.WaterSurfaceTypeImpl <em>Water Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.waterbody.impl.WaterSurfaceTypeImpl
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterSurfaceType()
		 * @generated
		 */
		EClass WATER_SURFACE_TYPE = eINSTANCE.getWaterSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Water Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_SURFACE_TYPE__WATER_LEVEL = eINSTANCE.getWaterSurfaceType_WaterLevel();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE_GROUP = eINSTANCE.getWaterSurfaceType_GenericApplicationPropertyOfWaterSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Water Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE = eINSTANCE.getWaterSurfaceType_GenericApplicationPropertyOfWaterSurface();

		/**
		 * The meta object literal for the '<em>Water Body Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyClassType()
		 * @generated
		 */
		EDataType WATER_BODY_CLASS_TYPE = eINSTANCE.getWaterBodyClassType();

		/**
		 * The meta object literal for the '<em>Water Body Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyFunctionType()
		 * @generated
		 */
		EDataType WATER_BODY_FUNCTION_TYPE = eINSTANCE.getWaterBodyFunctionType();

		/**
		 * The meta object literal for the '<em>Water Body Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterBodyUsageType()
		 * @generated
		 */
		EDataType WATER_BODY_USAGE_TYPE = eINSTANCE.getWaterBodyUsageType();

		/**
		 * The meta object literal for the '<em>Water Level Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.waterbody.impl.WaterbodyPackageImpl#getWaterLevelType()
		 * @generated
		 */
		EDataType WATER_LEVEL_TYPE = eINSTANCE.getWaterLevelType();

	}

} //WaterbodyPackage
