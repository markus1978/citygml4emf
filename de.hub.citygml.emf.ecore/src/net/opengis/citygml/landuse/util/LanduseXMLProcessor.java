/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.landuse.util;

import java.util.Map;

import net.opengis.citygml.landuse.LandusePackage;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LanduseXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanduseXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		LandusePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the LanduseResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new LanduseResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new LanduseResourceFactoryImpl());
		}
		return registrations;
	}

} //LanduseXMLProcessor
