/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.generics.GenericsPackage
 * @generated
 */
public interface GenericsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericsFactory eINSTANCE = net.opengis.citygml.generics.impl.GenericsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Date Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Attribute Type</em>'.
	 * @generated
	 */
	DateAttributeType createDateAttributeType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Double Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Attribute Type</em>'.
	 * @generated
	 */
	DoubleAttributeType createDoubleAttributeType();

	/**
	 * Returns a new object of class '<em>Generic City Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic City Object Type</em>'.
	 * @generated
	 */
	GenericCityObjectType createGenericCityObjectType();

	/**
	 * Returns a new object of class '<em>Int Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Attribute Type</em>'.
	 * @generated
	 */
	IntAttributeType createIntAttributeType();

	/**
	 * Returns a new object of class '<em>String Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Attribute Type</em>'.
	 * @generated
	 */
	StringAttributeType createStringAttributeType();

	/**
	 * Returns a new object of class '<em>Uri Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri Attribute Type</em>'.
	 * @generated
	 */
	UriAttributeType createUriAttributeType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericsPackage getGenericsPackage();

} //GenericsFactory
