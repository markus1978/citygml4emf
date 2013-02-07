/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.AppearancePropertyType;
import net.opengis.citygml.appearance.AppearanceType;
import net.opengis.gml.impl.FeaturePropertyTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.AppearancePropertyTypeImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppearancePropertyTypeImpl extends FeaturePropertyTypeImpl implements AppearancePropertyType {
	/**
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected AppearanceType appearance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearancePropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.APPEARANCE_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceType getAppearance() {
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(AppearanceType newAppearance, NotificationChain msgs) {
		AppearanceType oldAppearance = appearance;
		appearance = newAppearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE, oldAppearance, newAppearance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(AppearanceType newAppearance) {
		if (newAppearance != appearance) {
			NotificationChain msgs = null;
			if (appearance != null)
				msgs = ((InternalEObject)appearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE, null, msgs);
			if (newAppearance != null)
				msgs = ((InternalEObject)newAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE, null, msgs);
			msgs = basicSetAppearance(newAppearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE, newAppearance, newAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE:
				return basicSetAppearance(null, msgs);
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
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE:
				return getAppearance();
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
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE:
				setAppearance((AppearanceType)newValue);
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
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE:
				setAppearance((AppearanceType)null);
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
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE__APPEARANCE:
				return appearance != null;
		}
		return super.eIsSet(featureID);
	}

} //AppearancePropertyTypeImpl
