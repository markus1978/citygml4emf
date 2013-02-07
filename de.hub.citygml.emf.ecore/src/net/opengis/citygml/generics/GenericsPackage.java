/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics;

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
 * @see net.opengis.citygml.generics.GenericsFactory
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
public interface GenericsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/generics/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericsPackage eINSTANCE = net.opengis.citygml.generics.impl.GenericsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.AbstractGenericAttributeTypeImpl <em>Abstract Generic Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.AbstractGenericAttributeTypeImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getAbstractGenericAttributeType()
	 * @generated
	 */
	int ABSTRACT_GENERIC_ATTRIBUTE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GENERIC_ATTRIBUTE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Generic Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.DateAttributeTypeImpl <em>Date Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.DateAttributeTypeImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getDateAttributeType()
	 * @generated
	 */
	int DATE_ATTRIBUTE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_TYPE__NAME = ABSTRACT_GENERIC_ATTRIBUTE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_TYPE__VALUE = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_ATTRIBUTE_TYPE_FEATURE_COUNT = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.DocumentRootImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Generic Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Date Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Double Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOUBLE_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Generic City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_CITY_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Int Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INT_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>String Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Uri Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URI_ATTRIBUTE = 9;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.DoubleAttributeTypeImpl <em>Double Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.DoubleAttributeTypeImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getDoubleAttributeType()
	 * @generated
	 */
	int DOUBLE_ATTRIBUTE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_TYPE__NAME = ABSTRACT_GENERIC_ATTRIBUTE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_TYPE__VALUE = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_TYPE_FEATURE_COUNT = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl <em>Generic City Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getGenericCityObjectType()
	 * @generated
	 */
	int GENERIC_CITY_OBJECT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__CLASS = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__FUNCTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__USAGE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod0 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod1 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lod2 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lod3 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lod4 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lod0 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lod1 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lod2 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lod3 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Lod4 Terrain Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Lod0 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Lod1 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lod2 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Lod3 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Lod4 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Generic City Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CITY_OBJECT_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.IntAttributeTypeImpl <em>Int Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.IntAttributeTypeImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getIntAttributeType()
	 * @generated
	 */
	int INT_ATTRIBUTE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ATTRIBUTE_TYPE__NAME = ABSTRACT_GENERIC_ATTRIBUTE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ATTRIBUTE_TYPE__VALUE = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ATTRIBUTE_TYPE_FEATURE_COUNT = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.StringAttributeTypeImpl <em>String Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.StringAttributeTypeImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getStringAttributeType()
	 * @generated
	 */
	int STRING_ATTRIBUTE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_TYPE__NAME = ABSTRACT_GENERIC_ATTRIBUTE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_TYPE__VALUE = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_TYPE_FEATURE_COUNT = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.generics.impl.UriAttributeTypeImpl <em>Uri Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.generics.impl.UriAttributeTypeImpl
	 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getUriAttributeType()
	 * @generated
	 */
	int URI_ATTRIBUTE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_ATTRIBUTE_TYPE__NAME = ABSTRACT_GENERIC_ATTRIBUTE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_ATTRIBUTE_TYPE__VALUE = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uri Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_ATTRIBUTE_TYPE_FEATURE_COUNT = ABSTRACT_GENERIC_ATTRIBUTE_TYPE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.AbstractGenericAttributeType <em>Abstract Generic Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Generic Attribute Type</em>'.
	 * @see net.opengis.citygml.generics.AbstractGenericAttributeType
	 * @generated
	 */
	EClass getAbstractGenericAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.generics.AbstractGenericAttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.citygml.generics.AbstractGenericAttributeType#getName()
	 * @see #getAbstractGenericAttributeType()
	 * @generated
	 */
	EAttribute getAbstractGenericAttributeType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.DateAttributeType <em>Date Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Attribute Type</em>'.
	 * @see net.opengis.citygml.generics.DateAttributeType
	 * @generated
	 */
	EClass getDateAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.generics.DateAttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.citygml.generics.DateAttributeType#getValue()
	 * @see #getDateAttributeType()
	 * @generated
	 */
	EAttribute getDateAttributeType_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.generics.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.generics.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.generics.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.DocumentRoot#getGenericAttribute <em>Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Attribute</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getGenericAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.DocumentRoot#getDateAttribute <em>Date Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Attribute</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getDateAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DateAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.DocumentRoot#getDoubleAttribute <em>Double Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double Attribute</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getDoubleAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DoubleAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.DocumentRoot#getGenericCityObject <em>Generic City Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic City Object</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getGenericCityObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericCityObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.DocumentRoot#getIntAttribute <em>Int Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int Attribute</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getIntAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.DocumentRoot#getStringAttribute <em>String Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Attribute</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getStringAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.DocumentRoot#getUriAttribute <em>Uri Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uri Attribute</em>'.
	 * @see net.opengis.citygml.generics.DocumentRoot#getUriAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UriAttribute();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.DoubleAttributeType <em>Double Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Attribute Type</em>'.
	 * @see net.opengis.citygml.generics.DoubleAttributeType
	 * @generated
	 */
	EClass getDoubleAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.generics.DoubleAttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.citygml.generics.DoubleAttributeType#getValue()
	 * @see #getDoubleAttributeType()
	 * @generated
	 */
	EAttribute getDoubleAttributeType_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.GenericCityObjectType <em>Generic City Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic City Object Type</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType
	 * @generated
	 */
	EClass getGenericCityObjectType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.generics.GenericCityObjectType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getClass_()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EAttribute getGenericCityObjectType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.generics.GenericCityObjectType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getFunction()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EAttribute getGenericCityObjectType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.generics.GenericCityObjectType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getUsage()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EAttribute getGenericCityObjectType_Usage();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0Geometry <em>Lod0 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod0 Geometry</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod0Geometry()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod0Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1Geometry <em>Lod1 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Geometry</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod1Geometry()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod1Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2Geometry <em>Lod2 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Geometry</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod2Geometry()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod2Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3Geometry <em>Lod3 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Geometry</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod3Geometry()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod3Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4Geometry <em>Lod4 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Geometry</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod4Geometry()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod4Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0TerrainIntersection <em>Lod0 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod0 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod0TerrainIntersection()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod0TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod1TerrainIntersection()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod1TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod2TerrainIntersection()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod2TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod3TerrainIntersection()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod3TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Terrain Intersection</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod4TerrainIntersection()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod4TerrainIntersection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod0ImplicitRepresentation <em>Lod0 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod0 Implicit Representation</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod0ImplicitRepresentation()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod0ImplicitRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Implicit Representation</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod1ImplicitRepresentation()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod1ImplicitRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Implicit Representation</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod2ImplicitRepresentation()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod2ImplicitRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Implicit Representation</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod3ImplicitRepresentation()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod3ImplicitRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.generics.GenericCityObjectType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Implicit Representation</em>'.
	 * @see net.opengis.citygml.generics.GenericCityObjectType#getLod4ImplicitRepresentation()
	 * @see #getGenericCityObjectType()
	 * @generated
	 */
	EReference getGenericCityObjectType_Lod4ImplicitRepresentation();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.IntAttributeType <em>Int Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Attribute Type</em>'.
	 * @see net.opengis.citygml.generics.IntAttributeType
	 * @generated
	 */
	EClass getIntAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.generics.IntAttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.citygml.generics.IntAttributeType#getValue()
	 * @see #getIntAttributeType()
	 * @generated
	 */
	EAttribute getIntAttributeType_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.StringAttributeType <em>String Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Attribute Type</em>'.
	 * @see net.opengis.citygml.generics.StringAttributeType
	 * @generated
	 */
	EClass getStringAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.generics.StringAttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.citygml.generics.StringAttributeType#getValue()
	 * @see #getStringAttributeType()
	 * @generated
	 */
	EAttribute getStringAttributeType_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.generics.UriAttributeType <em>Uri Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri Attribute Type</em>'.
	 * @see net.opengis.citygml.generics.UriAttributeType
	 * @generated
	 */
	EClass getUriAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.generics.UriAttributeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.citygml.generics.UriAttributeType#getValue()
	 * @see #getUriAttributeType()
	 * @generated
	 */
	EAttribute getUriAttributeType_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericsFactory getGenericsFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.AbstractGenericAttributeTypeImpl <em>Abstract Generic Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.AbstractGenericAttributeTypeImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getAbstractGenericAttributeType()
		 * @generated
		 */
		EClass ABSTRACT_GENERIC_ATTRIBUTE_TYPE = eINSTANCE.getAbstractGenericAttributeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GENERIC_ATTRIBUTE_TYPE__NAME = eINSTANCE.getAbstractGenericAttributeType_Name();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.DateAttributeTypeImpl <em>Date Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.DateAttributeTypeImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getDateAttributeType()
		 * @generated
		 */
		EClass DATE_ATTRIBUTE_TYPE = eINSTANCE.getDateAttributeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_ATTRIBUTE_TYPE__VALUE = eINSTANCE.getDateAttributeType_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.DocumentRootImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Generic Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_ATTRIBUTE = eINSTANCE.getDocumentRoot_GenericAttribute();

		/**
		 * The meta object literal for the '<em><b>Date Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DATE_ATTRIBUTE = eINSTANCE.getDocumentRoot_DateAttribute();

		/**
		 * The meta object literal for the '<em><b>Double Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOUBLE_ATTRIBUTE = eINSTANCE.getDocumentRoot_DoubleAttribute();

		/**
		 * The meta object literal for the '<em><b>Generic City Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_CITY_OBJECT = eINSTANCE.getDocumentRoot_GenericCityObject();

		/**
		 * The meta object literal for the '<em><b>Int Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INT_ATTRIBUTE = eINSTANCE.getDocumentRoot_IntAttribute();

		/**
		 * The meta object literal for the '<em><b>String Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRING_ATTRIBUTE = eINSTANCE.getDocumentRoot_StringAttribute();

		/**
		 * The meta object literal for the '<em><b>Uri Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__URI_ATTRIBUTE = eINSTANCE.getDocumentRoot_UriAttribute();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.DoubleAttributeTypeImpl <em>Double Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.DoubleAttributeTypeImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getDoubleAttributeType()
		 * @generated
		 */
		EClass DOUBLE_ATTRIBUTE_TYPE = eINSTANCE.getDoubleAttributeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_ATTRIBUTE_TYPE__VALUE = eINSTANCE.getDoubleAttributeType_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl <em>Generic City Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getGenericCityObjectType()
		 * @generated
		 */
		EClass GENERIC_CITY_OBJECT_TYPE = eINSTANCE.getGenericCityObjectType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CITY_OBJECT_TYPE__CLASS = eINSTANCE.getGenericCityObjectType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CITY_OBJECT_TYPE__FUNCTION = eINSTANCE.getGenericCityObjectType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_CITY_OBJECT_TYPE__USAGE = eINSTANCE.getGenericCityObjectType_Usage();

		/**
		 * The meta object literal for the '<em><b>Lod0 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY = eINSTANCE.getGenericCityObjectType_Lod0Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod1 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY = eINSTANCE.getGenericCityObjectType_Lod1Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod2 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY = eINSTANCE.getGenericCityObjectType_Lod2Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod3 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY = eINSTANCE.getGenericCityObjectType_Lod3Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod4 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY = eINSTANCE.getGenericCityObjectType_Lod4Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod0 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION = eINSTANCE.getGenericCityObjectType_Lod0TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Lod1 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION = eINSTANCE.getGenericCityObjectType_Lod1TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Lod2 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION = eINSTANCE.getGenericCityObjectType_Lod2TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Lod3 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION = eINSTANCE.getGenericCityObjectType_Lod3TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Lod4 Terrain Intersection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION = eINSTANCE.getGenericCityObjectType_Lod4TerrainIntersection();

		/**
		 * The meta object literal for the '<em><b>Lod0 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION = eINSTANCE.getGenericCityObjectType_Lod0ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Lod1 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION = eINSTANCE.getGenericCityObjectType_Lod1ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Lod2 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION = eINSTANCE.getGenericCityObjectType_Lod2ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Lod3 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION = eINSTANCE.getGenericCityObjectType_Lod3ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Lod4 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION = eINSTANCE.getGenericCityObjectType_Lod4ImplicitRepresentation();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.IntAttributeTypeImpl <em>Int Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.IntAttributeTypeImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getIntAttributeType()
		 * @generated
		 */
		EClass INT_ATTRIBUTE_TYPE = eINSTANCE.getIntAttributeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_ATTRIBUTE_TYPE__VALUE = eINSTANCE.getIntAttributeType_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.StringAttributeTypeImpl <em>String Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.StringAttributeTypeImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getStringAttributeType()
		 * @generated
		 */
		EClass STRING_ATTRIBUTE_TYPE = eINSTANCE.getStringAttributeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ATTRIBUTE_TYPE__VALUE = eINSTANCE.getStringAttributeType_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.generics.impl.UriAttributeTypeImpl <em>Uri Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.generics.impl.UriAttributeTypeImpl
		 * @see net.opengis.citygml.generics.impl.GenericsPackageImpl#getUriAttributeType()
		 * @generated
		 */
		EClass URI_ATTRIBUTE_TYPE = eINSTANCE.getUriAttributeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI_ATTRIBUTE_TYPE__VALUE = eINSTANCE.getUriAttributeType_Value();

	}

} //GenericsPackage
