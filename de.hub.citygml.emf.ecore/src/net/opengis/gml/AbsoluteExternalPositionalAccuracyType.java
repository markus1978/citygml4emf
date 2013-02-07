/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute External Positional Accuracy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Closeness of reported coordinate values to values accepted as or being true. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.AbsoluteExternalPositionalAccuracyType#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getAbsoluteExternalPositionalAccuracyType()
 * @model extendedMetaData="name='AbsoluteExternalPositionalAccuracyType' kind='elementOnly'"
 * @generated
 */
public interface AbsoluteExternalPositionalAccuracyType extends AbstractPositionalAccuracyType {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A quantitative result defined by the evaluation procedure used, and identified by the measureDescription. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(MeasureType)
	 * @see net.opengis.gml.GmlPackage#getAbsoluteExternalPositionalAccuracyType_Result()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getResult();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbsoluteExternalPositionalAccuracyType#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(MeasureType value);

} // AbsoluteExternalPositionalAccuracyType
