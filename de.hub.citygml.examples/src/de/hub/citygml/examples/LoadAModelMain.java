package de.hub.citygml.examples;

import java.util.HashMap;
import java.util.Map;

import net.opengis.citygml.CitygmlPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class LoadAModelMain {
	
	public void run() {
		EPackage.Registry.INSTANCE.put(CitygmlPackage.eINSTANCE.getNsURI(), CitygmlPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("gml", new XMLResourceFactoryImpl());
		
		ResourceSet rs = new ResourceSetImpl();
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		rs.getLoadOptions().putAll(saveOptions);

		
		rs.getResource(URI.createURI("models/waldbruecke_v1.0.0.gml"), true);
	}

	public static final void main(String args[]) {
		new LoadAModelMain().run();
	}
}
