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
import org.oasis.xAL.DependentThoroughfareType;
import org.oasis.xAL.ThoroughfareLeadingTypeType;
import org.oasis.xAL.ThoroughfareNameType;
import org.oasis.xAL.ThoroughfarePostDirectionType;
import org.oasis.xAL.ThoroughfarePreDirectionType;
import org.oasis.xAL.ThoroughfareTrailingTypeType;
import org.oasis.xAL.XALPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependent Thoroughfare Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getThoroughfarePreDirection <em>Thoroughfare Pre Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getThoroughfareLeadingType <em>Thoroughfare Leading Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getThoroughfareName <em>Thoroughfare Name</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getThoroughfareTrailingType <em>Thoroughfare Trailing Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getThoroughfarePostDirection <em>Thoroughfare Post Direction</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasis.xAL.impl.DependentThoroughfareTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependentThoroughfareTypeImpl extends EObjectImpl implements DependentThoroughfareType {
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
	 * The cached value of the '{@link #getThoroughfarePreDirection() <em>Thoroughfare Pre Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfarePreDirection()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfarePreDirectionType thoroughfarePreDirection;

	/**
	 * The cached value of the '{@link #getThoroughfareLeadingType() <em>Thoroughfare Leading Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareLeadingType()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareLeadingTypeType thoroughfareLeadingType;

	/**
	 * The cached value of the '{@link #getThoroughfareName() <em>Thoroughfare Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareName()
	 * @generated
	 * @ordered
	 */
	protected EList<ThoroughfareNameType> thoroughfareName;

	/**
	 * The cached value of the '{@link #getThoroughfareTrailingType() <em>Thoroughfare Trailing Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfareTrailingType()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfareTrailingTypeType thoroughfareTrailingType;

	/**
	 * The cached value of the '{@link #getThoroughfarePostDirection() <em>Thoroughfare Post Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoroughfarePostDirection()
	 * @generated
	 * @ordered
	 */
	protected ThoroughfarePostDirectionType thoroughfarePostDirection;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	protected DependentThoroughfareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getDependentThoroughfareType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressLineType> getAddressLine() {
		if (addressLine == null) {
			addressLine = new EObjectContainmentEList<AddressLineType>(AddressLineType.class, this, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE);
		}
		return addressLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfarePreDirectionType getThoroughfarePreDirection() {
		return thoroughfarePreDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfarePreDirection(ThoroughfarePreDirectionType newThoroughfarePreDirection, NotificationChain msgs) {
		ThoroughfarePreDirectionType oldThoroughfarePreDirection = thoroughfarePreDirection;
		thoroughfarePreDirection = newThoroughfarePreDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, oldThoroughfarePreDirection, newThoroughfarePreDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfarePreDirection(ThoroughfarePreDirectionType newThoroughfarePreDirection) {
		if (newThoroughfarePreDirection != thoroughfarePreDirection) {
			NotificationChain msgs = null;
			if (thoroughfarePreDirection != null)
				msgs = ((InternalEObject)thoroughfarePreDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, null, msgs);
			if (newThoroughfarePreDirection != null)
				msgs = ((InternalEObject)newThoroughfarePreDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, null, msgs);
			msgs = basicSetThoroughfarePreDirection(newThoroughfarePreDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION, newThoroughfarePreDirection, newThoroughfarePreDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareLeadingTypeType getThoroughfareLeadingType() {
		return thoroughfareLeadingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareLeadingType(ThoroughfareLeadingTypeType newThoroughfareLeadingType, NotificationChain msgs) {
		ThoroughfareLeadingTypeType oldThoroughfareLeadingType = thoroughfareLeadingType;
		thoroughfareLeadingType = newThoroughfareLeadingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, oldThoroughfareLeadingType, newThoroughfareLeadingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfareLeadingType(ThoroughfareLeadingTypeType newThoroughfareLeadingType) {
		if (newThoroughfareLeadingType != thoroughfareLeadingType) {
			NotificationChain msgs = null;
			if (thoroughfareLeadingType != null)
				msgs = ((InternalEObject)thoroughfareLeadingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, null, msgs);
			if (newThoroughfareLeadingType != null)
				msgs = ((InternalEObject)newThoroughfareLeadingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, null, msgs);
			msgs = basicSetThoroughfareLeadingType(newThoroughfareLeadingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE, newThoroughfareLeadingType, newThoroughfareLeadingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThoroughfareNameType> getThoroughfareName() {
		if (thoroughfareName == null) {
			thoroughfareName = new EObjectContainmentEList<ThoroughfareNameType>(ThoroughfareNameType.class, this, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME);
		}
		return thoroughfareName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfareTrailingTypeType getThoroughfareTrailingType() {
		return thoroughfareTrailingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareTrailingType(ThoroughfareTrailingTypeType newThoroughfareTrailingType, NotificationChain msgs) {
		ThoroughfareTrailingTypeType oldThoroughfareTrailingType = thoroughfareTrailingType;
		thoroughfareTrailingType = newThoroughfareTrailingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, oldThoroughfareTrailingType, newThoroughfareTrailingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfareTrailingType(ThoroughfareTrailingTypeType newThoroughfareTrailingType) {
		if (newThoroughfareTrailingType != thoroughfareTrailingType) {
			NotificationChain msgs = null;
			if (thoroughfareTrailingType != null)
				msgs = ((InternalEObject)thoroughfareTrailingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, null, msgs);
			if (newThoroughfareTrailingType != null)
				msgs = ((InternalEObject)newThoroughfareTrailingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, null, msgs);
			msgs = basicSetThoroughfareTrailingType(newThoroughfareTrailingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE, newThoroughfareTrailingType, newThoroughfareTrailingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThoroughfarePostDirectionType getThoroughfarePostDirection() {
		return thoroughfarePostDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfarePostDirection(ThoroughfarePostDirectionType newThoroughfarePostDirection, NotificationChain msgs) {
		ThoroughfarePostDirectionType oldThoroughfarePostDirection = thoroughfarePostDirection;
		thoroughfarePostDirection = newThoroughfarePostDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, oldThoroughfarePostDirection, newThoroughfarePostDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThoroughfarePostDirection(ThoroughfarePostDirectionType newThoroughfarePostDirection) {
		if (newThoroughfarePostDirection != thoroughfarePostDirection) {
			NotificationChain msgs = null;
			if (thoroughfarePostDirection != null)
				msgs = ((InternalEObject)thoroughfarePostDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, null, msgs);
			if (newThoroughfarePostDirection != null)
				msgs = ((InternalEObject)newThoroughfarePostDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, null, msgs);
			msgs = basicSetThoroughfarePostDirection(newThoroughfarePostDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION, newThoroughfarePostDirection, newThoroughfarePostDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY);
		}
		return any;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE);
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
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE:
				return ((InternalEList<?>)getAddressLine()).basicRemove(otherEnd, msgs);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				return basicSetThoroughfarePreDirection(null, msgs);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				return basicSetThoroughfareLeadingType(null, msgs);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				return ((InternalEList<?>)getThoroughfareName()).basicRemove(otherEnd, msgs);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				return basicSetThoroughfareTrailingType(null, msgs);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				return basicSetThoroughfarePostDirection(null, msgs);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				return getThoroughfarePreDirection();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				return getThoroughfareLeadingType();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				return getThoroughfareName();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				return getThoroughfareTrailingType();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				return getThoroughfarePostDirection();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__TYPE:
				return getType();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				getAddressLine().addAll((Collection<? extends AddressLineType>)newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				setThoroughfarePreDirection((ThoroughfarePreDirectionType)newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				setThoroughfareLeadingType((ThoroughfareLeadingTypeType)newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				getThoroughfareName().clear();
				getThoroughfareName().addAll((Collection<? extends ThoroughfareNameType>)newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				setThoroughfareTrailingType((ThoroughfareTrailingTypeType)newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				setThoroughfarePostDirection((ThoroughfarePostDirectionType)newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__TYPE:
				setType(newValue);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE:
				getAddressLine().clear();
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				setThoroughfarePreDirection((ThoroughfarePreDirectionType)null);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				setThoroughfareLeadingType((ThoroughfareLeadingTypeType)null);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				getThoroughfareName().clear();
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				setThoroughfareTrailingType((ThoroughfareTrailingTypeType)null);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				setThoroughfarePostDirection((ThoroughfarePostDirectionType)null);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY:
				getAny().clear();
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ADDRESS_LINE:
				return addressLine != null && !addressLine.isEmpty();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_PRE_DIRECTION:
				return thoroughfarePreDirection != null;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_LEADING_TYPE:
				return thoroughfareLeadingType != null;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_NAME:
				return thoroughfareName != null && !thoroughfareName.isEmpty();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_TRAILING_TYPE:
				return thoroughfareTrailingType != null;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__THOROUGHFARE_POST_DIRECTION:
				return thoroughfarePostDirection != null;
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XALPackage.DEPENDENT_THOROUGHFARE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", type: ");
		result.append(type);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DependentThoroughfareTypeImpl
