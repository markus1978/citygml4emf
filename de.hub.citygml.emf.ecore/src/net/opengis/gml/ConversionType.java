/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concrete operation on coordinates that does not include any change of Datum. The best-known example of a coordinate conversion is a map projection. The parameters describing coordinate conversions are defined rather than empirically derived. Note that some conversions have no parameters.
 * 
 * This concrete complexType can be used with all operation methods, without using an Application Schema that defines operation-method-specialized element names and contents, especially for methods with only one Conversion instance. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.ConversionType#getUsesMethod <em>Uses Method</em>}</li>
 *   <li>{@link net.opengis.gml.ConversionType#getUsesValue <em>Uses Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getConversionType()
 * @model extendedMetaData="name='ConversionType' kind='elementOnly'"
 * @generated
 */
public interface ConversionType extends AbstractGeneralConversionType {
	/**
	 * Returns the value of the '<em><b>Uses Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Association to the operation method used by this coordinate operation. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Method</em>' containment reference.
	 * @see #setUsesMethod(OperationMethodRefType)
	 * @see net.opengis.gml.GmlPackage#getConversionType_UsesMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='usesMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationMethodRefType getUsesMethod();

	/**
	 * Sets the value of the '{@link net.opengis.gml.ConversionType#getUsesMethod <em>Uses Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Method</em>' containment reference.
	 * @see #getUsesMethod()
	 * @generated
	 */
	void setUsesMethod(OperationMethodRefType value);

	/**
	 * Returns the value of the '<em><b>Uses Value</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.ParameterValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered list of composition associations to the set of parameter values used by this conversion operation. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Value</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getConversionType_UsesValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usesValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterValueType> getUsesValue();

} // ConversionType
