/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.util;

import net.opengis.citygml.appearance.AbstractSurfaceDataType;
import net.opengis.citygml.appearance.AbstractTextureParameterizationType;
import net.opengis.citygml.appearance.AbstractTextureType;
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
import net.opengis.citygml.appearance.WorldToTextureType;
import net.opengis.citygml.appearance.X3DMaterialType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.FeaturePropertyType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.appearance.AppearancePackage
 * @generated
 */
public class AppearanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppearancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AppearancePackage.eINSTANCE;
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
	protected AppearanceSwitch<Adapter> modelSwitch =
		new AppearanceSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractSurfaceDataType(AbstractSurfaceDataType object) {
				return createAbstractSurfaceDataTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTextureParameterizationType(AbstractTextureParameterizationType object) {
				return createAbstractTextureParameterizationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTextureType(AbstractTextureType object) {
				return createAbstractTextureTypeAdapter();
			}
			@Override
			public Adapter caseAppearancePropertyType(AppearancePropertyType object) {
				return createAppearancePropertyTypeAdapter();
			}
			@Override
			public Adapter caseAppearanceType(AppearanceType object) {
				return createAppearanceTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGeoreferencedTextureType(GeoreferencedTextureType object) {
				return createGeoreferencedTextureTypeAdapter();
			}
			@Override
			public Adapter caseParameterizedTextureType(ParameterizedTextureType object) {
				return createParameterizedTextureTypeAdapter();
			}
			@Override
			public Adapter caseSurfaceDataPropertyType(SurfaceDataPropertyType object) {
				return createSurfaceDataPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTexCoordGenType(TexCoordGenType object) {
				return createTexCoordGenTypeAdapter();
			}
			@Override
			public Adapter caseTexCoordListType(TexCoordListType object) {
				return createTexCoordListTypeAdapter();
			}
			@Override
			public Adapter caseTextureAssociationType(TextureAssociationType object) {
				return createTextureAssociationTypeAdapter();
			}
			@Override
			public Adapter caseTextureCoordinatesType(TextureCoordinatesType object) {
				return createTextureCoordinatesTypeAdapter();
			}
			@Override
			public Adapter caseWorldToTextureType(WorldToTextureType object) {
				return createWorldToTextureTypeAdapter();
			}
			@Override
			public Adapter caseX3DMaterialType(X3DMaterialType object) {
				return createX3DMaterialTypeAdapter();
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
			public Adapter caseFeaturePropertyType(FeaturePropertyType object) {
				return createFeaturePropertyTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType <em>Abstract Surface Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.AbstractSurfaceDataType
	 * @generated
	 */
	public Adapter createAbstractSurfaceDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.AbstractTextureParameterizationType <em>Abstract Texture Parameterization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.AbstractTextureParameterizationType
	 * @generated
	 */
	public Adapter createAbstractTextureParameterizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.AbstractTextureType <em>Abstract Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.AbstractTextureType
	 * @generated
	 */
	public Adapter createAbstractTextureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.AppearancePropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.AppearancePropertyType
	 * @generated
	 */
	public Adapter createAppearancePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.AppearanceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.AppearanceType
	 * @generated
	 */
	public Adapter createAppearanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.GeoreferencedTextureType <em>Georeferenced Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.GeoreferencedTextureType
	 * @generated
	 */
	public Adapter createGeoreferencedTextureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.ParameterizedTextureType <em>Parameterized Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.ParameterizedTextureType
	 * @generated
	 */
	public Adapter createParameterizedTextureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.SurfaceDataPropertyType <em>Surface Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.SurfaceDataPropertyType
	 * @generated
	 */
	public Adapter createSurfaceDataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.TexCoordGenType <em>Tex Coord Gen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.TexCoordGenType
	 * @generated
	 */
	public Adapter createTexCoordGenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.TexCoordListType <em>Tex Coord List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.TexCoordListType
	 * @generated
	 */
	public Adapter createTexCoordListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.TextureAssociationType <em>Texture Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.TextureAssociationType
	 * @generated
	 */
	public Adapter createTextureAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.TextureCoordinatesType <em>Texture Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.TextureCoordinatesType
	 * @generated
	 */
	public Adapter createTextureCoordinatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.WorldToTextureType <em>World To Texture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.WorldToTextureType
	 * @generated
	 */
	public Adapter createWorldToTextureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.citygml.appearance.X3DMaterialType <em>X3D Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.citygml.appearance.X3DMaterialType
	 * @generated
	 */
	public Adapter createX3DMaterialTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.FeaturePropertyType <em>Feature Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.FeaturePropertyType
	 * @generated
	 */
	public Adapter createFeaturePropertyTypeAdapter() {
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

} //AppearanceAdapterFactory
