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
 * A representation of the model object '<em><b>Int Building Installation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IntBuildingInstallation is an interior part of a Building which has a specific function or
 *                 semantical meaning. Examples are interior stairs, railings, radiators or pipes. As subclass of _CityObject, a
 *                 nIntBuildingInstallation inherits all attributes and relations, in particular an id, names, external references,
 *                 and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.IntBuildingInstallationType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.IntBuildingInstallationType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.IntBuildingInstallationType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.IntBuildingInstallationType#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.IntBuildingInstallationType#getGenericApplicationPropertyOfIntBuildingInstallationGroup <em>Generic Application Property Of Int Building Installation Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.IntBuildingInstallationType#getGenericApplicationPropertyOfIntBuildingInstallation <em>Generic Application Property Of Int Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationType()
 * @model extendedMetaData="name='IntBuildingInstallationType' kind='elementOnly'"
 * @generated
 */
public interface IntBuildingInstallationType extends AbstractCityObjectType {
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
	 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationType_Class()
	 * @model dataType="net.opengis.citygml.building.IntBuildingInstallationClassType"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.IntBuildingInstallationType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.building.IntBuildingInstallationFunctionType"
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
	 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationType_Usage()
	 * @model unique="false" dataType="net.opengis.citygml.building.IntBuildingInstallationUsageType"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

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
	 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationType_Lod4Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getLod4Geometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.IntBuildingInstallationType#getLod4Geometry <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Geometry</em>' containment reference.
	 * @see #getLod4Geometry()
	 * @generated
	 */
	void setLod4Geometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Int Building Installation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Int Building Installation Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Int Building Installation Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfIntBuildingInstallation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfIntBuildingInstallationGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Int Building Installation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Int Building Installation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Int Building Installation</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationType_GenericApplicationPropertyOfIntBuildingInstallation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfIntBuildingInstallation' namespace='##targetNamespace' group='_GenericApplicationPropertyOfIntBuildingInstallation:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfIntBuildingInstallation();

} // IntBuildingInstallationType
