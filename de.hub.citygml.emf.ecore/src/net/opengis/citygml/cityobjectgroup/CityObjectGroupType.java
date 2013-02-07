/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityobjectgroup;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.gml.GeometryPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City Object Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A group may be used to aggregate arbitrary CityObjects according to some user-defined criteria.
 *                 Examples for groups are the buildings in a specific region, the result of a query, or objects put together for
 *                 visualization purposes. Each group has a name (inherited from AbstractGMLType), functions (e.g., building group),
 *                 a class and zero or more usages. A geometry may optionally be attached to a group, if the geometry of the whole
 *                 group differs from the geometry of the parts. Each member of a group may be qualified by a role name, reflecting
 *                 the role each CityObject plays in the context of the group. As subclass of _CityObject, a CityObjectGroup inherits
 *                 all attributes and relations, in particular an id, names, external references, and generalization relations. As
 *                 CityObjectGroup itself is a CityObject, it may also be contained by another group. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGroupMember <em>Group Member</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getParent <em>Parent</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGenericApplicationPropertyOfCityObjectGroupGroup <em>Generic Application Property Of City Object Group Group</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGenericApplicationPropertyOfCityObjectGroup1 <em>Generic Application Property Of City Object Group1</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType()
 * @model extendedMetaData="name='CityObjectGroupType' kind='elementOnly'"
 * @generated
 */
public interface CityObjectGroupType extends AbstractCityObjectType {
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
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getClass_ <em>Class</em>}' attribute.
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
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_Function()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
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
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_Usage()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Group Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Member</em>' containment reference list.
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_GroupMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groupMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CityObjectGroupMemberType> getGroupMember();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(CityObjectGroupParentType)
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	CityObjectGroupParentType getParent();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CityObjectGroupParentType value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(GeometryPropertyType)
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getGeometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.cityobjectgroup.CityObjectGroupType#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Object Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Object Group Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Object Group Group</em>' attribute list.
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_GenericApplicationPropertyOfCityObjectGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfCityObjectGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfCityObjectGroupGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Object Group1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Object Group1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Object Group1</em>' containment reference list.
	 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage#getCityObjectGroupType_GenericApplicationPropertyOfCityObjectGroup1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCityObjectGroup' namespace='##targetNamespace' group='_GenericApplicationPropertyOfCityObjectGroup:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfCityObjectGroup1();

} // CityObjectGroupType
