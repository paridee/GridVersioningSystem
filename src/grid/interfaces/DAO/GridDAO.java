package grid.interfaces.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Grid;

public interface GridDAO {
	public void addGrid(Grid g);
	public void updateGrid(Grid p);
	public List<Grid> listGrid();
	public Grid getGridById(int id);
	public Grid getLatestGrid(int id);
	public List<Grid> getGridLog(String label);
	public void removeGrid(int id);
	public void setSessionFactory(SessionFactory sessionFactory);
}
