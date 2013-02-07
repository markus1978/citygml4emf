/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import net.opengis.citygml.relief.GridPropertyType;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.gml.RectifiedGridCoverageType;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.impl.GridPropertyTypeImpl#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridPropertyTypeImpl extends AssociationTypeImpl implements GridPropertyType {
	/**
	 * The cached value of the '{@link #getRectifiedGridCoverage() <em>Rectified Grid Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectifiedGridCoverage()
	 * @generated
	 * @ordered
	 */
	protected RectifiedGridCoverageType rectifiedGridCoverage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliefPackage.Literals.GRID_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectifiedGridCoverageType getRectifiedGridCoverage() {
		return rectifiedGridCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGridCoverage(RectifiedGridCoverageType newRectifiedGridCoverage, NotificationChain msgs) {
		RectifiedGridCoverageType oldRectifiedGridCoverage = rectifiedGridCoverage;
		rectifiedGridCoverage = newRectifiedGridCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE, oldRectifiedGridCoverage, newRectifiedGridCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectifiedGridCoverage(RectifiedGridCoverageType newRectifiedGridCoverage) {
		if (newRectifiedGridCoverage != rectifiedGridCoverage) {
			NotificationChain msgs = null;
			if (rectifiedGridCoverage != null)
				msgs = ((InternalEObject)rectifiedGridCoverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE, null, msgs);
			if (newRectifiedGridCoverage != null)
				msgs = ((InternalEObject)newRectifiedGridCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE, null, msgs);
			msgs = basicSetRectifiedGridCoverage(newRectifiedGridCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE, newRectifiedGridCoverage, newRectifiedGridCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE:
				return basicSetRectifiedGridCoverage(null, msgs);
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
			case ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE:
				return getRectifiedGridCoverage();
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
			case ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE:
				setRectifiedGridCoverage((RectifiedGridCoverageType)newValue);
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
			case ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE:
				setRectifiedGridCoverage((RectifiedGridCoverageType)null);
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
			case ReliefPackage.GRID_PROPERTY_TYPE__RECTIFIED_GRID_COVERAGE:
				return rectifiedGridCoverage != null;
		}
		return super.eIsSet(featureID);
	}

} //GridPropertyTypeImpl
