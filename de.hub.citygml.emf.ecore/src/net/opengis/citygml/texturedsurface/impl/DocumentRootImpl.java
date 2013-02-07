/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.impl;

import net.opengis.citygml.texturedsurface.AbstractAppearanceType;
import net.opengis.citygml.texturedsurface.AppearancePropertyType;
import net.opengis.citygml.texturedsurface.DocumentRoot;
import net.opengis.citygml.texturedsurface.MaterialType;
import net.opengis.citygml.texturedsurface.SimpleTextureType;
import net.opengis.citygml.texturedsurface.TexturedSurfaceType;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getAppearance1 <em>Appearance1</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getSimpleTexture <em>Simple Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.DocumentRootImpl#getTexturedSurface <em>Textured Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TexturedsurfacePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TexturedsurfacePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TexturedsurfacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TexturedsurfacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAppearanceType getAppearance() {
		return (AbstractAppearanceType)getMixed().get(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__APPEARANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(AbstractAppearanceType newAppearance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__APPEARANCE, newAppearance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearancePropertyType getAppearance1() {
		return (AppearancePropertyType)getMixed().get(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__APPEARANCE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance1(AppearancePropertyType newAppearance1, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__APPEARANCE1, newAppearance1, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance1(AppearancePropertyType newAppearance1) {
		((FeatureMap.Internal)getMixed()).set(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__APPEARANCE1, newAppearance1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialType getMaterial() {
		return (MaterialType)getMixed().get(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__MATERIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(MaterialType newMaterial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__MATERIAL, newMaterial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(MaterialType newMaterial) {
		((FeatureMap.Internal)getMixed()).set(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__MATERIAL, newMaterial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTextureType getSimpleTexture() {
		return (SimpleTextureType)getMixed().get(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__SIMPLE_TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleTexture(SimpleTextureType newSimpleTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__SIMPLE_TEXTURE, newSimpleTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleTexture(SimpleTextureType newSimpleTexture) {
		((FeatureMap.Internal)getMixed()).set(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__SIMPLE_TEXTURE, newSimpleTexture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturedSurfaceType getTexturedSurface() {
		return (TexturedSurfaceType)getMixed().get(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexturedSurface(TexturedSurfaceType newTexturedSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE, newTexturedSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexturedSurface(TexturedSurfaceType newTexturedSurface) {
		((FeatureMap.Internal)getMixed()).set(TexturedsurfacePackage.Literals.DOCUMENT_ROOT__TEXTURED_SURFACE, newTexturedSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TexturedsurfacePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TexturedsurfacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TexturedsurfacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE:
				return basicSetAppearance(null, msgs);
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE1:
				return basicSetAppearance1(null, msgs);
			case TexturedsurfacePackage.DOCUMENT_ROOT__MATERIAL:
				return basicSetMaterial(null, msgs);
			case TexturedsurfacePackage.DOCUMENT_ROOT__SIMPLE_TEXTURE:
				return basicSetSimpleTexture(null, msgs);
			case TexturedsurfacePackage.DOCUMENT_ROOT__TEXTURED_SURFACE:
				return basicSetTexturedSurface(null, msgs);
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
			case TexturedsurfacePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TexturedsurfacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TexturedsurfacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE:
				return getAppearance();
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE1:
				return getAppearance1();
			case TexturedsurfacePackage.DOCUMENT_ROOT__MATERIAL:
				return getMaterial();
			case TexturedsurfacePackage.DOCUMENT_ROOT__SIMPLE_TEXTURE:
				return getSimpleTexture();
			case TexturedsurfacePackage.DOCUMENT_ROOT__TEXTURED_SURFACE:
				return getTexturedSurface();
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
			case TexturedsurfacePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE1:
				setAppearance1((AppearancePropertyType)newValue);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__MATERIAL:
				setMaterial((MaterialType)newValue);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__SIMPLE_TEXTURE:
				setSimpleTexture((SimpleTextureType)newValue);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__TEXTURED_SURFACE:
				setTexturedSurface((TexturedSurfaceType)newValue);
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
			case TexturedsurfacePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE1:
				setAppearance1((AppearancePropertyType)null);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__MATERIAL:
				setMaterial((MaterialType)null);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__SIMPLE_TEXTURE:
				setSimpleTexture((SimpleTextureType)null);
				return;
			case TexturedsurfacePackage.DOCUMENT_ROOT__TEXTURED_SURFACE:
				setTexturedSurface((TexturedSurfaceType)null);
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
			case TexturedsurfacePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TexturedsurfacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TexturedsurfacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE:
				return getAppearance() != null;
			case TexturedsurfacePackage.DOCUMENT_ROOT__APPEARANCE1:
				return getAppearance1() != null;
			case TexturedsurfacePackage.DOCUMENT_ROOT__MATERIAL:
				return getMaterial() != null;
			case TexturedsurfacePackage.DOCUMENT_ROOT__SIMPLE_TEXTURE:
				return getSimpleTexture() != null;
			case TexturedsurfacePackage.DOCUMENT_ROOT__TEXTURED_SURFACE:
				return getTexturedSurface() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
