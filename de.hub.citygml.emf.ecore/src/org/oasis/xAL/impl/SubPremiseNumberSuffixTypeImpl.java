/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasis.xAL.SubPremiseNumberSuffixType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Premise Number Suffix Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.SubPremiseNumberSuffixTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.SubPremiseNumberSuffixTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.SubPremiseNumberSuffixTypeImpl#getNumberSuffixSeparator <em>Number Suffix Separator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.SubPremiseNumberSuffixTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.SubPremiseNumberSuffixTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubPremiseNumberSuffixTypeImpl extends EObjectImpl implements SubPremiseNumberSuffixType {
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
	 * The default value of the '{@link #getNumberSuffixSeparator() <em>Number Suffix Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSuffixSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUMBER_SUFFIX_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberSuffixSeparator() <em>Number Suffix Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSuffixSeparator()
	 * @generated
	 * @ordered
	 */
	protected Object numberSuffixSeparator = NUMBER_SUFFIX_SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Object type = TYPE_EDEFAULT;

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
	protected SubPremiseNumberSuffixTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getSubPremiseNumberSuffixType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED);
		}
		return mixed;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNumberSuffixSeparator() {
		return numberSuffixSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberSuffixSeparator(Object newNumberSuffixSeparator) {
		Object oldNumberSuffixSeparator = numberSuffixSeparator;
		numberSuffixSeparator = newNumberSuffixSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR, oldNumberSuffixSeparator, numberSuffixSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Object newType) {
		Object oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE:
				return getCode();
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR:
				return getNumberSuffixSeparator();
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE:
				return getType();
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE:
				setCode(newValue);
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR:
				setNumberSuffixSeparator(newValue);
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED:
				getMixed().clear();
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR:
				setNumberSuffixSeparator(NUMBER_SUFFIX_SEPARATOR_EDEFAULT);
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__NUMBER_SUFFIX_SEPARATOR:
				return NUMBER_SUFFIX_SEPARATOR_EDEFAULT == null ? numberSuffixSeparator != null : !NUMBER_SUFFIX_SEPARATOR_EDEFAULT.equals(numberSuffixSeparator);
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.SUB_PREMISE_NUMBER_SUFFIX_TYPE__ANY_ATTRIBUTE:
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
		result.append(", numberSuffixSeparator: ");
		result.append(numberSuffixSeparator);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SubPremiseNumberSuffixTypeImpl
