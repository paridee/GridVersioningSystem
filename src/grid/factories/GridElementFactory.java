package grid.factories;

import java.util.HashMap;

import grid.entities.GridElement;

/**
 * 
 * @author Paride Casulli
 * @author Lorenzo La Banca
 * 
 * this abstract class defines a method for loading a GRID Element from a JSON, has to be extended by all the classes implementing
 * a factory
 *
 */

public abstract class GridElementFactory {
	
	/**
	 * Loads a Grid Entity from Its JSON representation
	 * @param json string representing the entity serialization
	 * @param loadedEntities entities already loaded in the system, if the entity represented in the string has already been loaded
	 * will not be loaded again
	 * @return entity representing the json input
	 */
	abstract GridElement loadFromJson(String json,HashMap<String,GridElement>loadedEntities);
}
