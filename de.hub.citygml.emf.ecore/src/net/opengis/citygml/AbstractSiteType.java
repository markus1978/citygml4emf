/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Site Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the abstract superclass for buildings, facilities, etc. Future extensions of CityGML
 *                 like bridges and tunnels would be modelled as subclasses of _Site. As subclass of _CityObject, a _Site inherits
 *                 all attributes and relations, in particular an id, names, external references, and generalization relations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.AbstractSiteType#getGenericApplicationPropertyOfSiteGroup <em>Generic Application Property Of Site Group</em>}</li>
 *   <li>{@link net.opengis.citygml.AbstractSiteType#getGenericApplicationPropertyOfSite <em>Generic Application Property Of Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getAbstractSiteType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractSiteType' kind='elementOnly'"
 * @generated
 */
public interface AbstractSiteType extends AbstractCityObjectType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Site Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Site Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Site Group</em>' attribute list.
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractSiteType_GenericApplicationPropertyOfSiteGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfSite:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfSiteGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Site</em>' containment reference list.
	 * @see net.opengis.citygml.CitygmlPackage#getAbstractSiteType_GenericApplicationPropertyOfSite()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSite' namespace='##targetNamespace' group='_GenericApplicationPropertyOfSite:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfSite();

} // AbstractSiteType
