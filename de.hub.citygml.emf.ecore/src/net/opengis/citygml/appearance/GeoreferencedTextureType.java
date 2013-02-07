/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import java.util.List;

import net.opengis.gml.PointPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Georeferenced Texture Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specialization for georeferenced textures, i.e. textures using a planimetric projection. Such
 *                 textures contain an implicit parameterization (either stored within the image file, in an acompanying world file,
 *                 or using the "referencePoint" and "orientation"-elements). A georeference provided by "referencePoint" and
 *                 "orientation" always takes precedence. The search order for an external georeference is determined by the boolean
 *                 flag preferWorldFile. If this flag is set to true (its default value), a world file is looked for first and only
 *                 if it is not found the georeference from the image data is used. If preferWorldFile is false, the world file is
 *                 used only if no georeference from the image data is available. The "boundedBy"-property should contain the
 *                 bounding box of the projected image data. Since a georeferenced texture has a unique parameterization, "target"
 *                 only provides links to surface geometry without any additional texture parameterization. Only gml:MultiSurface or
 *                 decendants of gml:AbstractSurfaceType are valid targets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.GeoreferencedTextureType#isPreferWorldFile <em>Prefer World File</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getReferencePoint <em>Reference Point</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getGenericApplicationPropertyOfGeoreferencedTextureGroup <em>Generic Application Property Of Georeferenced Texture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getGenericApplicationPropertyOfGeoreferencedTexture <em>Generic Application Property Of Georeferenced Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getGeoreferencedTextureType()
 * @model extendedMetaData="name='GeoreferencedTextureType' kind='elementOnly'"
 * @generated
 */
public interface GeoreferencedTextureType extends AbstractTextureType {
	/**
	 * Returns the value of the '<em><b>Prefer World File</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefer World File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefer World File</em>' attribute.
	 * @see #isSetPreferWorldFile()
	 * @see #unsetPreferWorldFile()
	 * @see #setPreferWorldFile(boolean)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getGeoreferencedTextureType_PreferWorldFile()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='preferWorldFile' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPreferWorldFile();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#isPreferWorldFile <em>Prefer World File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefer World File</em>' attribute.
	 * @see #isSetPreferWorldFile()
	 * @see #unsetPreferWorldFile()
	 * @see #isPreferWorldFile()
	 * @generated
	 */
	void setPreferWorldFile(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#isPreferWorldFile <em>Prefer World File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreferWorldFile()
	 * @see #isPreferWorldFile()
	 * @see #setPreferWorldFile(boolean)
	 * @generated
	 */
	void unsetPreferWorldFile();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#isPreferWorldFile <em>Prefer World File</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefer World File</em>' attribute is set.
	 * @see #unsetPreferWorldFile()
	 * @see #isPreferWorldFile()
	 * @see #setPreferWorldFile(boolean)
	 * @generated
	 */
	boolean isSetPreferWorldFile();

	/**
	 * Returns the value of the '<em><b>Reference Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Point</em>' containment reference.
	 * @see #setReferencePoint(PointPropertyType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getGeoreferencedTextureType_ReferencePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referencePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getReferencePoint();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getReferencePoint <em>Reference Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Point</em>' containment reference.
	 * @see #getReferencePoint()
	 * @generated
	 */
	void setReferencePoint(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(List)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getGeoreferencedTextureType_Orientation()
	 * @model dataType="net.opengis.citygml.TransformationMatrix2x2Type" many="false"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getOrientation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.GeoreferencedTextureType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getGeoreferencedTextureType_Target()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTarget();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Georeferenced Texture Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Georeferenced Texture Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Georeferenced Texture Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTextureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfGeoreferencedTexture:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfGeoreferencedTextureGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Georeferenced Texture</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Georeferenced Texture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Georeferenced Texture</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getGeoreferencedTextureType_GenericApplicationPropertyOfGeoreferencedTexture()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfGeoreferencedTexture' namespace='##targetNamespace' group='_GenericApplicationPropertyOfGeoreferencedTexture:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfGeoreferencedTexture();

} // GeoreferencedTextureType
