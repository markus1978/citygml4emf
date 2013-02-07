/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getAbstractBuilding <em>Abstract Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getBoundarySurface <em>Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfAbstractBuilding <em>Generic Application Property Of Abstract Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBoundarySurface <em>Generic Application Property Of Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuilding <em>Generic Application Property Of Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingFurniture <em>Generic Application Property Of Building Furniture</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingInstallation <em>Generic Application Property Of Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfBuildingPart <em>Generic Application Property Of Building Part</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfCeilingSurface <em>Generic Application Property Of Ceiling Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfClosureSurface <em>Generic Application Property Of Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfDoor <em>Generic Application Property Of Door</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfFloorSurface <em>Generic Application Property Of Floor Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfGroundSurface <em>Generic Application Property Of Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfIntBuildingInstallation <em>Generic Application Property Of Int Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfInteriorWallSurface <em>Generic Application Property Of Interior Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfOpening <em>Generic Application Property Of Opening</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfRoofSurface <em>Generic Application Property Of Roof Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfRoom <em>Generic Application Property Of Room</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfWallSurface <em>Generic Application Property Of Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGenericApplicationPropertyOfWindow <em>Generic Application Property Of Window</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getOpening <em>Opening</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getBuilding <em>Building</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getBuildingFurniture <em>Building Furniture</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getBuildingInstallation <em>Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getBuildingPart <em>Building Part</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getCeilingSurface <em>Ceiling Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getClosureSurface <em>Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getDoor <em>Door</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getFloorSurface <em>Floor Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getGroundSurface <em>Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getIntBuildingInstallation <em>Int Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getInteriorWallSurface <em>Interior Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getRoofSurface <em>Roof Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getRoom <em>Room</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getWallSurface <em>Wall Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DocumentRoot#getWindow <em>Window</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Building</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Building</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_AbstractBuilding()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_AbstractBuilding' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_Site'"
	 * @generated
	 */
	AbstractBuildingType getAbstractBuilding();

	/**
	 * Returns the value of the '<em><b>Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_BoundarySurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_BoundarySurface' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	AbstractBoundarySurfaceType getBoundarySurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Abstract Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Abstract Building</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Abstract Building</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfAbstractBuilding()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAbstractBuilding' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfAbstractBuilding();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Boundary Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Boundary Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfBoundarySurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBoundarySurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfBoundarySurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfBuilding()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuilding' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfBuilding();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Furniture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Furniture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Furniture</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfBuildingFurniture()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuildingFurniture' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfBuildingFurniture();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Installation</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfBuildingInstallation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuildingInstallation' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfBuildingInstallation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Part</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfBuildingPart()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuildingPart' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfBuildingPart();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Ceiling Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Ceiling Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Ceiling Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfCeilingSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCeilingSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfCeilingSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Closure Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Closure Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfClosureSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfClosureSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfClosureSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Door</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Door</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Door</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfDoor()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfDoor' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfDoor();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Floor Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Floor Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Floor Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfFloorSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfFloorSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfFloorSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Ground Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Ground Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfGroundSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfGroundSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfGroundSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Int Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Int Building Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Int Building Installation</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfIntBuildingInstallation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfIntBuildingInstallation' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfIntBuildingInstallation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Interior Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Interior Wall Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Interior Wall Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfInteriorWallSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfInteriorWallSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfInteriorWallSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Opening</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Opening</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfOpening()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfOpening' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfOpening();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Roof Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Roof Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Roof Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfRoofSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRoofSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfRoofSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Room</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Room</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfRoom()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRoom' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfRoom();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Wall Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Wall Surface</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfWallSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWallSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWallSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Window</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GenericApplicationPropertyOfWindow()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWindow' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWindow();

	/**
	 * Returns the value of the '<em><b>Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening</em>' containment reference.
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_Opening()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Opening' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	AbstractOpeningType getOpening();

	/**
	 * Returns the value of the '<em><b>Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' containment reference.
	 * @see #setBuilding(BuildingType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_Building()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Building' namespace='##targetNamespace' affiliation='_AbstractBuilding'"
	 * @generated
	 */
	BuildingType getBuilding();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getBuilding <em>Building</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building</em>' containment reference.
	 * @see #getBuilding()
	 * @generated
	 */
	void setBuilding(BuildingType value);

	/**
	 * Returns the value of the '<em><b>Building Furniture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Furniture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Furniture</em>' containment reference.
	 * @see #setBuildingFurniture(BuildingFurnitureType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_BuildingFurniture()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BuildingFurniture' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	BuildingFurnitureType getBuildingFurniture();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getBuildingFurniture <em>Building Furniture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Furniture</em>' containment reference.
	 * @see #getBuildingFurniture()
	 * @generated
	 */
	void setBuildingFurniture(BuildingFurnitureType value);

	/**
	 * Returns the value of the '<em><b>Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Installation</em>' containment reference.
	 * @see #setBuildingInstallation(BuildingInstallationType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_BuildingInstallation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BuildingInstallation' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	BuildingInstallationType getBuildingInstallation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getBuildingInstallation <em>Building Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Installation</em>' containment reference.
	 * @see #getBuildingInstallation()
	 * @generated
	 */
	void setBuildingInstallation(BuildingInstallationType value);

	/**
	 * Returns the value of the '<em><b>Building Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Part</em>' containment reference.
	 * @see #setBuildingPart(BuildingPartType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_BuildingPart()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BuildingPart' namespace='##targetNamespace' affiliation='_AbstractBuilding'"
	 * @generated
	 */
	BuildingPartType getBuildingPart();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getBuildingPart <em>Building Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Part</em>' containment reference.
	 * @see #getBuildingPart()
	 * @generated
	 */
	void setBuildingPart(BuildingPartType value);

	/**
	 * Returns the value of the '<em><b>Ceiling Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceiling Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling Surface</em>' containment reference.
	 * @see #setCeilingSurface(CeilingSurfaceType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_CeilingSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CeilingSurface' namespace='##targetNamespace' affiliation='_BoundarySurface'"
	 * @generated
	 */
	CeilingSurfaceType getCeilingSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getCeilingSurface <em>Ceiling Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling Surface</em>' containment reference.
	 * @see #getCeilingSurface()
	 * @generated
	 */
	void setCeilingSurface(CeilingSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closure Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closure Surface</em>' containment reference.
	 * @see #setClosureSurface(ClosureSurfaceType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_ClosureSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClosureSurface' namespace='##targetNamespace' affiliation='_BoundarySurface'"
	 * @generated
	 */
	ClosureSurfaceType getClosureSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getClosureSurface <em>Closure Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closure Surface</em>' containment reference.
	 * @see #getClosureSurface()
	 * @generated
	 */
	void setClosureSurface(ClosureSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' containment reference.
	 * @see #setDoor(DoorType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_Door()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Door' namespace='##targetNamespace' affiliation='_Opening'"
	 * @generated
	 */
	DoorType getDoor();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getDoor <em>Door</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' containment reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(DoorType value);

	/**
	 * Returns the value of the '<em><b>Floor Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor Surface</em>' containment reference.
	 * @see #setFloorSurface(FloorSurfaceType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_FloorSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FloorSurface' namespace='##targetNamespace' affiliation='_BoundarySurface'"
	 * @generated
	 */
	FloorSurfaceType getFloorSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getFloorSurface <em>Floor Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor Surface</em>' containment reference.
	 * @see #getFloorSurface()
	 * @generated
	 */
	void setFloorSurface(FloorSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Surface</em>' containment reference.
	 * @see #setGroundSurface(GroundSurfaceType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_GroundSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroundSurface' namespace='##targetNamespace' affiliation='_BoundarySurface'"
	 * @generated
	 */
	GroundSurfaceType getGroundSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getGroundSurface <em>Ground Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Surface</em>' containment reference.
	 * @see #getGroundSurface()
	 * @generated
	 */
	void setGroundSurface(GroundSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Int Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Building Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Building Installation</em>' containment reference.
	 * @see #setIntBuildingInstallation(IntBuildingInstallationType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_IntBuildingInstallation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntBuildingInstallation' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	IntBuildingInstallationType getIntBuildingInstallation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getIntBuildingInstallation <em>Int Building Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Building Installation</em>' containment reference.
	 * @see #getIntBuildingInstallation()
	 * @generated
	 */
	void setIntBuildingInstallation(IntBuildingInstallationType value);

	/**
	 * Returns the value of the '<em><b>Interior Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior Wall Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior Wall Surface</em>' containment reference.
	 * @see #setInteriorWallSurface(InteriorWallSurfaceType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_InteriorWallSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InteriorWallSurface' namespace='##targetNamespace' affiliation='_BoundarySurface'"
	 * @generated
	 */
	InteriorWallSurfaceType getInteriorWallSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getInteriorWallSurface <em>Interior Wall Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior Wall Surface</em>' containment reference.
	 * @see #getInteriorWallSurface()
	 * @generated
	 */
	void setInteriorWallSurface(InteriorWallSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Roof Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roof Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roof Surface</em>' containment reference.
	 * @see #setRoofSurface(RoofSurfaceType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_RoofSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RoofSurface' namespace='##targetNamespace' affiliation='_BoundarySurface'"
	 * @generated
	 */
	RoofSurfaceType getRoofSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getRoofSurface <em>Roof Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roof Surface</em>' containment reference.
	 * @see #getRoofSurface()
	 * @generated
	 */
	void setRoofSurface(RoofSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference.
	 * @see #setRoom(RoomType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_Room()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Room' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	RoomType getRoom();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getRoom <em>Room</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' containment reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(RoomType value);

	/**
	 * Returns the value of the '<em><b>Wall Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall Surface</em>' containment reference.
	 * @see #setWallSurface(WallSurfaceType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_WallSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WallSurface' namespace='##targetNamespace' affiliation='_BoundarySurface'"
	 * @generated
	 */
	WallSurfaceType getWallSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getWallSurface <em>Wall Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Surface</em>' containment reference.
	 * @see #getWallSurface()
	 * @generated
	 */
	void setWallSurface(WallSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference.
	 * @see #setWindow(WindowType)
	 * @see net.opengis.citygml.building.BuildingPackage#getDocumentRoot_Window()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Window' namespace='##targetNamespace' affiliation='_Opening'"
	 * @generated
	 */
	WindowType getWindow();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.DocumentRoot#getWindow <em>Window</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' containment reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(WindowType value);

} // DocumentRoot
