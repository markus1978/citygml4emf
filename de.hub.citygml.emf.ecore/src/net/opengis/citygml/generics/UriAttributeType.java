/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uri Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.generics.UriAttributeType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.generics.GenericsPackage#getUriAttributeType()
 * @model extendedMetaData="name='UriAttributeType' kind='elementOnly'"
 * @generated
 */
public interface UriAttributeType extends AbstractGenericAttributeType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.citygml.generics.GenericsPackage#getUriAttributeType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.UriAttributeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // UriAttributeType
