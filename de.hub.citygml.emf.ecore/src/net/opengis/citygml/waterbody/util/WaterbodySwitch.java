/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.util;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType;
import net.opengis.citygml.waterbody.AbstractWaterObjectType;
import net.opengis.citygml.waterbody.BoundedByWaterSurfacePropertyType;
import net.opengis.citygml.waterbody.DocumentRoot;
import net.opengis.citygml.waterbody.WaterBodyType;
import net.opengis.citygml.waterbody.WaterClosureSurfaceType;
import net.opengis.citygml.waterbody.WaterGroundSurfaceType;
import net.opengis.citygml.waterbody.WaterSurfaceType;
import net.opengis.citygml.waterbody.WaterbodyPackage;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AssociationType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.citygml.waterbody.WaterbodyPackage
 * @generated
 */
public class WaterbodySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WaterbodyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterbodySwitch() {
		if (modelPackage == null) {
			modelPackage = WaterbodyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE: {
				AbstractWaterBoundarySurfaceType abstractWaterBoundarySurfaceType = (AbstractWaterBoundarySurfaceType)theEObject;
				T result = caseAbstractWaterBoundarySurfaceType(abstractWaterBoundarySurfaceType);
				if (result == null) result = caseAbstractCityObjectType(abstractWaterBoundarySurfaceType);
				if (result == null) result = caseAbstractFeatureType(abstractWaterBoundarySurfaceType);
				if (result == null) result = caseAbstractGMLType(abstractWaterBoundarySurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE: {
				AbstractWaterObjectType abstractWaterObjectType = (AbstractWaterObjectType)theEObject;
				T result = caseAbstractWaterObjectType(abstractWaterObjectType);
				if (result == null) result = caseAbstractCityObjectType(abstractWaterObjectType);
				if (result == null) result = caseAbstractFeatureType(abstractWaterObjectType);
				if (result == null) result = caseAbstractGMLType(abstractWaterObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterbodyPackage.BOUNDED_BY_WATER_SURFACE_PROPERTY_TYPE: {
				BoundedByWaterSurfacePropertyType boundedByWaterSurfacePropertyType = (BoundedByWaterSurfacePropertyType)theEObject;
				T result = caseBoundedByWaterSurfacePropertyType(boundedByWaterSurfacePropertyType);
				if (result == null) result = caseAssociationType(boundedByWaterSurfacePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterbodyPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterbodyPackage.WATER_BODY_TYPE: {
				WaterBodyType waterBodyType = (WaterBodyType)theEObject;
				T result = caseWaterBodyType(waterBodyType);
				if (result == null) result = caseAbstractWaterObjectType(waterBodyType);
				if (result == null) result = caseAbstractCityObjectType(waterBodyType);
				if (result == null) result = caseAbstractFeatureType(waterBodyType);
				if (result == null) result = caseAbstractGMLType(waterBodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterbodyPackage.WATER_CLOSURE_SURFACE_TYPE: {
				WaterClosureSurfaceType waterClosureSurfaceType = (WaterClosureSurfaceType)theEObject;
				T result = caseWaterClosureSurfaceType(waterClosureSurfaceType);
				if (result == null) result = caseAbstractWaterBoundarySurfaceType(waterClosureSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(waterClosureSurfaceType);
				if (result == null) result = caseAbstractFeatureType(waterClosureSurfaceType);
				if (result == null) result = caseAbstractGMLType(waterClosureSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterbodyPackage.WATER_GROUND_SURFACE_TYPE: {
				WaterGroundSurfaceType waterGroundSurfaceType = (WaterGroundSurfaceType)theEObject;
				T result = caseWaterGroundSurfaceType(waterGroundSurfaceType);
				if (result == null) result = caseAbstractWaterBoundarySurfaceType(waterGroundSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(waterGroundSurfaceType);
				if (result == null) result = caseAbstractFeatureType(waterGroundSurfaceType);
				if (result == null) result = caseAbstractGMLType(waterGroundSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterbodyPackage.WATER_SURFACE_TYPE: {
				WaterSurfaceType waterSurfaceType = (WaterSurfaceType)theEObject;
				T result = caseWaterSurfaceType(waterSurfaceType);
				if (result == null) result = caseAbstractWaterBoundarySurfaceType(waterSurfaceType);
				if (result == null) result = caseAbstractCityObjectType(waterSurfaceType);
				if (result == null) result = caseAbstractFeatureType(waterSurfaceType);
				if (result == null) result = caseAbstractGMLType(waterSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Water Boundary Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Water Boundary Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWaterBoundarySurfaceType(AbstractWaterBoundarySurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Water Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Water Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWaterObjectType(AbstractWaterObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded By Water Surface Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded By Water Surface Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedByWaterSurfacePropertyType(BoundedByWaterSurfacePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterBodyType(WaterBodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Closure Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Closure Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterClosureSurfaceType(WaterClosureSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Ground Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Ground Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterGroundSurfaceType(WaterGroundSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterSurfaceType(WaterSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGMLType(AbstractGMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureType(AbstractFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract City Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract City Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCityObjectType(AbstractCityObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationType(AssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WaterbodySwitch
