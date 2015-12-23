package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.MeasurementGoal;
import grid.interfaces.DAO.MeasurementGoalDAO;

@Repository //TODO remove comment when using spring, this annotates a DAO for the framework
public class MeasurementGoalDAOImpl implements MeasurementGoalDAO {

	private static final Logger logger	=	LoggerFactory.getLogger(MeasurementGoalDAOImpl.class);
	private SessionFactory		sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addGoal(MeasurementGoal g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoal(MeasurementGoal p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MeasurementGoal> listGoals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MeasurementGoal getGoalById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MeasurementGoal> getGoalLog(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGoal(int id) {
		// TODO Auto-generated method stub
		
	}


}
