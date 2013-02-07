/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityfurniture.impl;

import net.opengis.citygml.cityfurniture.CityFurnitureType;
import net.opengis.citygml.cityfurniture.CityfurnitureFactory;
import net.opengis.citygml.cityfurniture.CityfurniturePackage;
import net.opengis.citygml.cityfurniture.DocumentRoot;

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
public class CityfurnitureFactoryImpl extends EFactoryImpl implements CityfurnitureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CityfurnitureFactory init() {
		try {
			CityfurnitureFactory theCityfurnitureFactory = (CityfurnitureFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/cityfurniture/1.0"); 
			if (theCityfurnitureFactory != null) {
				return theCityfurnitureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CityfurnitureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityfurnitureFactoryImpl() {
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
			case CityfurniturePackage.CITY_FURNITURE_TYPE: return createCityFurnitureType();
			case CityfurniturePackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case CityfurniturePackage.CITY_FURNITURE_CLASS_TYPE:
				return createCityFurnitureClassTypeFromString(eDataType, initialValue);
			case CityfurniturePackage.CITY_FURNITURE_FUNCTION_TYPE:
				return createCityFurnitureFunctionTypeFromString(eDataType, initialValue);
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
			case CityfurniturePackage.CITY_FURNITURE_CLASS_TYPE:
				return convertCityFurnitureClassTypeToString(eDataType, instanceValue);
			case CityfurniturePackage.CITY_FURNITURE_FUNCTION_TYPE:
				return convertCityFurnitureFunctionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityFurnitureType createCityFurnitureType() {
		CityFurnitureTypeImpl cityFurnitureType = new CityFurnitureTypeImpl();
		return cityFurnitureType;
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
	public String createCityFurnitureClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCityFurnitureClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCityFurnitureFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCityFurnitureFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityfurniturePackage getCityfurniturePackage() {
		return (CityfurniturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CityfurniturePackage getPackage() {
		return CityfurniturePackage.eINSTANCE;
	}

} //CityfurnitureFactoryImpl
