/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AngleChoiceType;
import net.opengis.gml.DMSAngleType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.MeasureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle Choice Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AngleChoiceTypeImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AngleChoiceTypeImpl#getDmsAngle <em>Dms Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AngleChoiceTypeImpl extends EObjectImpl implements AngleChoiceType {
	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected MeasureType angle;

	/**
	 * The cached value of the '{@link #getDmsAngle() <em>Dms Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmsAngle()
	 * @generated
	 * @ordered
	 */
	protected DMSAngleType dmsAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleChoiceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getAngleChoiceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureType getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(MeasureType newAngle, NotificationChain msgs) {
		MeasureType oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.ANGLE_CHOICE_TYPE__ANGLE, oldAngle, newAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(MeasureType newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject)angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ANGLE_CHOICE_TYPE__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject)newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ANGLE_CHOICE_TYPE__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ANGLE_CHOICE_TYPE__ANGLE, newAngle, newAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMSAngleType getDmsAngle() {
		return dmsAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDmsAngle(DMSAngleType newDmsAngle, NotificationChain msgs) {
		DMSAngleType oldDmsAngle = dmsAngle;
		dmsAngle = newDmsAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE, oldDmsAngle, newDmsAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmsAngle(DMSAngleType newDmsAngle) {
		if (newDmsAngle != dmsAngle) {
			NotificationChain msgs = null;
			if (dmsAngle != null)
				msgs = ((InternalEObject)dmsAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE, null, msgs);
			if (newDmsAngle != null)
				msgs = ((InternalEObject)newDmsAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE, null, msgs);
			msgs = basicSetDmsAngle(newDmsAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE, newDmsAngle, newDmsAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.ANGLE_CHOICE_TYPE__ANGLE:
				return basicSetAngle(null, msgs);
			case GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE:
				return basicSetDmsAngle(null, msgs);
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
			case GmlPackage.ANGLE_CHOICE_TYPE__ANGLE:
				return getAngle();
			case GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE:
				return getDmsAngle();
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
			case GmlPackage.ANGLE_CHOICE_TYPE__ANGLE:
				setAngle((MeasureType)newValue);
				return;
			case GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE:
				setDmsAngle((DMSAngleType)newValue);
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
			case GmlPackage.ANGLE_CHOICE_TYPE__ANGLE:
				setAngle((MeasureType)null);
				return;
			case GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE:
				setDmsAngle((DMSAngleType)null);
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
			case GmlPackage.ANGLE_CHOICE_TYPE__ANGLE:
				return angle != null;
			case GmlPackage.ANGLE_CHOICE_TYPE__DMS_ANGLE:
				return dmsAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //AngleChoiceTypeImpl
