/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.Collection;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.TexCoordListType;
import net.opengis.citygml.appearance.TextureCoordinatesType;

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
 * An implementation of the model object '<em><b>Tex Coord List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.TexCoordListTypeImpl#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.TexCoordListTypeImpl#getGenericApplicationPropertyOfTexCoordListGroup <em>Generic Application Property Of Tex Coord List Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.TexCoordListTypeImpl#getGenericApplicationPropertyOfTexCoordList <em>Generic Application Property Of Tex Coord List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TexCoordListTypeImpl extends AbstractTextureParameterizationTypeImpl implements TexCoordListType {
	/**
	 * The cached value of the '{@link #getTextureCoordinates() <em>Texture Coordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureCoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<TextureCoordinatesType> textureCoordinates;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfTexCoordListGroup() <em>Generic Application Property Of Tex Coord List Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfTexCoordListGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfTexCoordListGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TexCoordListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.TEX_COORD_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextureCoordinatesType> getTextureCoordinates() {
		if (textureCoordinates == null) {
			textureCoordinates = new EObjectContainmentEList<TextureCoordinatesType>(TextureCoordinatesType.class, this, AppearancePackage.TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES);
		}
		return textureCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfTexCoordListGroup() {
		if (genericApplicationPropertyOfTexCoordListGroup == null) {
			genericApplicationPropertyOfTexCoordListGroup = new BasicFeatureMap(this, AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP);
		}
		return genericApplicationPropertyOfTexCoordListGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfTexCoordList() {
		return getGenericApplicationPropertyOfTexCoordListGroup().list(AppearancePackage.Literals.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES:
				return ((InternalEList<?>)getTextureCoordinates()).basicRemove(otherEnd, msgs);
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTexCoordListGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST:
				return ((InternalEList<?>)getGenericApplicationPropertyOfTexCoordList()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES:
				return getTextureCoordinates();
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP:
				if (coreType) return getGenericApplicationPropertyOfTexCoordListGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfTexCoordListGroup()).getWrapper();
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST:
				return getGenericApplicationPropertyOfTexCoordList();
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
			case AppearancePackage.TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES:
				getTextureCoordinates().clear();
				getTextureCoordinates().addAll((Collection<? extends TextureCoordinatesType>)newValue);
				return;
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfTexCoordListGroup()).set(newValue);
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
			case AppearancePackage.TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES:
				getTextureCoordinates().clear();
				return;
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP:
				getGenericApplicationPropertyOfTexCoordListGroup().clear();
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
			case AppearancePackage.TEX_COORD_LIST_TYPE__TEXTURE_COORDINATES:
				return textureCoordinates != null && !textureCoordinates.isEmpty();
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST_GROUP:
				return genericApplicationPropertyOfTexCoordListGroup != null && !genericApplicationPropertyOfTexCoordListGroup.isEmpty();
			case AppearancePackage.TEX_COORD_LIST_TYPE__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST:
				return !getGenericApplicationPropertyOfTexCoordList().isEmpty();
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
		result.append(" (genericApplicationPropertyOfTexCoordListGroup: ");
		result.append(genericApplicationPropertyOfTexCoordListGroup);
		result.append(')');
		return result.toString();
	}

} //TexCoordListTypeImpl
