/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import java.util.Collection;

import net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType;
import net.opengis.citygml.transportation.TrafficAreaPropertyType;
import net.opengis.citygml.transportation.TransportationComplexType;
import net.opengis.citygml.transportation.TransportationPackage;
import net.opengis.gml.GeometricComplexPropertyType;
import net.opengis.gml.MultiSurfacePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getTrafficArea <em>Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getAuxiliaryTrafficArea <em>Auxiliary Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getLod0Network <em>Lod0 Network</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getGenericApplicationPropertyOfTransportationComplexGroup <em>Generic Application Property Of Transportation Complex Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TransportationComplexTypeImpl#getGenericApplicationPropertyOfTransportationComplex <em>Generic Application Property Of Transportation Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportationComplexTypeImpl extends AbstractTransportationObjectTypeImpl implements TransportationComplexType {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> function;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> usage;

	/**
	 * The cached value of the '{@link #getTrafficArea() <em>Traffic Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrafficArea()
	 * @generated
	 * @ordered
	 */
	protected EList<TrafficAreaPropertyType> trafficArea;

	/**
	 * The cached value of the '{@link #getAuxiliaryTrafficArea() <em>Auxiliary Traffic Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryTrafficArea()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryTrafficAreaPropertyType> auxiliaryTrafficArea;

	/**
	 * The cached value of the '{@link #getLod0Network() <em>Lod0 Network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod0Network()
	 * @generated
	 * @ordered
	 */
	protected EList<GeometricComplexPropertyType> lod0Network;

	/**
	 * The cached value of the '{@link #getLod1MultiSurface() <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod1MultiSurface;

	/**
	 * The cached value of the '{@link #getLod2MultiSurface() <em>Lod2 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod2MultiSurface;

	/**
	 * The cached value of the '{@link #getLod3MultiSurface() <em>Lod3 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod3MultiSurface;

	/**
	 * The cached value of the '{@link #getLod4MultiSurface() <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod4MultiSurface;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTransportationComplexGroup() <em>Generic Application Property Of Transportation Complex Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTransportationComplexGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTransportationComplexGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportationComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsage() {
		if (usage == null) {
			usage = new EDataTypeEList<String>(String.class, this, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrafficAreaPropertyType> getTrafficArea() {
		if (trafficArea == null) {
			trafficArea = new EObjectContainmentEList<TrafficAreaPropertyType>(TrafficAreaPropertyType.class, this, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA);
		}
		return trafficArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryTrafficAreaPropertyType> getAuxiliaryTrafficArea() {
		if (auxiliaryTrafficArea == null) {
			auxiliaryTrafficArea = new EObjectContainmentEList<AuxiliaryTrafficAreaPropertyType>(AuxiliaryTrafficAreaPropertyType.class, this, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA);
		}
		return auxiliaryTrafficArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeometricComplexPropertyType> getLod0Network() {
		if (lod0Network == null) {
			lod0Network = new EObjectContainmentEList<GeometricComplexPropertyType>(GeometricComplexPropertyType.class, this, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK);
		}
		return lod0Network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod1MultiSurface() {
		return lod1MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1MultiSurface(MultiSurfacePropertyType newLod1MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod1MultiSurface = lod1MultiSurface;
		lod1MultiSurface = newLod1MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE, oldLod1MultiSurface, newLod1MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1MultiSurface(MultiSurfacePropertyType newLod1MultiSurface) {
		if (newLod1MultiSurface != lod1MultiSurface) {
			NotificationChain msgs = null;
			if (lod1MultiSurface != null)
				msgs = ((InternalEObject)lod1MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			if (newLod1MultiSurface != null)
				msgs = ((InternalEObject)newLod1MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod1MultiSurface(newLod1MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE, newLod1MultiSurface, newLod1MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod2MultiSurface() {
		return lod2MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2MultiSurface(MultiSurfacePropertyType newLod2MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod2MultiSurface = lod2MultiSurface;
		lod2MultiSurface = newLod2MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE, oldLod2MultiSurface, newLod2MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2MultiSurface(MultiSurfacePropertyType newLod2MultiSurface) {
		if (newLod2MultiSurface != lod2MultiSurface) {
			NotificationChain msgs = null;
			if (lod2MultiSurface != null)
				msgs = ((InternalEObject)lod2MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			if (newLod2MultiSurface != null)
				msgs = ((InternalEObject)newLod2MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod2MultiSurface(newLod2MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE, newLod2MultiSurface, newLod2MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod3MultiSurface() {
		return lod3MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3MultiSurface(MultiSurfacePropertyType newLod3MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod3MultiSurface = lod3MultiSurface;
		lod3MultiSurface = newLod3MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE, oldLod3MultiSurface, newLod3MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3MultiSurface(MultiSurfacePropertyType newLod3MultiSurface) {
		if (newLod3MultiSurface != lod3MultiSurface) {
			NotificationChain msgs = null;
			if (lod3MultiSurface != null)
				msgs = ((InternalEObject)lod3MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			if (newLod3MultiSurface != null)
				msgs = ((InternalEObject)newLod3MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod3MultiSurface(newLod3MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE, newLod3MultiSurface, newLod3MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod4MultiSurface() {
		return lod4MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4MultiSurface(MultiSurfacePropertyType newLod4MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod4MultiSurface = lod4MultiSurface;
		lod4MultiSurface = newLod4MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4MultiSurface(MultiSurfacePropertyType newLod4MultiSurface) {
		if (newLod4MultiSurface != lod4MultiSurface) {
			NotificationChain msgs = null;
			if (lod4MultiSurface != null)
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTransportationComplexGroup() {
		if (genericApplicationPropertyOfTransportationComplexGroup == null) {
			genericApplicationPropertyOfTransportationComplexGroup = new BasicFeatureMap(this, TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP);
		}
		return genericApplicationPropertyOfTransportationComplexGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTransportationComplex() {
		return getGenericApplicationPropertyOfTransportationComplexGroup().list(TransportationPackage.Literals.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA:
				return ((InternalEList<?>)getTrafficArea()).basicRemove(otherEnd, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA:
				return ((InternalEList<?>)getAuxiliaryTrafficArea()).basicRemove(otherEnd, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK:
				return ((InternalEList<?>)getLod0Network()).basicRemove(otherEnd, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE:
				return basicSetLod1MultiSurface(null, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE:
				return basicSetLod2MultiSurface(null, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE:
				return basicSetLod3MultiSurface(null, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTransportationComplexGroup()).basicRemove(otherEnd, msgs);
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTransportationComplex()).basicRemove(otherEnd, msgs);
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
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__FUNCTION:
				return getFunction();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__USAGE:
				return getUsage();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA:
				return getTrafficArea();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA:
				return getAuxiliaryTrafficArea();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK:
				return getLod0Network();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE:
				return getLod1MultiSurface();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE:
				return getLod2MultiSurface();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE:
				return getLod3MultiSurface();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTransportationComplexGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTransportationComplexGroup()).getWrapper();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX:
				return getGenericApplicationPropertyOfTransportationComplex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA:
				getTrafficArea().clear();
				getTrafficArea().addAll((Collection<? extends TrafficAreaPropertyType>)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA:
				getAuxiliaryTrafficArea().clear();
				getAuxiliaryTrafficArea().addAll((Collection<? extends AuxiliaryTrafficAreaPropertyType>)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK:
				getLod0Network().clear();
				getLod0Network().addAll((Collection<? extends GeometricComplexPropertyType>)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTransportationComplexGroup()).set(newValue);
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
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__USAGE:
				getUsage().clear();
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA:
				getTrafficArea().clear();
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA:
				getAuxiliaryTrafficArea().clear();
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK:
				getLod0Network().clear();
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)null);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)null);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)null);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP:
				getGenericApplicationPropertyOfTransportationComplexGroup().clear();
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
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__TRAFFIC_AREA:
				return trafficArea != null && !trafficArea.isEmpty();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__AUXILIARY_TRAFFIC_AREA:
				return auxiliaryTrafficArea != null && !auxiliaryTrafficArea.isEmpty();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD0_NETWORK:
				return lod0Network != null && !lod0Network.isEmpty();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD1_MULTI_SURFACE:
				return lod1MultiSurface != null;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD2_MULTI_SURFACE:
				return lod2MultiSurface != null;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD3_MULTI_SURFACE:
				return lod3MultiSurface != null;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX_GROUP:
				return genericApplicationPropertyOfTransportationComplexGroup != null && !genericApplicationPropertyOfTransportationComplexGroup.isEmpty();
			case TransportationPackage.TRANSPORTATION_COMPLEX_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRANSPORTATION_COMPLEX:
				return !getGenericApplicationPropertyOfTransportationComplex().isEmpty();
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
		result.append(" (function: ");
		result.append(function);
		result.append(", usage: ");
		result.append(usage);
		result.append(", genericApplicationPropertyOfTransportationComplexGroup: ");
		result.append(genericApplicationPropertyOfTransportationComplexGroup);
		result.append(')');
		return result.toString();
	}

} //TransportationComplexTypeImpl
