/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.generics.DoubleAttributeType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.generics.GenericsPackage#getDoubleAttributeType()
 * @model extendedMetaData="name='DoubleAttributeType' kind='elementOnly'"
 * @generated
 */
public interface DoubleAttributeType extends AbstractGenericAttributeType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(double)
	 * @see net.opengis.citygml.generics.GenericsPackage#getDoubleAttributeType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.DoubleAttributeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.generics.DoubleAttributeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.generics.DoubleAttributeType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(double)
	 * @generated
	 */
	boolean isSetValue();

} // DoubleAttributeType
