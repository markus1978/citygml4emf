/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import net.opengis.citygml.appearance.AbstractSurfaceDataType;
import net.opengis.citygml.appearance.AbstractTextureParameterizationType;
import net.opengis.citygml.appearance.AbstractTextureType;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.AppearancePropertyType;
import net.opengis.citygml.appearance.DocumentRoot;
import net.opengis.citygml.appearance.GeoreferencedTextureType;
import net.opengis.citygml.appearance.ParameterizedTextureType;
import net.opengis.citygml.appearance.TexCoordGenType;
import net.opengis.citygml.appearance.TexCoordListType;
import net.opengis.citygml.appearance.X3DMaterialType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfAppearance <em>Generic Application Property Of Appearance</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfGeoreferencedTexture <em>Generic Application Property Of Georeferenced Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfParameterizedTexture <em>Generic Application Property Of Parameterized Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfSurfaceData <em>Generic Application Property Of Surface Data</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfTexCoordGen <em>Generic Application Property Of Tex Coord Gen</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfTexCoordList <em>Generic Application Property Of Tex Coord List</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfTexture <em>Generic Application Property Of Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfTextureParameterization <em>Generic Application Property Of Texture Parameterization</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGenericApplicationPropertyOfX3DMaterial <em>Generic Application Property Of X3D Material</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getSurfaceData <em>Surface Data</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getTextureParameterization <em>Texture Parameterization</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getAppearanceMember <em>Appearance Member</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getGeoreferencedTexture <em>Georeferenced Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getParameterizedTexture <em>Parameterized Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getTexCoordGen <em>Tex Coord Gen</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getTexCoordList <em>Tex Coord List</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.DocumentRootImpl#getX3DMaterial <em>X3D Material</em>}</li>
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
		return AppearancePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AppearancePackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AppearancePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AppearancePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfAppearance() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfAppearance(EObject newGenericApplicationPropertyOfAppearance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE, newGenericApplicationPropertyOfAppearance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfGeoreferencedTexture() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfGeoreferencedTexture(EObject newGenericApplicationPropertyOfGeoreferencedTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE, newGenericApplicationPropertyOfGeoreferencedTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfParameterizedTexture() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfParameterizedTexture(EObject newGenericApplicationPropertyOfParameterizedTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE, newGenericApplicationPropertyOfParameterizedTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfSurfaceData() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfSurfaceData(EObject newGenericApplicationPropertyOfSurfaceData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA, newGenericApplicationPropertyOfSurfaceData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTexCoordGen() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTexCoordGen(EObject newGenericApplicationPropertyOfTexCoordGen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN, newGenericApplicationPropertyOfTexCoordGen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTexCoordList() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTexCoordList(EObject newGenericApplicationPropertyOfTexCoordList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST, newGenericApplicationPropertyOfTexCoordList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTexture() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTexture(EObject newGenericApplicationPropertyOfTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE, newGenericApplicationPropertyOfTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTextureParameterization() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTextureParameterization(EObject newGenericApplicationPropertyOfTextureParameterization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION, newGenericApplicationPropertyOfTextureParameterization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfX3DMaterial() {
		return (EObject)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfX3DMaterial(EObject newGenericApplicationPropertyOfX3DMaterial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL, newGenericApplicationPropertyOfX3DMaterial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSurfaceDataType getSurfaceData() {
		return (AbstractSurfaceDataType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__SURFACE_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceData(AbstractSurfaceDataType newSurfaceData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__SURFACE_DATA, newSurfaceData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTextureType getTexture() {
		return (AbstractTextureType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexture(AbstractTextureType newTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__TEXTURE, newTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTextureParameterizationType getTextureParameterization() {
		return (AbstractTextureParameterizationType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextureParameterization(AbstractTextureParameterizationType newTextureParameterization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION, newTextureParameterization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearancePropertyType getAppearance() {
		return (AppearancePropertyType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(AppearancePropertyType newAppearance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE, newAppearance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(AppearancePropertyType newAppearance) {
		((FeatureMap.Internal)getMixed()).set(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearancePropertyType getAppearanceMember() {
		return (AppearancePropertyType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearanceMember(AppearancePropertyType newAppearanceMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER, newAppearanceMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearanceMember(AppearancePropertyType newAppearanceMember) {
		((FeatureMap.Internal)getMixed()).set(AppearancePackage.Literals.DOCUMENT_ROOT__APPEARANCE_MEMBER, newAppearanceMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoreferencedTextureType getGeoreferencedTexture() {
		return (GeoreferencedTextureType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeoreferencedTexture(GeoreferencedTextureType newGeoreferencedTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE, newGeoreferencedTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoreferencedTexture(GeoreferencedTextureType newGeoreferencedTexture) {
		((FeatureMap.Internal)getMixed()).set(AppearancePackage.Literals.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE, newGeoreferencedTexture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedTextureType getParameterizedTexture() {
		return (ParameterizedTextureType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterizedTexture(ParameterizedTextureType newParameterizedTexture, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE, newParameterizedTexture, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterizedTexture(ParameterizedTextureType newParameterizedTexture) {
		((FeatureMap.Internal)getMixed()).set(AppearancePackage.Literals.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE, newParameterizedTexture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexCoordGenType getTexCoordGen() {
		return (TexCoordGenType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_GEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexCoordGen(TexCoordGenType newTexCoordGen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_GEN, newTexCoordGen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexCoordGen(TexCoordGenType newTexCoordGen) {
		((FeatureMap.Internal)getMixed()).set(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_GEN, newTexCoordGen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexCoordListType getTexCoordList() {
		return (TexCoordListType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexCoordList(TexCoordListType newTexCoordList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_LIST, newTexCoordList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexCoordList(TexCoordListType newTexCoordList) {
		((FeatureMap.Internal)getMixed()).set(AppearancePackage.Literals.DOCUMENT_ROOT__TEX_COORD_LIST, newTexCoordList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X3DMaterialType getX3DMaterial() {
		return (X3DMaterialType)getMixed().get(AppearancePackage.Literals.DOCUMENT_ROOT__X3_DMATERIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX3DMaterial(X3DMaterialType newX3DMaterial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AppearancePackage.Literals.DOCUMENT_ROOT__X3_DMATERIAL, newX3DMaterial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX3DMaterial(X3DMaterialType newX3DMaterial) {
		((FeatureMap.Internal)getMixed()).set(AppearancePackage.Literals.DOCUMENT_ROOT__X3_DMATERIAL, newX3DMaterial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AppearancePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AppearancePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE:
				return basicSetGenericApplicationPropertyOfAppearance(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE:
				return basicSetGenericApplicationPropertyOfGeoreferencedTexture(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE:
				return basicSetGenericApplicationPropertyOfParameterizedTexture(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA:
				return basicSetGenericApplicationPropertyOfSurfaceData(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN:
				return basicSetGenericApplicationPropertyOfTexCoordGen(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST:
				return basicSetGenericApplicationPropertyOfTexCoordList(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE:
				return basicSetGenericApplicationPropertyOfTexture(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION:
				return basicSetGenericApplicationPropertyOfTextureParameterization(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL:
				return basicSetGenericApplicationPropertyOfX3DMaterial(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__SURFACE_DATA:
				return basicSetSurfaceData(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE:
				return basicSetTexture(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION:
				return basicSetTextureParameterization(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE:
				return basicSetAppearance(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE_MEMBER:
				return basicSetAppearanceMember(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE:
				return basicSetGeoreferencedTexture(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE:
				return basicSetParameterizedTexture(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_GEN:
				return basicSetTexCoordGen(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_LIST:
				return basicSetTexCoordList(null, msgs);
			case AppearancePackage.DOCUMENT_ROOT__X3_DMATERIAL:
				return basicSetX3DMaterial(null, msgs);
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
			case AppearancePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AppearancePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AppearancePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE:
				return getGenericApplicationPropertyOfAppearance();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE:
				return getGenericApplicationPropertyOfGeoreferencedTexture();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE:
				return getGenericApplicationPropertyOfParameterizedTexture();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA:
				return getGenericApplicationPropertyOfSurfaceData();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN:
				return getGenericApplicationPropertyOfTexCoordGen();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST:
				return getGenericApplicationPropertyOfTexCoordList();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE:
				return getGenericApplicationPropertyOfTexture();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION:
				return getGenericApplicationPropertyOfTextureParameterization();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL:
				return getGenericApplicationPropertyOfX3DMaterial();
			case AppearancePackage.DOCUMENT_ROOT__SURFACE_DATA:
				return getSurfaceData();
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE:
				return getTexture();
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION:
				return getTextureParameterization();
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE:
				return getAppearance();
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE_MEMBER:
				return getAppearanceMember();
			case AppearancePackage.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE:
				return getGeoreferencedTexture();
			case AppearancePackage.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE:
				return getParameterizedTexture();
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_GEN:
				return getTexCoordGen();
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_LIST:
				return getTexCoordList();
			case AppearancePackage.DOCUMENT_ROOT__X3_DMATERIAL:
				return getX3DMaterial();
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
			case AppearancePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE:
				setAppearance((AppearancePropertyType)newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE_MEMBER:
				setAppearanceMember((AppearancePropertyType)newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE:
				setGeoreferencedTexture((GeoreferencedTextureType)newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE:
				setParameterizedTexture((ParameterizedTextureType)newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_GEN:
				setTexCoordGen((TexCoordGenType)newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_LIST:
				setTexCoordList((TexCoordListType)newValue);
				return;
			case AppearancePackage.DOCUMENT_ROOT__X3_DMATERIAL:
				setX3DMaterial((X3DMaterialType)newValue);
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
			case AppearancePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AppearancePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AppearancePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE:
				setAppearance((AppearancePropertyType)null);
				return;
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE_MEMBER:
				setAppearanceMember((AppearancePropertyType)null);
				return;
			case AppearancePackage.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE:
				setGeoreferencedTexture((GeoreferencedTextureType)null);
				return;
			case AppearancePackage.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE:
				setParameterizedTexture((ParameterizedTextureType)null);
				return;
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_GEN:
				setTexCoordGen((TexCoordGenType)null);
				return;
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_LIST:
				setTexCoordList((TexCoordListType)null);
				return;
			case AppearancePackage.DOCUMENT_ROOT__X3_DMATERIAL:
				setX3DMaterial((X3DMaterialType)null);
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
			case AppearancePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AppearancePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AppearancePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_APPEARANCE:
				return getGenericApplicationPropertyOfAppearance() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE:
				return getGenericApplicationPropertyOfGeoreferencedTexture() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PARAMETERIZED_TEXTURE:
				return getGenericApplicationPropertyOfParameterizedTexture() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SURFACE_DATA:
				return getGenericApplicationPropertyOfSurfaceData() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_GEN:
				return getGenericApplicationPropertyOfTexCoordGen() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEX_COORD_LIST:
				return getGenericApplicationPropertyOfTexCoordList() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE:
				return getGenericApplicationPropertyOfTexture() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TEXTURE_PARAMETERIZATION:
				return getGenericApplicationPropertyOfTextureParameterization() != null;
			case AppearancePackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_X3D_MATERIAL:
				return getGenericApplicationPropertyOfX3DMaterial() != null;
			case AppearancePackage.DOCUMENT_ROOT__SURFACE_DATA:
				return getSurfaceData() != null;
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE:
				return getTexture() != null;
			case AppearancePackage.DOCUMENT_ROOT__TEXTURE_PARAMETERIZATION:
				return getTextureParameterization() != null;
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE:
				return getAppearance() != null;
			case AppearancePackage.DOCUMENT_ROOT__APPEARANCE_MEMBER:
				return getAppearanceMember() != null;
			case AppearancePackage.DOCUMENT_ROOT__GEOREFERENCED_TEXTURE:
				return getGeoreferencedTexture() != null;
			case AppearancePackage.DOCUMENT_ROOT__PARAMETERIZED_TEXTURE:
				return getParameterizedTexture() != null;
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_GEN:
				return getTexCoordGen() != null;
			case AppearancePackage.DOCUMENT_ROOT__TEX_COORD_LIST:
				return getTexCoordList() != null;
			case AppearancePackage.DOCUMENT_ROOT__X3_DMATERIAL:
				return getX3DMaterial() != null;
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
