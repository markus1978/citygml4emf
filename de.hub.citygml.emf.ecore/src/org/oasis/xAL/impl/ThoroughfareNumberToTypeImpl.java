/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasis.xAL.AddressLineType;
import org.oasis.xAL.ThoroughfareNumberPrefixType;
import org.oasis.xAL.ThoroughfareNumberSuffixType;
import org.oasis.xAL.ThoroughfareNumberToType;
import org.oasis.xAL.ThoroughfareNumberType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thoroughfare Number To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl#getThoroughfareNumber <em>Thoroughfare Number</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.ThoroughfareNumberToTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThoroughfareNumberToTypeImpl extends EObjectImpl implements ThoroughfareNumberToType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Object code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThoroughfareNumberToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getThoroughfareNumberToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		return getMixed().list(XALPackage.eINSTANCE.getThoroughfareNumberToType_AddressLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberPrefixType> getThoroughfareNumberPrefix() {
		return getMixed().list(XALPackage.eINSTANCE.getThoroughfareNumberToType_ThoroughfareNumberPrefix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberType> getThoroughfareNumber() {
		return getMixed().list(XALPackage.eINSTANCE.getThoroughfareNumberToType_ThoroughfareNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNumberSuffixType> getThoroughfareNumberSuffix() {
		return getMixed().list(XALPackage.eINSTANCE.getThoroughfareNumberToType_ThoroughfareNumberSuffix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Object newCode) {
		Object oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return ((InternalEList<?>)getThoroughfareNumberPrefix()).basicRemove(otherEnd, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				return ((InternalEList<?>)getThoroughfareNumber()).basicRemove(otherEnd, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return ((InternalEList<?>)getThoroughfareNumberSuffix()).basicRemove(otherEnd, msgs);
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return getThoroughfareNumberPrefix();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				return getThoroughfareNumber();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return getThoroughfareNumberSuffix();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				return getCode();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				getThoroughfareNumberPrefix().clear();
				getThoroughfareNumberPrefix().addAll((Collection<? extends ThoroughfareNumberPrefixType>)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				getThoroughfareNumber().clear();
				getThoroughfareNumber().addAll((Collection<? extends ThoroughfareNumberType>)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				getThoroughfareNumberSuffix().clear();
				getThoroughfareNumberSuffix().addAll((Collection<? extends ThoroughfareNumberSuffixType>)newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				setCode(newValue);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				getMixed().clear();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				getThoroughfareNumberPrefix().clear();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				getThoroughfareNumber().clear();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				getThoroughfareNumberSuffix().clear();
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ADDRESS_LINE:
				return !getAddressLine().isEmpty();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_PREFIX:
				return !getThoroughfareNumberPrefix().isEmpty();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER:
				return !getThoroughfareNumber().isEmpty();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__THOROUGHFARE_NUMBER_SUFFIX:
				return !getThoroughfareNumberSuffix().isEmpty();
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XALPackage.THOROUGHFARE_NUMBER_TO_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", code: ");
		result.append(code);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ThoroughfareNumberToTypeImpl
