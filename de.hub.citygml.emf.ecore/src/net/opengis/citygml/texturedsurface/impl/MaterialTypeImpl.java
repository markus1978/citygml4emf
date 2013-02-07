/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.impl;

import java.util.List;

import net.opengis.citygml.texturedsurface.MaterialType;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl#getShininess <em>Shininess</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl#getAmbientIntensity <em>Ambient Intensity</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl#getSpecularColor <em>Specular Color</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl#getDiffuseColor <em>Diffuse Color</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.MaterialTypeImpl#getEmissiveColor <em>Emissive Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MaterialTypeImpl extends AbstractAppearanceTypeImpl implements MaterialType {
	/**
	 * The default value of the '{@link #getShininess() <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShininess()
	 * @generated
	 * @ordered
	 */
	protected static final double SHININESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShininess() <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShininess()
	 * @generated
	 * @ordered
	 */
	protected double shininess = SHININESS_EDEFAULT;

	/**
	 * This is true if the Shininess attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shininessESet;

	/**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final double TRANSPARENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected double transparency = TRANSPARENCY_EDEFAULT;

	/**
	 * This is true if the Transparency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transparencyESet;

	/**
	 * The default value of the '{@link #getAmbientIntensity() <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double AMBIENT_INTENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmbientIntensity() <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensity()
	 * @generated
	 * @ordered
	 */
	protected double ambientIntensity = AMBIENT_INTENSITY_EDEFAULT;

	/**
	 * This is true if the Ambient Intensity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ambientIntensityESet;

	/**
	 * The default value of the '{@link #getSpecularColor() <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColor()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> SPECULAR_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecularColor() <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColor()
	 * @generated
	 * @ordered
	 */
	protected List<Double> specularColor = SPECULAR_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> DIFFUSE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected List<Double> diffuseColor = DIFFUSE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmissiveColor() <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissiveColor()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> EMISSIVE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmissiveColor() <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissiveColor()
	 * @generated
	 * @ordered
	 */
	protected List<Double> emissiveColor = EMISSIVE_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TexturedsurfacePackage.Literals.MATERIAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShininess() {
		return shininess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShininess(double newShininess) {
		double oldShininess = shininess;
		shininess = newShininess;
		boolean oldShininessESet = shininessESet;
		shininessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.MATERIAL_TYPE__SHININESS, oldShininess, shininess, !oldShininessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShininess() {
		double oldShininess = shininess;
		boolean oldShininessESet = shininessESet;
		shininess = SHININESS_EDEFAULT;
		shininessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TexturedsurfacePackage.MATERIAL_TYPE__SHININESS, oldShininess, SHININESS_EDEFAULT, oldShininessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShininess() {
		return shininessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTransparency() {
		return transparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(double newTransparency) {
		double oldTransparency = transparency;
		transparency = newTransparency;
		boolean oldTransparencyESet = transparencyESet;
		transparencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.MATERIAL_TYPE__TRANSPARENCY, oldTransparency, transparency, !oldTransparencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransparency() {
		double oldTransparency = transparency;
		boolean oldTransparencyESet = transparencyESet;
		transparency = TRANSPARENCY_EDEFAULT;
		transparencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TexturedsurfacePackage.MATERIAL_TYPE__TRANSPARENCY, oldTransparency, TRANSPARENCY_EDEFAULT, oldTransparencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransparency() {
		return transparencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmbientIntensity() {
		return ambientIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbientIntensity(double newAmbientIntensity) {
		double oldAmbientIntensity = ambientIntensity;
		ambientIntensity = newAmbientIntensity;
		boolean oldAmbientIntensityESet = ambientIntensityESet;
		ambientIntensityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.MATERIAL_TYPE__AMBIENT_INTENSITY, oldAmbientIntensity, ambientIntensity, !oldAmbientIntensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAmbientIntensity() {
		double oldAmbientIntensity = ambientIntensity;
		boolean oldAmbientIntensityESet = ambientIntensityESet;
		ambientIntensity = AMBIENT_INTENSITY_EDEFAULT;
		ambientIntensityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TexturedsurfacePackage.MATERIAL_TYPE__AMBIENT_INTENSITY, oldAmbientIntensity, AMBIENT_INTENSITY_EDEFAULT, oldAmbientIntensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAmbientIntensity() {
		return ambientIntensityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getSpecularColor() {
		return specularColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularColor(List<Double> newSpecularColor) {
		List<Double> oldSpecularColor = specularColor;
		specularColor = newSpecularColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.MATERIAL_TYPE__SPECULAR_COLOR, oldSpecularColor, specularColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getDiffuseColor() {
		return diffuseColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseColor(List<Double> newDiffuseColor) {
		List<Double> oldDiffuseColor = diffuseColor;
		diffuseColor = newDiffuseColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.MATERIAL_TYPE__DIFFUSE_COLOR, oldDiffuseColor, diffuseColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getEmissiveColor() {
		return emissiveColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmissiveColor(List<Double> newEmissiveColor) {
		List<Double> oldEmissiveColor = emissiveColor;
		emissiveColor = newEmissiveColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.MATERIAL_TYPE__EMISSIVE_COLOR, oldEmissiveColor, emissiveColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TexturedsurfacePackage.MATERIAL_TYPE__SHININESS:
				return getShininess();
			case TexturedsurfacePackage.MATERIAL_TYPE__TRANSPARENCY:
				return getTransparency();
			case TexturedsurfacePackage.MATERIAL_TYPE__AMBIENT_INTENSITY:
				return getAmbientIntensity();
			case TexturedsurfacePackage.MATERIAL_TYPE__SPECULAR_COLOR:
				return getSpecularColor();
			case TexturedsurfacePackage.MATERIAL_TYPE__DIFFUSE_COLOR:
				return getDiffuseColor();
			case TexturedsurfacePackage.MATERIAL_TYPE__EMISSIVE_COLOR:
				return getEmissiveColor();
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
			case TexturedsurfacePackage.MATERIAL_TYPE__SHININESS:
				setShininess((Double)newValue);
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__TRANSPARENCY:
				setTransparency((Double)newValue);
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__AMBIENT_INTENSITY:
				setAmbientIntensity((Double)newValue);
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__SPECULAR_COLOR:
				setSpecularColor((List<Double>)newValue);
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__DIFFUSE_COLOR:
				setDiffuseColor((List<Double>)newValue);
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__EMISSIVE_COLOR:
				setEmissiveColor((List<Double>)newValue);
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
			case TexturedsurfacePackage.MATERIAL_TYPE__SHININESS:
				unsetShininess();
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__TRANSPARENCY:
				unsetTransparency();
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__AMBIENT_INTENSITY:
				unsetAmbientIntensity();
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__SPECULAR_COLOR:
				setSpecularColor(SPECULAR_COLOR_EDEFAULT);
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__DIFFUSE_COLOR:
				setDiffuseColor(DIFFUSE_COLOR_EDEFAULT);
				return;
			case TexturedsurfacePackage.MATERIAL_TYPE__EMISSIVE_COLOR:
				setEmissiveColor(EMISSIVE_COLOR_EDEFAULT);
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
			case TexturedsurfacePackage.MATERIAL_TYPE__SHININESS:
				return isSetShininess();
			case TexturedsurfacePackage.MATERIAL_TYPE__TRANSPARENCY:
				return isSetTransparency();
			case TexturedsurfacePackage.MATERIAL_TYPE__AMBIENT_INTENSITY:
				return isSetAmbientIntensity();
			case TexturedsurfacePackage.MATERIAL_TYPE__SPECULAR_COLOR:
				return SPECULAR_COLOR_EDEFAULT == null ? specularColor != null : !SPECULAR_COLOR_EDEFAULT.equals(specularColor);
			case TexturedsurfacePackage.MATERIAL_TYPE__DIFFUSE_COLOR:
				return DIFFUSE_COLOR_EDEFAULT == null ? diffuseColor != null : !DIFFUSE_COLOR_EDEFAULT.equals(diffuseColor);
			case TexturedsurfacePackage.MATERIAL_TYPE__EMISSIVE_COLOR:
				return EMISSIVE_COLOR_EDEFAULT == null ? emissiveColor != null : !EMISSIVE_COLOR_EDEFAULT.equals(emissiveColor);
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
		result.append(" (shininess: ");
		if (shininessESet) result.append(shininess); else result.append("<unset>");
		result.append(", transparency: ");
		if (transparencyESet) result.append(transparency); else result.append("<unset>");
		result.append(", ambientIntensity: ");
		if (ambientIntensityESet) result.append(ambientIntensity); else result.append("<unset>");
		result.append(", specularColor: ");
		result.append(specularColor);
		result.append(", diffuseColor: ");
		result.append(diffuseColor);
		result.append(", emissiveColor: ");
		result.append(emissiveColor);
		result.append(')');
		return result.toString();
	}

} //MaterialTypeImpl
