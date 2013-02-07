/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation.impl;

import net.opengis.citygml.vegetation.DocumentRoot;
import net.opengis.citygml.vegetation.PlantCoverType;
import net.opengis.citygml.vegetation.SolitaryVegetationObjectType;
import net.opengis.citygml.vegetation.VegetationFactory;
import net.opengis.citygml.vegetation.VegetationPackage;

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
public class VegetationFactoryImpl extends EFactoryImpl implements VegetationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VegetationFactory init() {
		try {
			VegetationFactory theVegetationFactory = (VegetationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/vegetation/1.0"); 
			if (theVegetationFactory != null) {
				return theVegetationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VegetationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VegetationFactoryImpl() {
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
			case VegetationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case VegetationPackage.PLANT_COVER_TYPE: return createPlantCoverType();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE: return createSolitaryVegetationObjectType();
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
			case VegetationPackage.PLANT_CLASS_TYPE:
				return createPlantClassTypeFromString(eDataType, initialValue);
			case VegetationPackage.PLANT_COVER_CLASS_TYPE:
				return createPlantCoverClassTypeFromString(eDataType, initialValue);
			case VegetationPackage.PLANT_COVER_FUNCTION_TYPE:
				return createPlantCoverFunctionTypeFromString(eDataType, initialValue);
			case VegetationPackage.PLANT_FUNCTION_TYPE:
				return createPlantFunctionTypeFromString(eDataType, initialValue);
			case VegetationPackage.SPECIES_TYPE:
				return createSpeciesTypeFromString(eDataType, initialValue);
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
			case VegetationPackage.PLANT_CLASS_TYPE:
				return convertPlantClassTypeToString(eDataType, instanceValue);
			case VegetationPackage.PLANT_COVER_CLASS_TYPE:
				return convertPlantCoverClassTypeToString(eDataType, instanceValue);
			case VegetationPackage.PLANT_COVER_FUNCTION_TYPE:
				return convertPlantCoverFunctionTypeToString(eDataType, instanceValue);
			case VegetationPackage.PLANT_FUNCTION_TYPE:
				return convertPlantFunctionTypeToString(eDataType, instanceValue);
			case VegetationPackage.SPECIES_TYPE:
				return convertSpeciesTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public PlantCoverType createPlantCoverType() {
		PlantCoverTypeImpl plantCoverType = new PlantCoverTypeImpl();
		return plantCoverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolitaryVegetationObjectType createSolitaryVegetationObjectType() {
		SolitaryVegetationObjectTypeImpl solitaryVegetationObjectType = new SolitaryVegetationObjectTypeImpl();
		return solitaryVegetationObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPlantClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlantClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPlantCoverClassTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlantCoverClassTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPlantCoverFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlantCoverFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPlantFunctionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlantFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSpeciesTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeciesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VegetationPackage getVegetationPackage() {
		return (VegetationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VegetationPackage getPackage() {
		return VegetationPackage.eINSTANCE;
	}

} //VegetationFactoryImpl
