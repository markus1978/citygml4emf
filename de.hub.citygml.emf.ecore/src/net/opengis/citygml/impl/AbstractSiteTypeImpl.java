/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import net.opengis.citygml.AbstractSiteType;
import net.opengis.citygml.CitygmlPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Site Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.AbstractSiteTypeImpl#getGenericApplicationPropertyOfSiteGroup <em>Generic Application Property Of Site Group</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AbstractSiteTypeImpl#getGenericApplicationPropertyOfSite <em>Generic Application Property Of Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractSiteTypeImpl extends AbstractCityObjectTypeImpl implements AbstractSiteType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfSiteGroup() <em>Generic Application Property Of Site Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfSiteGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfSiteGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSiteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.ABSTRACT_SITE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfSiteGroup() {
		if (genericApplicationPropertyOfSiteGroup == null) {
			genericApplicationPropertyOfSiteGroup = new BasicFeatureMap(this, CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP);
		}
		return genericApplicationPropertyOfSiteGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfSite() {
		return getGenericApplicationPropertyOfSiteGroup().list(CitygmlPackage.Literals.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSiteGroup()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSite()).basicRemove(otherEnd, msgs);
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
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfSiteGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfSiteGroup()).getWrapper();
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE:
				return getGenericApplicationPropertyOfSite();
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
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfSiteGroup()).set(newValue);
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
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP:
				getGenericApplicationPropertyOfSiteGroup().clear();
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
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE_GROUP:
				return genericApplicationPropertyOfSiteGroup != null && !genericApplicationPropertyOfSiteGroup.isEmpty();
			case CitygmlPackage.ABSTRACT_SITE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SITE:
				return !getGenericApplicationPropertyOfSite().isEmpty();
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
		result.append(" (genericApplicationPropertyOfSiteGroup: ");
		result.append(genericApplicationPropertyOfSiteGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractSiteTypeImpl
