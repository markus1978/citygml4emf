/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.OperationParameterType;
import net.opengis.gml.StringOrRefType;

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
 * An implementation of the model object '<em><b>Operation Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.OperationParameterTypeImpl#getParameterID <em>Parameter ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationParameterTypeImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationParameterTypeImpl extends OperationParameterBaseTypeImpl implements OperationParameterType {
	/**
	 * The cached value of the '{@link #getParameterID() <em>Parameter ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterID()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> parameterID;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType remarks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getOperationParameterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentifierType> getParameterID() {
		if (parameterID == null) {
			parameterID = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, GmlPackage.OPERATION_PARAMETER_TYPE__PARAMETER_ID);
		}
		return parameterID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(StringOrRefType newRemarks, NotificationChain msgs) {
		StringOrRefType oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS, oldRemarks, newRemarks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(StringOrRefType newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.OPERATION_PARAMETER_TYPE__PARAMETER_ID:
				return ((InternalEList<?>)getParameterID()).basicRemove(otherEnd, msgs);
			case GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS:
				return basicSetRemarks(null, msgs);
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
			case GmlPackage.OPERATION_PARAMETER_TYPE__PARAMETER_ID:
				return getParameterID();
			case GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS:
				return getRemarks();
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
			case GmlPackage.OPERATION_PARAMETER_TYPE__PARAMETER_ID:
				getParameterID().clear();
				getParameterID().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS:
				setRemarks((StringOrRefType)newValue);
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
			case GmlPackage.OPERATION_PARAMETER_TYPE__PARAMETER_ID:
				getParameterID().clear();
				return;
			case GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS:
				setRemarks((StringOrRefType)null);
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
			case GmlPackage.OPERATION_PARAMETER_TYPE__PARAMETER_ID:
				return parameterID != null && !parameterID.isEmpty();
			case GmlPackage.OPERATION_PARAMETER_TYPE__REMARKS:
				return remarks != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationParameterTypeImpl
