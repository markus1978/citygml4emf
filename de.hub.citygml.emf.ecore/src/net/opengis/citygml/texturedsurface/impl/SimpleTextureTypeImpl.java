/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.impl;

import java.util.List;

import net.opengis.citygml.texturedsurface.SimpleTextureType;
import net.opengis.citygml.texturedsurface.TextureTypeType;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl#getTextureMap <em>Texture Map</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link net.opengis.citygml.texturedsurface.impl.SimpleTextureTypeImpl#isRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTextureTypeImpl extends AbstractAppearanceTypeImpl implements SimpleTextureType {
	/**
	 * The default value of the '{@link #getTextureMap() <em>Texture Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureMap()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTURE_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextureMap() <em>Texture Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureMap()
	 * @generated
	 * @ordered
	 */
	protected String textureMap = TEXTURE_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextureCoordinates() <em>Texture Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureCoordinates()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> TEXTURE_COORDINATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextureCoordinates() <em>Texture Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureCoordinates()
	 * @generated
	 * @ordered
	 */
	protected List<Double> textureCoordinates = TEXTURE_COORDINATES_EDEFAULT;

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
	 * The default value of the '{@link #isRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeat()
	 * @generated
	 * @ordered
	 */
	protected boolean repeat = REPEAT_EDEFAULT;

	/**
	 * This is true if the Repeat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repeatESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTextureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TexturedsurfacePackage.Literals.SIMPLE_TEXTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextureMap() {
		return textureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureMap(String newTextureMap) {
		String oldTextureMap = textureMap;
		textureMap = newTextureMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_MAP, oldTextureMap, textureMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getTextureCoordinates() {
		return textureCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureCoordinates(List<Double> newTextureCoordinates) {
		List<Double> oldTextureCoordinates = textureCoordinates;
		textureCoordinates = newTextureCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES, oldTextureCoordinates, textureCoordinates));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE, oldTextureType, textureType, !oldTextureTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE, oldTextureType, TEXTURE_TYPE_EDEFAULT, oldTextureTypeESet));
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
	public boolean isRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(boolean newRepeat) {
		boolean oldRepeat = repeat;
		repeat = newRepeat;
		boolean oldRepeatESet = repeatESet;
		repeatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__REPEAT, oldRepeat, repeat, !oldRepeatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeat() {
		boolean oldRepeat = repeat;
		boolean oldRepeatESet = repeatESet;
		repeat = REPEAT_EDEFAULT;
		repeatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__REPEAT, oldRepeat, REPEAT_EDEFAULT, oldRepeatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeat() {
		return repeatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_MAP:
				return getTextureMap();
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES:
				return getTextureCoordinates();
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE:
				return getTextureType();
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__REPEAT:
				return isRepeat();
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
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_MAP:
				setTextureMap((String)newValue);
				return;
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES:
				setTextureCoordinates((List<Double>)newValue);
				return;
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE:
				setTextureType((TextureTypeType)newValue);
				return;
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__REPEAT:
				setRepeat((Boolean)newValue);
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
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_MAP:
				setTextureMap(TEXTURE_MAP_EDEFAULT);
				return;
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES:
				setTextureCoordinates(TEXTURE_COORDINATES_EDEFAULT);
				return;
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE:
				unsetTextureType();
				return;
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__REPEAT:
				unsetRepeat();
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
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_MAP:
				return TEXTURE_MAP_EDEFAULT == null ? textureMap != null : !TEXTURE_MAP_EDEFAULT.equals(textureMap);
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_COORDINATES:
				return TEXTURE_COORDINATES_EDEFAULT == null ? textureCoordinates != null : !TEXTURE_COORDINATES_EDEFAULT.equals(textureCoordinates);
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__TEXTURE_TYPE:
				return isSetTextureType();
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE__REPEAT:
				return isSetRepeat();
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
		result.append(" (textureMap: ");
		result.append(textureMap);
		result.append(", textureCoordinates: ");
		result.append(textureCoordinates);
		result.append(", textureType: ");
		if (textureTypeESet) result.append(textureType); else result.append("<unset>");
		result.append(", repeat: ");
		if (repeatESet) result.append(repeat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleTextureTypeImpl
