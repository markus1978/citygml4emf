/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.transportation.TransportationPackage
 * @generated
 */
public interface TransportationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransportationFactory eINSTANCE = net.opengis.citygml.transportation.impl.TransportationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Auxiliary Traffic Area Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auxiliary Traffic Area Property Type</em>'.
	 * @generated
	 */
	AuxiliaryTrafficAreaPropertyType createAuxiliaryTrafficAreaPropertyType();

	/**
	 * Returns a new object of class '<em>Auxiliary Traffic Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auxiliary Traffic Area Type</em>'.
	 * @generated
	 */
	AuxiliaryTrafficAreaType createAuxiliaryTrafficAreaType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Railway Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Railway Type</em>'.
	 * @generated
	 */
	RailwayType createRailwayType();

	/**
	 * Returns a new object of class '<em>Road Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road Type</em>'.
	 * @generated
	 */
	RoadType createRoadType();

	/**
	 * Returns a new object of class '<em>Square Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Square Type</em>'.
	 * @generated
	 */
	SquareType createSquareType();

	/**
	 * Returns a new object of class '<em>Track Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Track Type</em>'.
	 * @generated
	 */
	TrackType createTrackType();

	/**
	 * Returns a new object of class '<em>Traffic Area Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Area Property Type</em>'.
	 * @generated
	 */
	TrafficAreaPropertyType createTrafficAreaPropertyType();

	/**
	 * Returns a new object of class '<em>Traffic Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traffic Area Type</em>'.
	 * @generated
	 */
	TrafficAreaType createTrafficAreaType();

	/**
	 * Returns a new object of class '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type</em>'.
	 * @generated
	 */
	TransportationComplexType createTransportationComplexType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransportationPackage getTransportationPackage();

} //TransportationFactory
