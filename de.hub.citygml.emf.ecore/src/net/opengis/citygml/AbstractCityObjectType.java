/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml.AbstractFeatureType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract City Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the abstract superclass of most CityGML features. Its purpose is to provide a
 *                 creation and a termination date as well as a reference to corresponding objects in other information systems. A
 *                 generalization relation may be used to relate features, which represent the same real-world object in different
 *                 Levels-of-Detail, i.e. a feature and its generalized counterpart(s). The direction of this relation is from the
 *                 feature to the corresponding generalized feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.AbstractCityObjectType#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link net.opengis.citygml.AbstractCityObjectType#getTerminationDate <em>Termination Date</em>}</li>
 *   <li>{@link net.opengis.citygml.AbstractCityObjectType#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link net.opengis.citygml.AbstractCityObjectType#getGeneralizesTo <em>Generalizes To</em>}</li>
 *   <li>{@link net.opengis.citygml.AbstractCityObjectType#getGenericApplicationPropertyOfCityObjectGroup <em>Generic Application Property Of City Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.AbstractCityObjectType#getGenericApplicationPropertyOfCityObject <em>Generic Application Property Of City Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getAbstractCityObjectType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCityObjectType' kind='elementOnly'"
 * @generated
 */
public interface AbstractCityObjectType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(XMLGregorianCalendar)
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractCityObjectType_CreationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='creationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationDate();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.AbstractCityObjectType#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termination Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Date</em>' attribute.
	 * @see #setTerminationDate(XMLGregorianCalendar)
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractCityObjectType_TerminationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='terminationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTerminationDate();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.AbstractCityObjectType#getTerminationDate <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Date</em>' attribute.
	 * @see #getTerminationDate()
	 * @generated
	 */
	void setTerminationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.ExternalReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference list.
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractCityObjectType_ExternalReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExternalReferenceType> getExternalReference();

	/**
	 * Returns the value of the '<em><b>Generalizes To</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.GeneralizationRelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalizes To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizes To</em>' containment reference list.
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractCityObjectType_GeneralizesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generalizesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeneralizationRelationType> getGeneralizesTo();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Object Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Object Group</em>' attribute list.
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractCityObjectType_GenericApplicationPropertyOfCityObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfCityObject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfCityObjectGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Object</em>' containment reference list.
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractCityObjectType_GenericApplicationPropertyOfCityObject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCityObject' namespace='##targetNamespace' group='_GenericApplicationPropertyOfCityObject:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfCityObject();

} // AbstractCityObjectType
