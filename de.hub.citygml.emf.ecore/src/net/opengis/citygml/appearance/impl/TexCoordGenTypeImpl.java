/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.TexCoordGenType;
import net.opengis.citygml.appearance.WorldToTextureType;

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
 * An implementation of the model object '<em><b>Tex Coord Gen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.TexCoordGenTypeImpl#getWorldToTexture <em>World To Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.TexCoordGenTypeImpl#getGenericApplicationPropertyOfTexCoordGenGroup <em>Generic Application Property Of Tex Coord Gen Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.TexCoordGenTypeImpl#getGenericApplicationPropertyOfTexCoordGen <em>Generic Application Property Of Tex Coord Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TexCoordGenTypeImpl extends AbstractTextureParameterizationTypeImpl implements TexCoordGenType {
	/**
	 * The cached value of the '{@link #getWorldToTexture() <em>World To Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorldToTexture()
	 * @generated
	 * @ordered
	 */
	protected WorldToTextureType worldToTexture;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTexCoordGenGroup() <em>Generic Application Property Of Tex Coord Gen Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTexCoordGenGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTexCoordGenGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TexCoordGenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.TEX_COORD_GEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldToTextureType getWorldToTexture() {
		return worldToTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorldToTexture(WorldToTextureType newWorldToTexture, NotificationChain msgs) {
		WorldToTextureType oldWorldToTexture = worldToTexture;
		worldToTexture = newWorldToTexture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE, oldWorldToTexture, newWorldToTexture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorldToTexture(WorldToTextureType newWorldToTexture) {
		if (newWorldToTexture != worldToTexture) {
			NotificationChain msgs = null;
			if (worldToTexture != null)
				msgs = ((InternalEObject)worldToTexture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE, null, msgs);
			if (newWorldToTexture != null)
				msgs = ((InternalEObject)newWorldToTexture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE, null, msgs);
			msgs = basicSetWorldToTexture(newWorldToTexture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE, newWorldToTexture, newWorldToTexture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTexCoordGenGroup() {
		if (genericApplicationPropertyOfTexCoordGenGroup == null) {
			genericApplicationPropertyOfTexCoordGenGroup = new BasicFeatureMap(this, AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP);
		}
		return genericApplicationPropertyOfTexCoordGenGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTexCoordGen() {
		return getGenericApplicationPropertyOfTexCoordGenGroup().list(AppearancePackage.Literals.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE:
				return basicSetWorldToTexture(null, msgs);
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTexCoordGenGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTexCoordGen()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE:
				return getWorldToTexture();
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTexCoordGenGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTexCoordGenGroup()).getWrapper();
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN:
				return getGenericApplicationPropertyOfTexCoordGen();
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
			case AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE:
				setWorldToTexture((WorldToTextureType)newValue);
				return;
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTexCoordGenGroup()).set(newValue);
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
			case AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE:
				setWorldToTexture((WorldToTextureType)null);
				return;
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP:
				getGenericApplicationPropertyOfTexCoordGenGroup().clear();
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
			case AppearancePackage.TEX_COORD_GEN_TYPE__WORLD_TO_TEXTURE:
				return worldToTexture != null;
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN_GROUP:
				return genericApplicationPropertyOfTexCoordGenGroup != null && !genericApplicationPropertyOfTexCoordGenGroup.isEmpty();
			case AppearancePackage.TEX_COORD_GEN_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN:
				return !getGenericApplicationPropertyOfTexCoordGen().isEmpty();
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
		result.append(" (genericApplicationPropertyOfTexCoordGenGroup: ");
		result.append(genericApplicationPropertyOfTexCoordGenGroup);
		result.append(')');
		return result.toString();
	}

} //TexCoordGenTypeImpl
