/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.TopoVolumePropertyType;
import net.opengis.gml.TopoVolumeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Volume Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoVolumePropertyTypeImpl#getTopoVolume <em>Topo Volume</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopoVolumePropertyTypeImpl extends EObjectImpl implements TopoVolumePropertyType {
	/**
	 * The cached value of the '{@link #getTopoVolume() <em>Topo Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopoVolume()
	 * @generated
	 * @ordered
	 */
	protected TopoVolumeType topoVolume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoVolumePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getTopoVolumePropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoVolumeType getTopoVolume() {
		return topoVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoVolume(TopoVolumeType newTopoVolume, NotificationChain msgs) {
		TopoVolumeType oldTopoVolume = topoVolume;
		topoVolume = newTopoVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, oldTopoVolume, newTopoVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoVolume(TopoVolumeType newTopoVolume) {
		if (newTopoVolume != topoVolume) {
			NotificationChain msgs = null;
			if (topoVolume != null)
				msgs = ((InternalEObject)topoVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, null, msgs);
			if (newTopoVolume != null)
				msgs = ((InternalEObject)newTopoVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, null, msgs);
			msgs = basicSetTopoVolume(newTopoVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME, newTopoVolume, newTopoVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				return basicSetTopoVolume(null, msgs);
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
			case GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				return getTopoVolume();
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
			case GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)newValue);
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
			case GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				setTopoVolume((TopoVolumeType)null);
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
			case GmlPackage.TOPO_VOLUME_PROPERTY_TYPE__TOPO_VOLUME:
				return topoVolume != null;
		}
		return super.eIsSet(featureID);
	}

} //TopoVolumePropertyTypeImpl
