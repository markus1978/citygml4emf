/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TIN Relief Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the TIN component of a relief feature. As subclass of _CityObject, a TINRelief
 *                 inherits all attributes and relations, in particular an id, names, external references, and generalization
 *                 relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.TINReliefType#getTin <em>Tin</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.TINReliefType#getGenericApplicationPropertyOfTinReliefGroup <em>Generic Application Property Of Tin Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.TINReliefType#getGenericApplicationPropertyOfTinRelief <em>Generic Application Property Of Tin Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getTINReliefType()
 * @model extendedMetaData="name='TINReliefType' kind='elementOnly'"
 * @generated
 */
public interface TINReliefType extends AbstractReliefComponentType {
	/**
	 * Returns the value of the '<em><b>Tin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tin</em>' containment reference.
	 * @see #setTin(TinPropertyType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getTINReliefType_Tin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tin' namespace='##targetNamespace'"
	 * @generated
	 */
	TinPropertyType getTin();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.TINReliefType#getTin <em>Tin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tin</em>' containment reference.
	 * @see #getTin()
	 * @generated
	 */
	void setTin(TinPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tin Relief Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tin Relief Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tin Relief Group</em>' attribute list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getTINReliefType_GenericApplicationPropertyOfTinReliefGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTinRelief:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTinReliefGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tin Relief</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tin Relief</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tin Relief</em>' containment reference list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getTINReliefType_GenericApplicationPropertyOfTinRelief()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTinRelief' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTinRelief:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTinRelief();

} // TINReliefType
