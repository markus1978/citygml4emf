/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Relief Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the raster component of a relief feature. As subclass of _CityObject, a RasterRelief
 *                 inherits all attributes and relations, in particular an id, names, external references, and generalization
 *                 relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.RasterReliefType#getGrid <em>Grid</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.RasterReliefType#getGenericApplicationPropertyOfRasterReliefGroup <em>Generic Application Property Of Raster Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.RasterReliefType#getGenericApplicationPropertyOfRasterRelief <em>Generic Application Property Of Raster Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getRasterReliefType()
 * @model extendedMetaData="name='RasterReliefType' kind='elementOnly'"
 * @generated
 */
public interface RasterReliefType extends AbstractReliefComponentType {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(GridPropertyType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getRasterReliefType_Grid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='grid' namespace='##targetNamespace'"
	 * @generated
	 */
	GridPropertyType getGrid();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.RasterReliefType#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(GridPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Raster Relief Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Raster Relief Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Raster Relief Group</em>' attribute list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getRasterReliefType_GenericApplicationPropertyOfRasterReliefGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfRasterRelief:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfRasterReliefGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Raster Relief</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Raster Relief</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Raster Relief</em>' containment reference list.
	 * @see net.opengis.citygml.relief.ReliefPackage#getRasterReliefType_GenericApplicationPropertyOfRasterRelief()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRasterRelief' namespace='##targetNamespace' group='_GenericApplicationPropertyOfRasterRelief:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfRasterRelief();

} // RasterReliefType
