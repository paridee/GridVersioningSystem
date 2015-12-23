package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.Strategy;
import grid.interfaces.DAO.StrategyDAO;

@Repository //TODO remove comment when using spring, this annotates a DAO for the framework
public class StrategyDAOImpl implements StrategyDAO {

	private static final Logger logger	=	LoggerFactory.getLogger(StrategyDAOImpl.class);
	private SessionFactory		sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void addStrategy(Strategy g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStrategy(Strategy p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Strategy> listStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Strategy getStrategyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Strategy> getStrategyLog(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStrategy(int id) {
		// TODO Auto-generated method stub
		
	}


}
