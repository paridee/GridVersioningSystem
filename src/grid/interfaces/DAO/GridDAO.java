package grid.interfaces.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Grid;

/**
 * Interface defining methods for a Grid DAO, following CRUD operations
 * @author Paride Casulli
 * @author Lorenzo La Banca
 */

public interface GridDAO {
	/**
	 * Adds a new Grid to the persistence layer
	 * @param g grid to be saved
	 */
	public void addGrid(Grid g);
	
	/**
	 * Updates an existing entry on persistence layer
	 * @param p updated version of grid
	 */
	public void updateGrid(Grid p);
	
	/**
	 * Returns all Grids available on persistence layer
	 * @return list of all grids available
	 */
	public List<Grid> listAllGrids();
	
	/**
	 * Gets a specific Grid from persistence layer identified by Its ID
	 * @param id
	 * @return Grid requested
	 */
	public Grid getGridById(int id);
	
	/**
	 * Gets the latest version of a Grid for a specified project
	 * @param projid
	 * @return
	 */
	public Grid getLatestGrid(int projid);
	
	/**
	 * Gets a log with all the Grids for a specific project
	 * @param projid ID of the interested project
	 * @return List with all the Grids belonging to a project
	 */
	public List<Grid> getGridLog(int projid);
	
	/**
	 * Removes a Grid from persistence layer identified by an Id
	 * @param id id of the Grid to be removed
	 */
	public void removeGrid(int id);
	
	//TODO check if needed in interface... probably has to be removed from here
	public void setSessionFactory(SessionFactory sessionFactory);
}
