/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

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
import net.opengis.citygml.transportation.TransportationFactory;
import net.opengis.citygml.transportation.TransportationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransportationFactoryImpl extends EFactoryImpl implements TransportationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransportationFactory init() {
		try {
			TransportationFactory theTransportationFactory = (TransportationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/transportation/1.0"); 
			if (theTransportationFactory != null) {
				return theTransportationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransportationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TransportationPackage.AUXILIARY_TRAFFIC_AREA_PROPERTY_TYPE: return createAuxiliaryTrafficAreaPropertyType();
			case TransportationPackage.AUXILIARY_TRAFFIC_AREA_TYPE: return createAuxiliaryTrafficAreaType();
			case TransportationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TransportationPackage.RAILWAY_TYPE: return createRailwayType();
			case TransportationPackage.ROAD_TYPE: return createRoadType();
			case TransportationPackage.SQUARE_TYPE: return createSquareType();
			case TransportationPackage.TRACK_TYPE: return createTrackType();
			case TransportationPackage.TRAFFIC_AREA_PROPERTY_TYPE: return createTrafficAreaPropertyType();
			case TransportationPackage.TRAFFIC_AREA_TYPE: return createTrafficAreaType();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE: return createTransportationComplexType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TransportationPackage.AUXILIARY_TRAFFIC_AREA_FUNCTION_TYPE:
				return createAuxiliaryTrafficAreaFunctionTypeFromString(eDataType, initialValue);
			case TransportationPackage.TRAFFIC_AREA_FUNCTION_TYPE:
				return createTrafficAreaFunctionTypeFromString(eDataType, initialValue);
			case TransportationPackage.TRAFFIC_AREA_USAGE_TYPE:
				return createTrafficAreaUsageTypeFromString(eDataType, initialValue);
			case TransportationPackage.TRAFFIC_SURFACE_MATERIAL_TYPE:
				return createTrafficSurfaceMaterialTypeFromString(eDataType, initialValue);
			case TransportationPackage.TRANSPORTATION_COMPLEX_FUNCTION_TYPE:
				return createTransportationComplexFunctionTypeFromString(eDataType, initialValue);
			case TransportationPackage.TRANSPORTATION_COMPLEX_USAGE_TYPE:
				return createTransportationComplexUsageTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TransportationPackage.AUXILIARY_TRAFFIC_AREA_FUNCTION_TYPE:
				return convertAuxiliaryTrafficAreaFunctionTypeToString(eDataType, instanceValue);
			case TransportationPackage.TRAFFIC_AREA_FUNCTION_TYPE:
				return convertTrafficAreaFunctionTypeToString(eDataType, instanceValue);
			case TransportationPackage.TRAFFIC_AREA_USAGE_TYPE:
				return convertTrafficAreaUsageTypeToString(eDataType, instanceValue);
			case TransportationPackage.TRAFFIC_SURFACE_MATERIAL_TYPE:
				return convertTrafficSurfaceMaterialTypeToString(eDataType, instanceValue);
			case TransportationPackage.TRANSPORTATION_COMPLEX_FUNCTION_TYPE:
				return convertTransportationComplexFunctionTypeToString(eDataType, instanceValue);
			case TransportationPackage.TRANSPORTATION_COMPLEX_USAGE_TYPE:
				return convertTransportationComplexUsageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryTrafficAreaPropertyType createAuxiliaryTrafficAreaPropertyType() {
		AuxiliaryTrafficAreaPropertyTypeImpl auxiliaryTrafficAreaPropertyType = new AuxiliaryTrafficAreaPropertyTypeImpl();
		return auxiliaryTrafficAreaPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryTrafficAreaType createAuxiliaryTrafficAreaType() {
		AuxiliaryTrafficAreaTypeImpl auxiliaryTrafficAreaType = new AuxiliaryTrafficAreaTypeImpl();
		return auxiliaryTrafficAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayType createRailwayType() {
		RailwayTypeImpl railwayType = new RailwayTypeImpl();
		return railwayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadType createRoadType() {
		RoadTypeImpl roadType = new RoadTypeImpl();
		return roadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareType createSquareType() {
		SquareTypeImpl squareType = new SquareTypeImpl();
		return squareType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackType createTrackType() {
		TrackTypeImpl trackType = new TrackTypeImpl();
		return trackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficAreaPropertyType createTrafficAreaPropertyType() {
		TrafficAreaPropertyTypeImpl trafficAreaPropertyType = new TrafficAreaPropertyTypeImpl();
		return trafficAreaPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficAreaType createTrafficAreaType() {
		TrafficAreaTypeImpl trafficAreaType = new TrafficAreaTypeImpl();
		return trafficAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationComplexType createTransportationComplexType() {
		TransportationComplexTypeImpl transportationComplexType = new TransportationComplexTypeImpl();
		return transportationComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAuxiliaryTrafficAreaFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuxiliaryTrafficAreaFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTrafficAreaFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrafficAreaFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTrafficAreaUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrafficAreaUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTrafficSurfaceMaterialTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrafficSurfaceMaterialTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTransportationComplexFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportationComplexFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTransportationComplexUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportationComplexUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationPackage getTransportationPackage() {
		return (TransportationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransportationPackage getPackage() {
		return TransportationPackage.eINSTANCE;
	}

} //TransportationFactoryImpl
