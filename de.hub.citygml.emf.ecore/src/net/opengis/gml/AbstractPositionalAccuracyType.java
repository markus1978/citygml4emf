/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Positional Accuracy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Position error estimate (or accuracy) data. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractPositionalAccuracyType#getMeasureDescription <em>Measure Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getAbstractPositionalAccuracyType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractPositionalAccuracyType' kind='elementOnly'"
 * @generated
 */
public interface AbstractPositionalAccuracyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the position accuracy parameter(s) provided. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Description</em>' containment reference.
	 * @see #setMeasureDescription(CodeType)
	 * @see net.opengis.gml.GmlPackage#getAbstractPositionalAccuracyType_MeasureDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getMeasureDescription();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractPositionalAccuracyType#getMeasureDescription <em>Measure Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Description</em>' containment reference.
	 * @see #getMeasureDescription()
	 * @generated
	 */
	void setMeasureDescription(CodeType value);

} // AbstractPositionalAccuracyType
