/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

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
 * @see net.opengis.citygml.CitygmlFactory
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
public interface CitygmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "citygml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CitygmlPackage eINSTANCE = net.opengis.citygml.impl.CitygmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl <em>Abstract City Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.AbstractCityObjectTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAbstractCityObjectType()
	 * @generated
	 */
	int ABSTRACT_CITY_OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_FEATURE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__NAME = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__ID = GmlPackage.ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY = GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__LOCATION = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract City Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.AbstractSiteTypeImpl <em>Abstract Site Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.AbstractSiteTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAbstractSiteType()
	 * @generated
	 */
	int ABSTRACT_SITE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__META_DATA_PROPERTY = ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__DESCRIPTION = ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__NAME_GROUP = ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__NAME = ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__ID = ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__BOUNDED_BY = ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__LOCATION_GROUP = ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__LOCATION = ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__CREATION_DATE = ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__TERMINATION_DATE = ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__EXTERNAL_REFERENCE = ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__GENERALIZES_TO = ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP = ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE = ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Site Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SITE_TYPE_FEATURE_COUNT = ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.AddressPropertyTypeImpl <em>Address Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.AddressPropertyTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAddressPropertyType()
	 * @generated
	 */
	int ADDRESS_PROPERTY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE__ADDRESS = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.AddressTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_FEATURE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__NAME = GmlPackage.ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ID = GmlPackage.ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__BOUNDED_BY = GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__LOCATION_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__LOCATION = GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Xal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__XAL_ADDRESS = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multi Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__MULTI_POINT = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Address Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.CityModelTypeImpl <em>City Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.CityModelTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getCityModelType()
	 * @generated
	 */
	int CITY_MODEL_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__NAME = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__ID = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__BOUNDED_BY = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__LOCATION_GROUP = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__LOCATION = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Feature Member Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__FEATURE_MEMBER_GROUP = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER_GROUP;

	/**
	 * The feature id for the '<em><b>Feature Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__FEATURE_MEMBER = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER;

	/**
	 * The feature id for the '<em><b>Feature Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__FEATURE_MEMBERS = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Model Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>City Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.ExternalObjectReferenceTypeImpl <em>External Object Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.ExternalObjectReferenceTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getExternalObjectReferenceType()
	 * @generated
	 */
	int EXTERNAL_OBJECT_REFERENCE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_REFERENCE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_REFERENCE_TYPE__URI = 1;

	/**
	 * The number of structural features of the '<em>External Object Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_OBJECT_REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.ExternalReferenceTypeImpl <em>External Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.ExternalReferenceTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getExternalReferenceType()
	 * @generated
	 */
	int EXTERNAL_REFERENCE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Information System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>External Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT = 1;

	/**
	 * The number of structural features of the '<em>External Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.GeneralizationRelationTypeImpl <em>Generalization Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.GeneralizationRelationTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getGeneralizationRelationType()
	 * @generated
	 */
	int GENERALIZATION_RELATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__CITY_OBJECT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__CITY_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__REMOTE_SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE__TYPE = 9;

	/**
	 * The number of structural features of the '<em>Generalization Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATION_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.ImplicitGeometryTypeImpl <em>Implicit Geometry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.ImplicitGeometryTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getImplicitGeometryType()
	 * @generated
	 */
	int IMPLICIT_GEOMETRY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_GML_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__NAME = GmlPackage.ABSTRACT_GML_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__ID = GmlPackage.ABSTRACT_GML_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__MIME_TYPE = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Library Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relative GML Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Implicit Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_GEOMETRY_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.ImplicitRepresentationPropertyTypeImpl <em>Implicit Representation Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.ImplicitRepresentationPropertyTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getImplicitRepresentationPropertyType()
	 * @generated
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Implicit Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implicit Representation Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_REPRESENTATION_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.XalAddressPropertyTypeImpl <em>Xal Address Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.XalAddressPropertyTypeImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getXalAddressPropertyType()
	 * @generated
	 */
	int XAL_ADDRESS_PROPERTY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS = 0;

	/**
	 * The number of structural features of the '<em>Xal Address Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAL_ADDRESS_PROPERTY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.DocumentRootImpl
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

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
	 * The feature id for the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SITE = 3;

	/**
	 * The feature id for the '<em><b>City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>City Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY_MODEL = 10;

	/**
	 * The feature id for the '<em><b>City Object Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY_OBJECT_MEMBER = 11;

	/**
	 * The feature id for the '<em><b>Implicit Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLICIT_GEOMETRY = 12;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '<em>Double Between0and1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDoubleBetween0and1()
	 * @generated
	 */
	int DOUBLE_BETWEEN0AND1 = 12;

	/**
	 * The meta object id for the '<em>Double Between0and1 List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDoubleBetween0and1List()
	 * @generated
	 */
	int DOUBLE_BETWEEN0AND1_LIST = 13;

	/**
	 * The meta object id for the '<em>Double Between0and1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDoubleBetween0and1Object()
	 * @generated
	 */
	int DOUBLE_BETWEEN0AND1_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Integer Between0and4</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getIntegerBetween0and4()
	 * @generated
	 */
	int INTEGER_BETWEEN0AND4 = 15;

	/**
	 * The meta object id for the '<em>Mime Type Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getMimeTypeType()
	 * @generated
	 */
	int MIME_TYPE_TYPE = 16;

	/**
	 * The meta object id for the '<em>Transformation Matrix2x2 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getTransformationMatrix2x2Type()
	 * @generated
	 */
	int TRANSFORMATION_MATRIX2X2_TYPE = 17;

	/**
	 * The meta object id for the '<em>Transformation Matrix3x4 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getTransformationMatrix3x4Type()
	 * @generated
	 */
	int TRANSFORMATION_MATRIX3X4_TYPE = 18;

	/**
	 * The meta object id for the '<em>Transformation Matrix4x4 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getTransformationMatrix4x4Type()
	 * @generated
	 */
	int TRANSFORMATION_MATRIX4X4_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.AbstractCityObjectType <em>Abstract City Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract City Object Type</em>'.
	 * @see net.opengis.citygml.AbstractCityObjectType
	 * @generated
	 */
	EClass getAbstractCityObjectType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.AbstractCityObjectType#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see net.opengis.citygml.AbstractCityObjectType#getCreationDate()
	 * @see #getAbstractCityObjectType()
	 * @generated
	 */
	EAttribute getAbstractCityObjectType_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.AbstractCityObjectType#getTerminationDate <em>Termination Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Date</em>'.
	 * @see net.opengis.citygml.AbstractCityObjectType#getTerminationDate()
	 * @see #getAbstractCityObjectType()
	 * @generated
	 */
	EAttribute getAbstractCityObjectType_TerminationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.AbstractCityObjectType#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Reference</em>'.
	 * @see net.opengis.citygml.AbstractCityObjectType#getExternalReference()
	 * @see #getAbstractCityObjectType()
	 * @generated
	 */
	EReference getAbstractCityObjectType_ExternalReference();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.AbstractCityObjectType#getGeneralizesTo <em>Generalizes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalizes To</em>'.
	 * @see net.opengis.citygml.AbstractCityObjectType#getGeneralizesTo()
	 * @see #getAbstractCityObjectType()
	 * @generated
	 */
	EReference getAbstractCityObjectType_GeneralizesTo();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.AbstractCityObjectType#getGenericApplicationPropertyOfCityObjectGroup <em>Generic Application Property Of City Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of City Object Group</em>'.
	 * @see net.opengis.citygml.AbstractCityObjectType#getGenericApplicationPropertyOfCityObjectGroup()
	 * @see #getAbstractCityObjectType()
	 * @generated
	 */
	EAttribute getAbstractCityObjectType_GenericApplicationPropertyOfCityObjectGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.AbstractCityObjectType#getGenericApplicationPropertyOfCityObject <em>Generic Application Property Of City Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of City Object</em>'.
	 * @see net.opengis.citygml.AbstractCityObjectType#getGenericApplicationPropertyOfCityObject()
	 * @see #getAbstractCityObjectType()
	 * @generated
	 */
	EReference getAbstractCityObjectType_GenericApplicationPropertyOfCityObject();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.AbstractSiteType <em>Abstract Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Site Type</em>'.
	 * @see net.opengis.citygml.AbstractSiteType
	 * @generated
	 */
	EClass getAbstractSiteType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.AbstractSiteType#getGenericApplicationPropertyOfSiteGroup <em>Generic Application Property Of Site Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Site Group</em>'.
	 * @see net.opengis.citygml.AbstractSiteType#getGenericApplicationPropertyOfSiteGroup()
	 * @see #getAbstractSiteType()
	 * @generated
	 */
	EAttribute getAbstractSiteType_GenericApplicationPropertyOfSiteGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.AbstractSiteType#getGenericApplicationPropertyOfSite <em>Generic Application Property Of Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Site</em>'.
	 * @see net.opengis.citygml.AbstractSiteType#getGenericApplicationPropertyOfSite()
	 * @see #getAbstractSiteType()
	 * @generated
	 */
	EReference getAbstractSiteType_GenericApplicationPropertyOfSite();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.AddressPropertyType <em>Address Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Property Type</em>'.
	 * @see net.opengis.citygml.AddressPropertyType
	 * @generated
	 */
	EClass getAddressPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.AddressPropertyType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see net.opengis.citygml.AddressPropertyType#getAddress()
	 * @see #getAddressPropertyType()
	 * @generated
	 */
	EReference getAddressPropertyType_Address();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see net.opengis.citygml.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.AddressType#getXalAddress <em>Xal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xal Address</em>'.
	 * @see net.opengis.citygml.AddressType#getXalAddress()
	 * @see #getAddressType()
	 * @generated
	 */
	EReference getAddressType_XalAddress();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.AddressType#getMultiPoint <em>Multi Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Point</em>'.
	 * @see net.opengis.citygml.AddressType#getMultiPoint()
	 * @see #getAddressType()
	 * @generated
	 */
	EReference getAddressType_MultiPoint();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.AddressType#getGenericApplicationPropertyOfAddressGroup <em>Generic Application Property Of Address Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Address Group</em>'.
	 * @see net.opengis.citygml.AddressType#getGenericApplicationPropertyOfAddressGroup()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_GenericApplicationPropertyOfAddressGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.AddressType#getGenericApplicationPropertyOfAddress <em>Generic Application Property Of Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Address</em>'.
	 * @see net.opengis.citygml.AddressType#getGenericApplicationPropertyOfAddress()
	 * @see #getAddressType()
	 * @generated
	 */
	EReference getAddressType_GenericApplicationPropertyOfAddress();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.CityModelType <em>City Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Model Type</em>'.
	 * @see net.opengis.citygml.CityModelType
	 * @generated
	 */
	EClass getCityModelType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.CityModelType#getGenericApplicationPropertyOfCityModelGroup <em>Generic Application Property Of City Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of City Model Group</em>'.
	 * @see net.opengis.citygml.CityModelType#getGenericApplicationPropertyOfCityModelGroup()
	 * @see #getCityModelType()
	 * @generated
	 */
	EAttribute getCityModelType_GenericApplicationPropertyOfCityModelGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.CityModelType#getGenericApplicationPropertyOfCityModel <em>Generic Application Property Of City Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of City Model</em>'.
	 * @see net.opengis.citygml.CityModelType#getGenericApplicationPropertyOfCityModel()
	 * @see #getCityModelType()
	 * @generated
	 */
	EReference getCityModelType_GenericApplicationPropertyOfCityModel();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.ExternalObjectReferenceType <em>External Object Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Object Reference Type</em>'.
	 * @see net.opengis.citygml.ExternalObjectReferenceType
	 * @generated
	 */
	EClass getExternalObjectReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.ExternalObjectReferenceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.citygml.ExternalObjectReferenceType#getName()
	 * @see #getExternalObjectReferenceType()
	 * @generated
	 */
	EAttribute getExternalObjectReferenceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.ExternalObjectReferenceType#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see net.opengis.citygml.ExternalObjectReferenceType#getUri()
	 * @see #getExternalObjectReferenceType()
	 * @generated
	 */
	EAttribute getExternalObjectReferenceType_Uri();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference Type</em>'.
	 * @see net.opengis.citygml.ExternalReferenceType
	 * @generated
	 */
	EClass getExternalReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.ExternalReferenceType#getInformationSystem <em>Information System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information System</em>'.
	 * @see net.opengis.citygml.ExternalReferenceType#getInformationSystem()
	 * @see #getExternalReferenceType()
	 * @generated
	 */
	EAttribute getExternalReferenceType_InformationSystem();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.ExternalReferenceType#getExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Object</em>'.
	 * @see net.opengis.citygml.ExternalReferenceType#getExternalObject()
	 * @see #getExternalReferenceType()
	 * @generated
	 */
	EReference getExternalReferenceType_ExternalObject();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.GeneralizationRelationType <em>Generalization Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Relation Type</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType
	 * @generated
	 */
	EClass getGeneralizationRelationType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.GeneralizationRelationType#getCityObjectGroup <em>City Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>City Object Group</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getCityObjectGroup()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_CityObjectGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.GeneralizationRelationType#getCityObject <em>City Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Object</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getCityObject()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EReference getGeneralizationRelationType_CityObject();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getActuate()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getArcrole()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getHref()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getRemoteSchema <em>Remote Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Schema</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getRemoteSchema()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_RemoteSchema();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getRole()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getShow()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getTitle()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.GeneralizationRelationType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.citygml.GeneralizationRelationType#getType()
	 * @see #getGeneralizationRelationType()
	 * @generated
	 */
	EAttribute getGeneralizationRelationType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.ImplicitGeometryType <em>Implicit Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Geometry Type</em>'.
	 * @see net.opengis.citygml.ImplicitGeometryType
	 * @generated
	 */
	EClass getImplicitGeometryType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.ImplicitGeometryType#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see net.opengis.citygml.ImplicitGeometryType#getMimeType()
	 * @see #getImplicitGeometryType()
	 * @generated
	 */
	EAttribute getImplicitGeometryType_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.ImplicitGeometryType#getTransformationMatrix <em>Transformation Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Matrix</em>'.
	 * @see net.opengis.citygml.ImplicitGeometryType#getTransformationMatrix()
	 * @see #getImplicitGeometryType()
	 * @generated
	 */
	EAttribute getImplicitGeometryType_TransformationMatrix();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.ImplicitGeometryType#getLibraryObject <em>Library Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Object</em>'.
	 * @see net.opengis.citygml.ImplicitGeometryType#getLibraryObject()
	 * @see #getImplicitGeometryType()
	 * @generated
	 */
	EAttribute getImplicitGeometryType_LibraryObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.ImplicitGeometryType#getRelativeGMLGeometry <em>Relative GML Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative GML Geometry</em>'.
	 * @see net.opengis.citygml.ImplicitGeometryType#getRelativeGMLGeometry()
	 * @see #getImplicitGeometryType()
	 * @generated
	 */
	EReference getImplicitGeometryType_RelativeGMLGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.ImplicitGeometryType#getReferencePoint <em>Reference Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Point</em>'.
	 * @see net.opengis.citygml.ImplicitGeometryType#getReferencePoint()
	 * @see #getImplicitGeometryType()
	 * @generated
	 */
	EReference getImplicitGeometryType_ReferencePoint();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.ImplicitRepresentationPropertyType <em>Implicit Representation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Representation Property Type</em>'.
	 * @see net.opengis.citygml.ImplicitRepresentationPropertyType
	 * @generated
	 */
	EClass getImplicitRepresentationPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.ImplicitRepresentationPropertyType#getImplicitGeometry <em>Implicit Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implicit Geometry</em>'.
	 * @see net.opengis.citygml.ImplicitRepresentationPropertyType#getImplicitGeometry()
	 * @see #getImplicitRepresentationPropertyType()
	 * @generated
	 */
	EReference getImplicitRepresentationPropertyType_ImplicitGeometry();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.XalAddressPropertyType <em>Xal Address Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xal Address Property Type</em>'.
	 * @see net.opengis.citygml.XalAddressPropertyType
	 * @generated
	 */
	EClass getXalAddressPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.XalAddressPropertyType#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Details</em>'.
	 * @see net.opengis.citygml.XalAddressPropertyType#getAddressDetails()
	 * @see #getXalAddressPropertyType()
	 * @generated
	 */
	EReference getXalAddressPropertyType_AddressDetails();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Site</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getSite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Site();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getCityObject <em>City Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Object</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getCityObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CityObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfAddress <em>Generic Application Property Of Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Address</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfAddress();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfCityModel <em>Generic Application Property Of City Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of City Model</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfCityModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfCityModel();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfCityObject <em>Generic Application Property Of City Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of City Object</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfCityObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfCityObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfSite <em>Generic Application Property Of Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Site</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfSite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfSite();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getCityModel <em>City Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Model</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getCityModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CityModel();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getCityObjectMember <em>City Object Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Object Member</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getCityObjectMember()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CityObjectMember();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.DocumentRoot#getImplicitGeometry <em>Implicit Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implicit Geometry</em>'.
	 * @see net.opengis.citygml.DocumentRoot#getImplicitGeometry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImplicitGeometry();

	/**
	 * Returns the meta object for data type '<em>Double Between0and1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Between0and1</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='doubleBetween0and1' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getDoubleBetween0and1();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Double Between0and1 List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Between0and1 List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='doubleBetween0and1List' itemType='doubleBetween0and1'"
	 * @generated
	 */
	EDataType getDoubleBetween0and1List();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double Between0and1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Between0and1 Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='doubleBetween0and1:Object' baseType='doubleBetween0and1'"
	 * @generated
	 */
	EDataType getDoubleBetween0and1Object();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Integer Between0and4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Between0and4</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='integerBetween0and4' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='4'"
	 * @generated
	 */
	EDataType getIntegerBetween0and4();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Mime Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mime Type Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MimeTypeType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getMimeTypeType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Transformation Matrix2x2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transformation Matrix2x2 Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='TransformationMatrix2x2Type' baseType='http://www.opengis.net/gml#doubleList' length='4'"
	 * @generated
	 */
	EDataType getTransformationMatrix2x2Type();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Transformation Matrix3x4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transformation Matrix3x4 Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='TransformationMatrix3x4Type' baseType='http://www.opengis.net/gml#doubleList' length='12'"
	 * @generated
	 */
	EDataType getTransformationMatrix3x4Type();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Transformation Matrix4x4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transformation Matrix4x4 Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='TransformationMatrix4x4Type' baseType='http://www.opengis.net/gml#doubleList' length='16'"
	 * @generated
	 */
	EDataType getTransformationMatrix4x4Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CitygmlFactory getCitygmlFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl <em>Abstract City Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.AbstractCityObjectTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAbstractCityObjectType()
		 * @generated
		 */
		EClass ABSTRACT_CITY_OBJECT_TYPE = eINSTANCE.getAbstractCityObjectType();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE = eINSTANCE.getAbstractCityObjectType_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Termination Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE = eINSTANCE.getAbstractCityObjectType_TerminationDate();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE = eINSTANCE.getAbstractCityObjectType_ExternalReference();

		/**
		 * The meta object literal for the '<em><b>Generalizes To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO = eINSTANCE.getAbstractCityObjectType_GeneralizesTo();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = eINSTANCE.getAbstractCityObjectType_GenericApplicationPropertyOfCityObjectGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = eINSTANCE.getAbstractCityObjectType_GenericApplicationPropertyOfCityObject();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.AbstractSiteTypeImpl <em>Abstract Site Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.AbstractSiteTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAbstractSiteType()
		 * @generated
		 */
		EClass ABSTRACT_SITE_TYPE = eINSTANCE.getAbstractSiteType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Site Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP = eINSTANCE.getAbstractSiteType_GenericApplicationPropertyOfSiteGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Site</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE = eINSTANCE.getAbstractSiteType_GenericApplicationPropertyOfSite();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.AddressPropertyTypeImpl <em>Address Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.AddressPropertyTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAddressPropertyType()
		 * @generated
		 */
		EClass ADDRESS_PROPERTY_TYPE = eINSTANCE.getAddressPropertyType();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_PROPERTY_TYPE__ADDRESS = eINSTANCE.getAddressPropertyType_Address();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.AddressTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>Xal Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE__XAL_ADDRESS = eINSTANCE.getAddressType_XalAddress();

		/**
		 * The meta object literal for the '<em><b>Multi Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE__MULTI_POINT = eINSTANCE.getAddressType_MultiPoint();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Address Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS_GROUP = eINSTANCE.getAddressType_GenericApplicationPropertyOfAddressGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS = eINSTANCE.getAddressType_GenericApplicationPropertyOfAddress();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.CityModelTypeImpl <em>City Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.CityModelTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getCityModelType()
		 * @generated
		 */
		EClass CITY_MODEL_TYPE = eINSTANCE.getCityModelType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Model Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL_GROUP = eINSTANCE.getCityModelType_GenericApplicationPropertyOfCityModelGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL = eINSTANCE.getCityModelType_GenericApplicationPropertyOfCityModel();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.ExternalObjectReferenceTypeImpl <em>External Object Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.ExternalObjectReferenceTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getExternalObjectReferenceType()
		 * @generated
		 */
		EClass EXTERNAL_OBJECT_REFERENCE_TYPE = eINSTANCE.getExternalObjectReferenceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OBJECT_REFERENCE_TYPE__NAME = eINSTANCE.getExternalObjectReferenceType_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_OBJECT_REFERENCE_TYPE__URI = eINSTANCE.getExternalObjectReferenceType_Uri();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.ExternalReferenceTypeImpl <em>External Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.ExternalReferenceTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getExternalReferenceType()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE_TYPE = eINSTANCE.getExternalReferenceType();

		/**
		 * The meta object literal for the '<em><b>Information System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE_TYPE__INFORMATION_SYSTEM = eINSTANCE.getExternalReferenceType_InformationSystem();

		/**
		 * The meta object literal for the '<em><b>External Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_REFERENCE_TYPE__EXTERNAL_OBJECT = eINSTANCE.getExternalReferenceType_ExternalObject();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.GeneralizationRelationTypeImpl <em>Generalization Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.GeneralizationRelationTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getGeneralizationRelationType()
		 * @generated
		 */
		EClass GENERALIZATION_RELATION_TYPE = eINSTANCE.getGeneralizationRelationType();

		/**
		 * The meta object literal for the '<em><b>City Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__CITY_OBJECT_GROUP = eINSTANCE.getGeneralizationRelationType_CityObjectGroup();

		/**
		 * The meta object literal for the '<em><b>City Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_RELATION_TYPE__CITY_OBJECT = eINSTANCE.getGeneralizationRelationType_CityObject();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__ACTUATE = eINSTANCE.getGeneralizationRelationType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__ARCROLE = eINSTANCE.getGeneralizationRelationType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__HREF = eINSTANCE.getGeneralizationRelationType_Href();

		/**
		 * The meta object literal for the '<em><b>Remote Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__REMOTE_SCHEMA = eINSTANCE.getGeneralizationRelationType_RemoteSchema();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__ROLE = eINSTANCE.getGeneralizationRelationType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__SHOW = eINSTANCE.getGeneralizationRelationType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__TITLE = eINSTANCE.getGeneralizationRelationType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATION_TYPE__TYPE = eINSTANCE.getGeneralizationRelationType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.ImplicitGeometryTypeImpl <em>Implicit Geometry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.ImplicitGeometryTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getImplicitGeometryType()
		 * @generated
		 */
		EClass IMPLICIT_GEOMETRY_TYPE = eINSTANCE.getImplicitGeometryType();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_GEOMETRY_TYPE__MIME_TYPE = eINSTANCE.getImplicitGeometryType_MimeType();

		/**
		 * The meta object literal for the '<em><b>Transformation Matrix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX = eINSTANCE.getImplicitGeometryType_TransformationMatrix();

		/**
		 * The meta object literal for the '<em><b>Library Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT = eINSTANCE.getImplicitGeometryType_LibraryObject();

		/**
		 * The meta object literal for the '<em><b>Relative GML Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY = eINSTANCE.getImplicitGeometryType_RelativeGMLGeometry();

		/**
		 * The meta object literal for the '<em><b>Reference Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT = eINSTANCE.getImplicitGeometryType_ReferencePoint();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.ImplicitRepresentationPropertyTypeImpl <em>Implicit Representation Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.ImplicitRepresentationPropertyTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getImplicitRepresentationPropertyType()
		 * @generated
		 */
		EClass IMPLICIT_REPRESENTATION_PROPERTY_TYPE = eINSTANCE.getImplicitRepresentationPropertyType();

		/**
		 * The meta object literal for the '<em><b>Implicit Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY = eINSTANCE.getImplicitRepresentationPropertyType_ImplicitGeometry();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.XalAddressPropertyTypeImpl <em>Xal Address Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.XalAddressPropertyTypeImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getXalAddressPropertyType()
		 * @generated
		 */
		EClass XAL_ADDRESS_PROPERTY_TYPE = eINSTANCE.getXalAddressPropertyType();

		/**
		 * The meta object literal for the '<em><b>Address Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XAL_ADDRESS_PROPERTY_TYPE__ADDRESS_DETAILS = eINSTANCE.getXalAddressPropertyType_AddressDetails();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.DocumentRootImpl
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SITE = eINSTANCE.getDocumentRoot_Site();

		/**
		 * The meta object literal for the '<em><b>City Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CITY_OBJECT = eINSTANCE.getDocumentRoot_CityObject();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfAddress();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfCityModel();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfCityObject();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfSite();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>City Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CITY_MODEL = eINSTANCE.getDocumentRoot_CityModel();

		/**
		 * The meta object literal for the '<em><b>City Object Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CITY_OBJECT_MEMBER = eINSTANCE.getDocumentRoot_CityObjectMember();

		/**
		 * The meta object literal for the '<em><b>Implicit Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPLICIT_GEOMETRY = eINSTANCE.getDocumentRoot_ImplicitGeometry();

		/**
		 * The meta object literal for the '<em>Double Between0and1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDoubleBetween0and1()
		 * @generated
		 */
		EDataType DOUBLE_BETWEEN0AND1 = eINSTANCE.getDoubleBetween0and1();

		/**
		 * The meta object literal for the '<em>Double Between0and1 List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDoubleBetween0and1List()
		 * @generated
		 */
		EDataType DOUBLE_BETWEEN0AND1_LIST = eINSTANCE.getDoubleBetween0and1List();

		/**
		 * The meta object literal for the '<em>Double Between0and1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getDoubleBetween0and1Object()
		 * @generated
		 */
		EDataType DOUBLE_BETWEEN0AND1_OBJECT = eINSTANCE.getDoubleBetween0and1Object();

		/**
		 * The meta object literal for the '<em>Integer Between0and4</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getIntegerBetween0and4()
		 * @generated
		 */
		EDataType INTEGER_BETWEEN0AND4 = eINSTANCE.getIntegerBetween0and4();

		/**
		 * The meta object literal for the '<em>Mime Type Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getMimeTypeType()
		 * @generated
		 */
		EDataType MIME_TYPE_TYPE = eINSTANCE.getMimeTypeType();

		/**
		 * The meta object literal for the '<em>Transformation Matrix2x2 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getTransformationMatrix2x2Type()
		 * @generated
		 */
		EDataType TRANSFORMATION_MATRIX2X2_TYPE = eINSTANCE.getTransformationMatrix2x2Type();

		/**
		 * The meta object literal for the '<em>Transformation Matrix3x4 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getTransformationMatrix3x4Type()
		 * @generated
		 */
		EDataType TRANSFORMATION_MATRIX3X4_TYPE = eINSTANCE.getTransformationMatrix3x4Type();

		/**
		 * The meta object literal for the '<em>Transformation Matrix4x4 Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.citygml.impl.CitygmlPackageImpl#getTransformationMatrix4x4Type()
		 * @generated
		 */
		EDataType TRANSFORMATION_MATRIX4X4_TYPE = eINSTANCE.getTransformationMatrix4x4Type();

	}

} //CitygmlPackage
