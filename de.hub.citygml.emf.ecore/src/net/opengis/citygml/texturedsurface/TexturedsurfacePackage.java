/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface;

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
 * @see net.opengis.citygml.texturedsurface.TexturedsurfaceFactory
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
public interface TexturedsurfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "texturedsurface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/citygml/texturedsurface/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TexturedsurfacePackage eINSTANCE = net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.citygml.texturedsurface.impl.AbstractAppearanceTypeImpl <em>Abstract Appearance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.impl.AbstractAppearanceTypeImpl
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getAbstractAppearanceType()
	 * @generated
	 */
	int ABSTRACT_APPEARANCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APPEARANCE_TYPE__META_DATA_PROPERTY = GmlPackage.ABSTRACT_GML_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APPEARANCE_TYPE__DESCRIPTION = GmlPackage.ABSTRACT_GML_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APPEARANCE_TYPE__NAME_GROUP = GmlPackage.ABSTRACT_GML_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APPEARANCE_TYPE__NAME = GmlPackage.ABSTRACT_GML_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APPEARANCE_TYPE__ID = GmlPackage.ABSTRACT_GML_TYPE__ID;

	/**
	 * The number of structural features of the '<em>Abstract Appearance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT = GmlPackage.ABSTRACT_GML_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.texturedsurface.impl.AppearancePropertyTypeImpl <em>Appearance Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.impl.AppearancePropertyTypeImpl
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getAppearancePropertyType()
	 * @generated
	 */
	int APPEARANCE_PROPERTY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Appearance Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__APPEARANCE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__APPEARANCE = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__ORIENTATION = 5;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__REMOTE_SCHEMA = 6;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__ROLE = 7;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__SHOW = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Appearance Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.impl.DocumentRootImpl
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPEARANCE = 3;

	/**
	 * The feature id for the '<em><b>Appearance1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPEARANCE1 = 4;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MATERIAL = 5;

	/**
	 * The feature id for the '<em><b>Simple Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_TEXTURE = 6;

	/**
	 * The feature id for the '<em><b>Textured Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXTURED_SURFACE = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl <em>Material Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getMaterialType()
	 * @generated
	 */
	int MATERIAL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__META_DATA_PROPERTY = ABSTRACT_APPEARANCE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__DESCRIPTION = ABSTRACT_APPEARANCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__NAME_GROUP = ABSTRACT_APPEARANCE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__NAME = ABSTRACT_APPEARANCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__ID = ABSTRACT_APPEARANCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__SHININESS = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__TRANSPARENCY = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ambient Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__AMBIENT_INTENSITY = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specular Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__SPECULAR_COLOR = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diffuse Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__DIFFUSE_COLOR = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Emissive Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE__EMISSIVE_COLOR = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Material Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_TYPE_FEATURE_COUNT = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl <em>Simple Texture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getSimpleTextureType()
	 * @generated
	 */
	int SIMPLE_TEXTURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__META_DATA_PROPERTY = ABSTRACT_APPEARANCE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__DESCRIPTION = ABSTRACT_APPEARANCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__NAME_GROUP = ABSTRACT_APPEARANCE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__NAME = ABSTRACT_APPEARANCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__ID = ABSTRACT_APPEARANCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Texture Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__TEXTURE_MAP = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Texture Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Texture Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE__REPEAT = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simple Texture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TEXTURE_TYPE_FEATURE_COUNT = ABSTRACT_APPEARANCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.texturedsurface.impl.TexturedSurfaceTypeImpl <em>Textured Surface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedSurfaceTypeImpl
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getTexturedSurfaceType()
	 * @generated
	 */
	int TEXTURED_SURFACE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__META_DATA_PROPERTY = GmlPackage.ORIENTABLE_SURFACE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__DESCRIPTION = GmlPackage.ORIENTABLE_SURFACE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__NAME_GROUP = GmlPackage.ORIENTABLE_SURFACE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__NAME = GmlPackage.ORIENTABLE_SURFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__ID = GmlPackage.ORIENTABLE_SURFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Axis Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__AXIS_LABELS = GmlPackage.ORIENTABLE_SURFACE_TYPE__AXIS_LABELS;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__GID = GmlPackage.ORIENTABLE_SURFACE_TYPE__GID;

	/**
	 * The feature id for the '<em><b>Srs Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__SRS_DIMENSION = GmlPackage.ORIENTABLE_SURFACE_TYPE__SRS_DIMENSION;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__SRS_NAME = GmlPackage.ORIENTABLE_SURFACE_TYPE__SRS_NAME;

	/**
	 * The feature id for the '<em><b>Uom Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__UOM_LABELS = GmlPackage.ORIENTABLE_SURFACE_TYPE__UOM_LABELS;

	/**
	 * The feature id for the '<em><b>Base Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__BASE_SURFACE = GmlPackage.ORIENTABLE_SURFACE_TYPE__BASE_SURFACE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__ORIENTATION = GmlPackage.ORIENTABLE_SURFACE_TYPE__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE__APPEARANCE = GmlPackage.ORIENTABLE_SURFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textured Surface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURED_SURFACE_TYPE_FEATURE_COUNT = GmlPackage.ORIENTABLE_SURFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.opengis.citygml.texturedsurface.TextureTypeType <em>Texture Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.TextureTypeType
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getTextureTypeType()
	 * @generated
	 */
	int TEXTURE_TYPE_TYPE = 6;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 7;

	/**
	 * The meta object id for the '<em>Texture Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.citygml.texturedsurface.TextureTypeType
	 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getTextureTypeTypeObject()
	 * @generated
	 */
	int TEXTURE_TYPE_TYPE_OBJECT = 8;


	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.texturedsurface.AbstractAppearanceType <em>Abstract Appearance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Appearance Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.AbstractAppearanceType
	 * @generated
	 */
	EClass getAbstractAppearanceType();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType <em>Appearance Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance Property Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType
	 * @generated
	 */
	EClass getAppearancePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getAppearanceGroup <em>Appearance Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Appearance Group</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getAppearanceGroup()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_AppearanceGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getAppearance()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EReference getAppearancePropertyType_Appearance();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getActuate()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getArcrole()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getHref()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getOrientation()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getRemoteSchema <em>Remote Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Schema</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getRemoteSchema()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_RemoteSchema();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getRole()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getShow()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getTitle()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.AppearancePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.AppearancePropertyType#getType()
	 * @see #getAppearancePropertyType()
	 * @generated
	 */
	EAttribute getAppearancePropertyType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.texturedsurface.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getAppearance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Appearance();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getAppearance1 <em>Appearance1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance1</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getAppearance1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Appearance1();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Material</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getMaterial()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Material();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getSimpleTexture <em>Simple Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Texture</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getSimpleTexture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleTexture();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.citygml.texturedsurface.DocumentRoot#getTexturedSurface <em>Textured Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Textured Surface</em>'.
	 * @see net.opengis.citygml.texturedsurface.DocumentRoot#getTexturedSurface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TexturedSurface();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.texturedsurface.MaterialType <em>Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.MaterialType
	 * @generated
	 */
	EClass getMaterialType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.MaterialType#getShininess <em>Shininess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shininess</em>'.
	 * @see net.opengis.citygml.texturedsurface.MaterialType#getShininess()
	 * @see #getMaterialType()
	 * @generated
	 */
	EAttribute getMaterialType_Shininess();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.MaterialType#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see net.opengis.citygml.texturedsurface.MaterialType#getTransparency()
	 * @see #getMaterialType()
	 * @generated
	 */
	EAttribute getMaterialType_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.MaterialType#getAmbientIntensity <em>Ambient Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambient Intensity</em>'.
	 * @see net.opengis.citygml.texturedsurface.MaterialType#getAmbientIntensity()
	 * @see #getMaterialType()
	 * @generated
	 */
	EAttribute getMaterialType_AmbientIntensity();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.MaterialType#getSpecularColor <em>Specular Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specular Color</em>'.
	 * @see net.opengis.citygml.texturedsurface.MaterialType#getSpecularColor()
	 * @see #getMaterialType()
	 * @generated
	 */
	EAttribute getMaterialType_SpecularColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.MaterialType#getDiffuseColor <em>Diffuse Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diffuse Color</em>'.
	 * @see net.opengis.citygml.texturedsurface.MaterialType#getDiffuseColor()
	 * @see #getMaterialType()
	 * @generated
	 */
	EAttribute getMaterialType_DiffuseColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.MaterialType#getEmissiveColor <em>Emissive Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emissive Color</em>'.
	 * @see net.opengis.citygml.texturedsurface.MaterialType#getEmissiveColor()
	 * @see #getMaterialType()
	 * @generated
	 */
	EAttribute getMaterialType_EmissiveColor();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.texturedsurface.SimpleTextureType <em>Simple Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Texture Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.SimpleTextureType
	 * @generated
	 */
	EClass getSimpleTextureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureMap <em>Texture Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Map</em>'.
	 * @see net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureMap()
	 * @see #getSimpleTextureType()
	 * @generated
	 */
	EAttribute getSimpleTextureType_TextureMap();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureCoordinates <em>Texture Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Coordinates</em>'.
	 * @see net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureCoordinates()
	 * @see #getSimpleTextureType()
	 * @generated
	 */
	EAttribute getSimpleTextureType_TextureCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureType <em>Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.SimpleTextureType#getTextureType()
	 * @see #getSimpleTextureType()
	 * @generated
	 */
	EAttribute getSimpleTextureType_TextureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.citygml.texturedsurface.SimpleTextureType#isRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see net.opengis.citygml.texturedsurface.SimpleTextureType#isRepeat()
	 * @see #getSimpleTextureType()
	 * @generated
	 */
	EAttribute getSimpleTextureType_Repeat();

	/**
	 * Returns the meta object for class '{@link net.opengis.citygml.texturedsurface.TexturedSurfaceType <em>Textured Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textured Surface Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.TexturedSurfaceType
	 * @generated
	 */
	EClass getTexturedSurfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.citygml.texturedsurface.TexturedSurfaceType#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appearance</em>'.
	 * @see net.opengis.citygml.texturedsurface.TexturedSurfaceType#getAppearance()
	 * @see #getTexturedSurfaceType()
	 * @generated
	 */
	EReference getTexturedSurfaceType_Appearance();

	/**
	 * Returns the meta object for enum '{@link net.opengis.citygml.texturedsurface.TextureTypeType <em>Texture Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Texture Type Type</em>'.
	 * @see net.opengis.citygml.texturedsurface.TextureTypeType
	 * @generated
	 */
	EEnum getTextureTypeType();

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
	 * Returns the meta object for data type '{@link net.opengis.citygml.texturedsurface.TextureTypeType <em>Texture Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Texture Type Type Object</em>'.
	 * @see net.opengis.citygml.texturedsurface.TextureTypeType
	 * @model instanceClass="net.opengis.citygml.texturedsurface.TextureTypeType"
	 *        extendedMetaData="name='TextureTypeType:Object' baseType='TextureTypeType'"
	 * @generated
	 */
	EDataType getTextureTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TexturedsurfaceFactory getTexturedsurfaceFactory();

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
		 * The meta object literal for the '{@link net.opengis.citygml.texturedsurface.impl.AbstractAppearanceTypeImpl <em>Abstract Appearance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.impl.AbstractAppearanceTypeImpl
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getAbstractAppearanceType()
		 * @generated
		 */
		EClass ABSTRACT_APPEARANCE_TYPE = eINSTANCE.getAbstractAppearanceType();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.texturedsurface.impl.AppearancePropertyTypeImpl <em>Appearance Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.impl.AppearancePropertyTypeImpl
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getAppearancePropertyType()
		 * @generated
		 */
		EClass APPEARANCE_PROPERTY_TYPE = eINSTANCE.getAppearancePropertyType();

		/**
		 * The meta object literal for the '<em><b>Appearance Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__APPEARANCE_GROUP = eINSTANCE.getAppearancePropertyType_AppearanceGroup();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE_PROPERTY_TYPE__APPEARANCE = eINSTANCE.getAppearancePropertyType_Appearance();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__ACTUATE = eINSTANCE.getAppearancePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__ARCROLE = eINSTANCE.getAppearancePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__HREF = eINSTANCE.getAppearancePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__ORIENTATION = eINSTANCE.getAppearancePropertyType_Orientation();

		/**
		 * The meta object literal for the '<em><b>Remote Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__REMOTE_SCHEMA = eINSTANCE.getAppearancePropertyType_RemoteSchema();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__ROLE = eINSTANCE.getAppearancePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__SHOW = eINSTANCE.getAppearancePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__TITLE = eINSTANCE.getAppearancePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_PROPERTY_TYPE__TYPE = eINSTANCE.getAppearancePropertyType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.impl.DocumentRootImpl
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPEARANCE = eINSTANCE.getDocumentRoot_Appearance();

		/**
		 * The meta object literal for the '<em><b>Appearance1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPEARANCE1 = eINSTANCE.getDocumentRoot_Appearance1();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MATERIAL = eINSTANCE.getDocumentRoot_Material();

		/**
		 * The meta object literal for the '<em><b>Simple Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE_TEXTURE = eINSTANCE.getDocumentRoot_SimpleTexture();

		/**
		 * The meta object literal for the '<em><b>Textured Surface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEXTURED_SURFACE = eINSTANCE.getDocumentRoot_TexturedSurface();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl <em>Material Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getMaterialType()
		 * @generated
		 */
		EClass MATERIAL_TYPE = eINSTANCE.getMaterialType();

		/**
		 * The meta object literal for the '<em><b>Shininess</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_TYPE__SHININESS = eINSTANCE.getMaterialType_Shininess();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_TYPE__TRANSPARENCY = eINSTANCE.getMaterialType_Transparency();

		/**
		 * The meta object literal for the '<em><b>Ambient Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_TYPE__AMBIENT_INTENSITY = eINSTANCE.getMaterialType_AmbientIntensity();

		/**
		 * The meta object literal for the '<em><b>Specular Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_TYPE__SPECULAR_COLOR = eINSTANCE.getMaterialType_SpecularColor();

		/**
		 * The meta object literal for the '<em><b>Diffuse Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_TYPE__DIFFUSE_COLOR = eINSTANCE.getMaterialType_DiffuseColor();

		/**
		 * The meta object literal for the '<em><b>Emissive Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_TYPE__EMISSIVE_COLOR = eINSTANCE.getMaterialType_EmissiveColor();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl <em>Simple Texture Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getSimpleTextureType()
		 * @generated
		 */
		EClass SIMPLE_TEXTURE_TYPE = eINSTANCE.getSimpleTextureType();

		/**
		 * The meta object literal for the '<em><b>Texture Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TEXTURE_TYPE__TEXTURE_MAP = eINSTANCE.getSimpleTextureType_TextureMap();

		/**
		 * The meta object literal for the '<em><b>Texture Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES = eINSTANCE.getSimpleTextureType_TextureCoordinates();

		/**
		 * The meta object literal for the '<em><b>Texture Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE = eINSTANCE.getSimpleTextureType_TextureType();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TEXTURE_TYPE__REPEAT = eINSTANCE.getSimpleTextureType_Repeat();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.texturedsurface.impl.TexturedSurfaceTypeImpl <em>Textured Surface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedSurfaceTypeImpl
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getTexturedSurfaceType()
		 * @generated
		 */
		EClass TEXTURED_SURFACE_TYPE = eINSTANCE.getTexturedSurfaceType();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTURED_SURFACE_TYPE__APPEARANCE = eINSTANCE.getTexturedSurfaceType_Appearance();

		/**
		 * The meta object literal for the '{@link net.opengis.citygml.texturedsurface.TextureTypeType <em>Texture Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.TextureTypeType
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getTextureTypeType()
		 * @generated
		 */
		EEnum TEXTURE_TYPE_TYPE = eINSTANCE.getTextureTypeType();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Texture Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.citygml.texturedsurface.TextureTypeType
		 * @see net.opengis.citygml.texturedsurface.impl.TexturedsurfacePackageImpl#getTextureTypeTypeObject()
		 * @generated
		 */
		EDataType TEXTURE_TYPE_TYPE_OBJECT = eINSTANCE.getTextureTypeTypeObject();

	}

} //TexturedsurfacePackage
