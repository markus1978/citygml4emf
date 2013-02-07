/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.List;

import net.opengis.citygml.CitygmlFactory;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.appearance.AbstractSurfaceDataType;
import net.opengis.citygml.appearance.AbstractTextureType;
import net.opengis.citygml.appearance.AppearanceFactory;
import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.AppearancePropertyType;
import net.opengis.citygml.appearance.AppearanceType;
import net.opengis.citygml.appearance.DocumentRoot;
import net.opengis.citygml.appearance.GeoreferencedTextureType;
import net.opengis.citygml.appearance.ParameterizedTextureType;
import net.opengis.citygml.appearance.SurfaceDataPropertyType;
import net.opengis.citygml.appearance.TexCoordGenType;
import net.opengis.citygml.appearance.TexCoordListType;
import net.opengis.citygml.appearance.TextureAssociationType;
import net.opengis.citygml.appearance.TextureCoordinatesType;
import net.opengis.citygml.appearance.TextureTypeType;
import net.opengis.citygml.appearance.WorldToTextureType;
import net.opengis.citygml.appearance.WrapModeType;
import net.opengis.citygml.appearance.X3DMaterialType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppearanceFactoryImpl extends EFactoryImpl implements AppearanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppearanceFactory init() {
		try {
			AppearanceFactory theAppearanceFactory = (AppearanceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/appearance/1.0"); 
			if (theAppearanceFactory != null) {
				return theAppearanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppearanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AppearancePackage.ABSTRACT_SURFACE_DATA_TYPE: return createAbstractSurfaceDataType();
			case AppearancePackage.ABSTRACT_TEXTURE_TYPE: return createAbstractTextureType();
			case AppearancePackage.APPEARANCE_PROPERTY_TYPE: return createAppearancePropertyType();
			case AppearancePackage.APPEARANCE_TYPE: return createAppearanceType();
			case AppearancePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE: return createGeoreferencedTextureType();
			case AppearancePackage.PARAMETERIZED_TEXTURE_TYPE: return createParameterizedTextureType();
			case AppearancePackage.SURFACE_DATA_PROPERTY_TYPE: return createSurfaceDataPropertyType();
			case AppearancePackage.TEX_COORD_GEN_TYPE: return createTexCoordGenType();
			case AppearancePackage.TEX_COORD_LIST_TYPE: return createTexCoordListType();
			case AppearancePackage.TEXTURE_ASSOCIATION_TYPE: return createTextureAssociationType();
			case AppearancePackage.TEXTURE_COORDINATES_TYPE: return createTextureCoordinatesType();
			case AppearancePackage.WORLD_TO_TEXTURE_TYPE: return createWorldToTextureType();
			case AppearancePackage.X3D_MATERIAL_TYPE: return createX3DMaterialType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AppearancePackage.TEXTURE_TYPE_TYPE:
				return createTextureTypeTypeFromString(eDataType, initialValue);
			case AppearancePackage.WRAP_MODE_TYPE:
				return createWrapModeTypeFromString(eDataType, initialValue);
			case AppearancePackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case AppearancePackage.COLOR_PLUS_OPACITY:
				return createColorPlusOpacityFromString(eDataType, initialValue);
			case AppearancePackage.TEXTURE_TYPE_TYPE_OBJECT:
				return createTextureTypeTypeObjectFromString(eDataType, initialValue);
			case AppearancePackage.WRAP_MODE_TYPE_OBJECT:
				return createWrapModeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AppearancePackage.TEXTURE_TYPE_TYPE:
				return convertTextureTypeTypeToString(eDataType, instanceValue);
			case AppearancePackage.WRAP_MODE_TYPE:
				return convertWrapModeTypeToString(eDataType, instanceValue);
			case AppearancePackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case AppearancePackage.COLOR_PLUS_OPACITY:
				return convertColorPlusOpacityToString(eDataType, instanceValue);
			case AppearancePackage.TEXTURE_TYPE_TYPE_OBJECT:
				return convertTextureTypeTypeObjectToString(eDataType, instanceValue);
			case AppearancePackage.WRAP_MODE_TYPE_OBJECT:
				return convertWrapModeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSurfaceDataType createAbstractSurfaceDataType() {
		AbstractSurfaceDataTypeImpl abstractSurfaceDataType = new AbstractSurfaceDataTypeImpl();
		return abstractSurfaceDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTextureType createAbstractTextureType() {
		AbstractTextureTypeImpl abstractTextureType = new AbstractTextureTypeImpl();
		return abstractTextureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearancePropertyType createAppearancePropertyType() {
		AppearancePropertyTypeImpl appearancePropertyType = new AppearancePropertyTypeImpl();
		return appearancePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceType createAppearanceType() {
		AppearanceTypeImpl appearanceType = new AppearanceTypeImpl();
		return appearanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoreferencedTextureType createGeoreferencedTextureType() {
		GeoreferencedTextureTypeImpl georeferencedTextureType = new GeoreferencedTextureTypeImpl();
		return georeferencedTextureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedTextureType createParameterizedTextureType() {
		ParameterizedTextureTypeImpl parameterizedTextureType = new ParameterizedTextureTypeImpl();
		return parameterizedTextureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceDataPropertyType createSurfaceDataPropertyType() {
		SurfaceDataPropertyTypeImpl surfaceDataPropertyType = new SurfaceDataPropertyTypeImpl();
		return surfaceDataPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexCoordGenType createTexCoordGenType() {
		TexCoordGenTypeImpl texCoordGenType = new TexCoordGenTypeImpl();
		return texCoordGenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexCoordListType createTexCoordListType() {
		TexCoordListTypeImpl texCoordListType = new TexCoordListTypeImpl();
		return texCoordListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureAssociationType createTextureAssociationType() {
		TextureAssociationTypeImpl textureAssociationType = new TextureAssociationTypeImpl();
		return textureAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureCoordinatesType createTextureCoordinatesType() {
		TextureCoordinatesTypeImpl textureCoordinatesType = new TextureCoordinatesTypeImpl();
		return textureCoordinatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldToTextureType createWorldToTextureType() {
		WorldToTextureTypeImpl worldToTextureType = new WorldToTextureTypeImpl();
		return worldToTextureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X3DMaterialType createX3DMaterialType() {
		X3DMaterialTypeImpl x3DMaterialType = new X3DMaterialTypeImpl();
		return x3DMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTypeType createTextureTypeTypeFromString(EDataType eDataType, String initialValue) {
		TextureTypeType result = TextureTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapModeType createWrapModeTypeFromString(EDataType eDataType, String initialValue) {
		WrapModeType result = WrapModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createColorFromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createColorPlusOpacityFromString(EDataType eDataType, String initialValue) {
		return (List)CitygmlFactory.eINSTANCE.createFromString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1_LIST, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorPlusOpacityToString(EDataType eDataType, Object instanceValue) {
		return CitygmlFactory.eINSTANCE.convertToString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1_LIST, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTypeType createTextureTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureTypeTypeFromString(AppearancePackage.Literals.TEXTURE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureTypeTypeToString(AppearancePackage.Literals.TEXTURE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapModeType createWrapModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWrapModeTypeFromString(AppearancePackage.Literals.WRAP_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWrapModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWrapModeTypeToString(AppearancePackage.Literals.WRAP_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearancePackage getAppearancePackage() {
		return (AppearancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AppearancePackage getPackage() {
		return AppearancePackage.eINSTANCE;
	}

} //AppearanceFactoryImpl
