/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import net.opengis.gml.MultiPointPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass Point Relief Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the mass point component of a relief feature. As subclass of _CityObject, a
 *                 MassPoint Relief inherits all attributes and relations, in particular an id, names, external references, and
 *                 generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.MassPointReliefType#getReliefPoints <em>Relief Points</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.MassPointReliefType#getGenericApplicationPropertyOfMassPointReliefGroup <em>Generic Application Property Of Mass Point Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.MassPointReliefType#getGenericApplicationPropertyOfMassPointRelief <em>Generic Application Property Of Mass Point Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getMassPointReliefType()
 * @model extendedMetaData="name='MassPointReliefType' kind='elementOnly'"
 * @generated
 */
public interface MassPointReliefType extends AbstractReliefComponentType {
	/**
	 * Returns the value of the '<em><b>Relief Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relief Points</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relief Points</em>' containment reference.
	 * @see #setReliefPoints(MultiPointPropertyType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getMassPointReliefType_ReliefPoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reliefPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPointPropertyType getReliefPoints();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.MassPointReliefType#getReliefPoints <em>Relief Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relief Points</em>' containment reference.
	 * @see #getReliefPoints()
	 * @generated
	 */
	void setReliefPoints(MultiPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Mass Point Relief Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Mass Point Relief Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Mass Point Relief Group</em>' attribute list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getMassPointReliefType_GenericApplicationPropertyOfMassPointReliefGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfMassPointRelief:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfMassPointReliefGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Mass Point Relief</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Mass Point Relief</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Mass Point Relief</em>' containment reference list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getMassPointReliefType_GenericApplicationPropertyOfMassPointRelief()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfMassPointRelief' namespace='##targetNamespace' group='_GenericApplicationPropertyOfMassPointRelief:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfMassPointRelief();

} // MassPointReliefType
