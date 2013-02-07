/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import net.opengis.gml.AbstractFeatureCollectionType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the "root" element of any city model file. It is a collection whose members are
 *                 restricted to be features of a city model. All features are included as cityObjectMember. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.CityModelType#getGenericApplicationPropertyOfCityModelGroup <em>Generic Application Property Of City Model Group</em>}</li>
 *   <li>{@link net.opengis.citygml.CityModelType#getGenericApplicationPropertyOfCityModel <em>Generic Application Property Of City Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getCityModelType()
 * @model extendedMetaData="name='CityModelType' kind='elementOnly'"
 * @generated
 */
public interface CityModelType extends AbstractFeatureCollectionType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Model Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Model Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Model Group</em>' attribute list.
	 * @see net.opengis.citygml.CitygmlPackage#getCityModelType_GenericApplicationPropertyOfCityModelGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfCityModel:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfCityModelGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Model</em>' containment reference list.
	 * @see net.opengis.citygml.CitygmlPackage#getCityModelType_GenericApplicationPropertyOfCityModel()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCityModel' namespace='##targetNamespace' group='_GenericApplicationPropertyOfCityModel:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfCityModel();

} // CityModelType
