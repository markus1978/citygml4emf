/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityobjectgroup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage
 * @generated
 */
public interface CityobjectgroupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CityobjectgroupFactory eINSTANCE = net.opengis.citygml.cityobjectgroup.impl.CityobjectgroupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>City Object Group Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City Object Group Member Type</em>'.
	 * @generated
	 */
	CityObjectGroupMemberType createCityObjectGroupMemberType();

	/**
	 * Returns a new object of class '<em>City Object Group Parent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City Object Group Parent Type</em>'.
	 * @generated
	 */
	CityObjectGroupParentType createCityObjectGroupParentType();

	/**
	 * Returns a new object of class '<em>City Object Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City Object Group Type</em>'.
	 * @generated
	 */
	CityObjectGroupType createCityObjectGroupType();

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
	CityobjectgroupPackage getCityobjectgroupPackage();

} //CityobjectgroupFactory
