/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import net.opengis.citygml.appearance.AbstractTextureParameterizationType;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.gml.impl.AbstractGMLTypeImpl;

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
 * An implementation of the model object '<em><b>Abstract Texture Parameterization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureParameterizationTypeImpl#getGenericApplicationPropertyOfTextureParameterizationGroup <em>Generic Application Property Of Texture Parameterization Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureParameterizationTypeImpl#getGenericApplicationPropertyOfTextureParameterization <em>Generic Application Property Of Texture Parameterization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTextureParameterizationTypeImpl extends AbstractGMLTypeImpl implements AbstractTextureParameterizationType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTextureParameterizationGroup() <em>Generic Application Property Of Texture Parameterization Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTextureParameterizationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTextureParameterizationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTextureParameterizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTextureParameterizationGroup() {
		if (genericApplicationPropertyOfTextureParameterizationGroup == null) {
			genericApplicationPropertyOfTextureParameterizationGroup = new BasicFeatureMap(this, AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP);
		}
		return genericApplicationPropertyOfTextureParameterizationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTextureParameterization() {
		return getGenericApplicationPropertyOfTextureParameterizationGroup().list(AppearancePackage.Literals.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTextureParameterizationGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTextureParameterization()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTextureParameterizationGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTextureParameterizationGroup()).getWrapper();
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION:
				return getGenericApplicationPropertyOfTextureParameterization();
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
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTextureParameterizationGroup()).set(newValue);
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
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP:
				getGenericApplicationPropertyOfTextureParameterizationGroup().clear();
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
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION_GROUP:
				return genericApplicationPropertyOfTextureParameterizationGroup != null && !genericApplicationPropertyOfTextureParameterizationGroup.isEmpty();
			case AppearancePackage.ABSTRACT_TEXTURE_PARAMETERIZATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION:
				return !getGenericApplicationPropertyOfTextureParameterization().isEmpty();
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
		result.append(" (genericApplicationPropertyOfTextureParameterizationGroup: ");
		result.append(genericApplicationPropertyOfTextureParameterizationGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractTextureParameterizationTypeImpl
