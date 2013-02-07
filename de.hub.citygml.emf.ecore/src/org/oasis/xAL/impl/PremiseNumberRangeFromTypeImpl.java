/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasis.xAL.AddressLineType;
import org.oasis.xAL.PremiseNumberPrefixType;
import org.oasis.xAL.PremiseNumberRangeFromType;
import org.oasis.xAL.PremiseNumberSuffixType;
import org.oasis.xAL.PremiseNumberType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Premise Number Range From Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeFromTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeFromTypeImpl#getPremiseNumberPrefix <em>Premise Number Prefix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeFromTypeImpl#getPremiseNumber <em>Premise Number</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PremiseNumberRangeFromTypeImpl#getPremiseNumberSuffix <em>Premise Number Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PremiseNumberRangeFromTypeImpl extends EObjectImpl implements PremiseNumberRangeFromType {
	/**
	 * The cached value of the '{@link #getAddressLine() <em>Address Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressLine()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressLineType> addressLine;

	/**
	 * The cached value of the '{@link #getPremiseNumberPrefix() <em>Premise Number Prefix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumberPrefix()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiseNumberPrefixType> premiseNumberPrefix;

	/**
	 * The cached value of the '{@link #getPremiseNumber() <em>Premise Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiseNumberType> premiseNumber;

	/**
	 * The cached value of the '{@link #getPremiseNumberSuffix() <em>Premise Number Suffix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiseNumberSuffix()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiseNumberSuffixType> premiseNumberSuffix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PremiseNumberRangeFromTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPremiseNumberRangeFromType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiseNumberPrefixType> getPremiseNumberPrefix() {
		if (premiseNumberPrefix == null) {
			premiseNumberPrefix = new EObjectContainmentEList<PremiseNumberPrefixType>(PremiseNumberPrefixType.class, this, XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX);
		}
		return premiseNumberPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiseNumberType> getPremiseNumber() {
		if (premiseNumber == null) {
			premiseNumber = new EObjectContainmentEList<PremiseNumberType>(PremiseNumberType.class, this, XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER);
		}
		return premiseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiseNumberSuffixType> getPremiseNumberSuffix() {
		if (premiseNumberSuffix == null) {
			premiseNumberSuffix = new EObjectContainmentEList<PremiseNumberSuffixType>(PremiseNumberSuffixType.class, this, XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX);
		}
		return premiseNumberSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX:
				return ((InternalEList<?>)getPremiseNumberPrefix()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER:
				return ((InternalEList<?>)getPremiseNumber()).basicRemove(otherEnd, msgs);
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX:
				return ((InternalEList<?>)getPremiseNumberSuffix()).basicRemove(otherEnd, msgs);
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
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX:
				return getPremiseNumberPrefix();
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER:
				return getPremiseNumber();
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX:
				return getPremiseNumberSuffix();
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
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX:
				getPremiseNumberPrefix().clear();
				getPremiseNumberPrefix().addAll((Collection<? extends PremiseNumberPrefixType>)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER:
				getPremiseNumber().clear();
				getPremiseNumber().addAll((Collection<? extends PremiseNumberType>)newValue);
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX:
				getPremiseNumberSuffix().clear();
				getPremiseNumberSuffix().addAll((Collection<? extends PremiseNumberSuffixType>)newValue);
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
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX:
				getPremiseNumberPrefix().clear();
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER:
				getPremiseNumber().clear();
				return;
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX:
				getPremiseNumberSuffix().clear();
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
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_PREFIX:
				return premiseNumberPrefix != null && !premiseNumberPrefix.isEmpty();
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER:
				return premiseNumber != null && !premiseNumber.isEmpty();
			case XALPackage.PREMISE_NUMBER_RANGE_FROM_TYPE__PREMISE_NUMBER_SUFFIX:
				return premiseNumberSuffix != null && !premiseNumberSuffix.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PremiseNumberRangeFromTypeImpl
