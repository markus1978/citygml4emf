/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.relief.ReliefPackage
 * @generated
 */
public interface ReliefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReliefFactory eINSTANCE = net.opengis.citygml.relief.impl.ReliefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Breakline Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breakline Relief Type</em>'.
	 * @generated
	 */
	BreaklineReliefType createBreaklineReliefType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Grid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Property Type</em>'.
	 * @generated
	 */
	GridPropertyType createGridPropertyType();

	/**
	 * Returns a new object of class '<em>Mass Point Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mass Point Relief Type</em>'.
	 * @generated
	 */
	MassPointReliefType createMassPointReliefType();

	/**
	 * Returns a new object of class '<em>Raster Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Relief Type</em>'.
	 * @generated
	 */
	RasterReliefType createRasterReliefType();

	/**
	 * Returns a new object of class '<em>Component Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Property Type</em>'.
	 * @generated
	 */
	ReliefComponentPropertyType createReliefComponentPropertyType();

	/**
	 * Returns a new object of class '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Type</em>'.
	 * @generated
	 */
	ReliefFeatureType createReliefFeatureType();

	/**
	 * Returns a new object of class '<em>Tin Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tin Property Type</em>'.
	 * @generated
	 */
	TinPropertyType createTinPropertyType();

	/**
	 * Returns a new object of class '<em>TIN Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TIN Relief Type</em>'.
	 * @generated
	 */
	TINReliefType createTINReliefType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReliefPackage getReliefPackage();

} //ReliefFactory
