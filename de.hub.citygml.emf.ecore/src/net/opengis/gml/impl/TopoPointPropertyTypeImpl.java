/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.TopoPointPropertyType;
import net.opengis.gml.TopoPointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Point Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoPointPropertyTypeImpl#getTopoPoint <em>Topo Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopoPointPropertyTypeImpl extends EObjectImpl implements TopoPointPropertyType {
	/**
	 * The cached value of the '{@link #getTopoPoint() <em>Topo Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopoPoint()
	 * @generated
	 * @ordered
	 */
	protected TopoPointType topoPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoPointPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getTopoPointPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopoPointType getTopoPoint() {
		return topoPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopoPoint(TopoPointType newTopoPoint, NotificationChain msgs) {
		TopoPointType oldTopoPoint = topoPoint;
		topoPoint = newTopoPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT, oldTopoPoint, newTopoPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopoPoint(TopoPointType newTopoPoint) {
		if (newTopoPoint != topoPoint) {
			NotificationChain msgs = null;
			if (topoPoint != null)
				msgs = ((InternalEObject)topoPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT, null, msgs);
			if (newTopoPoint != null)
				msgs = ((InternalEObject)newTopoPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT, null, msgs);
			msgs = basicSetTopoPoint(newTopoPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT, newTopoPoint, newTopoPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT:
				return basicSetTopoPoint(null, msgs);
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
			case GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT:
				return getTopoPoint();
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
			case GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT:
				setTopoPoint((TopoPointType)newValue);
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
			case GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT:
				setTopoPoint((TopoPointType)null);
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
			case GmlPackage.TOPO_POINT_PROPERTY_TYPE__TOPO_POINT:
				return topoPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //TopoPointPropertyTypeImpl
