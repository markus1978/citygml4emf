/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.impl;

import java.util.Collection;

import net.opengis.citygml.texturedsurface.AppearancePropertyType;
import net.opengis.citygml.texturedsurface.TexturedSurfaceType;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;
import net.opengis.gml.impl.OrientableSurfaceTypeImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textured Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.TexturedSurfaceTypeImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TexturedSurfaceTypeImpl extends OrientableSurfaceTypeImpl implements TexturedSurfaceType {
	/**
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected EList<AppearancePropertyType> appearance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TexturedSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TexturedsurfacePackage.Literals.TEXTURED_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppearancePropertyType> getAppearance() {
		if (appearance == null) {
			appearance = new EObjectContainmentEList<AppearancePropertyType>(AppearancePropertyType.class, this, TexturedsurfacePackage.TEXTURED_SURFACE_TYPE__APPEARANCE);
		}
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE__APPEARANCE:
				return ((InternalEList<?>)getAppearance()).basicRemove(otherEnd, msgs);
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
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE__APPEARANCE:
				return getAppearance();
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
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE__APPEARANCE:
				getAppearance().clear();
				getAppearance().addAll((Collection<? extends AppearancePropertyType>)newValue);
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
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE__APPEARANCE:
				getAppearance().clear();
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
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE__APPEARANCE:
				return appearance != null && !appearance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TexturedSurfaceTypeImpl
