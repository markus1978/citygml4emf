/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.Collection;
import java.util.List;

import net.opengis.citygml.appearance.AppearanceFactory;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.X3DMaterialType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X3D Material Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getAmbientIntensity <em>Ambient Intensity</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getDiffuseColor <em>Diffuse Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getEmissiveColor <em>Emissive Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getSpecularColor <em>Specular Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getShininess <em>Shininess</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#isIsSmooth <em>Is Smooth</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getGenericApplicationPropertyOfX3DMaterialGroup <em>Generic Application Property Of X3D Material Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.X3DMaterialTypeImpl#getGenericApplicationPropertyOfX3DMaterial <em>Generic Application Property Of X3D Material</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class X3DMaterialTypeImpl extends AbstractSurfaceDataTypeImpl implements X3DMaterialType {
	/**
	 * The default value of the '{@link #getAmbientIntensity() <em>Ambient Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final double AMBIENT_INTENSITY_EDEFAULT = 0.2;

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
	 * The default value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected static final List DIFFUSE_COLOR_EDEFAULT = (List)AppearanceFactory.eINSTANCE.createFromString(AppearancePackage.eINSTANCE.getColor(), "0.8 0.8 0.8");

	/**
	 * The cached value of the '{@link #getDiffuseColor() <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseColor()
	 * @generated
	 * @ordered
	 */
	protected List diffuseColor = DIFFUSE_COLOR_EDEFAULT;

	/**
	 * This is true if the Diffuse Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean diffuseColorESet;

	/**
	 * The default value of the '{@link #getEmissiveColor() <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissiveColor()
	 * @generated
	 * @ordered
	 */
	protected static final List EMISSIVE_COLOR_EDEFAULT = (List)AppearanceFactory.eINSTANCE.createFromString(AppearancePackage.eINSTANCE.getColor(), "0.0 0.0 0.0");

	/**
	 * The cached value of the '{@link #getEmissiveColor() <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissiveColor()
	 * @generated
	 * @ordered
	 */
	protected List emissiveColor = EMISSIVE_COLOR_EDEFAULT;

	/**
	 * This is true if the Emissive Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emissiveColorESet;

	/**
	 * The default value of the '{@link #getSpecularColor() <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColor()
	 * @generated
	 * @ordered
	 */
	protected static final List SPECULAR_COLOR_EDEFAULT = (List)AppearanceFactory.eINSTANCE.createFromString(AppearancePackage.eINSTANCE.getColor(), "1.0 1.0 1.0");

	/**
	 * The cached value of the '{@link #getSpecularColor() <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecularColor()
	 * @generated
	 * @ordered
	 */
	protected List specularColor = SPECULAR_COLOR_EDEFAULT;

	/**
	 * This is true if the Specular Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specularColorESet;

	/**
	 * The default value of the '{@link #getShininess() <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShininess()
	 * @generated
	 * @ordered
	 */
	protected static final double SHININESS_EDEFAULT = 0.2;

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
	 * The default value of the '{@link #isIsSmooth() <em>Is Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSmooth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SMOOTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSmooth() <em>Is Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSmooth()
	 * @generated
	 * @ordered
	 */
	protected boolean isSmooth = IS_SMOOTH_EDEFAULT;

	/**
	 * This is true if the Is Smooth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSmoothESet;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<String> target;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfX3DMaterialGroup() <em>Generic Application Property Of X3D Material Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfX3DMaterialGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfX3DMaterialGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected X3DMaterialTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.X3D_MATERIAL_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.X3D_MATERIAL_TYPE__AMBIENT_INTENSITY, oldAmbientIntensity, ambientIntensity, !oldAmbientIntensityESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.X3D_MATERIAL_TYPE__AMBIENT_INTENSITY, oldAmbientIntensity, AMBIENT_INTENSITY_EDEFAULT, oldAmbientIntensityESet));
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
	public List getDiffuseColor() {
		return diffuseColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseColor(List newDiffuseColor) {
		List oldDiffuseColor = diffuseColor;
		diffuseColor = newDiffuseColor;
		boolean oldDiffuseColorESet = diffuseColorESet;
		diffuseColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.X3D_MATERIAL_TYPE__DIFFUSE_COLOR, oldDiffuseColor, diffuseColor, !oldDiffuseColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiffuseColor() {
		List oldDiffuseColor = diffuseColor;
		boolean oldDiffuseColorESet = diffuseColorESet;
		diffuseColor = DIFFUSE_COLOR_EDEFAULT;
		diffuseColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.X3D_MATERIAL_TYPE__DIFFUSE_COLOR, oldDiffuseColor, DIFFUSE_COLOR_EDEFAULT, oldDiffuseColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiffuseColor() {
		return diffuseColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getEmissiveColor() {
		return emissiveColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmissiveColor(List newEmissiveColor) {
		List oldEmissiveColor = emissiveColor;
		emissiveColor = newEmissiveColor;
		boolean oldEmissiveColorESet = emissiveColorESet;
		emissiveColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.X3D_MATERIAL_TYPE__EMISSIVE_COLOR, oldEmissiveColor, emissiveColor, !oldEmissiveColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEmissiveColor() {
		List oldEmissiveColor = emissiveColor;
		boolean oldEmissiveColorESet = emissiveColorESet;
		emissiveColor = EMISSIVE_COLOR_EDEFAULT;
		emissiveColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.X3D_MATERIAL_TYPE__EMISSIVE_COLOR, oldEmissiveColor, EMISSIVE_COLOR_EDEFAULT, oldEmissiveColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEmissiveColor() {
		return emissiveColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getSpecularColor() {
		return specularColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecularColor(List newSpecularColor) {
		List oldSpecularColor = specularColor;
		specularColor = newSpecularColor;
		boolean oldSpecularColorESet = specularColorESet;
		specularColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.X3D_MATERIAL_TYPE__SPECULAR_COLOR, oldSpecularColor, specularColor, !oldSpecularColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecularColor() {
		List oldSpecularColor = specularColor;
		boolean oldSpecularColorESet = specularColorESet;
		specularColor = SPECULAR_COLOR_EDEFAULT;
		specularColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.X3D_MATERIAL_TYPE__SPECULAR_COLOR, oldSpecularColor, SPECULAR_COLOR_EDEFAULT, oldSpecularColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecularColor() {
		return specularColorESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.X3D_MATERIAL_TYPE__SHININESS, oldShininess, shininess, !oldShininessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.X3D_MATERIAL_TYPE__SHININESS, oldShininess, SHININESS_EDEFAULT, oldShininessESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.X3D_MATERIAL_TYPE__TRANSPARENCY, oldTransparency, transparency, !oldTransparencyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.X3D_MATERIAL_TYPE__TRANSPARENCY, oldTransparency, TRANSPARENCY_EDEFAULT, oldTransparencyESet));
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
	public boolean isIsSmooth() {
		return isSmooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSmooth(boolean newIsSmooth) {
		boolean oldIsSmooth = isSmooth;
		isSmooth = newIsSmooth;
		boolean oldIsSmoothESet = isSmoothESet;
		isSmoothESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.X3D_MATERIAL_TYPE__IS_SMOOTH, oldIsSmooth, isSmooth, !oldIsSmoothESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSmooth() {
		boolean oldIsSmooth = isSmooth;
		boolean oldIsSmoothESet = isSmoothESet;
		isSmooth = IS_SMOOTH_EDEFAULT;
		isSmoothESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.X3D_MATERIAL_TYPE__IS_SMOOTH, oldIsSmooth, IS_SMOOTH_EDEFAULT, oldIsSmoothESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSmooth() {
		return isSmoothESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTarget() {
		if (target == null) {
			target = new EDataTypeEList<String>(String.class, this, AppearancePackage.X3D_MATERIAL_TYPE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfX3DMaterialGroup() {
		if (genericApplicationPropertyOfX3DMaterialGroup == null) {
			genericApplicationPropertyOfX3DMaterialGroup = new BasicFeatureMap(this, AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP);
		}
		return genericApplicationPropertyOfX3DMaterialGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfX3DMaterial() {
		return getGenericApplicationPropertyOfX3DMaterialGroup().list(AppearancePackage.Literals.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfX3DMaterialGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL:
				return ((InternalEList<?>)getGenericApplicationPropertyOfX3DMaterial()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.X3D_MATERIAL_TYPE__AMBIENT_INTENSITY:
				return getAmbientIntensity();
			case AppearancePackage.X3D_MATERIAL_TYPE__DIFFUSE_COLOR:
				return getDiffuseColor();
			case AppearancePackage.X3D_MATERIAL_TYPE__EMISSIVE_COLOR:
				return getEmissiveColor();
			case AppearancePackage.X3D_MATERIAL_TYPE__SPECULAR_COLOR:
				return getSpecularColor();
			case AppearancePackage.X3D_MATERIAL_TYPE__SHININESS:
				return getShininess();
			case AppearancePackage.X3D_MATERIAL_TYPE__TRANSPARENCY:
				return getTransparency();
			case AppearancePackage.X3D_MATERIAL_TYPE__IS_SMOOTH:
				return isIsSmooth();
			case AppearancePackage.X3D_MATERIAL_TYPE__TARGET:
				return getTarget();
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP:
				if (coreType) return getGenericApplicationPropertyOfX3DMaterialGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfX3DMaterialGroup()).getWrapper();
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL:
				return getGenericApplicationPropertyOfX3DMaterial();
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
			case AppearancePackage.X3D_MATERIAL_TYPE__AMBIENT_INTENSITY:
				setAmbientIntensity((Double)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__DIFFUSE_COLOR:
				setDiffuseColor((List)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__EMISSIVE_COLOR:
				setEmissiveColor((List)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__SPECULAR_COLOR:
				setSpecularColor((List)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__SHININESS:
				setShininess((Double)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__TRANSPARENCY:
				setTransparency((Double)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__IS_SMOOTH:
				setIsSmooth((Boolean)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends String>)newValue);
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfX3DMaterialGroup()).set(newValue);
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
			case AppearancePackage.X3D_MATERIAL_TYPE__AMBIENT_INTENSITY:
				unsetAmbientIntensity();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__DIFFUSE_COLOR:
				unsetDiffuseColor();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__EMISSIVE_COLOR:
				unsetEmissiveColor();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__SPECULAR_COLOR:
				unsetSpecularColor();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__SHININESS:
				unsetShininess();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__TRANSPARENCY:
				unsetTransparency();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__IS_SMOOTH:
				unsetIsSmooth();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__TARGET:
				getTarget().clear();
				return;
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP:
				getGenericApplicationPropertyOfX3DMaterialGroup().clear();
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
			case AppearancePackage.X3D_MATERIAL_TYPE__AMBIENT_INTENSITY:
				return isSetAmbientIntensity();
			case AppearancePackage.X3D_MATERIAL_TYPE__DIFFUSE_COLOR:
				return isSetDiffuseColor();
			case AppearancePackage.X3D_MATERIAL_TYPE__EMISSIVE_COLOR:
				return isSetEmissiveColor();
			case AppearancePackage.X3D_MATERIAL_TYPE__SPECULAR_COLOR:
				return isSetSpecularColor();
			case AppearancePackage.X3D_MATERIAL_TYPE__SHININESS:
				return isSetShininess();
			case AppearancePackage.X3D_MATERIAL_TYPE__TRANSPARENCY:
				return isSetTransparency();
			case AppearancePackage.X3D_MATERIAL_TYPE__IS_SMOOTH:
				return isSetIsSmooth();
			case AppearancePackage.X3D_MATERIAL_TYPE__TARGET:
				return target != null && !target.isEmpty();
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL_GROUP:
				return genericApplicationPropertyOfX3DMaterialGroup != null && !genericApplicationPropertyOfX3DMaterialGroup.isEmpty();
			case AppearancePackage.X3D_MATERIAL_TYPE__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL:
				return !getGenericApplicationPropertyOfX3DMaterial().isEmpty();
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
		result.append(" (ambientIntensity: ");
		if (ambientIntensityESet) result.append(ambientIntensity); else result.append("<unset>");
		result.append(", diffuseColor: ");
		if (diffuseColorESet) result.append(diffuseColor); else result.append("<unset>");
		result.append(", emissiveColor: ");
		if (emissiveColorESet) result.append(emissiveColor); else result.append("<unset>");
		result.append(", specularColor: ");
		if (specularColorESet) result.append(specularColor); else result.append("<unset>");
		result.append(", shininess: ");
		if (shininessESet) result.append(shininess); else result.append("<unset>");
		result.append(", transparency: ");
		if (transparencyESet) result.append(transparency); else result.append("<unset>");
		result.append(", isSmooth: ");
		if (isSmoothESet) result.append(isSmooth); else result.append("<unset>");
		result.append(", target: ");
		result.append(target);
		result.append(", genericApplicationPropertyOfX3DMaterialGroup: ");
		result.append(genericApplicationPropertyOfX3DMaterialGroup);
		result.append(')');
		return result.toString();
	}

} //X3DMaterialTypeImpl
