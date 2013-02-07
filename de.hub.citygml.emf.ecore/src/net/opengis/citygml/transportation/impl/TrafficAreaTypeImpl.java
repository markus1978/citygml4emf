/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import java.util.Collection;

import net.opengis.citygml.transportation.TrafficAreaType;
import net.opengis.citygml.transportation.TransportationPackage;
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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traffic Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getSurfaceMaterial <em>Surface Material</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getGenericApplicationPropertyOfTrafficAreaGroup <em>Generic Application Property Of Traffic Area Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.TrafficAreaTypeImpl#getGenericApplicationPropertyOfTrafficArea <em>Generic Application Property Of Traffic Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrafficAreaTypeImpl extends AbstractTransportationObjectTypeImpl implements TrafficAreaType {
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
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> function;

	/**
	 * The default value of the '{@link #getSurfaceMaterial() <em>Surface Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final String SURFACE_MATERIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurfaceMaterial() <em>Surface Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceMaterial()
	 * @generated
	 * @ordered
	 */
	protected String surfaceMaterial = SURFACE_MATERIAL_EDEFAULT;

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
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTrafficAreaGroup() <em>Generic Application Property Of Traffic Area Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTrafficAreaGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTrafficAreaGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficAreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.TRAFFIC_AREA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsage() {
		if (usage == null) {
			usage = new EDataTypeEList<String>(String.class, this, TransportationPackage.TRAFFIC_AREA_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, TransportationPackage.TRAFFIC_AREA_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurfaceMaterial() {
		return surfaceMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceMaterial(String newSurfaceMaterial) {
		String oldSurfaceMaterial = surfaceMaterial;
		surfaceMaterial = newSurfaceMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_TYPE__SURFACE_MATERIAL, oldSurfaceMaterial, surfaceMaterial));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE, oldLod2MultiSurface, newLod2MultiSurface);
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
				msgs = ((InternalEObject)lod2MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			if (newLod2MultiSurface != null)
				msgs = ((InternalEObject)newLod2MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod2MultiSurface(newLod2MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE, newLod2MultiSurface, newLod2MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE, oldLod3MultiSurface, newLod3MultiSurface);
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
				msgs = ((InternalEObject)lod3MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			if (newLod3MultiSurface != null)
				msgs = ((InternalEObject)newLod3MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod3MultiSurface(newLod3MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE, newLod3MultiSurface, newLod3MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
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
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTrafficAreaGroup() {
		if (genericApplicationPropertyOfTrafficAreaGroup == null) {
			genericApplicationPropertyOfTrafficAreaGroup = new BasicFeatureMap(this, TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP);
		}
		return genericApplicationPropertyOfTrafficAreaGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTrafficArea() {
		return getGenericApplicationPropertyOfTrafficAreaGroup().list(TransportationPackage.Literals.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE:
				return basicSetLod2MultiSurface(null, msgs);
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE:
				return basicSetLod3MultiSurface(null, msgs);
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTrafficAreaGroup()).basicRemove(otherEnd, msgs);
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTrafficArea()).basicRemove(otherEnd, msgs);
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
			case TransportationPackage.TRAFFIC_AREA_TYPE__USAGE:
				return getUsage();
			case TransportationPackage.TRAFFIC_AREA_TYPE__FUNCTION:
				return getFunction();
			case TransportationPackage.TRAFFIC_AREA_TYPE__SURFACE_MATERIAL:
				return getSurfaceMaterial();
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE:
				return getLod2MultiSurface();
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE:
				return getLod3MultiSurface();
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTrafficAreaGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTrafficAreaGroup()).getWrapper();
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA:
				return getGenericApplicationPropertyOfTrafficArea();
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
			case TransportationPackage.TRAFFIC_AREA_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__SURFACE_MATERIAL:
				setSurfaceMaterial((String)newValue);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTrafficAreaGroup()).set(newValue);
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
			case TransportationPackage.TRAFFIC_AREA_TYPE__USAGE:
				getUsage().clear();
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__SURFACE_MATERIAL:
				setSurfaceMaterial(SURFACE_MATERIAL_EDEFAULT);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)null);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)null);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP:
				getGenericApplicationPropertyOfTrafficAreaGroup().clear();
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
			case TransportationPackage.TRAFFIC_AREA_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case TransportationPackage.TRAFFIC_AREA_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case TransportationPackage.TRAFFIC_AREA_TYPE__SURFACE_MATERIAL:
				return SURFACE_MATERIAL_EDEFAULT == null ? surfaceMaterial != null : !SURFACE_MATERIAL_EDEFAULT.equals(surfaceMaterial);
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD2_MULTI_SURFACE:
				return lod2MultiSurface != null;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD3_MULTI_SURFACE:
				return lod3MultiSurface != null;
			case TransportationPackage.TRAFFIC_AREA_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA_GROUP:
				return genericApplicationPropertyOfTrafficAreaGroup != null && !genericApplicationPropertyOfTrafficAreaGroup.isEmpty();
			case TransportationPackage.TRAFFIC_AREA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TRAFFIC_AREA:
				return !getGenericApplicationPropertyOfTrafficArea().isEmpty();
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
		result.append(" (usage: ");
		result.append(usage);
		result.append(", function: ");
		result.append(function);
		result.append(", surfaceMaterial: ");
		result.append(surfaceMaterial);
		result.append(", genericApplicationPropertyOfTrafficAreaGroup: ");
		result.append(genericApplicationPropertyOfTrafficAreaGroup);
		result.append(')');
		return result.toString();
	}

} //TrafficAreaTypeImpl
