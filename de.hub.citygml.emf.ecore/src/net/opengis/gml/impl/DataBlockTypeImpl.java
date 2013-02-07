/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.List;

import net.opengis.gml.CoordinatesType;
import net.opengis.gml.DataBlockType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.RangeParametersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Block Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.DataBlockTypeImpl#getRangeParameters <em>Range Parameters</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DataBlockTypeImpl#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DataBlockTypeImpl#getDoubleOrNullTupleList <em>Double Or Null Tuple List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBlockTypeImpl extends EObjectImpl implements DataBlockType {
	/**
	 * The cached value of the '{@link #getRangeParameters() <em>Range Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeParameters()
	 * @generated
	 * @ordered
	 */
	protected RangeParametersType rangeParameters;

	/**
	 * The cached value of the '{@link #getTupleList() <em>Tuple List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTupleList()
	 * @generated
	 * @ordered
	 */
	protected CoordinatesType tupleList;

	/**
	 * The default value of the '{@link #getDoubleOrNullTupleList() <em>Double Or Null Tuple List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleOrNullTupleList()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoubleOrNullTupleList() <em>Double Or Null Tuple List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleOrNullTupleList()
	 * @generated
	 * @ordered
	 */
	protected List<Object> doubleOrNullTupleList = DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBlockTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getDataBlockType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeParametersType getRangeParameters() {
		return rangeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeParameters(RangeParametersType newRangeParameters, NotificationChain msgs) {
		RangeParametersType oldRangeParameters = rangeParameters;
		rangeParameters = newRangeParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS, oldRangeParameters, newRangeParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeParameters(RangeParametersType newRangeParameters) {
		if (newRangeParameters != rangeParameters) {
			NotificationChain msgs = null;
			if (rangeParameters != null)
				msgs = ((InternalEObject)rangeParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS, null, msgs);
			if (newRangeParameters != null)
				msgs = ((InternalEObject)newRangeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS, null, msgs);
			msgs = basicSetRangeParameters(newRangeParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS, newRangeParameters, newRangeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesType getTupleList() {
		return tupleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleList(CoordinatesType newTupleList, NotificationChain msgs) {
		CoordinatesType oldTupleList = tupleList;
		tupleList = newTupleList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST, oldTupleList, newTupleList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleList(CoordinatesType newTupleList) {
		if (newTupleList != tupleList) {
			NotificationChain msgs = null;
			if (tupleList != null)
				msgs = ((InternalEObject)tupleList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST, null, msgs);
			if (newTupleList != null)
				msgs = ((InternalEObject)newTupleList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST, null, msgs);
			msgs = basicSetTupleList(newTupleList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST, newTupleList, newTupleList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> getDoubleOrNullTupleList() {
		return doubleOrNullTupleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleOrNullTupleList(List<Object> newDoubleOrNullTupleList) {
		List<Object> oldDoubleOrNullTupleList = doubleOrNullTupleList;
		doubleOrNullTupleList = newDoubleOrNullTupleList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.DATA_BLOCK_TYPE__DOUBLE_OR_NULL_TUPLE_LIST, oldDoubleOrNullTupleList, doubleOrNullTupleList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS:
				return basicSetRangeParameters(null, msgs);
			case GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST:
				return basicSetTupleList(null, msgs);
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
			case GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS:
				return getRangeParameters();
			case GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST:
				return getTupleList();
			case GmlPackage.DATA_BLOCK_TYPE__DOUBLE_OR_NULL_TUPLE_LIST:
				return getDoubleOrNullTupleList();
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
			case GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS:
				setRangeParameters((RangeParametersType)newValue);
				return;
			case GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST:
				setTupleList((CoordinatesType)newValue);
				return;
			case GmlPackage.DATA_BLOCK_TYPE__DOUBLE_OR_NULL_TUPLE_LIST:
				setDoubleOrNullTupleList((List<Object>)newValue);
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
			case GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS:
				setRangeParameters((RangeParametersType)null);
				return;
			case GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST:
				setTupleList((CoordinatesType)null);
				return;
			case GmlPackage.DATA_BLOCK_TYPE__DOUBLE_OR_NULL_TUPLE_LIST:
				setDoubleOrNullTupleList(DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT);
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
			case GmlPackage.DATA_BLOCK_TYPE__RANGE_PARAMETERS:
				return rangeParameters != null;
			case GmlPackage.DATA_BLOCK_TYPE__TUPLE_LIST:
				return tupleList != null;
			case GmlPackage.DATA_BLOCK_TYPE__DOUBLE_OR_NULL_TUPLE_LIST:
				return DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT == null ? doubleOrNullTupleList != null : !DOUBLE_OR_NULL_TUPLE_LIST_EDEFAULT.equals(doubleOrNullTupleList);
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
		result.append(" (doubleOrNullTupleList: ");
		result.append(doubleOrNullTupleList);
		result.append(')');
		return result.toString();
	}

} //DataBlockTypeImpl
