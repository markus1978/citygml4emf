/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics.impl;

import net.opengis.citygml.generics.DateAttributeType;
import net.opengis.citygml.generics.DocumentRoot;
import net.opengis.citygml.generics.DoubleAttributeType;
import net.opengis.citygml.generics.GenericCityObjectType;
import net.opengis.citygml.generics.GenericsFactory;
import net.opengis.citygml.generics.GenericsPackage;
import net.opengis.citygml.generics.IntAttributeType;
import net.opengis.citygml.generics.StringAttributeType;
import net.opengis.citygml.generics.UriAttributeType;

import org.eclipse.emf.ecore.EClass;
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
public class GenericsFactoryImpl extends EFactoryImpl implements GenericsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericsFactory init() {
		try {
			GenericsFactory theGenericsFactory = (GenericsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/generics/1.0"); 
			if (theGenericsFactory != null) {
				return theGenericsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericsFactoryImpl() {
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
			case GenericsPackage.DATE_ATTRIBUTE_TYPE: return createDateAttributeType();
			case GenericsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GenericsPackage.DOUBLE_ATTRIBUTE_TYPE: return createDoubleAttributeType();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE: return createGenericCityObjectType();
			case GenericsPackage.INT_ATTRIBUTE_TYPE: return createIntAttributeType();
			case GenericsPackage.STRING_ATTRIBUTE_TYPE: return createStringAttributeType();
			case GenericsPackage.URI_ATTRIBUTE_TYPE: return createUriAttributeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateAttributeType createDateAttributeType() {
		DateAttributeTypeImpl dateAttributeType = new DateAttributeTypeImpl();
		return dateAttributeType;
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
	public DoubleAttributeType createDoubleAttributeType() {
		DoubleAttributeTypeImpl doubleAttributeType = new DoubleAttributeTypeImpl();
		return doubleAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericCityObjectType createGenericCityObjectType() {
		GenericCityObjectTypeImpl genericCityObjectType = new GenericCityObjectTypeImpl();
		return genericCityObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAttributeType createIntAttributeType() {
		IntAttributeTypeImpl intAttributeType = new IntAttributeTypeImpl();
		return intAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAttributeType createStringAttributeType() {
		StringAttributeTypeImpl stringAttributeType = new StringAttributeTypeImpl();
		return stringAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriAttributeType createUriAttributeType() {
		UriAttributeTypeImpl uriAttributeType = new UriAttributeTypeImpl();
		return uriAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericsPackage getGenericsPackage() {
		return (GenericsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericsPackage getPackage() {
		return GenericsPackage.eINSTANCE;
	}

} //GenericsFactoryImpl
