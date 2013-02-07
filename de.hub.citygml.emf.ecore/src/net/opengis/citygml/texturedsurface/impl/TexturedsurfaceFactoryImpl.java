/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.texturedsurface.impl;

import java.util.List;

import net.opengis.citygml.CitygmlFactory;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.texturedsurface.AppearancePropertyType;
import net.opengis.citygml.texturedsurface.DocumentRoot;
import net.opengis.citygml.texturedsurface.MaterialType;
import net.opengis.citygml.texturedsurface.SimpleTextureType;
import net.opengis.citygml.texturedsurface.TextureTypeType;
import net.opengis.citygml.texturedsurface.TexturedSurfaceType;
import net.opengis.citygml.texturedsurface.TexturedsurfaceFactory;
import net.opengis.citygml.texturedsurface.TexturedsurfacePackage;

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
public class TexturedsurfaceFactoryImpl extends EFactoryImpl implements TexturedsurfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TexturedsurfaceFactory init() {
		try {
			TexturedsurfaceFactory theTexturedsurfaceFactory = (TexturedsurfaceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/texturedsurface/1.0"); 
			if (theTexturedsurfaceFactory != null) {
				return theTexturedsurfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TexturedsurfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturedsurfaceFactoryImpl() {
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
			case TexturedsurfacePackage.APPEARANCE_PROPERTY_TYPE: return createAppearancePropertyType();
			case TexturedsurfacePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TexturedsurfacePackage.MATERIAL_TYPE: return createMaterialType();
			case TexturedsurfacePackage.SIMPLE_TEXTURE_TYPE: return createSimpleTextureType();
			case TexturedsurfacePackage.TEXTURED_SURFACE_TYPE: return createTexturedSurfaceType();
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
			case TexturedsurfacePackage.TEXTURE_TYPE_TYPE:
				return createTextureTypeTypeFromString(eDataType, initialValue);
			case TexturedsurfacePackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case TexturedsurfacePackage.TEXTURE_TYPE_TYPE_OBJECT:
				return createTextureTypeTypeObjectFromString(eDataType, initialValue);
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
			case TexturedsurfacePackage.TEXTURE_TYPE_TYPE:
				return convertTextureTypeTypeToString(eDataType, instanceValue);
			case TexturedsurfacePackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case TexturedsurfacePackage.TEXTURE_TYPE_TYPE_OBJECT:
				return convertTextureTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialType createMaterialType() {
		MaterialTypeImpl materialType = new MaterialTypeImpl();
		return materialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTextureType createSimpleTextureType() {
		SimpleTextureTypeImpl simpleTextureType = new SimpleTextureTypeImpl();
		return simpleTextureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturedSurfaceType createTexturedSurfaceType() {
		TexturedSurfaceTypeImpl texturedSurfaceType = new TexturedSurfaceTypeImpl();
		return texturedSurfaceType;
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
	public List<Double> createColorFromString(EDataType eDataType, String initialValue) {
		return (List)CitygmlFactory.eINSTANCE.createFromString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1_LIST, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return CitygmlFactory.eINSTANCE.convertToString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1_LIST, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTypeType createTextureTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTextureTypeTypeFromString(TexturedsurfacePackage.Literals.TEXTURE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextureTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTextureTypeTypeToString(TexturedsurfacePackage.Literals.TEXTURE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturedsurfacePackage getTexturedsurfacePackage() {
		return (TexturedsurfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TexturedsurfacePackage getPackage() {
		return TexturedsurfacePackage.eINSTANCE;
	}

} //TexturedsurfaceFactoryImpl
