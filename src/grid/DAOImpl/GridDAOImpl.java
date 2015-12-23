package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.Grid;
import grid.interfaces.DAO.GridDAO;

@Repository //TODO remove comment when using spring, this annotates a DAO for the framework
public class GridDAOImpl implements GridDAO {

	private static final Logger logger	=	LoggerFactory.getLogger(GridDAOImpl.class);
	private SessionFactory		sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
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


}
