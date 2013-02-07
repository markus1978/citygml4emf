/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfAppearance <em>Generic Application Property Of Appearance</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfGeoreferencedTexture <em>Generic Application Property Of Georeferenced Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfParameterizedTexture <em>Generic Application Property Of Parameterized Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfSurfaceData <em>Generic Application Property Of Surface Data</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexCoordGen <em>Generic Application Property Of Tex Coord Gen</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexCoordList <em>Generic Application Property Of Tex Coord List</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTexture <em>Generic Application Property Of Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfTextureParameterization <em>Generic Application Property Of Texture Parameterization</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGenericApplicationPropertyOfX3DMaterial <em>Generic Application Property Of X3D Material</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getSurfaceData <em>Surface Data</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getTexture <em>Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getTextureParameterization <em>Texture Parameterization</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getAppearanceMember <em>Appearance Member</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getGeoreferencedTexture <em>Georeferenced Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getParameterizedTexture <em>Parameterized Texture</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getTexCoordGen <em>Tex Coord Gen</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getTexCoordList <em>Tex Coord List</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.DocumentRoot#getX3DMaterial <em>X3D Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Appearance</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfAppearance()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAppearance' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfAppearance();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Georeferenced Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Georeferenced Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Georeferenced Texture</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfGeoreferencedTexture()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfGeoreferencedTexture' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfGeoreferencedTexture();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Parameterized Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Parameterized Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Parameterized Texture</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfParameterizedTexture()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfParameterizedTexture' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfParameterizedTexture();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Surface Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Surface Data</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfSurfaceData()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSurfaceData' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfSurfaceData();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tex Coord Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tex Coord Gen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tex Coord Gen</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfTexCoordGen()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTexCoordGen' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTexCoordGen();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tex Coord List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tex Coord List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tex Coord List</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfTexCoordList()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTexCoordList' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTexCoordList();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Texture</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfTexture()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTexture' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTexture();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Texture Parameterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Texture Parameterization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Texture Parameterization</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfTextureParameterization()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTextureParameterization' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTextureParameterization();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of X3D Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of X3D Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of X3D Material</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GenericApplicationPropertyOfX3DMaterial()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfX3DMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfX3DMaterial();

	/**
	 * Returns the value of the '<em><b>Surface Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Data</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_SurfaceData()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_SurfaceData' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_Feature'"
	 * @generated
	 */
	AbstractSurfaceDataType getSurfaceData();

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_Texture()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Texture' namespace='##targetNamespace' affiliation='_SurfaceData'"
	 * @generated
	 */
	AbstractTextureType getTexture();

	/**
	 * Returns the value of the '<em><b>Texture Parameterization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Parameterization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Parameterization</em>' containment reference.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_TextureParameterization()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_TextureParameterization' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_GML'"
	 * @generated
	 */
	AbstractTextureParameterizationType getTextureParameterization();

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(AppearancePropertyType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_Appearance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='appearance' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_GenericApplicationPropertyOfCityObject'"
	 * @generated
	 */
	AppearancePropertyType getAppearance();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.DocumentRoot#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(AppearancePropertyType value);

	/**
	 * Returns the value of the '<em><b>Appearance Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Member</em>' containment reference.
	 * @see #setAppearanceMember(AppearancePropertyType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_AppearanceMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='appearanceMember' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#featureMember'"
	 * @generated
	 */
	AppearancePropertyType getAppearanceMember();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.DocumentRoot#getAppearanceMember <em>Appearance Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Member</em>' containment reference.
	 * @see #getAppearanceMember()
	 * @generated
	 */
	void setAppearanceMember(AppearancePropertyType value);

	/**
	 * Returns the value of the '<em><b>Georeferenced Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Georeferenced Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Georeferenced Texture</em>' containment reference.
	 * @see #setGeoreferencedTexture(GeoreferencedTextureType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_GeoreferencedTexture()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GeoreferencedTexture' namespace='##targetNamespace' affiliation='_Texture'"
	 * @generated
	 */
	GeoreferencedTextureType getGeoreferencedTexture();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.DocumentRoot#getGeoreferencedTexture <em>Georeferenced Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Georeferenced Texture</em>' containment reference.
	 * @see #getGeoreferencedTexture()
	 * @generated
	 */
	void setGeoreferencedTexture(GeoreferencedTextureType value);

	/**
	 * Returns the value of the '<em><b>Parameterized Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameterized Texture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterized Texture</em>' containment reference.
	 * @see #setParameterizedTexture(ParameterizedTextureType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_ParameterizedTexture()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ParameterizedTexture' namespace='##targetNamespace' affiliation='_Texture'"
	 * @generated
	 */
	ParameterizedTextureType getParameterizedTexture();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.DocumentRoot#getParameterizedTexture <em>Parameterized Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameterized Texture</em>' containment reference.
	 * @see #getParameterizedTexture()
	 * @generated
	 */
	void setParameterizedTexture(ParameterizedTextureType value);

	/**
	 * Returns the value of the '<em><b>Tex Coord Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tex Coord Gen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tex Coord Gen</em>' containment reference.
	 * @see #setTexCoordGen(TexCoordGenType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_TexCoordGen()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TexCoordGen' namespace='##targetNamespace' affiliation='_TextureParameterization'"
	 * @generated
	 */
	TexCoordGenType getTexCoordGen();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.DocumentRoot#getTexCoordGen <em>Tex Coord Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tex Coord Gen</em>' containment reference.
	 * @see #getTexCoordGen()
	 * @generated
	 */
	void setTexCoordGen(TexCoordGenType value);

	/**
	 * Returns the value of the '<em><b>Tex Coord List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tex Coord List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tex Coord List</em>' containment reference.
	 * @see #setTexCoordList(TexCoordListType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_TexCoordList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TexCoordList' namespace='##targetNamespace' affiliation='_TextureParameterization'"
	 * @generated
	 */
	TexCoordListType getTexCoordList();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.DocumentRoot#getTexCoordList <em>Tex Coord List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tex Coord List</em>' containment reference.
	 * @see #getTexCoordList()
	 * @generated
	 */
	void setTexCoordList(TexCoordListType value);

	/**
	 * Returns the value of the '<em><b>X3D Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X3D Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X3D Material</em>' containment reference.
	 * @see #setX3DMaterial(X3DMaterialType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getDocumentRoot_X3DMaterial()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X3DMaterial' namespace='##targetNamespace' affiliation='_SurfaceData'"
	 * @generated
	 */
	X3DMaterialType getX3DMaterial();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.DocumentRoot#getX3DMaterial <em>X3D Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X3D Material</em>' containment reference.
	 * @see #getX3DMaterial()
	 * @generated
	 */
	void setX3DMaterial(X3DMaterialType value);

} // DocumentRoot
