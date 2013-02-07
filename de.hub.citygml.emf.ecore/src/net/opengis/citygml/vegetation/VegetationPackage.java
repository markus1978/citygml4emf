/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation;

import net.opengis.citygml.CitygmlPackage;

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
 * @see net.opengis.citygml.vegetation.VegetationFactory
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
public interface VegetationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vegetation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/vegetation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "veg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VegetationPackage eINSTANCE = net.opengis.citygml.vegetation.impl.VegetationPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.vegetation.impl.AbstractVegetationObjectTypeImpl <em>Abstract Vegetation Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.vegetation.impl.AbstractVegetationObjectTypeImpl
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getAbstractVegetationObjectType()
	 * @generated
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__META_DATA_PROPERTY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__DESCRIPTION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__NAME_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__NAME = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__ID = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__BOUNDED_BY = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__LOCATION_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__LOCATION = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__CREATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__TERMINATION_DATE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__EXTERNAL_REFERENCE = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__GENERALIZES_TO = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Vegetation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Vegetation Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT = CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.vegetation.impl.DocumentRootImpl
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Generic Application Property Of Plant Cover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER = 3;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Solitary Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VEGETATION_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Plant Cover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLANT_COVER = 7;

	/**
	 * The feature id for the '<em><b>Solitary Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT = 8;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl <em>Plant Cover Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantCoverType()
	 * @generated
	 */
	int PLANT_COVER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__META_DATA_PROPERTY = ABSTRACT_VEGETATION_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__DESCRIPTION = ABSTRACT_VEGETATION_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__NAME_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__NAME = ABSTRACT_VEGETATION_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__ID = ABSTRACT_VEGETATION_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__BOUNDED_BY = ABSTRACT_VEGETATION_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOCATION_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOCATION = ABSTRACT_VEGETATION_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__CREATION_DATE = ABSTRACT_VEGETATION_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__TERMINATION_DATE = ABSTRACT_VEGETATION_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__EXTERNAL_REFERENCE = ABSTRACT_VEGETATION_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__GENERALIZES_TO = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Vegetation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__CLASS = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__FUNCTION = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Average Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__AVERAGE_HEIGHT = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOD1_MULTI_SURFACE = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOD2_MULTI_SURFACE = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOD3_MULTI_SURFACE = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOD4_MULTI_SURFACE = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lod1 Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOD1_MULTI_SOLID = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lod2 Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOD2_MULTI_SOLID = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lod3 Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__LOD3_MULTI_SOLID = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Plant Cover Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Plant Cover</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Plant Cover Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_COVER_TYPE_FEATURE_COUNT = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl <em>Solitary Vegetation Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getSolitaryVegetationObjectType()
	 * @generated
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__META_DATA_PROPERTY = ABSTRACT_VEGETATION_OBJECT_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__DESCRIPTION = ABSTRACT_VEGETATION_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__NAME_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__NAME = ABSTRACT_VEGETATION_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__ID = ABSTRACT_VEGETATION_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__BOUNDED_BY = ABSTRACT_VEGETATION_OBJECT_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOCATION_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOCATION = ABSTRACT_VEGETATION_OBJECT_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__CREATION_DATE = ABSTRACT_VEGETATION_OBJECT_TYPE__CREATION_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__TERMINATION_DATE = ABSTRACT_VEGETATION_OBJECT_TYPE__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__EXTERNAL_REFERENCE = ABSTRACT_VEGETATION_OBJECT_TYPE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Generalizes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__GENERALIZES_TO = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERALIZES_TO;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Vegetation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT = ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__CLASS = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trunk Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Crown Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lod1 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lod2 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lod3 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lod4 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lod1 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lod2 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Lod3 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Lod4 Implicit Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Solitary Vegetation Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Generic Application Property Of Solitary Vegetation Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Solitary Vegetation Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITARY_VEGETATION_OBJECT_TYPE_FEATURE_COUNT = ABSTRACT_VEGETATION_OBJECT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '<em>Plant Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantClassType()
	 * @generated
	 */
	int PLANT_CLASS_TYPE = 4;

	/**
	 * The meta object id for the '<em>Plant Cover Class Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantCoverClassType()
	 * @generated
	 */
	int PLANT_COVER_CLASS_TYPE = 5;

	/**
	 * The meta object id for the '<em>Plant Cover Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantCoverFunctionType()
	 * @generated
	 */
	int PLANT_COVER_FUNCTION_TYPE = 6;

	/**
	 * The meta object id for the '<em>Plant Function Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantFunctionType()
	 * @generated
	 */
	int PLANT_FUNCTION_TYPE = 7;

	/**
	 * The meta object id for the '<em>Species Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getSpeciesType()
	 * @generated
	 */
	int SPECIES_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.vegetation.AbstractVegetationObjectType <em>Abstract Vegetation Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Vegetation Object Type</em>'.
	 * @see net.opengis.citygml.vegetation.AbstractVegetationObjectType
	 * @generated
	 */
	EClass getAbstractVegetationObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.vegetation.AbstractVegetationObjectType#getGenericApplicationPropertyOfVegetationObjectGroup <em>Generic Application Property Of Vegetation Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Vegetation Object Group</em>'.
	 * @see net.opengis.citygml.vegetation.AbstractVegetationObjectType#getGenericApplicationPropertyOfVegetationObjectGroup()
	 * @see #getAbstractVegetationObjectType()
	 * @generated
	 */
	EAttribute getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObjectGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.vegetation.AbstractVegetationObjectType#getGenericApplicationPropertyOfVegetationObject <em>Generic Application Property Of Vegetation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Vegetation Object</em>'.
	 * @see net.opengis.citygml.vegetation.AbstractVegetationObjectType#getGenericApplicationPropertyOfVegetationObject()
	 * @see #getAbstractVegetationObjectType()
	 * @generated
	 */
	EReference getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObject();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.vegetation.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.vegetation.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.vegetation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.vegetation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfPlantCover <em>Generic Application Property Of Plant Cover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Plant Cover</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfPlantCover()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfPlantCover();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfSolitaryVegetationObject <em>Generic Application Property Of Solitary Vegetation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Solitary Vegetation Object</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfSolitaryVegetationObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfSolitaryVegetationObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfVegetationObject <em>Generic Application Property Of Vegetation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Application Property Of Vegetation Object</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfVegetationObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GenericApplicationPropertyOfVegetationObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.DocumentRoot#getVegetationObject <em>Vegetation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vegetation Object</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getVegetationObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_VegetationObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.DocumentRoot#getPlantCover <em>Plant Cover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plant Cover</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getPlantCover()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlantCover();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.DocumentRoot#getSolitaryVegetationObject <em>Solitary Vegetation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solitary Vegetation Object</em>'.
	 * @see net.opengis.citygml.vegetation.DocumentRoot#getSolitaryVegetationObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SolitaryVegetationObject();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.vegetation.PlantCoverType <em>Plant Cover Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Cover Type</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType
	 * @generated
	 */
	EClass getPlantCoverType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.vegetation.PlantCoverType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getClass_()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EAttribute getPlantCoverType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.vegetation.PlantCoverType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getFunction()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EAttribute getPlantCoverType_Function();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getAverageHeight <em>Average Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Average Height</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getAverageHeight()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_AverageHeight();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Multi Surface</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSurface()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_Lod1MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Surface</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSurface()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_Lod2MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Surface</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSurface()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_Lod3MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Multi Surface</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getLod4MultiSurface()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_Lod4MultiSurface();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSolid <em>Lod1 Multi Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Multi Solid</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getLod1MultiSolid()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_Lod1MultiSolid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSolid <em>Lod2 Multi Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Multi Solid</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getLod2MultiSolid()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_Lod2MultiSolid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSolid <em>Lod3 Multi Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Multi Solid</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getLod3MultiSolid()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_Lod3MultiSolid();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.vegetation.PlantCoverType#getGenericApplicationPropertyOfPlantCoverGroup <em>Generic Application Property Of Plant Cover Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Plant Cover Group</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getGenericApplicationPropertyOfPlantCoverGroup()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EAttribute getPlantCoverType_GenericApplicationPropertyOfPlantCoverGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.vegetation.PlantCoverType#getGenericApplicationPropertyOfPlantCover <em>Generic Application Property Of Plant Cover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Plant Cover</em>'.
	 * @see net.opengis.citygml.vegetation.PlantCoverType#getGenericApplicationPropertyOfPlantCover()
	 * @see #getPlantCoverType()
	 * @generated
	 */
	EReference getPlantCoverType_GenericApplicationPropertyOfPlantCover();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType <em>Solitary Vegetation Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solitary Vegetation Object Type</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType
	 * @generated
	 */
	EClass getSolitaryVegetationObjectType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getClass_()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EAttribute getSolitaryVegetationObjectType_Class();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Function</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getFunction()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EAttribute getSolitaryVegetationObjectType_Function();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getSpecies()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EAttribute getSolitaryVegetationObjectType_Species();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Height</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getHeight()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Height();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getTrunkDiameter <em>Trunk Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trunk Diameter</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getTrunkDiameter()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_TrunkDiameter();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getCrownDiameter <em>Crown Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crown Diameter</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getCrownDiameter()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_CrownDiameter();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1Geometry <em>Lod1 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Geometry</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1Geometry()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod1Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2Geometry <em>Lod2 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Geometry</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2Geometry()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod2Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3Geometry <em>Lod3 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Geometry</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3Geometry()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod3Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4Geometry <em>Lod4 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Geometry</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4Geometry()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod4Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod1 Implicit Representation</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod1ImplicitRepresentation()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod1ImplicitRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod2 Implicit Representation</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod2ImplicitRepresentation()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod2ImplicitRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod3 Implicit Representation</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod3ImplicitRepresentation()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod3ImplicitRepresentation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod4 Implicit Representation</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getLod4ImplicitRepresentation()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_Lod4ImplicitRepresentation();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getGenericApplicationPropertyOfSolitaryVegetationObjectGroup <em>Generic Application Property Of Solitary Vegetation Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Application Property Of Solitary Vegetation Object Group</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getGenericApplicationPropertyOfSolitaryVegetationObjectGroup()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EAttribute getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObjectGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getGenericApplicationPropertyOfSolitaryVegetationObject <em>Generic Application Property Of Solitary Vegetation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Application Property Of Solitary Vegetation Object</em>'.
	 * @see net.opengis.citygml.vegetation.SolitaryVegetationObjectType#getGenericApplicationPropertyOfSolitaryVegetationObject()
	 * @see #getSolitaryVegetationObjectType()
	 * @generated
	 */
	EReference getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Plant Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plant Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PlantClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPlantClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Plant Cover Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plant Cover Class Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PlantCoverClassType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPlantCoverClassType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Plant Cover Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plant Cover Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PlantCoverFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPlantCoverFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Plant Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plant Function Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PlantFunctionType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPlantFunctionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Species Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Species Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SpeciesType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getSpeciesType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VegetationFactory getVegetationFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.vegetation.impl.AbstractVegetationObjectTypeImpl <em>Abstract Vegetation Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.vegetation.impl.AbstractVegetationObjectTypeImpl
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getAbstractVegetationObjectType()
		 * @generated
		 */
		EClass ABSTRACT_VEGETATION_OBJECT_TYPE = eINSTANCE.getAbstractVegetationObjectType();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Vegetation Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP = eINSTANCE.getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObjectGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT = eINSTANCE.getAbstractVegetationObjectType_GenericApplicationPropertyOfVegetationObject();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.vegetation.impl.DocumentRootImpl
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Generic Application Property Of Plant Cover</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfPlantCover();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Solitary Vegetation Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfSolitaryVegetationObject();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT = eINSTANCE.getDocumentRoot_GenericApplicationPropertyOfVegetationObject();

		/**
		 * The meta object literal for the '<em><b>Vegetation Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VEGETATION_OBJECT = eINSTANCE.getDocumentRoot_VegetationObject();

		/**
		 * The meta object literal for the '<em><b>Plant Cover</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLANT_COVER = eINSTANCE.getDocumentRoot_PlantCover();

		/**
		 * The meta object literal for the '<em><b>Solitary Vegetation Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT = eINSTANCE.getDocumentRoot_SolitaryVegetationObject();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl <em>Plant Cover Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantCoverType()
		 * @generated
		 */
		EClass PLANT_COVER_TYPE = eINSTANCE.getPlantCoverType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_COVER_TYPE__CLASS = eINSTANCE.getPlantCoverType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_COVER_TYPE__FUNCTION = eINSTANCE.getPlantCoverType_Function();

		/**
		 * The meta object literal for the '<em><b>Average Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__AVERAGE_HEIGHT = eINSTANCE.getPlantCoverType_AverageHeight();

		/**
		 * The meta object literal for the '<em><b>Lod1 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__LOD1_MULTI_SURFACE = eINSTANCE.getPlantCoverType_Lod1MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__LOD2_MULTI_SURFACE = eINSTANCE.getPlantCoverType_Lod2MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__LOD3_MULTI_SURFACE = eINSTANCE.getPlantCoverType_Lod3MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod4 Multi Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__LOD4_MULTI_SURFACE = eINSTANCE.getPlantCoverType_Lod4MultiSurface();

		/**
		 * The meta object literal for the '<em><b>Lod1 Multi Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__LOD1_MULTI_SOLID = eINSTANCE.getPlantCoverType_Lod1MultiSolid();

		/**
		 * The meta object literal for the '<em><b>Lod2 Multi Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__LOD2_MULTI_SOLID = eINSTANCE.getPlantCoverType_Lod2MultiSolid();

		/**
		 * The meta object literal for the '<em><b>Lod3 Multi Solid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__LOD3_MULTI_SOLID = eINSTANCE.getPlantCoverType_Lod3MultiSolid();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Plant Cover Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP = eINSTANCE.getPlantCoverType_GenericApplicationPropertyOfPlantCoverGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Plant Cover</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER = eINSTANCE.getPlantCoverType_GenericApplicationPropertyOfPlantCover();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl <em>Solitary Vegetation Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getSolitaryVegetationObjectType()
		 * @generated
		 */
		EClass SOLITARY_VEGETATION_OBJECT_TYPE = eINSTANCE.getSolitaryVegetationObjectType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLITARY_VEGETATION_OBJECT_TYPE__CLASS = eINSTANCE.getSolitaryVegetationObjectType_Class();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION = eINSTANCE.getSolitaryVegetationObjectType_Function();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES = eINSTANCE.getSolitaryVegetationObjectType_Species();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT = eINSTANCE.getSolitaryVegetationObjectType_Height();

		/**
		 * The meta object literal for the '<em><b>Trunk Diameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER = eINSTANCE.getSolitaryVegetationObjectType_TrunkDiameter();

		/**
		 * The meta object literal for the '<em><b>Crown Diameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER = eINSTANCE.getSolitaryVegetationObjectType_CrownDiameter();

		/**
		 * The meta object literal for the '<em><b>Lod1 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY = eINSTANCE.getSolitaryVegetationObjectType_Lod1Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod2 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY = eINSTANCE.getSolitaryVegetationObjectType_Lod2Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod3 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY = eINSTANCE.getSolitaryVegetationObjectType_Lod3Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod4 Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY = eINSTANCE.getSolitaryVegetationObjectType_Lod4Geometry();

		/**
		 * The meta object literal for the '<em><b>Lod1 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION = eINSTANCE.getSolitaryVegetationObjectType_Lod1ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Lod2 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION = eINSTANCE.getSolitaryVegetationObjectType_Lod2ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Lod3 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION = eINSTANCE.getSolitaryVegetationObjectType_Lod3ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Lod4 Implicit Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION = eINSTANCE.getSolitaryVegetationObjectType_Lod4ImplicitRepresentation();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Solitary Vegetation Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP = eINSTANCE.getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObjectGroup();

		/**
		 * The meta object literal for the '<em><b>Generic Application Property Of Solitary Vegetation Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT = eINSTANCE.getSolitaryVegetationObjectType_GenericApplicationPropertyOfSolitaryVegetationObject();

		/**
		 * The meta object literal for the '<em>Plant Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantClassType()
		 * @generated
		 */
		EDataType PLANT_CLASS_TYPE = eINSTANCE.getPlantClassType();

		/**
		 * The meta object literal for the '<em>Plant Cover Class Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantCoverClassType()
		 * @generated
		 */
		EDataType PLANT_COVER_CLASS_TYPE = eINSTANCE.getPlantCoverClassType();

		/**
		 * The meta object literal for the '<em>Plant Cover Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantCoverFunctionType()
		 * @generated
		 */
		EDataType PLANT_COVER_FUNCTION_TYPE = eINSTANCE.getPlantCoverFunctionType();

		/**
		 * The meta object literal for the '<em>Plant Function Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getPlantFunctionType()
		 * @generated
		 */
		EDataType PLANT_FUNCTION_TYPE = eINSTANCE.getPlantFunctionType();

		/**
		 * The meta object literal for the '<em>Species Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.opengis.citygml.vegetation.impl.VegetationPackageImpl#getSpeciesType()
		 * @generated
		 */
		EDataType SPECIES_TYPE = eINSTANCE.getSpeciesType();

	}

} //VegetationPackage
