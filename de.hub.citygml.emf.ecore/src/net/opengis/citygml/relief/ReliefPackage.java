/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.gml.GmlPackage;

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
 * @see net.opengis.citygml.relief.ReliefFactory
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
public interface ReliefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relief";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/relief/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReliefPackage eINSTANCE = net.opengis.citygml.relief.impl.ReliefPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl <em>Abstract Relief Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getAbstractReliefComponentType()
	 * @generated
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__LOD = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Relief Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl <em>Breakline Relief Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getBreaklineReliefType()
	 * @generated
	 */
	int BREAKLINE_RELIEF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__META_DATA_PROPERTY = ABSTRACT_RELIEF_COMPONENT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__DESCRIPTION = ABSTRACT_RELIEF_COMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__NAME_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__NAME = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__ID = ABSTRACT_RELIEF_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__BOUNDED_BY = ABSTRACT_RELIEF_COMPONENT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__LOCATION_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__LOCATION = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__CREATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__TERMINATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__EXTERNAL_REFERENCE = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__GENERALIZES_TO = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__LOD = ABSTRACT_RELIEF_COMPONENT_TYPE__LOD;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__EXTENT = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT;

	/**
	 * The feature id for the '<em><b>Ridge Or Valley Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Breaklines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__BREAKLINES = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Breakline Relief Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Breakline Relief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Breakline Relief Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKLINE_RELIEF_TYPE_FEATURE_COUNT = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.DocumentRootImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Generic Application Property Of Breakline Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF = 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Mass Point Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF = 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Raster Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF = 5;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tin Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF = 8;

	/**
	 * The feature id for the '<em><b>Relief Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELIEF_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Breakline Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BREAKLINE_RELIEF = 10;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ELEVATION = 11;

	/**
	 * The feature id for the '<em><b>Mass Point Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASS_POINT_RELIEF = 12;

	/**
	 * The feature id for the '<em><b>Raster Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RASTER_RELIEF = 13;

	/**
	 * The feature id for the '<em><b>Relief Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELIEF_FEATURE = 14;

	/**
	 * The feature id for the '<em><b>TIN Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIN_RELIEF = 15;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.GridPropertyTypeImpl <em>Grid Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.GridPropertyTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getGridPropertyType()
	 * @generated
	 */
	int GRID_PROPERTY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Rectified Grid Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grid Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.MassPointReliefTypeImpl <em>Mass Point Relief Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.MassPointReliefTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getMassPointReliefType()
	 * @generated
	 */
	int MASS_POINT_RELIEF_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__META_DATA_PROPERTY = ABSTRACT_RELIEF_COMPONENT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__DESCRIPTION = ABSTRACT_RELIEF_COMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__NAME_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__NAME = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__ID = ABSTRACT_RELIEF_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__BOUNDED_BY = ABSTRACT_RELIEF_COMPONENT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__LOCATION_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__LOCATION = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__CREATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__TERMINATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__EXTERNAL_REFERENCE = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__GENERALIZES_TO = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__LOD = ABSTRACT_RELIEF_COMPONENT_TYPE__LOD;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__EXTENT = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT;

	/**
	 * The feature id for the '<em><b>Relief Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__RELIEF_POINTS = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Mass Point Relief Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Mass Point Relief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mass Point Relief Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_POINT_RELIEF_TYPE_FEATURE_COUNT = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.RasterReliefTypeImpl <em>Raster Relief Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.RasterReliefTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getRasterReliefType()
	 * @generated
	 */
	int RASTER_RELIEF_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__META_DATA_PROPERTY = ABSTRACT_RELIEF_COMPONENT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__DESCRIPTION = ABSTRACT_RELIEF_COMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__NAME_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__NAME = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__ID = ABSTRACT_RELIEF_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__BOUNDED_BY = ABSTRACT_RELIEF_COMPONENT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__LOCATION_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__LOCATION = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__CREATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__TERMINATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__EXTERNAL_REFERENCE = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GENERALIZES_TO = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__LOD = ABSTRACT_RELIEF_COMPONENT_TYPE__LOD;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__EXTENT = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GRID = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Raster Relief Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Raster Relief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Raster Relief Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_RELIEF_TYPE_FEATURE_COUNT = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.ReliefComponentPropertyTypeImpl <em>Component Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.ReliefComponentPropertyTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getReliefComponentPropertyType()
	 * @generated
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Component Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_COMPONENT_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl <em>Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getReliefFeatureType()
	 * @generated
	 */
	int RELIEF_FEATURE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__LOD = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relief Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__RELIEF_COMPONENT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIEF_FEATURE_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.TinPropertyTypeImpl <em>Tin Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.TinPropertyTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getTinPropertyType()
	 * @generated
	 */
	int TIN_PROPERTY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__OBJECT_GROUP = GmlPackage.ASSOCIATION_TYPE__OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__OBJECT = GmlPackage.ASSOCIATION_TYPE__OBJECT;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__ACTUATE = GmlPackage.ASSOCIATION_TYPE__ACTUATE;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__ARCROLE = GmlPackage.ASSOCIATION_TYPE__ARCROLE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__HREF = GmlPackage.ASSOCIATION_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__REMOTE_SCHEMA = GmlPackage.ASSOCIATION_TYPE__REMOTE_SCHEMA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__ROLE = GmlPackage.ASSOCIATION_TYPE__ROLE;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__SHOW = GmlPackage.ASSOCIATION_TYPE__SHOW;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__TITLE = GmlPackage.ASSOCIATION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE__TYPE = GmlPackage.ASSOCIATION_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>Tin Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_PROPERTY_TYPE_FEATURE_COUNT = GmlPackage.ASSOCIATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.relief.impl.TINReliefTypeImpl <em>TIN Relief Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.relief.impl.TINReliefTypeImpl
	 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getTINReliefType()
	 * @generated
	 */
	int TIN_RELIEF_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__META_DATA_PROPERTY = ABSTRACT_RELIEF_COMPONENT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__DESCRIPTION = ABSTRACT_RELIEF_COMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__NAME_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__NAME = ABSTRACT_RELIEF_COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__ID = ABSTRACT_RELIEF_COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__BOUNDED_BY = ABSTRACT_RELIEF_COMPONENT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__LOCATION_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__LOCATION = ABSTRACT_RELIEF_COMPONENT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__CREATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__TERMINATION_DATE = ABSTRACT_RELIEF_COMPONENT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__EXTERNAL_REFERENCE = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__GENERALIZES_TO = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__LOD = ABSTRACT_RELIEF_COMPONENT_TYPE__LOD;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__EXTENT = ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT;

	/**
	 * The feature id for the '<em><b>Tin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__TIN = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tin Relief Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Tin Relief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TIN Relief Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIN_RELIEF_TYPE_FEATURE_COUNT = ABSTRACT_RELIEF_COMPONENT_TYPE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.AbstractReliefComponentType <em>Abstract Relief Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Relief Component Type</em>'.
	 * @see net.opengis.citygml.relief.AbstractReliefComponentType
	 * @generated
	 */
	EClass getAbstractReliefComponentType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.relief.AbstractReliefComponentType#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lod</em>'.
	 * @see net.opengis.citygml.relief.AbstractReliefComponentType#getLod()
	 * @see #getAbstractReliefComponentType()
	 * @generated
	 */
	EAttribute getAbstractReliefComponentType_Lod();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.AbstractReliefComponentType#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extent</em>'.
	 * @see net.opengis.citygml.relief.AbstractReliefComponentType#getExtent()
	 * @see #getAbstractReliefComponentType()
	 * @generated
	 */
	EReference getAbstractReliefComponentType_Extent();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.relief.AbstractReliefComponentType#getGenericApplicationPropertyOfReliefComponentGroup <em>Generic Application Property Of Relief Component Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Relief Component Group</em>'.
	 * @see net.opengis.citygml.relief.AbstractReliefComponentType#getGenericApplicationPropertyOfReliefComponentGroup()
	 * @see #getAbstractReliefComponentType()
	 * @generated
	 */
	EAttribute getAbstractReliefComponentType_GenericApplicationPropertyOfReliefComponentGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.relief.AbstractReliefComponentType#getGenericApplicationPropertyOfReliefComponent <em>Generic Application Property Of Relief Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Relief Component</em>'.
	 * @see net.opengis.citygml.relief.AbstractReliefComponentType#getGenericApplicationPropertyOfReliefComponent()
	 * @see #getAbstractReliefComponentType()
	 * @generated
	 */
	EReference getAbstractReliefComponentType_GenericApplicationPropertyOfReliefComponent();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.BreaklineReliefType <em>Breakline Relief Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breakline Relief Type</em>'.
	 * @see net.opengis.citygml.relief.BreaklineReliefType
	 * @generated
	 */
	EClass getBreaklineReliefType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.BreaklineReliefType#getRidgeOrValleyLines <em>Ridge Or Valley Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ridge Or Valley Lines</em>'.
	 * @see net.opengis.citygml.relief.BreaklineReliefType#getRidgeOrValleyLines()
	 * @see #getBreaklineReliefType()
	 * @generated
	 */
	EReference getBreaklineReliefType_RidgeOrValleyLines();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.BreaklineReliefType#getBreaklines <em>Breaklines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Breaklines</em>'.
	 * @see net.opengis.citygml.relief.BreaklineReliefType#getBreaklines()
	 * @see #getBreaklineReliefType()
	 * @generated
	 */
	EReference getBreaklineReliefType_Breaklines();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.relief.BreaklineReliefType#getGenericApplicationPropertyOfBreaklineReliefGroup <em>Generic Application Property Of Breakline Relief Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Breakline Relief Group</em>'.
	 * @see net.opengis.citygml.relief.BreaklineReliefType#getGenericApplicationPropertyOfBreaklineReliefGroup()
	 * @see #getBreaklineReliefType()
	 * @generated
	 */
	EAttribute getBreaklineReliefType_GenericApplicationPropertyOfBreaklineReliefGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.relief.BreaklineReliefType#getGenericApplicationPropertyOfBreaklineRelief <em>Generic Application Property Of Breakline Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Breakline Relief</em>'.
	 * @see net.opengis.citygml.relief.BreaklineReliefType#getGenericApplicationPropertyOfBreaklineRelief()
	 * @see #getBreaklineReliefType()
	 * @generated
	 */
	EReference getBreaklineReliefType_GenericApplicationPropertyOfBreaklineRelief();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.relief.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.relief.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.relief.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfBreaklineRelief <em>Generic Application Property Of Breakline Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Breakline Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfBreaklineRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfBreaklineRelief();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfMassPointRelief <em>Generic Application Property Of Mass Point Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Mass Point Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfMassPointRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfMassPointRelief();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfRasterRelief <em>Generic Application Property Of Raster Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Raster Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfRasterRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfRasterRelief();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfReliefComponent <em>Generic Application Property Of Relief Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Relief Component</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfReliefComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfReliefComponent();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfReliefFeature <em>Generic Application Property Of Relief Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Relief Feature</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfReliefFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfReliefFeature();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfTinRelief <em>Generic Application Property Of Tin Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Tin Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfTinRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfTinRelief();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getReliefComponent <em>Relief Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relief Component</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getReliefComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReliefComponent();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getBreaklineRelief <em>Breakline Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Breakline Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getBreaklineRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BreaklineRelief();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elevation</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getElevation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Elevation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getMassPointRelief <em>Mass Point Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mass Point Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getMassPointRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MassPointRelief();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getRasterRelief <em>Raster Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raster Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getRasterRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RasterRelief();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getReliefFeature <em>Relief Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relief Feature</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getReliefFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReliefFeature();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.DocumentRoot#getTINRelief <em>TIN Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TIN Relief</em>'.
	 * @see net.opengis.citygml.relief.DocumentRoot#getTINRelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TINRelief();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.GridPropertyType <em>Grid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Property Type</em>'.
	 * @see net.opengis.citygml.relief.GridPropertyType
	 * @generated
	 */
	EClass getGridPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.GridPropertyType#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rectified Grid Coverage</em>'.
	 * @see net.opengis.citygml.relief.GridPropertyType#getRectifiedGridCoverage()
	 * @see #getGridPropertyType()
	 * @generated
	 */
	EReference getGridPropertyType_RectifiedGridCoverage();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.MassPointReliefType <em>Mass Point Relief Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mass Point Relief Type</em>'.
	 * @see net.opengis.citygml.relief.MassPointReliefType
	 * @generated
	 */
	EClass getMassPointReliefType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.MassPointReliefType#getReliefPoints <em>Relief Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relief Points</em>'.
	 * @see net.opengis.citygml.relief.MassPointReliefType#getReliefPoints()
	 * @see #getMassPointReliefType()
	 * @generated
	 */
	EReference getMassPointReliefType_ReliefPoints();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.relief.MassPointReliefType#getGenericApplicationPropertyOfMassPointReliefGroup <em>Generic Application Property Of Mass Point Relief Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Mass Point Relief Group</em>'.
	 * @see net.opengis.citygml.relief.MassPointReliefType#getGenericApplicationPropertyOfMassPointReliefGroup()
	 * @see #getMassPointReliefType()
	 * @generated
	 */
	EAttribute getMassPointReliefType_GenericApplicationPropertyOfMassPointReliefGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.relief.MassPointReliefType#getGenericApplicationPropertyOfMassPointRelief <em>Generic Application Property Of Mass Point Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Mass Point Relief</em>'.
	 * @see net.opengis.citygml.relief.MassPointReliefType#getGenericApplicationPropertyOfMassPointRelief()
	 * @see #getMassPointReliefType()
	 * @generated
	 */
	EReference getMassPointReliefType_GenericApplicationPropertyOfMassPointRelief();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.RasterReliefType <em>Raster Relief Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Relief Type</em>'.
	 * @see net.opengis.citygml.relief.RasterReliefType
	 * @generated
	 */
	EClass getRasterReliefType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.RasterReliefType#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see net.opengis.citygml.relief.RasterReliefType#getGrid()
	 * @see #getRasterReliefType()
	 * @generated
	 */
	EReference getRasterReliefType_Grid();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.relief.RasterReliefType#getGenericApplicationPropertyOfRasterReliefGroup <em>Generic Application Property Of Raster Relief Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Raster Relief Group</em>'.
	 * @see net.opengis.citygml.relief.RasterReliefType#getGenericApplicationPropertyOfRasterReliefGroup()
	 * @see #getRasterReliefType()
	 * @generated
	 */
	EAttribute getRasterReliefType_GenericApplicationPropertyOfRasterReliefGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.relief.RasterReliefType#getGenericApplicationPropertyOfRasterRelief <em>Generic Application Property Of Raster Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Raster Relief</em>'.
	 * @see net.opengis.citygml.relief.RasterReliefType#getGenericApplicationPropertyOfRasterRelief()
	 * @see #getRasterReliefType()
	 * @generated
	 */
	EReference getRasterReliefType_GenericApplicationPropertyOfRasterRelief();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.ReliefComponentPropertyType <em>Component Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Property Type</em>'.
	 * @see net.opengis.citygml.relief.ReliefComponentPropertyType
	 * @generated
	 */
	EClass getReliefComponentPropertyType();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.ReliefFeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type</em>'.
	 * @see net.opengis.citygml.relief.ReliefFeatureType
	 * @generated
	 */
	EClass getReliefFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.relief.ReliefFeatureType#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lod</em>'.
	 * @see net.opengis.citygml.relief.ReliefFeatureType#getLod()
	 * @see #getReliefFeatureType()
	 * @generated
	 */
	EAttribute getReliefFeatureType_Lod();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.relief.ReliefFeatureType#getReliefComponent <em>Relief Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relief Component</em>'.
	 * @see net.opengis.citygml.relief.ReliefFeatureType#getReliefComponent()
	 * @see #getReliefFeatureType()
	 * @generated
	 */
	EReference getReliefFeatureType_ReliefComponent();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.relief.ReliefFeatureType#getGenericApplicationPropertyOfReliefFeatureGroup <em>Generic Application Property Of Relief Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Relief Feature Group</em>'.
	 * @see net.opengis.citygml.relief.ReliefFeatureType#getGenericApplicationPropertyOfReliefFeatureGroup()
	 * @see #getReliefFeatureType()
	 * @generated
	 */
	EAttribute getReliefFeatureType_GenericApplicationPropertyOfReliefFeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.relief.ReliefFeatureType#getGenericApplicationPropertyOfReliefFeature <em>Generic Application Property Of Relief Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Relief Feature</em>'.
	 * @see net.opengis.citygml.relief.ReliefFeatureType#getGenericApplicationPropertyOfReliefFeature()
	 * @see #getReliefFeatureType()
	 * @generated
	 */
	EReference getReliefFeatureType_GenericApplicationPropertyOfReliefFeature();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.TinPropertyType <em>Tin Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tin Property Type</em>'.
	 * @see net.opengis.citygml.relief.TinPropertyType
	 * @generated
	 */
	EClass getTinPropertyType();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.relief.TINReliefType <em>TIN Relief Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIN Relief Type</em>'.
	 * @see net.opengis.citygml.relief.TINReliefType
	 * @generated
	 */
	EClass getTINReliefType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.relief.TINReliefType#getTin <em>Tin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tin</em>'.
	 * @see net.opengis.citygml.relief.TINReliefType#getTin()
	 * @see #getTINReliefType()
	 * @generated
	 */
	EReference getTINReliefType_Tin();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.relief.TINReliefType#getGenericApplicationPropertyOfTinReliefGroup <em>Generic Application Property Of Tin Relief Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Tin Relief Group</em>'.
	 * @see net.opengis.citygml.relief.TINReliefType#getGenericApplicationPropertyOfTinReliefGroup()
	 * @see #getTINReliefType()
	 * @generated
	 */
	EAttribute getTINReliefType_GenericApplicationPropertyOfTinReliefGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.relief.TINReliefType#getGenericApplicationPropertyOfTinRelief <em>Generic Application Property Of Tin Relief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Tin Relief</em>'.
	 * @see net.opengis.citygml.relief.TINReliefType#getGenericApplicationPropertyOfTinRelief()
	 * @see #getTINReliefType()
	 * @generated
	 */
	EReference getTINReliefType_GenericApplicationPropertyOfTinRelief();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReliefFactory getReliefFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl <em>Abstract Relief Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getAbstractReliefComponentType()
		 * @generated
		 */
		EClass ABSTRACT_RELIEF_COMPONENT_TYPE = eINSTANCE.getAbstractReliefComponentType();

		/**
		 * The meta object literal for the '<em><b>Lod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RELIEF_COMPONENT_TYPE__LOD = eINSTANCE.getAbstractReliefComponentType_Lod();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT = eINSTANCE.getAbstractReliefComponentType_Extent();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Relief Component Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP = eINSTANCE.getAbstractReliefComponentType_GenericApplicationPropertyOfReliefComponentGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = eINSTANCE.getAbstractReliefComponentType_GenericApplicationPropertyOfReliefComponent();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl <em>Breakline Relief Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getBreaklineReliefType()
		 * @generated
		 */
		EClass BREAKLINE_RELIEF_TYPE = eINSTANCE.getBreaklineReliefType();

		/**
		 * The meta object literal for the '<em><b>Ridge Or Valley Lines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES = eINSTANCE.getBreaklineReliefType_RidgeOrValleyLines();

		/**
		 * The meta object literal for the '<em><b>Breaklines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKLINE_RELIEF_TYPE__BREAKLINES = eINSTANCE.getBreaklineReliefType_Breaklines();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Breakline Relief Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP = eINSTANCE.getBreaklineReliefType_GenericApplicationPropertyOfBreaklineReliefGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Breakline Relief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF = eINSTANCE.getBreaklineReliefType_GenericApplicationPropertyOfBreaklineRelief();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.DocumentRootImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Generic Application Property Of Breakline Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfBreaklineRelief();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Mass Point Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfMassPointRelief();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Raster Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfRasterRelief();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfReliefComponent();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Relief Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfReliefFeature();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tin Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfTinRelief();

		/**
		 * The meta object literal for the '<em><b>Relief Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELIEF_COMPONENT = eINSTANCE.getDocumentRoot_ReliefComponent();

		/**
		 * The meta object literal for the '<em><b>Breakline Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BREAKLINE_RELIEF = eINSTANCE.getDocumentRoot_BreaklineRelief();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ELEVATION = eINSTANCE.getDocumentRoot_Elevation();

		/**
		 * The meta object literal for the '<em><b>Mass Point Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MASS_POINT_RELIEF = eINSTANCE.getDocumentRoot_MassPointRelief();

		/**
		 * The meta object literal for the '<em><b>Raster Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RASTER_RELIEF = eINSTANCE.getDocumentRoot_RasterRelief();

		/**
		 * The meta object literal for the '<em><b>Relief Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELIEF_FEATURE = eINSTANCE.getDocumentRoot_ReliefFeature();

		/**
		 * The meta object literal for the '<em><b>TIN Relief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIN_RELIEF = eINSTANCE.getDocumentRoot_TINRelief();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.GridPropertyTypeImpl <em>Grid Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.GridPropertyTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getGridPropertyType()
		 * @generated
		 */
		EClass GRID_PROPERTY_TYPE = eINSTANCE.getGridPropertyType();

		/**
		 * The meta object literal for the '<em><b>Rectified Grid Coverage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE = eINSTANCE.getGridPropertyType_RectifiedGridCoverage();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.MassPointReliefTypeImpl <em>Mass Point Relief Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.MassPointReliefTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getMassPointReliefType()
		 * @generated
		 */
		EClass MASS_POINT_RELIEF_TYPE = eINSTANCE.getMassPointReliefType();

		/**
		 * The meta object literal for the '<em><b>Relief Points</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASS_POINT_RELIEF_TYPE__RELIEF_POINTS = eINSTANCE.getMassPointReliefType_ReliefPoints();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Mass Point Relief Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP = eINSTANCE.getMassPointReliefType_GenericApplicationPropertyOfMassPointReliefGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Mass Point Relief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF = eINSTANCE.getMassPointReliefType_GenericApplicationPropertyOfMassPointRelief();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.RasterReliefTypeImpl <em>Raster Relief Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.RasterReliefTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getRasterReliefType()
		 * @generated
		 */
		EClass RASTER_RELIEF_TYPE = eINSTANCE.getRasterReliefType();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASTER_RELIEF_TYPE__GRID = eINSTANCE.getRasterReliefType_Grid();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Raster Relief Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP = eINSTANCE.getRasterReliefType_GenericApplicationPropertyOfRasterReliefGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Raster Relief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF = eINSTANCE.getRasterReliefType_GenericApplicationPropertyOfRasterRelief();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.ReliefComponentPropertyTypeImpl <em>Component Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.ReliefComponentPropertyTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getReliefComponentPropertyType()
		 * @generated
		 */
		EClass RELIEF_COMPONENT_PROPERTY_TYPE = eINSTANCE.getReliefComponentPropertyType();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl <em>Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getReliefFeatureType()
		 * @generated
		 */
		EClass RELIEF_FEATURE_TYPE = eINSTANCE.getReliefFeatureType();

		/**
		 * The meta object literal for the '<em><b>Lod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIEF_FEATURE_TYPE__LOD = eINSTANCE.getReliefFeatureType_Lod();

		/**
		 * The meta object literal for the '<em><b>Relief Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIEF_FEATURE_TYPE__RELIEF_COMPONENT = eINSTANCE.getReliefFeatureType_ReliefComponent();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Relief Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP = eINSTANCE.getReliefFeatureType_GenericApplicationPropertyOfReliefFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Relief Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE = eINSTANCE.getReliefFeatureType_GenericApplicationPropertyOfReliefFeature();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.TinPropertyTypeImpl <em>Tin Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.TinPropertyTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getTinPropertyType()
		 * @generated
		 */
		EClass TIN_PROPERTY_TYPE = eINSTANCE.getTinPropertyType();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.relief.impl.TINReliefTypeImpl <em>TIN Relief Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.relief.impl.TINReliefTypeImpl
		 * @see net.opengis.citygml.relief.impl.ReliefPackageImpl#getTINReliefType()
		 * @generated
		 */
		EClass TIN_RELIEF_TYPE = eINSTANCE.getTINReliefType();

		/**
		 * The meta object literal for the '<em><b>Tin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIN_RELIEF_TYPE__TIN = eINSTANCE.getTINReliefType_Tin();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tin Relief Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP = eINSTANCE.getTINReliefType_GenericApplicationPropertyOfTinReliefGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Tin Relief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF = eINSTANCE.getTINReliefType_GenericApplicationPropertyOfTinRelief();

	}

} //ReliefPackage
