/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.util;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.AbstractSiteType;
import net.opengis.citygml.AddressPropertyType;
import net.opengis.citygml.AddressType;
import net.opengis.citygml.CityModelType;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.DocumentRoot;
import net.opengis.citygml.ExternalObjectReferenceType;
import net.opengis.citygml.ExternalReferenceType;
import net.opengis.citygml.GeneralizationRelationType;
import net.opengis.citygml.ImplicitGeometryType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.XalAddressPropertyType;
import net.opengis.gml.AbstractFeatureCollectionType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AssociationType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.CitygmlPackage
 * @generated
 */
public class CitygmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CitygmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitygmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CitygmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitygmlSwitch<Adapter> modelSwitch =
		new CitygmlSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCityObjectType(AbstractCityObjectType object) {
				return createAbstractCityObjectTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSiteType(AbstractSiteType object) {
				return createAbstractSiteTypeAdapter();
			}
			@Override
			public Adapter caseAddressPropertyType(AddressPropertyType object) {
				return createAddressPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseCityModelType(CityModelType object) {
				return createCityModelTypeAdapter();
			}
			@Override
			public Adapter caseExternalObjectReferenceType(ExternalObjectReferenceType object) {
				return createExternalObjectReferenceTypeAdapter();
			}
			@Override
			public Adapter caseExternalReferenceType(ExternalReferenceType object) {
				return createExternalReferenceTypeAdapter();
			}
			@Override
			public Adapter caseGeneralizationRelationType(GeneralizationRelationType object) {
				return createGeneralizationRelationTypeAdapter();
			}
			@Override
			public Adapter caseImplicitGeometryType(ImplicitGeometryType object) {
				return createImplicitGeometryTypeAdapter();
			}
			@Override
			public Adapter caseImplicitRepresentationPropertyType(ImplicitRepresentationPropertyType object) {
				return createImplicitRepresentationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseXalAddressPropertyType(XalAddressPropertyType object) {
				return createXalAddressPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureType(AbstractFeatureType object) {
				return createAbstractFeatureTypeAdapter();
			}
			@Override
			public Adapter caseAssociationType(AssociationType object) {
				return createAssociationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureCollectionType(AbstractFeatureCollectionType object) {
				return createAbstractFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.AbstractCityObjectType <em>Abstract City Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.AbstractCityObjectType
	 * @generated
	 */
	public Adapter createAbstractCityObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.AbstractSiteType <em>Abstract Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.AbstractSiteType
	 * @generated
	 */
	public Adapter createAbstractSiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.AddressPropertyType <em>Address Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.AddressPropertyType
	 * @generated
	 */
	public Adapter createAddressPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.CityModelType <em>City Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.CityModelType
	 * @generated
	 */
	public Adapter createCityModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.ExternalObjectReferenceType <em>External Object Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.ExternalObjectReferenceType
	 * @generated
	 */
	public Adapter createExternalObjectReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.ExternalReferenceType <em>External Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.ExternalReferenceType
	 * @generated
	 */
	public Adapter createExternalReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.GeneralizationRelationType <em>Generalization Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.GeneralizationRelationType
	 * @generated
	 */
	public Adapter createGeneralizationRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.ImplicitGeometryType <em>Implicit Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.ImplicitGeometryType
	 * @generated
	 */
	public Adapter createImplicitGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.ImplicitRepresentationPropertyType <em>Implicit Representation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.ImplicitRepresentationPropertyType
	 * @generated
	 */
	public Adapter createImplicitRepresentationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.XalAddressPropertyType <em>Xal Address Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.XalAddressPropertyType
	 * @generated
	 */
	public Adapter createXalAddressPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractGMLType <em>Abstract GML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractGMLType
	 * @generated
	 */
	public Adapter createAbstractGMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractFeatureType <em>Abstract Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractFeatureType
	 * @generated
	 */
	public Adapter createAbstractFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AssociationType
	 * @generated
	 */
	public Adapter createAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.AbstractFeatureCollectionType <em>Abstract Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.AbstractFeatureCollectionType
	 * @generated
	 */
	public Adapter createAbstractFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CitygmlAdapterFactory
