/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import net.opengis.gml.MultiCurvePropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Breakline Relief Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the break line Component of a relief feature. A break line relief consists of break
 *                 lines or ridgeOrValleyLines. As subclass of _CityObject, a BreaklineRelief inherits all attributes and relations,
 *                 in particular an id, names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.BreaklineReliefType#getRidgeOrValleyLines <em>Ridge Or Valley Lines</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.BreaklineReliefType#getBreaklines <em>Breaklines</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.BreaklineReliefType#getGenericApplicationPropertyOfBreaklineReliefGroup <em>Generic Application Property Of Breakline Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.BreaklineReliefType#getGenericApplicationPropertyOfBreaklineRelief <em>Generic Application Property Of Breakline Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getBreaklineReliefType()
 * @model extendedMetaData="name='BreaklineReliefType' kind='elementOnly'"
 * @generated
 */
public interface BreaklineReliefType extends AbstractReliefComponentType {
	/**
	 * Returns the value of the '<em><b>Ridge Or Valley Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ridge Or Valley Lines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ridge Or Valley Lines</em>' containment reference.
	 * @see #setRidgeOrValleyLines(MultiCurvePropertyType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getBreaklineReliefType_RidgeOrValleyLines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ridgeOrValleyLines' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getRidgeOrValleyLines();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.BreaklineReliefType#getRidgeOrValleyLines <em>Ridge Or Valley Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ridge Or Valley Lines</em>' containment reference.
	 * @see #getRidgeOrValleyLines()
	 * @generated
	 */
	void setRidgeOrValleyLines(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Breaklines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breaklines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breaklines</em>' containment reference.
	 * @see #setBreaklines(MultiCurvePropertyType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getBreaklineReliefType_Breaklines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='breaklines' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurvePropertyType getBreaklines();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.BreaklineReliefType#getBreaklines <em>Breaklines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breaklines</em>' containment reference.
	 * @see #getBreaklines()
	 * @generated
	 */
	void setBreaklines(MultiCurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Breakline Relief Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Breakline Relief Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Breakline Relief Group</em>' attribute list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getBreaklineReliefType_GenericApplicationPropertyOfBreaklineReliefGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfBreaklineRelief:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfBreaklineReliefGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Breakline Relief</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Breakline Relief</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Breakline Relief</em>' containment reference list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getBreaklineReliefType_GenericApplicationPropertyOfBreaklineRelief()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBreaklineRelief' namespace='##targetNamespace' group='_GenericApplicationPropertyOfBreaklineRelief:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfBreaklineRelief();

} // BreaklineReliefType
