/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.citygml.relief.TINReliefType;
import net.opengis.citygml.relief.TinPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TIN Relief Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.impl.TINReliefTypeImpl#getTin <em>Tin</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.TINReliefTypeImpl#getGenericApplicationPropertyOfTinReliefGroup <em>Generic Application Property Of Tin Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.TINReliefTypeImpl#getGenericApplicationPropertyOfTinRelief <em>Generic Application Property Of Tin Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TINReliefTypeImpl extends AbstractReliefComponentTypeImpl implements TINReliefType {
	/**
	 * The cached value of the '{@link #getTin() <em>Tin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTin()
	 * @generated
	 * @ordered
	 */
	protected TinPropertyType tin;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTinReliefGroup() <em>Generic Application Property Of Tin Relief Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTinReliefGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTinReliefGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TINReliefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliefPackage.Literals.TIN_RELIEF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinPropertyType getTin() {
		return tin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTin(TinPropertyType newTin, NotificationChain msgs) {
		TinPropertyType oldTin = tin;
		tin = newTin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliefPackage.TIN_RELIEF_TYPE__TIN, oldTin, newTin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTin(TinPropertyType newTin) {
		if (newTin != tin) {
			NotificationChain msgs = null;
			if (tin != null)
				msgs = ((InternalEObject)tin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.TIN_RELIEF_TYPE__TIN, null, msgs);
			if (newTin != null)
				msgs = ((InternalEObject)newTin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.TIN_RELIEF_TYPE__TIN, null, msgs);
			msgs = basicSetTin(newTin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.TIN_RELIEF_TYPE__TIN, newTin, newTin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTinReliefGroup() {
		if (genericApplicationPropertyOfTinReliefGroup == null) {
			genericApplicationPropertyOfTinReliefGroup = new BasicFeatureMap(this, ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP);
		}
		return genericApplicationPropertyOfTinReliefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTinRelief() {
		return getGenericApplicationPropertyOfTinReliefGroup().list(ReliefPackage.Literals.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.TIN_RELIEF_TYPE__TIN:
				return basicSetTin(null, msgs);
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTinReliefGroup()).basicRemove(otherEnd, msgs);
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTinRelief()).basicRemove(otherEnd, msgs);
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
			case ReliefPackage.TIN_RELIEF_TYPE__TIN:
				return getTin();
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTinReliefGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTinReliefGroup()).getWrapper();
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF:
				return getGenericApplicationPropertyOfTinRelief();
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
			case ReliefPackage.TIN_RELIEF_TYPE__TIN:
				setTin((TinPropertyType)newValue);
				return;
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTinReliefGroup()).set(newValue);
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
			case ReliefPackage.TIN_RELIEF_TYPE__TIN:
				setTin((TinPropertyType)null);
				return;
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP:
				getGenericApplicationPropertyOfTinReliefGroup().clear();
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
			case ReliefPackage.TIN_RELIEF_TYPE__TIN:
				return tin != null;
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF_GROUP:
				return genericApplicationPropertyOfTinReliefGroup != null && !genericApplicationPropertyOfTinReliefGroup.isEmpty();
			case ReliefPackage.TIN_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF:
				return !getGenericApplicationPropertyOfTinRelief().isEmpty();
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
		result.append(" (genericApplicationPropertyOfTinReliefGroup: ");
		result.append(genericApplicationPropertyOfTinReliefGroup);
		result.append(')');
		return result.toString();
	}

} //TINReliefTypeImpl
