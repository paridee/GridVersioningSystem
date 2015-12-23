package grid.interfaces;

import java.util.ArrayList;

import grid.entities.GridEntity;

/**
 * This interface has to be implemented by all the Grid Elements classes having a reference to another
 * Grid Element which can be updated during Its lifecycle
 * @author Paride Casulli
 * @author Lorenzo La Banca
 *
 */
public interface Updatable {
	/**
	 * Updates all the reference for an object linked
	 * @param ge updated object replacing an older one
	 * @return list of all GridEntity updated
	 */
	public ArrayList<GridEntity> update(GridEntity ge);
}
