/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.util;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.relief.AbstractReliefComponentType;
import net.opengis.citygml.relief.BreaklineReliefType;
import net.opengis.citygml.relief.DocumentRoot;
import net.opengis.citygml.relief.GridPropertyType;
import net.opengis.citygml.relief.MassPointReliefType;
import net.opengis.citygml.relief.RasterReliefType;
import net.opengis.citygml.relief.ReliefComponentPropertyType;
import net.opengis.citygml.relief.ReliefFeatureType;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.citygml.relief.TINReliefType;
import net.opengis.citygml.relief.TinPropertyType;
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
 * @see net.opengis.citygml.relief.ReliefPackage
 * @generated
 */
public class ReliefSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReliefPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliefSwitch() {
		if (modelPackage == null) {
			modelPackage = ReliefPackage.eINSTANCE;
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
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE: {
				AbstractReliefComponentType abstractReliefComponentType = (AbstractReliefComponentType)theEObject;
				T result = caseAbstractReliefComponentType(abstractReliefComponentType);
				if (result == null) result = caseAbstractCityObjectType(abstractReliefComponentType);
				if (result == null) result = caseAbstractFeatureType(abstractReliefComponentType);
				if (result == null) result = caseAbstractGMLType(abstractReliefComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.BREAKLINE_RELIEF_TYPE: {
				BreaklineReliefType breaklineReliefType = (BreaklineReliefType)theEObject;
				T result = caseBreaklineReliefType(breaklineReliefType);
				if (result == null) result = caseAbstractReliefComponentType(breaklineReliefType);
				if (result == null) result = caseAbstractCityObjectType(breaklineReliefType);
				if (result == null) result = caseAbstractFeatureType(breaklineReliefType);
				if (result == null) result = caseAbstractGMLType(breaklineReliefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.GRID_PROPERTY_TYPE: {
				GridPropertyType gridPropertyType = (GridPropertyType)theEObject;
				T result = caseGridPropertyType(gridPropertyType);
				if (result == null) result = caseAssociationType(gridPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.MASS_POINT_RELIEF_TYPE: {
				MassPointReliefType massPointReliefType = (MassPointReliefType)theEObject;
				T result = caseMassPointReliefType(massPointReliefType);
				if (result == null) result = caseAbstractReliefComponentType(massPointReliefType);
				if (result == null) result = caseAbstractCityObjectType(massPointReliefType);
				if (result == null) result = caseAbstractFeatureType(massPointReliefType);
				if (result == null) result = caseAbstractGMLType(massPointReliefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.RASTER_RELIEF_TYPE: {
				RasterReliefType rasterReliefType = (RasterReliefType)theEObject;
				T result = caseRasterReliefType(rasterReliefType);
				if (result == null) result = caseAbstractReliefComponentType(rasterReliefType);
				if (result == null) result = caseAbstractCityObjectType(rasterReliefType);
				if (result == null) result = caseAbstractFeatureType(rasterReliefType);
				if (result == null) result = caseAbstractGMLType(rasterReliefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.RELIEF_COMPONENT_PROPERTY_TYPE: {
				ReliefComponentPropertyType reliefComponentPropertyType = (ReliefComponentPropertyType)theEObject;
				T result = caseReliefComponentPropertyType(reliefComponentPropertyType);
				if (result == null) result = caseAssociationType(reliefComponentPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.RELIEF_FEATURE_TYPE: {
				ReliefFeatureType reliefFeatureType = (ReliefFeatureType)theEObject;
				T result = caseReliefFeatureType(reliefFeatureType);
				if (result == null) result = caseAbstractCityObjectType(reliefFeatureType);
				if (result == null) result = caseAbstractFeatureType(reliefFeatureType);
				if (result == null) result = caseAbstractGMLType(reliefFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.TIN_PROPERTY_TYPE: {
				TinPropertyType tinPropertyType = (TinPropertyType)theEObject;
				T result = caseTinPropertyType(tinPropertyType);
				if (result == null) result = caseAssociationType(tinPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReliefPackage.TIN_RELIEF_TYPE: {
				TINReliefType tinReliefType = (TINReliefType)theEObject;
				T result = caseTINReliefType(tinReliefType);
				if (result == null) result = caseAbstractReliefComponentType(tinReliefType);
				if (result == null) result = caseAbstractCityObjectType(tinReliefType);
				if (result == null) result = caseAbstractFeatureType(tinReliefType);
				if (result == null) result = caseAbstractGMLType(tinReliefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Relief Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Relief Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractReliefComponentType(AbstractReliefComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breakline Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breakline Relief Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreaklineReliefType(BreaklineReliefType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Grid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridPropertyType(GridPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Point Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Point Relief Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassPointReliefType(MassPointReliefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raster Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raster Relief Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRasterReliefType(RasterReliefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliefComponentPropertyType(ReliefComponentPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliefFeatureType(ReliefFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tin Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tin Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinPropertyType(TinPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIN Relief Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIN Relief Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTINReliefType(TINReliefType object) {
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

} //ReliefSwitch
