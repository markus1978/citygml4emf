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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasis.xAL.AddressLineType;
import org.oasis.xAL.PostTownNameType;
import org.oasis.xAL.PostTownSuffixType;
import org.oasis.xAL.PostTownType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Town Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.PostTownTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostTownTypeImpl#getPostTownName <em>Post Town Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostTownTypeImpl#getPostTownSuffix <em>Post Town Suffix</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostTownTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.PostTownTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostTownTypeImpl extends EObjectImpl implements PostTownType {
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
	 * The cached value of the '{@link #getPostTownName() <em>Post Town Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostTownName()
	 * @generated
	 * @ordered
	 */
	protected EList<PostTownNameType> postTownName;

	/**
	 * The cached value of the '{@link #getPostTownSuffix() <em>Post Town Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostTownSuffix()
	 * @generated
	 * @ordered
	 */
	protected PostTownSuffixType postTownSuffix;

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
	protected PostTownTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getPostTownType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.POST_TOWN_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PostTownNameType> getPostTownName() {
		if (postTownName == null) {
			postTownName = new EObjectContainmentEList<PostTownNameType>(PostTownNameType.class, this, XALPackage.POST_TOWN_TYPE__POST_TOWN_NAME);
		}
		return postTownName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTownSuffixType getPostTownSuffix() {
		return postTownSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostTownSuffix(PostTownSuffixType newPostTownSuffix, NotificationChain msgs) {
		PostTownSuffixType oldPostTownSuffix = postTownSuffix;
		postTownSuffix = newPostTownSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX, oldPostTownSuffix, newPostTownSuffix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostTownSuffix(PostTownSuffixType newPostTownSuffix) {
		if (newPostTownSuffix != postTownSuffix) {
			NotificationChain msgs = null;
			if (postTownSuffix != null)
				msgs = ((InternalEObject)postTownSuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX, null, msgs);
			if (newPostTownSuffix != null)
				msgs = ((InternalEObject)newPostTownSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX, null, msgs);
			msgs = basicSetPostTownSuffix(newPostTownSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX, newPostTownSuffix, newPostTownSuffix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.POST_TOWN_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.POST_TOWN_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.POST_TOWN_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_NAME:
				return ((InternalEList<?>)getPostTownName()).basicRemove(otherEnd, msgs);
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX:
				return basicSetPostTownSuffix(null, msgs);
			case XALPackage.POST_TOWN_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_TOWN_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_NAME:
				return getPostTownName();
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX:
				return getPostTownSuffix();
			case XALPackage.POST_TOWN_TYPE__TYPE:
				return getType();
			case XALPackage.POST_TOWN_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_TOWN_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_NAME:
				getPostTownName().clear();
				getPostTownName().addAll((Collection<? extends PostTownNameType>)newValue);
				return;
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX:
				setPostTownSuffix((PostTownSuffixType)newValue);
				return;
			case XALPackage.POST_TOWN_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.POST_TOWN_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_TOWN_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_NAME:
				getPostTownName().clear();
				return;
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX:
				setPostTownSuffix((PostTownSuffixType)null);
				return;
			case XALPackage.POST_TOWN_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.POST_TOWN_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.POST_TOWN_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_NAME:
				return postTownName != null && !postTownName.isEmpty();
			case XALPackage.POST_TOWN_TYPE__POST_TOWN_SUFFIX:
				return postTownSuffix != null;
			case XALPackage.POST_TOWN_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.POST_TOWN_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PostTownTypeImpl
