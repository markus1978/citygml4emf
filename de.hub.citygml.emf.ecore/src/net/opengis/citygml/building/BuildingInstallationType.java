/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.gml.GeometryPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BuildingInstallation is a part of a Building which has not the significance of a BuildingPart.
 *                 Examples are stairs, antennas, balconies or small roofs. As subclass of _CityObject, a BuildingInstallation
 *                 inherits all attributes and relations, in particular an id, names, external references, and generalization
 *                 relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getGenericApplicationPropertyOfBuildingInstallationGroup <em>Generic Application Property Of Building Installation Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationType#getGenericApplicationPropertyOfBuildingInstallation <em>Generic Application Property Of Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType()
 * @model extendedMetaData="name='BuildingInstallationType' kind='elementOnly'"
 * @generated
 */
public interface BuildingInstallationType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_Class()
	 * @model dataType="net.opengis.citygml.building.BuildingInstallationClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingInstallationType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.building.BuildingInstallationFunctionType"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFunction();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_Usage()
	 * @model unique="false" dataType="net.opengis.citygml.building.BuildingInstallationUsageType"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Lod2 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Geometry</em>' containment reference.
	 * @see #setLod2Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_Lod2Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod2Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingInstallationType#getLod2Geometry <em>Lod2 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Geometry</em>' containment reference.
	 * @see #getLod2Geometry()
	 * @generated
	 */
	void setLod2Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Geometry</em>' containment reference.
	 * @see #setLod3Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_Lod3Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod3Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingInstallationType#getLod3Geometry <em>Lod3 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Geometry</em>' containment reference.
	 * @see #getLod3Geometry()
	 * @generated
	 */
	void setLod3Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod4 Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #setLod4Geometry(GeometryPropertyType)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_Lod4Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod4Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingInstallationType#getLod4Geometry <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #getLod4Geometry()
	 * @generated
	 */
	void setLod4Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Installation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Installation Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Installation Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfBuildingInstallation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfBuildingInstallationGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Installation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Installation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Installation</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationType_GenericApplicationPropertyOfBuildingInstallation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuildingInstallation' namespace='##targetNamespace' group='_GenericApplicationPropertyOfBuildingInstallation:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfBuildingInstallation();

} // BuildingInstallationType
