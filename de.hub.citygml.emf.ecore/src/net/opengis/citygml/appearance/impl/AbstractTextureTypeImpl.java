/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.List;

import net.opengis.citygml.appearance.AbstractTextureType;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.TextureTypeType;
import net.opengis.citygml.appearance.WrapModeType;

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
 * An implementation of the model object '<em><b>Abstract Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl#getImageURI <em>Image URI</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl#getWrapMode <em>Wrap Mode</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl#getGenericApplicationPropertyOfTextureGroup <em>Generic Application Property Of Texture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.AbstractTextureTypeImpl#getGenericApplicationPropertyOfTexture <em>Generic Application Property Of Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractTextureTypeImpl extends AbstractSurfaceDataTypeImpl implements AbstractTextureType {
	/**
	 * The default value of the '{@link #getImageURI() <em>Image URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageURI() <em>Image URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageURI()
	 * @generated
	 * @ordered
	 */
	protected String imageURI = IMAGE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextureType() <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureType()
	 * @generated
	 * @ordered
	 */
	protected static final TextureTypeType TEXTURE_TYPE_EDEFAULT = TextureTypeType.SPECIFIC;

	/**
	 * The cached value of the '{@link #getTextureType() <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureType()
	 * @generated
	 * @ordered
	 */
	protected TextureTypeType textureType = TEXTURE_TYPE_EDEFAULT;

	/**
	 * This is true if the Texture Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textureTypeESet;

	/**
	 * The default value of the '{@link #getWrapMode() <em>Wrap Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapMode()
	 * @generated
	 * @ordered
	 */
	protected static final WrapModeType WRAP_MODE_EDEFAULT = WrapModeType.NONE;

	/**
	 * The cached value of the '{@link #getWrapMode() <em>Wrap Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapMode()
	 * @generated
	 * @ordered
	 */
	protected WrapModeType wrapMode = WRAP_MODE_EDEFAULT;

	/**
	 * This is true if the Wrap Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapModeESet;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> BORDER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected List<Double> borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTextureGroup() <em>Generic Application Property Of Texture Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTextureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTextureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTextureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.ABSTRACT_TEXTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageURI() {
		return imageURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageURI(String newImageURI) {
		String oldImageURI = imageURI;
		imageURI = newImageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.ABSTRACT_TEXTURE_TYPE__IMAGE_URI, oldImageURI, imageURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.ABSTRACT_TEXTURE_TYPE__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTypeType getTextureType() {
		return textureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureType(TextureTypeType newTextureType) {
		TextureTypeType oldTextureType = textureType;
		textureType = newTextureType == null ? TEXTURE_TYPE_EDEFAULT : newTextureType;
		boolean oldTextureTypeESet = textureTypeESet;
		textureTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE, oldTextureType, textureType, !oldTextureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextureType() {
		TextureTypeType oldTextureType = textureType;
		boolean oldTextureTypeESet = textureTypeESet;
		textureType = TEXTURE_TYPE_EDEFAULT;
		textureTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE, oldTextureType, TEXTURE_TYPE_EDEFAULT, oldTextureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextureType() {
		return textureTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapModeType getWrapMode() {
		return wrapMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapMode(WrapModeType newWrapMode) {
		WrapModeType oldWrapMode = wrapMode;
		wrapMode = newWrapMode == null ? WRAP_MODE_EDEFAULT : newWrapMode;
		boolean oldWrapModeESet = wrapModeESet;
		wrapModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.ABSTRACT_TEXTURE_TYPE__WRAP_MODE, oldWrapMode, wrapMode, !oldWrapModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapMode() {
		WrapModeType oldWrapMode = wrapMode;
		boolean oldWrapModeESet = wrapModeESet;
		wrapMode = WRAP_MODE_EDEFAULT;
		wrapModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.ABSTRACT_TEXTURE_TYPE__WRAP_MODE, oldWrapMode, WRAP_MODE_EDEFAULT, oldWrapModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapMode() {
		return wrapModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(List<Double> newBorderColor) {
		List<Double> oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.ABSTRACT_TEXTURE_TYPE__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTextureGroup() {
		if (genericApplicationPropertyOfTextureGroup == null) {
			genericApplicationPropertyOfTextureGroup = new BasicFeatureMap(this, AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP);
		}
		return genericApplicationPropertyOfTextureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTexture() {
		return getGenericApplicationPropertyOfTextureGroup().list(AppearancePackage.Literals.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTextureGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTexture()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__IMAGE_URI:
				return getImageURI();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__MIME_TYPE:
				return getMimeType();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE:
				return getTextureType();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__WRAP_MODE:
				return getWrapMode();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__BORDER_COLOR:
				return getBorderColor();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTextureGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTextureGroup()).getWrapper();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE:
				return getGenericApplicationPropertyOfTexture();
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
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__IMAGE_URI:
				setImageURI((String)newValue);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE:
				setTextureType((TextureTypeType)newValue);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__WRAP_MODE:
				setWrapMode((WrapModeType)newValue);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__BORDER_COLOR:
				setBorderColor((List<Double>)newValue);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTextureGroup()).set(newValue);
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
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__IMAGE_URI:
				setImageURI(IMAGE_URI_EDEFAULT);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE:
				unsetTextureType();
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__WRAP_MODE:
				unsetWrapMode();
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP:
				getGenericApplicationPropertyOfTextureGroup().clear();
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
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__IMAGE_URI:
				return IMAGE_URI_EDEFAULT == null ? imageURI != null : !IMAGE_URI_EDEFAULT.equals(imageURI);
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__TEXTURE_TYPE:
				return isSetTextureType();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__WRAP_MODE:
				return isSetWrapMode();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_GROUP:
				return genericApplicationPropertyOfTextureGroup != null && !genericApplicationPropertyOfTextureGroup.isEmpty();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE:
				return !getGenericApplicationPropertyOfTexture().isEmpty();
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
		result.append(" (imageURI: ");
		result.append(imageURI);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", textureType: ");
		if (textureTypeESet) result.append(textureType); else result.append("<unset>");
		result.append(", wrapMode: ");
		if (wrapModeESet) result.append(wrapMode); else result.append("<unset>");
		result.append(", borderColor: ");
		result.append(borderColor);
		result.append(", genericApplicationPropertyOfTextureGroup: ");
		result.append(genericApplicationPropertyOfTextureGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractTextureTypeImpl
