/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import net.opengis.citygml.AddressPropertyType;
import net.opengis.citygml.AddressType;
import net.opengis.citygml.CityModelType;
import net.opengis.citygml.CitygmlFactory;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.DocumentRoot;
import net.opengis.citygml.ExternalObjectReferenceType;
import net.opengis.citygml.ExternalReferenceType;
import net.opengis.citygml.GeneralizationRelationType;
import net.opengis.citygml.ImplicitGeometryType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.XalAddressPropertyType;
import net.opengis.gml.GmlFactory;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class CitygmlFactoryImpl extends EFactoryImpl implements CitygmlFactory {

	@Override
	protected String[] split(String value) {
		return value.trim().split("[ \t\n\r\f]+");
	}

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static CitygmlFactory init() {
		try {
			CitygmlFactory theCitygmlFactory = (CitygmlFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.opengis.net/citygml/1.0");
			if (theCitygmlFactory != null) {
				return theCitygmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CitygmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public CitygmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CitygmlPackage.ADDRESS_PROPERTY_TYPE:
			return createAddressPropertyType();
		case CitygmlPackage.ADDRESS_TYPE:
			return createAddressType();
		case CitygmlPackage.CITY_MODEL_TYPE:
			return createCityModelType();
		case CitygmlPackage.EXTERNAL_OBJECT_REFERENCE_TYPE:
			return createExternalObjectReferenceType();
		case CitygmlPackage.EXTERNAL_REFERENCE_TYPE:
			return createExternalReferenceType();
		case CitygmlPackage.GENERALIZATION_RELATION_TYPE:
			return createGeneralizationRelationType();
		case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE:
			return createImplicitGeometryType();
		case CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE:
			return createImplicitRepresentationPropertyType();
		case CitygmlPackage.XAL_ADDRESS_PROPERTY_TYPE:
			return createXalAddressPropertyType();
		case CitygmlPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CitygmlPackage.DOUBLE_BETWEEN0AND1:
			return createDoubleBetween0and1FromString(eDataType, initialValue);
		case CitygmlPackage.DOUBLE_BETWEEN0AND1_LIST:
			return createDoubleBetween0and1ListFromString(eDataType, initialValue);
		case CitygmlPackage.DOUBLE_BETWEEN0AND1_OBJECT:
			return createDoubleBetween0and1ObjectFromString(eDataType, initialValue);
		case CitygmlPackage.INTEGER_BETWEEN0AND4:
			return createIntegerBetween0and4FromString(eDataType, initialValue);
		case CitygmlPackage.MIME_TYPE_TYPE:
			return createMimeTypeTypeFromString(eDataType, initialValue);
		case CitygmlPackage.TRANSFORMATION_MATRIX2X2_TYPE:
			return createTransformationMatrix2x2TypeFromString(eDataType, initialValue);
		case CitygmlPackage.TRANSFORMATION_MATRIX3X4_TYPE:
			return createTransformationMatrix3x4TypeFromString(eDataType, initialValue);
		case CitygmlPackage.TRANSFORMATION_MATRIX4X4_TYPE:
			return createTransformationMatrix4x4TypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CitygmlPackage.DOUBLE_BETWEEN0AND1:
			return convertDoubleBetween0and1ToString(eDataType, instanceValue);
		case CitygmlPackage.DOUBLE_BETWEEN0AND1_LIST:
			return convertDoubleBetween0and1ListToString(eDataType, instanceValue);
		case CitygmlPackage.DOUBLE_BETWEEN0AND1_OBJECT:
			return convertDoubleBetween0and1ObjectToString(eDataType, instanceValue);
		case CitygmlPackage.INTEGER_BETWEEN0AND4:
			return convertIntegerBetween0and4ToString(eDataType, instanceValue);
		case CitygmlPackage.MIME_TYPE_TYPE:
			return convertMimeTypeTypeToString(eDataType, instanceValue);
		case CitygmlPackage.TRANSFORMATION_MATRIX2X2_TYPE:
			return convertTransformationMatrix2x2TypeToString(eDataType, instanceValue);
		case CitygmlPackage.TRANSFORMATION_MATRIX3X4_TYPE:
			return convertTransformationMatrix3x4TypeToString(eDataType, instanceValue);
		case CitygmlPackage.TRANSFORMATION_MATRIX4X4_TYPE:
			return convertTransformationMatrix4x4TypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AddressPropertyType createAddressPropertyType() {
		AddressPropertyTypeImpl addressPropertyType = new AddressPropertyTypeImpl();
		return addressPropertyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CityModelType createCityModelType() {
		CityModelTypeImpl cityModelType = new CityModelTypeImpl();
		return cityModelType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExternalObjectReferenceType createExternalObjectReferenceType() {
		ExternalObjectReferenceTypeImpl externalObjectReferenceType = new ExternalObjectReferenceTypeImpl();
		return externalObjectReferenceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExternalReferenceType createExternalReferenceType() {
		ExternalReferenceTypeImpl externalReferenceType = new ExternalReferenceTypeImpl();
		return externalReferenceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GeneralizationRelationType createGeneralizationRelationType() {
		GeneralizationRelationTypeImpl generalizationRelationType = new GeneralizationRelationTypeImpl();
		return generalizationRelationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ImplicitGeometryType createImplicitGeometryType() {
		ImplicitGeometryTypeImpl implicitGeometryType = new ImplicitGeometryTypeImpl();
		return implicitGeometryType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ImplicitRepresentationPropertyType createImplicitRepresentationPropertyType() {
		ImplicitRepresentationPropertyTypeImpl implicitRepresentationPropertyType = new ImplicitRepresentationPropertyTypeImpl();
		return implicitRepresentationPropertyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XalAddressPropertyType createXalAddressPropertyType() {
		XalAddressPropertyTypeImpl xalAddressPropertyType = new XalAddressPropertyTypeImpl();
		return xalAddressPropertyType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Double createDoubleBetween0and1FromString(EDataType eDataType, String initialValue) {
		return (Double) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDoubleBetween0and1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<Double> createDoubleBetween0and1ListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null)
			return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add(createDoubleBetween0and1FromString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDoubleBetween0and1ListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null)
			return null;
		List<?> list = (List<?>) instanceValue;
		if (list.isEmpty())
			return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertDoubleBetween0and1ToString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Double createDoubleBetween0and1ObjectFromString(EDataType eDataType, String initialValue) {
		return createDoubleBetween0and1FromString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDoubleBetween0and1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDoubleBetween0and1ToString(CitygmlPackage.Literals.DOUBLE_BETWEEN0AND1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger createIntegerBetween0and4FromString(EDataType eDataType, String initialValue) {
		return (BigInteger) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertIntegerBetween0and4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createMimeTypeTypeFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMimeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<Double> createTransformationMatrix2x2TypeFromString(EDataType eDataType, String initialValue) {
		return (List) GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getDoubleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTransformationMatrix2x2TypeToString(EDataType eDataType, Object instanceValue) {
		return GmlFactory.eINSTANCE.convertToString(GmlPackage.eINSTANCE.getDoubleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<Double> createTransformationMatrix3x4TypeFromString(EDataType eDataType, String initialValue) {
		return (List) GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getDoubleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTransformationMatrix3x4TypeToString(EDataType eDataType, Object instanceValue) {
		return GmlFactory.eINSTANCE.convertToString(GmlPackage.eINSTANCE.getDoubleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<Double> createTransformationMatrix4x4TypeFromString(EDataType eDataType, String initialValue) {
		return (List) GmlFactory.eINSTANCE.createFromString(GmlPackage.eINSTANCE.getDoubleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTransformationMatrix4x4TypeToString(EDataType eDataType, Object instanceValue) {
		return GmlFactory.eINSTANCE.convertToString(GmlPackage.eINSTANCE.getDoubleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CitygmlPackage getCitygmlPackage() {
		return (CitygmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CitygmlPackage getPackage() {
		return CitygmlPackage.eINSTANCE;
	}

} // CitygmlFactoryImpl
