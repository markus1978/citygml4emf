/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.CitygmlPackage
 * @generated
 */
public interface CitygmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CitygmlFactory eINSTANCE = net.opengis.citygml.impl.CitygmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Address Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Property Type</em>'.
	 * @generated
	 */
	AddressPropertyType createAddressPropertyType();

	/**
	 * Returns a new object of class '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Type</em>'.
	 * @generated
	 */
	AddressType createAddressType();

	/**
	 * Returns a new object of class '<em>City Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City Model Type</em>'.
	 * @generated
	 */
	CityModelType createCityModelType();

	/**
	 * Returns a new object of class '<em>External Object Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Object Reference Type</em>'.
	 * @generated
	 */
	ExternalObjectReferenceType createExternalObjectReferenceType();

	/**
	 * Returns a new object of class '<em>External Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference Type</em>'.
	 * @generated
	 */
	ExternalReferenceType createExternalReferenceType();

	/**
	 * Returns a new object of class '<em>Generalization Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Relation Type</em>'.
	 * @generated
	 */
	GeneralizationRelationType createGeneralizationRelationType();

	/**
	 * Returns a new object of class '<em>Implicit Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Geometry Type</em>'.
	 * @generated
	 */
	ImplicitGeometryType createImplicitGeometryType();

	/**
	 * Returns a new object of class '<em>Implicit Representation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Representation Property Type</em>'.
	 * @generated
	 */
	ImplicitRepresentationPropertyType createImplicitRepresentationPropertyType();

	/**
	 * Returns a new object of class '<em>Xal Address Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xal Address Property Type</em>'.
	 * @generated
	 */
	XalAddressPropertyType createXalAddressPropertyType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CitygmlPackage getCitygmlPackage();

} //CitygmlFactory
