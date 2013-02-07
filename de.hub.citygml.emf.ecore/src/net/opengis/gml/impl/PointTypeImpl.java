/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.CoordType;
import net.opengis.gml.CoordinatesType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.PointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.PointTypeImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PointTypeImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.gml.impl.PointTypeImpl#getCoord <em>Coord</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointTypeImpl extends AbstractGeometricPrimitiveTypeImpl implements PointType {
	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected DirectPositionType pos;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected CoordinatesType coordinates;

	/**
	 * The cached value of the '{@link #getCoord() <em>Coord</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoord()
	 * @generated
	 * @ordered
	 */
	protected CoordType coord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectPositionType getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPos(DirectPositionType newPos, NotificationChain msgs) {
		DirectPositionType oldPos = pos;
		pos = newPos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.POINT_TYPE__POS, oldPos, newPos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(DirectPositionType newPos) {
		if (newPos != pos) {
			NotificationChain msgs = null;
			if (pos != null)
				msgs = ((InternalEObject)pos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.POINT_TYPE__POS, null, msgs);
			if (newPos != null)
				msgs = ((InternalEObject)newPos).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.POINT_TYPE__POS, null, msgs);
			msgs = basicSetPos(newPos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.POINT_TYPE__POS, newPos, newPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesType getCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(CoordinatesType newCoordinates, NotificationChain msgs) {
		CoordinatesType oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.POINT_TYPE__COORDINATES, oldCoordinates, newCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(CoordinatesType newCoordinates) {
		if (newCoordinates != coordinates) {
			NotificationChain msgs = null;
			if (coordinates != null)
				msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.POINT_TYPE__COORDINATES, null, msgs);
			if (newCoordinates != null)
				msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.POINT_TYPE__COORDINATES, null, msgs);
			msgs = basicSetCoordinates(newCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.POINT_TYPE__COORDINATES, newCoordinates, newCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordType getCoord() {
		return coord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoord(CoordType newCoord, NotificationChain msgs) {
		CoordType oldCoord = coord;
		coord = newCoord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.POINT_TYPE__COORD, oldCoord, newCoord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoord(CoordType newCoord) {
		if (newCoord != coord) {
			NotificationChain msgs = null;
			if (coord != null)
				msgs = ((InternalEObject)coord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.POINT_TYPE__COORD, null, msgs);
			if (newCoord != null)
				msgs = ((InternalEObject)newCoord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.POINT_TYPE__COORD, null, msgs);
			msgs = basicSetCoord(newCoord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.POINT_TYPE__COORD, newCoord, newCoord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.POINT_TYPE__POS:
				return basicSetPos(null, msgs);
			case GmlPackage.POINT_TYPE__COORDINATES:
				return basicSetCoordinates(null, msgs);
			case GmlPackage.POINT_TYPE__COORD:
				return basicSetCoord(null, msgs);
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
			case GmlPackage.POINT_TYPE__POS:
				return getPos();
			case GmlPackage.POINT_TYPE__COORDINATES:
				return getCoordinates();
			case GmlPackage.POINT_TYPE__COORD:
				return getCoord();
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
			case GmlPackage.POINT_TYPE__POS:
				setPos((DirectPositionType)newValue);
				return;
			case GmlPackage.POINT_TYPE__COORDINATES:
				setCoordinates((CoordinatesType)newValue);
				return;
			case GmlPackage.POINT_TYPE__COORD:
				setCoord((CoordType)newValue);
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
			case GmlPackage.POINT_TYPE__POS:
				setPos((DirectPositionType)null);
				return;
			case GmlPackage.POINT_TYPE__COORDINATES:
				setCoordinates((CoordinatesType)null);
				return;
			case GmlPackage.POINT_TYPE__COORD:
				setCoord((CoordType)null);
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
			case GmlPackage.POINT_TYPE__POS:
				return pos != null;
			case GmlPackage.POINT_TYPE__COORDINATES:
				return coordinates != null;
			case GmlPackage.POINT_TYPE__COORD:
				return coord != null;
		}
		return super.eIsSet(featureID);
	}

} //PointTypeImpl
