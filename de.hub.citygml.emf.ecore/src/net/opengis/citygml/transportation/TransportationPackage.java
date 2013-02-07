/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

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
 * @see net.opengis.citygml.transportation.TransportationFactory
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
public interface TransportationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transportation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/transportation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "trans";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransportationPackage eINSTANCE = net.opengis.citygml.transportation.impl.TransportationPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.AbstractTransportationObjectTypeImpl <em>Abstract Transportation Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.AbstractTransportationObjectTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAbstractTransportationObjectType()
	 * @generated
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Transportation Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaPropertyTypeImpl <em>Auxiliary Traffic Area Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaPropertyTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAuxiliaryTrafficAreaPropertyType()
	 * @generated
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Auxiliary Traffic Area Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaTypeImpl <em>Auxiliary Traffic Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__META_DATA_PROPERTY = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__DESCRIPTION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__NAME_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__NAME = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__ID = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__BOUNDED_BY = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__LOCATION_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__LOCATION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__CREATION_DATE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__TERMINATION_DATE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__EXTERNAL_REFERENCE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__GENERALIZES_TO = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__FUNCTION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Surface Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__SURFACE_MATERIAL = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Auxiliary Traffic Area Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Auxiliary Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Auxiliary Traffic Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_TRAFFIC_AREA_TYPE_FEATURE_COUNT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.DocumentRootImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Generic Application Property Of Auxiliary Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA = 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Railway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY = 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Road</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD = 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Square</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE = 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK = 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA = 8;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = 9;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Transportation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORTATION_OBJECT = 11;

	/**
	 * The feature id for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA = 12;

	/**
	 * The feature id for the '<em><b>Railway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RAILWAY = 13;

	/**
	 * The feature id for the '<em><b>Transportation Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSPORTATION_COMPLEX = 14;

	/**
	 * The feature id for the '<em><b>Road</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROAD = 15;

	/**
	 * The feature id for the '<em><b>Square</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SQUARE = 16;

	/**
	 * The feature id for the '<em><b>Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRACK = 17;

	/**
	 * The feature id for the '<em><b>Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRAFFIC_AREA = 18;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTransportationComplexType()
	 * @generated
	 */
	int TRANSPORTATION_COMPLEX_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__META_DATA_PROPERTY = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__DESCRIPTION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__NAME_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__NAME = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__ID = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__BOUNDED_BY = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__LOCATION_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__LOCATION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__CREATION_DATE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__TERMINATION_DATE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__EXTERNAL_REFERENCE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__GENERALIZES_TO = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__FUNCTION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__USAGE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod0 Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.RailwayTypeImpl <em>Railway Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.RailwayTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getRailwayType()
	 * @generated
	 */
	int RAILWAY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__META_DATA_PROPERTY = TRANSPORTATION_COMPLEX_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__DESCRIPTION = TRANSPORTATION_COMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__NAME_GROUP = TRANSPORTATION_COMPLEX_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__NAME = TRANSPORTATION_COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__ID = TRANSPORTATION_COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__BOUNDED_BY = TRANSPORTATION_COMPLEX_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__LOCATION_GROUP = TRANSPORTATION_COMPLEX_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__LOCATION = TRANSPORTATION_COMPLEX_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__CREATION_DATE = TRANSPORTATION_COMPLEX_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__TERMINATION_DATE = TRANSPORTATION_COMPLEX_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__EXTERNAL_REFERENCE = TRANSPORTATION_COMPLEX_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERALIZES_TO = TRANSPORTATION_COMPLEX_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__FUNCTION = TRANSPORTATION_COMPLEX_TYPE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__USAGE = TRANSPORTATION_COMPLEX_TYPE__USAGE;

	/**
	 * The feature id for the '<em><b>Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__AUXILIARY_TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Lod0 Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__LOD0_NETWORK = TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__LOD1_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__LOD2_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__LOD3_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__LOD4_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Railway Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Railway</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Railway Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_TYPE_FEATURE_COUNT = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.RoadTypeImpl <em>Road Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.RoadTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getRoadType()
	 * @generated
	 */
	int ROAD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__META_DATA_PROPERTY = TRANSPORTATION_COMPLEX_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__DESCRIPTION = TRANSPORTATION_COMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__NAME_GROUP = TRANSPORTATION_COMPLEX_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__NAME = TRANSPORTATION_COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__ID = TRANSPORTATION_COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__BOUNDED_BY = TRANSPORTATION_COMPLEX_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__LOCATION_GROUP = TRANSPORTATION_COMPLEX_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__LOCATION = TRANSPORTATION_COMPLEX_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__CREATION_DATE = TRANSPORTATION_COMPLEX_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__TERMINATION_DATE = TRANSPORTATION_COMPLEX_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__EXTERNAL_REFERENCE = TRANSPORTATION_COMPLEX_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERALIZES_TO = TRANSPORTATION_COMPLEX_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__FUNCTION = TRANSPORTATION_COMPLEX_TYPE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__USAGE = TRANSPORTATION_COMPLEX_TYPE__USAGE;

	/**
	 * The feature id for the '<em><b>Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__AUXILIARY_TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Lod0 Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__LOD0_NETWORK = TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__LOD1_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__LOD2_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__LOD3_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__LOD4_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Road Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Road</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Road Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_TYPE_FEATURE_COUNT = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.SquareTypeImpl <em>Square Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.SquareTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getSquareType()
	 * @generated
	 */
	int SQUARE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__META_DATA_PROPERTY = TRANSPORTATION_COMPLEX_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__DESCRIPTION = TRANSPORTATION_COMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__NAME_GROUP = TRANSPORTATION_COMPLEX_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__NAME = TRANSPORTATION_COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__ID = TRANSPORTATION_COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__BOUNDED_BY = TRANSPORTATION_COMPLEX_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__LOCATION_GROUP = TRANSPORTATION_COMPLEX_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__LOCATION = TRANSPORTATION_COMPLEX_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__CREATION_DATE = TRANSPORTATION_COMPLEX_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__TERMINATION_DATE = TRANSPORTATION_COMPLEX_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__EXTERNAL_REFERENCE = TRANSPORTATION_COMPLEX_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERALIZES_TO = TRANSPORTATION_COMPLEX_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__FUNCTION = TRANSPORTATION_COMPLEX_TYPE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__USAGE = TRANSPORTATION_COMPLEX_TYPE__USAGE;

	/**
	 * The feature id for the '<em><b>Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__AUXILIARY_TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Lod0 Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__LOD0_NETWORK = TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__LOD1_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__LOD2_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__LOD3_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__LOD4_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Square Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Square</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Square Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_TYPE_FEATURE_COUNT = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.TrackTypeImpl <em>Track Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.TrackTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrackType()
	 * @generated
	 */
	int TRACK_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__META_DATA_PROPERTY = TRANSPORTATION_COMPLEX_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__DESCRIPTION = TRANSPORTATION_COMPLEX_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__NAME_GROUP = TRANSPORTATION_COMPLEX_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__NAME = TRANSPORTATION_COMPLEX_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__ID = TRANSPORTATION_COMPLEX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__BOUNDED_BY = TRANSPORTATION_COMPLEX_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__LOCATION_GROUP = TRANSPORTATION_COMPLEX_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__LOCATION = TRANSPORTATION_COMPLEX_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__CREATION_DATE = TRANSPORTATION_COMPLEX_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__TERMINATION_DATE = TRANSPORTATION_COMPLEX_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__EXTERNAL_REFERENCE = TRANSPORTATION_COMPLEX_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERALIZES_TO = TRANSPORTATION_COMPLEX_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__FUNCTION = TRANSPORTATION_COMPLEX_TYPE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__USAGE = TRANSPORTATION_COMPLEX_TYPE__USAGE;

	/**
	 * The feature id for the '<em><b>Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__AUXILIARY_TRAFFIC_AREA = TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA;

	/**
	 * The feature id for the '<em><b>Lod0 Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__LOD0_NETWORK = TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__LOD1_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__LOD2_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__LOD3_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__LOD4_MULTI_SURFACE = TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Track Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Track</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Track Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_TYPE_FEATURE_COUNT = TRANSPORTATION_COMPLEX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.TrafficAreaPropertyTypeImpl <em>Traffic Area Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.TrafficAreaPropertyTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaPropertyType()
	 * @generated
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Traffic Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traffic Area Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl <em>Traffic Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaType()
	 * @generated
	 */
	int TRAFFIC_AREA_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__META_DATA_PROPERTY = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__DESCRIPTION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__NAME_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__NAME = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__ID = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__BOUNDED_BY = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__LOCATION_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__LOCATION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__CREATION_DATE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__TERMINATION_DATE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__EXTERNAL_REFERENCE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__GENERALIZES_TO = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__USAGE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__FUNCTION = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Surface Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__SURFACE_MATERIAL = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Traffic Area Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Traffic Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Traffic Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_AREA_TYPE_FEATURE_COUNT = ABSTRACT_TRANSPORTATION_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '<em>Auxiliary Traffic Area Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAuxiliaryTrafficAreaFunctionType()
	 * @generated
	 */
	int AUXILIARY_TRAFFIC_AREA_FUNCTION_TYPE = 11;

	/**
	 * The meta object id for the '<em>Traffic Area Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaFunctionType()
	 * @generated
	 */
	int TRAFFIC_AREA_FUNCTION_TYPE = 12;

	/**
	 * The meta object id for the '<em>Traffic Area Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaUsageType()
	 * @generated
	 */
	int TRAFFIC_AREA_USAGE_TYPE = 13;

	/**
	 * The meta object id for the '<em>Traffic Surface Material Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficSurfaceMaterialType()
	 * @generated
	 */
	int TRAFFIC_SURFACE_MATERIAL_TYPE = 14;

	/**
	 * The meta object id for the '<em>Complex Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTransportationComplexFunctionType()
	 * @generated
	 */
	int TRANSPORTATION_COMPLEX_FUNCTION_TYPE = 15;

	/**
	 * The meta object id for the '<em>Complex Usage Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTransportationComplexUsageType()
	 * @generated
	 */
	int TRANSPORTATION_COMPLEX_USAGE_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.AbstractTransportationObjectType <em>Abstract Transportation Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Transportation Object Type</em>'.
	 * @see net.opengis.citygml.transportation.AbstractTransportationObjectType
	 * @generated
	 */
	EClass getAbstractTransportationObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.AbstractTransportationObjectType#getGenericApplicationPropertyOfTransportationObjectGroup <em>Generic Application Property Of Transportation Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Transportation Object Group</em>'.
	 * @see net.opengis.citygml.transportation.AbstractTransportationObjectType#getGenericApplicationPropertyOfTransportationObjectGroup()
	 * @see #getAbstractTransportationObjectType()
	 * @generated
	 */
	EAttribute getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObjectGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.AbstractTransportationObjectType#getGenericApplicationPropertyOfTransportationObject <em>Generic Application Property Of Transportation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Transportation Object</em>'.
	 * @see net.opengis.citygml.transportation.AbstractTransportationObjectType#getGenericApplicationPropertyOfTransportationObject()
	 * @see #getAbstractTransportationObjectType()
	 * @generated
	 */
	EReference getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObject();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType <em>Auxiliary Traffic Area Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Traffic Area Property Type</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType
	 * @generated
	 */
	EClass getAuxiliaryTrafficAreaPropertyType();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType <em>Auxiliary Traffic Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Traffic Area Type</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType
	 * @generated
	 */
	EClass getAuxiliaryTrafficAreaType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getFunction()
	 * @see #getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	EAttribute getAuxiliaryTrafficAreaType_Function();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getSurfaceMaterial <em>Surface Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Material</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getSurfaceMaterial()
	 * @see #getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	EAttribute getAuxiliaryTrafficAreaType_SurfaceMaterial();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod2MultiSurface()
	 * @see #getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	EReference getAuxiliaryTrafficAreaType_Lod2MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod3MultiSurface()
	 * @see #getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	EReference getAuxiliaryTrafficAreaType_Lod3MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod4MultiSurface()
	 * @see #getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	EReference getAuxiliaryTrafficAreaType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getGenericApplicationPropertyOfAuxiliaryTrafficAreaGroup <em>Generic Application Property Of Auxiliary Traffic Area Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Auxiliary Traffic Area Group</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getGenericApplicationPropertyOfAuxiliaryTrafficAreaGroup()
	 * @see #getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	EAttribute getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficAreaGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getGenericApplicationPropertyOfAuxiliaryTrafficArea <em>Generic Application Property Of Auxiliary Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Auxiliary Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getGenericApplicationPropertyOfAuxiliaryTrafficArea()
	 * @see #getAuxiliaryTrafficAreaType()
	 * @generated
	 */
	EReference getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficArea();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.transportation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.transportation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfAuxiliaryTrafficArea <em>Generic Application Property Of Auxiliary Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Auxiliary Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfAuxiliaryTrafficArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfAuxiliaryTrafficArea();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfRailway <em>Generic Application Property Of Railway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Railway</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfRailway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfRailway();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfRoad <em>Generic Application Property Of Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Road</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfRoad()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfRoad();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfSquare <em>Generic Application Property Of Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Square</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfSquare()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfSquare();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTrack <em>Generic Application Property Of Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Track</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTrack()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTrack();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTrafficArea <em>Generic Application Property Of Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTrafficArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTrafficArea();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTransportationComplex <em>Generic Application Property Of Transportation Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Transportation Complex</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTransportationComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTransportationComplex();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTransportationObject <em>Generic Application Property Of Transportation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Transportation Object</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getGenericApplicationPropertyOfTransportationObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTransportationObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getTransportationObject <em>Transportation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transportation Object</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getTransportationObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransportationObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getAuxiliaryTrafficArea <em>Auxiliary Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auxiliary Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getAuxiliaryTrafficArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AuxiliaryTrafficArea();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getRailway <em>Railway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Railway</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getRailway()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Railway();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getTransportationComplex <em>Transportation Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transportation Complex</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getTransportationComplex()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransportationComplex();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Road</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getRoad()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Road();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Square</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getSquare()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Square();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Track</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getTrack()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Track();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.DocumentRoot#getTrafficArea <em>Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.DocumentRoot#getTrafficArea()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TrafficArea();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.RailwayType <em>Railway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Type</em>'.
	 * @see net.opengis.citygml.transportation.RailwayType
	 * @generated
	 */
	EClass getRailwayType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.RailwayType#getGenericApplicationPropertyOfRailwayGroup <em>Generic Application Property Of Railway Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Railway Group</em>'.
	 * @see net.opengis.citygml.transportation.RailwayType#getGenericApplicationPropertyOfRailwayGroup()
	 * @see #getRailwayType()
	 * @generated
	 */
	EAttribute getRailwayType_GenericApplicationPropertyOfRailwayGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.RailwayType#getGenericApplicationPropertyOfRailway <em>Generic Application Property Of Railway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Railway</em>'.
	 * @see net.opengis.citygml.transportation.RailwayType#getGenericApplicationPropertyOfRailway()
	 * @see #getRailwayType()
	 * @generated
	 */
	EReference getRailwayType_GenericApplicationPropertyOfRailway();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.RoadType <em>Road Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Type</em>'.
	 * @see net.opengis.citygml.transportation.RoadType
	 * @generated
	 */
	EClass getRoadType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.RoadType#getGenericApplicationPropertyOfRoadGroup <em>Generic Application Property Of Road Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Road Group</em>'.
	 * @see net.opengis.citygml.transportation.RoadType#getGenericApplicationPropertyOfRoadGroup()
	 * @see #getRoadType()
	 * @generated
	 */
	EAttribute getRoadType_GenericApplicationPropertyOfRoadGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.RoadType#getGenericApplicationPropertyOfRoad <em>Generic Application Property Of Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Road</em>'.
	 * @see net.opengis.citygml.transportation.RoadType#getGenericApplicationPropertyOfRoad()
	 * @see #getRoadType()
	 * @generated
	 */
	EReference getRoadType_GenericApplicationPropertyOfRoad();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.SquareType <em>Square Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square Type</em>'.
	 * @see net.opengis.citygml.transportation.SquareType
	 * @generated
	 */
	EClass getSquareType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.SquareType#getGenericApplicationPropertyOfSquareGroup <em>Generic Application Property Of Square Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Square Group</em>'.
	 * @see net.opengis.citygml.transportation.SquareType#getGenericApplicationPropertyOfSquareGroup()
	 * @see #getSquareType()
	 * @generated
	 */
	EAttribute getSquareType_GenericApplicationPropertyOfSquareGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.SquareType#getGenericApplicationPropertyOfSquare <em>Generic Application Property Of Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Square</em>'.
	 * @see net.opengis.citygml.transportation.SquareType#getGenericApplicationPropertyOfSquare()
	 * @see #getSquareType()
	 * @generated
	 */
	EReference getSquareType_GenericApplicationPropertyOfSquare();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.TrackType <em>Track Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Type</em>'.
	 * @see net.opengis.citygml.transportation.TrackType
	 * @generated
	 */
	EClass getTrackType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.TrackType#getGenericApplicationPropertyOfTrackGroup <em>Generic Application Property Of Track Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Track Group</em>'.
	 * @see net.opengis.citygml.transportation.TrackType#getGenericApplicationPropertyOfTrackGroup()
	 * @see #getTrackType()
	 * @generated
	 */
	EAttribute getTrackType_GenericApplicationPropertyOfTrackGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.TrackType#getGenericApplicationPropertyOfTrack <em>Generic Application Property Of Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Track</em>'.
	 * @see net.opengis.citygml.transportation.TrackType#getGenericApplicationPropertyOfTrack()
	 * @see #getTrackType()
	 * @generated
	 */
	EReference getTrackType_GenericApplicationPropertyOfTrack();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.TrafficAreaPropertyType <em>Traffic Area Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Area Property Type</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaPropertyType
	 * @generated
	 */
	EClass getTrafficAreaPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TrafficAreaPropertyType#getTrafficArea <em>Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaPropertyType#getTrafficArea()
	 * @see #getTrafficAreaPropertyType()
	 * @generated
	 */
	EReference getTrafficAreaPropertyType_TrafficArea();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.TrafficAreaType <em>Traffic Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traffic Area Type</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType
	 * @generated
	 */
	EClass getTrafficAreaType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.TrafficAreaType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getUsage()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EAttribute getTrafficAreaType_Usage();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.TrafficAreaType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getFunction()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EAttribute getTrafficAreaType_Function();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.transportation.TrafficAreaType#getSurfaceMaterial <em>Surface Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Material</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getSurfaceMaterial()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EAttribute getTrafficAreaType_SurfaceMaterial();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TrafficAreaType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getLod2MultiSurface()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EReference getTrafficAreaType_Lod2MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TrafficAreaType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getLod3MultiSurface()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EReference getTrafficAreaType_Lod3MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TrafficAreaType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getLod4MultiSurface()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EReference getTrafficAreaType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.TrafficAreaType#getGenericApplicationPropertyOfTrafficAreaGroup <em>Generic Application Property Of Traffic Area Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Traffic Area Group</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getGenericApplicationPropertyOfTrafficAreaGroup()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EAttribute getTrafficAreaType_GenericApplicationPropertyOfTrafficAreaGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.TrafficAreaType#getGenericApplicationPropertyOfTrafficArea <em>Generic Application Property Of Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.TrafficAreaType#getGenericApplicationPropertyOfTrafficArea()
	 * @see #getTrafficAreaType()
	 * @generated
	 */
	EReference getTrafficAreaType_GenericApplicationPropertyOfTrafficArea();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.transportation.TransportationComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType
	 * @generated
	 */
	EClass getTransportationComplexType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.TransportationComplexType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getFunction()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EAttribute getTransportationComplexType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.TransportationComplexType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Usage</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getUsage()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EAttribute getTransportationComplexType_Usage();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.TransportationComplexType#getTrafficArea <em>Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getTrafficArea()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_TrafficArea();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.TransportationComplexType#getAuxiliaryTrafficArea <em>Auxiliary Traffic Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliary Traffic Area</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getAuxiliaryTrafficArea()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_AuxiliaryTrafficArea();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod0Network <em>Lod0 Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lod0 Network</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getLod0Network()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_Lod0Network();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getLod1MultiSurface()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_Lod1MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getLod2MultiSurface()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_Lod2MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getLod3MultiSurface()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_Lod3MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getLod4MultiSurface()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.transportation.TransportationComplexType#getGenericApplicationPropertyOfTransportationComplexGroup <em>Generic Application Property Of Transportation Complex Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Transportation Complex Group</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getGenericApplicationPropertyOfTransportationComplexGroup()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EAttribute getTransportationComplexType_GenericApplicationPropertyOfTransportationComplexGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.transportation.TransportationComplexType#getGenericApplicationPropertyOfTransportationComplex <em>Generic Application Property Of Transportation Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Transportation Complex</em>'.
	 * @see net.opengis.citygml.transportation.TransportationComplexType#getGenericApplicationPropertyOfTransportationComplex()
	 * @see #getTransportationComplexType()
	 * @generated
	 */
	EReference getTransportationComplexType_GenericApplicationPropertyOfTransportationComplex();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Auxiliary Traffic Area Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Auxiliary Traffic Area Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AuxiliaryTrafficAreaFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getAuxiliaryTrafficAreaFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Traffic Area Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Traffic Area Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TrafficAreaFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTrafficAreaFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Traffic Area Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Traffic Area Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TrafficAreaUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTrafficAreaUsageType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Traffic Surface Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Traffic Surface Material Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TrafficSurfaceMaterialType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTrafficSurfaceMaterialType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Complex Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TransportationComplexFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTransportationComplexFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Complex Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Complex Usage Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TransportationComplexUsageType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTransportationComplexUsageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransportationFactory getTransportationFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.AbstractTransportationObjectTypeImpl <em>Abstract Transportation Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.AbstractTransportationObjectTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAbstractTransportationObjectType()
		 * @generated
		 */
		EClass ABSTRACT_TRANSPORTATION_OBJECT_TYPE = eINSTANCE.getAbstractTransportationObjectType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Transportation Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT_GROUP = eINSTANCE.getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObjectGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TRANSPORTATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = eINSTANCE.getAbstractTransportationObjectType_GenericApplicationPropertyOfTransportationObject();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaPropertyTypeImpl <em>Auxiliary Traffic Area Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaPropertyTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAuxiliaryTrafficAreaPropertyType()
		 * @generated
		 */
		EClass AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE = eINSTANCE.getAuxiliaryTrafficAreaPropertyType();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaTypeImpl <em>Auxiliary Traffic Area Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.AuxiliaryTrafficAreaTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAuxiliaryTrafficAreaType()
		 * @generated
		 */
		EClass AUXILIARY_TRAFFIC_AREA_TYPE = eINSTANCE.getAuxiliaryTrafficAreaType();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_TRAFFIC_AREA_TYPE__FUNCTION = eINSTANCE.getAuxiliaryTrafficAreaType_Function();

		/**
		 * The meta object literal for the '<em><b>Surface Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_TRAFFIC_AREA_TYPE__SURFACE_MATERIAL = eINSTANCE.getAuxiliaryTrafficAreaType_SurfaceMaterial();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE = eINSTANCE.getAuxiliaryTrafficAreaType_Lod2MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE = eINSTANCE.getAuxiliaryTrafficAreaType_Lod3MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getAuxiliaryTrafficAreaType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Auxiliary Traffic Area Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA_GROUP = eINSTANCE.getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficAreaGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Auxiliary Traffic Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUXILIARY_TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA = eINSTANCE.getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficArea();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.DocumentRootImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Generic Application Property Of Auxiliary Traffic Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfAuxiliaryTrafficArea();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Railway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfRailway();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Road</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfRoad();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Square</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfSquare();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTrack();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Traffic Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTrafficArea();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTransportationComplex();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Transportation Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTransportationObject();

		/**
		 * The meta object literal for the '<em><b>Transportation Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSPORTATION_OBJECT = eINSTANCE.getDocumentRoot_TransportationObject();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA = eINSTANCE.getDocumentRoot_AuxiliaryTrafficArea();

		/**
		 * The meta object literal for the '<em><b>Railway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RAILWAY = eINSTANCE.getDocumentRoot_Railway();

		/**
		 * The meta object literal for the '<em><b>Transportation Complex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSPORTATION_COMPLEX = eINSTANCE.getDocumentRoot_TransportationComplex();

		/**
		 * The meta object literal for the '<em><b>Road</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROAD = eINSTANCE.getDocumentRoot_Road();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SQUARE = eINSTANCE.getDocumentRoot_Square();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRACK = eINSTANCE.getDocumentRoot_Track();

		/**
		 * The meta object literal for the '<em><b>Traffic Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRAFFIC_AREA = eINSTANCE.getDocumentRoot_TrafficArea();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.RailwayTypeImpl <em>Railway Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.RailwayTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getRailwayType()
		 * @generated
		 */
		EClass RAILWAY_TYPE = eINSTANCE.getRailwayType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Railway Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY_GROUP = eINSTANCE.getRailwayType_GenericApplicationPropertyOfRailwayGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Railway</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY = eINSTANCE.getRailwayType_GenericApplicationPropertyOfRailway();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.RoadTypeImpl <em>Road Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.RoadTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getRoadType()
		 * @generated
		 */
		EClass ROAD_TYPE = eINSTANCE.getRoadType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Road Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD_GROUP = eINSTANCE.getRoadType_GenericApplicationPropertyOfRoadGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Road</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROAD = eINSTANCE.getRoadType_GenericApplicationPropertyOfRoad();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.SquareTypeImpl <em>Square Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.SquareTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getSquareType()
		 * @generated
		 */
		EClass SQUARE_TYPE = eINSTANCE.getSquareType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Square Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP = eINSTANCE.getSquareType_GenericApplicationPropertyOfSquareGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Square</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE = eINSTANCE.getSquareType_GenericApplicationPropertyOfSquare();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.TrackTypeImpl <em>Track Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.TrackTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrackType()
		 * @generated
		 */
		EClass TRACK_TYPE = eINSTANCE.getTrackType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Track Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK_GROUP = eINSTANCE.getTrackType_GenericApplicationPropertyOfTrackGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Track</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRACK = eINSTANCE.getTrackType_GenericApplicationPropertyOfTrack();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.TrafficAreaPropertyTypeImpl <em>Traffic Area Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.TrafficAreaPropertyTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaPropertyType()
		 * @generated
		 */
		EClass TRAFFIC_AREA_PROPERTY_TYPE = eINSTANCE.getTrafficAreaPropertyType();

		/**
		 * The meta object literal for the '<em><b>Traffic Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_AREA_PROPERTY_TYPE__TRAFFIC_AREA = eINSTANCE.getTrafficAreaPropertyType_TrafficArea();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl <em>Traffic Area Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaType()
		 * @generated
		 */
		EClass TRAFFIC_AREA_TYPE = eINSTANCE.getTrafficAreaType();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_AREA_TYPE__USAGE = eINSTANCE.getTrafficAreaType_Usage();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_AREA_TYPE__FUNCTION = eINSTANCE.getTrafficAreaType_Function();

		/**
		 * The meta object literal for the '<em><b>Surface Material</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_AREA_TYPE__SURFACE_MATERIAL = eINSTANCE.getTrafficAreaType_SurfaceMaterial();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE = eINSTANCE.getTrafficAreaType_Lod2MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE = eINSTANCE.getTrafficAreaType_Lod3MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getTrafficAreaType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Traffic Area Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP = eINSTANCE.getTrafficAreaType_GenericApplicationPropertyOfTrafficAreaGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Traffic Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA = eINSTANCE.getTrafficAreaType_GenericApplicationPropertyOfTrafficArea();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTransportationComplexType()
		 * @generated
		 */
		EClass TRANSPORTATION_COMPLEX_TYPE = eINSTANCE.getTransportationComplexType();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_COMPLEX_TYPE__FUNCTION = eINSTANCE.getTransportationComplexType_Function();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_COMPLEX_TYPE__USAGE = eINSTANCE.getTransportationComplexType_Usage();

		/**
		 * The meta object literal for the '<em><b>Traffic Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA = eINSTANCE.getTransportationComplexType_TrafficArea();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Traffic Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA = eINSTANCE.getTransportationComplexType_AuxiliaryTrafficArea();

		/**
		 * The meta object literal for the '<em><b>Lod0 Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK = eINSTANCE.getTransportationComplexType_Lod0Network();

		/**
		 * The meta object literal for the '<em><b>Lod1 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE = eINSTANCE.getTransportationComplexType_Lod1MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE = eINSTANCE.getTransportationComplexType_Lod2MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE = eINSTANCE.getTransportationComplexType_Lod3MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getTransportationComplexType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Transportation Complex Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP = eINSTANCE.getTransportationComplexType_GenericApplicationPropertyOfTransportationComplexGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX = eINSTANCE.getTransportationComplexType_GenericApplicationPropertyOfTransportationComplex();

		/**
		 * The meta object literal for the '<em>Auxiliary Traffic Area Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getAuxiliaryTrafficAreaFunctionType()
		 * @generated
		 */
		EDataType AUXILIARY_TRAFFIC_AREA_FUNCTION_TYPE = eINSTANCE.getAuxiliaryTrafficAreaFunctionType();

		/**
		 * The meta object literal for the '<em>Traffic Area Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaFunctionType()
		 * @generated
		 */
		EDataType TRAFFIC_AREA_FUNCTION_TYPE = eINSTANCE.getTrafficAreaFunctionType();

		/**
		 * The meta object literal for the '<em>Traffic Area Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficAreaUsageType()
		 * @generated
		 */
		EDataType TRAFFIC_AREA_USAGE_TYPE = eINSTANCE.getTrafficAreaUsageType();

		/**
		 * The meta object literal for the '<em>Traffic Surface Material Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTrafficSurfaceMaterialType()
		 * @generated
		 */
		EDataType TRAFFIC_SURFACE_MATERIAL_TYPE = eINSTANCE.getTrafficSurfaceMaterialType();

		/**
		 * The meta object literal for the '<em>Complex Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTransportationComplexFunctionType()
		 * @generated
		 */
		EDataType TRANSPORTATION_COMPLEX_FUNCTION_TYPE = eINSTANCE.getTransportationComplexFunctionType();

		/**
		 * The meta object literal for the '<em>Complex Usage Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.transportation.impl.TransportationPackageImpl#getTransportationComplexUsageType()
		 * @generated
		 */
		EDataType TRANSPORTATION_COMPLEX_USAGE_TYPE = eINSTANCE.getTransportationComplexUsageType();

	}

} //TransportationPackage
