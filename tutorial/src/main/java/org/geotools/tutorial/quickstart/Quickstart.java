package org.geotools.tutorial.quickstart;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.xml.namespace.QName;

import junit.extensions.TestDecorator;

import org.geotools.GML;
import org.geotools.GML.Version;
import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.collection.ListFeatureCollection;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureIterator;
import org.geotools.data.simple.SimpleFeatureSource;
import org.geotools.feature.DefaultFeatureCollection;
import org.geotools.feature.NameImpl;
import org.geotools.feature.collection.AbstractFeatureVisitor;
import org.geotools.feature.simple.SimpleFeatureImpl;
import org.geotools.gml3.GMLConfiguration;
import org.geotools.map.DefaultMapContext;
import org.geotools.map.FeatureLayer;
import org.geotools.map.Layer;
import org.geotools.map.MapContent;
import org.geotools.map.MapContext;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.geotools.styling.SLD;
import org.geotools.styling.Style;
import org.geotools.swing.JMapFrame;
import org.geotools.swing.data.JFileDataStoreChooser;
import org.geotools.util.NullProgressListener;
import org.opengis.feature.Feature;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

/**
 * Prompts the user for a shapefile and displays the contents on the screen in a map frame.
 * <p>
 * This is the GeoTools Quickstart application used in documentationa and tutorials. *
 */
public class Quickstart {

    /**
     * GeoTools Quickstart demo application. Prompts the user for a shapefile and displays its
     * contents on the screen in a map frame
     */
    public static void main(String[] args) throws Exception {
        // display a data store file chooser dialog for shapefiles
//        File file = JFileDataStoreChooser.showOpenFile("shp", null);
//        if (file == null) {
//            return;
//        }

//        FileDataStore store = FileDataStoreFinder.getDataStore(file);
//        SimpleFeatureSource featureSource = store.getFeatureSource();
//
//        // Create a map content and add our shapefile to it
//        MapContent map = new MapContent();
//        map.setTitle("Quickstart");
//        
//        Style style = SLD.createSimpleStyle(featureSource.getSchema());
//        Layer layer = new FeatureLayer(featureSource, style);
//        map.addLayer(layer);
//
//        // Now display the map
//        JMapFrame.showMap(map);
        
//        URL url = new File("../citygml.git/de.hub.citygml.models/examples").toURL();
    	
//    	File file = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/examples/SimpleBuildings.xml");
    	
//    	withWaldbrueckeAndManual("test_1");
//    	if (true) return;
    	
    	URL schemaURL = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/schemas/CityGML_1.0.0_080815/CityGML/building.xsd").toURL();    	
    	URL modelURL = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/examples/fwaldbruecke/waldbruecke_small.citygml").toURL();

        GML gml = new GML(Version.WFS1_1);
        gml.setCoordinateReferenceSystem(DefaultGeographicCRS.WGS84);
        NameImpl typeName = new NameImpl("http://www.opengis.net/citygml/building/1.0", "Building");
        
//		SimpleFeatureType featureType = gml.decodeSimpleFeatureType(schemaURL, typeName);        
//        System.out.println("#1: " + (featureType == null ? "NULL" : featureType.toString()));
//        if (featureType != null) {
//        	System.out.println("#1: " + featureType.getGeometryDescriptor());
//        }
    
        SimpleFeatureIterator featureIterator = gml.decodeFeatureIterator(modelURL.openStream(), new QName("http://www.opengis.net/citygml/building/1.0", "Building"));
        DefaultFeatureCollection featureCollection = new DefaultFeatureCollection();
//        SimpleFeatureType featureType = null;

        while (featureIterator.hasNext()) {
            SimpleFeature next = featureIterator.next();
//            if (featureType == null) {
//            	featureType = next.getFeatureType();
//            }
            featureCollection.add(next);
        }
        System.out.println("#2: " + featureCollection.size());
        
		MapContent map = new MapContent();
		map.setTitle("Quickstart");

//		Style style = SLD.createSimpleStyle(featureType);
//		Layer layer = new FeatureLayer(featureCollection, style);
//		map.addLayer(layer);
//
//		// Now display the map
//		JMapFrame.showMap(map);
    }
    
    private static void withWaldbrueckeAndManual(String folder) throws Exception {
    	URL schemaURL = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/schemas/CityGML_1.0.0_080815/CityGML/building.xsd").toURL();    	
    	URL modelURL = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/examples/fwaldbruecke/waldbruecke_small.citygml").toURL();
    	
    	//create the parser with the gml 3.0 configuration
    	org.geotools.xml.Configuration configuration = new org.geotools.gml3.GMLConfiguration();
    	org.geotools.xml.Parser parser = new org.geotools.xml.Parser( configuration );

		// parse
		SimpleFeatureCollection fc = (SimpleFeatureCollection) parser.parse(modelURL.openStream());
		System.out.println("#3: " + fc.size());
		fc.accepts(new AbstractFeatureVisitor() {
			public void visit(Feature feature) {
				SimpleFeature simpleFeature = ((SimpleFeature)feature);
				System.out.println("#3: " + feature.getType().getName());
				System.out.println("#3: " + simpleFeature.getDefaultGeometry());
			}
		}, new NullProgressListener());
    }
    
    private static void withTestModelsAndManual(String folder) throws Exception {
    	URL modelURL = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/schemas/"+folder+"/TestFeature.xml").toURL();
    	//create the parser with the gml 3.0 configuration
    	org.geotools.xml.Configuration configuration = new org.geotools.gml3.GMLConfiguration();
    	org.geotools.xml.Parser parser = new org.geotools.xml.Parser( configuration );

    	//parse
    	SimpleFeatureCollection fc = (SimpleFeatureCollection) parser.parse(modelURL.openStream());
    	System.out.println("#3: " + fc.size());
    	fc.accepts( new AbstractFeatureVisitor() {
    	      public void visit(Feature feature ) {
    	    	  System.out.println("#3: " + feature.getType().getName());
    	      }
    	  }, new NullProgressListener());
    }
    
    private static void withTestModels(String folder) throws Exception {
    	URL schemaURL = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/schemas/"+folder+"/TestFeature.xsd").toURL();    	
    	URL modelURL = new File("/Users/markus/Documents/Projects/EMFFrag/02_workspace/citygml.git/de.hub.citygml.models/schemas/"+folder+"/TestFeature.xml").toURL();

        GML gml = new GML(Version.WFS1_1);
        gml.setCoordinateReferenceSystem(DefaultGeographicCRS.WGS84);
        NameImpl typeName = new NameImpl("http://www.geotools.org/test", "TestFeature");
//        
		SimpleFeatureType featureType = gml.decodeSimpleFeatureType(schemaURL, typeName);        
        System.out.println("#1: " + (featureType == null ? "NULL" : featureType.toString()));
    
        SimpleFeatureCollection featureCollection = gml.decodeFeatureCollection(modelURL.openStream());        
        System.out.println("#2: " + featureCollection.size());
        
		MapContent map = new MapContent();
		map.setTitle("Quickstart");

		Style style = SLD.createSimpleStyle(featureCollection.getSchema());
		Layer layer = new FeatureLayer(featureCollection, style);
		map.addLayer(layer);

		// Now display the map
		JMapFrame.showMap(map);
    }

}
