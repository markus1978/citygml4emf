/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.waterbody.WaterbodyPackage
 * @generated
 */
public interface WaterbodyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WaterbodyFactory eINSTANCE = net.opengis.citygml.waterbody.impl.WaterbodyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bounded By Water Surface Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded By Water Surface Property Type</em>'.
	 * @generated
	 */
	BoundedByWaterSurfacePropertyType createBoundedByWaterSurfacePropertyType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Water Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Body Type</em>'.
	 * @generated
	 */
	WaterBodyType createWaterBodyType();

	/**
	 * Returns a new object of class '<em>Water Closure Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Closure Surface Type</em>'.
	 * @generated
	 */
	WaterClosureSurfaceType createWaterClosureSurfaceType();

	/**
	 * Returns a new object of class '<em>Water Ground Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Ground Surface Type</em>'.
	 * @generated
	 */
	WaterGroundSurfaceType createWaterGroundSurfaceType();

	/**
	 * Returns a new object of class '<em>Water Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Surface Type</em>'.
	 * @generated
	 */
	WaterSurfaceType createWaterSurfaceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WaterbodyPackage getWaterbodyPackage();

} //WaterbodyFactory
