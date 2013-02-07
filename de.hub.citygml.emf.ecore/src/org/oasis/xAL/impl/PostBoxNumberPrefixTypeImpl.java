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
import org.oasis.xAL.PostBoxNumberPrefixType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Box Number Prefix Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PostBoxNumberPrefixTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxNumberPrefixTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxNumberPrefixTypeImpl#getNumberPrefixSeparator <em>Number Prefix Separator</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostBoxNumberPrefixTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostBoxNumberPrefixTypeImpl extends EObjectImpl implements PostBoxNumberPrefixType {
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
	 * The default value of the '{@link #getNumberPrefixSeparator() <em>Number Prefix Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberPrefixSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUMBER_PREFIX_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberPrefixSeparator() <em>Number Prefix Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberPrefixSeparator()
	 * @generated
	 * @ordered
	 */
	protected Object numberPrefixSeparator = NUMBER_PREFIX_SEPARATOR_EDEFAULT;

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
	protected PostBoxNumberPrefixTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPostBoxNumberPrefixType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__MIXED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNumberPrefixSeparator() {
		return numberPrefixSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberPrefixSeparator(Object newNumberPrefixSeparator) {
		Object oldNumberPrefixSeparator = numberPrefixSeparator;
		numberPrefixSeparator = newNumberPrefixSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR, oldNumberPrefixSeparator, numberPrefixSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__CODE:
				return getCode();
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR:
				return getNumberPrefixSeparator();
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__CODE:
				setCode(newValue);
				return;
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR:
				setNumberPrefixSeparator(newValue);
				return;
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__MIXED:
				getMixed().clear();
				return;
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR:
				setNumberPrefixSeparator(NUMBER_PREFIX_SEPARATOR_EDEFAULT);
				return;
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__NUMBER_PREFIX_SEPARATOR:
				return NUMBER_PREFIX_SEPARATOR_EDEFAULT == null ? numberPrefixSeparator != null : !NUMBER_PREFIX_SEPARATOR_EDEFAULT.equals(numberPrefixSeparator);
			case XALPackage.POST_BOX_NUMBER_PREFIX_TYPE__ANY_ATTRIBUTE:
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
		result.append(", numberPrefixSeparator: ");
		result.append(numberPrefixSeparator);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PostBoxNumberPrefixTypeImpl
