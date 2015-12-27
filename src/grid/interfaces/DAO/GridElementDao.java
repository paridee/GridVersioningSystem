package grid.interfaces.DAO;

import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.GridElement;
import grid.entities.MeasurementGoal;

/**
 * DAO for an element of the grid, this class has been build after a consolidation of all DAOs developed
 * for each entity, all these DAOs were sharing most of their code, this fact implies a problem for code
 * maintenance so all these classes have been unified in this one
 * @author Paride Casulli
 * @author Lorenzo La Banca
 *
 */

public interface GridElementDao {
	/**
	 * Adds a new Grid Element to persistence layer
	 * @param e element to be added
	 */
	public void addGridElement(GridElement e);
	public void updateGridElement(GridElement e);
	public List<GridElement> listElement(Class c);
	public GridElement getElementById(int id,Class c);
	public List<GridElement> getElementLog(String label,Class c);
	public void removeElement(int id,Class c);
	public void setSessionFactory(SessionFactory sessionFactory);
}
