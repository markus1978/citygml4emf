/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityobjectgroup.impl;

import net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType;
import net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType;
import net.opengis.citygml.cityobjectgroup.CityObjectGroupType;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupFactory;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage;
import net.opengis.citygml.cityobjectgroup.DocumentRoot;

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
public class CityobjectgroupFactoryImpl extends EFactoryImpl implements CityobjectgroupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CityobjectgroupFactory init() {
		try {
			CityobjectgroupFactory theCityobjectgroupFactory = (CityobjectgroupFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/cityobjectgroup/1.0"); 
			if (theCityobjectgroupFactory != null) {
				return theCityobjectgroupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CityobjectgroupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityobjectgroupFactoryImpl() {
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE: return createCityObjectGroupMemberType();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_PARENT_TYPE: return createCityObjectGroupParentType();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE: return createCityObjectGroupType();
			case CityobjectgroupPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityObjectGroupMemberType createCityObjectGroupMemberType() {
		CityObjectGroupMemberTypeImpl cityObjectGroupMemberType = new CityObjectGroupMemberTypeImpl();
		return cityObjectGroupMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityObjectGroupParentType createCityObjectGroupParentType() {
		CityObjectGroupParentTypeImpl cityObjectGroupParentType = new CityObjectGroupParentTypeImpl();
		return cityObjectGroupParentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityObjectGroupType createCityObjectGroupType() {
		CityObjectGroupTypeImpl cityObjectGroupType = new CityObjectGroupTypeImpl();
		return cityObjectGroupType;
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
	public CityobjectgroupPackage getCityobjectgroupPackage() {
		return (CityobjectgroupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CityobjectgroupPackage getPackage() {
		return CityobjectgroupPackage.eINSTANCE;
	}

} //CityobjectgroupFactoryImpl
