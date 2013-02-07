/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import net.opengis.citygml.appearance.AbstractSurfaceDataType;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.gml.impl.AbstractFeatureTypeImpl;

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
 * An implementation of the model object '<em><b>Abstract Surface Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractSurfaceDataTypeImpl#isIsFront <em>Is Front</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractSurfaceDataTypeImpl#getGenericApplicationPropertyOfSurfaceDataGroup <em>Generic Application Property Of Surface Data Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractSurfaceDataTypeImpl#getGenericApplicationPropertyOfSurfaceData <em>Generic Application Property Of Surface Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractSurfaceDataTypeImpl extends AbstractFeatureTypeImpl implements AbstractSurfaceDataType {
	/**
	 * The default value of the '{@link #isIsFront() <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFront()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FRONT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsFront() <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFront()
	 * @generated
	 * @ordered
	 */
	protected boolean isFront = IS_FRONT_EDEFAULT;

	/**
	 * This is true if the Is Front attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isFrontESet;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfSurfaceDataGroup() <em>Generic Application Property Of Surface Data Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfSurfaceDataGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfSurfaceDataGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSurfaceDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.ABSTRACT_SURFACE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFront() {
		return isFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFront(boolean newIsFront) {
		boolean oldIsFront = isFront;
		isFront = newIsFront;
		boolean oldIsFrontESet = isFrontESet;
		isFrontESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT, oldIsFront, isFront, !oldIsFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsFront() {
		boolean oldIsFront = isFront;
		boolean oldIsFrontESet = isFrontESet;
		isFront = IS_FRONT_EDEFAULT;
		isFrontESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT, oldIsFront, IS_FRONT_EDEFAULT, oldIsFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsFront() {
		return isFrontESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfSurfaceDataGroup() {
		if (genericApplicationPropertyOfSurfaceDataGroup == null) {
			genericApplicationPropertyOfSurfaceDataGroup = new BasicFeatureMap(this, AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP);
		}
		return genericApplicationPropertyOfSurfaceDataGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfSurfaceData() {
		return getGenericApplicationPropertyOfSurfaceDataGroup().list(AppearancePackage.Literals.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSurfaceDataGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSurfaceData()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT:
				return isIsFront();
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP:
				if (coreType) return getGenericApplicationPropertyOfSurfaceDataGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfSurfaceDataGroup()).getWrapper();
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA:
				return getGenericApplicationPropertyOfSurfaceData();
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
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT:
				setIsFront((Boolean)newValue);
				return;
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfSurfaceDataGroup()).set(newValue);
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
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT:
				unsetIsFront();
				return;
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP:
				getGenericApplicationPropertyOfSurfaceDataGroup().clear();
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
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__IS_FRONT:
				return isSetIsFront();
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA_GROUP:
				return genericApplicationPropertyOfSurfaceDataGroup != null && !genericApplicationPropertyOfSurfaceDataGroup.isEmpty();
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA:
				return !getGenericApplicationPropertyOfSurfaceData().isEmpty();
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
		result.append(" (isFront: ");
		if (isFrontESet) result.append(isFront); else result.append("<unset>");
		result.append(", genericApplicationPropertyOfSurfaceDataGroup: ");
		result.append(genericApplicationPropertyOfSurfaceDataGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractSurfaceDataTypeImpl
