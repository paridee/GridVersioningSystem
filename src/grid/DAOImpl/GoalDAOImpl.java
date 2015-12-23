package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.Goal;
import grid.interfaces.DAO.GoalDAO;

@Repository //TODO remove comment when using spring, this annotates a DAO for the framework
public class GoalDAOImpl implements GoalDAO {

	private static final Logger logger	=	LoggerFactory.getLogger(GoalDAOImpl.class);
	private SessionFactory		sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addGoal(Goal g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoal(Goal p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goal> listGoals() {
		Session session				=	this.sessionFactory.getCurrentSession();
		List<Goal> goalList	=	session.createQuery("from Goal").list();
		for(Goal g : goalList){
			logger.info("Goal List::"+g);
		}
		return goalList;
	}

	@Override
	public Goal getGoalById(int id) {
		Session currentSession	=	this.sessionFactory.getCurrentSession();
		Goal	g			=	(Goal) currentSession.load(Goal.class,new Integer(id));
		logger.info("Goal loaded::"+g);
		return g;
	}

	@Override
	public ArrayList<Goal> getGoalLog(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGoal(int id) {
		// TODO Auto-generated method stub
		
	}


}
