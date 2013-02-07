/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityobjectgroup;

import net.opengis.citygml.CitygmlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupFactory
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
public interface CityobjectgroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cityobjectgroup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/cityobjectgroup/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CityobjectgroupPackage eINSTANCE = net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl <em>City Object Group Member Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl
	 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getCityObjectGroupMemberType()
	 * @generated
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1 = 7;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE = 10;

	/**
	 * The number of structural features of the '<em>City Object Group Member Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_MEMBER_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupParentTypeImpl <em>City Object Group Parent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupParentTypeImpl
	 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getCityObjectGroupParentType()
	 * @generated
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__CITY_OBJECT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__CITY_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__REMOTE_SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE__TYPE = 9;

	/**
	 * The number of structural features of the '<em>City Object Group Parent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_PARENT_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl <em>City Object Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl
	 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getCityObjectGroupType()
	 * @generated
	 */
	int CITY_OBJECT_GROUP_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__CLASS = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__FUNCTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__USAGE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__PARENT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP1 = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>City Object Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OBJECT_GROUP_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.cityobjectgroup.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.cityobjectgroup.impl.DocumentRootImpl
	 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = 3;

	/**
	 * The feature id for the '<em><b>City Object Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITY_OBJECT_GROUP = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType <em>City Object Group Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Object Group Member Type</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType
	 * @generated
	 */
	EClass getCityObjectGroupMemberType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getCityObjectGroup <em>City Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>City Object Group</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getCityObjectGroup()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_CityObjectGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getCityObject <em>City Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Object</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getCityObject()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EReference getCityObjectGroupMemberType_CityObject();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getActuate()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getArcrole()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getHref()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getRemoteSchema <em>Remote Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Schema</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getRemoteSchema()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_RemoteSchema();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getRole()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getRole1 <em>Role1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role1</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getRole1()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Role1();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getShow()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getTitle()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType#getType()
	 * @see #getCityObjectGroupMemberType()
	 * @generated
	 */
	EAttribute getCityObjectGroupMemberType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType <em>City Object Group Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Object Group Parent Type</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType
	 * @generated
	 */
	EClass getCityObjectGroupParentType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getCityObjectGroup <em>City Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>City Object Group</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getCityObjectGroup()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_CityObjectGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getCityObject <em>City Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Object</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getCityObject()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EReference getCityObjectGroupParentType_CityObject();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getActuate()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getArcrole()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getHref()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getRemoteSchema <em>Remote Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Schema</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getRemoteSchema()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_RemoteSchema();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getRole()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getShow()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getTitle()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType#getType()
	 * @see #getCityObjectGroupParentType()
	 * @generated
	 */
	EAttribute getCityObjectGroupParentType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType <em>City Object Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Object Group Type</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType
	 * @generated
	 */
	EClass getCityObjectGroupType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getClass_()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EAttribute getCityObjectGroupType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getFunction()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EAttribute getCityObjectGroupType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getUsage()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EAttribute getCityObjectGroupType_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Member</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGroupMember()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EReference getCityObjectGroupType_GroupMember();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getParent()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EReference getCityObjectGroupType_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGeometry()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EReference getCityObjectGroupType_Geometry();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGenericApplicationPropertyOfCityObjectGroupGroup <em>Generic Application Property Of City Object Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of City Object Group Group</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGenericApplicationPropertyOfCityObjectGroupGroup()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EAttribute getCityObjectGroupType_GenericApplicationPropertyOfCityObjectGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGenericApplicationPropertyOfCityObjectGroup1 <em>Generic Application Property Of City Object Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of City Object Group1</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGenericApplicationPropertyOfCityObjectGroup1()
	 * @see #getCityObjectGroupType()
	 * @generated
	 */
	EReference getCityObjectGroupType_GenericApplicationPropertyOfCityObjectGroup1();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.cityobjectgroup.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.cityobjectgroup.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.cityobjectgroup.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.cityobjectgroup.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.cityobjectgroup.DocumentRoot#getGenericApplicationPropertyOfCityObjectGroup <em>Generic Application Property Of City Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of City Object Group</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.DocumentRoot#getGenericApplicationPropertyOfCityObjectGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfCityObjectGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.cityobjectgroup.DocumentRoot#getCityObjectGroup <em>City Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>City Object Group</em>'.
	 * @see net.opengis.citygml.cityobjectgroup.DocumentRoot#getCityObjectGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CityObjectGroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CityobjectgroupFactory getCityobjectgroupFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl <em>City Object Group Member Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl
		 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getCityObjectGroupMemberType()
		 * @generated
		 */
		EClass CITY_OBJECT_GROUP_MEMBER_TYPE = eINSTANCE.getCityObjectGroupMemberType();

		/**
		 * The meta object literal for the '<em><b>City Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP = eINSTANCE.getCityObjectGroupMemberType_CityObjectGroup();

		/**
		 * The meta object literal for the '<em><b>City Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT = eINSTANCE.getCityObjectGroupMemberType_CityObject();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE = eINSTANCE.getCityObjectGroupMemberType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE = eINSTANCE.getCityObjectGroupMemberType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__HREF = eINSTANCE.getCityObjectGroupMemberType_Href();

		/**
		 * The meta object literal for the '<em><b>Remote Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA = eINSTANCE.getCityObjectGroupMemberType_RemoteSchema();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE = eINSTANCE.getCityObjectGroupMemberType_Role();

		/**
		 * The meta object literal for the '<em><b>Role1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1 = eINSTANCE.getCityObjectGroupMemberType_Role1();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW = eINSTANCE.getCityObjectGroupMemberType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE = eINSTANCE.getCityObjectGroupMemberType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE = eINSTANCE.getCityObjectGroupMemberType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupParentTypeImpl <em>City Object Group Parent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupParentTypeImpl
		 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getCityObjectGroupParentType()
		 * @generated
		 */
		EClass CITY_OBJECT_GROUP_PARENT_TYPE = eINSTANCE.getCityObjectGroupParentType();

		/**
		 * The meta object literal for the '<em><b>City Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__CITY_OBJECT_GROUP = eINSTANCE.getCityObjectGroupParentType_CityObjectGroup();

		/**
		 * The meta object literal for the '<em><b>City Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_OBJECT_GROUP_PARENT_TYPE__CITY_OBJECT = eINSTANCE.getCityObjectGroupParentType_CityObject();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__ACTUATE = eINSTANCE.getCityObjectGroupParentType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__ARCROLE = eINSTANCE.getCityObjectGroupParentType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__HREF = eINSTANCE.getCityObjectGroupParentType_Href();

		/**
		 * The meta object literal for the '<em><b>Remote Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__REMOTE_SCHEMA = eINSTANCE.getCityObjectGroupParentType_RemoteSchema();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__ROLE = eINSTANCE.getCityObjectGroupParentType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__SHOW = eINSTANCE.getCityObjectGroupParentType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__TITLE = eINSTANCE.getCityObjectGroupParentType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_PARENT_TYPE__TYPE = eINSTANCE.getCityObjectGroupParentType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl <em>City Object Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl
		 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getCityObjectGroupType()
		 * @generated
		 */
		EClass CITY_OBJECT_GROUP_TYPE = eINSTANCE.getCityObjectGroupType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_TYPE__CLASS = eINSTANCE.getCityObjectGroupType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_TYPE__FUNCTION = eINSTANCE.getCityObjectGroupType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_TYPE__USAGE = eINSTANCE.getCityObjectGroupType_Usage();

		/**
		 * The meta object literal for the '<em><b>Group Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER = eINSTANCE.getCityObjectGroupType_GroupMember();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_OBJECT_GROUP_TYPE__PARENT = eINSTANCE.getCityObjectGroupType_Parent();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_OBJECT_GROUP_TYPE__GEOMETRY = eINSTANCE.getCityObjectGroupType_Geometry();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Object Group Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP = eINSTANCE.getCityObjectGroupType_GenericApplicationPropertyOfCityObjectGroupGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of City Object Group1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP1 = eINSTANCE.getCityObjectGroupType_GenericApplicationPropertyOfCityObjectGroup1();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.cityobjectgroup.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.cityobjectgroup.impl.DocumentRootImpl
		 * @see net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Generic Application Property Of City Object Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfCityObjectGroup();

		/**
		 * The meta object literal for the '<em><b>City Object Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CITY_OBJECT_GROUP = eINSTANCE.getDocumentRoot_CityObjectGroup();

	}

} //CityobjectgroupPackage
