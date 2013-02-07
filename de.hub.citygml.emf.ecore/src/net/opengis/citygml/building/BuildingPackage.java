/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

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
 * @see net.opengis.citygml.building.BuildingFactory
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
public interface BuildingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "building";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/building/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bldg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildingPackage eINSTANCE = net.opengis.citygml.building.impl.BuildingPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl <em>Abstract Boundary Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getAbstractBoundarySurfaceType()
	 * @generated
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Boundary Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl <em>Abstract Building Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.AbstractBuildingTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getAbstractBuildingType()
	 * @generated
	 */
	int ABSTRACT_BUILDING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_SITE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_SITE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_SITE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__NAME = CitygmlPackage.ABSTRACT_SITE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__ID = CitygmlPackage.ABSTRACT_SITE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_SITE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_SITE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOCATION = CitygmlPackage.ABSTRACT_SITE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_SITE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_SITE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_SITE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_SITE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP = CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE = CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__CLASS = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__FUNCTION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__USAGE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Year Of Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Year Of Demolition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Roof Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__ROOF_TYPE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Storeys Above Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Storeys Below Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Storey Heights Above Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Storey Heights Below Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lod1 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD1_SOLID = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Lod1 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Lod2 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD2_SOLID = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Lod2 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Outer Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Interior Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Bounded By1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__BOUNDED_BY1 = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Lod3 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD3_SOLID = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Lod3 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Lod4 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD4_SOLID = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Lod4 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Interior Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Consists Of Building Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__ADDRESS = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Abstract Building Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 33;

	/**
	 * The number of structural features of the '<em>Abstract Building Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BUILDING_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_SITE_TYPE_FEATURE_COUNT + 34;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.AbstractOpeningTypeImpl <em>Abstract Opening Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.AbstractOpeningTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getAbstractOpeningType()
	 * @generated
	 */
	int ABSTRACT_OPENING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Opening Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Opening Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OPENING_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.BoundarySurfacePropertyTypeImpl <em>Boundary Surface Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.BoundarySurfacePropertyTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBoundarySurfacePropertyType()
	 * @generated
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boundary Surface Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_SURFACE_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl <em>Furniture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureType()
	 * @generated
	 */
	int BUILDING_FURNITURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__CLASS = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__FUNCTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__USAGE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod4 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod4 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Furniture Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Furniture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Furniture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FURNITURE_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.BuildingInstallationPropertyTypeImpl <em>Installation Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.BuildingInstallationPropertyTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationPropertyType()
	 * @generated
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Installation Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl <em>Installation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.BuildingInstallationTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationType()
	 * @generated
	 */
	int BUILDING_INSTALLATION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__CLASS = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__FUNCTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__USAGE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod2 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod3 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lod4 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Installation Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Installation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_INSTALLATION_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.BuildingPartPropertyTypeImpl <em>Part Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.BuildingPartPropertyTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingPartPropertyType()
	 * @generated
	 */
	int BUILDING_PART_PROPERTY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Building Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE__BUILDING_PART = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.BuildingPartTypeImpl <em>Part Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.BuildingPartTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingPartType()
	 * @generated
	 */
	int BUILDING_PART_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__META_DATA_PROPERTY = ABSTRACT_BUILDING_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__DESCRIPTION = ABSTRACT_BUILDING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__NAME_GROUP = ABSTRACT_BUILDING_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__NAME = ABSTRACT_BUILDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__ID = ABSTRACT_BUILDING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__BOUNDED_BY = ABSTRACT_BUILDING_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOCATION_GROUP = ABSTRACT_BUILDING_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOCATION = ABSTRACT_BUILDING_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__CREATION_DATE = ABSTRACT_BUILDING_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__TERMINATION_DATE = ABSTRACT_BUILDING_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BUILDING_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERALIZES_TO = ABSTRACT_BUILDING_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__CLASS = ABSTRACT_BUILDING_TYPE__CLASS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__FUNCTION = ABSTRACT_BUILDING_TYPE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__USAGE = ABSTRACT_BUILDING_TYPE__USAGE;

	/**
	 * The feature id for the '<em><b>Year Of Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__YEAR_OF_CONSTRUCTION = ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION;

	/**
	 * The feature id for the '<em><b>Year Of Demolition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__YEAR_OF_DEMOLITION = ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION;

	/**
	 * The feature id for the '<em><b>Roof Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__ROOF_TYPE = ABSTRACT_BUILDING_TYPE__ROOF_TYPE;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__MEASURED_HEIGHT = ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Storeys Above Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__STOREYS_ABOVE_GROUND = ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND;

	/**
	 * The feature id for the '<em><b>Storeys Below Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__STOREYS_BELOW_GROUND = ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND;

	/**
	 * The feature id for the '<em><b>Storey Heights Above Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__STOREY_HEIGHTS_ABOVE_GROUND = ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND;

	/**
	 * The feature id for the '<em><b>Storey Heights Below Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__STOREY_HEIGHTS_BELOW_GROUND = ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND;

	/**
	 * The feature id for the '<em><b>Lod1 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD1_SOLID = ABSTRACT_BUILDING_TYPE__LOD1_SOLID;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD1_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod1 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD1_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Lod2 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD2_SOLID = ABSTRACT_BUILDING_TYPE__LOD2_SOLID;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD2_MULTI_CURVE = ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE;

	/**
	 * The feature id for the '<em><b>Lod2 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD2_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Outer Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__OUTER_BUILDING_INSTALLATION = ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION;

	/**
	 * The feature id for the '<em><b>Interior Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__INTERIOR_BUILDING_INSTALLATION = ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION;

	/**
	 * The feature id for the '<em><b>Bounded By1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__BOUNDED_BY1 = ABSTRACT_BUILDING_TYPE__BOUNDED_BY1;

	/**
	 * The feature id for the '<em><b>Lod3 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD3_SOLID = ABSTRACT_BUILDING_TYPE__LOD3_SOLID;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD3_MULTI_CURVE = ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE;

	/**
	 * The feature id for the '<em><b>Lod3 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD3_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Lod4 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD4_SOLID = ABSTRACT_BUILDING_TYPE__LOD4_SOLID;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD4_MULTI_CURVE = ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE;

	/**
	 * The feature id for the '<em><b>Lod4 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__LOD4_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Interior Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__INTERIOR_ROOM = ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM;

	/**
	 * The feature id for the '<em><b>Consists Of Building Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__CONSISTS_OF_BUILDING_PART = ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__ADDRESS = ABSTRACT_BUILDING_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Abstract Building Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Part Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP = ABSTRACT_BUILDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART = ABSTRACT_BUILDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Part Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_PART_TYPE_FEATURE_COUNT = ABSTRACT_BUILDING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.BuildingTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.BuildingTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingType()
	 * @generated
	 */
	int BUILDING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__META_DATA_PROPERTY = ABSTRACT_BUILDING_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__DESCRIPTION = ABSTRACT_BUILDING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__NAME_GROUP = ABSTRACT_BUILDING_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__NAME = ABSTRACT_BUILDING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__ID = ABSTRACT_BUILDING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__BOUNDED_BY = ABSTRACT_BUILDING_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOCATION_GROUP = ABSTRACT_BUILDING_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOCATION = ABSTRACT_BUILDING_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__CREATION_DATE = ABSTRACT_BUILDING_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__TERMINATION_DATE = ABSTRACT_BUILDING_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BUILDING_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERALIZES_TO = ABSTRACT_BUILDING_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__CLASS = ABSTRACT_BUILDING_TYPE__CLASS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__FUNCTION = ABSTRACT_BUILDING_TYPE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__USAGE = ABSTRACT_BUILDING_TYPE__USAGE;

	/**
	 * The feature id for the '<em><b>Year Of Construction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__YEAR_OF_CONSTRUCTION = ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION;

	/**
	 * The feature id for the '<em><b>Year Of Demolition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__YEAR_OF_DEMOLITION = ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION;

	/**
	 * The feature id for the '<em><b>Roof Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__ROOF_TYPE = ABSTRACT_BUILDING_TYPE__ROOF_TYPE;

	/**
	 * The feature id for the '<em><b>Measured Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__MEASURED_HEIGHT = ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT;

	/**
	 * The feature id for the '<em><b>Storeys Above Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__STOREYS_ABOVE_GROUND = ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND;

	/**
	 * The feature id for the '<em><b>Storeys Below Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__STOREYS_BELOW_GROUND = ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND;

	/**
	 * The feature id for the '<em><b>Storey Heights Above Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND = ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND;

	/**
	 * The feature id for the '<em><b>Storey Heights Below Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND = ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND;

	/**
	 * The feature id for the '<em><b>Lod1 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD1_SOLID = ABSTRACT_BUILDING_TYPE__LOD1_SOLID;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD1_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod1 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Lod2 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD2_SOLID = ABSTRACT_BUILDING_TYPE__LOD2_SOLID;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD2_MULTI_CURVE = ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE;

	/**
	 * The feature id for the '<em><b>Lod2 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Outer Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__OUTER_BUILDING_INSTALLATION = ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION;

	/**
	 * The feature id for the '<em><b>Interior Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION = ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION;

	/**
	 * The feature id for the '<em><b>Bounded By1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__BOUNDED_BY1 = ABSTRACT_BUILDING_TYPE__BOUNDED_BY1;

	/**
	 * The feature id for the '<em><b>Lod3 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD3_SOLID = ABSTRACT_BUILDING_TYPE__LOD3_SOLID;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD3_MULTI_CURVE = ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE;

	/**
	 * The feature id for the '<em><b>Lod3 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Lod4 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD4_SOLID = ABSTRACT_BUILDING_TYPE__LOD4_SOLID;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD4_MULTI_CURVE = ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE;

	/**
	 * The feature id for the '<em><b>Lod4 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION = ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION;

	/**
	 * The feature id for the '<em><b>Interior Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__INTERIOR_ROOM = ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM;

	/**
	 * The feature id for the '<em><b>Consists Of Building Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__CONSISTS_OF_BUILDING_PART = ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__ADDRESS = ABSTRACT_BUILDING_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Abstract Building Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING = ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP = ABSTRACT_BUILDING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING = ABSTRACT_BUILDING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_TYPE_FEATURE_COUNT = ABSTRACT_BUILDING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.CeilingSurfaceTypeImpl <em>Ceiling Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.CeilingSurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getCeilingSurfaceType()
	 * @generated
	 */
	int CEILING_SURFACE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__DESCRIPTION = ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__NAME_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__NAME = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__ID = ABSTRACT_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__LOCATION = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__CREATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__OPENING = ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Ceiling Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Ceiling Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ceiling Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEILING_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.ClosureSurfaceTypeImpl <em>Closure Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.ClosureSurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getClosureSurfaceType()
	 * @generated
	 */
	int CLOSURE_SURFACE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__DESCRIPTION = ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__NAME_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__NAME = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__ID = ABSTRACT_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__LOCATION = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__CREATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__OPENING = ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Closure Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Closure Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Closure Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSURE_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.DocumentRootImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

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
	 * The feature id for the '<em><b>Abstract Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_BUILDING = 3;

	/**
	 * The feature id for the '<em><b>Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUNDARY_SURFACE = 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING = 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING = 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Furniture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE = 8;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION = 9;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Building Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART = 10;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Ceiling Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE = 11;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE = 12;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Door</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR = 13;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Floor Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE = 14;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE = 15;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Int Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION = 16;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Interior Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE = 17;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING = 18;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Roof Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE = 19;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM = 20;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE = 21;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW = 22;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPENING = 23;

	/**
	 * The feature id for the '<em><b>Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUILDING = 24;

	/**
	 * The feature id for the '<em><b>Building Furniture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUILDING_FURNITURE = 25;

	/**
	 * The feature id for the '<em><b>Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUILDING_INSTALLATION = 26;

	/**
	 * The feature id for the '<em><b>Building Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUILDING_PART = 27;

	/**
	 * The feature id for the '<em><b>Ceiling Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CEILING_SURFACE = 28;

	/**
	 * The feature id for the '<em><b>Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLOSURE_SURFACE = 29;

	/**
	 * The feature id for the '<em><b>Door</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOOR = 30;

	/**
	 * The feature id for the '<em><b>Floor Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLOOR_SURFACE = 31;

	/**
	 * The feature id for the '<em><b>Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUND_SURFACE = 32;

	/**
	 * The feature id for the '<em><b>Int Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INT_BUILDING_INSTALLATION = 33;

	/**
	 * The feature id for the '<em><b>Interior Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERIOR_WALL_SURFACE = 34;

	/**
	 * The feature id for the '<em><b>Roof Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOF_SURFACE = 35;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOM = 36;

	/**
	 * The feature id for the '<em><b>Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WALL_SURFACE = 37;

	/**
	 * The feature id for the '<em><b>Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WINDOW = 38;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 39;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.DoorTypeImpl <em>Door Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.DoorTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getDoorType()
	 * @generated
	 */
	int DOOR_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__META_DATA_PROPERTY = ABSTRACT_OPENING_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__DESCRIPTION = ABSTRACT_OPENING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__NAME_GROUP = ABSTRACT_OPENING_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__NAME = ABSTRACT_OPENING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__ID = ABSTRACT_OPENING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__BOUNDED_BY = ABSTRACT_OPENING_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__LOCATION_GROUP = ABSTRACT_OPENING_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__LOCATION = ABSTRACT_OPENING_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__CREATION_DATE = ABSTRACT_OPENING_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__TERMINATION_DATE = ABSTRACT_OPENING_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__EXTERNAL_REFERENCE = ABSTRACT_OPENING_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__GENERALIZES_TO = ABSTRACT_OPENING_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Opening Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__ADDRESS = ABSTRACT_OPENING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Door Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP = ABSTRACT_OPENING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Door</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR = ABSTRACT_OPENING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Door Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_TYPE_FEATURE_COUNT = ABSTRACT_OPENING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.FloorSurfaceTypeImpl <em>Floor Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.FloorSurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getFloorSurfaceType()
	 * @generated
	 */
	int FLOOR_SURFACE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__DESCRIPTION = ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__NAME_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__NAME = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__ID = ABSTRACT_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__LOCATION = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__CREATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__OPENING = ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Floor Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Floor Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floor Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.GroundSurfaceTypeImpl <em>Ground Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.GroundSurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getGroundSurfaceType()
	 * @generated
	 */
	int GROUND_SURFACE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__DESCRIPTION = ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__NAME_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__NAME = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__ID = ABSTRACT_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__LOCATION = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__CREATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__OPENING = ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Ground Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Ground Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ground Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.IntBuildingInstallationPropertyTypeImpl <em>Int Building Installation Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.IntBuildingInstallationPropertyTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationPropertyType()
	 * @generated
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Int Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Building Installation Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl <em>Int Building Installation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationType()
	 * @generated
	 */
	int INT_BUILDING_INSTALLATION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__CLASS = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__FUNCTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__USAGE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod4 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Int Building Installation Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Int Building Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Int Building Installation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BUILDING_INSTALLATION_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.InteriorFurniturePropertyTypeImpl <em>Interior Furniture Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.InteriorFurniturePropertyTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getInteriorFurniturePropertyType()
	 * @generated
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Building Furniture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interior Furniture Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_FURNITURE_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.InteriorRoomPropertyTypeImpl <em>Interior Room Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.InteriorRoomPropertyTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getInteriorRoomPropertyType()
	 * @generated
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE__ROOM = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interior Room Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_ROOM_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.InteriorWallSurfaceTypeImpl <em>Interior Wall Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.InteriorWallSurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getInteriorWallSurfaceType()
	 * @generated
	 */
	int INTERIOR_WALL_SURFACE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__DESCRIPTION = ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__NAME_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__NAME = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__ID = ABSTRACT_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__LOCATION = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__CREATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__OPENING = ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Interior Wall Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Interior Wall Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interior Wall Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIOR_WALL_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.OpeningPropertyTypeImpl <em>Opening Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.OpeningPropertyTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getOpeningPropertyType()
	 * @generated
	 */
	int OPENING_PROPERTY_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Opening Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__OPENING_GROUP = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE__OPENING = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opening Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPENING_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.RoofSurfaceTypeImpl <em>Roof Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.RoofSurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoofSurfaceType()
	 * @generated
	 */
	int ROOF_SURFACE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__DESCRIPTION = ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__NAME_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__NAME = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__ID = ABSTRACT_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__LOCATION = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__CREATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__OPENING = ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Roof Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Roof Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Roof Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.RoomTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__CLASS = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__FUNCTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__USAGE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod4 Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__LOD4_SOLID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__LOD4_MULTI_SURFACE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bounded By1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__BOUNDED_BY1 = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interior Furniture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__INTERIOR_FURNITURE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Room Installation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM_INSTALLATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Room Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.WallSurfaceTypeImpl <em>Wall Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.WallSurfaceTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getWallSurfaceType()
	 * @generated
	 */
	int WALL_SURFACE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__META_DATA_PROPERTY = ABSTRACT_BOUNDARY_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__DESCRIPTION = ABSTRACT_BOUNDARY_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__NAME_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__NAME = ABSTRACT_BOUNDARY_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__ID = ABSTRACT_BOUNDARY_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__BOUNDED_BY = ABSTRACT_BOUNDARY_SURFACE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__LOCATION_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__LOCATION = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__CREATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__TERMINATION_DATE = ABSTRACT_BOUNDARY_SURFACE_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_BOUNDARY_SURFACE_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__GENERALIZES_TO = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__OPENING = ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Wall Surface Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Wall Surface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wall Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_SURFACE_TYPE_FEATURE_COUNT = ABSTRACT_BOUNDARY_SURFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.building.impl.WindowTypeImpl <em>Window Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.building.impl.WindowTypeImpl
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getWindowType()
	 * @generated
	 */
	int WINDOW_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__META_DATA_PROPERTY = ABSTRACT_OPENING_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__DESCRIPTION = ABSTRACT_OPENING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__NAME_GROUP = ABSTRACT_OPENING_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__NAME = ABSTRACT_OPENING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__ID = ABSTRACT_OPENING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__BOUNDED_BY = ABSTRACT_OPENING_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__LOCATION_GROUP = ABSTRACT_OPENING_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__LOCATION = ABSTRACT_OPENING_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__CREATION_DATE = ABSTRACT_OPENING_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__TERMINATION_DATE = ABSTRACT_OPENING_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__EXTERNAL_REFERENCE = ABSTRACT_OPENING_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__GENERALIZES_TO = ABSTRACT_OPENING_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Opening Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Opening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING = ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Window Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP = ABSTRACT_OPENING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Window</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW = ABSTRACT_OPENING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Window Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_TYPE_FEATURE_COUNT = ABSTRACT_OPENING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingClassType()
	 * @generated
	 */
	int BUILDING_CLASS_TYPE = 26;

	/**
	 * The meta object id for the '<em>Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFunctionType()
	 * @generated
	 */
	int BUILDING_FUNCTION_TYPE = 27;

	/**
	 * The meta object id for the '<em>Furniture Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureClassType()
	 * @generated
	 */
	int BUILDING_FURNITURE_CLASS_TYPE = 28;

	/**
	 * The meta object id for the '<em>Furniture Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureFunctionType()
	 * @generated
	 */
	int BUILDING_FURNITURE_FUNCTION_TYPE = 29;

	/**
	 * The meta object id for the '<em>Furniture Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureUsageType()
	 * @generated
	 */
	int BUILDING_FURNITURE_USAGE_TYPE = 30;

	/**
	 * The meta object id for the '<em>Installation Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationClassType()
	 * @generated
	 */
	int BUILDING_INSTALLATION_CLASS_TYPE = 31;

	/**
	 * The meta object id for the '<em>Installation Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationFunctionType()
	 * @generated
	 */
	int BUILDING_INSTALLATION_FUNCTION_TYPE = 32;

	/**
	 * The meta object id for the '<em>Installation Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationUsageType()
	 * @generated
	 */
	int BUILDING_INSTALLATION_USAGE_TYPE = 33;

	/**
	 * The meta object id for the '<em>Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingUsageType()
	 * @generated
	 */
	int BUILDING_USAGE_TYPE = 34;

	/**
	 * The meta object id for the '<em>Int Building Installation Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationClassType()
	 * @generated
	 */
	int INT_BUILDING_INSTALLATION_CLASS_TYPE = 35;

	/**
	 * The meta object id for the '<em>Int Building Installation Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationFunctionType()
	 * @generated
	 */
	int INT_BUILDING_INSTALLATION_FUNCTION_TYPE = 36;

	/**
	 * The meta object id for the '<em>Int Building Installation Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationUsageType()
	 * @generated
	 */
	int INT_BUILDING_INSTALLATION_USAGE_TYPE = 37;

	/**
	 * The meta object id for the '<em>Roof Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoofTypeType()
	 * @generated
	 */
	int ROOF_TYPE_TYPE = 38;

	/**
	 * The meta object id for the '<em>Room Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomClassType()
	 * @generated
	 */
	int ROOM_CLASS_TYPE = 39;

	/**
	 * The meta object id for the '<em>Room Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomFunctionType()
	 * @generated
	 */
	int ROOM_FUNCTION_TYPE = 40;

	/**
	 * The meta object id for the '<em>Room Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomUsageType()
	 * @generated
	 */
	int ROOM_USAGE_TYPE = 41;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType <em>Abstract Boundary Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Boundary Surface Type</em>'.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType
	 * @generated
	 */
	EClass getAbstractBoundarySurfaceType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType#getLod2MultiSurface()
	 * @see #getAbstractBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractBoundarySurfaceType_Lod2MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType#getLod3MultiSurface()
	 * @see #getAbstractBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractBoundarySurfaceType_Lod3MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType#getLod4MultiSurface()
	 * @see #getAbstractBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractBoundarySurfaceType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType#getOpening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opening</em>'.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType#getOpening()
	 * @see #getAbstractBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractBoundarySurfaceType_Opening();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType#getGenericApplicationPropertyOfBoundarySurfaceGroup <em>Generic Application Property Of Boundary Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Boundary Surface Group</em>'.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType#getGenericApplicationPropertyOfBoundarySurfaceGroup()
	 * @see #getAbstractBoundarySurfaceType()
	 * @generated
	 */
	EAttribute getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBoundarySurfaceType#getGenericApplicationPropertyOfBoundarySurface <em>Generic Application Property Of Boundary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Boundary Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBoundarySurfaceType#getGenericApplicationPropertyOfBoundarySurface()
	 * @see #getAbstractBoundarySurfaceType()
	 * @generated
	 */
	EReference getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.AbstractBuildingType <em>Abstract Building Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Building Type</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType
	 * @generated
	 */
	EClass getAbstractBuildingType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.AbstractBuildingType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getClass_()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.AbstractBuildingType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getFunction()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.AbstractBuildingType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getUsage()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_Usage();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.AbstractBuildingType#getYearOfConstruction <em>Year Of Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Of Construction</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getYearOfConstruction()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_YearOfConstruction();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.AbstractBuildingType#getYearOfDemolition <em>Year Of Demolition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Of Demolition</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getYearOfDemolition()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_YearOfDemolition();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.AbstractBuildingType#getRoofType <em>Roof Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roof Type</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getRoofType()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_RoofType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getMeasuredHeight <em>Measured Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measured Height</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getMeasuredHeight()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_MeasuredHeight();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreysAboveGround <em>Storeys Above Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storeys Above Ground</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getStoreysAboveGround()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_StoreysAboveGround();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreysBelowGround <em>Storeys Below Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storeys Below Ground</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getStoreysBelowGround()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_StoreysBelowGround();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsAboveGround <em>Storey Heights Above Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storey Heights Above Ground</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsAboveGround()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_StoreyHeightsAboveGround();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsBelowGround <em>Storey Heights Below Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storey Heights Below Ground</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getStoreyHeightsBelowGround()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_StoreyHeightsBelowGround();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod1Solid <em>Lod1 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Solid</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod1Solid()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod1Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod1MultiSurface()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod1MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod1TerrainIntersection()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod1TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2Solid <em>Lod2 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Solid</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod2Solid()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod2Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod2MultiSurface()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod2MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2MultiCurve <em>Lod2 Multi Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Curve</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod2MultiCurve()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod2MultiCurve();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod2TerrainIntersection()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod2TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBuildingType#getOuterBuildingInstallation <em>Outer Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outer Building Installation</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getOuterBuildingInstallation()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_OuterBuildingInstallation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBuildingType#getInteriorBuildingInstallation <em>Interior Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interior Building Installation</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getInteriorBuildingInstallation()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_InteriorBuildingInstallation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBuildingType#getBoundedBy1 <em>Bounded By1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded By1</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getBoundedBy1()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_BoundedBy1();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3Solid <em>Lod3 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Solid</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod3Solid()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod3Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod3MultiSurface()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod3MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3MultiCurve <em>Lod3 Multi Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Curve</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod3MultiCurve()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod3MultiCurve();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod3TerrainIntersection()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod3TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4Solid <em>Lod4 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Solid</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod4Solid()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod4Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod4MultiSurface()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4MultiCurve <em>Lod4 Multi Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Curve</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod4MultiCurve()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod4MultiCurve();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractBuildingType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getLod4TerrainIntersection()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Lod4TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBuildingType#getInteriorRoom <em>Interior Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interior Room</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getInteriorRoom()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_InteriorRoom();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBuildingType#getConsistsOfBuildingPart <em>Consists Of Building Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of Building Part</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getConsistsOfBuildingPart()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_ConsistsOfBuildingPart();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBuildingType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getAddress()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_Address();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.AbstractBuildingType#getGenericApplicationPropertyOfAbstractBuildingGroup <em>Generic Application Property Of Abstract Building Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Abstract Building Group</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getGenericApplicationPropertyOfAbstractBuildingGroup()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EAttribute getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuildingGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractBuildingType#getGenericApplicationPropertyOfAbstractBuilding <em>Generic Application Property Of Abstract Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Abstract Building</em>'.
	 * @see net.opengis.citygml.building.AbstractBuildingType#getGenericApplicationPropertyOfAbstractBuilding()
	 * @see #getAbstractBuildingType()
	 * @generated
	 */
	EReference getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuilding();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.AbstractOpeningType <em>Abstract Opening Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Opening Type</em>'.
	 * @see net.opengis.citygml.building.AbstractOpeningType
	 * @generated
	 */
	EClass getAbstractOpeningType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractOpeningType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractOpeningType#getLod3MultiSurface()
	 * @see #getAbstractOpeningType()
	 * @generated
	 */
	EReference getAbstractOpeningType_Lod3MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.AbstractOpeningType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.AbstractOpeningType#getLod4MultiSurface()
	 * @see #getAbstractOpeningType()
	 * @generated
	 */
	EReference getAbstractOpeningType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.AbstractOpeningType#getGenericApplicationPropertyOfOpeningGroup <em>Generic Application Property Of Opening Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Opening Group</em>'.
	 * @see net.opengis.citygml.building.AbstractOpeningType#getGenericApplicationPropertyOfOpeningGroup()
	 * @see #getAbstractOpeningType()
	 * @generated
	 */
	EAttribute getAbstractOpeningType_GenericApplicationPropertyOfOpeningGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.AbstractOpeningType#getGenericApplicationPropertyOfOpening <em>Generic Application Property Of Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Opening</em>'.
	 * @see net.opengis.citygml.building.AbstractOpeningType#getGenericApplicationPropertyOfOpening()
	 * @see #getAbstractOpeningType()
	 * @generated
	 */
	EReference getAbstractOpeningType_GenericApplicationPropertyOfOpening();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.BoundarySurfacePropertyType <em>Boundary Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Surface Property Type</em>'.
	 * @see net.opengis.citygml.building.BoundarySurfacePropertyType
	 * @generated
	 */
	EClass getBoundarySurfacePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BoundarySurfacePropertyType#getBoundarySurfaceGroup <em>Boundary Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Boundary Surface Group</em>'.
	 * @see net.opengis.citygml.building.BoundarySurfacePropertyType#getBoundarySurfaceGroup()
	 * @see #getBoundarySurfacePropertyType()
	 * @generated
	 */
	EAttribute getBoundarySurfacePropertyType_BoundarySurfaceGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BoundarySurfacePropertyType#getBoundarySurface <em>Boundary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Surface</em>'.
	 * @see net.opengis.citygml.building.BoundarySurfacePropertyType#getBoundarySurface()
	 * @see #getBoundarySurfacePropertyType()
	 * @generated
	 */
	EReference getBoundarySurfacePropertyType_BoundarySurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.BuildingFurnitureType <em>Furniture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Furniture Type</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType
	 * @generated
	 */
	EClass getBuildingFurnitureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.BuildingFurnitureType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType#getClass_()
	 * @see #getBuildingFurnitureType()
	 * @generated
	 */
	EAttribute getBuildingFurnitureType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingFurnitureType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType#getFunction()
	 * @see #getBuildingFurnitureType()
	 * @generated
	 */
	EAttribute getBuildingFurnitureType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingFurnitureType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType#getUsage()
	 * @see #getBuildingFurnitureType()
	 * @generated
	 */
	EAttribute getBuildingFurnitureType_Usage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BuildingFurnitureType#getLod4Geometry <em>Lod4 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Geometry</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType#getLod4Geometry()
	 * @see #getBuildingFurnitureType()
	 * @generated
	 */
	EReference getBuildingFurnitureType_Lod4Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BuildingFurnitureType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Implicit Representation</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType#getLod4ImplicitRepresentation()
	 * @see #getBuildingFurnitureType()
	 * @generated
	 */
	EReference getBuildingFurnitureType_Lod4ImplicitRepresentation();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingFurnitureType#getGenericApplicationPropertyOfBuildingFurnitureGroup <em>Generic Application Property Of Building Furniture Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Building Furniture Group</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType#getGenericApplicationPropertyOfBuildingFurnitureGroup()
	 * @see #getBuildingFurnitureType()
	 * @generated
	 */
	EAttribute getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurnitureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.BuildingFurnitureType#getGenericApplicationPropertyOfBuildingFurniture <em>Generic Application Property Of Building Furniture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Building Furniture</em>'.
	 * @see net.opengis.citygml.building.BuildingFurnitureType#getGenericApplicationPropertyOfBuildingFurniture()
	 * @see #getBuildingFurnitureType()
	 * @generated
	 */
	EReference getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurniture();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.BuildingInstallationPropertyType <em>Installation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation Property Type</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationPropertyType
	 * @generated
	 */
	EClass getBuildingInstallationPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BuildingInstallationPropertyType#getBuildingInstallation <em>Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Building Installation</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationPropertyType#getBuildingInstallation()
	 * @see #getBuildingInstallationPropertyType()
	 * @generated
	 */
	EReference getBuildingInstallationPropertyType_BuildingInstallation();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.BuildingInstallationType <em>Installation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation Type</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType
	 * @generated
	 */
	EClass getBuildingInstallationType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.BuildingInstallationType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getClass_()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EAttribute getBuildingInstallationType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingInstallationType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getFunction()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EAttribute getBuildingInstallationType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingInstallationType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getUsage()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EAttribute getBuildingInstallationType_Usage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BuildingInstallationType#getLod2Geometry <em>Lod2 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Geometry</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getLod2Geometry()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EReference getBuildingInstallationType_Lod2Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BuildingInstallationType#getLod3Geometry <em>Lod3 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Geometry</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getLod3Geometry()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EReference getBuildingInstallationType_Lod3Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BuildingInstallationType#getLod4Geometry <em>Lod4 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Geometry</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getLod4Geometry()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EReference getBuildingInstallationType_Lod4Geometry();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingInstallationType#getGenericApplicationPropertyOfBuildingInstallationGroup <em>Generic Application Property Of Building Installation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Building Installation Group</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getGenericApplicationPropertyOfBuildingInstallationGroup()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EAttribute getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.BuildingInstallationType#getGenericApplicationPropertyOfBuildingInstallation <em>Generic Application Property Of Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Building Installation</em>'.
	 * @see net.opengis.citygml.building.BuildingInstallationType#getGenericApplicationPropertyOfBuildingInstallation()
	 * @see #getBuildingInstallationType()
	 * @generated
	 */
	EReference getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallation();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.BuildingPartPropertyType <em>Part Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Property Type</em>'.
	 * @see net.opengis.citygml.building.BuildingPartPropertyType
	 * @generated
	 */
	EClass getBuildingPartPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.BuildingPartPropertyType#getBuildingPart <em>Building Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Building Part</em>'.
	 * @see net.opengis.citygml.building.BuildingPartPropertyType#getBuildingPart()
	 * @see #getBuildingPartPropertyType()
	 * @generated
	 */
	EReference getBuildingPartPropertyType_BuildingPart();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.BuildingPartType <em>Part Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Type</em>'.
	 * @see net.opengis.citygml.building.BuildingPartType
	 * @generated
	 */
	EClass getBuildingPartType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingPartType#getGenericApplicationPropertyOfBuildingPartGroup <em>Generic Application Property Of Building Part Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Building Part Group</em>'.
	 * @see net.opengis.citygml.building.BuildingPartType#getGenericApplicationPropertyOfBuildingPartGroup()
	 * @see #getBuildingPartType()
	 * @generated
	 */
	EAttribute getBuildingPartType_GenericApplicationPropertyOfBuildingPartGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.BuildingPartType#getGenericApplicationPropertyOfBuildingPart <em>Generic Application Property Of Building Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Building Part</em>'.
	 * @see net.opengis.citygml.building.BuildingPartType#getGenericApplicationPropertyOfBuildingPart()
	 * @see #getBuildingPartType()
	 * @generated
	 */
	EReference getBuildingPartType_GenericApplicationPropertyOfBuildingPart();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.BuildingType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see net.opengis.citygml.building.BuildingType
	 * @generated
	 */
	EClass getBuildingType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.BuildingType#getGenericApplicationPropertyOfBuildingGroup <em>Generic Application Property Of Building Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Building Group</em>'.
	 * @see net.opengis.citygml.building.BuildingType#getGenericApplicationPropertyOfBuildingGroup()
	 * @see #getBuildingType()
	 * @generated
	 */
	EAttribute getBuildingType_GenericApplicationPropertyOfBuildingGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.BuildingType#getGenericApplicationPropertyOfBuilding <em>Generic Application Property Of Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Building</em>'.
	 * @see net.opengis.citygml.building.BuildingType#getGenericApplicationPropertyOfBuilding()
	 * @see #getBuildingType()
	 * @generated
	 */
	EReference getBuildingType_GenericApplicationPropertyOfBuilding();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.CeilingSurfaceType <em>Ceiling Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ceiling Surface Type</em>'.
	 * @see net.opengis.citygml.building.CeilingSurfaceType
	 * @generated
	 */
	EClass getCeilingSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.CeilingSurfaceType#getGenericApplicationPropertyOfCeilingSurfaceGroup <em>Generic Application Property Of Ceiling Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Ceiling Surface Group</em>'.
	 * @see net.opengis.citygml.building.CeilingSurfaceType#getGenericApplicationPropertyOfCeilingSurfaceGroup()
	 * @see #getCeilingSurfaceType()
	 * @generated
	 */
	EAttribute getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.CeilingSurfaceType#getGenericApplicationPropertyOfCeilingSurface <em>Generic Application Property Of Ceiling Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Ceiling Surface</em>'.
	 * @see net.opengis.citygml.building.CeilingSurfaceType#getGenericApplicationPropertyOfCeilingSurface()
	 * @see #getCeilingSurfaceType()
	 * @generated
	 */
	EReference getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.ClosureSurfaceType <em>Closure Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closure Surface Type</em>'.
	 * @see net.opengis.citygml.building.ClosureSurfaceType
	 * @generated
	 */
	EClass getClosureSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.ClosureSurfaceType#getGenericApplicationPropertyOfClosureSurfaceGroup <em>Generic Application Property Of Closure Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Closure Surface Group</em>'.
	 * @see net.opengis.citygml.building.ClosureSurfaceType#getGenericApplicationPropertyOfClosureSurfaceGroup()
	 * @see #getClosureSurfaceType()
	 * @generated
	 */
	EAttribute getClosureSurfaceType_GenericApplicationPropertyOfClosureSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.ClosureSurfaceType#getGenericApplicationPropertyOfClosureSurface <em>Generic Application Property Of Closure Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Closure Surface</em>'.
	 * @see net.opengis.citygml.building.ClosureSurfaceType#getGenericApplicationPropertyOfClosureSurface()
	 * @see #getClosureSurfaceType()
	 * @generated
	 */
	EReference getClosureSurfaceType_GenericApplicationPropertyOfClosureSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.building.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.building.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getAbstractBuilding <em>Abstract Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Building</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getAbstractBuilding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractBuilding();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getBoundarySurface <em>Boundary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getBoundarySurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BoundarySurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfAbstractBuilding <em>Generic Application Property Of Abstract Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Abstract Building</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfAbstractBuilding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfAbstractBuilding();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBoundarySurface <em>Generic Application Property Of Boundary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Boundary Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBoundarySurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfBoundarySurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuilding <em>Generic Application Property Of Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Building</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuilding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfBuilding();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingFurniture <em>Generic Application Property Of Building Furniture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Building Furniture</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingFurniture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfBuildingFurniture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingInstallation <em>Generic Application Property Of Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Building Installation</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingInstallation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfBuildingInstallation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingPart <em>Generic Application Property Of Building Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Building Part</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingPart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfBuildingPart();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfCeilingSurface <em>Generic Application Property Of Ceiling Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Ceiling Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfCeilingSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfCeilingSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfClosureSurface <em>Generic Application Property Of Closure Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Closure Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfClosureSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfClosureSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfDoor <em>Generic Application Property Of Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Door</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfDoor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfDoor();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfFloorSurface <em>Generic Application Property Of Floor Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Floor Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfFloorSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfFloorSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfGroundSurface <em>Generic Application Property Of Ground Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Ground Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfGroundSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfGroundSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfIntBuildingInstallation <em>Generic Application Property Of Int Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Int Building Installation</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfIntBuildingInstallation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfIntBuildingInstallation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfInteriorWallSurface <em>Generic Application Property Of Interior Wall Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Interior Wall Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfInteriorWallSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfInteriorWallSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfOpening <em>Generic Application Property Of Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Opening</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfOpening()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfOpening();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfRoofSurface <em>Generic Application Property Of Roof Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Roof Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfRoofSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfRoofSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfRoom <em>Generic Application Property Of Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Room</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfRoom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfRoom();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfWallSurface <em>Generic Application Property Of Wall Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Wall Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfWallSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWallSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfWindow <em>Generic Application Property Of Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Window</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfWindow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfWindow();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getOpening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opening</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getOpening()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Opening();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getBuilding <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Building</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getBuilding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Building();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getBuildingFurniture <em>Building Furniture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Building Furniture</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getBuildingFurniture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BuildingFurniture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getBuildingInstallation <em>Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Building Installation</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getBuildingInstallation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BuildingInstallation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getBuildingPart <em>Building Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Building Part</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getBuildingPart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BuildingPart();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getCeilingSurface <em>Ceiling Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ceiling Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getCeilingSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CeilingSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getClosureSurface <em>Closure Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Closure Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getClosureSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClosureSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Door</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getDoor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Door();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getFloorSurface <em>Floor Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floor Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getFloorSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FloorSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getGroundSurface <em>Ground Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getGroundSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GroundSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getIntBuildingInstallation <em>Int Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int Building Installation</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getIntBuildingInstallation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntBuildingInstallation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getInteriorWallSurface <em>Interior Wall Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interior Wall Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getInteriorWallSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InteriorWallSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getRoofSurface <em>Roof Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Roof Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getRoofSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RoofSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Room</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getRoom()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Room();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getWallSurface <em>Wall Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wall Surface</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getWallSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WallSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.DocumentRoot#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Window</em>'.
	 * @see net.opengis.citygml.building.DocumentRoot#getWindow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Window();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.DoorType <em>Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Type</em>'.
	 * @see net.opengis.citygml.building.DoorType
	 * @generated
	 */
	EClass getDoorType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.DoorType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see net.opengis.citygml.building.DoorType#getAddress()
	 * @see #getDoorType()
	 * @generated
	 */
	EReference getDoorType_Address();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.DoorType#getGenericApplicationPropertyOfDoorGroup <em>Generic Application Property Of Door Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Door Group</em>'.
	 * @see net.opengis.citygml.building.DoorType#getGenericApplicationPropertyOfDoorGroup()
	 * @see #getDoorType()
	 * @generated
	 */
	EAttribute getDoorType_GenericApplicationPropertyOfDoorGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.DoorType#getGenericApplicationPropertyOfDoor <em>Generic Application Property Of Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Door</em>'.
	 * @see net.opengis.citygml.building.DoorType#getGenericApplicationPropertyOfDoor()
	 * @see #getDoorType()
	 * @generated
	 */
	EReference getDoorType_GenericApplicationPropertyOfDoor();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.FloorSurfaceType <em>Floor Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor Surface Type</em>'.
	 * @see net.opengis.citygml.building.FloorSurfaceType
	 * @generated
	 */
	EClass getFloorSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.FloorSurfaceType#getGenericApplicationPropertyOfFloorSurfaceGroup <em>Generic Application Property Of Floor Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Floor Surface Group</em>'.
	 * @see net.opengis.citygml.building.FloorSurfaceType#getGenericApplicationPropertyOfFloorSurfaceGroup()
	 * @see #getFloorSurfaceType()
	 * @generated
	 */
	EAttribute getFloorSurfaceType_GenericApplicationPropertyOfFloorSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.FloorSurfaceType#getGenericApplicationPropertyOfFloorSurface <em>Generic Application Property Of Floor Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Floor Surface</em>'.
	 * @see net.opengis.citygml.building.FloorSurfaceType#getGenericApplicationPropertyOfFloorSurface()
	 * @see #getFloorSurfaceType()
	 * @generated
	 */
	EReference getFloorSurfaceType_GenericApplicationPropertyOfFloorSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.GroundSurfaceType <em>Ground Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Surface Type</em>'.
	 * @see net.opengis.citygml.building.GroundSurfaceType
	 * @generated
	 */
	EClass getGroundSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.GroundSurfaceType#getGenericApplicationPropertyOfGroundSurfaceGroup <em>Generic Application Property Of Ground Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Ground Surface Group</em>'.
	 * @see net.opengis.citygml.building.GroundSurfaceType#getGenericApplicationPropertyOfGroundSurfaceGroup()
	 * @see #getGroundSurfaceType()
	 * @generated
	 */
	EAttribute getGroundSurfaceType_GenericApplicationPropertyOfGroundSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.GroundSurfaceType#getGenericApplicationPropertyOfGroundSurface <em>Generic Application Property Of Ground Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Ground Surface</em>'.
	 * @see net.opengis.citygml.building.GroundSurfaceType#getGenericApplicationPropertyOfGroundSurface()
	 * @see #getGroundSurfaceType()
	 * @generated
	 */
	EReference getGroundSurfaceType_GenericApplicationPropertyOfGroundSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.IntBuildingInstallationPropertyType <em>Int Building Installation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Building Installation Property Type</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationPropertyType
	 * @generated
	 */
	EClass getIntBuildingInstallationPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.IntBuildingInstallationPropertyType#getIntBuildingInstallation <em>Int Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int Building Installation</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationPropertyType#getIntBuildingInstallation()
	 * @see #getIntBuildingInstallationPropertyType()
	 * @generated
	 */
	EReference getIntBuildingInstallationPropertyType_IntBuildingInstallation();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.IntBuildingInstallationType <em>Int Building Installation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Building Installation Type</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType
	 * @generated
	 */
	EClass getIntBuildingInstallationType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.IntBuildingInstallationType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType#getClass_()
	 * @see #getIntBuildingInstallationType()
	 * @generated
	 */
	EAttribute getIntBuildingInstallationType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.IntBuildingInstallationType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType#getFunction()
	 * @see #getIntBuildingInstallationType()
	 * @generated
	 */
	EAttribute getIntBuildingInstallationType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.IntBuildingInstallationType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType#getUsage()
	 * @see #getIntBuildingInstallationType()
	 * @generated
	 */
	EAttribute getIntBuildingInstallationType_Usage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.IntBuildingInstallationType#getLod4Geometry <em>Lod4 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Geometry</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType#getLod4Geometry()
	 * @see #getIntBuildingInstallationType()
	 * @generated
	 */
	EReference getIntBuildingInstallationType_Lod4Geometry();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.IntBuildingInstallationType#getGenericApplicationPropertyOfIntBuildingInstallationGroup <em>Generic Application Property Of Int Building Installation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Int Building Installation Group</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType#getGenericApplicationPropertyOfIntBuildingInstallationGroup()
	 * @see #getIntBuildingInstallationType()
	 * @generated
	 */
	EAttribute getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallationGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.IntBuildingInstallationType#getGenericApplicationPropertyOfIntBuildingInstallation <em>Generic Application Property Of Int Building Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Int Building Installation</em>'.
	 * @see net.opengis.citygml.building.IntBuildingInstallationType#getGenericApplicationPropertyOfIntBuildingInstallation()
	 * @see #getIntBuildingInstallationType()
	 * @generated
	 */
	EReference getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallation();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.InteriorFurniturePropertyType <em>Interior Furniture Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interior Furniture Property Type</em>'.
	 * @see net.opengis.citygml.building.InteriorFurniturePropertyType
	 * @generated
	 */
	EClass getInteriorFurniturePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.InteriorFurniturePropertyType#getBuildingFurniture <em>Building Furniture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Building Furniture</em>'.
	 * @see net.opengis.citygml.building.InteriorFurniturePropertyType#getBuildingFurniture()
	 * @see #getInteriorFurniturePropertyType()
	 * @generated
	 */
	EReference getInteriorFurniturePropertyType_BuildingFurniture();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.InteriorRoomPropertyType <em>Interior Room Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interior Room Property Type</em>'.
	 * @see net.opengis.citygml.building.InteriorRoomPropertyType
	 * @generated
	 */
	EClass getInteriorRoomPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.InteriorRoomPropertyType#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Room</em>'.
	 * @see net.opengis.citygml.building.InteriorRoomPropertyType#getRoom()
	 * @see #getInteriorRoomPropertyType()
	 * @generated
	 */
	EReference getInteriorRoomPropertyType_Room();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.InteriorWallSurfaceType <em>Interior Wall Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interior Wall Surface Type</em>'.
	 * @see net.opengis.citygml.building.InteriorWallSurfaceType
	 * @generated
	 */
	EClass getInteriorWallSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.InteriorWallSurfaceType#getGenericApplicationPropertyOfInteriorWallSurfaceGroup <em>Generic Application Property Of Interior Wall Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Interior Wall Surface Group</em>'.
	 * @see net.opengis.citygml.building.InteriorWallSurfaceType#getGenericApplicationPropertyOfInteriorWallSurfaceGroup()
	 * @see #getInteriorWallSurfaceType()
	 * @generated
	 */
	EAttribute getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.InteriorWallSurfaceType#getGenericApplicationPropertyOfInteriorWallSurface <em>Generic Application Property Of Interior Wall Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Interior Wall Surface</em>'.
	 * @see net.opengis.citygml.building.InteriorWallSurfaceType#getGenericApplicationPropertyOfInteriorWallSurface()
	 * @see #getInteriorWallSurfaceType()
	 * @generated
	 */
	EReference getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.OpeningPropertyType <em>Opening Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opening Property Type</em>'.
	 * @see net.opengis.citygml.building.OpeningPropertyType
	 * @generated
	 */
	EClass getOpeningPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.OpeningPropertyType#getOpeningGroup <em>Opening Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Opening Group</em>'.
	 * @see net.opengis.citygml.building.OpeningPropertyType#getOpeningGroup()
	 * @see #getOpeningPropertyType()
	 * @generated
	 */
	EAttribute getOpeningPropertyType_OpeningGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.OpeningPropertyType#getOpening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opening</em>'.
	 * @see net.opengis.citygml.building.OpeningPropertyType#getOpening()
	 * @see #getOpeningPropertyType()
	 * @generated
	 */
	EReference getOpeningPropertyType_Opening();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.RoofSurfaceType <em>Roof Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roof Surface Type</em>'.
	 * @see net.opengis.citygml.building.RoofSurfaceType
	 * @generated
	 */
	EClass getRoofSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.RoofSurfaceType#getGenericApplicationPropertyOfRoofSurfaceGroup <em>Generic Application Property Of Roof Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Roof Surface Group</em>'.
	 * @see net.opengis.citygml.building.RoofSurfaceType#getGenericApplicationPropertyOfRoofSurfaceGroup()
	 * @see #getRoofSurfaceType()
	 * @generated
	 */
	EAttribute getRoofSurfaceType_GenericApplicationPropertyOfRoofSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.RoofSurfaceType#getGenericApplicationPropertyOfRoofSurface <em>Generic Application Property Of Roof Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Roof Surface</em>'.
	 * @see net.opengis.citygml.building.RoofSurfaceType#getGenericApplicationPropertyOfRoofSurface()
	 * @see #getRoofSurfaceType()
	 * @generated
	 */
	EReference getRoofSurfaceType_GenericApplicationPropertyOfRoofSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see net.opengis.citygml.building.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.building.RoomType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.building.RoomType#getClass_()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.RoomType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.building.RoomType#getFunction()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.RoomType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.building.RoomType#getUsage()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Usage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.RoomType#getLod4Solid <em>Lod4 Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Solid</em>'.
	 * @see net.opengis.citygml.building.RoomType#getLod4Solid()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_Lod4Solid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.building.RoomType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.building.RoomType#getLod4MultiSurface()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.RoomType#getBoundedBy1 <em>Bounded By1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounded By1</em>'.
	 * @see net.opengis.citygml.building.RoomType#getBoundedBy1()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_BoundedBy1();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.RoomType#getInteriorFurniture <em>Interior Furniture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interior Furniture</em>'.
	 * @see net.opengis.citygml.building.RoomType#getInteriorFurniture()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_InteriorFurniture();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.RoomType#getRoomInstallation <em>Room Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room Installation</em>'.
	 * @see net.opengis.citygml.building.RoomType#getRoomInstallation()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_RoomInstallation();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.RoomType#getGenericApplicationPropertyOfRoomGroup <em>Generic Application Property Of Room Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Room Group</em>'.
	 * @see net.opengis.citygml.building.RoomType#getGenericApplicationPropertyOfRoomGroup()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_GenericApplicationPropertyOfRoomGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.RoomType#getGenericApplicationPropertyOfRoom <em>Generic Application Property Of Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Room</em>'.
	 * @see net.opengis.citygml.building.RoomType#getGenericApplicationPropertyOfRoom()
	 * @see #getRoomType()
	 * @generated
	 */
	EReference getRoomType_GenericApplicationPropertyOfRoom();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.WallSurfaceType <em>Wall Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall Surface Type</em>'.
	 * @see net.opengis.citygml.building.WallSurfaceType
	 * @generated
	 */
	EClass getWallSurfaceType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.WallSurfaceType#getGenericApplicationPropertyOfWallSurfaceGroup <em>Generic Application Property Of Wall Surface Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Wall Surface Group</em>'.
	 * @see net.opengis.citygml.building.WallSurfaceType#getGenericApplicationPropertyOfWallSurfaceGroup()
	 * @see #getWallSurfaceType()
	 * @generated
	 */
	EAttribute getWallSurfaceType_GenericApplicationPropertyOfWallSurfaceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.WallSurfaceType#getGenericApplicationPropertyOfWallSurface <em>Generic Application Property Of Wall Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Wall Surface</em>'.
	 * @see net.opengis.citygml.building.WallSurfaceType#getGenericApplicationPropertyOfWallSurface()
	 * @see #getWallSurfaceType()
	 * @generated
	 */
	EReference getWallSurfaceType_GenericApplicationPropertyOfWallSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.building.WindowType <em>Window Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window Type</em>'.
	 * @see net.opengis.citygml.building.WindowType
	 * @generated
	 */
	EClass getWindowType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.building.WindowType#getGenericApplicationPropertyOfWindowGroup <em>Generic Application Property Of Window Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Window Group</em>'.
	 * @see net.opengis.citygml.building.WindowType#getGenericApplicationPropertyOfWindowGroup()
	 * @see #getWindowType()
	 * @generated
	 */
	EAttribute getWindowType_GenericApplicationPropertyOfWindowGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.building.WindowType#getGenericApplicationPropertyOfWindow <em>Generic Application Property Of Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Window</em>'.
	 * @see net.opengis.citygml.building.WindowType#getGenericApplicationPropertyOfWindow()
	 * @see #getWindowType()
	 * @generated
	 */
	EReference getWindowType_GenericApplicationPropertyOfWindow();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Furniture Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Furniture Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingFurnitureClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingFurnitureClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Furniture Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Furniture Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingFurnitureFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingFurnitureFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Furniture Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Furniture Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingFurnitureUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingFurnitureUsageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Installation Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Installation Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingInstallationClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingInstallationClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Installation Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Installation Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingInstallationFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingInstallationFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Installation Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Installation Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingInstallationUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingInstallationUsageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BuildingUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBuildingUsageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Int Building Installation Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Building Installation Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IntBuildingInstallationClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getIntBuildingInstallationClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Int Building Installation Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Building Installation Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IntBuildingInstallationFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getIntBuildingInstallationFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Int Building Installation Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Building Installation Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IntBuildingInstallationUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getIntBuildingInstallationUsageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Roof Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Roof Type Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RoofTypeType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRoofTypeType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Room Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Room Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RoomClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRoomClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Room Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Room Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RoomFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRoomFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Room Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Room Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RoomUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getRoomUsageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuildingFactory getBuildingFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl <em>Abstract Boundary Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getAbstractBoundarySurfaceType()
		 * @generated
		 */
		EClass ABSTRACT_BOUNDARY_SURFACE_TYPE = eINSTANCE.getAbstractBoundarySurfaceType();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE = eINSTANCE.getAbstractBoundarySurfaceType_Lod2MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE = eINSTANCE.getAbstractBoundarySurfaceType_Lod3MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getAbstractBoundarySurfaceType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Opening</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING = eINSTANCE.getAbstractBoundarySurfaceType_Opening();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Boundary Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP = eINSTANCE.getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = eINSTANCE.getAbstractBoundarySurfaceType_GenericApplicationPropertyOfBoundarySurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl <em>Abstract Building Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.AbstractBuildingTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getAbstractBuildingType()
		 * @generated
		 */
		EClass ABSTRACT_BUILDING_TYPE = eINSTANCE.getAbstractBuildingType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__CLASS = eINSTANCE.getAbstractBuildingType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__FUNCTION = eINSTANCE.getAbstractBuildingType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__USAGE = eINSTANCE.getAbstractBuildingType_Usage();

		/**
		 * The meta object literal for the '<em><b>Year Of Construction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION = eINSTANCE.getAbstractBuildingType_YearOfConstruction();

		/**
		 * The meta object literal for the '<em><b>Year Of Demolition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION = eINSTANCE.getAbstractBuildingType_YearOfDemolition();

		/**
		 * The meta object literal for the '<em><b>Roof Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__ROOF_TYPE = eINSTANCE.getAbstractBuildingType_RoofType();

		/**
		 * The meta object literal for the '<em><b>Measured Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT = eINSTANCE.getAbstractBuildingType_MeasuredHeight();

		/**
		 * The meta object literal for the '<em><b>Storeys Above Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND = eINSTANCE.getAbstractBuildingType_StoreysAboveGround();

		/**
		 * The meta object literal for the '<em><b>Storeys Below Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND = eINSTANCE.getAbstractBuildingType_StoreysBelowGround();

		/**
		 * The meta object literal for the '<em><b>Storey Heights Above Ground</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND = eINSTANCE.getAbstractBuildingType_StoreyHeightsAboveGround();

		/**
		 * The meta object literal for the '<em><b>Storey Heights Below Ground</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND = eINSTANCE.getAbstractBuildingType_StoreyHeightsBelowGround();

		/**
		 * The meta object literal for the '<em><b>Lod1 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD1_SOLID = eINSTANCE.getAbstractBuildingType_Lod1Solid();

		/**
		 * The meta object literal for the '<em><b>Lod1 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE = eINSTANCE.getAbstractBuildingType_Lod1MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod1 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION = eINSTANCE.getAbstractBuildingType_Lod1TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Lod2 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD2_SOLID = eINSTANCE.getAbstractBuildingType_Lod2Solid();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE = eINSTANCE.getAbstractBuildingType_Lod2MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE = eINSTANCE.getAbstractBuildingType_Lod2MultiCurve();

		/**
		 * The meta object literal for the '<em><b>Lod2 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION = eINSTANCE.getAbstractBuildingType_Lod2TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Outer Building Installation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION = eINSTANCE.getAbstractBuildingType_OuterBuildingInstallation();

		/**
		 * The meta object literal for the '<em><b>Interior Building Installation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION = eINSTANCE.getAbstractBuildingType_InteriorBuildingInstallation();

		/**
		 * The meta object literal for the '<em><b>Bounded By1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__BOUNDED_BY1 = eINSTANCE.getAbstractBuildingType_BoundedBy1();

		/**
		 * The meta object literal for the '<em><b>Lod3 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD3_SOLID = eINSTANCE.getAbstractBuildingType_Lod3Solid();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE = eINSTANCE.getAbstractBuildingType_Lod3MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE = eINSTANCE.getAbstractBuildingType_Lod3MultiCurve();

		/**
		 * The meta object literal for the '<em><b>Lod3 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION = eINSTANCE.getAbstractBuildingType_Lod3TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Lod4 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD4_SOLID = eINSTANCE.getAbstractBuildingType_Lod4Solid();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getAbstractBuildingType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Curve</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE = eINSTANCE.getAbstractBuildingType_Lod4MultiCurve();

		/**
		 * The meta object literal for the '<em><b>Lod4 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION = eINSTANCE.getAbstractBuildingType_Lod4TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Interior Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM = eINSTANCE.getAbstractBuildingType_InteriorRoom();

		/**
		 * The meta object literal for the '<em><b>Consists Of Building Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART = eINSTANCE.getAbstractBuildingType_ConsistsOfBuildingPart();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__ADDRESS = eINSTANCE.getAbstractBuildingType_Address();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Abstract Building Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP = eINSTANCE.getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuildingGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING = eINSTANCE.getAbstractBuildingType_GenericApplicationPropertyOfAbstractBuilding();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.AbstractOpeningTypeImpl <em>Abstract Opening Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.AbstractOpeningTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getAbstractOpeningType()
		 * @generated
		 */
		EClass ABSTRACT_OPENING_TYPE = eINSTANCE.getAbstractOpeningType();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE = eINSTANCE.getAbstractOpeningType_Lod3MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getAbstractOpeningType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Opening Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP = eINSTANCE.getAbstractOpeningType_GenericApplicationPropertyOfOpeningGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Opening</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING = eINSTANCE.getAbstractOpeningType_GenericApplicationPropertyOfOpening();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.BoundarySurfacePropertyTypeImpl <em>Boundary Surface Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.BoundarySurfacePropertyTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBoundarySurfacePropertyType()
		 * @generated
		 */
		EClass BOUNDARY_SURFACE_PROPERTY_TYPE = eINSTANCE.getBoundarySurfacePropertyType();

		/**
		 * The meta object literal for the '<em><b>Boundary Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE_GROUP = eINSTANCE.getBoundarySurfacePropertyType_BoundarySurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Boundary Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY_SURFACE_PROPERTY_TYPE__BOUNDARY_SURFACE = eINSTANCE.getBoundarySurfacePropertyType_BoundarySurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl <em>Furniture Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureType()
		 * @generated
		 */
		EClass BUILDING_FURNITURE_TYPE = eINSTANCE.getBuildingFurnitureType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_FURNITURE_TYPE__CLASS = eINSTANCE.getBuildingFurnitureType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_FURNITURE_TYPE__FUNCTION = eINSTANCE.getBuildingFurnitureType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_FURNITURE_TYPE__USAGE = eINSTANCE.getBuildingFurnitureType_Usage();

		/**
		 * The meta object literal for the '<em><b>Lod4 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY = eINSTANCE.getBuildingFurnitureType_Lod4Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod4 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION = eINSTANCE.getBuildingFurnitureType_Lod4ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Furniture Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP = eINSTANCE.getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurnitureGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Furniture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE = eINSTANCE.getBuildingFurnitureType_GenericApplicationPropertyOfBuildingFurniture();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.BuildingInstallationPropertyTypeImpl <em>Installation Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.BuildingInstallationPropertyTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationPropertyType()
		 * @generated
		 */
		EClass BUILDING_INSTALLATION_PROPERTY_TYPE = eINSTANCE.getBuildingInstallationPropertyType();

		/**
		 * The meta object literal for the '<em><b>Building Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_INSTALLATION_PROPERTY_TYPE__BUILDING_INSTALLATION = eINSTANCE.getBuildingInstallationPropertyType_BuildingInstallation();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl <em>Installation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.BuildingInstallationTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationType()
		 * @generated
		 */
		EClass BUILDING_INSTALLATION_TYPE = eINSTANCE.getBuildingInstallationType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_INSTALLATION_TYPE__CLASS = eINSTANCE.getBuildingInstallationType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_INSTALLATION_TYPE__FUNCTION = eINSTANCE.getBuildingInstallationType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_INSTALLATION_TYPE__USAGE = eINSTANCE.getBuildingInstallationType_Usage();

		/**
		 * The meta object literal for the '<em><b>Lod2 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY = eINSTANCE.getBuildingInstallationType_Lod2Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod3 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY = eINSTANCE.getBuildingInstallationType_Lod3Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod4 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY = eINSTANCE.getBuildingInstallationType_Lod4Geometry();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Installation Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP = eINSTANCE.getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallationGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Installation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION = eINSTANCE.getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallation();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.BuildingPartPropertyTypeImpl <em>Part Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.BuildingPartPropertyTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingPartPropertyType()
		 * @generated
		 */
		EClass BUILDING_PART_PROPERTY_TYPE = eINSTANCE.getBuildingPartPropertyType();

		/**
		 * The meta object literal for the '<em><b>Building Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_PART_PROPERTY_TYPE__BUILDING_PART = eINSTANCE.getBuildingPartPropertyType_BuildingPart();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.BuildingPartTypeImpl <em>Part Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.BuildingPartTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingPartType()
		 * @generated
		 */
		EClass BUILDING_PART_TYPE = eINSTANCE.getBuildingPartType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Part Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART_GROUP = eINSTANCE.getBuildingPartType_GenericApplicationPropertyOfBuildingPartGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_PART_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART = eINSTANCE.getBuildingPartType_GenericApplicationPropertyOfBuildingPart();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.BuildingTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.BuildingTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingType()
		 * @generated
		 */
		EClass BUILDING_TYPE = eINSTANCE.getBuildingType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_GROUP = eINSTANCE.getBuildingType_GenericApplicationPropertyOfBuildingGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING = eINSTANCE.getBuildingType_GenericApplicationPropertyOfBuilding();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.CeilingSurfaceTypeImpl <em>Ceiling Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.CeilingSurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getCeilingSurfaceType()
		 * @generated
		 */
		EClass CEILING_SURFACE_TYPE = eINSTANCE.getCeilingSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Ceiling Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE_GROUP = eINSTANCE.getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Ceiling Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEILING_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE = eINSTANCE.getCeilingSurfaceType_GenericApplicationPropertyOfCeilingSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.ClosureSurfaceTypeImpl <em>Closure Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.ClosureSurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getClosureSurfaceType()
		 * @generated
		 */
		EClass CLOSURE_SURFACE_TYPE = eINSTANCE.getClosureSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Closure Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE_GROUP = eINSTANCE.getClosureSurfaceType_GenericApplicationPropertyOfClosureSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Closure Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOSURE_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE = eINSTANCE.getClosureSurfaceType_GenericApplicationPropertyOfClosureSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.DocumentRootImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Abstract Building</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_BUILDING = eINSTANCE.getDocumentRoot_AbstractBuilding();

		/**
		 * The meta object literal for the '<em><b>Boundary Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOUNDARY_SURFACE = eINSTANCE.getDocumentRoot_BoundarySurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfAbstractBuilding();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfBoundarySurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfBuilding();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Furniture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfBuildingFurniture();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfBuildingInstallation();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Building Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_PART = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfBuildingPart();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Ceiling Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CEILING_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfCeilingSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Closure Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CLOSURE_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfClosureSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Door</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_DOOR = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfDoor();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Floor Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfFloorSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Ground Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfGroundSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Int Building Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfIntBuildingInstallation();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Interior Wall Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfInteriorWallSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Opening</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_OPENING = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfOpening();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Roof Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfRoofSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Room</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROOM = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfRoom();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Wall Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWallSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WINDOW = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfWindow();

		/**
		 * The meta object literal for the '<em><b>Opening</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OPENING = eINSTANCE.getDocumentRoot_Opening();

		/**
		 * The meta object literal for the '<em><b>Building</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUILDING = eINSTANCE.getDocumentRoot_Building();

		/**
		 * The meta object literal for the '<em><b>Building Furniture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUILDING_FURNITURE = eINSTANCE.getDocumentRoot_BuildingFurniture();

		/**
		 * The meta object literal for the '<em><b>Building Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUILDING_INSTALLATION = eINSTANCE.getDocumentRoot_BuildingInstallation();

		/**
		 * The meta object literal for the '<em><b>Building Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BUILDING_PART = eINSTANCE.getDocumentRoot_BuildingPart();

		/**
		 * The meta object literal for the '<em><b>Ceiling Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CEILING_SURFACE = eINSTANCE.getDocumentRoot_CeilingSurface();

		/**
		 * The meta object literal for the '<em><b>Closure Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLOSURE_SURFACE = eINSTANCE.getDocumentRoot_ClosureSurface();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOOR = eINSTANCE.getDocumentRoot_Door();

		/**
		 * The meta object literal for the '<em><b>Floor Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLOOR_SURFACE = eINSTANCE.getDocumentRoot_FloorSurface();

		/**
		 * The meta object literal for the '<em><b>Ground Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GROUND_SURFACE = eINSTANCE.getDocumentRoot_GroundSurface();

		/**
		 * The meta object literal for the '<em><b>Int Building Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INT_BUILDING_INSTALLATION = eINSTANCE.getDocumentRoot_IntBuildingInstallation();

		/**
		 * The meta object literal for the '<em><b>Interior Wall Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERIOR_WALL_SURFACE = eINSTANCE.getDocumentRoot_InteriorWallSurface();

		/**
		 * The meta object literal for the '<em><b>Roof Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROOF_SURFACE = eINSTANCE.getDocumentRoot_RoofSurface();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROOM = eINSTANCE.getDocumentRoot_Room();

		/**
		 * The meta object literal for the '<em><b>Wall Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WALL_SURFACE = eINSTANCE.getDocumentRoot_WallSurface();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WINDOW = eINSTANCE.getDocumentRoot_Window();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.DoorTypeImpl <em>Door Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.DoorTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getDoorType()
		 * @generated
		 */
		EClass DOOR_TYPE = eINSTANCE.getDoorType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_TYPE__ADDRESS = eINSTANCE.getDoorType_Address();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Door Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR_GROUP = eINSTANCE.getDoorType_GenericApplicationPropertyOfDoorGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Door</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR_TYPE__GENERIC_APPLICATION_PROPERTY_OF_DOOR = eINSTANCE.getDoorType_GenericApplicationPropertyOfDoor();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.FloorSurfaceTypeImpl <em>Floor Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.FloorSurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getFloorSurfaceType()
		 * @generated
		 */
		EClass FLOOR_SURFACE_TYPE = eINSTANCE.getFloorSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Floor Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE_GROUP = eINSTANCE.getFloorSurfaceType_GenericApplicationPropertyOfFloorSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Floor Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_FLOOR_SURFACE = eINSTANCE.getFloorSurfaceType_GenericApplicationPropertyOfFloorSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.GroundSurfaceTypeImpl <em>Ground Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.GroundSurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getGroundSurfaceType()
		 * @generated
		 */
		EClass GROUND_SURFACE_TYPE = eINSTANCE.getGroundSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Ground Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE_GROUP = eINSTANCE.getGroundSurfaceType_GenericApplicationPropertyOfGroundSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Ground Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GROUND_SURFACE = eINSTANCE.getGroundSurfaceType_GenericApplicationPropertyOfGroundSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.IntBuildingInstallationPropertyTypeImpl <em>Int Building Installation Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.IntBuildingInstallationPropertyTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationPropertyType()
		 * @generated
		 */
		EClass INT_BUILDING_INSTALLATION_PROPERTY_TYPE = eINSTANCE.getIntBuildingInstallationPropertyType();

		/**
		 * The meta object literal for the '<em><b>Int Building Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BUILDING_INSTALLATION_PROPERTY_TYPE__INT_BUILDING_INSTALLATION = eINSTANCE.getIntBuildingInstallationPropertyType_IntBuildingInstallation();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl <em>Int Building Installation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationType()
		 * @generated
		 */
		EClass INT_BUILDING_INSTALLATION_TYPE = eINSTANCE.getIntBuildingInstallationType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_BUILDING_INSTALLATION_TYPE__CLASS = eINSTANCE.getIntBuildingInstallationType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_BUILDING_INSTALLATION_TYPE__FUNCTION = eINSTANCE.getIntBuildingInstallationType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_BUILDING_INSTALLATION_TYPE__USAGE = eINSTANCE.getIntBuildingInstallationType_Usage();

		/**
		 * The meta object literal for the '<em><b>Lod4 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY = eINSTANCE.getIntBuildingInstallationType_Lod4Geometry();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Int Building Installation Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP = eINSTANCE.getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallationGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Int Building Installation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION = eINSTANCE.getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallation();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.InteriorFurniturePropertyTypeImpl <em>Interior Furniture Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.InteriorFurniturePropertyTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getInteriorFurniturePropertyType()
		 * @generated
		 */
		EClass INTERIOR_FURNITURE_PROPERTY_TYPE = eINSTANCE.getInteriorFurniturePropertyType();

		/**
		 * The meta object literal for the '<em><b>Building Furniture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIOR_FURNITURE_PROPERTY_TYPE__BUILDING_FURNITURE = eINSTANCE.getInteriorFurniturePropertyType_BuildingFurniture();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.InteriorRoomPropertyTypeImpl <em>Interior Room Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.InteriorRoomPropertyTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getInteriorRoomPropertyType()
		 * @generated
		 */
		EClass INTERIOR_ROOM_PROPERTY_TYPE = eINSTANCE.getInteriorRoomPropertyType();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIOR_ROOM_PROPERTY_TYPE__ROOM = eINSTANCE.getInteriorRoomPropertyType_Room();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.InteriorWallSurfaceTypeImpl <em>Interior Wall Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.InteriorWallSurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getInteriorWallSurfaceType()
		 * @generated
		 */
		EClass INTERIOR_WALL_SURFACE_TYPE = eINSTANCE.getInteriorWallSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Interior Wall Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE_GROUP = eINSTANCE.getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Interior Wall Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIOR_WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INTERIOR_WALL_SURFACE = eINSTANCE.getInteriorWallSurfaceType_GenericApplicationPropertyOfInteriorWallSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.OpeningPropertyTypeImpl <em>Opening Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.OpeningPropertyTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getOpeningPropertyType()
		 * @generated
		 */
		EClass OPENING_PROPERTY_TYPE = eINSTANCE.getOpeningPropertyType();

		/**
		 * The meta object literal for the '<em><b>Opening Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPENING_PROPERTY_TYPE__OPENING_GROUP = eINSTANCE.getOpeningPropertyType_OpeningGroup();

		/**
		 * The meta object literal for the '<em><b>Opening</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPENING_PROPERTY_TYPE__OPENING = eINSTANCE.getOpeningPropertyType_Opening();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.RoofSurfaceTypeImpl <em>Roof Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.RoofSurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoofSurfaceType()
		 * @generated
		 */
		EClass ROOF_SURFACE_TYPE = eINSTANCE.getRoofSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Roof Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE_GROUP = eINSTANCE.getRoofSurfaceType_GenericApplicationPropertyOfRoofSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Roof Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOF_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOF_SURFACE = eINSTANCE.getRoofSurfaceType_GenericApplicationPropertyOfRoofSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.RoomTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__CLASS = eINSTANCE.getRoomType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__FUNCTION = eINSTANCE.getRoomType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__USAGE = eINSTANCE.getRoomType_Usage();

		/**
		 * The meta object literal for the '<em><b>Lod4 Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__LOD4_SOLID = eINSTANCE.getRoomType_Lod4Solid();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getRoomType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Bounded By1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__BOUNDED_BY1 = eINSTANCE.getRoomType_BoundedBy1();

		/**
		 * The meta object literal for the '<em><b>Interior Furniture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__INTERIOR_FURNITURE = eINSTANCE.getRoomType_InteriorFurniture();

		/**
		 * The meta object literal for the '<em><b>Room Installation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__ROOM_INSTALLATION = eINSTANCE.getRoomType_RoomInstallation();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Room Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP = eINSTANCE.getRoomType_GenericApplicationPropertyOfRoomGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM = eINSTANCE.getRoomType_GenericApplicationPropertyOfRoom();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.WallSurfaceTypeImpl <em>Wall Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.WallSurfaceTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getWallSurfaceType()
		 * @generated
		 */
		EClass WALL_SURFACE_TYPE = eINSTANCE.getWallSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Wall Surface Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE_GROUP = eINSTANCE.getWallSurfaceType_GenericApplicationPropertyOfWallSurfaceGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Wall Surface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WALL_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WALL_SURFACE = eINSTANCE.getWallSurfaceType_GenericApplicationPropertyOfWallSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.building.impl.WindowTypeImpl <em>Window Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.building.impl.WindowTypeImpl
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getWindowType()
		 * @generated
		 */
		EClass WINDOW_TYPE = eINSTANCE.getWindowType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Window Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP = eINSTANCE.getWindowType_GenericApplicationPropertyOfWindowGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Window</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW = eINSTANCE.getWindowType_GenericApplicationPropertyOfWindow();

		/**
		 * The meta object literal for the '<em>Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingClassType()
		 * @generated
		 */
		EDataType BUILDING_CLASS_TYPE = eINSTANCE.getBuildingClassType();

		/**
		 * The meta object literal for the '<em>Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFunctionType()
		 * @generated
		 */
		EDataType BUILDING_FUNCTION_TYPE = eINSTANCE.getBuildingFunctionType();

		/**
		 * The meta object literal for the '<em>Furniture Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureClassType()
		 * @generated
		 */
		EDataType BUILDING_FURNITURE_CLASS_TYPE = eINSTANCE.getBuildingFurnitureClassType();

		/**
		 * The meta object literal for the '<em>Furniture Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureFunctionType()
		 * @generated
		 */
		EDataType BUILDING_FURNITURE_FUNCTION_TYPE = eINSTANCE.getBuildingFurnitureFunctionType();

		/**
		 * The meta object literal for the '<em>Furniture Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingFurnitureUsageType()
		 * @generated
		 */
		EDataType BUILDING_FURNITURE_USAGE_TYPE = eINSTANCE.getBuildingFurnitureUsageType();

		/**
		 * The meta object literal for the '<em>Installation Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationClassType()
		 * @generated
		 */
		EDataType BUILDING_INSTALLATION_CLASS_TYPE = eINSTANCE.getBuildingInstallationClassType();

		/**
		 * The meta object literal for the '<em>Installation Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationFunctionType()
		 * @generated
		 */
		EDataType BUILDING_INSTALLATION_FUNCTION_TYPE = eINSTANCE.getBuildingInstallationFunctionType();

		/**
		 * The meta object literal for the '<em>Installation Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingInstallationUsageType()
		 * @generated
		 */
		EDataType BUILDING_INSTALLATION_USAGE_TYPE = eINSTANCE.getBuildingInstallationUsageType();

		/**
		 * The meta object literal for the '<em>Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getBuildingUsageType()
		 * @generated
		 */
		EDataType BUILDING_USAGE_TYPE = eINSTANCE.getBuildingUsageType();

		/**
		 * The meta object literal for the '<em>Int Building Installation Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationClassType()
		 * @generated
		 */
		EDataType INT_BUILDING_INSTALLATION_CLASS_TYPE = eINSTANCE.getIntBuildingInstallationClassType();

		/**
		 * The meta object literal for the '<em>Int Building Installation Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationFunctionType()
		 * @generated
		 */
		EDataType INT_BUILDING_INSTALLATION_FUNCTION_TYPE = eINSTANCE.getIntBuildingInstallationFunctionType();

		/**
		 * The meta object literal for the '<em>Int Building Installation Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getIntBuildingInstallationUsageType()
		 * @generated
		 */
		EDataType INT_BUILDING_INSTALLATION_USAGE_TYPE = eINSTANCE.getIntBuildingInstallationUsageType();

		/**
		 * The meta object literal for the '<em>Roof Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoofTypeType()
		 * @generated
		 */
		EDataType ROOF_TYPE_TYPE = eINSTANCE.getRoofTypeType();

		/**
		 * The meta object literal for the '<em>Room Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomClassType()
		 * @generated
		 */
		EDataType ROOM_CLASS_TYPE = eINSTANCE.getRoomClassType();

		/**
		 * The meta object literal for the '<em>Room Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomFunctionType()
		 * @generated
		 */
		EDataType ROOM_FUNCTION_TYPE = eINSTANCE.getRoomFunctionType();

		/**
		 * The meta object literal for the '<em>Room Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.building.impl.BuildingPackageImpl#getRoomUsageType()
		 * @generated
		 */
		EDataType ROOM_USAGE_TYPE = eINSTANCE.getRoomUsageType();

	}

} //BuildingPackage
