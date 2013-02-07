/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.Collection;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.ParameterizedTextureType;
import net.opengis.citygml.appearance.TextureAssociationType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.ParameterizedTextureTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.ParameterizedTextureTypeImpl#getGenericApplicationPropertyOfParameterizedTextureGroup <em>Generic Application Property Of Parameterized Texture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.ParameterizedTextureTypeImpl#getGenericApplicationPropertyOfParameterizedTexture <em>Generic Application Property Of Parameterized Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterizedTextureTypeImpl extends AbstractTextureTypeImpl implements ParameterizedTextureType {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<TextureAssociationType> target;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfParameterizedTextureGroup() <em>Generic Application Property Of Parameterized Texture Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfParameterizedTextureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfParameterizedTextureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTextureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.PARAMETERIZED_TEXTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextureAssociationType> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<TextureAssociationType>(TextureAssociationType.class, this, AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfParameterizedTextureGroup() {
		if (genericApplicationPropertyOfParameterizedTextureGroup == null) {
			genericApplicationPropertyOfParameterizedTextureGroup = new BasicFeatureMap(this, AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP);
		}
		return genericApplicationPropertyOfParameterizedTextureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfParameterizedTexture() {
		return getGenericApplicationPropertyOfParameterizedTextureGroup().list(AppearancePackage.Literals.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfParameterizedTextureGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfParameterizedTexture()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__TARGET:
				return getTarget();
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfParameterizedTextureGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfParameterizedTextureGroup()).getWrapper();
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE:
				return getGenericApplicationPropertyOfParameterizedTexture();
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
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TextureAssociationType>)newValue);
				return;
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfParameterizedTextureGroup()).set(newValue);
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
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__TARGET:
				getTarget().clear();
				return;
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP:
				getGenericApplicationPropertyOfParameterizedTextureGroup().clear();
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
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__TARGET:
				return target != null && !target.isEmpty();
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE_GROUP:
				return genericApplicationPropertyOfParameterizedTextureGroup != null && !genericApplicationPropertyOfParameterizedTextureGroup.isEmpty();
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE:
				return !getGenericApplicationPropertyOfParameterizedTexture().isEmpty();
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
		result.append(" (genericApplicationPropertyOfParameterizedTextureGroup: ");
		result.append(genericApplicationPropertyOfParameterizedTextureGroup);
		result.append(')');
		return result.toString();
	}

} //ParameterizedTextureTypeImpl
