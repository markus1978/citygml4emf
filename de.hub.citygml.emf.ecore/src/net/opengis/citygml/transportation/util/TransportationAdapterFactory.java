/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.util;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.transportation.AbstractTransportationObjectType;
import net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType;
import net.opengis.citygml.transportation.AuxiliaryTrafficAreaType;
import net.opengis.citygml.transportation.DocumentRoot;
import net.opengis.citygml.transportation.RailwayType;
import net.opengis.citygml.transportation.RoadType;
import net.opengis.citygml.transportation.SquareType;
import net.opengis.citygml.transportation.TrackType;
import net.opengis.citygml.transportation.TrafficAreaPropertyType;
import net.opengis.citygml.transportation.TrafficAreaType;
import net.opengis.citygml.transportation.TransportationComplexType;
import net.opengis.citygml.transportation.TransportationPackage;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AssociationType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.transportation.TransportationPackage
 * @generated
 */
public class TransportationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransportationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TransportationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportationSwitch<Adapter> modelSwitch =
		new TransportationSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTransportationObjectType(AbstractTransportationObjectType object) {
				return createAbstractTransportationObjectTypeAdapter();
			}
			@Override
			public Adapter caseAuxiliaryTrafficAreaPropertyType(AuxiliaryTrafficAreaPropertyType object) {
				return createAuxiliaryTrafficAreaPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAuxiliaryTrafficAreaType(AuxiliaryTrafficAreaType object) {
				return createAuxiliaryTrafficAreaTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseRailwayType(RailwayType object) {
				return createRailwayTypeAdapter();
			}
			@Override
			public Adapter caseRoadType(RoadType object) {
				return createRoadTypeAdapter();
			}
			@Override
			public Adapter caseSquareType(SquareType object) {
				return createSquareTypeAdapter();
			}
			@Override
			public Adapter caseTrackType(TrackType object) {
				return createTrackTypeAdapter();
			}
			@Override
			public Adapter caseTrafficAreaPropertyType(TrafficAreaPropertyType object) {
				return createTrafficAreaPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTrafficAreaType(TrafficAreaType object) {
				return createTrafficAreaTypeAdapter();
			}
			@Override
			public Adapter caseTransportationComplexType(TransportationComplexType object) {
				return createTransportationComplexTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureType(AbstractFeatureType object) {
				return createAbstractFeatureTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCityObjectType(AbstractCityObjectType object) {
				return createAbstractCityObjectTypeAdapter();
			}
			@Override
			public Adapter caseAssociationType(AssociationType object) {
				return createAssociationTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.AbstractTransportationObjectType <em>Abstract Transportation Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.AbstractTransportationObjectType
	 * @generated
	 */
	public Adapter createAbstractTransportationObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType <em>Auxiliary Traffic Area Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType
	 * @generated
	 */
	public Adapter createAuxiliaryTrafficAreaPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType <em>Auxiliary Traffic Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.AuxiliaryTrafficAreaType
	 * @generated
	 */
	public Adapter createAuxiliaryTrafficAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.RailwayType <em>Railway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.RailwayType
	 * @generated
	 */
	public Adapter createRailwayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.RoadType <em>Road Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.RoadType
	 * @generated
	 */
	public Adapter createRoadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.SquareType <em>Square Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.SquareType
	 * @generated
	 */
	public Adapter createSquareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.TrackType <em>Track Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.TrackType
	 * @generated
	 */
	public Adapter createTrackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.TrafficAreaPropertyType <em>Traffic Area Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.TrafficAreaPropertyType
	 * @generated
	 */
	public Adapter createTrafficAreaPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.TrafficAreaType <em>Traffic Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.TrafficAreaType
	 * @generated
	 */
	public Adapter createTrafficAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.transportation.TransportationComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.transportation.TransportationComplexType
	 * @generated
	 */
	public Adapter createTransportationComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGMLType <em>Abstract GML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGMLType
	 * @generated
	 */
	public Adapter createAbstractGMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractFeatureType <em>Abstract Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractFeatureType
	 * @generated
	 */
	public Adapter createAbstractFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.AbstractCityObjectType <em>Abstract City Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.AbstractCityObjectType
	 * @generated
	 */
	public Adapter createAbstractCityObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AssociationType
	 * @generated
	 */
	public Adapter createAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TransportationAdapterFactory
