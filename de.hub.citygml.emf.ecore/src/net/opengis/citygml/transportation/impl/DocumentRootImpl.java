/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import net.opengis.citygml.transportation.AbstractTransportationObjectType;
import net.opengis.citygml.transportation.AuxiliaryTrafficAreaType;
import net.opengis.citygml.transportation.DocumentRoot;
import net.opengis.citygml.transportation.RailwayType;
import net.opengis.citygml.transportation.RoadType;
import net.opengis.citygml.transportation.SquareType;
import net.opengis.citygml.transportation.TrackType;
import net.opengis.citygml.transportation.TrafficAreaType;
import net.opengis.citygml.transportation.TransportationComplexType;
import net.opengis.citygml.transportation.TransportationPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfAuxiliaryTrafficArea <em>Generic Application Property Of Auxiliary Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfRailway <em>Generic Application Property Of Railway</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfRoad <em>Generic Application Property Of Road</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfSquare <em>Generic Application Property Of Square</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfTrack <em>Generic Application Property Of Track</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfTrafficArea <em>Generic Application Property Of Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfTransportationComplex <em>Generic Application Property Of Transportation Complex</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getGenericApplicationPropertyOfTransportationObject <em>Generic Application Property Of Transportation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getTransportationObject <em>Transportation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getAuxiliaryTrafficArea <em>Auxiliary Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getRailway <em>Railway</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getTransportationComplex <em>Transportation Complex</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getRoad <em>Road</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getSquare <em>Square</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.DocumentRootImpl#getTrafficArea <em>Traffic Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TransportationPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TransportationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TransportationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfAuxiliaryTrafficArea() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfAuxiliaryTrafficArea(EObject newGenericApplicationPropertyOfAuxiliaryTrafficArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA, newGenericApplicationPropertyOfAuxiliaryTrafficArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfRailway() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfRailway(EObject newGenericApplicationPropertyOfRailway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY, newGenericApplicationPropertyOfRailway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfRoad() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfRoad(EObject newGenericApplicationPropertyOfRoad, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD, newGenericApplicationPropertyOfRoad, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfSquare() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfSquare(EObject newGenericApplicationPropertyOfSquare, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE, newGenericApplicationPropertyOfSquare, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTrack() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTrack(EObject newGenericApplicationPropertyOfTrack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK, newGenericApplicationPropertyOfTrack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTrafficArea() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTrafficArea(EObject newGenericApplicationPropertyOfTrafficArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA, newGenericApplicationPropertyOfTrafficArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTransportationComplex() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTransportationComplex(EObject newGenericApplicationPropertyOfTransportationComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX, newGenericApplicationPropertyOfTransportationComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTransportationObject() {
		return (EObject)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTransportationObject(EObject newGenericApplicationPropertyOfTransportationObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT, newGenericApplicationPropertyOfTransportationObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransportationObjectType getTransportationObject() {
		return (AbstractTransportationObjectType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportationObject(AbstractTransportationObjectType newTransportationObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT, newTransportationObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportationObject(AbstractTransportationObjectType newTransportationObject) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_OBJECT, newTransportationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryTrafficAreaType getAuxiliaryTrafficArea() {
		return (AuxiliaryTrafficAreaType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxiliaryTrafficArea(AuxiliaryTrafficAreaType newAuxiliaryTrafficArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA, newAuxiliaryTrafficArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliaryTrafficArea(AuxiliaryTrafficAreaType newAuxiliaryTrafficArea) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA, newAuxiliaryTrafficArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayType getRailway() {
		return (RailwayType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRailway(RailwayType newRailway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY, newRailway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRailway(RailwayType newRailway) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__RAILWAY, newRailway);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationComplexType getTransportationComplex() {
		return (TransportationComplexType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportationComplex(TransportationComplexType newTransportationComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX, newTransportationComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportationComplex(TransportationComplexType newTransportationComplex) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX, newTransportationComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadType getRoad() {
		return (RoadType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoad(RoadType newRoad, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD, newRoad, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoad(RoadType newRoad) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__ROAD, newRoad);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareType getSquare() {
		return (SquareType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSquare(SquareType newSquare, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE, newSquare, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSquare(SquareType newSquare) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__SQUARE, newSquare);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackType getTrack() {
		return (TrackType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrack(TrackType newTrack, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK, newTrack, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrack(TrackType newTrack) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__TRACK, newTrack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrafficAreaType getTrafficArea() {
		return (TrafficAreaType)getMixed().get(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrafficArea(TrafficAreaType newTrafficArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA, newTrafficArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrafficArea(TrafficAreaType newTrafficArea) {
		((FeatureMap.Internal)getMixed()).set(TransportationPackage.Literals.DOCUMENT_ROOT__TRAFFIC_AREA, newTrafficArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TransportationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TransportationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA:
				return basicSetGenericApplicationPropertyOfAuxiliaryTrafficArea(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY:
				return basicSetGenericApplicationPropertyOfRailway(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD:
				return basicSetGenericApplicationPropertyOfRoad(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE:
				return basicSetGenericApplicationPropertyOfSquare(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK:
				return basicSetGenericApplicationPropertyOfTrack(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA:
				return basicSetGenericApplicationPropertyOfTrafficArea(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX:
				return basicSetGenericApplicationPropertyOfTransportationComplex(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT:
				return basicSetGenericApplicationPropertyOfTransportationObject(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_OBJECT:
				return basicSetTransportationObject(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA:
				return basicSetAuxiliaryTrafficArea(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__RAILWAY:
				return basicSetRailway(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX:
				return basicSetTransportationComplex(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__ROAD:
				return basicSetRoad(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__SQUARE:
				return basicSetSquare(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__TRACK:
				return basicSetTrack(null, msgs);
			case TransportationPackage.DOCUMENT_ROOT__TRAFFIC_AREA:
				return basicSetTrafficArea(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransportationPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TransportationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TransportationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA:
				return getGenericApplicationPropertyOfAuxiliaryTrafficArea();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY:
				return getGenericApplicationPropertyOfRailway();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD:
				return getGenericApplicationPropertyOfRoad();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE:
				return getGenericApplicationPropertyOfSquare();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK:
				return getGenericApplicationPropertyOfTrack();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA:
				return getGenericApplicationPropertyOfTrafficArea();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX:
				return getGenericApplicationPropertyOfTransportationComplex();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT:
				return getGenericApplicationPropertyOfTransportationObject();
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_OBJECT:
				return getTransportationObject();
			case TransportationPackage.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA:
				return getAuxiliaryTrafficArea();
			case TransportationPackage.DOCUMENT_ROOT__RAILWAY:
				return getRailway();
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX:
				return getTransportationComplex();
			case TransportationPackage.DOCUMENT_ROOT__ROAD:
				return getRoad();
			case TransportationPackage.DOCUMENT_ROOT__SQUARE:
				return getSquare();
			case TransportationPackage.DOCUMENT_ROOT__TRACK:
				return getTrack();
			case TransportationPackage.DOCUMENT_ROOT__TRAFFIC_AREA:
				return getTrafficArea();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransportationPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_OBJECT:
				setTransportationObject((AbstractTransportationObjectType)newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA:
				setAuxiliaryTrafficArea((AuxiliaryTrafficAreaType)newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__RAILWAY:
				setRailway((RailwayType)newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX:
				setTransportationComplex((TransportationComplexType)newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__ROAD:
				setRoad((RoadType)newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__SQUARE:
				setSquare((SquareType)newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRACK:
				setTrack((TrackType)newValue);
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRAFFIC_AREA:
				setTrafficArea((TrafficAreaType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TransportationPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TransportationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TransportationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_OBJECT:
				setTransportationObject((AbstractTransportationObjectType)null);
				return;
			case TransportationPackage.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA:
				setAuxiliaryTrafficArea((AuxiliaryTrafficAreaType)null);
				return;
			case TransportationPackage.DOCUMENT_ROOT__RAILWAY:
				setRailway((RailwayType)null);
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX:
				setTransportationComplex((TransportationComplexType)null);
				return;
			case TransportationPackage.DOCUMENT_ROOT__ROAD:
				setRoad((RoadType)null);
				return;
			case TransportationPackage.DOCUMENT_ROOT__SQUARE:
				setSquare((SquareType)null);
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRACK:
				setTrack((TrackType)null);
				return;
			case TransportationPackage.DOCUMENT_ROOT__TRAFFIC_AREA:
				setTrafficArea((TrafficAreaType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TransportationPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TransportationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TransportationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_AUXILIARY_TRAFFIC_AREA:
				return getGenericApplicationPropertyOfAuxiliaryTrafficArea() != null;
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RAILWAY:
				return getGenericApplicationPropertyOfRailway() != null;
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ROAD:
				return getGenericApplicationPropertyOfRoad() != null;
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SQUARE:
				return getGenericApplicationPropertyOfSquare() != null;
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRACK:
				return getGenericApplicationPropertyOfTrack() != null;
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA:
				return getGenericApplicationPropertyOfTrafficArea() != null;
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX:
				return getGenericApplicationPropertyOfTransportationComplex() != null;
			case TransportationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_OBJECT:
				return getGenericApplicationPropertyOfTransportationObject() != null;
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_OBJECT:
				return getTransportationObject() != null;
			case TransportationPackage.DOCUMENT_ROOT__AUXILIARY_TRAFFIC_AREA:
				return getAuxiliaryTrafficArea() != null;
			case TransportationPackage.DOCUMENT_ROOT__RAILWAY:
				return getRailway() != null;
			case TransportationPackage.DOCUMENT_ROOT__TRANSPORTATION_COMPLEX:
				return getTransportationComplex() != null;
			case TransportationPackage.DOCUMENT_ROOT__ROAD:
				return getRoad() != null;
			case TransportationPackage.DOCUMENT_ROOT__SQUARE:
				return getSquare() != null;
			case TransportationPackage.DOCUMENT_ROOT__TRACK:
				return getTrack() != null;
			case TransportationPackage.DOCUMENT_ROOT__TRAFFIC_AREA:
				return getTrafficArea() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
