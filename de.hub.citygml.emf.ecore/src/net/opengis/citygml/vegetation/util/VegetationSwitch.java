/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation.util;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.vegetation.AbstractVegetationObjectType;
import net.opengis.citygml.vegetation.DocumentRoot;
import net.opengis.citygml.vegetation.PlantCoverType;
import net.opengis.citygml.vegetation.SolitaryVegetationObjectType;
import net.opengis.citygml.vegetation.VegetationPackage;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;

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
 * @see net.opengis.citygml.vegetation.VegetationPackage
 * @generated
 */
public class VegetationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VegetationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VegetationSwitch() {
		if (modelPackage == null) {
			modelPackage = VegetationPackage.eINSTANCE;
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
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE: {
				AbstractVegetationObjectType abstractVegetationObjectType = (AbstractVegetationObjectType)theEObject;
				T result = caseAbstractVegetationObjectType(abstractVegetationObjectType);
				if (result == null) result = caseAbstractCityObjectType(abstractVegetationObjectType);
				if (result == null) result = caseAbstractFeatureType(abstractVegetationObjectType);
				if (result == null) result = caseAbstractGMLType(abstractVegetationObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VegetationPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VegetationPackage.PLANT_COVER_TYPE: {
				PlantCoverType plantCoverType = (PlantCoverType)theEObject;
				T result = casePlantCoverType(plantCoverType);
				if (result == null) result = caseAbstractVegetationObjectType(plantCoverType);
				if (result == null) result = caseAbstractCityObjectType(plantCoverType);
				if (result == null) result = caseAbstractFeatureType(plantCoverType);
				if (result == null) result = caseAbstractGMLType(plantCoverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE: {
				SolitaryVegetationObjectType solitaryVegetationObjectType = (SolitaryVegetationObjectType)theEObject;
				T result = caseSolitaryVegetationObjectType(solitaryVegetationObjectType);
				if (result == null) result = caseAbstractVegetationObjectType(solitaryVegetationObjectType);
				if (result == null) result = caseAbstractCityObjectType(solitaryVegetationObjectType);
				if (result == null) result = caseAbstractFeatureType(solitaryVegetationObjectType);
				if (result == null) result = caseAbstractGMLType(solitaryVegetationObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Vegetation Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Vegetation Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVegetationObjectType(AbstractVegetationObjectType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Plant Cover Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant Cover Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantCoverType(PlantCoverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solitary Vegetation Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solitary Vegetation Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolitaryVegetationObjectType(SolitaryVegetationObjectType object) {
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

} //VegetationSwitch
