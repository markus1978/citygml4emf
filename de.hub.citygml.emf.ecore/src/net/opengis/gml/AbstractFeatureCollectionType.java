/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A feature collection contains zero or more features.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractFeatureCollectionType#getFeatureMemberGroup <em>Feature Member Group</em>}</li>
 *   <li>{@link net.opengis.gml.AbstractFeatureCollectionType#getFeatureMember <em>Feature Member</em>}</li>
 *   <li>{@link net.opengis.gml.AbstractFeatureCollectionType#getFeatureMembers <em>Feature Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getAbstractFeatureCollectionType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractFeatureCollectionType' kind='elementOnly'"
 * @generated
 */
public interface AbstractFeatureCollectionType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Feature Member Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Member Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Member Group</em>' attribute list.
	 * @see net.opengis.gml.GmlPackage#getAbstractFeatureCollectionType_FeatureMemberGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='featureMember:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFeatureMemberGroup();

	/**
	 * Returns the value of the '<em><b>Feature Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.FeaturePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Member</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getAbstractFeatureCollectionType_FeatureMember()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featureMember' namespace='##targetNamespace' group='featureMember:group'"
	 * @generated
	 */
	EList<FeaturePropertyType> getFeatureMember();

	/**
	 * Returns the value of the '<em><b>Feature Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Members</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Members</em>' containment reference.
	 * @see #setFeatureMembers(FeatureArrayPropertyType)
	 * @see net.opengis.gml.GmlPackage#getAbstractFeatureCollectionType_FeatureMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureArrayPropertyType getFeatureMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractFeatureCollectionType#getFeatureMembers <em>Feature Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Members</em>' containment reference.
	 * @see #getFeatureMembers()
	 * @generated
	 */
	void setFeatureMembers(FeatureArrayPropertyType value);

} // AbstractFeatureCollectionType
