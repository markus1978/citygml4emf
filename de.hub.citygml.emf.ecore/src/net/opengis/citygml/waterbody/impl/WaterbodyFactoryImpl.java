/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import net.opengis.citygml.waterbody.BoundedByWaterSurfacePropertyType;
import net.opengis.citygml.waterbody.DocumentRoot;
import net.opengis.citygml.waterbody.WaterBodyType;
import net.opengis.citygml.waterbody.WaterClosureSurfaceType;
import net.opengis.citygml.waterbody.WaterGroundSurfaceType;
import net.opengis.citygml.waterbody.WaterSurfaceType;
import net.opengis.citygml.waterbody.WaterbodyFactory;
import net.opengis.citygml.waterbody.WaterbodyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaterbodyFactoryImpl extends EFactoryImpl implements WaterbodyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WaterbodyFactory init() {
		try {
			WaterbodyFactory theWaterbodyFactory = (WaterbodyFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/waterbody/1.0"); 
			if (theWaterbodyFactory != null) {
				return theWaterbodyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WaterbodyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterbodyFactoryImpl() {
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
			case WaterbodyPackage.BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE: return createBoundedByWaterSurfacePropertyType();
			case WaterbodyPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case WaterbodyPackage.WATER_BODY_TYPE: return createWaterBodyType();
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE: return createWaterClosureSurfaceType();
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE: return createWaterGroundSurfaceType();
			case WaterbodyPackage.WATER_SURFACE_TYPE: return createWaterSurfaceType();
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
			case WaterbodyPackage.WATER_BODY_CLASS_TYPE:
				return createWaterBodyClassTypeFromString(eDataType, initialValue);
			case WaterbodyPackage.WATER_BODY_FUNCTION_TYPE:
				return createWaterBodyFunctionTypeFromString(eDataType, initialValue);
			case WaterbodyPackage.WATER_BODY_USAGE_TYPE:
				return createWaterBodyUsageTypeFromString(eDataType, initialValue);
			case WaterbodyPackage.WATER_LEVEL_TYPE:
				return createWaterLevelTypeFromString(eDataType, initialValue);
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
			case WaterbodyPackage.WATER_BODY_CLASS_TYPE:
				return convertWaterBodyClassTypeToString(eDataType, instanceValue);
			case WaterbodyPackage.WATER_BODY_FUNCTION_TYPE:
				return convertWaterBodyFunctionTypeToString(eDataType, instanceValue);
			case WaterbodyPackage.WATER_BODY_USAGE_TYPE:
				return convertWaterBodyUsageTypeToString(eDataType, instanceValue);
			case WaterbodyPackage.WATER_LEVEL_TYPE:
				return convertWaterLevelTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedByWaterSurfacePropertyType createBoundedByWaterSurfacePropertyType() {
		BoundedByWaterSurfacePropertyTypeImpl boundedByWaterSurfacePropertyType = new BoundedByWaterSurfacePropertyTypeImpl();
		return boundedByWaterSurfacePropertyType;
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
	public WaterBodyType createWaterBodyType() {
		WaterBodyTypeImpl waterBodyType = new WaterBodyTypeImpl();
		return waterBodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterClosureSurfaceType createWaterClosureSurfaceType() {
		WaterClosureSurfaceTypeImpl waterClosureSurfaceType = new WaterClosureSurfaceTypeImpl();
		return waterClosureSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterGroundSurfaceType createWaterGroundSurfaceType() {
		WaterGroundSurfaceTypeImpl waterGroundSurfaceType = new WaterGroundSurfaceTypeImpl();
		return waterGroundSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSurfaceType createWaterSurfaceType() {
		WaterSurfaceTypeImpl waterSurfaceType = new WaterSurfaceTypeImpl();
		return waterSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWaterBodyClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaterBodyClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWaterBodyFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaterBodyFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWaterBodyUsageTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaterBodyUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWaterLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWaterLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterbodyPackage getWaterbodyPackage() {
		return (WaterbodyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WaterbodyPackage getPackage() {
		return WaterbodyPackage.eINSTANCE;
	}

} //WaterbodyFactoryImpl
