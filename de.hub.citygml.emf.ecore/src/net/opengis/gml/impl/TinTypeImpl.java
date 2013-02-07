/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.ControlPointType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.LengthType;
import net.opengis.gml.LineStringSegmentArrayPropertyType;
import net.opengis.gml.TinType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TinTypeImpl#getStopLines <em>Stop Lines</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TinTypeImpl#getBreakLines <em>Break Lines</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TinTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TinTypeImpl#getControlPoint <em>Control Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TinTypeImpl extends TriangulatedSurfaceTypeImpl implements TinType {
	/**
	 * The cached value of the '{@link #getStopLines() <em>Stop Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopLines()
	 * @generated
	 * @ordered
	 */
	protected EList<LineStringSegmentArrayPropertyType> stopLines;

	/**
	 * The cached value of the '{@link #getBreakLines() <em>Break Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakLines()
	 * @generated
	 * @ordered
	 */
	protected EList<LineStringSegmentArrayPropertyType> breakLines;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected LengthType maxLength;

	/**
	 * The cached value of the '{@link #getControlPoint() <em>Control Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPoint()
	 * @generated
	 * @ordered
	 */
	protected ControlPointType controlPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getTinType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineStringSegmentArrayPropertyType> getStopLines() {
		if (stopLines == null) {
			stopLines = new EObjectContainmentEList<LineStringSegmentArrayPropertyType>(LineStringSegmentArrayPropertyType.class, this, GmlPackage.TIN_TYPE__STOP_LINES);
		}
		return stopLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineStringSegmentArrayPropertyType> getBreakLines() {
		if (breakLines == null) {
			breakLines = new EObjectContainmentEList<LineStringSegmentArrayPropertyType>(LineStringSegmentArrayPropertyType.class, this, GmlPackage.TIN_TYPE__BREAK_LINES);
		}
		return breakLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthType getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(LengthType newMaxLength, NotificationChain msgs) {
		LengthType oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.TIN_TYPE__MAX_LENGTH, oldMaxLength, newMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(LengthType newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TIN_TYPE__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TIN_TYPE__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TIN_TYPE__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPointType getControlPoint() {
		return controlPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlPoint(ControlPointType newControlPoint, NotificationChain msgs) {
		ControlPointType oldControlPoint = controlPoint;
		controlPoint = newControlPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.TIN_TYPE__CONTROL_POINT, oldControlPoint, newControlPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPoint(ControlPointType newControlPoint) {
		if (newControlPoint != controlPoint) {
			NotificationChain msgs = null;
			if (controlPoint != null)
				msgs = ((InternalEObject)controlPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TIN_TYPE__CONTROL_POINT, null, msgs);
			if (newControlPoint != null)
				msgs = ((InternalEObject)newControlPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TIN_TYPE__CONTROL_POINT, null, msgs);
			msgs = basicSetControlPoint(newControlPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TIN_TYPE__CONTROL_POINT, newControlPoint, newControlPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.TIN_TYPE__STOP_LINES:
				return ((InternalEList<?>)getStopLines()).basicRemove(otherEnd, msgs);
			case GmlPackage.TIN_TYPE__BREAK_LINES:
				return ((InternalEList<?>)getBreakLines()).basicRemove(otherEnd, msgs);
			case GmlPackage.TIN_TYPE__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case GmlPackage.TIN_TYPE__CONTROL_POINT:
				return basicSetControlPoint(null, msgs);
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
			case GmlPackage.TIN_TYPE__STOP_LINES:
				return getStopLines();
			case GmlPackage.TIN_TYPE__BREAK_LINES:
				return getBreakLines();
			case GmlPackage.TIN_TYPE__MAX_LENGTH:
				return getMaxLength();
			case GmlPackage.TIN_TYPE__CONTROL_POINT:
				return getControlPoint();
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
			case GmlPackage.TIN_TYPE__STOP_LINES:
				getStopLines().clear();
				getStopLines().addAll((Collection<? extends LineStringSegmentArrayPropertyType>)newValue);
				return;
			case GmlPackage.TIN_TYPE__BREAK_LINES:
				getBreakLines().clear();
				getBreakLines().addAll((Collection<? extends LineStringSegmentArrayPropertyType>)newValue);
				return;
			case GmlPackage.TIN_TYPE__MAX_LENGTH:
				setMaxLength((LengthType)newValue);
				return;
			case GmlPackage.TIN_TYPE__CONTROL_POINT:
				setControlPoint((ControlPointType)newValue);
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
			case GmlPackage.TIN_TYPE__STOP_LINES:
				getStopLines().clear();
				return;
			case GmlPackage.TIN_TYPE__BREAK_LINES:
				getBreakLines().clear();
				return;
			case GmlPackage.TIN_TYPE__MAX_LENGTH:
				setMaxLength((LengthType)null);
				return;
			case GmlPackage.TIN_TYPE__CONTROL_POINT:
				setControlPoint((ControlPointType)null);
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
			case GmlPackage.TIN_TYPE__STOP_LINES:
				return stopLines != null && !stopLines.isEmpty();
			case GmlPackage.TIN_TYPE__BREAK_LINES:
				return breakLines != null && !breakLines.isEmpty();
			case GmlPackage.TIN_TYPE__MAX_LENGTH:
				return maxLength != null;
			case GmlPackage.TIN_TYPE__CONTROL_POINT:
				return controlPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //TinTypeImpl
