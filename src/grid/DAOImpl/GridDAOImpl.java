package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Grid;
import grid.interfaces.DAO.GridDAO;

public class GridDAOImpl implements GridDAO {

	@Override
	public void addGrid(Grid g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGrid(Grid p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Grid> listGrid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grid getGridById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Grid getLatestGrid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Grid> getGridLog(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGrid(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		
	}

}
