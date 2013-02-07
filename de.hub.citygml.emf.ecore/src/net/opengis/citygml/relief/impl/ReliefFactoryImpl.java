/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import net.opengis.citygml.relief.BreaklineReliefType;
import net.opengis.citygml.relief.DocumentRoot;
import net.opengis.citygml.relief.GridPropertyType;
import net.opengis.citygml.relief.MassPointReliefType;
import net.opengis.citygml.relief.RasterReliefType;
import net.opengis.citygml.relief.ReliefComponentPropertyType;
import net.opengis.citygml.relief.ReliefFactory;
import net.opengis.citygml.relief.ReliefFeatureType;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.citygml.relief.TINReliefType;
import net.opengis.citygml.relief.TinPropertyType;

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
public class ReliefFactoryImpl extends EFactoryImpl implements ReliefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReliefFactory init() {
		try {
			ReliefFactory theReliefFactory = (ReliefFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.opengis.net/citygml/relief/1.0"); 
			if (theReliefFactory != null) {
				return theReliefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReliefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliefFactoryImpl() {
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
			case ReliefPackage.BREAKLINE_RELIEF_TYPE: return createBreaklineReliefType();
			case ReliefPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ReliefPackage.GRID_PROPERTY_TYPE: return createGridPropertyType();
			case ReliefPackage.MASS_POINT_RELIEF_TYPE: return createMassPointReliefType();
			case ReliefPackage.RASTER_RELIEF_TYPE: return createRasterReliefType();
			case ReliefPackage.RELIEF_COMPONENT_PROPERTY_TYPE: return createReliefComponentPropertyType();
			case ReliefPackage.RELIEF_FEATURE_TYPE: return createReliefFeatureType();
			case ReliefPackage.TIN_PROPERTY_TYPE: return createTinPropertyType();
			case ReliefPackage.TIN_RELIEF_TYPE: return createTINReliefType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreaklineReliefType createBreaklineReliefType() {
		BreaklineReliefTypeImpl breaklineReliefType = new BreaklineReliefTypeImpl();
		return breaklineReliefType;
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
	public GridPropertyType createGridPropertyType() {
		GridPropertyTypeImpl gridPropertyType = new GridPropertyTypeImpl();
		return gridPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassPointReliefType createMassPointReliefType() {
		MassPointReliefTypeImpl massPointReliefType = new MassPointReliefTypeImpl();
		return massPointReliefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterReliefType createRasterReliefType() {
		RasterReliefTypeImpl rasterReliefType = new RasterReliefTypeImpl();
		return rasterReliefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliefComponentPropertyType createReliefComponentPropertyType() {
		ReliefComponentPropertyTypeImpl reliefComponentPropertyType = new ReliefComponentPropertyTypeImpl();
		return reliefComponentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliefFeatureType createReliefFeatureType() {
		ReliefFeatureTypeImpl reliefFeatureType = new ReliefFeatureTypeImpl();
		return reliefFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TinPropertyType createTinPropertyType() {
		TinPropertyTypeImpl tinPropertyType = new TinPropertyTypeImpl();
		return tinPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TINReliefType createTINReliefType() {
		TINReliefTypeImpl tinReliefType = new TINReliefTypeImpl();
		return tinReliefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliefPackage getReliefPackage() {
		return (ReliefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReliefPackage getPackage() {
		return ReliefPackage.eINSTANCE;
	}

} //ReliefFactoryImpl
