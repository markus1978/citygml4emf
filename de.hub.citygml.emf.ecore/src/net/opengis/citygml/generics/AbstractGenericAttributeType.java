/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Generic Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Generic (user defined) attributes may be used to represent attributes which are not covered
 *                 explicitly by the CityGML schema. Generic attributes must be used with care; they shall only be used if there is
 *                 no appropiate attribute available in the overall CityGML schema. Oherwise, problems concerning semantic
 *                 interoperability may arise. A generic attribute has a name and a value, which has further subclasses
 *                 (IntAttrribute, StringAttribute, ...). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.generics.AbstractGenericAttributeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.generics.GenericsPackage#getAbstractGenericAttributeType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGenericAttributeType' kind='empty'"
 * @generated
 */
public interface AbstractGenericAttributeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.citygml.generics.GenericsPackage#getAbstractGenericAttributeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.AbstractGenericAttributeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractGenericAttributeType
