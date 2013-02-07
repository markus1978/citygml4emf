/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.Collection;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.AppearanceType;
import net.opengis.citygml.appearance.SurfaceDataPropertyType;
import net.opengis.gml.impl.AbstractFeatureTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.AppearanceTypeImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AppearanceTypeImpl#getSurfaceDataMember <em>Surface Data Member</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AppearanceTypeImpl#getGenericApplicationPropertyOfAppearanceGroup <em>Generic Application Property Of Appearance Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AppearanceTypeImpl#getGenericApplicationPropertyOfAppearance <em>Generic Application Property Of Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppearanceTypeImpl extends AbstractFeatureTypeImpl implements AppearanceType {
	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final String THEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected String theme = THEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSurfaceDataMember() <em>Surface Data Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceDataMember()
	 * @generated
	 * @ordered
	 */
	protected EList<SurfaceDataPropertyType> surfaceDataMember;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfAppearanceGroup() <em>Generic Application Property Of Appearance Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfAppearanceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfAppearanceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.APPEARANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(String newTheme) {
		String oldTheme = theme;
		theme = newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.APPEARANCE_TYPE__THEME, oldTheme, theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SurfaceDataPropertyType> getSurfaceDataMember() {
		if (surfaceDataMember == null) {
			surfaceDataMember = new EObjectContainmentEList<SurfaceDataPropertyType>(SurfaceDataPropertyType.class, this, AppearancePackage.APPEARANCE_TYPE__SURFACE_DATA_MEMBER);
		}
		return surfaceDataMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfAppearanceGroup() {
		if (genericApplicationPropertyOfAppearanceGroup == null) {
			genericApplicationPropertyOfAppearanceGroup = new BasicFeatureMap(this, AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP);
		}
		return genericApplicationPropertyOfAppearanceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfAppearance() {
		return getGenericApplicationPropertyOfAppearanceGroup().list(AppearancePackage.Literals.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.APPEARANCE_TYPE__SURFACE_DATA_MEMBER:
				return ((InternalEList<?>)getSurfaceDataMember()).basicRemove(otherEnd, msgs);
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfAppearanceGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfAppearance()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.APPEARANCE_TYPE__THEME:
				return getTheme();
			case AppearancePackage.APPEARANCE_TYPE__SURFACE_DATA_MEMBER:
				return getSurfaceDataMember();
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfAppearanceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfAppearanceGroup()).getWrapper();
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE:
				return getGenericApplicationPropertyOfAppearance();
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
			case AppearancePackage.APPEARANCE_TYPE__THEME:
				setTheme((String)newValue);
				return;
			case AppearancePackage.APPEARANCE_TYPE__SURFACE_DATA_MEMBER:
				getSurfaceDataMember().clear();
				getSurfaceDataMember().addAll((Collection<? extends SurfaceDataPropertyType>)newValue);
				return;
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfAppearanceGroup()).set(newValue);
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
			case AppearancePackage.APPEARANCE_TYPE__THEME:
				setTheme(THEME_EDEFAULT);
				return;
			case AppearancePackage.APPEARANCE_TYPE__SURFACE_DATA_MEMBER:
				getSurfaceDataMember().clear();
				return;
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP:
				getGenericApplicationPropertyOfAppearanceGroup().clear();
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
			case AppearancePackage.APPEARANCE_TYPE__THEME:
				return THEME_EDEFAULT == null ? theme != null : !THEME_EDEFAULT.equals(theme);
			case AppearancePackage.APPEARANCE_TYPE__SURFACE_DATA_MEMBER:
				return surfaceDataMember != null && !surfaceDataMember.isEmpty();
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE_GROUP:
				return genericApplicationPropertyOfAppearanceGroup != null && !genericApplicationPropertyOfAppearanceGroup.isEmpty();
			case AppearancePackage.APPEARANCE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE:
				return !getGenericApplicationPropertyOfAppearance().isEmpty();
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
		result.append(" (theme: ");
		result.append(theme);
		result.append(", genericApplicationPropertyOfAppearanceGroup: ");
		result.append(genericApplicationPropertyOfAppearanceGroup);
		result.append(')');
		return result.toString();
	}

} //AppearanceTypeImpl
